/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    static boolean field_b;
    static String field_c;
    static String field_d;
    static ba field_a;

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        int var1 = -106 / ((param0 - 17) / 55);
        field_d = null;
    }

    final static float[] a(float[] param0, int param1, float[] param2) {
        float[] var3 = null;
        float[] var4 = null;
        var4 = new float[2];
        var3 = var4;
        if (param1 < 109) {
          return null;
        } else {
          var4[0] = -param0[0] + param2[0];
          var4[1] = param2[1] - param0[1];
          return var4;
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.removeMouseListener((java.awt.event.MouseListener) (Object) we.field_n);
        param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) we.field_n);
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) we.field_n);
        lf.field_a = 0;
        int var2 = -63 / ((-17 - param0) / 37);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_d = "Names cannot contain consecutive spaces";
    }
}
