/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends ck {
    int field_D;
    int field_B;
    int field_I;
    static gi field_H;
    int field_M;
    static int field_F;
    int field_O;
    static int field_w;
    int field_K;
    int field_r;
    int field_L;
    sk field_q;
    int field_y;
    em field_A;
    int field_p;
    static String field_u;
    int field_t;
    int field_x;
    int field_C;
    bj field_E;
    int field_v;
    ca field_N;
    static String field_s;
    int field_o;
    int field_z;
    int field_J;

    public static void e() {
        field_s = null;
        field_u = null;
        field_H = null;
    }

    final static wk[] a(byte param0, wk param1) {
        wk[] var2 = null;
        RuntimeException var2_ref = null;
        wk[] var3 = null;
        wk[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        wk[] stackOut_0_0 = null;
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
            var3 = new wk[9];
            var2 = var3;
            var3[4] = param1;
            stackOut_0_0 = (wk[]) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("hj.B(").append(26).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(byte param0, m param1) {
        try {
            ob.field_r = param1;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "hj.E(" + 106 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void d(int param0) {
        ((hj) this).field_A = null;
        ((hj) this).field_N = null;
        if (param0 != 4096) {
            return;
        }
        ((hj) this).field_q = null;
        ((hj) this).field_E = null;
    }

    final static nk a(int param0, boolean param1, int[] param2, int[] param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        nk var6 = null;
        nk var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_20_0 = null;
        nk stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        nk stackOut_22_0 = null;
        Object stackOut_19_0 = null;
        Object stackOut_11_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            if (param3 != null) {
              if (param3.length != 0) {
                var4_int = 0;
                int incrementValue$1 = var4_int;
                var4_int++;
                var5 = param3[incrementValue$1];
                L1: {
                  var6 = ul.a(var5, (byte) 67);
                  if (var6 == null) {
                    break L1;
                  } else {
                    if (var6.field_Q == 1) {
                      var7 = new nk(var6, param1);
                      var4_int = var7.a(var4_int, param3, param1, 0);
                      var9 = 0;
                      L2: while (true) {
                        if (var9 >= 8) {
                          var8 = var4_int;
                          var4_int = var8;
                          L3: while (true) {
                            if (param3.length <= var4_int) {
                              stackOut_22_0 = (nk) var7;
                              stackIn_23_0 = stackOut_22_0;
                              break L0;
                            } else {
                              if (-var8 + var4_int < 8) {
                                param2[-var8 + var4_int] = param3[var4_int];
                                var4_int++;
                                continue L3;
                              } else {
                                dh.a("Too much data", (byte) 121);
                                stackOut_19_0 = null;
                                stackIn_20_0 = stackOut_19_0;
                                return (nk) (Object) stackIn_20_0;
                              }
                            }
                          }
                        } else {
                          param2[var9] = -1;
                          var9++;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                dh.a(db.a("Chassis not correct id: ID=<%0>", -43, new String[1]), (byte) 120);
                stackOut_11_0 = null;
                stackIn_12_0 = stackOut_11_0;
                return (nk) (Object) stackIn_12_0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var4;
            stackOut_24_1 = new StringBuilder().append("hj.D(").append(-24809).append(',').append(param1).append(',');
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
              break L4;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L4;
            }
          }
          L5: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L5;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
        return stackIn_23_0;
    }

    final static boolean a(int param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var4 = SteelSentinels.field_G;
        try {
          try {
            if (!pn.field_w.startsWith("win")) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L0: {
                if (param1.startsWith("http://")) {
                  break L0;
                } else {
                  if (!param1.startsWith("https://")) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  } else {
                    break L0;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L1: while (true) {
                if (param1.length() <= var3) {
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                  stackOut_18_0 = 1;
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0 != 0;
                } else {
                  if (var2.indexOf((int) param1.charAt(var3)) != -1) {
                    var3++;
                    continue L1;
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  }
                }
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            stackOut_20_0 = 0;
            stackIn_21_0 = stackOut_20_0;
            return stackIn_21_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2_ref2;
            stackOut_22_1 = new StringBuilder().append("hj.F(").append(-9062).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L2;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
    }

    hj() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = 4096;
        field_u = "Scamming";
    }
}
