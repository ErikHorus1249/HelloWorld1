import java.util.Scanner;

public class Ex13IO {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //System.out.println("Nhap vao gia tri so nguyen");
        //int a = input.nextInt();

        //System.out.println("Nhap vao gia tri so thuc");
        //float floatValue = input.nextFloat();

       // System.out.println("Nhap vao gia tri so thuc dau cham dong");
       // double doublwValue = input.nextDouble();

        System.out.println("Nhap vao mot ki tu");
        char varChar = input.next().charAt(0);//nhập vào một ký tự

        System.out.println("Nhap vao mot tu");
        String words = input.next();//nhap vao mot tu

        input.nextLine();
        System.out.println("Nhap vao mot dong");
        String line = input.nextLine(); // nhao vao mot dong.

        boolean booleanValue = input.nextBoolean();




        //System.out.println("\nSo nguyen  = " + a);
        //System.out.println("\nSo thuc = " + floatValue);
        //System.out.println("\nSo thuc dau cham dong = " + doublwValue);
        System.out.println("Charactor = " + varChar);
        System.out.println("\nMot tu  = " + words);
        System.out.println("\nMột dòng  = " + line);
        System.out.println("booleanValue = " + booleanValue);

    }
}
