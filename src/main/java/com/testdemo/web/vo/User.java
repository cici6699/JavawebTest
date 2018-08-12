package com.testdemo.web.vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
* User映射类 
*  
* @author huizhuo
* @time 2015.5.15 
*/  
public class User {  
  @JsonProperty("id") 
  private Integer userId;  
  @JsonProperty("name")  
  @NotNull(message = "name param is null")  
  @Size(min = 1, max = 20, message = "name size in(6, 20)")  
  private String userName;  
  @JsonProperty("psw")  
  @NotNull(message = "password param is null")  
  @Size(min = 6, max = 20, message = "password size in(6, 20)")    
  private String userPassword; 
  
  @JsonProperty("email")   
  @NotNull(message = "email param is null")  
  @Size(min = 6, max = 20, message = "email size in(6, 20)")    
  
  private String userEmail;  

  public Integer getUserId() {  
      return userId;  
  }  

  public void setUserId(Integer userId) {  
      this.userId = userId;  
  }  

  public String getUserName() {  
      return userName;  
  }  

  public void setUserName(String userName) {  
      this.userName = userName;  
  }  

  public String getUserPassword() {  
      return userPassword;  
  }  

  public void setUserPassword(String userPassword) {  
      this.userPassword = userPassword;  
  }  

  public String getUserEmail() {  
      return userEmail;  
  }  

  public void setUserEmail(String userEmail) {  
      this.userEmail = userEmail;  
  }  

  @Override  
  public String toString() {
      return "User [userId=" + userId + ", userName=" + userName  
              + ", userPassword=" + userPassword + ", userEmail=" + userEmail  
              + "]";
  }

}  