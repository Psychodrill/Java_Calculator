import model.Calculation;
import view.ConsoleView;
import viewmodel.CalculationConsoleView;
import interfaces.*;

public class Application {
 
    public void run(){

        Calculation calc = new Calculation();
        Publisher<Integer> calcConsView= new CalculationConsoleView(calc);
        ConsoleView consView = new ConsoleView(calcConsView);
        consView.run();

    }
}
