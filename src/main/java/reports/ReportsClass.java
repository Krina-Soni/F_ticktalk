package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.sql.SQLException;

    public class ReportsClass {
        public static ExtentHtmlReporter htmlReporter;
        public static ExtentReports extent;
        public static ExtentTest logger;

        @BeforeSuite
        public void initReport() throws SQLException
        {
            htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/TickTalk_ScriptExecution_Report.html");
            extent = new ExtentReports ();
            extent.attachReporter(htmlReporter);
            extent.setSystemInfo("Host Name", "Ticktalk");
            extent.setSystemInfo("Environment", "Ticktalk Report");
            extent.setSystemInfo("User Name", "Krina");

            htmlReporter.config().setDocumentTitle("Ticktalk TestCase");
            htmlReporter.config().setReportName("Ticktalk Test Report");
            htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
            htmlReporter.config().setTheme(Theme.DARK);
        }

        @AfterSuite
        public void tearDown() throws IOException {
            extent.flush();

        }
    }