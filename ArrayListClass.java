Динамично-разширяем масив(статична реализация на списък)
-add(Object)-нов елемент
-add(index, Object)-елемент по място
-size()-брой на елементите в списъка
-remove(Object)-премахва определен елемент
-remove(index)-премахва елемент на определено място
-clear()-изчиства списъка

------------------

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
     int sum = 0;
     for (int i = 0; i < intList.size(); i++){
         Integer value = intList.get(i);
         sum = sum + value.intValue();
     }
    System.out.println("sum= " + sum);
    }
}

--------------------
Прости числа - Primes

public class Main {
    public static  ArrayList<Integer> getPrimes(int start, int end){
        ArrayList<Integer> primesList = new ArrayList<Integer>();
        for(int num = start; num <= end; num++){
            boolean prime = true;
            for (int div = 2; div <= Math.sqrt(num); div++){
                if (num % div == 0){
                    prime = false;
                    break;
                }
            }
            if(prime)
                primesList.add(num);
        }
        return primesList;
    }
    public static void main(String[] args) {
       ArrayList<Integer> primes = getPrimes(100, 150);
       for (int p : primes){
           System.out.printf("%d ", p);
       }
        System.out.println();
    }
}

---------------

