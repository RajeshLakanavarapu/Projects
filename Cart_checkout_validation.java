@Test
public void testCheckout() {
    driver.get("http://your-application-url.com/cart");

    // Click checkout
    driver.findElement(By.id("checkoutButton")).click();

    // Validate navigation to payment screen
    String paymentHeader = driver.findElement(By.id("paymentHeader")).getText();
    Assert.assertEquals(paymentHeader, "Payment Details");
}
