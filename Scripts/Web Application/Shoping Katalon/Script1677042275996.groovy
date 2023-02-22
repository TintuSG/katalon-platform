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

WebUI.navigateToUrl('https://cms.demo.katalon.com/')

WebUI.click(findTestObject('Object Repository/shopKat/Page_Katalon Shop  Katalon Ecommerce/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/shopKat/Page_Katalon Shop  Katalon Ecommerce/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/shopKat/Page_Katalon Shop  Katalon Ecommerce/a_Add to cart_1'))

WebUI.click(findTestObject('shopKat/Page_Katalon Shop  Katalon Ecommerce/a_Cart'))

WebUI.click(findTestObject('Object Repository/shopKat/Page_Cart  Katalon Shop/a_Proceed to checkout'))

WebUI.click(findTestObject('Object Repository/shopKat/Page_Checkout  Katalon Shop/input__billing_first_name'))

WebUI.click(findTestObject('Object Repository/shopKat/Page_Checkout  Katalon Shop/button_Place order'))

WebUI.setText(findTestObject('Object Repository/shopKat/Page_Checkout  Katalon Shop/input__billing_first_name'), 'as')

WebUI.setText(findTestObject('Object Repository/shopKat/Page_Checkout  Katalon Shop/input__billing_last_name'), 'rt')

WebUI.setText(findTestObject('Object Repository/shopKat/Page_Checkout  Katalon Shop/input__billing_address_1'), 'ff')

WebUI.setText(findTestObject('Object Repository/shopKat/Page_Checkout  Katalon Shop/input_(optional)_billing_address_2'), 
    'eed')

WebUI.doubleClick(findTestObject('Object Repository/shopKat/Page_Checkout  Katalon Shop/input__billing_city'))

WebUI.setText(findTestObject('Object Repository/shopKat/Page_Checkout  Katalon Shop/input__billing_city'), 'fd')

WebUI.click(findTestObject('Object Repository/shopKat/Page_Checkout  Katalon Shop/span_Select an option'))

WebUI.setText(findTestObject('Object Repository/shopKat/Page_Checkout  Katalon Shop/input__billing_postcode'), '85142')

WebUI.setText(findTestObject('Object Repository/shopKat/Page_Checkout  Katalon Shop/input__billing_phone'), '3434353534')

WebUI.setText(findTestObject('Object Repository/shopKat/Page_Checkout  Katalon Shop/input__billing_email'), 'ty@gmail.com')

WebUI.click(findTestObject('Object Repository/shopKat/Page_Checkout  Katalon Shop/button_Place order'))

WebUI.closeBrowser()

