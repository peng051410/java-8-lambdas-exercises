package com.insightfullogic.java8.examples.chapter3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GeneratingStreams {

    public static void main(String[] args) {
        List<Integer> list = Stream.of(Arrays.asList(1, 3), Arrays.asList(3, 3))
                .map(integers -> integers.size())
                // .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(list.size());

        Optional<String> optional = Optional.of("aadf");
        Optional<Object> empty = Optional.empty();
        System.out.println(empty.isPresent());
        System.out.println(optional.isPresent());
        iterate();
    }

    static void generate() {
        Stream.generate(() -> "hello world")
                .limit(3)
                .forEach(System.out::println);
    }

    static void iterate() {
        Stream.iterate(0, x -> x + 1)
                .limit(5)
                .forEach(System.out::println);
    }

}
