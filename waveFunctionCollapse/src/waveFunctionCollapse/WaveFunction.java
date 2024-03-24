package waveFunctionCollapse;

import java.util.ArrayList;
import java.util.Arrays;
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
	
    public static int[] intersect(int[] nums1, int[] nums2) {
        // Sorting arrays to make it easier to find intersections
    	// May not be needed to complete work
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        List<Integer> intersection = new ArrayList<>();
        int i = 0, j = 0;
        
        // Loop through both arrays
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                // If the current element in nums1 is less than that in nums2,
                // move to the next element in nums1.
                i++;
            } else if (nums1[i] > nums2[j]) {
                // If the current element in nums1 is greater than that in nums2,
                // move to the next element in nums2.
                j++;
            } else {
                // If both elements are equal, it's part of the intersection.
                // Add it to the result list and move to the next elements in both arrays.
                intersection.add(nums1[i]);
                i++;
                j++;
            }
        }
        
        // Convert the result list back to an array
        int[] result = new int[intersection.size()];
        for (i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        
        return result;
    }
}