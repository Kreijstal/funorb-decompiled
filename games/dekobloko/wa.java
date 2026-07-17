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
        Object stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        ig stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        ig stackOut_11_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var12 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param2 == -127) {
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
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                return (ig) (Object) stackIn_10_0;
              }
              stackOut_11_0 = new ig(0L, param1, param3, param4, var8, param0, var6, var16);
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (ig) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("wa.D(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44).append(param2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          L6: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_12_0;
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        ff var4 = null;
        sb var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            var4 = (ff) (Object) cd.field_c.c((byte) 119);
            L1: while (true) {
              if (var4 == null) {
                if (param0 == 3) {
                  var5 = (sb) (Object) ef.field_S.c((byte) 80);
                  L2: while (true) {
                    if (var5 == null) {
                      break L0;
                    } else {
                      oi.a(param0 ^ -87, param1, var5);
                      var5 = (sb) (Object) ef.field_S.d(true);
                      continue L2;
                    }
                  }
                } else {
                  return;
                }
              } else {
                mc.a(true, var4, param1);
                var4 = (ff) (Object) cd.field_c.d(true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "wa.A(" + param0 + 44 + param1 + 41);
        }
    }

    final static w a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, mm param12) {
        w var13 = null;
        RuntimeException var13_ref = null;
        Object var14 = null;
        w stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        w stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var13 = new w(0L, (w) null);
              var13.field_lb = df.a(param9, 0, param6);
              var13.field_S = df.a(param3, 0, param1);
              var13.field_eb = df.a(param0, 0, param5);
              var13.field_Q = df.a(param4, param11 + 24447, param8);
              var13.field_Ab = df.a(param10, 0, param7);
              var13.field_G = param2;
              if (param11 == -24447) {
                break L1;
              } else {
                var14 = null;
                ig discarded$1 = wa.a((int[]) null, (w) null, (byte) -92, (w) null, (w) null);
                break L1;
              }
            }
            var13.field_J = param12;
            stackOut_2_0 = (w) var13;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var13_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var13_ref;
            stackOut_4_1 = new StringBuilder().append("wa.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44).append(param8).append(44).append(param9).append(44).append(param10).append(44).append(param11).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param12 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
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
              cg.a(param5, 2, 6, param3, 1 + (72 + param2), 2, -2);
              cg.a(param5, 2, 12, param3, 1 + (param2 - -54), 2, param4);
              cg.a(param5, 2, 8, param3, 36 + (param2 + 1), 2, -1);
              cg.a(param5, 2, 1, param3 + 18, param2 + 73, 1, -2);
              fb.field_c[param5][2].c(param3 - -18, param2 + 36, 18, 18);
              fb.field_c[param5][2].c(param3 + 18, 54 + param2, 18, 18);
              fb.field_c[param5][2].c(param3 + 36, 72 + param2, 18, 18);
              fb.field_c[param5][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
              return;
            } else {
              var8 = vl.a(23841, 80, ve.field_ic[1 + param6 - 80] * 18 + 40);
              cg.a(param5, 2, 6, param3, 1 + (72 + param2), 2, -2);
              cg.a(param5, 2, 12, param3, 1 + (param2 - -54), 2, param4);
              cg.a(param5, 2, 8, param3, 36 + (param2 + 1), 2, -1);
              cg.a(param5, 2, 1, param3 + 18, param2 + 73, 1, -2);
              fb.field_c[param5][2].c(param3 - -18, param2 + 36, 18, 18);
              fb.field_c[param5][2].c(param3 + 18, 54 + param2, 18, 18);
              fb.field_c[param5][2].c(param3 + 36, 72 + param2, 18, 18);
              fb.field_c[param5][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
              return;
            }
          } else {
            var7 = var7 + vl.a(23841, 80, 18 * param1 - -40);
            cg.a(param5, 2, 6, param3, 1 + (72 + param2), 2, -2);
            cg.a(param5, 2, 12, param3, 1 + (param2 - -54), 2, param4);
            cg.a(param5, 2, 8, param3, 36 + (param2 + 1), 2, -1);
            cg.a(param5, 2, 1, param3 + 18, param2 + 73, 1, -2);
            fb.field_c[param5][2].c(param3 - -18, param2 + 36, 18, 18);
            fb.field_c[param5][2].c(param3 + 18, 54 + param2, 18, 18);
            fb.field_c[param5][2].c(param3 + 36, 72 + param2, 18, 18);
            fb.field_c[param5][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
            return;
          }
        } else {
          var7 = var7 + vl.a(23841, 80, 40 + 18 * param0);
          cg.a(param5, 2, 6, param3, 1 + (72 + param2), 2, -2);
          cg.a(param5, 2, 12, param3, 1 + (param2 - -54), 2, param4);
          cg.a(param5, 2, 8, param3, 36 + (param2 + 1), 2, -1);
          cg.a(param5, 2, 1, param3 + 18, param2 + 73, 1, -2);
          fb.field_c[param5][2].c(param3 - -18, param2 + 36, 18, 18);
          fb.field_c[param5][2].c(param3 + 18, 54 + param2, 18, 18);
          fb.field_c[param5][2].c(param3 + 36, 72 + param2, 18, 18);
          fb.field_c[param5][2].c(36 + param3, var7 + (param2 + var8), 18, 18 - var8);
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
