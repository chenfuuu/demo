package com.jetbone.design.patterns.creational.simplefactory;

/**
 * Created by Chris on 2019-08-01 22:50.
 */
public class JavaVideo implements Video {
    @Override
    public void produce() {
        System.out.println("Produce Java Video.");
    }
}
