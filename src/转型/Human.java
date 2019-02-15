package 转型;

public class Human {
	  
	      public void sleep() {
	          System.out.println("Human sleep..");
	      }
	  //1.向上转型
	      /*public static void main(String[] args) {
	         Human h = new Male();// 向上转型
	         h.sleep();
	         Male m = new Male();// 干嘛要向上转型
	         m.sleep();
	         // h.speak();此方法不能编译，报错说Human类没有此方法
	     }*/
	      
	  //2.向下转型
	     /* public static void main(String[] args) {
	          Human h = new Male();// 向上转型
	          Human h1 = new Human();
	          //h.speak();此时需要向下转型，否则不能调用speak方法。
	           Male m =  (Male) h;
	           m.speak();
	           *//**Male m1 = (Male)h1;
	           m1.speak();    此时会出现运行时错误，所以可以用instanceOF判断*//*
	           if (h1 instanceof Male){
	               Male m1 = (Male)h1;
	               m1.speak();
	               
	           }
	      }*/
	      
	      //弄了半天，向上转型反而不能拥有子类的全部方法，还得向下转型，那直接Son s = new Son();岂不是很方便？不知道是不是就我一个开始学习转型有这种想法。

          //最后搞明白了，原因还是我我的例子太简单，没有 考虑过要把类的对象传递给其他函数的例子。

          //例3：体现向上转型的好处，节省代码。
	      
	      public static  void doSleep(Human h){
	           h.sleep();
	       }
	      
	      public static void main(String[] args) {
	          Human h = new Male();// 向上转型
	          doSleep(new Male());//此处匿名子类对象，当然实际应用时应该是用上面的向上转型公式，然后将子类对象传递进来，这样以后好在向下转型，此处没有向下转型，所以直接用了匿名类对象。
	          doSleep(new Female());
	          
	      }
	      //如果不向上转型则必须写两个doSleep函数，一个传递Male类对象，一个传递Female类对象。这还是两个子类，如果有很多子类呢，就要写很多相同的函数，造成重复。

	      //好，终于也理解了为什么要向上转型，一旦向上转型了，当需要用到子类的方法时，就需要向下转型，也就是为什么要向下转型也解决了。
	      
	 }