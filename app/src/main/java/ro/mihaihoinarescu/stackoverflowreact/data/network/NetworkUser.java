package ro.mihaihoinarescu.stackoverflowreact.data.network;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class NetworkUser implements Parcelable {

    @SerializedName("display_name")
    private String name;
    @SerializedName("profile_image")
    private String profilePictureURL;
    @SerializedName("badge_counts")
    private BadgeCounts badges;

    private String location;

    private int id;

    protected NetworkUser(Parcel in) {
        name = in.readString();
        profilePictureURL = in.readString();
        badges = in.readParcelable(BadgeCounts.class.getClassLoader());
        id = in.readInt();
    }

    public static final Parcelable.Creator<NetworkUser> CREATOR = new Parcelable.Creator<NetworkUser>() {
        @Override
        public NetworkUser createFromParcel(Parcel in) {
            return new NetworkUser(in);
        }

        @Override
        public NetworkUser[] newArray(int size) {
            return new NetworkUser[size];
        }
    };

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

    public BadgeCounts getBadges() {
        return badges;
    }

    public void setBadges(BadgeCounts badges) {
        this.badges = badges;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(profilePictureURL);
        dest.writeParcelable(badges, flags);
        dest.writeString(location);
        dest.writeInt(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
