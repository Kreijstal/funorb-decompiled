/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    private String field_b;
    static int[] field_d;
    static bg field_a;
    static String field_e;
    static ta field_g;
    static rg field_h;
    static int field_c;
    static int field_f;

    final void a(java.applet.Applet param0, int param1) {
        if (param1 != 447616545) {
            String discarded$0 = ((sj) this).toString();
        }
        eg.a("jagex-last-login-method", param1 + -447616669, ((sj) this).field_b, 31536000L, param0);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(int param0, String param1) {
        if (param0 != 2) {
            Object var4 = null;
            sj.a((String) null, 17, (String) null);
        }
        return ((sj) this).field_b.equals((Object) (Object) param1);
    }

    public static void a(byte param0) {
        field_h = null;
        field_d = null;
        field_g = null;
        field_e = null;
        if (param0 <= 10) {
            field_f = 60;
        }
        field_a = null;
    }

    sj(String param0) {
        ((sj) this).field_b = param0;
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = MinerDisturbance.field_ab;
        var3 = 0;
        var4 = lj.field_p;
        L0: while (true) {
          if (var3 >= ne.field_K.length) {
            L1: {
              if (param1 > 123) {
                break L1;
              } else {
                int discarded$1 = sj.a(-11, (byte) 112, -37);
                break L1;
              }
            }
            return -1;
          } else {
            var5 = mf.field_m[var3];
            if (0 <= var5) {
              var6 = hl.a(ne.field_K[var3], true, -15388);
              var7 = -(var6 >> -310215615) + rj.field_e;
              var4 = var4 + hi.field_z;
              if (hc.a(103, var4, nk.field_u - -(sn.field_d << 447616545), var7 - ka.field_a, param0, (ka.field_a << 418362849) + var6, param2)) {
                return var5;
              } else {
                var4 = var4 + (nk.field_u + (hi.field_z + (sn.field_d << 1554695361)));
                var3++;
                continue L0;
              }
            } else {
              var4 = var4 + vd.field_z;
              var3++;
              continue L0;
            }
          }
        }
    }

    final static void a(String param0, int param1, String param2) {
        if (param1 != 19260) {
            field_g = null;
        }
        jg.a(param0, param2, param1 + -19380, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new bg(10, 2, 2, 0);
        field_e = "This password contains your email address, and would be easy to guess";
        field_g = new ta();
        field_f = 0;
    }
}
