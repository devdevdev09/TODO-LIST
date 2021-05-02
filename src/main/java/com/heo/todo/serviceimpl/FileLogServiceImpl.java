package com.heo.todo.serviceimpl;

import com.heo.todo.service.LogService;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class FileLogServiceImpl implements LogService{

    Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());

    @Override
    public void info(String log) {
        logger.info(log);
    }

    @Override
    public void error(String log) {
        logger.error(log);
    }

    @Override
    public void debug(String log) {
        logger.debug(log);
    }
}
