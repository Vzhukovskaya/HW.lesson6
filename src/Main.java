import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            // CALCULATOR START
            // System.out.println("enter operation: \n" +
            // "plus: + \n" +
            // "minus: - \n" +
            // "multiply: * \n" +
            // "divide: / \n" +
            // "exit: e \n");
            // char ch = sc.next().charAt(0);

            // System.out.println("enter first num");
            // double fd = sc.nextDouble();
            // System.out.println("enter second num");
            // double sd = sc.nextDouble();

            // Calc calculator = new Calc();
            // calculator.startCalculation(ch, fd, sd);
            // CALCULATOR END

            // BUBBLE SORT START
            int[] arr = {2,45,12,6,8,9,11,10,124,1,0,3};

            Bubble bubble = new Bubble();
            printArray(bubble.sortAsc(arr));
            printArray(bubble.sortDesc(arr));

            // for (int i = 0; i < arr.length; i++) {

            //     System.out.print(bubble.sortDesc(arr));
            // }

         //Class Metod.
            public static void printArray(int[] arr){
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }

        }