package FollowTest;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class FollowTests extends BaseTest {
    @Test(priority = 0)
    public void testFacebookFollowing() {
        homePage.getFacebookIcon().click();
        Assert.assertTrue(homePage.switchToNewTabForFacebook(), "Invalid Tab");

    }

    @Test(priority = 1)
    public void testTwitterFollowing() {
        homePage.getTwitterIcon().click();
        Assert.assertTrue(homePage.switchToNewTabForTwitter(), "Invalid Tab");

    }
    @Test(priority = 2)
    public void testYoutubeFollowing() {
        homePage.getYoutubeIcon().click();
        Assert.assertTrue(homePage.switchToNewTabForYoutube(), "Invalid Tab");
    }

    @Test(priority = 3)
    public void testRssFollowing() {
        homePage.getRssIcon().click();
        Assert.assertTrue(homePage.switchToNewTabForRss(), "Invalid Tab");
    }


}
