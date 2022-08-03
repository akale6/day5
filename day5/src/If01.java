import java.util.Scanner;
//编写一个程序 可以输入人的年龄 如果年龄大于18则输出你的年龄大于18，要对自己的行为负责，镶金剑鱼
public class If01 {
    public static void main(String[] args){
        //定义一个Scanner对象
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age = myScanner.nextInt();
        if (age > 18) {
            System.out.println("你的年龄大于18，要对自己的行为负责，镶金剑鱼");
        }else {

            System.out.println("程序继续...10");
        }
    }

}
