import java.util.Scanner;

public class ConstructorExample_2 {
    int num1, num2, sum;
    Scanner sc = new Scanner(System.in);
    ConstructorExample_2(){
        System.out.println("Enter Any two Numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println(num1+" "+num2);
    }

    public static void main(String[] args) {
        ConstructorExample_2 obj = new ConstructorExample_2();

    }
}
