/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ee extends DualLinkNode {
    static int field_p;
    static int field_r;
    static Sprite field_q;

    final static void detachMouseListeners(java.awt.Component param0, int param1) {
        try {
          param0.removeMouseListener(tc.mouseHandler);
          param0.removeMouseMotionListener(tc.mouseHandler);
          param0.removeFocusListener(tc.mouseHandler);
          ve.pressedButton = 0;
          if (param1 != 6769) {
            java.awt.Component var3 = (java.awt.Component) null;
            ee.detachMouseListeners((java.awt.Component) null, -20);
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ee.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_q = null;
        if (param0 != -21880) {
          java.awt.Component var2 = (java.awt.Component) null;
          ee.detachMouseListeners((java.awt.Component) null, 97);
        }
    }

    ee() {
    }

    static {
        field_p = 104;
        field_r = -1;
    }
}
