-offer(T)-добавя елемент в края на опашката;
-poll()-взема елемент от началото на опашката и го премахва;
-peek()-връща елемент от началото на опашката без да го премахва;
-clear()-изчиства всички елементи в опашката;
-contains(T)-проверява дали елемента се съдърва с опашката.
-------------
public class Main {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("One");
        queue.offer("Two");
        queue.offer("Three");
        queue.offer("Four");
        queue.offer("Five");

        while(queue.size() > 0){
            String msg = queue.poll();
            System.out.println(msg);
        }
    }
}