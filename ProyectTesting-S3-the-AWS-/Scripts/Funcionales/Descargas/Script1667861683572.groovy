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

WebUI.setText(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/input_Iniciar Sesin_formulario_username'), 
    'ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/input_Iniciar Sesin_formulario_password'), 
    'XmnPW7mE0VA=')

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/button_Iniciar Sesin'))

WebUI.setText(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/input_Solicitud_rc_select_0'), 
    'JA')

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/div_Javascript.jpg'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/button_Descargar'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/img__swal2-image'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/h2_Operacon exitosa'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/div_Archivo descargado exitosamente'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Solicitud/Page_React App/Page_React App/button_OK'))

