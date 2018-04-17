package com.principal;

public class principal {
    public static void main(String[]args){
        int a=20;
        int b=0;
        int c=0;
        try {
            c=a/b;
        }catch (ArithmeticException e){
            System.out.println("div por 0");
        }catch (Exception e){
            System.out.println("div por 0");
        }
        System.out.println("resultado: "+c);
    }
}
