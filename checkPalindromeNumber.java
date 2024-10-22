import java.util.Scanner;

public class checkPalindromeNumber {
    public static void main(String[] args) {
        //Taking Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = sc.nextInt();
        
        if (isPalindrome(inputNumber)) { // Calling Function- isPalindrome
            System.out.println(inputNumber + " is a palindrome.");
        } else {
            System.out.println(inputNumber + " is not a palindrome.");
        }
        sc.close();
    }

    // Function Definition
    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;
        
        while (num > 0) { //Loop will run until the num is greater than 0
            int digit = num % 10; //getting the last digit. eg- 23432, digit = 2(last digit)
            reversed = reversed * 10 + digit; // Reversing the number
            num /= 10; // deleting the last digit or write as-> num = num/10 
        }
        
        return original == reversed; // checks if the original number after getting reversed remains same.
    }
}

//Example.
// inputNumber= 323
// (Getting inside function)
// original = 323
// digit = 323%10 = 3
// reversed = 323(logic-> reversed*10+digit)
// original == reversed
// since Function datatype is boolen it returns true.
