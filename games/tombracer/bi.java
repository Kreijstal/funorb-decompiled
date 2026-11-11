/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static fta field_a;
    static int field_c;
    static su field_d;
    static String[] field_b;

    public static void releaseStatics(boolean param0) {
        field_a = null;
        field_b = null;
        if (param0) {
          GraphicsToolkit var2 = (GraphicsToolkit) null;
          bi.a((GraphicsToolkit) null, 112);
          field_d = null;
          return;
        }
        field_d = null;
    }

    final static void a(GraphicsToolkit param0, int param1) {
        ClipStack var2 = null;
        UiComponent var3 = null;
        try {
          var2 = IntrusiveDequeCursor.getClipStack((byte) 65, param0);
          var3 = SimpleMoveLocomotor.field_s;
          var2.pushIntersectClip(var3.field_q + var3.field_G, var3.field_A, (byte) -12, var3.field_t + var3.field_A, var3.field_q);
          param0.SA(param1, var3.field_A, SoftwareRasterizer.width, var3.field_t, SoftwareRasterizer.pixels, SoftwareRasterizer.width * var3.field_A, SoftwareRasterizer.width);
          var2.popClip(param1 ^ -64);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "bi.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_a = new fta();
        field_d = new su(7, 0, 1, 1);
        field_b = new String[]{"All scores", "My scores", "Best each"};
    }
}
