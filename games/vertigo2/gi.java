/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends ah {
    static ve field_t;
    static jj field_s;
    static r field_p;
    static int field_m;
    static boolean field_r;
    static boolean field_o;
    static String field_q;
    static int[] field_n;
    static nj field_v;
    static int field_u;

    public static void b(boolean param0) {
        field_q = null;
        field_t = null;
        if (param0) {
            return;
        }
        field_p = null;
        field_s = null;
        field_n = null;
        field_v = null;
    }

    final static boolean a(CharSequence param0, char param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!cp.a((byte) 64, param1)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 != null) {
                if (param2 == 31) {
                  var3_int = param0.length();
                  if ((var3_int ^ -1) > -13) {
                    if (!jq.a(param1, param2 + -127)) {
                      stackIn_19_0 = 1;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      if (var3_int == 0) {
                        stackIn_17_0 = 0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        return true;
                      }
                    }
                  } else {
                    stackIn_12_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("gi.A(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L1;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0 != 0;
                } else {
                  return stackIn_19_0 != 0;
                }
              }
            }
          }
        }
    }

    final static ch a(int param0, boolean param1) {
        ch var2;
        CharSequence var3;
        ch stackIn_3_0 = null;
        ch stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        ch stackIn_7_0 = null;
        ch stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param0 != -2956) {
          L0: {
            var3 = (CharSequence) null;
            gi.a((CharSequence) null, '￸', (byte) -37);
            var2 = new ch(true);
            stackIn_7_0 = (ch) (var2);

            if (!param1) {
              stackIn_8_0 = (ch) ((Object) stackIn_7_0);
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = (ch) ((Object) stackIn_7_0);
              stackIn_8_1 = 1;
              break L0;
            }
          }
          stackIn_8_0.field_i = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            var2 = new ch(true);
            stackIn_3_0 = (ch) (var2);

            if (!param1) {
              stackIn_4_0 = (ch) ((Object) stackIn_3_0);
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = (ch) ((Object) stackIn_3_0);
              stackIn_4_1 = 1;
              break L1;
            }
          }
          stackIn_4_0.field_i = stackIn_4_1 != 0;
          return var2;
        }
    }

    static {
        field_t = new ve(2, 4, 4, 0);
        field_r = false;
        field_m = 640;
        field_q = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_v = new nj();
    }
}
