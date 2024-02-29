//package CMDS_SIT_Testcases;
//
//import java.io.IOException;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import com.cmds.base.BasePage;
//
//import utils.ExcelDataProvider;
//
//public class cmdsDemo extends BasePage {
//
//	public cmdsDemo() {
//
//	}
//
//	WebDriver driver = new ChromeDriver();
//	BasePage basePage = new BasePage();
//	ExcelDataProvider testData;
//
//	@DataProvider(name = "users")
//	public Object[][] getUsers() throws IOException {
//		testData = new ExcelDataProvider();
//		Object data[][] = testData.getTestData("td_users", "Sheet1");
//		return data;
//	}
////
////	@BeforeSuite(alwaysRun = true)
////	public void login() throws InterruptedException {
////
////	}
//
//	@Test(priority = 1, dataProvider = "users", description = "Login Test")
//	public void abc(String username, String password, String fullName) throws InterruptedException {
//
//		basePage.cmdsLogin(driver, username, password);
//
//		System.out.println("----------------Test Success------------------------");
//	}
//
////	@Test(groups = { "Functionality" })
////	public static void main(String args[]) throws InterruptedException {
////
////	}
//}