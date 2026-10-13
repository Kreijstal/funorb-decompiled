/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static RgbSprite[] field_b;
    static int field_a;
    static int field_c;

    final static void a(int param0, java.awt.Component param1) {
        param1.removeMouseListener(lj.mouseInput);
        param1.removeMouseMotionListener(lj.mouseInput);
        if (param0 != 20616) {
          return;
        }
        try {
          param1.removeFocusListener(lj.mouseInput);
          kb.liveHeldButton = 0;
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "b.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
          field_a = 50;
        }
    }

    static {
        field_a = -1;
    }
}
