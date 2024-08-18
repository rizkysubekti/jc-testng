package com.juaracoding;

public class Login {

    public boolean isLogin(String username, String password){
        if(username.equals("admin") && password.equals("p4ssw0rd")){
            return true;
        } else {
            return false;
        }
    }

    // return value String
    // Challengeeeeeeeeeee
    // buatkan fungsi pesan berhasil login, invalid login
    public String messageLogin(boolean isLogin){
        return isLogin ? "Berhasil login" : "Invalid login";
    }

}
