package by.htp.les12.logic;

import java.util.ArrayList;
import java.util.List;
import by.htp.les12.entity.Train;

public class TrainLogic {

	public List<Train> sortByNumber(List<Train> trains) {

		List<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(trains);

		for (int i = 0; i < sortTrains.size() - 1; i++) {
			for (int j = 0; j < sortTrains.size() - 1 - i; j++) {
				Train train1 = sortTrains.get(j);
				Train train2 = sortTrains.get(j + 1);
				if (train1.getNumber() > train2.getNumber()) {
					sortTrains.set(j, train2);
					sortTrains.set(j + 1, train1);
				}
			}
		}
		return sortTrains;
	}

	public List<Train> sortByDate(List<Train> trains) {

		List<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(trains);

		for (int i = 0; i < sortTrains.size() - 1; i++) {
			for (int j = 0; j < sortTrains.size() - 1 - i; j++) {
				Train train1 = sortTrains.get(j);
				Train train2 = sortTrains.get(j + 1);
				if (train1.getCalendar().compareTo(train2.getCalendar()) > 0) {
					sortTrains.set(j, train2);
					sortTrains.set(j + 1, train1);
				}
			}
		}
		return sortTrains;
	}

	public List<Train> sortByDestination(List<Train> trains) {

		List<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(trains);

		for (int i = 0; i < sortTrains.size() - 1; i++) {
			for (int j = 0; j < sortTrains.size() - 1 - i; j++) {
				Train train1 = sortTrains.get(j);
				Train train2 = sortTrains.get(j + 1);
				
				int destinationCompareToResult = train1.getDestinationStation().compareTo(train2.getDestinationStation());
				
				if (destinationCompareToResult > 0) {
					sortTrains.set(j, train2);
					sortTrains.set(j + 1, train1);
				} else if (destinationCompareToResult == 0) {
					if (train1.getCalendar().compareTo(train2.getCalendar()) > 0) {
						sortTrains.set(j, train2);
						sortTrains.set(j + 1, train1);
					}
				}
			}
		}
		return sortTrains;
	}

	public Train findByNumber(int findNumber, List<Train> trains) {
		Train train = null;
		for (int i = 0; i < trains.size(); i++) {
			if (findNumber == trains.get(i).getNumber()) {
				train = trains.get(i);
			}
		}
		return train;
	}

}
