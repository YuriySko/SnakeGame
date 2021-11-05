import javax.swing.*;

public class MainWindows extends JFrame {
    public MainWindows(){
        // конструктор класса
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(350,372);
        setLocation(450,250);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindows wm = new MainWindows();
    }
}
