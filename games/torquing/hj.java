/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    static sm field_c;
    static String field_a;
    static boolean field_b;

    public static void a(byte param0) {
        field_a = null;
        if (param0 <= 54) {
          return;
        }
        field_c = null;
    }

    final static void a(boolean param0, int param1) {
        df var2 = wa.field_d;
        var2.f(-40, param1);
        if (param0) {
          field_c = (sm) null;
        }
        var2.b(90, 1);
        var2.b(90, 2);
    }

    final static t a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Torquing.field_u;
        t var6 = new t(param2, param2);
        t var3 = var6;
        for (var4 = 0; var4 < var3.field_y.length; var4++) {
          var6.field_y[var4] = param1;
        }
        if (param0 >= -85) {
          hj.a((byte) -13);
        }
        return var3;
    }

    final static int a(double[] param0, double[] param1, int param2, double[] param3, double param4, double param5, double[] param6, boolean param7, double[] param8, int param9) {
        int var12_int = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        double stackIn_21_0 = 0.0;
        double stackIn_22_1 = 0.0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var12_double = 0.0;
        RuntimeException var12 = null;
        double[] var13 = null;
        int var14 = 0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        int var25 = 0;
        int var14Lifetime1;
        double var15Lifetime1;
        var25 = Torquing.field_u;
        try {
          for (var12_int = 0; var12_int < 3; var12_int++) {
            var13 = param3;
            param1[var12_int] = 0.0;
            var14 = var12_int;
            var13[var14] = 0.0;
          }
          var12_double = param6[3];
          if (!(0.0001 > Math.abs(var12_double - param5))) {
            if (!(Math.abs(var12_double) <= param5)) {
              stackIn_14_0 = 0;
              return stackIn_14_0;
            }
            var14Lifetime1 = 1;
          } else {
            var15 = ap.a(param6, 6, param0, 3);
            if (1e-10 > Math.abs(var15)) {
              var14Lifetime1 = 2;
            } else {
              if (var15 > 0.0) {
                stackIn_8_0 = 0;
                return stackIn_8_0;
              }
              var14Lifetime1 = 1;
            }
          }
          bf.field_b[2] = re.field_d[2] + param8[2];
          bf.field_b[1] = re.field_d[1] + param8[1];
          bf.field_b[0] = re.field_d[0] + param8[param2];
          var15Lifetime1 = 0.4 * param5 * param5;
          var17 = -ap.a(bf.field_b, 0, param6, 6);
          var19 = param6[5] * var17;
          ap.a(param0, 10, param6, 6, b.field_t, 0);
          if (var14Lifetime1 != 1) {
            b.field_t[0] = param0[3] - param5 * b.field_t[0];
            b.field_t[2] = param0[5] - param5 * b.field_t[2];
            if (var19 < 0.0) {
              var19 = 0.0;
            }
            b.field_t[1] = -(b.field_t[1] * param5) + param0[4];
            if (!(ap.a(b.field_t, 0, b.field_t, 0) < 1e-14)) {
              var21 = ap.a(b.field_t, 0, b.field_t, 0);
              var23 = 3.5 * (var19 * param4);
              if (var21 < var23 * var23) {
                var19 = var19 * (Math.sqrt(var21) / var23);
              }
            } else {
              b.field_t[0] = 1.0;
              var19 = 0.0;
            }
            if (param7) {
              var17 = var17 + 2400.0;
              var14Lifetime1 = 3;
            }
          } else {
            if (nl.field_y[param9]) {
              var19 = 0.0;
            }
            var21 = ap.a(param6, 6, param0, 3);
            b.field_t[1] = param0[4] - var21 * param6[7] - param5 * b.field_t[1];
            stackIn_21_0 = var21;
            if (!(-3.0 > var21 * param6[4])) {
              stackIn_22_1 = 0.0;
            } else {
              stackIn_22_1 = param6[4];
            }
            var23 = stackIn_21_0 * -(stackIn_22_1 + 1.0) / param4;
            b.field_t[0] = -(b.field_t[0] * param5) + (-(param6[6] * var21) + param0[3]);
            b.field_t[2] = -(b.field_t[2] * param5) + (-(param6[8] * var21) + param0[5]);
            if (0.0 > var19) {
              var19 = -var19;
            }
            if (ap.a(b.field_t, 0, b.field_t, 0) < 1e-14) {
              b.field_t[1] = bf.field_b[1] + var17 * param6[7];
              b.field_t[0] = param6[6] * var17 + bf.field_b[0];
              b.field_t[2] = param6[8] * var17 + bf.field_b[2];
              if (1e-14 > ap.a(b.field_t, 0, b.field_t, 0)) {
                var19 = 0.0;
                b.field_t[0] = 1.0;
              }
            }
            var17 = var17 + var23;
          }
          ap.a(b.field_t, 0);
          b.field_t[2] = b.field_t[2] * -var19;
          b.field_t[0] = b.field_t[0] * -var19;
          b.field_t[1] = b.field_t[1] * -var19;
          param3[1] = b.field_t[1] + param6[7] * var17;
          param3[2] = b.field_t[2] + var17 * param6[8];
          param3[0] = b.field_t[0] + param6[6] * var17;
          ap.a(param6, 6, b.field_t, 0, param1, 0);
          param1[2] = param1[2] * (-param5 / var15Lifetime1);
          param1[0] = param1[0] * (-param5 / var15Lifetime1);
          param1[1] = param1[1] * (-param5 / var15Lifetime1);
          stackIn_41_0 = var14Lifetime1;
          return stackIn_41_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_44_0 = var12;
          stackIn_44_1 = new StringBuilder().append("hj.B(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_47_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',');
          if (param1 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          stackIn_53_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          stackIn_56_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',').append(param9).append(')').toString());
        }
    }

    static {
        field_a = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_b = false;
    }
}
