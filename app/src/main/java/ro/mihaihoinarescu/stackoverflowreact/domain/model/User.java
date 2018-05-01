package ro.mihaihoinarescu.stackoverflowreact.domain.model;

import com.google.gson.annotations.SerializedName;

public class User {

    private String name;
    private String profilePictureURL;
    private String location;

    private int id;

    private int bronzeBadges;
    private int silverBadges;
    private int goldBadges;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilePictureURL() {
        return profilePictureURL;
    }

    public void setProfilePictureURL(String profilePictureURL) {
        this.profilePictureURL = profilePictureURL;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBronzeBadges() {
        return bronzeBadges;
    }

    public void setBronzeBadges(int bronzeBadges) {
        this.bronzeBadges = bronzeBadges;
    }

    public int getSilverBadges() {
        return silverBadges;
    }

    public void setSilverBadges(int silverBadges) {
        this.silverBadges = silverBadges;
    }

    public int getGoldBadges() {
        return goldBadges;
    }

    public void setGoldBadges(int goldBadges) {
        this.goldBadges = goldBadges;
    }
}
