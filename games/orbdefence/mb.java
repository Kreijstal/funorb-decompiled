/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static hg field_b;
    static boolean field_c;
    static bl field_a;

    public static void a(int param0) {
        field_a = null;
        int var1 = 106 / ((param0 - 42) / 57);
        field_b = null;
    }

    final static void a(int param0, int param1, int[] param2, int param3, boolean param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        if (!param4) {
          field_b = null;
          L0: while (true) {
            param0--;
            if (-1 >= (param0 ^ -1)) {
              var11 = param2;
              var9 = var11;
              var5 = var9;
              var6 = param1;
              var7 = param3;
              var9[var6] = (vi.a(16711422, var11[var6]) >> 1079794145) + var7;
              param1++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            param0--;
            if (-1 >= (param0 ^ -1)) {
              var10 = param2;
              var9 = var10;
              var5 = var9;
              var6 = param1;
              var7 = param3;
              var9[var6] = (vi.a(16711422, var10[var6]) >> 1079794145) + var7;
              param1++;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    static {
    }
}
