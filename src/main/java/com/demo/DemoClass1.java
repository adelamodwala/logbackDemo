package com.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

/**
 * Created by adel.amodwala on 2/10/2017.
 */
public class DemoClass1 {

    final static Logger logger = LoggerFactory.getLogger(DemoClass1.class);

    @PostConstruct
    public void init() {
        logger.info("Hey INFO!");
        logger.debug("Hey DEBUG!");
        logger.trace("Hey TRACE!");
        logger.error("Hey ERROR!");
    }
}
