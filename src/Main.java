import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] first = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;
        for (int i = 0; i < first.length; i++) {
            System.out.print(first[i]);
            if (i != first.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        double[] second = {1.57, 7.654, 9.986};
        for (int i = 0; i < second.length; i++) {
            System.out.print(second[i]);
            if (i != second.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        int[] third = {12312, 3125123, 1345132};
        for (int i = 0; i < third.length; i++) {
            System.out.print(third[i]);
            if (i != third.length -1) {
                System.out.print(", ");
            }
        }
        ///

        System.out.println("");
        int[] first1 = new int[3];
        first1[0] = 1;
        first1[1] = 2;
        first1[2] = 3;
        for (int i = first.length -1 ; i>= 0; i--) {
            System.out.print(first[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        double[] second1 = {1.57, 7.654, 9.986};
        for (int i = second1.length -1 ; i>= 0; i--) {
            System.out.print(second1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        int[] third1 = {12312, 3125123, 1345132};
        for (int i = third1.length - 1; i>= 0; i--) {
            System.out.print(third1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }


        ///
        System.out.println("");
        System.out.println("Задача 4");
        int[] first2 = new int[3];
        first2[0] = 1;
        first2[1] = 2;
        first2[2] = 3;
        for (int i = 0; i < first2.length; i++) {
            if (first2[i] % 2 != 0) {
                first2[i]++;
            }
        }
        System.out.println(Arrays.toString(first2));





        }
    }
