package com.jackluo;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        int x,y;
        while (true){    Thread.sleep(1000);
            x=(int)(Math.random()*100);
            y=(int)(Math.random()*100);
            System.out.println("坐标："+(x+","+y));
        }
    }
}
