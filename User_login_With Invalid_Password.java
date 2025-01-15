@Test
public void testInvalidPasswordLogin() {
    driver.get("http://your-application-url.com/login");

    // Enter valid user ID and invalid password
    driver.findElement(By.id("email")).sendKeys("testUser@example.com");
    driver.findElement(By.id("password")).sendKeys("wrongPassword");
    
    // Click login
    driver.findElement(By.id("loginButton")).click();

    // Validate warning message
    String errorMessage = driver.findElement(By.id("errorMessage")).getText();
    Assert.assertEquals(errorMessage, "Invalid Password");
}
