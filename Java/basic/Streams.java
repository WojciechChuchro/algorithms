package Java.basic;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {
    public static void ex1() {
        //Given a list of strings, filter out all strings that start with the letter "A" and collect them into a new list.
        List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot");
        List<String> result = words.stream().filter( el -> el.startsWith("A")).collect(Collectors.toList());
        System.out.println(result);
    }
    public static void ex2() {
        //Given a list of integers, square each number and calculate the sum of the squared numbers.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer result = numbers.stream().map(el -> el * el).reduce(0, Integer::sum);
        System.out.println(result);
    }
    public static void ex3() {
        //Given a list of strings, sort them in alphabetical order.
        List<String> words = Arrays.asList("Zebra", "Apple", "Banana", "Mango");
        List<String> result = words.stream().sorted().toList();
        System.out.println(result);
    }
    public static void ex4() {
        //Given a list of integers, find the maximum number using streams.
        List<Integer> numbers = Arrays.asList(10, 20, 5, 30, 15);
        Integer result = numbers.stream().max(Integer::compare).orElse(0);
    }
    public static void ex5() {
        //Given a list of strings, group them by their length.
        List<String> words = Arrays.asList("Java", "Python", "C", "JavaScript", "Go");
        Map<Integer, List<String>> result = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(result);
    }
    public static void ex6() {
        //Given a list of lists, flatten it into a single list using flatMap.
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );
        List<Integer> result = listOfLists.stream().flatMap(List::stream).toList();
    }
    public static void ex7() {
        //Given a list of strings, count how many strings have more than 5 characters.
        List<String> words = Arrays.asList("Hello", "World", "Java", "Streams", "Programming");
        long count = words.stream().filter(w -> w.length() > 5).count();
    }
    public static void ex8() {
        //Given a list of integers, remove duplicates and collect the distinct elements into a new list.
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer>nums = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(nums);
    }
}
