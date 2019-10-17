package Controller;

import java.util.Scanner;

public class HellowWorldDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串(中间能加空格或符号)");
        String a = sc.nextLine();
        System.out.println(a);
        //方法体
        System.out.println("hellow word！！！");
    }
}
