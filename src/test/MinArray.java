package test;

public class MinArray {
	
	/**
	 * 查询数组最大最小数
	 * 数组反转
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[(int) (Math.random()*5)];
		int[] b = new int[(int) (Math.random()*5)];
		int i = 0;
		a[0] = (int) (Math.random()*100);
		a[1] = (int) (Math.random()*100);
		a[2] = (int) (Math.random()*100);
		a[3] = (int) (Math.random()*100);
		a[4] = (int) (Math.random()*100);
		int maxIndex = a[0];
		int minIndex = a[0];
		for(i=0;i<5;i++) {
			System.out.println(a[i]);
		}
		for (i = 0; i < a.length; i++) {
            if(maxIndex < a[i]){
                maxIndex = a[i];
            }
            if(minIndex > a[i]){
                minIndex = a[i];
            }
        }
		
//		System.out.println("这个数组的最大值为："+maxIndex+"\t最小值为："+minIndex);
		
	}

}
