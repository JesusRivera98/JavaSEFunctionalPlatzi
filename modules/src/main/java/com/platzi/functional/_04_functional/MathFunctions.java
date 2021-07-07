package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction =
                new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer x) {
                        return x * x;
                    }
                };
        System.out.println(squareFunction.apply(5));
        System.out.println(squareFunction.apply(25));

        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;

        Predicate<Integer> isEven = x -> x % 2 == 0;

        isEven.test(4); //true

        Predicate<Student> isApproved = student -> student.getgrade() >= 6.0;

        Student sinuhe = new Student(5.9);
        System.out.println(isApproved.test(sinuhe));
    }

    static class Student {
        private double grade;

        public Student(double grade) {
            this.grade = grade;
        }

        public double getgrade() {
            return grade;
        }
    }
}
