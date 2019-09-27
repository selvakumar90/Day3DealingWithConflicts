package org.test;

public class Conflicts {
public static void main(String[] args) {
	

	int a[]=new int[3];
	a[1]=1;
	a[0]=2;
	a[2]=3;
	System.out.println(a[0]);
	int l=a.length;
	System.out.println(l);
	for(int i=0; i<a.length;i++) {
		System.out.println(a[i]);
	}

}	
}
