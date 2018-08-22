package lec02.ex1;

public class AverageHeightApp {

	public static void main(String[] args) {

		double[] heights = readHeightData();
		double sum_of_heights = 0.0;

		for (int i=0; i<heights.length; i++) {
			sum_of_heights += heights[i];
		}

		double avg_height = sum_of_heights/heights.length;

		System.out.println("Avg. height: " + avg_height);
	}

	public static double[] readHeightData() {
		double[] height_data = {66.0, 72.0, 67.3, 80.0};
		return height_data;
	}
}
