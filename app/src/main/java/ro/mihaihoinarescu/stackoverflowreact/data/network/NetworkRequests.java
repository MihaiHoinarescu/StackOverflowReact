package ro.mihaihoinarescu.stackoverflowreact.data.network;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import ro.mihaihoinarescu.stackoverflowreact.data.network.data.ApiResult;

public interface NetworkRequests {

    @GET("/2.2/users")
    Observable<ApiResult<List<NetworkUser>>> getUsers(@QueryMap Map<String, String> options);
}
