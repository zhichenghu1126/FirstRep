package test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {

	public static void main(String[] args) {
		//如果Executors提供的三个静态方法能满足要求，就尽量使用它提供的三个方法，因为自己去手动配置ThreadPoolExecutor的参数有点麻烦，要根据实际任务的类型和数量来进行配置
		ThreadPoolExecutor executor=new ThreadPoolExecutor(10,13,
				200,TimeUnit.MILLISECONDS,new ArrayBlockingQueue<Runnable>(10));
		//ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);
				for(int i=0;i<18;i++)
				{
				MyTask myTask=new MyTask(i);
				executor.execute(myTask);//提交线程
				System.out.println("线程池中的线程数目:"+executor.getPoolSize()+
				"队列中等待执行的任务数目:"+executor.getQueue().size()+
				"已经执行完的任务数目:"+executor.getCompletedTaskCount());
				}
				executor.shutdown();//启动有序关闭,
				}
}
		class MyTask implements Runnable {
			
				private int taskName;
				public MyTask(int num){
					this.taskName=num;
				}
				
				public void run(){
					System.out.println("正在执行:"+taskName);
					try
					{
					Thread.currentThread().sleep(500);
					}
					catch(InterruptedException e)
					{
					e.printStackTrace();
					}
					System.out.println("task"+taskName+"执行完毕");
				}

		}
