package seed_sdet_course_core_java;

public class Day_10_Numerator_Denominator_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Day_10_Numerator_Denominator d1 = new Day_10_Numerator_Denominator(10, 0);
		try {
			d1.divison();
		} catch (ArithmeticException e) {
			// TODO: handle exception

			e.printStackTrace();

		} catch (NumberFormatException e) {
			// TODO: handle exception

			e.printStackTrace();

		}
	}

}
