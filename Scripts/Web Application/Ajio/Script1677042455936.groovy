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

WebUI.navigateToUrl('https://www.ajio.com/')

WebUI.setText(findTestObject('Object Repository/Web Application-Object Repository/Ajio/Page_Online Shopping for Women, Men, Kids  _34a021/input_Kuber Industries_searchVal'), 
    'jeans')

WebUI.click(findTestObject('Object Repository/Web Application-Object Repository/Ajio/Page_Online Shopping for Women, Men, Kids  _34a021/span_Kuber Industries_ic-search'))

WebUI.click(findTestObject('Object Repository/Web Application-Object Repository/Ajio/Page_Jeans/div_Solid Jogger Jeans with Drawstring'))

WebUI.switchToWindowTitle('Buy Black Jeans for Men by iVOC Online | Ajio.com')

WebUI.click(findTestObject('Object Repository/Web Application-Object Repository/Ajio/Page_Buy Black Jeans for Men by iVOC Online_f23005/span_ADD TO BAG'))

WebUI.click(findTestObject('Object Repository/Web Application-Object Repository/Ajio/Page_Buy Black Jeans for Men by iVOC Online_f23005/span_30'))

WebUI.click(findTestObject('Object Repository/Web Application-Object Repository/Ajio/Page_Buy Black Jeans for Men by iVOC Online_f23005/span_ADD TO BAG'))

WebUI.click(findTestObject('Object Repository/Web Application-Object Repository/Ajio/Page_Buy Black Jeans for Men by iVOC Online_f23005/span_GO TO BAG'))

WebUI.click(findTestObject('Object Repository/Web Application-Object Repository/Ajio/Page_Your Shopping Bag  AJIO/button_Proceed to shipping'))

WebUI.click(findTestObject('Object Repository/Web Application-Object Repository/Ajio/Page_Your Shopping Bag  AJIO/div_Sign In  Join AJIO_ic-close-quickview'))

WebUI.closeBrowser()

