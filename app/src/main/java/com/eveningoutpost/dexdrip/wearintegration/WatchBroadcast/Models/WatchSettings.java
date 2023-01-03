package com.eveningoutpost.dexdrip.wearintegration.WatchBroadcast.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class WatchSettings implements Parcelable {
    public WatchSettings() {}
    protected WatchSettings(Parcel in) {
        apkName = in.readString();
        graphSince = in.readLong();
    }

    public static final Creator<WatchSettings> CREATOR = new Creator<WatchSettings>() {
        @Override
        public WatchSettings createFromParcel(Parcel in) {
            return new WatchSettings(in);
        }

        @Override
        public WatchSettings[] newArray(int size) {
            return new WatchSettings[size];
        }
    };

    public long getGraphSince() {
        return graphSince;
    }

    public void setGraphSince(long graphSince) {
        this.graphSince = graphSince;
    }

    private long graphSince;

    public String getApkName() {
        return apkName;
    }

    public void setApkName(String apkName) {
        this.apkName = apkName;
    }

    private String apkName;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(apkName);
        parcel.writeLong(graphSince);
    }
}
