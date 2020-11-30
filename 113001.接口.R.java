package com.imp;

public interface R {
    static void fun(){
        String boy_filePath = "img/boy.gif";
        String girl_filePath = "img/boy.gif";
        int[][] array2d = {{1,2,3},{4,5,6}};
        System.out.print(boy_filePath+"\n"+girl_filePath+"\n");
        for(int i=0;i<array2d.length;i++){
            for(int j=0;j<array2d.length+1;j++){
                System.out.print(array2d[i][j]);
            }
        }

    }
}
