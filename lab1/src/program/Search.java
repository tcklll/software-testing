package program;
import java.util.Scanner;

public class Search {
	public static int n=7;//Ӳ����
	public static int m=83;//����ֵ
	public static int money[]= {50,20,5,5,1,1,1};//Ӳ����ֵ
	public static Boolean value[]=new Boolean[85];//dp����
	public static Boolean judge(int x) {//�жϺ���
		if(x>m||x<0)return false;//���������ݲ���[0,m]������ ����false
		return value[x];//���ڷ�����value
	}
	public static void dp() {//��̬�滮����
		for(int i=0;i<=m;i++)//Ϊvalue���鸳��ֵ
			value[i]=false;
		value[0]=true;
		for(int i=0;i<n;i++) {//���ѭ��Ӳ����ֵ
			//�ڲ�ѭ����ʾʹ�õ�iöӲ�ҿ��ܴճ��ļ�ֵ��Ϊ�˷�ֹӲ�ұ��ظ�ʹ���ڲ�ѭ��Ҫ����
			//Ϊ��ֹ�±�������½���Ϊj-money[i]
			for(int j=m;j-money[i]>=0;j--) {
				if(value[j-money[i]])value[j]=true;//�����ֵj-money[i]���Ա��ճ�������ֵj���Ա��ճ���
			}
		}
	}
	public static void main(String args[]) {
		dp();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {//ѭ����������
			int x=sc.nextInt();
			if(judge(x)) {//��ֵx���Ա��ճ������Yes
				System.out.println("Yes");
			}
			else {//��ֵx�����Ա��ճ������No
				System.out.println("No");
			}
		}
	}
}
