package ro.mihaihoinarescu.stackoverflowreact.data.network;

import java.util.List;
import java.util.Map;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import ro.mihaihoinarescu.stackoverflowreact.data.network.data.ApiResult;

public interface NetworkRequests {

    @GET("/2.2/users")
    Flowable<ApiResult<List<NetworkUser>>> getUsers(@QueryMap Map<String, String> options);
}
