package by.htp.les12.main;

import java.util.GregorianCalendar;
import java.util.List;
import by.htp.les12.entity.Depo;
import by.htp.les12.entity.Train;
import by.htp.les12.logic.TrainLogic;
import by.htp.les12.view.TrainView;

public class Main {

	public static void main(String[] args) {

		Depo depo = new Depo();
		TrainLogic logic = new TrainLogic();
		TrainView view = new TrainView();

		depo.addTrain(new Train("Boston", 15, new GregorianCalendar(2020, 7, 25, 17, 30)));
		depo.addTrain(new Train("Chicago", 10, new GregorianCalendar(2020, 8, 3, 14, 20)));
		depo.addTrain(new Train("Boston", 16, new GregorianCalendar(2020, 7, 26, 17, 00)));
		depo.addTrain(new Train("NewYork", 18, new GregorianCalendar(2020, 7, 27, 15, 30)));
		depo.addTrain(new Train("Washington", 17, new GregorianCalendar(2020, 8, 17, 10, 15)));
		depo.addTrain(new Train("Boston", 11, new GregorianCalendar(2020, 7, 28, 18, 30)));
		depo.addTrain(new Train("NewYork", 12, new GregorianCalendar(2020, 8, 8, 13, 00)));

		List<Train> sortedByNamber;
		sortedByNamber = logic.sortByNumber(depo.getTrains());
		view.print("By Number", sortedByNamber);

		System.out.println();
		List<Train> sortedByDate;
		sortedByDate = logic.sortByDate(depo.getTrains());
		view.print("By Date", sortedByDate);

		System.out.println();
		List<Train> sortedByDestination;
		sortedByDestination = logic.sortByDestination(depo.getTrains());
		view.print("By Destination", sortedByDestination);

		System.out.println();
		Train fTrain;
		fTrain = logic.findByNumber(18, depo.getTrains());
		view.printOne(fTrain);

	}

}
