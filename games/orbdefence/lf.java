/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    static int field_e;
    static String field_c;
    static int field_d;
    static im field_b;
    static ki field_a;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        int var1 = -2 % ((param0 - 29) / 52);
    }

    final static qj a(String param0, boolean param1) {
        RuntimeException var2 = null;
        qj stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        qj stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1) {
              if (tg.field_c != mg.field_m) {
                L1: {
                  if (kf.field_d != tg.field_c) {
                    break L1;
                  } else {
                    if (!param0.equals(pg.field_a)) {
                      break L1;
                    } else {
                      tg.field_c = tl.field_h;
                      stackIn_9_0 = uc.field_q;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                uc.field_q = null;
                pg.field_a = param0;
                tg.field_c = mg.field_m;
                stackIn_11_0 = null;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (qj) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("lf.A(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (qj) ((Object) stackIn_5_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return (qj) ((Object) stackIn_11_0);
            }
          }
        }
    }

    static {
        field_d = 0;
    }
}
