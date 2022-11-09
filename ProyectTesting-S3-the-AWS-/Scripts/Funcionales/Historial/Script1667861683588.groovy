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

WebUI.setText(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/input_Iniciar Sesin_formulario_username'), 
    'ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/input_Iniciar Sesin_formulario_password'), 
    'XmnPW7mE0VA=')

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/button_Iniciar Sesin'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/a_Historiales'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/li_Requester jsolis  Nombre valorant.jpg  D_936554'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/li_Requester jsolis  Nombre pikachu.jpg  De_396736'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/li_Requester jsolis  Nombre pikasuke.jpg  D_350003'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/li_Requester jsolis  Nombre spideys balan.j_6bbd17'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/li_Requester jsolis  Nombre didpul 2 duo.jp_49b599'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/li_Requester jsolis  Nombre spidey 2 duo.jp_0ba81d'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/li_Requester jsolis  Nombre valorant.jpg  D_17140f'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/li_Requester jsolis  Nombre pikachu.jpg  De_9bbad5'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/li_Requester jsolis  Nombre spidermans.jpg _57a469'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/li_Requester wsactic  Nombre kohaku-isekai-_ac3918'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/li_Requester jsolis  Nombre Jira-AlburezLog_113409'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/li_Requester wsactic  Nombre Screenshot_202_2b1d4b'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/li_Requester wsactic  Nombre Violet Evergar_e0430f'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/li_Requester wsactic  Nombre teoria del col_bbbb26'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/li_Requester wsactic  Nombre fondo.png  Descripcin'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/li_Requester jsolis  Nombre casa.png  Descr_63f02a'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/li_Requester bpalma  Nombre Fondo de pantal_ceb643'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/li_Requester jsolis  Nombre didpul duo.jpg _967eda'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/li_Requester jsolis  Nombre spideys balan.j_310711'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/li_Requester wsactic  Nombre Screenshot_202_4b2c2f'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/li_Requester jsolis  Nombre didpul duo.jpg _73fe99'))

WebUI.click(findTestObject('Object Repository/CreacionCarpetas/Page_React App/Page_React App/li_Requester wsactic  Nombre Javascript.jpg_ddea25'))

