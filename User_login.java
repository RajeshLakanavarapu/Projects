@Test
public void testUserLoginValid() {
    driver.get("http://your-application-url.com/login");

    // Enter valid credentials
    driver.findElement(By.id("email")).sendKeys("testUser@example.com");
    driver.findElement(By.id("password")).sendKeys("password123");
    
    // Click login
    driver.findElement(By.id("loginButton")).click();

    // Validate successful login
    String welcomeMessage = driver.findElement(By.id("welcomeMessage")).getText();
    Assert.assertEquals(welcomeMessage, "Welcome, testUser!");
}
