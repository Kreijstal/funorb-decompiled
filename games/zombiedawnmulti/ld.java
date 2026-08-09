/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends cj {
    private char[] field_Pb;
    private int[] field_Qb;
    private int field_Hb;
    private int field_Nb;
    private int field_Ob;
    private int field_Sb;
    private int field_Tb;
    private ld field_Ib;
    private int field_Mb;
    static lf field_Rb;
    private mo[] field_Gb;
    private int field_Vb;
    private ld[] field_Fb;
    private int field_Jb;
    static ja[] field_Ub;
    static String field_Lb;
    static long field_Kb;

    final int i(int param0) {
        if (param0 != -29804) {
            this.field_Hb = 69;
        }
        return this.field_Sb - -(this.field_Ib != null ? this.field_Ib.i(-29804) : 0);
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    this.field_Hb = param0;
                    var5 = 0;
                    if (param1 == 11183) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    if (var5 >= this.field_Ob) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var3 = this.field_Jb * var5;
                    var4 = this.field_Hb * this.field_Hb;
                    this.field_Gb[var5].field_Q = (var4 * (this.field_Mb + -this.field_qb) + (144 - var4) * var3) / 144;
                    var5++;
                    if (var6 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var6 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(jh param0, boolean param1, int param2, int param3) {
        mo dupTemp$0 = null;
        mo[] dupTemp$1 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        mo stackIn_20_0 = null;
        mo stackIn_21_0 = null;
        mo stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        mo stackIn_27_0 = null;
        mo stackIn_28_0 = null;
        mo stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_59_0 = 0;
        mo stackIn_79_0 = null;
        boolean stackIn_79_1 = false;
        int stackIn_79_2 = 0;
        mo stackIn_80_0 = null;
        boolean stackIn_80_1 = false;
        mo stackIn_81_0 = null;
        boolean stackIn_81_1 = false;
        mo stackIn_82_0 = null;
        boolean stackIn_82_1 = false;
        int stackIn_82_2 = 0;
        mo stackIn_85_0 = null;
        mo stackIn_86_0 = null;
        mo stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        mo stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        mo stackIn_91_0 = null;
        mo stackIn_92_0 = null;
        mo stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        mo stackIn_95_0 = null;
        mo stackIn_96_0 = null;
        mo stackIn_97_0 = null;
        mo stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_107_0 = 0;
        mo stackIn_119_0 = null;
        mo stackIn_120_0 = null;
        mo stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        mo stackIn_124_0 = null;
        mo stackIn_125_0 = null;
        mo stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        mo stackIn_128_0 = null;
        mo stackIn_129_0 = null;
        mo stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        mo stackIn_132_0 = null;
        mo stackIn_133_0 = null;
        mo stackIn_134_0 = null;
        int stackIn_134_1 = 0;
        int stackIn_137_0 = 0;
        int stackIn_143_0 = 0;
        String stackIn_153_0 = null;
        mo stackIn_157_0 = null;
        mo stackIn_158_0 = null;
        mo stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        mo stackIn_160_0 = null;
        mo stackIn_161_0 = null;
        mo stackIn_162_0 = null;
        int stackIn_162_1 = 0;
        int stackIn_164_0 = 0;
        boolean stackIn_167_0 = false;
        int stackIn_170_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_213_0 = 0;
        int stackIn_225_0 = 0;
        boolean stackIn_311_0 = false;
        int stackIn_318_0 = 0;
        mo stackIn_333_0 = null;
        boolean stackIn_333_1 = false;
        int stackIn_333_2 = 0;
        int stackIn_333_3 = 0;
        mo stackIn_334_0 = null;
        boolean stackIn_334_1 = false;
        mo stackIn_335_0 = null;
        boolean stackIn_335_1 = false;
        mo stackIn_336_0 = null;
        boolean stackIn_336_1 = false;
        int stackIn_336_2 = 0;
        mo stackIn_339_0 = null;
        mo stackIn_340_0 = null;
        mo stackIn_341_0 = null;
        int stackIn_341_1 = 0;
        mo stackIn_343_0 = null;
        mo stackIn_344_0 = null;
        int stackIn_344_1 = 0;
        int stackIn_344_2 = 0;
        int stackIn_344_3 = 0;
        mo stackIn_345_0 = null;
        mo stackIn_346_0 = null;
        mo stackIn_347_0 = null;
        int stackIn_347_1 = 0;
        mo stackIn_349_0 = null;
        mo stackIn_350_0 = null;
        mo stackIn_351_0 = null;
        mo stackIn_352_0 = null;
        int stackIn_352_1 = 0;
        int stackIn_354_0 = 0;
        int stackIn_356_0 = 0;
        RuntimeException stackIn_362_0 = null;
        StringBuilder stackIn_362_1 = null;
        RuntimeException stackIn_363_0 = null;
        StringBuilder stackIn_363_1 = null;
        RuntimeException stackIn_364_0 = null;
        StringBuilder stackIn_364_1 = null;
        String stackIn_364_2 = null;
        Throwable caughtException = null;
        boolean stackOut_78_1;
        boolean stackOut_166_0;
        boolean stackOut_310_0;
        boolean stackOut_332_1;
        int statePc = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        mo[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        mo var17 = null;
        int var18 = 0;
        Object var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        int var22_int = 0;
        Object var22 = null;
        int var23 = 0;
        int var24 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        mo[] var27 = null;
        mo var28 = null;
        mo var29 = null;
        String var30 = null;
        String var31 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var26 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (param1) {
                        statePc = 7;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (!hl.b(0)) {
                        statePc = 5;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (param0.field_Fb) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackIn_6_0 = 1;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    stackIn_6_0 = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var4_int = stackIn_6_0;
                    if (var26 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (la.field_k) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_10_0 = 1;
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    stackIn_10_0 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    var4_int = stackIn_10_0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var5 = 0;
                    if (param1) {
                        statePc = 36;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var6 = 0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (var6 >= 5) {
                        statePc = 30;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_31_0 = var4_int;
                    stackIn_15_0 = stackIn_31_0;
                    if (var26 != 0) {
                        statePc = 31;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (stackIn_15_0 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if ((ma.field_b[0][1 + var6].field_T ^ -1) == -1) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var6 == param0.field_Pb) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var5 = 1;
                    param0.field_Pb = var6;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = ma.field_b[0][var6 - -1];
                    stackIn_20_0 = stackIn_21_0;
                    if (var4_int == 0) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_22_0 = (mo) ((Object) stackIn_20_0);
                    stackIn_22_1 = 1;
                    statePc = 22;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = (mo) ((Object) stackIn_21_0);
                    stackIn_22_1 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_22_0.field_Z = stackIn_22_1 != 0;
                    if (tb.field_u) {
                        statePc = 26;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var6 == 3) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    ma.field_b[0][1 + var6].field_Z = false;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = ma.field_b[0][1 + var6];
                    stackIn_27_0 = stackIn_28_0;
                    if (param0.field_Pb != var6) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_29_0 = (mo) ((Object) stackIn_27_0);
                    stackIn_29_1 = 1;
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = (mo) ((Object) stackIn_28_0);
                    stackIn_29_1 = 0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_29_0.field_Ab = stackIn_29_1 != 0;
                    var6++;
                    if (var26 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = ma.field_b[0][2].field_pb ? 1 : 0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (stackIn_31_0 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (hl.b(0)) {
                        statePc = 35;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    ui.field_j = vl.a(vc.field_e, new String[]{mh.field_c.field_Nb}, 2);
                    if (var26 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    ui.field_j = pd.field_f;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if ((qo.field_r.length ^ -1) <= -3) {
                        statePc = 38;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (!param1) {
                        statePc = 41;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if ((tj.field_c ^ -1) == 0) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackIn_42_0 = 1;
                    statePc = 42;
                    continue stateLoop;
                }
                case 41: {
                    stackIn_42_0 = 0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var6 = stackIn_42_0;
                    if (var6 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var7 = tj.field_c;
                    var8_int = 0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (var8_int >= fg.field_k.length) {
                        statePc = 48;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    fg.field_k[var8_int] = (byte) 0;
                    var8_int++;
                    if (var26 != 0) {
                        statePc = 49;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var26 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    fg.field_k[var7 / 8] = (byte)cr.b((int) fg.field_k[var7 / 8], 1 << var7 % 8);
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (!param1) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    stackIn_52_0 = -1;
                    statePc = 52;
                    continue stateLoop;
                }
                case 51: {
                    stackIn_52_0 = 0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var7 = stackIn_52_0;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (qo.field_r.length <= var7) {
                        statePc = 99;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    stackIn_100_0 = var6;
                    stackIn_55_0 = stackIn_100_0;
                    if (var26 != 0) {
                        statePc = 100;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (stackIn_55_0 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if ((tj.field_c ^ -1) == (var7 ^ -1)) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    stackIn_59_0 = 1;
                    statePc = 59;
                    continue stateLoop;
                }
                case 58: {
                    stackIn_59_0 = 0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    var8_int = stackIn_59_0;
                    if (var4_int == 0) {
                        statePc = 74;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (ma.field_b[1][var7 - -1].field_T == 0) {
                        statePc = 74;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (param1) {
                        statePc = 65;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var9 = qo.field_r[var7];
                    if ((var9 ^ -1) == (param0.field_mc ^ -1)) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    param0.field_mc = var9;
                    var5 = 1;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if (var26 == 0) {
                        statePc = 74;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (var6 != 0) {
                        statePc = 74;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if ((var7 ^ -1) == 0) {
                        statePc = 69;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    fg.field_k[var7 / 8] = (byte)vg.a((int) fg.field_k[var7 / 8], 1 << tq.b(var7, 7));
                    if (var26 == 0) {
                        statePc = 74;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var9 = 0;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    if ((var9 ^ -1) <= (fg.field_k.length ^ -1)) {
                        statePc = 74;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    fg.field_k[var9] = (byte) 0;
                    var9++;
                    if (var26 != 0) {
                        statePc = 89;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (var26 == 0) {
                        statePc = 70;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (!param1) {
                        statePc = 88;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (var7 != -1) {
                        statePc = 84;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    ma.field_b[1][var7 - -1].field_Ab = true;
                    var9 = 0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if ((qo.field_r.length ^ -1) >= (var9 ^ -1)) {
                        statePc = 83;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    dupTemp$0 = ma.field_b[1][var7 - -1];
                    stackIn_90_0 = (mo) (dupTemp$0);
                    stackIn_79_0 = stackIn_90_0;
                    stackOut_78_1 = dupTemp$0.field_Ab;
                    stackIn_90_1 = stackOut_78_1 ? 1 : 0;
                    stackIn_79_1 = stackOut_78_1;
                    stackIn_90_2 = fg.field_k[var9 / 8] & 1 << (var9 & 7);
                    stackIn_79_2 = stackIn_90_2;
                    if (var26 != 0) {
                        statePc = 90;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    stackIn_81_0 = (mo) ((Object) stackIn_79_0);
                    stackIn_80_0 = stackIn_81_0;
                    stackIn_81_1 = stackIn_79_1;
                    stackIn_80_1 = stackIn_81_1;
                    if (stackIn_79_2 != 0) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    stackIn_82_0 = (mo) ((Object) stackIn_80_0);
                    stackIn_82_1 = stackIn_80_1;
                    stackIn_82_2 = 1;
                    statePc = 82;
                    continue stateLoop;
                }
                case 81: {
                    stackIn_82_0 = (mo) ((Object) stackIn_81_0);
                    stackIn_82_1 = stackIn_81_1;
                    stackIn_82_2 = 0;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    stackIn_82_0.field_Ab = stackIn_82_1 & stackIn_82_2 != 0;
                    var9++;
                    if (var26 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (var26 == 0) {
                        statePc = 94;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    stackIn_86_0 = ma.field_b[1][var7 + 1];
                    stackIn_85_0 = stackIn_86_0;
                    if (-1 == (fg.field_k[var7 / 8] & 1 << (7 & var7) ^ -1)) {
                        statePc = 86;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    stackIn_87_0 = (mo) ((Object) stackIn_85_0);
                    stackIn_87_1 = 1;
                    statePc = 87;
                    continue stateLoop;
                }
                case 86: {
                    stackIn_87_0 = (mo) ((Object) stackIn_86_0);
                    stackIn_87_1 = 0;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    stackIn_87_0.field_Ab = stackIn_87_1 != 0;
                    if (var26 == 0) {
                        statePc = 94;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var9 = qo.field_r[var7];
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    stackIn_90_0 = ma.field_b[1][1 + var7];
                    stackIn_90_1 = param0.field_mc ^ -1;
                    stackIn_90_2 = var9 ^ -1;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    stackIn_92_0 = (mo) ((Object) stackIn_90_0);
                    stackIn_91_0 = stackIn_92_0;
                    if (stackIn_90_1 != stackIn_90_2) {
                        statePc = 92;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    stackIn_93_0 = (mo) ((Object) stackIn_91_0);
                    stackIn_93_1 = 1;
                    statePc = 93;
                    continue stateLoop;
                }
                case 92: {
                    stackIn_93_0 = (mo) ((Object) stackIn_92_0);
                    stackIn_93_1 = 0;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    stackIn_93_0.field_Ab = stackIn_93_1 != 0;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    stackIn_97_0 = ma.field_b[1][var7 + 1];
                    stackIn_95_0 = stackIn_97_0;
                    if (var4_int == 0) {
                        statePc = 97;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    stackIn_97_0 = (mo) ((Object) stackIn_95_0);
                    stackIn_96_0 = stackIn_97_0;
                    if (var8_int != 0) {
                        statePc = 97;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    stackIn_98_0 = (mo) ((Object) stackIn_96_0);
                    stackIn_98_1 = 1;
                    statePc = 98;
                    continue stateLoop;
                }
                case 97: {
                    stackIn_98_0 = (mo) ((Object) stackIn_97_0);
                    stackIn_98_1 = 0;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    stackIn_98_0.field_Z = stackIn_98_1 != 0;
                    var7++;
                    if (var26 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    stackIn_100_0 = param1 ? 1 : 0;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    if (stackIn_100_0 != 0) {
                        statePc = 102;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    stackIn_103_0 = 1;
                    statePc = 103;
                    continue stateLoop;
                }
                case 102: {
                    stackIn_103_0 = 0;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    var6 = stackIn_103_0;
                    if (param3 == 1) {
                        statePc = 105;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    field_Kb = -74L;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if ((var6 ^ -1) <= -4) {
                        statePc = 136;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    var28 = ma.field_b[2][var6];
                    stackIn_137_0 = var4_int;
                    stackIn_107_0 = stackIn_137_0;
                    if (var26 != 0) {
                        statePc = 137;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (stackIn_107_0 == 0) {
                        statePc = 118;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (-1 == (var28.field_T ^ -1)) {
                        statePc = 118;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (!param1) {
                        statePc = 115;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if ((var6 ^ -1) == -1) {
                        statePc = 113;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    sc.field_f = sc.field_f ^ var6;
                    if (var26 == 0) {
                        statePc = 118;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    sc.field_f = 0;
                    if (var26 == 0) {
                        statePc = 118;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    if ((var6 ^ -1) != (param0.field_fc ^ -1)) {
                        statePc = 117;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 117: {
                    var5 = 1;
                    param0.field_fc = var6;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    stackIn_120_0 = (mo) (var28);
                    stackIn_119_0 = stackIn_120_0;
                    if (var4_int == 0) {
                        statePc = 120;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    stackIn_121_0 = (mo) ((Object) stackIn_119_0);
                    stackIn_121_1 = 1;
                    statePc = 121;
                    continue stateLoop;
                }
                case 120: {
                    stackIn_121_0 = (mo) ((Object) stackIn_120_0);
                    stackIn_121_1 = 0;
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    stackIn_121_0.field_Z = stackIn_121_1 != 0;
                    if (!param1) {
                        statePc = 131;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if (-1 == (var6 ^ -1)) {
                        statePc = 127;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    stackIn_125_0 = (mo) (var28);
                    stackIn_124_0 = stackIn_125_0;
                    if (-1 == (var6 & sc.field_f ^ -1)) {
                        statePc = 125;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    stackIn_126_0 = (mo) ((Object) stackIn_124_0);
                    stackIn_126_1 = 1;
                    statePc = 126;
                    continue stateLoop;
                }
                case 125: {
                    stackIn_126_0 = (mo) ((Object) stackIn_125_0);
                    stackIn_126_1 = 0;
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    stackIn_126_0.field_Ab = stackIn_126_1 != 0;
                    if (var26 == 0) {
                        statePc = 135;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    stackIn_129_0 = (mo) (var28);
                    stackIn_128_0 = stackIn_129_0;
                    if (-1 != (sc.field_f ^ -1)) {
                        statePc = 129;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    stackIn_130_0 = (mo) ((Object) stackIn_128_0);
                    stackIn_130_1 = 1;
                    statePc = 130;
                    continue stateLoop;
                }
                case 129: {
                    stackIn_130_0 = (mo) ((Object) stackIn_129_0);
                    stackIn_130_1 = 0;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    stackIn_130_0.field_Ab = stackIn_130_1 != 0;
                    if (var26 == 0) {
                        statePc = 135;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    stackIn_133_0 = (mo) (var28);
                    stackIn_132_0 = stackIn_133_0;
                    if ((var6 & param0.field_fc) == 0) {
                        statePc = 133;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    stackIn_134_0 = (mo) ((Object) stackIn_132_0);
                    stackIn_134_1 = 1;
                    statePc = 134;
                    continue stateLoop;
                }
                case 133: {
                    stackIn_134_0 = (mo) ((Object) stackIn_133_0);
                    stackIn_134_1 = 0;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    stackIn_134_0.field_Ab = stackIn_134_1 != 0;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    var6++;
                    if (var26 == 0) {
                        statePc = 105;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    stackIn_137_0 = param1 ? 1 : 0;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    if (stackIn_137_0 == 0) {
                        statePc = 163;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    if ((r.field_f ^ -1) < -2) {
                        statePc = 140;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var6 = 0;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    if (r.field_f + 1 <= var6) {
                        statePc = 163;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var29 = ma.field_b[3][var6];
                    stackIn_164_0 = var4_int;
                    stackIn_143_0 = stackIn_164_0;
                    if (var26 != 0) {
                        statePc = 164;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if (stackIn_143_0 == 0) {
                        statePc = 147;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if (var29.field_T != 0) {
                        statePc = 146;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 146: {
                    pb.field_h = var6;
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    if (!var29.field_pb) {
                        statePc = 156;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    if (0 < var6) {
                        statePc = 150;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 150: {
                    if (null != qp.field_s) {
                        statePc = 152;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    stackIn_153_0 = null;
                    statePc = 153;
                    continue stateLoop;
                }
                case 152: {
                    stackIn_153_0 = qp.field_s[-1 + var6];
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    var8 = stackIn_153_0;
                    if (var8 != null) {
                        statePc = 155;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 155: {
                    ui.field_j = var8;
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    stackIn_158_0 = (mo) (var29);
                    stackIn_157_0 = stackIn_158_0;
                    if (var4_int == 0) {
                        statePc = 158;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    stackIn_159_0 = (mo) ((Object) stackIn_157_0);
                    stackIn_159_1 = 1;
                    statePc = 159;
                    continue stateLoop;
                }
                case 158: {
                    stackIn_159_0 = (mo) ((Object) stackIn_158_0);
                    stackIn_159_1 = 0;
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    stackIn_159_0.field_Z = stackIn_159_1 != 0;
                    stackIn_161_0 = (mo) (var29);
                    stackIn_160_0 = stackIn_161_0;
                    if (pb.field_h != var6) {
                        statePc = 161;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    stackIn_162_0 = (mo) ((Object) stackIn_160_0);
                    stackIn_162_1 = 1;
                    statePc = 162;
                    continue stateLoop;
                }
                case 161: {
                    stackIn_162_0 = (mo) ((Object) stackIn_161_0);
                    stackIn_162_1 = 0;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    stackIn_162_0.field_Ab = stackIn_162_1 != 0;
                    var6++;
                    if (var26 == 0) {
                        statePc = 141;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    var6 = 0;
                    stackIn_164_0 = 0;
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    var7 = stackIn_164_0;
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    if ((var7 ^ -1) <= (kj.field_h ^ -1)) {
                        statePc = 355;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    dupTemp$1 = ma.field_b[4 + var7];
                    var27 = dupTemp$1;
                    var8_array = dupTemp$1;
                    stackOut_166_0 = param1;
                    stackIn_356_0 = stackOut_166_0 ? 1 : 0;
                    stackIn_167_0 = stackOut_166_0;
                    if (var26 != 0) {
                        statePc = 356;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    if (!stackIn_167_0) {
                        statePc = 169;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    stackIn_170_0 = -1;
                    statePc = 170;
                    continue stateLoop;
                }
                case 169: {
                    stackIn_170_0 = 0;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    var9 = stackIn_170_0;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    if (var9 >= var27.length + -1) {
                        statePc = 353;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    var10 = 0;
                    var11 = 0;
                    var12 = 0;
                    var13 = 0;
                    var14 = 0;
                    var15 = 0;
                    stackIn_354_0 = var4_int;
                    stackIn_173_0 = stackIn_354_0;
                    if (var26 != 0) {
                        statePc = 354;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    if (stackIn_173_0 == 0) {
                        statePc = 214;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    if (0 <= var9) {
                        statePc = 176;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 176: {
                    if (na.field_J == null) {
                        statePc = 181;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    if (null == na.field_J[var7]) {
                        statePc = 181;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    if (((ql.field_c ^ -1) & na.field_J[var7][var9] ^ -1) < -1) {
                        statePc = 180;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 180: {
                    var14 = 1;
                    var15 = vl.a((ql.field_c ^ -1) & na.field_J[var7][var9], (byte) -103);
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    if (null == ch.field_g) {
                        statePc = 187;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    if (ch.field_g[var7] == null) {
                        statePc = 187;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (0 < vl.field_h) {
                        statePc = 187;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    if (ch.field_g[var7][var9]) {
                        statePc = 186;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 186: {
                    var10 = 1;
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    if (null == sd.field_G) {
                        statePc = 197;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    if (null == sd.field_G[var7]) {
                        statePc = 197;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    var16 = sd.field_G[var7][var9];
                    if (0 == var16) {
                        statePc = 194;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if (bo.field_e) {
                        statePc = 194;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    if (-1 <= (vl.field_h ^ -1)) {
                        statePc = 193;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 193: {
                    var10 = 1;
                    statePc = 194;
                    continue stateLoop;
                }
                case 194: {
                    if (-1 <= (var16 ^ -1)) {
                        statePc = 197;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if ((bc.field_e ^ -1) <= (var16 ^ -1)) {
                        statePc = 197;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    var12 = 1;
                    statePc = 197;
                    continue stateLoop;
                }
                case 197: {
                    if (null == r.field_c) {
                        statePc = 207;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if (r.field_c[var7] != null) {
                        statePc = 200;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 200: {
                    var16 = r.field_c[var7][var9];
                    if (-1 == (var16 ^ -1)) {
                        statePc = 204;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (bo.field_e) {
                        statePc = 204;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    if (vl.field_h > 0) {
                        statePc = 204;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    var10 = 1;
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    if ((var16 ^ -1) >= -1) {
                        statePc = 207;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    if ((dm.field_Zb ^ -1) <= (var16 ^ -1)) {
                        statePc = 207;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    var11 = 1;
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    if (!param1) {
                        statePc = 212;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    if (mb.field_k == null) {
                        statePc = 212;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    if (null == mb.field_k[var7]) {
                        statePc = 212;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    if (!mb.field_k[var7][var9]) {
                        statePc = 212;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    stackIn_213_0 = 1;
                    statePc = 213;
                    continue stateLoop;
                }
                case 212: {
                    stackIn_213_0 = 0;
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    var13 = stackIn_213_0;
                    statePc = 214;
                    continue stateLoop;
                }
                case 214: {
                    if (-3 < (kj.field_q ^ -1)) {
                        statePc = 217;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    if (!lc.field_m[12]) {
                        statePc = 217;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    var13 = 0;
                    var10 = 0;
                    var14 = 0;
                    var11 = 0;
                    var12 = 0;
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    dj.field_l = true;
                    if (var10 != 0) {
                        statePc = 223;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    if (var11 != 0) {
                        statePc = 223;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    if (var12 != 0) {
                        statePc = 223;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    if (var13 != 0) {
                        statePc = 223;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    if (var14 == 0) {
                        statePc = 224;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    stackIn_225_0 = 1;
                    statePc = 225;
                    continue stateLoop;
                }
                case 224: {
                    stackIn_225_0 = 0;
                    statePc = 225;
                    continue stateLoop;
                }
                case 225: {
                    var16 = stackIn_225_0;
                    if (var16 != 0) {
                        statePc = 245;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    if (0 > var9) {
                        statePc = 245;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    if (null == iq.field_b) {
                        statePc = 245;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    if (!param1) {
                        statePc = 231;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    if (la.field_k) {
                        statePc = 245;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    lp.field_p = false;
                    if (null != rl.field_v) {
                        statePc = 233;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    rl.field_v = new byte[kj.field_h];
                    ll.field_c = new boolean[kj.field_h];
                    statePc = 233;
                    continue stateLoop;
                }
                case 233: {
                    dj.field_l = false;
                    var17_int = 0;
                    statePc = 234;
                    continue stateLoop;
                }
                case 234: {
                    if ((var17_int ^ -1) <= (var7 ^ -1)) {
                        statePc = 238;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    ll.field_c[var17_int] = false;
                    var17_int++;
                    if (var26 != 0) {
                        statePc = 239;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    if (var26 == 0) {
                        statePc = 234;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    bh.a(-1712, var9, 0, param0, param1, var7, -1, -1);
                    statePc = 239;
                    continue stateLoop;
                }
                case 239: {
                    if (-3 < (kj.field_q ^ -1)) {
                        statePc = 242;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    if (!lc.field_m[12]) {
                        statePc = 242;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    dj.field_l = true;
                    statePc = 242;
                    continue stateLoop;
                }
                case 242: {
                    if (!dj.field_l) {
                        statePc = 244;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 244: {
                    var16 = 1;
                    statePc = 245;
                    continue stateLoop;
                }
                case 245: {
                    var17 = var27[var9 + 1];
                    if (var4_int == 0) {
                        statePc = 259;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    if (0 == var17.field_T) {
                        statePc = 259;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    if (param1) {
                        statePc = 251;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    if (var16 != 0) {
                        statePc = 259;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    if (param0.field_Zb[var7] == (byte)var9) {
                        statePc = 259;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    var5 = 1;
                    param0.field_Zb[var7] = (byte)var9;
                    if (var26 == 0) {
                        statePc = 259;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    if (-1 == var9) {
                        statePc = 254;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    tg.field_a[(var6 + var9) / 8] = (byte)vg.a((int) tg.field_a[(var6 + var9) / 8], 1 << tq.b(var6 + var9, 7));
                    if (var26 == 0) {
                        statePc = 259;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    var18 = var6;
                    statePc = 255;
                    continue stateLoop;
                }
                case 255: {
                    if ((var18 ^ -1) <= (var27.length + var6 + -1 ^ -1)) {
                        statePc = 259;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    tg.field_a[var18 / 8] = (byte)tq.b((int) tg.field_a[var18 / 8], 1 << tq.b(var18, 7) ^ -1);
                    var18++;
                    if (var26 != 0) {
                        statePc = 263;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    if (var26 == 0) {
                        statePc = 255;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    if (!param1) {
                        statePc = 263;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    if (var16 != 0) {
                        statePc = 262;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 262: {
                    tg.field_a[(var9 - -var6) / 8] = (byte)tq.b((int) tg.field_a[(var9 + var6) / 8], 1 << tq.b(var9 + var6, 7) ^ -1);
                    statePc = 263;
                    continue stateLoop;
                }
                case 263: {
                    if (var9 < 0) {
                        statePc = 328;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    if (!var17.field_pb) {
                        statePc = 328;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    if (ul.field_m == null) {
                        statePc = 269;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    if (null == ul.field_m[var7]) {
                        statePc = 268;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    var18_ref = ul.field_m[var7][var9];
                    statePc = 270;
                    continue stateLoop;
                }
                case 268: {
                    var18_ref = null;
                    statePc = 270;
                    continue stateLoop;
                }
                case 269: {
                    var18_ref = null;
                    statePc = 270;
                    continue stateLoop;
                }
                case 270: {
                    if (kp.field_n != null) {
                        statePc = 272;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    var19 = null;
                    statePc = 275;
                    continue stateLoop;
                }
                case 272: {
                    if (kp.field_n[var7] != null) {
                        statePc = 274;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    var19 = null;
                    statePc = 275;
                    continue stateLoop;
                }
                case 274: {
                    var19 = kp.field_n[var7][var9];
                    statePc = 275;
                    continue stateLoop;
                }
                case 275: {
                    var20 = null;
                    if (var19 == null) {
                        statePc = 278;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    if (((String) (var19)).equals(var18_ref)) {
                        statePc = 278;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    var20 = var19;
                    statePc = 278;
                    continue stateLoop;
                }
                case 278: {
                    var21 = null;
                    if (var13 == 0) {
                        statePc = 280;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    var21 = oj.field_H;
                    statePc = 302;
                    continue stateLoop;
                }
                case 280: {
                    if (var10 == 0) {
                        statePc = 282;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    var21 = fa.field_Ub;
                    statePc = 302;
                    continue stateLoop;
                }
                case 282: {
                    if (var11 == 0) {
                        statePc = 286;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    var22_int = r.field_c[var7][var9] + -dm.field_Zb;
                    if (-2 != (var22_int ^ -1)) {
                        statePc = 285;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    var21 = uq.field_a;
                    statePc = 286;
                    continue stateLoop;
                }
                case 285: {
                    var21 = vl.a(sc.field_c, new String[]{Integer.toString(var22_int)}, 2);
                    statePc = 286;
                    continue stateLoop;
                }
                case 286: {
                    if (var12 != 0) {
                        statePc = 288;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 288: {
                    var30 = vl.a(dm.field_Rb, new String[]{Integer.toString(bc.field_e), Integer.toString(sd.field_G[var7][var9])}, 2);
                    var21 = var30;
                    var21 = var30;
                    if (var21 == null) {
                        statePc = 290;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    var21 = (String) (var21) + "<br>" + var30;
                    if (var26 == 0) {
                        statePc = 291;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 290: {
                    var21 = var30;
                    statePc = 291;
                    continue stateLoop;
                }
                case 291: {
                    if (var14 != 0) {
                        statePc = 293;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 293: {
                    var22 = eb.field_L;
                    if (-1 <= (var15 ^ -1)) {
                        statePc = 299;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    if (null == ki.field_o) {
                        statePc = 299;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    if (var15 > ki.field_o.length) {
                        statePc = 299;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    if (null != ki.field_o[-1 + var15]) {
                        statePc = 298;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 298: {
                    var22 = ki.field_o[-1 + var15][0];
                    statePc = 299;
                    continue stateLoop;
                }
                case 299: {
                    if (var21 == null) {
                        statePc = 301;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 300: {
                    var21 = (String) (var21) + "<br>" + (String) (var22);
                    if (var26 == 0) {
                        statePc = 302;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 301: {
                    var21 = var22;
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    if (var4_int == 0) {
                        statePc = 321;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 303: {
                    if (!dj.field_l) {
                        statePc = 305;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 305: {
                    var22 = null;
                    if (lp.field_p) {
                        statePc = 307;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 307: {
                    var22 = "</col>" + gi.field_n + "<col=A00000>";
                    var25 = var22;
                    var22 = var25;
                    var25 = var22;
                    var22 = var25;
                    var21 = var22;
                    statePc = 308;
                    continue stateLoop;
                }
                case 308: {
                    var23 = 0;
                    var24 = 0;
                    statePc = 309;
                    continue stateLoop;
                }
                case 309: {
                    if ((var7 ^ -1) >= (var24 ^ -1)) {
                        statePc = 317;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    stackOut_310_0 = ll.field_c[var24];
                    stackIn_318_0 = stackOut_310_0 ? 1 : 0;
                    stackIn_311_0 = stackOut_310_0;
                    if (var26 != 0) {
                        statePc = 318;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    if (stackIn_311_0) {
                        statePc = 313;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 313: {
                    var25_ref = "</col>" + cf.field_f[var24] + "<col=A00000>";
                    var22 = var25_ref;
                    var22 = var25_ref;
                    if (var22 != null) {
                        statePc = 315;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 314: {
                    var22 = var25_ref;
                    if (var26 == 0) {
                        statePc = 316;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 315: {
                    var22 = (String) (var22) + ", " + var25_ref;
                    var21 = var22;
                    var21 = var22;
                    var23 = 1;
                    statePc = 316;
                    continue stateLoop;
                }
                case 316: {
                    var24++;
                    if (var26 == 0) {
                        statePc = 309;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    stackIn_318_0 = var23;
                    statePc = 318;
                    continue stateLoop;
                }
                case 318: {
                    if (stackIn_318_0 != 0) {
                        statePc = 320;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    var21 = vl.a(io.field_a, new String[]{(String) (var22)}, 2);
                    if (var26 == 0) {
                        statePc = 321;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 320: {
                    var21 = kb.field_q + (String) (var22);
                    statePc = 321;
                    continue stateLoop;
                }
                case 321: {
                    if (var21 != null) {
                        statePc = 323;
                    } else {
                        statePc = 326;
                    }
                    continue stateLoop;
                }
                case 323: {
                    var21 = "<col=A00000>" + (String) (var21);
                    var31 = sa.a((String) (var21), param3 + 123, "<br>", "<br><col=A00000>");
                    if (var20 == null) {
                        statePc = 325;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 324: {
                    var20 = (String) (var20) + "<br>" + var31;
                    if (var26 == 0) {
                        statePc = 326;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    var20 = var31;
                    statePc = 326;
                    continue stateLoop;
                }
                case 326: {
                    if (var20 == null) {
                        statePc = 328;
                    } else {
                        statePc = 327;
                    }
                    continue stateLoop;
                }
                case 327: {
                    ui.field_j = (String) (var20);
                    statePc = 328;
                    continue stateLoop;
                }
                case 328: {
                    if (!param1) {
                        statePc = 342;
                    } else {
                        statePc = 329;
                    }
                    continue stateLoop;
                }
                case 329: {
                    if (var9 != -1) {
                        statePc = 338;
                    } else {
                        statePc = 330;
                    }
                    continue stateLoop;
                }
                case 330: {
                    var17.field_Ab = true;
                    var18 = var6;
                    statePc = 331;
                    continue stateLoop;
                }
                case 331: {
                    if (-1 + (var27.length + var6) <= var18) {
                        statePc = 337;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 332: {
                    stackIn_344_0 = (mo) (var17);
                    stackIn_333_0 = stackIn_344_0;
                    stackOut_332_1 = var17.field_Ab;
                    stackIn_344_1 = stackOut_332_1 ? 1 : 0;
                    stackIn_333_1 = stackOut_332_1;
                    stackIn_344_2 = -1;
                    stackIn_333_2 = stackIn_344_2;
                    stackIn_344_3 = tg.field_a[var18 / 8] & 1 << (7 & var18) ^ -1;
                    stackIn_333_3 = stackIn_344_3;
                    if (var26 != 0) {
                        statePc = 344;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    stackIn_335_0 = (mo) ((Object) stackIn_333_0);
                    stackIn_334_0 = stackIn_335_0;
                    stackIn_335_1 = stackIn_333_1;
                    stackIn_334_1 = stackIn_335_1;
                    if (stackIn_333_2 != stackIn_333_3) {
                        statePc = 335;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 334: {
                    stackIn_336_0 = (mo) ((Object) stackIn_334_0);
                    stackIn_336_1 = stackIn_334_1;
                    stackIn_336_2 = 1;
                    statePc = 336;
                    continue stateLoop;
                }
                case 335: {
                    stackIn_336_0 = (mo) ((Object) stackIn_335_0);
                    stackIn_336_1 = stackIn_335_1;
                    stackIn_336_2 = 0;
                    statePc = 336;
                    continue stateLoop;
                }
                case 336: {
                    stackIn_336_0.field_Ab = stackIn_336_1 & stackIn_336_2 != 0;
                    var18++;
                    if (var26 == 0) {
                        statePc = 331;
                    } else {
                        statePc = 337;
                    }
                    continue stateLoop;
                }
                case 337: {
                    if (var26 == 0) {
                        statePc = 348;
                    } else {
                        statePc = 338;
                    }
                    continue stateLoop;
                }
                case 338: {
                    stackIn_340_0 = (mo) (var17);
                    stackIn_339_0 = stackIn_340_0;
                    if (0 == (tg.field_a[(var9 + var6) / 8] & 1 << (var6 - -var9 & 7))) {
                        statePc = 340;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    stackIn_341_0 = (mo) ((Object) stackIn_339_0);
                    stackIn_341_1 = 1;
                    statePc = 341;
                    continue stateLoop;
                }
                case 340: {
                    stackIn_341_0 = (mo) ((Object) stackIn_340_0);
                    stackIn_341_1 = 0;
                    statePc = 341;
                    continue stateLoop;
                }
                case 341: {
                    stackIn_341_0.field_Ab = stackIn_341_1 != 0;
                    if (var26 == 0) {
                        statePc = 348;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 342: {
                    stackIn_346_0 = (mo) (var17);
                    stackIn_343_0 = stackIn_346_0;
                    if (!dj.field_l) {
                        statePc = 346;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 343: {
                    stackIn_344_0 = (mo) ((Object) stackIn_343_0);
                    stackIn_344_1 = param0.field_Zb[var7] ^ -1;
                    stackIn_344_2 = (byte)var9;
                    stackIn_344_3 = -1;
                    statePc = 344;
                    continue stateLoop;
                }
                case 344: {
                    stackIn_346_0 = (mo) ((Object) stackIn_344_0);
                    stackIn_345_0 = stackIn_346_0;
                    if (stackIn_344_1 != (stackIn_344_2 ^ stackIn_344_3)) {
                        statePc = 346;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    stackIn_347_0 = (mo) ((Object) stackIn_345_0);
                    stackIn_347_1 = 1;
                    statePc = 347;
                    continue stateLoop;
                }
                case 346: {
                    stackIn_347_0 = (mo) ((Object) stackIn_346_0);
                    stackIn_347_1 = 0;
                    statePc = 347;
                    continue stateLoop;
                }
                case 347: {
                    stackIn_347_0.field_Ab = stackIn_347_1 != 0;
                    statePc = 348;
                    continue stateLoop;
                }
                case 348: {
                    stackIn_351_0 = (mo) (var17);
                    stackIn_349_0 = stackIn_351_0;
                    if (var4_int == 0) {
                        statePc = 351;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 349: {
                    stackIn_351_0 = (mo) ((Object) stackIn_349_0);
                    stackIn_350_0 = stackIn_351_0;
                    if (var16 != 0) {
                        statePc = 351;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 350: {
                    stackIn_352_0 = (mo) ((Object) stackIn_350_0);
                    stackIn_352_1 = 1;
                    statePc = 352;
                    continue stateLoop;
                }
                case 351: {
                    stackIn_352_0 = (mo) ((Object) stackIn_351_0);
                    stackIn_352_1 = 0;
                    statePc = 352;
                    continue stateLoop;
                }
                case 352: {
                    stackIn_352_0.field_Z = stackIn_352_1 != 0;
                    var9++;
                    if (var26 == 0) {
                        statePc = 171;
                    } else {
                        statePc = 353;
                    }
                    continue stateLoop;
                }
                case 353: {
                    stackIn_354_0 = var6 + (od.field_Gb[var7] & 255);
                    statePc = 354;
                    continue stateLoop;
                }
                case 354: {
                    var6 = stackIn_354_0;
                    var7++;
                    if (var26 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 355;
                    }
                    continue stateLoop;
                }
                case 355: {
                    stackIn_356_0 = var5;
                    statePc = 356;
                    continue stateLoop;
                }
                case 356: {
                    if (stackIn_356_0 == 0) {
                        statePc = 365;
                    } else {
                        statePc = 357;
                    }
                    continue stateLoop;
                }
                case 357: {
                    if (!param1) {
                        statePc = 359;
                    } else {
                        statePc = 365;
                    }
                    continue stateLoop;
                }
                case 359: {
                    og.b(param2, 115);
                    statePc = 365;
                    continue stateLoop;
                }
                case 365: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ld(long param0, cj param1, cj param2, cj param3, ld[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        Object stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        int var16 = 0;
        fm var17 = null;
        fm var18 = null;
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_Tb = -1;
        try {
          L0: {
            this.field_Qb = param5;
            this.field_Pb = param7;
            this.field_Fb = param4;
            this.field_Ob = this.field_Qb.length;
            var17 = param3.field_yb;
            var18 = var17;
            this.field_Jb = var18.field_r + (var18.field_C + 2);
            this.field_Nb = this.field_Ob * this.field_Jb;
            this.field_Vb = 0;
            this.field_Gb = new mo[this.field_Ob];
            var11 = "<col=999999>";
            var12 = "</col>";
            var13 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((this.field_Ob ^ -1) >= (var13 ^ -1)) {
                    break L3;
                  } else {
                    stackIn_13_0 = this;

                    if (var16 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (((ld) (this)).field_Pb[var13] <= 0) {
                          break L4;
                        } else {
                          param6[var13] = var11 + hm.a(-81, this.field_Pb[var13]).toUpperCase() + ": " + var12 + param6[var13];
                          break L4;
                        }
                      }
                      L5: {
                        L6: {
                          var14 = null;
                          if (null != this.field_Fb[var13]) {
                            break L6;
                          } else {
                            if (-1 != this.field_Qb[var13]) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var14 = tb.field_v;
                        break L5;
                      }
                      L7: {
                        this.field_Gb[var13] = new mo(0L, param2, (cj) null, param3, (ja) (var14), param6[var13]);
                        this.a((byte) 50, this.field_Gb[var13]);
                        var15 = var17.a(param6[var13]);
                        if (this.field_Vb >= var15) {
                          break L7;
                        } else {
                          this.field_Vb = var15;
                          break L7;
                        }
                      }
                      var13++;
                      if (var16 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_Vb = this.field_Vb + (tb.field_v.field_z + 10);
                stackIn_13_0 = this;
                break L2;
              }
              this.b(12, 11183);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var10);

            stackIn_17_1 = new StringBuilder().append("ld.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L8;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L9;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L10;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param4 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L11;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param5 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L12;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param6 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L13;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param7 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L14;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L14;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_18_0), stackIn_36_2 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4_int;
        ld var4;
        mo var5;
        int var6;
        ld var7;
        mo stackIn_6_0 = null;
        mo stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var4_int = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_Gb.length <= var4_int) {
                break L2;
              } else {
                var5 = this.field_Gb[var4_int];
                stackIn_10_0 = var5.field_T;

                stackIn_10_1 = 1;

                if (var6 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_10_0 != stackIn_10_1) {
                      break L3;
                    } else {
                      L4: {
                        this.a(-115, var4_int, param0, param2);
                        stackIn_6_0 = (mo) (var5);

                        if ((var4_int ^ -1) != (this.field_Tb ^ -1)) {
                          stackIn_7_0 = (mo) ((Object) stackIn_6_0);
                          stackIn_7_1 = 0;
                          break L4;
                        } else {
                          stackIn_7_0 = (mo) ((Object) stackIn_6_0);
                          stackIn_7_1 = 1;
                          break L4;
                        }
                      }
                      stackIn_7_0.field_Ab = stackIn_7_1 != 0;
                      break L3;
                    }
                  }
                  var4_int++;
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackIn_10_0 = param1;
            stackIn_10_1 = 255;
            break L1;
          }
          L5: {
            if (stackIn_10_0 == stackIn_10_1) {
              break L5;
            } else {
              this.field_Ib = (ld) null;
              break L5;
            }
          }
          L6: {
            if (this.field_Tb == -1) {
              break L6;
            } else {
              var7 = this.field_Fb[this.field_Tb];
              var4 = var7;
              if (var4 == null) {
                break L6;
              } else {
                var7.b(param0, 255, param2);
                break L6;
              }
            }
          }
          L7: {
            if ((this.field_Hb ^ -1) < -1) {
              this.b(this.field_Hb - 1, 11183);
              break L7;
            } else {
              break L7;
            }
          }
          return;
        }
    }

    final static String a(byte param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        jh var3 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                var3 = (jh) null;
                ld.a((jh) null, false, 60, 111);
                break L1;
              }
            }
            L2: {
              var2 = mc.a(cq.a(0, param1), (byte) 26);
              if (var2 == null) {
                var2 = "";
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_6_0 = (String) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("ld.FA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int statePc = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ZombieDawnMulti.field_E ? 1 : 0;
                    this.field_Sb = param4 * 2 + this.field_Vb;
                    this.a(this.field_Nb, param1 - this.field_Nb, this.field_Sb, param0, -3344);
                    if (param2 < -16) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_Kb = -29L;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if ((param5 ^ -1) == (this.field_Mb ^ -1)) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.field_Mb = param5;
                    this.b(this.field_Hb, 11183);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var7 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if ((this.field_Ob ^ -1) >= (var7 ^ -1)) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_Gb[var7].a(param3, 2, this.field_Jb, this.field_Sb, 0, this.field_Gb[var7].field_Q, param4);
                    var7++;
                    if (var9 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var9 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (-1 == this.field_Tb) {
                        statePc = 19;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (this.field_Fb[this.field_Tb] != null) {
                        statePc = 12;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var7 = this.field_Fb[this.field_Tb].field_Ob;
                    var8 = this.field_Q + this.field_Jb * (var7 + this.field_Tb);
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if ((param1 ^ -1) <= (var8 ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var8 = var8 - this.field_Jb;
                    if (var9 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var9 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.field_Fb[this.field_Tb].a(param0 - -this.field_Sb, var8, -87, param3, param4, this.field_Gb[this.field_Tb].field_qb);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(byte param0) {
        mo[] var2 = null;
        int var3 = 0;
        mo var4 = null;
        int var5 = 0;
        mo[] var6 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ZombieDawnMulti.field_E ? 1 : 0;
                    var6 = this.field_Gb;
                    var2 = var6;
                    if (param0 >= 107) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.a(31, 97, 11, 57);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var3 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if ((var6.length ^ -1) >= (var3 ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var4 = var6[var3];
                    var4.field_T = 0;
                    var4.field_Ab = false;
                    var3++;
                    if (var5 != 0) {
                        statePc = 10;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var5 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (this.field_Ib == null) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_Ib.c((byte) 108);
                    this.field_Ib.a(true);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    this.field_Ib = null;
                    this.field_Tb = -1;
                    this.b(12, 11183);
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8) {
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
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
        var19 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param1 ^ -1) > -1) {
                break L1;
              } else {
                if ((param5 ^ -1) <= (ep.field_h ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    if (param4 >= 0) {
                      break L2;
                    } else {
                      if ((param6 ^ -1) <= -1) {
                        break L2;
                      } else {
                        if (0 <= param3) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L3: {
                    if (ep.field_i > param4) {
                      break L3;
                    } else {
                      if (param6 < ep.field_i) {
                        break L3;
                      } else {
                        if ((ep.field_i ^ -1) >= (param3 ^ -1)) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (param0 == -12628) {
                    L4: {
                      L5: {
                        var14 = param1 - param5;
                        if ((param5 ^ -1) == (param2 ^ -1)) {
                          break L5;
                        } else {
                          L6: {
                            L7: {
                              var10 = param4 << -1146515248;
                              var9_int = param4 << -1146515248;
                              var15 = -param5 + param2;
                              var11 = (param6 + -param4 << 1072950960) / var15;
                              var12 = (-param4 + param3 << -1368549136) / var14;
                              if (var11 >= var12) {
                                break L7;
                              } else {
                                var13 = 0;
                                if (var19 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var16 = var11;
                            var11 = var12;
                            var12 = var16;
                            var13 = 1;
                            break L6;
                          }
                          L8: {
                            L9: {
                              L10: {
                                if (0 > param5) {
                                  L11: {
                                    if ((param2 ^ -1) <= -1) {
                                      break L11;
                                    } else {
                                      param5 = param2 + -param5;
                                      var9_int = var9_int + param5 * var11;
                                      var10 = var10 + var12 * param5;
                                      param5 = param2;
                                      if (var19 == 0) {
                                        break L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  param5 = -param5;
                                  var9_int = var9_int + var11 * param5;
                                  var10 = var10 + var12 * param5;
                                  param5 = 0;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              var16 = ep.field_a[param5];
                              L12: while (true) {
                                if (param5 >= param2) {
                                  break L9;
                                } else {
                                  var17 = var9_int >> -641679056;
                                  stackIn_47_0 = var17 ^ -1;

                                  stackIn_47_1 = ep.field_i ^ -1;

                                  if (var19 != 0) {
                                    break L8;
                                  } else {
                                    L13: {
                                      if (stackIn_47_0 <= stackIn_47_1) {
                                        break L13;
                                      } else {
                                        L14: {
                                          var18 = -(var9_int >> 774828240) + (var10 >> 929719024);
                                          if (var18 != 0) {
                                            break L14;
                                          } else {
                                            if (0 > var17) {
                                              break L13;
                                            } else {
                                              if (ep.field_i > var17) {
                                                so.a(param7, true, var16 + var17, var18, param8);
                                                if (var19 == 0) {
                                                  break L13;
                                                } else {
                                                  break L14;
                                                }
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                        }
                                        L15: {
                                          if (ep.field_i <= var18 + var17) {
                                            var18 = -1 + -var17 + ep.field_i;
                                            break L15;
                                          } else {
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          if (var17 < 0) {
                                            break L16;
                                          } else {
                                            so.a(param7, true, var17 + var16, var18, param8);
                                            if (var19 == 0) {
                                              break L13;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        so.a(param7, true, var16, var18 + var17, param8);
                                        break L13;
                                      }
                                    }
                                    param5++;
                                    if ((param5 ^ -1) <= (ep.field_h ^ -1)) {
                                      decompiledRegionSelector0 = 4;
                                      break L0;
                                    } else {
                                      var9_int = var9_int + var11;
                                      var16 = var16 + oo.field_b;
                                      var10 = var10 + var12;
                                      if (var19 == 0) {
                                        continue L12;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var16 = param1 + -param2;
                            stackIn_47_0 = var16 ^ -1;
                            stackIn_47_1 = -1;
                            break L8;
                          }
                          L17: {
                            L18: {
                              if (stackIn_47_0 != stackIn_47_1) {
                                break L18;
                              } else {
                                var12 = 0;
                                var11 = 0;
                                if (var19 == 0) {
                                  break L17;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            L19: {
                              L20: {
                                var17 = param3 << -435078064;
                                if (var13 != 0) {
                                  break L20;
                                } else {
                                  var9_int = param6 << -592145584;
                                  if (var19 == 0) {
                                    break L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              var10 = param6 << 1481707568;
                              break L19;
                            }
                            var11 = (var17 + -var9_int) / var16;
                            var12 = (-var10 + var17) / var16;
                            break L17;
                          }
                          if (var19 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L21: {
                        L22: {
                          if (param1 == param5) {
                            break L22;
                          } else {
                            L23: {
                              L24: {
                                var15 = -param2 + param1;
                                if (param6 > param4) {
                                  break L24;
                                } else {
                                  var10 = param4 << -94535408;
                                  var11 = (-param6 + param3 << -1923766992) / var15;
                                  var12 = (-param4 + param3 << 2106942736) / var14;
                                  var9_int = param6 << -630187568;
                                  if (var19 == 0) {
                                    break L23;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                              var10 = param6 << -1633525584;
                              var12 = (param3 - param6 << 1961646192) / var15;
                              var11 = (param3 + -param4 << -1401890096) / var14;
                              var9_int = param4 << 400811568;
                              break L23;
                            }
                            if (var19 == 0) {
                              break L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        var11 = 0;
                        var10 = param6 << -548596304;
                        var12 = 0;
                        var9_int = param4 << -1663683536;
                        break L21;
                      }
                      var13 = 0;
                      if (0 <= param5) {
                        break L4;
                      } else {
                        param5 = Math.min(-param5, -param5 + param2);
                        var10 = var10 + var12 * param5;
                        var9_int = var9_int + var11 * param5;
                        param5 = 0;
                        break L4;
                      }
                    }
                    L25: {
                      if ((param5 ^ -1) <= -1) {
                        break L25;
                      } else {
                        param5 = -param5;
                        var10 = var10 + var12 * param5;
                        var9_int = var9_int + param5 * var11;
                        param5 = 0;
                        break L25;
                      }
                    }
                    var15 = ep.field_a[param5];
                    L26: while (true) {
                      L27: {
                        if ((param1 ^ -1) >= (param5 ^ -1)) {
                          break L27;
                        } else {
                          var16 = var9_int >> -1311822640;
                          if (var19 != 0) {
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            L28: {
                              if ((var16 ^ -1) > (ep.field_i ^ -1)) {
                                L29: {
                                  var17 = (var10 >> 227210128) - (var9_int >> 1022113424);
                                  if (0 != var17) {
                                    break L29;
                                  } else {
                                    if ((var16 ^ -1) > -1) {
                                      break L28;
                                    } else {
                                      if ((var16 ^ -1) > (ep.field_i ^ -1)) {
                                        so.a(param7, true, var16 - -var15, var17, param8);
                                        if (var19 == 0) {
                                          break L28;
                                        } else {
                                          break L29;
                                        }
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                }
                                L30: {
                                  if (var16 - -var17 >= ep.field_i) {
                                    var17 = -1 + -var16 + ep.field_i;
                                    break L30;
                                  } else {
                                    break L30;
                                  }
                                }
                                L31: {
                                  if (var16 >= 0) {
                                    break L31;
                                  } else {
                                    so.a(param7, true, var15, var17 - -var16, param8);
                                    if (var19 == 0) {
                                      break L28;
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                                so.a(param7, true, var15 + var16, var17, param8);
                                break L28;
                              } else {
                                break L28;
                              }
                            }
                            param5++;
                            if ((ep.field_h ^ -1) < (param5 ^ -1)) {
                              var9_int = var9_int + var11;
                              var15 = var15 + oo.field_b;
                              var10 = var10 + var12;
                              if (var19 == 0) {
                                continue L26;
                              } else {
                                break L27;
                              }
                            } else {
                              decompiledRegionSelector0 = 6;
                              break L0;
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 7;
                      break L0;
                    }
                  } else {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L32: {
            var9 = decompiledCaughtException;
            stackIn_87_0 = (RuntimeException) (var9);

            stackIn_87_1 = new StringBuilder().append("ld.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_88_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackIn_88_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackIn_88_2 = "null";
              break L32;
            } else {
              stackIn_88_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackIn_88_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackIn_88_2 = "{...}";
              break L32;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_88_0), stackIn_88_2 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final boolean k(int param0) {
        int var2;
        mo[] var3;
        int var4;
        mo var5;
        int var6;
        int stackIn_8_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_16_0 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = 0;
        if (param0 == -26899) {
          var3 = this.field_Gb;
          var4 = 0;
          L0: while (true) {
            L1: {
              L2: {
                L3: {
                  if ((var3.length ^ -1) >= (var4 ^ -1)) {
                    break L3;
                  } else {
                    var5 = var3[var4];
                    stackIn_11_0 = var2;

                    stackIn_11_1 = 0;

                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {


                        if (stackIn_11_1 == var5.field_T) {

                          stackIn_8_1 = 0;
                          break L4;
                        } else {

                          stackIn_8_1 = 1;
                          break L4;
                        }
                      }
                      var2 = stackIn_11_0 | stackIn_8_1;
                      var4++;
                      if (var6 == 0) {
                        continue L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (var2 != 0) {
                  break L1;
                } else {
                  stackIn_11_0 = this.field_Tb;
                  stackIn_11_1 = -1;
                  break L2;
                }
              }
              if ((stackIn_11_0 ^ stackIn_11_1) == 0) {
                break L1;
              } else {
                if (null == this.field_Fb[this.field_Tb]) {
                  break L1;
                } else {
                  L5: {
                    if (!this.field_Fb[this.field_Tb].k(param0 + 0)) {
                      stackIn_16_0 = 0;
                      break L5;
                    } else {
                      stackIn_16_0 = 1;
                      break L5;
                    }
                  }
                  var2 = stackIn_16_0;
                  break L1;
                }
              }
            }
            return var2 != 0;
          }
        } else {
          return false;
        }
    }

    public static void h(int param0) {
        field_Lb = null;
        field_Rb = null;
        if (param0 >= -104) {
            jh var2 = (jh) null;
            ld.a((jh) null, false, 77, -3);
        }
        field_Ub = null;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        String var8;
        L0: {
          var7 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 <= -93) {
            break L0;
          } else {
            this.field_Fb = (ld[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if ((param1 ^ -1) == (this.field_Tb ^ -1)) {
              break L2;
            } else {
              L3: {
                L4: {
                  if (this.field_Fb[param1] != null) {
                    break L4;
                  } else {
                    L5: {
                      if ((this.field_Qb[param1] ^ -1) == 0) {
                        break L5;
                      } else {
                        L6: {
                          var5 = 32768 | this.field_Qb[param1];
                          var6 = va.field_a;
                          if ((var6 ^ -1) != -1) {
                            break L6;
                          } else {
                            if (mh.field_c == null) {
                              break L6;
                            } else {
                              var6 = 1;
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (-3 != (ga.a(var6, true) ^ -1)) {
                            break L7;
                          } else {
                            kp.a(var6, param3, 1, true);
                            break L7;
                          }
                        }
                        var8 = (String) null;
                        kb.a(var5, qf.field_g, param2, (String) null, va.field_a, 29602);
                        ii.a(va.field_a, (byte) -128, var5, qf.field_g, jj.field_M);
                        fh.b(31706);
                        lh.a(true);
                        if (var7 == 0) {
                          break L1;
                        } else {
                          break L5;
                        }
                      }
                    }
                    qd.c(4024);
                    fh.b(31706);
                    if (var7 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                this.c((byte) 119);
                this.b(0, 11183);
                this.field_Tb = param1;
                this.field_Ib = this.field_Fb[this.field_Tb];
                an.a((byte) 75, this.field_Ib);
                this.field_Ib.b(12, 11183);
                if (var7 == 0) {
                  break L3;
                } else {
                  break L2;
                }
              }
              break L1;
            }
          }
          this.c((byte) 127);
          this.b(0, 11183);
          break L1;
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int stackIn_3_0 = 0;
        int stackIn_24_0 = 0;
        L0: {
          var8 = ZombieDawnMulti.field_E ? 1 : 0;
          if (sj.field_p != 85) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (this.field_Ib != null) {
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              if (-1 == this.field_Ib.field_Tb) {
                this.c((byte) 110);
                this.b(0, 11183);
                return true;
              } else {
                break L1;
              }
            }
          }
          return this.field_Ib.a(-119, param1, param2);
        } else {
          L2: {
            if (null != this.field_Ib) {
              break L2;
            } else {
              if (mj.field_Ib != this) {
                break L2;
              } else {
                if (var4 != 0) {
                  fh.b(31706);
                  return true;
                } else {
                  break L2;
                }
              }
            }
          }
          L3: {
            var5 = pn.field_d;
            var6 = -52 / ((param0 - 38) / 52);
            if (var5 <= 0) {
              break L3;
            } else {
              L4: {
                if (wc.field_I != var5) {
                  break L4;
                } else {
                  var5 = 63;
                  break L4;
                }
              }
              var7 = 0;
              L5: while (true) {
                if ((var7 ^ -1) <= (this.field_Pb.length ^ -1)) {
                  break L3;
                } else {
                  stackIn_24_0 = this.field_Pb[var7] ^ -1;

                  if (var8 != 0) {
                    return stackIn_24_0 != 0;
                  } else {
                    if (stackIn_24_0 != (var5 ^ -1)) {
                      var7++;
                      if (var8 == 0) {
                        continue L5;
                      } else {
                        break L3;
                      }
                    } else {
                      this.a(-105, var7, param1, param2);
                      return true;
                    }
                  }
                }
              }
            }
          }
          return false;
        }
    }

    final static void j(int param0) {
        q.b(72);
        if (param0 != 1481707568) {
            field_Kb = -107L;
        }
        bc.b(10);
        bk.field_i = null;
        fh.b(param0 + -1481675862);
    }

    static {
        field_Rb = new lf();
        field_Lb = "Buying or selling an account";
    }
}
