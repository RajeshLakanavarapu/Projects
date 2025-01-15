@Test
public void testDeliveryDetails() {
    driver.get("http://your-application-url.com/delivery");

    // Validate delivery details are displayed
    String deliveryDetails = driver.findElement(By.id("deliveryDetails")).getText();
    Assert.assertTrue(deliveryDetails.contains("Expected Delivery:"));
}
