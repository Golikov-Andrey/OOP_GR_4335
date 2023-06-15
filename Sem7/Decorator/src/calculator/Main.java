

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        //iCalculable calculator = new Calculator(0);
        iCalculable calculator = new CalcDecorator(new Calculator(0),new Logger());
        ViewCalculator view = new ViewCalculator(calculator);
        view.run();
    }
}
