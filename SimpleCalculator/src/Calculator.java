import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;


public class Calculator implements WindowListener, ActionListener {

    private Frame f;
    private TextField tf;
    private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,eq,clr, add, diff, div, mul;

    public Calculator() {

        f = new Frame("UIU Calculator");
        tf = new TextField(40);

        b0 = new Button("0");
        b0.setActionCommand("zero");
        b1 = new Button("1");
        b1.setActionCommand("one");
        b2 = new Button("2");
        b2.setActionCommand("two");
        b3 = new Button("3");
        b3.setActionCommand("three");
        b4 = new Button("4");
        b4.setActionCommand("four");
        b5 = new Button("5");
        b5.setActionCommand("five");
        b6 = new Button("6");
        b6.setActionCommand("six");
        b7 = new Button("7");
        b7.setActionCommand("seven");
        b8 = new Button("8");
        b8.setActionCommand("eight");
        b9 = new Button("9");
        b9.setActionCommand("nine");

        eq = new Button("=");
        eq.setActionCommand("equal");
        clr = new Button("AC");
        clr.setActionCommand("clear");
        add = new Button("+");
        add.setActionCommand("add");
        diff = new Button("-");
        diff.setActionCommand("diff");
        mul = new Button("*");
        mul.setActionCommand("mul");
        div = new Button("/");
        div.setActionCommand("div");
    }

    public void launchFrame() {

        // button setup
        b0.addActionListener(this);
        b0.setForeground(Color.BLUE);
        b0.setBackground(Color.CYAN);
        b1.addActionListener(this);
        b1.setForeground(Color.BLUE);
        b1.setBackground(Color.CYAN);
        b2.addActionListener(this);
        b2.setForeground(Color.BLUE);
        b2.setBackground(Color.CYAN);
        b3.addActionListener(this);
        b3.setForeground(Color.BLUE);
        b3.setBackground(Color.CYAN);
        b4.addActionListener(this);
        b4.setForeground(Color.BLUE);
        b4.setBackground(Color.CYAN);
        b5.addActionListener(this);
        b5.setForeground(Color.BLUE);
        b5.setBackground(Color.CYAN);
        b6.addActionListener(this);
        b6.setForeground(Color.BLUE);
        b6.setBackground(Color.CYAN);
        b7.addActionListener(this);
        b7.setForeground(Color.BLUE);
        b7.setBackground(Color.CYAN);
        b8.addActionListener(this);
        b8.setForeground(Color.BLUE);
        b8.setBackground(Color.CYAN);
        b9.addActionListener(this);
        b9.setForeground(Color.BLUE);
        b9.setBackground(Color.CYAN);
        
        eq.addActionListener(this);
        eq.setForeground(Color.BLUE);
        eq.setBackground(Color.CYAN);
        clr.addActionListener(this);
        clr.setForeground(Color.BLUE);
        clr.setBackground(Color.CYAN);
        add.addActionListener(this);
        add.setForeground(Color.BLUE);
        add.setBackground(Color.CYAN);
        diff.addActionListener(this);
        diff.setForeground(Color.BLUE);
        diff.setBackground(Color.CYAN);
        mul.addActionListener(this);
        mul.setForeground(Color.BLUE);
        mul.setBackground(Color.CYAN);
        div.addActionListener(this);
        div.setForeground(Color.BLUE);
        div.setBackground(Color.CYAN);


        // frame setup
        f.setLayout(new GridLayout(6,9));
        f.add(b9);
        f.add(b8);
        f.add(b7);
        f.add(b6);
        f.add(b5);
        f.add(b4);
        f.add(b3);
        f.add(b2);
        f.add(b1);
        f.add(b0);

        f.add(add);
        f.add(diff);
        f.add(mul);
        f.add(div);
        f.add(eq);
        f.add(clr);

        f.add(tf, BorderLayout.NORTH);
        
        f.addWindowListener(this);
        f.setSize(720, 1080);
        f.setVisible(true);
    }

    // ----- Operational part ------
    static String str = "";
    public static String eval(String a, String operator, String b) {
        double r = 0;
    
        switch (operator) {
            case "/":
                r += Double.parseDouble(a) / Double.parseDouble(b);
                break;
            case "*":
                r += Double.parseDouble(a) * Double.parseDouble(b);
                break;
            case "-":
                r += Double.parseDouble(a) - Double.parseDouble(b);
                break;
            case "+":
                r += Double.parseDouble(a) + Double.parseDouble(b);
                break;
        }
    
        return Double.toString(r);
    }

    public static String evaluate(String expression) {
        char[] tokens = expression.toCharArray();
        List<String> list = new ArrayList<>();
    
        String s = "";
    
        String operator = "";
        String firstNum = "";
        String secondNum = "";
    
        boolean operationOnQueue = false;
    
        for (int i = 0; i < tokens.length; i++) {
            if (Character.isDigit(tokens[i])) {
                s += Character.toString(tokens[i]);
            } else {
                list.add(s);
                list.add(Character.toString(tokens[i]));
    
                if (operationOnQueue) {
                    operationOnQueue = false;
                    secondNum = s;
    
                    list.set(list.lastIndexOf(firstNum), eval(firstNum, operator, secondNum));
                    list.remove(list.lastIndexOf(operator));
                    list.remove(list.lastIndexOf(secondNum));
                }
    
                if (tokens[i] == '*' || tokens[i] == '/') {
                    operationOnQueue = true;
    
                    operator = Character.toString(tokens[i]);
                    firstNum = list.get(list.lastIndexOf(operator) - 1);
                }
    
                s = "";
            }
    
            if (i == tokens.length - 1 && s.length() > 0) {
                list.add(s);
    
                if (list.get(list.size() - 2).equals("*") || list.get(list.size() - 2).equals("/")) {
                    firstNum = list.get(list.size() - 3);
                    operator = list.get(list.size() - 2);
                    secondNum = list.get(list.size() - 1);
    
                    list.set(list.size() - 3, eval(firstNum, operator, secondNum));
                    list.remove(list.size() - 2);
                    list.remove(list.size() - 1);
                }
            }
        }
    
    
        while (list.size() > 1) {
            firstNum = list.get(0);
            operator = list.get(1);
            secondNum = list.get(2);
    
            list.set(0, eval(firstNum, operator, secondNum));
            list.remove(2);
            list.remove(1);
        }
    
        return list.get(0);
    }


    public void actionPerformed(ActionEvent act) {
        /*
         * One check per button click
         * Kinda works like infinite loop
         */
        if (act.getActionCommand()=="clear") {
            str = "";
            tf.setText(str);
        } else if (act.getActionCommand()=="one"){
            str = str + "1";
            tf.setText(str);
        } else if (act.getActionCommand()=="two"){
            str = str + "2";
            tf.setText(str);
        } else if (act.getActionCommand()=="three"){
            str = str + "3";
            tf.setText(str);
        } else if (act.getActionCommand()=="four"){
            str = str + "4";
            tf.setText(str);
        } else if (act.getActionCommand()=="five"){
            str = str + "5";
            tf.setText(str);
        } else if (act.getActionCommand()=="six"){
            str = str + "6";
            tf.setText(str);
        } else if (act.getActionCommand()=="seven"){
            str = str + "7";
            tf.setText(str);
        } else if (act.getActionCommand()=="eight"){
            str = str + "8";
            tf.setText(str);
        } else if (act.getActionCommand()=="nine"){
            str = str + "9";
            tf.setText(str);
        } else if (act.getActionCommand()=="zero"){
            str = str + "0";
            tf.setText(str);
        } else if (act.getActionCommand()=="add"){
            str = str + "+";
            tf.setText(str);
        } else if (act.getActionCommand()=="diff"){
            str = str + "-";
            tf.setText(str);
        } else if (act.getActionCommand()=="mul"){
            str = str + "*";
            tf.setText(str);
        } else if (act.getActionCommand()=="div"){
            str = str + "/";
            tf.setText(str);
        } else if (act.getActionCommand()=="equal"){ // shows result
            String result = evaluate(str);
            tf.setText(result);
            // str = evaluate(str);
            // tf.setText(str);
        }
    }

    public void windowActivated(WindowEvent arg0) {}
    public void windowClosed(WindowEvent arg0) {}
    public void windowDeactivated(WindowEvent arg0) {}
    public void windowDeiconified(WindowEvent arg0) {}
    public void windowIconified(WindowEvent arg0) {}
    public void windowOpened(WindowEvent arg0) {}
    public void windowClosing(WindowEvent arg0) {
        System.exit(0);
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.launchFrame();
    }
}
