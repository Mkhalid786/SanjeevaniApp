/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.pojo;

/**
 *
 * @author Khalid
 */
public class UserPojo {

    public UserPojo(String loginId, String username, String password, String userType) {
        this.loginId = loginId;
        this.username = username;
        this.password = password;
        this.userType = userType;
    }
    public UserPojo(){
        
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    private String loginId;
    private String  username;
    private String password;
    private String userType;
    
}



 