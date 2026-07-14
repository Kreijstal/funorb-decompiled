/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends ie {
    static int field_wb;
    static String field_tb;
    static String field_xb;
    static cr field_vb;
    static int field_yb;
    static int[] field_ub;

    final static int p(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (he.field_a) {
          return 0;
        } else {
          var1 = 125 % ((-26 - param0) / 58);
          var2 = 0;
          var3 = 0;
          L0: while (true) {
            if (var3 >= op.field_m.field_a.length) {
              return var2;
            } else {
              var4 = op.field_m.field_a[var3];
              if (-1 > (var4 ^ -1)) {
                L1: {
                  stackOut_7_0 = var2;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (fb.field_e.field_M != var3) {
                    stackOut_9_0 = stackIn_9_0;
                    stackOut_9_1 = var4 / 5;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L1;
                  } else {
                    stackOut_8_0 = stackIn_8_0;
                    stackOut_8_1 = var4 / 25;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L1;
                  }
                }
                var2 = stackIn_10_0 + stackIn_10_1;
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    final static void a(String[][] param0, ul param1, boolean param2, String[][] param3, String[] param4, ul param5, int param6, byte[] param7, ul param8, int param9, int[] param10, byte[] param11, boolean param12, ja[][] param13, ja[][] param14) {
        Object var17 = null;
        Object var16 = null;
        cn.a(param8, 0, param7, (int[]) null, param11, param6, param4, param5, (ri[]) null, param1, param9, param14, param12, param0, param10, param13, param3);
        if (!param2) {
            field_ub = null;
        }
    }

    ub(vk param0, cf param1) {
        super(param0, param1, 33, 20, 30);
    }

    public static void o(int param0) {
        field_xb = null;
        field_ub = null;
        if (param0 <= 49) {
            return;
        }
        field_tb = null;
        field_vb = null;
    }

    final static void n(int param0) {
        if (param0 != 33423425) {
            ub.o(-45);
        }
        if (ee.field_b) {
            fh.b(31706);
        }
    }

    final static void m(int param0) {
        int var1 = -122 / ((param0 - -60) / 48);
        rl.b((byte) -128);
    }

    final static void a(int param0, int param1, int param2, byte param3, int[] param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var17 = null;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = ZombieDawnMulti.field_E ? 1 : 0;
        while (true) {
            param0--;
            if ((param0 ^ -1) > -1) {
                break;
            }
            var17 = param4;
            var10_ref_int__ = var17;
            var11 = param8;
            var12 = param1;
            var13 = param7;
            var14 = param2;
            var15 = (var17[var11] & 16711422) >> 1024437633;
            var10_ref_int__[var11] = var15 - (-(tq.b(var14, 33428544) >> -584413807) + (-(tq.b(var12, 33423360) >> -58264927) + -(tq.b(33423425, var13) >> 540440233)));
            param2 = param2 + param6;
            param1 = param1 + param9;
            param7 = param7 + param5;
            param8++;
        }
        int var10 = -50 / ((param3 - 47) / 32);
    }

    final void a(cf param0, byte param1) {
        super.a(param0, (byte) -32);
        int var3 = -36 / ((param1 - 61) / 56);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_wb = 640;
        field_yb = 0;
        field_xb = "Continue";
        field_tb = "Rating";
    }
}
