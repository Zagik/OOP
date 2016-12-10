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
        Company[] z=new Company [4];
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
        z[0]=new Slujbovec(l[0],f[0],b[0]);
        z[1]=new Persona(l[1],f[1],b[1]);
        z[2]=new Robojuy(l[2],f[2],b[2]);
        z[3]=new Injener(l[3],f[3],b[3]);
        System.out.println("\nІнформація про службовця");
        z[0].information();
        System.out.println("\nІнформація про персону");
        z[1].information();
        System.out.println("\nІнформація про робочого");
        z[2].information();
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
    Slujbovec( int l, int f, int b) {
        super(l,f,b);
    }
}

class Persona extends Company {
    Persona(int l, int f, int b) {
        super(l,f,b);
    }
}

class Robojuy extends Company {
    Robojuy( int l, int f, int b) {
        super(l,f,b);
    }
}

class Injener extends Company {
    Injener(int l, int f, int b) {
        super(l,f,b);
    }
}
