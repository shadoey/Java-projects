/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginapp;

import java.util.*;

public class LoginApp {

    public static void main(String[] args) {
        IdAndPasswords instance = new IdAndPasswords();
        // instance.get_balanceinfo()

        LoginPage loginpage = new LoginPage(instance);

    }

}
