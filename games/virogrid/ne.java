/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static String field_b;
    static String field_g;
    static String field_f;
    static int[] field_e;
    static char field_a;
    static um field_c;
    static String field_d;

    public static void a(boolean param0) {
        field_g = null;
        if (param0) {
            field_b = null;
        }
        field_c = null;
        field_e = null;
        field_f = null;
        field_d = null;
        field_b = null;
    }

    final static void a(byte param0, int param1) {
        l var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        fa var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (fa) (Object) oi.field_a.a((byte) -115);
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  var2 = di.field_v.a((byte) -67);
                  if (param0 == 19) {
                    break L2;
                  } else {
                    field_f = null;
                    break L2;
                  }
                }
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    wb.a(6, param0 + -19);
                    var2 = di.field_v.a(16213);
                    continue L3;
                  }
                }
              } else {
                bf.a(var4, 4, 6);
                var4 = (fa) (Object) oi.field_a.a(16213);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var2_ref, "ne.B(" + param0 + 44 + 6 + 41);
        }
    }

    final static boolean a(int param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          try {
            if (pd.field_x.startsWith("win")) {
              L0: {
                if (param1.startsWith("http://")) {
                  break L0;
                } else {
                  if (param1.startsWith("https://")) {
                    break L0;
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0 != 0;
                  }
                }
              }
              L1: {
                var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                var3 = 0;
                if (param0 == 10448) {
                  break L1;
                } else {
                  ne.a(true);
                  break L1;
                }
              }
              L2: while (true) {
                if (var3 >= param1.length()) {
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                  stackOut_15_0 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0 != 0;
                } else {
                  if (var2.indexOf((int) param1.charAt(var3)) != -1) {
                    var3++;
                    continue L2;
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            stackOut_17_0 = 0;
            stackIn_18_0 = stackOut_17_0;
            return stackIn_18_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2_ref2;
            stackOut_19_1 = new StringBuilder().append("ne.F(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    final static String a(byte param0) {
        if (!(ao.field_Kb != pa.field_l)) {
            return rh.field_b;
        }
        if (ao.field_Kb == cb.field_c) {
            return ve.field_u;
        }
        if (!(w.field_I.b(-88))) {
            return ve.field_u;
        }
        return pm.field_g;
    }

    final static mg[] a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        mg var9 = null;
        mg var10 = null;
        mg var11 = null;
        mg var12 = null;
        mg var13 = null;
        Object var14 = null;
        int[] var15 = null;
        mg var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        L0: {
          var20 = df.field_d;
          var19 = var20;
          var18 = var19;
          var17 = var18;
          var15 = var17;
          var6 = var15;
          var7 = df.field_e;
          var8 = df.field_f;
          var9 = new mg(param1, -(param1 * 2) + param0);
          var9.b();
          df.a(0, 0, param1, param0 + -(2 * param1), param5, param4);
          var10 = new mg(param1, param1);
          var10.b();
          df.b(0, 0, param1, param1, param5);
          var11 = new mg(16, param1);
          var11.b();
          df.b(0, 0, 16, param1, param5);
          var12 = new mg(param1, param1);
          var12.b();
          df.b(0, 0, param1, param1, param4);
          var13 = new mg(16, param1);
          var13.b();
          if (param3 == 106) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        L1: {
          df.b(0, 0, 16, param1, param4);
          var14 = null;
          if (param2 > 0) {
            var16 = new mg(16, 16);
            var14 = (Object) (Object) var16;
            var16.b();
            df.b(0, 0, 16, 16, param2);
            break L1;
          } else {
            break L1;
          }
        }
        df.a(var20, var7, var8);
        return new mg[]{var10, var11, var10, var9, (mg) var14, var9, var12, var13, var12};
    }

    final static void a(int param0) {
        kf.a(17, -1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Game drawn";
        field_a = '/';
        field_f = "Password is valid";
        field_d = "Mute this player for 48 hours";
    }
}
