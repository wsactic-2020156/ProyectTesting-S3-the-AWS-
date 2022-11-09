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

WebUI.setText(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/input_Iniciar Sesin_formulario_username'), 
    'ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/input_Iniciar Sesin_formulario_password'), 
    'XmnPW7mE0VA=')

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/button_Iniciar Sesin'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/span_teoria del color.png'))

WebUI.setText(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/input_Solicitud_rc_select_0'), 
    'te')

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/div_teoria del color.png'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/button_Aprobar'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/button_OK'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/span_teoria del color.png'))

WebUI.setText(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/input_Solicitud_rc_select_0'), 
    'ja')

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/div_Javascript.jpg'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/button_Denegar'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/button_OK'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/a_Historiales'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/li_Requester wsactic  Nombre teoria del col_bbbb26'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/li_Requester wsactic  Nombre Javascript.jpg_ddea25'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/a_Volver'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/span_Cerrar Sesin'))

WebUI.setText(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/input_Iniciar Sesin_formulario_username'), 
    'wsactic')

WebUI.setEncryptedText(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/input_Iniciar Sesin_formulario_password'), 
    'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/button_Iniciar Sesin'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/div_Directorio_1'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/Page_React App/li_Directorio_1teoria del color.png'))

