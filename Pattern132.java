import java.util.*;
class Pattern132{
	public static void main(String [] args){
		int a=1,k=0;
		for(int i=1;i<=5;i++){
				if(i%2==0){
					for(k=a+i-1;k>=a;k--){
						System.out.print(k);
						if(k>a){
						System.out.print("*");
						}
					}a+=i; System.out.println();
				}
            else{
			for (int j=0;j<i;j++){
				System.out.print(a);
				if(j<i-1){
					System.out.print("*");
				}a++;
			} System.out.println();
		     }
		}
	}
}