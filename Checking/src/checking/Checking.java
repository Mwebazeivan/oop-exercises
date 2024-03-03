/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package checking;
import java.util.Scanner;
class Numbers{
int num1,num2,num3;

void Checking(int n1,int n2,int n3){
    this.num1=n1;
    this.num2=n2;
    this.num3=n3;
}

}
public class Checking {
 
    public static void main(String[] args) {
 Numbers nums= new Numbers(); 
 
 System.out.println("Enter the number 1 to check");
 Scanner input =new Scanner (System.in);
 nums.num1=input.nextInt();
 
 System.out.println("Enter the number 2 to check");
 Scanner inputs =new Scanner (System.in);
 nums.num2=inputs.nextInt();
 
 System.out.println("Enter the number 3 to check");
 Scanner inpute =new Scanner (System.in);
 nums.num3=inpute.nextInt();
 
 if (nums.num1> nums.num2 && nums.num2> nums.num3){
 System.out.println("The largest number is " +nums.num1);
 }
 else if(nums.num2> nums.num1 && nums.num2> nums.num3){
     System.out.println("The largest number is " +nums.num2);
    }
 else if (nums.num3> nums.num1 && nums.num3> nums.num2){
 System.out.println("The largest number is " +nums.num3);
 }
 
 else{
 System.out.println("Invalid inputs");
 }
}
}