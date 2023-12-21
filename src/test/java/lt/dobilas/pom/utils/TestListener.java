package lt.dobilas.pom.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class TestListener implements ITestListener {
    private void takeScreenshot() {

        try {
            TakesScreenshot screenshot = (TakesScreenshot) Driver.getDriver();
            File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);

            File file = new File("screenshot.png");
            FileUtils.copyFile(screenshotFile, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot();
    }
}
