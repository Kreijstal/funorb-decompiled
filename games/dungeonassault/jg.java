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
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 94) {
                break L1;
              } else {
                field_d = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = ug.a(false, -44, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("jg.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        param1 = param1 & param0;
        if (param1 < 4096) {
          L0: {
            if (param1 >= 2048) {
              stackIn_8_0 = -jb.field_Tb[param1 - 2048];
              break L0;
            } else {
              stackIn_8_0 = jb.field_Tb[2048 - param1];
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if ((param1 ^ -1) > -6145) {
              stackIn_4_0 = -jb.field_Tb[-param1 + 6144];
              break L1;
            } else {
              stackIn_4_0 = jb.field_Tb[param1 - 6144];
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final static ba[] b(byte param0) {
        if (param0 != 24) {
          field_a = (ef) null;
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
        CharSequence var2;
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 >= -61) {
          var2 = (CharSequence) null;
          jg.a(48, (CharSequence) null);
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
        field_a = new ef();
        field_d = "Cancel";
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_e = "Discard";
    }
}
