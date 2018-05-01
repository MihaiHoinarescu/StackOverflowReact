package ro.mihaihoinarescu.stackoverflowreact.data.network.mapper;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.functions.Function;
import ro.mihaihoinarescu.stackoverflowreact.data.network.NetworkUser;
import ro.mihaihoinarescu.stackoverflowreact.data.network.data.ApiResult;
import ro.mihaihoinarescu.stackoverflowreact.domain.model.User;

public class UserResponseMapper implements Function<ApiResult<List<NetworkUser>>, List<User>> {

    @Override
    public List<User> apply(ApiResult<List<NetworkUser>> listApiResult) throws Exception {
        List<NetworkUser> networkUsers = listApiResult.content;
        List<User> result = new ArrayList<>();
        for (NetworkUser networkUser : networkUsers) {
            User user = new User(networkUser.getName(), networkUser.getId());
            user.setLocation(networkUser.getLocation());
            user.setProfilePictureURL(networkUser.getProfilePictureURL());

            user.setBronzeBadges(networkUser.getBadges().getBronze());
            user.setSilverBadges(networkUser.getBadges().getSilver());
            user.setGoldBadges(networkUser.getBadges().getGold());

            result.add(user);
        }
        return result;
    }
}
