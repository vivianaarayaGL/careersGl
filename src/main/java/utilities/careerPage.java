package utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    public class careerPage {
        protected WebDriver driver;
        private By careersTab = By.id("menu-item-409");

        public careerPage(WebDriver driver) {
            this.driver = driver;
        }

        public careerPage() {
        }

        public careerPage clickcareerTab () {
            System.out.println("clicking on careers tab");
            WebElement careertabElement=driver.findElement(careersTab);
            if(careertabElement.isDisplayed()||careertabElement.isEnabled())
                careertabElement.click();
            else System.out.println("Element not found");
            return new careerPage(driver);
        }


        public String getPageTitle(){
            String title = driver.getTitle();
            return title;
        }

        public boolean verifyBasePageTitle() {
            String expectedPageTitle="Jobs at Application Development Companies | Gorilla Logic";
            return getPageTitle().contains(expectedPageTitle);
        }
    }
