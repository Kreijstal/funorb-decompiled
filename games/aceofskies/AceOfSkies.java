/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class AceOfSkies extends ct {
    static volatile boolean field_J;
    public static boolean field_G;

    public final void init() {
        try {
            ((AceOfSkies) this).a((byte) -60, "aceofskies", 13);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "AceOfSkies.init()");
        }
    }

    private final boolean a(byte param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_40_0 = 0;
        gk stackIn_43_0 = null;
        int stackIn_49_0 = 0;
        int stackIn_55_0 = 0;
        gk stackIn_58_0 = null;
        int stackIn_64_0 = 0;
        gk stackIn_67_0 = null;
        int stackIn_73_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_82_0 = 0;
        ap[] stackIn_87_0 = null;
        jt stackIn_91_0 = null;
        int stackIn_97_0 = 0;
        Object stackIn_102_0 = null;
        Object stackIn_104_0 = null;
        Object stackIn_105_0 = null;
        ap[] stackIn_105_1 = null;
        int stackIn_112_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_134_0 = 0;
        int stackIn_136_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_39_0 = 0;
        gk stackOut_42_0 = null;
        int stackOut_48_0 = 0;
        int stackOut_54_0 = 0;
        gk stackOut_57_0 = null;
        int stackOut_63_0 = 0;
        gk stackOut_66_0 = null;
        int stackOut_72_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_81_0 = 0;
        ap[] stackOut_86_0 = null;
        jt stackOut_90_0 = null;
        int stackOut_96_0 = 0;
        Object stackOut_101_0 = null;
        Object stackOut_102_0 = null;
        Object stackOut_104_0 = null;
        ap[] stackOut_104_1 = null;
        int stackOut_111_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_135_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = -35 / ((param0 - 1) / 48);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        qq.a((byte) -100);
                        if (jk.field_b != null) {
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
                        statePc = 77;
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
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!hg.field_x.b((byte) 95)) {
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
                        if (hg.field_x.c("basic", -14012)) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
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
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        fh.a(-110, 3.0f, qo.a(co.field_j, "basic", hg.field_x, 13525, lm.field_b));
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0 != 0;
                }
                case 11: {
                    try {
                        if (hg.field_x.c("arialbold14", -14012)) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        fh.a(-124, 4.0f, qo.a(bk.field_g, "arialbold14", hg.field_x, 13525, ks.field_c));
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0 != 0;
                }
                case 14: {
                    try {
                        if (!fg.field_t.b((byte) -119)) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (fg.field_t.c("arialbold14", -14012)) {
                            statePc = 20;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        fh.a(-86, 5.0f, qo.a(bk.field_g, "arialbold14", fg.field_t, 13525, ks.field_c));
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return stackIn_19_0 != 0;
                }
                case 20: {
                    try {
                        if (hg.field_x.c("arial13", -14012)) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        fh.a(-65, 4.0f, qo.a(bk.field_g, "arial13", hg.field_x, 13525, ks.field_c));
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 22: {
                    return stackIn_22_0 != 0;
                }
                case 23: {
                    try {
                        if (!fg.field_t.b((byte) -127)) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (fg.field_t.c("arial13", -14012)) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        fh.a(-46, 5.0f, qo.a(bk.field_g, "arial13", fg.field_t, 13525, ks.field_c));
                        stackOut_27_0 = 0;
                        stackIn_28_0 = stackOut_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 28: {
                    return stackIn_28_0 != 0;
                }
                case 29: {
                    try {
                        if (!jk.field_b.b((byte) 100)) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (jk.field_b.b(0)) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        fh.a(-86, 10.0f, qo.a(pr.field_a, "", jk.field_b, 13525, gk.field_c));
                        stackOut_33_0 = 0;
                        stackIn_34_0 = stackOut_33_0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 34: {
                    return stackIn_34_0 != 0;
                }
                case 35: {
                    try {
                        if (!ub.field_f.b((byte) -73)) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (ub.field_f.b(0)) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        fh.a(-99, 20.0f, qo.a(pr.field_a, "", ub.field_f, 13525, gk.field_c));
                        stackOut_39_0 = 0;
                        stackIn_40_0 = stackOut_39_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 40: {
                    return stackIn_40_0 != 0;
                }
                case 41: {
                    try {
                        if (!ot.field_b.b((byte) 87)) {
                            statePc = 48;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = ot.field_b;
                        stackIn_43_0 = stackOut_42_0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (!((gk) (Object) stackIn_43_0).b(0)) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        fh.a(-117, 30.0f, qf.a(ff.field_a, 0, fn.field_b, ot.field_b, 81));
                        stackOut_48_0 = 0;
                        stackIn_49_0 = stackOut_48_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 49: {
                    return stackIn_49_0 != 0;
                }
                case 50: {
                    try {
                        if (!od.field_x.b((byte) -57)) {
                            statePc = 54;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (od.field_x.b(0)) {
                            statePc = 56;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        fh.a(-65, 40.0f, qo.a(rq.field_a, "", od.field_x, 13525, ei.field_c));
                        stackOut_54_0 = 0;
                        stackIn_55_0 = stackOut_54_0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 55: {
                    return stackIn_55_0 != 0;
                }
                case 56: {
                    try {
                        if (!wi.field_a.b((byte) 92)) {
                            statePc = 63;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = wi.field_a;
                        stackIn_58_0 = stackOut_57_0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (!((gk) (Object) stackIn_58_0).b(0)) {
                            statePc = 63;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 65;
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
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        fh.a(-91, 45.0f, qo.a(co.field_j, "", wi.field_a, 13525, lm.field_b));
                        stackOut_63_0 = 0;
                        stackIn_64_0 = stackOut_63_0;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 64: {
                    return stackIn_64_0 != 0;
                }
                case 65: {
                    try {
                        if (!iq.field_e.b((byte) -111)) {
                            statePc = 72;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackOut_66_0 = iq.field_e;
                        stackIn_67_0 = stackOut_66_0;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (!((gk) (Object) stackIn_67_0).b(0)) {
                            statePc = 72;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        fh.a(-117, 55.0f, qo.a(bk.field_g, "", iq.field_e, 13525, ks.field_c));
                        stackOut_72_0 = 0;
                        stackIn_73_0 = stackOut_72_0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 73: {
                    return stackIn_73_0 != 0;
                }
                case 74: {
                    try {
                        fh.a(-112, 65.0f, er.field_c);
                        ((AceOfSkies) this).e(150);
                        if (param1) {
                            statePc = 77;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackOut_75_0 = 0;
                        stackIn_76_0 = stackOut_75_0;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 76: {
                    return stackIn_76_0 != 0;
                }
                case 77: {
                    try {
                        if (jk.field_b == null) {
                            statePc = 80;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        as.a(-110);
                        qn.field_c = new ob(jk.field_b, ub.field_f);
                        jf.a(-4, ub.field_f, jk.field_b);
                        jk.field_b = null;
                        ub.field_f = null;
                        te.a(34);
                        stackOut_78_0 = 0;
                        stackIn_79_0 = stackOut_78_0;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 79: {
                    return stackIn_79_0 != 0;
                }
                case 80: {
                    try {
                        if (od.field_x == null) {
                            statePc = 83;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        tg.field_a = new ap[3];
                        tg.field_a[0] = ap.a(od.field_x, "", "aos_main_title");
                        tg.field_a[1] = ap.a(od.field_x, "", "aos level_channels_v2");
                        tg.field_a[2] = ap.a(od.field_x, "", "aos boss level");
                        od.field_x = null;
                        te.a(102);
                        stackOut_81_0 = 0;
                        stackIn_82_0 = stackOut_81_0;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 82: {
                    return stackIn_82_0 != 0;
                }
                case 83: {
                    try {
                        if (null == ot.field_b) {
                            statePc = 116;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var4 = 0;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (-4 >= (var4 ^ -1)) {
                            statePc = 99;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackOut_86_0 = tg.field_a;
                        stackIn_87_0 = stackOut_86_0;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (stackIn_87_0[var4] == null) {
                            statePc = 98;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        stackOut_90_0 = wt.field_e;
                        stackIn_91_0 = stackOut_90_0;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (!((jt) (Object) stackIn_91_0).field_n.a(-1, 176400, tg.field_a[var4], ot.field_b, qn.field_c)) {
                            statePc = 96;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        te.a(74);
                        stackOut_96_0 = 0;
                        stackIn_97_0 = stackOut_96_0;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 97: {
                    return stackIn_97_0 != 0;
                }
                case 98: {
                    try {
                        var4++;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        var4 = 0;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if ((var4 ^ -1) <= -4) {
                            statePc = 114;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        stackOut_101_0 = null;
                        stackIn_102_0 = stackOut_101_0;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        stackOut_102_0 = (Object) (Object) stackIn_102_0;
                        stackIn_104_0 = stackOut_102_0;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        stackOut_104_0 = (Object) (Object) stackIn_104_0;
                        stackOut_104_1 = tg.field_a;
                        stackIn_105_0 = stackOut_104_0;
                        stackIn_105_1 = stackOut_104_1;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if ((Object) (Object) stackIn_105_0 == (Object) (Object) stackIn_105_1[var4]) {
                            statePc = 113;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (wt.field_e.field_p.a(-1, 176400, tg.field_a[var4], ot.field_b, qn.field_c)) {
                            statePc = 113;
                        } else {
                            statePc = 109;
                        }
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
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        te.a(120);
                        stackOut_111_0 = 0;
                        stackIn_112_0 = stackOut_111_0;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 112: {
                    return stackIn_112_0 != 0;
                }
                case 113: {
                    try {
                        var4++;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        wt.field_e.field_n.g(0);
                        wt.field_e.field_p.g(0);
                        qn.field_c = null;
                        ot.field_b = null;
                        te.a(77);
                        stackOut_114_0 = 0;
                        stackIn_115_0 = stackOut_114_0;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 115: {
                    return stackIn_115_0 != 0;
                }
                case 116: {
                    try {
                        if (hg.field_x != null) {
                            statePc = 119;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        pe.a(iq.field_e, (byte) 77, hg.field_x, wi.field_a);
                        nk.a((byte) -56, wi.field_a, iq.field_e);
                        iq.field_e = null;
                        hg.field_x = null;
                        wi.field_a = null;
                        ec.a(10, 10, ka.field_a, 40, hn.field_a, bo.field_a, so.field_b, rg.field_F, wt.field_h, sh.field_u >> -2087266335, gp.field_w >> -98127519, 92, nl.field_t, 10, 20);
                        te.a(62);
                        stackOut_119_0 = 0;
                        stackIn_120_0 = stackOut_119_0;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 120: {
                    return stackIn_120_0 != 0;
                }
                case 121: {
                    try {
                        if (av.a(true)) {
                            statePc = 124;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        var4 = 0;
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (var4 >= 8) {
                            statePc = 129;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        aa.field_b[var4] = new nk(var4);
                        var4++;
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        po.field_h = 0;
                        tm.b(50, -113);
                        nb.a(10536, 50);
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (pk.field_wb.a((byte) 113) == null) {
                            statePc = 133;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        boolean discarded$1 = pk.field_wb.a(-23);
                        stackOut_133_0 = 0;
                        stackIn_134_0 = stackOut_133_0;
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 134: {
                    return stackIn_134_0 != 0;
                }
                case 135: {
                    try {
                        ga.a(118);
                        sg.field_c = new pk();
                        m.a(tg.field_a[0], 27966, true);
                        stackOut_135_0 = 1;
                        stackIn_136_0 = stackOut_135_0;
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 136: {
                    return stackIn_136_0 != 0;
                }
                case 137: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw pn.a((Throwable) (Object) var3, "AceOfSkies.J(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, boolean param1, fn param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param4 == -12209) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        bm.field_w[0] = vr.field_h.nextInt();
                        bm.field_w[1] = vr.field_h.nextInt();
                        fa.field_c.field_g = 0;
                        bm.field_w[3] = (int)of.field_a;
                        bm.field_w[2] = (int)(of.field_a >> 1554275104);
                        fa.field_c.a((byte) 50, bm.field_w[0]);
                        fa.field_c.a((byte) 41, bm.field_w[1]);
                        fa.field_c.a((byte) 113, bm.field_w[2]);
                        fa.field_c.a((byte) 45, bm.field_w[3]);
                        vi.a((byte) -1, fa.field_c);
                        fa.field_c.a(param0, 23385);
                        param2.a(fa.field_c, true);
                        q.field_p.field_g = 0;
                        if (!param1) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        q.field_p.b(-1336879960, 18);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        q.field_p.b(-1336879960, 16);
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
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        q.field_p.field_g = q.field_p.field_g + 2;
                        var5_int = q.field_p.field_g;
                        q.field_p.a((byte) 126, ub.field_g);
                        q.field_p.b((byte) -102, fs.field_a);
                        var6 = 0;
                        if (!te.field_h) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = var6 | 1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!gl.field_a) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6 = var6 | 4;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (param3) {
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
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var6 = var6 | 8;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (fb.field_b != null) {
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
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var6 = var6 | 16;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        q.field_p.b(-1336879960, var6);
                        var7 = ao.a(bm.m(114), false);
                        if (null != var7) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var7 = "";
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        q.field_p.a(param4 ^ 12191, var7);
                        if (fb.field_b != null) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        q.field_p.a(false, fb.field_b);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        gn.a(hp.field_j, pb.field_a, (rb) (Object) q.field_p, fa.field_c, param4 + 12313);
                        q.field_p.a(false, q.field_p.field_g + -var5_int);
                        fr.a(param4 + 12171, -1);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    try {
                        stackOut_30_0 = (RuntimeException) var5;
                        stackOut_30_1 = new StringBuilder().append("AceOfSkies.B(").append(param0).append(44).append(param1).append(44);
                        stackIn_33_0 = stackOut_30_0;
                        stackIn_33_1 = stackOut_30_1;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        if (param2 == null) {
                            statePc = 33;
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
                        stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
                        stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
                        stackOut_31_2 = "{...}";
                        stackIn_34_0 = stackOut_31_0;
                        stackIn_34_1 = stackOut_31_1;
                        stackIn_34_2 = stackOut_31_2;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 33: {
                    stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
                    stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
                    stackOut_33_2 = "null";
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    stackIn_34_2 = stackOut_33_2;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    throw pn.a((Throwable) (Object) stackIn_34_0, (String) (Object) (stackIn_34_2 + 44 + param3 + 44 + param4 + 41));
                }
                case 35: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void q(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        boolean[] stackIn_3_0 = null;
        int stackIn_15_0 = 0;
        pk stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        pk stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        pk stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        pk stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        boolean[] stackOut_2_0 = null;
        int stackOut_14_0 = 0;
        pk stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        pk stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        pk stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        pk stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (ln.field_d < 2) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = lp.field_a;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 88;
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
                        tt.field_a = true;
                        hg.field_D = 16777215;
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
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param0 == 9046) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.g((byte) -122);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (nk.field_g.d(param0 + 268426409) == null) {
                            statePc = 21;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = hp.field_h;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        hp.field_h = stackIn_15_0 + 1;
                        if ((stackIn_15_0 + 1 ^ -1) == -257) {
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
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        hp.field_h = 0;
                        wf discarded$1 = nk.field_g.e(param0 ^ 9001);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((bg.field_b ^ -1) != -1) {
                            statePc = 45;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = sg.field_c;
                        stackOut_22_1 = 1;
                        stackIn_27_0 = stackOut_22_0;
                        stackIn_27_1 = stackOut_22_1;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        if (po.field_h != -1) {
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
                        stackOut_23_0 = (pk) (Object) stackIn_23_0;
                        stackOut_23_1 = stackIn_23_1;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
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
                        stackOut_25_0 = (pk) (Object) stackIn_25_0;
                        stackOut_25_1 = stackIn_25_1;
                        stackOut_25_2 = 1;
                        stackIn_28_0 = stackOut_25_0;
                        stackIn_28_1 = stackOut_25_1;
                        stackIn_28_2 = stackOut_25_2;
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
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = (pk) (Object) stackIn_27_0;
                        stackOut_27_1 = stackIn_27_1;
                        stackOut_27_2 = 0;
                        stackIn_28_0 = stackOut_27_0;
                        stackIn_28_1 = stackOut_27_1;
                        stackIn_28_2 = stackOut_27_2;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        ((pk) (Object) stackIn_28_0).a(stackIn_28_1 != 0, stackIn_28_2 != 0);
                        if (po.field_h == ci.field_d) {
                            statePc = 39;
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
                        ec.field_t = ec.field_t + 1;
                        if ((ec.field_t ^ -1) != -41) {
                            statePc = 89;
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
                        if (po.field_h != 2) {
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
                        ql.field_r = null;
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
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        po.field_h = ci.field_d;
                        ec.field_t = 0;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (-1 == po.field_h) {
                            statePc = 89;
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
                        aa.field_b[po.field_h].b(-25039);
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
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
                        if (-2 != (bg.field_b ^ -1)) {
                            statePc = 61;
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
                        ec.field_t = ec.field_t + 1;
                        if (40 == ec.field_t) {
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
                        statePc = 89;
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
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (!gi.a(true)) {
                            statePc = 57;
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
                        mo.a(-1316);
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
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
                        qj.c((byte) 9);
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        bg.field_b = 2;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (-3 == (bg.field_b ^ -1)) {
                            statePc = 70;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        ec.field_t = ec.field_t - 1;
                        if ((ec.field_t ^ -1) != -1) {
                            statePc = 89;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        bg.field_b = 0;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (cn.b(true)) {
                            statePc = 83;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        fa.field_b = sc.a(false, 4);
                        if (sg.field_c != null) {
                            statePc = 78;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        sg.field_c.g(-8);
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        po.field_h = qo.field_c;
                        if (po.field_h == -2) {
                            statePc = 82;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        po.field_h = 0;
                        ql.a((byte) -103, false);
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        po.field_h = ru.field_b;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 85;
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
                        ec.field_t = 39;
                        ci.field_d = po.field_h;
                        bg.field_b = 3;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 88: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw pn.a((Throwable) (Object) var2, "AceOfSkies.G(" + param0 + 41);
                }
                case 89: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        RuntimeException runtimeException = null;
        hk var2 = null;
        hk var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        ((AceOfSkies) this).a(-13, 2, 18, 10, 3, 0, 1);
                        var2 = new hk();
                        var3 = new hk();
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        var2.a(128, false, 9);
                        var3.a(128, false, 9);
                        wu.a(22050, true, (java.awt.Component) (Object) ci.field_f, pt.field_b, 32767, new jt(var2, var3));
                        if (param0 == 28060) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        AceOfSkies.a(-33, true, (fn) null, true, 99);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
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
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        so.field_b = 16777215;
                        hn.field_a = 15632639;
                        nl.field_t = 16777215;
                        ((AceOfSkies) this).a((byte) 62, false, true, true, false);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    throw pn.a((Throwable) (Object) runtimeException, "AceOfSkies.I(" + param0 + 41);
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        iq.a((byte) -126);
                        kp.f(param0 + -39323);
                        lp.a((byte) -70);
                        bo.a(18598);
                        ha.a(true);
                        pd.a(62);
                        l.a(true);
                        vl.b(8664);
                        ru.a((byte) 76);
                        jp.a(true);
                        oi.a(2801);
                        hu.a((byte) -118);
                        bs.a(127);
                        tr.a(-79);
                        ct.o(param0 ^ -31983);
                        ak.a(false);
                        vb.b((byte) 104);
                        cc.a(param0 ^ -19469);
                        rq.a(param0 ^ 19471);
                        qg.a(param0 ^ 19558);
                        vp.c();
                        gk.c((byte) -73);
                        nc.a(480);
                        so.a((byte) -108);
                        rb.a(true);
                        qh.a(-92);
                        hq.a(2483);
                        dt.c(13748);
                        uj.a((byte) 34);
                        ic.a((byte) -122);
                        ut.a((byte) 105);
                        ho.a((byte) -90);
                        kg.a(18567);
                        s.a((byte) 125);
                        fj.a(param0 + -31434);
                        at.a(-7978);
                        pj.a((byte) 48);
                        ca.b(0);
                        ef.a(0);
                        ob.a(false);
                        nk.c((byte) 85);
                        pk.i(32458);
                        ji.a(0);
                        wf.b(-45);
                        un.d(6);
                        dk.a(param0 + -19473);
                        wq.b(param0 + -34460);
                        gh.b(0);
                        vf.c((byte) -128);
                        da.a(5);
                        vs.a(126);
                        hk.e(-543142776);
                        ph.c(82);
                        ft.a((byte) 101);
                        k.b();
                        um.a((byte) 113);
                        tk.a();
                        rn.a(false);
                        gr.c(-126);
                        ou.e(108);
                        mg.a(0);
                        mf.a((byte) -56);
                        hc.a();
                        fd.a((byte) 89);
                        mm.a((byte) 104);
                        ps.a(0);
                        ei.a(false);
                        ip.a(-61);
                        ln.a((byte) -109);
                        vu.a(true);
                        ur.a(8192);
                        ks.a((byte) 109);
                        se.a((byte) 123);
                        lt.k(110);
                        jq.m(85);
                        ng.j(11617);
                        ad.e(false);
                        oo.g((byte) 105);
                        wd.h(11663);
                        tn.a((byte) -110);
                        ce.i(96);
                        ep.g(-33);
                        cd.c(0);
                        sa.a(-128);
                        ld.a((byte) 62);
                        t.c();
                        qn.a(-122);
                        eu.c(24);
                        vc.a((byte) -44);
                        o.a(true);
                        md.b(20);
                        wm.b(256);
                        qf.b(0);
                        fb.a((byte) 52);
                        dl.l((byte) 122);
                        we.b(param0 + -19469);
                        pu.a(240);
                        sg.a((byte) 110);
                        tt.a(20525);
                        gn.a((byte) -72);
                        eo.a((byte) 50);
                        fn.a((byte) -5);
                        aa.a(0);
                        hn.a(0);
                        pr.a(param0 + -19552);
                        mr.a(0);
                        ve.a((byte) 64);
                        hb.a(-12029);
                        pn.a(9);
                        th.a();
                        ar.b();
                        wt.a(14349);
                        df.a(-103);
                        er.d(-61);
                        gp.c((byte) 78);
                        bl.d(-126);
                        fg.b((byte) 122);
                        fs.a((byte) 117);
                        pb.a((byte) -53);
                        ag.a((byte) 34);
                        nu.a(false);
                        re.c();
                        nh.a(-101);
                        me.a((byte) 127);
                        wu.a(true);
                        rr.a(6537);
                        qs.a((byte) 118);
                        wi.a(-80);
                        b.a((byte) 28);
                        dd.a(param0 ^ -14224);
                        v.a(32342);
                        td.a(-12546);
                        di.a(false);
                        es.a(1020);
                        gj.a(true);
                        qa.a(-7);
                        nm.a(88);
                        af.a(-124);
                        on.a();
                        bd.a(16);
                        bb.a(-15388);
                        kn.b(-1);
                        lj.a(true);
                        vi.a(false);
                        mi.g(111);
                        to.a(0);
                        rg.d(true);
                        gm.a((byte) -76);
                        ab.c(true);
                        an.b(32041);
                        bg.a(2334);
                        wc.a(false);
                        jr.a(false);
                        op.a(6337);
                        gq.a(6408);
                        kq.a(param0 + -18291);
                        is.a(-92);
                        tg.a((byte) 109);
                        jm.a(105);
                        dp.d((byte) -55);
                        rm.a((byte) 127);
                        ub.a(false);
                        wb.a(true);
                        ml.a(0);
                        dh.a((byte) -116);
                        bt.b(4);
                        nq.a(true);
                        uh.a(-102);
                        bc.j(14912);
                        kk.c(true);
                        bm.d((byte) -106);
                        dg.k(12);
                        ek.d(false);
                        pi.a(4096);
                        kb.h(param0 + 1927864887);
                        vo.d(14695);
                        fk.a((byte) 28);
                        rs.d((byte) 105);
                        cn.a(-96);
                        pf.b(true);
                        ge.a();
                        rj.a(true);
                        oe.a(param0 ^ 21630);
                        lb.b(24);
                        ao.a(param0 + -19411);
                        wl.y(32598);
                        eb.b(64);
                        vr.a(116);
                        lu.a((byte) -3);
                        hp.c((byte) -66);
                        jk.a(param0 ^ 14407);
                        cs.a(true);
                        tm.a(-128);
                        tj.b((byte) -95);
                        rt.c((byte) -63);
                        ee.a(false);
                        q.d(-107);
                        rl.a(param0 + -32254);
                        la.a((byte) -86);
                        em.a(true);
                        ec.b(0);
                        qo.c((byte) 23);
                        st.b((byte) -112);
                        as.b(param0 + -19344);
                        sb.a(126);
                        sk.a((byte) 91);
                        hr.a(true);
                        lm.b(-8192);
                        fa.a(false);
                        po.c(-30534);
                        hd.a(30714);
                        jb.a(param0 + -46603);
                        ia.a(-6411);
                        jc.W(param0 ^ 19581);
                        cg.g(-33);
                        vg.b(0);
                        ku.c(85);
                        ot.b((byte) -44);
                        hg.j(65793);
                        sh.d((byte) -66);
                        ej.a(-29373);
                        lc.a(true);
                        hs.a((byte) -127);
                        he.f(param0 ^ param0);
                        qj.d((byte) -122);
                        mb.g(255);
                        av.a((byte) -44);
                        iu.a((byte) 119);
                        ff.a((byte) 8);
                        ui.a();
                        ac.a(-28819);
                        ka.a((byte) -126);
                        r.f(27354);
                        du.j(param0 + -19583);
                        in.a(true);
                        eq.d(-118);
                        hh.a(30);
                        qe.a(5575);
                        nb.b(126);
                        gt.e(param0 ^ -19569);
                        si.a(true);
                        or.a((byte) 63);
                        lk.c(34962);
                        fu.b((byte) 89);
                        om.b(-21649);
                        bk.b(66);
                        ud.a(false);
                        ql.a((byte) -58);
                        uf.a((byte) -77);
                        ij.b(1822);
                        ju.d(122);
                        rc.b(param0 ^ -15995);
                        np.c(9216);
                        ne.b(param0 + -19447);
                        g.b(103);
                        sd.b(0);
                        ci.c((byte) -47);
                        aq.a(32683);
                        pg.a(true);
                        ke.a(param0 + -19345);
                        gi.a(-12085);
                        ns.a(-24169);
                        ol.b(127);
                        rp.a(16523);
                        cf.f(-95);
                        u.b(true);
                        ta.b(true);
                        ae.c((byte) 15);
                        lg.c((byte) -75);
                        gg.a(true);
                        qd.d(param0 + -12162);
                        ai.a(-28739);
                        na.a(param0 ^ 21852);
                        ik.b(true);
                        qp.b(true);
                        mh.a(126);
                        kf.g(param0 + 5851);
                        mo.b(39);
                        lo.c((byte) 125);
                        io.a(param0 + -52006);
                        ua.d(107);
                        ro.d((byte) 80);
                        tq.b(400);
                        pe.a(19592);
                        js.a((byte) 116);
                        nj.a((byte) -59);
                        dc.c(param0 ^ -19509);
                        qk.a(0);
                        vj.a(1);
                        mq.a(20370);
                        fo.a(25613);
                        uc.a((byte) 35);
                        gl.b(-11760);
                        rh.a(32081);
                        qb.a(true);
                        wg.a(true);
                        sl.b(111);
                        ul.a((byte) -128);
                        jf.a((byte) -50);
                        hi.k(-86);
                        cl.a((byte) -98);
                        ht.a(-91);
                        qq.b((byte) 116);
                        tb.a((byte) 117);
                        oc.a((byte) 121);
                        mj.a(3);
                        dq.a(122);
                        id.a((byte) 106);
                        m.a(256);
                        jn.h(-89);
                        jd.a(false);
                        gu.a(false);
                        pm.b(93);
                        ko.c(0);
                        ki.b(64);
                        lh.a(param0 ^ 18173);
                        wo.a(-125);
                        uk.a(250);
                        te.a(false);
                        ds.a(-93);
                        sc.b(126);
                        co.a(-13392);
                        mp.c((byte) -11);
                        fh.c(true);
                        ii.c((byte) -22);
                        vn.c((byte) 101);
                        uu.e(param0 ^ 27864);
                        jo.a((byte) -125);
                        pt.a(0);
                        li.b((byte) -90);
                        ah.c((byte) -27);
                        ms.a((byte) -15);
                        od.d((byte) -96);
                        aj.c((byte) 113);
                        bi.a(false);
                        ((AceOfSkies) this).field_w = null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw pn.a((Throwable) (Object) var2, "AceOfSkies.C(" + param0 + 41);
                }
                case 4: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
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
                    throw (RuntimeException) (Object) caughtException;
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void g(byte param0) {
        // if_acmpne L11
        ak.field_e = true;
        wi.field_a = ot.a(-28, 4);
        iq.field_e = ot.a(-65, 5);
        jk.field_b = ot.a(-31, 6);
        ub.field_f = ot.a(-76, 7);
        ot.field_b = ot.a(-62, 8);
        od.field_x = ot.a(-81, 9);
        if (param0 <= 43) {
            return;
        }
        try {
            ci.field_i = new Random(kh.a(-99));
            pk.field_wb = new l(11, 12, (d) null);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "AceOfSkies.F(" + param0 + 41);
        }
    }

    final static long a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_43_0 = 0;
        long stackIn_45_0 = 0L;
        long stackIn_47_0 = 0L;
        long stackIn_52_0 = 0L;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_42_0 = 0;
        long stackOut_44_0 = 0L;
        long stackOut_45_0 = 0L;
        long stackOut_51_0 = 0L;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 <= -12) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2_long = 0L;
                        var4 = param0.length();
                        var5 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var4 <= var5) {
                            statePc = 42;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2_long = var2_long * 37L;
                        var6 = param0.charAt(var5);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = var6;
                        stackOut_8_1 = 65;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
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
                        if (stackIn_9_0 < stackIn_9_1) {
                            statePc = 17;
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
                        if (var6 > 90) {
                            statePc = 17;
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
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var2_long = var2_long + (long)(-65 + (1 - -var6));
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (97 > var6) {
                            statePc = 25;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (-123 > (var6 ^ -1)) {
                            statePc = 25;
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
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var2_long = var2_long + (long)(-97 + (var6 + 1));
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (-49 < (var6 ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = 57;
                        stackIn_29_0 = stackOut_28_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (stackIn_29_0 >= var6) {
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
                        statePc = 35;
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
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var2_long = var2_long + (long)(var6 + -21);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (-177917621779460414L < (var2_long ^ -1L)) {
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
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
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
                        var5++;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = (0L < var2_long % 37L ? -1 : (0L == var2_long % 37L ? 0 : 1));
                        stackIn_43_0 = stackOut_42_0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (stackIn_43_0 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackOut_44_0 = var2_long;
                        stackIn_45_0 = stackOut_44_0;
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
                        stackOut_45_0 = stackIn_45_0;
                        stackIn_47_0 = stackOut_45_0;
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
                        if (stackIn_47_0 == 0L) {
                            statePc = 51;
                        } else {
                            statePc = 48;
                        }
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
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var2_long = var2_long / 37L;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = var2_long;
                        stackIn_52_0 = stackOut_51_0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    return stackIn_52_0;
                }
                case 53: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    try {
                        stackOut_54_0 = (RuntimeException) var2;
                        stackOut_54_1 = new StringBuilder().append("AceOfSkies.D(");
                        stackIn_57_0 = stackOut_54_0;
                        stackIn_57_1 = stackOut_54_1;
                        stackIn_55_0 = stackOut_54_0;
                        stackIn_55_1 = stackOut_54_1;
                        if (param0 == null) {
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
                        stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
                        stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
                        stackOut_55_2 = "{...}";
                        stackIn_58_0 = stackOut_55_0;
                        stackIn_58_1 = stackOut_55_1;
                        stackIn_58_2 = stackOut_55_2;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 56: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 57: {
                    stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
                    stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
                    stackOut_57_2 = "null";
                    stackIn_58_0 = stackOut_57_0;
                    stackIn_58_1 = stackOut_57_1;
                    stackIn_58_2 = stackOut_57_2;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    throw pn.a((Throwable) (Object) stackIn_58_0, (String) (Object) (stackIn_58_2 + 44 + param1 + 41));
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void e(int param0) {
        try {
            RuntimeException var2 = null;
            java.awt.Canvas var2_ref = null;
            int var3 = 0;
            ha var4 = null;
            int var5_int = 0;
            iq var5 = null;
            lp var6 = null;
            int var6_int = 0;
            String var6_ref = null;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            int var10 = 0;
            int stackIn_30_0 = 0;
            int stackIn_53_0 = 0;
            int stackIn_63_0 = 0;
            boolean stackIn_66_0 = false;
            int stackIn_90_0 = 0;
            int stackIn_94_0 = 0;
            int stackIn_105_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_52_0 = 0;
            boolean stackOut_60_0 = false;
            int stackOut_62_0 = 0;
            boolean stackOut_65_0 = false;
            int stackOut_89_0 = 0;
            int stackOut_93_0 = 0;
            int stackOut_104_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var10 = field_G ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var2_ref = fa.a(-8213);
                            vp.a();
                            var3 = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (im.a(true)) {
                                statePc = 5;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof lp ? 4 : 119);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof lp ? 4 : 119);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            pu.a((byte) 21, var2_ref, lh.a((byte) -94));
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return;
                    }
                    case 7: {
                        try {
                            if (gq.field_f) {
                                statePc = 10;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            hj.a(var2_ref, -12);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return;
                    }
                    case 10: {
                        try {
                            if (!b.b((byte) -94)) {
                                statePc = 13;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof RuntimeException ? 119 : 12);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof RuntimeException ? 119 : 12);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            fh.a(-42, 100.0f, bd.field_I);
                            hj.a(var2_ref, -12);
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
                            if (!pk.field_wb.a(122)) {
                                statePc = 19;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof RuntimeException ? 119 : 18);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            ga.a(39);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof RuntimeException ? 119 : 18);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var4 = pk.field_wb.a((byte) 127);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            sg.field_c.a(-16711936, false, var4);
                            if ((po.field_h ^ -1) == (ci.field_d ^ -1)) {
                                statePc = 37;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof lp ? 23 : 119);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (0 == (po.field_h ^ -1)) {
                                statePc = 28;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof lp ? 26 : 119);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof lp ? 26 : 119);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof lp ? 26 : 119);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (-31 >= (ec.field_t ^ -1)) {
                                statePc = 28;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof lp ? 26 : 119);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var5_int = ec.field_t;
                            var5_int = (int)(480.0 * Math.cos(3.141592653589793 * (double)var5_int / 2.0 / 30.0));
                            aa.field_b[po.field_h].a(-var5_int + 480, var4, -4);
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (0 == (ci.field_d ^ -1)) {
                                statePc = 43;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof lp ? 32 : 119);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            stackOut_29_0 = ec.field_t;
                            stackIn_30_0 = stackOut_29_0;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof lp ? 32 : 119);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if ((stackIn_30_0 ^ -1) < -11) {
                                statePc = 35;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof lp ? 34 : 119);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof lp ? 34 : 119);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof lp ? 34 : 119);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof lp ? 34 : 119);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var5_int = ec.field_t + -40;
                            var5_int = (int)(480.0 * Math.cos(3.141592653589793 * (double)var5_int / 2.0 / 30.0));
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            aa.field_b[ci.field_d].a(-var5_int + 480, var4, param0 + -154);
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof lp ? 39 : 119);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if ((po.field_h ^ -1) == 0) {
                                statePc = 43;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof lp ? 42 : 119);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof lp ? 42 : 119);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof lp ? 42 : 119);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            aa.field_b[po.field_h].a(0, var4, -4);
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof lp ? 42 : 119);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (!gi.a(true)) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var3 = 1;
                            vp.f(0, 0, vp.field_i, vp.field_c);
                            ee.c((byte) 14);
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (0 == bg.field_b) {
                                statePc = 51;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var3 = 1;
                            var5_int = 256 * ec.field_t / 40;
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
                            if (-1 > (var5_int ^ -1)) {
                                statePc = 50;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof lp ? 49 : 119);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof lp ? 49 : 119);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            vp.b(0, 0, vp.field_i, vp.field_c, 0, var5_int);
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (!jf.a(param0 + 14850)) {
                                statePc = 64;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof lp ? 55 : 119);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            stackOut_52_0 = 1;
                            stackIn_53_0 = stackOut_52_0;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof lp ? 55 : 119);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (gi.a(stackIn_53_0 == 0)) {
                                statePc = 58;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof lp ? 57 : 119);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof lp ? 57 : 119);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof lp ? 57 : 119);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof lp ? 57 : 119);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var3 = 1;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if (jf.field_a != null) {
                                statePc = 62;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof lp ? 61 : 119);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            stackOut_60_0 = im.field_e;
                            stackIn_63_0 = stackOut_60_0 ? 1 : 0;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof lp ? 61 : 119);
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
                            stackOut_62_0 = 1;
                            stackIn_63_0 = stackOut_62_0;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            ls.a(stackIn_63_0 != 0, (byte) -37);
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if ((ln.field_d ^ -1) > -3) {
                                statePc = 72;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof lp ? 68 : 119);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            stackOut_65_0 = lb.field_e;
                            stackIn_66_0 = stackOut_65_0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof lp ? 68 : 119);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (!stackIn_66_0) {
                                statePc = 72;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof lp ? 71 : 119);
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof lp ? 71 : 119);
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof lp ? 71 : 119);
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            rb.field_j.a(16777215, 1, 20, Integer.toString(wk.field_f), param0 ^ 18877, 20);
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof lp ? 71 : 119);
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
                            var5 = (iq) nk.field_g.d(268435455);
                            if (null == var5) {
                                statePc = 85;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            var7 = hp.field_h;
                            if ((var7 ^ -1) <= -65) {
                                statePc = 76;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            var6_int = var7 * 255 / 64;
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof lp ? 78 : 119);
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if (-193 > (var7 ^ -1)) {
                                statePc = 80;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof lp ? 78 : 119);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            var6_int = 255;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var6_int = (192 - var7) * 255 / 64;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            var8 = 45;
                            if (var5.field_f >= 0) {
                                statePc = 83;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            var9 = ab.field_r;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            var9 = lb.field_a[var5.field_f];
                            aa.field_a[var5.field_f].a(53 + (-180 + sh.field_u), 45, 64, 64, 0, var6_int << -1404209384 | 16777215, 1);
                            var8 += 65;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            int discarded$3 = rb.field_j.a(0, -180 + sh.field_u, var6_int << 213394136, true, var6_int << -1136833480, 1, var8 - 1, 18, 0, (pa[]) null, (aa) null, 0, (int[]) null, 170, 150, var9);
                            int discarded$4 = rb.field_j.a(0, -180 + sh.field_u, var6_int << -43885544, true, var6_int << 1952001656, 1, 1 + var8, 18, 0, (pa[]) null, (aa) null, 0, (int[]) null, 170, 150, var9);
                            int discarded$5 = rb.field_j.a(0, sh.field_u + -180, 16777215 | var6_int << -338092744, true, -1, 1, var8, 18, 0, (pa[]) null, (aa) null, 0, (int[]) null, 170, 150, var9);
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            if (var3 == 0) {
                                statePc = 103;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof lp ? 88 : 119);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            if (0 != bg.field_b) {
                                statePc = 100;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof lp ? 92 : 119);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof lp ? 92 : 119);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof lp ? 92 : 119);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            stackOut_89_0 = 15000;
                            stackIn_90_0 = stackOut_89_0;
                            statePc = 90;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof lp ? 92 : 119);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            if (!jf.a(stackIn_90_0)) {
                                statePc = 97;
                            } else {
                                statePc = 91;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof lp ? 96 : 119);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof lp ? 96 : 119);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof lp ? 96 : 119);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            stackOut_93_0 = 1;
                            stackIn_94_0 = stackOut_93_0;
                            statePc = 94;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof lp ? 96 : 119);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            if (gi.a(stackIn_94_0 == 0)) {
                                statePc = 100;
                            } else {
                                statePc = 95;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof lp ? 99 : 119);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            statePc = 97;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof lp ? 99 : 119);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof lp ? 99 : 119);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            mg.a(var4, param0 ^ 1150040055);
                            statePc = 103;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof lp ? 102 : 119);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof lp ? 102 : 119);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            hh.a(param0 ^ 105, var4);
                            statePc = 101;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof lp ? 102 : 119);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            statePc = 103;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            if (!mj.field_b) {
                                statePc = 111;
                            } else {
                                statePc = 104;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof lp ? 107 : 119);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            stackOut_104_0 = ln.field_d;
                            stackIn_105_0 = stackOut_104_0;
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof lp ? 107 : 119);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            if (stackIn_105_0 >= 2) {
                                statePc = 110;
                            } else {
                                statePc = 106;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof lp ? 109 : 119);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof lp ? 109 : 119);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof lp ? 109 : 119);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof lp ? 109 : 119);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            var6_ref = (Runtime.getRuntime().totalMemory() + -Runtime.getRuntime().freeMemory()) / 1024L + "kb/" + Runtime.getRuntime().totalMemory() / 1024L + "kb";
                            rb.field_j.a(var6_ref, -1, -16777216, sh.field_u - 10, 45, (byte) 92);
                            rb.field_j.a(Integer.toString(wk.field_f), -1, -16777216, sh.field_u + -10, 60, (byte) 92);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            if (param0 == 150) {
                                statePc = 115;
                            } else {
                                statePc = 112;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = (stateCaught_111 instanceof lp ? 114 : 119);
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            field_J = false;
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = (stateCaught_112 instanceof lp ? 114 : 119);
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = 119;
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
                            var4.e(param0 + -239);
                            statePc = 116;
                            continue stateLoop;
                        } catch (Throwable stateCaught_115) {
                            caughtException = stateCaught_115;
                            statePc = (stateCaught_115 instanceof lp ? 117 : 119);
                            continue stateLoop;
                        }
                    }
                    case 116: {
                        try {
                            statePc = 120;
                            continue stateLoop;
                        } catch (Throwable stateCaught_116) {
                            caughtException = stateCaught_116;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 117: {
                        try {
                            var6 = (lp) (Object) caughtException;
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
                        throw pn.a((Throwable) (Object) var2, "AceOfSkies.A(" + param0 + 41);
                    }
                    case 120: {
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

    final void c(int param0) {
        RuntimeException var2 = null;
        oc var2_ref = null;
        int var2_int = 0;
        int var3 = 0;
        hj stackIn_7_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_80_0 = null;
        Object stackIn_82_0 = null;
        Object stackIn_84_0 = null;
        Object stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_109_0 = 0;
        hj stackOut_6_0 = null;
        Object stackOut_13_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_79_0 = null;
        Object stackOut_80_0 = null;
        Object stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        Object stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_108_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        we.a(200);
                        if (param0 == 5883) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (null == jf.field_a) {
                            statePc = 13;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = jf.field_a;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (((hj) (Object) stackIn_7_0).field_b) {
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
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        tt.b(-32546);
                        hi.j(8585);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = this;
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_14_0 = stackOut_13_0;
                        if (jf.field_a == null) {
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
                        stackOut_14_0 = this;
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
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = this;
                        stackOut_16_1 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((AceOfSkies) this).b(stackIn_17_1 != 0, (byte) 95);
                        if (!jn.field_t) {
                            statePc = 21;
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
                        this.g((byte) 124);
                        jn.field_t = false;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (!im.a(true)) {
                            statePc = 32;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((AceOfSkies) this).i(4);
                        if (im.a(true)) {
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
                        statePc = 32;
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
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (!jr.a((byte) 32)) {
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
                        boolean discarded$1 = this.a((byte) 59, false);
                        statePc = 29;
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
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return;
                }
                case 32: {
                    try {
                        if (gq.field_f) {
                            statePc = 39;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        ic.a(nh.field_e, false);
                        if (this.a((byte) -62, true)) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 119;
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
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        gq.field_f = true;
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (!b.b((byte) -119)) {
                            statePc = 102;
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
                        if (!gi.a(true)) {
                            statePc = 73;
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
                        if (0 != bg.field_b) {
                            statePc = 70;
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
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var2_int = oj.f(5);
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var2_int == 2) {
                            statePc = 62;
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
                        if (-4 != (var2_int ^ -1)) {
                            statePc = 56;
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
                        ql.a((byte) -81, true);
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
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
                        if (var2_int == 4) {
                            statePc = 61;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        mo.a(-1316);
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        tt.b(-32546);
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (gi.a(true)) {
                            statePc = 69;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        aa.field_b[po.field_h].a(true, 1);
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
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        this.q(param0 + 3163);
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (jf.a(param0 + 9117)) {
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
                        this.q(param0 ^ 13741);
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
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
                        stackOut_79_0 = this;
                        stackIn_84_0 = stackOut_79_0;
                        stackIn_80_0 = stackOut_79_0;
                        if (null == jf.field_a) {
                            statePc = 84;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        stackOut_80_0 = this;
                        stackIn_82_0 = stackOut_80_0;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        stackOut_82_0 = this;
                        stackOut_82_1 = 1;
                        stackIn_85_0 = stackOut_82_0;
                        stackIn_85_1 = stackOut_82_1;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        stackOut_84_0 = this;
                        stackOut_84_1 = 0;
                        stackIn_85_0 = stackOut_84_0;
                        stackIn_85_1 = stackOut_84_1;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var2_int = ((AceOfSkies) this).a(stackIn_85_1 != 0, param0 + -5990);
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if ((var2_int ^ -1) == -2) {
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
                        stackOut_87_0 = 2;
                        stackIn_88_0 = stackOut_87_0;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 90;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (stackIn_88_0 != var2_int) {
                            statePc = 101;
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
                        if (jf.field_a == null) {
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
                        tt.b(-32546);
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
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (-3 == (var2_int ^ -1)) {
                            statePc = 100;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 101;
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
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        rr.a((byte) -77, bm.m(114));
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 104;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        jn.g(4);
                        if (b.b((byte) -127)) {
                            statePc = 107;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 119;
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
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        hl.a(-1889);
                        tq.b(true);
                        if (po.field_h != 5) {
                            statePc = 115;
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
                        stackOut_108_0 = -1;
                        stackIn_109_0 = stackOut_108_0;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (stackIn_109_0 == (r.field_n ^ -1)) {
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
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        po.field_h = 2;
                        eu.a((byte) -92, 2, false);
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (gi.a(true)) {
                            statePc = 118;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
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
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        ql.a((byte) -88, true);
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (cn.b(true)) {
                            statePc = 128;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        var2_ref = (oc) sb.field_c.e(121);
                        if (null != var2_ref) {
                            statePc = 124;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        pn.a(var2_ref, (byte) -117, 4);
                        statePc = 125;
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
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (!ka.a((byte) 93, ho.field_d)) {
                            statePc = 132;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        ((AceOfSkies) this).f((byte) -106);
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        fr.a(-100, 0);
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (dg.j(param0 ^ 31428)) {
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
                        statePc = 143;
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
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        var2_int = ((AceOfSkies) this).p(16637);
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if (var2_int == 2) {
                            statePc = 140;
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
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        rc.c((byte) 127);
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 142;
                        continue stateLoop;
                    }
                }
                case 142: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw pn.a((Throwable) (Object) var2, "AceOfSkies.H(" + param0 + 41);
                }
                case 143: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public AceOfSkies() {
    }

    final void f(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        dt.a(0);
                        if (jf.field_a == null) {
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
                        tt.b(-32546);
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
                        vl.a(-26317);
                        if (param0 <= -95) {
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
                        field_J = true;
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
                    throw pn.a((Throwable) (Object) var2, "AceOfSkies.E(" + param0 + 41);
                }
                case 10: {
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
        field_J = true;
    }
}
