import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = input.nextInt();
        int[] list = new int[size];
        System.out.print("Enter " + list.length + " values: ");
        for (int i = 0; i < list.length; ++i) {
            list[i] = input.nextInt();
        }
        System.out.print("Your input list: ");
        for (int value : list) {
            System.out.print(value + " ");
        }
        System.out.println("\nBegin sort processing...");
        BubbleSortByStep.bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; ++k) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; ++i) {
                if (list[i] > list[i + 1]) {
                    System.out.println("Swap " + list[i] + " with " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
            if (!needNextPass) {
                System.out.println("Array may be sorted and next pass not needed!");
            }
            System.out.print("List after the " + k + " sort: ");
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
