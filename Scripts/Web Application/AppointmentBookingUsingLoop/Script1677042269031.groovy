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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Page_CURA Healthcare Service/btnMakeAppointment'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/txtuUsername'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Page_CURA Healthcare Service/txtPassword'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Page_CURA Healthcare Service/btnLogin'))

for (def n : (0..2)) {
    WebUI.selectOptionByIndex(findTestObject('Page_CURA Healthcare Service/ddHealthcareCenter'), 2)

    WebUI.click(findTestObject('Page_CURA Healthcare Service/cmbMedicaidprograms'))

    WebUI.delay(0)

    if (n == 0) {
        WebUI.click(findTestObject('Page_CURA Healthcare Service/cmbMedicaidprograms'))

        WebUI.delay(0)
    } else if (n == 1) {
        WebUI.click(findTestObject('Page_CURA Healthcare Service/cmbMedicareprograms'))

        WebUI.delay(0)
    } else {
        WebUI.click(findTestObject('Page_CURA Healthcare Service/cmbNoneprograms'))

        WebUI.delay(0)
    }
    
    WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'), '02/09/2022')

    WebUI.click(findTestObject('Page_CURA Healthcare Service/btnBookAppointment'))

    WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/h2_Appointment Confirmation'), 4)

    WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Go to Homepage'))
}

WebUI.closeBrowser()

