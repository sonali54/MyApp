public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public static void main(String[] args) {
       System.out.println("Authentication issue detected..");
   }
}
