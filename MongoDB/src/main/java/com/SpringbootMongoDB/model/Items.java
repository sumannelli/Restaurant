package com.SpringbootMongoDB.model;

import javax.validation.constraints.NotEmpty;

public class Items {

	@NotEmpty(message = "ItemName shouldn't be empty")
    private String itemName;
	@NotEmpty(message = "ItemQuantity shouldn't be empty")
    private String itemQuantity;
	@NotEmpty(message = "ItemUnit shouldn't be empty")
    private String itemUnit;
	private String itemAvailability;
    private String itemImage;


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String name) {
        this.itemName = itemName;
    }

    public String getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(String email) {
        this.itemQuantity = itemQuantity;
    }
    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String password) {
        this.itemUnit = itemUnit;
    }

    public String getItemAvailability() {
        return itemAvailability;
    }

    public void setItemAvailabilitye(String username) {
        this.itemAvailability = itemAvailability;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String address) {
        this.itemImage = itemImage;
    }

}
