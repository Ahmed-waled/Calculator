import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.*;
import java.util.Locale;
import java.util.Stack;

import static java.lang.System.exit;

public class Calculator {
    static private boolean valid = true;
    static private boolean DIVISIONBYZERO = false;
    static private final double EXP = 2.7182818284590452353602874713527;
    static private final double PI = 3.1415926535897932384626433832795;

    Calculator() {
        a0Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == '0') {
                    a0Button();
                }
            }
        });
        a0Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                a0Button();
            }
        });
        a1Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == '1') {
                    a1Button();
                }
            }
        });
        a1Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                a1Button();
            }
        });

        a2Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == '2') {
                    a2Button();
                }
            }
        });
        a2Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                a2Button();
            }
        });

        a3Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == '3') {
                    a3Button();
                }
            }
        });
        a3Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                a3Button();
            }
        });

        a4Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == '4') {
                    a4Button();
                }
            }
        });
        a4Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                a4Button();
            }
        });

        a5Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == '5') {
                    a5Button();
                }
            }
        });
        a5Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                a5Button();
            }
        });

        a6Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == '6') {
                    a6Button();
                }
            }
        });
        a6Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                a6Button();
            }
        });
        a7Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == '7') {
                    a7Button();
                }
            }
        });
        a7Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                a7Button();
            }
        });

        a8Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == '8') {
                    a8Button();
                }
            }
        });
        a8Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                a8Button();
            }
        });

        a9Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == '9') {
                    a9Button();
                }
            }
        });
        a9Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                a9Button();
            }
        });

        plusButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == '+') {
                    plusButton();
                }
            }
        });
        plusButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                plusButton();
            }
        });

        minusButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == '-') {
                    minusButton();
                }
            }
        });
        minusButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                minusButton();
            }
        });
        divideButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == '/') {
                    divideButton();
                }
            }
        });
        divideButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                divideButton();
            }
        });

        multiplyButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == '*') {
                    multiplyButton();
                }
            }
        });
        multiplyButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                multiplyButton();
            }
        });

        powerButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == '^') {
                    powerButton();
                }
            }
        });
        powerButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                powerButton();
            }
        });

        evalButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                    evalButton();
                }
            }
        });
        evalButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                evalButton();
            }
        });

        clearButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_DELETE) {
                    clearButton();
                }
            }
        });
        clearButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clearButton();
            }
        });

        backspaceButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                    backspaceButton();
                }
            }
        });
        backspaceButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                backspaceButton();
            }
        });

        exitButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
                    exitButton();
                }
            }
        });
        exitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                exitButton();
            }
        });

        parenthesisClose.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_RIGHT_PARENTHESIS) {
                    parenthesisClose();
                }
            }
        });
        parenthesisClose.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                parenthesisClose();
            }
        });
        parenthesisOpen.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == '(') {
                    parenthesisOpen();
                }
            }
        });
        parenthesisOpen.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                parenthesisOpen();
            }
        });

        floatPoint.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == '.') {
                    floatPoint();
                }
            }
        });
        floatPoint.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                floatPoint();
            }
        });

        modButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == '%') {
                    modButton();
                }
            }
        });
        modButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                modButton();
            }
        });
        sqrButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 'q') {
                    sqrButton();
                }
            }
        });
        sqrButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                sqrButton();
            }
        });
        expButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 'e') {
                    expButton();
                }
            }
        });
        expButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                expButton();
            }
        });
        piButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 'p') {
                    piButton();
                }
            }
        });
        piButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                piButton();
            }
        });
        logButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 'l') {
                    logButton();
                }
            }
        });
        logButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                logButton();
            }
        });
        lnButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 'n') {
                    lnButton();
                }
            }
        });
        lnButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lnButton();
            }
        });
        pow10Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 'P') {
                    pow10Button();
                }
            }
        });
        pow10Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pow10Button();
            }
        });

        reciprocalButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 'r') {
                    reciprocalButton();
                }
            }
        });
        reciprocalButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                reciprocalButton();
            }
        });

        absButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 'b') {
                    absButton();
                }
            }
        });
        absButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                absButton();
            }
        });
        engNotation.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 'E') {
                    engNotation();
                }
            }
        });
        engNotation.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                engNotation();
            }
        });
        rootButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == '@') {
                    rootButton();
                }
            }
        });
        rootButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                rootButton();
            }
        });


        Calculator.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_0)
                    a0Button();
            }
        });
    }

    public void evalButton() {
        if (!answerLabel.getText().isEmpty()) {
            expressionLbl.setText("");
            answerLabel.setText("");
            return;
        }
        String exp = expressionLbl.getText();
        double rslt = eval(infixToPostfix(exp));
        if (DIVISIONBYZERO) {
            answerLabel.setText("DIVISION BY ZERO");
        } else if (valid)
            answerLabel.setText(rslt == (int) rslt ? Integer.toString((int) rslt) : Double.toString(rslt));
        else
            answerLabel.setText("Invalid Expression");
        valid = true;
        DIVISIONBYZERO = false;
    }

    public void minusButton() {
        if (!answerLabel.getText().isEmpty()) {
            expressionLbl.setText("");
            answerLabel.setText("");
            return;
        }
        String expLbl = expressionLbl.getText();
        if (!expLbl.isEmpty()) {
            char dig = expLbl.charAt(expLbl.length() - 1);
            if (operator(dig) && dig != ')')
                expLbl = expLbl.substring(0, expLbl.length() - 1);
            expressionLbl.setText(expLbl + '-');
        } else
            expressionLbl.setText("-");
    }

    public void multiplyButton() {
        if (!answerLabel.getText().isEmpty()) {
            expressionLbl.setText("");
            answerLabel.setText("");
            return;
        }
        String expLbl = expressionLbl.getText();
        if (!expLbl.isEmpty()) {
            char dig = expLbl.charAt(expLbl.length() - 1);
            if (operator(dig) && dig != ')')
                expLbl = expLbl.substring(0, expLbl.length() - 1);
            expressionLbl.setText(expLbl + '*');
        }
    }

    public void divideButton() {
        if (!answerLabel.getText().isEmpty()) {
            expressionLbl.setText("");
            answerLabel.setText("");
            return;
        }
        String expLbl = expressionLbl.getText();
        if (!expLbl.isEmpty()) {
            char dig = expLbl.charAt(expLbl.length() - 1);
            if (operator(dig) && dig != ')')
                expLbl = expLbl.substring(0, expLbl.length() - 1);
            expressionLbl.setText(expLbl + '/');
        }
    }

    public void a0Button() {
        String prev = !answerLabel.getText().isEmpty() ? "" : expressionLbl.getText();
        expressionLbl.setText(prev + '0');
        answerLabel.setText("");
    }

    public void a1Button() {
        String prev = !answerLabel.getText().isEmpty() ? "" : expressionLbl.getText();
        expressionLbl.setText(prev + '1');
        answerLabel.setText("");
    }

    public void a2Button() {
        String prev = !answerLabel.getText().isEmpty() ? "" : expressionLbl.getText();
        expressionLbl.setText(prev + '2');
        answerLabel.setText("");
    }

    public void a3Button() {
        String prev = !answerLabel.getText().isEmpty() ? "" : expressionLbl.getText();
        expressionLbl.setText(prev + '3');
        answerLabel.setText("");
    }

    public void a4Button() {
        String prev = !answerLabel.getText().isEmpty() ? "" : expressionLbl.getText();
        expressionLbl.setText(prev + '4');
        answerLabel.setText("");
    }

    public void a5Button() {
        String prev = !answerLabel.getText().isEmpty() ? "" : expressionLbl.getText();
        expressionLbl.setText(prev + '5');
        answerLabel.setText("");
    }

    public void a6Button() {
        String prev = !answerLabel.getText().isEmpty() ? "" : expressionLbl.getText();
        expressionLbl.setText(prev + '6');
        answerLabel.setText("");
    }

    public void a7Button() {
        String prev = !answerLabel.getText().isEmpty() ? "" : expressionLbl.getText();
        expressionLbl.setText(prev + '7');
        answerLabel.setText("");
    }

    public void a8Button() {
        String prev = !answerLabel.getText().isEmpty() ? "" : expressionLbl.getText();
        expressionLbl.setText(prev + '8');
        answerLabel.setText("");
    }

    public void a9Button() {
        String prev = !answerLabel.getText().isEmpty() ? "" : expressionLbl.getText();
        expressionLbl.setText(prev + '9');
        answerLabel.setText("");
    }

    public void clearButton() {
        expressionLbl.setText("");
        answerLabel.setText("");
    }

    public void backspaceButton() {
        if (!answerLabel.getText().isEmpty()) {
            expressionLbl.setText("");
            answerLabel.setText("");
            return;
        }
        String exp = expressionLbl.getText();
        if (!exp.isEmpty())
            expressionLbl.setText(exp.substring(0, exp.length() - 1));
    }

    public void exitButton() {
        exit(0);
    }

    public void plusButton() {
        if (!answerLabel.getText().isEmpty()) {
            answerLabel.setText("");
            expressionLbl.setText("");
            return;
        }
        String expLbl = expressionLbl.getText();
        if (!expLbl.isEmpty()) {
            char dig = expLbl.charAt(expLbl.length() - 1);
            if (operator(dig) && dig != ')')
                expLbl = expLbl.substring(0, expLbl.length() - 1);
            expressionLbl.setText(expLbl + '+');
        }
    }

    public void powerButton() {
        if (!answerLabel.getText().isEmpty()) {
            expressionLbl.setText("");
            answerLabel.setText("");
            return;
        }
        String expLbl = expressionLbl.getText();
        if (!expLbl.isEmpty()) {
            char dig = expLbl.charAt(expLbl.length() - 1);
            if (operator(dig) && dig != ')')
                expLbl = expLbl.substring(0, expLbl.length() - 1);
            expressionLbl.setText(expLbl + '^');
        }
    }

    public void parenthesisClose() {
        if (!answerLabel.getText().isEmpty()) {
            expressionLbl.setText("");
            answerLabel.setText("");
            return;
        }
        if (!answerLabel.getText().isEmpty() || !expressionLbl.getText().isEmpty())
            expressionLbl.setText(expressionLbl.getText() + ')');
    }

    public void parenthesisOpen() {
        if (!answerLabel.getText().isEmpty()) {
            expressionLbl.setText("");
            answerLabel.setText("");
            return;
        }
        String prev = !answerLabel.getText().isEmpty() ? "" : expressionLbl.getText();
        if (expressionLbl.getText().isEmpty())
            expressionLbl.setText("(");
        else if (operator(expressionLbl.getText().charAt(expressionLbl.getText().length() - 1)))
            expressionLbl.setText(prev + '(');
        else expressionLbl.setText(prev + '*' + '(');
        answerLabel.setText("");
    }

    public void floatPoint() {
        if (!answerLabel.getText().isEmpty()) {
            expressionLbl.setText("");
            answerLabel.setText("");
            return;
        }
        String exp = expressionLbl.getText();
        if (exp.isEmpty())
            expressionLbl.setText("0.");
        else {
            boolean valid = true;

            for (int i = exp.length() - 1; i > -1; --i)
                if (operator(exp.charAt(i))) {
                    expressionLbl.setText(exp + '.');
                    return;
                } else if (exp.charAt(i) == '.') {
                    valid = false;
                    break;
                }

            if (valid)
                expressionLbl.setText(exp + '.');
        }
    }

    public void modButton() {
        if (!answerLabel.getText().isEmpty()) {
            expressionLbl.setText("");
            answerLabel.setText("");
            return;
        }
        String expLbl = expressionLbl.getText();
        if (answerLabel.getText().isEmpty() && !expLbl.isEmpty()) {
            if (operator(expLbl.charAt(expLbl.length() - 1)))
                expLbl = expLbl.substring(0, expLbl.length() - 1);
            expressionLbl.setText(expLbl + '%');
        }
    }

    public void sqrButton() {
        if (!answerLabel.getText().isEmpty()) {
            expressionLbl.setText("");
            answerLabel.setText("");
            return;
        }
        String expLbl = expressionLbl.getText();
        if (answerLabel.getText().isEmpty() && !expLbl.isEmpty()) {
            char dig = expLbl.charAt(expLbl.length() - 1);
            if (operator(dig) && dig != ')')
                expLbl = expLbl.substring(0, expLbl.length() - 1);
            expressionLbl.setText(expLbl + '^' + '2');
        }
    }

    public void expButton() {
        String exp = expressionLbl.getText();
        if (exp.isEmpty())
            expressionLbl.setText(Double.toString(EXP));
        else if (operator(exp.charAt(exp.length() - 1)))
            expressionLbl.setText(exp + EXP);
        else
            expressionLbl.setText(exp + '*' + EXP);
    }

    public void piButton() {
        String exp = expressionLbl.getText();
        if (exp.isEmpty())
            expressionLbl.setText(Double.toString(PI));
        else if (operator(exp.charAt(exp.length() - 1)))
            expressionLbl.setText(exp + PI);
        else
            expressionLbl.setText(exp + '*' + PI);
    }

    public void logButton() {
        if (answerLabel.getText().isEmpty()) {
            String exp = expressionLbl.getText();
            String value = "";
            for (int i = exp.length() - 1; i > -1; --i) {
                if (operator(exp.charAt(i)))
                    break;
                value += exp.charAt(i);
            }
            if (value.isEmpty())
                value = "0";
            value = new StringBuffer(value).reverse().toString();
            double ans = Math.log(Double.parseDouble(value)) / Math.log(10);

            expressionLbl.setText(expressionLbl.getText().replace(value, Double.toString(ans)));
        } else {
            String exp = expressionLbl.getText();
            double rslt = eval(infixToPostfix(exp));
            if (DIVISIONBYZERO) {
                answerLabel.setText("DIVISION BY ZERO");
            } else if (valid)
                answerLabel.setText(Double.toString(Math.log(rslt) / Math.log(10)));
            else
                answerLabel.setText("Invalid Expression");
            valid = true;
            DIVISIONBYZERO = false;
        }
    }

    public void lnButton() {
        if (answerLabel.getText().isEmpty()) {
            String exp = expressionLbl.getText();
            String value = "";
            for (int i = exp.length() - 1; i > -1; --i) {
                if (operator(exp.charAt(i)))
                    break;
                value += exp.charAt(i);
            }
            if (value.isEmpty())
                value = "0";
            value = new StringBuffer(value).reverse().toString();
            double ans = Math.log(Double.parseDouble(value));

            expressionLbl.setText(expressionLbl.getText().replace(value, Double.toString(ans)));
        } else {
            String exp = expressionLbl.getText();
            double rslt = eval(infixToPostfix(exp));
            if (DIVISIONBYZERO) {
                answerLabel.setText("DIVISION BY ZERO");
            } else if (valid)
                answerLabel.setText(Double.toString(Math.log(rslt)));
            else
                answerLabel.setText("Invalid Expression");
            valid = true;
            DIVISIONBYZERO = false;
        }
    }

    public void pow10Button() {
        if (answerLabel.getText().isEmpty()) {
            String exp = expressionLbl.getText();
            String value = "";
            for (int i = exp.length() - 1; i > -1; --i) {
                if (operator(exp.charAt(i)))
                    break;
                value += exp.charAt(i);
            }
            if (value.isEmpty())
                value = "0";
            value = new StringBuffer(value).reverse().toString();

            expressionLbl.setText(expressionLbl.getText().replace(value, "10^" + value));
        } else
            answerLabel.setText(Double.toString(Math.pow(10, Double.parseDouble(answerLabel.getText()))));
    }

    public void reciprocalButton() {
        if (answerLabel.getText().isEmpty()) {
            String exp = expressionLbl.getText();
            String value = "";
            for (int i = exp.length() - 1; i > -1; --i) {
                if (operator(exp.charAt(i)))
                    break;
                value += exp.charAt(i);
            }
            if (value.isEmpty())
                value = "0";
            value = new StringBuffer(value).reverse().toString();

            expressionLbl.setText(expressionLbl.getText().replace(value, "(1/" + value + ")"));
        } else
            answerLabel.setText(Double.toString(1.0 / Double.parseDouble(answerLabel.getText())));
    }

    public void absButton() {
        if (!answerLabel.getText().isEmpty()) {
            double rslt = Double.parseDouble(answerLabel.getText());
            if (rslt < 0)
                rslt *= -1;
            answerLabel.setText(Double.toString(rslt));
        }
    }

    public void engNotation() {
        if (answerLabel.getText().isEmpty()) {
            String exp = expressionLbl.getText();
            String value = "";
            for (int i = exp.length() - 1; i > -1; --i) {
                if (operator(exp.charAt(i)))
                    break;
                value += exp.charAt(i);
            }
            if (value.isEmpty())
                value = "0";
            value = new StringBuffer(value).reverse().toString();

            expressionLbl.setText(expressionLbl.getText().replace(value, value + "*10^"));
        } else
            answerLabel.setText(Double.toString(Math.pow(10, Double.parseDouble(answerLabel.getText()))));
    }

    public void rootButton() {
        if (answerLabel.getText().isEmpty()) {
            String exp = expressionLbl.getText();
            String value = "";
            for (int i = exp.length() - 1; i > -1; --i) {
                if (operator(exp.charAt(i)))
                    break;
                value += exp.charAt(i);
            }
            if (value.isEmpty())
                value = "0";
            value = new StringBuffer(value).reverse().toString();
            double ans = Math.sqrt(Double.parseDouble(value));

            expressionLbl.setText(expressionLbl.getText().replace(value, Double.toString(ans)));
        } else {
            String exp = expressionLbl.getText();
            double rslt = eval(infixToPostfix(exp));
            if (DIVISIONBYZERO) {
                answerLabel.setText("DIVISION BY ZERO");
            } else if (valid)
                answerLabel.setText(Double.toString(Math.sqrt(rslt)));
            else
                answerLabel.setText("Invalid Expression");
            valid = true;
            DIVISIONBYZERO = false;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JButton evalButton;
    private JButton minusButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton a0Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton clearButton;
    private JButton backspaceButton;
    private JButton exitButton;
    private JButton plusButton;
    private JButton powerButton;
    private JButton parenthesisClose;
    private JButton parenthesisOpen;
    private JButton floatPoint;
    private JButton modButton;
    private JButton sqrButton;
    private JButton expButton;
    private JButton piButton;
    private JButton logButton;
    private JButton lnButton;
    private JButton pow10Button;
    private JButton reciprocalButton;
    private JButton absButton;
    private JButton engNotation;
    private JButton rootButton;
    private JPanel Calculator;
    private JLabel expressionLbl;
    private JLabel answerLabel;


    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        Calculator = new JPanel();
        Calculator.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(9, 5, new Insets(0, 0, 0, 0), -1, -1));
        Font CalculatorFont = this.$$$getFont$$$("Times New Roman", -1, 20, Calculator.getFont());
        if (CalculatorFont != null) Calculator.setFont(CalculatorFont);
        Calculator.setForeground(new Color(-16777216));
        evalButton = new JButton();
        Font evalButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, evalButton.getFont());
        if (evalButtonFont != null) evalButton.setFont(evalButtonFont);
        evalButton.setText("=");
        Calculator.add(evalButton, new com.intellij.uiDesigner.core.GridConstraints(8, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        plusButton = new JButton();
        Font plusButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, plusButton.getFont());
        if (plusButtonFont != null) plusButton.setFont(plusButtonFont);
        plusButton.setText("+");
        Calculator.add(plusButton, new com.intellij.uiDesigner.core.GridConstraints(7, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        minusButton = new JButton();
        Font minusButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, minusButton.getFont());
        if (minusButtonFont != null) minusButton.setFont(minusButtonFont);
        minusButton.setText("-");
        Calculator.add(minusButton, new com.intellij.uiDesigner.core.GridConstraints(6, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a1Button = new JButton();
        Font a1ButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, a1Button.getFont());
        if (a1ButtonFont != null) a1Button.setFont(a1ButtonFont);
        a1Button.setText("1");
        Calculator.add(a1Button, new com.intellij.uiDesigner.core.GridConstraints(7, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(129, 30), null, 0, false));
        a2Button = new JButton();
        Font a2ButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, a2Button.getFont());
        if (a2ButtonFont != null) a2Button.setFont(a2ButtonFont);
        a2Button.setText("2");
        Calculator.add(a2Button, new com.intellij.uiDesigner.core.GridConstraints(7, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a3Button = new JButton();
        Font a3ButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, a3Button.getFont());
        if (a3ButtonFont != null) a3Button.setFont(a3ButtonFont);
        a3Button.setText("3");
        Calculator.add(a3Button, new com.intellij.uiDesigner.core.GridConstraints(7, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a4Button = new JButton();
        Font a4ButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, a4Button.getFont());
        if (a4ButtonFont != null) a4Button.setFont(a4ButtonFont);
        a4Button.setText("4");
        Calculator.add(a4Button, new com.intellij.uiDesigner.core.GridConstraints(6, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(129, 30), null, 0, false));
        a5Button = new JButton();
        Font a5ButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, a5Button.getFont());
        if (a5ButtonFont != null) a5Button.setFont(a5ButtonFont);
        a5Button.setText("5");
        Calculator.add(a5Button, new com.intellij.uiDesigner.core.GridConstraints(6, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a6Button = new JButton();
        Font a6ButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, a6Button.getFont());
        if (a6ButtonFont != null) a6Button.setFont(a6ButtonFont);
        a6Button.setText("6");
        Calculator.add(a6Button, new com.intellij.uiDesigner.core.GridConstraints(6, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        divideButton = new JButton();
        Font divideButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, divideButton.getFont());
        if (divideButtonFont != null) divideButton.setFont(divideButtonFont);
        divideButton.setText("/");
        Calculator.add(divideButton, new com.intellij.uiDesigner.core.GridConstraints(5, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a9Button = new JButton();
        Font a9ButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, a9Button.getFont());
        if (a9ButtonFont != null) a9Button.setFont(a9ButtonFont);
        a9Button.setText("9");
        Calculator.add(a9Button, new com.intellij.uiDesigner.core.GridConstraints(5, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a8Button = new JButton();
        Font a8ButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, a8Button.getFont());
        if (a8ButtonFont != null) a8Button.setFont(a8ButtonFont);
        a8Button.setText("8");
        Calculator.add(a8Button, new com.intellij.uiDesigner.core.GridConstraints(5, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a7Button = new JButton();
        Font a7ButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, a7Button.getFont());
        if (a7ButtonFont != null) a7Button.setFont(a7ButtonFont);
        a7Button.setText("7");
        Calculator.add(a7Button, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(129, 30), null, 0, false));
        clearButton = new JButton();
        Font clearButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, clearButton.getFont());
        if (clearButtonFont != null) clearButton.setFont(clearButtonFont);
        clearButton.setText("Clear");
        Calculator.add(clearButton, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        exitButton = new JButton();
        Font exitButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, exitButton.getFont());
        if (exitButtonFont != null) exitButton.setFont(exitButtonFont);
        exitButton.setText("Exit");
        Calculator.add(exitButton, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(129, 30), null, 0, false));
        backspaceButton = new JButton();
        Font backspaceButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, backspaceButton.getFont());
        if (backspaceButtonFont != null) backspaceButton.setFont(backspaceButtonFont);
        backspaceButton.setText("Backspace");
        Calculator.add(backspaceButton, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        a0Button = new JButton();
        Font a0ButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, a0Button.getFont());
        if (a0ButtonFont != null) a0Button.setFont(a0ButtonFont);
        a0Button.setText("0");
        Calculator.add(a0Button, new com.intellij.uiDesigner.core.GridConstraints(8, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        parenthesisClose = new JButton();
        Font parenthesisCloseFont = this.$$$getFont$$$("Times New Roman", -1, 20, parenthesisClose.getFont());
        if (parenthesisCloseFont != null) parenthesisClose.setFont(parenthesisCloseFont);
        parenthesisClose.setText(")");
        Calculator.add(parenthesisClose, new com.intellij.uiDesigner.core.GridConstraints(4, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        multiplyButton = new JButton();
        Font multiplyButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, multiplyButton.getFont());
        if (multiplyButtonFont != null) multiplyButton.setFont(multiplyButtonFont);
        multiplyButton.setText("*");
        Calculator.add(multiplyButton, new com.intellij.uiDesigner.core.GridConstraints(4, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        powerButton = new JButton();
        Font powerButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, powerButton.getFont());
        if (powerButtonFont != null) powerButton.setFont(powerButtonFont);
        powerButton.setText("^");
        Calculator.add(powerButton, new com.intellij.uiDesigner.core.GridConstraints(2, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        parenthesisOpen = new JButton();
        Font parenthesisOpenFont = this.$$$getFont$$$("Times New Roman", -1, 20, parenthesisOpen.getFont());
        if (parenthesisOpenFont != null) parenthesisOpen.setFont(parenthesisOpenFont);
        parenthesisOpen.setText("(");
        Calculator.add(parenthesisOpen, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        expressionLbl = new JLabel();
        Font expressionLblFont = this.$$$getFont$$$("Times New Roman", -1, 20, expressionLbl.getFont());
        if (expressionLblFont != null) expressionLbl.setFont(expressionLblFont);
        expressionLbl.setText("");
        Calculator.add(expressionLbl, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(33, 55), null, 0, false));
        answerLabel = new JLabel();
        answerLabel.setBackground(new Color(-1));
        Font answerLabelFont = this.$$$getFont$$$("Times New Roman", -1, 20, answerLabel.getFont());
        if (answerLabelFont != null) answerLabel.setFont(answerLabelFont);
        answerLabel.setForeground(new Color(-16777216));
        answerLabel.setText("");
        Calculator.add(answerLabel, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(33, 44), null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setEnabled(true);
        Font label1Font = this.$$$getFont$$$("Times New Roman", -1, 20, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setText("answer:");
        Calculator.add(label1, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(129, 17), null, 0, false));
        modButton = new JButton();
        Font modButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, modButton.getFont());
        if (modButtonFont != null) modButton.setFont(modButtonFont);
        modButton.setText("%");
        Calculator.add(modButton, new com.intellij.uiDesigner.core.GridConstraints(7, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        floatPoint = new JButton();
        Font floatPointFont = this.$$$getFont$$$("Times New Roman", -1, 20, floatPoint.getFont());
        if (floatPointFont != null) floatPoint.setFont(floatPointFont);
        floatPoint.setText(".");
        Calculator.add(floatPoint, new com.intellij.uiDesigner.core.GridConstraints(8, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        sqrButton = new JButton();
        Font sqrButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, sqrButton.getFont());
        if (sqrButtonFont != null) sqrButton.setFont(sqrButtonFont);
        sqrButton.setText("x ^ 2");
        Calculator.add(sqrButton, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        expButton = new JButton();
        Font expButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, expButton.getFont());
        if (expButtonFont != null) expButton.setFont(expButtonFont);
        expButton.setText("e");
        Calculator.add(expButton, new com.intellij.uiDesigner.core.GridConstraints(6, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        piButton = new JButton();
        Font piButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, piButton.getFont());
        if (piButtonFont != null) piButton.setFont(piButtonFont);
        piButton.setText("π");
        Calculator.add(piButton, new com.intellij.uiDesigner.core.GridConstraints(5, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        logButton = new JButton();
        Font logButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, logButton.getFont());
        if (logButtonFont != null) logButton.setFont(logButtonFont);
        logButton.setText("log");
        Calculator.add(logButton, new com.intellij.uiDesigner.core.GridConstraints(4, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lnButton = new JButton();
        Font lnButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, lnButton.getFont());
        if (lnButtonFont != null) lnButton.setFont(lnButtonFont);
        lnButton.setText("ln");
        Calculator.add(lnButton, new com.intellij.uiDesigner.core.GridConstraints(2, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        pow10Button = new JButton();
        Font pow10ButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, pow10Button.getFont());
        if (pow10ButtonFont != null) pow10Button.setFont(pow10ButtonFont);
        pow10Button.setText("10 ^ x");
        Calculator.add(pow10Button, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        reciprocalButton = new JButton();
        Font reciprocalButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, reciprocalButton.getFont());
        if (reciprocalButtonFont != null) reciprocalButton.setFont(reciprocalButtonFont);
        reciprocalButton.setText("1/x");
        Calculator.add(reciprocalButton, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        absButton = new JButton();
        Font absButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, absButton.getFont());
        if (absButtonFont != null) absButton.setFont(absButtonFont);
        absButton.setText("|x|");
        Calculator.add(absButton, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        engNotation = new JButton();
        Font engNotationFont = this.$$$getFont$$$("Times New Roman", -1, 20, engNotation.getFont());
        if (engNotationFont != null) engNotation.setFont(engNotationFont);
        engNotation.setText("exp");
        Calculator.add(engNotation, new com.intellij.uiDesigner.core.GridConstraints(3, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        rootButton = new JButton();
        Font rootButtonFont = this.$$$getFont$$$("Times New Roman", -1, 20, rootButton.getFont());
        if (rootButtonFont != null) rootButton.setFont(rootButtonFont);
        rootButton.setText("√x");
        Calculator.add(rootButton, new com.intellij.uiDesigner.core.GridConstraints(3, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return Calculator;
    }

    public static String infixToPostfix(String exp) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        for (char c : exp.toCharArray()) {
            if (!operator(c)) {
                ans += c;
                continue;
            }
            ans += ' ';
            while (!st.isEmpty()) {
                char tt = st.peek();
                if (c == ')') {
                    tt = st.pop();
                    if (tt == '(')
                        break;
                    ans += tt;
                    ans += ' ';
                    continue;
                }
                if (c == '(' || precedence(c) > precedence(tt))
                    break;

                ans += st.pop();
                ans += ' ';
            }
            if (c != ')')
                st.push(c);
        }
        while (!st.isEmpty()) {
            ans += ' ';
            ans += st.pop();
        }
        return ans;
    }

    public static boolean operator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '%' || c == '(' || c == ')';
    }

    public static int precedence(char c) {
        if (c == '^')
            return 3;
        if (c == '*' || c == '/' || c == '%')
            return 2;
        if (c == '+' || c == '-')
            return 1;
        return 0;
    }

    public static double operation(double a, double b, char op) {
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '%' -> a % b;
            case '^' -> Math.pow(a, b);
            default -> -1;
        };

    }

    public static double eval(String exp) {
        Stack<Double> st = new Stack<>();
        exp += ' ';
        String dig = "";
        for (char c : exp.toCharArray()) {
            if (c != ' ') {
                dig += c;
                continue;
            }
            if (dig.isEmpty())
                continue;
            char op = dig.charAt(0);
            if (operator(op)) {
                if (st.size() < 2) {
                    if (st.size() == 1 && op == '-') {
                        st.push(-st.pop());
                        continue;
                    }
                    valid = false;
                    break;
                }
                // print error
                double b = st.pop();
                double a = st.pop();
                if (b == 0 && (op == '/' || op == '%')) {
                    DIVISIONBYZERO = true;
                    break;
                }
                st.push(operation(a, b, dig.charAt(0)));
                dig = "";
                continue;
            }
            st.push(Double.parseDouble(dig));
            dig = "";
        }
        if (st.empty()) {
            valid = false;
            return 0;
        }
        return st.peek();
    }

}
