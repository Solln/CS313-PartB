import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Darren on 03/11/2016.
 */
public class LiveThreads {

    public static void main(String[] args){

        ArrayList<String> threadText;

        ThreadGetter newThreadGetter = new ThreadGetter();

        threadText = newThreadGetter.getThreads();

        initializeFrame(threadText);

    }

    private static void initializeFrame(ArrayList<String> threadText){

        JPanel panel1 = new JPanel();

        panel1.setVisible(true);

        JFrame frame = new JFrame();

        frame.setLayout(new FlowLayout(FlowLayout.CENTER)); // <-- you need this for now

        Box box = Box.createVerticalBox();
        frame.add(box);

        for (String text : threadText){
            JLabel label = new JLabel(text);
            box.add( label );
        }

        frame.setVisible(true);


        // optional, but nice to have.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }


}
