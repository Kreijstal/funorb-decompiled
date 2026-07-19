/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static int[] field_b;
    static String field_a;

    final static String a(byte param0) {
        jg var2 = null;
        if (param0 != 120) {
          var2 = (jg) null;
          sj.a((byte) 105, 20, 6, -92, 0.43005454540252686f, 0.0913710817694664f, (byte[]) null, 0.566550612449646f, 1.7519813776016235f, (jg) null, 105, 0.6303681135177612f, -47, 32);
          return "Hi!";
        } else {
          return "Hi!";
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            sj.a(false);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, float param4, float param5, byte[] param6, float param7, float param8, jg param9, int param10, float param11, int param12, int param13) {
        RuntimeException var14 = null;
        int var14_int = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        float[] var23 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_11_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var14_int = param2 * param3;
            var23 = new float[var14_int];
            var16 = 0;
            L1: while (true) {
              L2: {
                if (var16 >= param10) {
                  stackOut_11_0 = param0;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  var17 = param12;
                  param9.a(param4 * 127.0f, param11 / (float)param1, param8 / (float)param2, param1, var23, param5 / (float)param3, 1, 0, param3, param13, param2);
                  param8 = param8 * 2.0f;
                  stackOut_3_0 = 0;
                  stackIn_12_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var19 != 0) {
                    break L2;
                  } else {
                    var18 = stackIn_4_0;
                    L3: while (true) {
                      L4: {
                        if (var18 >= var14_int) {
                          param4 = param4 * param7;
                          param11 = param11 * 2.0f;
                          param5 = param5 * 2.0f;
                          var16++;
                          break L4;
                        } else {
                          param6[var17] = (byte)(int)((float)param6[var17] + var23[var18]);
                          var17++;
                          var18++;
                          if (var19 != 0) {
                            break L4;
                          } else {
                            continue L3;
                          }
                        }
                      }
                      continue L1;
                    }
                  }
                }
              }
              L5: {
                if (stackIn_12_0 == 79) {
                  break L5;
                } else {
                  field_b = (int[]) null;
                  break L5;
                }
              }
              var16 = param12;
              var17 = 0;
              L6: while (true) {
                if (var14_int <= var17) {
                  break L0;
                } else {
                  param6[var16] = (byte)(param6[var16] + 127);
                  var16++;
                  var17++;
                  if (var19 == 0) {
                    continue L6;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var14 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var14);
            stackOut_21_1 = new StringBuilder().append("sj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param6 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param7).append(',').append(param8).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param9 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ')');
        }
    }

    static {
        field_a = "(1 player wants to join)";
    }
}
