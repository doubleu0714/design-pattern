package io.doubleu0714.designpattern.abstract_factory;

public class Product2Factory implements IProductFactory {

    @Override
    public IProductA createA() {
        return new ProductAImpl2();
    }

    @Override
    public IProductB createB() {
        return new ProductBImpl2();
    }

}