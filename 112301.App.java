//实体类
package com.jackluo;
public class Point {
    private  int x;
    private int y;

//    有参构造方法
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}

//主方法类
package com.jackluo;

import java.util.Scanner;

public class Sjzb {

    public static void main(String[] args) {

        while (true){
            Scanner scanner = new Scanner(System.in);
            Integer num = scanner.nextInt();
            if (num == 1){
                Point p = new Point((int)(Math.random()*100),(int)(Math.random()*100));
                System.out.println("x:"+p.getX()+",y:"+p.getY());
            }else{
                return;
            }
        }

    }
}
