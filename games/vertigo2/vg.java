/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    static String field_b;
    static int field_d;
    static boolean[][] field_c;
    static String field_a;

    final static ge a(int param0, int param1, int param2, r param3, r param4) {
        RuntimeException var5 = null;
        ge stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (hq.a(124, param0, param1, param3)) {
              L1: {
                if (param2 == -1) {
                  break L1;
                } else {
                  vg.a(-31, 13, -101, -83);
                  break L1;
                }
              }
              stackIn_6_0 = w.a(param4.a(param0, param1, (byte) -114), true);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("vg.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (param0 == -4151) {
          if (-1 >= (param1 ^ -1)) {
            if (-12 <= (param1 ^ -1)) {
              if (param2 >= 1) {
                if (gf.b(param1, param3, param0 + -24480) < param2) {
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
          vg.a(-8, 109, 103, -122);
          if (-1 >= (param1 ^ -1)) {
            if (-12 <= (param1 ^ -1)) {
              if (param2 >= 1) {
                if (gf.b(param1, param3, param0 + -24480) < param2) {
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
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_c = (boolean[][]) null;
          field_c = (boolean[][]) null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_c = (boolean[][]) null;
          field_b = null;
          field_a = null;
          return;
        }
    }

    static {
        field_b = "Create a free account to start using this feature";
        field_c = new boolean[][]{new boolean[]{true, false}, new boolean[]{false, false, false, false, false, false, false, false}, new boolean[]{false, false, false, true}};
        field_a = "Off";
    }
}
