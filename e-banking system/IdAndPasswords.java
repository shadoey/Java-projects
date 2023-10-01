import java.util.*;

public class IdAndPasswords {

    HashMap<String, String> logininfo = new HashMap<>();
    HashMap<String, Integer> balanceinfo = new HashMap();

    IdAndPasswords() {

        logininfo.put("Lenton", "ABCD");
        logininfo.put("user2", "1234");
        logininfo.put("user3", "4321");

        balanceinfo.put("Lenton", 500000);
        balanceinfo.put("user2", 2000);
        balanceinfo.put("user3", 30);

    }

    protected HashMap getloginInfo() {
        return logininfo;
    }

    protected HashMap get_balanceinfo() {
        return balanceinfo;
    }
}
