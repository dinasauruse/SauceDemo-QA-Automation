import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Object Repository/Test Cases/Login/input_Username'), 'invalid_user')
WebUI.setText(findTestObject('Object Repository/Test Cases/Login/input_Password'), 'secret_sauce')
WebUI.click(findTestObject('Object Repository/Test Cases/Login/input_login-button'))
WebUI.verifyElementVisible(
	findTestObject('Object Repository/Test Cases/Login/text_ErrorMessage')
)

WebUI.verifyElementText(
	findTestObject('Object Repository/Test Cases/Login/text_ErrorMessage'),
	'Epic sadface: Username and password do not match any user in this service'
)
