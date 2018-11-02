package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] list = BinarySearch.list;
        System.out.println(BinarySearch.binarySearch(list, 2));  /* 0 */
        System.out.println(BinarySearch.binarySearch(list, 11)); /* 4 */
        System.out.println(BinarySearch.binarySearch(list, 79)); /*12 */
        System.out.println(BinarySearch.binarySearch(list, 1));  /*-1 */
        System.out.println(BinarySearch.binarySearch(list, 5));  /*-1 */
        System.out.println(BinarySearch.binarySearch(list, 80)); /*-1 */
    }
}
