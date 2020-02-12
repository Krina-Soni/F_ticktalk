package testcases;

import org.junit.Test;
import pages.AuthLogin;
import reports.ReportsClass;
import java.io.IOException;

public class AuthLoginTest extends Basecase {

    @Test
    public void Success_Login() throws InterruptedException, IOException {


        AuthLogin login= new AuthLogin(driver);
        login.successlogin();
        driver.quit();
    }

    @Test
    public void unSuccess_login() throws InterruptedException, IOException {

        AuthLogin login= new AuthLogin(driver);
        login.unSuccesslogin("harshad.a123ddweb@gmail.com", "addweb123");
        Thread.sleep(5000);
        login.verifyUserIsNotLoggedIn();
        Thread.sleep(4000);
        driver.quit();  
    }

    @Test
    public void BIDURL() throws InterruptedException, IOException {

        AuthLogin login= new AuthLogin(driver);
        login.successlogin();
        login.verifyBIDS();
        driver.quit();
    }

    @Test
    public void AddnewBID() throws InterruptedException, IOException {

        AuthLogin login=new AuthLogin(driver);
        login.successlogin();
        login.addnewBIDS();
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void validateBids() throws InterruptedException, IOException {
       AuthLogin login=new AuthLogin(driver);
       login.successlogin();
       login.bidsValidation();
        driver.quit();
    }

    @Test
    public void delete_RowBid() throws InterruptedException, IOException {
       AuthLogin login=new AuthLogin(driver);
       login.successlogin();
       login.deleteRow_BID();
    }

    @Test
    public void view_BID() throws IOException, InterruptedException {

        AuthLogin login=new AuthLogin(driver);
        login.successlogin();
        login.viewBID();
        driver.quit();
    }

    @Test
    public void Update_BID() throws IOException, InterruptedException {

        AuthLogin login=new AuthLogin(driver);
        login.successlogin();
        login.update_BID();
        driver.quit();
    }

    @Test
    public void delete_BID() throws IOException, InterruptedException {

        AuthLogin login=new AuthLogin(driver);
        login.successlogin();
        login.delete_BID();
        driver.quit();
    }

    @Test
    public void checkFilter() throws InterruptedException, IOException {
        AuthLogin login= new AuthLogin(driver);

        login.successlogin();
        login.filterSearch();
        driver.close();
    }

    @Test
    public void blankFile_UploadFile_Validation() throws InterruptedException, IOException {
        AuthLogin login=new AuthLogin(driver);
        login.successlogin();
        login.blankFile_UploadValidation();
//        driver.quit();
    }

    @Test
    public void sameURLs_UploadFile_Validation() throws InterruptedException, IOException {
        AuthLogin login = new AuthLogin(driver);
        login.successlogin();
        login.sameURL_uploadValidation();
//        driver.quit();
    }



}
