/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g implements j {
    private int field_h;
    private int field_b;
    private int field_e;
    private int field_d;
    private int field_f;
    private int field_g;
    private eg field_a;
    static ka[][][] field_i;
    private int field_c;

    final static String a(String param0, byte param1, java.applet.Applet param2) {
        try {
            int var3_int = 0;
            RuntimeException var3 = null;
            String var4 = null;
            Throwable var4_ref = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String stackIn_7_0 = null;
            Object stackIn_12_0 = null;
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
            Throwable decompiledCaughtException = null;
            String stackOut_6_0 = null;
            Object stackOut_11_0 = null;
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
            var8 = TorChallenge.field_F ? 1 : 0;
            try {
              L0: {
                var3_int = -68 % ((param1 - -48) / 58);
                try {
                  L1: {
                    var4 = (String) ff.a("getcookies", param2, 20511);
                    var5 = dl.a(var4, ';', -75);
                    var6 = 0;
                    L2: while (true) {
                      if (var5.length <= var6) {
                        break L1;
                      } else {
                        L3: {
                          var7 = var5[var6].indexOf('=');
                          if (var7 < 0) {
                            break L3;
                          } else {
                            if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) param0)) {
                              break L3;
                            } else {
                              stackOut_6_0 = var5[var6].substring(var7 - -1).trim();
                              stackIn_7_0 = stackOut_6_0;
                              return stackIn_7_0;
                            }
                          }
                        }
                        var6++;
                        continue L2;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var4_ref = decompiledCaughtException;
                    break L4;
                  }
                }
                stackOut_11_0 = null;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) var3;
                stackOut_13_1 = new StringBuilder().append("g.C(");
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
                  break L5;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L5;
                }
              }
              L6: {
                stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param1).append(44);
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param2 == null) {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L6;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L6;
                }
              }
              throw oj.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
            }
            return (String) (Object) stackIn_12_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_i = null;
    }

    final static boolean a(int param0, int param1) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param0 > 76) {
          if (-1 == param1) {
            return true;
          } else {
            L0: {
              if (0 == (1 << param1 & lb.field_s)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return true;
        }
    }

    public final void a(ee param0, int param1, int param2, byte param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        uc var14 = null;
        ee stackIn_3_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        ee stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param0 instanceof uc) {
                stackOut_2_0 = (ee) param0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (ee) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var14 = (uc) (Object) stackIn_3_0;
              qg.f(param0.field_m + param2, param1 + param0.field_i, param0.field_p, param0.field_l, ((g) this).field_c);
              if (var14 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = var14.field_S + param0.field_m + param2;
              var8 = param1 + (param0.field_i + var14.field_W);
              qg.e(var7, var8, var14.field_V, ((g) this).field_d);
              if (var14.field_O != -1) {
                var9 = 3.141592653589793 * (double)var14.field_O * 2.0 / (double)var14.field_Q;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_V);
                var12 = (int)(Math.cos(var9) * (double)var14.field_V);
                qg.e(var11 + var7, var8 - -var12, 1, ((g) this).field_h);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              qg.e(var7, var8, 2, 1);
              var9 = 2.0 * ((double)var14.field_P * 3.141592653589793) / (double)var14.field_Q;
              if (param3 == 97) {
                break L4;
              } else {
                ((g) this).field_d = 76;
                break L4;
              }
            }
            L5: {
              var11 = (int)(-Math.sin(var9) * (double)var14.field_V);
              var12 = (int)(Math.cos(var9) * (double)var14.field_V);
              qg.d(var7, var8, var7 - -var11, var12 + var8, 1);
              if (((g) this).field_a == null) {
                break L5;
              } else {
                var13 = var14.field_V + var14.field_S + ((g) this).field_g;
                int discarded$1 = ((g) this).field_a.a(param0.field_v, var13 + (param0.field_m + param2), ((g) this).field_f + (param1 + param0.field_i), -((g) this).field_g + (-var13 + param0.field_p), -(((g) this).field_g << 1) + param0.field_l, ((g) this).field_e, ((g) this).field_b, 1, 1, 0);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("g.A(");
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
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    g(eg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((g) this).field_g = param1;
            ((g) this).field_f = param2;
            ((g) this).field_a = param0;
            ((g) this).field_b = param4;
            ((g) this).field_c = param7;
            ((g) this).field_h = param6;
            ((g) this).field_d = param5;
            ((g) this).field_e = param3;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "g.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new ka[16][3][];
    }
}
