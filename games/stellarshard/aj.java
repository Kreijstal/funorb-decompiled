/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    static int field_a;
    static int field_b;
    static pa[] field_c;

    public static void a(byte param0) {
        field_c = null;
        if (param0 >= 49) {
            return;
        }
        field_c = null;
    }

    final static void a(int param0, int param1) {
        ph.field_B = 1000000000L / (long)param0;
        if (param1 == 11236) {
            return;
        }
        aj.a((byte) -89);
    }

    final static void a(int[] param0, boolean param1, int param2, int param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = stellarshard.field_B;
        if (!param1) {
          field_b = -114;
          L0: while (true) {
            param2--;
            if (0 <= param2) {
              var11 = param0;
              var9 = var11;
              var5 = var9;
              var6 = param4;
              var7 = param3;
              var9[var6] = var7 - -(sa.a(var11[var6], 16711422) >> 5820737);
              param4++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            param2--;
            if (0 <= param2) {
              var10 = param0;
              var9 = var10;
              var5 = var9;
              var6 = param4;
              var7 = param3;
              var9[var6] = var7 - -(sa.a(var10[var6], 16711422) >> 5820737);
              param4++;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
    }
}
