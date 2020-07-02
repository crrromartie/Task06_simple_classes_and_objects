package by.htp.les.main;

import by.htp.les.entity.Counter;
import by.htp.les.logic.CounterLogic;
import by.htp.les.view.CounterView;

public class Main {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		CounterView cv = new CounterView();
		CounterLogic cl = new CounterLogic();
		
		cv.info(counter);
		cl.increase(counter);
		cv.info(counter);
		cl.increase(counter);
		cv.info(counter);
		cl.decrease(counter);
		cv.info(counter);
	}

}
