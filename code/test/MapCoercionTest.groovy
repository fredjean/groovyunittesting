// START:map
def attributes = [:]

def exec = [
    getNativeRequest: { -> return request },
    setAttribute: { name, value -> attributes[name] = value },
    isExplorer: { -> return isExplorer; }
] as Execution

def dummy = [:] as Execution
// END:map
// START:test
def Detector = new BrowserDetector()

//...

@Test void initMethodWithX11() {
    request.addHeader(BrowserDetector.USERAGENT, "Fake X11 Firefox 2.0.0.4")
    detector.init(exec, dummy)
    assert attributes[BrowserDetector.DEGRADEEXPERIENCE]
    assert !attributes["explorer"]
}
// END:test