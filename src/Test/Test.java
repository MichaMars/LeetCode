package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {



    public static void main(String[] args) {
        String str1 = "1";
        String str2 = "2";
        String str3 = "2a";
        String str4 = "2b";

        String str5 = "10";
        String str6 = "9";




        System.out.println(str1.compareTo(str2));
        System.out.println(str3.compareTo(str4));
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareTo(str1));

        System.out.println(str1 == str3 ? true : false);

        List<String> animals = new ArrayList<>();

        animals.add("Lion");
        animals.add("Zebra");
        animals.add("Snake");
        animals.add("Tiger");

        List<String> updatedList = animals.stream().filter(animal -> animal.contains("e")).collect(Collectors.toList());
        updatedList.stream().forEach(System.out::println);

    }
}
