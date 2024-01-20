package interfaces;
public interface Listener<Integer> {
    
    void showResult(Integer result);
    Character getOperation();
    Integer getFirstNumber();
    Integer getSecondNumber();
}
