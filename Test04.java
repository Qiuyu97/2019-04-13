package 基础字符流;

import java.io.*;

public class _02_字符输入 {

	public static void main(String[] args) throws IOException{
		
		// 两个 \\ 表示转移，保留一个\的意思
		
		//判断有没有
		File f = new File("C:\\Users\\admin\\Desktop\\Java程序员75题思维逻辑题.txt");
		if(f.exists()) {
			//有就执行
			
			//创建对象
			FileReader fr = new FileReader(f);
			
			//循环读取
			while(true) {
				//读取一个ASCII码
				int x = fr.read();
				//结束了吗
				if(x==-1) {
					break;//结束了
				}
				//判断不成立就可以操作输出
				System.out.print((char)x);
			}
			
			
			//【关闭流】
			fr.close();
			
		}
		else {
			System.out.println("没有这个文件！");
		}
			

		

	}

}
