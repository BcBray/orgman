package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {


    @Test
    public void buildUserDemography() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date d = format.parse("2019-08-3");
        UserDemography userDemography = UserDemographyFactory.buildUserDemography("pie@gmail.com","Mr","1","1",d);
        Assert.assertNotNull(userDemography);
        System.out.println(userDemography);

    }
}