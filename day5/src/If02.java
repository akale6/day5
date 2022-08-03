import java.util.Scanner;

public class If02 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
         System.out.println("请输入爱晴宝的信用分");
         int score = scanner.nextInt();
         if (score == 100){
             System.out.println("非常爱晴宝");
         } else if (score >= 80 && score <= 99) {
             System.out.println("特别爱晴宝");

         } else if (score >= 60 && score <= 80) {
             System.out.println("真的很爱晴宝");

         } else {
             System.out.println("最爱晴宝了");

         }
    }
}
