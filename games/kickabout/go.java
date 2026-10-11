/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class go {
    static String field_a;
    static int field_b;

    final static int a(ea param0, int param1, int param2, int[][][] param3) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 2) {
            stackIn_2_0 = -param3[param0.field_c][param0.field_i][param0.field_k] + (param3[param0.field_c][param0.field_d][param0.field_k] - param3[param0.field_c][param0.field_d][param0.field_e]) + param3[param0.field_c][param0.field_i][param0.field_e];
            return stackIn_2_0;
          }
          if (param1 == 1) {
            stackIn_5_0 = -param3[param0.field_c][param0.field_i][param0.field_k] + (param3[param0.field_c][param0.field_i][param0.field_e] + param3[param0.field_l][param0.field_i][param0.field_k] - param3[param0.field_l][param0.field_i][param0.field_e]);
            return stackIn_5_0;
          }
          if (param2 != param1) {
            return 0;
          }
          stackIn_9_0 = -param3[param0.field_c][param0.field_i][param0.field_k] + (param3[param0.field_l][param0.field_i][param0.field_k] - param3[param0.field_l][param0.field_d][param0.field_k]) + param3[param0.field_c][param0.field_d][param0.field_k];
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("go.A(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        int var1 = -108 / ((-5 - param0) / 34);
        field_a = null;
    }

    final static int a(int param0, byte param1) {
        if (param1 == -56) {
          return ((int)((-fw.field_G + (-jr.field_Gb + (double)param0)) * (double)hw.field_i) >> 8) + 240;
        }
        return 123;
    }

    final static void a(int param0, nu param1, int param2, int param3, int param4, int param5) {
        nl stackIn_4_0 = null;
        int stackIn_5_1 = 0;
        nl stackIn_28_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_34_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_37_1 = 0;
        int stackIn_38_2 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        nl var11 = null;
        try {
          var11 = param1.field_P[param3][param4];
          var7 = param5 << 16;
          var8 = param0 << 16;
          if (var11.field_M == var7 &&
            var8 == var11.field_w) {
            stackIn_4_0 = var11;
            if (param3 == 0) {
              stackIn_5_1 = -1;
            } else {
              stackIn_5_1 = 1;
            }
            stackIn_4_0.field_n = stackIn_5_1;
            var11.field_j = 0;
            if (var11.field_u != 0) {
              var11.a((byte) -31, 0);
            }
            return;
          }
          if (var11.field_u == 11) {
            if ((8 & var11.field_G) != 0 &&
              var11.field_M > var7) {
              var11.field_M = var7;
            }
            if (0 != (2 & var11.field_G) &&
              var7 > var11.field_M) {
              var11.field_M = var7;
            }
            if ((var11.field_G & 4) != 0 &&
              var11.field_w < var8) {
              var11.field_w = var8;
            }
            if ((var11.field_G & 1) != 0 &&
              var11.field_w > var8) {
              var11.field_w = var8;
            }
          }
          var9 = var11.f(param2 ^ -119);
          if (param2 != 0) {
            go.a(-38);
          }
          var10 = var11.a(true);
          stackIn_28_0 = var11;
          if (var9 < param5) {
            stackIn_29_1 = 8;
          } else {
            stackIn_29_1 = 0;
          }
          if (var9 <= param5) {
            stackIn_32_2 = 0;
          } else {
            stackIn_32_2 = 2;
          }
          stackIn_34_1 = stackIn_29_1 | stackIn_32_2;
          if (param0 > var10) {
            stackIn_35_2 = 1;
          } else {
            stackIn_35_2 = 0;
          }
          stackIn_37_1 = stackIn_34_1 | stackIn_35_2;
          if (param0 < var10) {
            stackIn_38_2 = 4;
          } else {
            stackIn_38_2 = 0;
          }
          stackIn_28_0.field_G = stackIn_37_1 | stackIn_38_2;
          var11.field_L = 2;
          var11.field_u = 11;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_42_0 = var6;
          stackIn_42_1 = new StringBuilder().append("go.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_a = "You have withdrawn your request to join.";
        field_b = 0;
    }
}
