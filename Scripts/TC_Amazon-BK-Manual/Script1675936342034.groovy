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

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.setText(findTestObject('Object Repository/Amazon-Book/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'), 
    'book five')

WebUI.click(findTestObject('Object Repository/Amazon-Book/Page_Amazon.com. Spend less. Smile more/div_book five survive'))

WebUI.click(findTestObject('Object Repository/Amazon-Book/Page_Amazon.com  book five survive/span_Five Survive'))

WebUI.click(findTestObject('Amazon-Book/BookAmazon/Page_Amazon.com Five Survive 9780593374160 Jackson, Holly Books/btn_AddToCart'))

WebUI.click(findTestObject('Amazon-Book/BookAmazon/Page_Amazon.com Shopping Cart/btn_ProceedToCheckout'))

WebUI.setText(findTestObject('Amazon-Book/BookAmazon/Page_Amazon Sign-In/input_Email or mobile phone number_email'), 'test123')

WebUI.click(findTestObject('Amazon-Book/BookAmazon/Page_Amazon Sign-In/btn_SignIn'))

WebUI.verifyElementPresent(findTestObject('Amazon-Book/BookAmazon/Page_Amazon Sign-In/h4_There was a problem'), 0)

WebUI.click(findTestObject('Amazon-Book/BookAmazon/Page_Amazon Sign-In/a_Create your Amazon account'))

WebUI.closeBrowser()

