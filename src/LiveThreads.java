import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;



/**
 * Created by Darren on 03/11/2016.
 */
public class LiveThreads {

    static JTextArea area = new JTextArea();

    static JScrollPane scroll = new JScrollPane(area);

    public static void main(String[] args){

        DummyGroups dummy = new DummyGroups();

        initializeFrame();

    }

    private static void initializeFrame(){

        JPanel panel1 = new JPanel();

        panel1.setVisible(true);

        JFrame frame = new JFrame();

        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton refresh = new JButton();

        refresh.setText("Refresh");

        frame.setVisible(true);

        refresh.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {

                // Need to remove the previous box

                area.setText("");

                ArrayList<String> newThreadText;

                ThreadGetter newThreadGetter = new ThreadGetter();

                newThreadText = newThreadGetter.getThreads();

                createLabels(newThreadText);

                frame.add(scroll);


            }

        });

        frame.add(refresh);

        refresh.doClick();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }

    private static void createLabels(ArrayList<String> threadText){

        Box box = Box.createVerticalBox();

        for (String text : threadText){

            if (text.contains("Group")){
                area.append("\n");
            }
            area.append(text);
            if (text.contains("Group")){
                area.append("\n");
            }
        }

    }


}
