package ro.mihaihoinarescu.stackoverflowreact.domain.scheduling;

import android.support.annotation.NonNull;

import io.reactivex.Scheduler;

public interface ExecutionScheduler {


    @NonNull
    Scheduler computation();

    @NonNull
    Scheduler io();

    @NonNull
    Scheduler ui();

}
