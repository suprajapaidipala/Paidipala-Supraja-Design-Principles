package supraja.BusinessLogic;

import supraja.DataLayer.data;

public class Sub {

	public int subtract(int a,int b) {
		data d=new data();
		int c=a-b;

		d.data1(a, b, c, "subtraction");
		return c;
	}


}