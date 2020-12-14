import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int year;
        while(true){
            System.out.println("请输入一个年份：");
            Scanner scanner = new Scanner(System.in);
            year = scanner.nextInt();
            if(year<0 || year >3000){
                System.out.println("请输入正确的年份！");
            }
            if(year%4==0&&year%100!=0||year%400==0){
                System.out.println(year+"年是闰年");
            }else{
                System.out.println(year+"年不是闰年");
            }
        }

    }
}
