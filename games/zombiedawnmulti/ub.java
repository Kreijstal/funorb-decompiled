/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends ie {
    static int field_wb;
    static String field_tb;
    static String field_xb;
    static cr field_vb;
    static int field_yb;
    static int[] field_ub;

    final static int p(int param0) {
        int var3 = 0;
        int var1_int = 0;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (he.field_a) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          var1_int = 125 % ((-26 - param0) / 58);
          var2 = 0;
          for (var3 = 0; var3 < op.field_m.field_a.length; var3++) {
            var4 = op.field_m.field_a[var3];
            if (var4 > 0) {
              stackIn_12_0 = var2;
              if (fb.field_e.field_M != var3) {
                stackIn_13_1 = var4 / 5;
              } else {
                stackIn_13_1 = var4 / 25;
              }
              var2 = stackIn_12_0 + stackIn_13_1;
            }
          }
          stackIn_16_0 = var2;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "ub.B(" + param0 + ')');
        }
    }

    final static void a(String[][] param0, ul param1, boolean param2, String[][] param3, String[] param4, ul param5, int param6, byte[] param7, ul param8, int param9, int[] param10, byte[] param11, boolean param12, ja[][] param13, ja[][] param14) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        ri[] var16 = null;
        int[] var17 = null;
        try {
          var17 = (int[]) null;
          var16 = (ri[]) null;
          cn.a(param8, 0, param7, (int[]) null, param11, param6, param4, param5, (ri[]) null, param1, param9, param14, param12, param0, param10, param13, param3);
          if (!param2) {
            field_ub = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_5_0 = var15;
          stackIn_5_1 = new StringBuilder().append("ub.C(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param5 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param8 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param11 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param14 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    ub(vk param0, cf param1) {
        super(param0, param1, 33, 20, 30);
    }

    public static void o(int param0) {
        field_xb = null;
        field_ub = null;
        if (param0 <= 49) {
          return;
        }
        field_tb = null;
        field_vb = null;
    }

    final static void n(int param0) {
        if (param0 != 33423425) {
          ub.o(-45);
        }
        if (ee.field_b) {
          fh.b(31706);
        }
    }

    final static void m(int param0) {
        int var1 = -122 / ((param0 + 60) / 48);
        rl.b((byte) -128);
    }

    final static void a(int param0, int param1, int param2, byte param3, int[] param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var17 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          while (true) {
            param0--;
            if (param0 < 0) {
              break;
            }
            var17 = param4;
            var10 = var17;
            var11 = param8;
            var12 = param1;
            var13 = param7;
            var14 = param2;
            var15 = (var17[var11] & 16711422) >> 1;
            var10[var11] = var15 - (-(tq.b(var14, 33428544) >> 17) + (-(tq.b(var12, 33423360) >> 1) - (tq.b(33423425, var13) >> 9)));
            param2 = param2 + param6;
            param1 = param1 + param9;
            param7 = param7 + param5;
            param8++;
          }
          int var10_int = -50 / ((param3 - 47) / 32);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ub.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final void a(cf param0, byte param1) {
        try {
          super.a(param0, (byte) -32);
          int var3_int = -36 / ((param1 - 61) / 56);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ub.FA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_wb = 640;
        field_yb = 0;
        field_xb = "Continue";
        field_tb = "Rating";
    }
}
