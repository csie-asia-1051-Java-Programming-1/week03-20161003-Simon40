package ex;
/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
* Author: 105021060 陳俊仁
 */
import java.util.*;
public class ex05_105021060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		if(a%2==1){
			System.out.println("奇數");
		}else{
			if(a%2==0){
				System.out.println("偶數");
			}
		}
	}

}
