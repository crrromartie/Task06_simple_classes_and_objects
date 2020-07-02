package by.htp.les12.view;

import java.util.List;

import by.htp.les12.entity.Train;

public class TrainView {

	public void print(String message, List<Train> trains) {
		System.out.println(message);
		for (Train tr : trains) {
			printOne(tr);
		}
	}

	public void printOne(Train train) {
		System.out.println("Destination: " + train.getDestinationStation() + "  Number: " + train.getNumber()
				+ "  Date: " + train.getCalendar().getTime());
	}

}
