
import java.io.File;

public class DeleteDir{

	public static void main(String[] args) {
		
		//指定路径
		String dir = "E:/aaa/";
		
		//调用递归函数
		deleteDIR(dir);

	}

	
	//递归函数，用于删除一个指定路径的文件夹
	public static void deleteDIR(String str) {
		
		//创建对象
		File dir = new File(str);
		
		//提取里面所有的内容
		File[] arr = dir.listFiles();
		
		//遍历循环
		for( File x : arr ) {
			//是文件
			if(x.isFile()) {
				x.delete();//文件删除
			}
			//是路径
			if(x.isDirectory()) {
				//递归:传入绝对路径
				deleteDIR(x.getAbsolutePath());
			}
		}
		
		//都找完了，空了：删除自己
		dir.delete();
	}
	
	
}
