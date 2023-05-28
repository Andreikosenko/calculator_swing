package compony;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class calculator {
    public static class window extends JFrame implements WindowListener, ActionListener {
        private TextField f = new TextField();
        private JButton b0 = new JButton("0");
        private JButton b1 = new JButton("1");
        private JButton b2 = new JButton("2");
        private JButton b3 = new JButton("3");
        private JButton b4 = new JButton("4");
        private JButton b5 = new JButton("5");
        private JButton b6 = new JButton("6");
        private JButton b7 = new JButton("7");
        private JButton b8 = new JButton("8");
        private JButton b9 = new JButton("9");
        private JButton Del = new JButton("C");
        private JButton result = new JButton("=");
        private JButton ad = new JButton("+");
        private JButton sub = new JButton("-");
        private JButton cancel = new JButton("D");

        private JButton eqw = new JButton("*");
        private JButton div = new JButton("/");
        private JButton sq = new JButton("sqrt");
        private JButton change = new JButton("+/-");

        private String text ="";
        private int a =0;
        private int b = 0;

        private char z;
        public window () {
            Font ex = new Font("Impact",Font.BOLD, 40);
            setLayout(null);
            setSize(400, 600);
            setVisible(true);
            setLocation(700, 250);

            f.setFont(ex);
            f.setSize(330, 60);
            f.setLocation(25, 25);
            f.setVisible(true);
            add(f);

            result.setFont(ex);
            result.setSize(65, 155);
            result.setLocation(265, 385);
            result.setVisible(true);
            result.addActionListener(this);
            add(result);

            ad.setFont(ex);
            ad.setSize(60, 60);
            ad.setLocation(25, 145);
            ad.setVisible(true);
            ad.addActionListener(this);
            add(ad);

            sub.setFont(ex);
            sub.setSize(60, 60);
            sub.setLocation(105, 145);
            sub.setVisible(true);
            sub.addActionListener(this);
            add(sub);

            Del.setFont(ex);
            Del.setSize(60, 60);
            Del.setLocation(265, 225);
            Del.setVisible(true);
            Del.addActionListener(this);
            add(Del);


           cancel.setFont(ex);
           cancel.setSize(60, 60);
           cancel.setLocation(265, 305);
           cancel.setVisible(true);
           cancel.addActionListener(this);
           add(cancel);


            b0.setFont(ex);
            b0.setSize(60, 60);
            b0.setLocation(105, 465);
            b0.setVisible(true);
            add(b0);

            b1.setFont(ex);
            b1.setSize(60, 60);
            b1.setLocation(185, 385);
            b1.setVisible(true);
            add(b1);

            b2.setFont(ex);
            b2.setSize(60, 60);
            b2.setLocation(108, 385);
            b2.setVisible(true);
            add(b2);

            b3.setFont(ex);
            b3.setSize(60, 60);
            b3.setLocation(25, 385);
            b3.setVisible(true);
            add(b3);

            b4.setFont(ex);
            b4.setSize(60, 60);
            b4.setLocation(185, 305);
            b4.setVisible(true);
            add(b4);

            b5.setFont(ex);
            b5.setSize(60, 60);
            b5.setLocation(105, 305);
            b5.setVisible(true);
            add(b5);

            b6.setFont(ex);
            b6.setSize(60, 60);
            b6.setLocation(25, 305);
            b6.setVisible(true);
            add(b6);

            b7.setFont(ex);
            b7.setSize(60, 60);
            b7.setLocation(25, 225);
            b7.setVisible(true);
            add(b7);

            b8.setFont(ex);
            b8.setSize(60, 60);
            b8.setLocation(105, 225);
            b8.setVisible(true);
            add(b8);

            b9.setFont(ex);
            b9.setSize(60, 60);
            b9.setLocation(185, 225);
            b9.setVisible(true);
            add(b9);


            Del.setFont(ex);
            Del.setSize(60, 60);
            Del.setLocation(265, 225);
            Del.setVisible(true);
            add(Del);


            eqw.setFont(ex);
            eqw.setSize(60, 60);
            eqw.setLocation(185, 145);
            eqw.setVisible(true);
            add(eqw);

            div.setFont(ex);
            div.setSize(60, 60);
            div.setLocation(265, 145);
            div.setVisible(true);
            add(div);


            sq.setSize(60, 40);
            sq.setLocation(25, 105);
            sq.setVisible(true);
            add(sq);


            change.setSize(60, 60);
            change.setLocation(25, 465);
            change.setVisible(true);
            add(change);


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
            Del.addActionListener(this);
            eqw.addActionListener(this);
            div.addActionListener(this);
            sq.addActionListener(this);
            change.addActionListener(this);



        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==b0) {
                text = text + b0.getText();
                f.setText(text);
            }

            if(e.getSource()==b1) {
                text = text + b1.getText();
                f.setText(text);
            }
            if(e.getSource()==b2) {
                text = text + b2.getText();
                f.setText(text);
            }
            if(e.getSource()==b3) {
                text = text + b3.getText();
                f.setText(text);
            }
            if(e.getSource()==b4) {
                text = text + b4.getText();
                f.setText(text);
            }
            if(e.getSource()==b5) {
                text = text + b5.getText();
                f.setText(text);
            }
            if(e.getSource()==b6) {
                text = text + b6.getText();
                f.setText(text);
            }
            if(e.getSource()==b7) {
                text = text + b7.getText();
                f.setText(text);
            }
            if(e.getSource()==b8) {
                text = text + b8.getText();
                f.setText(text);
            }
            if(e.getSource()==b9) {
                text = text + b9.getText();
                f.setText(text);
            }


            if(e.getSource()==Del) {
                text = "";
                f.setText(text);
            }

            if(e.getSource()==ad) {
                a = Integer.parseInt(text); // запись числа, которое было в строке
                f.setText(text + ad.getText()); // добавляет плюс
                text = ""; // переменную текс обнуляет
                z = '+';
            }

            if(e.getSource()==sub) {
                a = Integer.parseInt(text);
                f.setText(text + sub.getText());
                text = "";
                z = '-';
            }

            if(e.getSource()==eqw) {
                a = Integer.parseInt(text);
                f.setText(text + eqw.getText());
                text = "";
                z = '*';
            }

            if(e.getSource()==div) {
                a = Integer.parseInt(text);
                f.setText(text + div.getText());
                text = "";
                z = '/';
            }

            if(e.getSource()==sq) {
               double c = Integer.parseInt(f.getText());
               c = Math.sqrt(c);
               f.setText(String.valueOf(c));
               text = String.valueOf(c);
            }

            if(e.getSource()==change) {
                int c = Integer.parseInt(f.getText());
                c = c*-1;
                f.setText(String.valueOf(c));
                text = String.valueOf(c);
            }

            if(e.getSource()==cancel) {
                int c = Integer.parseInt(f.getText()); // на промежуточную переменную запизываем значение текстфилда
                c = c/10;
                f.setText(String.valueOf(c)); // текстфилду возвращаем значение с
                text = String.valueOf(c);
            }
            if (e.getSource() == result) {
                if(z=='+') {
                    b = Integer.parseInt(text); // запись второго числа из текстфилда
                    f.setText(String.valueOf(a+b)); // в тесктфилд установка значения а+б
                }
                if(z=='-') {
                    b = Integer.parseInt(text);
                    f.setText(String.valueOf(a-b));
                }
                if(z=='*') {
                    b = Integer.parseInt(text);
                    f.setText(String.valueOf(a*b));
                }
                if(z=='/') {
                    b = Integer.parseInt(text);
                    f.setText(String.valueOf(a/b));
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
}
