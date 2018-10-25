package string;

	class MyThread1 implements Runnable{
		private String name;
		MyThread1(String name){
		this.name = name;
		}
	public void run(){
		for(int i=0; i<10; i++){
		System.out.println("名字："+name+i);
		}
	}
}
