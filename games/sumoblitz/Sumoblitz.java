/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class Sumoblitz extends fn {
    static int[] field_G;
    static hr[] field_J;
    private boolean field_F;
    static int field_H;
    static int field_I;
    private wb field_K;
    public static boolean field_L;

    final static void a(String[] args, int param1, int param2, String param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int stackOut_5_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        nw.field_e = st.field_z;
                        if (255 == param2) {
                            statePc = 15;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param2 < 100) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = param2;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 > 105) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        eg.field_l = qr.a(args, 8192);
                        if (var5 == 0) {
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
                        eg.field_l = au.a(40, param3, param2);
                        if (var5 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (13 <= lq.field_d) {
                            statePc = 20;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = 1;
                        stackIn_21_0 = stackOut_18_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        eg.field_l = bq.a(stackIn_21_0 != 0, 8192);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (param1 == 13) {
                            statePc = 37;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        field_H = -63;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    var4 = (RuntimeException) (Object) caughtException;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    try {
                        stackOut_28_0 = (RuntimeException) var4;
                        stackOut_28_1 = new StringBuilder().append("Sumoblitz.SA(");
                        stackIn_31_0 = stackOut_28_0;
                        stackIn_31_1 = stackOut_28_1;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        if (args == null) {
                            statePc = 31;
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
                        stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
                        stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
                        stackOut_29_2 = "{...}";
                        stackIn_32_0 = stackOut_29_0;
                        stackIn_32_1 = stackOut_29_1;
                        stackIn_32_2 = stackOut_29_2;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 30: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 31: {
                    stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
                    stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
                    stackOut_31_2 = "null";
                    stackIn_32_0 = stackOut_31_0;
                    stackIn_32_1 = stackOut_31_1;
                    stackIn_32_2 = stackOut_31_2;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    try {
                        stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
                        stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(44).append(param1).append(44).append(param2).append(44);
                        stackIn_35_0 = stackOut_32_0;
                        stackIn_35_1 = stackOut_32_1;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        if (param3 == null) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
                        stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
                        stackOut_33_2 = "{...}";
                        stackIn_36_0 = stackOut_33_0;
                        stackIn_36_1 = stackOut_33_1;
                        stackIn_36_2 = stackOut_33_2;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 35: {
                    stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                    stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                    stackOut_35_2 = "null";
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    stackIn_36_2 = stackOut_35_2;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    throw qo.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 41);
                }
                case 37: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void g(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == -15254) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        this.r(36);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        oi.a(-27864);
                        if (gk.field_o == null) {
                            statePc = 8;
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
                        b.c((byte) 81);
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        gt.m(0);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw qo.a((Throwable) (Object) var2, "Sumoblitz.L(" + param0 + 41);
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void g(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        boolean[] stackIn_3_0 = null;
        int stackIn_12_0 = 0;
        qu stackIn_62_0 = null;
        qu stackIn_64_0 = null;
        qu stackIn_66_0 = null;
        qu stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        boolean[] stackOut_2_0 = null;
        int stackOut_11_0 = 0;
        qu stackOut_61_0 = null;
        qu stackOut_62_0 = null;
        qu stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        qu stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (2 > ku.field_j) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = hw.field_b;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (!stackIn_3_0[41]) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        f.field_w = true;
                        kh.field_e = 16777215;
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
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var2_int = -73 / ((8 - param0) / 40);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (null == pl.field_v.b(-98)) {
                            statePc = 18;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = qn.field_g;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        qn.field_g = stackIn_12_0 + 1;
                        if ((stackIn_12_0 + 1 ^ -1) != -257) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        qn.field_g = 0;
                        ms discarded$1 = pl.field_v.c(9);
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
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (0 == ra.field_e) {
                            statePc = 61;
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
                        if (ra.field_e != 1) {
                            statePc = 35;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        eh.field_a = eh.field_a + 1;
                        if (-31 == (eh.field_a ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (so.a((byte) -58)) {
                            statePc = 31;
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
                        bf.a(0);
                        if (var3 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        wn.a(true);
                        statePc = 32;
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
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ra.field_e = 2;
                        if (var3 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (2 != ra.field_e) {
                            statePc = 55;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 40;
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
                        if (!vs.b((byte) 9)) {
                            statePc = 44;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        nj.field_b = qw.field_b;
                        if (var3 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        nq.field_g = ew.a((byte) 113, 4);
                        if (ph.field_b == null) {
                            statePc = 50;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        ph.field_b.e(-119);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        nj.field_b = ro.field_d;
                        if (-2 != nj.field_b) {
                            statePc = 54;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        nj.field_b = 0;
                        vb.a((byte) 122, false);
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        ra.field_e = 3;
                        rc.field_k = nj.field_b;
                        eh.field_a = 29;
                        if (var3 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        eh.field_a = eh.field_a - 1;
                        if (eh.field_a != 0) {
                            statePc = 86;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        ra.field_e = 0;
                        if (var3 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackOut_61_0 = ph.field_b;
                        stackIn_66_0 = stackOut_61_0;
                        stackIn_62_0 = stackOut_61_0;
                        if (-1 != nj.field_b) {
                            statePc = 66;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackOut_62_0 = (qu) (Object) stackIn_62_0;
                        stackIn_64_0 = stackOut_62_0;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackOut_64_0 = (qu) (Object) stackIn_64_0;
                        stackOut_64_1 = 1;
                        stackIn_67_0 = stackOut_64_0;
                        stackIn_67_1 = stackOut_64_1;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackOut_66_0 = (qu) (Object) stackIn_66_0;
                        stackOut_66_1 = 0;
                        stackIn_67_0 = stackOut_66_0;
                        stackIn_67_1 = stackOut_66_1;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        ((qu) (Object) stackIn_67_0).a(stackIn_67_1 != 0, (byte) -88);
                        if ((rc.field_k ^ -1) == (nj.field_b ^ -1)) {
                            statePc = 78;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        eh.field_a = eh.field_a + 1;
                        if (-31 == (eh.field_a ^ -1)) {
                            statePc = 73;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (-3 == (nj.field_b ^ -1)) {
                            statePc = 76;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        mr.field_f = null;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        eh.field_a = 0;
                        nj.field_b = rc.field_k;
                        if (var3 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (nj.field_b != -1) {
                            statePc = 83;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        iv.field_g[nj.field_b].b(-18556);
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 85: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw qo.a((Throwable) (Object) var2, "Sumoblitz.TA(" + param0 + 41);
                }
                case 86: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void f(int param0) {
        bs var2 = null;
        RuntimeException var2_ref = null;
        ud var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (param0 == 28196) {
                break L0;
              } else {
                Sumoblitz.a(59, -122, (byte) 42);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          ((Sumoblitz) this).a(100, 3, 1, 10, 2, 0, true);
          var2 = new bs();
          var2.a(177, 128, 9);
          var3 = new ud(var2, new bs());
          aa.a(lt.field_m, true, var3, (byte) -125, 48000, (java.awt.Component) (Object) qn.field_f);
          dt.field_f = false;
          qc.field_e = var2;
          ((Sumoblitz) this).a(true, true, (byte) 60, true, false);
        }
    }

    final void d(int param0) {
        try {
            RuntimeException var2 = null;
            java.awt.Canvas var2_ref = null;
            ha var3 = null;
            int var4_int = 0;
            ge var4 = null;
            Exception var5 = null;
            int var5_int = 0;
            int var6 = 0;
            int var7 = 0;
            String var8_ref_String = null;
            String var8_ref = null;
            int var8 = 0;
            pm var9 = null;
            int var10 = 0;
            int stackIn_49_0 = 0;
            int stackIn_58_0 = 0;
            boolean stackIn_61_0 = false;
            Object stackIn_109_0 = null;
            int stackOut_48_0 = 0;
            boolean stackOut_55_0 = false;
            int stackOut_57_0 = 0;
            boolean stackOut_60_0 = false;
            Object stackOut_108_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var10 = field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var2_ref = hk.b(-97);
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            lk.b();
                            if (in.g(param0 ^ -99)) {
                                statePc = 5;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof Exception ? 4 : 120);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof Exception ? 4 : 120);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ad.a((byte) 122, var2_ref, np.a(param0 ^ 7));
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return;
                    }
                    case 7: {
                        try {
                            if (sa.field_j) {
                                statePc = 10;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            od.a(-62, var2_ref);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return;
                    }
                    case 10: {
                        try {
                            if (su.a(param0 ^ 0)) {
                                statePc = 13;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            pe.a(param0 ^ 20, 100.0f, fl.field_s);
                            od.a(-88, var2_ref);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return;
                    }
                    case 13: {
                        try {
                            if (!nq.field_h.a(false)) {
                                statePc = 20;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof RuntimeException ? 120 : 16);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (!this.h((byte) -124)) {
                                statePc = 19;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof Exception ? 18 : 120);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof Exception ? 18 : 120);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof Exception ? 18 : 120);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof Exception ? 18 : 120);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        return;
                    }
                    case 20: {
                        try {
                            var3 = nq.field_h.a(-115);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var3.GA(0);
                            ph.field_b.a(param0 ^ 120, var3, false);
                            if (rc.field_k != nj.field_b) {
                                statePc = 28;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof Exception ? 24 : 120);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (-1 == nj.field_b) {
                                statePc = 37;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof Exception ? 27 : 120);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof Exception ? 27 : 120);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof Exception ? 27 : 120);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            iv.field_g[nj.field_b].a(255, var3, -2355);
                            if (var10 == 0) {
                                statePc = 37;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof Exception ? 27 : 120);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var4_int = 255 * eh.field_a / 30;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (-1 == nj.field_b) {
                                statePc = 33;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof Exception ? 32 : 120);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            iv.field_g[nj.field_b].a(-var4_int + 255, var3, -2355);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof Exception ? 32 : 120);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (-1 != rc.field_k) {
                                statePc = 36;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof Exception ? 35 : 120);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof Exception ? 35 : 120);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            iv.field_g[rc.field_k].a(var4_int, var3, -2355);
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (!so.a((byte) 103)) {
                                statePc = 41;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof Exception ? 40 : 120);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            lk.a(0, 0, lk.field_b, lk.field_c);
                            pn.d((byte) -7);
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof Exception ? 40 : 120);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (param0 == ra.field_e) {
                                statePc = 47;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var4_int = 256 * eh.field_a / 30;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (var4_int <= 0) {
                                statePc = 47;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof Exception ? 46 : 120);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            lk.b(0, 0, lk.field_b, lk.field_c, 0, var4_int);
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof Exception ? 46 : 120);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (!sj.a(param0 + -85)) {
                                statePc = 59;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof Exception ? 51 : 120);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            stackOut_48_0 = -75;
                            stackIn_49_0 = stackOut_48_0;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof Exception ? 51 : 120);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (so.a((byte) stackIn_49_0)) {
                                statePc = 59;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof Exception ? 54 : 120);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof Exception ? 54 : 120);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof Exception ? 54 : 120);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (gk.field_o != null) {
                                statePc = 57;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof Exception ? 56 : 120);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof Exception ? 56 : 120);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof Exception ? 56 : 120);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            stackOut_55_0 = ii.field_a;
                            stackIn_58_0 = stackOut_55_0 ? 1 : 0;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof Exception ? 56 : 120);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            stackOut_57_0 = 1;
                            stackIn_58_0 = stackOut_57_0;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            kn.a(stackIn_58_0 != 0, 25);
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if (ku.field_j < 2) {
                                statePc = 67;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof Exception ? 63 : 120);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            stackOut_60_0 = gw.field_v;
                            stackIn_61_0 = stackOut_60_0;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof Exception ? 63 : 120);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (!stackIn_61_0) {
                                statePc = 67;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof Exception ? 66 : 120);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof Exception ? 66 : 120);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof Exception ? 66 : 120);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -81, 1);
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof Exception ? 66 : 120);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var4 = (ge) (Object) pl.field_v.b(param0 + -121);
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (null != var4) {
                                statePc = 71;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof Exception ? 70 : 120);
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof Exception ? 70 : 120);
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            var6 = qn.field_g;
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if (-65 < (var6 ^ -1)) {
                                statePc = 78;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof Exception ? 75 : 120);
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (var6 > 192) {
                                statePc = 77;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof Exception ? 75 : 120);
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            var5_int = 255;
                            if (var10 == 0) {
                                statePc = 79;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var5_int = (-var6 + 192) * 255 / 64;
                            if (var10 == 0) {
                                statePc = 79;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            var5_int = 255 * var6 / 64;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            var7 = 45;
                            if ((var4.field_m ^ -1) <= -1) {
                                statePc = 81;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var8_ref = aa.field_b;
                            if (var10 == 0) {
                                statePc = 86;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            var8_ref_String = rb.field_d[var4.field_m];
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            if (qw.field_a.length > var4.field_m) {
                                statePc = 85;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof Exception ? 84 : 120);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof Exception ? 84 : 120);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var7 += 65;
                            qw.field_a[var4.field_m].a(-32 + rj.field_c - 180 + 85, 45, 64, 64, 0, 16777215 | var5_int << -107247976, 1);
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            int discarded$3 = bq.field_c.a(150, var5_int << 1928370328, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, -1 + var7, var5_int << -1003925256, 0, 18, -8787, var8_ref_String, (aa) null, 1, 0);
                            int discarded$4 = bq.field_c.a(150, var5_int << -546648104, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, 1 + var7, var5_int << -410178184, 0, 18, -8787, var8_ref_String, (aa) null, 1, 0);
                            int discarded$5 = bq.field_c.a(150, var5_int << 1364626776 | 16777215, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, var7, -1, 0, 18, -8787, var8_ref_String, (aa) null, 1, 0);
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            if (!oj.a(false)) {
                                statePc = 90;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var5_int = (-lk.field_b + gi.field_h) * 0 / 2;
                            var6 = 0 * (wq.field_b + -lk.field_c) / 2;
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            cf.a(var5_int, var6, 59);
                            kn.a(false, (byte) -122);
                            ((Sumoblitz) this).field_F = true;
                            if (var10 == 0) {
                                statePc = 100;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof Exception ? 92 : 120);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            if (sj.a(-44)) {
                                statePc = 99;
                            } else {
                                statePc = 91;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof Exception ? 95 : 120);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof Exception ? 95 : 120);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof Exception ? 95 : 120);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            if (!ws.b((byte) 52)) {
                                statePc = 98;
                            } else {
                                statePc = 94;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof Exception ? 97 : 120);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            statePc = 96;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof Exception ? 97 : 120);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof Exception ? 97 : 120);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof Exception ? 97 : 120);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            ((Sumoblitz) this).field_F = false;
                            if (var10 == 0) {
                                statePc = 100;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            var5_int = 0 * (-lk.field_b + gi.field_h) / 2;
                            var6 = (wq.field_b - lk.field_c) * 0 / 2;
                            ls.a(var5_int, -80, var6);
                            kn.a(false, param0 ^ 121);
                            ((Sumoblitz) this).field_F = true;
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            if (!((Sumoblitz) this).field_F) {
                                statePc = 116;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            var5_int = lk.field_b;
                            var6 = lk.field_c;
                            statePc = 102;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            if (((Sumoblitz) this).field_K != null) {
                                statePc = 105;
                            } else {
                                statePc = 103;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof Exception ? 104 : 120);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof Exception ? 104 : 120);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            var6 = ((Sumoblitz) this).field_K.field_u;
                            var5_int = ((Sumoblitz) this).field_K.field_x;
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            var7 = (-var5_int + gi.field_h) / 2;
                            var8 = (wq.field_b - var6) / 2;
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            if (!oj.a(false)) {
                                statePc = 115;
                            } else {
                                statePc = 108;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof Exception ? 111 : 120);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            stackOut_108_0 = this;
                            stackIn_109_0 = stackOut_108_0;
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof Exception ? 111 : 120);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            if (((Sumoblitz) this).field_K != null) {
                                statePc = 114;
                            } else {
                                statePc = 110;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof Exception ? 113 : 120);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof Exception ? 113 : 120);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = (stateCaught_111 instanceof Exception ? 113 : 120);
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = (stateCaught_112 instanceof Exception ? 113 : 120);
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 114: {
                        try {
                            var7 = ik.c(param0 ^ -10517);
                            var8 = fd.b(3878);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_114) {
                            caughtException = stateCaught_114;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 115: {
                        try {
                            var9 = wq.a(var3, (byte) 18);
                            var9.a((byte) 111, var8, var8 + var6, var7, var7 - -var5_int);
                            var7 = (-lk.field_b + gi.field_h) / 2;
                            var8 = (wq.field_b + -lk.field_c) / 2;
                            var3.SA(var7, var8, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                            var9.a(param0 + 29709);
                            statePc = 116;
                            continue stateLoop;
                        } catch (Throwable stateCaught_115) {
                            caughtException = stateCaught_115;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 116: {
                        try {
                            var3.a(true);
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_116) {
                            caughtException = stateCaught_116;
                            statePc = (stateCaught_116 instanceof Exception ? 118 : 120);
                            continue stateLoop;
                        }
                    }
                    case 117: {
                        try {
                            statePc = 121;
                            continue stateLoop;
                        } catch (Throwable stateCaught_117) {
                            caughtException = stateCaught_117;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 118: {
                        try {
                            var5 = (Exception) (Object) caughtException;
                            var5.printStackTrace();
                            statePc = 121;
                            continue stateLoop;
                        } catch (Throwable stateCaught_118) {
                            caughtException = stateCaught_118;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 120: {
                        var2 = (RuntimeException) (Object) caughtException;
                        throw qo.a((Throwable) (Object) var2, "Sumoblitz.I(" + param0 + 41);
                    }
                    case 121: {
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

    private final void r(int param0) {
        RuntimeException var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (null != vf.field_a) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        rj.a(vf.field_a, -5);
                        vf.field_a = null;
                        ls.b(param0 + -21961);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0 == 21961) {
                            statePc = 8;
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
                        this.g((byte) -69);
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        jg.field_a = true;
                        kf.field_v = wd.a(4, (byte) 125);
                        dq.field_Z = wd.a(5, (byte) 125);
                        hl.field_d = wd.a(6, (byte) 125);
                        er.field_c = wd.a(7, (byte) 125);
                        gg.field_r = wd.a(8, (byte) 125);
                        be.field_s = wd.a(9, (byte) 125);
                        ik.field_d = wd.a(12, (byte) 125);
                        iv.field_b = new Random(wq.a(-52));
                        if (null != nq.field_h) {
                            statePc = 14;
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
                        nq.field_h = new ik(11, -1, (d) null);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 14;
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
                case 13: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw qo.a((Throwable) (Object) var2, "Sumoblitz.QA(" + param0 + 41);
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void s(int param0) {
        field_J = null;
        if (param0 != 0) {
            return;
        }
        try {
            field_G = null;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "Sumoblitz.UA(" + param0 + 41);
        }
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        hg var3_ref_hg = null;
        int var3 = 0;
        int var4 = 0;
        cq stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_39_0 = 0;
        Object stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        Object stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        Object stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        Object stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        int stackIn_95_0 = 0;
        int stackIn_119_0 = 0;
        cq stackOut_2_0 = null;
        Object stackOut_9_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_38_0 = 0;
        Object stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        Object stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        Object stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        int stackOut_89_2 = 0;
        Object stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        int stackOut_91_2 = 0;
        int stackOut_94_0 = 0;
        int stackOut_118_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        fv.e((byte) 76);
                        if (gk.field_o == null) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = gk.field_o;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (!stackIn_3_0.field_a) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        b.c((byte) 49);
                        qw.a((byte) 35);
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
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = this;
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (null == gk.field_o) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = this;
                        stackOut_10_1 = 1;
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_13_1 = stackOut_10_1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = this;
                        stackOut_12_1 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((Sumoblitz) this).b(stackIn_13_1 != 0, -103);
                        if (ml.field_u) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.r(21961);
                        ml.field_u = false;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (!in.g(-42)) {
                            statePc = 28;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((Sumoblitz) this).m(106);
                        if (in.g(-33)) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (!we.g(-1)) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        boolean discarded$1 = this.a(false, true);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return;
                }
                case 28: {
                    try {
                        if (!sa.field_j) {
                            statePc = 109;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (su.a(0)) {
                            statePc = 49;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        ou.d((byte) -112);
                        if (su.a(0)) {
                            statePc = 37;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        oq.a(-24233);
                        ad.c(0);
                        if (5 != nj.field_b) {
                            statePc = 45;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = 0;
                        stackIn_39_0 = stackOut_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 != wj.field_e) {
                            statePc = 45;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 44;
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
                        nj.field_b = 2;
                        av.a(-7753, false, 2);
                        statePc = 43;
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
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (!so.a((byte) 119)) {
                            statePc = 115;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        vb.a((byte) -111, true);
                        if (var4 == 0) {
                            statePc = 115;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (!so.a((byte) 107)) {
                            statePc = 80;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (0 != ra.field_e) {
                            statePc = 77;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var2_int = kt.a(-38);
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (2 != var2_int) {
                            statePc = 60;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        b.c((byte) 71);
                        if (var4 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (3 != var2_int) {
                            statePc = 66;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        vb.a((byte) -21, true);
                        if (var4 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if ((var2_int ^ -1) == -5) {
                            statePc = 71;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        wn.a(true);
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (!so.a((byte) 109)) {
                            statePc = 75;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        iv.field_g[nj.field_b].b(-8628, true);
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var4 == 0) {
                            statePc = 115;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        this.g((byte) 96);
                        if (var4 == 0) {
                            statePc = 115;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (sj.a(-123)) {
                            statePc = 86;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        this.g((byte) -94);
                        if (var4 == 0) {
                            statePc = 115;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackOut_86_0 = this;
                        stackOut_86_1 = -1;
                        stackIn_91_0 = stackOut_86_0;
                        stackIn_91_1 = stackOut_86_1;
                        stackIn_87_0 = stackOut_86_0;
                        stackIn_87_1 = stackOut_86_1;
                        if (gk.field_o == null) {
                            statePc = 91;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        stackOut_87_0 = this;
                        stackOut_87_1 = stackIn_87_1;
                        stackIn_89_0 = stackOut_87_0;
                        stackIn_89_1 = stackOut_87_1;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        stackOut_89_0 = this;
                        stackOut_89_1 = stackIn_89_1;
                        stackOut_89_2 = 1;
                        stackIn_92_0 = stackOut_89_0;
                        stackIn_92_1 = stackOut_89_1;
                        stackIn_92_2 = stackOut_89_2;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        stackOut_91_0 = this;
                        stackOut_91_1 = stackIn_91_1;
                        stackOut_91_2 = 0;
                        stackIn_92_0 = stackOut_91_0;
                        stackIn_92_1 = stackOut_91_1;
                        stackIn_92_2 = stackOut_91_2;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var2_int = ((Sumoblitz) this).a(stackIn_92_1, stackIn_92_2 != 0);
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (1 == var2_int) {
                            statePc = 98;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        stackOut_94_0 = var2_int;
                        stackIn_95_0 = stackOut_94_0;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (stackIn_95_0 != 2) {
                            statePc = 108;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (null == gk.field_o) {
                            statePc = 104;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        b.c((byte) 49);
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (2 == var2_int) {
                            statePc = 107;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        jl.a(ra.c(2), false);
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (var4 == 0) {
                            statePc = 115;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        rg.a((byte) 55, pn.field_r);
                        if (this.a(true, true)) {
                            statePc = 114;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        sa.field_j = true;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        var2_int = 35 % ((37 - param0) / 61);
                        if (vs.b((byte) 9)) {
                            statePc = 126;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        var3_ref_hg = (hg) (Object) pn.field_q.c(9);
                        if (var3_ref_hg != null) {
                            statePc = 122;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (var4 != 0) {
                            statePc = 125;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        stackOut_118_0 = var4;
                        stackIn_119_0 = stackOut_118_0;
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (stackIn_119_0 == 0) {
                            statePc = 126;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        an.a(4, (byte) 30, var3_ref_hg);
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (var4 == 0) {
                            statePc = 116;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (!vs.a(ov.field_e, -126)) {
                            statePc = 131;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        ((Sumoblitz) this).q(9289);
                        if (var4 != 0) {
                            statePc = 132;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (var4 == 0) {
                            statePc = 126;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        gt.a(0, 0);
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (!en.a(-23517)) {
                            statePc = 140;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        var3 = ((Sumoblitz) this).b(true);
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if (var3 != 2) {
                            statePc = 140;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        we.a((byte) 70);
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 139: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw qo.a((Throwable) (Object) var2, "Sumoblitz.D(" + param0 + 41);
                }
                case 140: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean h(byte param0) {
        ha var2 = null;
        RuntimeException var2_ref = null;
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_17_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 < -4) {
                            statePc = 4;
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
                        field_H = -36;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = nq.field_h.a(-125);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var2 == null) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
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
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
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
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0 != 0;
                }
                case 10: {
                    try {
                        if (!var2.c()) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        wj.field_k = false;
                        ul.field_f = 0;
                        if (!field_L) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
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
                case 14: {
                    try {
                        ul.field_f = 1;
                        wj.field_k = true;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
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
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        er.a(false);
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0 != 0;
                }
                case 19: {
                    var2_ref = (RuntimeException) (Object) caughtException;
                    throw qo.a((Throwable) (Object) var2_ref, "Sumoblitz.RA(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(boolean param0, boolean param1) {
        try {
            java.awt.Canvas var3 = null;
            int var3_int = 0;
            ha var4 = null;
            int var5_int = 0;
            ge var5 = null;
            int var6_int = 0;
            int var7 = 0;
            int var8 = 0;
            String var9_ref = null;
            String var9_ref_String = null;
            int var9 = 0;
            pm var10 = null;
            int var11 = 0;
            ik stackIn_60_0 = null;
            ik stackIn_61_0 = null;
            ik stackIn_62_0 = null;
            ik stackIn_63_0 = null;
            int stackIn_63_1 = 0;
            int stackIn_90_0 = 0;
            int stackIn_173_0 = 0;
            int stackIn_195_0 = 0;
            int stackIn_256_0 = 0;
            ik stackIn_316_0 = null;
            ik stackIn_317_0 = null;
            ik stackIn_318_0 = null;
            ik stackIn_319_0 = null;
            int stackIn_319_1 = 0;
            int stackIn_348_0 = 0;
            int stackIn_430_0 = 0;
            ik stackOut_59_0 = null;
            ik stackOut_62_0 = null;
            int stackOut_62_1 = 0;
            ik stackOut_60_0 = null;
            ik stackOut_61_0 = null;
            int stackOut_61_1 = 0;
            int stackOut_89_0 = 0;
            boolean stackOut_88_0 = false;
            boolean stackOut_255_0 = false;
            int stackOut_254_0 = 0;
            ik stackOut_315_0 = null;
            ik stackOut_318_0 = null;
            int stackOut_318_1 = 0;
            ik stackOut_316_0 = null;
            ik stackOut_317_0 = null;
            int stackOut_317_1 = 0;
            int stackOut_347_0 = 0;
            boolean stackOut_346_0 = false;
            boolean stackOut_429_0 = false;
            int stackOut_428_0 = 0;
            int stackOut_172_0 = 0;
            boolean stackOut_171_0 = false;
            int stackOut_194_0 = 0;
            int stackOut_193_0 = 0;
            var11 = field_L ? 1 : 0;
            cl.e(-69);
            if (null != hl.field_d) {
              L0: {
                if (!pi.field_c.b((byte) 127)) {
                  break L0;
                } else {
                  if (pi.field_c.a("basic", 100)) {
                    if (!pi.field_c.a("arialbold14", 100)) {
                      pe.a(20, 4.0f, pt.a("arialbold14", pi.field_c, ce.field_l, true, ow.field_a));
                      return false;
                    } else {
                      L1: {
                        if (!vb.field_J.b((byte) 127)) {
                          break L1;
                        } else {
                          if (vb.field_J.a("arialbold14", 100)) {
                            if (pi.field_c.a("arial13", 100)) {
                              L2: {
                                if (!vb.field_J.b((byte) 127)) {
                                  break L2;
                                } else {
                                  if (vb.field_J.a("arial13", 100)) {
                                    L3: {
                                      if (!hl.field_d.b((byte) 127)) {
                                        break L3;
                                      } else {
                                        if (hl.field_d.a(true)) {
                                          L4: {
                                            if (!er.field_c.b((byte) 127)) {
                                              break L4;
                                            } else {
                                              if (er.field_c.a(param1)) {
                                                L5: {
                                                  if (!gg.field_r.b((byte) 127)) {
                                                    break L5;
                                                  } else {
                                                    if (gg.field_r.a(param1)) {
                                                      L6: {
                                                        if (!be.field_s.b((byte) 127)) {
                                                          break L6;
                                                        } else {
                                                          if (be.field_s.a(true)) {
                                                            L7: {
                                                              if (!kf.field_v.b((byte) 127)) {
                                                                break L7;
                                                              } else {
                                                                if (kf.field_v.a(true)) {
                                                                  L8: {
                                                                    if (!dq.field_Z.b((byte) 127)) {
                                                                      break L8;
                                                                    } else {
                                                                      if (dq.field_Z.a(true)) {
                                                                        L9: {
                                                                          if (!ik.field_d.b((byte) 127)) {
                                                                            break L9;
                                                                          } else {
                                                                            if (!ik.field_d.a(true)) {
                                                                              break L9;
                                                                            } else {
                                                                              L10: {
                                                                                L11: {
                                                                                  pe.a(20, 65.0f, hv.field_e);
                                                                                  var3 = hk.b(-22);
                                                                                  lk.b();
                                                                                  if (!in.g(-61)) {
                                                                                    break L11;
                                                                                  } else {
                                                                                    ad.a((byte) 85, var3, np.a(7));
                                                                                    if (var11 == 0) {
                                                                                      break L10;
                                                                                    } else {
                                                                                      break L11;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L12: {
                                                                                  if (sa.field_j) {
                                                                                    break L12;
                                                                                  } else {
                                                                                    od.a(-117, var3);
                                                                                    if (var11 == 0) {
                                                                                      break L10;
                                                                                    } else {
                                                                                      break L12;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L13: {
                                                                                  if (su.a(0)) {
                                                                                    break L13;
                                                                                  } else {
                                                                                    pe.a(20, 100.0f, fl.field_s);
                                                                                    od.a(-117, var3);
                                                                                    if (var11 == 0) {
                                                                                      break L10;
                                                                                    } else {
                                                                                      break L13;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L14: {
                                                                                  stackOut_59_0 = nq.field_h;
                                                                                  stackIn_62_0 = stackOut_59_0;
                                                                                  stackIn_60_0 = stackOut_59_0;
                                                                                  if (param1) {
                                                                                    stackOut_62_0 = (ik) (Object) stackIn_62_0;
                                                                                    stackOut_62_1 = 0;
                                                                                    stackIn_63_0 = stackOut_62_0;
                                                                                    stackIn_63_1 = stackOut_62_1;
                                                                                    break L14;
                                                                                  } else {
                                                                                    stackOut_60_0 = (ik) (Object) stackIn_60_0;
                                                                                    stackIn_61_0 = stackOut_60_0;
                                                                                    stackOut_61_0 = (ik) (Object) stackIn_61_0;
                                                                                    stackOut_61_1 = 1;
                                                                                    stackIn_63_0 = stackOut_61_0;
                                                                                    stackIn_63_1 = stackOut_61_1;
                                                                                    break L14;
                                                                                  }
                                                                                }
                                                                                L15: {
                                                                                  if (((ik) (Object) stackIn_63_0).a(stackIn_63_1 == 0)) {
                                                                                    break L15;
                                                                                  } else {
                                                                                    if (!this.h((byte) -105)) {
                                                                                      break L10;
                                                                                    } else {
                                                                                      break L15;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L16: {
                                                                                  L17: {
                                                                                    var4 = nq.field_h.a(-97);
                                                                                    var4.GA(0);
                                                                                    ph.field_b.a(124, var4, false);
                                                                                    if ((rc.field_k ^ -1) != (nj.field_b ^ -1)) {
                                                                                      break L17;
                                                                                    } else {
                                                                                      if (-1 == nj.field_b) {
                                                                                        break L16;
                                                                                      } else {
                                                                                        iv.field_g[nj.field_b].a(255, var4, -2355);
                                                                                        if (var11 == 0) {
                                                                                          break L16;
                                                                                        } else {
                                                                                          break L17;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L18: {
                                                                                    var5_int = 255 * eh.field_a / 30;
                                                                                    if (-1 != nj.field_b) {
                                                                                      iv.field_g[nj.field_b].a(255 - var5_int, var4, -2355);
                                                                                      break L18;
                                                                                    } else {
                                                                                      break L18;
                                                                                    }
                                                                                  }
                                                                                  if ((rc.field_k ^ -1) != 0) {
                                                                                    iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                                                                                    break L16;
                                                                                  } else {
                                                                                    break L16;
                                                                                  }
                                                                                }
                                                                                L19: {
                                                                                  if (!so.a((byte) 124)) {
                                                                                    break L19;
                                                                                  } else {
                                                                                    lk.a(0, 0, lk.field_b, lk.field_c);
                                                                                    pn.d((byte) -7);
                                                                                    break L19;
                                                                                  }
                                                                                }
                                                                                L20: {
                                                                                  if (0 != ra.field_e) {
                                                                                    var5_int = eh.field_a * 256 / 30;
                                                                                    if (-1 <= (var5_int ^ -1)) {
                                                                                      break L20;
                                                                                    } else {
                                                                                      lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                                                                                      break L20;
                                                                                    }
                                                                                  } else {
                                                                                    break L20;
                                                                                  }
                                                                                }
                                                                                L21: {
                                                                                  if (!sj.a(-67)) {
                                                                                    break L21;
                                                                                  } else {
                                                                                    if (!so.a((byte) 115)) {
                                                                                      L22: {
                                                                                        if (null != gk.field_o) {
                                                                                          stackOut_89_0 = 1;
                                                                                          stackIn_90_0 = stackOut_89_0;
                                                                                          break L22;
                                                                                        } else {
                                                                                          stackOut_88_0 = ii.field_a;
                                                                                          stackIn_90_0 = stackOut_88_0 ? 1 : 0;
                                                                                          break L22;
                                                                                        }
                                                                                      }
                                                                                      kn.a(stackIn_90_0 != 0, 25);
                                                                                      break L21;
                                                                                    } else {
                                                                                      break L21;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L23: {
                                                                                  if (-3 < (ku.field_j ^ -1)) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    if (!gw.field_v) {
                                                                                      break L23;
                                                                                    } else {
                                                                                      bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -103, 1);
                                                                                      break L23;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L24: {
                                                                                  var5 = (ge) (Object) pl.field_v.b(82);
                                                                                  if (null != var5) {
                                                                                    L25: {
                                                                                      L26: {
                                                                                        var7 = qn.field_g;
                                                                                        if ((var7 ^ -1) <= -65) {
                                                                                          break L26;
                                                                                        } else {
                                                                                          var6_int = 255 * var7 / 64;
                                                                                          if (var11 == 0) {
                                                                                            break L25;
                                                                                          } else {
                                                                                            break L26;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      L27: {
                                                                                        if (var7 > 192) {
                                                                                          break L27;
                                                                                        } else {
                                                                                          var6_int = 255;
                                                                                          if (var11 == 0) {
                                                                                            break L25;
                                                                                          } else {
                                                                                            break L27;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      var6_int = (-(255 * var7) + 48960) / 64;
                                                                                      break L25;
                                                                                    }
                                                                                    L28: {
                                                                                      L29: {
                                                                                        var8 = 45;
                                                                                        if (0 > var5.field_m) {
                                                                                          break L29;
                                                                                        } else {
                                                                                          var9_ref_String = rb.field_d[var5.field_m];
                                                                                          if ((qw.field_a.length ^ -1) >= (var5.field_m ^ -1)) {
                                                                                            break L28;
                                                                                          } else {
                                                                                            qw.field_a[var5.field_m].a(-32 + (85 + rj.field_c + -180), 45, 64, 64, 0, 16777215 | var6_int << 830870136, 1);
                                                                                            var8 += 65;
                                                                                            if (var11 == 0) {
                                                                                              break L28;
                                                                                            } else {
                                                                                              break L29;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      var9_ref = aa.field_b;
                                                                                      break L28;
                                                                                    }
                                                                                    int discarded$17 = bq.field_c.a(150, var6_int << 2138560952, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, -1 + var8, var6_int << -959202280, 0, 18, -8787, var9_ref, (aa) null, 1, 0);
                                                                                    int discarded$18 = bq.field_c.a(150, var6_int << 1113845016, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, 1 + var8, var6_int << -98083080, 0, 18, -8787, var9_ref, (aa) null, 1, 0);
                                                                                    int discarded$19 = bq.field_c.a(150, var6_int << 1533176120 | 16777215, 0, 170, rj.field_c + -180, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref, (aa) null, 1, 0);
                                                                                    break L24;
                                                                                  } else {
                                                                                    break L24;
                                                                                  }
                                                                                }
                                                                                L30: {
                                                                                  L31: {
                                                                                    if (!oj.a(false)) {
                                                                                      break L31;
                                                                                    } else {
                                                                                      var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                                                                                      var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                                                                                      cf.a(var6_int, var7, 76);
                                                                                      kn.a(false, (byte) -122);
                                                                                      ((Sumoblitz) this).field_F = true;
                                                                                      if (var11 == 0) {
                                                                                        break L30;
                                                                                      } else {
                                                                                        break L31;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L32: {
                                                                                    if (!sj.a(-126)) {
                                                                                      break L32;
                                                                                    } else {
                                                                                      var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                                                                                      var7 = (wq.field_b - lk.field_c) * 0 / 2;
                                                                                      ls.a(var6_int, -45, var7);
                                                                                      kn.a(false, -66);
                                                                                      ((Sumoblitz) this).field_F = true;
                                                                                      if (var11 == 0) {
                                                                                        break L30;
                                                                                      } else {
                                                                                        break L32;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  if (!ws.b((byte) 52)) {
                                                                                    ((Sumoblitz) this).field_F = false;
                                                                                    break L30;
                                                                                  } else {
                                                                                    break L30;
                                                                                  }
                                                                                }
                                                                                L33: {
                                                                                  if (((Sumoblitz) this).field_F) {
                                                                                    L34: {
                                                                                      var6_int = lk.field_b;
                                                                                      var7 = lk.field_c;
                                                                                      if (((Sumoblitz) this).field_K == null) {
                                                                                        break L34;
                                                                                      } else {
                                                                                        var6_int = ((Sumoblitz) this).field_K.field_x;
                                                                                        var7 = ((Sumoblitz) this).field_K.field_u;
                                                                                        break L34;
                                                                                      }
                                                                                    }
                                                                                    L35: {
                                                                                      var8 = (-var6_int + gi.field_h) / 2;
                                                                                      var9 = (-var7 + wq.field_b) / 2;
                                                                                      if (!oj.a(false)) {
                                                                                        break L35;
                                                                                      } else {
                                                                                        if (((Sumoblitz) this).field_K == null) {
                                                                                          break L35;
                                                                                        } else {
                                                                                          var8 = ik.c(-10517);
                                                                                          var9 = fd.b(3878);
                                                                                          break L35;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var10 = wq.a(var4, (byte) 126);
                                                                                    var10.a((byte) 91, var9, var7 + var9, var8, var6_int + var8);
                                                                                    var9 = (-lk.field_c + wq.field_b) / 2;
                                                                                    var8 = (-lk.field_b + gi.field_h) / 2;
                                                                                    var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                                                                                    var10.a(29709);
                                                                                    break L33;
                                                                                  } else {
                                                                                    break L33;
                                                                                  }
                                                                                }
                                                                                var4.a(true);
                                                                                break L10;
                                                                              }
                                                                              if (!param0) {
                                                                                return false;
                                                                              } else {
                                                                                eb.field_b = new og(hl.field_d, er.field_c);
                                                                                ff.a((byte) -62, hl.field_d);
                                                                                oq.a(-24233);
                                                                                hl.field_d = null;
                                                                                ls.b(0);
                                                                                return false;
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                        pe.a(20, 60.0f, nw.a(nm.field_n, (byte) 85, 0, ik.field_d, b.field_f));
                                                                        return false;
                                                                      } else {
                                                                        break L8;
                                                                      }
                                                                    }
                                                                  }
                                                                  pe.a(20, 55.0f, pt.a("", dq.field_Z, ce.field_l, true, ow.field_a));
                                                                  return false;
                                                                } else {
                                                                  break L7;
                                                                }
                                                              }
                                                            }
                                                            pe.a(20, 45.0f, pt.a("", kf.field_v, m.field_V, true, es.field_j));
                                                            return false;
                                                          } else {
                                                            break L6;
                                                          }
                                                        }
                                                      }
                                                      pe.a(20, 40.0f, pt.a("", be.field_s, ve.field_l, true, gt.field_hb));
                                                      return false;
                                                    } else {
                                                      break L5;
                                                    }
                                                  }
                                                }
                                                pe.a(20, 30.0f, nw.a(jf.field_a, (byte) 85, 0, gg.field_r, sg.field_i));
                                                return false;
                                              } else {
                                                break L4;
                                              }
                                            }
                                          }
                                          pe.a(20, 20.0f, pt.a("", er.field_c, fn.field_A, true, hq.field_a));
                                          return false;
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                    pe.a(20, 10.0f, pt.a("", hl.field_d, fn.field_A, true, hq.field_a));
                                    return false;
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                              pe.a(20, 5.0f, pt.a("arial13", vb.field_J, ce.field_l, true, ow.field_a));
                              return false;
                            } else {
                              pe.a(20, 4.0f, pt.a("arial13", pi.field_c, ce.field_l, true, ow.field_a));
                              return false;
                            }
                          } else {
                            break L1;
                          }
                        }
                      }
                      pe.a(20, 5.0f, pt.a("arialbold14", vb.field_J, ce.field_l, true, ow.field_a));
                      return false;
                    }
                  } else {
                    break L0;
                  }
                }
              }
              pe.a(20, 3.0f, pt.a("basic", pi.field_c, m.field_V, true, es.field_j));
              return false;
            } else {
              if (null == er.field_c) {
                if (null != be.field_s) {
                  L36: {
                    L37: {
                      pe.a(20, 75.0f, su.field_d);
                      var3 = hk.b(-103);
                      lk.b();
                      if (!in.g(-98)) {
                        break L37;
                      } else {
                        ad.a((byte) 95, var3, np.a(7));
                        if (var11 == 0) {
                          break L36;
                        } else {
                          break L37;
                        }
                      }
                    }
                    L38: {
                      if (sa.field_j) {
                        break L38;
                      } else {
                        od.a(-73, var3);
                        if (var11 == 0) {
                          break L36;
                        } else {
                          break L38;
                        }
                      }
                    }
                    L39: {
                      if (su.a(0)) {
                        break L39;
                      } else {
                        pe.a(20, 100.0f, fl.field_s);
                        od.a(-111, var3);
                        if (var11 == 0) {
                          break L36;
                        } else {
                          break L39;
                        }
                      }
                    }
                    L40: {
                      if (nq.field_h.a(false)) {
                        if (this.h((byte) -48)) {
                          break L40;
                        } else {
                          if (var11 == 0) {
                            break L36;
                          } else {
                            break L40;
                          }
                        }
                      } else {
                        break L40;
                      }
                    }
                    L41: {
                      L42: {
                        var4 = nq.field_h.a(-128);
                        var4.GA(0);
                        ph.field_b.a(124, var4, false);
                        if ((nj.field_b ^ -1) == (rc.field_k ^ -1)) {
                          break L42;
                        } else {
                          L43: {
                            var5_int = 255 * eh.field_a / 30;
                            if ((nj.field_b ^ -1) == 0) {
                              break L43;
                            } else {
                              iv.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                              break L43;
                            }
                          }
                          L44: {
                            if ((rc.field_k ^ -1) == 0) {
                              break L44;
                            } else {
                              iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                              break L44;
                            }
                          }
                          if (var11 == 0) {
                            break L41;
                          } else {
                            break L42;
                          }
                        }
                      }
                      if (-1 == nj.field_b) {
                        break L41;
                      } else {
                        iv.field_g[nj.field_b].a(255, var4, -2355);
                        break L41;
                      }
                    }
                    L45: {
                      if (!so.a((byte) 109)) {
                        break L45;
                      } else {
                        lk.a(0, 0, lk.field_b, lk.field_c);
                        pn.d((byte) -7);
                        break L45;
                      }
                    }
                    L46: {
                      if ((ra.field_e ^ -1) == -1) {
                        break L46;
                      } else {
                        var5_int = eh.field_a * 256 / 30;
                        if (0 < var5_int) {
                          lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                          break L46;
                        } else {
                          break L46;
                        }
                      }
                    }
                    L47: {
                      if (!sj.a(-28)) {
                        break L47;
                      } else {
                        if (!so.a((byte) -55)) {
                          L48: {
                            if (gk.field_o == null) {
                              stackOut_255_0 = ii.field_a;
                              stackIn_256_0 = stackOut_255_0 ? 1 : 0;
                              break L48;
                            } else {
                              stackOut_254_0 = 1;
                              stackIn_256_0 = stackOut_254_0;
                              break L48;
                            }
                          }
                          kn.a(stackIn_256_0 != 0, -122);
                          break L47;
                        } else {
                          break L47;
                        }
                      }
                    }
                    L49: {
                      if ((ku.field_j ^ -1) > -3) {
                        break L49;
                      } else {
                        if (gw.field_v) {
                          bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -122, 1);
                          break L49;
                        } else {
                          break L49;
                        }
                      }
                    }
                    L50: {
                      var5 = (ge) (Object) pl.field_v.b(-85);
                      if (null != var5) {
                        L51: {
                          L52: {
                            var7 = qn.field_g;
                            if (64 > var7) {
                              break L52;
                            } else {
                              L53: {
                                if (var7 > 192) {
                                  break L53;
                                } else {
                                  var6_int = 255;
                                  if (var11 == 0) {
                                    break L51;
                                  } else {
                                    break L53;
                                  }
                                }
                              }
                              var6_int = (48960 - var7 * 255) / 64;
                              if (var11 == 0) {
                                break L51;
                              } else {
                                break L52;
                              }
                            }
                          }
                          var6_int = 255 * var7 / 64;
                          break L51;
                        }
                        L54: {
                          L55: {
                            var8 = 45;
                            if ((var5.field_m ^ -1) <= -1) {
                              break L55;
                            } else {
                              var9_ref = aa.field_b;
                              if (var11 == 0) {
                                break L54;
                              } else {
                                break L55;
                              }
                            }
                          }
                          var9_ref_String = rb.field_d[var5.field_m];
                          if (qw.field_a.length > var5.field_m) {
                            var8 += 65;
                            qw.field_a[var5.field_m].a(rj.field_c - 180 + 53, 45, 64, 64, 0, var6_int << 845463512 | 16777215, 1);
                            break L54;
                          } else {
                            break L54;
                          }
                        }
                        int discarded$20 = bq.field_c.a(150, var6_int << -1210373192, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, var8 + -1, var6_int << 156532632, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        int discarded$21 = bq.field_c.a(150, var6_int << -135066696, 0, 170, rj.field_c + -180, (int[]) null, (hr[]) null, 1 + var8, var6_int << -2061898952, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        int discarded$22 = bq.field_c.a(150, var6_int << 803257688 | 16777215, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        break L50;
                      } else {
                        break L50;
                      }
                    }
                    L56: {
                      L57: {
                        if (!oj.a(false)) {
                          break L57;
                        } else {
                          var6_int = 0 * (gi.field_h - lk.field_b) / 2;
                          var7 = (wq.field_b - lk.field_c) * 0 / 2;
                          cf.a(var6_int, var7, 86);
                          kn.a(false, (byte) -122);
                          ((Sumoblitz) this).field_F = true;
                          if (var11 == 0) {
                            break L56;
                          } else {
                            break L57;
                          }
                        }
                      }
                      L58: {
                        if (sj.a(-63)) {
                          break L58;
                        } else {
                          if (ws.b((byte) 52)) {
                            break L56;
                          } else {
                            ((Sumoblitz) this).field_F = false;
                            if (var11 == 0) {
                              break L56;
                            } else {
                              break L58;
                            }
                          }
                        }
                      }
                      var6_int = 0 * (gi.field_h + -lk.field_b) / 2;
                      var7 = (wq.field_b + -lk.field_c) * 0 / 2;
                      ls.a(var6_int, -82, var7);
                      kn.a(false, -100);
                      ((Sumoblitz) this).field_F = true;
                      break L56;
                    }
                    L59: {
                      if (!((Sumoblitz) this).field_F) {
                        break L59;
                      } else {
                        L60: {
                          var6_int = lk.field_b;
                          var7 = lk.field_c;
                          if (((Sumoblitz) this).field_K == null) {
                            break L60;
                          } else {
                            var6_int = ((Sumoblitz) this).field_K.field_x;
                            var7 = ((Sumoblitz) this).field_K.field_u;
                            break L60;
                          }
                        }
                        L61: {
                          var8 = (gi.field_h + -var6_int) / 2;
                          var9 = (-var7 + wq.field_b) / 2;
                          if (!oj.a(false)) {
                            break L61;
                          } else {
                            if (((Sumoblitz) this).field_K != null) {
                              var8 = ik.c(-10517);
                              var9 = fd.b(3878);
                              break L61;
                            } else {
                              break L61;
                            }
                          }
                        }
                        var10 = wq.a(var4, (byte) 28);
                        var10.a((byte) 127, var9, var7 + var9, var8, var8 + var6_int);
                        var9 = (wq.field_b - lk.field_c) / 2;
                        var8 = (-lk.field_b + gi.field_h) / 2;
                        var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                        var10.a(29709);
                        break L59;
                      }
                    }
                    var4.a(true);
                    break L36;
                  }
                  au.a(-1509, be.field_s);
                  be.field_s = null;
                  ls.b(0);
                  return false;
                } else {
                  if (gg.field_r == null) {
                    if (ik.field_d != null) {
                      L62: {
                        L63: {
                          pe.a(20, 80.0f, om.field_n);
                          var3 = hk.b(125);
                          lk.b();
                          if (!in.g(-128)) {
                            break L63;
                          } else {
                            ad.a((byte) -75, var3, np.a(7));
                            if (var11 == 0) {
                              break L62;
                            } else {
                              break L63;
                            }
                          }
                        }
                        L64: {
                          if (sa.field_j) {
                            break L64;
                          } else {
                            od.a(-67, var3);
                            if (var11 == 0) {
                              break L62;
                            } else {
                              break L64;
                            }
                          }
                        }
                        L65: {
                          if (su.a(0)) {
                            break L65;
                          } else {
                            pe.a(20, 100.0f, fl.field_s);
                            od.a(-52, var3);
                            if (var11 == 0) {
                              break L62;
                            } else {
                              break L65;
                            }
                          }
                        }
                        L66: {
                          stackOut_315_0 = nq.field_h;
                          stackIn_318_0 = stackOut_315_0;
                          stackIn_316_0 = stackOut_315_0;
                          if (param1) {
                            stackOut_318_0 = (ik) (Object) stackIn_318_0;
                            stackOut_318_1 = 0;
                            stackIn_319_0 = stackOut_318_0;
                            stackIn_319_1 = stackOut_318_1;
                            break L66;
                          } else {
                            stackOut_316_0 = (ik) (Object) stackIn_316_0;
                            stackIn_317_0 = stackOut_316_0;
                            stackOut_317_0 = (ik) (Object) stackIn_317_0;
                            stackOut_317_1 = 1;
                            stackIn_319_0 = stackOut_317_0;
                            stackIn_319_1 = stackOut_317_1;
                            break L66;
                          }
                        }
                        L67: {
                          if (((ik) (Object) stackIn_319_0).a(stackIn_319_1 != 0)) {
                            if (this.h((byte) -11)) {
                              break L67;
                            } else {
                              if (var11 == 0) {
                                break L62;
                              } else {
                                break L67;
                              }
                            }
                          } else {
                            break L67;
                          }
                        }
                        L68: {
                          L69: {
                            var4 = nq.field_h.a(-120);
                            var4.GA(0);
                            ph.field_b.a(122, var4, false);
                            if ((nj.field_b ^ -1) == (rc.field_k ^ -1)) {
                              break L69;
                            } else {
                              L70: {
                                var5_int = eh.field_a * 255 / 30;
                                if (-1 != nj.field_b) {
                                  iv.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                                  break L70;
                                } else {
                                  break L70;
                                }
                              }
                              L71: {
                                if (0 != (rc.field_k ^ -1)) {
                                  iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                                  break L71;
                                } else {
                                  break L71;
                                }
                              }
                              if (var11 == 0) {
                                break L68;
                              } else {
                                break L69;
                              }
                            }
                          }
                          if (0 == (nj.field_b ^ -1)) {
                            break L68;
                          } else {
                            iv.field_g[nj.field_b].a(255, var4, -2355);
                            break L68;
                          }
                        }
                        L72: {
                          if (!so.a((byte) -36)) {
                            break L72;
                          } else {
                            lk.a(0, 0, lk.field_b, lk.field_c);
                            pn.d((byte) -7);
                            break L72;
                          }
                        }
                        L73: {
                          if (ra.field_e != 0) {
                            var5_int = 256 * eh.field_a / 30;
                            if (var5_int <= 0) {
                              break L73;
                            } else {
                              lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                              break L73;
                            }
                          } else {
                            break L73;
                          }
                        }
                        L74: {
                          if (!sj.a(-103)) {
                            break L74;
                          } else {
                            if (so.a((byte) 127)) {
                              break L74;
                            } else {
                              L75: {
                                if (null != gk.field_o) {
                                  stackOut_347_0 = 1;
                                  stackIn_348_0 = stackOut_347_0;
                                  break L75;
                                } else {
                                  stackOut_346_0 = ii.field_a;
                                  stackIn_348_0 = stackOut_346_0 ? 1 : 0;
                                  break L75;
                                }
                              }
                              kn.a(stackIn_348_0 != 0, 115);
                              break L74;
                            }
                          }
                        }
                        L76: {
                          if ((ku.field_j ^ -1) > -3) {
                            break L76;
                          } else {
                            if (gw.field_v) {
                              bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -61, 1);
                              break L76;
                            } else {
                              break L76;
                            }
                          }
                        }
                        L77: {
                          var5 = (ge) (Object) pl.field_v.b(110);
                          if (null != var5) {
                            L78: {
                              L79: {
                                var7 = qn.field_g;
                                if ((var7 ^ -1) <= -65) {
                                  break L79;
                                } else {
                                  var6_int = 255 * var7 / 64;
                                  if (var11 == 0) {
                                    break L78;
                                  } else {
                                    break L79;
                                  }
                                }
                              }
                              L80: {
                                if ((var7 ^ -1) >= -193) {
                                  break L80;
                                } else {
                                  var6_int = (192 - var7) * 255 / 64;
                                  if (var11 == 0) {
                                    break L78;
                                  } else {
                                    break L80;
                                  }
                                }
                              }
                              var6_int = 255;
                              break L78;
                            }
                            L81: {
                              L82: {
                                var8 = 45;
                                if (0 <= var5.field_m) {
                                  break L82;
                                } else {
                                  var9_ref = aa.field_b;
                                  if (var11 == 0) {
                                    break L81;
                                  } else {
                                    break L82;
                                  }
                                }
                              }
                              var9_ref_String = rb.field_d[var5.field_m];
                              if (qw.field_a.length > var5.field_m) {
                                var8 += 65;
                                qw.field_a[var5.field_m].a(-127 + rj.field_c, 45, 64, 64, 0, var6_int << -1700944808 | 16777215, 1);
                                break L81;
                              } else {
                                break L81;
                              }
                            }
                            int discarded$23 = bq.field_c.a(150, var6_int << -1136532232, 0, 170, rj.field_c + -180, (int[]) null, (hr[]) null, -1 + var8, var6_int << 646507896, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                            int discarded$24 = bq.field_c.a(150, var6_int << -1511753384, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, 1 + var8, var6_int << 1591393016, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                            int discarded$25 = bq.field_c.a(150, var6_int << 1308463640 | 16777215, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                            break L77;
                          } else {
                            break L77;
                          }
                        }
                        L83: {
                          L84: {
                            if (!oj.a(false)) {
                              break L84;
                            } else {
                              var6_int = (gi.field_h - lk.field_b) * 0 / 2;
                              var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                              cf.a(var6_int, var7, -44);
                              kn.a(false, (byte) -122);
                              ((Sumoblitz) this).field_F = true;
                              if (var11 == 0) {
                                break L83;
                              } else {
                                break L84;
                              }
                            }
                          }
                          L85: {
                            if (!sj.a(-61)) {
                              break L85;
                            } else {
                              var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                              var7 = (wq.field_b + -lk.field_c) * 0 / 2;
                              ls.a(var6_int, -95, var7);
                              kn.a(false, -109);
                              ((Sumoblitz) this).field_F = true;
                              if (var11 == 0) {
                                break L83;
                              } else {
                                break L85;
                              }
                            }
                          }
                          if (ws.b((byte) 52)) {
                            break L83;
                          } else {
                            ((Sumoblitz) this).field_F = false;
                            break L83;
                          }
                        }
                        L86: {
                          if (((Sumoblitz) this).field_F) {
                            L87: {
                              var6_int = lk.field_b;
                              var7 = lk.field_c;
                              if (((Sumoblitz) this).field_K != null) {
                                var7 = ((Sumoblitz) this).field_K.field_u;
                                var6_int = ((Sumoblitz) this).field_K.field_x;
                                break L87;
                              } else {
                                break L87;
                              }
                            }
                            L88: {
                              var8 = (-var6_int + gi.field_h) / 2;
                              var9 = (-var7 + wq.field_b) / 2;
                              if (!oj.a(false)) {
                                break L88;
                              } else {
                                if (((Sumoblitz) this).field_K == null) {
                                  break L88;
                                } else {
                                  var8 = ik.c(-10517);
                                  var9 = fd.b(3878);
                                  break L88;
                                }
                              }
                            }
                            var10 = wq.a(var4, (byte) 83);
                            var10.a((byte) 71, var9, var9 - -var7, var8, var8 + var6_int);
                            var9 = (wq.field_b + -lk.field_c) / 2;
                            var8 = (gi.field_h + -lk.field_b) / 2;
                            var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                            var10.a(29709);
                            break L86;
                          } else {
                            break L86;
                          }
                        }
                        var4.a(true);
                        break L62;
                      }
                      sb.a(-9937, ik.field_d);
                      ik.field_d = null;
                      ls.b(0);
                      return false;
                    } else {
                      if (null != pi.field_c) {
                        L89: {
                          L90: {
                            pe.a(20, 90.0f, kn.field_e);
                            var3 = hk.b(78);
                            lk.b();
                            if (!in.g(-70)) {
                              break L90;
                            } else {
                              ad.a((byte) -86, var3, np.a(7));
                              if (var11 == 0) {
                                break L89;
                              } else {
                                break L90;
                              }
                            }
                          }
                          L91: {
                            if (!sa.field_j) {
                              od.a(-62, var3);
                              if (var11 == 0) {
                                break L89;
                              } else {
                                break L91;
                              }
                            } else {
                              break L91;
                            }
                          }
                          L92: {
                            if (!su.a(0)) {
                              pe.a(20, 100.0f, fl.field_s);
                              od.a(-110, var3);
                              if (var11 == 0) {
                                break L89;
                              } else {
                                break L92;
                              }
                            } else {
                              break L92;
                            }
                          }
                          L93: {
                            if (nq.field_h.a(false)) {
                              if (this.h((byte) -34)) {
                                break L93;
                              } else {
                                if (var11 == 0) {
                                  break L89;
                                } else {
                                  break L93;
                                }
                              }
                            } else {
                              break L93;
                            }
                          }
                          L94: {
                            L95: {
                              var4 = nq.field_h.a(-125);
                              var4.GA(0);
                              ph.field_b.a(119, var4, false);
                              if ((rc.field_k ^ -1) == (nj.field_b ^ -1)) {
                                break L95;
                              } else {
                                L96: {
                                  var5_int = eh.field_a * 255 / 30;
                                  if (nj.field_b != -1) {
                                    iv.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                                    break L96;
                                  } else {
                                    break L96;
                                  }
                                }
                                L97: {
                                  if (-1 != rc.field_k) {
                                    iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                                    break L97;
                                  } else {
                                    break L97;
                                  }
                                }
                                if (var11 == 0) {
                                  break L94;
                                } else {
                                  break L95;
                                }
                              }
                            }
                            if (0 == (nj.field_b ^ -1)) {
                              break L94;
                            } else {
                              iv.field_g[nj.field_b].a(255, var4, -2355);
                              break L94;
                            }
                          }
                          L98: {
                            if (!so.a((byte) -50)) {
                              break L98;
                            } else {
                              lk.a(0, 0, lk.field_b, lk.field_c);
                              pn.d((byte) -7);
                              break L98;
                            }
                          }
                          L99: {
                            if ((ra.field_e ^ -1) == -1) {
                              break L99;
                            } else {
                              var5_int = eh.field_a * 256 / 30;
                              if (var5_int <= 0) {
                                break L99;
                              } else {
                                lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                                break L99;
                              }
                            }
                          }
                          L100: {
                            if (!sj.a(-38)) {
                              break L100;
                            } else {
                              if (so.a((byte) 110)) {
                                break L100;
                              } else {
                                L101: {
                                  if (null == gk.field_o) {
                                    stackOut_429_0 = ii.field_a;
                                    stackIn_430_0 = stackOut_429_0 ? 1 : 0;
                                    break L101;
                                  } else {
                                    stackOut_428_0 = 1;
                                    stackIn_430_0 = stackOut_428_0;
                                    break L101;
                                  }
                                }
                                kn.a(stackIn_430_0 != 0, -75);
                                break L100;
                              }
                            }
                          }
                          L102: {
                            if ((ku.field_j ^ -1) > -3) {
                              break L102;
                            } else {
                              if (gw.field_v) {
                                bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -93, 1);
                                break L102;
                              } else {
                                break L102;
                              }
                            }
                          }
                          L103: {
                            var5 = (ge) (Object) pl.field_v.b(66);
                            if (null == var5) {
                              break L103;
                            } else {
                              L104: {
                                L105: {
                                  var7 = qn.field_g;
                                  if (-65 < (var7 ^ -1)) {
                                    break L105;
                                  } else {
                                    L106: {
                                      if (192 < var7) {
                                        break L106;
                                      } else {
                                        var6_int = 255;
                                        if (var11 == 0) {
                                          break L104;
                                        } else {
                                          break L106;
                                        }
                                      }
                                    }
                                    var6_int = (192 - var7) * 255 / 64;
                                    if (var11 == 0) {
                                      break L104;
                                    } else {
                                      break L105;
                                    }
                                  }
                                }
                                var6_int = var7 * 255 / 64;
                                break L104;
                              }
                              L107: {
                                L108: {
                                  var8 = 45;
                                  if (var5.field_m < 0) {
                                    break L108;
                                  } else {
                                    var9_ref_String = rb.field_d[var5.field_m];
                                    if ((var5.field_m ^ -1) > (qw.field_a.length ^ -1)) {
                                      var8 += 65;
                                      qw.field_a[var5.field_m].a(-32 + (85 + (rj.field_c + -180)), 45, 64, 64, 0, var6_int << 685471192 | 16777215, 1);
                                      if (var11 == 0) {
                                        break L107;
                                      } else {
                                        break L108;
                                      }
                                    } else {
                                      break L107;
                                    }
                                  }
                                }
                                var9_ref = aa.field_b;
                                break L107;
                              }
                              int discarded$26 = bq.field_c.a(150, var6_int << -562019272, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, -1 + var8, var6_int << -412562056, 0, 18, -8787, var9_ref, (aa) null, 1, 0);
                              int discarded$27 = bq.field_c.a(150, var6_int << -1979326344, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, var8 + 1, var6_int << 382074200, 0, 18, -8787, var9_ref, (aa) null, 1, 0);
                              int discarded$28 = bq.field_c.a(150, 16777215 | var6_int << -138879208, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref, (aa) null, 1, 0);
                              break L103;
                            }
                          }
                          L109: {
                            L110: {
                              if (!oj.a(false)) {
                                break L110;
                              } else {
                                var6_int = 0 * (gi.field_h - lk.field_b) / 2;
                                var7 = (wq.field_b + -lk.field_c) * 0 / 2;
                                cf.a(var6_int, var7, -105);
                                kn.a(false, (byte) -122);
                                ((Sumoblitz) this).field_F = true;
                                if (var11 == 0) {
                                  break L109;
                                } else {
                                  break L110;
                                }
                              }
                            }
                            L111: {
                              if (!sj.a(-67)) {
                                break L111;
                              } else {
                                var6_int = 0 * (gi.field_h + -lk.field_b) / 2;
                                var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                                ls.a(var6_int, -53, var7);
                                kn.a(false, -101);
                                ((Sumoblitz) this).field_F = true;
                                if (var11 == 0) {
                                  break L109;
                                } else {
                                  break L111;
                                }
                              }
                            }
                            if (ws.b((byte) 52)) {
                              break L109;
                            } else {
                              ((Sumoblitz) this).field_F = false;
                              break L109;
                            }
                          }
                          L112: {
                            if (((Sumoblitz) this).field_F) {
                              L113: {
                                var6_int = lk.field_b;
                                var7 = lk.field_c;
                                if (((Sumoblitz) this).field_K == null) {
                                  break L113;
                                } else {
                                  var6_int = ((Sumoblitz) this).field_K.field_x;
                                  var7 = ((Sumoblitz) this).field_K.field_u;
                                  break L113;
                                }
                              }
                              L114: {
                                var8 = (gi.field_h - var6_int) / 2;
                                var9 = (wq.field_b - var7) / 2;
                                if (!oj.a(false)) {
                                  break L114;
                                } else {
                                  if (null != ((Sumoblitz) this).field_K) {
                                    var8 = ik.c(-10517);
                                    var9 = fd.b(3878);
                                    break L114;
                                  } else {
                                    break L114;
                                  }
                                }
                              }
                              var10 = wq.a(var4, (byte) 29);
                              var10.a((byte) 61, var9, var9 + var7, var8, var6_int + var8);
                              var9 = (wq.field_b + -lk.field_c) / 2;
                              var8 = (-lk.field_b + gi.field_h) / 2;
                              var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                              var10.a(29709);
                              break L112;
                            } else {
                              break L112;
                            }
                          }
                          var4.a(true);
                          break L89;
                        }
                        pe.a(pi.field_c, dq.field_Z, 20, kf.field_v);
                        fv.a(7966, dq.field_Z, kf.field_v);
                        pi.field_c = null;
                        kf.field_v = null;
                        dq.field_Z = null;
                        ls.b(0);
                        return false;
                      } else {
                        L115: {
                          if (param1) {
                            break L115;
                          } else {
                            boolean discarded$29 = this.h((byte) -12);
                            break L115;
                          }
                        }
                        L116: {
                          if (!vi.f(5)) {
                            break L116;
                          } else {
                            var3_int = 0;
                            L117: while (true) {
                              L118: {
                                L119: {
                                  if (13 <= var3_int) {
                                    break L119;
                                  } else {
                                    iv.field_g[var3_int] = ga.a(var3_int, (byte) -100);
                                    var3_int++;
                                    if (var11 != 0) {
                                      break L118;
                                    } else {
                                      if (var11 == 0) {
                                        continue L117;
                                      } else {
                                        break L119;
                                      }
                                    }
                                  }
                                }
                                nj.field_b = 0;
                                bp.a(50, 26175);
                                nn.b(50, -106);
                                mo.a(86, 0);
                                ek.b(true, 0);
                                break L118;
                              }
                              vl.field_a = 0;
                              break L116;
                            }
                          }
                        }
                        L120: {
                          if (nq.field_h.a(-113) == null) {
                            boolean discarded$30 = nq.field_h.a(false);
                            if (this.h((byte) -124)) {
                              break L120;
                            } else {
                              return false;
                            }
                          } else {
                            break L120;
                          }
                        }
                        ph.field_b = new qu();
                        return true;
                      }
                    }
                  } else {
                    if (!il.a(false, gg.field_r)) {
                      ls.b(0);
                      return false;
                    } else {
                      gg.field_r = null;
                      ls.b(0);
                      return false;
                    }
                  }
                }
              } else {
                L121: {
                  L122: {
                    pe.a(20, 70.0f, hv.field_e);
                    var3 = hk.b(-103);
                    lk.b();
                    if (!in.g(-96)) {
                      break L122;
                    } else {
                      ad.a((byte) -45, var3, np.a(7));
                      if (var11 == 0) {
                        break L121;
                      } else {
                        break L122;
                      }
                    }
                  }
                  L123: {
                    if (sa.field_j) {
                      break L123;
                    } else {
                      od.a(-121, var3);
                      if (var11 == 0) {
                        break L121;
                      } else {
                        break L123;
                      }
                    }
                  }
                  L124: {
                    if (su.a(0)) {
                      break L124;
                    } else {
                      pe.a(20, 100.0f, fl.field_s);
                      od.a(-68, var3);
                      if (var11 == 0) {
                        break L121;
                      } else {
                        break L124;
                      }
                    }
                  }
                  L125: {
                    if (!nq.field_h.a(false)) {
                      break L125;
                    } else {
                      if (!this.h((byte) -99)) {
                        break L121;
                      } else {
                        break L125;
                      }
                    }
                  }
                  L126: {
                    L127: {
                      var4 = nq.field_h.a(-121);
                      var4.GA(0);
                      ph.field_b.a(123, var4, false);
                      if ((rc.field_k ^ -1) == (nj.field_b ^ -1)) {
                        break L127;
                      } else {
                        L128: {
                          var5_int = eh.field_a * 255 / 30;
                          if ((nj.field_b ^ -1) != 0) {
                            iv.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                            break L128;
                          } else {
                            break L128;
                          }
                        }
                        L129: {
                          if (rc.field_k != -1) {
                            iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                            break L129;
                          } else {
                            break L129;
                          }
                        }
                        if (var11 == 0) {
                          break L126;
                        } else {
                          break L127;
                        }
                      }
                    }
                    if (0 == (nj.field_b ^ -1)) {
                      break L126;
                    } else {
                      iv.field_g[nj.field_b].a(255, var4, -2355);
                      break L126;
                    }
                  }
                  L130: {
                    if (!so.a((byte) 118)) {
                      break L130;
                    } else {
                      lk.a(0, 0, lk.field_b, lk.field_c);
                      pn.d((byte) -7);
                      break L130;
                    }
                  }
                  L131: {
                    if ((ra.field_e ^ -1) != -1) {
                      var5_int = eh.field_a * 256 / 30;
                      if (-1 > (var5_int ^ -1)) {
                        lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                        break L131;
                      } else {
                        break L131;
                      }
                    } else {
                      break L131;
                    }
                  }
                  L132: {
                    if (!sj.a(-126)) {
                      break L132;
                    } else {
                      if (so.a((byte) 110)) {
                        break L132;
                      } else {
                        L133: {
                          if (gk.field_o != null) {
                            stackOut_172_0 = 1;
                            stackIn_173_0 = stackOut_172_0;
                            break L133;
                          } else {
                            stackOut_171_0 = ii.field_a;
                            stackIn_173_0 = stackOut_171_0 ? 1 : 0;
                            break L133;
                          }
                        }
                        kn.a(stackIn_173_0 != 0, 64);
                        break L132;
                      }
                    }
                  }
                  L134: {
                    if (2 > ku.field_j) {
                      break L134;
                    } else {
                      if (gw.field_v) {
                        bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -98, 1);
                        break L134;
                      } else {
                        break L134;
                      }
                    }
                  }
                  L135: {
                    var5 = (ge) (Object) pl.field_v.b(-100);
                    if (var5 == null) {
                      break L135;
                    } else {
                      L136: {
                        L137: {
                          var7 = qn.field_g;
                          if (64 > var7) {
                            break L137;
                          } else {
                            L138: {
                              if (192 < var7) {
                                break L138;
                              } else {
                                var6_int = 255;
                                if (var11 == 0) {
                                  break L136;
                                } else {
                                  break L138;
                                }
                              }
                            }
                            var6_int = (48960 - 255 * var7) / 64;
                            if (var11 == 0) {
                              break L136;
                            } else {
                              break L137;
                            }
                          }
                        }
                        var6_int = var7 * 255 / 64;
                        break L136;
                      }
                      L139: {
                        L140: {
                          var8 = 45;
                          if ((var5.field_m ^ -1) > -1) {
                            break L140;
                          } else {
                            var9_ref_String = rb.field_d[var5.field_m];
                            if ((var5.field_m ^ -1) <= (qw.field_a.length ^ -1)) {
                              break L139;
                            } else {
                              var8 += 65;
                              qw.field_a[var5.field_m].a(-180 + rj.field_c + 85 - 32, 45, 64, 64, 0, var6_int << -1273320232 | 16777215, 1);
                              if (var11 == 0) {
                                break L139;
                              } else {
                                break L140;
                              }
                            }
                          }
                        }
                        var9_ref = aa.field_b;
                        break L139;
                      }
                      int discarded$31 = bq.field_c.a(150, var6_int << 1534841976, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, -1 + var8, var6_int << -354884008, 0, 18, -8787, var9_ref, (aa) null, 1, 0);
                      int discarded$32 = bq.field_c.a(150, var6_int << 898716536, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, 1 + var8, var6_int << 648239480, 0, 18, -8787, var9_ref, (aa) null, 1, 0);
                      int discarded$33 = bq.field_c.a(150, var6_int << 644256760 | 16777215, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref, (aa) null, 1, 0);
                      break L135;
                    }
                  }
                  L141: {
                    if (param1) {
                      stackOut_194_0 = 0;
                      stackIn_195_0 = stackOut_194_0;
                      break L141;
                    } else {
                      stackOut_193_0 = 1;
                      stackIn_195_0 = stackOut_193_0;
                      break L141;
                    }
                  }
                  L142: {
                    L143: {
                      if (oj.a(stackIn_195_0 == 0)) {
                        break L143;
                      } else {
                        var6_int = 0 * (-lk.field_b + gi.field_h) / 2;
                        var7 = 0 * (-lk.field_c + wq.field_b) / 2;
                        cf.a(var6_int, var7, 126);
                        kn.a(false, (byte) -122);
                        ((Sumoblitz) this).field_F = true;
                        if (var11 == 0) {
                          break L142;
                        } else {
                          break L143;
                        }
                      }
                    }
                    L144: {
                      if (sj.a(-124)) {
                        break L144;
                      } else {
                        if (ws.b((byte) 52)) {
                          break L142;
                        } else {
                          ((Sumoblitz) this).field_F = false;
                          if (var11 == 0) {
                            break L142;
                          } else {
                            break L144;
                          }
                        }
                      }
                    }
                    var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                    var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                    ls.a(var6_int, -66, var7);
                    kn.a(false, -124);
                    ((Sumoblitz) this).field_F = true;
                    break L142;
                  }
                  L145: {
                    if (!((Sumoblitz) this).field_F) {
                      break L145;
                    } else {
                      L146: {
                        var6_int = lk.field_b;
                        var7 = lk.field_c;
                        if (null == ((Sumoblitz) this).field_K) {
                          break L146;
                        } else {
                          var6_int = ((Sumoblitz) this).field_K.field_x;
                          var7 = ((Sumoblitz) this).field_K.field_u;
                          break L146;
                        }
                      }
                      L147: {
                        var8 = (-var6_int + gi.field_h) / 2;
                        var9 = (-var7 + wq.field_b) / 2;
                        if (!oj.a(false)) {
                          break L147;
                        } else {
                          if (null != ((Sumoblitz) this).field_K) {
                            var8 = ik.c(-10517);
                            var9 = fd.b(3878);
                            break L147;
                          } else {
                            break L147;
                          }
                        }
                      }
                      var10 = wq.a(var4, (byte) 70);
                      var10.a((byte) -88, var9, var7 + var9, var8, var6_int + var8);
                      var9 = (-lk.field_c + wq.field_b) / 2;
                      var8 = (-lk.field_b + gi.field_h) / 2;
                      var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                      var10.a(29709);
                      break L145;
                    }
                  }
                  var4.a(true);
                  break L121;
                }
                dw.a(er.field_c, 105);
                er.field_c = null;
                ls.b(0);
                return false;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_43_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        Sumoblitz.s(0);
                        kc.b((byte) -19);
                        ge.a(6334);
                        jn.c((byte) 117);
                        ha.e(0);
                        fs.c(-22);
                        wq.a(false);
                        oi.a(param0);
                        ik.b(-1);
                        hw.a(5460);
                        ud.c(-127);
                        rn.a(13921);
                        ma.a(20283);
                        bi.a((byte) 84);
                        hb.a(-2851);
                        wv.a(true);
                        fn.k(119);
                        su.b((byte) -18);
                        cc.a(126);
                        os.a(8);
                        ns.a((byte) -75);
                        lk.a();
                        ki.a((byte) 35);
                        wf.a(116);
                        ws.a((byte) -71);
                        hk.a(0);
                        gs.a((byte) 14);
                        kt.a((byte) -14);
                        kd.a((byte) 95);
                        uq.a((byte) -106);
                        br.a(23050);
                        lb.a(0);
                        uc.a(-1);
                        vs.a((byte) -68);
                        uw.c((byte) 96);
                        ov.a((byte) 41);
                        mn.a((byte) 17);
                        cq.a(true);
                        og.a(false);
                        ak.a(-6);
                        qu.a((byte) 42);
                        kv.a((byte) 30);
                        vm.a((byte) 118);
                        if (param0) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = 1;
                        stackIn_4_0 = stackOut_1_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 46;
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
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        gd.a(stackIn_4_0 != 0);
                        ti.a(87);
                        rj.a(2);
                        dt.d(68);
                        ms.b((byte) 80);
                        ta.a(false);
                        bs.f(-95);
                        te.b(6406);
                        uu.a((byte) 115);
                        sh.g();
                        rh.a((byte) 81);
                        du.h();
                        dn.a(-3);
                        kp.a(-1);
                        sg.a(-95);
                        jg.a((byte) 98);
                        rb.a((byte) -45);
                        hc.a((byte) 127);
                        bk.a(4);
                        nj.a((byte) 115);
                        if (param0) {
                            statePc = 7;
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
                        stackOut_5_0 = 1;
                        stackIn_8_0 = stackOut_5_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ig.a(stackIn_8_0 != 0);
                        vp.a((byte) -111);
                        vd.a((byte) -89);
                        dg.g(128);
                        uk.g(false);
                        m.e(true);
                        dc.m(105);
                        gt.l(124);
                        js.g(0);
                        cv.g(-118);
                        vq.g(121);
                        lj.a((byte) 108);
                        cp.a((byte) 117);
                        pc.a(100);
                        bc.a(113);
                        ah.c(0);
                        vl.a((byte) 113);
                        nm.c(1432625512);
                        lg.b(544);
                        tr.c(1);
                        jp.c(32);
                        bb.b((byte) 41);
                        ii.a((byte) -55);
                        ps.a(28);
                        er.b(true);
                        nt.d(31295);
                        qo.a(false);
                        kh.a(2);
                        dr.c(false);
                        fe.n((byte) -68);
                        tl.f(91);
                        bw.c((byte) 122);
                        cb.a(-1384583532);
                        lq.a(param0);
                        rf.a(1);
                        za.a((byte) -103);
                        pl.j(24599);
                        pi.a(20437);
                        ds.a((byte) -1);
                        qn.a(0);
                        ss.a((byte) 102);
                        vn.a();
                        hm.a(-11418);
                        rv.a(true);
                        qi.a((byte) 16);
                        se.b(8192);
                        if (param0) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = 1;
                        stackIn_12_0 = stackOut_9_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        aa.a(stackIn_12_0 != 0);
                        sb.a(true);
                        mu.a(-109);
                        pj.d(37);
                        ee.a(1600);
                        sr.c(100);
                        wo.a(92);
                        wn.a(0);
                        kw.a((byte) -88);
                        ea.b(-123);
                        sj.a(true);
                        jo.a((byte) -115);
                        lw.a(-1685);
                        no.a(10);
                        vg.a(false);
                        fl.b(0);
                        rg.e((byte) 95);
                        ag.c(82);
                        cd.a((byte) -126);
                        hf.j(101);
                        ld.a((byte) 58);
                        wp.a((byte) 54);
                        nd.f(-16099);
                        sp.d(true);
                        ao.a(0);
                        ok.b((byte) -122);
                        pp.a(2);
                        t.f(1);
                        ro.c(0);
                        fv.d((byte) 62);
                        wl.a((byte) -90);
                        ql.d((byte) 64);
                        am.d((byte) -96);
                        rw.c(true);
                        fa.a(false);
                        nk.c();
                        q.a();
                        eh.a(-66);
                        l.a(-104);
                        gk.a(0);
                        im.a(true);
                        gh.a(-126);
                        kr.a(-119);
                        up.a(-127);
                        jk.a((byte) -104);
                        dq.a(-1);
                        ci.b(8192);
                        bf.b(18260);
                        nn.a(-100);
                        w.a();
                        ku.a(true);
                        rd.c(false);
                        pb.b(3);
                        ih.a((byte) 122);
                        lo.a();
                        oq.g(-6811);
                        qw.a(-122);
                        is.a(false);
                        sd.a(1);
                        un.a(true);
                        ow.a((byte) 123);
                        sv.a(1284);
                        g.a(85);
                        hh.a(127);
                        fd.c(121);
                        fh.d(-48);
                        qg.a();
                        qe.a(0);
                        np.a((byte) -58);
                        tj.a((byte) 125);
                        td.a((byte) 111);
                        mq.a((byte) 110);
                        o.b(6);
                        wm.a(param0);
                        rt.g(-107);
                        qq.l(-15648);
                        dh.j(82);
                        ur.k(0);
                        pq.a(-1346554936);
                        pe.g(-18490);
                        ar.f((byte) -118);
                        vr.a(-21433);
                        bn.g((byte) -79);
                        wr.a(454);
                        na.a(false);
                        ll.b(-109);
                        th.f(false);
                        vb.a(0);
                        if (param0) {
                            statePc = 15;
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
                        stackOut_13_0 = 1;
                        stackIn_16_0 = stackOut_13_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        fu.d(stackIn_16_0 != 0);
                        if (param0) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = 1;
                        stackIn_20_0 = stackOut_17_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        mb.a(stackIn_20_0 != 0);
                        ce.a(-73);
                        hi.a(5423);
                        rp.b(param0);
                        eu.a(false);
                        fr.d((byte) 66);
                        kk.b((byte) -24);
                        iv.a(255);
                        eb.b((byte) 0);
                        gq.c(false);
                        ic.b(106);
                        b.a((byte) -69);
                        cm.b(0);
                        dl.b(0);
                        ht.a((byte) -81);
                        us.c((byte) 28);
                        bt.c((byte) -21);
                        hp.d(1);
                        aw.G(8);
                        ls.a(2);
                        io.a(0);
                        sk.b(128);
                        ut.b((byte) 49);
                        hv.b(-7520);
                        ko.d(0);
                        tf.a((byte) 17);
                        mr.a((byte) -109);
                        rq.c(-119);
                        em.a(true);
                        il.a(26238);
                        jl.c(786336);
                        hq.a((byte) 101);
                        gu.a(true);
                        mi.a(false);
                        mp.a((byte) -100);
                        hu.b(61303);
                        ck.a(-99);
                        sc.a(false);
                        rs.a(-26791);
                        jd.d(0);
                        jh.g(-1);
                        st.a((byte) 118);
                        mc.f(param0);
                        qk.g((byte) -43);
                        kq.k(50);
                        if (param0) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = 1;
                        stackIn_24_0 = stackOut_21_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        we.e(stackIn_24_0 != 0);
                        si.b(17);
                        ts.a(-13252);
                        hl.a(-103);
                        jt.d((byte) 54);
                        av.f(24);
                        nw.b(1183);
                        re.a();
                        k.a(28322);
                        kn.b(-1);
                        le.a();
                        li.d(119);
                        ka.a((byte) -59);
                        r.a(33);
                        sn.a((byte) -62);
                        ek.d(-21551);
                        ve.a((byte) -58);
                        bq.a((byte) -76);
                        ch.a((byte) 60);
                        lf.a(1821625704);
                        kf.e(-21057);
                        ad.d(-20388);
                        if (param0) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = 1;
                        stackIn_28_0 = stackOut_25_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = 0;
                        stackIn_28_0 = stackOut_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        f.d(stackIn_28_0 != 0);
                        wh.a(-1);
                        uj.a(true);
                        jq.a(107);
                        tq.a((byte) -51);
                        pt.a((byte) 43);
                        hn.b(true);
                        kb.a(true);
                        sl.b(-124);
                        wt.c((byte) -38);
                        es.c(4);
                        tt.c(true);
                        mo.e(2);
                        vk.b(429166529);
                        gi.c(8192);
                        pr.d(7064);
                        au.c((byte) -127);
                        ga.a(true);
                        lv.c(3);
                        gr.c((byte) -19);
                        mk.a(-25140);
                        ei.a(-124);
                        ji.a(0);
                        he.a(124);
                        jm.a(-23787);
                        vu.a((byte) -69);
                        pu.a(1);
                        ng.d(0);
                        ib.e(1);
                        uo.d((byte) 79);
                        ni.d(false);
                        ml.c((byte) 30);
                        en.b((byte) 101);
                        ff.b(param0);
                        ab.a(64);
                        sq.a(-127);
                        rc.b(124);
                        go.a((byte) -17);
                        pn.d(12);
                        wj.d((byte) 79);
                        if (param0) {
                            statePc = 31;
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
                        stackOut_29_0 = 1;
                        stackIn_32_0 = stackOut_29_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackOut_31_0 = 0;
                        stackIn_32_0 = stackOut_31_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        ej.d(stackIn_32_0 != 0);
                        oh.a((byte) -60);
                        ua.a((byte) 13);
                        ju.a(param0);
                        fq.a(123);
                        ia.a(1);
                        vv.a(-95);
                        if (param0) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = 1;
                        stackIn_36_0 = stackOut_33_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = 0;
                        stackIn_36_0 = stackOut_35_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        lu.b(stackIn_36_0 != 0);
                        ph.a(1882049616);
                        qj.a((byte) -70);
                        fw.c(-114);
                        bl.a(false);
                        of.a(-26437);
                        if (param0) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackOut_37_0 = 1;
                        stackIn_40_0 = stackOut_37_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackOut_39_0 = 0;
                        stackIn_40_0 = stackOut_39_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        id.c(stackIn_40_0 != 0);
                        df.a(false);
                        dj.a(1022768328);
                        pd.a((byte) -127);
                        ue.b(126);
                        bv.b(118);
                        nl.b(2147483647);
                        c.c(22760);
                        oj.a(-4);
                        in.a((byte) -84);
                        uv.a((byte) -31);
                        cn.e(0);
                        km.a(-11807);
                        gn.a(true);
                        to.c(false);
                        if (param0) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackOut_41_0 = 1;
                        stackIn_44_0 = stackOut_41_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackOut_43_0 = 0;
                        stackIn_44_0 = stackOut_43_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        eg.c(stackIn_44_0 != 0);
                        hg.a((byte) 12);
                        lh.a(12);
                        cj.a(0);
                        mm.a(90);
                        an.a((byte) 89);
                        bj.a(-121);
                        qr.a((byte) 119);
                        om.a((byte) 99);
                        aj.e(2);
                        gw.c(false);
                        eq.e(3190);
                        be.e(6408);
                        gb.e(0);
                        vi.c(true);
                        as.e(83);
                        cl.f(4);
                        qc.b((byte) 105);
                        jj.a(0);
                        wd.b((byte) 88);
                        vf.b(1);
                        rl.a(480);
                        sm.a((byte) -30);
                        tk.b(122);
                        fm.a((byte) -115);
                        tm.a(false);
                        dv.a(59);
                        ac.d(false);
                        hd.f(67);
                        qv.c(18);
                        lt.a(1);
                        ou.c((byte) -119);
                        tc.f(-1);
                        wk.b(false);
                        jc.c((byte) -91);
                        nq.c((byte) -31);
                        jf.a((byte) 91);
                        s.a(18232);
                        gf.a(1431655765);
                        ct.d((byte) -75);
                        ks.d(-11701);
                        lr.c(16766976);
                        lm.b(6);
                        dk.a(-102);
                        ip.d((byte) 110);
                        ke.b(true);
                        gg.a(0);
                        ((Sumoblitz) this).field_D = null;
                        ((Sumoblitz) this).field_K = null;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw qo.a((Throwable) (Object) var2, "Sumoblitz.E(" + param0 + 41);
                }
                case 47: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public Sumoblitz() {
        ((Sumoblitz) this).field_F = false;
        ((Sumoblitz) this).field_K = null;
    }

    public final void init() {
        try {
            ((Sumoblitz) this).a(13, "sumoblitz", 480);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "Sumoblitz.init()");
        }
    }

    final static void a(int param0, int param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((param0 ^ -1) != -1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (param2 <= -67) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        var3_int = 0;
                        var4 = param1;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var4 == 1) {
                            statePc = 33;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (2 != var4) {
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
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var5 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (3 != var4) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var5 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
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
                        if (var4 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (4 == var4) {
                            statePc = 35;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (6 == var4) {
                            statePc = 36;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var4 == 5) {
                            statePc = 36;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var3_int = fi.a(5, he.field_o, (byte) -96);
                        dj discarded$4 = fe.a(-113, rc.field_l[22 + var3_int]);
                        if (var5 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var3_int = fi.a(lg.field_d[param0][1].length, he.field_o, (byte) -96);
                        dj discarded$5 = fe.a(89, lg.field_d[param0][1][var3_int]);
                        if (var5 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var3_int = fi.a(lg.field_d[param0][2].length, he.field_o, (byte) -96);
                        dj discarded$6 = fe.a(-121, lg.field_d[param0][2][var3_int]);
                        if (var5 == 0) {
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
                        var3_int = fi.a(lg.field_d[param0][0].length, he.field_o, (byte) -96);
                        dj discarded$7 = fe.a(42, lg.field_d[param0][0][var3_int]);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 38: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw qo.a((Throwable) (Object) var3, "Sumoblitz.OA(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                case 39: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new int[16384];
        field_H = 0;
        field_I = 49;
    }
}
