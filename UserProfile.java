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
public class UserProfile {
    public static String getUserName(){
        return userName;
        
    }
    public static void setUserName(String userName){
        UserProfile.userName=userName;
    }
    public static String getUserType(){
        return userType;
    }
    public static void setUserType(String userType){
        UserProfile.userType=userType;
    }
    public static String getUserId(){
        return userId;
    }
    public static void setUserId(String userId){
        UserProfile.userId=userId;
    }
    private static String userName;
    private static String userType;
    private static String userId;

    public static void getUserType(String userType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
