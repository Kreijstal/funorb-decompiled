/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke extends wn {
    private dj field_L;
    static String field_E;
    private int field_G;
    static int[] field_M;
    static int field_K;
    private int field_I;
    static String field_F;
    private int field_H;
    private String field_N;
    private boolean field_J;

    final static void g(byte param0) {
        pm.field_e.f(param0 ^ -36);
        if (param0 != 94) {
          ke.g((byte) 118);
          pm.field_e.b((qm) (Object) new kn(pm.field_e), 15637);
          return;
        } else {
          pm.field_e.b((qm) (Object) new kn(pm.field_e), 15637);
          return;
        }
    }

    final String b(boolean param0) {
        int var2 = 0;
        String var3 = null;
        qm stackIn_1_0 = null;
        qm stackIn_2_0 = null;
        qm stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        qm stackOut_0_0 = null;
        qm stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        qm stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var2 = ((ke) this).field_B.field_w ? 1 : 0;
          ((ke) this).field_B.field_w = ((ke) this).field_w;
          var3 = ((ke) this).field_B.b(param0);
          stackOut_0_0 = ((ke) this).field_B;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (var2 == 0) {
            stackOut_2_0 = (qm) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (qm) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((qm) (Object) stackIn_3_0).field_w = stackIn_3_1 != 0;
        if (param0) {
          ke.f(-115);
          return var3;
        } else {
          return var3;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param0 > -52) {
            return;
        }
        int var5 = ((ke) this).field_n + param1;
        int var6 = ((ke) this).field_j + param3;
        this.a((byte) -60, param1, param2, param3);
        if (!(param2 == 0)) {
            return;
        }
        int var7 = !((ke) this).field_J ? 0 : -((ke) this).field_H + (((ke) this).field_v - ((ke) this).field_G * 2);
        int discarded$0 = ((ke) this).field_L.a(((ke) this).field_N, ((ke) this).field_G + (var7 + var5), ((ke) this).field_G + var6, -((ke) this).field_G + ((ke) this).field_H, ((ke) this).field_k + -(((ke) this).field_G * 2), ((ke) this).field_I, -1, ((ke) this).field_J ? 0 : 2, 1, ((ke) this).field_L.field_C);
    }

    public static void f(int param0) {
        field_E = null;
        field_M = null;
        if (param0 != 2) {
            return;
        }
        field_F = null;
    }

    final static void a(boolean param0, int param1) {
        la.a(param0, true, (byte) -96);
        if (param1 != 4474111) {
            field_M = null;
        }
    }

    final static void a(qb[] param0, boolean param1, dj param2, int param3, qb[] param4, int param5, int param6, int param7, int param8, int param9, int param10, String param11, boolean param12, int param13, int param14) {
        Object var16 = null;
        if (param14 != -21071) {
          var16 = null;
          ke.a((qb[]) null, true, (dj) null, -83, (qb[]) null, -13, 81, -125, 45, -81, 29, (String) null, true, 61, -12);
          kh.a(param6, param3, mj.field_r, param7, param8, param10, param13, param9, true, new ec(param4), param8, param13, param2, pn.field_d, ol.field_f, ql.field_a, param2, tg.field_d, new ec(param0), wm.field_I);
          dk.a(param11, (byte) -72, param12, param5, param1);
          return;
        } else {
          kh.a(param6, param3, mj.field_r, param7, param8, param10, param13, param9, true, new ec(param4), param8, param13, param2, pn.field_d, ol.field_f, ql.field_a, param2, tg.field_d, new ec(param0), wm.field_I);
          dk.a(param11, (byte) -72, param12, param5, param1);
          return;
        }
    }

    ke(int param0, int param1, int param2, int param3, qm param4, boolean param5, int param6, int param7, dj param8, int param9, String param10) {
        super(param0, param1, param2, param3, (pf) null, (wc) null);
        ((ke) this).field_B = param4;
        ((ke) this).field_N = param10;
        ((ke) this).field_H = param6;
        ((ke) this).field_L = param8;
        ((ke) this).field_J = param5 ? true : false;
        ((ke) this).field_I = param9;
        ((ke) this).field_G = param7;
        int var12 = -((ke) this).field_G + ((ke) this).field_H;
        int var13 = ((ke) this).field_L.a(param10, var12, ((ke) this).field_L.field_C) - -(((ke) this).field_G * 2);
        if (var13 <= param3) {
            var13 = param3;
        } else {
            ((ke) this).a(var13, param1, param2, param0, -59);
        }
        int var14 = !((ke) this).field_J ? ((ke) this).field_H + ((ke) this).field_G * 2 : 0;
        ((ke) this).field_B.a(param3 + -(2 * ((ke) this).field_G), ((ke) this).field_G - -(-param3 + var13 >> -1174709471), param2 - (((ke) this).field_H + 3 * ((ke) this).field_G), var14, -60);
    }

    final static boolean g(int param0) {
        if (param0 > -8) {
            ke.a(false, 117);
            return true;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new int[]{16711680, 255, 16746496, 35071, 16729156, 4474111, 7829367};
        field_E = "Use less velocity than you did with Fire Ball, as this spell will bounce about wildly if travelling too fast.";
        field_F = "Remove <%0> from friend list";
    }
}
