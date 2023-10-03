/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginapp;

import java.util.*;

public class IdAndPasswords {

    HashMap<String, String> logininfo = new HashMap<>();
    HashMap<String, Integer> balanceinfo = new HashMap();

    IdAndPasswords() {

        logininfo.put("Lenton", "ABCD");
        logininfo.put("user2", "1234");
        logininfo.put("user3", "ABCD4321");
        logininfo.put("Bob1", "1234Ab");

        balanceinfo.put("Lenton", 500000);
        balanceinfo.put("user2", 2000);
        balanceinfo.put("user3", 30);
        balanceinfo.put("Bob1", 50000);

    }

    protected HashMap getloginInfo() {
        return logininfo;
    }

    protected HashMap get_balanceinfo() {
        return balanceinfo;
    }
}
