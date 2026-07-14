/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class apb {
    static int field_b;
    static int field_a;
    int field_c;

    final static void a(byte param0) {
        cf.b(32);
        int var1 = -97 % ((62 - param0) / 54);
    }

    final static boolean a(int param0) {
        mv var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        mv var5 = null;
        var4 = VoidHunters.field_G;
        var5 = (mv) (Object) tma.field_r.d(0);
        var1 = var5;
        if (var1 == null) {
          return false;
        } else {
          var3 = 58 % ((param0 - -10) / 48);
          var2 = 0;
          L0: while (true) {
            if (var2 >= var1.field_i) {
              return true;
            } else {
              L1: {
                if (null == var5.field_g[var2]) {
                  break L1;
                } else {
                  if (var5.field_g[var2].field_f == 0) {
                    return false;
                  } else {
                    break L1;
                  }
                }
              }
              if (null != var5.field_e[var2]) {
                if (0 == var5.field_e[var2].field_f) {
                  return false;
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 1;
        field_b = 4;
    }
}
