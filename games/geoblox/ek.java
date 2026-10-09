/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek {
    static na[] field_a;

    public static void a(int param0) {
        if (param0 >= -127) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0, boolean param1, dm param2, int param3, int param4, int param5) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        int var14Lifetime1;
        int var14Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        try {
          var6_int = param2.field_r;
          var7 = param2.field_m;
          var8 = 0;
          var9 = 0;
          if (!param1) {
            return;
          }
          var10 = param2.field_s;
          var11 = param2.field_o;
          var12 = (var10 << 16) / param4;
          var13 = (var11 << 16) / param0;
          if (param2.field_u > 0) {
            var14 = ((param2.field_u << 16) + (var12 - 1)) / var12;
            var8 = var8 + (-(param2.field_u << 16) + var12 * var14);
            param5 = param5 + var14;
          }
          if (var6_int < var10) {
            param4 = (var12 + ((var6_int << 16) + (-var8 - 1))) / var12;
          }
          if (param2.field_p > 0) {
            var14Lifetime1 = ((param2.field_p << 16) + var13 - 1) / var13;
            var9 = var9 + (var14Lifetime1 * var13 - (param2.field_p << 16));
            param3 = param3 + var14Lifetime1;
          }
          if (var11 > var7) {
            param0 = (var13 + (-var9 + (var7 << 16)) - 1) / var13;
          }
          var14Lifetime2 = param5 + vb.field_f * param3;
          var15 = vb.field_f - param4;
          if (vb.field_d < param3 + param0) {
            param0 = param0 - (-vb.field_d + param3 + param0);
          }
          if (vb.field_i > param3) {
            var16 = vb.field_i - param3;
            var9 = var9 + var13 * var16;
            param0 = param0 - var16;
            var14Lifetime2 = var14Lifetime2 + vb.field_f * var16;
          }
          if (param4 + param5 > vb.field_k) {
            var16Lifetime1 = param5 + (param4 - vb.field_k);
            var15 = var15 + var16Lifetime1;
            param4 = param4 - var16Lifetime1;
          }
          if (param5 < vb.field_e) {
            var16Lifetime2 = vb.field_e - param5;
            var14Lifetime2 = var14Lifetime2 + var16Lifetime2;
            var15 = var15 + var16Lifetime2;
            var8 = var8 + var16Lifetime2 * var12;
            param4 = param4 - var16Lifetime2;
          }
          lc.a(var8, param0, vb.field_c, var12, var13, var6_int, var9, var15, var14Lifetime2, param4, (byte) -104, param2.field_v, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_26_0 = var6;
          stackIn_26_1 = new StringBuilder().append("ek.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
    }
}
