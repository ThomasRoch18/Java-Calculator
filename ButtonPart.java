import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.util.ArrayList;

public class ButtonPart {
    private JPanel buttonPart;
    private GridLayout gl;
    private ArrayList<JButton> buttonList;

    public ButtonPart(){
        this.buttonPart = new JPanel();
        this.gl = new GridLayout(0, 4);
        this.buttonList = new ArrayList<JButton>();
        this.buttonPart.setLayout(gl);
        this.buttonPart.setBounds(8, 90, 270, 235);
        AddButtonsToButtonPart();
    }

    public ArrayList<JButton> GetButtonArrayList(){
        return this.buttonList;
    }

    public JPanel GetButtonPart(){
        return this.buttonPart;
    }

    private void AddButtonsToButtonPart(){
        JButton C = new JButton("C");
        this.buttonPart.add(C);
        this.buttonList.add(C);

        JButton Divide = new JButton("/");
        this.buttonPart.add(Divide);
        this.buttonList.add(Divide);

        JButton Times = new JButton("*");
        this.buttonPart.add(Times);
        this.buttonList.add(Times);

        JButton Equals = new JButton("=");
        this.buttonPart.add(Equals);
        this.buttonList.add(Equals);

        JButton Seven = new JButton("7");
        this.buttonPart.add(Seven);
        this.buttonList.add(Seven);

        JButton Eight = new JButton("8");
        this.buttonPart.add(Eight);
        this.buttonList.add(Eight);

        JButton Nine = new JButton("9");
        this.buttonPart.add(Nine);
        this.buttonList.add(Nine);

        JButton Plus = new JButton("+");
        this.buttonPart.add(Plus);
        this.buttonList.add(Plus);

        JButton Four = new JButton("4");
        this.buttonPart.add(Four);
        this.buttonList.add(Four);

        JButton Five = new JButton("5");
        this.buttonPart.add(Five);
        this.buttonList.add(Five);

        JButton Six = new JButton("6");
        this.buttonPart.add(Six);
        this.buttonList.add(Six);

        JButton Minus = new JButton("-");
        this.buttonPart.add(Minus);
        this.buttonList.add(Minus);

        JButton One = new JButton("1");
        this.buttonPart.add(One);
        this.buttonList.add(One);

        JButton Two = new JButton("2");
        this.buttonPart.add(Two);
        this.buttonList.add(Two);

        JButton Three = new JButton("3");
        this.buttonPart.add(Three);
        this.buttonList.add(Three);

        JButton Zero = new JButton("0");
        this.buttonPart.add(Zero);
        this.buttonList.add(Zero);

        }

}
