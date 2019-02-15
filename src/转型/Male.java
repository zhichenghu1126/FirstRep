package 转型;

class Male extends Human {
	 String name="Male";
	
     @Override
     public void sleep() {
         System.out.println("Male sleep..");
     }
 
     public void speak() {
         System.out.println("I am Male");
     }
 }
