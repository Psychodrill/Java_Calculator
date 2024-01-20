package viewmodel;
import interfaces.*;
import model.Calculation;

public class CalculationConsoleView implements Publisher<Integer> {

    private final Calculation calc;
    private Integer result;

    public CalculationConsoleView(Calculation calc) {
        this.calc=calc;
    }

    @Override
    public void getResult(Listener<Integer> listener) {
        sendData(listener.getOperation(), listener.getFirstNumber(), listener.getSecondNumber());
        listener.showResult(result);
    }

    public void sendData(char operation, Integer firtsNumber, Integer secondNumber) {

        result= calc.calculate(operation, firtsNumber,secondNumber);
    }
    
}
