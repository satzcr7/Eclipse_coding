
public class Demo5 {

	public static void main(String[] args) {


int a =512;
byte b =12;
b=(byte) a;
//System.out.println(b);

a = 5;
b=5;
int c = 7;
int res = a^c^b;
System.out.println(res);
//String[] str = new String[] {"124","456"};
//System.out.println(str[0].charAt(2));
//int [] arr = new int[str.length()];
//for(int i=0;i<str.length();i++){  
//    arr[i]=str.charAt(i)-0;
//    System.out.println(arr[i]);
//}  

int num = 21453;
int inverted =0;int power=1;int digit=0;
while (num>0) {
	digit=num%10;
	inverted = (int) (inverted + (power *  Math.pow(10, digit-1)));
	power++;
	num=num/10;
}
System.out.println(inverted);
}
}
