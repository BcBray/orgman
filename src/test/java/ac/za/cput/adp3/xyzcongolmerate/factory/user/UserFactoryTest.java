package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {


    @Test
    public void buildUser() {

        User user = UserFactory.buildUser("q@gmail.com","Harry","Potter");
        Assert.assertNotNull(user);
        System.out.println(user);
    }
}