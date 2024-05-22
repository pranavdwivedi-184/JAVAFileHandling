import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");

        int arr[] = { 10, 5, 47, 111, 10, 2 };

        int a = arr[0];

        for (int i : arr) {
            if (a < i) {
                a = i;
            }
        }

        System.out.println(a);
      
        }
    }