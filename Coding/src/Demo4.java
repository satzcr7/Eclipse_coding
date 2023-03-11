
public class Demo4 {

	public static void main(String[] args) {



		int n=7;
		int row=1;
		int space=0;
		int star=n;
		boolean invertStar = false;





		while(row<=n) {

			//print space
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}


			//print star
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
 
			//next row prep
			row++;
			if(star<=1) {
				invertStar =true;
			}
			if(invertStar) {
				star+=2;
				space--;
			}else {
				space++;
				star-=2;
			}
			System.out.println();


		}


	}

}
