/**
 * 创建时间：2017年10月10日 下午5:04:05  
 * 项目名称：MyJavaLib 
 * 文件名称：Main.java   
 * @author 北风其凉
 * @version 1.0   
 * @since JDK 1.7
 */
package priv.vicent.MyJavaLib.main;

import javax.swing.JOptionPane;
/**
 * Test类用于程序测试
 * @author 北风其凉
 * @date 2017年10月11日 下午6:30:19
 */
class Test{
	public int test;
}

public class Main {
	public static int[] arrTest(){
		int[] arr = { 1,2 };
		System.out.println(arr.hashCode());  //593224478
		return arr;    //C/C++此处返回局部变量为垃圾值，已被释放
	}
	
	public static void main(String[] args) {
		int arr[] = arrTest();   //local arr成为arrTest()其布局变量的引用，
		System.out.println(arr.hashCode());  //593224478
		for (int x : arr){
			System.out.println(x);   //1, 2
		}
		Test t = new Test();
		System.out.println(arr.getClass().getName());
		System.out.println(t.getClass().getName());
	}
}

