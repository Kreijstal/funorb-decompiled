/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static String field_d;
    static jp[][] field_a;
    static int field_h;
    static boolean field_c;
    static int field_f;
    static jp field_g;
    static String field_b;
    static int[] field_e;

    final static fr a(int param0, pi param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        fr var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        fr stackIn_39_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int stackOut_24_0;
        int stackOut_24_1;
        int stackOut_30_0;
        int stackOut_30_1;
        fr stackOut_38_0;
        RuntimeException stackOut_41_0;
        StringBuilder stackOut_41_1;
        RuntimeException stackOut_42_0;
        StringBuilder stackOut_42_1;
        String stackOut_42_2;
        RuntimeException stackOut_44_0;
        StringBuilder stackOut_44_1;
        String stackOut_44_2;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param1.c(8, (byte) 62);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (0 < var2_int) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw new IllegalStateException("" + var2_int);
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3 = eo.a(false, param1) ? 1 : 0;
                        var4 = eo.a(false, param1) ? 1 : 0;
                        var5 = new fr();
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5.field_w = (short)param1.c(16, (byte) -114);
                        var5.field_B = uj.a((byte) -67, var5.field_B, param1, 16);
                        var5.field_Q = uj.a((byte) -117, var5.field_Q, param1, 16);
                        var5.field_P = uj.a((byte) -110, var5.field_P, param1, param0);
                        var5.field_C = (short)param1.c(16, (byte) 79);
                        var5.field_G = uj.a((byte) -64, var5.field_G, param1, 16);
                        var5.field_b = uj.a((byte) -74, var5.field_b, param1, 16);
                        var5.field_c = uj.a((byte) -124, var5.field_c, param1, 16);
                        if (var3 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5.field_o = (short)param1.c(16, (byte) 52);
                        var5.field_n = uj.a((byte) -107, var5.field_n, param1, 16);
                        var5.field_H = uj.a((byte) -77, var5.field_H, param1, 16);
                        var5.field_a = uj.a((byte) -117, var5.field_a, param1, 16);
                        var5.field_v = uj.a((byte) -68, var5.field_v, param1, 16);
                        var5.field_h = uj.a((byte) -80, var5.field_h, param1, 16);
                        var5.field_t = uj.a((byte) -61, var5.field_t, param1, 16);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var4 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        int discarded$1 = param1.c(16, (byte) 101);
                        var5.field_z = uj.a((byte) -122, var5.field_z, param1, 16);
                        var5.field_m = uj.a((byte) -92, var5.field_m, param1, 16);
                        var5.field_K = uj.a((byte) -123, var5.field_K, param1, 16);
                        var5.field_j = uj.a((byte) -104, var5.field_j, param1, 16);
                        var5.field_J = uj.a((byte) -124, var5.field_J, param1, 16);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (eo.a(false, param1)) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5.field_L = uj.a((byte) -65, var5.field_L, param1, 16);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (eo.a(false, param1)) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var5.field_p = ri.a(var5.field_p, 16, param1, 20);
                        var6 = 0;
                        var7 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((var5.field_p.length ^ -1) >= (var7 ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = var5.field_p[var7] & 255;
                        stackOut_24_1 = var6;
                        stackIn_31_0 = stackOut_24_0;
                        stackIn_31_1 = stackOut_24_1;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        if (var8 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 <= stackIn_25_1) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var6 = 255 & var5.field_p[var7];
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var7++;
                        if (var8 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = -1;
                        stackOut_30_1 = var6 ^ -1;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 != stackIn_31_1) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var5.field_p = null;
                        if (var8 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var5.field_A = (byte)(1 + var6);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = (fr) var5;
                        stackIn_39_0 = stackOut_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 39: {
                    return (fr) (Object) stackIn_39_0;
                }
                case 40: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    try {
                        stackOut_41_0 = (RuntimeException) var2;
                        stackOut_41_1 = new StringBuilder().append("hc.C(").append(param0).append(44);
                        stackIn_44_0 = stackOut_41_0;
                        stackIn_44_1 = stackOut_41_1;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        if (param1 == null) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
                        stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
                        stackOut_42_2 = "{...}";
                        stackIn_45_0 = stackOut_42_0;
                        stackIn_45_1 = stackOut_42_1;
                        stackIn_45_2 = stackOut_42_2;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 44: {
                    stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
                    stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
                    stackOut_44_2 = "null";
                    stackIn_45_0 = stackOut_44_0;
                    stackIn_45_1 = stackOut_44_1;
                    stackIn_45_2 = stackOut_44_2;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    throw qb.a((Throwable) (Object) stackIn_45_0, (String) (Object) (stackIn_45_2 + 41));
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_e = null;
              field_a = null;
              field_d = null;
              field_b = null;
              if (param0 < -59) {
                break L0;
              } else {
                field_c = true;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_g = null;
        }
    }

    final static void b(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        re.field_b.a(1);
                        var1_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-33 >= (var1_int ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ig.field_M[var1_int] = 0L;
                        var1_int++;
                        if (var2 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var2 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var1_int = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (32 <= var1_int) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        sm.field_c[var1_int] = 0L;
                        var1_int++;
                        if (var2 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var2 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (param0 == 2) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        field_c = false;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        c.field_a = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    throw qb.a((Throwable) (Object) runtimeException, "hc.D(" + param0 + 41);
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0, tp[] param1, int[] param2, mf param3, mf param4) {
        tp[] var5 = null;
        tp[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        hl var7 = null;
        mh var8 = null;
        mh var9 = null;
        mh var10 = null;
        mh var11 = null;
        jp[] var12 = null;
        jp[] var13 = null;
        jp[] var14 = null;
        mh var15 = null;
        jp[] var16 = null;
        jp[] var17 = null;
        int var18 = 0;
        L0: {
          var18 = BrickABrac.field_J ? 1 : 0;
          var5 = wq.a("lobby", param3, "crowns", -946715356);
          mq.field_g = var5.length;
          if (null != param1) {
            var6 = new tp[mq.field_g - -param1.length];
            var7_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((mq.field_g ^ -1) >= (var7_int ^ -1)) {
                    break L3;
                  } else {
                    var6[var7_int] = var5[var7_int];
                    var7_int++;
                    if (var18 != 0) {
                      break L2;
                    } else {
                      if (var18 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var7_int = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  if (param1.length <= var7_int) {
                    break L5;
                  } else {
                    var6[mq.field_g + var7_int] = param1[var7_int];
                    var7_int++;
                    if (var18 != 0) {
                      break L0;
                    } else {
                      if (var18 == 0) {
                        continue L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var5 = var6;
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        var6_array = new int[var5.length];
        var7_int = 0;
        L6: while (true) {
          L7: {
            L8: {
              L9: {
                L10: {
                  if ((mq.field_g ^ -1) >= (var7_int ^ -1)) {
                    break L10;
                  } else {
                    var6_array[var7_int] = 10;
                    var7_int++;
                    if (var18 != 0) {
                      break L9;
                    } else {
                      if (var18 == 0) {
                        continue L6;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                if (null != param1) {
                  break L9;
                } else {
                  break L8;
                }
              }
              L11: {
                if (null != param2) {
                  break L11;
                } else {
                  var7_int = 0;
                  L12: while (true) {
                    L13: {
                      if (var7_int >= param1.length) {
                        break L13;
                      } else {
                        var6_array[mq.field_g + var7_int] = param1[var7_int].field_h;
                        var7_int++;
                        if (var18 != 0) {
                          break L7;
                        } else {
                          if (var18 == 0) {
                            continue L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    if (var18 == 0) {
                      break L8;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              var7_int = 0;
              L14: while (true) {
                if ((var7_int ^ -1) <= (param1.length ^ -1)) {
                  break L8;
                } else {
                  var6_array[mq.field_g + var7_int] = param2[var7_int];
                  var7_int++;
                  if (var18 != 0) {
                    break L7;
                  } else {
                    if (var18 == 0) {
                      continue L14;
                    } else {
                      break L8;
                    }
                  }
                }
              }
            }
            np.field_a = 15;
            re.field_g = 2;
            om.field_oc = 4;
            break L7;
          }
          if (param0 >= 102) {
            kn.field_z = 2;
            ok.field_f = 11;
            var7 = nq.a((byte) -37, "lobby", param3, param4, "largefont");
            rd.field_e = nq.a((byte) -37, "lobby", param3, param4, "generalfont");
            ul.field_m = nq.a((byte) -37, "lobby", param3, param4, "chatfont");
            var7.a((fc[]) (Object) var5, var6_array);
            rd.field_e.a((fc[]) (Object) var5, var6_array);
            ul.field_m.a((fc[]) (Object) var5, var6_array);
            var8 = new mh(0L, (mh) null);
            var8.field_O = (dh) (Object) var7;
            var8.field_X = 16777215;
            var8.field_R = np.field_a;
            var8.field_Q = 1;
            var9 = var8;
            var9.field_S = 1;
            var10 = new mh(0L, (mh) null);
            var10.field_R = np.field_a;
            var10.field_X = 16777215;
            var10.field_O = (dh) (Object) rd.field_e;
            var11 = var10;
            var10.field_Q = 1;
            var11.field_S = 1;
            qh.field_j = new mh(0L, var8);
            qh.field_j.field_Jb = qg.a(cr.a("lobby", param3, "heading", 2), (byte) -117);
            lp.field_Ab = new mh(0L, (mh) null);
            lp.field_Ab.field_Jb = vp.a(false, (byte) 83, 8421504, 120, 4210752, false);
            f.field_a = new mh(0L, (mh) null);
            f.field_a.field_Jb = na.a(false, 6316128, 3, 6316128, 114, 1);
            ij.field_c = new mh(0L, (mh) null);
            ij.field_c.field_Jb = qg.a(cr.a("lobby", param3, "popup", 2), (byte) -114);
            var12 = qg.a(cr.a("lobby", param3, "popup_mouseover", 2), (byte) -117);
            var13 = cr.a("lobby", param3, "button", 2);
            var14 = qg.a(cr.a("lobby", param3, "tab_active", 2), (byte) -110);
            rf.field_c = new mh(0L, var8);
            rf.field_c.field_Jb = var14;
            am.field_Zb = new mh(0L, (mh) null);
            am.field_Zb.field_wb = pl.a("lobby", "closebutton", (byte) -90, param3);
            am.field_Zb.field_T = pl.a("lobby", "closebutton_mouseover", (byte) 119, param3);
            lj.field_k = new mh(0L, var8);
            lj.field_k.field_Jb = vp.a(true, (byte) 57, 3815994, 40, 2039583, true);
            rp.field_t = new mh(0L, var10);
            rp.field_t.field_V = 2;
            rp.field_t.field_Jb = vp.a(true, (byte) 44, 3815994, 30, 2039583, false);
            cd.field_d = new mh(0L, var10);
            cd.field_d.field_V = 2;
            cd.field_d.field_Jb = vp.a(false, (byte) 77, 3815994, 30, 2039583, false);
            ik.field_a = new mh(0L, var10);
            ik.field_a.field_V = 2;
            ik.field_a.field_Jb = vp.a(false, (byte) 83, 3815994, 30, 2039583, true);
            ad.field_l = new mh(0L, (mh) null);
            ad.field_l.field_Q = 1;
            ad.field_l.field_O = (dh) (Object) rd.field_e;
            ad.field_l.field_R = np.field_a;
            ad.field_l.field_X = 13421772;
            tk.field_t = new mh(0L, ad.field_l);
            tk.field_t.field_Fb = 16777215;
            tk.field_t.field_I = 8421504;
            tk.field_t.field_X = 16764006;
            tk.field_t.field_Y = 16777215;
            tk.field_t.field_vb = 16777215;
            var15 = new mh(0L, tk.field_t);
            var15.field_O = (dh) (Object) var7;
            var15.field_X = 16777215;
            var15.field_R = np.field_a;
            vo.field_C = new mh(0L, ad.field_l);
            vo.field_C.field_Jb = vp.a(false, (byte) 94, 2236962, 16, 2236962, false);
            vo.field_C.field_V = 2;
            wi.field_n = new mh(0L, ad.field_l);
            wi.field_n.field_Jb = vp.a(false, (byte) 80, 1513239, 16, 1513239, false);
            wi.field_n.field_V = 2;
            fp.field_v = new mh(0L, vo.field_C);
            fp.field_v.a((byte) -82, tk.field_t);
            vb.field_K = new mh(0L, wi.field_n);
            vb.field_K.a((byte) -72, tk.field_t);
            var16 = cr.a("lobby", param3, "button_mouseover", 2);
            ce.field_b = new br(ij.field_c, var12, ad.field_l, tk.field_t, 3, 2, kn.field_z, 3, np.field_a);
            fi.field_s = new mh(0L, tk.field_t);
            fi.field_s.field_E = 1;
            fi.field_s.field_ub = 1;
            fi.field_s.field_N = 1;
            fi.field_s.field_Gb = var16;
            fi.field_s.field_Jb = var13;
            fi.field_s.field_rb = 1;
            fi.field_s.field_D = cr.a("lobby", param3, "button_mouseheld", 2);
            fi.field_s.field_pb = cr.a("lobby", param3, "button_active", 2);
            fi.field_s.field_Ab = cr.a("lobby", param3, "button_disabled", 2);
            fi.field_s.field_S = 1;
            eh.field_n = new mh(0L, tk.field_t);
            eh.field_n.field_S = 1;
            eh.field_n.field_Jb = qg.a(cr.a("lobby", param3, "tab_inactive", 2), (byte) -119);
            eh.field_n.field_Gb = qg.a(cr.a("lobby", param3, "tab_mouseover", 2), (byte) -124);
            eh.field_n.field_pb = var14;
            hd.field_c = new mh(0L, (mh) null);
            hd.field_c.field_Jb = na.a(false, 1127256, 3, 1856141, 206, -1);
            qb.field_x = new mh(0L, (mh) null);
            qb.field_x.field_Jb = na.a(false, 6052956, 3, 11579568, 290, -1);
            fm.field_b = new mh(0L, var15);
            fm.field_b.field_rb = 1;
            fm.field_b.field_N = 1;
            fm.field_b.field_E = 1;
            fm.field_b.field_S = 1;
            fm.field_b.field_ub = 1;
            ij.field_b = new mh(0L, fm.field_b);
            uk.field_r = new mh(0L, tk.field_t);
            uk.field_r.field_N = 1;
            uk.field_r.field_S = 1;
            uk.field_r.field_E = 1;
            uk.field_r.field_rb = 1;
            uk.field_r.field_ub = 1;
            ok.field_d = new mh(0L, uk.field_r);
            ee.field_s = new mh(0L, uk.field_r);
            ab.field_x = new mh(0L, fm.field_b);
            im.field_d = new mh(0L, uk.field_r);
            fp.field_u = new mh(0L, uk.field_r);
            al.field_n = new mh(0L, uk.field_r);
            uk.field_r.field_Jb = qg.a(cr.a("lobby", param3, "smallbutton", 2), (byte) -119);
            uk.field_r.field_Gb = qg.a(cr.a("lobby", param3, "smallbutton_mouseover", 2), (byte) -114);
            uk.field_r.field_pb = qg.a(cr.a("lobby", param3, "smallbutton_active", 2), (byte) -102);
            uk.field_r.field_D = qg.a(cr.a("lobby", param3, "smallbutton_active", 2), (byte) -102);
            uk.field_r.field_Ab = qg.a(cr.a("lobby", param3, "smallbutton_disabled", 2), (byte) -120);
            ij.field_b.field_Jb = qg.a(cr.a("lobby", param3, "mediumbutton", 2), (byte) -102);
            ij.field_b.field_Gb = qg.a(cr.a("lobby", param3, "mediumbutton_mouseover", 2), (byte) -105);
            ij.field_b.field_D = qg.a(cr.a("lobby", param3, "mediumbutton_mouseheld", 2), (byte) -123);
            fm.field_b.field_Jb = qg.a(cr.a("lobby", param3, "bigbutton", 2), (byte) -114);
            fm.field_b.field_Gb = qg.a(cr.a("lobby", param3, "bigbutton_mouseover", 2), (byte) -120);
            fm.field_b.field_D = qg.a(cr.a("lobby", param3, "bigbutton_mouseheld", 2), (byte) -114);
            fm.field_b.field_Ab = qg.a(cr.a("lobby", param3, "bigbutton_disabled", 2), (byte) -106);
            ok.field_d.field_Jb = qg.a(cr.a("lobby", param3, "greenbutton", 2), (byte) -127);
            ok.field_d.field_Gb = qg.a(cr.a("lobby", param3, "greenbutton_mouseover", 2), (byte) -126);
            ok.field_d.field_D = qg.a(cr.a("lobby", param3, "greenbutton_mouseheld", 2), (byte) -119);
            ee.field_s.field_Jb = qg.a(cr.a("lobby", param3, "redbutton", 2), (byte) -105);
            ee.field_s.field_Gb = qg.a(cr.a("lobby", param3, "redbutton_mouseover", 2), (byte) -106);
            ee.field_s.field_D = qg.a(cr.a("lobby", param3, "redbutton_mouseheld", 2), (byte) -121);
            ab.field_x.field_Jb = qg.a(cr.a("lobby", param3, "backbutton", 2), (byte) -127);
            ab.field_x.field_Gb = qg.a(cr.a("lobby", param3, "backbutton_mouseover", 2), (byte) -103);
            ab.field_x.field_D = qg.a(cr.a("lobby", param3, "backbutton_mouseheld", 2), (byte) -122);
            ab.field_x.field_Ab = qg.a(cr.a("lobby", param3, "backbutton_disabled", 2), (byte) -107);
            al.field_n.field_Jb = qg.a(cr.a("lobby", param3, "gameoptionbutton", 2), (byte) -115);
            al.field_n.field_Gb = qg.a(cr.a("lobby", param3, "gameoptionbutton_mouseover", 2), (byte) -114);
            al.field_n.field_pb = qg.a(cr.a("lobby", param3, "gameoptionbutton_active", 2), (byte) -112);
            al.field_n.field_D = qg.a(cr.a("lobby", param3, "gameoptionbutton_active", 2), (byte) -112);
            al.field_n.field_Ab = qg.a(cr.a("lobby", param3, "gameoptionbutton_disabled", 2), (byte) -116);
            im.field_d.field_Jb = qg.a(cr.a("lobby", param3, "chatbutton", 2), (byte) -103);
            im.field_d.field_Gb = qg.a(cr.a("lobby", param3, "chatbutton_mouseover", 2), (byte) -113);
            im.field_d.field_pb = qg.a(cr.a("lobby", param3, "chatbutton_active", 2), (byte) -125);
            im.field_d.field_D = qg.a(cr.a("lobby", param3, "chatbutton_active", 2), (byte) -125);
            fp.field_u.field_Jb = qg.a(cr.a("lobby", param3, "chatfilterbutton", 2), (byte) -119);
            fp.field_u.field_Gb = qg.a(cr.a("lobby", param3, "chatfilterbutton_mouseover", 2), (byte) -106);
            fp.field_u.field_pb = qg.a(cr.a("lobby", param3, "chatfilterbutton_active", 2), (byte) -105);
            fp.field_u.field_D = qg.a(cr.a("lobby", param3, "chatfilterbutton_active", 2), (byte) -105);
            var17 = cr.a("lobby", param3, "checkbox", 2);
            of.field_k = new ni(0L, var17[1], var17[0], 1, tk.field_t, (String) null);
            kb.field_Vb = new mh(0L, (mh) null);
            kb.field_Vb.field_Jb = jf.a(pl.a("lobby", "slideregion", (byte) -95, param3), -52);
            kb.field_Vb.field_Gb = jf.a(pl.a("lobby", "slideregion_mouseover", (byte) 104, param3), -71);
            kb.field_Vb.field_D = jf.a(pl.a("lobby", "slideregion_mouseheld", (byte) 118, param3), -86);
            kb.field_Vb.field_Ab = jf.a(pl.a("lobby", "slideregion_disabled", (byte) -47, param3), -39);
            lf.field_s = new mh(0L, (mh) null);
            lf.field_s.field_Jb = qg.a(cr.a("lobby", param3, "dragbar", 2), (byte) -102);
            lf.field_s.field_Gb = qg.a(cr.a("lobby", param3, "dragbar_mouseover", 2), (byte) -119);
            lf.field_s.field_D = qg.a(cr.a("lobby", param3, "dragbar_mouseheld", 2), (byte) -120);
            lf.field_s.field_Ab = qg.a(cr.a("lobby", param3, "dragbar_disabled", 2), (byte) -123);
            oo.field_u = new mh(0L, (mh) null);
            oo.field_u.field_wb = pl.a("lobby", "upbutton", (byte) -90, param3);
            oo.field_u.field_T = pl.a("lobby", "upbutton_mouseover", (byte) -125, param3);
            oo.field_u.field_tb = pl.a("lobby", "upbutton_mouseheld", (byte) 125, param3);
            oo.field_u.field_Hb = pl.a("lobby", "upbutton_disabled", (byte) -114, param3);
            uk.field_s = new mh(0L, (mh) null);
            uk.field_s.field_wb = pl.a("lobby", "downbutton", (byte) 99, param3);
            uk.field_s.field_T = pl.a("lobby", "downbutton_mouseover", (byte) -109, param3);
            uk.field_s.field_tb = pl.a("lobby", "downbutton_mouseheld", (byte) 97, param3);
            uk.field_s.field_Hb = pl.a("lobby", "downbutton_disabled", (byte) 104, param3);
            ic.field_c = new fj(0L, oo.field_u, uk.field_s, kb.field_Vb, lf.field_s);
            rq.field_b = new hj(0L, (mh) null, am.field_Qb, ic.field_c, uk.field_r, (String) null, (String) null);
            return;
          } else {
            return;
          }
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        try {
            ng.a((byte) -86, param0);
            ce.a(param0, param3, (byte) 94, param2);
            if (param1 != -7812) {
                hc.b(4);
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "hc.E(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Type your age in years";
        field_b = "Message game";
        field_h = 1;
        field_e = new int[]{0, 27, 1, 5, 32, 4, 3, 22, 19, 42};
    }
}
