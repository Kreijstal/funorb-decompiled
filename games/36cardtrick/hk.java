/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    static String field_c;
    static java.awt.Font field_a;
    static int field_b;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 < 107) {
            hk.a((byte) 65, -66, -69);
        }
    }

    final static ha[] a(int param0, w param1) {
        int var2 = 0;
        int var3 = 0;
        ha[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ha var7_ref = null;
        int var8 = 0;
        var8 = Main.field_T;
        var2 = param1.g(8, -1);
        if (-1 > (var2 ^ -1)) {
          return null;
        } else {
          var3 = param1.g(12, -1);
          var4 = new ha[var3];
          var5 = 0;
          var6 = -40 % ((12 - param0) / 38);
          L0: while (true) {
            if (var3 <= var5) {
              return var4;
            } else {
              if (!di.a((byte) -78, param1)) {
                var7 = param1.g(hj.b(-27571, -1 + var5), -1);
                var4[var5] = var4[var7];
                var5++;
                var5++;
                continue L0;
              } else {
                var7_ref = new ha();
                int discarded$6 = param1.g(24, -1);
                int discarded$7 = param1.g(24, -1);
                var7_ref.field_b = param1.g(24, -1);
                int discarded$8 = param1.g(9, -1);
                int discarded$9 = param1.g(12, -1);
                int discarded$10 = param1.g(12, -1);
                int discarded$11 = param1.g(12, -1);
                var4[var5] = var7_ref;
                var5++;
                var5++;
                continue L0;
              }
            }
          }
        }
    }

    final static void a(byte param0, int param1, int param2) {
        gl.a(param2, jd.field_c[param1], ca.field_c[param1], 804);
        if (param0 <= 121) {
            w var4 = (w) null;
            ha[] discarded$0 = hk.a(-7, (w) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Confirm Password: ";
    }
}
