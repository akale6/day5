import java.util.Scanner;

//判断一个年份是否闰年，，闰年条件满足下面二者条件之一
//1.年份能被4整除，但不能被100整除；2.能被400整除
public class IfExercise03 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = myScanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + "是闰年、");
        }else {
            System.out.println(year + "不是闰年");
        }


    }


}
