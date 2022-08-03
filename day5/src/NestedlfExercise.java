import java.util.Scanner;
public class NestedlfExercise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        if (month >= 5  && month <= 9){
            System.out.println("这是旺季，请输入年龄");
            int age = scanner.nextInt();
            if (age >= 18 && age <= 60){
                System.out.println("票价为60元");
            }if (age <= 18){
                System.out.println("票价为30元");
            }if (age >= 60){
                System.out.println("票价为20元");
            } else if (month >=1 && month <= 5 && month >= 9 && month <= 12) {
                System.out.println("这是淡季，请输入年龄");
                if (age >= 18 && age <= 60){
                    System.out.println("票价为40元");
                } else  {
                    System.out.println("票价为20元");
                }
            }else {
                System.out.println("你输入的月份有误，不能买票");
            }
        }else {
            System.out.println("你输入的月份有误，不能买票");
        }
    }
}
