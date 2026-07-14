/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vh extends eh {
    static String field_s;
    static int field_t;
    static int field_q;
    private sb field_r;

    final static lb a(ia param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        lb var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        lb stackIn_43_0 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        lb stackOut_42_0 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = StarCannon.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param0.e(8, 8);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var2_int ^ -1) >= -1) {
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
                        throw new IllegalStateException("" + var2_int);
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
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param1 >= 85) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        vh.h((byte) 12);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var3 = od.a(-2, param0) ? 1 : 0;
                        var4 = od.a(-2, param0) ? 1 : 0;
                        var5 = new lb();
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5.field_R = (short)param0.e(8, 16);
                        var5.field_J = fd.a(16, var5.field_J, -39, param0);
                        var5.field_x = fd.a(16, var5.field_x, -118, param0);
                        var5.field_q = fd.a(16, var5.field_q, 110, param0);
                        var5.field_P = (short)param0.e(8, 16);
                        var5.field_z = fd.a(16, var5.field_z, 117, param0);
                        var5.field_c = fd.a(16, var5.field_c, 123, param0);
                        var5.field_y = fd.a(16, var5.field_y, -108, param0);
                        if (var3 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5.field_s = (short)param0.e(8, 16);
                        var5.field_N = fd.a(16, var5.field_N, -56, param0);
                        var5.field_a = fd.a(16, var5.field_a, -97, param0);
                        var5.field_o = fd.a(16, var5.field_o, 89, param0);
                        var5.field_Q = fd.a(16, var5.field_Q, 106, param0);
                        var5.field_e = fd.a(16, var5.field_e, 100, param0);
                        var5.field_m = fd.a(16, var5.field_m, -25, param0);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var4 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        int discarded$1 = param0.e(8, 16);
                        var5.field_A = fd.a(16, var5.field_A, 116, param0);
                        var5.field_b = fd.a(16, var5.field_b, 104, param0);
                        var5.field_D = fd.a(16, var5.field_D, -45, param0);
                        var5.field_G = fd.a(16, var5.field_G, -119, param0);
                        var5.field_I = fd.a(16, var5.field_I, 89, param0);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (od.a(-2, param0)) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var5.field_K = fd.a(16, var5.field_K, -82, param0);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (od.a(-2, param0)) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var5.field_u = fb.a(16, var5.field_u, param0, true);
                        var6 = 0;
                        var7 = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((var5.field_u.length ^ -1) >= (var7 ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = var6;
                        stackOut_27_1 = var5.field_u[var7] & 255;
                        stackIn_35_0 = stackOut_27_0;
                        stackIn_35_1 = stackOut_27_1;
                        stackIn_28_0 = stackOut_27_0;
                        stackIn_28_1 = stackOut_27_1;
                        if (var8 != 0) {
                            statePc = 35;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 < stackIn_28_1) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var6 = var5.field_u[var7] & 255;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var7++;
                        if (var8 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = var6 ^ -1;
                        stackOut_34_1 = -1;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0 == stackIn_35_1) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var5.field_O = (byte)(var6 + 1);
                        if (var8 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var5.field_u = null;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = (lb) var5;
                        stackIn_43_0 = stackOut_42_0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 43: {
                    return stackIn_43_0;
                }
                case 44: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    try {
                        stackOut_45_0 = (RuntimeException) var2;
                        stackOut_45_1 = new StringBuilder().append("vh.R(");
                        stackIn_48_0 = stackOut_45_0;
                        stackIn_48_1 = stackOut_45_1;
                        stackIn_46_0 = stackOut_45_0;
                        stackIn_46_1 = stackOut_45_1;
                        if (param0 == null) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                        stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
                        stackOut_46_2 = "{...}";
                        stackIn_49_0 = stackOut_46_0;
                        stackIn_49_1 = stackOut_46_1;
                        stackIn_49_2 = stackOut_46_2;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 48: {
                    stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                    stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
                    stackOut_48_2 = "null";
                    stackIn_49_0 = stackOut_48_0;
                    stackIn_49_1 = stackOut_48_1;
                    stackIn_49_2 = stackOut_48_2;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    throw sd.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0, boolean param1) {
        try {
            IOException var3 = null;
            RuntimeException var3_ref = null;
            Exception var4 = null;
            rb stackIn_8_0 = null;
            rb stackIn_10_0 = null;
            rb stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            rb stackOut_7_0 = null;
            rb stackOut_8_0 = null;
            int stackOut_8_1 = 0;
            rb stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            if (null == ((vh) this).field_r) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        return;
                    }
                    case 3: {
                        try {
                            if (param0 == -100) {
                                statePc = 7;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof IOException ? 13 : 19);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            vh.a(0, false, (lb) null, -73, 33);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof IOException ? 13 : 19);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 13 : 19);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            ((vh) this).field_g.field_g = 0;
                            stackOut_7_0 = ((vh) this).field_g;
                            stackIn_10_0 = stackOut_7_0;
                            stackIn_8_0 = stackOut_7_0;
                            if (!param1) {
                                statePc = 10;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 13 : 19);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = (rb) (Object) stackIn_8_0;
                            stackOut_8_1 = 2;
                            stackIn_11_0 = stackOut_8_0;
                            stackIn_11_1 = stackOut_8_1;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 13 : 19);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = (rb) (Object) stackIn_10_0;
                            stackOut_10_1 = 3;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 13 : 19);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            ((rb) (Object) stackIn_11_0).a(stackIn_11_1, -125);
                            ((vh) this).field_g.a((byte) -116, 0L);
                            ((vh) this).field_r.a(0, ((vh) this).field_g.field_f, (byte) 87, ((vh) this).field_g.field_f.length);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 13 : 19);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var3 = (IOException) (Object) caughtException;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            ((vh) this).field_r.b((byte) -45);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof Exception ? 16 : 19);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var4 = (Exception) (Object) caughtException;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            ((vh) this).field_p = ((vh) this).field_p + 1;
                            ((vh) this).field_d = -2;
                            ((vh) this).field_r = null;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        var3_ref = (RuntimeException) (Object) caughtException;
                        throw sd.a((Throwable) (Object) var3_ref, "vh.S(" + param0 + 44 + param1 + 41);
                    }
                    case 20: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, re param1, int param2) {
        RuntimeException var3 = null;
        ia var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = StarCannon.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_ref = d.field_b;
                        var3_ref.d((byte) 81, param0);
                        var3_ref.field_g = var3_ref.field_g + 1;
                        var4 = var3_ref.field_g;
                        var3_ref.a(1, -65);
                        var3_ref.c(param1.field_g, -306);
                        var3_ref.c(param1.field_n, -306);
                        var3_ref.c(param1.field_h, -306);
                        var3_ref.c((byte) -70, param1.field_i);
                        var3_ref.c((byte) -119, param1.field_m);
                        var3_ref.c((byte) -116, param1.field_p);
                        var3_ref.c((byte) -97, param1.field_j);
                        var3_ref.a(param1.field_o.length, -91);
                        var5 = param2;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((param1.field_o.length ^ -1) >= (var5 ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3_ref.c((byte) -117, param1.field_o[var5]);
                        var5++;
                        if (var6 != 0) {
                            statePc = 15;
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
                        if (var6 == 0) {
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
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        int discarded$1 = var3_ref.b((byte) -75, var4);
                        var3_ref.b(var3_ref.field_g - var4, 31700);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        stackOut_10_0 = (RuntimeException) var3;
                        stackOut_10_1 = new StringBuilder().append("vh.Q(").append(param0).append(44);
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_13_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if (param1 == null) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                        stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                        stackOut_11_2 = "{...}";
                        stackIn_14_0 = stackOut_11_0;
                        stackIn_14_1 = stackOut_11_1;
                        stackIn_14_2 = stackOut_11_2;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 13: {
                    stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                    stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                    stackOut_13_2 = "null";
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    throw sd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (((vh) this).field_r == null) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((vh) this).field_r.b((byte) -106);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0 == -4628) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((vh) this).field_r = null;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw sd.a((Throwable) (Object) var2, "vh.H(" + param0 + 41);
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(Object param0, int param1, boolean param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            ra var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            int stackIn_10_0 = 0;
            int stackIn_20_0 = 0;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            int stackOut_9_0 = 0;
            int stackOut_19_0 = 0;
            RuntimeException stackOut_44_0 = null;
            StringBuilder stackOut_44_1 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            String stackOut_45_2 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            String stackOut_47_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = StarCannon.field_A;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null == ((vh) this).field_r) {
                                statePc = 6;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 43;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            ((vh) this).field_r.b((byte) -71);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof Exception ? 4 : 43);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 43;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var4 = (Exception) (Object) caughtException;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 43;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((vh) this).field_r = null;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 43;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            ((vh) this).field_r = (sb) param0;
                            this.i((byte) 100);
                            this.a((byte) -100, param2);
                            ((vh) this).field_a = null;
                            ((vh) this).field_f.field_g = 0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 43;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var4_ref3 = (ra) (Object) ((vh) this).field_i.c(8);
                            if (var4_ref3 != null) {
                                statePc = 13;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 43;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (var6 != 0) {
                                statePc = 16;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof Exception ? 12 : 43);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = var6;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof Exception ? 12 : 43);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (stackIn_10_0 == 0) {
                                statePc = 17;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof Exception ? 15 : 43);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof Exception ? 15 : 43);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof Exception ? 15 : 43);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            ((vh) this).field_m.a(22197, (uh) (Object) var4_ref3);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof Exception ? 15 : 43);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 43;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 43;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var6 == 0) {
                                statePc = 7;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 43;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var4_ref3 = (ra) (Object) ((vh) this).field_k.c(8);
                            if (null != var4_ref3) {
                                statePc = 23;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 43;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var6 != 0) {
                                statePc = 26;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof Exception ? 22 : 43);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            stackOut_19_0 = var6;
                            stackIn_20_0 = stackOut_19_0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof Exception ? 22 : 43);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (stackIn_20_0 == 0) {
                                statePc = 27;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof Exception ? 25 : 43);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof Exception ? 25 : 43);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof Exception ? 25 : 43);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((vh) this).field_o.a(22197, (uh) (Object) var4_ref3);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof Exception ? 25 : 43);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 43;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 43;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (var6 == 0) {
                                statePc = 17;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 43;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (param1 > 17) {
                                statePc = 31;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof Exception ? 30 : 43);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            ((vh) this).field_r = null;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof Exception ? 30 : 43);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 43;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 43;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if ((((vh) this).field_b ^ -1) != -1) {
                                statePc = 34;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof Exception ? 33 : 43);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof Exception ? 33 : 43);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 43;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            ((vh) this).field_g.field_g = 0;
                            ((vh) this).field_g.a(4, -125);
                            ((vh) this).field_g.a((int) ((vh) this).field_b, -87);
                            ((vh) this).field_g.c((byte) -85, 0);
                            ((vh) this).field_r.a(0, ((vh) this).field_g.field_f, (byte) 87, ((vh) this).field_g.field_f.length);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 36 : 43);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 43;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var4_ref = (IOException) (Object) caughtException;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 43;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            ((vh) this).field_r.b((byte) -43);
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof Exception ? 39 : 43);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 43;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var5 = (Exception) (Object) caughtException;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 43;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            ((vh) this).field_r = null;
                            ((vh) this).field_d = -2;
                            ((vh) this).field_p = ((vh) this).field_p + 1;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 43;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            ((vh) this).field_l = 0;
                            ((vh) this).field_e = dd.b(121);
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 43;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        var4_ref2 = (RuntimeException) (Object) caughtException;
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 44: {
                        try {
                            stackOut_44_0 = (RuntimeException) var4_ref2;
                            stackOut_44_1 = new StringBuilder().append("vh.C(");
                            stackIn_47_0 = stackOut_44_0;
                            stackIn_47_1 = stackOut_44_1;
                            stackIn_45_0 = stackOut_44_0;
                            stackIn_45_1 = stackOut_44_1;
                            if (param0 == null) {
                                statePc = 47;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 46;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
                            stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
                            stackOut_45_2 = "{...}";
                            stackIn_48_0 = stackOut_45_0;
                            stackIn_48_1 = stackOut_45_1;
                            stackIn_48_2 = stackOut_45_2;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 46;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 47: {
                        stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                        stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
                        stackOut_47_2 = "null";
                        stackIn_48_0 = stackOut_47_0;
                        stackIn_48_1 = stackOut_47_1;
                        stackIn_48_2 = stackOut_47_2;
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        throw sd.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + 44 + param1 + 44 + param2 + 41);
                    }
                    case 49: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void h(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (param0 == -98) {
                break L0;
              } else {
                field_t = -12;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_s = null;
        }
    }

    final static void a(int param0, boolean param1, lb param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        lb stackIn_9_0 = null;
        boolean stackIn_19_0 = false;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        Object stackIn_53_0 = null;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        lb stackOut_8_0 = null;
        boolean stackOut_18_0 = false;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        Object stackOut_52_0 = null;
        int stackOut_61_0 = 0;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = StarCannon.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = td.a(3 * (-param0 + param4), (byte) 41);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param3 == -6787) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        lb discarded$1 = vh.a((ia) null, -87);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var6 = 3 * param0;
                        var7 = var5_int - 10;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ed.d(-121);
                        if (-1 <= (param2.field_O ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (lb) param2;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (stackIn_9_0.field_u != null) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
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
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ae.a(-5607);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        wj.field_e = 0;
                        var8 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var8 >= param2.field_P) {
                            statePc = 61;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9 = param2.field_z[var8];
                        var10 = param2.field_c[var8];
                        var11 = param2.field_y[var8];
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = param1;
                        stackIn_62_0 = stackOut_18_0 ? 1 : 0;
                        stackIn_19_0 = stackOut_18_0;
                        if (var19 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (!stackIn_19_0) {
                            statePc = 23;
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
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var12 = bh.field_c[var9];
                        var13 = ri.field_a[var9];
                        var14 = bh.field_c[var10] - var12;
                        var15 = -var12 + bh.field_c[var11];
                        var16 = ri.field_a[var10] - var13;
                        var17 = -var13 + ri.field_a[var11];
                        if ((-(var16 * var15) + var14 * var17 ^ -1) <= -1) {
                            statePc = 60;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var12 = sc.field_d[var9];
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (-2147483648 != var12) {
                            statePc = 28;
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
                        if (var19 == 0) {
                            statePc = 60;
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
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var13 = sc.field_d[var10];
                        if (-2147483648 == var13) {
                            statePc = 60;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var14 = sc.field_d[var11];
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var14 != -2147483648) {
                            statePc = 34;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var19 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var15 = var14 + (var13 + var12) - var6;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = -1;
                        stackOut_35_1 = jf.field_a.length;
                        stackIn_38_0 = stackOut_35_0;
                        stackIn_38_1 = stackOut_35_1;
                        stackIn_36_0 = stackOut_35_0;
                        stackIn_36_1 = stackOut_35_1;
                        if (-1 < (var7 ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = stackIn_36_0;
                        stackOut_36_1 = stackIn_36_1;
                        stackOut_36_2 = var15 >> var7;
                        stackIn_39_0 = stackOut_36_0;
                        stackIn_39_1 = stackOut_36_1;
                        stackIn_39_2 = stackOut_36_2;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = stackIn_38_0;
                        stackOut_38_1 = stackIn_38_1;
                        stackOut_38_2 = var15 << -var7;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        stackIn_39_2 = stackOut_38_2;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var16 = stackIn_39_0 + (stackIn_39_1 - stackIn_39_2);
                        var17 = jf.field_a[var16];
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (0 == var17 >> 1402338916) {
                            statePc = 49;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var16--;
                        stackOut_41_0 = -1;
                        stackOut_41_1 = var16 ^ -1;
                        stackIn_50_0 = stackOut_41_0;
                        stackIn_50_1 = stackOut_41_1;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        if (var19 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 >= stackIn_42_1) {
                            statePc = 48;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var17 = jf.field_a[var16];
                        if (var19 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = var16 << -821203548;
                        stackOut_49_1 = -var17;
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var18 = stackIn_50_0 - stackIn_50_1;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ih.field_d[var18] = var8;
                        jf.field_a[var16] = 1 + var17;
                        if (0 >= param2.field_O) {
                            statePc = 59;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackOut_52_0 = null;
                        stackIn_53_0 = stackOut_52_0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (stackIn_53_0 == (Object) (Object) param2.field_u) {
                            statePc = 59;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        jb.field_h[param2.field_u[var8]] = jb.field_h[param2.field_u[var8]] + 1;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        wj.field_e = wj.field_e + 1;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackOut_61_0 = -1;
                        stackIn_62_0 = stackOut_61_0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (stackIn_62_0 <= (param2.field_O ^ -1)) {
                            statePc = 80;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (param2.field_u == null) {
                            statePc = 80;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var9 >= jb.field_h.length) {
                            statePc = 80;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var10 = jb.field_h[var9];
                        jb.field_h[var9] = var8;
                        var8 = var8 + var10;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var9++;
                        if (var19 != 0) {
                            statePc = 80;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var19 == 0) {
                            statePc = 67;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 74: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    try {
                        stackOut_75_0 = (RuntimeException) var5;
                        stackOut_75_1 = new StringBuilder().append("vh.O(").append(param0).append(44).append(param1).append(44);
                        stackIn_78_0 = stackOut_75_0;
                        stackIn_78_1 = stackOut_75_1;
                        stackIn_76_0 = stackOut_75_0;
                        stackIn_76_1 = stackOut_75_1;
                        if (param2 == null) {
                            statePc = 78;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
                        stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
                        stackOut_76_2 = "{...}";
                        stackIn_79_0 = stackOut_76_0;
                        stackIn_79_1 = stackOut_76_1;
                        stackIn_79_2 = stackOut_76_2;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 77: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 78: {
                    stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
                    stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
                    stackOut_78_2 = "null";
                    stackIn_79_0 = stackOut_78_0;
                    stackIn_79_1 = stackOut_78_1;
                    stackIn_79_2 = stackOut_78_2;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    throw sd.a((Throwable) (Object) stackIn_79_0, stackIn_79_2 + 44 + param3 + 44 + param4 + 41);
                }
                case 80: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void i(byte param0) {
        try {
            IOException var2 = null;
            RuntimeException var2_ref = null;
            Exception var3 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            if (param0 > 34) {
                                statePc = 4;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = (stateCaught_0 instanceof RuntimeException ? 16 : 3);
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            ((vh) this).field_r = null;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof RuntimeException ? 16 : 3);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (null == ((vh) this).field_r) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof IOException ? 6 : 16);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 6 : 16);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        return;
                    }
                    case 8: {
                        try {
                            ((vh) this).field_g.field_g = 0;
                            ((vh) this).field_g.a(6, -67);
                            ((vh) this).field_g.a(3, (byte) -39);
                            ((vh) this).field_g.c(0, -306);
                            ((vh) this).field_r.a(0, ((vh) this).field_g.field_f, (byte) 87, ((vh) this).field_g.field_f.length);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 10 : 16);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2 = (IOException) (Object) caughtException;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            ((vh) this).field_r.b((byte) -110);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof Exception ? 13 : 16);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var3 = (Exception) (Object) caughtException;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            ((vh) this).field_d = -2;
                            ((vh) this).field_p = ((vh) this).field_p + 1;
                            ((vh) this).field_r = null;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        var2_ref = (RuntimeException) (Object) caughtException;
                        throw sd.a((Throwable) (Object) var2_ref, "vh.P(" + param0 + 41);
                    }
                    case 17: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean d(byte param0) {
        try {
            IOException var2 = null;
            RuntimeException var2_ref = null;
            long var2_long = 0L;
            ra var2_ref2 = null;
            int var2_int = 0;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Exception var5_ref_Exception = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            long var12 = 0L;
            Object var14 = null;
            ra var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_21_0 = 0;
            int stackIn_23_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_46_0 = 0;
            int stackIn_47_0 = 0;
            int stackIn_47_1 = 0;
            int stackIn_87_0 = 0;
            int stackIn_91_0 = 0;
            int stackIn_93_0 = 0;
            int stackIn_103_0 = 0;
            int stackIn_112_0 = 0;
            int stackIn_116_0 = 0;
            int stackIn_160_0 = 0;
            int stackIn_170_0 = 0;
            int stackIn_172_0 = 0;
            int stackOut_20_0 = 0;
            int stackOut_22_0 = 0;
            int stackOut_26_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_46_1 = 0;
            int stackOut_84_0 = 0;
            int stackOut_86_0 = 0;
            int stackOut_90_0 = 0;
            int stackOut_91_0 = 0;
            int stackOut_102_0 = 0;
            int stackOut_111_0 = 0;
            int stackOut_113_0 = 0;
            int stackOut_115_0 = 0;
            int stackOut_159_0 = 0;
            int stackOut_169_0 = 0;
            int stackOut_171_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = StarCannon.field_A;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null != ((vh) this).field_r) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof RuntimeException ? 173 : 3);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof RuntimeException ? 173 : 3);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 173;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var2_long = dd.b(82);
                            var4 = (int)(-((vh) this).field_e + var2_long);
                            if (-201 <= (var4 ^ -1)) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 173;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var4 = 200;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 173;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            ((vh) this).field_e = var2_long;
                            ((vh) this).field_l = ((vh) this).field_l + var4;
                            if (-30001 > (((vh) this).field_l ^ -1)) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof Exception ? 8 : 173);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof Exception ? 8 : 173);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 173;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            ((vh) this).field_r.b((byte) -66);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof Exception ? 11 : 173);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 173;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var5_ref_Exception = (Exception) (Object) caughtException;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 173;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            ((vh) this).field_r = null;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 173;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (((vh) this).field_r != null) {
                                statePc = 24;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof Exception ? 16 : 173);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (0 != ((vh) this).e((byte) -22)) {
                                statePc = 22;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof Exception ? 19 : 173);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof Exception ? 19 : 173);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof Exception ? 19 : 173);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if ((((vh) this).c((byte) -79) ^ -1) != -1) {
                                statePc = 22;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof Exception ? 19 : 173);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 173;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 173;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            stackOut_20_0 = 1;
                            stackIn_21_0 = stackOut_20_0;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 173;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        return stackIn_21_0 != 0;
                    }
                    case 22: {
                        try {
                            stackOut_22_0 = 0;
                            stackIn_23_0 = stackOut_22_0;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 173;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        return stackIn_23_0 != 0;
                    }
                    case 24: {
                        try {
                            ((vh) this).field_r.a((byte) 126);
                            var2_ref2 = (ra) (Object) ((vh) this).field_m.a((byte) 127);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (var2_ref2 == null) {
                                statePc = 31;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            ((vh) this).field_g.field_g = 0;
                            ((vh) this).field_g.a(1, -97);
                            ((vh) this).field_g.a((byte) -50, var2_ref2.field_j);
                            ((vh) this).field_r.a(0, ((vh) this).field_g.field_f, (byte) 87, ((vh) this).field_g.field_f.length);
                            ((vh) this).field_i.a(22197, (uh) (Object) var2_ref2);
                            var2_ref2 = (ra) (Object) ((vh) this).field_m.a(-99);
                            stackOut_26_0 = var16;
                            stackIn_27_0 = stackOut_26_0;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (stackIn_27_0 != 0) {
                                statePc = 32;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 161 : (stateCaught_27 instanceof Exception ? 30 : 173));
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var16 == 0) {
                                statePc = 25;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 161 : (stateCaught_28 instanceof Exception ? 30 : 173));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var2_ref2 = (ra) (Object) ((vh) this).field_o.a((byte) 120);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (null == var2_ref2) {
                                statePc = 38;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            ((vh) this).field_g.field_g = 0;
                            ((vh) this).field_g.a(0, param0 + -55);
                            ((vh) this).field_g.a((byte) -78, var2_ref2.field_j);
                            ((vh) this).field_r.a(0, ((vh) this).field_g.field_f, (byte) 87, ((vh) this).field_g.field_f.length);
                            ((vh) this).field_k.a(22197, (uh) (Object) var2_ref2);
                            var2_ref2 = (ra) (Object) ((vh) this).field_o.a(-88);
                            stackOut_33_0 = var16;
                            stackIn_34_0 = stackOut_33_0;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (stackIn_34_0 != 0) {
                                statePc = 42;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 161 : (stateCaught_34 instanceof Exception ? 37 : 173));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var16 == 0) {
                                statePc = 32;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 161 : (stateCaught_35 instanceof Exception ? 37 : 173));
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (param0 == -62) {
                                statePc = 42;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 161 : (stateCaught_38 instanceof Exception ? 41 : 173));
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            ((vh) this).field_r = null;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 161 : (stateCaught_39 instanceof Exception ? 41 : 173));
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var2_int = 0;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (-101 >= (var2_int ^ -1)) {
                                statePc = 159;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var3_int = ((vh) this).field_r.c(66);
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            stackOut_45_0 = var3_int ^ -1;
                            stackIn_160_0 = stackOut_45_0;
                            stackIn_46_0 = stackOut_45_0;
                            if (var16 != 0) {
                                statePc = 160;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 161 : (stateCaught_45 instanceof Exception ? 49 : 173));
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            stackOut_46_0 = stackIn_46_0;
                            stackOut_46_1 = -1;
                            stackIn_47_0 = stackOut_46_0;
                            stackIn_47_1 = stackOut_46_1;
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 161 : (stateCaught_46 instanceof Exception ? 49 : 173));
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (stackIn_47_0 <= stackIn_47_1) {
                                statePc = 52;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 161 : (stateCaught_47 instanceof Exception ? 51 : 173));
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 161 : (stateCaught_48 instanceof Exception ? 51 : 173));
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 161 : (stateCaught_49 instanceof Exception ? 51 : 173));
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 161 : (stateCaught_50 instanceof Exception ? 51 : 173));
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if ((var3_int ^ -1) == -1) {
                                statePc = 159;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            ((vh) this).field_l = 0;
                            var4 = 0;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (null == ((vh) this).field_a) {
                                statePc = 61;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof IOException ? 161 : (stateCaught_54 instanceof Exception ? 57 : 173));
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (((vh) this).field_a.field_v == 0) {
                                statePc = 60;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 161 : (stateCaught_55 instanceof Exception ? 59 : 173));
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof IOException ? 161 : (stateCaught_56 instanceof Exception ? 59 : 173));
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 161 : (stateCaught_57 instanceof Exception ? 59 : 173));
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof IOException ? 161 : (stateCaught_58 instanceof Exception ? 59 : 173));
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var4 = 1;
                            if (var16 == 0) {
                                statePc = 62;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var4 = 10;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if (var4 <= 0) {
                                statePc = 132;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var5 = -((vh) this).field_f.field_g + var4;
                            if (var5 <= var3_int) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var5 = var3_int;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            ((vh) this).field_r.a(((vh) this).field_f.field_g, 32498, var5, ((vh) this).field_f.field_f);
                            if (0 == ((vh) this).field_b) {
                                statePc = 72;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var6 = 0;
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if ((var6 ^ -1) <= (var5 ^ -1)) {
                                statePc = 72;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            ((vh) this).field_f.field_f[var6 + ((vh) this).field_f.field_g] = (byte)dg.a((int) ((vh) this).field_f.field_f[var6 + ((vh) this).field_f.field_g], (int) ((vh) this).field_b);
                            var6++;
                            if (var16 != 0) {
                                statePc = 73;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof IOException ? 161 : (stateCaught_68 instanceof Exception ? 71 : 173));
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (var16 == 0) {
                                statePc = 67;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof IOException ? 161 : (stateCaught_69 instanceof Exception ? 71 : 173));
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            ((vh) this).field_f.field_g = ((vh) this).field_f.field_g + var5;
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if ((((vh) this).field_f.field_g ^ -1) <= (var4 ^ -1)) {
                                statePc = 77;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof IOException ? 161 : (stateCaught_73 instanceof Exception ? 76 : 173));
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if (var16 == 0) {
                                statePc = 158;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof IOException ? 161 : (stateCaught_74 instanceof Exception ? 79 : 173));
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof IOException ? 161 : (stateCaught_75 instanceof Exception ? 79 : 173));
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof IOException ? 161 : (stateCaught_76 instanceof Exception ? 79 : 173));
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if (((vh) this).field_a == null) {
                                statePc = 82;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof IOException ? 161 : (stateCaught_77 instanceof Exception ? 81 : 173));
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof IOException ? 161 : (stateCaught_78 instanceof Exception ? 81 : 173));
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof IOException ? 161 : (stateCaught_79 instanceof Exception ? 81 : 173));
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            statePc = 118;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof IOException ? 161 : (stateCaught_80 instanceof Exception ? 81 : 173));
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            ((vh) this).field_f.field_g = 0;
                            var6 = ((vh) this).field_f.j(param0 ^ -7897);
                            var7 = ((vh) this).field_f.f((byte) -114);
                            var8 = ((vh) this).field_f.j(7909);
                            var9 = ((vh) this).field_f.f((byte) -114);
                            var10 = 127 & var8;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            if (-1 == (128 & var8 ^ -1)) {
                                statePc = 86;
                            } else {
                                statePc = 84;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof IOException ? 161 : (stateCaught_83 instanceof Exception ? 85 : 173));
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            stackOut_84_0 = 1;
                            stackIn_87_0 = stackOut_84_0;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof IOException ? 161 : (stateCaught_84 instanceof Exception ? 85 : 173));
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            stackOut_86_0 = 0;
                            stackIn_87_0 = stackOut_86_0;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var11 = stackIn_87_0;
                            var12 = (long)var7 + ((long)var6 << 1589887328);
                            var14 = null;
                            if (var11 != 0) {
                                statePc = 100;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var14_ref = (ra) (Object) ((vh) this).field_i.a((byte) 125);
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            if (var14_ref == null) {
                                statePc = 107;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof IOException ? 161 : (stateCaught_89 instanceof Exception ? 92 : 173));
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            stackOut_90_0 = (var14_ref.field_j < var12 ? -1 : (var14_ref.field_j == var12 ? 0 : 1));
                            stackIn_112_0 = stackOut_90_0;
                            stackIn_91_0 = stackOut_90_0;
                            if (var16 != 0) {
                                statePc = 112;
                            } else {
                                statePc = 91;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof IOException ? 161 : (stateCaught_90 instanceof Exception ? 95 : 173));
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            stackOut_91_0 = stackIn_91_0;
                            stackIn_93_0 = stackOut_91_0;
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof IOException ? 161 : (stateCaught_91 instanceof Exception ? 95 : 173));
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof IOException ? 161 : (stateCaught_92 instanceof Exception ? 95 : 173));
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            if (stackIn_93_0 != 0) {
                                statePc = 99;
                            } else {
                                statePc = 94;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof IOException ? 161 : (stateCaught_93 instanceof Exception ? 95 : 173));
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            statePc = 96;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            if (var16 == 0) {
                                statePc = 107;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof IOException ? 161 : (stateCaught_96 instanceof Exception ? 98 : 173));
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            var14_ref = (ra) (Object) ((vh) this).field_i.a(-112);
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            var14_ref = (ra) (Object) ((vh) this).field_k.a((byte) 124);
                            statePc = 101;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            if (var14_ref == null) {
                                statePc = 107;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            stackOut_102_0 = (var12 < var14_ref.field_j ? -1 : (var12 == var14_ref.field_j ? 0 : 1));
                            stackIn_112_0 = stackOut_102_0;
                            stackIn_103_0 = stackOut_102_0;
                            if (var16 != 0) {
                                statePc = 112;
                            } else {
                                statePc = 103;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof IOException ? 161 : (stateCaught_102 instanceof Exception ? 105 : 173));
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            if (stackIn_103_0 == 0) {
                                statePc = 107;
                            } else {
                                statePc = 104;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof IOException ? 161 : (stateCaught_103 instanceof Exception ? 105 : 173));
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            var14_ref = (ra) (Object) ((vh) this).field_k.a(-93);
                            if (var16 == 0) {
                                statePc = 101;
                            } else {
                                statePc = 107;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            if (var14_ref == null) {
                                statePc = 110;
                            } else {
                                statePc = 108;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof IOException ? 161 : (stateCaught_107 instanceof Exception ? 109 : 173));
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof IOException ? 161 : (stateCaught_108 instanceof Exception ? 109 : 173));
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            stackOut_111_0 = var10;
                            stackIn_112_0 = stackOut_111_0;
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = (stateCaught_111 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            if (stackIn_112_0 == 0) {
                                statePc = 115;
                            } else {
                                statePc = 113;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = (stateCaught_112 instanceof IOException ? 161 : (stateCaught_112 instanceof Exception ? 114 : 173));
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            stackOut_113_0 = 9;
                            stackIn_116_0 = stackOut_113_0;
                            statePc = 116;
                            continue stateLoop;
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = (stateCaught_113 instanceof IOException ? 161 : (stateCaught_113 instanceof Exception ? 114 : 173));
                            continue stateLoop;
                        }
                    }
                    case 114: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_114) {
                            caughtException = stateCaught_114;
                            statePc = (stateCaught_114 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 115: {
                        try {
                            stackOut_115_0 = 5;
                            stackIn_116_0 = stackOut_115_0;
                            statePc = 116;
                            continue stateLoop;
                        } catch (Throwable stateCaught_115) {
                            caughtException = stateCaught_115;
                            statePc = (stateCaught_115 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 116: {
                        try {
                            var15 = stackIn_116_0;
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_116) {
                            caughtException = stateCaught_116;
                            statePc = (stateCaught_116 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 117: {
                        try {
                            ((vh) this).field_a = var14_ref;
                            ((vh) this).field_a.field_u = new rb(var9 + var15 + ((vh) this).field_a.field_w);
                            ((vh) this).field_a.field_u.a(var10, -96);
                            ((vh) this).field_a.field_u.c((byte) -105, var9);
                            ((vh) this).field_f.field_g = 0;
                            ((vh) this).field_a.field_v = 10;
                            if (var16 == 0) {
                                statePc = 158;
                            } else {
                                statePc = 118;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_117) {
                            caughtException = stateCaught_117;
                            statePc = (stateCaught_117 instanceof IOException ? 161 : (stateCaught_117 instanceof Exception ? 120 : 173));
                            continue stateLoop;
                        }
                    }
                    case 118: {
                        try {
                            if (0 != ((vh) this).field_a.field_v) {
                                statePc = 130;
                            } else {
                                statePc = 119;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_118) {
                            caughtException = stateCaught_118;
                            statePc = (stateCaught_118 instanceof IOException ? 161 : (stateCaught_118 instanceof Exception ? 123 : 173));
                            continue stateLoop;
                        }
                    }
                    case 119: {
                        try {
                            statePc = 121;
                            continue stateLoop;
                        } catch (Throwable stateCaught_119) {
                            caughtException = stateCaught_119;
                            statePc = (stateCaught_119 instanceof IOException ? 161 : (stateCaught_119 instanceof Exception ? 123 : 173));
                            continue stateLoop;
                        }
                    }
                    case 120: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_120) {
                            caughtException = stateCaught_120;
                            statePc = (stateCaught_120 instanceof IOException ? 161 : (stateCaught_120 instanceof Exception ? 123 : 173));
                            continue stateLoop;
                        }
                    }
                    case 121: {
                        try {
                            if (-1 == ((vh) this).field_f.field_f[0]) {
                                statePc = 127;
                            } else {
                                statePc = 122;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_121) {
                            caughtException = stateCaught_121;
                            statePc = (stateCaught_121 instanceof IOException ? 161 : (stateCaught_121 instanceof Exception ? 126 : 173));
                            continue stateLoop;
                        }
                    }
                    case 122: {
                        try {
                            statePc = 124;
                            continue stateLoop;
                        } catch (Throwable stateCaught_122) {
                            caughtException = stateCaught_122;
                            statePc = (stateCaught_122 instanceof IOException ? 161 : (stateCaught_122 instanceof Exception ? 126 : 173));
                            continue stateLoop;
                        }
                    }
                    case 123: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_123) {
                            caughtException = stateCaught_123;
                            statePc = (stateCaught_123 instanceof IOException ? 161 : (stateCaught_123 instanceof Exception ? 126 : 173));
                            continue stateLoop;
                        }
                    }
                    case 124: {
                        try {
                            ((vh) this).field_a = null;
                            if (var16 == 0) {
                                statePc = 158;
                            } else {
                                statePc = 125;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_124) {
                            caughtException = stateCaught_124;
                            statePc = (stateCaught_124 instanceof IOException ? 161 : (stateCaught_124 instanceof Exception ? 129 : 173));
                            continue stateLoop;
                        }
                    }
                    case 125: {
                        try {
                            statePc = 127;
                            continue stateLoop;
                        } catch (Throwable stateCaught_125) {
                            caughtException = stateCaught_125;
                            statePc = (stateCaught_125 instanceof IOException ? 161 : (stateCaught_125 instanceof Exception ? 129 : 173));
                            continue stateLoop;
                        }
                    }
                    case 126: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_126) {
                            caughtException = stateCaught_126;
                            statePc = (stateCaught_126 instanceof IOException ? 161 : (stateCaught_126 instanceof Exception ? 129 : 173));
                            continue stateLoop;
                        }
                    }
                    case 127: {
                        try {
                            ((vh) this).field_a.field_v = 1;
                            ((vh) this).field_f.field_g = 0;
                            if (var16 == 0) {
                                statePc = 158;
                            } else {
                                statePc = 128;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_127) {
                            caughtException = stateCaught_127;
                            statePc = (stateCaught_127 instanceof IOException ? 161 : (stateCaught_127 instanceof Exception ? 131 : 173));
                            continue stateLoop;
                        }
                    }
                    case 128: {
                        try {
                            statePc = 130;
                            continue stateLoop;
                        } catch (Throwable stateCaught_128) {
                            caughtException = stateCaught_128;
                            statePc = (stateCaught_128 instanceof IOException ? 161 : (stateCaught_128 instanceof Exception ? 131 : 173));
                            continue stateLoop;
                        }
                    }
                    case 129: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_129) {
                            caughtException = stateCaught_129;
                            statePc = (stateCaught_129 instanceof IOException ? 161 : (stateCaught_129 instanceof Exception ? 131 : 173));
                            continue stateLoop;
                        }
                    }
                    case 130: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_130) {
                            caughtException = stateCaught_130;
                            statePc = (stateCaught_130 instanceof IOException ? 161 : (stateCaught_130 instanceof Exception ? 131 : 173));
                            continue stateLoop;
                        }
                    }
                    case 131: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_131) {
                            caughtException = stateCaught_131;
                            statePc = (stateCaught_131 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 132: {
                        try {
                            var5 = ((vh) this).field_a.field_u.field_f.length - ((vh) this).field_a.field_w;
                            var6 = -((vh) this).field_a.field_v + 512;
                            statePc = 133;
                            continue stateLoop;
                        } catch (Throwable stateCaught_132) {
                            caughtException = stateCaught_132;
                            statePc = (stateCaught_132 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 133: {
                        try {
                            if (var6 > -((vh) this).field_a.field_u.field_g + var5) {
                                statePc = 136;
                            } else {
                                statePc = 134;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_133) {
                            caughtException = stateCaught_133;
                            statePc = (stateCaught_133 instanceof IOException ? 161 : (stateCaught_133 instanceof Exception ? 135 : 173));
                            continue stateLoop;
                        }
                    }
                    case 134: {
                        try {
                            statePc = 137;
                            continue stateLoop;
                        } catch (Throwable stateCaught_134) {
                            caughtException = stateCaught_134;
                            statePc = (stateCaught_134 instanceof IOException ? 161 : (stateCaught_134 instanceof Exception ? 135 : 173));
                            continue stateLoop;
                        }
                    }
                    case 135: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_135) {
                            caughtException = stateCaught_135;
                            statePc = (stateCaught_135 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 136: {
                        try {
                            var6 = var5 + -((vh) this).field_a.field_u.field_g;
                            statePc = 137;
                            continue stateLoop;
                        } catch (Throwable stateCaught_136) {
                            caughtException = stateCaught_136;
                            statePc = (stateCaught_136 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 137: {
                        try {
                            if (var3_int >= var6) {
                                statePc = 139;
                            } else {
                                statePc = 138;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_137) {
                            caughtException = stateCaught_137;
                            statePc = (stateCaught_137 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 138: {
                        try {
                            var6 = var3_int;
                            statePc = 139;
                            continue stateLoop;
                        } catch (Throwable stateCaught_138) {
                            caughtException = stateCaught_138;
                            statePc = (stateCaught_138 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 139: {
                        try {
                            ((vh) this).field_r.a(((vh) this).field_a.field_u.field_g, 32498, var6, ((vh) this).field_a.field_u.field_f);
                            if (0 != ((vh) this).field_b) {
                                statePc = 142;
                            } else {
                                statePc = 140;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_139) {
                            caughtException = stateCaught_139;
                            statePc = (stateCaught_139 instanceof IOException ? 161 : (stateCaught_139 instanceof Exception ? 141 : 173));
                            continue stateLoop;
                        }
                    }
                    case 140: {
                        try {
                            statePc = 148;
                            continue stateLoop;
                        } catch (Throwable stateCaught_140) {
                            caughtException = stateCaught_140;
                            statePc = (stateCaught_140 instanceof IOException ? 161 : (stateCaught_140 instanceof Exception ? 141 : 173));
                            continue stateLoop;
                        }
                    }
                    case 141: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_141) {
                            caughtException = stateCaught_141;
                            statePc = (stateCaught_141 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 142: {
                        try {
                            var7 = 0;
                            statePc = 143;
                            continue stateLoop;
                        } catch (Throwable stateCaught_142) {
                            caughtException = stateCaught_142;
                            statePc = (stateCaught_142 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 143: {
                        try {
                            if ((var6 ^ -1) >= (var7 ^ -1)) {
                                statePc = 148;
                            } else {
                                statePc = 144;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_143) {
                            caughtException = stateCaught_143;
                            statePc = (stateCaught_143 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 144: {
                        try {
                            ((vh) this).field_a.field_u.field_f[var7 + ((vh) this).field_a.field_u.field_g] = (byte)dg.a((int) ((vh) this).field_a.field_u.field_f[var7 + ((vh) this).field_a.field_u.field_g], (int) ((vh) this).field_b);
                            var7++;
                            if (var16 != 0) {
                                statePc = 149;
                            } else {
                                statePc = 145;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_144) {
                            caughtException = stateCaught_144;
                            statePc = (stateCaught_144 instanceof IOException ? 161 : (stateCaught_144 instanceof Exception ? 147 : 173));
                            continue stateLoop;
                        }
                    }
                    case 145: {
                        try {
                            if (var16 == 0) {
                                statePc = 143;
                            } else {
                                statePc = 146;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_145) {
                            caughtException = stateCaught_145;
                            statePc = (stateCaught_145 instanceof IOException ? 161 : (stateCaught_145 instanceof Exception ? 147 : 173));
                            continue stateLoop;
                        }
                    }
                    case 146: {
                        try {
                            statePc = 148;
                            continue stateLoop;
                        } catch (Throwable stateCaught_146) {
                            caughtException = stateCaught_146;
                            statePc = (stateCaught_146 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 147: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_147) {
                            caughtException = stateCaught_147;
                            statePc = (stateCaught_147 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 148: {
                        try {
                            ((vh) this).field_a.field_u.field_g = ((vh) this).field_a.field_u.field_g + var6;
                            ((vh) this).field_a.field_v = ((vh) this).field_a.field_v + var6;
                            statePc = 149;
                            continue stateLoop;
                        } catch (Throwable stateCaught_148) {
                            caughtException = stateCaught_148;
                            statePc = (stateCaught_148 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 149: {
                        try {
                            if (var5 == ((vh) this).field_a.field_u.field_g) {
                                statePc = 156;
                            } else {
                                statePc = 150;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_149) {
                            caughtException = stateCaught_149;
                            statePc = (stateCaught_149 instanceof IOException ? 161 : (stateCaught_149 instanceof Exception ? 152 : 173));
                            continue stateLoop;
                        }
                    }
                    case 150: {
                        try {
                            if (512 != ((vh) this).field_a.field_v) {
                                statePc = 158;
                            } else {
                                statePc = 151;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_150) {
                            caughtException = stateCaught_150;
                            statePc = (stateCaught_150 instanceof IOException ? 161 : (stateCaught_150 instanceof Exception ? 155 : 173));
                            continue stateLoop;
                        }
                    }
                    case 151: {
                        try {
                            statePc = 153;
                            continue stateLoop;
                        } catch (Throwable stateCaught_151) {
                            caughtException = stateCaught_151;
                            statePc = (stateCaught_151 instanceof IOException ? 161 : (stateCaught_151 instanceof Exception ? 155 : 173));
                            continue stateLoop;
                        }
                    }
                    case 152: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_152) {
                            caughtException = stateCaught_152;
                            statePc = (stateCaught_152 instanceof IOException ? 161 : (stateCaught_152 instanceof Exception ? 155 : 173));
                            continue stateLoop;
                        }
                    }
                    case 153: {
                        try {
                            ((vh) this).field_a.field_v = 0;
                            if (var16 == 0) {
                                statePc = 158;
                            } else {
                                statePc = 154;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_153) {
                            caughtException = stateCaught_153;
                            statePc = (stateCaught_153 instanceof IOException ? 161 : (stateCaught_153 instanceof Exception ? 157 : 173));
                            continue stateLoop;
                        }
                    }
                    case 154: {
                        try {
                            statePc = 156;
                            continue stateLoop;
                        } catch (Throwable stateCaught_154) {
                            caughtException = stateCaught_154;
                            statePc = (stateCaught_154 instanceof IOException ? 161 : (stateCaught_154 instanceof Exception ? 157 : 173));
                            continue stateLoop;
                        }
                    }
                    case 155: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_155) {
                            caughtException = stateCaught_155;
                            statePc = (stateCaught_155 instanceof IOException ? 161 : (stateCaught_155 instanceof Exception ? 157 : 173));
                            continue stateLoop;
                        }
                    }
                    case 156: {
                        try {
                            ((vh) this).field_a.a(param0 + -6180);
                            ((vh) this).field_a.field_r = false;
                            ((vh) this).field_a = null;
                            statePc = 158;
                            continue stateLoop;
                        } catch (Throwable stateCaught_156) {
                            caughtException = stateCaught_156;
                            statePc = (stateCaught_156 instanceof IOException ? 161 : (stateCaught_156 instanceof Exception ? 157 : 173));
                            continue stateLoop;
                        }
                    }
                    case 157: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_157) {
                            caughtException = stateCaught_157;
                            statePc = (stateCaught_157 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 158: {
                        try {
                            var2_int++;
                            if (var16 == 0) {
                                statePc = 43;
                            } else {
                                statePc = 159;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_158) {
                            caughtException = stateCaught_158;
                            statePc = (stateCaught_158 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 159: {
                        try {
                            stackOut_159_0 = 1;
                            stackIn_160_0 = stackOut_159_0;
                            statePc = 160;
                            continue stateLoop;
                        } catch (Throwable stateCaught_159) {
                            caughtException = stateCaught_159;
                            statePc = (stateCaught_159 instanceof IOException ? 161 : 173);
                            continue stateLoop;
                        }
                    }
                    case 160: {
                        return stackIn_160_0 != 0;
                    }
                    case 161: {
                        try {
                            var2 = (IOException) (Object) caughtException;
                            statePc = 162;
                            continue stateLoop;
                        } catch (Throwable stateCaught_161) {
                            caughtException = stateCaught_161;
                            statePc = 173;
                            continue stateLoop;
                        }
                    }
                    case 162: {
                        try {
                            ((vh) this).field_r.b((byte) -41);
                            statePc = 163;
                            continue stateLoop;
                        } catch (Throwable stateCaught_162) {
                            caughtException = stateCaught_162;
                            statePc = (stateCaught_162 instanceof Exception ? 164 : 173);
                            continue stateLoop;
                        }
                    }
                    case 163: {
                        try {
                            statePc = 165;
                            continue stateLoop;
                        } catch (Throwable stateCaught_163) {
                            caughtException = stateCaught_163;
                            statePc = 173;
                            continue stateLoop;
                        }
                    }
                    case 164: {
                        try {
                            var3 = (Exception) (Object) caughtException;
                            statePc = 165;
                            continue stateLoop;
                        } catch (Throwable stateCaught_164) {
                            caughtException = stateCaught_164;
                            statePc = 173;
                            continue stateLoop;
                        }
                    }
                    case 165: {
                        try {
                            ((vh) this).field_d = -2;
                            ((vh) this).field_r = null;
                            ((vh) this).field_p = ((vh) this).field_p + 1;
                            if (((vh) this).e((byte) -61) != 0) {
                                statePc = 171;
                            } else {
                                statePc = 166;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_165) {
                            caughtException = stateCaught_165;
                            statePc = (stateCaught_165 instanceof Exception ? 168 : 173);
                            continue stateLoop;
                        }
                    }
                    case 166: {
                        try {
                            if (((vh) this).c((byte) -79) != 0) {
                                statePc = 171;
                            } else {
                                statePc = 167;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_166) {
                            caughtException = stateCaught_166;
                            statePc = (stateCaught_166 instanceof Exception ? 168 : 173);
                            continue stateLoop;
                        }
                    }
                    case 167: {
                        try {
                            statePc = 169;
                            continue stateLoop;
                        } catch (Throwable stateCaught_167) {
                            caughtException = stateCaught_167;
                            statePc = 173;
                            continue stateLoop;
                        }
                    }
                    case 168: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_168) {
                            caughtException = stateCaught_168;
                            statePc = 173;
                            continue stateLoop;
                        }
                    }
                    case 169: {
                        try {
                            stackOut_169_0 = 1;
                            stackIn_170_0 = stackOut_169_0;
                            statePc = 170;
                            continue stateLoop;
                        } catch (Throwable stateCaught_169) {
                            caughtException = stateCaught_169;
                            statePc = 173;
                            continue stateLoop;
                        }
                    }
                    case 170: {
                        return stackIn_170_0 != 0;
                    }
                    case 171: {
                        try {
                            stackOut_171_0 = 0;
                            stackIn_172_0 = stackOut_171_0;
                            statePc = 172;
                            continue stateLoop;
                        } catch (Throwable stateCaught_171) {
                            caughtException = stateCaught_171;
                            statePc = 173;
                            continue stateLoop;
                        }
                    }
                    case 172: {
                        return stackIn_172_0 != 0;
                    }
                    case 173: {
                        var2_ref = (RuntimeException) (Object) caughtException;
                        throw sd.a((Throwable) (Object) var2_ref, "vh.F(" + param0 + 41);
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public vh() {
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = StarCannon.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param0.length();
                        var3 = new char[var2_int];
                        var4 = param1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var2_int ^ -1) >= (var4 ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3[var2_int + (-1 + -var4)] = param0.charAt(var4);
                        var4++;
                        if (var5 == 0) {
                            statePc = 2;
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
                        stackOut_4_0 = new String(var3);
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0;
                }
                case 6: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) var2;
                        stackOut_7_1 = new StringBuilder().append("vh.N(");
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (param0 == null) {
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
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                        stackOut_8_2 = "{...}";
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_11_2 = stackOut_8_2;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 10: {
                    stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                    stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                    stackOut_10_2 = "null";
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0) {
        if (param0 <= 118) {
            field_s = null;
        }
        try {
            ((vh) this).field_r.b((byte) -105);
        } catch (Exception exception) {
        }
        ((vh) this).field_p = ((vh) this).field_p + 1;
        ((vh) this).field_r = null;
        ((vh) this).field_d = -1;
        ((vh) this).field_b = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "This password contains your email address, and would be easy to guess";
        field_t = -1;
    }
}
