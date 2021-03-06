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

WebUI.navigateToUrl('https://khangoi.com/blog/wp-login.php?redirect_to=https%3A%2F%2Fkhangoi.com%2Fblog%2Fwp-admin%2F&reauth=1')

WebUI.click(findTestObject('Page_Log In/a_Lost your password'))

WebUI.setText(findTestObject('Page_Lost Password/input_Username or Email Address_user_login'), 
    'hello@khangoi.com')

WebUI.click(findTestObject('Page_Lost Password/input_Username or Email Address_wp-submit'))

WebUI.click(findTestObject('Page_Lost Password/div_Error There is no account with that use_7ffa90'))

WebUI.verifyTextPresent('Error: There is no account with that username or email address.', false)

