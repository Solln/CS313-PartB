import java.util.Scanner;
import java.util.Set;

/**
 * Created by Darren on 13/10/2016.
 */
public class Driver {

    public static void main(String[] args) {

        DummyGroups dummy = new DummyGroups();


        while (true) {

            displayThreads();

            System.out.println("Press Enter to Refresh, else Exit");

            Scanner scan = new Scanner(System.in);
            String splash = scan.nextLine();
            if (splash.equals("exit")) {
                break;
            }


        }
    }

    private static void displayThreads() {

        Set<Thread> threadSet = Thread.getAllStackTraces().keySet();

        Thread[] threadArray = threadSet.toArray(new Thread[threadSet.size()]);

        for (Thread t : threadArray) {

            System.out.println("Name: " + t.getName() + ", ID: " + t.getId() + ", State: " + t.getState() + ", IsDaemon?: " + t.isDaemon());


        }

    }

}

