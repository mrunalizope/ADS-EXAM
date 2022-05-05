class Array12{
static void insertionsort(int a1[],int n){
	int k=a1[4];
	for(int i=n-1;i>=0;i--)
		{
		if(a1[i-1]<k){
		a1[i]=k;
		System.out.println();
		for(int m:a1)
		{
		System.out.println(m+"");
		}
		return;
		}
		else
		{
		a1[i]=a1[i-1];
		System.out.println();
		for(int m:a1)
		{
		System.out.println(m+"");
		}
}}}
		public static void main(String args[]){
		int []a1={2,4,6,8,3};
		int n=a1.length;
		insertionsort(a1,n);
		
		
}}