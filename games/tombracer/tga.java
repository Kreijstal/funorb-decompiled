/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tga {
    static GraphicsToolkit field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        gb.a(-29711);
        if (param0 != -21953) {
          return;
        }
        SoftwareRasterizer.g(param1, param3, param2, param4);
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 < 40) {
          field_a = (GraphicsToolkit) null;
        }
    }

    static {
    }
}
