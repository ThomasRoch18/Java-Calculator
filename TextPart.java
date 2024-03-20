import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class TextPart {
    private JTextField textField;
    private int x, y, w, h;

    public TextPart(){
        this.textField = new JTextField();
        this.x = 8; this.y = 10; this.w = 270; this.h = 70;
        this.textField.setBounds(x, y, w, h);
        this.textField.setBackground(Color.white);
        this.textField.setText("");
        this.textField.setFont(new Font("Arial", Font.BOLD, 50));
        this.textField.setHorizontalAlignment(JTextField.RIGHT);
    }

    public JTextField GetTextField(){
        return this.textField;
    }
}
