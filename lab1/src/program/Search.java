package program;
import java.util.Scanner;

public class Search {
	public static int n=7;//硬币数
	public static int m=83;//最大价值
	public static int money[]= {50,20,5,5,1,1,1};//硬币面值
	public static Boolean value[]=new Boolean[85];//dp数组
	public static Boolean judge(int x) {//判断函数
		if(x>m||x<0)return false;//若输入数据不在[0,m]区间内 返回false
		return value[x];//若在返回其value
	}
	public static void dp() {//动态规划函数
		for(int i=0;i<=m;i++)//为value数组赋初值
			value[i]=false;
		value[0]=true;
		for(int i=0;i<n;i++) {//外层循环硬币面值
			//内层循环表示使用第i枚硬币可能凑出的价值，为了防止硬币被重复使用内层循环要倒序。
			//为防止下标溢出，下界设为j-money[i]
			for(int j=m;j-money[i]>=0;j--) {
				if(value[j-money[i]])value[j]=true;//如果面值j-money[i]可以被凑出，则面值j可以被凑出。
			}
		}
	}
	public static void main(String args[]) {
		dp();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {//循环读入整数
			int x=sc.nextInt();
			if(judge(x)) {//面值x可以被凑出，输出Yes
				System.out.println("Yes");
			}
			else {//面值x不可以被凑出，输出No
				System.out.println("No");
			}
		}
	}
}
