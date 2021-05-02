package com.mycompany.factory;

public interface AbstractFactory<T> {
    T create(String serviceType) ;
}