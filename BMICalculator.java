 import java.util.Scanner;
 public class BMICalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height in Meters: ");
        double height = sc.nextDouble();


        double BMI=weight / (height*height);

        System.out.println("Your BMI is :"+ BMI);

        if(BMI<18.5){
            System.out.println("You are under weight !");
        }else if(BMI >=18.5 && BMI <=24.9){
            System.out.println("You have a Normal weight");
        }else if(BMI >=25 && BMI<=29.9){
            System.out.println("You are Overweight");
        }else{
            System.out.println("You are Obese!");
        }
        sc.close();
    }
 }