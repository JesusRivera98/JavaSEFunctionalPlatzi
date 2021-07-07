package com.platzi.functional._08_lambda;

import com.platzi.functional._06_reference_operator.NamesUtils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class SyntaxN {
    public static void main(String[] args) {
        List<String> courses = NamesUtils.getList("Java", "Functional");

        courses.forEach(course -> System.out.println(course));

        useZero(() -> 2);

        usePredicate(text -> text.isEmpty());

        useBiFunction((x, y) -> x * y);

        useBiFunction((x, y) -> {
            System.out.println("X: " + x + ", Y:" + y);
            return x - y;
        });

        useNothing(() -> {
            System.out.println("Hello Student");
        });

        useBiFunction((Integer x, Integer y) -> x * y);
    }

    static void useZero(ZeroArguments ZeroArguments) {

    }

    static void usePredicate(Predicate<String> predicate) {

    }

    static void useBiFunction(BiFunction<Integer, Integer, Integer> operation) {

    }

    static void useNothing(OperateNothing OperateNothing) {

    }

    @FunctionalInterface
    interface ZeroArguments {
        int get();
    }

    @FunctionalInterface
    interface OperateNothing {
        void nothing();
    }
}
