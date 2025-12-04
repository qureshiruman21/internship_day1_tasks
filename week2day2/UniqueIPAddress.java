import java.util.*;

public class UniqueIPAddress {
    public static void main(String[] args) {

        List<String> ips = new ArrayList<>();
        ips.add("192.168.1.1");
        ips.add("10.0.0.2");
        ips.add("192.168.1.1");
        ips.add("172.16.0.3");
        ips.add("10.0.0.2");
        ips.add("192.168.5.10");
        ips.add("172.16.0.3");
        ips.add("8.8.8.8");
        ips.add("10.10.10.10");
        ips.add("8.8.8.8");

        System.out.println("Login Attempts (With Duplicates):");
        System.out.println(ips);

        Set<String> uniqueIPs = new HashSet<>(ips);

        System.out.println("\nUnique IP Addresses:");
        System.out.println(uniqueIPs);
    }
}

