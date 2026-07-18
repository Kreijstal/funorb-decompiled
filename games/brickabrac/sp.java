/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sp extends nm {
    int field_j;
    static int field_l;
    int field_n;
    long field_p;
    static String field_s;
    int field_m;
    int field_q;
    int field_k;
    int field_r;
    int[] field_i;
    int field_o;

    public static void a(int param0) {
        field_s = null;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int[] param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var14 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var12 = -param4;
            L1: while (true) {
              if (var12 >= 0) {
                break L0;
              } else {
                var13 = -param6;
                L2: while (true) {
                  if (var13 >= 0) {
                    param3 = param3 + param5;
                    param8 = param8 + param1;
                    var12++;
                    continue L1;
                  } else {
                    L3: {
                      L4: {
                        int incrementValue$2 = param3;
                        param3++;
                        param2 = param9[incrementValue$2] & 255;
                        if (param2 == 0) {
                          break L4;
                        } else {
                          if (param2 > 240) {
                            break L4;
                          } else {
                            var11 = 255 & param2;
                            var10_int = param0[param8];
                            int incrementValue$3 = param8;
                            param8++;
                            param0[incrementValue$3] = ud.d(ik.a(var11 * ik.a(var10_int, 65280) >> 8, 65280), ud.d(ik.a(-16777216, var10_int), ik.a(16711935, ik.a(var10_int, 16711935) * var11 >> 8)));
                            break L3;
                          }
                        }
                      }
                      param8++;
                      break L3;
                    }
                    var13++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var10;
            stackOut_12_1 = new StringBuilder().append("sp.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(-1).append(',').append(param8).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param9 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    sp(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        try {
            ((sp) this).field_o = param0;
            ((sp) this).field_n = param3;
            ((sp) this).field_r = param4;
            ((sp) this).field_j = param5;
            ((sp) this).field_k = param2;
            ((sp) this).field_q = param1;
            ((sp) this).field_i = param6;
            int fieldTemp$0 = qf.field_Cb;
            qf.field_Cb = qf.field_Cb + 1;
            ((sp) this).field_m = 65535 & fieldTemp$0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "sp.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 0;
        field_s = "Off";
    }
}
