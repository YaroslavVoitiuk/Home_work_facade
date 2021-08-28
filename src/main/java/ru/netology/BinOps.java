package ru.netology;

public class BinOps {

    public String sum(String a,String b){
        int first = Integer.parseInt(a,2);
        int second = Integer.parseInt(b,2);
        int sum = first + second;
        System.out.println("The result of adding " + sum);
        return "Converted number to binary numeral system " + Integer.toBinaryString(sum);
    }

    public String mult(String a, String b){
        int first = Integer.parseInt(a,2);
        int second = Integer.parseInt(b,2);
        int result = first * second;
        System.out.println("The result of multiplying is " + result);
        return "Converted number to binary numeral system " + Integer.toBinaryString(result) ;
    }
}

