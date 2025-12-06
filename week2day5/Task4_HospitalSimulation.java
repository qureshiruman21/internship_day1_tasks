import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Task4_HospitalSimulation {
    public static void main(String[] args) {

        // Fail-Fast doctor list
        ArrayList<String> doctors = new ArrayList<>();
        doctors.add("Dr. A");
        doctors.add("Dr. B");

        // Fail-Safe live update list
        CopyOnWriteArrayList<String> liveDoctors = new CopyOnWriteArrayList<>();
        liveDoctors.add("Dr. A");
        liveDoctors.add("Dr. B");

        System.out.println("FAIL-FAST (ArrayList):");
        try {
            for (String d : doctors) {
                System.out.println(d);
                doctors.add("Dr. Emergency"); //  causes exception
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        System.out.println("\nFAIL-SAFE (CopyOnWriteArrayList):");
        for (String d : liveDoctors) {
            System.out.println(d);
            liveDoctors.add("Dr. Emergency"); //  allowed
        }

        System.out.println("Final live list: " + liveDoctors);
    }
}