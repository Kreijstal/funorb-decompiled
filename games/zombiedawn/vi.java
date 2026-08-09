/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    static boolean field_a;
    static sa field_c;
    static String field_b;
    static boolean field_d;

    final static boolean a(int param0, int[] param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 <= -55) {
                break L1;
              } else {
                field_c = (sa) null;
                break L1;
              }
            }
            L2: {
              if (-1 == (param1[param0 >> 790447621] & 1 << (param0 & 31) ^ -1)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("vi.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static boolean a(int param0, char param1) {
        int stackIn_9_0 = 0;
        if (param0 == 31153) {
          if (param1 != 160) {
            if (param1 != 32) {
              if (param1 != 95) {
                if (param1 == 45) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_9_0 = 1;
                return stackIn_9_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        if (param0 >= -11) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    static {
        field_a = false;
        field_b = "Cancel";
    }
}
