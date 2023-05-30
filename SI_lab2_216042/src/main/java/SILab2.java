import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {
    public static void main(String[] args) {

    }

    public static boolean function (User user, List<User> allUsers) {
        if (user==null || user.getPassword()==null || user.getEmail()==null){//A
            throw new RuntimeException("Mandatory information missing!");//B
        }

        if (user.getUsername()==null){//C
            user.setUsername(user.getEmail());//D
        }
        int same = 1;//E
        if (user.getEmail().contains("@") && user.getEmail().contains(".")) {//E
            same = 0;//F
            for (int i=0;i<allUsers.size();i++) {//G1 G2 G3
                User existingUser = allUsers.get(i);//H
                if (existingUser.getEmail() == user.getEmail()) {//H
                    same += 1;//I
                }
                if (existingUser.getUsername() == user.getUsername()) {//J
                    same += 1;//K
                }
            }
        }
        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}";//L
        String password = user.getPassword();//L
        String passwordLower = password.toLowerCase();//L
        if (passwordLower.contains(user.getUsername().toLowerCase()) || password.length()<8) {//L
            return false;//M
        }
        else {
            if (!passwordLower.contains(" ")) {//N
                for (int i = 0; i < specialCharacters.length(); i++) {//O1 O2 O3
                    if (password.contains(String.valueOf(specialCharacters.charAt(i)))) {//P
                        return same == 0;//Q
                    }
                }
            }
        }
        return false;//R
    }
}//T