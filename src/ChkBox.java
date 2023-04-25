import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChkBox extends JFrame implements ActionListener {

    JCheckBox bx1, bx2, bx3;
    ButtonGroup bxg = new ButtonGroup();

    public static void main (String [] args){
        new ChkBox();

    }

    public ChkBox(){
        setLayout(new FlowLayout());
        setSize(300, 150);
        setTitle("Learning CheckBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);


        bx1 = new JCheckBox("Green");
        bx1.addActionListener(this);
        bx2 = new JCheckBox("Red");
        bx2.addActionListener(this);
        bx3 = new JCheckBox("Blue");
        bx3.addActionListener(this);

        bxg.add(bx1); bxg.add(bx2);
        bxg.add(bx3);

        add(bx1);
        add(bx2);
        add(bx3);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(bx1.isSelected())
        {
            getContentPane().setBackground(Color.GREEN);

        }
        else if(bx2.isSelected())
        {
            getContentPane().setBackground(Color.RED);
        }
        else if(bx3.isSelected())
        {
            getContentPane().setBackground(Color.BLUE);
        }

    }
}
