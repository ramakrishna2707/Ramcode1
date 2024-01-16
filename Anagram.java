package Ramlogin;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String a="act";
       String b="cat";
       char[]a1=a.toCharArray();
       char[]b1=b.toCharArray();
       int count=0;
       if(a1.length==b1.length) {
    	   for(int j=0;j<b1.length;j++) {
    		   char ch=b1[j];
    		   for(int i=0;i<a1.length;i++) {
    			   if(ch==a1[i]) {
    				   a1[i]='\n';
    				   count++;
    				   break;   
    			   }
    		   }
    	   }
    	   if(count==b.length()) {
    		   System.out.println("Anagram");
    	   }
    	   else {
    		   System.out.println("Not Anagram");
    	   }
       }
	}

}
