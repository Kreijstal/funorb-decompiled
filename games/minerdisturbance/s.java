/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends hc {
    int field_R;
    static ea[] field_L;
    int field_M;
    int field_S;
    static String field_T;
    int field_K;
    static ac field_O;
    int field_J;
    static int field_Q;
    int field_N;
    static int[] field_I;
    static bj field_P;

    final static int a(int param0) {
        int var1 = 0;
        int var2 = MinerDisturbance.field_ab;
        if (param0 != -27911) {
            return 65;
        }
        boolean discarded$8 = mb.field_b.a(true, da.field_d, mg.field_a, 0);
        mb.field_b.o(param0 + 27655);
        while (mm.b((byte) 76)) {
            boolean discarded$9 = mb.field_b.a((byte) -65, lj.field_t, ud.field_c);
        }
        if (!(0 == (dm.field_j ^ -1))) {
            var1 = dm.field_j;
            oj.a(-1, 3);
            return var1;
        }
        if (wc.field_b) {
            return 3;
        }
        if (bd.field_h == ci.field_e) {
            return 1;
        }
        if (!(wm.field_f.a(0))) {
            return 1;
        }
        if (ic.field_l == ci.field_e) {
            return 2;
        }
        return -1;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, fe param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = MinerDisturbance.field_ab;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
            var8 = param0 - ((s) this).field_M - ((s) this).field_u - param6;
            var9 = -((s) this).field_t - param1 - (((s) this).field_R - param3);
            if (var8 * var8 - -(var9 * var9) >= ((s) this).field_J * ((s) this).field_J) {
                return true;
            }
            var10 = Math.atan2((double)var9, (double)var8) - mh.field_a;
            if (0.0 > var10) {
                var10 = var10 - 3.141592653589793 / (double)((s) this).field_N;
            } else {
                if (!(0.0 >= var10)) {
                    var10 = var10 + 3.141592653589793 / (double)((s) this).field_N;
                }
            }
            ((s) this).field_S = (int)((double)((s) this).field_N * var10 / 6.283185307179586);
            while (((s) this).field_N <= ((s) this).field_S) {
                ((s) this).field_S = ((s) this).field_S - ((s) this).field_N;
            }
            while ((((s) this).field_S ^ -1) > -1) {
                ((s) this).field_S = ((s) this).field_S + ((s) this).field_N;
            }
            return true;
        }
        return false;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        var8 = MinerDisturbance.field_ab;
        if (param1 == -1) {
          param4--;
          L0: while (true) {
            if ((param4 ^ -1) > -1) {
              return;
            } else {
              var9 = param0;
              var5 = var9;
              var6 = param2;
              var7 = param3;
              var9[var6] = (c.a(16711422, var9[var6]) >> -1952707967) + var7;
              param2++;
              param4--;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private s() throws Throwable {
        throw new Error();
    }

    public static void m(int param0) {
        field_O = null;
        field_I = null;
        if (param0 >= -113) {
            return;
        }
        field_P = null;
        field_L = null;
        field_T = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        field_T = "Unpacking levels";
        field_I = new int[256];
        for (var0 = 0; var0 < 256; var0++) {
            var1 = var0 * 3 / 2 - -var0;
            if (255 < var1) {
                var1 = 255;
            }
            field_I[var0] = c.a(var1 << 629166896, 16754509);
            field_I[var0] = hi.a(field_I[var0], c.a(var0 * var0 >> -1129210203 << 1099502600, 65366));
        }
    }
}
