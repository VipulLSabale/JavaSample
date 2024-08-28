package streamsApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SteamsFunctions {
    public static void main(String args[]){
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i <= 10; i++){
            li.add(i);
        }
        // Collect the even numbers
        List<Integer>  evenList = li.stream().filter(num -> (num % 2 == 0)).toList();
        System.out.println("\n Event numbers: "+ evenList);

        // Count the event numbers

        Long evenCount = li.stream().filter(i -> i%2 == 0).count();
        System.out.println("\n Count for even numbers " + evenCount);


        // Sort the list in desceding order

        Comparator<Integer> integerComparator = (num1,num2)-> num2.compareTo(num1);
        List<Integer> sortedList = li.stream().sorted(integerComparator).toList();
        System.out.println("\n Sorted List by desc " +sortedList);

        // Max and min in the list

        Comparator<Integer> naturalComparator = (i1,i2) -> i1.compareTo(i2);
        Integer maxNumber = li.stream().max(naturalComparator).get();
        System.out.println("\n Max = " + maxNumber);

        Integer minNumber = li.stream().min(naturalComparator).get();
        System.out.println("\n Min = " + minNumber );

        // Map function

        List<Integer> squareList = li.stream().map(num -> num*num).toList();
        System.out.println("\nMapped list with number squares");
        System.out.println(squareList);

    }
}
