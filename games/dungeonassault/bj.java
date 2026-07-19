/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends da {
    static String field_J;
    static boolean field_G;
    static String[] field_H;
    static String field_I;
    static ef field_K;
    static cn field_F;

    final static String a(int param0, int param1) {
        if (param1 <= 29) {
          bj.i(58);
          return 1 + param0 + "/" + en.field_a.length;
        } else {
          return 1 + param0 + "/" + en.field_a.length;
        }
    }

    private bj(int param0, int param1, int param2, int param3, ca param4, pg param5, lm param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_D = param6;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "bj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, lm param3, int param4, int param5) {
        oi var7 = null;
        RuntimeException var7_ref = null;
        oi var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3, param4, param5);
              var8 = ah.field_b;
              var7 = var8;
              if (var8 == null) {
                break L1;
              } else {
                if (this.a(param5, param4, param0, -1, param2)) {
                  if (this.field_n instanceof qo) {
                    ((qo) ((Object) this.field_n)).a((bj) (this), var8, false);
                    ah.field_b = null;
                    return;
                  } else {
                    if (!(var8.field_n instanceof qo)) {
                      break L1;
                    } else {
                      ((qo) ((Object) var8.field_n)).a((bj) (this), var8, false);
                      ah.field_b = null;
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var7_ref);
            stackOut_8_1 = new StringBuilder().append("bj.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void i(int param0) {
        if (!tl.field_l) {
          throw new IllegalStateException();
        } else {
          oj.field_b = true;
          t.a(true, 0);
          if (param0 <= 71) {
            bj.h(-16);
            kh.field_n = 0;
            return;
          } else {
            kh.field_n = 0;
            return;
          }
        }
    }

    public static void h(int param0) {
        field_J = null;
        if (param0 != 31029) {
          bj.i(54);
          field_K = null;
          field_H = null;
          field_I = null;
          field_F = null;
          return;
        } else {
          field_K = null;
          field_H = null;
          field_I = null;
          field_F = null;
          return;
        }
    }

    static {
        field_J = "Raiders cost you 5 Treasure less to recruit.";
        field_I = "Waiting for game to start. Select an entrance or use special abilities.";
        field_H = new String[]{"Retreat", "Automatically retreat. (Single use)"};
        field_K = new ef();
    }
}
