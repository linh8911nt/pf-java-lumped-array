import java.util.Scanner;

public class LumpedArray {
    public static void main(String[] args) {
        int[] numbers1 = new int[4];
        int[] numbers2 = new int[3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers1.length; i++) {
            System.out.println("Nhập giá trị phần tử thứ " + (i + 1) + " mảng 1: ");
            numbers1[i] = input.nextInt();
        }
        for (int j = 0; j < numbers2.length; j++) {
            System.out.println("Nhập giá trị phần tử thứ " + (j + 1) + " mảng 2: ");
            numbers2[j] = input.nextInt();
        }
        int size = numbers1.length + numbers2.length;
        int[] numbers3 = new int[size];
        int temp;

        for (int i = 0; i < numbers1.length; i++) {
            temp = numbers1[i];
            numbers3[i] = temp;
        }
        for (int j = 0; j < numbers2.length; j++) {
            temp = numbers2[j];
            numbers3[numbers1.length + j] = temp;
        }
        System.out.print("Phần tử trong mảng: ");
        for (int element : numbers3) {
            System.out.print(element + "\t");
        }
    }
}
