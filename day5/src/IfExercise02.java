//定义两个变量int 判断二者的和 是否能被3又能被5整除，打印提示信息
public class IfExercise02 {
    public static void main(String[] args){
        int sum1 = 5;
        int sum2 = 10;
        int sum = sum1 + sum2;
        if (sum % 3 == 0 && sum % 5 == 0){
            System.out.println("和能被3整除又能被5整除");
        } else {

            System.out.println("和不能被3整除又能被5整除");
        }

    }

}
