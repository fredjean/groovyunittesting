@Test void buttonClickCallsListener() {
  boolean clicked = false
  def listener = { event -> clicked = true }
  
  def button = new Button()
  button.addEventListener(Events.ON_CLICK, listener as EventListener)
  button.click()
  assert clicked : "Listener was not called"
}
