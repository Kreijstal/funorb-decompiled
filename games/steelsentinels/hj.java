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

    public static void e(int param0) {
        field_s = null;
        field_u = null;
        if (param0 != 0) {
            return;
        }
        field_H = null;
    }

    final static wk[] a(byte param0, wk param1) {
        wk[] var4 = new wk[9];
        wk[] var2 = var4;
        if (param0 != 26) {
            Object var3 = null;
            nk discarded$0 = hj.a(87, false, (int[]) null, (int[]) null);
        }
        var4[4] = param1;
        return var2;
    }

    final static void a(byte param0, m param1) {
        if (param0 <= 26) {
            return;
        }
        ob.field_r = param1;
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
        int var4 = 0;
        int var5 = 0;
        nk var6 = null;
        nk var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = SteelSentinels.field_G;
        if (param3 != null) {
          if (param3.length != 0) {
            var4 = 0;
            var4++;
            var5 = param3[var4];
            if (param0 == -24809) {
              L0: {
                var6 = ul.a(var5, (byte) 67);
                if (var6 == null) {
                  break L0;
                } else {
                  if (var6.field_Q == 1) {
                    var7 = new nk(var6, param1);
                    var4 = var7.a(var4, param3, param1, 0);
                    var9 = 0;
                    L1: while (true) {
                      if ((var9 ^ -1) <= -9) {
                        var8 = var4;
                        var4 = var8;
                        L2: while (true) {
                          if (param3.length <= var4) {
                            return var7;
                          } else {
                            if (-var8 + var4 < 8) {
                              param2[-var8 + var4] = param3[var4];
                              var4++;
                              continue L2;
                            } else {
                              dh.a("Too much data", (byte) 121);
                              return null;
                            }
                          }
                        }
                      } else {
                        param2[var9] = -1;
                        var9++;
                        continue L1;
                      }
                    }
                  } else {
                    break L0;
                  }
                }
              }
              dh.a(db.a("Chassis not correct id: ID=<%0>", -43, new String[1]), (byte) 120);
              return null;
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static boolean a(int param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!pn.field_w.startsWith("win")) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        if (param1.startsWith("http://")) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (!param1.startsWith("https://")) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0 != 0;
                }
                case 10: {
                    try {
                        var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        var3 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param1.length() <= var3) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((var2.indexOf((int) param1.charAt(var3)) ^ -1) != 0) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0 != 0;
                }
                case 15: {
                    try {
                        var3++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param0 == -9062) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        field_s = null;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                        stackOut_18_0 = 1;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return stackIn_19_0 != 0;
                }
                case 20: {
                    var2_ref = (Exception) (Object) caughtException;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
