package ro.mihaihoinarescu.ui.util;

public interface BasePresenter<T extends BaseView> {

    void setView(T view);

    void start();

    void stop();

}
