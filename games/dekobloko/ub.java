/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static String field_f;
    static String field_e;
    static int[] field_d;
    static String field_b;
    static int field_a;
    static String field_c;

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 0;
                        var4 = fc.field_a;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (rk.field_P.length <= var3_int) {
                            statePc = 15;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5 = k.field_g[var3_int];
                        var10 = var5 ^ -1;
                        var9 = -1;
                        if (var8 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var9 >= var10) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var9 == var10) {
                            statePc = 18;
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
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4 = var4 + ke.field_d;
                        if (var8 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var6 = si.a(false, rk.field_P[var3_int], true);
                        var7 = qk.field_d - (var6 >> -1844375231);
                        var4 = var4 + qk.field_m;
                        if (gi.a(17, param2, param0, var6 + (mb.field_c << 242737281), var4, (pa.field_Y << 1992180769) + cc.field_a, var7 - mb.field_c)) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = var5;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0;
                }
                case 13: {
                    try {
                        var4 = var4 + (qk.field_m + ((pa.field_Y << -922946463) - -cc.field_a));
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3_int++;
                        if (var8 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (param1 == -81) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = -50;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0;
                }
                case 18: {
                    try {
                        stackIn_19_0 = -1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return stackIn_19_0;
                }
                case 20: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var3), "ub.C(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0) {
        if (!jh.field_h) {
          if (param0 != 54) {
            ub.a(-56, (byte) 45, 35);
            return;
          } else {
            return;
          }
        } else {
          hk.d(hk.field_c, hk.field_h, hk.field_g + -hk.field_c, hk.field_b - hk.field_h);
          ie.field_c.a(1141039778, false);
          if (param0 == 54) {
            return;
          } else {
            ub.a(-56, (byte) 45, 35);
            return;
          }
        }
    }

    final static sb a(int param0, int param1, int param2, int param3) {
        sb var4;
        var4 = new sb();
        if (param3 <= 95) {
          field_f = (String) null;
          var4.field_q = new int[param0];
          var4.field_r = param2;
          ef.field_S.a(var4, 2777);
          oi.a(-102, param1, var4);
          return var4;
        } else {
          var4.field_q = new int[param0];
          var4.field_r = param2;
          ef.field_S.a(var4, 2777);
          oi.a(-102, param1, var4);
          return var4;
        }
    }

    public static void b(byte param0) {
        if (param0 > -17) {
          field_e = (String) null;
          field_f = null;
          field_e = null;
          field_c = null;
          field_d = null;
          field_b = null;
          return;
        } else {
          field_f = null;
          field_e = null;
          field_c = null;
          field_d = null;
          field_b = null;
          return;
        }
    }

    static {
        field_f = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_e = "Player";
        field_d = new int[36];
        field_a = 0;
        field_b = "Ready...";
    }
}
