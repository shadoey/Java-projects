import java.util.*;

public class LoginApp {
    public static void main(String[] args) {
        IdAndPasswords instance = new IdAndPasswords();

        LoginPage loginpage = new LoginPage(instance.getloginInfo());

    }
}
