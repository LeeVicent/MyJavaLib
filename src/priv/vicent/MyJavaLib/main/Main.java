/**
 * ����ʱ�䣺2017��10��10�� ����5:04:05  
 * ��Ŀ���ƣ�MyJavaLib 
 * �ļ����ƣ�Main.java   
 * @author ��������
 * @version 1.0   
 * @since JDK 1.7
 */
package priv.vicent.MyJavaLib.main;

import javax.swing.JOptionPane;
/**
 * Test�����ڳ������
 * @author ��������
 * @date 2017��10��11�� ����6:30:19
 */
class Test{
	public int test;
}

public class Main {
	public static int[] arrTest(){
		int[] arr = { 1,2 };
		System.out.println(arr.hashCode());  //593224478
		return arr;    //C/C++�˴����ؾֲ�����Ϊ����ֵ���ѱ��ͷ�
	}
	
	public static void main(String[] args) {
		int arr[] = arrTest();   //local arr��ΪarrTest()�䲼�ֱ��������ã�
		System.out.println(arr.hashCode());  //593224478
		for (int x : arr){
			System.out.println(x);   //1, 2
		}
		Test t = new Test();
		System.out.println(arr.getClass().getName());
		System.out.println(t.getClass().getName());
	}
}

