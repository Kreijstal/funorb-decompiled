/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.awt.Canvas;

public final class SolKnight extends ab {
    static fg field_D;
    private static da field_I;
    static volatile int field_G;
    static int[] field_K;
    static int[] field_E;
    public static boolean field_L;

    final void f(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        s.n(0);
                        if (null == dj.field_k) {
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
                        qk.d(param0 ^ -14996);
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
                        if (param0 == -1) {
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
                        int discarded$3 = this.b(-29, true);
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
                        pk.c(false);
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
                    throw fc.a((Throwable) (Object) var2, "SolKnight.M(" + param0 + 41);
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void m(int param0) {
        RuntimeException var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (null != wc.field_b) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ue.a(wc.field_b, 0);
                        wc.field_b = null;
                        mh.a(param0 + 8191);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        fh.field_c = r.a(param0, 89);
                        wg.field_g = r.a(2, 74);
                        qk.field_h = r.a(3, 125);
                        ic.field_u = r.a(4, 109);
                        qb.field_cb = r.a(5, 90);
                        field_I = r.a(7, 124);
                        nf.a(ai.field_b, -111, pl.field_d);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw fc.a((Throwable) (Object) var2, "SolKnight.Q(" + param0 + 41);
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void e(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        bl var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        jg stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_89_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_119_0 = 0;
        mf stackIn_127_0 = null;
        int stackIn_139_0 = 0;
        jg stackOut_2_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_86_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_118_0 = 0;
        mf stackOut_126_0 = null;
        int stackOut_138_0 = 0;
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
                        ja.b(200);
                        if (dj.field_k == null) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = dj.field_k;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 167;
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
                        qk.d(14995);
                        vg.a((byte) 80);
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
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = this;
                        stackOut_9_1 = -3;
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (null == dj.field_k) {
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
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = 1;
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_13_1 = stackOut_10_1;
                        stackIn_13_2 = stackOut_10_2;
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
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = this;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((SolKnight) this).a(stackIn_13_1, stackIn_13_2 != 0);
                        if (pd.field_c) {
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
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.m(1);
                        pd.field_c = false;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (bl.a((byte) -81)) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 32;
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
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ((SolKnight) this).c(true);
                        if (bl.a((byte) -81)) {
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
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (!bb.h(119)) {
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
                        int discarded$1 = this.b(0, false);
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
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return;
                }
                case 28: {
                    try {
                        if (!il.b(507)) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        qa.field_q = kb.a(4, (byte) 106);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (na.field_b) {
                            statePc = 43;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        ta.a((byte) 61, cl.field_n);
                        var2_int = this.b(0, true);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((pb.field_c ^ -1) == (var2_int ^ -1)) {
                            statePc = 38;
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
                        mh.a(8192);
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
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((var2_int ^ -1) != (ng.field_d ^ -1)) {
                            statePc = 42;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        na.field_b = true;
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
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var4 == 0) {
                            statePc = 125;
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
                        if (null != qa.field_q) {
                            statePc = 112;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (!sg.b((byte) -104)) {
                            statePc = 77;
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
                        if (je.field_d != 0) {
                            statePc = 70;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var2_int = ad.c(119);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var2_int == 2) {
                            statePc = 66;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if ((var2_int ^ -1) == -4) {
                            statePc = 63;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if ((var2_int ^ -1) != -5) {
                            statePc = 69;
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
                        bb.a((byte) -14, -2, 0);
                        if (var4 == 0) {
                            statePc = 69;
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
                        ta.a(false, 320, w.field_b, 2, ug.field_g.field_s + ug.field_g.field_F, (mg) (Object) ug.field_g, 8, ad.field_b.field_s + ad.field_b.field_F, ad.field_b.field_F, w.field_b, 8, 240, (mg) (Object) ad.field_b, ug.field_g.field_F, true);
                        if (var4 == 0) {
                            statePc = 69;
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
                        qk.d(14995);
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var4 == 0) {
                            statePc = 73;
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
                        this.h((byte) -108);
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (!sg.b((byte) -106)) {
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
                        statePc = 125;
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
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        vd.field_d[kd.field_a].b(true, 3367);
                        if (var4 == 0) {
                            statePc = 125;
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
                        if (gg.b((byte) 89)) {
                            statePc = 83;
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
                        this.h((byte) -108);
                        if (var4 == 0) {
                            statePc = 125;
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
                        if (dj.field_k == null) {
                            statePc = 88;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackOut_86_0 = 1;
                        stackIn_89_0 = stackOut_86_0;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        stackOut_88_0 = 0;
                        stackIn_89_0 = stackOut_88_0;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var2_int = rk.a(stackIn_89_0 != 0, (byte) 20, (ab) this);
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (-2364825 != (var2_int ^ -1)) {
                            statePc = 94;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        ig.h(-109);
                        if (var4 == 0) {
                            statePc = 111;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (1 == var2_int) {
                            statePc = 101;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        stackOut_97_0 = 2;
                        stackIn_98_0 = stackOut_97_0;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (stackIn_98_0 != var2_int) {
                            statePc = 111;
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
                        if (dj.field_k == null) {
                            statePc = 107;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        qk.d(14995);
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (2 != var2_int) {
                            statePc = 111;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        he.a(-1, ia.g(-35));
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (var4 == 0) {
                            statePc = 125;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (!qa.field_q.field_k) {
                            statePc = 125;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        jl.field_d = jl.field_d & (qa.field_q.field_m ^ -1);
                        ah.field_f = ah.field_f | qa.field_q.field_m;
                        qa.field_q = null;
                        jg.a((byte) 81);
                        h.a((byte) 92);
                        if (7 != kd.field_a) {
                            statePc = 125;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        stackOut_118_0 = -1;
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
                        if (stackIn_119_0 == (jl.field_d ^ -1)) {
                            statePc = 124;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 123;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        kd.field_a = 2;
                        gb.a(false, 2, -127);
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (!na.field_b) {
                            statePc = 133;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        stackOut_126_0 = ua.field_I;
                        stackIn_127_0 = stackOut_126_0;
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if (((mf) (Object) stackIn_127_0).d(144)) {
                            statePc = 133;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        pk.a((byte) -96, 0, true);
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (!il.b(507)) {
                            statePc = 136;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        var2_ref = (bl) (Object) w.field_a.a(0);
                        if (null != var2_ref) {
                            statePc = 142;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if (var4 != 0) {
                            statePc = 145;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        stackOut_138_0 = var4;
                        stackIn_139_0 = stackOut_138_0;
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        if (stackIn_139_0 == 0) {
                            statePc = 146;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        sj.a(4, var2_ref, -7471);
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        if (var4 == 0) {
                            statePc = 136;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        if (!lf.a(ef.field_b, 122)) {
                            statePc = 151;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        ((SolKnight) this).d(true);
                        if (var4 != 0) {
                            statePc = 152;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if (var4 == 0) {
                            statePc = 146;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 150;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        qf.a(0, 0);
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        var2_int = 0;
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        if (qc.a(34)) {
                            statePc = 156;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 155;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 155;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        var3 = ((SolKnight) this).g(0);
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        if (-3 == (var3 ^ -1)) {
                            statePc = 160;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        var2_int = 1;
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        if (var2_int == 0) {
                            statePc = 165;
                        } else {
                            statePc = 162;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 164;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        aa.a(ad.field_b.field_F, (byte) -93, (mg) (Object) ad.field_b, ug.field_g.field_F - -ug.field_g.field_s, 8, w.field_b, 320, 8, ad.field_b.field_F + ad.field_b.field_s, (mg) (Object) ug.field_g, w.field_b, ug.field_g.field_F, 2, 240);
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 164;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        statePc = 165;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        var3 = 55 % ((51 - param0) / 39);
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 167;
                        continue stateLoop;
                    }
                }
                case 167: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw fc.a((Throwable) (Object) var2, "SolKnight.K(" + param0 + 41);
                }
                case 168: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SolKnight.n(2325);
          hc.a(25850);
          ak.b(3327);
          qh.b(1);
          pl.a(-5045);
          eb.a((byte) 113);
          rg.a((byte) -40);
          ab.e((byte) -99);
          ve.a((byte) 125);
          dh.d((byte) -41);
          na.a(-13357);
          lf.b(18609);
          mi.c();
          da.b(-127);
          mg.a();
          bk.a((byte) 84);
          vc.a(true);
          gb.f(-11);
          je.a((byte) 64);
          cj.b(-26497);
          ah.a(true);
          mh.b(92);
          dd.b(true);
          kh.a(true);
          b.a(-11709);
          hf.b(0);
          k.a(-23354);
          uc.a(99);
          wc.a(false);
          rj.b(0);
          pd.a(0);
          gl.c((byte) 95);
          me.a((byte) 56);
          ie.a((byte) 101);
          ek.a(117);
          nc.d((byte) -128);
          va.b((byte) 0);
          ae.b(3);
          ne.b(30731);
          hb.b(true);
          ad.a((byte) 84);
          gj.e();
          mf.g(103);
          se.b(false);
          gg.b(12516);
          qd.a(4);
          hg.a(8192);
          oi.c();
          lh.d(-94);
          rd.a(127);
          sf.a((byte) 123);
          ma.c(true);
          w.a((byte) 53);
          d.a(-121);
          vd.a((byte) 57);
          kk.a(-1);
          ja.a((byte) -43);
          ha.a(0);
          kg.a(false);
          wd.a(8355711);
          pg.b((byte) 127);
          he.a(false);
          jc.a(1731);
          i.a((byte) 30);
          jk.n(6);
          lb.m(121);
          s.m(-1);
          ci.g((byte) -107);
          rf.e(false);
          ig.e((byte) -102);
          bb.a((byte) 97);
          ga.h(60);
          mb.b(-694484242);
          aj.a((byte) -63);
          sl.b();
          tc.a();
          fe.a();
          u.b(2);
          ch.a(-114);
          id.a((byte) 109);
          db.c(false);
          ec.d(-1);
          ph.a(-20542);
          ub.a(37);
          lk.a(true);
          ac.a(-15180);
          ed.a(4);
          wa.a(-2);
          wb.a(-55);
          la.a((byte) 74);
          r.c(-122);
          ti.a(103);
          sb.a((byte) -90);
          ea.d(false);
          hl.a((byte) -113);
          ic.i(-74);
          bi.a((byte) 102);
          md.i(80);
          lg.b((byte) 0);
          sg.c(119);
          qj.a(-126);
          sk.h(-106);
          pf.a((byte) -104);
          nf.n(-1);
          af.c(0);
          hk.c();
          ai.a(-78);
          cf.a((byte) -87);
          uh.a(-18662);
          vh.a(false);
          eh.a((byte) 58);
          ji.a((byte) -102);
          cg.a(-24856);
          kd.a((byte) -95);
          l.a(95);
          jj.f(0);
          jh.c(-86);
          wk.a(-127);
          og.a(65);
          qg.a(false);
          var2_int = -89 / ((-28 - param0) / 59);
          rk.a((byte) 94);
          gi.a();
          hj.b((byte) -37);
          di.a(7);
          fl.a((byte) -108);
          bj.a(50);
          td.a(false);
          ql.e(1);
          sj.a(1);
          jf.a(-25616);
          rc.e(-24922);
          pj.h(85);
          si.i(126);
          ld.k(73);
          kf.i(112);
          ki.d(false);
          gd.a(103);
          mj.a((byte) 11);
          ba.f(71);
          cd.a(8192);
          oc.a(255);
          v.a((byte) -97);
          h.a(-94);
          ta.b((byte) 14);
          fh.a((byte) 58);
          ug.b(100);
          cb.a(-107);
          dk.e(-108);
          oa.b(768);
          uj.a(1);
          ee.a(-120);
          fi.a(-18120);
          fc.a((byte) 124);
          g.a(-6960);
          ke.d((byte) -61);
          qb.f((byte) -80);
          vg.i(106);
          gf.f((byte) 87);
          c.d((byte) 113);
          ua.e((byte) -88);
          kj.a(2);
          kc.a((byte) 110);
          pk.j(-124);
          tg.a(22722);
          a.g(30514);
          nb.a(19161);
          qe.i(-28528);
          be.a(-3);
          hh.a((byte) 54);
          tj.a();
          fb.a(true);
          vk.c(-14275);
          f.b(0);
          of.a(1);
          bc.c(false);
          th.j(114);
          ff.a(255);
          ii.a(7903);
          ik.b((byte) -61);
          pe.f(99);
          tk.i(123);
          qk.c(-25904);
          ok.a(-15739);
          n.a(5);
          jl.a(0);
          sd.a((byte) -114);
          qc.b(false);
          fa.a(true);
          ud.a(5010);
          m.a(0);
          gh.d(-1);
          ri.a(false);
          uf.e(22645);
          bg.f(-24631);
          pb.a(83);
          te.a((byte) 45);
          dj.a(-77);
          rh.b(0);
          ib.a(0);
          bl.a(0);
          ef.a(11051);
          wg.a(true);
          ce.b(true);
          kb.a((byte) 15);
          sa.a((byte) -116);
          lj.a((byte) -127);
          fg.a((byte) -115);
          il.c(2113536);
          vb.d(20364);
          jb.b(22174);
          ng.a(0);
          fj.a(-13);
          lc.a(-53);
          wi.a(-26923);
          ob.b(false);
          bf.a((byte) 119);
          le.a(-3390);
          uk.j(8191);
          dc.e((byte) 82);
          qa.a(true);
          cl.e((byte) -123);
          el.h(732);
          wh.a(25817);
          li.a(26333);
          qf.a(10351);
          wf.f(350);
          pc.a((byte) -121);
          ((SolKnight) this).field_x = null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var2 = decompiledCaughtException;
        throw fc.a((Throwable) (Object) var2, "SolKnight.G(" + param0 + 41);
    }

    public final void init() {
        try {
            ((SolKnight) this).a("solknight", 11, 8);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "SolKnight.init()");
        }
    }

    private final int b(int param0, boolean param1) {
        o var6_ref = null;
        int var3_int = 0;
        o var3 = null;
        o[] var4 = null;
        o var4_ref = null;
        int var5_int = 0;
        o var5 = null;
        int var6 = 0;
        o var6_ref_o = null;
        o var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        o var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        o var15 = null;
        int var16 = 0;
        Object stackIn_41_0 = null;
        Object stackIn_48_0 = null;
        o stackIn_57_0 = null;
        o stackIn_59_0 = null;
        o stackOut_56_0 = null;
        o stackOut_58_0 = null;
        Object stackOut_40_0 = null;
        Object stackOut_47_0 = null;
        var6_ref = null;
        var16 = field_L ? 1 : 0;
        kb.b((byte) -128);
        if (null != wg.field_g) {
          L0: {
            if (!pl.field_d.c((byte) -121)) {
              break L0;
            } else {
              if (pl.field_d.a(2, "basic")) {
                L1: {
                  if (!wg.field_g.c((byte) -121)) {
                    break L1;
                  } else {
                    if (wg.field_g.b(true)) {
                      L2: {
                        if (!qk.field_h.c((byte) -121)) {
                          break L2;
                        } else {
                          if (!qk.field_h.b(true)) {
                            break L2;
                          } else {
                            L3: {
                              if (!ic.field_u.c((byte) -121)) {
                                break L3;
                              } else {
                                if (ic.field_u.b(true)) {
                                  L4: {
                                    if (!qb.field_cb.c((byte) -121)) {
                                      break L4;
                                    } else {
                                      if (qb.field_cb.b(true)) {
                                        L5: {
                                          if (!fh.field_c.c((byte) -121)) {
                                            break L5;
                                          } else {
                                            if (fh.field_c.b(true)) {
                                              L6: {
                                                if (!field_I.c((byte) -121)) {
                                                  break L6;
                                                } else {
                                                  if (field_I.b(true)) {
                                                    a.a((byte) 102, ug.field_e, 65.0f);
                                                    ((SolKnight) this).a(-11633);
                                                    if (!param1) {
                                                      return pb.field_c;
                                                    } else {
                                                      jg.a((byte) 81);
                                                      qc.field_s = new me(wg.field_g, qk.field_h);
                                                      bf.field_b[0] = sl.a(qk.field_h, "", "combo_power").c();
                                                      bf.field_b[1] = sl.a(qk.field_h, "", "mega_power").c();
                                                      bf.field_b[2] = ra.a(wg.field_g, "", "load_weapon").b();
                                                      bf.field_b[3] = ra.a(wg.field_g, "", "rocket_launcher").b();
                                                      bf.field_b[4] = ra.a(wg.field_g, "", "explosion").b();
                                                      bf.field_b[5] = ra.a(wg.field_g, "", "laser").b();
                                                      bf.field_b[6] = ra.a(wg.field_g, "", "asteroid_proximity").b();
                                                      bf.field_b[7] = ra.a(wg.field_g, "", "scatter_separates").b();
                                                      bf.field_b[8] = ra.a(wg.field_g, "", "homing_missile_launch").b();
                                                      bf.field_b[9] = ra.a(wg.field_g, "", "nuke_explode").b();
                                                      bf.field_b[10] = ra.a(wg.field_g, "", "nuke_load").b();
                                                      bf.field_b[11] = ra.a(wg.field_g, "", "railgun_fire_and_load").b();
                                                      bf.field_b[12] = ra.a(wg.field_g, "", "planet_explode").b();
                                                      bf.field_b[13] = ra.a(wg.field_g, "", "menu_mouseover").b();
                                                      bf.field_b[14] = ra.a(wg.field_g, "", "menu_select").b();
                                                      bf.field_b[15] = ra.a(wg.field_g, "", "scatter_launcher").b();
                                                      bf.field_b[16] = ra.a(wg.field_g, "", "laser_impact_burn").b();
                                                      bf.field_b[17] = ra.a(wg.field_g, "", "plasma_fire").b();
                                                      bf.field_b[18] = ra.a(wg.field_g, "", "plasma_charge").b();
                                                      bf.field_b[19] = ra.a(wg.field_g, "", "fusion_charge").b();
                                                      bf.field_b[20] = ra.a(wg.field_g, "", "fusion_fire").b();
                                                      bf.field_b[21] = ra.a(wg.field_g, "", "asteroid_tiny_rotate").b();
                                                      bf.field_b[22] = ra.a(wg.field_g, "", "asteroid_small_rotate").b();
                                                      bf.field_b[23] = ra.a(wg.field_g, "", "asteroid_medium_rotate").b();
                                                      bf.field_b[24] = ra.a(wg.field_g, "", "asteroid_large_rotate").b();
                                                      bf.field_b[25] = ra.a(wg.field_g, "", "asteroid_huge_rotate").b();
                                                      bf.field_b[26] = ra.a(wg.field_g, "", "explosion_huge").b();
                                                      bf.field_b[27] = ra.a(wg.field_g, "", "explosion_large").b();
                                                      bf.field_b[28] = ra.a(wg.field_g, "", "explosion_medium").b();
                                                      bf.field_b[29] = ra.a(wg.field_g, "", "explosion_small").b();
                                                      bf.field_b[30] = ra.a(wg.field_g, "", "explosion_tiny").b();
                                                      bf.field_b[31] = ra.a(wg.field_g, "", "railgun_impact").b();
                                                      bf.field_b[32] = ra.a(wg.field_g, "", "plasma_impact").b();
                                                      bf.field_b[33] = ra.a(wg.field_g, "", "plasma_impact_upgraded").b();
                                                      bf.field_b[34] = ra.a(wg.field_g, "", "nuke_explode_upgraded").b();
                                                      bf.field_b[35] = ra.a(wg.field_g, "", "sol_sword").b();
                                                      wg.field_g = null;
                                                      qk.field_h = null;
                                                      return fc.field_o;
                                                    }
                                                  } else {
                                                    break L6;
                                                  }
                                                }
                                              }
                                              a.a((byte) 102, ab.a(field_I, qb.field_bb, ri.field_d, "", false), 60.0f);
                                              return pb.field_c;
                                            } else {
                                              break L5;
                                            }
                                          }
                                        }
                                        a.a((byte) 102, ab.a(fh.field_c, vb.field_i, r.field_e, "", false), 50.0f);
                                        return pb.field_c;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                  a.a((byte) 102, ab.a(qb.field_cb, th.field_L, je.field_b, "", false), 40.0f);
                                  return pb.field_c;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            a.a((byte) 102, ok.a(0, -18884, je.field_b, ic.field_u, th.field_L), 30.0f);
                            return pb.field_c;
                          }
                        }
                      }
                      a.a((byte) 102, ab.a(qk.field_h, l.field_b, rd.field_a, "", false), 20.0f);
                      return pb.field_c;
                    } else {
                      break L1;
                    }
                  }
                }
                a.a((byte) 102, ab.a(wg.field_g, l.field_b, rd.field_a, "", false), 10.0f);
                return pb.field_c;
              } else {
                break L0;
              }
            }
          }
          a.a((byte) 102, ab.a(pl.field_d, vb.field_i, r.field_e, "basic", false), 3.0f);
          return pb.field_c;
        } else {
          if (qb.field_cb == null) {
            if (null == ic.field_u) {
              if (pl.field_d != null) {
                a.a((byte) 102, kj.field_N, 90.0f);
                ((SolKnight) this).a(-11633);
                jc.field_b = rb.a("unachieved", "basic", pl.field_d, (byte) -127);
                nb.field_a = rb.a("locked", "basic", pl.field_d, (byte) -117);
                u.field_c = rb.a("orbcoin", "basic", pl.field_d, (byte) -115);
                ef.a(124, jc.field_b);
                ef.a(115, nb.field_a);
                ef.a(123, u.field_c);
                pl.field_d = null;
                ai.field_b = null;
                return fc.field_o;
              } else {
                if (fh.field_c != null) {
                  ad.field_b = lc.a(fh.field_c, 1, "b24", "", field_I);
                  ug.field_g = lc.a(fh.field_c, 1, "b12", "", field_I);
                  td.field_e = ik.a(fh.field_c, -18362, "guns", "");
                  of.field_d = rb.a("husk", "", fh.field_c, (byte) -125);
                  uh.field_l = ik.a(fh.field_c, -18362, "stars", "");
                  wi.field_i = ik.a(fh.field_c, param0 + -18362, "asteroids", "");
                  hf.field_c = ik.a(fh.field_c, -18362, "ammo", "");
                  hj.field_n = rb.a("sword", "", fh.field_c, (byte) -124);
                  hj.field_p = eb.a(false, rb.a("shield_packed", "", fh.field_c, (byte) -127), 72);
                  qd.field_f = ik.a(fh.field_c, -18362, "overlays", "");
                  o discarded$1 = rb.a("space", "", fh.field_c, (byte) -128);
                  ii.field_g = ik.a(fh.field_c, -18362, "explosion", "");
                  ua.field_F = ik.a(fh.field_c, -18362, "nukeexplosion", "");
                  ak.field_e = new o[8];
                  ak.field_e[0] = rb.a("pluto", "", fh.field_c, (byte) -123);
                  ak.field_e[1] = rb.a("neptune", "", fh.field_c, (byte) -110);
                  ak.field_e[2] = rb.a("uranus", "", fh.field_c, (byte) -127);
                  ak.field_e[3] = rb.a("saturn", "", fh.field_c, (byte) -125);
                  ak.field_e[4] = rb.a("jupiter", "", fh.field_c, (byte) -117);
                  ak.field_e[5] = rb.a("asteroid", "", fh.field_c, (byte) -113);
                  ak.field_e[6] = rb.a("mars", "", fh.field_c, (byte) -111);
                  ak.field_e[7] = rb.a("earth", "", fh.field_c, (byte) -125);
                  v.a(param0 ^ -98, ai.field_c, rb.a("mbfg", "", fh.field_c, (byte) -121));
                  rg.a(ik.a(fh.field_c, -18362, "mbsshots", ""), -40);
                  ak.a(80, 0, ql.field_s, true, 16776960, ia.g(param0 + 113));
                  var3 = new o(152, 152);
                  var3.a();
                  ak.field_e[4].a(0, 0, 152, 152);
                  ai.a(10, (mg) (Object) ug.field_g, 31, 132, 132, 16776960, -122, 10, var3, 0, 5500);
                  dd.field_c = ik.a(fh.field_c, param0 ^ -18362, "uberframe", "");
                  this.a(dd.field_c, (byte) 31);
                  dd.field_c = null;
                  w.field_b = ik.a(fh.field_c, -18362, "buttonframe", "");
                  ii.field_f = ik.a(fh.field_c, -18362, "achievements", "");
                  var4 = ii.field_f;
                  var5_int = 0;
                  L7: while (true) {
                    L8: {
                      L9: {
                        if ((var4.length ^ -1) >= (var5_int ^ -1)) {
                          break L9;
                        } else {
                          stackOut_56_0 = var4[var5_int];
                          stackIn_59_0 = stackOut_56_0;
                          stackIn_57_0 = stackOut_56_0;
                          if (var16 != 0) {
                            break L8;
                          } else {
                            var6_ref = stackIn_57_0;
                            ef.a(param0 + 120, var6_ref);
                            var5_int++;
                            if (var16 == 0) {
                              continue L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      stackOut_58_0 = hj.field_p;
                      stackIn_59_0 = stackOut_58_0;
                      break L8;
                    }
                    var4_ref = stackIn_59_0;
                    var5 = hj.field_n;
                    var6 = 316 * var4_ref.field_q / var5.field_r;
                    h.field_b = new o(var6, 316);
                    var7 = new o(var6, 316);
                    var7.a();
                    var5.a(var6 + -(316 * var5.field_q / var5.field_r) >> -1022422175, 0, var5.field_q * 316 / var5.field_r, 316);
                    var4_ref.a(0, 3 * (316 + -(316 * var4_ref.field_r / var5.field_r)) / 5, var6, var4_ref.field_r * 316 / var5.field_r);
                    var8 = 40;
                    var9 = 191;
                    var10 = -8 + -(var8 * var7.field_q / var7.field_r) + var9;
                    var11 = new o(var9, var8);
                    var11.a();
                    var7.a(0, 0, var8 * var7.field_q / var7.field_r, var8);
                    var12 = var10 * qd.field_f[0].field_r / qd.field_f[0].field_q;
                    qd.field_f[0].a(var7.field_q * var8 / var7.field_r - -8, -var12 + var8 >> 1694759201, var10, var12);
                    ah.a(var11, false);
                    var13 = ad.field_b.field_m;
                    pg.field_a = new o(var13, var13);
                    pg.field_a.a();
                    u.field_c.a(0, 0, var13, var13);
                    u.field_c = null;
                    eh.field_b = new o[ii.field_g.length];
                    var14 = 0;
                    L10: while (true) {
                      L11: {
                        L12: {
                          if (ii.field_g.length <= var14) {
                            break L12;
                          } else {
                            var15 = ii.field_g[var14];
                            eh.field_b[var14] = new o(var15.field_p, var15.field_t);
                            eh.field_b[var14].a();
                            var15.d(-var15.field_s, -var15.field_n, 65793);
                            var15.c(-var15.field_s, -var15.field_n, 64);
                            mi.c(0, 0, mi.field_a, mi.field_d);
                            var14++;
                            if (var16 != 0) {
                              break L11;
                            } else {
                              if (var16 == 0) {
                                continue L10;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        hj.field_e.a(true);
                        fh.field_c = null;
                        field_I = null;
                        break L11;
                      }
                      return fc.field_o;
                    }
                  }
                } else {
                  jh.a(-1);
                  var3_int = param0;
                  L13: while (true) {
                    L14: {
                      L15: {
                        if (10 <= var3_int) {
                          break L15;
                        } else {
                          vd.field_d[var3_int] = new ie(var3_int);
                          var3_int++;
                          if (var16 != 0) {
                            break L14;
                          } else {
                            if (var16 == 0) {
                              continue L13;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                      kd.field_a = 0;
                      vh.a(24, 50);
                      bj.a(50, -127);
                      nf.field_W = new int[500];
                      break L14;
                    }
                    var3_int = 0;
                    L16: while (true) {
                      L17: {
                        L18: {
                          if (nf.field_W.length <= var3_int) {
                            break L18;
                          } else {
                            nf.field_W[var3_int] = -640 + bk.a(1280, jb.field_g, (byte) -108);
                            nf.field_W[1 + var3_int] = bk.a(720, jb.field_g, (byte) 69);
                            var3_int += 2;
                            if (var16 != 0) {
                              break L17;
                            } else {
                              if (var16 == 0) {
                                continue L16;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                        kh.field_d = 255;
                        pg.field_e = true;
                        break L17;
                      }
                      return ng.field_d;
                    }
                  }
                }
              }
            } else {
              var3_int = 0;
              L19: while (true) {
                L20: {
                  L21: {
                    if (6 <= var3_int) {
                      break L21;
                    } else {
                      stackOut_40_0 = null;
                      stackIn_48_0 = stackOut_40_0;
                      stackIn_41_0 = stackOut_40_0;
                      if (var16 != 0) {
                        break L20;
                      } else {
                        L22: {
                          if (stackIn_41_0 == (Object) (Object) c.field_M[var3_int]) {
                            break L22;
                          } else {
                            if (ua.field_I.a(176400, c.field_M[var3_int], qc.field_s, ic.field_u, -122)) {
                              break L22;
                            } else {
                              return fc.field_o;
                            }
                          }
                        }
                        var3_int++;
                        if (var16 == 0) {
                          continue L19;
                        } else {
                          break L21;
                        }
                      }
                    }
                  }
                  ua.field_I.b(true);
                  ic.field_u = null;
                  stackOut_47_0 = null;
                  stackIn_48_0 = stackOut_47_0;
                  break L20;
                }
                qc.field_s = (me) (Object) stackIn_48_0;
                return fc.field_o;
              }
            }
          } else {
            a.a((byte) 102, rf.field_E, 75.0f);
            ((SolKnight) this).a(param0 + -11633);
            c.field_M[0] = rl.a(qb.field_cb, "", "sol knight title");
            c.field_M[1] = rl.a(qb.field_cb, "", "sol_ingame_1");
            c.field_M[2] = rl.a(qb.field_cb, "", "sol_ingame_2");
            c.field_M[3] = rl.a(qb.field_cb, "", "sol_ingame_3");
            c.field_M[4] = rl.a(qb.field_cb, "", "sol knight gameover jingle");
            c.field_M[5] = rl.a(qb.field_cb, "", "sol knight victory jingle");
            qb.field_cb = null;
            return fc.field_o;
          }
        }
    }

    final void d(int param0) {
        ((SolKnight) this).a(0, false, 6, 9, true, 16, 10, 8);
        mf var2 = new mf();
        var2.d(-4474, 128, 9);
        dh.a(var2, (java.awt.Component) (Object) dc.field_q, true, (byte) -40, 22050, wh.field_c);
        hc.field_d = 16777088;
        if (param0 != -31680) {
            return;
        }
        try {
            rj.field_c = 16776960;
            pb.field_b = 16777215;
            ((SolKnight) this).a((byte) -38, true, false, false, false);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "SolKnight.H(" + param0 + 41);
        }
    }

    public SolKnight() {
    }

    private final void h(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_106_0 = 0;
        boolean stackIn_115_0 = false;
        int stackIn_124_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_135_0 = 0;
        int stackOut_105_0 = 0;
        boolean stackOut_114_0 = false;
        int stackOut_123_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_133_0 = 0;
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
                        if (0 == (bi.field_i & 1073741824)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var2_int = bk.a(bi.field_i >>> 877718027, jb.field_g, (byte) -102);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        bi.field_i = bi.field_i - (var2_int << 1394859723);
                        ic.field_t = ic.field_t - fa.field_f * var2_int;
                        if (var3 == 0) {
                            statePc = 7;
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
                        bi.field_i = bi.field_i + 2048;
                        ic.field_t = ic.field_t + fa.field_f;
                        statePc = 5;
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
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 == -108) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        if (wb.field_c != 0) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (0 < (gb.field_j << 769508017) + lc.field_h) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ic.field_t = ic.field_t - gb.field_j * ud.field_k;
                        lc.field_h = lc.field_h - (gb.field_j << 1342001681);
                        if (var3 == 0) {
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
                        lc.field_h = lc.field_h + (gb.field_j << -230779407);
                        ic.field_t = ic.field_t + gb.field_j * ud.field_k;
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
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (je.field_d == 0) {
                            statePc = 62;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (1 != je.field_d) {
                            statePc = 36;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ua.field_H = ua.field_H + 1;
                        if (ua.field_H == 32) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
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
                case 26: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (!sg.b((byte) -104)) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        da.a(true);
                        if (var3 == 0) {
                            statePc = 35;
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
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        nh.a((byte) 3);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        je.field_d = 2;
                        if (var3 == 0) {
                            statePc = 141;
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
                        if ((je.field_d ^ -1) != -3) {
                            statePc = 56;
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
                        if (!il.b(507)) {
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
                        kd.field_a = me.field_b;
                        if (var3 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((lk.field_e ^ -1) < -1) {
                            statePc = 50;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        ah.b(true);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        kd.field_a = h.field_g;
                        if (kd.field_a != -2) {
                            statePc = 55;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        kd.field_a = 0;
                        ta.a(false, 320, w.field_b, 2, ug.field_g.field_s + ug.field_g.field_F, (mg) (Object) ug.field_g, 8, ad.field_b.field_F - -ad.field_b.field_s, ad.field_b.field_F, w.field_b, 8, 240, (mg) (Object) ad.field_b, ug.field_g.field_F, false);
                        statePc = 53;
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
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        ri.field_f = kd.field_a;
                        je.field_d = 3;
                        if (var3 == 0) {
                            statePc = 141;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        ua.field_H = ua.field_H - 1;
                        if (ua.field_H != 0) {
                            statePc = 141;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        je.field_d = 0;
                        if (var3 == 0) {
                            statePc = 141;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if ((ve.field_b ^ -1) >= -1) {
                            statePc = 71;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        ve.field_b = ve.field_b - 1;
                        if (ve.field_b == 385) {
                            statePc = 70;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        mb.a(true, 35, 256);
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (ve.field_b < 0) {
                            statePc = 78;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        si.field_E = 240 - ve.field_b;
                        wd.field_c = -160;
                        if ((si.field_E ^ -1) > -1) {
                            statePc = 77;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        si.field_E = 0;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (0 < kh.field_d) {
                            statePc = 81;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        kh.field_d = kh.field_d - 1;
                        kh.field_d = kh.field_d * 9 / 10;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (kd.field_a != ri.field_f) {
                            statePc = 95;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if ((kd.field_a ^ -1) != 0) {
                            statePc = 89;
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
                        hb.a(true);
                        if (var3 == 0) {
                            statePc = 113;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        vd.field_d[kd.field_a].c(0);
                        if (-1 != (kd.field_a ^ -1)) {
                            statePc = 113;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        hb.a(true);
                        if (var3 == 0) {
                            statePc = 113;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        ua.field_H = ua.field_H + 1;
                        if (32 == ua.field_H) {
                            statePc = 100;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (-3 == (kd.field_a ^ -1)) {
                            statePc = 103;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        kh.field_c = null;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (-9 != (kd.field_a ^ -1)) {
                            statePc = 112;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        stackOut_105_0 = 9;
                        stackIn_106_0 = stackOut_105_0;
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (stackIn_106_0 != ri.field_f) {
                            statePc = 112;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        ah.field_f = 0;
                        jl.field_d = 0;
                        w.field_a.a(true);
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        ua.field_H = 0;
                        kd.field_a = ri.field_f;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (0 <= ve.field_b) {
                            statePc = 121;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        stackOut_114_0 = pg.field_e;
                        stackIn_115_0 = stackOut_114_0;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (!stackIn_115_0) {
                            statePc = 131;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if ((kd.field_a ^ -1) == 0) {
                            statePc = 131;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var2_int = 1;
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if ((nf.field_W.length ^ -1) >= (var2_int ^ -1)) {
                            statePc = 131;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        nf.field_W[var2_int] = nf.field_W[var2_int] - 1;
                        stackOut_123_0 = nf.field_W[var2_int];
                        stackIn_135_0 = stackOut_123_0;
                        stackIn_124_0 = stackOut_123_0;
                        if (var3 != 0) {
                            statePc = 135;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (stackIn_124_0 >= 0) {
                            statePc = 130;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        nf.field_W[var2_int] = nf.field_W[var2_int] + 720;
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        var2_int += 2;
                        if (var3 == 0) {
                            statePc = 122;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (lc.field_t.a((byte) 51) == null) {
                            statePc = 141;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        stackOut_132_0 = 290;
                        stackIn_133_0 = stackOut_132_0;
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        stackOut_133_0 = stackIn_133_0;
                        stackIn_135_0 = stackOut_133_0;
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        wk.field_e = wk.field_e + 1;
                        if (stackIn_135_0 != wk.field_e + 1) {
                            statePc = 141;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        wk.field_e = 0;
                        gg discarded$1 = lc.field_t.a(0);
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 138;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 140: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw fc.a((Throwable) (Object) var2, "SolKnight.R(" + param0 + 41);
                }
                case 141: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        Object var2_ref = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4_int = 0;
        la var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        java.awt.Canvas stackOut_2_0 = null;
        jg stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        boolean stackOut_10_2 = false;
        RuntimeException stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_113_0 = 0;
        boolean stackOut_113_1 = false;
        int stackOut_115_0 = 0;
        int stackOut_115_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        var2_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (dj.field_k != null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = dc.field_q;
                        stackIn_5_0 = (Object) (Object) stackOut_2_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = dj.field_k;
                        stackIn_5_0 = (Object) (Object) stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2_ref = stackIn_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (!bl.a((byte) -81)) {
                            statePc = 15;
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
                        stackOut_7_0 = var2_ref;
                        stackOut_7_1 = 105;
                        stackIn_12_0 = (RuntimeException) (Object) stackOut_7_0;
                        stackIn_12_1 = stackOut_7_1;
                        stackIn_8_0 = (RuntimeException) (Object) stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (dj.field_k != null) {
                            statePc = 12;
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
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = stackIn_8_1;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = wh.field_b;
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_13_1 = stackOut_10_1;
                        stackIn_13_2 = stackOut_10_2 ? 1 : 0;
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
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = 1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        nc.a((java.awt.Canvas) (Object) stackIn_13_0, stackIn_13_1, stackIn_13_2 != 0);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return;
                }
                case 15: {
                    try {
                        if (na.field_b) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ih.a(param0 ^ -31842, (java.awt.Canvas) var2_ref);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return;
                }
                case 18: {
                    try {
                        if (qa.field_q == null) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        a.a((byte) 102, bg.field_t, 100.0f);
                        ih.a(20753, (java.awt.Canvas) var2_ref);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return;
                }
                case 21: {
                    try {
                        mi.e(-320 - wd.field_c, -si.field_E, 1280, 720, 0, il.field_e[kb.field_b]);
                        kc.field_O = kc.field_O + 1;
                        var3 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((nf.field_W.length ^ -1) <= (kc.field_O ^ -1)) {
                            statePc = 26;
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
                        kc.field_O = 0;
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
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var4_int = 0;
                        if (param0 == -11633) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return;
                }
                case 28: {
                    try {
                        if ((var4_int ^ -1) <= (nf.field_W.length ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var3++;
                        stackOut_29_0 = var3 ^ -1;
                        stackOut_29_1 = -6;
                        stackIn_49_0 = stackOut_29_0;
                        stackIn_49_1 = stackOut_29_1;
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        if (var8 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (stackIn_30_0 <= stackIn_30_1) {
                            statePc = 34;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var3 = 0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var5 = 320 + (-wd.field_c + nf.field_W[var4_int]);
                        var6 = -si.field_E + nf.field_W[1 + var4_int];
                        var7 = var4_int + -kc.field_O;
                        if ((-nf.field_W.length / 2 ^ -1) >= (var7 ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var7 = var7 + nf.field_W.length;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((nf.field_W.length / 2 ^ -1) > (var7 ^ -1)) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var7 = var7 - nf.field_W.length;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var7 >= 0) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var7 = -var7;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (-256 > (var7 ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var7 = 255;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        uh.field_l[var3].a(var5, var6, var7);
                        var4_int += 2;
                        if (var8 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = kd.field_a;
                        stackOut_48_1 = ri.field_f;
                        stackIn_49_0 = stackOut_48_0;
                        stackIn_49_1 = stackOut_48_1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0 == stackIn_49_1) {
                            statePc = 73;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (16 > ua.field_H) {
                            statePc = 63;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (0 != (ri.field_f ^ -1)) {
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
                        d.a(false, (byte) -48);
                        if (var8 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        vd.field_d[ri.field_f].d(582);
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        ll.a(1 + -ua.field_H + 32, 256, false, false);
                        mi.a(0, 0, 640, 480, 16769381, 32 + -ua.field_H << 1694561444);
                        if (var8 == 0) {
                            statePc = 82;
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
                        if (kd.field_a == -1) {
                            statePc = 69;
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
                        vd.field_d[kd.field_a].d(582);
                        if (var8 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        d.a(false, (byte) -48);
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        ll.a(1 + ua.field_H, 256, false, false);
                        mi.a(0, 0, 640, 480, 16769381, ua.field_H << 501270884);
                        if (var8 == 0) {
                            statePc = 82;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (kd.field_a == -1) {
                            statePc = 79;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        vd.field_d[kd.field_a].d(582);
                        if (var8 == 0) {
                            statePc = 82;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        d.a(true, (byte) -48);
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var4 = (la) (Object) lc.field_t.a((byte) 51);
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (null != var4) {
                            statePc = 86;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var6 = wk.field_e;
                        if (-71 >= (var6 ^ -1)) {
                            statePc = 89;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var5 = 480 - var6;
                        stackOut_87_0 = var8;
                        stackIn_88_0 = stackOut_87_0;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (stackIn_88_0 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (var6 >= 220) {
                            statePc = 93;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var5 = 410;
                        if (var8 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var5 = var6 + 190;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var7 = ug.field_g.b(hb.field_m[var4.field_h]);
                        uj.a(60 + var7, 70, -60 + -var7 + 640 >> 2079290817, gf.field_fb, var5, 2);
                        ii.field_f[var4.field_h].e(304, 10 + ug.field_g.field_s + (ug.field_g.field_F + var5));
                        ug.field_g.a(hb.field_m[var4.field_h], 320, var5 - -ug.field_g.field_F - -8, 16776960, 1);
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (!sg.b((byte) -115)) {
                            statePc = 99;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        mi.a(0, 0, mi.field_a, mi.field_d);
                        ai.a(h.field_d, (byte) -83, h.field_d[0].field_t, h.field_d[0].field_p);
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (-1 == (je.field_d ^ -1)) {
                            statePc = 105;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var5 = ua.field_H * 256 / 32;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (0 < var5) {
                            statePc = 104;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        mi.a(0, 0, mi.field_a, mi.field_d, 0, var5);
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (!lb.g((byte) -94)) {
                            statePc = 117;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        stackOut_106_0 = -104;
                        stackIn_107_0 = stackOut_106_0;
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 109;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (!sg.b((byte) stackIn_107_0)) {
                            statePc = 112;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        stackOut_112_0 = 25899;
                        stackIn_115_0 = stackOut_112_0;
                        stackIn_113_0 = stackOut_112_0;
                        if (null != dj.field_k) {
                            statePc = 115;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        stackOut_113_0 = stackIn_113_0;
                        stackOut_113_1 = wh.field_b;
                        stackIn_116_0 = stackOut_113_0;
                        stackIn_116_1 = stackOut_113_1 ? 1 : 0;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        stackOut_115_0 = stackIn_115_0;
                        stackOut_115_1 = 1;
                        stackIn_116_0 = stackOut_115_0;
                        stackIn_116_1 = stackOut_115_1;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        ph.a(stackIn_116_0, stackIn_116_1 != 0);
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        uf.a((byte) 99, 0, 0, (java.awt.Canvas) var2_ref);
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 119: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw fc.a((Throwable) (Object) var2, "SolKnight.D(" + param0 + 41);
                }
                case 120: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void n(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_K = null;
              if (param0 == 2325) {
                break L0;
              } else {
                SolKnight.n(-100);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_D = null;
          field_E = null;
          field_I = null;
        }
    }

    private final void a(o[] param0, byte param1) {
        o var3_ref2 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        o var3_ref = null;
        o var4 = null;
        o var4_ref = null;
        o var5 = null;
        o var6 = null;
        o var7 = null;
        o var8 = null;
        o var9 = null;
        int var10 = 0;
        int[] var11 = null;
        o[] var11_array = null;
        int var12_int = 0;
        o var12 = null;
        o var13 = null;
        o var14 = null;
        int[] var14_array = null;
        o var15 = null;
        int var15_int = 0;
        o var16 = null;
        int var16_int = 0;
        o var17 = null;
        o var18 = null;
        o var19 = null;
        o var20 = null;
        o var21 = null;
        o var22 = null;
        o var23 = null;
        o var24 = null;
        o var25 = null;
        o var26 = null;
        o var27 = null;
        o var28 = null;
        o var29 = null;
        o var30 = null;
        o var31 = null;
        int var32 = 0;
        o stackIn_5_0 = null;
        o stackIn_9_0 = null;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        o stackIn_20_0 = null;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        o stackIn_36_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        o stackOut_4_0 = null;
        o stackOut_8_0 = null;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        o stackOut_19_0 = null;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        o stackOut_35_0 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        var3_ref2 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var32 = field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var3_int >= param0.length) {
                            statePc = 8;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4 = param0[var3_int];
                        var4.field_r = var4.field_t;
                        var4.field_q = var4.field_p;
                        var5 = var4;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4.field_n = 0;
                        stackOut_4_0 = (o) var5;
                        stackIn_9_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (var32 != 0) {
                            statePc = 9;
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
                        stackIn_5_0.field_s = 0;
                        var3_int++;
                        if (var32 == 0) {
                            statePc = 2;
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = param0[0];
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var3_ref2 = stackIn_9_0;
                        var4_ref = wc.a(var3_ref2, 0);
                        var5 = wc.a(var4_ref, 0);
                        var6 = param0[2];
                        var7 = wc.a(var6, 0);
                        var8 = wc.a(var7, 0);
                        var9 = wc.a(var8, 0);
                        uk.field_k = param0[3];
                        th.field_H = wc.a(wc.a(uk.field_k, 0), 0);
                        h.field_d = new o[9];
                        h.field_d[2] = var7;
                        h.field_d[0] = var3_ref2;
                        h.field_d[1] = param0[1];
                        h.field_d[8] = var5;
                        h.field_d[6] = var9;
                        h.field_d[5] = wc.a(h.field_d[1], 0);
                        h.field_d[7] = wc.a(h.field_d[5], 0);
                        h.field_d[3] = wc.a(h.field_d[7], 0);
                        h.field_d[4] = new o(32, 32);
                        var10 = -106 % ((param1 - 77) / 40);
                        var11 = h.field_d[4].field_v;
                        var12_int = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var11.length <= var12_int) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var11[var12_int] = 1;
                        var12_int++;
                        if (var32 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var32 == 0) {
                            statePc = 10;
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
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        of.field_b = new o[9];
                        of.field_b[2] = var7;
                        of.field_b[0] = var6;
                        of.field_b[5] = h.field_d[5];
                        of.field_b[6] = var9;
                        of.field_b[4] = h.field_d[4];
                        of.field_b[7] = h.field_d[7];
                        of.field_b[8] = var8;
                        of.field_b[1] = h.field_d[1];
                        of.field_b[3] = h.field_d[3];
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var11_array = new o[param0.length];
                        var12_int = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = var12_int;
                        stackOut_17_1 = param0.length;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (stackIn_18_0 >= stackIn_18_1) {
                            statePc = 35;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var11_array[var12_int] = param0[var12_int].c();
                        var13 = param0[var12_int].c();
                        stackOut_19_0 = (o) var13;
                        stackIn_36_0 = stackOut_19_0;
                        stackIn_20_0 = stackOut_19_0;
                        if (var32 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var14_array = stackIn_20_0.field_v;
                        var15_int = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var15_int >= var14_array.length) {
                            statePc = 34;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var16_int = var14_array[var15_int];
                        stackOut_22_0 = 65535 & var16_int ^ -1;
                        stackOut_22_1 = var16_int >> 879831336 & 65535 ^ -1;
                        stackIn_18_0 = stackOut_22_0;
                        stackIn_18_1 = stackOut_22_1;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        if (var32 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 != stackIn_23_1) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var14_array[var15_int] = 0;
                        if (var32 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (-2 == (var16_int ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var14_array[var15_int] = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var15_int++;
                        if (var32 == 0) {
                            statePc = 21;
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
                        var13.f();
                        var13.field_q = var13.field_p;
                        var13.field_r = var13.field_t;
                        var13.field_n = 0;
                        var15 = var13;
                        var15.field_s = 0;
                        var12_int++;
                        if (var32 == 0) {
                            statePc = 17;
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
                        stackOut_35_0 = new o(29, 29);
                        stackIn_36_0 = stackOut_35_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var12 = stackIn_36_0;
                        o.a(var11_array[0], var12, 4, 0, 0, 0, 29, 29);
                        o.a(var11_array[0], var12, 0, 4, 0, 0, 10, 29);
                        var13 = wc.a(var12, 0);
                        var14 = wc.a(var13, 0);
                        var15 = wc.a(var14, 0);
                        var16 = ig.a(var11_array[2], 30, 0, 0, 29, 29);
                        var17 = wc.a(var16, 0);
                        var18 = wc.a(var17, 0);
                        var19 = wc.a(var18, 0);
                        var20 = var11_array[1];
                        var21 = wc.a(var20, 0);
                        var22 = wc.a(var21, 0);
                        var23 = wc.a(var22, 0);
                        var24 = lb.a(var12.field_r + -var20.field_r, var20, 0, 0, 0, 0);
                        var25 = lb.a(0, var21, var13.field_q + -var21.field_q, 0, 0, 0);
                        var26 = lb.a(0, var22, 0, 0, 0, var14.field_r + -var22.field_r);
                        var27 = lb.a(0, var23, 0, var15.field_q + -var23.field_q, 0, 0);
                        var28 = ig.a(var16, 30, 0, 0, var11_array[1].field_t, var11_array[1].field_t);
                        var29 = wc.a(var28, 0);
                        var30 = wc.a(var29, 0);
                        var31 = wc.a(var30, 0);
                        gf.field_fb = new o[9];
                        gf.field_fb[5] = var25;
                        gf.field_fb[2] = var13;
                        gf.field_fb[0] = var12;
                        gf.field_fb[3] = var27;
                        gf.field_fb[1] = var24;
                        gf.field_fb[6] = ig.a(var19, 30, var19.field_r + -var31.field_r, 0, var12.field_q, var31.field_r);
                        gf.field_fb[7] = var22;
                        gf.field_fb[8] = ig.a(var18, 30, var18.field_r - var31.field_r, 0, var13.field_q, var31.field_r);
                        dh.field_f = new o[9];
                        dh.field_f[0] = ig.a(var16, 30, 0, 0, var15.field_q, var29.field_r);
                        dh.field_f[3] = var27;
                        dh.field_f[7] = var26;
                        dh.field_f[2] = var29;
                        dh.field_f[1] = var20;
                        dh.field_f[6] = var15;
                        dh.field_f[5] = var21;
                        dh.field_f[8] = ig.a(var18, 30, 0, var18.field_q - var29.field_q, var29.field_q, var15.field_r);
                        le.field_d = new o[9];
                        le.field_d[0] = var28;
                        le.field_d[1] = var20;
                        le.field_d[2] = ig.a(var17, 30, 0, 0, var14.field_q, var28.field_r);
                        le.field_d[3] = var23;
                        le.field_d[5] = var25;
                        le.field_d[6] = ig.a(var19, 30, 0, 0, var28.field_q, var14.field_r);
                        le.field_d[8] = var14;
                        le.field_d[7] = dh.field_f[7];
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 38: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    try {
                        stackOut_39_0 = (RuntimeException) var3;
                        stackOut_39_1 = new StringBuilder().append("SolKnight.U(");
                        stackIn_42_0 = stackOut_39_0;
                        stackIn_42_1 = stackOut_39_1;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        if (param0 == null) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                        stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                        stackOut_40_2 = "{...}";
                        stackIn_43_0 = stackOut_40_0;
                        stackIn_43_1 = stackOut_40_1;
                        stackIn_43_2 = stackOut_40_2;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 41: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 42: {
                    stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
                    stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
                    stackOut_42_2 = "null";
                    stackIn_43_0 = stackOut_42_0;
                    stackIn_43_1 = stackOut_42_1;
                    stackIn_43_2 = stackOut_42_2;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    throw fc.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + 44 + param1 + 41);
                }
                case 44: {
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
        field_E = new int[4];
        field_G = 0;
        field_D = new fg("");
    }
}
