/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    static dd field_c;
    static int field_a;
    static int field_b;

    final static bi[] a(int param0, int param1, int param2, rh param3) {
        if (ha.a(param3, -32180, param1, param0)) {
          if (param2 != -1) {
            be.a(true);
            return pg.b(0);
          } else {
            return pg.b(0);
          }
        } else {
          return null;
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
            field_c = null;
        }
    }

    final static void a(int param0, java.awt.Canvas param1, byte param2, int param3) {
        java.awt.Graphics var4 = null;
        if (param2 >= -16) {
            field_a = -24;
        }
        try {
            var4 = param1.getGraphics();
            gi.field_b.a(var4, param0, param3, (byte) 64);
            var4.dispose();
        } catch (Exception exception) {
            param1.repaint();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
    }
}
