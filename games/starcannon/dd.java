/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static ge field_b;
    static rb field_a;

    final synchronized static long b(int param0) {
        long var1 = 0L;
        L0: {
          var1 = System.currentTimeMillis();
          if ((db.field_C ^ -1L) < (var1 ^ -1L)) {
            ek.field_d = ek.field_d + (-var1 + db.field_C);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 < 55) {
          db.field_C = var1;
          return var1 + ek.field_d;
        } else {
          db.field_C = var1;
          return var1 + ek.field_d;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 >= -54) {
            field_a = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        if (param3 != -23466) {
            return;
        }
        try {
            var4 = param0.getGraphics();
            hg.field_y.a(param2, param1, var4, 19291);
            var4.dispose();
        } catch (Exception exception) {
            param0.repaint();
        }
    }

    final static boolean a(byte param0) {
        if (param0 <= 25) {
            boolean discarded$0 = dd.a((byte) 121);
            return sc.a(ll.b(116), true);
        }
        return sc.a(ll.b(116), true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ge();
    }
}
