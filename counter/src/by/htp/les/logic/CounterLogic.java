package by.htp.les.logic;

import by.htp.les.entity.Counter;

public class CounterLogic {

	public Counter increase(Counter counter) {
		int temp = counter.getCounter();
		temp++;
		counter.setCounter(temp);
		return counter;
	}
	
	public Counter decrease(Counter counter) {
		int temp = counter.getCounter();
		temp--;
		counter.setCounter(temp);
		return counter;
	}

}
