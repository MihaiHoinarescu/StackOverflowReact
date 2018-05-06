package ro.mihaihoinarescu.stackoverflowreact.ui.util;

public interface BasePresenter<T extends BaseView> {

    void setView(T view);

    void start();

    void stop();

}
