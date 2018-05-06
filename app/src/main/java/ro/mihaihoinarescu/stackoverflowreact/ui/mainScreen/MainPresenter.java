package ro.mihaihoinarescu.stackoverflowreact.ui.mainScreen;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.disposables.CompositeDisposable;
import ro.mihaihoinarescu.stackoverflowreact.domain.GetUsers;

public class MainPresenter implements MainContract.Presenter {

    private final GetUsers getUsers;
    private MainContract.View view;

    CompositeDisposable subscriber;

    MainPresenter(GetUsers getUsers) {
        this.getUsers = getUsers;

        subscriber = new CompositeDisposable();
    }

    @Override
    public void setView(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {

        Map<String, String> requestOptions = new HashMap<>();
        requestOptions.put("pagesize", "10");
        requestOptions.put("order", "desc");
        requestOptions.put("sort", "reputation");
        requestOptions.put("site", "stackoverflow");


    }

    @Override
    public void stop() {

    }
}
