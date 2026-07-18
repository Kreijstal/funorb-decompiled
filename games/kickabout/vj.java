/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    static int field_c;
    static vd field_a;
    static String field_f;
    static hd field_g;
    static String field_d;
    static int field_b;
    static String field_e;

    public static void a(byte param0) {
        field_d = null;
        field_g = null;
        field_a = null;
        field_e = null;
        field_f = null;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        int[] var9 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = Kickabout.field_G;
        try {
            while (true) {
                param2--;
                if (0 > param2) {
                    break;
                }
                var9 = param0;
                int[] var5 = var9;
                var6 = param1;
                var7 = param3;
                var9[var6] = var7 + (qj.b(var9[var6], 16711422) >> 1);
                param1++;
            }
            int var5_int = -26 / ((42 - param4) / 56);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "vj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        int var2 = -25 % ((param0 - 38) / 59);
        if (!(ra.field_G == null)) {
            cv.a((byte) 93);
        }
        jm.a(cq.field_h.field_b, param1, -2);
    }

    final static void a(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        var16 = on.field_a;
        var15 = var16;
        var14 = var15;
        var13 = var14;
        var1 = var13;
        var2 = 1;
        L0: while (true) {
          if (var2 >= on.field_f - 2) {
            return;
          } else {
            var3 = 1;
            L1: while (true) {
              if (var3 >= on.field_g - 2) {
                var2++;
                continue L0;
              } else {
                var4 = on.field_g * var2 + var3;
                var5 = var16[var4];
                var6 = var5 >>> 24;
                var7 = var1[var4 - 1] >>> 24;
                var8 = var1[var4 + 1] >>> 24;
                var9 = var1[var4 - on.field_g] >>> 24;
                var10 = var1[var4 + on.field_g] >>> 24;
                var11 = (var6 + var7 + var8 + var9 + var10) / 5;
                if (var11 > 0) {
                  var11 = var11 | (var11 << 8 | var11 << 16);
                  var12 = var11 + var5;
                  var11 = (var11 & 16711935) + (var5 & 16711935);
                  var5 = (var11 & 16777472) + (var12 - var11 & 65536);
                  var1[var4] = var12 - var5 | var5 - (var5 >>> 8);
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new vd();
        field_d = "to keep fullscreen or";
        field_f = "RuneScape clan";
        field_e = "select this pitch";
        field_b = 4;
    }
}
