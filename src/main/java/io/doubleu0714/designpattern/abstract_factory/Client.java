package io.doubleu0714.designpattern.abstract_factory;

public class Client {
    public static void main(String[] args) {
        IProductFactory factory1 = new Product1Factory();
        IProductFactory factory2 = new Product2Factory();

        factory1.createA().printA();
        factory1.createB().printB();
        factory2.createA().printA();
        factory2.createB().printB();
    }
}