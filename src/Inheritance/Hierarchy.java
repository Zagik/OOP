package Inheritance;

/**
 * Created by Zahakaylo on 10.12.2016.
 */
import java.util.Scanner;
import javax.swing.Spring;

public class Hierarchy {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int l[] = new int [4];
        int f[] = new int [4];
        int b[] = new int [4];
        int category,age,numberChild;
        Company[] z = new Company [4];
        System.out.println("Вводимо дані почергово для кожного працівника: 1.службовець; 2.персона; 3.робочий; 4.інженер");
        for (int i=0; i<4;i++){
            System.out.println(i+1+":");
            System.out.println("Введіть кількість робочих місць");
            l[i]= a.nextInt();
            System.out.println("Введіть місячну зарплату");
            f[i] = a.nextInt();
            System.out.println("Введіть кількість офіційних вихідних ");
            b[i] = a.nextInt();
        }
        System.out.println("Введіть категорію для робочого");
        category = a.nextInt();
        System.out.println("Введіть вік персони");
        age = a.nextInt();
        System.out.println("Введіть кількість дітей в робочого");
        numberChild = a.nextInt();
        z[0]=new Slujbovec(l[0],f[0],b[0],category);
        z[1]=new Persona(l[1],f[1],b[1],age);
        z[2]=new Robojuy(l[2],f[2],b[2],numberChild);
        z[3]=new Injener(l[3],f[3],b[3]);
        System.out.println("\nІнформація про службовця");
        z[0].information();
        System.out.println("Категорія: " + category);
        System.out.println("\nІнформація про персону");
        z[1].information();
        System.out.println("Вік: " + age);
        System.out.println("\nІнформація про робочого");
        z[2].information();
        System.out.println("Кількість дітей: " + numberChild);
        System.out.println("\nІнформація про інженера");
        z[3].information();
    }}

class Company {
    int zarplata, place, vuhidnuy;
    Company(int l, int f, int b) {
        place=l;
        zarplata=f;
        vuhidnuy=b;
    }
    void information() {
        System.out.print("Кількість робочих місць: "+place+
                "\nМісячна зарплата: "+zarplata+"\nКількість вихідних: "+vuhidnuy+"\n");

    }
}

class Slujbovec extends Company {
    int category;
    Slujbovec(int l, int f, int b, int c) {
        super(l,f,b);
        category = c;
     }
    }

class Persona extends Company {
    int age;
    Persona(int l, int f, int b, int a) {
        super(l,f,b);
        age = a;
    }
}

class Robojuy extends Company {
    int numberChild;
    Robojuy( int l, int f, int b, int c) {
        super(l,f,b);
        numberChild = c;
    }
}

class Injener extends Company {
    Injener(int l, int f, int b) {
        super(l,f,b);
    }
}
