/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CurrentGraphicsToolkit {
    static GraphicsToolkit toolkit;

    final static void intersectClip(int param0, int param1, int param2, int param3, int param4) {
        HardwareBlendMode.pushRasterState(-29711);
        if (param0 != -21953) {
          return;
        }
        SoftwareRasterizer.intersectClip(param1, param3, param2, param4);
    }

    public static void releaseStatics(int param0) {
        toolkit = null;
        if (param0 < 40) {
          toolkit = (GraphicsToolkit) null;
        }
    }

    static {
    }
}
