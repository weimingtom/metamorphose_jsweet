package com.iteye.weimingtom.metamorphose.lua;

public class FakeDouble {
	public double val = 0;
	
	public FakeDouble(double _val) {
		this.val = _val;
	}
	
	public boolean equals(Object o) {
		if (o instanceof FakeDouble) {
			return this.val == ((FakeDouble)o).val;
		}
		return false;
	}
}
