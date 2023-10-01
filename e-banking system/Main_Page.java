import java.util.*;

// this is our main page which we'll use to run the code and access diffrent classes 
public class Main_Page {
    public static void main(String[] args) {
        IdAndPasswords instance = new IdAndPasswords();

        LoginPage loginpage = new LoginPage(instance);

    }
}
