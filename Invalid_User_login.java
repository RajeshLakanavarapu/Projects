@Test
public void testInvalidUserIdLogin() {
    driver.get("http://your-application-url.com/login");

    // Enter invalid user ID
    driver.findElement(By.id("email")).sendKeys("invalidUser@example.com");
    driver.findElement(By.id("password")).sendKeys("password123");
    
    // Click login
    driver.findElement(By.id("loginButton")).click();

    // Validate warning message
    String errorMessage = driver.findElement(By.id("errorMessage")).getText();
    Assert.assertEquals(errorMessage, "Invalid User Id");
}
