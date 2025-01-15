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

@Test
public void testAddItemsToCart() {
    driver.get("http://your-application-url.com/shopping");

    // Add items to the cart
    driver.findElement(By.id("addItemButton1")).click();
    driver.findElement(By.id("addItemButton2")).click();

    // Validate items in cart
    String cartItems = driver.findElement(By.id("cartItemCount")).getText();
    Assert.assertEquals(cartItems, "2 Items");
}

@Test
public void testCheckout() {
    driver.get("http://your-application-url.com/cart");

    // Click checkout
    driver.findElement(By.id("checkoutButton")).click();

    // Validate navigation to payment screen
    String paymentHeader = driver.findElement(By.id("paymentHeader")).getText();
    Assert.assertEquals(paymentHeader, "Payment Details");
}

@Test
public void testDeliveryDetails() {
    driver.get("http://your-application-url.com/delivery");

    // Validate delivery details are displayed
    String deliveryDetails = driver.findElement(By.id("deliveryDetails")).getText();
    Assert.assertTrue(deliveryDetails.contains("Expected Delivery:"));
}

@Test
public void testCategoryNavigation() {
    driver.get("http://your-application-url.com/shopping");

    // Navigate between categories
    driver.findElement(By.id("categoryElectronics")).click();
    driver.findElement(By.id("categoryClothing")).click();

    // Validate category navigation
    String currentCategory = driver.findElement(By.id("currentCategory")).getText();
    Assert.assertEquals(currentCategory, "Clothing");
}

@Test
public void testQuantityAdjustment() {
    driver.get("http://your-application-url.com/cart");

    // Adjust quantity
    driver.findElement(By.id("increaseQuantityButton")).click();

    // Validate updated quantity
    String quantity = driver.findElement(By.id("itemQuantity")).getText();
    Assert.assertEquals(quantity, "2");
}

@Test
public void testInvoiceDownload() {
    driver.get("http://your-application-url.com/order-summary");

    // Click download invoice
    driver.findElement(By.id("downloadInvoiceButton")).click();

    // Validate invoice downloaded (assuming UI updates with success message)
    String downloadMessage = driver.findElement(By.id("downloadMessage")).getText();
    Assert.assertEquals(downloadMessage, "Invoice downloaded successfully");
}


