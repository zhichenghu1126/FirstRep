package test;

import java.io.File;

public class 遍历文件夹 {
	
		static File maxFile = null;
		static File minFile = null;
		static long min = Integer.MAX_VALUE;
		static long max = 0;
		static File file = new File("D:/eclipse");
	
		public static void main(String[] args) {
			int[] a = new int[2];
			listFiles(file);
		    
			
			
}
		private static void listFiles(File file2) {
			
			File[] listFiles = file.listFiles();
			if(listFiles==null) {
				return;
			}
			for (File f : listFiles) {
				
				if(f.isDirectory()) {
					listFiles(f);
				}
				if(max<f.length()) {
					max = f.length();
					maxFile = f;
				}
				if(min>f.length()&&f.length()!=0) {
					min = f.length();
					minFile = f;
				}
			}
			
			System.out.println("最大文件是"+maxFile.getName()+"文件大小为"+max);
			System.out.println("最小文件是"+minFile.getName()+"文件大小为"+min);
		}
}


/**
 * 文件对象
 * @author Chen
 * 题目： 便利文件夹
 * 一般说来操作系统都会安装在C盘，所以会有一个 C:\WINDOWS目录。
 * 遍历这个目录下所有的文件(不用遍历子目录)
 * 找出这些文件里，最大的和最小(非0)的那个文件，打印出他们的文件名
 * 注: 最小的文件不能是0长度
 */
 
/*import java.io.File;
 
public class FileObject {
     
    static long minSize = Integer.MAX_VALUE;
    static long maxSize = 0;
    static File maxFile = null;
    static File minFile = null;
    static File f = new File("c:/WINDOWS");
     
    public static void main(String[] args) {
        listFile(f);
        listFiles(f);
    }*/
     
    /*遍历文件夹*/
    /**
     * 思路：
     * 1.先返回当前文件夹下的所有文件,以文件数组的形式存放
     * 2.判断文件是否存在
     * 3.遍历文件数组
     * 4.判断文件数组中每一个文件是不是文件夹 是：继续 不是：退出
     * 5.遍历的文件数组中的文件大小要是大于最大文件大小，就以遍历的文件数组文件为最大值。保存文件
     * 6.同理，最小值也一样。
     * 7.输出文件的名字和文件的大小
     */
/*    public static void listFile(File fc) {
        File[] fs = f.listFiles();
        if(fs == null) {
            return;
        }
         
        for (File file : fs) {
            if(file.isDirectory())
                continue;
            if(file.length() > maxSize) {
                maxSize = file.length();
                maxFile = file;
            }
             
            if(file.length() != 0 && file.length() < minSize) {
                minSize = file.length();
                minFile = file;
            }
        }
        System.out.printf("最大文件%s,其大小是%,d字节%n", maxFile.getAbsoluteFile(),maxFile.length());
        System.out.printf("最小文件%s,其大小是%,d字节%n" ,minFile.getAbsoluteFile(),minFile.length());
 
    }
     
     
    遍历子文件夹
    *//**
     * 思路：
     * 1.判断是否是文件
     * 2.遍历的文件数组中的文件大小要是大于最大文件大小，就以遍历的文件数组文件为最大值。保存文件
     * 3.同理，最小值也一样。
     * 4.判断文件是否是文件夹
     * 5.遍历文件数组
     * 6.判断文件数组是否为空
     * 7.重新遍历文件数组(递归)
     *//*
    public static void listFiles(File file) {
        if(file.isFile()) {
            if(file.length() > maxSize) {
                maxSize = file.length();
                maxFile = file;
            }
            if(file.length() < minSize && file.length() != 0) {
                minSize = file.length();
                minFile = file;
            }
            return;
        }
         
        if(file.isDirectory()) {
            File[] fe =file.listFiles();
            if(fe != null) {
                for (File f : fe) {
                    listFiles(f);
                }
            }
        }
        System.out.printf("最大文件%s,其大小是%,d字节%n", maxFile.getAbsoluteFile(),maxFile.length());
        System.out.printf("最小文件%s,其大小是%,d字节%n" ,minFile.getAbsoluteFile(),minFile.length());
    }
}*/