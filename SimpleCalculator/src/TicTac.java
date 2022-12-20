import java.awt.*;
import java.awt.event.*;

public class TicTac implements WindowListener, ActionListener {

    private Frame f;
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private TextField tf;

    private char[][] matrix = new char[3][3];
    public void initMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = 'n'; // null
            }
        }
    }

    private char northCheck() {
        char x = 'n';
        int f1=0, f2=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int index = 0; index < matrix.length; index++) {
                if ( i == 0 && matrix[i][index] == 'o' ) {
                    f1++;
                    x = 'o';
                } else if ( i == 0 && matrix[i][index] == 'x' ) {
                    f2++;
                    x = 'x';
                }
            }
        }
        if (f1==3 && x=='o') return 'o';
        else if (f2==3 && x=='x') return 'x';
        else {
            x='n';
            return x;
        }
    }

    private char southCheck() {
        char x = 'n';
        int f1=0, f2=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int index = 0; index < matrix.length; index++) {
                if ( i == matrix.length-1 && matrix[i][index] == 'o' ) {
                    f1++;
                    x = 'o';
                } else if ( i == matrix.length-1 && matrix[i][index] == 'x' ) {
                    f2++;
                    x = 'x';
                }
            }
        }
        if (f1==3 && x=='o') return 'o';
        else if (f2==3 && x=='x') return 'x';
        else {
            x='n';
            return x;
        }
    }

    private char westCheck() {
        char x = 'n';
        int f1=0, f2=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int index = 0; index < matrix.length; index++) {
                if ( index == 0 && matrix[i][index] == 'o' ) {
                    f1++;
                    x = 'o';
                } else if ( index == 0 && matrix[i][index] == 'x' ) {
                    f2++;
                    x = 'x';
                }
            }
        }
        if (f1==3 && x=='o') return 'o';
        else if (f2==3 && x=='x') return 'x';
        else {
            x='n';
            return x;
        }
    }

    private char eastCheck() {
        char x = 'n';
        int f1=0, f2=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int index = 0; index < matrix.length; index++) {
                if ( index == matrix.length-1 && matrix[i][index] == 'o' ) {
                    f1++;
                    x = 'o';
                } else if ( index == matrix.length-1 && matrix[i][index] == 'x' ) {
                    f2++;
                    x = 'x';
                }
            }
        }
        if (f1==3 && x=='o') return 'o';
        else if (f2==3 && x=='x') return 'x';
        else {
            x='n';
            return x;
        }
    }

    private char verticalCheck() {
        char x = 'n';
        int f1=0, f2=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int index = 0; index < matrix.length; index++) {
                if ( i == 1 && matrix[i][index] == 'o' ) {
                    f1++;
                    x = 'o';
                } else if ( i == 1 && matrix[i][index] == 'x' ) {
                    f2++;
                    x = 'x';
                }
            }
        }
        if (f1==3 && x=='o') return 'o';
        else if (f2==3 && x=='x') return 'x';
        else {
            x='n';
            return x;
        }
    }

    private char horizontalCheck() {
        char x = 'n';
        int f1=0, f2=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int index = 0; index < matrix.length; index++) {
                if ( index == 1 && matrix[i][index] == 'o' ) {
                    f1++;
                    x = 'o';
                } else if ( index == 1 && matrix[i][index] == 'x' ) {
                    f2++;
                    x = 'x';
                }
            }
        }
        if (f1==3 && x=='o') return 'o';
        else if (f2==3 && x=='x') return 'x';
        else {
            x='n';
            return x;
        }
    }

    private char diagonalCheck() {
        char x = 'n';
        int f1=0, f2=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int index = 0; index < matrix.length; index++) {
                if ( i == index && matrix[i][index] == 'o' ) {
                    f1++;
                    x = 'o';
                } else if ( i == index && matrix[i][index] == 'x' ) {
                    f2++;
                    x = 'x';
                }
            }
        }
        if (f1==3 && x=='o') return 'o';
        else if (f2==3 && x=='x') return 'x';
        else {
            x='n';
            return x;
        }
    }

    private char revDiagonalCheck() {
        char x = 'n';
        int f1=0, f2=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int index = 0; index < matrix.length; index++) {
                if ( ((i+index) == matrix.length-1) && matrix[i][index] == 'o' ) {
                    f1++;
                    x = 'o';
                } else if ( ((i+index) == matrix.length-1)  && matrix[i][index] == 'x' ) {
                    f2++;
                    x = 'x';
                }
            }
        }
        if (f1==3 && x=='o') return 'o';
        else if (f2==3 && x=='x') return 'x';
        else {
            x='n';
            return x;
        }
    }

    private String checkWinner() {
        String msg = "";
        if ( diagonalCheck()=='o' || revDiagonalCheck()=='o' || 
            northCheck()=='o' || southCheck()=='o' || westCheck()=='o' ||
            eastCheck()=='o' || verticalCheck()=='o' || horizontalCheck()=='o' )  
        {
            msg = "Player 1 Wins!";
        } else if (diagonalCheck()=='x' || revDiagonalCheck()=='x' || 
            northCheck()=='x' || southCheck()=='x' || westCheck()=='x' || 
            eastCheck()=='x' || verticalCheck()=='x' || horizontalCheck()=='x') 
        {
            msg = "Player 2 Wins!";
        }
        return msg;
    }

    private void resetColor() {
        b1.setBackground(Color.WHITE);
        b2.setBackground(Color.WHITE);
        b3.setBackground(Color.WHITE);
        b4.setBackground(Color.WHITE);
        b5.setBackground(Color.WHITE);
        b6.setBackground(Color.WHITE);
        b7.setBackground(Color.WHITE);
        b8.setBackground(Color.WHITE);
        b9.setBackground(Color.WHITE);
    }

    private void restart() {
        if (checkWinner()=="Player 2 Wins!" || checkWinner()=="Player 1 Wins!"
                    || checkDraw() == "Match is Draw!" ) {
            initMatrix();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
            resetColor();
        }
    }

    private String checkDraw() {
        boolean flag = true;
        String str = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 'n') {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) return "Match is Draw!";
        else return str;
    }

    public TicTac() {
        f = new Frame("Tic Tac Toe (Player1 vs Player2)");
        b1 = new Button();
        b1.setActionCommand("one");
        b2 = new Button();
        b2.setActionCommand("two");
        b3 = new Button();
        b3.setActionCommand("three");
        b4 = new Button();
        b4.setActionCommand("four");
        b5 = new Button();
        b5.setActionCommand("five");
        b6 = new Button();
        b6.setActionCommand("six");
        b7 = new Button();
        b7.setActionCommand("seven");
        b8 = new Button();
        b8.setActionCommand("eight");
        b9 = new Button();
        b9.setActionCommand("nine");
        tf = new TextField(100);
    }

    public void launchFrame() {

        // button setup
        b1.addActionListener(this);
        b1.setBackground(Color.WHITE);
        b2.addActionListener(this);
        b2.setBackground(Color.WHITE);
        b3.addActionListener(this);
        b3.setBackground(Color.WHITE);
        b4.addActionListener(this);
        b4.setBackground(Color.WHITE);
        b5.addActionListener(this);
        b5.setBackground(Color.WHITE);
        b6.addActionListener(this);
        b6.setBackground(Color.WHITE);
        b7.addActionListener(this);
        b7.setBackground(Color.WHITE);
        b8.addActionListener(this);
        b8.setBackground(Color.WHITE);
        b9.addActionListener(this);
        b9.setBackground(Color.WHITE);

        // frame setup
        f.setLayout(new GridLayout(4,3));
        f.setLocation(550,150);
        f.addWindowListener(this);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(tf);
        f.setSize(720, 900);
        f.setVisible(true);
    }

    private boolean player1 = true, player2 = false;
    public void actionPerformed(ActionEvent act) {

        if (player1 && act.getActionCommand()=="one" && matrix[0][0] == 'n') {
            b1.setBackground(Color.RED);
            player1 = !player1;
            player2 = !player2;
            matrix[0][0] = 'o';
            tf.setText(checkWinner() + checkDraw());
            restart();
        } else if (player2 && act.getActionCommand()=="one" && matrix[0][0] == 'n') {
            b1.setBackground(Color.GREEN);
            player1 = !player1;
            player2 = !player2;
            matrix[0][0] = 'x';
            tf.setText(checkWinner() + checkDraw());
            restart();
        }
        else if (player1 && act.getActionCommand()=="two" && matrix[0][1] == 'n') {
            b2.setBackground(Color.RED);
            player1 = !player1;
            player2 = !player2;
            matrix[0][1] = 'o';
            tf.setText(checkWinner() + checkDraw());
            restart();
        } else if (player2 && act.getActionCommand()=="two" && matrix[0][1] == 'n') {
            b2.setBackground(Color.GREEN);
            player1 = !player1;
            player2 = !player2;
            matrix[0][1] = 'x';
            tf.setText(checkWinner() + checkDraw());
            restart();
        }
        else if (player1 && act.getActionCommand()=="three" && matrix[0][2] == 'n') {
            b3.setBackground(Color.RED);
            player1 = !player1;
            player2 = !player2;
            matrix[0][2] = 'o';
            tf.setText(checkWinner() + checkDraw());
            restart();
        } else if (player2 && act.getActionCommand()=="three" && matrix[0][2] == 'n') {
            b3.setBackground(Color.GREEN);
            player1 = !player1;
            player2 = !player2;
            matrix[0][2] = 'x';
            tf.setText(checkWinner() + checkDraw());
            restart();
        }
        else if (player1 && act.getActionCommand()=="four" && matrix[1][0] == 'n') {
            b4.setBackground(Color.RED);
            player1 = !player1;
            player2 = !player2;
            matrix[1][0] = 'o';
            tf.setText(checkWinner() + checkDraw());
            restart();
        } else if (player2 && act.getActionCommand()=="four" && matrix[1][0] == 'n') {
            b4.setBackground(Color.GREEN);
            player1 = !player1;
            player2 = !player2;
            matrix[1][0] = 'x';
            tf.setText(checkWinner() + checkDraw());
            restart();
        }
        else if (player1 && act.getActionCommand()=="five" && matrix[1][1] == 'n') {
            b5.setBackground(Color.RED);
            player1 = !player1;
            player2 = !player2;
            matrix[1][1] = 'o';
            tf.setText(checkWinner() + checkDraw());
            restart();
        } else if (player2 && act.getActionCommand()=="five" && matrix[1][1] == 'n') {
            b5.setBackground(Color.GREEN);
            player1 = !player1;
            player2 = !player2;
            matrix[1][1] = 'x';
            tf.setText(checkWinner() + checkDraw());
            restart();
        }
        else if (player1 && act.getActionCommand()=="six" && matrix[1][2] == 'n') {
            b6.setBackground(Color.RED);
            player1 = !player1;
            player2 = !player2;
            matrix[1][2] = 'o';
            tf.setText(checkWinner() + checkDraw());
            restart();
        } else if (player2 && act.getActionCommand()=="six" && matrix[1][2] == 'n') {
            b6.setBackground(Color.GREEN);
            player1 = !player1;
            player2 = !player2;
            matrix[1][2] = 'x';
            tf.setText(checkWinner() + checkDraw());
            restart();
        }
        else if (player1 && act.getActionCommand()=="seven"  && matrix[2][0] == 'n') {
            b7.setBackground(Color.RED);
            player1 = !player1;
            player2 = !player2;
            matrix[2][0] = 'o';
            tf.setText(checkWinner() + checkDraw());
            restart();
        } else if (player2 && act.getActionCommand()=="seven"  && matrix[2][0] == 'n') {
            b7.setBackground(Color.GREEN);
            player1 = !player1;
            player2 = !player2;
            matrix[2][0] = 'x';
            tf.setText(checkWinner() + checkDraw());
            restart();
        } else if (player1 && act.getActionCommand()=="eight"  && matrix[2][1] == 'n') {
            b8.setBackground(Color.RED);
            player1 = !player1;
            player2 = !player2;
            matrix[2][1] = 'o';
            tf.setText(checkWinner() + checkDraw());
            restart();
        } else if (player2 && act.getActionCommand()=="eight"  && matrix[2][1] == 'n') {
            b8.setBackground(Color.GREEN);
            player1 = !player1;
            player2 = !player2;
            matrix[2][1] = 'x';
            tf.setText(checkWinner() + checkDraw());
            restart();
        }
        else if (player1 && act.getActionCommand()=="nine" && matrix[2][2] == 'n') {
            b9.setBackground(Color.RED);
            player1 = !player1;
            player2 = !player2;
            matrix[2][2] = 'o';
            tf.setText(checkWinner() + checkDraw());
            restart();
        } else if (player2 && act.getActionCommand()=="nine"  && matrix[2][2] == 'n') {
            b9.setBackground(Color.GREEN);
            player1 = !player1;
            player2 = !player2;
            matrix[2][2] = 'x';
            tf.setText(checkWinner() + checkDraw());
            restart();
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
        TicTac tictac = new TicTac();
        tictac.initMatrix();
        tictac.launchFrame();
    }
}
