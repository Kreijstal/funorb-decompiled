/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ep extends pu {
    static int[] field_l;
    static int field_m;

    final static void a(byte param0, jfa param1, boolean param2, int param3, int[] param4) {
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        pf stackIn_3_0 = null;
        pf stackIn_4_0 = null;
        pf stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        pf stackOut_2_0 = null;
        pf stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        pf stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        var9 = BachelorFridge.field_y;
        if (!bp.e(-29919)) {
          L0: {
            sja.field_fb.c(88, (byte) 114);
            sja.field_fb.field_g = sja.field_fb.field_g + 2;
            var5 = sja.field_fb.field_g;
            rha.a(param1.field_g, (lu) (Object) sja.field_fb, (byte) -119);
            stackOut_2_0 = sja.field_fb;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (!param2) {
              stackOut_4_0 = (pf) (Object) stackIn_4_0;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = (pf) (Object) stackIn_3_0;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          ((pf) (Object) stackIn_5_0).d(stackIn_5_1, 0);
          sja.field_fb.d(param3, 0);
          var6 = param4;
          if (param0 != 42) {
            return;
          } else {
            var7 = 0;
            L1: while (true) {
              if (var6.length <= var7) {
                sja.field_fb.a((byte) -88, sja.field_fb.field_g + -var5);
                return;
              } else {
                var8 = var6[var7];
                sja.field_fb.d(var8, 0);
                var7++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1) {
        la.field_r = param0;
        if (param1 != 8192) {
            ep.a(true, 42, 63);
        }
    }

    public static void b(int param0) {
        if (param0 != 1) {
            return;
        }
        field_l = null;
    }

    final static void a(boolean param0, int param1, int param2) {
        pf var3 = null;
        var3 = sja.field_fb;
        var3.c(param1, (byte) 107);
        var3.d(3, 0);
        var3.d(8, 0);
        if (param0) {
          return;
        } else {
          var3.b(param2, -123);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new int[8192];
        field_m = 0;
    }
}
