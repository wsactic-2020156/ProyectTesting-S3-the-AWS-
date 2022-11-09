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

WebUI.navigateToUrl('https://s3-internship-project.herokuapp.com/')

WebUI.setText(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/Page_React App/input_Iniciar Sesin_formulario_username'), 
    'wsactic')

WebUI.setEncryptedText(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/Page_React App/input_Iniciar Sesin_formulario_password'), 
    'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/Page_React App/button_Iniciar Sesin'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/Page_React App/div_Seleecciona un directorio'))

WebUI.setText(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/Page_React App/input_Directorio_rc_select_0'), 
    'dire')

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/Page_React App/div_Directorio_1'))

WebUI.setText(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/Page_React App/input_Directorio_rc_select_0'), 
    'dire')

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/Page_React App/div_Directorio_4'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/Page_React App/li_Directorio_4Screenshot_20220720-192107_I_730136'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/Page_React App/li_Directorio_4kohaku-isekai-wa-smartphone.jpg'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/Page_React App/span_Directorio_4'))

WebUI.setText(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/Page_React App/input_Directorio_rc_select_0'), 
    'dire')

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/Page_React App/div_Directorio_imagenes'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/Page_React App/span_Cargar'))

WebUI.setText(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/Page_React App/input_Cargar_ant-input ant-input-lg'), 
    'porta')

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/Page_React App/button_Solicitar'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/Page_React App/button_OK'))

