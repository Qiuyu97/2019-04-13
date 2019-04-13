
import java.io.*;

public class _01_字节写文件 {

	public static void main(String[] args) {
		
		//先保证路径及文件夹【根目录，没有路径，不进行操作】
		//定义路径及文件名+后缀
		String filename = "E:/aaa.txt";
		
		//创建File对象
		File f = new File( filename );
		
		//判断有没有，没有创建好
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.out.println("创建失败，无权限操作磁盘！");
			}
		}
		
		
		//===============================================
		
		// 基础 字节 输出流： FileInputStream
		// 从程序，输出字节内容，到文档中
		// 字节适合 数据文件： rar，mp4，jpg，png		
		FileOutputStream fos = null;
		try {
			//创建输出流对象，基于指定的File对象
			fos = new FileOutputStream(f);
			
			//如果内容中，需要换行，
			//程序： \n
			//文档： \r\n
			
			//内容
			String str = "********\r\n**********-abd-ABC-0123";
			
			//循环字符串提取字符，获得char
			for(int i=0; i<str.length(); i++) {
				
				char c = str.charAt(i);
				
				//一个个写
				fos.write(c);
			}
			 
			//【重点要关闭流】：在finally中写了
			//【重点要关闭流】：在finally中写了
			//【重点要关闭流】：在finally中写了
			
			System.out.println("成功！");
			
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在！");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
			}
		}


	}

}
