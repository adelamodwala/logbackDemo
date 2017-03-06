package com.demo;

import com.google.gson.Gson;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class SocketHandler extends TextWebSocketHandler {
    final static Logger logger = LoggerFactory.getLogger(SocketHandler.class);

    List<WebSocketSession> sessions = new CopyOnWriteArrayList<>();

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message)
            throws InterruptedException, IOException {
        logger.info("calling handleTextMessage()");

        for(WebSocketSession webSocketSession : sessions) {
            Map value = new Gson().fromJson(message.getPayload(), Map.class);
            webSocketSession.sendMessage(new TextMessage("Your Message " + value.get("data") + " !"));
            logger.debug("handleTextMessage value: " + value.get("data"));
        }
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        logger.info("calling afterConnectionEstablished()");

        //the messages will be broadcasted to all users.
        sessions.add(session);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        logger.info("calling afterConnectionClosed()");
        int sessionIdx = sessions.indexOf(session);
        if(sessionIdx > -1) {
            logger.debug("removing session " + sessionIdx);
            sessions.remove(sessionIdx);
        }
    }
}