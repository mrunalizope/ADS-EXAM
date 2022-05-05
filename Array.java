class Array{
	int n;
	
	
	Array(){
	size=5;
}}
public class main{
	void insertionmethod()
	{   n=a1.length;
		int a1[size]={2,4,6,8,3};
		//a1[4]=3;
		for(int i=0;i<n-1;i++)
		{
			int k=a1[i];
			int j=i-1;
			while(j>=0 && a1[j]>k)
			{
				a1[j+1]=a1[j];
				j=j-1;
			}
			a1[j+1]=k;
		}
		System.out.println(a1[i]+" ");
	}
	public static void main(String args[]){
	Array a=new Array();
	a.insertionmethod();
		
	}
}
