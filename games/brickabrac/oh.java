/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static String field_h;
    String field_g;
    static int field_b;
    boolean field_c;
    String[] field_e;
    boolean field_a;
    static int field_f;
    int field_d;

    final static String b(byte param0) {
        if (param0 != -49) {
            field_f = 94;
            return g.field_m;
        }
        return g.field_m;
    }

    final static boolean a(int param0, int param1, byte param2, int param3, int param4, jp param5) {
        param0 = param0 - (param5.field_E + param4);
        if (-1 >= (param0 ^ -1)) {
          if (param5.field_D > param0) {
            param1 = param1 - (param3 + param5.field_F);
            if (-1 >= (param1 ^ -1)) {
              if (param1 < param5.field_C) {
                if (param2 == -24) {
                  param4 = param5.field_G[param0 + param5.field_D * param1];
                  if (param4 != -1) {
                    if (-1 == (-16777216 & param4)) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  field_f = 13;
                  param4 = param5.field_G[param0 + param5.field_D * param1];
                  if (param4 != -1) {
                    if (-1 == (-16777216 & param4)) {
                      return false;
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
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static String a(byte param0, String param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = BrickABrac.field_J ? 1 : 0;
        var4 = param2.indexOf(param3);
        L0: while (true) {
          if (0 == (var4 ^ -1)) {
            if (param0 != 13) {
              field_b = -3;
              return param2;
            } else {
              return param2;
            }
          } else {
            param2 = param2.substring(0, var4) + param1 + param2.substring(var4 + param3.length());
            var4 = param2.indexOf(param3, param1.length() + var4);
            continue L0;
          }
        }
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 < 57) {
            oh.a((byte) 49);
        }
    }

    oh(boolean param0) {
        ((oh) this).field_c = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_b = 1;
    }
}
