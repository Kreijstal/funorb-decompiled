/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo {
    static String field_f;
    static int field_b;
    static String field_c;
    static String field_h;
    static cj field_g;
    static int[] field_j;
    static String field_e;
    static String field_i;
    static ri[] field_a;
    static int field_d;

    final static short[] a(int param0, short[] param1, ga param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = param2.h(param0, 14862);
        if (0 != var4) {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (var4 == param1.length) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            param1 = new short[var4];
            break L0;
          }
          var5 = param2.h(4, 14862);
          if (param3 < -96) {
            L2: {
              var6 = (short)param2.h(16, 14862);
              if (0 < var5) {
                var7 = 0;
                L3: while (true) {
                  if (var4 <= var7) {
                    break L2;
                  } else {
                    param1[var7] = (short)(var6 + param2.h(var5, 14862));
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var7 = 0;
                L4: while (true) {
                  if (var7 >= var4) {
                    break L2;
                  } else {
                    param1[var7] = (short)var6;
                    var7++;
                    continue L4;
                  }
                }
              }
            }
            return param1;
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_a = null;
        field_h = null;
        field_j = null;
        field_c = null;
        if (param0 != 0) {
            return;
        }
        field_g = null;
        field_f = null;
        field_e = null;
    }

    final static boolean a(int param0, char param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!(!Character.isISOControl(param1))) {
            return false;
        }
        if (!(!gn.a(param1, 16413))) {
            return true;
        }
        char[] var6 = af.field_d;
        char[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (param1 == var4) {
                return true;
            }
        }
        if (param0 != 8192) {
            lo.a(50);
        }
        char[] var7 = ln.field_d;
        var2 = var7;
        int var8 = 0;
        var3 = var8;
        while (var8 < var7.length) {
            var4 = var7[var8];
            if (!(param1 != var4)) {
                return true;
            }
            var8++;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Please remove <%0> from your friend list first.";
        field_c = "Private";
        field_e = "Your zombie will become tougher, able to take more damage before dying...again.";
        field_i = "<%0> is already on your ignore list.";
        field_j = new int[8192];
        field_d = 0;
    }
}
