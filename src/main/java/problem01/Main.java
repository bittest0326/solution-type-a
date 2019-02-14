package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);
			
			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		int count = 0;
		
		if((number+7)%10==0 | (number+4)%10==0 | (number+1)%10==0) {
			count=1;
		}
			if(number/10==3 | number/10==6 | number/10==9) {
				count=2;
			}
			
		return count;
		
	}
}