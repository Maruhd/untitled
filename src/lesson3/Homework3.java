package lesson3;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a month");
        int n = scan.nextInt();
        if(n == 1){
        System.out.println("January");
                }
        else if(n == 2){
        System.out.println("February");
        }
        else if(n == 3){
            System.out.println("March");
        }
        else {
            System.out.println("Not month");
        }
    }
}
