package com.czy;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestTry {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("张三");
        Dog dog2 = null;
        Optional<Dog> dog1 = Optional.ofNullable(dog);

        System.out.println(dog1.isPresent());
    }
}
    