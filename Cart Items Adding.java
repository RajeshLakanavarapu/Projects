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
