import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");

//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");

//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2, "Islay");

//        4. Print out the index position of "Skye"
        System.out.println(scottishIslands.indexOf("Skye"));

//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);

//        7. Print the number of islands in your arraylist
        int lengthOfArrayList = scottishIslands.size();
        System.out.println(lengthOfArrayList);

//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);

//        9. Print out all the islands using a for loop

        for (String islandsAlba : scottishIslands) {
            System.out.println(islandsAlba);
        }

        System.out.println(scottishIslands);


        System.out.println("--------NUMBERS-------");

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        System.out.println("Even numbers:");
        for (int i=0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
            System.out.println(numbers.get(i));
        }
        }

//        2. Print the difference between the largest and smallest value
        int minValue = Collections.min(numbers);
        int maxValue = Collections.max(numbers);
        System.out.println(maxValue - minValue);



//        3. Print True if the list contains a 1 next to a 1 somewhere.
        for (int i=0; i < numbers.size(); i++) {
            if ((numbers.get(i) == 1) && (numbers.get(i + 1 ) == 1)){
                System.out.println("True");
            }
        }

//        4. Print the sum of the numbers,
            int sum = 0; // initialize sum
            int i;

            // Iterate through all elements and add them to sum
            for (i = 0; i < numbers.size(); i++)
                sum += numbers.get(i);

        System.out.println(sum);


//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.
//        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        int sumThirteen = 0;
        int k;

        for (k = 0; k < numbers.size(); k++)
            if (numbers.get(k) == 13){
                k++;
            }
        else {
                sumThirteen += numbers.get(k);
            }

        System.out.println(sumThirteen);
    }
}
