/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue implements cg {
    static String field_d;
    static int field_b;
    static gk field_a;
    static String field_c;

    final static boolean a(char param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (Character.isISOControl(param0)) {
            return false;
        }
        if (!(!de.a(param0, -17321))) {
            return true;
        }
        char[] var6 = oj.field_h;
        char[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (param0 == var4) {
                return true;
            }
        }
        if (param1 <= 63) {
            field_d = null;
        }
        char[] var7 = cm.field_S;
        var2 = var7;
        int var8 = 0;
        var3 = var8;
        while (var8 < var7.length) {
            var4 = var7[var8];
            if (!(param0 != var4)) {
                return true;
            }
            var8++;
        }
        return false;
    }

    final static void a(boolean param0) {
        if (param0) {
            ue.a(19);
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 <= 102) {
            return;
        }
        field_a = null;
        field_c = null;
    }

    public final void a(boolean param0, int param1, vg param2, int param3, int param4) {
        if (param1 < 94) {
            field_d = null;
        }
        int var6 = param2.field_o + param4;
        int var7 = param2.field_m + param3;
        aj.a(param2.field_w, var6, var7, param2.field_k, 106);
        nh var8 = ja.field_n[1];
        if (param2 instanceof hf) {
            if (((hf) (Object) param2).field_A) {
                var8.a(1 + var6 - -(-var8.field_z + param2.field_w >> -916829695), var7 - (-1 - (param2.field_k - var8.field_C >> -888369567)), 256);
            }
        }
        if (param2.a(true)) {
            ce.a(-4 + param2.field_k, 2 + var6, -16579, param2.field_w + -4, 2 + var7);
        }
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var2 = 0;
          var3 = vb.field_n;
          if (-6 >= (var3 ^ -1)) {
            if (105 > var3) {
              var2 = (var3 * 16384 + -40960) / 220;
              break L0;
            } else {
              if (120 > var3) {
                var3 = 120 - var3;
                var2 = -(8192 * (var3 * var3) / 3300) + 8192;
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            var2 = var3 * var3 * 8192 / 1100;
            break L0;
          }
        }
        L1: {
          var4 = 1;
          if (param1 >= 56) {
            break L1;
          } else {
            ue.a(-50, (byte) 118);
            break L1;
          }
        }
        L2: {
          var5 = 0;
          if (-4 != (param0 ^ -1)) {
            break L2;
          } else {
            var4 = -1;
            break L2;
          }
        }
        L3: {
          if ((param0 ^ -1) == -2) {
            var5 = 1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param0 == 4) {
            var5 = 1;
            var4 = 1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (5 == param0) {
            var4 = -1;
            var5 = 1;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (param0 != 6) {
            break L6;
          } else {
            var4 = 1;
            var5 = -1;
            break L6;
          }
        }
        L7: {
          L8: {
            if (-8 == (param0 ^ -1)) {
              break L8;
            } else {
              if (8 != param0) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          var5 = -1;
          var4 = -1;
          break L7;
        }
        L9: {
          if (param0 != 11) {
            break L9;
          } else {
            var4 = -1;
            break L9;
          }
        }
        L10: {
          if (param0 == -13) {
            var5 = -1;
            var4 = -1;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (-14 == param0) {
            var5 = -1;
            var4 = 1;
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          if (14 != param0) {
            break L12;
          } else {
            var4 = -1;
            var5 = 1;
            break L12;
          }
        }
        L13: {
          if (15 == param0) {
            var4 = 1;
            var5 = 1;
            break L13;
          } else {
            break L13;
          }
        }
        lc.field_u = ja.a(var4 * var2, var5 * var2, 32767);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
