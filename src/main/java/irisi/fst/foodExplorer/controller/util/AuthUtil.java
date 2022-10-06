/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irisi.fst.foodExplorer.controller.util;

import irisi.fst.foodExplorer.model.User;

/**
 *
 * @author USER
 */
public class AuthUtil {
    private User current;

public void signIn(User user){
        current = user;
}
  public void signOut() {
        current = null;
    }

   

    public User getCurrent() {
        return current;
    }

    public void setCurUser(User currentUser) {
        this.current = currentUser;
        System.out.println("sadsdsadsdasdasdsa");
        System.out.println(currentUser.toString());
    }

}
