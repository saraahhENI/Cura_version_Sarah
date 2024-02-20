import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.sql.Driver as Driver
import java.sql.DriverManager as DriverManager
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('Scripts/Log as John Doe'), [:], FailureHandling.STOP_ON_FAILURE)

if (page.equals(GlobalVariable.Summary_URI)) {
	WebUI.callTestCase(findTestCase('Scripts/Book Appointment'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.navigateToUrl(GlobalVariable.BASE_URL + page)

WebUI.click(findTestObject('Burger Menu/Toggle Menu'))

WebUI.verifyElementText(findTestObject('Burger Menu/Title'), 'CURA Healthcare')

WebUI.verifyElementPresent(findTestObject('Burger Menu/Home'), 0)

WebUI.verifyElementPresent(findTestObject('Burger Menu/History'), 0)

WebUI.verifyElementPresent(findTestObject('Burger Menu/Logout'), 0)

WebUI.verifyElementPresent(findTestObject('Burger Menu/Profile'), 0)

WebUI.verifyElementNotPresent(findTestObject('Burger Menu/Login'), 1)

