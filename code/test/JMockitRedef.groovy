// START:intest
import mockit.Mockit
import org.zkoss.zk.ui.Path
//...
@Test void redefineInTest() {
    Mockit.redefineMethods(Path, MockPath)
    //...
}
// END:intest
// START:before
@Before void setup() {
    Mockit.redefineMethods(DesktopUtil, MockDesktopUtil)
}
// END:before
// START:test
@Test void goodPath() {
    Mockit.redefineMethods(Path, MockPath)
    instance.execute(new ActionCommandItemState(actionCommandItem, false, false), null)
    assert MockPath.passedPath == "//inventory/inventory_window"
    assert MockDesktopUtil.passedUrl == url
}
// END:test