package pages;

import actions.ActionClass;
import actions.VerificationClass;
import constants.ConstantVar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.IOException;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

public class AuthLogin {

    WebDriver driver;

        @FindBy(how = How.NAME, using = "sign_in_with_slack")
        private WebElement linktorocketchat;

        @FindBy(how = How.XPATH, using = "//*[@id=\"emailOrUsername\"]\n")
        private WebElement uname;

        @FindBy(how = How.ID, using = "pass")
        private WebElement pass;

        @FindBy(how = How.XPATH, using = "/html/body/section/div/form/div[3]/button[1]\n")
        public WebElement btnlogin;

        @FindBy(how = How.XPATH, using = "/html/body/div[4]/div/div\n")
        public WebElement lblloggedin;

        @FindBy(how = How.XPATH, using = "/html/body/div[4]/div[2]/div/form/div[3]/button[3]\n")
        public WebElement btnAuthorize;

        @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/nav/div/ul/li[1]/a")
        public WebElement btnCache;

        @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/nav/div/div[1]/button")
        public WebElement btnmenu;

        @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[1]/nav/ul/li[2]/a")
        public WebElement btnLeads;

        @FindBy(how = How.XPATH, using = "//*[@id=\"leadasdsd-dropdown-element\"]/div/ul/li[1]/a")
        public WebElement btnBIDSmenu;

        @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[2]/div/h1/a")
        public WebElement btnAddBIDS;

        @FindBy(how = How.XPATH, using = "//*[@id=\"bids-form\"]/div[1]/div/div[1]/div/input")
        public WebElement txtAddURL;

        @FindBy(how = How.XPATH, using = "//*[@id=\"bids-form\"]/div[1]/div/div[2]/div/span/span[1]/span/ul/li/input")
        public WebElement txtAddPortal;

        @FindBy(how = How.XPATH, using = "//*[@id=\"bids-form\"]/div[1]/div/div[3]/div/span/span[1]/span/ul/li/input")
        public WebElement txtAddTags;

        @FindBy(how = How.XPATH, using = "//*[@id=\"bids-form\"]/div[1]/div/div[4]/input[1]")
        public WebElement txtAddStatus1;

        @FindBy(how = How.XPATH, using = "//*[@id=\"bids-form\"]/div[1]/div/div[4]/input[2]")
        public WebElement txtAddStatus2;

        @FindBy(how = How.XPATH, using = "//*[@id=\"bids-form\"]/div[2]/button")
        public WebElement btnSave;

        @FindBy(how = How.XPATH, using = "//*[@id=\"postData[0][bid_url]-error\"]")
        public WebElement lblBIDURL;

        @FindBy(how = How.XPATH, using = "//*[@id=\"postData[0][bid_source][]-error\"]")
        public WebElement lblPortal;

        @FindBy(how = How.XPATH, using = "//*[@id=\"bids-form\"]/div[1]/div/div[5]/div/button")
        public WebElement btnAddNewLead;

        // Find by Functionalities for New Lead elements

        @FindBy(how = How.XPATH, using = "//*[@id=\"bids-form\"]/div[1]/div[2]/div[1]/div/input")
        public WebElement txtAddNewURL;

        @FindBy(how = How.XPATH, using = "//*[@id=\"postData[1][bid_url]-error\"]")
        public WebElement lblAddnewURL;

        @FindBy(how = How.XPATH, using = "//*[@id=\"bids-form\"]/div[1]/div[2]/div[2]/div/span/span[1]/span/ul/li/input")
        public WebElement txtAddNewPortal;

        @FindBy(how = How.XPATH, using = "//*[@id=\"bids-form\"]/div[1]/div[2]/div[3]/div/span/span[1]/span/ul/li/input")
        public WebElement txtnewAddTags;

        @FindBy(how = How.XPATH, using = "//*[@id=\"bids-form\"]/div[1]/div[2]/div[4]/input[1]")
        public WebElement txtnewAddStatus1;

        @FindBy(how = How.XPATH, using = "//*[@id=\"postData[1][bid_source][]-error\"]")
        public WebElement lblAddNewPortal;

        @FindBy(how = How.XPATH, using = "/html/body/div[3]/div\n")
        public WebElement lblSAMEURL;

        @FindBy(how = How.XPATH, using = "//*[@id=\"remove_1\"]")
        public WebElement btnDeleteBID;

        @FindBy(how = How.CSS, using = "css=.save")
        public WebElement btnSAVEBIDS;

        @FindBy(how = How.CLASS_NAME, using = "toast-message")
        public WebElement btnToast;

        //Find By Functionalities for Filter data

        @FindBy(how = How.XPATH, using = "//*[@id=\"bread-actions\"]/a[1]")
        public WebElement viewBID;

        @FindBy(how = How.XPATH, using = "//*[@id=\"bread-actions\"]/a[2]")
        public WebElement btnUpdate_BID;

        @FindBy(how = How.XPATH, using = "//*[@id=\"delete-95\"]")
        public WebElement btnDelete_BID;

        @FindBy(how = How.XPATH, using = "//html/body/div[2]/div[2]/div[2]/div/div[3]/div/div/div[2]/form/input[3]")
        public WebElement btnConfirm_Delete_BID;

        @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/form/div/div[3]/div[2]/div/ul/li/input")
        public WebElement filter_tags_data;

        @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/form/div/div[2]/div[2]/div/ul/li/input")
        public WebElement filter_portal_data;

        @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/form/div/div[7]/div/div/input")
        public WebElement btnSearch;

        @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/form/div/div[1]/div[2]/div/ul/li/input")
        public WebElement txtboxUser;

        @FindBy(how = How.XPATH, using = "//*[@id=\"dataTable\"]/tbody/tr[1]/td[2]/span")
        public WebElement txtBIDRecord1;

        @FindBy(how = How.XPATH, using = "//*[@id=\"dataTable\"]/tbody/tr[1]/td[1]")
        public WebElement lblUser;

        @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/form/div/div[2]/div[2]/div/ul/li/input")
        public WebElement searchPortal;

        @FindBy(how = How.XPATH, using = "//*[@id=\"dataTable\"]/tbody/tr[1]/td[5]")
        public WebElement searchPortaldata;

        @FindBy(how = How.XPATH, using = "//*[@id=\"dataTable\"]/tbody/tr[1]/td[3]")
        public WebElement lblstart_date;

        @FindBy(how = How.XPATH, using = "//*[@id=\"dataTable\"]/tbody/tr[1]/td[3]")
        public WebElement lblend_date;

        @FindBy(how = How.CLASS_NAME, using = "active")
        public WebElement pageNext;

        @FindBy(how = How.XPATH, using = "//input[@name='start_date']")
        public WebElement start_date;

        @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/form/div/div[6]/div[2]/input")
        public WebElement end_date;

        @FindBy(how = How.CSS, using = "disabled > span")
        public WebElement pageEnd;

        @FindBy(how = How.XPATH, using = "//*[@id=\"bread-actions\"]/a[1]")
        public WebElement viewRecord;

        @FindBy(how = How.XPATH, using = "//*[@id=\"bread-actions\"]/a[2]")
        public WebElement editRecord;

        @FindBy(how = How.XPATH, using = "//*[@id=\"delete-86\"]")
        public WebElement deleteRecord;

        @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[2]/div/div[1]/form/button")
        public WebElement btnUploadFile;

        @FindBy(how = How.CLASS_NAME, using = "disabled")
        public WebElement btnPageNext;

        @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[2]/div/div[1]/form/small/input")
        public WebElement btnSelectFile;

        @FindBy(how = How.CLASS_NAME, using = "toast-message")
        public WebElement toast_blankUploadFile;


    public AuthLogin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void successlogin() throws InterruptedException, IOException {

        ActionClass actionClass = new ActionClass(driver);
        ConstantVar constantVar = new ConstantVar();
        actionClass.clickOnObject(linktorocketchat);
        Thread.sleep(3000);
        actionClass.setValueinTextbox(uname, ConstantVar.username);
        actionClass.setValueinTextbox(pass, ConstantVar.password);
        actionClass.clickOnObject(btnlogin);
        Thread.sleep(3000);
        actionClass.clickOnObject(btnAuthorize);
        Thread.sleep(3000);
        actionClass.screenCapture("Login successfull");

    }

    public void unSuccesslogin(String username, String password) throws InterruptedException, IOException {

        ActionClass actionClass = new ActionClass(driver);
        actionClass.clickOnObject(linktorocketchat);
        Thread.sleep(2000);
        ConstantVar constantVar = new ConstantVar();
        actionClass.setValueinTextbox(uname, username);
        actionClass.setValueinTextbox(pass, password);
        actionClass.clickOnObject(btnlogin);
        actionClass.screenCapture("Unsuccessfull login");

    }

    public void verifyUserIsNotLoggedIn() throws IOException {

        VerificationClass verificationClass = new VerificationClass(driver);
        ActionClass actionClass = new ActionClass(driver);
        verificationClass.verifyElementNotPresent(lblloggedin);
        actionClass.screenCapture("invalid login");

    }

    public void verifyBIDS() throws InterruptedException, IOException {

        ActionClass actionClass = new ActionClass(driver);
        VerificationClass verificationClass = new VerificationClass(driver);
        actionClass.clickOnObject(btnmenu);
        Thread.sleep(2000);
        actionClass.clickOnObject(btnLeads);
        actionClass.clickOnObject(btnBIDSmenu);
        actionClass.clickOnObject(btnAddBIDS);

        Thread.sleep(2000);

        //Check_for_Blank_Fields
        actionClass.clickOnObject(btnSave);
        verificationClass.verifyElementPresent(lblBIDURL);
        actionClass.screenCapture("All_Fields_Validation");

        //Check for Valid URL and Blank Others

        Thread.sleep(3000);
        actionClass.setValueinURLField(txtAddURL, "https://javascript.info/url");
        actionClass.clickOnObject(btnSave);
        verificationClass.verifyElementNotPresent(lblBIDURL);
        actionClass.screenCapture("ValidURL");


//        //Check for Blank Portal, Tags, status
        Thread.sleep(3000);
        actionClass.clickOnObject(btnSave);
        verificationClass.verifyElementPresent(lblPortal);
        actionClass.screenCapture("Blank_Portal");

        //Check for Valid Portal
        Thread.sleep(2000);

        actionClass.setValueinPortalField(txtAddPortal);
        actionClass.clickOnObject(btnSave);
        verificationClass.verifyElementNotPresent(lblPortal);

        //Check for Valid Portals
        Thread.sleep(2000);

        actionClass.setValueinPortalField(txtAddPortal);
        actionClass.clickOnObject(btnSave);
        verificationClass.verifyElementNotPresent(lblPortal);
        actionClass.screenCapture("Valid_Portal");

        //Check for Valid Tags
        Thread.sleep(3000);
        actionClass.setValueinTagsfield(txtAddTags);
        actionClass.clickOnObject(btnSave);
        actionClass.screenCapture("Valid_Tags");

        //Check for Single Record saving

//        actionClass.setValueinURLField(txtAddURL);
//        actionClass.setValueinPortalField(txtAddPortal);
//        actionClass.setValueinTagsfield(txtAddTags);
        actionClass.clickOnObject(txtAddStatus1);
        actionClass.clickOnObject(txtAddStatus2);
        actionClass.clickOnObject(btnSave);
        actionClass.screenCapture("Valid Status");

        //Check for Single Record Saving
//        actionClass.setValueinURLField(txtAddURL);
//        actionClass.setValueinPortalField(txtAddPortal);
//        actionClass.setValueinTagsfield(txtAddTags);
//        actionClass.clickOnObject(txtAddStatus1);

        actionClass.clickOnObject(btnSave);
//        verificationClass.verifyElementPresent();
        actionClass.screenCapture("New Record");

    }

    public void addnewBIDS() throws InterruptedException, IOException {

        ActionClass actionClass = new ActionClass(driver);
        VerificationClass verificationClass = new VerificationClass(driver);
        actionClass.clickOnObject(btnmenu);

        Thread.sleep(2000);

        actionClass.clickOnObject(btnLeads);
        actionClass.clickOnObject(btnBIDSmenu);
        actionClass.clickOnObject(btnAddBIDS);

        actionClass.setValueinNewURLField(txtAddURL);
        actionClass.setValueinPortalField(txtAddPortal);
        actionClass.setValueinTagsfield(txtAddTags);
        actionClass.clickOnObject(txtAddStatus1);
        actionClass.clickOnObject(txtAddStatus2);


        //Check for Blank field submission for newly added fields
        actionClass.clickOnObject(btnAddNewLead);
        actionClass.clickOnObject(btnSave);
        verificationClass.verifyElementPresent(lblAddnewURL);
        actionClass.screenCapture("NEW_LEADS-BLAnk-SUBMISSIONS");


        Thread.sleep(3000);
        //Check for Valid URL and Blank Portal
        actionClass.setValueinURLField(txtAddNewURL, "https://javascript.info/url"); //URL added
        actionClass.clickOnObject(btnSave);
        actionClass.screenCapture("Valid_New_URL");

        //Check for Blank Portal
        Thread.sleep(3000);
        actionClass.clickOnObject(btnSave);
        verificationClass.verifyElementPresent(lblAddNewPortal);
        actionClass.screenCapture("New_Blank_Portal");

        //Check for Valid Portal
        Thread.sleep(2000);
        actionClass.setValueinPortalField(txtAddNewPortal); //Portal Added
        actionClass.clickOnObject(btnSave);

        //Check for Valid tags
        actionClass.setValueinTagsfield(txtnewAddTags); //Tags added
        actionClass.clickOnObject(btnSave);
        actionClass.screenCapture("New_Valid_tags");

        //Check for Multiple Record saves

        Thread.sleep(2000);
        actionClass.clickOnObject(txtnewAddStatus1); // Status added
        actionClass.clickOnObject(btnSave);
        actionClass.screenCapture("NEW_LEAD_ADDED_POPUP");
    }

    public void bidsValidation() throws IOException, InterruptedException {

        ActionClass actionClass = new ActionClass(driver);
        VerificationClass verificationClass = new VerificationClass(driver);

        //Routing to Add BIDS page

        actionClass.clickOnObject(btnmenu);
        actionClass.clickOnObject(btnLeads);
        actionClass.clickOnObject(btnBIDSmenu);
        actionClass.clickOnObject(btnAddBIDS);


        //Row 1

        actionClass.setValueinURLField(txtAddURL, "https://javascript.info/url");
        actionClass.setValueinPortalField(txtAddPortal);
        actionClass.setValueinTagsfield(txtAddTags);
        actionClass.clickOnObject(txtAddStatus1);
        actionClass.clickOnObject(txtAddStatus2); //Row 1 Added
        actionClass.clickOnObject(btnAddNewLead);


        //Row 2

        actionClass.setValueinURLField(txtAddNewURL, "https://pythoncript.info/url");   //URL added
        actionClass.setValueinPortalField(txtAddNewPortal); //Portal Added
        actionClass.setValueinTagsfield(txtnewAddTags);     //Tags added
        actionClass.clickOnObject(txtnewAddStatus1);// Status added


        Thread.sleep(4000);

        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div/div/div/div[2]/form[1]/div[2]/button\n"));

        actionClass.clickOnObject(btnSave);
        Thread.sleep(3000);
        actionClass.screenCapture("Error capture");

        verificationClass.checkToast(btnToast, "BID URL on row no 2 should be unique");

//        Deleting the Second row
        /*Thread.sleep(2000);
        actionClass.clickOnObject(btnDeleteBID);
        actionClass.screenCapture("Row_Deleted");
        actionClass.clickOnObject(btnSave);
        */

    }

    public void viewBID() throws IOException, InterruptedException  {

        ActionClass actionClass = new ActionClass(driver);
        VerificationClass verificationClass = new VerificationClass(driver);

        //Routing to Add BIDS page

        actionClass.clickOnObject(btnmenu);
        actionClass.clickOnObject(btnLeads);
        actionClass.clickOnObject(btnBIDSmenu);

        actionClass.clickOnObject(viewBID);
        Thread.sleep(2000);
        actionClass.screenCapture("View_BID");

    }

    public void update_BID() throws IOException, InterruptedException {

        ActionClass actionClass = new ActionClass(driver);
        VerificationClass verificationClass = new VerificationClass(driver);

        //Routing to Add BIDS page

        actionClass.clickOnObject(btnmenu);
        actionClass.clickOnObject(btnLeads);
        actionClass.clickOnObject(btnBIDSmenu);

        //Updating BID

        actionClass.clickOnObject(btnUpdate_BID);
        actionClass.setValueinURLField(txtAddURL,"https://developers.google.com/speed/pagespeed/insights/");
        actionClass.setValueinTextbox(txtAddPortal,"Upwork");
        actionClass.setValueinTextbox(txtAddTags,"angular");

        actionClass.clickOnObject(btnSAVEBIDS);
        verificationClass.isElementPresent(btnToast,"Successfully Updated Bid");
        Thread.sleep(2000);
        actionClass.screenCapture("BID_Success_Update");

    }

    public void delete_BID() throws IOException, InterruptedException{

        ActionClass actionClass = new ActionClass(driver);
        VerificationClass verificationClass = new VerificationClass(driver);

        //Routing to Add BIDS page

        actionClass.clickOnObject(btnmenu);
        actionClass.clickOnObject(btnLeads);
        actionClass.clickOnObject(btnBIDSmenu);

        actionClass.clickOnObject(btnDelete_BID);
//        driver.findElement(By.className("btn btn-danger pull-right delete-confirm")).click();
        actionClass.clickOnObject(btnConfirm_Delete_BID);
        Thread.sleep(3000);
        verificationClass.isElementPresent(btnToast,"Successfully Deleted Bid");
        Thread.sleep(2000);
        actionClass.screenCapture("BID_Delete_Success");
    }

    public void deleteRow_BID() throws IOException, InterruptedException {

        ActionClass actionClass = new ActionClass(driver);
        VerificationClass verificationClass = new VerificationClass(driver);

        //Routing to Add BIDS page

        actionClass.clickOnObject(btnmenu);
        actionClass.clickOnObject(btnLeads);
        actionClass.clickOnObject(btnBIDSmenu);
        actionClass.clickOnObject(btnAddBIDS);


        //Row 1

        actionClass.setValueinURLField(txtAddURL, "https://javascript567.info/url");
        actionClass.setValueinPortalField(txtAddPortal);
        actionClass.setValueinTagsfield(txtAddTags);
        actionClass.clickOnObject(txtAddStatus1);
        actionClass.clickOnObject(txtAddStatus2); //Row 1 Added
        actionClass.clickOnObject(btnAddNewLead);


        //Row 2

        actionClass.setValueinURLField(txtAddNewURL, "https://javascript567.info/url");   //URL added
        actionClass.setValueinPortalField(txtAddNewPortal); //Portal Added
        actionClass.setValueinTagsfield(txtnewAddTags);     //Tags added
        actionClass.clickOnObject(txtnewAddStatus1);// Status added
        Thread.sleep(4000);

        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div/div/div/div[2]/form[1]/div[2]/button\n"));

        actionClass.clickOnObject(btnSave);
        Thread.sleep(3000);
        actionClass.screenCapture("Error capture");

//        Deleting the Second row for the duplicate URL
        Thread.sleep(3000);
        actionClass.clickOnObject(btnDeleteBID);
        actionClass.screenCapture("Row_Deleted");
        actionClass.clickOnObject(btnSave);

    }

    public void filterSearch() throws InterruptedException {

        ActionClass actionClass = new ActionClass(driver);
        VerificationClass verificationClass = new VerificationClass(driver);

        //Routing to Add BIDS page
        actionClass.clickOnObject(btnmenu);
        actionClass.clickOnObject(btnLeads);
        actionClass.clickOnObject(btnBIDSmenu);
        ///=====================


        //Clear Cache
        Thread.sleep(4000);
        actionClass.clickOnObject(btnCache);

//        //Filter by name searches
        Thread.sleep(2000);
        actionClass.setValueinTextbox(txtboxUser, "Harshad");
        verificationClass.isElementPresent(lblUser, "Harshad");//
        ///=====================

        // Filter by Date searches ====================
        Thread.sleep(2000);
        actionClass.setValueinTextbox(start_date, "01012020");
        actionClass.setValueinTextbox(end_date, "30012020");
        verificationClass.isElementPresent(lblstart_date, "01012020");
        ///=====================

        //Filter by Portal and Tags
        Thread.sleep(2000);
        actionClass.setValueinTextbox(filter_portal_data,"Freelancer");
        actionClass.setValueinTextbox(filter_tags_data,"Video Processing");
        ///=====================

        //Clicking on Search button
        actionClass.clickOnObject(btnSearch);
        ///=====================


        //Checking Records for On All Pages over..
        List<WebElement> listBids = driver.findElements(By.cssSelector("#dataTable> tbody>tr>td:nth-child(1)"));
        JavascriptExecutor jsetaskscore =(JavascriptExecutor)driver;
        jsetaskscore.executeScript("scrollBy(0, 300)");

        for (WebElement nameTitle:listBids) {
            String PrintAuthAsc = nameTitle.getText();
            System.out.println("Author Title is Sort By Ascending " + PrintAuthAsc);
        }
        pageNext.click();

        JavascriptExecutor jsetaskscore1 =(JavascriptExecutor)driver;
        jsetaskscore1.executeScript("scrollBy(0, 500)");

        boolean NextBtnName= btnPageNext.isDisplayed();

        while (!NextBtnName==false)

        {
            JavascriptExecutor jsetaskscore2 =(JavascriptExecutor)driver;
            jsetaskscore2.executeScript("scrollBy(0, -350)");
            Thread.sleep(1000);
            List<WebElement> AuthAscTitlesAgain = driver.findElements(By.className("blog-title"));

            for (WebElement nameTitle:AuthAscTitlesAgain) {
                String PrintAuthAsc = nameTitle.getText();
                System.out.println("Author Title is Sort By Ascending " + PrintAuthAsc);
            }
            JavascriptExecutor jsetaskscore3 =(JavascriptExecutor)driver;
            jsetaskscore3.executeScript("scrollBy(0, 300)");
            pageNext.click();
            Thread.sleep(2000);
        }
        ///=====================

        //       { List<WebElement> rows = driver.findElements(By.cssSelector("#dataTable > tbody"));
//        for(WebElement row : rows){
//            if(row.findElement(By.cssSelector("td:nth-of-type(1)").getText.equals("Harshad"){
//                isFound= true;
//                break;
//            }
//        }
//        return isFound;

        //View -- Edit -- Delete Functionality


//
//        int i = 0;
//        do {
//            List<WebElement> ListBids = driver.findElements(By.xpath("//*[@id='dataTable']/tbody/tr"));

////            List<WebElement> listBids=driver.findElements(By.cssSelector("#dataTable> tbody>tr>td:nth-child(1)"));
     /*       List<String> names= new ArrayList<String>();
            for (WebElement listBid: listBids)
            {
                names.add(listBid.getText());
            }
            String nxtBtn= driver.findElement(By.className("active")).getAttribute("class");
            while(!nxtBtn.contains("disabled")){
            }
*/
//            int size = ListBids.size();
//            System.out.println(size);
//            ++i;
//            System.out.println("Value: " + i);
//        } while ();
//                int listsize = ListStudent.size();
//                ArrayList listNames1 = new ArrayList();
//                for (int i = 1; i <= listsize; i++) {
//                    String s = driver.findElement(By.xpath("//table[@id='DataTables_Table_0']/tbody/tr[" + i + "]/td[1]")).getText();
//                    System.out.println("Value in list is: " + s);
//                    listNames1.add(driver.findElement(By.xpath("//table[@id='DataTables_Table_0']/tbody/tr[" + i + "]/td[1]")).getText());

//#dataTable> tbody>tr>td:nth-child(1)
        /*//Check for Single Portal
        Thread.sleep(2000);
            actionClass.setValueinTextbox(searchPortal,"Elance");
            actionClass.clickOnObject(btnSearch);
      verificationClass.isElementPresent(searchPortaldata,"Elance");}*/
    }

    public void blankFile_UploadValidation() throws IOException, InterruptedException {


        ActionClass actionClass=new ActionClass(driver);
        VerificationClass verificationClass=new VerificationClass(driver);

        actionClass.clickOnObject(btnmenu);
        actionClass.clickOnObject(btnLeads);
        actionClass.clickOnObject(btnBIDSmenu);


        //Uploading a Blank file
        WebElement uploadElement = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/form/small/input"));
        uploadElement.sendKeys("/Users/Addweb-24/Downloads/import_student_sample_file.csv");
        actionClass.clickOnObject(btnUploadFile);
        verificationClass.checkToast(toast_blankUploadFile,"Upload file is empty.");
        Thread.sleep(2000);
        actionClass.screenCapture("Blank_BIDfile");
        ///=====================

    }

    public void sameURL_uploadValidation() throws IOException, InterruptedException {

        ActionClass actionClass = new ActionClass(driver);
        VerificationClass verificationClass = new VerificationClass(driver);

        //Routing to Add BIDS page
        actionClass.clickOnObject(btnmenu);
        actionClass.clickOnObject(btnLeads);
        actionClass.clickOnObject(btnBIDSmenu);
        ///=====================

        //Uploading duplicate entries file
        WebElement uploadElement = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/form/small/input"));
        uploadElement.sendKeys("//Users/Addweb-24/Downloads/sameURLs_UploadValidation - Sheet1.csv");
        ///=====================

        actionClass.clickOnObject(btnUploadFile);
        verificationClass.checkToast(toast_blankUploadFile,"Bid Url value in row number 1 is duplicate, please use different one");
        Thread.sleep(2000);
        actionClass.screenCapture("Duplicate_BIDvalue");
    }
}






