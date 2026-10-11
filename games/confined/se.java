/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    static bi field_a;

    final static void a(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          var5 = bd.field_g;
          var1 = var5;
          var2 = param0;
          var3 = var5.length;
          while (var3 > var2) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1_ref), "se.B(" + param0 + ')');
        }
    }

    final static void a(vg param0, boolean param1, double[] param2, boolean param3, double param4, double param5, dj param6) {
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_11_3;
        int[] stackIn_12_4;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var9_double = 0.0;
        RuntimeException var9 = null;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        int var17 = 0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        try {
          var9_double = param6.field_E + param2[9] * param6.field_C;
          var11 = param6.field_t + param6.field_C * param2[10];
          if (param1) {
            field_a = (bi) null;
          }
          var13 = param6.field_D + param2[11] * param6.field_C;
          var15 = param4 * 1.0;
          var17 = (int)(32768.0 * var15);
          var18 = var9_double - param0.field_T;
          var20 = -param0.field_L + var11;
          var22 = var13 - param0.field_O;
          var24 = var20 * param0.field_ab + param0.field_R * var18 + var22 * param0.field_M;
          var26 = param0.field_F * var22 + (param0.field_U * var20 + param0.field_V * var18);
          var28 = var20 * param0.field_H + var18 * param0.field_P + var22 * param0.field_N;
          if (var28 >= 0.15) {
            var30 = 5120 + (int)(var24 / var28 * 10240.0);
            var31 = 3008 + (int)(10240.0 * (var26 / var28));
            var17 = (int)qn.field_v.a((double)var17 * (-(var22 / param5) + 1.0), 0, var13);
            var32 = (int)(0.2 / var28 * 10240.0);
            var33 = var17 >> 10;
            if (127 < var33) {
              var33 = 127;
            }
            stackIn_8_0 = var30;
            stackIn_8_1 = var31;
            if (var32 <= 4100) {
              stackIn_9_2 = var32;
            } else {
              stackIn_9_2 = 4100;
            }
            stackIn_11_3 = var33;
            if (!param3) {
              stackIn_12_4 = mm.field_cb;
            } else {
              stackIn_12_4 = mm.field_gb;
            }
            fn.a(stackIn_8_0, stackIn_8_1, stackIn_9_2, stackIn_11_3, stackIn_12_4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_16_0 = var9;
          stackIn_16_1 = new StringBuilder().append("se.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 >= -113) {
          field_a = (bi) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
    }
}
