package javasestudy;
/*注释：1、单行注释 用双斜线// 快捷键：ctrl+？
    2、多行注释 用 单斜线* *单斜线   快捷键：Ctrl+Shift+？
    3、文档注释 *//** *//*生成帮助文档时会显示*/
    
public class HelloWorld {
/**
 * @author WJY
 * @param args
 * 第一个java程序
 */
	public static void main(String[] args) {
		/*
		 * 命名规则：
		 * 工程名：没有太多限制，一般用英文，可以大小写混排，也可以全小写
		 * 包名：一般前半部分是公司域名反过来+后半部分根据业务来分（不能用数字开头）
		 * 例如：www.jd.com   com.jd.controller
		 * 
		 * 包或类的命名规则：
		 * 首字母只能是英文或者$或者_下划线
		 * 其他字母可以是英文、$、_、数字
		 * 包名全小写
		 * 
		 * 包下有类，类命名多个单词的情况下，每个单次的首字母都要大写
		 */
		//System.out.println() 快捷键：sysout alt+/
		System.out.println("hello");
		System.out.println("wotld");
		
		//给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12
		int i=345;
		int ge=i%10;
		int shi=i/10%10;
		int bai=i/100%10;
		int sum=ge+shi+bai;
		System.out.println("个位数是："+ge);
		System.out.println("十位数是："+shi);
		System.out.println("百位数是："+bai);
		System.out.println("各个位数之和是："+sum);
		
	

	}

}
