/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static String field_e;
    static int[][] field_c;
    static eh field_a;
    static String field_b;
    static String field_d;
    static String field_g;
    static int field_f;

    final static void a(int param0, ja param1) {
        m.c(540);
        if (param0 != 0) {
            return;
        }
        oo.a(param1.field_B, param1.field_z, param1.field_u);
    }

    public static void a(boolean param0) {
        field_a = null;
        field_d = null;
        field_g = null;
        field_c = null;
        field_e = null;
        field_b = null;
        if (!param0) {
            Object var2 = null;
            r.a(3, (ja) null);
        }
    }

    final static po a(ul param0, int param1, byte param2) {
        byte[] var5 = param0.a((byte) -77, param1);
        byte[] var3 = var5;
        if (var5 == null) {
            return null;
        }
        if (param2 != 15) {
            Object var4 = null;
            r.a(-29, (ja) null);
        }
        return new po(var5);
    }

    final static ao a(int param0, byte param1) {
        ao[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        ao[] var5 = null;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          var5 = wm.b(true);
          var2 = var5;
          if (param1 == 35) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var3 < var5.length) {
            if (var5[var3].field_g == param0) {
              return var5[var3];
            } else {
              var3++;
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Player names can be up to 12 letters, numbers and underscores";
        field_d = "Retry (<%0> Left)";
        field_b = "Rankings";
        field_g = "Reject <%0> from this game";
    }
}
