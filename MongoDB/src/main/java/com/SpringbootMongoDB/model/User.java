package com.SpringbootMongoDB.model;



import java.util.Date;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Transient;
import org.springframework.transaction.annotation.Transactional;


public class User {
		
	

	
	@NotEmpty(message = "Name shouldn't be empty")
    private String name;

	@NotEmpty(message = "email shouldn't be empty")
    private String email;
	
	@NotEmpty(message = "Password shouldn't be empty")
    private String password;
	
	@NotEmpty(message = "Username shouldn't be empty")
    private String username;
	
	@NotEmpty(message = "Address shouldn't be empty")
	private String address;
	
	@NotEmpty(message = "Mobile number shouldn't be empty")
    private String mobile;
	
	private String latitude;
	private String longitude;
	@Transient
	public String errormessage;
	
	


	public String getErrormessage() {
		return errormessage;
	}

	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	private Date creationDate = new Date();
   // private Map<String, String> userSettings = new HashMap<>();




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

 /*   public Map<String, String> getUserSettings() {
        return userSettings;
    }

    public void setUserSettings(Map<String, String> userSettings) {
        this.userSettings = userSettings;
    }*/
}
