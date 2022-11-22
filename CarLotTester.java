package csc251.team.project;

import java.util.ArrayList;

public class CarLotTester {
	public static void main(String[] args) {
		CarLot lot = new CarLot();
		lot.addCar("test1", 10000, 30, 12500.0D, 17500.0D);
		lot.addCar("test2", 10000, 10, 10000D, 10000D);
		lot.addCar("test3", 12000, 20, 12000D, 12000D);
		System.out.println("Inventory: ");
		for (Car car: lot.getInventory()) {
			System.out.println(car);
		}
		System.out.println("Average MPG: " + lot.getAverageMpg());
		System.out.println("Total Profit: " + lot.getTotalProfit());
		System.out.println("Car with the best MPG: " + lot.getCarWithBestMPG());
		System.out.println("Car with the highest mileage: " + lot.getCarWithHighestMileage());
		lot.sellCar("test1", 17000.0D);
		System.out.println("Total profit after selling one car: " + lot.getTotalProfit());

		// assertion test
		ArrayList<Boolean> test_results = new ArrayList<Boolean>();

		// test average
		if (lot.getAverageMpg() == 20.0) {
			test_results.add(true);
		} else {
			test_results.add(false);
		}
		// test profit
		if (lot.getTotalProfit() == 4500.0) {
			test_results.add(true);
		} else {
			test_results.add(false);
		}
		// test best mpg
		if (lot.getCarWithBestMPG().getId() == "test1") {
			test_results.add(true);
		} else {
			test_results.add(false);
		}
		// test hightest mileage car
		if (lot.getCarWithHighestMileage().getId() == "test3") {
			test_results.add(true);
		} else {
			test_results.add(false);
		}

		// checks to see if all tests passed 
		boolean flag = true;
		for (boolean result : test_results) {
			if (flag && result) {
				flag = true;
			} else {
				flag = false;
			}
		}
		String mark = flag ? "Passed" : "Failed";
		System.out.println("Test: " + mark);
	}

}
