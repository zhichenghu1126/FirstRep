package test;

public class TestThread extends Thread{

	private String name;
	private int time;
	public static void main(String[] args) {    
		TestThread th1 = new TestThread("th1", 200);
		TestThread th2 = new TestThread("th2", 100);
		TestThread th3 = new TestThread("th3", 300);
		th1.start();
		th2.start();
		th3.start();
	}
	
	public TestThread(String name,int time) {
		this.name = name;
		this.time = time;
	}
	
	@Override
	public void run() {
		try {
			sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("线程"+name+"开始休眠"+time);
	}

}
