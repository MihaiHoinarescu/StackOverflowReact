package ro.mihaihoinarescu.stackoverflowreact.data.network;

import java.util.List;
import java.util.Map;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import ro.mihaihoinarescu.stackoverflowreact.data.network.data.ApiResult;
import ro.mihaihoinarescu.stackoverflowreact.data.network.mapper.UserResponseMapper;
import ro.mihaihoinarescu.stackoverflowreact.domain.model.User;

public class RetrofitNetworkApi implements NetworkApi {

    private final NetworkRequests requests;
    private int REMAINING_REQUESTS = 100000;

    public RetrofitNetworkApi(NetworkRequests networkRequests) {
        this.requests = networkRequests;
    }

    @Override
    public Flowable<List<User>> getUsers(Map<String, String> options) {
        return requests.getUsers(options)
                .map(new QuotaCheckMapper())
                .map(new UserResponseMapper());
    }

    class QuotaCheckMapper implements Function<ApiResult, ApiResult> {

        @Override
        public ApiResult apply(ApiResult apiResult) throws Exception {
            REMAINING_REQUESTS = apiResult.remainingRequests;

            return apiResult;
        }
    }
}
