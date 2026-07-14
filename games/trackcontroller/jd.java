/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd implements t {
    static String field_h;
    private int field_k;
    private int field_a;
    private int field_i;
    static qj field_g;
    private oh field_c;
    private int field_e;
    private int field_b;
    static int field_d;
    static String field_f;
    private int field_j;

    public final void a(int param0, al param1, int param2, boolean param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        qk var12 = null;
        al stackIn_3_0 = null;
        al stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          var11 = TrackController.field_F ? 1 : 0;
          if (param1 instanceof qk) {
            stackOut_2_0 = (al) param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (al) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (qk) (Object) stackIn_3_0;
          ll.c(param1.field_p + param4, param1.field_m + param2, param1.field_x, param1.field_u, ((jd) this).field_a);
          if (var12 == null) {
            break L1;
          } else {
            break L1;
          }
        }
        var7 = -(2 * var12.field_I) + param1.field_x;
        var8 = param1.field_p + param4 + var12.field_I;
        var9 = var12.field_P + (param1.field_m + param2);
        ll.e(var8, var9, var8 - -var7, var9, ((jd) this).field_k);
        var10 = -1 + var12.c(true);
        L2: while (true) {
          if (-1 < (var10 ^ -1)) {
            if (param0 == -24969) {
              L3: {
                if (null != ((jd) this).field_c) {
                  ((jd) this).field_c.b(var12.field_s, var8 + var7 / 2, var9 + ((jd) this).field_c.field_q + var12.field_P, ((jd) this).field_j, ((jd) this).field_e);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            } else {
              return;
            }
          } else {
            ll.f(var12.a(param0 ^ 24968, var10) * var7 / var12.k(26856) + var8, var9, ((jd) this).field_i, ((jd) this).field_b);
            var10--;
            continue L2;
          }
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_f = null;
        if (param0 != -12814) {
            field_g = null;
        }
        field_g = null;
    }

    final static oi a(String param0, int param1) {
        int var5 = 0;
        String var6 = null;
        oi var7 = null;
        int var8 = TrackController.field_F ? 1 : 0;
        int var2 = param0.length();
        if (!(var2 != 0)) {
            return oc.field_j;
        }
        if (!(param1 >= var2)) {
            return bl.field_c;
        }
        String[] var3 = te.a(param0, '.', (byte) -67);
        if (!(2 <= var3.length)) {
            return oc.field_j;
        }
        String[] var4 = var3;
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = kf.a(var6, true);
            if (var7 != null) {
                return var7;
            }
        }
        return u.a(var3[var3.length - 1], true);
    }

    final static qj[] a(int param0, int param1, int param2, kk param3) {
        if (!sk.a(param1, param3, param0 + -4763, param2)) {
            return null;
        }
        if (param0 != 4764) {
            return null;
        }
        return dh.e(param0 ^ 4766);
    }

    jd(oh param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((jd) this).field_k = param3;
        ((jd) this).field_i = param5;
        ((jd) this).field_b = param6;
        ((jd) this).field_a = param4;
        ((jd) this).field_c = param0;
        ((jd) this).field_j = param1;
        ((jd) this).field_e = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Start Game";
        field_f = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
