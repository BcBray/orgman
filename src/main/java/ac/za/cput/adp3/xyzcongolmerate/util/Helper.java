package ac.za.cput.adp3.xyzcongolmerate.util;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;

import java.util.UUID;

public class Helper {

    public static String generateRandomGivenSuffix(String suffix) {
        return suffix + "-" + UUID.randomUUID().toString();
    }

    public static String getClassName(Class<?>  aClass) {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {
        /*
        String className = getClassName(aClass);
        getClassName(Gender.class);
        getClassName(Race.class);
        getClassName(Role.class);
        getClassName(Organisation.class);
        getClassName(User.class);
*/
        String compare = "";
        String compareName = getClassName(aClass);
        int setL = compareName.length();

        for(int i = 0; i < setL; i++)
        {
            if(Character.isUpperCase(compareName.charAt(i)))
            {
                char word = compareName.charAt(i);
                compare = compare += word;
            }
        }
        return compare;
    }
}
