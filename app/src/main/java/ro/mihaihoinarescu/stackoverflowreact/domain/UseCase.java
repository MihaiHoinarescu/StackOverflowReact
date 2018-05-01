package ro.mihaihoinarescu.stackoverflowreact.domain;

import io.reactivex.Observable;

public abstract class UseCase <T extends UseCase.RequestModel, R extends UseCase.ResponseModel> {

    abstract Observable<R> execute(T requestModel);

    public interface RequestModel {

    }

    public interface ResponseModel {

    }

    public static final class EmptyRequestModel implements RequestModel {

    }

    public static final class EmptyResponseModel implements ResponseModel {

    }

}
