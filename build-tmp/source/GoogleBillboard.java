import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GoogleBillboard extends PApplet {

public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  


public void setup()  
{  



		for(int i=2;i<110;i++){
		String  digits = e.substring(i,i+10);
double dNum = Double.parseDouble(digits);
		
		if(isPrime(dNum)==true)
		{ System.out.println(digits);}
	 
	 noLoop(); 
		
	}
  

     noLoop();  
	

}  

public boolean isPrime(double dNum)  
{   
    if(dNum>1){
    for(int i=2;i<=Math.sqrt(dNum);i++){
      if(dNum%i==0){
       return false;
      }
      
    }
    return true;
  }
  else{
   return false;
  }  
   
} 


public void setup2()  
{  



		for(int i=2;i<110;i++){
		String  digits = e.substring(i,i+10);

      String d1= digits.substring(i);
      String d2= digits.substring(i+1);
      String d3= digits.substring(i+2);
      String d4= digits.substring(i+3);
      String d5= digits.substring(i+4);
      String d6= digits.substring(i+5);
      String d7= digits.substring(i+6);
      String d8= digits.substring(i+7);
      String d9= digits.substring(i+8);
      String d10= digits.substring(i+9);

      Double s1=Double.parseDouble(d1);
      Double s2=Double.parseDouble(d2);
      Double s3=Double.parseDouble(d3);
      Double s4=Double.parseDouble(d4);
      Double s5=Double.parseDouble(d5);
      Double s6=Double.parseDouble(d6);
      Double s7=Double.parseDouble(d7);
      Double s8=Double.parseDouble(d8);
      Double s9=Double.parseDouble(d9);
      Double s10=Double.parseDouble(d10);



		
		if(is49(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10)==true)
		{ System.out.println(digits);}
	 
	  
		
	}
  

     
	

}  

public boolean is49(Double s1,Double s2,Double s3,Double s4,Double s5,Double s6,Double s7,Double s8,Double s9,Double s10)  
{   
    if(s1+s2+s3+s4+s5+s6+s7+s8+s9+s10==49){
      return true;
    }
   return false;

} 
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
