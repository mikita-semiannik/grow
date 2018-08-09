package com.grow.collection.map;


public class Main {

    private MapService mapService = new MapService();

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        mapService.initMap();
        mapService.analize();
        mapService.print();

    }
}
