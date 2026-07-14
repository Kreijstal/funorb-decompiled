/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static tf[] field_e;
    static int field_j;
    static String field_c;
    static il field_i;
    static ml[] field_d;
    static un field_b;
    static int field_h;
    static mg[] field_g;
    static eh field_a;
    static int field_f;

    final static void a(l param0, byte param1, l param2) {
        if (!(param2.field_a == null)) {
            param2.a(false);
        }
        int var3 = 37 / ((param1 - -12) / 33);
        param2.field_a = param0.field_a;
        param2.field_f = param0;
        param2.field_a.field_f = param2;
        param2.field_f.field_a = param2;
    }

    final static void a(int param0, java.awt.Canvas param1, int param2, int param3) {
        java.awt.Graphics var4 = param1.getGraphics();
        ca.field_M.a((byte) 120, param2, var4, param3);
        if (param0 != -30179) {
            return;
        }
        try {
            var4.dispose();
        } catch (Exception exception) {
            param1.repaint();
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        field_i = null;
        field_b = null;
        field_e = null;
        if (param0 != 6666) {
          var2 = null;
          td.a(-12, (java.awt.Canvas) null, -119, 111);
          field_c = null;
          field_g = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_g = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    final static mg[] a(int param0, int param1, int param2, eh param3) {
        Object var5 = null;
        if (hn.a(param3, param2, param0, (byte) 109)) {
          if (param1 != 6887) {
            var5 = null;
            mg[] discarded$2 = td.a(37, -9, -75, (eh) null);
            return kd.c(true);
          } else {
            return kd.c(true);
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "You must be a member to play with the current options.";
    }
}
