/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    static int field_a;
    static byte[][] field_c;
    static String field_b;

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = CrazyCrystals.field_B;
        if (param3 > -29) {
          field_a = 8;
          L0: while (true) {
            param1--;
            if (-1 >= (param1 ^ -1)) {
              var11 = param0;
              var9 = var11;
              var5 = var9;
              var6 = param4;
              var7 = param2;
              var9[var6] = var7 + (pf.b(16711422, var11[var6]) >> 1125927713);
              param4++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            param1--;
            if (-1 >= (param1 ^ -1)) {
              var10 = param0;
              var9 = var10;
              var5 = var9;
              var6 = param4;
              var7 = param2;
              var9[var6] = var7 + (pf.b(16711422, var10[var6]) >> 1125927713);
              param4++;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 <= 109) {
          var2 = null;
          ui.a((int[]) null, 61, 21, -49, 90);
          field_c = null;
          field_b = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          return;
        }
    }

    final static int b(byte param0) {
        if (param0 > -62) {
            ui.a((byte) -27);
            return 1;
        }
        return 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_b = "Age:";
    }
}
