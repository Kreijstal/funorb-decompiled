/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vu extends llb {
    static byte[] field_zb;
    int field_yb;
    llb field_wb;
    static boolean field_xb;
    llb field_Eb;
    String field_Cb;
    String field_Ab;
    llb field_Bb;
    String field_vb;
    static int field_Db;
    String field_Fb;

    final static int b(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_26_0 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var5 = -14 + vkb.a(param1 + 35, param4 ^ param4 >> 31 | param2 >> 31 ^ param2 | param0 ^ param0 >> 31);
        if (var5 > 0) {
          param2 = param2 >> var5;
          param4 = param4 >> var5;
          param0 = param0 >> var5;
        }
        if (param4 <= 0) {
          return -1;
        }
        var6 = param2 * param2 - param0 * (2 * param4);
        if (var6 < 0) {
          return -1;
        }
        var7 = lw.a((byte) -73, var6);
        var8 = (-param2 + var7 << param3) / param4;
        var9 = (-param2 - var7 << param3) / param4;
        if (var8 < param1) {
          if (var9 < 0) {
            return -1;
          }
          if (1 << param3 < var9) {
            return -1;
          }
          return var9;
        }
        if (1 << param3 < var8) {
          if (var9 < 0) {
            return -1;
          }
          if (1 << param3 < var9) {
            return -1;
          }
          return var9;
        }
        if (0 > var9) {
          stackIn_26_0 = var8;
          return stackIn_26_0;
        }
        if (var8 <= var9) {
          return var8;
        }
        return var9;
    }

    public static void e(byte param0) {
        field_zb = null;
        if (param0 != 113) {
          vu.b(30, 61, 5, 19, 62);
        }
    }

    vu() {
        super(0L, (llb) null);
    }

    static {
        field_Db = 36;
    }
}
