/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pm {
    static long field_g;
    static String field_d;
    static jk field_b;
    static String field_a;
    static int[] field_e;
    static sj field_f;
    static float field_c;

    final static int a(byte param0) {
        if (param0 != 26) {
            field_f = null;
            return wk.field_c;
        }
        return wk.field_c;
    }

    final static boolean a(boolean param0) {
        if (!param0) {
            return true;
        }
        return ll.field_C == pi.field_a ? true : false;
    }

    public static void a(int param0) {
        int var1 = 0 / ((-10 - param0) / 50);
        field_d = null;
        field_f = null;
        field_e = null;
        field_a = null;
        field_b = null;
    }

    final static de a(String param0, String param1, ah param2, ah param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        if (param4 > -39) {
          pm.a(118, -47);
          var5 = param2.a(-1, param0);
          var6 = param2.a(var5, false, param1);
          return hc.a(var5, (byte) 74, param2, var6, param3);
        } else {
          var5 = param2.a(-1, param0);
          var6 = param2.a(var5, false, param1);
          return hc.a(var5, (byte) 74, param2, var6, param3);
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TetraLink.field_J;
        var2 = 0;
        var3 = -(ra.field_f * ra.field_e);
        L0: while (true) {
          if (0 <= var3) {
            if (param0 != -16711936) {
              boolean discarded$2 = pm.a(true);
              return;
            } else {
              return;
            }
          } else {
            var4 = ra.field_b[var2];
            var5 = 16711935 & var4;
            var4 = var4 & 65280;
            var5 = var5 * param1;
            var4 = var4 * param1;
            var5 = var5 & -16711936;
            var4 = var4 & 16711680;
            var4 = (var5 | var4) >> 1750885544;
            var2++;
            ra.field_b[var2] = var4;
            var3++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Player";
        field_e = new int[8192];
        field_d = "<%0> has withdrawn the request to join.";
        field_b = new jk();
    }
}
