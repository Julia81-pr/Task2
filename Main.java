import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RoubleCounter service = new RoubleCounter();
        Scanner input = new Scanner(System.in);
        System.out.println("Ваша сумма: ");
        int summa = input.nextInt();
        int balance = 100;
        int balance2 = balance+summa;
        if(summa <=100){
            System.out.println(" Ваш баланс: "+ balance2);
        }

        int bonus = service.calculate(summa, 100);

        System.out.println("Вам начислен бонус: "+ bonus);
    }




}
