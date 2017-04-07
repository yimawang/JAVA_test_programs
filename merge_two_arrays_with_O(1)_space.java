
public class main {

	public static void main(String[] args) {
		int ar1[] = {3};
	    int ar2[] = {2,3,3,21};
	    int m = ar1.length;
	    int n = ar2.length;
	    merge(ar1,ar2,m,n);
	    System.out.println("After Merging \nFirst Array: ");
	    for (int i=0; i<m; i++)
	    	System.out.print(ar1[i]+", ");
	    System.out.println("\nSecond Array ");
	    for (int i=0; i<n; i++)
	    	System.out.print(ar2[i]+", ");
	}
	
	public static void merge(int ar1[], int ar2[], int m, int n){
		for (int i=n-1; i>=0; i--)
	    {
			int j=0;
			int last = ar1[m-1];
			for(j=m-2;j>=0 && ar1[j]>ar2[i] ;j--){
				ar1[j+1]=ar1[j];
			}
			if(last>ar2[i]){
				ar1[j+1]=ar2[i];
				ar2[i] = last;
			}
	    }
	}
}
