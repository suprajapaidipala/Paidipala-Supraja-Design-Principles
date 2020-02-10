package supraja.BusinessLogic;

import supraja.DataLayer.data;

public class Mul {

	public int multi(int a,int b) {
		data d=new data();
		int c=a*b;

		d.data1(a, b, c, "multiplication");
		return c;
	}


}