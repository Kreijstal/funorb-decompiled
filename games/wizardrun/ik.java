/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik extends mi {
    private int field_M;
    private int field_L;
    private String field_I;
    static String field_H;
    static tb field_G;
    private int field_J;
    private vd field_N;
    private boolean field_O;
    static int field_K;

    final static void g(int param0) {
        ki.h((byte) 91);
        wi.field_J = true;
        lc.field_d = true;
        u.field_A.d(false);
        int var1 = -82 / ((param0 - 71) / 54);
        fc.a(uh.field_f, false, -124);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param0 + ((ik) this).field_o;
        int var6 = param3 + ((ik) this).field_l;
        super.a(param0, param1, param2, param3);
        if (!(param2 == 0)) {
            return;
        }
        int var7 = !((ik) this).field_O ? 0 : -((ik) this).field_M + ((ik) this).field_r + -(((ik) this).field_L * 2);
        int discarded$0 = ((ik) this).field_N.a(((ik) this).field_I, var5 + var7 - -((ik) this).field_L, ((ik) this).field_L + var6, ((ik) this).field_M + -((ik) this).field_L, -(2 * ((ik) this).field_L) + ((ik) this).field_n, ((ik) this).field_J, -1, !((ik) this).field_O ? 2 : 0, 1, ((ik) this).field_N.field_M);
    }

    ik(int param0, int param1, int param2, int param3, ub param4, boolean param5, int param6, int param7, vd param8, int param9, String param10) {
        super(param0, param1, param2, param3, (bf) null, (ce) null);
        ((ik) this).field_J = param9;
        ((ik) this).field_M = param6;
        ((ik) this).field_I = param10;
        ((ik) this).field_N = param8;
        ((ik) this).field_L = param7;
        ((ik) this).field_F = param4;
        ((ik) this).field_O = param5 ? true : false;
        int var12 = -((ik) this).field_L + ((ik) this).field_M;
        int var13 = ((ik) this).field_N.a(param10, var12, ((ik) this).field_N.field_M) - -(((ik) this).field_L * 2);
        if (param3 < var13) {
            ((ik) this).a(118, param1, var13, param2, param0);
        } else {
            var13 = param3;
        }
        int var14 = !((ik) this).field_O ? ((ik) this).field_M - -(2 * ((ik) this).field_L) : 0;
        ((ik) this).field_F.a(118, (var13 + -param3 >> -64404223) + ((ik) this).field_L, -(((ik) this).field_L * 2) + param3, -((ik) this).field_M + (param2 + -(((ik) this).field_L * 3)), var14);
    }

    public static void f(int param0) {
        field_G = null;
        field_H = null;
        if (param0 > -85) {
            field_K = 65;
        }
    }

    final String c(boolean param0) {
        int var2 = 0;
        String var3 = null;
        ub stackIn_1_0 = null;
        ub stackIn_2_0 = null;
        ub stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        ub stackOut_0_0 = null;
        ub stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        ub stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var2 = ((ik) this).field_F.field_v ? 1 : 0;
          ((ik) this).field_F.field_v = ((ik) this).field_v;
          var3 = ((ik) this).field_F.c(param0);
          stackOut_0_0 = ((ik) this).field_F;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (var2 == 0) {
            stackOut_2_0 = (ub) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (ub) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_v = stackIn_3_1 != 0;
        if (param0) {
          return null;
        } else {
          return var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Passwords must be between 5 and 20 letters and numbers";
        field_K = 480;
    }
}
