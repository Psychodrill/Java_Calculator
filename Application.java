import model.Calculation;
import view.ConsoleView;
import viewmodel.CalculationConsoleView;

public class Application {
 
    public void run(){

        Calculation calc = new Calculation();
        CalculationConsoleView calcConsView= new CalculationConsoleView(calc);
        ConsoleView consView = new ConsoleView(calcConsView);

        consView.run();

    }
}
