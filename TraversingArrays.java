import java.util.*;

public class TraversingArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int number = Integer.parseInt(scan.nextLine());

        int[] store = new int[number];
        int[] occurrences = new int[26];
        int min = 0;
        int max = 25;
        int randNum;
        int temp = 0;

        for (int i = 0; i < store.length; i++) { // generates random number
            randNum = min + (int) (Math.random() * (max - min));

            if (randNum < max) {
                randNum = min + (int) (Math.random() * (max - min));
            }

            store[i] = randNum;
        }

        for (int i = 0; i < occurrences.length; i++) {
            temp = store[i];
            occurrences[temp]++;
        }

        System.out.println("Generated Numbers: ");
        for (int i = 0; i < store.length; i++) {
            System.out.println(store[i]);
        }

        System.out.println("Occurrences: ");
        for (int i = 0; i < occurrences.length; i++) {
            System.out.println(i + " " + occurrences[i]);
        }
    }
}