package ro.mihaihoinarescu.ui.mainScreen;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View view;

    @Override
    public void setView(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
