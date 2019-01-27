-push(T)-добавяне на нов елемент на върха на стека
-pop()-връща най-горния елемент като го премахва
-peek()-връща най-горния елемент без да го премахва
-size()-бръща броя на елементите в стека
-clear()-премахва всички елементи
-contains(T)-проверява дали елемента се съдържа в стека
-toArray()-връща масив с елементите от стека

---------------
public class Main {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("1. Ivan");
        stack.push("2. Ivaylo");
        stack.push("3. Nikola");
        stack.push("4. Nelly");
        System.out.println("Top = " + stack
        .peek());
        while(stack.size() > 0){
            String personName = stack.pop();
            System.out.println(personName);
        }

    }
}

--------------

Проверка за съответстващи скоби

public class Main {

    public static void main(String[] args) {
        String task = "1+(2*3+(4+5)*4 - ((2-1)+(1-1)))";
        Stack<Integer> stack = new Stack<Integer>();
        boolean correctBrackets = true;

        for(int index = 0; index < task.length(); index++){
            char ch = task.charAt(index);
            if (ch == '('){
                stack.push(index);
            }
            else if (ch == ')'){
                if (stack.isEmpty()){
                    correctBrackets = false;
                    break;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty())
            correctBrackets= false;
        System.out.println("Are the brackets correct? " + correctBrackets);

    }
}
