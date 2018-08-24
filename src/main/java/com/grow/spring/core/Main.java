package com.grow.spring.core;

import com.grow.collection.map.MapService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:context.xml");
        // Find bean by Id.
        ExampleClass exampleClassById = (ExampleClass)applicationContext.getBean("exampleClass");
        // Find bean by Name.
        ExampleClass exampleClassByName = (ExampleClass)applicationContext.getBean("exampleClassByName");
        // Find bean by type.
        MapService mapService = applicationContext.getBean(MapService.class);
        exampleClassById.print();
        exampleClassByName.print();
        //init method call in BeanPostProcessor is created for example, but best option, set init-method in context
        mapService.print();
        ResourcesService resourcesService = (ResourcesService) applicationContext.getBean("resourcesService");
        resourcesService.printResource("classpath:Log4j2.xml", applicationContext);

        LookupExample lookupExample = (LookupExample) applicationContext.getBean("lookupExample");
        LOGGER.info("lookupExample value = " + lookupExample.getValue());
        LOGGER.info("exampleClass value = " + lookupExample.getExampleClass().getValue());
        lookupExample = (LookupExample) applicationContext.getBean("lookupExample");
        LOGGER.info("lookupExample value = " + lookupExample.getValue());
        LOGGER.info("exampleClass value = " + lookupExample.getExampleClass().getValue());

        FactoryExample factoryExample = (FactoryExample) applicationContext.getBean("factoryExample");
        factoryExample.print();
    }

    private String getResourcesPath() {
        return Thread.currentThread().getContextClassLoader().getResource("").getPath();
    }

}
