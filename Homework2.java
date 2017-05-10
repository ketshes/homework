import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Homework2 {

    @DataProvider(name = "LogIn") {
             public Object[][] LogIn () {
            return new Object[][]{{"Maria", "Maria1987"}, {"", ""},};
        }

        @BeforeMethod {
            WebDriver driver = new FirefoxDriver();
            String baseUrl = "https://www.facebook.com/";
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }


        class CVSDataProvider {

                @DataProvider(name = "CVSLogInLogIn")

            public Object[][] CSVLogIn() {
                List<Object> matrix = new LinkedList<Object>();
                Scanner sсanner = new Scanner(new File("data.cvs.txt"));

                for (int i = 0; s.hasNext(); i++) {
                    Scanner s = new Scanner(scanner.nextLine());
                    //очередная строка матрицы
                    List<Object> row = new LinkedList<Object>();

                    for (int col = 0; s.hasNext(); col++) {
                        row.add(s.next());
                    }

                    matrix.add(row);
                    s.close();
                }
                scanner.close();

                Object[][] result = new Object[][ matrix.size()];
                for (int i = 0; i < result.length; i++) {
                    List<Object> row = matrix.get(i);

                    result[i] = new Object[row.size()];
                    row.toArray(result[i]);
                }

                return result;
            }
        }


            @Test(dataProvider = "LogIn") {

                public void LogInTest (String username, String password){
                    WebDriver driver = new FirefoxDriver;
                    String baseUrl = "https://www.facebook.com/";
                    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


                    driver.get(baseUrl);
                    driver.findElement(By.id("vs0p1c0")).click();
                    driver.findElement(By.id("u_0_q")).click();
                    driver.findElement(By.id("email")).clear();


                    driver.findElement(By.id("email")).sendKeys(username);
                    driver.findElement(By.id("pass")).clear();
                    driver.findElement(By.id("pass")).sendKeys(password);
                    driver.findElement(By.id("u_0_r")).click();
                    driver.findElement(By.id("loginbutton")).click();
                }

                @Test(dataProvider = "CSVLogIn")

                public void CSVLogIn (String username1, String password1){


                    driver.findElement(By.id("email")).sendKeys(nextLine[0]);
                    driver.findElement(By.id("pass")).clear();
                    driver.findElement(By.id("pass")).sendKeys(nextLine[1]);
                    driver.findElement(By.id("u_0_r")).click();
                    driver.findElement(By.id("loginbutton")).click();
                }


                @AfterClass(alwaysRun = true) {
                    driver.close();
                }

            }
        }
    }



