public class Test2 {
    public static void main(String[] args) {
        long  num = 0;
        for(long  i=1;i<=2147483647;){
            num+=i;
            i+=2;
        }
        System.out.println("奇数相加结果为："+num);
    }
}
