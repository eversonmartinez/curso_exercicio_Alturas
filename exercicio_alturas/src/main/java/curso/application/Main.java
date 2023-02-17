package curso.application;

import java.util.Locale;
import java.util.Scanner;
import curso.util.Person;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int quantity, lessThan=0;
        double average=0;

        System.out.print("How many person are you going to type? ");
        quantity = sc.nextInt();
        Person[] vect = new Person[quantity];


        for(int i =0; i<vect.length; i++){
            vect[i] = new Person();
            System.out.println("Data of person " + (i+1) + ":");
            System.out.print("Name: ");
            sc.nextLine();
            vect[i].setName(sc.nextLine());
            System.out.print("Age: ");
            vect[i].setAge(sc.nextInt());
            System.out.print("Height: ");
            vect[i].setHeight(sc.nextDouble());
        }

        for(int i =0; i<vect.length; i++){
            average+=vect[i].getHeight();
            if(vect[i].getAge()<16)
            lessThan++;
        }

        System.out.println("Average height: " + (average/(double) vect.length));
        System.out.println("People less than 16 years olds: " + (lessThan*100/(double) vect.length) + "%");
        for(int i=0; i<vect.length; i++){
            if(vect[i].getAge()<16)
                System.out.println(vect[i].getName());
        }
        sc.close();
    }
}
