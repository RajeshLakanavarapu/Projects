@Test
public void testUserRegistration() {
    driver.get("http://your-application-url.com/signup");
    
    // Locate and fill the signup form
    driver.findElement(By.id("username")).sendKeys("testUser");
    driver.findElement(By.id("email")).sendKeys("testUser@example.com");
    driver.findElement(By.id("password")).sendKeys("password123");
    driver.findElement(By.id("confirmPassword")).sendKeys("password123");
    
    // Submit the form
    driver.findElement(By.id("signupButton")).click();
    
    // Validate registration success message
    String successMessage = driver.findElement(By.id("successMessage")).getText();
    Assert.assertEquals(successMessage, "User registered successfully");
}
