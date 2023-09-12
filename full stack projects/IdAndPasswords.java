import java.util.*;

public class IdAndPasswords {

    HashMap<String, String> logininfo = new HashMap<>();

    IdAndPasswords() {

        logininfo.put("Lenton", "ABCD");
        logininfo.put("user2", "1234");
        logininfo.put("user3", "ABCD4321");

    }

    protected HashMap getloginInfo() {
        return logininfo;
    }
}
