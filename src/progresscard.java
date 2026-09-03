import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class progresscard {
    public static void main(String args[]){
        Scanner a= new Scanner(System.in);
        System.out.print("Enter Student Name:");
        String name=a.nextLine();
        System.out.println("Student Name:"+name);
        System.out.print("Enter Student Grade:");
        char ch = a.next().charAt(0);
        System.out.println("Student Grade:"+ch);
        System.out.print("Enter Student height:");
        float height=a.nextFloat();
        System.out.println("Student Height:"+height);
        a.nextLine();
        System.out.print("Enter Student Standard:");
        String standard=a.nextLine();
        System.out.println("Student standard:"+standard);


    }
}

