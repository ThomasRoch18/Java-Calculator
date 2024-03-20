import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.util.ArrayList;

public class ActionHandler {
    private TextPart tp;
    private ButtonPart bp;
    private ArrayList<String> equation;
    private String numbText;
    private String result;
    public ActionHandler(TextPart tp, ButtonPart bp){
        this.tp = tp;
        this.bp= bp;
        this.equation = new ArrayList<String>();
        this.numbText = "";
        this.result = "";
    }

    public void AddListenersToButtons(){
        Listener listener = new Listener();
        for (JButton eachB : bp.GetButtonArrayList()){
            eachB.addActionListener(listener);
        }
    }

    private class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e){
            JButton but = (JButton) e.getSource();
            String butText = but.getText();
            if (butText.equals("C")){
                equation.clear();
                tp.GetTextField().setText("");
                numbText = "";
            }

            else if (butText.equals("=")){
                equation.add(numbText);
                int firstNumb = Integer.parseInt(equation.get(0));
                int secondNumb = Integer.parseInt(equation.get(2));
                String op = equation.get(1);
                //String result = "";
                if (op.equals("+")){
                    result = String.valueOf(firstNumb + secondNumb);
                }
                else if (op.equals("-")){
                    result = String.valueOf(firstNumb - secondNumb);
                }
                else if (op.equals("*")){
                    result = String.valueOf(firstNumb * secondNumb);
                }
                else if (op.equals("/")){
                    result = String.valueOf(firstNumb / secondNumb);
                }
                
                //System.out.println(equation.get(0));
                //System.out.println(equation.get(1));
                //System.out.println(equation.get(2));
                tp.GetTextField().setText(result);
                equation.clear();
                numbText = "";
            }

            else if (butText.equals("+") || butText.equals("-") || butText.equals("*") || butText.equals("/")){
                if (equation.size() == 0 && numbText.isEmpty()){
                    equation.add(result);
                }
                else {
                    equation.add(numbText);
                }
                equation.add(butText);
                String eqSoFar = tp.GetTextField().getText();
                tp.GetTextField().setText(eqSoFar + butText);
                numbText = "";
            }
            
            else{
                //equation.add(butText);
                if (equation.size() == 0 && numbText.isEmpty()){
                    tp.GetTextField().setText("");
                }
                numbText += butText;
                String eqSoFar = tp.GetTextField().getText();
                tp.GetTextField().setText(eqSoFar + butText);
            }
        }
    }
}
