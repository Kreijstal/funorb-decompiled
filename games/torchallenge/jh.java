/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    static rj field_c;
    static String field_a;
    static boolean[][] field_b;

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    final static boolean a(byte param0, uf param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param1.j(-88);
              if (-2 == (var2_int ^ -1)) {
                stackIn_3_0 = 1;
                break L1;
              } else {
                stackIn_3_0 = 0;
                break L1;
              }
            }
            L2: {
              var3 = stackIn_3_0;
              if (param0 >= 39) {
                break L2;
              } else {
                field_b = (boolean[][]) null;
                break L2;
              }
            }
            stackIn_6_0 = var3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("jh.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final static boolean a(byte param0) {
        if (param0 >= 30) {
          if (!li.field_N) {
            if (d.p(-67)) {
              if (vh.field_d == null) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            if (null != eb.field_l) {
              if (d.p(-67)) {
                if (vh.field_d != null) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = (boolean[][]) null;
        if (param0 != -14282) {
            jh.a((byte) -122);
        }
    }

    static {
        field_c = new rj();
        field_b = new boolean[][]{new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{true, true, true}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{true, true, true}, new boolean[]{false, false, false}, new boolean[]{false, false, false}};
        field_a = null;
    }
}
