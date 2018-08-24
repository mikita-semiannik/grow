package com.grow.java7;

import java.net.URL;
import java.net.URLClassLoader;

public class Main {

    public static void main(String[] args) {
        //new class loader in java 7 from url
        
        try{
            URL url = new URL("file:testJar.jar");
            URLClassLoader loader = new URLClassLoader(new URL[] { url });
            Class cl = Class.forName("com.grow.abstractclass.Main", true, loader);
            Runnable main = (Runnable) cl.newInstance();
            main.run();
            loader.close(); 
        } catch(Exception e) {
            System.out.println(e);
        }
    }

}
