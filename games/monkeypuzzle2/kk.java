/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kk {
    private le field_a;
    private int field_g;
    private le[] field_f;
    private boolean field_d;
    int field_e;
    static int field_b;
    static String field_h;
    private int field_i;
    private sg field_c;

    final static byte[] a(int param0, hb param1, byte[] param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_3_0 = null;
        byte[] stackIn_21_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 == 99) {
                            statePc = 4;
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
                        stackIn_3_0 = (byte[]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var4_int = param1.f(8, param0);
                        if (-1 != (var4_int ^ -1)) {
                            statePc = 7;
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
                        return null;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param2 == null) {
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
                        if (param2.length == var4_int) {
                            statePc = 11;
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
                        param2 = new byte[var4_int];
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = param1.f(8, 3);
                        var6 = (byte)param1.f(8, 8);
                        if (-1 > (var5 ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var7 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var4_int <= var7) {
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
                        param2[var7] = (byte)var6;
                        var7++;
                        if (var8 != 0) {
                            statePc = 23;
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
                        if (var8 == 0) {
                            statePc = 13;
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
                    try {
                        if (var8 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7 = 0;
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
                        if (var7 >= var4_int) {
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
                        stackIn_24_0 = (byte[]) (param2);
                        stackIn_21_0 = stackIn_24_0;
                        if (var8 != 0) {
                            statePc = 24;
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
                        stackIn_21_0[var7] = (byte)(var6 + param1.f(param3 + -91, var5));
                        var7++;
                        if (var8 == 0) {
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
                        stackIn_24_0 = (byte[]) (param2);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0;
                }
                case 25: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_27_0 = (RuntimeException) (var4);
                    stackIn_26_0 = stackIn_27_0;
                    stackIn_27_1 = new StringBuilder().append("kk.D(").append(param0).append(',');
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
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_0 = stackIn_30_0;
                    stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
                    stackIn_29_1 = stackIn_30_1;
                    if (param2 == null) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_31_2 = "{...}";
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_31_2 = "null";
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    throw la.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(byte param0) {
        int discarded$0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        vk stackIn_59_0 = null;
        vk stackIn_60_0 = null;
        vk stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        vk stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        int stackIn_62_3 = 0;
        vk stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_63_3 = 0;
        vk stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        int stackIn_64_4 = 0;
        vk stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        vk stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        vk stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        vk stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        vk stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        vk stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_70_2 = 0;
        int stackIn_70_3 = 0;
        vk stackIn_71_0 = null;
        vk stackIn_72_0 = null;
        vk stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        vk stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        vk stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        vk stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        int stackIn_76_3 = 0;
        Object stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        Object stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        Object stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        int stackIn_94_2 = 0;
        int stackIn_94_3 = 0;
        int statePc = 0;
        int var2_int = 0;
        le var2 = null;
        int var3 = 0;
        vk var3_ref_vk = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = MonkeyPuzzle2.field_F ? 1 : 0;
                    ke.field_i.a(0, 0);
                    var2_int = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (480 <= var2_int) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    kj.field_F.c(-(kj.field_F.field_m >> -533000127) + 80, var2_int);
                    var2_int = var2_int + kj.field_F.field_n;
                    if (var6 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var6 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    df.field_q[bc.field_a].c(-(df.field_q[0].field_m >> -1513667871) + 80, ne.field_b);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var2_int = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (-481 >= (var2_int ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    kj.field_F.c(560 + -(kj.field_F.field_m >> 1482303553), var2_int);
                    var2_int = var2_int + kj.field_F.field_n;
                    if (var6 != 0) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var6 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    df.field_q[ob.field_r].f(-(df.field_q[0].field_m >> 1825633889) + 560, dd.field_e);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var2_int = 0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if ((var2_int ^ -1) <= (dk.field_j ^ -1)) {
                        statePc = 22;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_23_0 = 0;
                    stackIn_15_0 = stackIn_23_0;
                    if (var6 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var3 = stackIn_15_0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var3 >= 5) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    ge.g(pf.a((byte) 25, 640), pf.a((byte) -100, 100), pf.a((byte) 19, 500), 9283525, 60);
                    var3++;
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
                    ma.a(ve.field_x[var2_int][0] << -243469980, ve.field_x[var2_int][1] << 142028388, 128, 40000);
                    var2_int++;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (var6 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = param0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (stackIn_23_0 >= 119) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    discarded$0 = this.a((byte) 24, -74);
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if ((this.field_g ^ -1) == -9) {
                        statePc = 32;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (10 == this.field_g) {
                        statePc = 32;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if ((this.field_g ^ -1) != -10) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var2 = kb.field_a[2];
                    statePc = 33;
                    continue stateLoop;
                }
                case 29: {
                    if ((this.field_g ^ -1) != -5) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var2 = kb.field_a[3];
                    statePc = 33;
                    continue stateLoop;
                }
                case 31: {
                    var2 = kb.field_a[this.field_g];
                    statePc = 33;
                    continue stateLoop;
                }
                case 32: {
                    var2 = kb.field_a[5];
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (ad.a(false)) {
                        statePc = 38;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (ek.a((byte) -125)) {
                        statePc = 38;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (this.field_d) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (20 >= this.field_i) {
                        statePc = 41;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (!this.field_d) {
                        statePc = 46;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (-1 < (this.field_i ^ -1)) {
                        statePc = 46;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var3 = var2.field_n;
                    var4 = this.field_i * 255 / 20;
                    if (var4 <= 255) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var4 = 255;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    var5 = var4 + -40;
                    if (0 <= var5) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var5 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    ma.a(var2, 320 - (var2.field_m >> -793499935), 0, var3, var4, var5);
                    if (var6 == 0) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var2.c(-(var2.field_m >> -515955519) + 320, 0);
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (this.field_g == 2) {
                        statePc = 87;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (-4 != (this.field_g ^ -1)) {
                        statePc = 51;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    this.a((byte) 1, true);
                    if (var6 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (-5 != (this.field_g ^ -1)) {
                        statePc = 54;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    this.a((byte) 1, false);
                    if (var6 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (this.field_g == 5) {
                        statePc = 85;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (6 == this.field_g) {
                        statePc = 83;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (-11 == (this.field_g ^ -1)) {
                        statePc = 83;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (this.field_g != 7) {
                        statePc = 77;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    lb.a(120, 400, (byte) -119, wc.field_e, 180, 185);
                    var3_ref_vk = pl.field_e;
                    var4 = var3_ref_vk.field_C + 200;
                    var5 = 4 + (var3_ref_vk.field_j + var3_ref_vk.field_D);
                    var3_ref_vk.a(f.field_f, 320, var4, 1, -1);
                    stackIn_60_0 = (vk) (var3_ref_vk);
                    stackIn_59_0 = stackIn_60_0;
                    if (-1 == (fg.field_b ^ -1)) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    stackIn_61_0 = (vk) ((Object) stackIn_59_0);
                    stackIn_61_1 = 1;
                    statePc = 61;
                    continue stateLoop;
                }
                case 60: {
                    stackIn_61_0 = (vk) ((Object) stackIn_60_0);
                    stackIn_61_1 = 0;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    stackIn_63_0 = (vk) ((Object) stackIn_61_0);
                    stackIn_62_0 = stackIn_63_0;
                    stackIn_63_1 = stackIn_61_1;
                    stackIn_62_1 = stackIn_63_1;
                    stackIn_63_2 = 0;
                    stackIn_62_2 = stackIn_63_2;
                    stackIn_63_3 = 22890;
                    stackIn_62_3 = stackIn_63_3;
                    if (hf.field_f.field_A == 0) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    stackIn_64_0 = (vk) ((Object) stackIn_62_0);
                    stackIn_64_1 = stackIn_62_1;
                    stackIn_64_2 = stackIn_62_2;
                    stackIn_64_3 = stackIn_62_3;
                    stackIn_64_4 = 1;
                    statePc = 64;
                    continue stateLoop;
                }
                case 63: {
                    stackIn_64_0 = (vk) ((Object) stackIn_63_0);
                    stackIn_64_1 = stackIn_63_1;
                    stackIn_64_2 = stackIn_63_2;
                    stackIn_64_3 = stackIn_63_3;
                    stackIn_64_4 = 0;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    ((vk) (Object) stackIn_64_0).a(wa.a(stackIn_64_1 != 0, stackIn_64_2 != 0, stackIn_64_3, stackIn_64_4 != 0), 320, var4 - -var5, 1, -1);
                    stackIn_66_0 = (vk) (var3_ref_vk);
                    stackIn_65_0 = stackIn_66_0;
                    stackIn_66_1 = -88;
                    stackIn_65_1 = stackIn_66_1;
                    if (0 == fg.field_b) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    stackIn_67_0 = (vk) ((Object) stackIn_65_0);
                    stackIn_67_1 = stackIn_65_1;
                    stackIn_67_2 = 1;
                    statePc = 67;
                    continue stateLoop;
                }
                case 66: {
                    stackIn_67_0 = (vk) ((Object) stackIn_66_0);
                    stackIn_67_1 = stackIn_66_1;
                    stackIn_67_2 = 0;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    stackIn_69_0 = (vk) ((Object) stackIn_67_0);
                    stackIn_68_0 = stackIn_69_0;
                    stackIn_69_1 = stackIn_67_1;
                    stackIn_68_1 = stackIn_69_1;
                    stackIn_69_2 = stackIn_67_2;
                    stackIn_68_2 = stackIn_69_2;
                    if ((hf.field_f.field_A ^ -1) == -1) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    stackIn_70_0 = (vk) ((Object) stackIn_68_0);
                    stackIn_70_1 = stackIn_68_1;
                    stackIn_70_2 = stackIn_68_2;
                    stackIn_70_3 = 1;
                    statePc = 70;
                    continue stateLoop;
                }
                case 69: {
                    stackIn_70_0 = (vk) ((Object) stackIn_69_0);
                    stackIn_70_1 = stackIn_69_1;
                    stackIn_70_2 = stackIn_69_2;
                    stackIn_70_3 = 0;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    ((vk) (Object) stackIn_70_0).a(lk.a(stackIn_70_1, stackIn_70_2 != 0, stackIn_70_3 != 0, false), 320, 20 + (var4 - -(var5 * 3)), 1, -1);
                    stackIn_72_0 = (vk) (var3_ref_vk);
                    stackIn_71_0 = stackIn_72_0;
                    if ((hf.field_f.field_A ^ -1) == -1) {
                        statePc = 72;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    stackIn_73_0 = (vk) ((Object) stackIn_71_0);
                    stackIn_73_1 = 1;
                    statePc = 73;
                    continue stateLoop;
                }
                case 72: {
                    stackIn_73_0 = (vk) ((Object) stackIn_72_0);
                    stackIn_73_1 = 0;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    stackIn_75_0 = (vk) ((Object) stackIn_73_0);
                    stackIn_74_0 = stackIn_75_0;
                    stackIn_75_1 = stackIn_73_1;
                    stackIn_74_1 = stackIn_75_1;
                    stackIn_75_2 = 122;
                    stackIn_74_2 = stackIn_75_2;
                    if (-1 == (fg.field_b ^ -1)) {
                        statePc = 75;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    stackIn_76_0 = (vk) ((Object) stackIn_74_0);
                    stackIn_76_1 = stackIn_74_1;
                    stackIn_76_2 = stackIn_74_2;
                    stackIn_76_3 = 1;
                    statePc = 76;
                    continue stateLoop;
                }
                case 75: {
                    stackIn_76_0 = (vk) ((Object) stackIn_75_0);
                    stackIn_76_1 = stackIn_75_1;
                    stackIn_76_2 = stackIn_75_2;
                    stackIn_76_3 = 0;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    ((vk) (Object) stackIn_76_0).a(ma.a(stackIn_76_1 != 0, (byte) stackIn_76_2, stackIn_76_3 != 0, false), 320, 20 + (var5 * 4 + var4 - -40), 1, -1);
                    if (var6 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if ((this.field_g ^ -1) != -10) {
                        statePc = 80;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    this.c(119);
                    if (var6 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (-9 == (this.field_g ^ -1)) {
                        statePc = 82;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 82: {
                    ri.a((byte) -122, this.field_i, false);
                    if (var6 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    ri.a((byte) -101, this.field_i, true);
                    if (var6 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    ri.a((byte) -100, this.field_i, false);
                    if (var6 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    this.b(69);
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    var3 = 0;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if ((this.field_c.field_i ^ -1) >= (var3 ^ -1)) {
                        statePc = 95;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (var6 != 0) {
                        statePc = 98;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    stackIn_93_0 = this;
                    stackIn_92_0 = stackIn_93_0;
                    stackIn_93_1 = -1;
                    stackIn_92_1 = stackIn_93_1;
                    stackIn_93_2 = var3;
                    stackIn_92_2 = stackIn_93_2;
                    if (this.field_c.field_a != var3) {
                        statePc = 93;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    stackIn_94_0 = this;
                    stackIn_94_1 = stackIn_92_1;
                    stackIn_94_2 = stackIn_92_2;
                    stackIn_94_3 = 1;
                    statePc = 94;
                    continue stateLoop;
                }
                case 93: {
                    stackIn_94_0 = this;
                    stackIn_94_1 = stackIn_93_1;
                    stackIn_94_2 = stackIn_93_2;
                    stackIn_94_3 = 0;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    this.a(stackIn_94_1, stackIn_94_2, stackIn_94_3 != 0);
                    var3++;
                    if (var6 == 0) {
                        statePc = 89;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (ad.a(false)) {
                        statePc = 97;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var3 = hl.field_a;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    if (32 < var3) {
                        statePc = 100;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 100: {
                    var3 = 32;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    var4 = hl.field_a * 3;
                    if ((var4 ^ -1) >= -129) {
                        statePc = 103;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var4 = 128;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    this.a(var3, (byte) 110, 0, var4, 0, 0, 0, 0);
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 != -104) {
            field_h = (String) null;
        }
    }

    private final void a(byte param0, boolean param1) {
        String stackIn_12_0 = null;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int var3;
        int var4;
        vk var5;
        int var6;
        int var7_int;
        String var7;
        int var8;
        int var9;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        this.field_a.e();
        var3 = 380;
        var4 = 263;
        ge.d(3, 3, var3 - 6, -6 + var4, 16249775);
        lb.a(0, var3, (byte) -124, wc.field_e, 0, var4);
        var5 = pl.field_e;
        var6 = 0;
        var7_int = si.field_r / 8;
        if (param0 == 1) {
          L0: while (true) {
            L1: {
              L2: {
                if (var6 >= 8) {
                  break L2;
                } else {
                  var8 = 0;
                  stackIn_15_0 = -33;

                  stackIn_15_1 = si.field_r + var7_int * 6 & 63 ^ -1;

                  if (var9 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_15_0 <= stackIn_15_1) {
                        var8 = var7_int % 4;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    nh.field_f[0][var6 % 5][var8].c(-160 + 40 * var6 + (var3 >> 1910711617), 15);
                    var6++;
                    var7_int++;
                    if (var9 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L4: {
                if (param1) {
                  var5.a(mk.field_j, 15, 53, -30 + var3, var4, 1, -1, 0, 0, 14);
                  break L4;
                } else {
                  L5: {
                    var6 = hb.a(false);
                    if (qb.field_b) {
                      stackIn_12_0 = gg.a(new String[]{Integer.toString(var6), Integer.toString(5)}, jg.field_kb, true);
                      break L5;
                    } else {
                      stackIn_12_0 = lg.field_I;
                      break L5;
                    }
                  }
                  var7 = stackIn_12_0;
                  var5.a(gg.a(new String[]{var7}, je.field_a, true), 14, 53, var3 + -30, var4, 1, -1, 0, 0, 14);
                  break L4;
                }
              }
              ac.field_a.a((byte) 118);
              var6 = this.field_i * var4 / 20;
              stackIn_15_0 = var6 ^ -1;
              stackIn_15_1 = var4 ^ -1;
              break L1;
            }
            L6: {
              if (stackIn_15_0 < stackIn_15_1) {
                var6 = var4;
                break L6;
              } else {
                break L6;
              }
            }
            this.field_a.b(130, (-var6 + var4 >> 1971065441) + 104, var3, var6);
            return;
          }
        } else {
          return;
        }
    }

    private final int a(int param0, byte param1) {
        int var3;
        L0: {
          if (2 != this.field_g) {
            L1: {
              L2: {
                if (3 == this.field_g) {
                  break L2;
                } else {
                  if ((this.field_g ^ -1) != -5) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (-3 >= (param0 ^ -1)) {
                var3 = b.field_j[this.field_g][param0];
                if (19 == var3) {
                  return 30 + (this.field_f[param0].field_m + fl.field_a[this.field_g]);
                } else {
                  if (-19 != (var3 ^ -1)) {
                    break L0;
                  } else {
                    return fl.field_a[this.field_g] + -10 + (-this.field_f[param0].field_m + -20);
                  }
                }
              } else {
                break L1;
              }
            }
            return fl.field_a[this.field_g];
          } else {
            break L0;
          }
        }
        if (param1 == 52) {
          if (3 > param0) {
            return fl.field_a[this.field_g] + (20 + this.field_f[param0].field_m) * param0;
          } else {
            return 20 + this.field_f[param0].field_m + fl.field_a[this.field_g];
          }
        } else {
          return -100;
        }
    }

    final void a(boolean param0, boolean param1) {
        if (param1) {
            this.b((byte) -56);
        }
        this.field_c.a((byte) 60, this.a(-6, p.field_a, ei.field_a), param0);
    }

    private final void b(int param0) {
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int var2;
        int var3;
        vk var4;
        de var5;
        String var6;
        String[] var7_ref_String__;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        Throwable var15;
        int[] var19;
        L0: {
          var14 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (s.field_S != null) {
            break L0;
          } else {
            s.field_S = o.a(41, 10, 3, 1, -114);
            break L0;
          }
        }
        L1: {
          if (param0 >= 39) {
            break L1;
          } else {
            var15 = (Throwable) null;
            kk.a((String) null, (byte) -126, (Throwable) null);
            break L1;
          }
        }
        L2: {
          L3: {
            this.field_a.e();
            var2 = 380;
            var3 = 275;
            ge.d(3, 3, var2 + -6, var3 + -6, 16249775);
            lb.a(0, var2, (byte) -12, wc.field_e, 0, var3);
            sb.field_r.a(bg.field_B[ef.field_b], var2 >> 693749377, 30, 9330743, -1);
            var4 = pl.field_e;
            var5 = s.field_S;
            if (!var5.field_l) {
              break L3;
            } else {
              L4: {
                if (var5.field_g != null) {
                  break L4;
                } else {
                  var6 = re.field_b;
                  if (var14 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              var6 = qc.field_O;
              var7_ref_String__ = var5.field_g[ef.field_b];
              var19 = var5.field_i[ef.field_b];
              var9 = ti.a(0, var5, ef.field_b, pg.field_b);
              var10 = var4.field_C - -40;
              var11 = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    L8: {
                      if (var11 >= 10) {
                        break L8;
                      } else {
                        stackIn_23_0 = 1 & var11 ^ -1;

                        stackIn_23_1 = -1;

                        if (var14 != 0) {
                          break L7;
                        } else {
                          L9: {
                            L10: {
                              if (stackIn_23_0 != stackIn_23_1) {
                                break L10;
                              } else {
                                ge.c(13, -2 + -var4.field_C + var10, 354, 18, 12303291, 80);
                                if (var14 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            ge.c(13, -2 + (-var4.field_C + var10), 354, 18, 14540253, 40);
                            break L9;
                          }
                          L11: {
                            if (null != var7_ref_String__[var11]) {
                              L12: {
                                var12 = 1;
                                var13 = var19[var11];
                                if ((var9 ^ -1) == (var11 ^ -1)) {
                                  var12 = 5683782;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              var4.c(var11 + 1 + ". ", 30, var10, var12, -1);
                              var4.b(var7_ref_String__[var11], 30, var10, var12, -1);
                              var4.c(Integer.toString(var13), 360, var10, var12, -1);
                              var6 = "";
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var10 += 18;
                          var11++;
                          if (var14 == 0) {
                            continue L5;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    if (hf.field_f == null) {
                      break L6;
                    } else {
                      stackIn_23_0 = var9;
                      stackIn_23_1 = -1;
                      break L7;
                    }
                  }
                  if (stackIn_23_0 != stackIn_23_1) {
                    break L6;
                  } else {
                    if (0 != hf.field_f.field_A) {
                      var4.b(cl.field_e, 30, var10, 5683782, -1);
                      var4.c(Integer.toString(hf.field_f.field_A), 360, var10, 5683782, -1);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                if (var14 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
          }
          var6 = eg.field_h;
          break L2;
        }
        L13: {
          pl.field_e.a(nc.field_c, 30, var3 + -37, -60 + var2, 40, 1, -1, 1, 0, 12);
          var7 = 137;
          sb.field_r.a(var6, var2 / 2, var7, 9330743, -1);
          ac.field_a.a((byte) 116);
          var8 = var3 * this.field_i / 20;
          if (var8 <= var3) {
            break L13;
          } else {
            var8 = var3;
            break L13;
          }
        }
        this.field_a.b(130, (-var8 + var3 >> 530617729) + 90, var2, var8);
    }

    final void a(int param0) {
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = MonkeyPuzzle2.field_F ? 1 : 0;
                    var2 = -53 / ((param0 - 15) / 33);
                    if (this.field_d) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_i = this.field_i + 1;
                    if (20 > this.field_i) {
                        statePc = 3;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    this.field_i = this.field_i - 1;
                    if ((this.field_i ^ -1) >= -1) {
                        statePc = 6;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (-1 != this.field_e) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ej.field_b = 50;
                    l.field_f = this.field_e;
                    if (var4 == 0) {
                        statePc = 74;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (this.field_g == 5) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (this.field_g == 6) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (-9 == (this.field_g ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    ee.field_F = -1;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    pg.field_d[this.field_e].c((byte) -122);
                    if ((this.field_e ^ -1) == -3) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    s.field_S = null;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var3 = qh.field_b;
                    if (this.field_g != 1) {
                        statePc = 22;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if ((this.field_e ^ -1) == -7) {
                        statePc = 22;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (-11 == (this.field_e ^ -1)) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (2 != this.field_e) {
                        statePc = 28;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (1 != var3) {
                        statePc = 25;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    vl.field_g = 1;
                    if (var4 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var3 != 0) {
                        statePc = 29;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    vl.field_g = 0;
                    if (var4 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    vl.field_g = this.field_g;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    l.field_f = this.field_e;
                    qh.field_b = this.field_e;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    return;
                }
                case 31: {
                    if (!ba.a(-1)) {
                        statePc = 59;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (13 != oa.field_H) {
                        statePc = 41;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if ((this.field_g ^ -1) == -1) {
                        statePc = 41;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (this.field_g != 7) {
                        statePc = 36;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 36: {
                    this.field_e = vl.field_g;
                    if (1 != this.field_g) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    this.field_e = -1;
                    h.a(0, true);
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (-1 != this.field_e) {
                        statePc = 40;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 40: {
                    pg.field_d[this.field_e].c((byte) -89);
                    if (var4 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (this.field_g == 2) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (this.field_g == 3) {
                        statePc = 45;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (-5 != (this.field_g ^ -1)) {
                        statePc = 54;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (this.field_g == 2) {
                        statePc = 52;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (3 == this.field_g) {
                        statePc = 50;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (-5 == (this.field_g ^ -1)) {
                        statePc = 49;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 49: {
                    this.field_c.b((byte) 119);
                    this.field_c.a(this.d(122), 83);
                    if (var4 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    this.field_c.b((byte) 113);
                    this.field_c.a(this.d(122), -58);
                    if (var4 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    this.field_c.b((byte) 107);
                    this.field_c.a(this.a(-99, 3), -117);
                    if (var4 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    this.field_c.e(0);
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (this.field_c.field_a == -1) {
                        statePc = 31;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    this.a(this.field_c.field_a, false, 77);
                    if (var4 != 0) {
                        statePc = 61;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (var4 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if ((this.field_e ^ -1) != (this.field_g ^ -1)) {
                        statePc = 61;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if ((this.field_e ^ -1) != 0) {
                        statePc = 63;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 63: {
                    pg.field_d[this.field_e].a(false, false);
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    this.field_d = true;
                    this.field_i = 20;
                    return;
                }
                case 65: {
                    this.field_c.a(this.a(-6, p.field_a, ei.field_a), this.a(-6, ab.field_e, qg.field_c), true);
                    if (this.field_c.field_a != -1) {
                        statePc = 67;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 67: {
                    this.a(this.field_c.field_a, true, 59);
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (this.field_e != qh.field_b) {
                        statePc = 70;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 70: {
                    this.field_i = 20;
                    if (this.field_e == -1) {
                        statePc = 72;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    pg.field_d[this.field_e].a(true, false);
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    this.field_d = true;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    return;
                }
                case 74: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(String param0, byte param1, Throwable param2) {
        try {
            md stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            md stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            java.net.URL stackIn_14_4 = null;
            StringBuilder stackIn_14_5 = null;
            md stackIn_15_0 = null;
            int stackIn_15_1 = 0;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            java.net.URL stackIn_15_4 = null;
            StringBuilder stackIn_15_5 = null;
            String stackIn_15_6 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            ic var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = "";
                            if (param2 != null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var3 = id.a(param2, (byte) 37);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (param0 == null) {
                                statePc = 9;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (param2 != null) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var3 = var3 + " | ";
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var3 = var3 + param0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            ke.a(var3, (byte) 80);
                            var7 = eg.a("%3a", 4, ":", var3);
                            var8 = eg.a("%40", 4, "@", var7);
                            var9 = eg.a("%26", 4, "&", var8);
                            var10 = eg.a("%23", 4, "#", var9);
                            if (ni.field_e == null) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return;
                    }
                    case 12: {
                        try {
                            stackIn_14_0 = fk.field_c;
                            stackIn_13_0 = stackIn_14_0;
                            stackIn_14_1 = 101;
                            stackIn_13_1 = stackIn_14_1;
                            stackIn_14_2 = null;
                            stackIn_13_2 = stackIn_14_2;
                            stackIn_14_3 = null;
                            stackIn_13_3 = stackIn_14_3;
                            stackIn_14_4 = ni.field_e.getCodeBase();
                            stackIn_13_4 = stackIn_14_4;
                            stackIn_14_5 = new StringBuilder().append("clienterror.ws?c=").append(kd.field_c).append("&u=");
                            stackIn_13_5 = stackIn_14_5;
                            if (null == ck.field_f) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackIn_15_0 = (md) ((Object) stackIn_13_0);
                            stackIn_15_1 = stackIn_13_1;
                            stackIn_15_2 = null;
                            stackIn_15_3 = null;
                            stackIn_15_4 = (java.net.URL) ((Object) stackIn_13_4);
                            stackIn_15_5 = (StringBuilder) ((Object) stackIn_13_5);
                            stackIn_15_6 = ck.field_f;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackIn_15_0 = (md) ((Object) stackIn_14_0);
                            stackIn_15_1 = stackIn_14_1;
                            stackIn_15_2 = null;
                            stackIn_15_3 = null;
                            stackIn_15_4 = (java.net.URL) ((Object) stackIn_14_4);
                            stackIn_15_5 = (StringBuilder) ((Object) stackIn_14_5);
                            stackIn_15_6 = "" + cc.field_b;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var4 = ((md) (Object) stackIn_15_0).a((byte) stackIn_15_1, new java.net.URL(stackIn_15_4, stackIn_15_6 + "&v1=" + md.field_l + "&v2=" + md.field_m + "&e=" + var10));
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (0 != var4.field_g) {
                                statePc = 20;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            em.a(1L, false);
                            if (var6 != 0) {
                                statePc = 22;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var6 == 0) {
                                statePc = 16;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if ((var4.field_g ^ -1) == -2) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var5 = (DataInputStream) (var4.field_b);
                            var5.read();
                            var5.close();
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        var3_ref = (Exception) ((Object) caughtException);
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
                        if (param1 >= 56) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        field_h = (String) null;
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 27: {
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

    private final void a(int param0, int param1, boolean param2) {
        String[] array$0 = null;
        String[] stackIn_6_0 = null;
        String[] stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        String[] stackIn_7_0 = null;
        String[] stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        String stackIn_7_3 = null;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int var4;
        int var5;
        int var6;
        String var7;
        int var8;
        int var9;
        vk var10;
        int var11;
        int var12;
        int var13;
        int var14;
        L0: {
          var14 = MonkeyPuzzle2.field_F ? 1 : 0;
          var4 = this.a((byte) -128, param1);
          var5 = this.a(param1, (byte) 52);
          var6 = b.field_j[this.field_g][param1];
          var7 = ma.field_a[var6];
          if (var7 == null) {
            var7 = "ERROR: missing text";
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          L2: {
            if ((var6 ^ -1) != -17) {
              break L2;
            } else {
              L3: {
                array$0 = new String[1];
                stackIn_6_0 = (String[]) (array$0);

                stackIn_6_1 = (String[]) (array$0);

                stackIn_6_2 = 0;

                if (qb.field_b) {
                  stackIn_7_0 = (String[]) ((Object) stackIn_6_0);
                  stackIn_7_1 = (String[]) ((Object) stackIn_6_1);
                  stackIn_7_2 = stackIn_6_2;
                  stackIn_7_3 = ie.field_d;
                  break L3;
                } else {
                  stackIn_7_0 = (String[]) ((Object) stackIn_6_0);
                  stackIn_7_1 = (String[]) ((Object) stackIn_6_1);
                  stackIn_7_2 = stackIn_6_2;
                  stackIn_7_3 = qg.field_b;
                  break L3;
                }
              }
              stackIn_7_1[stackIn_7_2] = stackIn_7_3;
              var7 = gg.a(stackIn_7_0, var7, true);
              if (var14 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          if (-6 != (var6 ^ -1)) {
            break L1;
          } else {
            if ((this.field_g ^ -1) == -3) {
              var7 = pl.field_c;
              break L1;
            } else {
              break L1;
            }
          }
        }
        var8 = this.field_f[param1].field_m;
        if (param0 == -1) {
          L4: {
            this.field_f[param1].e();
            if (param2) {
              stackIn_17_0 = 5683782;
              break L4;
            } else {
              stackIn_17_0 = 1;
              break L4;
            }
          }
          L5: {
            var9 = stackIn_17_0;
            if (-8 == (this.field_g ^ -1)) {
              break L5;
            } else {
              lb.a(0, var8, (byte) -33, wc.field_e, 0, 40);
              break L5;
            }
          }
          L6: {
            L7: {
              L8: {
                var10 = sb.field_r;
                if ((var6 ^ -1) == -12) {
                  break L8;
                } else {
                  if (-13 != (var6 ^ -1)) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                var11 = lh.field_b - -137;
                var12 = -var11 + var8 >> -839809695;
                var12 = var12 + (lh.field_b - -13);
                var10.c(var7, var12, var10.field_C, var9, -1);
                sd.field_f.c(var12, -6 + mc.field_b[this.field_g] / 2);
                if (-12 == (var6 ^ -1)) {
                  stackIn_25_0 = re.field_e;
                  break L9;
                } else {
                  stackIn_25_0 = ol.field_e;
                  break L9;
                }
              }
              var13 = stackIn_25_0;
              de.field_f.c(146 * var13 / 256 + -2 + var12, 14);
              if (var14 == 0) {
                break L6;
              } else {
                break L7;
              }
            }
            var10.a(var7, var8 >> -935373055, var10.field_C, var9, -1);
            break L6;
          }
          L10: {
            L11: {
              ac.field_a.a((byte) 114);
              var11 = 40 * this.field_i / 20;
              if (var11 > 40) {
                break L11;
              } else {
                if (!ad.a(false)) {
                  break L10;
                } else {
                  break L11;
                }
              }
            }
            var11 = 40;
            break L10;
          }
          this.field_f[param1].b(var5, var4 - -(40 - var11 >> 378069313), var8, var11);
          return;
        } else {
          return;
        }
    }

    private final int a(int param0, boolean param1) {
        if (!param1) {
            return -16;
        }
        return 40;
    }

    private final void c(int param0) {
        this.field_a.e();
        int var2 = 380;
        int var3 = 275;
        ge.d(3, 3, -6 + var2, -6 + var3, 16249775);
        lb.a(0, var2, (byte) 64, wc.field_e, 0, var3);
        int var5 = 86 % ((53 - param0) / 61);
        int var4 = 90;
        sb.field_r.a(el.field_c, 20, var4, -40 + var2, 200, 9330743, -1, 1, 0, 0);
        ac.field_a.a((byte) 127);
        int var6 = this.field_i * var3 / 20;
        if ((var3 ^ -1) > (var6 ^ -1)) {
            var6 = var3;
        }
        this.field_a.b(130, 90 + (var3 + -var6 >> -1958809311), var2, var6);
    }

    private final int d(int param0) {
        int var2;
        int var3;
        L0: {
          var3 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param0 >= 93) {
            break L0;
          } else {
            this.a(121, true, 108);
            break L0;
          }
        }
        L1: {
          var2 = this.field_c.field_a;
          if (this.field_c.a((byte) 10)) {
            break L1;
          } else {
            if (-97 != (oa.field_H ^ -1)) {
              break L1;
            } else {
              L2: {
                this.field_c.field_b = false;
                if (var2 >= 0) {
                  break L2;
                } else {
                  var2 = 0;
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if ((var2 ^ -1) == -2) {
                  break L3;
                } else {
                  if (-1 == (var2 ^ -1)) {
                    break L1;
                  } else {
                    var2 = 1;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var2 = 2;
              break L1;
            }
          }
        }
        L4: {
          if (this.field_c.a((byte) 10)) {
            break L4;
          } else {
            if ((oa.field_H ^ -1) != -98) {
              break L4;
            } else {
              L5: {
                this.field_c.field_b = false;
                if (0 > var2) {
                  break L5;
                } else {
                  L6: {
                    if (1 == var2) {
                      break L6;
                    } else {
                      if (0 != var2) {
                        var2 = 1;
                        if (var3 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  var2 = 2;
                  if (var3 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              var2 = 0;
              break L4;
            }
          }
        }
        L7: {
          if (this.field_c.a((byte) 10)) {
            break L7;
          } else {
            if ((oa.field_H ^ -1) != -99) {
              break L7;
            } else {
              L8: {
                this.field_c.field_b = false;
                if ((var2 ^ -1) <= -1) {
                  break L8;
                } else {
                  var2 = 2;
                  if (var3 == 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              if (-3 < (var2 ^ -1)) {
                L9: {
                  if (var2 != 0) {
                    break L9;
                  } else {
                    var2 = 1;
                    if (var3 == 0) {
                      break L7;
                    } else {
                      break L9;
                    }
                  }
                }
                var2--;
                break L7;
              } else {
                break L7;
              }
            }
          }
        }
        L10: {
          if (this.field_c.a((byte) 10)) {
            break L10;
          } else {
            if (oa.field_H != 99) {
              break L10;
            } else {
              L11: {
                this.field_c.field_b = false;
                if (var2 == -1) {
                  break L11;
                } else {
                  L12: {
                    if (var2 < 1) {
                      break L12;
                    } else {
                      if ((var2 ^ -1) != -2) {
                        break L10;
                      } else {
                        var2 = 0;
                        if (var3 == 0) {
                          break L10;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  var2++;
                  if (var3 == 0) {
                    break L10;
                  } else {
                    break L11;
                  }
                }
              }
              var2 = 2;
              break L10;
            }
          }
        }
        return var2;
    }

    private final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int stackIn_12_0 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 == -6) {
          var4 = 0;
          L0: while (true) {
            L1: {
              if ((b.field_j[this.field_g].length ^ -1) >= (var4 ^ -1)) {
                break L1;
              } else {
                var5 = this.a((byte) -128, var4);
                stackIn_12_0 = this.a(var4, (byte) 52);

                if (var6 != 0) {
                  return stackIn_12_0;
                } else {
                  L2: {
                    if (stackIn_12_0 > param2) {
                      break L2;
                    } else {
                      if ((param2 ^ -1) <= (this.b(-6162, var4) ^ -1)) {
                        break L2;
                      } else {
                        if (param1 < var5) {
                          break L2;
                        } else {
                          if (param1 >= this.a(var4, true) + var5) {
                            break L2;
                          } else {
                            return var4;
                          }
                        }
                      }
                    }
                  }
                  var4++;
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            return -1;
          }
        } else {
          return 122;
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        int fieldTemp$0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_201_0 = 0;
        int var4;
        int var5;
        String[] var5_ref_String__;
        int var6;
        int var7;
        int var8;
        L0: {
          var8 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (this.field_c.c((byte) -104)) {
            cj.a((byte) -47, ke.field_h[0]);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param2 >= 15) {
            break L1;
          } else {
            field_b = 52;
            break L1;
          }
        }
        L2: {
          var4 = b.field_j[this.field_g][param0];
          var5 = var4;
          if (-1 == (var5 ^ -1)) {
            if (this.field_c.g(0)) {
              L3: {
                if (!qb.field_b) {
                  L4: {
                    if (!ok.a(false)) {
                      break L4;
                    } else {
                      if (-1 != (lg.field_w ^ -1)) {
                        break L4;
                      } else {
                        qb.field_b = true;
                        if (var8 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (s.field_S == null) {
                    break L3;
                  } else {
                    if (s.field_S.field_l) {
                      if (null == s.field_S.field_g) {
                        break L3;
                      } else {
                        L5: {
                          var5_ref_String__ = s.field_S.field_g[1];
                          if (null != var5_ref_String__[0]) {
                            stackIn_61_0 = 0;
                            break L5;
                          } else {
                            stackIn_61_0 = 1;
                            break L5;
                          }
                        }
                        qb.field_b = stackIn_61_0 != 0;
                        break L3;
                      }
                    } else {
                      s.field_S = null;
                      lg.field_w = lg.field_w + 1;
                      pg.field_b = null;
                      hf.field_f = new hj();
                      this.field_e = -1;
                      break L2;
                    }
                  }
                } else {
                  break L3;
                }
              }
              s.field_S = null;
              lg.field_w = lg.field_w + 1;
              pg.field_b = null;
              hf.field_f = new hj();
              this.field_e = -1;
              break L2;
            } else {
              break L2;
            }
          } else {
            L6: {
              L7: {
                L8: {
                  L9: {
                    L10: {
                      L11: {
                        L12: {
                          L13: {
                            L14: {
                              L15: {
                                L16: {
                                  L17: {
                                    L18: {
                                      L19: {
                                        L20: {
                                          L21: {
                                            L22: {
                                              L23: {
                                                L24: {
                                                  L25: {
                                                    if (var5 != 1) {
                                                      break L25;
                                                    } else {
                                                      if (var8 == 0) {
                                                        if (this.field_c.g(0)) {
                                                          h.a(0, true);
                                                          this.field_e = -1;
                                                          if (var8 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L24;
                                                          }
                                                        } else {
                                                          break L2;
                                                        }
                                                      } else {
                                                        break L25;
                                                      }
                                                    }
                                                  }
                                                  L26: {
                                                    if (-16 != (var5 ^ -1)) {
                                                      break L26;
                                                    } else {
                                                      if (var8 == 0) {
                                                        break L24;
                                                      } else {
                                                        break L26;
                                                      }
                                                    }
                                                  }
                                                  L27: {
                                                    if ((var5 ^ -1) != -6) {
                                                      break L27;
                                                    } else {
                                                      if (var8 == 0) {
                                                        break L23;
                                                      } else {
                                                        break L27;
                                                      }
                                                    }
                                                  }
                                                  if (13 == var5) {
                                                    break L22;
                                                  } else {
                                                    if (var5 == 3) {
                                                      break L21;
                                                    } else {
                                                      L28: {
                                                        if ((var5 ^ -1) != -3) {
                                                          break L28;
                                                        } else {
                                                          if (var8 == 0) {
                                                            break L20;
                                                          } else {
                                                            break L28;
                                                          }
                                                        }
                                                      }
                                                      if ((var5 ^ -1) == -12) {
                                                        break L19;
                                                      } else {
                                                        L29: {
                                                          if (12 != var5) {
                                                            break L29;
                                                          } else {
                                                            if (var8 == 0) {
                                                              break L18;
                                                            } else {
                                                              break L29;
                                                            }
                                                          }
                                                        }
                                                        L30: {
                                                          if (var5 != 4) {
                                                            break L30;
                                                          } else {
                                                            if (var8 == 0) {
                                                              break L17;
                                                            } else {
                                                              break L30;
                                                            }
                                                          }
                                                        }
                                                        L31: {
                                                          if ((var5 ^ -1) != -18) {
                                                            break L31;
                                                          } else {
                                                            if (var8 == 0) {
                                                              break L16;
                                                            } else {
                                                              break L31;
                                                            }
                                                          }
                                                        }
                                                        L32: {
                                                          if (var5 != 6) {
                                                            break L32;
                                                          } else {
                                                            if (var8 == 0) {
                                                              break L15;
                                                            } else {
                                                              break L32;
                                                            }
                                                          }
                                                        }
                                                        if (-8 == (var5 ^ -1)) {
                                                          break L14;
                                                        } else {
                                                          if (-9 == (var5 ^ -1)) {
                                                            break L13;
                                                          } else {
                                                            if (9 == var5) {
                                                              break L12;
                                                            } else {
                                                              L33: {
                                                                if (-19 != (var5 ^ -1)) {
                                                                  break L33;
                                                                } else {
                                                                  if (var8 == 0) {
                                                                    break L11;
                                                                  } else {
                                                                    break L33;
                                                                  }
                                                                }
                                                              }
                                                              if (var5 == 19) {
                                                                break L10;
                                                              } else {
                                                                L34: {
                                                                  if (var5 != 14) {
                                                                    break L34;
                                                                  } else {
                                                                    if (var8 == 0) {
                                                                      break L9;
                                                                    } else {
                                                                      break L34;
                                                                    }
                                                                  }
                                                                }
                                                                if (-11 == (var5 ^ -1)) {
                                                                  break L8;
                                                                } else {
                                                                  if (16 == var5) {
                                                                    break L7;
                                                                  } else {
                                                                    break L2;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                if (!this.field_c.g(0)) {
                                                  break L23;
                                                } else {
                                                  kg.field_c = 0;
                                                  break L23;
                                                }
                                              }
                                              if (this.field_c.g(0)) {
                                                this.field_e = 0;
                                                if (var8 == 0) {
                                                  break L6;
                                                } else {
                                                  break L22;
                                                }
                                              } else {
                                                break L2;
                                              }
                                            }
                                            if (!this.field_c.g(0)) {
                                              break L6;
                                            } else {
                                              this.field_e = 5;
                                              if (ok.a(false)) {
                                                this.field_e = 8;
                                                if (var8 == 0) {
                                                  break L6;
                                                } else {
                                                  break L21;
                                                }
                                              } else {
                                                break L2;
                                              }
                                            }
                                          }
                                          if (!this.field_c.g(0)) {
                                            break L6;
                                          } else {
                                            this.field_e = 3;
                                            if (var8 == 0) {
                                              break L6;
                                            } else {
                                              break L20;
                                            }
                                          }
                                        }
                                        if (this.field_c.g(0)) {
                                          this.field_e = 2;
                                          if (!ok.a(false)) {
                                            break L6;
                                          } else {
                                            this.field_e = 9;
                                            if (var8 == 0) {
                                              break L6;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                      L35: {
                                        if (this.field_c.c(102)) {
                                          cj.a((byte) -37, ke.field_h[0]);
                                          qb.a(256, 0);
                                          break L35;
                                        } else {
                                          break L35;
                                        }
                                      }
                                      L36: {
                                        if (this.field_c.b(-29996)) {
                                          cj.a((byte) 102, ke.field_h[0]);
                                          qb.a(256, 256);
                                          break L36;
                                        } else {
                                          break L36;
                                        }
                                      }
                                      L37: {
                                        if (this.field_c.a((byte) 10)) {
                                          L38: {
                                            L39: {
                                              var5 = lh.field_b + 137;
                                              var6 = (-var5 + (this.a(param0, (byte) 52) + this.b(-6162, param0)) >> -1332231615) - (-lh.field_b - 30);
                                              var7 = ((-var6 + ei.field_a) * 256 + 4608) / 146;
                                              if (-1 > (var7 ^ -1)) {
                                                break L39;
                                              } else {
                                                qb.a(256, 0);
                                                if (var8 == 0) {
                                                  break L38;
                                                } else {
                                                  break L39;
                                                }
                                              }
                                            }
                                            L40: {
                                              if (-257 < (var7 ^ -1)) {
                                                break L40;
                                              } else {
                                                qb.a(256, 256);
                                                if (var8 == 0) {
                                                  break L38;
                                                } else {
                                                  break L40;
                                                }
                                              }
                                            }
                                            qb.a(256, var7);
                                            break L38;
                                          }
                                          fieldTemp$0 = we.field_j + 1;
                                          we.field_j = we.field_j + 1;
                                          if (-26 <= (fieldTemp$0 ^ -1)) {
                                            break L37;
                                          } else {
                                            we.field_j = 0;
                                            cj.a((byte) 109, ke.field_h[0]);
                                            break L37;
                                          }
                                        } else {
                                          break L37;
                                        }
                                      }
                                      L41: {
                                        if (this.field_c.f(0)) {
                                          cj.a((byte) -126, ke.field_h[0]);
                                          jc.b(-42);
                                          break L41;
                                        } else {
                                          break L41;
                                        }
                                      }
                                      if (!this.field_c.d(25149)) {
                                        break L6;
                                      } else {
                                        cj.a((byte) -18, ke.field_h[0]);
                                        wc.a(-17076);
                                        if (var8 == 0) {
                                          break L6;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    L42: {
                                      if (this.field_c.c(102)) {
                                        w.a(-1, 0);
                                        break L42;
                                      } else {
                                        break L42;
                                      }
                                    }
                                    L43: {
                                      if (this.field_c.b(-29996)) {
                                        w.a(-1, 256);
                                        break L43;
                                      } else {
                                        break L43;
                                      }
                                    }
                                    L44: {
                                      if (this.field_c.a((byte) 10)) {
                                        L45: {
                                          var5 = lh.field_b - -128 - -9;
                                          var6 = 30 + (this.a(param0, (byte) 52) - (-this.b(-6162, param0) + var5) >> -1088242175) + lh.field_b;
                                          var7 = 256 * (ei.field_a - (var6 + -18)) / 146;
                                          if (-1 > (var7 ^ -1)) {
                                            break L45;
                                          } else {
                                            w.a(-1, 0);
                                            if (var8 == 0) {
                                              break L44;
                                            } else {
                                              break L45;
                                            }
                                          }
                                        }
                                        L46: {
                                          if (var7 < 256) {
                                            break L46;
                                          } else {
                                            w.a(-1, 256);
                                            if (var8 == 0) {
                                              break L44;
                                            } else {
                                              break L46;
                                            }
                                          }
                                        }
                                        w.a(-1, var7);
                                        break L44;
                                      } else {
                                        break L44;
                                      }
                                    }
                                    L47: {
                                      if (!this.field_c.f(0)) {
                                        break L47;
                                      } else {
                                        cj.a((byte) 103, ke.field_h[0]);
                                        vg.a(124);
                                        break L47;
                                      }
                                    }
                                    if (!this.field_c.d(25149)) {
                                      break L6;
                                    } else {
                                      cj.a((byte) -51, ke.field_h[0]);
                                      fl.a(-225);
                                      if (var8 == 0) {
                                        break L6;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  if (this.field_c.g(0)) {
                                    L48: {
                                      hl.field_a = 0;
                                      if (null == ba.field_f) {
                                        break L48;
                                      } else {
                                        rb.h(3591);
                                        if (var8 == 0) {
                                          break L6;
                                        } else {
                                          break L48;
                                        }
                                      }
                                    }
                                    ue.a((byte) 122, param1);
                                    if (var8 == 0) {
                                      break L6;
                                    } else {
                                      break L16;
                                    }
                                  } else {
                                    break L2;
                                  }
                                }
                                if (this.field_c.g(0)) {
                                  this.field_e = vl.field_g;
                                  if (var8 == 0) {
                                    break L6;
                                  } else {
                                    break L15;
                                  }
                                } else {
                                  break L2;
                                }
                              }
                              if (!this.field_c.g(0)) {
                                break L6;
                              } else {
                                L49: {
                                  if (-1 <= (hf.field_f.field_I ^ -1)) {
                                    break L49;
                                  } else {
                                    L50: {
                                      L51: {
                                        hf.field_f.field_A = hf.field_f.field_A + (10000 + hf.field_f.field_I);
                                        var5 = 10000 - -hf.field_f.field_I;
                                        var6 = ej.field_b % 3;
                                        if (-1 == (var6 ^ -1)) {
                                          break L51;
                                        } else {
                                          L52: {
                                            if (var6 == 1) {
                                              break L52;
                                            } else {
                                              var7 = var5 / 3;
                                              cl.field_d = cl.field_d + var7;
                                              nj.field_b = nj.field_b - (-var7 + var5);
                                              if (var8 == 0) {
                                                break L50;
                                              } else {
                                                break L52;
                                              }
                                            }
                                          }
                                          nj.field_b = nj.field_b - var5;
                                          if (var8 == 0) {
                                            break L50;
                                          } else {
                                            break L51;
                                          }
                                        }
                                      }
                                      cl.field_d = cl.field_d + var5;
                                      break L50;
                                    }
                                    hf.field_f.a(-19921);
                                    hf.field_f.field_I = -1;
                                    break L49;
                                  }
                                }
                                L53: {
                                  L54: {
                                    if (!ok.a(false)) {
                                      break L54;
                                    } else {
                                      L55: {
                                        if (hf.field_f.field_A > 0) {
                                          break L55;
                                        } else {
                                          if (0 < fg.field_b) {
                                            break L55;
                                          } else {
                                            this.field_e = 0;
                                            if (var8 == 0) {
                                              break L53;
                                            } else {
                                              break L55;
                                            }
                                          }
                                        }
                                      }
                                      this.field_e = 7;
                                      if (var8 == 0) {
                                        break L53;
                                      } else {
                                        break L54;
                                      }
                                    }
                                  }
                                  L56: {
                                    hf.field_f.c((byte) -108);
                                    s.field_S = null;
                                    if (fg.field_b == 0) {
                                      break L56;
                                    } else {
                                      L57: {
                                        if (0 < hf.field_f.field_A) {
                                          break L57;
                                        } else {
                                          this.field_e = 10;
                                          if (var8 == 0) {
                                            break L53;
                                          } else {
                                            break L57;
                                          }
                                        }
                                      }
                                      this.field_e = 6;
                                      if (var8 == 0) {
                                        break L53;
                                      } else {
                                        break L56;
                                      }
                                    }
                                  }
                                  L58: {
                                    if (hf.field_f.field_A <= 0) {
                                      break L58;
                                    } else {
                                      this.field_e = 2;
                                      if (var8 == 0) {
                                        break L53;
                                      } else {
                                        break L58;
                                      }
                                    }
                                  }
                                  this.field_e = 0;
                                  break L53;
                                }
                                bl.a(50, uh.field_e);
                                if (var8 == 0) {
                                  break L6;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            if (!this.field_c.g(0)) {
                              break L6;
                            } else {
                              ef.field_b = 0;
                              if (var8 == 0) {
                                break L6;
                              } else {
                                break L13;
                              }
                            }
                          }
                          if (this.field_c.g(0)) {
                            ef.field_b = 1;
                            if (var8 == 0) {
                              break L6;
                            } else {
                              break L12;
                            }
                          } else {
                            break L2;
                          }
                        }
                        if (!this.field_c.g(0)) {
                          break L6;
                        } else {
                          ef.field_b = 2;
                          if (var8 == 0) {
                            break L6;
                          } else {
                            break L11;
                          }
                        }
                      }
                      if (!this.field_c.g(0)) {
                        break L6;
                      } else {
                        this.field_e = 3;
                        if (var8 == 0) {
                          break L6;
                        } else {
                          break L10;
                        }
                      }
                    }
                    if (!this.field_c.g(0)) {
                      break L6;
                    } else {
                      this.field_e = 4;
                      if (var8 == 0) {
                        break L6;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (!this.field_c.g(0)) {
                    break L6;
                  } else {
                    L59: {
                      if (8 != this.field_g) {
                        break L59;
                      } else {
                        gj.a(0, 8, 5);
                        if (var8 == 0) {
                          break L6;
                        } else {
                          break L59;
                        }
                      }
                    }
                    L60: {
                      if (7 != this.field_g) {
                        break L60;
                      } else {
                        L61: {
                          L62: {
                            if (-1 <= (fg.field_b ^ -1)) {
                              break L62;
                            } else {
                              L63: {
                                if (-1 > (hf.field_f.field_A ^ -1)) {
                                  break L63;
                                } else {
                                  var5 = 10;
                                  if (var8 == 0) {
                                    break L61;
                                  } else {
                                    break L63;
                                  }
                                }
                              }
                              var5 = 6;
                              if (var8 == 0) {
                                break L61;
                              } else {
                                break L62;
                              }
                            }
                          }
                          var5 = 2;
                          break L61;
                        }
                        gj.a(0, 7, var5);
                        if (var8 == 0) {
                          break L6;
                        } else {
                          break L60;
                        }
                      }
                    }
                    if ((this.field_g ^ -1) == -10) {
                      gj.a(0, 9, 2);
                      if (var8 == 0) {
                        break L6;
                      } else {
                        break L8;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                if (!this.field_c.g(0)) {
                  break L6;
                } else {
                  L64: {
                    if (ba.field_f != null) {
                      rb.h(3591);
                      break L64;
                    } else {
                      break L64;
                    }
                  }
                  hd.a(true, ii.a(false));
                  if (var8 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              if (!this.field_c.g(0)) {
                break L6;
              } else {
                L65: {
                  tl.a(-32663, false);
                  if (qb.field_b) {
                    stackIn_201_0 = 0;
                    break L65;
                  } else {
                    stackIn_201_0 = 1;
                    break L65;
                  }
                }
                qb.field_b = stackIn_201_0 != 0;
                break L6;
              }
            }
            break L2;
          }
        }
    }

    private final int a(int param0, int param1) {
        int var3;
        int var4;
        L0: {
          var4 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param0 == -99) {
            break L0;
          } else {
            this.field_d = true;
            break L0;
          }
        }
        L1: {
          var3 = this.field_c.field_a;
          if (this.field_c.a((byte) 10)) {
            break L1;
          } else {
            if (-97 == (oa.field_H ^ -1)) {
              L2: {
                L3: {
                  if ((var3 ^ -1) > -1) {
                    break L3;
                  } else {
                    if (0 != var3 % param1) {
                      break L2;
                    } else {
                      var3 = var3 + param1;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var3 = param1;
                break L2;
              }
              L4: {
                if ((var3 ^ -1) >= (this.field_c.field_i ^ -1)) {
                  break L4;
                } else {
                  var3 = this.field_c.field_i;
                  break L4;
                }
              }
              this.field_c.field_b = false;
              var3--;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L5: {
          if (this.field_c.a((byte) 10)) {
            break L5;
          } else {
            if (97 == oa.field_H) {
              L6: {
                L7: {
                  if (var3 >= 0) {
                    break L7;
                  } else {
                    var3 = 0;
                    if (var4 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  var3++;
                  if ((var3 % param1 ^ -1) != -1) {
                    break L8;
                  } else {
                    var3 = var3 - param1;
                    break L8;
                  }
                }
                if ((this.field_c.field_i ^ -1) < (var3 ^ -1)) {
                  break L6;
                } else {
                  var3 = var3 - this.field_c.field_i % param1;
                  break L6;
                }
              }
              this.field_c.field_b = false;
              break L5;
            } else {
              break L5;
            }
          }
        }
        L9: {
          if (this.field_c.a((byte) 10)) {
            break L9;
          } else {
            if (-99 == (oa.field_H ^ -1)) {
              L10: {
                L11: {
                  if (param1 > var3) {
                    break L11;
                  } else {
                    var3 = 1;
                    if (var4 == 0) {
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                var3 = var3 - param1;
                break L10;
              }
              this.field_c.field_b = false;
              if (-1 < (var3 ^ -1)) {
                var3 = 3;
                break L9;
              } else {
                break L9;
              }
            } else {
              break L9;
            }
          }
        }
        L12: {
          if (this.field_c.a((byte) 10)) {
            break L12;
          } else {
            if (oa.field_H != 99) {
              break L12;
            } else {
              L13: {
                var3 = var3 + param1;
                if ((var3 ^ -1) <= (this.field_c.field_i ^ -1)) {
                  L14: {
                    if ((this.field_c.field_i + this.field_c.field_i % param1 ^ -1) <= (var3 ^ -1)) {
                      break L14;
                    } else {
                      var3 = 1;
                      if (var4 == 0) {
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  var3 = 3;
                  break L13;
                } else {
                  break L13;
                }
              }
              this.field_c.field_b = false;
              break L12;
            }
          }
        }
        return var3;
    }

    private final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        int var10;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        var9 = 101 / ((58 - param1) / 33);
        param4 = ge.field_i.length + -1;
        L0: while (true) {
          L1: {
            if (param4 < 0) {
              break L1;
            } else {
              param5 = ge.field_i[param4];
              param7 = 255 & param5;
              param2 = 255 & param5 >> -140450192;
              param6 = param5 >> -1325656696 & 255;
              if (var10 != 0) {
                break L1;
              } else {
                L2: {
                  L3: {
                    if (119 <= param6) {
                      break L3;
                    } else {
                      param2 = param2 - param3;
                      param7 = param7 - param3;
                      param6 = param6 - param3;
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  param6 = param6 - param0;
                  param7 = param7 - param0;
                  param2 = param2 - param0;
                  break L2;
                }
                L4: {
                  if (param7 >= 0) {
                    break L4;
                  } else {
                    param7 = 0;
                    break L4;
                  }
                }
                L5: {
                  if (0 <= param2) {
                    break L5;
                  } else {
                    param2 = 0;
                    break L5;
                  }
                }
                L6: {
                  if ((param6 ^ -1) > -1) {
                    param6 = 0;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                ge.field_i[param4] = bd.a(param7, bd.a(param2 << -845292272, param6 << -8027416));
                param4--;
                if (var10 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          return;
        }
    }

    final void c(byte param0) {
        this.field_d = false;
        this.field_i = 0;
        int var2 = -55 % ((param0 - -6) / 62);
        this.field_e = this.field_g;
    }

    kk(int param0) {
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = MonkeyPuzzle2.field_F ? 1 : 0;
                    this.field_g = param0;
                    this.field_c = new sg(b.field_j[param0].length);
                    this.field_f = new le[b.field_j[param0].length];
                    if (-3 == (param0 ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if ((param0 ^ -1) == -4) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (-5 == (param0 ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (param0 != 9) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.field_a = new le(380, 275);
                    if (var3 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_a = new le(380, 263);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var2 = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (b.field_j[param0].length <= var2) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_f[var2] = new le(tj.field_c[param0] - fl.field_a[param0], 40);
                    var2++;
                    if (var3 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var3 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var3 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var2 = 0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if ((var2 ^ -1) <= (b.field_j[param0].length ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    this.field_f[var2] = new le((-fl.field_a[param0] + tj.field_c[param0] - 30) / 3, 40);
                    var2++;
                    if (var3 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var3 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    this.field_a = new le(380, 275);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    this.field_d = false;
                    this.field_i = 0;
                    this.field_e = this.field_g;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int b(int param0, int param1) {
        L0: {
          if ((this.field_g ^ -1) == -3) {
            break L0;
          } else {
            L1: {
              L2: {
                if (3 == this.field_g) {
                  break L2;
                } else {
                  if (-5 != (this.field_g ^ -1)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (-3 >= (param1 ^ -1)) {
                break L0;
              } else {
                break L1;
              }
            }
            return tj.field_c[this.field_g];
          }
        }
        L3: {
          if (param0 == -6162) {
            break L3;
          } else {
            this.a(false, true);
            break L3;
          }
        }
        return this.a(param1, (byte) 52) + this.field_f[param1].field_m;
    }

    private final int a(byte param0, int param1) {
        if (-3 != (this.field_g ^ -1)) {
          L0: {
            L1: {
              if (this.field_g == 3) {
                break L1;
              } else {
                if (this.field_g != 4) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (param1 >= 2) {
              return mc.field_b[this.field_g] + i.field_r[this.field_g];
            } else {
              break L0;
            }
          }
          return mc.field_b[this.field_g] * param1 + i.field_r[this.field_g];
        } else {
          if (param1 < 3) {
            return i.field_r[this.field_g];
          } else {
            L2: {
              if (param0 <= -127) {
                break L2;
              } else {
                this.a(false, false);
                break L2;
              }
            }
            return mc.field_b[this.field_g] + i.field_r[this.field_g];
          }
        }
    }

    static {
        field_h = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
