package io.doubleu0714.designpattern.abstract_factory;

public class Product1Factory implements IProductFactory {

    @Override
    public IProductA createA() {
        return new ProductAImpl1();
    }

    @Override
    public IProductB createB() {
        return new ProductBImpl1();
    }

}