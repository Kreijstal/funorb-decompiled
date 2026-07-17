/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml extends gi {
    ag field_i;
    static String field_n;
    static String field_h;
    static ok field_l;
    static String field_m;
    int field_k;
    gi field_o;
    static String field_j;

    final static int a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (param0 == -86) {
              var2_int = param1.length();
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                if (var2_int <= var4) {
                  stackOut_7_0 = var3;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  var3 = oj.a((byte) 124, param1.charAt(var4)) + ((var3 << 5) - var3);
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = -23;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("ml.D(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0;
    }

    final static String b(byte param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var2 = lf.a(ub.a(122, param1), (byte) -98);
              if (var2 == null) {
                var2 = "";
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 >= 22) {
              stackOut_6_0 = (String) var2;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (String) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2_ref;
            stackOut_8_1 = new StringBuilder().append("ml.B(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, byte param6, int param7, int param8, int param9) {
        int[] var17 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
            while (true) {
                param2--;
                if (0 > param2) {
                    break;
                }
                var17 = param4;
                var10 = var17;
                var11 = param1;
                var12 = param8;
                var13 = param3;
                var14 = param7;
                var15 = (16711422 & var17[var11]) >> 1;
                var10[var11] = (rk.a(33423494, var13) >> 9) + (rk.a(33423360, var12) >> 1) - (-rk.a(255, var14 >> 17) - var15);
                param1++;
                param8 = param8 + param0;
                param3 = param3 + param5;
                param7 = param7 + param9;
            }
            int var10_int = -41 / ((param6 - -36) / 63);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "ml.E(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    public static void a(boolean param0) {
        field_l = null;
        field_m = null;
        field_h = null;
        field_n = null;
        field_n = null;
        field_j = null;
    }

    ml(ag param0, gi param1) {
        try {
            ((ml) this).field_i = param0;
            ((ml) this).field_k = param0.e();
            ((ml) this).field_o = param1;
            ((ml) this).field_i.e(dg.field_e * ((ml) this).field_k / 80);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "ml.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static int a(byte[] param0, int param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var4_int = -1;
            var5 = param1;
            L1: while (true) {
              if (param2 <= var5) {
                field_m = null;
                var4_int = ~var4_int;
                stackOut_4_0 = var4_int;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var4_int = gg.field_f[255 & (var4_int ^ param0[var5])] ^ var4_int >>> 8;
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("ml.A(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + 0 + 41);
        }
        return stackIn_5_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Just play";
        field_j = "Dr Phlogiston Saves the Earth";
    }
}
