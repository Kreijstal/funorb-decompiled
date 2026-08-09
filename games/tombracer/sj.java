/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static int[] field_b;
    static String field_a;

    final static String a(byte param0) {
        if (param0 != 120) {
            jg var2 = (jg) null;
            sj.a((byte) 105, 20, 6, -92, 0.43005454540252686f, 0.0913710817694664f, (byte[]) null, 0.566550612449646f, 1.7519813776016235f, (jg) null, 105, 0.6303681135177612f, -47, 32);
        }
        return "Hi!";
    }

    public static void a(boolean param0) {
        if (!param0) {
            sj.a(false);
        }
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, float param4, float param5, byte[] param6, float param7, float param8, jg param9, int param10, float param11, int param12, int param13) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var14_int = 0;
        RuntimeException var14 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        float[] var24 = null;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var14_int = param2 * param3;
            var24 = new float[var14_int];
            var16 = 0;
            L1: while (true) {
              if (var16 >= param10) {
                L2: {
                  if (param0 == 79) {
                    break L2;
                  } else {
                    field_b = (int[]) null;
                    break L2;
                  }
                }
                var20 = param12;
                var16 = var20;
                var17 = 0;
                L3: while (true) {
                  if (var14_int <= var17) {
                    break L0;
                  } else {
                    param6[var20] = (byte)(param6[var20] + 127);
                    var20++;
                    var17++;
                    continue L3;
                  }
                }
              } else {
                var17 = param12;
                param9.a(param4 * 127.0f, param11 / (float)param1, param8 / (float)param2, param1, var24, param5 / (float)param3, 1, 0, param3, param13, param2);
                param8 = param8 * 2.0f;
                var18 = 0;
                L4: while (true) {
                  if (var18 >= var14_int) {
                    param4 = param4 * param7;
                    param11 = param11 * 2.0f;
                    param5 = param5 * 2.0f;
                    var16++;
                    continue L1;
                  } else {
                    param6[var17] = (byte)(int)((float)param6[var17] + var24[var18]);
                    var17++;
                    var18++;
                    continue L4;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var14 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var14);

            stackIn_15_1 = new StringBuilder().append("sj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param7).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ')');
        }
    }

    static {
        field_a = "(1 player wants to join)";
    }
}
