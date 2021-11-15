import java.util.Scanner;
class identicalArrays {
    public static void main(String[] args) {
        int input = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array");

        input = scan.nextInt(); //https://www.w3schools.com/java/java_user_input.asp

        System.out.println("Enter the numbers and press \"Enter\" after each entry ");

        int[] numberList = new int[input]; //https://www.geeksforgeeks.org/length-vs-length-java/

        for (int i = 0; i < input; i++) {
            numberList[i] = scan.nextInt();
          
        }

        System.out.println("Enter the size of the second array");
        input = scan.nextInt();
        System.out.println("Enter the numbers and press \"Enter\" after each entry ");

        int[] numberList2 = new int[input];
        for (int j = 0; j < input; j++) {
            numberList2[j] = scan.nextInt();

        }

        if (numberList2.length != numberList.length) //https://www.geeksforgeeks.org/length-vs-length-java/
            System.out.println("The arrays are not identical");
        else
            for (int k = 0; k < numberList.length; k++) {
                if (numberList[k] != numberList2[k]) {
                    System.out.println("The arrays are not identical");
                    break;
                } else if (k == numberList.length - 1)
                    System.out.println("The arrays are identical");
            }
    }
}