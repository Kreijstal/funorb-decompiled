/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mg extends id {
    static int field_F;
    private int field_G;
    static int field_H;
    static double field_J;
    private int field_I;

    final static int a(boolean param0, hf param1, int param2, hf param3, String param4, int param5, byte param6) {
        int stackIn_5_0 = 0;
        k stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        k stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        k stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        String stackIn_16_2 = null;
        k stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        k stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        k stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        String stackIn_19_2 = null;
        int stackIn_34_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var14 = param1.c((byte) 99);
                        var11_ref_String = var14;
                        var11_ref_String = var14;
                        var8 = param3.c((byte) 99);
                        var11_ref_String = var8;
                        var11_ref_String = var8;
                        if (ki.field_h != null) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (!ee.a(false, false)) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = -1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0;
                }
                case 6: {
                    try {
                        if (vo.field_l != ud.field_cb) {
                            statePc = 21;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ma.field_a.field_j = 0;
                        dd.field_d = null;
                        if (param4 == null) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var9 = 0;
                        pm.field_R.field_j = 0;
                        if (!param0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = var9 | 1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        pm.field_R.b(-11, c.field_c.nextInt());
                        pm.field_R.b(90, c.field_c.nextInt());
                        pm.field_R.b(-16171, var14);
                        pm.field_R.b(-16171, var8);
                        var15 = (CharSequence) ((Object) param4);
                        pm.field_R.b(-16171, nq.a(-50, var15));
                        pm.field_R.a(param5, (byte) -91);
                        pm.field_R.a(param6 ^ 37, param2);
                        pm.field_R.a(param6 ^ 19, var9);
                        ma.field_a.a(120, 18);
                        ma.field_a.field_j = ma.field_a.field_j + 2;
                        var10 = ma.field_a.field_j;
                        var11_ref_String = wg.a(0, jl.b(param6 + 92));
                        if (var11_ref_String != null) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var11_ref_String = "";
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ma.field_a.a(var11_ref_String, (byte) 105);
                        hd.a(gn.field_L, (byte) -123, tp.field_v, pm.field_R, ma.field_a);
                        ma.field_a.b(false, ma.field_a.field_j - var10);
                        if (var13 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        pm.field_R.field_j = 0;
                        pm.field_R.b(125, c.field_c.nextInt());
                        pm.field_R.b(-114, c.field_c.nextInt());
                        stackIn_15_0 = pm.field_R;
                        stackIn_14_0 = stackIn_15_0;
                        stackIn_15_1 = -16171;
                        stackIn_14_1 = stackIn_15_1;
                        if (param1.a((byte) 105)) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_16_0 = (k) ((Object) stackIn_14_0);
                        stackIn_16_1 = stackIn_14_1;
                        stackIn_16_2 = "";
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = (k) ((Object) stackIn_15_0);
                        stackIn_16_1 = stackIn_15_1;
                        stackIn_16_2 = (String) (var14);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((k) (Object) stackIn_16_0).b(stackIn_16_1, stackIn_16_2);
                        stackIn_18_0 = pm.field_R;
                        stackIn_17_0 = stackIn_18_0;
                        stackIn_18_1 = -16171;
                        stackIn_17_1 = stackIn_18_1;
                        if (param3.a((byte) 57)) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_19_0 = (k) ((Object) stackIn_17_0);
                        stackIn_19_1 = stackIn_17_1;
                        stackIn_19_2 = "";
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = (k) ((Object) stackIn_18_0);
                        stackIn_19_1 = stackIn_18_1;
                        stackIn_19_2 = (String) (var8);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((k) (Object) stackIn_19_0).b(stackIn_19_1, stackIn_19_2);
                        ma.field_a.a(-99, 16);
                        ma.field_a.field_j = ma.field_a.field_j + 1;
                        var9 = ma.field_a.field_j;
                        hd.a(gn.field_L, (byte) 110, tp.field_v, pm.field_R, ma.field_a);
                        ma.field_a.e(param6 + 173, -var9 + ma.field_a.field_j);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        cb.a(-1, false);
                        vo.field_l = mf.field_c;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (mf.field_c != vo.field_l) {
                            statePc = 35;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (!fa.b(10, 1)) {
                            statePc = 35;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var9 = s.field_e.g(31365);
                        s.field_e.field_j = 0;
                        if (-101 < (var9 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (-106 > (var9 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        hb.field_b = new String[var9 - 100];
                        vo.field_l = sa.field_n;
                        if (var13 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (248 == var9) {
                            statePc = 33;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((var9 ^ -1) == -100) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        vo.field_l = pq.field_p;
                        op.field_i = var9;
                        hd.field_q = -1;
                        if (var13 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        fa.b(10, wm.f(1));
                        dd.field_d = new Boolean(fq.a(s.field_e, (byte) -114));
                        s.field_e.field_j = 0;
                        if (var13 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        og.a(param6 ^ -92, jl.b(0));
                        ol.field_q = pa.field_Y;
                        ak.a((byte) -115);
                        sk.field_j = false;
                        stackIn_34_0 = var9;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 34: {
                    return stackIn_34_0;
                }
                case 35: {
                    try {
                        if (sa.field_n == vo.field_l) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var9 = 2;
                        if (!fa.b(param6 ^ -82, var9)) {
                            statePc = 48;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var10 = s.field_e.d((byte) 69);
                        s.field_e.field_j = 0;
                        if (fa.b(10, var10)) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var11 = hb.field_b.length;
                        var12 = 0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var12 >= var11) {
                            statePc = 45;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        hb.field_b[var12] = s.field_e.c(0);
                        var12++;
                        if (var13 != 0) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var13 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        ak.a((byte) -123);
                        sk.field_j = false;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_47_0 = var11 + 100;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 47: {
                    return stackIn_47_0;
                }
                case 48: {
                    try {
                        if (pq.field_p != vo.field_l) {
                            statePc = 58;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (!dd.a(param6 ^ -92)) {
                            statePc = 58;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (op.field_i == 255) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ol.field_q = s.field_e.f((byte) -71);
                        if (var13 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var9_ref_String = s.field_e.g((byte) -89);
                        if (var9_ref_String != null) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        jh.a(jl.b(0), -1, var9_ref_String);
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        ak.a((byte) -118);
                        sk.field_j = false;
                        stackIn_57_0 = op.field_i;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 57: {
                    return stackIn_57_0;
                }
                case 58: {
                    try {
                        if (param6 == -92) {
                            statePc = 60;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        field_F = 21;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (ki.field_h != null) {
                            statePc = 69;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (sk.field_j) {
                            statePc = 63;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var9 = jo.field_b;
                        jo.field_b = ff.field_s;
                        sk.field_j = true;
                        ff.field_s = var9;
                        if (var13 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if ((he.b((byte) -22) ^ -1L) < -30001L) {
                            statePc = 66;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        ol.field_q = ga.field_w;
                        if (var13 == 0) {
                            statePc = 67;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        ol.field_q = aj.field_l;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        sk.field_j = false;
                        stackIn_68_0 = 249;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 68: {
                    return stackIn_68_0;
                }
                case 69: {
                    try {
                        stackIn_70_0 = -1;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 70: {
                    return stackIn_70_0;
                }
                case 71: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_73_0 = (RuntimeException) (var7);
                    stackIn_72_0 = stackIn_73_0;
                    stackIn_73_1 = new StringBuilder().append("mg.I(").append(param0).append(',');
                    stackIn_72_1 = stackIn_73_1;
                    if (param1 == null) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    stackIn_74_0 = (RuntimeException) ((Object) stackIn_72_0);
                    stackIn_74_1 = (StringBuilder) ((Object) stackIn_72_1);
                    stackIn_74_2 = "{...}";
                    statePc = 74;
                    continue stateLoop;
                }
                case 73: {
                    stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
                    stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
                    stackIn_74_2 = "null";
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    stackIn_76_0 = (RuntimeException) ((Object) stackIn_74_0);
                    stackIn_75_0 = stackIn_76_0;
                    stackIn_76_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',').append(param2).append(',');
                    stackIn_75_1 = stackIn_76_1;
                    if (param3 == null) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    stackIn_77_0 = (RuntimeException) ((Object) stackIn_75_0);
                    stackIn_77_1 = (StringBuilder) ((Object) stackIn_75_1);
                    stackIn_77_2 = "{...}";
                    statePc = 77;
                    continue stateLoop;
                }
                case 76: {
                    stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
                    stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
                    stackIn_77_2 = "null";
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_77_0);
                    stackIn_78_0 = stackIn_79_0;
                    stackIn_79_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',');
                    stackIn_78_1 = stackIn_79_1;
                    if (param4 == null) {
                        statePc = 79;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    stackIn_80_0 = (RuntimeException) ((Object) stackIn_78_0);
                    stackIn_80_1 = (StringBuilder) ((Object) stackIn_78_1);
                    stackIn_80_2 = "{...}";
                    statePc = 80;
                    continue stateLoop;
                }
                case 79: {
                    stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
                    stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
                    stackIn_80_2 = "null";
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    throw fa.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ',' + param5 + ',' + param6 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    mg(int param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_G = 0;
        this.field_I = hp.a((byte) 44, g.field_a, 5);
    }

    final void f(byte param0) {
        int fieldTemp$1 = 0;
        br var2_ref_br = null;
        double var2 = 0.0;
        wb var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_14_0 = 0;
        boolean stackOut_6_0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    this.field_G = this.field_G + 1;
                    if (120 <= this.field_G) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_G = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    fieldTemp$1 = this.field_I;
                    this.field_I = this.field_I + 1;
                    if (-6 <= (fieldTemp$1 ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.field_I = 0;
                    var2_ref_br = fb.field_e.field_H.c(109);
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (!(var2_ref_br instanceof id)) {
                        statePc = 13;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    stackOut_6_0 = var2_ref_br instanceof wb;
                    stackIn_14_0 = stackOut_6_0 ? 1 : 0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var6 != 0) {
                        statePc = 14;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (stackIn_7_0) {
                        statePc = 9;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var3 = (wb) ((Object) var2_ref_br);
                    var4 = var3.g(-116) + -this.g(-34) + -12;
                    var5 = var3.h(122) + -this.h(-70);
                    if ((var4 * var4 - -(var5 * var5) ^ -1) <= -577) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (!fb.field_e.field_I.a(69, this.field_C, 255)) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    nm.b(-127, 9);
                    iq.a(this.field_C, (byte) 99);
                    this.a(true);
                    return;
                }
                case 12: {
                    var2_ref_br = var2_ref_br.field_d;
                    if (var6 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    hp.field_l = new int[120];
                    hp.field_g = new int[120];
                    hp.field_j = new int[8][16];
                    stackIn_14_0 = param0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (stackIn_14_0 >= -79) {
                        statePc = 26;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var2 = 0.05235987755982988;
                    var4 = 0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (120 <= var4) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    hp.field_l[var4] = (int)(24.0 * Math.cos((double)var4 * var2));
                    hp.field_g[var4] = (int)(24.0 * Math.sin(var2 * (double)var4));
                    var4++;
                    if (var6 != 0) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (var6 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var4 = 0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (hp.field_j[0].length <= var4) {
                        statePc = 25;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var5 = 16 * var4;
                    hp.field_j[0][var4] = cr.b(tq.b(65410, var5 << 1766044424), tq.b(var5, 255));
                    hp.field_j[1][var4] = cr.b(var5 << 265694344, var5 << 1441833296);
                    hp.field_j[2][var4] = cr.b(tq.b(65493, var5 << -1221542904), tq.b(255, var5 / 2));
                    hp.field_j[3][var4] = var5 * 65793;
                    hp.field_j[4][var4] = cr.b(tq.b(var5, 771752446) << -19463737, var5 << -386917904);
                    hp.field_j[5][var4] = var5 << 1672389648;
                    hp.field_j[6][var4] = var5 << -1547643920;
                    hp.field_j[7][var4] = cr.b(var5, cr.b(tq.b(var5 << -274200794, 65326), tq.b(var5, 1477444604) << 179983246));
                    var4++;
                    if (var6 != 0) {
                        statePc = 25;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var6 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    return;
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, rp param4, int param5, int param6) {
        ef var8 = null;
        try {
            int var7_int = 73 % ((param2 - -45) / 36);
            var8 = qp.field_w;
            nm.field_w.c(param6, param3, param5);
            wa.field_b[param0].c(param6 + 17, param3 + 21, param5);
            jq.a(cr.a(param0, -83), 33 + param3, (byte) 2, param4.field_t[param0], param5, -16 + param6);
            if (param1 != 255) {
                jq.a(cr.a(param1, -100), param3 + 21, (byte) 2, param4.field_t[param1], param5, param6 - 39);
                ((fm) ((Object) var8)).a(gh.field_f[param1], param6 - -29, 48 + param3, 16777215, 1, param5);
            }
            ((fm) ((Object) var8)).a(gh.field_f[param0], param6 + 29, 58 + param3, 16777215, 1, param5);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "mg.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void b(boolean param0) {
        if (param0) {
            rp var2 = (rp) null;
            mg.a(-13, 21, (byte) 127, 95, (rp) null, 24, -18);
        }
        sq.field_N = true;
        va.field_a = 0;
    }

    final void a(int param0, nm param1) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = this.field_G % 30;
                        if (-16 <= (var3_int ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var3_int = -var3_int + 30;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var3_int > 8) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3_int <= 3) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3_int = 3;
                        if (var12 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((var3_int ^ -1) >= -2) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3_int = 2;
                        if (var12 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var3_int = 1;
                        if (var12 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var3_int = 4;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param0 == -10136) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return;
                }
                case 12: {
                    try {
                        var4 = param1.c(this.g(74), -20126);
                        var5 = param1.d(-var3_int + this.h(93), 117) - 24;
                        if (47 < (var4 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (47 < (var5 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((var4 ^ -1) < -641) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((var5 ^ -1) >= -481) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return;
                }
                case 18: {
                    try {
                        var6 = 12 + var4 + -1;
                        var7 = 12 + var5 + -1;
                        var9 = 10;
                        var10 = 2;
                        var11 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (-7 >= (var11 ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var8 = (6 * var11 + this.field_G) % 120;
                        oo.d(hp.field_l[var8] + var6, var7 - -hp.field_g[var8], 6, 0, var11 * var9);
                        oo.a(hp.field_l[var8] + var6 << 1984529732, var7 - -hp.field_g[var8] << -1129783740, 96, var11 * var10, hp.field_j[this.field_C]);
                        var8 = (60 + var8) % 120;
                        oo.d(hp.field_l[var8] + var6, hp.field_g[var8] + var7, 6, 0, var11 * var9);
                        oo.a(hp.field_l[var8] + var6 << 1405019172, var7 - -hp.field_g[var8] << -395194012, 96, var10 * var11, hp.field_j[this.field_C]);
                        var11++;
                        if (var12 != 0) {
                            statePc = 29;
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
                        if (var12 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        wa.field_b[this.field_C].g(var4, var5);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_27_0 = (RuntimeException) (var3);
                    stackIn_26_0 = stackIn_27_0;
                    stackIn_27_1 = new StringBuilder().append("mg.H(").append(param0).append(',');
                    stackIn_26_1 = stackIn_27_1;
                    if (param1 == null) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_28_2 = "{...}";
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_28_2 = "null";
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    throw fa.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
                }
                case 29: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_F = 68;
        field_J = Math.atan2(1.0, 0.0);
    }
}
