package hw;
/*
 * Topic: 輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。
 * Date: 2016/10/03
 * Author: 105021060 陳俊仁
 */
import java.util.*;
public class hw01_105021060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn=new Scanner(System.in);
           System.out.println("請輸入數字(不含0)");
           int n=scn.nextInt();
           if(n>0&&n<10){
        	   System.out.println("1位數");
           }else{
        	   if(n>9&&n<100){
            	   System.out.println("2位數");
           }else{
        	   if(n>99&&n<1000){
            	   System.out.println("3位數");
           }else{
        	   if(n>999&&n<10000){
            	   System.out.println("4位數");
           }else{
        	   if(n>9999&&n<100000){
            	   System.out.println("5位數");
           }else{
        	   if(n>99999&&n<1000000){
            	   System.out.println("6位數");
           }else{
        	   if(n>999999&&n<10000000){
            	   System.out.println("7位數");   
           }else{
        	   if(n>9999999&&n<100000000){
            	   System.out.println("8位數");
           }else{
        	   if(n>99999999&&n<1000000000){
            	   System.out.println("9位數");
           }else{
               System.out.println("錯誤");
                }
        	   }
        	 }
           }
	     }
       }
     }
   }
  }
 }
}