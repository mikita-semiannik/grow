package com.grow.spring.core;

import com.grow.collection.map.MapService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Custom realization BeanPostProcessor.
 */
public class CustomBeanPostProcessor implements BeanPostProcessor {

    private static final Logger LOGGER = LogManager.getLogger(CustomBeanPostProcessor.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        LOGGER.error("Before Initialization: " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        LOGGER.error("After Initialization: " + beanName);
        if(bean instanceof MapService) {
            ((MapService) bean).initMap();
        }
        return bean;
    }


}
