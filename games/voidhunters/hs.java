/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hs extends rqa {
    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, String param6, int param7) {
        RuntimeException var8 = null;
        da stackIn_8_0;
        int stackIn_8_1;
        int stackIn_8_2;
        int stackIn_8_3;
        da stackIn_9_0;
        int stackIn_9_1;
        int stackIn_9_2;
        int stackIn_9_3;
        int stackIn_9_4;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (255 <= param2) {
              woa.a(param4, param1, param0, (byte) 74, param5, param7, param6);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (li.field_i) {
                  L2: {
                    stackIn_8_0 = nma.field_b[param7];

                    stackIn_8_1 = param5;

                    stackIn_8_2 = param1;

                    stackIn_8_3 = param2 << 703025464 | param4;

                    if (param3) {
                      stackIn_9_0 = (da) ((Object) stackIn_8_0);
                      stackIn_9_1 = stackIn_8_1;
                      stackIn_9_2 = stackIn_8_2;
                      stackIn_9_3 = stackIn_8_3;
                      stackIn_9_4 = 0;
                      break L2;
                    } else {
                      stackIn_9_0 = (da) ((Object) stackIn_8_0);
                      stackIn_9_1 = stackIn_8_1;
                      stackIn_9_2 = stackIn_8_2;
                      stackIn_9_3 = stackIn_8_3;
                      stackIn_9_4 = 1;
                      break L2;
                    }
                  }
                  ((da) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4 != 0, param0, param6);
                  break L1;
                } else {
                  ita.a(param7, 7988).c(param6, param0, param1, param4, param5, param2);
                  break L1;
                }
              }
              if (!param3) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8);

            stackIn_14_1 = new StringBuilder().append("hs.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(ea param0, int param1, int param2) {
        faa var5 = null;
        int var4 = 0;
        try {
            var5 = dpa.field_p;
            var5.h(param1 + 24334, param2);
            var5.field_e = var5.field_e + 1;
            var4 = var5.field_e;
            var5.c(0, param1);
            var5.c(param1 ^ 1, param0.field_e);
            var5.c(0, param0.field_g);
            var5.d(param0.field_i, param1 ^ 332614537);
            var5.d(param0.field_h, 332614536);
            var5.d(param0.field_l, param1 ^ 332614537);
            var5.d(param0.field_f, 332614536);
            var5.g(param1 ^ 1594, var4);
            var5.e(var5.field_e - var4, param1 + -130);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "hs.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        ea var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                var4 = (ea) null;
                hs.a((ea) null, 4, -26);
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(129, 85));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hs.A(");

            if (param0 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    hs(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
