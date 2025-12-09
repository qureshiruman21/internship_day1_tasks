public class Main {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above!");
        }
        System.out.println("Valid age!");
    }

    static void withdraw(int balance) throws InsufficientBalanceException {
        if (balance < 1000) {
            throw new InsufficientBalanceException("Balance is too low!");
        }
        System.out.println("Withdrawal successful!");
    }

    static void login(String user, String pass) throws InvalidLoginException {
        if (!user.equals("admin") || !pass.equals("123")) {
            throw new InvalidLoginException("Invalid username or password!");
        }
        System.out.println("Login successful!");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            withdraw(500);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        try {
            login("xyz", "000");
        } catch (InvalidLoginException e) {
            System.out.println(e.getMessage());
        }
    }
}