import java.util.Scanner;

class Basics {
    public static void main(String[] args) {
        System.out.println("Hello, World Arjun!");

        byte num = 100; // 8-Bits Range : -128 to 127
        short num1 = 100; // 16-Bits Range : -32728 to 32727
        int num2 = 100; // 32-Bits Range : -2^31 to (2^31 - 1)
        long num3 = 100; // 64-Bits Range : -2^63 to (2^63 - 1)

        float decimal = 5.43F; // 32-Bits Approx : 3.40282347E+38F (6 - 7 Decimal digits of precision)
        double decimal2 = 4.56; // 64-Bits Approx : 1.79769313486231570E+308 (15 Decimal digits of precision)

        char ch = 'a';

        boolean bool = true;

//        Scanner scanner = new Scanner(System.in);
//        int num4 = scanner.nextInt();
//        double decimal3 = scanner.nextDouble();
//        String firstName = scanner.next();
//        String lastName = scanner.next();
//        System.out.println(num4);
//        System.out.println(decimal3);
//        System.out.println(firstName + " " + lastName);
//        scanner.close();

//        int[] arr = new int[5]; // old format where length of array known
//        arr[0] = 2; arr[1] = 1; arr[2] = 3; arr[3] = 4; arr[4] = 5;
        int[] arr = {1, 2, 3, 4, 5}; // New format
        int[][] arr1 = {{1, 2, 3}, {4, 5}, {6, 7, 8, 8, 10}}; // 2-D Arrays declaration
//        System.out.println(arr[0]);
//        System.out.println(arr1[2][1]);

    }
}