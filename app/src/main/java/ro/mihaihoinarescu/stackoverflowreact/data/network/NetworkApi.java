package ro.mihaihoinarescu.stackoverflowreact.data.network;

import java.util.List;
import java.util.Map;

import io.reactivex.Flowable;
import ro.mihaihoinarescu.stackoverflowreact.domain.model.User;

public interface NetworkApi {

    Flowable<List<User>> getUsers(Map<String, String> options);
}
