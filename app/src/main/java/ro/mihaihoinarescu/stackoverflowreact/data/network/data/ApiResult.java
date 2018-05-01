package ro.mihaihoinarescu.stackoverflowreact.data.network.data;


import com.google.gson.annotations.SerializedName;

public class ApiResult<T> {

    @SerializedName("quota_remaining")
    public int remainingRequests;

    public T content;

}
