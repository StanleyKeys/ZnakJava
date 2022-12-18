package OOP_Seminar03;

//#region
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//#endregion

public class AppUI {
    public static void main(String[] args) {
        // new Form();

        new Form1(true);
    }
}

class UIComponent {

}

class Frame extends UIComponent {

}

class Form extends Frame {
    Button btn = new Button();

    public Form() {
        this.btn.addActionListener(new GoodbyeWorldAction());
        this.btn.click();

        this.btn.addActionListener(new HelloWorldAction());
        this.btn.click();
    }
}

class Button extends UIComponent {
    ButtonActionListener action;

    public void addActionListener(ButtonActionListener action) {
        this.action = action;
    }

    public void click() {
        action.actionPerformed();
    }
}

interface ButtonActionListener {
    public void actionPerformed();
}

class HelloWorldAction implements ButtonActionListener {

    @Override
    public void actionPerformed() {
        System.out.println("HelloWorldAction");
    }

}

class GoodbyeWorldAction implements ButtonActionListener {

    @Override
    public void actionPerformed() {
        System.out.println("GoodbyeWorldAction");
    }

}

// #region

class Form1 extends JFrame {
    private JButton btn = new JButton("bye");

    public Form1(boolean visible) {
        super("button1");
        this.setBounds(0, 0, 200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container co = this.getContentPane();
        btn.addActionListener(new HelloWorldClick());
        // btn.addActionListener(new GoodbyeWorldClick());
        co.add(btn);
        super.setVisible(visible);

    }

    class HelloWorldClick implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String msg = "HelloWorldClick";
            JOptionPane.showMessageDialog(null, msg, "привет", WIDTH);
        }
    }

    class GoodbyeWorldClick implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String msg = "GoodbyeWorldClick";
            JOptionPane.showMessageDialog(null, msg, "че каво", WIDTH);
        }
    }
}
// #endregion