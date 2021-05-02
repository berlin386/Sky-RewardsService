import com.mycompany.factory.RewardsServiceFactory;
import com.mycompany.factory.SkyRewardsService;
import com.mycompany.rewards.RewardsService;
import com.mycompany.rewards.RewardsServiceStatus;
import lombok.extern.java.Log;
import org.junit.jupiter.api.*;

@Log
public class RewardsServiceTest {

    private static RewardsService rewardsService;

    @BeforeAll
    static void setup() {

        RewardsServiceFactory rewardsServiceFactory = (RewardsServiceFactory) SkyRewardsService.getFactory("rewards_service");
        rewardsService = rewardsServiceFactory.create("rewards_service");
    }


    @Test
    void shouldThrowErrorForInvalidAccountFormat() {
        log.info("Executing Test-1 -> shouldThrowErrorForInvalidAccountFormat");
        //Given
        String invalid_account = "invalid_acc";

        //when
        RewardsServiceStatus rewardsServiceStatus = rewardsService.rewards(invalid_account, "kids");
        log.info("Output::" + rewardsServiceStatus);
        //then
        Assertions.assertEquals("validation_error", rewardsServiceStatus.getStatusCode());

    }


    @Test
    void shouldThrowErrorForAccountNotExist(){
        log.info("Executing Test-2 -> shouldThrowErrorForAccountNotExist");
        //Given
        String account_not_exist = "620000000004";

        //when
        RewardsServiceStatus rewardsServiceStatus = rewardsService.rewards(account_not_exist, "kids");
        log.info("Output::" + rewardsServiceStatus);
        //then
        Assertions.assertEquals("INVALID_ACCOUNT_NUMBER", rewardsServiceStatus.getStatusCode());
    }

    @Test
    void shouldReturnRewardForPlatinumAccount(){
        log.info("Executing Test-3 -> shouldReturnRewardForPlatinumAccount");
        //Given
        String account = "620000000000";

        //when
        RewardsServiceStatus rewardsServiceStatus = rewardsService.rewards(account, "SPORTS");
        log.info("Output::" + rewardsServiceStatus);
        //then
        Assertions.assertEquals("CUSTOMER_ELIGIBLE", rewardsServiceStatus.getStatusCode());
    }


    @Test
    void shouldReturnNoRewardForNonPlatinumAccount(){
        log.info("Executing Test-4 -> shouldReturnNoRewardForNonPlatinumAccount");
        //Given
        String account = "620000000001";

        //when
        RewardsServiceStatus rewardsServiceStatus = rewardsService.rewards(account, "SPORTS");
        log.info("Output::" + rewardsServiceStatus);
        //then
        Assertions.assertEquals("CUSTOMER_INELIGIBLE", rewardsServiceStatus.getStatusCode());
    }
}
