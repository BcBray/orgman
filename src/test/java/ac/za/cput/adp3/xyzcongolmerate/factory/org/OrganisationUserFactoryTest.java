package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    @Test
    public void buildOrganisationUser() {

        OrganisationUser organisationUser = OrganisationUserFactory.buildOrganisationUser("111222","apple@gmail.com");
        Assert.assertNotNull(organisationUser);
        System.out.println(organisationUser.getOrgCode());

    }
}