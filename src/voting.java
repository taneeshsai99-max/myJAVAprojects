import javax.swing.*;
import java.util.Scanner;
public class voting {
    public static void main(String args[]){
    Scanner a=new Scanner (System.in);
    System.out.println("Enter age of voter:");
    int age=a.nextInt();
    //System.out.println("Enter voter age:"+age);
    if (age>=18)

    {
     System.out.println("voter is eligible");}
    else {
     System.out.println("voter is not eligible");
    }
    }

}
