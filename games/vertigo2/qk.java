/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk extends wh {
    static String field_H;
    static String field_G;

    public static void b(boolean param0) {
        field_H = null;
        field_G = null;
    }

    public qk() {
    }

    final static void a(boolean param0, boolean param1) {
        cl.field_c.a(0, param0);
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[][] var11 = null;
        int[][] var12 = null;
        int[][] var13 = null;
        int[][] var14 = null;
        int[][] var15 = null;
        var10 = Vertigo2.field_L ? 1 : 0;
        var15 = ((qk) this).field_v.a(param1, param0 ^ 3778);
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var11 = var12;
        var3 = var11;
        if (((qk) this).field_v.field_c) {
          if (((qk) this).g(param0 ^ -27930)) {
            var4 = var15[0];
            var5 = var15[1];
            var6 = var15[2];
            var7 = param1 % ((qk) this).field_C * ((qk) this).field_C;
            var8 = 0;
            L0: while (true) {
              if (we.field_M <= var8) {
                if (param0 != -3780) {
                  field_G = null;
                  return var3;
                } else {
                  return var3;
                }
              } else {
                var9 = ((qk) this).field_y[var7 - -(var8 % ((qk) this).field_z)];
                var6[var8] = b.a(var9, 255) << 4;
                var5[var8] = b.a(65280, var9) >> 4;
                var4[var8] = b.a(var9, 16711680) >> 12;
                var8++;
                continue L0;
              }
            }
          } else {
            if (param0 != -3780) {
              field_G = null;
              return var3;
            } else {
              return var3;
            }
          }
        } else {
          if (param0 == -3780) {
            return var3;
          } else {
            field_G = null;
            return var3;
          }
        }
    }

    final static void d(int param0, int param1, int param2) {
        mi var3 = uh.field_Wb;
        var3.j(param1, 122);
        var3.f(3, 122);
        var3.f(9, 107);
        var3.d(param0, -1783);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Connection restored.";
        field_G = "Show all game chat";
    }
}
