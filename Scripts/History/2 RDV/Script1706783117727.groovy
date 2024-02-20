import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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

WebUI.callTestCase(findTestCase('Scripts/Log as John Doe'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Scripts/Book Appointment'), [('date') : '', ('facility') : facility1, ('readmission') : readmission1
        , ('healthcareProgram') : healthcareProgram1, ('comment') : comment1], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Scripts/Book Appointment'), [('date') : '', ('facility') : facility2, ('readmission') : readmission2
        , ('healthcareProgram') : healthcareProgram2, ('comment') : comment2], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Burger Menu/Toggle Menu'))

WebUI.click(findTestObject('Burger Menu/History'))

WebUI.callTestCase(findTestCase('Scripts/Verify History'), [('facility') : facility1, ('readmission') : readmission1, ('healthcareProgram') : healthcareProgram1
        , ('comment') : comment1, ('historyNumber') : '1'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Scripts/Verify History'), [('facility') : facility2, ('readmission') : readmission2, ('healthcareProgram') : healthcareProgram2
        , ('comment') : comment2, ('historyNumber') : '2'], FailureHandling.STOP_ON_FAILURE)
