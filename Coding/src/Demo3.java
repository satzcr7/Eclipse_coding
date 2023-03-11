
public class Demo3 {

	public static void main(String[] args) {



		int n=3;
		int row=1;
		int space=n-1;
		int star=1;
		
		



		while(row<=n) {

			//print space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}

	
			//print star
			int j=1;
			int val=j;
			while(j<=star) {
				if(j>row) {
					val-=2;
				}
				System.out.print(val+" ");
				val++;
				
				j++;
			}

			//next row prep
			row++;
			space--;
			star+=2;
			System.out.println();


		}


	}

}
