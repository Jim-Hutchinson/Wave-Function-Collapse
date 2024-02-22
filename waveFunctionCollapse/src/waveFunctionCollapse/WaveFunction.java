package waveFunctionCollapse;

import java.util.ArrayList;
import java.util.List;

public class WaveFunction {

	public static void main(String[] args) {
		Cell[][] array = new Cell[24][24];

		// Fill the array
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 24; j++) {
				array[i][j] = new Cell();
			}
		}

		// Print the array
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 24; j++) {
				System.out.println(array[i][j]);
			}
		}
	}
}

class Cell {
	List<Integer> list1;
	List<Integer> list2;
	List<Integer> list3;
	List<Integer> list4;
	boolean collapsed;

	public Cell() {
		list1 = new ArrayList<>();
		list2 = new ArrayList<>();
		list3 = new ArrayList<>();
		list4 = new ArrayList<>();
		collapsed = false;

		for (int i = 0; i < 16; i++) {
			list1.add(i);
			list2.add(i);
			list3.add(i);
			list4.add(i);
		}
	}

	@Override
	public String toString() {
		return "Cell{" +
				"list1=" + list1 +
				", list2=" + list2 +
				", list3=" + list3 +
				", list4=" + list4 +
				", collapsed=" + collapsed +
				'}';
	}
}