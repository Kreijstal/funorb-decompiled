/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static String field_a;
    static double[] field_d;
    static double[] field_e;
    static String field_c;
    static String field_b;
    static um field_g;
    static java.awt.Font field_f;

    final static hg a(int param0, int param1) {
        hg[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        hg[] var5 = null;
        var4 = Chess.field_G;
        var5 = ln.l(2);
        var2 = var5;
        var3 = param1;
        L0: while (true) {
          if (var5.length > var3) {
            if (var5[var3].field_e != param0) {
              var3++;
              continue L0;
            } else {
              return var5[var3];
            }
          } else {
            return null;
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_d = null;
        field_b = null;
        field_f = null;
        field_g = null;
        field_c = null;
        if (param0 > -30) {
            li.a(86);
        }
    }

    final static km a(int param0, byte param1, um param2, int param3) {
        if (tj.a(param3, param0, param2, (byte) 83)) {
          if (param1 != -2) {
            return null;
          } else {
            return hl.a(param1 + 2);
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_a = "Please send me news and updates (I can unsubscribe at any time)";
        field_d = new double[65536];
        field_e = new double[65536];
        for (var0 = 0; 65536 > var0; var0++) {
            field_d[var0] = Math.sin(3.141592653589793 * (double)var0 / 32768.0);
            field_e[var0] = Math.cos((double)var0 * 3.141592653589793 / 32768.0);
        }
        field_c = "You cannot join this game - it is in progress";
        field_b = "Error connecting to server. Please try using a different server.";
    }
}
