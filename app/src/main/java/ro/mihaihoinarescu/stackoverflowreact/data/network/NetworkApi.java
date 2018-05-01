package ro.mihaihoinarescu.stackoverflowreact.data.network;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import ro.mihaihoinarescu.stackoverflowreact.domain.model.User;

public interface NetworkApi {

    Observable<List<User>> getUsers(Map<String, String> options);
}
