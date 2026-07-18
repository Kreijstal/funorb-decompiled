/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    static String field_b;
    static int field_c;
    static String field_e;
    static w field_a;
    static String field_f;
    static int[] field_d;

    final static ig a(int[] param0, w param1, byte param2, w param3, w param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        String[] var6 = null;
        char[] var7 = null;
        ig[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        me var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        char[] var15 = null;
        char[] var16 = null;
        Object stackIn_9_0 = null;
        ig stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        ig stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var12 = client.field_A ? 1 : 0;
        try {
          L0: {
            var5_int = param0.length;
            var6 = new String[var5_int];
            var16 = new char[var5_int];
            var15 = var16;
            var14 = var15;
            var13 = var14;
            var7 = var13;
            var8 = new ig[var5_int];
            var9 = 49;
            try {
              L1: {
                var10_int = 0;
                L2: while (true) {
                  if (var5_int <= var10_int) {
                    break L1;
                  } else {
                    var11 = wj.field_Qb.a(126, param0[var10_int]);
                    var6[var10_int] = var11.f((byte) -92);
                    var9 = (char)(var9 + 1);
                    var7[var10_int] = (char)var9;
                    var8[var10_int] = null;
                    var10_int++;
                    continue L2;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var10 = (Exception) (Object) decompiledCaughtException;
              stackOut_8_0 = null;
              stackIn_9_0 = stackOut_8_0;
              return (ig) (Object) stackIn_9_0;
            }
            stackOut_10_0 = new ig(0L, param1, param3, param4, var8, param0, var6, var16);
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("wa.D(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(-127).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          L6: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
        return stackIn_11_0;
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        ff var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            var4 = (ff) (Object) cd.field_c.c((byte) 119);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                mc.a(true, var4, 5);
                var4 = (ff) (Object) cd.field_c.d(true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "wa.A(" + 3 + ',' + 5 + ')');
        }
    }

    final static w a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, mm param12) {
        w var13 = null;
        RuntimeException var13_ref = null;
        w stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        w stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var13 = new w(0L, (w) null);
            var13.field_lb = df.a(param9, 0, param6);
            var13.field_S = df.a(param3, 0, param1);
            var13.field_eb = df.a(param0, 0, param5);
            var13.field_Q = df.a(param4, 0, param8);
            var13.field_Ab = df.a(param10, 0, param7);
            var13.field_G = param2;
            var13.field_J = param12;
            stackOut_0_0 = (w) var13;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var13_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var13_ref;
            stackOut_2_1 = new StringBuilder().append("wa.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(-24447).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param12 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public static void a() {
        field_b = null;
        field_a = null;
        field_d = null;
        field_f = null;
        field_e = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var9 = client.field_A ? 1 : 0;
          if (param6 < 80) {
            stackOut_2_0 = param6 / 20 * 18;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 54;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var7 = stackIn_3_0;
        var8 = 0;
        if (param6 >= 60) {
          if (param6 >= 80) {
            if (93 <= param6) {
              hk.a(param3 - 3, param2 + 33, 60, 60, 4, 65280, 100);
              cg.a(0, 2, 6, param3, 1 + (72 + param2), 2, -2);
              cg.a(0, 2, 12, param3, 1 + (param2 - -54), 2, -1);
              cg.a(0, 2, 8, param3, 36 + (param2 + 1), 2, -1);
              cg.a(0, 2, 1, param3 + 18, param2 + 73, 1, -2);
              fb.field_c[0][2].c(param3 - -18, param2 + 36, 18, 18);
              fb.field_c[0][2].c(param3 + 18, 54 + param2, 18, 18);
              fb.field_c[0][2].c(param3 + 36, 72 + param2, 18, 18);
              fb.field_c[0][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
              return;
            } else {
              var8 = vl.a(23841, 80, ve.field_ic[1 + param6 - 80] * 18 + 40);
              cg.a(0, 2, 6, param3, 1 + (72 + param2), 2, -2);
              cg.a(0, 2, 12, param3, 1 + (param2 - -54), 2, -1);
              cg.a(0, 2, 8, param3, 36 + (param2 + 1), 2, -1);
              cg.a(0, 2, 1, param3 + 18, param2 + 73, 1, -2);
              fb.field_c[0][2].c(param3 - -18, param2 + 36, 18, 18);
              fb.field_c[0][2].c(param3 + 18, 54 + param2, 18, 18);
              fb.field_c[0][2].c(param3 + 36, 72 + param2, 18, 18);
              fb.field_c[0][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
              return;
            }
          } else {
            var7 = var7 + vl.a(23841, 80, 18 * param1 - -40);
            cg.a(0, 2, 6, param3, 1 + (72 + param2), 2, -2);
            cg.a(0, 2, 12, param3, 1 + (param2 - -54), 2, -1);
            cg.a(0, 2, 8, param3, 36 + (param2 + 1), 2, -1);
            cg.a(0, 2, 1, param3 + 18, param2 + 73, 1, -2);
            fb.field_c[0][2].c(param3 - -18, param2 + 36, 18, 18);
            fb.field_c[0][2].c(param3 + 18, 54 + param2, 18, 18);
            fb.field_c[0][2].c(param3 + 36, 72 + param2, 18, 18);
            fb.field_c[0][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
            return;
          }
        } else {
          var7 = var7 + vl.a(23841, 80, 40 + 18 * param0);
          cg.a(0, 2, 6, param3, 1 + (72 + param2), 2, -2);
          cg.a(0, 2, 12, param3, 1 + (param2 - -54), 2, -1);
          cg.a(0, 2, 8, param3, 36 + (param2 + 1), 2, -1);
          cg.a(0, 2, 1, param3 + 18, param2 + 73, 1, -2);
          fb.field_c[0][2].c(param3 - -18, param2 + 36, 18, 18);
          fb.field_c[0][2].c(param3 + 18, 54 + param2, 18, 18);
          fb.field_c[0][2].c(param3 + 36, 72 + param2, 18, 18);
          fb.field_c[0][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Invalid password.";
        field_f = "You can join this game";
        field_e = "Send private Quick Chat to <%0>";
    }
}
