import java.util.Scanner;
public class Calcul_op {
    public double somme(double x,double y){
        double s =0.0;
        s= x+y;
        return s;
    }
    public double multiplication(double x, double y){
        double res = 0.0;
        res = x*y;
        return res;
    }

    public static void main(String[] args){
        double a,b,som=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("donne la valeur de a :");
        a = sc.nextDouble();
        System.out.println("donne la valeur b");
        b = sc.nextDouble();
       som = somme(a,b);
    }
}
