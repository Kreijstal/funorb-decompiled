/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static wl field_c;
    static java.awt.Frame field_a;
    static String field_b;

    final static boolean a(byte param0, CharSequence param1) {
        int var2 = -53 / ((-39 - param0) / 62);
        return ki.a(10, param1, -123, true);
    }

    final static void a(byte param0) {
        if (null == rn.field_b) {
            throw new IllegalStateException("NGR");
        }
        int var1 = 95 / ((param0 - 45) / 47);
        rn.field_b.field_c = true;
        p.b(1, 27102);
    }

    final static void a(int param0, int param1, int param2, vn param3) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        L0: {
          var8 = ZombieDawn.field_J;
          var13 = param3.field_z;
          var12 = var13;
          var11 = var12;
          var10 = var11;
          var9 = var10;
          var4 = var9;
          if (param1 == -1380633400) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        var5 = 0;
        L1: while (true) {
          if (var5 >= var13.length) {
            return;
          } else {
            var6 = var13[var5];
            if (var6 != 0) {
              if ((65535 & var6) == -1) {
                var7 = var6 >> 810902800;
                var9[var5] = hi.a(eg.a(var7 * eg.a(param0 >> 1230426576, 255) << -279407384, 16711864), hi.a(eg.a(var7 * eg.a(param0 >> 1222359528, 255), 65280), eg.a(255, param0) * var7 >> -1380633400));
                var5++;
                continue L1;
              } else {
                if (-1 == (var6 & 16711935)) {
                  var7 = var6 >> 208697032;
                  var9[var5] = hi.a(hi.a(var7 * eg.a(255, param2) >> -342227608, eg.a(var7 * eg.a(param2 >> 2133219752, 255), 65280)), eg.a(16711709, eg.a(255, param2 >> -756685968) * var7 << 1176060040));
                  var5++;
                  continue L1;
                } else {
                  var5++;
                  continue L1;
                }
              }
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 1222359528) {
            return;
        }
        field_c = null;
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new wl();
        field_b = "Use this alternative as your account name";
    }
}
