/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    static int[] field_a;
    static int[] field_g;
    static String field_b;
    static je field_c;
    static int field_e;
    static js field_d;
    static String field_f;

    public static void a(byte param0) {
        field_a = null;
        field_f = null;
        field_c = null;
        field_b = null;
        field_d = null;
        if (param0 < 37) {
          field_c = (je) null;
          field_g = null;
          return;
        } else {
          field_g = null;
          return;
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param0 + param3 + param2 <= qn.field_g) {
            return param3 + param2;
        }
        if (!(param2 + -param0 < param1)) {
            return -param0 + param2;
        }
        return -param0 + qn.field_g;
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length() < eb.field_b) {
                  break L1;
                } else {
                  if (param0.length() <= db.field_g) {
                    L2: {
                      if (param1 == 0) {
                        break L2;
                      } else {
                        field_g = (int[]) null;
                        break L2;
                      }
                    }
                    stackIn_9_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
            }
            stackIn_5_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("pd.C(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final static void a(int param0, int param1, vh param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = -123 % ((-11 - param3) / 50);
            if (0 != param0) {
              break L0;
            } else {
              if (param1 == 0) {
                param2.b(true, 0);
                return;
              } else {
                break L0;
              }
            }
          }
          var5 = param0 & 255;
          var6 = param1 & 255;
          param2.b(true, var6 | var5 << -1406552632);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("pd.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    static {
        field_g = new int[4];
        field_f = "Close";
    }
}
