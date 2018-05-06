package ro.mihaihoinarescu.stackoverflowreact.domain;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import io.reactivex.Flowable;
import ro.mihaihoinarescu.stackoverflowreact.data.network.NetworkApi;
import ro.mihaihoinarescu.stackoverflowreact.domain.model.User;

public class GetUsers extends UseCase<GetUsers.RequestModel, GetUsers.ResponseModel> {

    private final NetworkApi networkApi;

    @Inject
    public GetUsers(NetworkApi networkApi) {
        this.networkApi = networkApi;
    }

    @Override
    public Flowable<ResponseModel> execute(RequestModel requestModel) {

        return networkApi.getUsers(requestModel.options).map(ResponseModel::new);
    }

    public static final class RequestModel implements UseCase.RequestModel {
        public final Map<String, String> options;

        public RequestModel(Map<String, String> options) {
            this.options = options;
        }
    }

    public static final class ResponseModel implements UseCase.ResponseModel {
        public final List<User> users;

        public ResponseModel(List<User> users) {
            this.users = users;
        }
    }
}
