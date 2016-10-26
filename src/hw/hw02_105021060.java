package hw;
/*
 * Topic: 讓使用者輸入多個數，統計正數、負數及零各有多少個。
 * Date: 2016/10/03
 * Author: 105021060 陳俊仁
 */
import java.util.*;
public class hw02_105021060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn=new Scanner(System.in);
           System.out.println("輸入幾個數");
           int n=scn.nextInt();
           System.out.println("輸入數字");
           int x=0,y=0,z=0; 
           for(int i=1;i<=100000;i++){
        	   if(i>0){        		   
        		   x++;
        	   }else{
        		   if(i<0){        			   
        			   y++;
        		   }else{
        			   if(i==0){        				   
        				   z++;
        			   }
        		   }
        	   }
        	   break;
           }
           System.out.println("有"+x+"個正數");
           System.out.println("有"+y+"個負數");
           System.out.println("有"+z+"個0");
      }

}
