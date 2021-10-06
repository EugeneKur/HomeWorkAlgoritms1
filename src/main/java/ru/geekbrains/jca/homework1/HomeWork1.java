package ru.geekbrains.jca.homework1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


public class HomeWork1 {
    public static void main(String[] args) {
    }
    // Task 2

    // 1) O(n)
    public static int linearSearch(int arr[], int elementToSearch) { //O(1)

        for (int index = 0; index < arr.length; index++) { //O(n)
            if (arr[index] == elementToSearch) //O(1)
                return index; //O(1)
        }
        return 1; //O(1)
    }

    // 2) O(n)
    public static Object[] copy(int arr[]) { //0(1)
        ArrayList<Integer> arrayList = new ArrayList<>(); //0(1)
        for (int i : arr) { //0(n)
            arrayList.add(i);
        }

        Object[] arr2 = arrayList.toArray(); //0(n)
        return arr2; //0(1)
    }

    // 3) O(1)
    public static void delElementMassiveWithIndex(int[] arr, int index) { //O(1)
        arr[index] = 0; //O(1)
    }

    // 4) O(n)
    public static void delElementMassiveWithElement(int arr[], int elementToSearch) { //O(1)
        for (int index = 0; index < arr.length; index++) { //O(n)
            if (arr[index] == elementToSearch) //O(1)
                arr[index] = 0; //O(1)
        }
    }

    // 5) O(n)
    public static void delElementMassiveWithElementWithShift(int arr[], int elementToSearch) { //O(1)
        int count = 0; //O(1)
        int[] arr2 = null; //O(1)
        for (int index = 0; index < arr.length; index++) { //O(n)
            if (arr[index] != elementToSearch) { //O(1)
                arr2[index-count] = arr[index]; //O(1)
            } else count++;//O(1)
        }
    }



    //Task3

    //a) O(n*log(n))
    //   iteration=1+1+(10000*lb(10000)=130002

    int n = 10000; // O(1)
    List<Integer> arrayList = new ArrayList<>(); //O(1)
        for (int i = 0; i < n; i++) { //
        for (int j = 1; j < n; j *= 2) {
            arrayList.add(i * j);
        } // O(log(n))
    } // O(n*log(n))

    //b) O(n*log(n))
    //   iteration=1+1+10000+(10000-(2^1+1))+(10000-(2^2+1))+(10000-(2^3+1))+(10000-(2^4+1))+(10000-(2^5+1))+(10000-(2^6+1))+(10000-(2^7+1))+(10000-(2^8+1))
    // +(10000-(2^9+1))+(10000-(2^10+1))+(10000-(2^11+1))+(10000-(2^12+1))+(10000-(2^13+1)) = 1+1+10000+10000*13-((2^1+1)+(2^1+1)+(2^2+1)+(2^3+1)+(2^4+1)+(2^5+1)
    // +(2^6+1)+(2^7+1)+(2^8+1)+(2^9+1)+(2^10+1)+(2^11+1)+(2^12+1)+(2^13+1)) = 123607

    int n = 10000; //O(1)
    List<Integer> arrayList = new ArrayList<>(); //O(1)
        for (int i = 0; i < n; i += 2) {
        for (int j = i; j < n; j++) {
            arrayList.add(i * j);
        } //O(n)
    } //O(n*log(n))

    //с) O(n^m)
    //   iteration = 1+1+10000*(10000/2) = 50000002

    int n = 10000; //O(1)
    List<Integer> arrayList = new ArrayList<>(); //O(1)
        for (int i = 0; i < n; i ++) {
        for (int j = 0; j < n; j++) {
            arrayList.add(i * j);
            n--;
        } //O(n/2)
    } //O(n^m)

    //d) O(1) - видимо я что-то не понимаю (не хочу сдавать ДЗ, после просмотра ответов на домашку)...
    //   iteration = 1+1 = 2

    public void factorial(BigInteger.valueOf(10000)) //O(1)

    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ONE)) // O(1)
        {
            return n; //0(1)
        } //O(1)
        return n.multiply(factorial(n.subtract(BigInteger.valueOf(1)))); //O(1)
    }

    //e) O(1) - видимо я что-то не понимаю (не хочу сдавать ДЗ, после просмотра ответов на домашку)...
    //   iteration = 1+1+1+1+1+1 = 6

    fib(BigInteger.valueOf(50)); //O(1)

    public static BigInteger fib(BigInteger n) {
        if (n.equals(BigInteger.ONE)) {
            return BigInteger.ZERO; //O(1)
        } //O(1)
        if (n.equals(BigInteger.TWO)) {
            return BigInteger.ONE; //O(1)
        } //O(1)
        return fib(n.subtract(BigInteger.ONE)).add(fib(n.subtract(BigInteger.TWO))); //O(1)
    }

}
