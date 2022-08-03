import java.util.Scanner;

public class Nestedlf {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩");
        double score = scanner.nextDouble();
        if (score >= 8.0 ) {
            System.out.println("请输入性别");
            char gender = scanner.next().charAt(0);
            if ( gender == '男'){
                System.out.println("进入男子组");
            } else if  (gender == '女') {
                System.out.println("进入女子组");

            }else {
                System.out.println("你的性别有误不能参赛");
            }
        }else {
            System.out.println("淘汰");

        }


    }


}
