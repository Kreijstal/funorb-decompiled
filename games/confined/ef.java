/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef extends sj {
    static int field_tb;
    static int field_sb;
    static String field_ub;
    static int field_vb;
    static String field_wb;

    final void a(fj param0, byte param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ef.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ef(sh param0, fj param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static boolean a(int param0, String param1) {
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
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() < gb.field_d) {
                  break L1;
                } else {
                  if (param1.length() <= oj.field_x) {
                    L2: {
                      if (param0 >= 58) {
                        break L2;
                      } else {
                        field_vb = 90;
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

            stackIn_12_1 = new StringBuilder().append("ef.JA(").append(param0).append(',');

            if (param1 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    public static void n(int param0) {
        field_wb = null;
        if (param0 <= 94) {
            ef.n(-3);
            field_ub = null;
            return;
        }
        field_ub = null;
    }

    static {
        field_tb = 0;
        field_wb = "Names should contain a maximum of 12 characters";
        field_ub = "Difficulty: ";
    }
}
