import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame mainWindow = new JFrame();
        mainWindow.setLayout(null);
        
        TextPart tp = new TextPart();
        mainWindow.add(tp.GetTextField());
        ButtonPart bp = new ButtonPart();
        mainWindow.add(bp.GetButtonPart());
        ActionHandler ah = new ActionHandler(tp, bp);
        ah.AddListenersToButtons();

        mainWindow.setTitle("COMP152 Calculator");
        mainWindow.setSize(300, 370);
        mainWindow.setVisible(true);
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setResizable(false);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
