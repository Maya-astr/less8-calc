package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindow extends JFrame implements WindowListener, ActionListener {
    private TextField f = new TextField();

    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b0 = new JButton("0");

    JButton result = new JButton("=");

    JButton Del = new JButton("C");

    JButton sum = new JButton("+");
    JButton minus = new JButton("-");
    JButton multiply = new JButton("*");
    JButton divis = new JButton("/");


    private String text = "";

    private int a = 0;
    private int b = 0;
    private char z;


    public MyWindow(){
        Font ex = new Font("Algerian",Font.BOLD, 40);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(415,480);
        setVisible(true);
        setLocation(500,340);
        f.setSize(350,50);
        f.setLocation(25,25);
        f.setFont(ex);
        f.setVisible(true);
        add(f);
           //=
        result.setFont(ex);
        result.setSize(60,200);
        result.setLocation(315,195);
        result.setVisible(true);
        add(result);

          //+
        sum.setFont(ex);
        sum.setSize(60,60);
        sum.setLocation(245,125);
        sum.setVisible(true);
        add(sum);
        //-
        minus.setFont(ex);
        minus.setSize(60,60);
        minus.setLocation(245,195);
        minus.setVisible(true);
        add(minus);
        //*
        multiply.setFont(ex);
        multiply.setSize(60,60);
        multiply.setLocation(245,265);
        multiply.setVisible(true);
        add(multiply);
          //   /
        divis.setFont(ex);
        divis.setSize(60,60);
        divis.setLocation(245,335);
        divis.setVisible(true);
        add(divis);

          // С-удаление строки символов
        Del.setFont(ex);
        Del.setSize(60,60);
        Del.setLocation(315,125);
        Del.setVisible(true);
        add(Del);
        // кнопки от 0 до 9

        b0.setFont(ex);
        b0.setSize(200,60);
        b0.setLocation(25,335);
        b0.setVisible(true);
        add(b0);
        b1.setFont(ex);
        b1.setSize(60,60);
        b1.setLocation(25,265);
        b1.setVisible(true);
        add(b1);
        b2.setFont(ex);
        b2.setSize(60,60);
        b2.setLocation(95,265);
        b2.setVisible(true);
        add(b2);
        b3.setFont(ex);
        b3.setSize(60,60);
        b3.setLocation(165,265);
        b3.setVisible(true);
        add(b3);
        b4.setFont(ex);
        b4.setSize(60,60);
        b4.setLocation(25,195);
        b4.setVisible(true);
        add(b4);
        b5.setFont(ex);
        b5.setSize(60,60);
        b5.setLocation(95,195);
        b5.setVisible(true);
        add(b5);
        b6.setFont(ex);
        b6.setSize(60,60);
        b6.setLocation(165,195);
        b6.setVisible(true);
        add(b6);
        b7.setFont(ex);
        b7.setSize(60,60);
        b7.setLocation(25,125);
        b7.setVisible(true);
        add(b7);
        b8.setFont(ex);
        b8.setSize(60,60);
        b8.setLocation(95,125);
        b8.setVisible(true);
        add(b8);
        b9.setFont(ex);
        b9.setSize(60,60);
        b9.setLocation(165,125);
        b9.setVisible(true);
        add(b9);

        // обработка событий при нажатии на кнопку


        Del.addActionListener(this);
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        sum.addActionListener(this);
        minus.addActionListener(this);
        multiply.addActionListener(this);
        divis.addActionListener(this);

        result.addActionListener(this);
    }
    @Override
    // произведение операции в зависимости от нажатого действия
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1) {
            text = text + b1.getText();
           f.setText(text);
        }
        if (e.getSource()==b2) {
            text = text + b2.getText();
            f.setText(text);
        }
        if (e.getSource()==b3) {
            text = text + b3.getText();
            f.setText(text);
        }
        if (e.getSource()==b4) {
            text = text + b4.getText();
            f.setText(text);
        }
        if (e.getSource()==b5) {
            text = text + b5.getText();
            f.setText(text);
        }
        if (e.getSource()==b6) {
            text = text + b6.getText();
            f.setText(text);
        }
        if (e.getSource()==b7) {
            text = text + b7.getText();
            f.setText(text);
        }
        if (e.getSource()==b8) {
            text = text + b8.getText();
            f.setText(text);
        }
        if (e.getSource()==b9) {
            text = text + b9.getText();
            f.setText(text);
        }
        if (e.getSource()==b0) {
            text = text + b0.getText();
            f.setText(text);
        }
        if (e.getSource()==Del) {
            text = "";
            f.setText(text);
        }
        // описание операций
        if (e.getSource()==sum) {
            a = Integer.parseInt(text);
            f.setText(text + sum.getText());
            text = "";
            z = '+';
        }
        if (e.getSource()==minus) {
            a = Integer.parseInt(text);
            f.setText(text + minus.getText());
            text = "";
            z = '-';
        }
        if (e.getSource()==multiply) {
            a = Integer.parseInt(text);
            f.setText(text + multiply.getText());
            text = "";
            z = '*';
        }
        if (e.getSource()==divis) {
            a = Integer.parseInt(text);
            f.setText(text + divis.getText());
            text = "";
            z = '/';
        }
        // производим вычисление

        if (e.getSource()==result) {
            if (z == '+'){
                b = Integer.parseInt(text);
                f.setText(String.valueOf(a + b));
            }
            if (z == '-'){
                b = Integer.parseInt(text);
                f.setText(String.valueOf(a - b));
            }
            if (z == '*'){
                b = Integer.parseInt(text);
                f.setText(String.valueOf(a * b));
            }
            if (z == '/'){
                b = Integer.parseInt(text);
                f.setText(String.valueOf(a / b));
            }
        }
    }
    @Override
    public void windowOpened(WindowEvent e) {
    }
    @Override
    public void windowClosing(WindowEvent e) {
    }
    @Override
    public void windowClosed(WindowEvent e) {
    }
    @Override
    public void windowIconified(WindowEvent e) {
    }
    @Override
    public void windowDeiconified(WindowEvent e) {
    }
    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}
