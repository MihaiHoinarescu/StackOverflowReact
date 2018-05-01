package ro.mihaihoinarescu.stackoverflowreact.infrastructure;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import ro.mihaihoinarescu.stackoverflowreact.data.network.NetworkApi;
import ro.mihaihoinarescu.stackoverflowreact.data.network.RetrofitNetworkApi;

@Module
class StackAppModule {

    @Provides
    @Singleton
    public NetworkApi getNetworkApi(Retrofit retrofit) {
        return new RetrofitNetworkApi(retrofit);
    }

}
