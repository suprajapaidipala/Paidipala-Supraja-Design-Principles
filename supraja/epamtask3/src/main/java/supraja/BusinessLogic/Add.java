package supraja.BusinessLogic;

import supraja.DataLayer.data;

public class Add {

	public int add(int a,int b) {
		data d=new data();
		int c=a+b;

		d.data1(a, b, c, "addition");
		return c;
	}
}