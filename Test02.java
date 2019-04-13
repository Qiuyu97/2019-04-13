package 基础字节流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _02_字节读文件 {

	public static void main(String[] args) throws IOException {
		
		
		//【先保证有路径，有文件，才能读】
		
		
		//创建输入流对象
		FileInputStream fis = new FileInputStream(new File("E:/aaa.txt"));
		
		//read() 方法自动读取每一次往后移动一位，到没有的时候，返回-1
		//未知次数的读取，到-1结束
		
			while(true) {			
				int x = fis.read();
				if(x==-1) {
					break;
				}
				System.out.print((char)x);
			}
		/*
			int x;
			while((x=fis.read()) != -1) {				
			}
		*/
		
		//【关闭】
		fis.close();

	}

}
