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

Mobile.startApplication('C:\\Users\\Syamsul Badri\\Downloads\\Happy Day Shopping_v1.1_apkpure.com.apk', true)

Mobile.tap(findTestObject('Object Repository/shop/android.widget.TextView - PROMOTIONS'), 0)

Mobile.tap(findTestObject('Object Repository/shop/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/shop/android.widget.TextView - Barrio Fiesta Twin Pack All in One Liquid Seasoning 250ml'), 
    0)

WebUI.delay(3)

Mobile.tap(findTestObject('Object Repository/shop/android.widget.TextView - Add to Bag'), 0)

Mobile.tap(findTestObject('shop2/android.widget.TextView - Your Bag'), 0)

Mobile.tap(findTestObject('Object Repository/shop/android.widget.TextView - Checkout'), 0)

Mobile.getText(findTestObject('Object Repository/shop2/android.widget.TextView - ENJOY FREE DELIVERY ON ORDERS OVER 20 - RIALS IN MUSCAT'), 
    0)

Mobile.closeApplication()
