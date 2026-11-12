import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(
    findTestObject('Object Repository/Test Cases/Login/input_Username'),
    'standard_user'
)

WebUI.setText(
    findTestObject('Object Repository/Test Cases/Login/input_Password'),
    ''
)

WebUI.click(findTestObject('Object Repository/Test Cases/Login/input_login-button'))

WebUI.verifyElementVisible(
	findTestObject('Object Repository/Test Cases/Login/text_ErrorMessage')
)

WebUI.verifyElementText(
	findTestObject('Object Repository/Test Cases/Login/text_ErrorMessage'),
	'Epic sadface: Password is required'
)
