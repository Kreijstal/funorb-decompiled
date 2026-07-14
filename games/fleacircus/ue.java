/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    static String field_b;
    static ed field_c;
    static int[] field_a;
    static int field_d;

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int param8, int[] param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        int[] var18 = null;
        var16 = fleas.field_A ? 1 : 0;
        L0: while (true) {
          param4--;
          if (param4 < 0) {
            if (param5 != -117) {
              var17 = null;
              ue.a((byte) 49, (dd[]) null);
              return;
            } else {
              return;
            }
          } else {
            var18 = param9;
            var10 = var18;
            var11 = param0;
            var12 = param2;
            var13 = param6;
            var14 = param3;
            var15 = var18[var11] >> -864704223 & 8355711;
            var10[var11] = (sc.a(33423528, var14) >> 622209137) + (sc.a(65280, var13 >> 1514215689) + (sc.a(var12, 33423360) >> -6617887)) + var15;
            param2 = param2 + param8;
            param0++;
            param6 = param6 + param7;
            param3 = param3 + param1;
            continue L0;
          }
        }
    }

    final static void a(byte param0, dd[] param1) {
        int var2 = 0;
        var2 = -119 % ((param0 - -59) / 50);
        wa.field_k = param1;
        if (wa.field_k != null) {
          if (-4 >= (param1.length ^ -1)) {
            return;
          } else {
            throw new IllegalArgumentException("");
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != -6617887) {
            field_d = 21;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "More suggestions";
        field_c = new ed();
        field_d = 4;
        field_a = new int[4];
    }
}
