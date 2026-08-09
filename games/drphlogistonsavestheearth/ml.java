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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (param0 == -86) {
              var2_int = param1.length();
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                if (var2_int <= var4) {
                  stackIn_8_0 = var3;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3 = oj.a((byte) 124, param1.charAt(var4)) + ((var3 << -636876187) - var3);
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = -23;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("ml.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    final static String b(byte param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_7_0 = (String) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2_ref);

            stackIn_10_1 = new StringBuilder().append("ml.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
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
                var15 = (16711422 & var17[var11]) >> -1049392415;
                var10[var11] = (rk.a(33423494, var13) >> -897546711) + (rk.a(33423360, var12) >> -494343359) - (-rk.a(255, var14 >> -1435990607) - var15);
                param1++;
                param8 = param8 + param0;
                param3 = param3 + param5;
                param7 = param7 + param9;
            }
            int var10_int = -41 / ((param6 - -36) / 63);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "ml.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    public static void a(boolean param0) {
        field_l = null;
        field_m = null;
        field_h = null;
        if (!param0) {
          field_n = (String) null;
          field_n = null;
          field_j = null;
          return;
        } else {
          field_n = null;
          field_j = null;
          return;
        }
    }

    ml(ag param0, gi param1) {
        try {
            this.field_i = param0;
            this.field_k = param0.e();
            this.field_o = param1;
            this.field_i.e(dg.field_e * this.field_k / 80);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "ml.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(byte[] param0, int param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var4_int = -1;
            var5 = param1;
            L1: while (true) {
              if (param2 <= var5) {
                L2: {
                  if (!param3) {
                    break L2;
                  } else {
                    field_m = (String) null;
                    break L2;
                  }
                }
                var4_int = var4_int ^ -1;
                stackIn_7_0 = var4_int;
                break L0;
              } else {
                var4_int = gg.field_f[255 & (var4_int ^ param0[var5])] ^ var4_int >>> -319082040;
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("ml.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    static {
        field_m = "Just play";
        field_j = "Dr Phlogiston Saves the Earth";
    }
}
