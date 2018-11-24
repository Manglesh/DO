package Test.DO;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int a=12345;
		  int b=67899999;
		  int n;
		  String s="";
		  String firstNumber=Integer.toString(a);
		  
		  
		  
		     
		     String secondNumber=Integer.toString(b);
		     
		    
		     if(firstNumber.length()>secondNumber.length()){
		      
		      n=secondNumber.length();
		     }
		     else {
		    	 
		    	 n=firstNumber.length();
		     }
		     System.out.println("size min-->"+n);
		     
		    for(int i=0;i<n;i++){
		      		      
		       s=s+String.valueOf(firstNumber.charAt(i))+secondNumber.charAt(i);
		      System.out.print(s+"------>");
		      
		      
 
	}
		    
		    try {
		    if(firstNumber.length()>secondNumber.length()){
			      
			      String sf=firstNumber.substring(secondNumber.length());
			      
			      String s1= s+sf;
			      int number = Integer.parseInt(s1);
			      System.out.println("number------>"+number);
			      if(number>100000000) {
			    	//  return -1;
			      }
			      }
			     else{
			    	 String sf1=secondNumber.substring(firstNumber.length());
				      String s2= s+sf1;
				      System.out.println("totla nooo-->"+s2);
				      long number2 = Long.parseLong(s2);
				      if(number2>10000000) {
				    	//  return -1;
				      }
			      
			     }
			     
			    	 
			     }
		    catch(NumberFormatException num) {
		    	num.printStackTrace();
		    }
		    
}
}