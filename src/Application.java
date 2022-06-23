import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        double a,b,som=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("donne la valeur de a :");
        a = sc.nextDouble();
        System.out.println("donne la valeur b");
        b = sc.nextDouble();
        som= somme(a,b);
        System.out.println("la somme est : "+som);
    }

    private static double somme(double a, double b) {
        double somme = 0.0;
        somme = a+b;
        return somme;
    }
}
