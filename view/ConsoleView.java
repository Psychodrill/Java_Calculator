package view;
import java.util.Scanner;
import interfaces.Publisher;
public class ConsoleView implements interfaces.Listener<Integer>{
    
    private final Publisher<Integer> calcConsView;
    private Character operation;
    private Integer firstNumber;
    private Integer secondNumber;
    public ConsoleView(Publisher<Integer> calcConsView) {
        this.calcConsView = calcConsView;
    }

    public void run(){
       
        while (true) {

            String inputOperation = prompt("Input operation or 'e' for exit: ");
            if(inputOperation.equals("e")){
                return;
            }
            firstNumber = Integer.parseInt(prompt("Input first number: "));
            secondNumber = Integer.parseInt(prompt("Input second number: "));
            operation= inputOperation.charAt(0);
            calcConsView.getResult(this);
        }
    }
    public Character getOperation(){
        return operation;
    }
    public Integer getFirstNumber(){
        return firstNumber;
    }
    public Integer getSecondNumber(){
        return secondNumber;
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    @Override
    public void showResult(Integer result) {
        System.out.printf("Result is %s %n", result);

    }

}
