import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.phptravels.net/')

WebUI.click(findTestObject('Object Repository/Page_PHPTRAVELS  Travel Technology/a_My Account'))

WebUI.click(findTestObject('Object Repository/Page_PHPTRAVELS  Travel Technology/a_Login'))

WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email_username'), 'mukesh@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Password_password'), '123456789')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.waitForPageLoad(10)

def loggedInUser = WebUI.getText(findTestObject('Object Repository/Page_My Account/h3_Hi Mukesh Sharma'))

assert WebUI.verifyMatch(loggedInUser, 'Hi, Mukesh Sharma', false)

WebUI.click(findTestObject('Object Repository/Page_My Account/a_Mukesh'))

WebUI.click(findTestObject('Object Repository/Page_My Account/a_Logout'))

WebUI.closeBrowser()