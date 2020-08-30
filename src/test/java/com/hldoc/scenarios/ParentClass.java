package com.hldoc.scenarios;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParentClass {
    Logger logger = LoggerFactory.getLogger(ParentClass.class);
    public void checkLogger(){
        logger.info("ParentClass.checkLogger");
    }
}
