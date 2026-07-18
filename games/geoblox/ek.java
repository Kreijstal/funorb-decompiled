/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek {
    static na[] field_a;

    public static void a() {
        field_a = null;
    }

    final static void a(int param0, boolean param1, dm param2, int param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            var6_int = param2.field_r;
            var7 = param2.field_m;
            var8 = 0;
            var9 = 0;
            L1: {
              var10 = param2.field_s;
              var11 = param2.field_o;
              var12 = (var10 << 16) / param4;
              var13 = (var11 << 16) / param0;
              if (param2.field_u <= 0) {
                break L1;
              } else {
                var14 = ((param2.field_u << 16) + (var12 + -1)) / var12;
                var8 = var8 + (-(param2.field_u << 16) + var12 * var14);
                param5 = param5 + var14;
                break L1;
              }
            }
            L2: {
              if (var6_int < var10) {
                param4 = (var12 + ((var6_int << 16) + (-var8 - 1))) / var12;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param2.field_p > 0) {
                var14 = ((param2.field_p << 16) + var13 - 1) / var13;
                var9 = var9 + (var14 * var13 - (param2.field_p << 16));
                param3 = param3 + var14;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var11 <= var7) {
                break L4;
              } else {
                param0 = (var13 + (-var9 + (var7 << 16)) - 1) / var13;
                break L4;
              }
            }
            L5: {
              var14 = param5 - -(vb.field_f * param3);
              var15 = vb.field_f - param4;
              if (vb.field_d < param3 - -param0) {
                param0 = param0 - (-vb.field_d + param3 + param0);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (vb.field_i > param3) {
                var16 = vb.field_i - param3;
                var9 = var9 + var13 * var16;
                param0 = param0 - var16;
                var14 = var14 + vb.field_f * var16;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param4 + param5 <= vb.field_k) {
                break L7;
              } else {
                var16 = param5 + (param4 - vb.field_k);
                var15 = var15 + var16;
                param4 = param4 - var16;
                break L7;
              }
            }
            L8: {
              if (param5 >= vb.field_e) {
                break L8;
              } else {
                var16 = vb.field_e + -param5;
                var14 = var14 + var16;
                var15 = var15 + var16;
                var8 = var8 + var16 * var12;
                param4 = param4 - var16;
                break L8;
              }
            }
            lc.a(var8, param0, vb.field_c, var12, var13, var6_int, var9, var15, var14, param4, (byte) -104, param2.field_v, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var6;
            stackOut_24_1 = new StringBuilder().append("ek.A(").append(param0).append(',').append(true).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw t.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
    }
}
