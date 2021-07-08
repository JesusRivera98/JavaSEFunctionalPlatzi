package com.platzi.functional._14_optionals;

import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;

import java.util.*;

public class OptionalsN {
    public static void main(String[] args) {
        List<String> names = getNames();
        if(names != null){
            //Operate with names.
        }

        Optional<List<String>> optionalNames = getOptionalNames();

        if (optionalNames.isPresent()){

        }
        optionalNames.ifPresent(namesValue -> namesValue.forEach(System.out::println));
        //optionalNames.flatMap();
        //optionalNames.map()

        Optional<String> valuablePlayer = optionalValuablePlayer();

        String valuablePlayerName = valuablePlayer.orElseGet(() -> "No player");
    }


    static List<String> getNames(){
        List<String> list = new LinkedList<>();

        //return list;
        return Collections.emptyList();
    }

    static String mostValuablePlayer(){
        return null;
    }

    static int mostExpensiveItems(){
        return -1;
    }


    static Optional<List<String>> getOptionalNames(){
        List<String> namesList = new LinkedList<>();

        //Obtain names
        return Optional.of(namesList);
    }
    static Optional<String> optionalValuablePlayer(){
        //
        //return Optional.ofNullable();
        try {
            //Access
            return Optional.of("Sinuhe");
        }catch (Exception e){
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
