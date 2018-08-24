package com.grow.spring.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;

public class ResourcesService {

    private static final Logger LOGGER = LogManager.getLogger(ResourcesService.class);

    public ResourcesService() {
        LOGGER.info("new ResourcesService()");
    }

    public void printResource(String path, ApplicationContext ctx) {
        LOGGER.info(path);
        Resource resource = ctx.getResource(path);
        LOGGER.info(resource.getFilename());
    }
}
