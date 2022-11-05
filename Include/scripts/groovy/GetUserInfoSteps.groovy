import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class GetUserInfoSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	//	Get User info valid
	@Given("Get call to url user info")
	def getUserInfo() {
		println ("\n I inside Get call user info")
		response = WS.sendRequest(findTestObject('Authorization/GetUserInformation'))
	}

	@Then("response url user info is 200")
	def responseUserInfo() {
		println("\n I inside response code 200")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode)
	}

	@Given("Get call to url user info with method POST")
	def getUserInfoWithMethodPost() {
		println ("\n I inside Get call user info")
		response = WS.sendRequest(findTestObject('Authorization/GetUserInfoNegative'))
	}

	@Then("response url post userinfo is 405")
	def responseURLPostUserInfois405() {
		println("\n I inside response code 405")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode2)
	}
}