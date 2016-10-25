import java.util.Scanner;
import java.util.Set;

/**
 * Created by Darren on 13/10/2016.
 */
public class Driver {

    public static void main(String[] args) {

        DummyGroups dummy = new DummyGroups();

        ThreadGroup rootGroup = Thread.currentThread().getThreadGroup();
        ThreadGroup parent;
        while ((parent = rootGroup.getParent()) != null) {
            rootGroup = parent;
        }

        listThreads(rootGroup, "");

    }


    // Walk up all the way to the root thread group


    // List all threads and recursively list all subgroup
    public static void listThreads(ThreadGroup group, String indent) {

        System.out.println("\n");
        System.out.println(indent + "Group [Name: " + group.getName() + "]");
        int nt = group.activeCount();
        Thread[] threads = new Thread[nt * 2];
        nt = group.enumerate(threads, false);


        // List every thread in the group
        for (int i = 0; i < nt; i++) {
            Thread t = threads[i];
            System.out.println(indent + "  Thread [Name: " + t.getName() + "] [ID: " + t.getId() + "] [State: " + t.getState() + "] [IsDaemon?: " + t.isDaemon() + "]");
        }

        // Recursively list all subgroups
        int ng = group.activeGroupCount();
        ThreadGroup[] groups = new ThreadGroup[ng * 2];
        ng = group.enumerate(groups, false);

        for (int i = 0; i < ng; i++) {
            listThreads(groups[i], indent + "  ");
        }


    }
}

