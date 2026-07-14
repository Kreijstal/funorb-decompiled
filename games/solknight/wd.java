/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wd {
    static String field_b;
    static int field_a;
    static volatile int field_d;
    static int field_c;

    final static void b(int param0) {
        jd var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        if (param0 == 8) {
          var1 = id.field_c;
          L0: while (true) {
            if (ec.e(param0 ^ 7697789)) {
              var1.e(8, -2147483648);
              var1.field_m = var1.field_m + 1;
              var2 = var1.field_m + 1;
              db.a(var1, (byte) -115);
              id.field_c.b(1, -var2 + var1.field_m);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    abstract ha c(int param0);

    abstract byte[] a(int param0, int param1);

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        var8 = SolKnight.field_L ? 1 : 0;
        if (param0 == 0) {
          L0: while (true) {
            param2--;
            if (0 <= param2) {
              var9 = param4;
              var5 = var9;
              var6 = param1;
              var7 = param3;
              var9[var6] = var7 - -fi.a(var9[var6] >> -978865983, 8355711);
              param1++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static pc a(String param0, int param1) {
        if (param0 == null) {
            return gb.field_h;
        }
        if (param0.length() == 0) {
            return gb.field_h;
        }
        int var3 = 27 / ((param1 - -77) / 33);
        int var2 = param0.indexOf('@');
        if (var2 == -1) {
            return h.field_a;
        }
        String var4 = param0.substring(0, var2);
        String var5 = param0.substring(1 + var2);
        pc var6 = ad.b((byte) -126, var4);
        if (!(var6 == null)) {
            return var6;
        }
        return ne.a(var5, 62);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 == 8355711) {
            return;
        }
        field_a = -50;
    }

    abstract int a(int param0, byte param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_b = "Email address is unavailable";
        field_a = 0;
    }
}
