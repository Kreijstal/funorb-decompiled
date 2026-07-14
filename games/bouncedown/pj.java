/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj implements fc {
    static uf field_a;
    static int field_b;
    static si field_c;

    final static void a(gk param0, int param1, boolean param2, rb param3) {
        fe.field_i = param1 * mg.f(66) / 1000;
        fd.a(param0, -1);
        ci.a((byte) -116, param0);
        ub.a((byte) -32, param0);
        if (param2) {
            field_a = null;
        }
        rj.a(255);
        ta.c(0);
        oa.field_a = -fe.field_i + 0;
    }

    final static boolean a(byte param0) {
        if (param0 < 18) {
            return true;
        }
        return ij.field_a;
    }

    final static void a(boolean param0, int param1) {
        q.field_N.a(0, 0, -56);
        if (param1 != 1) {
            Object var3 = null;
            int discarded$0 = pj.a(true, 'ﾺ', (CharSequence) null);
        }
    }

    public static void a(int param0) {
        if (param0 != -4) {
            pj.a(-34);
        }
        field_c = null;
        field_a = null;
    }

    public final void a(int param0, lk param1, byte param2, boolean param3, int param4) {
        int var6 = param4 + param1.field_r;
        int var7 = param0 - -param1.field_i;
        dh.a(var7, 1232050056, param1.field_k, var6, param1.field_m);
        tg var8 = la.field_E[1];
        if (param1 instanceof wd) {
            if (!(!((wd) (Object) param1).field_z)) {
                var8.a((-var8.field_t + param1.field_k >> -1402616191) + (1 + var6), var7 - -1 - -(param1.field_m - var8.field_o >> -1972647999), 256);
            }
        }
        if (param1.e(1)) {
            ck.a(2 + var6, param1.field_m + -4, -4 + param1.field_k, 2 + var7, 14677);
        }
        int var9 = 51 % ((param2 - -60) / 56);
    }

    final static int a(boolean param0, char param1, CharSequence param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Bounce.field_N;
          var3 = 0;
          var4 = param2.length();
          if (!param0) {
            break L0;
          } else {
            boolean discarded$2 = pj.a((byte) -103);
            break L0;
          }
        }
        var5 = 0;
        L1: while (true) {
          if (var5 >= var4) {
            return var3;
          } else {
            if (param2.charAt(var5) == param1) {
              var3++;
              var5++;
              continue L1;
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 20;
    }
}
