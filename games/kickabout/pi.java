/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static gq field_b;
    static String field_c;
    static String field_d;
    static ut field_a;

    final static void a(int param0, sp param1) {
        if (param0 != 6022) {
            return;
        }
        try {
            np.field_Jb.a(new ce(param1), 3);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "pi.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        field_d = null;
        int var1 = 7 % ((param0 - 2) / 37);
    }

    final static boolean a(int param0, char param1) {
        int stackIn_7_0 = 0;
        if (param0 == -41) {
          if (param1 != 32) {
            if (param1 != 40) {
              if (param1 == 41) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_c = (String) null;
          if (param1 != 32) {
            if (param1 == 40) {
              return true;
            } else {
              L0: {
                if (param1 != 41) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  stackIn_7_0 = 1;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    final static vn a(int param0, int param1, int param2, up param3, int param4, boolean param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vn var11 = null;
        vn stackIn_2_0 = null;
        vn stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6_int = param3.field_q;
            if (param0 > 90) {
              var7 = param3.field_j;
              var8 = (4045 & var7) >> -2010932888;
              var9 = (246 & var7) >> -1654847356;
              var10 = (15 & var7) >> 677982016;
              var11 = fp.a(param4, param2, var8, var6_int, var9, var10, param1, false, false, param5);
              stackIn_4_0 = (vn) (var11);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (vn) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("pi.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_c = "Loading park";
        field_d = "The league system is currently unavailable .";
    }
}
