/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    static int field_a;
    static dd field_b;
    static String field_e;
    static String field_c;
    static int field_d;

    final static int a(byte param0) {
        if (param0 < 33) {
            return 3;
        }
        return qk.field_g;
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 1) {
            field_b = null;
            field_e = null;
            return;
        }
        field_e = null;
    }

    final static kl a(di param0, int param1, String param2, String param3, di param4) {
        int var5 = 0;
        int var6 = 0;
        if (param1 != 32362) {
          field_d = 16;
          var5 = param4.b(param2, -1);
          var6 = param4.a(var5, 0, param3);
          return hi.a(107, var5, var6, param0, param4);
        } else {
          var5 = param4.b(param2, -1);
          var6 = param4.a(var5, 0, param3);
          return hi.a(107, var5, var6, param0, param4);
        }
    }

    final static short[] a(byte param0, int param1, short[] param2, short param3) {
        short[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        short[] var7 = null;
        var6 = Pool.field_O;
        var7 = new short[param1 + param2.length];
        var4 = var7;
        var5 = 0;
        L0: while (true) {
          if (param2.length > var5) {
            var7[var5] = param2[var5];
            var5++;
            continue L0;
          } else {
            L1: while (true) {
              if (var4.length <= var5) {
                if (param0 != -123) {
                  field_a = -15;
                  return var4;
                } else {
                  return var4;
                }
              } else {
                var4[var5] = (short)param3;
                var5++;
                continue L1;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Press F10 to open Quick Chat.";
        field_d = 1;
        field_e = "<%0> have won!";
    }
}
