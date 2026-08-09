/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    static String field_b;
    static String[] field_a;

    final static void a(int param0, ai param1, int param2, float param3, float param4, float param5, float param6, int param7, int param8, byte[] param9, float param10, int param11, int param12, int param13) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var14_int = 0;
        RuntimeException var14 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        float[] var23 = null;
        try {
          L0: {
            var14_int = param13 * param12;
            var23 = new float[var14_int];
            var16 = 0;
            L1: while (true) {
              if (var16 >= param2) {
                L2: {
                  var19 = param7;
                  var16 = var19;
                  if (param0 == 2) {
                    break L2;
                  } else {
                    field_a = (String[]) null;
                    break L2;
                  }
                }
                var17 = 0;
                L3: while (true) {
                  if (var17 >= var14_int) {
                    break L0;
                  } else {
                    param9[var19] = (byte)(127 + param9[var19]);
                    var19++;
                    var17++;
                    continue L3;
                  }
                }
              } else {
                param1.a(param11, 127.0f * param10, param13, param5 / (float)param8, param8, -79, param3 / (float)param13, param6 / (float)param12, 0, var23, param12);
                var17 = param7;
                var18 = 0;
                L4: while (true) {
                  if (var18 >= var14_int) {
                    param6 = param6 * 2.0f;
                    param5 = param5 * 2.0f;
                    param10 = param10 * param4;
                    param3 = param3 * 2.0f;
                    var16++;
                    continue L1;
                  } else {
                    param9[var17] = (byte)(int)((float)param9[var17] + var23[var18]);
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
            stackIn_14_0 = (RuntimeException) (var14);

            stackIn_14_1 = new StringBuilder().append("qh.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ')');
        }
    }

    final static boolean a(int param0, int param1, byte param2) {
        if (param2 != -3) {
            field_b = (String) null;
        }
        return (param0 & 52 ^ -1) != -1 ? true : false;
    }

    public static void a(int param0) {
        if (param0 >= -77) {
            field_b = (String) null;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = null;
        field_a = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
