/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg {
    static ef field_a;
    static String field_d;
    static cn[] field_c;
    static String field_b;
    static String field_e;

    final static String a(int param0, CharSequence param1) {
        if (param0 <= 94) {
            field_d = null;
            return ug.a(false, -44, param1);
        }
        return ug.a(false, -44, param1);
    }

    final static int a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        param1 = param1 & param0;
        if (param1 < 4096) {
          L0: {
            if (param1 >= 2048) {
              stackOut_7_0 = -jb.field_Tb[param1 - 2048];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = jb.field_Tb[2048 - param1];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if ((param1 ^ -1) > -6145) {
              stackOut_3_0 = -jb.field_Tb[-param1 + 6144];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = jb.field_Tb[param1 - 6144];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final static ba[] b(byte param0) {
        if (param0 != 24) {
          field_a = null;
          return new ba[]{ba.field_e, gg.field_c, rl.field_j};
        } else {
          return new ba[]{ba.field_e, gg.field_c, rl.field_j};
        }
    }

    final static boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        if (!param0) {
          if (param1 <= hj.field_S) {
            if (hj.field_S < param3 + param1) {
              if (param4 <= eh.field_h) {
                if (param2 + param4 <= eh.field_h) {
                  return false;
                } else {
                  return true;
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

    public static void a(byte param0) {
        Object var2 = null;
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 >= -61) {
          var2 = null;
          String discarded$2 = jg.a(48, (CharSequence) null);
          field_e = null;
          field_a = null;
          return;
        } else {
          field_e = null;
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ef();
        field_d = "Cancel";
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_e = "Discard";
    }
}
