/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends ne {
    static fd field_j;
    static String field_k;
    static String field_n;
    static String field_i;
    static rk field_l;
    static String field_o;
    static String[] field_m;

    public static void a(int param0) {
        if (param0 != 9) {
          pe.a(39);
          field_n = null;
          field_i = null;
          field_l = null;
          field_o = null;
          field_j = null;
          field_m = null;
          field_k = null;
          return;
        } else {
          field_n = null;
          field_i = null;
          field_l = null;
          field_o = null;
          field_j = null;
          field_m = null;
          field_k = null;
          return;
        }
    }

    final static cn[] a(int param0, int param1, int param2, int param3, int param4) {
        cn[] var5 = null;
        cn[] var6 = null;
        var6 = new cn[9];
        var5 = var6;
        var6[6] = bl.a(false, param0, param4);
        var5[3] = bl.a(false, param0, param4);
        var5[2] = bl.a(false, param0, param4);
        var5[1] = bl.a(false, param0, param4);
        var5[0] = bl.a(false, param0, param4);
        if (param2 > 3) {
          var6[8] = bl.a(false, param3, param4);
          var5[7] = bl.a(false, param3, param4);
          var5[5] = bl.a(false, param3, param4);
          if (-1 != (param1 ^ -1)) {
            var6[4] = bl.a(false, param1, 64);
            return var5;
          } else {
            return var5;
          }
        } else {
          field_l = null;
          var6[8] = bl.a(false, param3, param4);
          var5[7] = bl.a(false, param3, param4);
          var5[5] = bl.a(false, param3, param4);
          if (-1 == (param1 ^ -1)) {
            return var5;
          } else {
            var6[4] = bl.a(false, param1, 64);
            return var5;
          }
        }
    }

    final static boolean a(CharSequence param0, char param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        if (il.a(true, param1)) {
          if (param0 == null) {
            return false;
          } else {
            var3 = param0.length();
            if (-13 < (var3 ^ -1)) {
              var4 = -116 % ((param2 - 21) / 53);
              if (jc.a(param1, -101)) {
                if (0 != var3) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    private pe() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "A large, wolf-like creature with brown-black hair and horns.";
        field_j = new fd(3);
        field_n = "ACCEPT";
        field_i = "Select a raider to enchant with additional Defence";
    }
}
