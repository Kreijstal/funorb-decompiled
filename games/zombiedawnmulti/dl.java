/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class dl {
    int field_f;
    static ja field_c;
    String field_b;
    static l field_h;
    static cj field_a;
    static long field_e;
    static String field_g;
    static String field_d;

    abstract java.net.Socket b(int param0) throws IOException;

    public static void a(byte param0) {
        field_c = null;
        if (param0 >= -61) {
          field_d = (String) null;
          field_g = null;
          field_d = null;
          field_h = null;
          field_a = null;
          return;
        } else {
          field_g = null;
          field_d = null;
          field_h = null;
          field_a = null;
          return;
        }
    }

    final static void a(jh param0, boolean param1, k param2, boolean param3) {
        jh stackIn_5_0 = null;
        jh stackIn_6_0 = null;
        jh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        jh stackIn_8_0 = null;
        jh stackIn_9_0 = null;
        jh stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        jh stackIn_11_0 = null;
        jh stackIn_12_0 = null;
        jh stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        jh stackIn_14_0 = null;
        jh stackIn_15_0 = null;
        jh stackIn_16_0 = null;
        jh stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        jh stackIn_18_0 = null;
        jh stackIn_19_0 = null;
        jh stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        jh stackIn_21_0 = null;
        jh stackIn_22_0 = null;
        jh stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param0.field_cc = param2.g(31365);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        param0.field_mc = param2.g(31365);
                        param0.field_Pb = param2.g(31365);
                        var4_int = param2.g(31365);
                        stackIn_6_0 = (jh) (param0);
                        stackIn_5_0 = stackIn_6_0;
                        if (0 == (var4_int & 128)) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_7_0 = (jh) ((Object) stackIn_5_0);
                        stackIn_7_1 = 1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = (jh) ((Object) stackIn_6_0);
                        stackIn_7_1 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_7_0.field_Mb = stackIn_7_1 != 0;
                        stackIn_9_0 = (jh) (param0);
                        stackIn_8_0 = stackIn_9_0;
                        if ((var4_int & 64) == 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_10_0 = (jh) ((Object) stackIn_8_0);
                        stackIn_10_1 = 1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_10_0 = (jh) ((Object) stackIn_9_0);
                        stackIn_10_1 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_10_0.field_Fb = stackIn_10_1 != 0;
                        stackIn_12_0 = (jh) (param0);
                        stackIn_11_0 = stackIn_12_0;
                        if (-1 == (32 & var4_int ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_13_0 = (jh) ((Object) stackIn_11_0);
                        stackIn_13_1 = 1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = (jh) ((Object) stackIn_12_0);
                        stackIn_13_1 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_13_0.field_dc = stackIn_13_1 != 0;
                        stackIn_16_0 = (jh) (param0);
                        stackIn_14_0 = stackIn_16_0;
                        if (!param0.field_Mb) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_16_0 = (jh) ((Object) stackIn_14_0);
                        stackIn_15_0 = stackIn_16_0;
                        if (param0.field_cc >= param0.field_mc) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_17_0 = (jh) ((Object) stackIn_15_0);
                        stackIn_17_1 = 1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = (jh) ((Object) stackIn_16_0);
                        stackIn_17_1 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_17_0.field_Ob = stackIn_17_1 != 0;
                        stackIn_19_0 = (jh) (param0);
                        stackIn_18_0 = stackIn_19_0;
                        if ((var4_int & 8) == 0) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_20_0 = (jh) ((Object) stackIn_18_0);
                        stackIn_20_1 = 1;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = (jh) ((Object) stackIn_19_0);
                        stackIn_20_1 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_20_0.field_Wb = stackIn_20_1 != 0;
                        stackIn_22_0 = (jh) (param0);
                        stackIn_21_0 = stackIn_22_0;
                        if ((16 & var4_int) == 0) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_23_0 = (jh) ((Object) stackIn_21_0);
                        stackIn_23_1 = 2;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = (jh) ((Object) stackIn_22_0);
                        stackIn_23_1 = 1;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_23_0.field_fc = stackIn_23_1;
                        if (-1 == (4 & var4_int ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_26_0 = 1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var5 = stackIn_26_0;
                        if (!param3) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        field_d = (String) null;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        param2.a(0, -6351, param0.field_Zb.length, param0.field_Zb);
                        if ((var4_int & 2) == 0) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_31_0 = 1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = 0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var6 = stackIn_31_0;
                        param0.field_Ub = param2.d((byte) 69);
                        param0.field_qc = bl.a((byte) 108) - (long)param2.i(-1478490344);
                        if (var5 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        param0.field_Sb = param2.i(-1478490344);
                        if (var9 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        param0.field_Sb = -1;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        param0.field_Sb = -1;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        param0.field_nc = param2.a((byte) -30);
                        var7 = param2.field_j;
                        param0.field_Nb = param2.f((byte) -74);
                        if (var6 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        param0.field_bc = new String[param0.field_cc];
                        param2.field_j = var7;
                        var8 = 0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var8 >= param0.field_cc) {
                            statePc = 42;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        param0.field_bc[var8] = param2.f((byte) -91);
                        var8++;
                        if (var9 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var9 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var9 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        param0.field_bc = null;
                        return;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 45: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_47_0 = (RuntimeException) (var4);
                    stackIn_46_0 = stackIn_47_0;
                    stackIn_47_1 = new StringBuilder().append("dl.H(");
                    stackIn_46_1 = stackIn_47_1;
                    if (param0 == null) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    stackIn_48_0 = (RuntimeException) ((Object) stackIn_46_0);
                    stackIn_48_1 = (StringBuilder) ((Object) stackIn_46_1);
                    stackIn_48_2 = "{...}";
                    statePc = 48;
                    continue stateLoop;
                }
                case 47: {
                    stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
                    stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                    stackIn_48_2 = "null";
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    stackIn_50_0 = (RuntimeException) ((Object) stackIn_48_0);
                    stackIn_49_0 = stackIn_50_0;
                    stackIn_50_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',').append(param1).append(',');
                    stackIn_49_1 = stackIn_50_1;
                    if (param2 == null) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    stackIn_51_0 = (RuntimeException) ((Object) stackIn_49_0);
                    stackIn_51_1 = (StringBuilder) ((Object) stackIn_49_1);
                    stackIn_51_2 = "{...}";
                    statePc = 51;
                    continue stateLoop;
                }
                case 50: {
                    stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
                    stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                    stackIn_51_2 = "null";
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    throw fa.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param3 + ')');
                }
                case 52: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null != field_h) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        g.c();
                        if (param0 < -18) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        field_d = (String) null;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        pk.field_c = new ja(60, 60);
                        pk.field_c.a();
                        oo.d(30, 30, 28, 4521728);
                        wi.field_g = new ja[8];
                        var1_int = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var1_int >= 8) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        wi.field_g[var1_int] = new ja(22, 22);
                        wi.field_g[var1_int].a();
                        oo.d(11, 11, var1_int - -2, 5622784);
                        oo.d(11, 11, var1_int, 65793);
                        var1_int++;
                        if (var2 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var2 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        g.b();
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) runtimeException), "dl.J(" + param0 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static Boolean c(byte param0) {
        Boolean var1 = dd.field_d;
        dd.field_d = null;
        int var2 = -94 % ((-29 - param0) / 60);
        return var1;
    }

    final java.net.Socket b(byte param0) throws IOException {
        if (param0 < 77) {
            return (java.net.Socket) null;
        }
        return new java.net.Socket(this.field_b, this.field_f);
    }

    static {
        field_d = "Two zombies lurch better than one.";
        field_g = "Type your age in years";
    }
}
