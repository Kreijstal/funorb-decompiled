/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl {
    static String field_c;
    static int[] field_b;
    static int field_a;

    public static void a(byte param0) {
        field_c = null;
        if (param0 > -45) {
            hl.a((byte) 46);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static double[] a(double param0, double[] param1, boolean param2, int param3, boolean param4, boolean param5, double param6, double param7, hc param8, double[] param9, double[] param10) {
        double[] stackIn_3_0 = null;
        double[] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var14 = null;
        RuntimeException var14_ref = null;
        int[] var15 = null;
        double[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int[] var19 = null;
        double[] var20 = null;
        double[] var21 = null;
        var18 = Torquing.field_u;
        try {
          L0: {
            var19 = new int[]{6, 3, 3, 6};
            var14 = var19;
            var15 = new int[]{2, 2, 1, 1};
            dk.a(param9, 0, mf.field_z, 0, param9.length);
            if (param3 == -6076) {
              var21 = new double[13];
              var20 = var21;
              var16 = var20;
              dk.a(param9, 0, var16, 0, param9.length);
              bd.c(0);
              var17 = 0;
              L1: while (true) {
                L2: {
                  if (4 <= var17) {
                    break L2;
                  } else {
                    L3: {
                      kp.a(param7, 72, param6, mf.field_z, param8);
                      gm.a(param4, param10, -128, param6, param1, param0, param5, mf.field_z, hf.field_b, param2);
                      if (1 == qd.field_d) {
                        break L3;
                      } else {
                        if ((qd.field_d ^ -1) == -4) {
                          break L3;
                        } else {
                          ap.a(param0 / (double)var19[var17], hf.field_b, var21);
                          ap.a(param9, param0 / (double)var15[var17], hf.field_b, mf.field_z);
                          df.a(param3 ^ -6073, mf.field_z);
                          var17++;
                          continue L1;
                        }
                      }
                    }
                    ap.a(mf.field_z, param0, hf.field_b, var21);
                    break L2;
                  }
                }
                aj.a((byte) -56, param2, param9, param7);
                df.a(3, var21);
                stackIn_12_0 = (double[]) (var16);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = (double[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var14_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var14_ref);

            stackIn_15_1 = new StringBuilder().append("hl.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param9 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param10 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_16_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_12_0;
        }
    }

    static {
        field_b = new int[8192];
        field_c = "<col=2>Note:</col> for the gyro key to work, you must have collected a gyroscope, as described below.";
    }
}
