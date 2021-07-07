package com.platzi.functional._07_inference;

import com.platzi.functional._06_reference_operator.NamesUtils;

import java.util.List;
import java.util.function.Function;

public class InferenceN {
    public static void main(String[] args) {
        Function<Integer, String> functionConverter =
                x -> "Twice:" + (x * 2) ;

        List<String> students = NamesUtils.getList("Hugo", "Paco", "Luis");
        students.forEach((String name) -> System.out.println(name));
        students.forEach(name -> System.out.println(name));
        students.forEach(System.out::println);
    }
}
