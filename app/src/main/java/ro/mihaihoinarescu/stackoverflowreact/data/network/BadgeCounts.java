package ro.mihaihoinarescu.stackoverflowreact.data.network;

import android.os.Parcel;
import android.os.Parcelable;

public class BadgeCounts implements Parcelable {

    private int gold, silver, bronze;

    protected BadgeCounts(Parcel in) {
        gold = in.readInt();
        silver = in.readInt();
        bronze = in.readInt();
    }

    public static final Parcelable.Creator<BadgeCounts> CREATOR = new Parcelable.Creator<BadgeCounts>() {
        @Override
        public BadgeCounts createFromParcel(Parcel in) {
            return new BadgeCounts(in);
        }

        @Override
        public BadgeCounts[] newArray(int size) {
            return new BadgeCounts[size];
        }
    };

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getSilver() {
        return silver;
    }

    public void setSilver(int silver) {
        this.silver = silver;
    }

    public int getBronze() {
        return bronze;
    }

    public void setBronze(int bronze) {
        this.bronze = bronze;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(gold);
        dest.writeInt(silver);
        dest.writeInt(bronze);
    }

}
