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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/OHR/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/OHR/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/OHR/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/OHR/Page_OrangeHRM/path_Today_cls-1'))

WebUI.setText(findTestObject('Object Repository/OHR/Page_OrangeHRM/input'), 'Duane Griffin Parks')

WebUI.click(findTestObject('Object Repository/OHR/Page_OrangeHRM/div_-- Select --'))

WebUI.click(findTestObject('Object Repository/OHR/Page_OrangeHRM/i_From Date_oxd-icon bi-calendar oxd-date-i_f3a9ef'))

WebUI.click(findTestObject('Object Repository/OHR/Page_OrangeHRM/div_21'))

WebUI.click(findTestObject('Object Repository/OHR/Page_OrangeHRM/i_From Date_oxd-icon bi-calendar oxd-date-i_f3a9ef'))

WebUI.click(findTestObject('Object Repository/OHR/Page_OrangeHRM/div_22'))

WebUI.click(findTestObject('Object Repository/OHR/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.click(findTestObject('Object Repository/OHR/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.click(findTestObject('Object Repository/OHR/Page_OrangeHRM/button_Assign'))

WebUI.click(findTestObject('Object Repository/OHR/Page_OrangeHRM/button_Ok'))

WebUI.click(findTestObject('Object Repository/OHR/Page_OrangeHRM/span_Performance'))

WebUI.click(findTestObject('Object Repository/OHR/Page_OrangeHRM/span_My Info'))

WebUI.setText(findTestObject('Object Repository/OHR/Page_OrangeHRM/input_Employee Full Name_firstName'), 'Sh eo')

WebUI.click(findTestObject('Object Repository/OHR/Page_OrangeHRM/button_Save'))

WebUI.closeBrowser()

