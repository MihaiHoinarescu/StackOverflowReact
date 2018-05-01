package ro.mihaihoinarescu.stackoverflowreact.infrastructure;

import dagger.Component;
import ro.mihaihoinarescu.stackoverflowreact.data.network.NetworkComponent;

@Component(modules = StackAppModule.class, dependencies = NetworkComponent.class)
public interface StackAppComponent {

}
