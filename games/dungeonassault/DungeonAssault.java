/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class DungeonAssault extends in {
    static String field_H;
    static cn field_I;
    static String field_G;
    static String field_J;
    public static int field_K;

    public static void h(byte param0) {
        field_G = null;
        field_J = null;
        if (param0 != 114) {
            return;
        }
        try {
            field_I = null;
            field_H = null;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "DungeonAssault.E(" + param0 + 41);
        }
    }

    private final void c(boolean param0, byte param1) {
        RuntimeException var3 = null;
        pj var3_ref = null;
        int var4 = 0;
        Random var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_16_0 = false;
        boolean stackIn_17_0 = false;
        int stackIn_17_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_126_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        int stackIn_154_0 = 0;
        boolean stackOut_11_0 = false;
        boolean stackOut_12_0 = false;
        boolean stackOut_14_0 = false;
        int stackOut_14_1 = 0;
        boolean stackOut_16_0 = false;
        int stackOut_16_1 = 0;
        int stackOut_81_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_123_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_132_1 = 0;
        int stackOut_151_0 = 0;
        int stackOut_153_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = field_K;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((fm.field_e ^ -1) == (fm.field_a ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (fm.field_a == dg.field_H) {
                            statePc = 35;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((bn.field_n ^ -1) != (fm.field_a ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
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
                        if (ed.c(true)) {
                            statePc = 28;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        vk.a((byte) -31);
                        gd.a(g.field_Hb, 0, sa.field_f, false);
                        stackOut_11_0 = ll.field_k;
                        stackIn_16_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if ((nh.field_k ^ -1) > -3) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = stackIn_12_0;
                        stackIn_14_0 = stackOut_12_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = stackIn_14_0;
                        stackOut_14_1 = 1;
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_17_1 = stackOut_14_1;
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
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = stackIn_16_0;
                        stackOut_16_1 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ll.field_k = stackIn_17_0 | stackIn_17_1 != 0;
                        if (!tl.field_d) {
                            statePc = 24;
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
                        tl.field_d = false;
                        a.a(320, ne.field_c.field_N, (se) (Object) ne.field_c, true, false, 8, 240, 2, 8, ne.field_c.field_E + ne.field_c.field_N, (cn[]) null, (cn[]) null);
                        if (cm.field_R != null) {
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
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        pn discarded$2 = i.field_A.a((java.awt.Component) (Object) cm.field_R, (byte) 51, false);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (fc.a(dc.field_z, (byte) -120)) {
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
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        af.a((byte) 114);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        fm.field_a = ii.field_F;
                        if (var6 == 0) {
                            statePc = 88;
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
                        pk.field_t = pk.field_t - 1;
                        if ((pk.field_t ^ -1) == -1) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        fm.field_a = fm.field_e;
                        if (var6 == 0) {
                            statePc = 88;
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
                        pk.field_t = pk.field_t + 1;
                        if (pk.field_t != 16) {
                            statePc = 88;
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
                        if (tl.field_d) {
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
                        bj.i(81);
                        if (var6 == 0) {
                            statePc = 47;
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
                        dn.b(false);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        gm.field_d = null;
                        fm.field_a = bn.field_n;
                        if (var6 == 0) {
                            statePc = 88;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (!param0) {
                            statePc = 53;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (co.field_G == null) {
                            statePc = 60;
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
                        bd.field_f = bd.field_f + 1;
                        if ((bd.field_f ^ -1) == -65) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        af.a((byte) 40);
                        if (var6 == 0) {
                            statePc = 80;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (mn.field_b == -1) {
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
                        if (fc.a(mn.field_b, (byte) -120)) {
                            statePc = 68;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        bf.field_f[mn.field_b].c(true);
                        if (var6 == 0) {
                            statePc = 80;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (ik.field_e == null) {
                            statePc = 80;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        ik.field_e.c(true);
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (!ha.b((byte) 47)) {
                            statePc = 80;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        ik.field_e.f();
                        if (var6 != 0) {
                            statePc = 88;
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
                        if (var6 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (null == wl.field_a.e(-24172)) {
                            statePc = 88;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        stackOut_81_0 = ke.field_e;
                        stackIn_82_0 = stackOut_81_0;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        ke.field_e = stackIn_82_0 + 1;
                        if (stackIn_82_0 + 1 != 335) {
                            statePc = 88;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        ne discarded$3 = wl.field_a.b((byte) -124);
                        sl.field_b = null;
                        pa.field_a = null;
                        ri.field_g = null;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (ik.field_e == null) {
                            statePc = 96;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        stackOut_89_0 = 0;
                        stackIn_90_0 = stackOut_89_0;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (stackIn_90_0 != (mn.field_b ^ -1)) {
                            statePc = 95;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        ik.field_e.a(false, 251569954);
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (param1 == -69) {
                            statePc = 100;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        this.c(true, (byte) -64);
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (dc.field_z == -2) {
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
                        statePc = 132;
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
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var3_ref = new pj();
                        var3_ref.field_v = uk.a(0, new Random());
                        var4 = 0;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (49 <= var4) {
                            statePc = 122;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        stackOut_105_0 = 0;
                        stackOut_105_1 = oi.b(0, 5);
                        stackIn_133_0 = stackOut_105_0;
                        stackIn_133_1 = stackOut_105_1;
                        stackIn_106_0 = stackOut_105_0;
                        stackIn_106_1 = stackOut_105_1;
                        if (var6 != 0) {
                            statePc = 133;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (stackIn_106_0 == stackIn_106_1) {
                            statePc = 112;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (var6 == 0) {
                            statePc = 121;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (var3_ref.field_h[var4].field_a == 0) {
                            statePc = 118;
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
                        if (var6 == 0) {
                            statePc = 121;
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
                        var3_ref.field_h[var4] = new ai(ji.a(37, false, 4));
                        statePc = 119;
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
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 104;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (null == gm.field_d) {
                            statePc = 125;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        stackOut_123_0 = gm.field_d.field_N;
                        stackIn_126_0 = stackOut_123_0;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        stackOut_125_0 = 10000;
                        stackIn_126_0 = stackOut_125_0;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        var4 = stackIn_126_0;
                        var3_ref.field_y = var4;
                        var3_ref.field_o = var4 / 10;
                        var3_ref.field_A[0] = new hb(0, 25);
                        var3_ref.field_A[1] = new hb(1, 27);
                        var3_ref.field_A[2] = new hb(2, 18);
                        var3_ref.field_A[3] = new hb(3, 19);
                        var3_ref.a(false, 4);
                        ik.field_e = new go(false, var3_ref);
                        var5 = cm.field_Q ? 1 : 0;
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if (!ve.a(false)) {
                            statePc = 130;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        stackOut_128_0 = 12;
                        stackIn_131_0 = stackOut_128_0;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        stackOut_130_0 = 0;
                        stackIn_131_0 = stackOut_130_0;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        gd.a(stackIn_131_0, 0, -1, var5 != 0);
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        stackOut_132_0 = 2;
                        stackOut_132_1 = dc.field_z ^ -1;
                        stackIn_133_0 = stackOut_132_0;
                        stackIn_133_1 = stackOut_132_1;
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (stackIn_133_0 == stackIn_133_1) {
                            statePc = 135;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        var3_ref = new pj();
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if (ed.c(true)) {
                            statePc = 140;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if (0 == (gm.field_d.field_q ^ -1)) {
                            statePc = 146;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        var4_ref = new Random();
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        var3_ref.field_v = uk.a(0, var4_ref);
                        var3_ref.field_h = da.a(var3_ref.field_v, (byte) 71, var4_ref);
                        if (!ed.c(true)) {
                            statePc = 145;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        gm.field_d = new lb();
                        gm.field_d.field_L = var3_ref.field_h;
                        gm.field_d.field_k = var3_ref.field_v;
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
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        if (var6 == 0) {
                            statePc = 149;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        var3_ref.field_v = new wm(gm.field_d.field_k);
                        var3_ref.field_h = gm.field_d.field_L;
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        var3_ref.field_o = 1000;
                        var3_ref.field_A[0] = new hb(0, 1);
                        var3_ref.field_A[1] = new hb(1, 3);
                        var3_ref.field_A[2] = new hb(2, 4);
                        var3_ref.field_A[3] = new hb(3, 2);
                        var3_ref.a(false, 4);
                        ha.d(1);
                        ik.field_e = new go(false, var3_ref);
                        var4 = cm.field_Q ? 1 : 0;
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        if (!ve.a(false)) {
                            statePc = 153;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        stackOut_151_0 = 12;
                        stackIn_154_0 = stackOut_151_0;
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 152;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        stackOut_153_0 = 0;
                        stackIn_154_0 = stackOut_153_0;
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        gd.a(stackIn_154_0, 0, -1, var4 != 0);
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 156: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw vk.a((Throwable) (Object) var3, "DungeonAssault.H(" + param0 + 44 + param1 + 41);
                }
                case 157: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        ak var2_ref = null;
        int var2_int = 0;
        int[] var2_array = null;
        lb var2_ref2 = null;
        int[] var3_ref_int__ = null;
        int var3 = 0;
        wj var4_ref = null;
        int[] var4_ref_int__ = null;
        int var4 = 0;
        int var5 = 0;
        di[] var5_ref_di__ = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_28_0 = false;
        ek stackIn_42_0 = null;
        Object stackIn_49_0 = null;
        Object stackIn_51_0 = null;
        Object stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        Object stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        Object stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        Object stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        Object stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        int stackIn_119_2 = 0;
        int stackIn_122_0 = 0;
        int stackIn_160_0 = 0;
        boolean stackIn_168_0 = false;
        int stackIn_170_0 = 0;
        int stackIn_170_1 = 0;
        boolean stackIn_193_0 = false;
        int stackIn_220_0 = 0;
        int stackIn_228_0 = 0;
        int stackIn_236_0 = 0;
        int stackIn_258_0 = 0;
        int stackIn_258_1 = 0;
        int stackIn_258_2 = 0;
        int stackIn_260_0 = 0;
        int stackIn_260_1 = 0;
        int stackIn_260_2 = 0;
        int stackIn_261_0 = 0;
        int stackIn_261_1 = 0;
        int stackIn_261_2 = 0;
        int stackIn_261_3 = 0;
        int stackIn_275_0 = 0;
        go stackIn_283_0 = null;
        Object stackIn_306_0 = null;
        int stackIn_317_0 = 0;
        int stackIn_317_1 = 0;
        int stackIn_321_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        boolean stackOut_27_0 = false;
        ek stackOut_41_0 = null;
        Object stackOut_48_0 = null;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        Object stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        Object stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        Object stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        int stackOut_116_2 = 0;
        Object stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        int stackOut_118_2 = 0;
        int stackOut_121_0 = 0;
        int stackOut_159_0 = 0;
        boolean stackOut_167_0 = false;
        int stackOut_169_0 = 0;
        int stackOut_169_1 = 0;
        boolean stackOut_192_0 = false;
        int stackOut_219_0 = 0;
        int stackOut_227_0 = 0;
        int stackOut_235_0 = 0;
        int stackOut_257_0 = 0;
        int stackOut_257_1 = 0;
        int stackOut_257_2 = 0;
        int stackOut_258_0 = 0;
        int stackOut_258_1 = 0;
        int stackOut_258_2 = 0;
        int stackOut_258_3 = 0;
        int stackOut_260_0 = 0;
        int stackOut_260_1 = 0;
        int stackOut_260_2 = 0;
        int stackOut_260_3 = 0;
        int stackOut_272_0 = 0;
        int stackOut_274_0 = 0;
        go stackOut_282_0 = null;
        Object stackOut_305_0 = null;
        int stackOut_316_0 = 0;
        int stackOut_316_1 = 0;
        int stackOut_320_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = field_K;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        int discarded$5 = ib.b((byte) 31);
                        int discarded$6 = mn.a((byte) -42);
                        if (ef.field_h) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (kj.field_n == 0) {
                            statePc = 19;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = 5;
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
                        if (stackIn_6_0 * kh.field_m.length / 2 > kj.field_n) {
                            statePc = 15;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
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
                        if (stackIn_10_0 == la.field_g) {
                            statePc = 15;
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
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 19;
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
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        kj.field_n = kj.field_n + 1;
                        if (kj.field_n + 1 >= 5 * kh.field_m.length) {
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
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        kj.field_n = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (0 != no.field_d) {
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
                        statePc = 23;
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
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        kj.field_n = 1;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (ao.a((byte) 79)) {
                            statePc = 34;
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
                        if (c.field_h != gi.field_R) {
                            statePc = 31;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = di.field_e;
                        stackIn_28_0 = stackOut_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (!stackIn_28_0) {
                            statePc = 40;
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
                        pn discarded$7 = i.field_A.a((java.awt.Component) (Object) c.field_h, (byte) 116, false);
                        di.field_e = false;
                        gi.field_R = c.field_h;
                        if (var7 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (!di.field_e) {
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
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
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
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        pn discarded$8 = i.field_A.a((java.awt.Component) (Object) c.field_h, (byte) 61, true);
                        di.field_e = true;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        go.b((byte) 14);
                        if (cm.field_R == null) {
                            statePc = 48;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackOut_41_0 = cm.field_R;
                        stackIn_42_0 = stackOut_41_0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0.field_g) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        ib.a(930);
                        hh.a((byte) -128);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = this;
                        stackIn_51_0 = stackOut_48_0;
                        stackIn_49_0 = stackOut_48_0;
                        if (cm.field_R == null) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = this;
                        stackOut_49_1 = 1;
                        stackIn_52_0 = stackOut_49_0;
                        stackIn_52_1 = stackOut_49_1;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = this;
                        stackOut_51_1 = 0;
                        stackIn_52_0 = stackOut_51_0;
                        stackIn_52_1 = stackOut_51_1;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        ((DungeonAssault) this).a(stackIn_52_1 != 0, (byte) -74);
                        if (ld.field_i) {
                            statePc = 55;
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
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        bo.h(78);
                        ld.field_i = false;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        mo.field_a = mo.field_a + 1;
                        if (!ao.a((byte) -123)) {
                            statePc = 63;
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
                        ((DungeonAssault) this).g((byte) 2);
                        if (ao.a((byte) 121)) {
                            statePc = 62;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 62: {
                    return;
                }
                case 63: {
                    try {
                        if (param0 < -89) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        this.c(false, (byte) -112);
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (ef.field_h) {
                            statePc = 74;
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
                        td.a(pj.field_r, 121);
                        if (!this.h(0)) {
                            statePc = 154;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        ef.field_h = true;
                        if (var7 == 0) {
                            statePc = 154;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (hc.b(1)) {
                            statePc = 80;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        nb.a(22);
                        if (var7 == 0) {
                            statePc = 154;
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
                        if (!ib.a((byte) 84)) {
                            statePc = 110;
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
                        up.c((byte) 126);
                        if ((fm.field_e ^ -1) == (fm.field_a ^ -1)) {
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
                        this.c(false, (byte) -69);
                        if (var7 == 0) {
                            statePc = 154;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var2_int = mf.b(12210);
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (var2_int == 2) {
                            statePc = 106;
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
                        if (var2_int == 3) {
                            statePc = 100;
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
                        if (4 == var2_int) {
                            statePc = 99;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        tl.field_d = true;
                        ik.a(ve.field_c, 86, 0);
                        if (var7 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        tl.field_d = false;
                        a.a(320, ne.field_c.field_N, (se) (Object) ne.field_c, true, true, 8, 240, 2, 8, ne.field_c.field_E + ne.field_c.field_N, (cn[]) null, (cn[]) null);
                        if (cm.field_R == null) {
                            statePc = 109;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        pn discarded$9 = i.field_A.a((java.awt.Component) (Object) cm.field_R, (byte) 86, false);
                        if (var7 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        ib.a(930);
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        this.c(true, (byte) -69);
                        if (var7 == 0) {
                            statePc = 154;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 112;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (!sl.b(15000)) {
                            statePc = 136;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        stackOut_113_0 = this;
                        stackOut_113_1 = 82;
                        stackIn_118_0 = stackOut_113_0;
                        stackIn_118_1 = stackOut_113_1;
                        stackIn_114_0 = stackOut_113_0;
                        stackIn_114_1 = stackOut_113_1;
                        if (null == cm.field_R) {
                            statePc = 118;
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
                        stackOut_114_0 = this;
                        stackOut_114_1 = stackIn_114_1;
                        stackIn_116_0 = stackOut_114_0;
                        stackIn_116_1 = stackOut_114_1;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        stackOut_116_0 = this;
                        stackOut_116_1 = stackIn_116_1;
                        stackOut_116_2 = 1;
                        stackIn_119_0 = stackOut_116_0;
                        stackIn_119_1 = stackOut_116_1;
                        stackIn_119_2 = stackOut_116_2;
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        stackOut_118_0 = this;
                        stackOut_118_1 = stackIn_118_1;
                        stackOut_118_2 = 0;
                        stackIn_119_0 = stackOut_118_0;
                        stackIn_119_1 = stackOut_118_1;
                        stackIn_119_2 = stackOut_118_2;
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var2_int = ((DungeonAssault) this).b((byte) stackIn_119_1, stackIn_119_2 != 0);
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if (1 == var2_int) {
                            statePc = 125;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        stackOut_121_0 = 2;
                        stackIn_122_0 = stackOut_121_0;
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (stackIn_122_0 != var2_int) {
                            statePc = 135;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (null != cm.field_R) {
                            statePc = 130;
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
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 129;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        ib.a(930);
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if ((var2_int ^ -1) != -3) {
                            statePc = 135;
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
                        eg.a((byte) 120, m.c(true));
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
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        this.c(true, (byte) -69);
                        if (var7 == 0) {
                            statePc = 154;
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
                        if (!ue.b((byte) -93)) {
                            statePc = 151;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        if ((fm.field_a ^ -1) == (fm.field_e ^ -1)) {
                            statePc = 145;
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
                        this.c(false, (byte) -69);
                        if (var7 == 0) {
                            statePc = 154;
                        } else {
                            statePc = 143;
                        }
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
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        var2_int = l.d(4570);
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        if (-2 == (var2_int ^ -1)) {
                            statePc = 149;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 148;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        ik.a(bh.field_Q, 53, 0);
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        this.c(true, (byte) -69);
                        if (var7 == 0) {
                            statePc = 154;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        this.c(false, (byte) -69);
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (!ed.c(true)) {
                            statePc = 157;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 156;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        var2_ref = (ak) (Object) ll.field_i.b((byte) -124);
                        if (null != var2_ref) {
                            statePc = 163;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        if (var7 != 0) {
                            statePc = 166;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 162;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        stackOut_159_0 = var7;
                        stackIn_160_0 = stackOut_159_0;
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 162;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        if (stackIn_160_0 == 0) {
                            statePc = 167;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        vb.a(4, (byte) 84, var2_ref);
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        if (var7 == 0) {
                            statePc = 157;
                        } else {
                            statePc = 167;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        stackOut_167_0 = di.a(uo.field_c, -1);
                        stackIn_168_0 = stackOut_167_0;
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        if (!stackIn_168_0) {
                            statePc = 316;
                        } else {
                            statePc = 169;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        stackOut_169_0 = -55;
                        stackOut_169_1 = hc.field_c ^ -1;
                        stackIn_317_0 = stackOut_169_0;
                        stackIn_317_1 = stackOut_169_1;
                        stackIn_170_0 = stackOut_169_0;
                        stackIn_170_1 = stackOut_169_1;
                        if (var7 != 0) {
                            statePc = 317;
                        } else {
                            statePc = 170;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 172;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        if (stackIn_170_0 == stackIn_170_1) {
                            statePc = 174;
                        } else {
                            statePc = 171;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 172;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        statePc = 173;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        statePc = 214;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        var2_array = wa.b(-1);
                        var3_ref_int__ = var2_array;
                        var4_ref = ra.field_c;
                        var5 = ((ec) (Object) var4_ref).c(true);
                        var6 = 0;
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        if (var6 >= var5) {
                            statePc = 180;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        var3_ref_int__[var6] = ((ec) (Object) var4_ref).h(-48);
                        var6++;
                        if (var7 != 0) {
                            statePc = 184;
                        } else {
                            statePc = 177;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 179;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        if (var7 == 0) {
                            statePc = 175;
                        } else {
                            statePc = 178;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 179;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        statePc = 180;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        if (wh.field_d) {
                            statePc = 183;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        statePc = 198;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        var3_ref_int__ = var2_array;
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        var4_ref_int__ = gj.field_c;
                        var5 = 0;
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        if (8 <= var5) {
                            statePc = 190;
                        } else {
                            statePc = 186;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        var3_ref_int__[var5] = nb.a(var3_ref_int__[var5], var4_ref_int__[var5] ^ -1);
                        var5++;
                        if (var7 != 0) {
                            statePc = 199;
                        } else {
                            statePc = 187;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        if (var7 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 188;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        var3 = 0;
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        if (var3 >= ce.field_o.length) {
                            statePc = 198;
                        } else {
                            statePc = 192;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        stackOut_192_0 = vl.a(var3, -67, var2_array);
                        stackIn_168_0 = stackOut_192_0;
                        stackIn_193_0 = stackOut_192_0;
                        if (var7 != 0) {
                            statePc = 168;
                        } else {
                            statePc = 193;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        if (!stackIn_193_0) {
                            statePc = 197;
                        } else {
                            statePc = 194;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        wl.field_a.a((ne) (Object) new a(var3), false);
                        statePc = 195;
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 196;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        statePc = 197;
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        var3++;
                        if (var7 == 0) {
                            statePc = 191;
                        } else {
                            statePc = 198;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        var3_ref_int__ = gj.field_c;
                        var4_ref_int__ = var2_array;
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        var5 = 0;
                        statePc = 200;
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        if (8 <= var5) {
                            statePc = 205;
                        } else {
                            statePc = 201;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        var3_ref_int__[var5] = mp.a(var3_ref_int__[var5], var4_ref_int__[var5]);
                        var5++;
                        if (var7 != 0) {
                            statePc = 206;
                        } else {
                            statePc = 202;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        if (var7 == 0) {
                            statePc = 200;
                        } else {
                            statePc = 203;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        statePc = 205;
                        continue stateLoop;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        var3_ref_int__ = bp.field_e;
                        var4_ref_int__ = var2_array;
                        statePc = 206;
                        continue stateLoop;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 206: {
                    try {
                        var5 = 0;
                        statePc = 207;
                        continue stateLoop;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        if (var5 >= 8) {
                            statePc = 212;
                        } else {
                            statePc = 208;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        var3_ref_int__[var5] = mp.a(var3_ref_int__[var5], var4_ref_int__[var5]);
                        var5++;
                        if (var7 != 0) {
                            statePc = 213;
                        } else {
                            statePc = 209;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 211;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        if (var7 == 0) {
                            statePc = 207;
                        } else {
                            statePc = 210;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 211;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        statePc = 212;
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        rf.field_S = true;
                        statePc = 213;
                        continue stateLoop;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        if (var7 == 0) {
                            statePc = 167;
                        } else {
                            statePc = 214;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 214: {
                    try {
                        if (-56 == (hc.field_c ^ -1)) {
                            statePc = 217;
                        } else {
                            statePc = 215;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_214) {
                        caughtException = stateCaught_214;
                        statePc = 216;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        statePc = 247;
                        continue stateLoop;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 216;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_216) {
                        caughtException = stateCaught_216;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        var2_ref2 = gm.field_d;
                        statePc = 218;
                        continue stateLoop;
                    } catch (Throwable stateCaught_217) {
                        caughtException = stateCaught_217;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        gm.field_d = new lb((ec) (Object) ra.field_c, 19);
                        if (mn.field_b == 4) {
                            statePc = 225;
                        } else {
                            statePc = 219;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_218) {
                        caughtException = stateCaught_218;
                        statePc = 222;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        stackOut_219_0 = dc.field_z;
                        stackIn_220_0 = stackOut_219_0;
                        statePc = 220;
                        continue stateLoop;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 222;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        if ((stackIn_220_0 ^ -1) == -5) {
                            statePc = 225;
                        } else {
                            statePc = 221;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 224;
                        continue stateLoop;
                    }
                }
                case 221: {
                    try {
                        statePc = 223;
                        continue stateLoop;
                    } catch (Throwable stateCaught_221) {
                        caughtException = stateCaught_221;
                        statePc = 224;
                        continue stateLoop;
                    }
                }
                case 222: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_222) {
                        caughtException = stateCaught_222;
                        statePc = 224;
                        continue stateLoop;
                    }
                }
                case 223: {
                    try {
                        statePc = 226;
                        continue stateLoop;
                    } catch (Throwable stateCaught_223) {
                        caughtException = stateCaught_223;
                        statePc = 224;
                        continue stateLoop;
                    }
                }
                case 224: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_224) {
                        caughtException = stateCaught_224;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 225: {
                    try {
                        jk.j((byte) 59);
                        statePc = 226;
                        continue stateLoop;
                    } catch (Throwable stateCaught_225) {
                        caughtException = stateCaught_225;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 226: {
                    try {
                        if (5 == mn.field_b) {
                            statePc = 231;
                        } else {
                            statePc = 227;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_226) {
                        caughtException = stateCaught_226;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 227: {
                    try {
                        stackOut_227_0 = -6;
                        stackIn_228_0 = stackOut_227_0;
                        statePc = 228;
                        continue stateLoop;
                    } catch (Throwable stateCaught_227) {
                        caughtException = stateCaught_227;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 228: {
                    try {
                        if (stackIn_228_0 != (dc.field_z ^ -1)) {
                            statePc = 234;
                        } else {
                            statePc = 229;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_228) {
                        caughtException = stateCaught_228;
                        statePc = 233;
                        continue stateLoop;
                    }
                }
                case 229: {
                    try {
                        statePc = 231;
                        continue stateLoop;
                    } catch (Throwable stateCaught_229) {
                        caughtException = stateCaught_229;
                        statePc = 233;
                        continue stateLoop;
                    }
                }
                case 230: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_230) {
                        caughtException = stateCaught_230;
                        statePc = 233;
                        continue stateLoop;
                    }
                }
                case 231: {
                    try {
                        u.a(1, var2_ref2);
                        statePc = 232;
                        continue stateLoop;
                    } catch (Throwable stateCaught_231) {
                        caughtException = stateCaught_231;
                        statePc = 233;
                        continue stateLoop;
                    }
                }
                case 232: {
                    try {
                        statePc = 234;
                        continue stateLoop;
                    } catch (Throwable stateCaught_232) {
                        caughtException = stateCaught_232;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 233: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_233) {
                        caughtException = stateCaught_233;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 234: {
                    try {
                        if (-3 == (mn.field_b ^ -1)) {
                            statePc = 239;
                        } else {
                            statePc = 235;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_234) {
                        caughtException = stateCaught_234;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 235: {
                    try {
                        stackOut_235_0 = -3;
                        stackIn_236_0 = stackOut_235_0;
                        statePc = 236;
                        continue stateLoop;
                    } catch (Throwable stateCaught_235) {
                        caughtException = stateCaught_235;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 236: {
                    try {
                        if (stackIn_236_0 != (dc.field_z ^ -1)) {
                            statePc = 242;
                        } else {
                            statePc = 237;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_236) {
                        caughtException = stateCaught_236;
                        statePc = 241;
                        continue stateLoop;
                    }
                }
                case 237: {
                    try {
                        statePc = 239;
                        continue stateLoop;
                    } catch (Throwable stateCaught_237) {
                        caughtException = stateCaught_237;
                        statePc = 241;
                        continue stateLoop;
                    }
                }
                case 238: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_238) {
                        caughtException = stateCaught_238;
                        statePc = 241;
                        continue stateLoop;
                    }
                }
                case 239: {
                    try {
                        sh.a(27886, var2_ref2);
                        statePc = 240;
                        continue stateLoop;
                    } catch (Throwable stateCaught_239) {
                        caughtException = stateCaught_239;
                        statePc = 241;
                        continue stateLoop;
                    }
                }
                case 240: {
                    try {
                        statePc = 242;
                        continue stateLoop;
                    } catch (Throwable stateCaught_240) {
                        caughtException = stateCaught_240;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 241: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_241) {
                        caughtException = stateCaught_241;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 242: {
                    try {
                        if (mn.field_b == 3) {
                            statePc = 246;
                        } else {
                            statePc = 243;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_242) {
                        caughtException = stateCaught_242;
                        statePc = 245;
                        continue stateLoop;
                    }
                }
                case 243: {
                    try {
                        if (dc.field_z != 3) {
                            statePc = 167;
                        } else {
                            statePc = 244;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_243) {
                        caughtException = stateCaught_243;
                        statePc = 245;
                        continue stateLoop;
                    }
                }
                case 244: {
                    try {
                        statePc = 246;
                        continue stateLoop;
                    } catch (Throwable stateCaught_244) {
                        caughtException = stateCaught_244;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 245: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_245) {
                        caughtException = stateCaught_245;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 246: {
                    try {
                        hi.b(1);
                        if (var7 == 0) {
                            statePc = 167;
                        } else {
                            statePc = 247;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_246) {
                        caughtException = stateCaught_246;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 247: {
                    try {
                        if (56 == hc.field_c) {
                            statePc = 251;
                        } else {
                            statePc = 248;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_247) {
                        caughtException = stateCaught_247;
                        statePc = 250;
                        continue stateLoop;
                    }
                }
                case 248: {
                    try {
                        if (57 != hc.field_c) {
                            statePc = 263;
                        } else {
                            statePc = 249;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_248) {
                        caughtException = stateCaught_248;
                        statePc = 250;
                        continue stateLoop;
                    }
                }
                case 249: {
                    try {
                        statePc = 251;
                        continue stateLoop;
                    } catch (Throwable stateCaught_249) {
                        caughtException = stateCaught_249;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 250: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_250) {
                        caughtException = stateCaught_250;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 251: {
                    try {
                        var2_int = ra.field_c.f(-123);
                        var3 = ra.field_c.f(-124);
                        var4 = ra.field_c.c(true);
                        var5_ref_di__ = new di[var4];
                        var6 = 0;
                        statePc = 252;
                        continue stateLoop;
                    } catch (Throwable stateCaught_251) {
                        caughtException = stateCaught_251;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 252: {
                    try {
                        if ((var4 ^ -1) >= (var6 ^ -1)) {
                            statePc = 257;
                        } else {
                            statePc = 253;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_252) {
                        caughtException = stateCaught_252;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 253: {
                    try {
                        var5_ref_di__[var6] = mm.a((ec) (Object) ra.field_c, false);
                        var6++;
                        if (var7 != 0) {
                            statePc = 262;
                        } else {
                            statePc = 254;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_253) {
                        caughtException = stateCaught_253;
                        statePc = 256;
                        continue stateLoop;
                    }
                }
                case 254: {
                    try {
                        if (var7 == 0) {
                            statePc = 252;
                        } else {
                            statePc = 255;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_254) {
                        caughtException = stateCaught_254;
                        statePc = 256;
                        continue stateLoop;
                    }
                }
                case 255: {
                    try {
                        statePc = 257;
                        continue stateLoop;
                    } catch (Throwable stateCaught_255) {
                        caughtException = stateCaught_255;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 256: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_256) {
                        caughtException = stateCaught_256;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 257: {
                    try {
                        stackOut_257_0 = var2_int;
                        stackOut_257_1 = var3;
                        stackOut_257_2 = 22;
                        stackIn_260_0 = stackOut_257_0;
                        stackIn_260_1 = stackOut_257_1;
                        stackIn_260_2 = stackOut_257_2;
                        stackIn_258_0 = stackOut_257_0;
                        stackIn_258_1 = stackOut_257_1;
                        stackIn_258_2 = stackOut_257_2;
                        if (hc.field_c != 57) {
                            statePc = 260;
                        } else {
                            statePc = 258;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_257) {
                        caughtException = stateCaught_257;
                        statePc = 259;
                        continue stateLoop;
                    }
                }
                case 258: {
                    try {
                        stackOut_258_0 = stackIn_258_0;
                        stackOut_258_1 = stackIn_258_1;
                        stackOut_258_2 = stackIn_258_2;
                        stackOut_258_3 = 1;
                        stackIn_261_0 = stackOut_258_0;
                        stackIn_261_1 = stackOut_258_1;
                        stackIn_261_2 = stackOut_258_2;
                        stackIn_261_3 = stackOut_258_3;
                        statePc = 261;
                        continue stateLoop;
                    } catch (Throwable stateCaught_258) {
                        caughtException = stateCaught_258;
                        statePc = 259;
                        continue stateLoop;
                    }
                }
                case 259: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_259) {
                        caughtException = stateCaught_259;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 260: {
                    try {
                        stackOut_260_0 = stackIn_260_0;
                        stackOut_260_1 = stackIn_260_1;
                        stackOut_260_2 = stackIn_260_2;
                        stackOut_260_3 = 0;
                        stackIn_261_0 = stackOut_260_0;
                        stackIn_261_1 = stackOut_260_1;
                        stackIn_261_2 = stackOut_260_2;
                        stackIn_261_3 = stackOut_260_3;
                        statePc = 261;
                        continue stateLoop;
                    } catch (Throwable stateCaught_260) {
                        caughtException = stateCaught_260;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 261: {
                    try {
                        ja.a(stackIn_261_0, stackIn_261_1, (byte) stackIn_261_2, stackIn_261_3 != 0, var5_ref_di__);
                        statePc = 262;
                        continue stateLoop;
                    } catch (Throwable stateCaught_261) {
                        caughtException = stateCaught_261;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 262: {
                    try {
                        if (var7 == 0) {
                            statePc = 167;
                        } else {
                            statePc = 263;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_262) {
                        caughtException = stateCaught_262;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 263: {
                    try {
                        if (-59 != (hc.field_c ^ -1)) {
                            statePc = 267;
                        } else {
                            statePc = 264;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_263) {
                        caughtException = stateCaught_263;
                        statePc = 266;
                        continue stateLoop;
                    }
                }
                case 264: {
                    try {
                        hm.a(0);
                        if (var7 == 0) {
                            statePc = 167;
                        } else {
                            statePc = 265;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_264) {
                        caughtException = stateCaught_264;
                        statePc = 266;
                        continue stateLoop;
                    }
                }
                case 265: {
                    try {
                        statePc = 267;
                        continue stateLoop;
                    } catch (Throwable stateCaught_265) {
                        caughtException = stateCaught_265;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 266: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_266) {
                        caughtException = stateCaught_266;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 267: {
                    try {
                        if (61 == hc.field_c) {
                            statePc = 270;
                        } else {
                            statePc = 268;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_267) {
                        caughtException = stateCaught_267;
                        statePc = 269;
                        continue stateLoop;
                    }
                }
                case 268: {
                    try {
                        statePc = 277;
                        continue stateLoop;
                    } catch (Throwable stateCaught_268) {
                        caughtException = stateCaught_268;
                        statePc = 269;
                        continue stateLoop;
                    }
                }
                case 269: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_269) {
                        caughtException = stateCaught_269;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 270: {
                    try {
                        var2_ref2 = (lb) (Object) ra.field_c.a(-21030);
                        var3 = ra.field_c.k(0);
                        var4 = ra.field_c.c(true);
                        var5 = ra.field_c.h(-111);
                        statePc = 271;
                        continue stateLoop;
                    } catch (Throwable stateCaught_270) {
                        caughtException = stateCaught_270;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 271: {
                    try {
                        if (ra.field_c.c(true) != 1) {
                            statePc = 274;
                        } else {
                            statePc = 272;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_271) {
                        caughtException = stateCaught_271;
                        statePc = 273;
                        continue stateLoop;
                    }
                }
                case 272: {
                    try {
                        stackOut_272_0 = 1;
                        stackIn_275_0 = stackOut_272_0;
                        statePc = 275;
                        continue stateLoop;
                    } catch (Throwable stateCaught_272) {
                        caughtException = stateCaught_272;
                        statePc = 273;
                        continue stateLoop;
                    }
                }
                case 273: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_273) {
                        caughtException = stateCaught_273;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 274: {
                    try {
                        stackOut_274_0 = 0;
                        stackIn_275_0 = stackOut_274_0;
                        statePc = 275;
                        continue stateLoop;
                    } catch (Throwable stateCaught_274) {
                        caughtException = stateCaught_274;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 275: {
                    try {
                        var6 = stackIn_275_0;
                        if (2 != dc.field_z) {
                            statePc = 167;
                        } else {
                            statePc = 276;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_275) {
                        caughtException = stateCaught_275;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 276: {
                    try {
                        ((bg) (Object) bf.field_f[2]).a(var6 != 0, var4, 0, var5, var3, (String) (Object) var2_ref2);
                        if (var7 == 0) {
                            statePc = 167;
                        } else {
                            statePc = 277;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_276) {
                        caughtException = stateCaught_276;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 277: {
                    try {
                        if ((hc.field_c ^ -1) == -63) {
                            statePc = 280;
                        } else {
                            statePc = 278;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_277) {
                        caughtException = stateCaught_277;
                        statePc = 279;
                        continue stateLoop;
                    }
                }
                case 278: {
                    try {
                        statePc = 293;
                        continue stateLoop;
                    } catch (Throwable stateCaught_278) {
                        caughtException = stateCaught_278;
                        statePc = 279;
                        continue stateLoop;
                    }
                }
                case 279: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_279) {
                        caughtException = stateCaught_279;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 280: {
                    try {
                        af.a((byte) 9);
                        var2_ref2 = (lb) (Object) new pj((ec) (Object) ra.field_c, true);
                        statePc = 281;
                        continue stateLoop;
                    } catch (Throwable stateCaught_280) {
                        caughtException = stateCaught_280;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 281: {
                    try {
                        if (null == ik.field_e) {
                            statePc = 286;
                        } else {
                            statePc = 282;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_281) {
                        caughtException = stateCaught_281;
                        statePc = 285;
                        continue stateLoop;
                    }
                }
                case 282: {
                    try {
                        stackOut_282_0 = ik.field_e;
                        stackIn_283_0 = stackOut_282_0;
                        statePc = 283;
                        continue stateLoop;
                    } catch (Throwable stateCaught_282) {
                        caughtException = stateCaught_282;
                        statePc = 285;
                        continue stateLoop;
                    }
                }
                case 283: {
                    try {
                        if (stackIn_283_0.field_Y.field_f == ((pj) (Object) var2_ref2).field_f) {
                            statePc = 289;
                        } else {
                            statePc = 284;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_283) {
                        caughtException = stateCaught_283;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 284: {
                    try {
                        statePc = 286;
                        continue stateLoop;
                    } catch (Throwable stateCaught_284) {
                        caughtException = stateCaught_284;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 285: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_285) {
                        caughtException = stateCaught_285;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 286: {
                    try {
                        ik.field_e = new go(true, (pj) (Object) var2_ref2);
                        if (var7 == 0) {
                            statePc = 292;
                        } else {
                            statePc = 287;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_286) {
                        caughtException = stateCaught_286;
                        statePc = 291;
                        continue stateLoop;
                    }
                }
                case 287: {
                    try {
                        statePc = 289;
                        continue stateLoop;
                    } catch (Throwable stateCaught_287) {
                        caughtException = stateCaught_287;
                        statePc = 291;
                        continue stateLoop;
                    }
                }
                case 288: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_288) {
                        caughtException = stateCaught_288;
                        statePc = 291;
                        continue stateLoop;
                    }
                }
                case 289: {
                    try {
                        ik.field_e = new go(true, (pj) (Object) var2_ref2, ik.field_e);
                        statePc = 290;
                        continue stateLoop;
                    } catch (Throwable stateCaught_289) {
                        caughtException = stateCaught_289;
                        statePc = 291;
                        continue stateLoop;
                    }
                }
                case 290: {
                    try {
                        statePc = 292;
                        continue stateLoop;
                    } catch (Throwable stateCaught_290) {
                        caughtException = stateCaught_290;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 291: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_291) {
                        caughtException = stateCaught_291;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 292: {
                    try {
                        gd.a(dc.field_z, 0, -1, false);
                        kh.field_s = false;
                        nf.field_A = true;
                        if (var7 == 0) {
                            statePc = 167;
                        } else {
                            statePc = 293;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_292) {
                        caughtException = stateCaught_292;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 293: {
                    try {
                        if (-73 != (hc.field_c ^ -1)) {
                            statePc = 304;
                        } else {
                            statePc = 294;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_293) {
                        caughtException = stateCaught_293;
                        statePc = 296;
                        continue stateLoop;
                    }
                }
                case 294: {
                    try {
                        if (nf.field_A) {
                            statePc = 299;
                        } else {
                            statePc = 295;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_294) {
                        caughtException = stateCaught_294;
                        statePc = 298;
                        continue stateLoop;
                    }
                }
                case 295: {
                    try {
                        statePc = 297;
                        continue stateLoop;
                    } catch (Throwable stateCaught_295) {
                        caughtException = stateCaught_295;
                        statePc = 298;
                        continue stateLoop;
                    }
                }
                case 296: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_296) {
                        caughtException = stateCaught_296;
                        statePc = 298;
                        continue stateLoop;
                    }
                }
                case 297: {
                    try {
                        statePc = 303;
                        continue stateLoop;
                    } catch (Throwable stateCaught_297) {
                        caughtException = stateCaught_297;
                        statePc = 298;
                        continue stateLoop;
                    }
                }
                case 298: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_298) {
                        caughtException = stateCaught_298;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 299: {
                    try {
                        af.a((byte) 14);
                        if (nf.field_A) {
                            statePc = 302;
                        } else {
                            statePc = 300;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_299) {
                        caughtException = stateCaught_299;
                        statePc = 301;
                        continue stateLoop;
                    }
                }
                case 300: {
                    try {
                        statePc = 303;
                        continue stateLoop;
                    } catch (Throwable stateCaught_300) {
                        caughtException = stateCaught_300;
                        statePc = 301;
                        continue stateLoop;
                    }
                }
                case 301: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_301) {
                        caughtException = stateCaught_301;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 302: {
                    try {
                        nf.field_A = false;
                        ik.field_e.a(17158, false);
                        gh.field_f = true;
                        statePc = 303;
                        continue stateLoop;
                    } catch (Throwable stateCaught_302) {
                        caughtException = stateCaught_302;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 303: {
                    try {
                        kh.field_s = false;
                        if (var7 == 0) {
                            statePc = 167;
                        } else {
                            statePc = 304;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_303) {
                        caughtException = stateCaught_303;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 304: {
                    try {
                        if (!nf.field_A) {
                            statePc = 315;
                        } else {
                            statePc = 305;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_304) {
                        caughtException = stateCaught_304;
                        statePc = 308;
                        continue stateLoop;
                    }
                }
                case 305: {
                    try {
                        stackOut_305_0 = null;
                        stackIn_306_0 = stackOut_305_0;
                        statePc = 306;
                        continue stateLoop;
                    } catch (Throwable stateCaught_305) {
                        caughtException = stateCaught_305;
                        statePc = 308;
                        continue stateLoop;
                    }
                }
                case 306: {
                    try {
                        if (stackIn_306_0 == (Object) (Object) ik.field_e) {
                            statePc = 315;
                        } else {
                            statePc = 307;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_306) {
                        caughtException = stateCaught_306;
                        statePc = 311;
                        continue stateLoop;
                    }
                }
                case 307: {
                    try {
                        statePc = 309;
                        continue stateLoop;
                    } catch (Throwable stateCaught_307) {
                        caughtException = stateCaught_307;
                        statePc = 311;
                        continue stateLoop;
                    }
                }
                case 308: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_308) {
                        caughtException = stateCaught_308;
                        statePc = 311;
                        continue stateLoop;
                    }
                }
                case 309: {
                    try {
                        if (!ik.field_e.j(0)) {
                            statePc = 315;
                        } else {
                            statePc = 310;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_309) {
                        caughtException = stateCaught_309;
                        statePc = 314;
                        continue stateLoop;
                    }
                }
                case 310: {
                    try {
                        statePc = 312;
                        continue stateLoop;
                    } catch (Throwable stateCaught_310) {
                        caughtException = stateCaught_310;
                        statePc = 314;
                        continue stateLoop;
                    }
                }
                case 311: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_311) {
                        caughtException = stateCaught_311;
                        statePc = 314;
                        continue stateLoop;
                    }
                }
                case 312: {
                    try {
                        if (var7 == 0) {
                            statePc = 167;
                        } else {
                            statePc = 313;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_312) {
                        caughtException = stateCaught_312;
                        statePc = 314;
                        continue stateLoop;
                    }
                }
                case 313: {
                    try {
                        statePc = 315;
                        continue stateLoop;
                    } catch (Throwable stateCaught_313) {
                        caughtException = stateCaught_313;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 314: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_314) {
                        caughtException = stateCaught_314;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 315: {
                    try {
                        ((DungeonAssault) this).d(true);
                        if (var7 == 0) {
                            statePc = 167;
                        } else {
                            statePc = 316;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_315) {
                        caughtException = stateCaught_315;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 316: {
                    try {
                        stackOut_316_0 = 0;
                        stackOut_316_1 = 0;
                        stackIn_317_0 = stackOut_316_0;
                        stackIn_317_1 = stackOut_316_1;
                        statePc = 317;
                        continue stateLoop;
                    } catch (Throwable stateCaught_316) {
                        caughtException = stateCaught_316;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 317: {
                    try {
                        op.a(stackIn_317_0, stackIn_317_1);
                        if (!dm.c(81)) {
                            statePc = 358;
                        } else {
                            statePc = 318;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_317) {
                        caughtException = stateCaught_317;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 318: {
                    try {
                        var2_int = ((DungeonAssault) this).f((byte) 101);
                        statePc = 319;
                        continue stateLoop;
                    } catch (Throwable stateCaught_318) {
                        caughtException = stateCaught_318;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 319: {
                    try {
                        if (-1 == (var2_int ^ -1)) {
                            statePc = 324;
                        } else {
                            statePc = 320;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_319) {
                        caughtException = stateCaught_319;
                        statePc = 323;
                        continue stateLoop;
                    }
                }
                case 320: {
                    try {
                        stackOut_320_0 = var2_int;
                        stackIn_321_0 = stackOut_320_0;
                        statePc = 321;
                        continue stateLoop;
                    } catch (Throwable stateCaught_320) {
                        caughtException = stateCaught_320;
                        statePc = 323;
                        continue stateLoop;
                    }
                }
                case 321: {
                    try {
                        if (stackIn_321_0 != 1) {
                            statePc = 341;
                        } else {
                            statePc = 322;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_321) {
                        caughtException = stateCaught_321;
                        statePc = 326;
                        continue stateLoop;
                    }
                }
                case 322: {
                    try {
                        statePc = 324;
                        continue stateLoop;
                    } catch (Throwable stateCaught_322) {
                        caughtException = stateCaught_322;
                        statePc = 326;
                        continue stateLoop;
                    }
                }
                case 323: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_323) {
                        caughtException = stateCaught_323;
                        statePc = 326;
                        continue stateLoop;
                    }
                }
                case 324: {
                    try {
                        if (!ed.c(true)) {
                            statePc = 329;
                        } else {
                            statePc = 325;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_324) {
                        caughtException = stateCaught_324;
                        statePc = 328;
                        continue stateLoop;
                    }
                }
                case 325: {
                    try {
                        statePc = 327;
                        continue stateLoop;
                    } catch (Throwable stateCaught_325) {
                        caughtException = stateCaught_325;
                        statePc = 328;
                        continue stateLoop;
                    }
                }
                case 326: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_326) {
                        caughtException = stateCaught_326;
                        statePc = 328;
                        continue stateLoop;
                    }
                }
                case 327: {
                    try {
                        statePc = 330;
                        continue stateLoop;
                    } catch (Throwable stateCaught_327) {
                        caughtException = stateCaught_327;
                        statePc = 328;
                        continue stateLoop;
                    }
                }
                case 328: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_328) {
                        caughtException = stateCaught_328;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 329: {
                    try {
                        gm.field_d = null;
                        statePc = 330;
                        continue stateLoop;
                    } catch (Throwable stateCaught_329) {
                        caughtException = stateCaught_329;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 330: {
                    try {
                        if (-2 == (var2_int ^ -1)) {
                            statePc = 338;
                        } else {
                            statePc = 331;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_330) {
                        caughtException = stateCaught_330;
                        statePc = 333;
                        continue stateLoop;
                    }
                }
                case 331: {
                    try {
                        if (!nf.field_A) {
                            statePc = 337;
                        } else {
                            statePc = 332;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_331) {
                        caughtException = stateCaught_331;
                        statePc = 336;
                        continue stateLoop;
                    }
                }
                case 332: {
                    try {
                        statePc = 334;
                        continue stateLoop;
                    } catch (Throwable stateCaught_332) {
                        caughtException = stateCaught_332;
                        statePc = 336;
                        continue stateLoop;
                    }
                }
                case 333: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_333) {
                        caughtException = stateCaught_333;
                        statePc = 336;
                        continue stateLoop;
                    }
                }
                case 334: {
                    try {
                        gh.field_f = true;
                        gd.a(0, 0, 0, false);
                        statePc = 335;
                        continue stateLoop;
                    } catch (Throwable stateCaught_334) {
                        caughtException = stateCaught_334;
                        statePc = 336;
                        continue stateLoop;
                    }
                }
                case 335: {
                    try {
                        statePc = 337;
                        continue stateLoop;
                    } catch (Throwable stateCaught_335) {
                        caughtException = stateCaught_335;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 336: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_336) {
                        caughtException = stateCaught_336;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 337: {
                    try {
                        kh.field_s = false;
                        if (var7 == 0) {
                            statePc = 341;
                        } else {
                            statePc = 338;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_337) {
                        caughtException = stateCaught_337;
                        statePc = 340;
                        continue stateLoop;
                    }
                }
                case 338: {
                    try {
                        kh.field_s = true;
                        statePc = 339;
                        continue stateLoop;
                    } catch (Throwable stateCaught_338) {
                        caughtException = stateCaught_338;
                        statePc = 340;
                        continue stateLoop;
                    }
                }
                case 339: {
                    try {
                        statePc = 341;
                        continue stateLoop;
                    } catch (Throwable stateCaught_339) {
                        caughtException = stateCaught_339;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 340: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_340) {
                        caughtException = stateCaught_340;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 341: {
                    try {
                        var3 = 0;
                        statePc = 342;
                        continue stateLoop;
                    } catch (Throwable stateCaught_341) {
                        caughtException = stateCaught_341;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 342: {
                    try {
                        if (-3 == (var2_int ^ -1)) {
                            statePc = 345;
                        } else {
                            statePc = 343;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_342) {
                        caughtException = stateCaught_342;
                        statePc = 344;
                        continue stateLoop;
                    }
                }
                case 343: {
                    try {
                        statePc = 346;
                        continue stateLoop;
                    } catch (Throwable stateCaught_343) {
                        caughtException = stateCaught_343;
                        statePc = 344;
                        continue stateLoop;
                    }
                }
                case 344: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_344) {
                        caughtException = stateCaught_344;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 345: {
                    try {
                        var3 = 1;
                        statePc = 346;
                        continue stateLoop;
                    } catch (Throwable stateCaught_345) {
                        caughtException = stateCaught_345;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 346: {
                    try {
                        if (kh.field_s) {
                            statePc = 349;
                        } else {
                            statePc = 347;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_346) {
                        caughtException = stateCaught_346;
                        statePc = 348;
                        continue stateLoop;
                    }
                }
                case 347: {
                    try {
                        statePc = 350;
                        continue stateLoop;
                    } catch (Throwable stateCaught_347) {
                        caughtException = stateCaught_347;
                        statePc = 348;
                        continue stateLoop;
                    }
                }
                case 348: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_348) {
                        caughtException = stateCaught_348;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 349: {
                    try {
                        var3 = 1;
                        statePc = 350;
                        continue stateLoop;
                    } catch (Throwable stateCaught_349) {
                        caughtException = stateCaught_349;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 350: {
                    try {
                        if (dm.c(71)) {
                            statePc = 352;
                        } else {
                            statePc = 351;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_350) {
                        caughtException = stateCaught_350;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 351: {
                    try {
                        var3 = 0;
                        statePc = 352;
                        continue stateLoop;
                    } catch (Throwable stateCaught_351) {
                        caughtException = stateCaught_351;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 352: {
                    try {
                        if (var3 == 0) {
                            statePc = 358;
                        } else {
                            statePc = 353;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_352) {
                        caughtException = stateCaught_352;
                        statePc = 355;
                        continue stateLoop;
                    }
                }
                case 353: {
                    try {
                        l.a(-1);
                        statePc = 354;
                        continue stateLoop;
                    } catch (Throwable stateCaught_353) {
                        caughtException = stateCaught_353;
                        statePc = 355;
                        continue stateLoop;
                    }
                }
                case 354: {
                    try {
                        statePc = 358;
                        continue stateLoop;
                    } catch (Throwable stateCaught_354) {
                        caughtException = stateCaught_354;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 355: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_355) {
                        caughtException = stateCaught_355;
                        statePc = 357;
                        continue stateLoop;
                    }
                }
                case 357: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw vk.a((Throwable) (Object) var2, "DungeonAssault.C(" + param0 + 41);
                }
                case 358: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0) {
        tc var2 = null;
        RuntimeException var2_ref = null;
        int stackIn_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        ((DungeonAssault) this).a(false, 32, 8, 2, 17, 0, 5000, 1);
                        var2 = new tc();
                        var2.field_A.c((byte) 7, 128, 9);
                        var2.field_B.c((byte) -120, 128, 9);
                        af.a(true, var2, 22050, 22050, (java.awt.Component) (Object) c.field_h, -126, 2048, i.field_A);
                        cm.a(1.600000023841858f, 0.9200000166893005f, -7788, 0.10000000149011612f, 25.0f);
                        he.field_p = 16711680;
                        dc.field_l = 128;
                        ui.field_b = 4473924;
                        il.field_a = 255;
                        om.field_a = 16777215;
                        sm.field_c = 16776960;
                        j.f((byte) -4);
                        kd.b(0);
                        ((DungeonAssault) this).b(true, (byte) -67);
                        uo.field_c[70] = 0;
                        uo.field_c[55] = 704;
                        uo.field_c[57] = -2;
                        uo.field_c[66] = 2;
                        uo.field_c[54] = -1;
                        uo.field_c[67] = 9;
                        uo.field_c[62] = -2;
                        uo.field_c[59] = 8;
                        uo.field_c[56] = -2;
                        uo.field_c[72] = 0;
                        uo.field_c[65] = -1;
                        kj.field_n = 0;
                        uo.field_c[58] = 0;
                        uo.field_c[61] = -1;
                        uo.field_c[68] = 3;
                        uo.field_c[63] = 10;
                        if (param0 <= -15) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        if (2 > nh.field_k) {
                            statePc = 5;
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
                        stackOut_3_0 = 1;
                        stackIn_6_0 = stackOut_3_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = 0;
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
                        ll.field_k = stackIn_6_0 != 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var2_ref = (RuntimeException) (Object) caughtException;
                    throw vk.a((Throwable) (Object) var2_ref, "DungeonAssault.A(" + param0 + 41);
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void init() {
        try {
            ((DungeonAssault) this).a(32, "dungeonassault", 0);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "DungeonAssault.init()");
        }
    }

    final void b(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
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
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        DungeonAssault.h((byte) 114);
                        a.a(23779);
                        md.h(-4);
                        tc.a((byte) -86);
                        rl.a((byte) 75);
                        vj.a(24243);
                        nb.a((byte) 109);
                        td.a(23);
                        qe.a();
                        te.a();
                        gh.a(7);
                        og.a(-129);
                        sb.a((byte) -88);
                        fo.a((byte) -73);
                        t.a(-11353);
                        jh.a();
                        in.e(-1);
                        b.b(-30719);
                        kg.a(false);
                        tl.a((byte) 50);
                        mh.a(16);
                        nl.a((byte) -109);
                        gf.c();
                        nh.a(param0);
                        se.a();
                        ig.a(-2898);
                        dm.b(0);
                        ec.i(25);
                        kd.a((byte) -101);
                        sp.a(true);
                        ml.a((byte) 63);
                        ri.a(105);
                        sn.a(5);
                        ib.d(507);
                        ta.a(-84);
                        to.a(0);
                        kp.b(0);
                        cg.a((byte) -117);
                        la.c((byte) -97);
                        op.a((byte) -120);
                        mp.a((byte) 112);
                        sl.a(105);
                        gj.a((byte) 80);
                        c.a(-9431);
                        wk.b(false);
                        ek.a((byte) -115);
                        bn.a((byte) -122);
                        go.f(10);
                        lb.a((byte) 119);
                        hi.a(-113);
                        ea.a(0);
                        ke.a(-123);
                        n.a(3554);
                        hb.a((byte) 3);
                        ai.a((byte) 106);
                        jc.a(0);
                        ua.a((byte) 103);
                        ne.b(-18880);
                        qj.a(-2418);
                        bc.a(24740);
                        lc.a(true);
                        ja.a(param0);
                        lg.a(true);
                        eh.a(73);
                        sg.a((byte) -88);
                        if (param0) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 22;
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
                        statePc = 22;
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
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        f.a(stackIn_4_0 != 0);
                        fp.a(-4126);
                        pp.e(73);
                        gd.e(0);
                        nn.b((byte) -80);
                        kl.a(117);
                        rj.b(false);
                        sa.b(false);
                        ug.e(0);
                        wa.c(23413);
                        lp.a((byte) 16);
                        vm.d();
                        hg.d(26609);
                        vn.e();
                        cb.a(27525);
                        ae.a((byte) -4);
                        ko.d(-125);
                        qk.a((byte) 127);
                        uf.b(0);
                        gm.a(-94);
                        pj.e(126);
                        mo.a(2);
                        ul.a(true);
                        jg.a((byte) -126);
                        hd.b((byte) 117);
                        uj.a(37);
                        cd.a(-1);
                        vc.a(-6058);
                        mi.c(-128);
                        fd.a((byte) 65);
                        hl.a(50);
                        rk.a(true);
                        wj.n(7);
                        qc.a(0);
                        dd.c((byte) -40);
                        en.a(0);
                        d.a(0);
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
                        statePc = 22;
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
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        p.d(stackIn_8_0 != 0);
                        ed.f((byte) -89);
                        ih.e(-2431);
                        bg.b(41);
                        pd.c((byte) 71);
                        le.a(103);
                        di.a((byte) -78);
                        db.c((byte) 127);
                        wo.a((byte) 100);
                        jm.a((byte) -123);
                        ud.a((byte) -124);
                        tk.b((byte) 10);
                        ob.g(16);
                        fi.a((byte) -106);
                        qp.b((byte) 56);
                        qd.a(true);
                        ji.f((byte) -98);
                        jb.p(-71);
                        wi.i((byte) -97);
                        jk.n(-18554);
                        nk.n(2121792);
                        rg.h((byte) -53);
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
                        statePc = 22;
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
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ia.b(stackIn_12_0 != 0);
                        dn.f((byte) -108);
                        gk.b(param0);
                        lh.a(-107);
                        so.a((byte) 95);
                        df.a(255);
                        fj.a((byte) -75);
                        ff.c(-103);
                        hj.f(16744448);
                        lo.a(114);
                        ll.a((byte) 92);
                        rd.b(true);
                        s.a(-55);
                        pa.a(2601);
                        ka.a((byte) -67);
                        bk.a(param0);
                        il.a((byte) 111);
                        bb.a((byte) 127);
                        cc.b(-86);
                        je.a(true);
                        tm.a(-107);
                        uk.a(0);
                        qa.b(-2544);
                        ld.a(false);
                        hc.a(32);
                        nm.n(38);
                        vd.a((byte) -96);
                        hh.b(1);
                        re.c();
                        jp.a();
                        sm.a((byte) -118);
                        qh.b((byte) 75);
                        jj.a((byte) 80);
                        rn.b(64);
                        om.a(63);
                        mn.b((byte) 94);
                        jl.a((byte) -113);
                        li.a(false);
                        ok.f(-16218);
                        tb.b((byte) -47);
                        ql.b((byte) 20);
                        ik.a(0);
                        ra.a((byte) -114);
                        un.a((byte) 23);
                        ej.a();
                        dc.a((byte) 108);
                        oe.a(0);
                        kn.a(0);
                        nj.a((byte) 84);
                        oh.a(37);
                        an.c(-13023);
                        jn.a(1);
                        im.a(-1);
                        l.a((byte) -24);
                        lm.d((byte) -123);
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
                        statePc = 22;
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
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ck.b(stackIn_16_0 != 0);
                        da.a(6);
                        sj.g((byte) -10);
                        rf.b(param0);
                        ii.e((byte) -21);
                        dj.a((byte) 113);
                        am.a(30111);
                        nd.b();
                        vb.a((byte) -69);
                        nf.e((byte) 93);
                        hk.a(-73);
                        gb.a(32767);
                        eg.d(-23658);
                        hp.a(35);
                        no.a((byte) -126);
                        um.a(false);
                        wl.a(98);
                        fg.d(-102);
                        kf.b(false);
                        ag.a(16760896);
                        ki.a((byte) -35);
                        sf.c((byte) 114);
                        lj.d(77);
                        ro.f((byte) -88);
                        oj.a((byte) -29);
                        uo.a(-90);
                        gl.c((byte) -105);
                        oc.e(4296);
                        dl.a(51);
                        tp.h(35);
                        up.a(false);
                        em.c(true);
                        ln.b(1148357992);
                        co.e(96);
                        ti.a(true);
                        sh.a(false);
                        vf.d(21);
                        dg.b(false);
                        uh.i((byte) -41);
                        rm.m(4);
                        hf.m(0);
                        uc.c(false);
                        gi.f((byte) -32);
                        bh.f((byte) -106);
                        ng.f((byte) 124);
                        tn.h((byte) -89);
                        rb.a(4935);
                        ip.c((byte) 19);
                        mf.a(5);
                        cm.j(-119);
                        mk.b(false);
                        wg.a();
                        kk.a(0);
                        of.a((byte) 65);
                        ah.a(-37);
                        np.c((byte) -74);
                        fk.d(67);
                        j.g((byte) -7);
                        eb.f((byte) 86);
                        ol.a((byte) -96);
                        fe.b((byte) -34);
                        ep.a(124);
                        bp.a(-1);
                        oi.h(119);
                        bj.h(31029);
                        ad.a(1);
                        qi.a(true);
                        dh.a(20);
                        wf.d((byte) -28);
                        pb.e((byte) -78);
                        ha.c(64);
                        rc.a((byte) -127);
                        rp.b((byte) -68);
                        g.g(-101);
                        oo.a(13054);
                        bi.a();
                        ho.a(0);
                        id.a((byte) -90);
                        fa.a(-28822);
                        wm.a((byte) 112);
                        gg.a(0);
                        hm.d(269);
                        tf.a(-1);
                        k.a(true);
                        fm.a(param0);
                        cf.a(30);
                        o.d(0);
                        wh.b(96);
                        na.c(-91);
                        oa.a((byte) 126);
                        mc.c(24);
                        ic.d(4741);
                        dk.a((byte) -107);
                        sd.b(false);
                        al.a((byte) 17);
                        fn.d(1);
                        mj.a(127);
                        bo.c((byte) -36);
                        pm.a(112);
                        bl.d((byte) -128);
                        jd.a(1);
                        h.a((byte) 16);
                        ac.a(19757);
                        af.a(0);
                        vk.b((byte) 75);
                        wd.a(115);
                        fl.a((byte) 63);
                        gn.a(194);
                        ie.d(-102);
                        lf.d(-121);
                        pk.e(88);
                        ce.d((byte) 58);
                        bf.a((byte) 85);
                        me.a(36);
                        ef.a((byte) 111);
                        ao.d(10625);
                        ba.a((byte) 117);
                        ch.c(0);
                        sc.b((byte) -94);
                        vl.a((byte) -115);
                        e.c((byte) 29);
                        qf.b(-21);
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
                        statePc = 22;
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
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        jf.a(stackIn_20_0 != 0);
                        fc.b(18677);
                        bd.b(76);
                        cp.c((byte) -66);
                        u.c((byte) 96);
                        lk.h(25161);
                        kc.a(0);
                        pe.a(9);
                        ak.a(-120);
                        ve.a(-125);
                        r.a(-113);
                        i.a((byte) 122);
                        kj.a(-109);
                        mm.a(127);
                        ub.a((byte) 123);
                        ue.a((byte) 36);
                        pi.a(11877);
                        tg.a(400);
                        kh.e((byte) 102);
                        vo.e(1);
                        qm.d(false);
                        ga.d((byte) 75);
                        he.d((byte) 117);
                        be.e(-15818);
                        fb.a(25);
                        ci.a(116);
                        od.b((byte) 106);
                        m.d(-1);
                        ab.b(1781937827);
                        ((DungeonAssault) this).field_p = null;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw vk.a((Throwable) (Object) var2, "DungeonAssault.B(" + param0 + 41);
                }
                case 23: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public DungeonAssault() {
    }

    private final boolean h(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_59_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_58_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = field_K;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        he.e(param0 + -23487);
                        if (!tf.a((java.applet.Applet) this, 1041792321)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = 0;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        ai.a(param0 + -78);
                        var2_int = param0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-15 >= (var2_int ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = var2_int ^ -1;
                        stackOut_8_1 = -5;
                        stackIn_54_0 = stackOut_8_0;
                        stackIn_54_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (var3 != 0) {
                            statePc = 54;
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
                        if (stackIn_9_0 == stackIn_9_1) {
                            statePc = 45;
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
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var2_int == 5) {
                            statePc = 42;
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
                case 15: {
                    try {
                        if (var2_int == 2) {
                            statePc = 39;
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
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (-4 != (var2_int ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        bf.field_f[var2_int] = (qe) (Object) new db();
                        if (var3 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var2_int == 13) {
                            statePc = 36;
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
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var2_int == 7) {
                            statePc = 33;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        bf.field_f[var2_int] = (qe) (Object) new qc(var2_int);
                        if (var3 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        bf.field_f[var2_int] = (qe) (Object) new fi();
                        if (var3 == 0) {
                            statePc = 48;
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
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        bf.field_f[var2_int] = (qe) (Object) new ud();
                        if (var3 == 0) {
                            statePc = 48;
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
                        bf.field_f[var2_int] = (qe) (Object) new bg();
                        if (var3 == 0) {
                            statePc = 48;
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
                        bf.field_f[var2_int] = (qe) (Object) new ih();
                        if (var3 == 0) {
                            statePc = 48;
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
                        bf.field_f[var2_int] = (qe) (Object) new p();
                        statePc = 46;
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
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var2_int++;
                        if (var3 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        mn.field_b = 13;
                        dc.field_z = 13;
                        bf.field_f[13].b(false);
                        if (!ed.c(true)) {
                            statePc = 53;
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
                        gm.field_d = null;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        ag.a(50, 55);
                        nf.d(param0 + 0);
                        pn discarded$1 = i.field_A.a((java.awt.Component) (Object) c.field_h, (byte) 25, false);
                        gi.field_R = c.field_h;
                        ll.a(-26);
                        stackOut_53_0 = nh.field_k;
                        stackOut_53_1 = 2;
                        stackIn_54_0 = stackOut_53_0;
                        stackIn_54_1 = stackOut_53_1;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (stackIn_54_0 < stackIn_54_1) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackOut_55_0 = 1;
                        stackIn_58_0 = stackOut_55_0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = 0;
                        stackIn_58_0 = stackOut_57_0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        ll.field_k = stackIn_58_0 != 0;
                        stackOut_58_0 = 1;
                        stackIn_59_0 = stackOut_58_0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 59: {
                    return stackIn_59_0 != 0;
                }
                case 60: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw vk.a((Throwable) (Object) var2, "DungeonAssault.G(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(boolean param0) {
        RuntimeException var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        wh.a(96);
                        if (null != cm.field_R) {
                            statePc = 3;
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
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ib.a(930);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        kp.a(1);
                        if (param0) {
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
                        field_G = null;
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
                    throw vk.a((Throwable) (Object) var2, "DungeonAssault.F(" + param0 + 41);
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        java.awt.Canvas var2_ref = null;
        int var3_int = 0;
        a var3 = null;
        int var4_int = 0;
        cn var4 = null;
        long var4_long = 0L;
        cn var5 = null;
        int var5_int = 0;
        int var6 = 0;
        long var6_long = 0L;
        long var8 = 0L;
        int var10 = 0;
        int stackIn_40_0 = 0;
        int stackIn_45_0 = 0;
        int stackOut_37_0 = 0;
        boolean stackOut_39_0 = false;
        int stackOut_44_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = field_K;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_ref = fi.d(false);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (ao.a((byte) 72)) {
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
                        statePc = 7;
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
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        mf.a((byte) -101, md.f(20), var2_ref);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        if (ef.field_h) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        g.a(var2_ref, 18131);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        if (param0 == 38) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.c(true, (byte) -98);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (!hc.b(1)) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        tp.a(10, 100.0f, kj.field_m);
                        g.a(var2_ref, param0 + 18093);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return;
                }
                case 19: {
                    try {
                        li.field_k = li.field_k + 1;
                        if ((fm.field_a ^ -1) != (bn.field_n ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        qp.a((byte) -24, mn.field_b, true);
                        if (co.field_G == null) {
                            statePc = 29;
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
                        co.field_G.a(true, bd.field_f);
                        bd.field_f = bd.field_f + 1;
                        if ((bd.field_f ^ -1) == -65) {
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
                        statePc = 29;
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
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        af.a((byte) 127);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (ib.a((byte) 35)) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
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
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        gf.g(0, 0, gf.field_i, gf.field_c);
                        var3_int = 15 + la.a((byte) -105);
                        var4_int = 30 + og.b(4);
                        fm.a(ea.a((byte) 13), var3_int, var4_int, (byte) -127);
                        ci.a((byte) -119);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (!sl.b(15000)) {
                            statePc = 41;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (cm.field_R == null) {
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
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
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
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackOut_39_0 = rj.field_o;
                        stackIn_40_0 = stackOut_39_0 ? 1 : 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        fl.a(stackIn_40_0 != 0, (byte) 120);
                        if (var10 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (!ue.b((byte) -112)) {
                            statePc = 51;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackOut_44_0 = 109;
                        stackIn_45_0 = stackOut_44_0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (ib.a((byte) stackIn_45_0)) {
                            statePc = 51;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        gf.g(0, 0, gf.field_i, gf.field_c);
                        rc.a(-126);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if ((fm.field_a ^ -1) != (fm.field_e ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var3_int = pk.field_t * 256 / 16;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (-1 <= (var3_int ^ -1)) {
                            statePc = 59;
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
                        gf.b(0, 0, gf.field_i, gf.field_c, 0, var3_int);
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
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var3 = (a) (Object) wl.field_a.e(-24172);
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var3 != null) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (null != sl.field_b) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        ah.a(true, var3.field_j);
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var4_int = 0;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (40 <= ke.field_e) {
                            statePc = 71;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 84;
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
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (80 > ke.field_e) {
                            statePc = 83;
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
                        if (230 <= ke.field_e) {
                            statePc = 78;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        ec.field_j[var3.field_j].a(8, 0, 32, 32);
                        if (var10 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if ((ke.field_e ^ -1) <= -271) {
                            statePc = 82;
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
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var5_int = (-ke.field_e + 270 << 1242091112) / 40;
                        var4_int = 1;
                        ri.field_g.d(8, 0, 32, 32, var5_int);
                        if (var10 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var4_int = 1;
                        if (var10 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var5_int = (ke.field_e - 40 << -1181835704) / 40;
                        ri.field_g.d(8, 0, 32, 32, var5_int);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if ((1 & li.field_k) != 0) {
                            statePc = 94;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (var4_int == 0) {
                            statePc = 91;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        sl.field_b.b();
                        if (var10 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        sl.field_b.a(pa.field_a, 0, 0);
                        if (var10 == 0) {
                            statePc = 97;
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
                        sl.field_b.a();
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (40 > ke.field_e) {
                            statePc = 116;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (80 <= ke.field_e) {
                            statePc = 103;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var5_int = (-40 + ke.field_e << -775969368) / 40;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        ne.field_c.a(ce.field_o[var3.field_j], 48, 32 - -ne.field_c.field_H >> 353864929, 0, -1, var5_int >> -1411473855);
                        if (var10 == 0) {
                            statePc = 116;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (ke.field_e < 230) {
                            statePc = 113;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (270 > ke.field_e) {
                            statePc = 111;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var5_int = (-ke.field_e + 270 << -1383847032) / 40;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        ne.field_c.a(ce.field_o[var3.field_j], 48, 32 - -ne.field_c.field_H >> -1769618047, 0, -1, var5_int >> -144553759);
                        if (var10 == 0) {
                            statePc = 116;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        ne.field_c.a(ce.field_o[var3.field_j], 48, 32 + ne.field_c.field_H >> -1332287519, 0, -1, 128);
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if ((nh.field_k ^ -1) > -3) {
                            statePc = 121;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (!ld.field_b) {
                            statePc = 121;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        ne.field_c.b(Integer.toString(bc.field_a), 20, 20, 16777215, 1);
                        var4_long = Runtime.getRuntime().totalMemory();
                        var6_long = Runtime.getRuntime().freeMemory();
                        var8 = var4_long - var6_long;
                        ne.field_c.b((int)(var8 >> 319390474) + "kb", 4, ne.field_c.field_H * 2 + 8, 16777215, -1);
                        ne.field_c.b(tc.field_u, 20, 80, 16777215, 1);
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var4 = kh.field_m[kj.field_n / 5];
                        var5 = jg.field_c[kj.field_n / 5];
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (0 != (hj.field_S ^ -1)) {
                            statePc = 125;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        var6 = (int)((3.0 + Math.cos((double)((float)mo.field_a / 20.0f))) * 64.0);
                        var5.b(hj.field_S, eh.field_h, var6);
                        var4.h(hj.field_S, eh.field_h);
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        ob.a(0, param0 + -161, var2_ref, 0);
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 128: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw vk.a((Throwable) (Object) var2, "DungeonAssault.D(" + param0 + 41);
                }
                case 129: {
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
        field_J = "Beastman";
        field_G = "<col=E5A634>Your title, </col><%0><col=E5A634>, will appear in the Dragons of Renown table.";
        field_H = "Trap";
    }
}
