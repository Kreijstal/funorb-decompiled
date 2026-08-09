/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class po extends br {
    private int[] field_r;
    jd[] field_s;
    static int field_n;
    static String field_i;
    static pd field_l;
    static cj field_k;
    short[] field_g;
    byte[] field_j;
    static String field_f;
    int field_o;
    static boolean field_p;
    nj[] field_q;
    byte[] field_h;
    byte[] field_m;

    final static void a(byte param0, int param1) {
        int var2 = 30 / ((param0 - 70) / 37);
        w.field_m = w.field_m | 1 << -param1;
    }

    final void e(int param0) {
        this.field_r = null;
        if (param0 != -6930) {
            field_p = true;
        }
    }

    public static void f(int param0) {
        field_i = null;
        field_l = null;
        field_k = null;
        int var1 = -128 / ((4 - param0) / 41);
        field_f = null;
    }

    final static void a(int param0) {
        nk.field_n = new String[mo.field_Kb];
        nk.field_n[7] = kg.field_l;
        nk.field_n[5] = jk.field_e;
        nk.field_n[4] = hp.field_h;
        nk.field_n[18] = op.field_o;
        nk.field_n[21] = lj.field_p;
        nk.field_n[6] = ld.field_Lb;
        nk.field_n[16] = mn.field_n;
        nk.field_n[19] = sd.field_E;
        nk.field_n[13] = vn.field_a;
        nk.field_n[20] = rl.field_c;
        if (param0 != 2) {
            po.d(2);
        }
        nk.field_n[17] = tj.field_d;
        nk.field_n[9] = li.field_z;
        nk.field_n[11] = si.field_D;
        nk.field_n[15] = eh.field_f;
    }

    final static int d(int param0) {
        if (param0 != 12949) {
            return -35;
        }
        return hp.a((byte) -122, g.field_a, 16) + 4;
    }

    final static boolean c(int param0) {
        if (param0 != 128) {
            return true;
        }
        return !tg.field_g.d(-86) ? true : false;
    }

    po(byte[] param0) {
        int incrementValue$0 = 0;
        nj dupTemp$1 = null;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int stackIn_30_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_46_0 = 0;
        byte[] stackIn_49_0 = null;
        byte[] stackIn_52_0 = null;
        int stackIn_73_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        byte[] stackIn_130_0 = null;
        byte[] stackIn_143_0 = null;
        byte[] stackIn_156_0 = null;
        byte[] stackIn_166_0 = null;
        int stackIn_186_0 = 0;
        byte[] stackIn_196_0 = null;
        int stackIn_198_0 = 0;
        int stackIn_206_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_214_0 = 0;
        int stackIn_214_1 = 0;
        int stackIn_216_0 = 0;
        int stackIn_219_0 = 0;
        int stackIn_219_1 = 0;
        int stackIn_226_0 = 0;
        int stackIn_229_0 = 0;
        int stackIn_229_1 = 0;
        int stackIn_237_0 = 0;
        int stackIn_237_1 = 0;
        int stackIn_257_0 = 0;
        int stackIn_257_1 = 0;
        int stackIn_262_0 = 0;
        int stackIn_262_1 = 0;
        RuntimeException stackIn_269_0 = null;
        StringBuilder stackIn_269_1 = null;
        RuntimeException stackIn_270_0 = null;
        StringBuilder stackIn_270_1 = null;
        RuntimeException stackIn_271_0 = null;
        StringBuilder stackIn_271_1 = null;
        String stackIn_271_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int var11_int = 0;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        nj[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        nj var15 = null;
        byte[] var15_array = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        k var37 = null;
        byte[] var38 = null;
        nj var39 = null;
        byte[] var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        nj var44 = null;
        byte[] var45 = null;
        byte[] var46 = null;
        nj var47 = null;
        nj var48 = null;
        nj var49 = null;
        nj var50 = null;
        nj var51 = null;
        byte[] var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var36 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    this.field_q = new nj[128];
                    this.field_h = new byte[128];
                    this.field_s = new jd[128];
                    this.field_m = new byte[128];
                    this.field_r = new int[128];
                    this.field_g = new short[128];
                    this.field_j = new byte[128];
                    var37 = new k(param0);
                    var3 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if ((var37.field_m[var3 + var37.field_j] ^ -1) == -1) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var3++;
                    if (var36 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var54 = new byte[var3];
                    var41 = var54;
                    var4 = var41;
                    var5 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if ((var3 ^ -1) >= (var5 ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var4[var5] = var37.d(-249699580);
                    var5++;
                    if (var36 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var36 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var3++;
                    var37.field_j = var37.field_j + 1;
                    var5 = var37.field_j;
                    var37.field_j = var37.field_j + var3;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var6 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if ((var37.field_m[var6 + var37.field_j] ^ -1) == -1) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var6++;
                    if (var36 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var55 = new byte[var6];
                    var42 = var55;
                    var7 = var42;
                    var8 = 0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (var8 >= var6) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var7[var8] = var37.d(-249699580);
                    var8++;
                    if (var36 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var36 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var37.field_j = var37.field_j + 1;
                    var6++;
                    var8 = var37.field_j;
                    var37.field_j = var37.field_j + var6;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var9 = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (0 == var37.field_m[var9 + var37.field_j]) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var9++;
                    if (var36 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var56 = new byte[var9];
                    var43 = var56;
                    var10 = var43;
                    var11_int = 0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (var9 <= var11_int) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var10[var11_int] = var37.d(-249699580);
                    var11_int++;
                    if (var36 != 0) {
                        statePc = 25;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var36 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var37.field_j = var37.field_j + 1;
                    var9++;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    var52 = new byte[var9];
                    var38 = var52;
                    var11 = var38;
                    if (1 < var9) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var12 = var9;
                    if (var36 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var52[1] = (byte) 1;
                    var12 = 2;
                    var13_int = 1;
                    var14 = 2;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (var14 >= var9) {
                        statePc = 36;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var15_int = var37.g(31365);
                    stackIn_37_0 = var15_int ^ -1;
                    stackIn_30_0 = stackIn_37_0;
                    if (var36 != 0) {
                        statePc = 37;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (stackIn_30_0 != -1) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    incrementValue$0 = var12;
                    var12++;
                    var13_int = incrementValue$0;
                    if (var36 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (var15_int > var13_int) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var15_int--;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var13_int = var15_int;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    var11[var14] = (byte)var13_int;
                    var14++;
                    if (var36 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_37_0 = var12;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    var13 = new nj[stackIn_37_0];
                    var14 = 0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if ((var13.length ^ -1) >= (var14 ^ -1)) {
                        statePc = 45;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    dupTemp$1 = new nj();
                    var13[var14] = dupTemp$1;
                    var39 = dupTemp$1;
                    var15 = var39;
                    var16_int = var37.g(31365);
                    stackIn_46_0 = var16_int;
                    stackIn_40_0 = stackIn_46_0;
                    if (var36 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (stackIn_40_0 <= 0) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var15.field_l = new byte[2 * var16_int];
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var16_int = var37.g(31365);
                    if (var16_int <= 0) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var15.field_e = new byte[2 + var16_int * 2];
                    var39.field_e[1] = (byte)64;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    var14++;
                    if (var36 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var14 = var37.g(31365);
                    stackIn_46_0 = var14;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (stackIn_46_0 > 0) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    stackIn_49_0 = null;
                    statePc = 49;
                    continue stateLoop;
                }
                case 48: {
                    stackIn_49_0 = new byte[var14 * 2];
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    var57 = stackIn_49_0;
                    var45 = var57;
                    var15_array = var45;
                    var14 = var37.g(31365);
                    if (var14 <= 0) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    stackIn_52_0 = new byte[2 * var14];
                    statePc = 52;
                    continue stateLoop;
                }
                case 51: {
                    stackIn_52_0 = null;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var46 = stackIn_52_0;
                    var16 = var46;
                    var17 = 0;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (-1 == (var37.field_m[var17 + var37.field_j] ^ -1)) {
                        statePc = 55;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var17++;
                    if (var36 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var53 = new byte[var17];
                    var40 = var53;
                    var18 = var40;
                    var19 = 0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (var19 >= var17) {
                        statePc = 59;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var18[var19] = var37.d(-249699580);
                    var19++;
                    if (var36 != 0) {
                        statePc = 60;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (var36 == 0) {
                        statePc = 56;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var37.field_j = var37.field_j + 1;
                    var17++;
                    var19 = 0;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    var20 = 0;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    if (-129 >= (var20 ^ -1)) {
                        statePc = 64;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var19 = var19 + var37.g(31365);
                    this.field_g[var20] = (short)var19;
                    var20++;
                    if (var36 != 0) {
                        statePc = 65;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (var36 == 0) {
                        statePc = 61;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var19 = 0;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    var20 = 0;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if (128 <= var20) {
                        statePc = 69;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var19 = var19 + var37.g(31365);
                    this.field_g[var20] = (short)(this.field_g[var20] + (var19 << 732497864));
                    var20++;
                    if (var36 != 0) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (var36 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var20 = 0;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    var21 = 0;
                    var22 = 0;
                    var23 = 0;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if (-129 >= (var23 ^ -1)) {
                        statePc = 79;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    stackIn_80_0 = 0;
                    stackIn_73_0 = stackIn_80_0;
                    if (var36 != 0) {
                        statePc = 80;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (stackIn_73_0 != var20) {
                        statePc = 78;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (var21 >= var53.length) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    incrementValue$2 = var21;
                    var21++;
                    var20 = var18[incrementValue$2];
                    if (var36 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var20 = -1;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    var22 = var37.a(0);
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    this.field_g[var23] = (short)(this.field_g[var23] + (tq.b(2, -1 + var22) << -520245554));
                    var20--;
                    this.field_r[var23] = var22;
                    var23++;
                    if (var36 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var20 = 0;
                    var21 = 0;
                    var23 = 0;
                    stackIn_80_0 = 0;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    var24 = stackIn_80_0;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    if (-129 >= (var24 ^ -1)) {
                        statePc = 91;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    stackIn_92_0 = -1;
                    stackIn_83_0 = stackIn_92_0;
                    if (var36 != 0) {
                        statePc = 92;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (stackIn_83_0 == (this.field_r[var24] ^ -1)) {
                        statePc = 90;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if ((var20 ^ -1) != -1) {
                        statePc = 89;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (var54.length <= var21) {
                        statePc = 87;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    incrementValue$3 = var21;
                    var21++;
                    var20 = var4[incrementValue$3];
                    if (var36 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var20 = -1;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    incrementValue$4 = var5;
                    var5++;
                    var23 = -1 + var37.field_m[incrementValue$4];
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    this.field_m[var24] = (byte)var23;
                    var20--;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    var24++;
                    if (var36 == 0) {
                        statePc = 81;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var21 = 0;
                    var20 = 0;
                    var24 = 0;
                    stackIn_92_0 = 0;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    var25_int = stackIn_92_0;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    if ((var25_int ^ -1) <= -129) {
                        statePc = 103;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    stackIn_104_0 = this.field_r[var25_int];
                    stackIn_95_0 = stackIn_104_0;
                    if (var36 != 0) {
                        statePc = 104;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (stackIn_95_0 != 0) {
                        statePc = 97;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (var36 == 0) {
                        statePc = 102;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (-1 != (var20 ^ -1)) {
                        statePc = 101;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    incrementValue$5 = var8;
                    var8++;
                    var24 = 16 + var37.field_m[incrementValue$5] << -1886766526;
                    if (var55.length > var21) {
                        statePc = 100;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var20 = -1;
                    if (var36 == 0) {
                        statePc = 101;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    incrementValue$6 = var21;
                    var21++;
                    var20 = var7[incrementValue$6];
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    this.field_j[var25_int] = (byte)var24;
                    var20--;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    var25_int++;
                    if (var36 == 0) {
                        statePc = 93;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    var20 = 0;
                    stackIn_104_0 = 0;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    var21 = stackIn_104_0;
                    var25 = null;
                    var26 = 0;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if ((var26 ^ -1) <= -129) {
                        statePc = 115;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    stackIn_116_0 = this.field_r[var26] ^ -1;
                    stackIn_107_0 = stackIn_116_0;
                    if (var36 != 0) {
                        statePc = 116;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (stackIn_107_0 != -1) {
                        statePc = 109;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (var36 == 0) {
                        statePc = 114;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (-1 != (var20 ^ -1)) {
                        statePc = 113;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    var25 = var13[var52[var21]];
                    if (var21 >= var56.length) {
                        statePc = 112;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    incrementValue$7 = var21;
                    var21++;
                    var20 = var10[incrementValue$7];
                    if (var36 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var20 = -1;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    var20--;
                    this.field_q[var26] = (nj) (var25);
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    var26++;
                    if (var36 == 0) {
                        statePc = 105;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var21 = 0;
                    var20 = 0;
                    var26 = 0;
                    stackIn_116_0 = 0;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    var27 = stackIn_116_0;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    if ((var27 ^ -1) <= -129) {
                        statePc = 126;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    stackIn_128_0 = 0;
                    stackIn_119_0 = stackIn_128_0;
                    stackIn_128_1 = var20;
                    stackIn_119_1 = stackIn_128_1;
                    if (var36 != 0) {
                        statePc = 128;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if (stackIn_119_0 != stackIn_119_1) {
                        statePc = 125;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (var21 >= var53.length) {
                        statePc = 122;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    incrementValue$8 = var21;
                    var21++;
                    var20 = var18[incrementValue$8];
                    if (var36 == 0) {
                        statePc = 123;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var20 = -1;
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    if (this.field_r[var27] <= 0) {
                        statePc = 125;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    var26 = 1 + var37.g(31365);
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    var20--;
                    this.field_h[var27] = (byte)var26;
                    var27++;
                    if (var36 == 0) {
                        statePc = 117;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    this.field_o = 1 + var37.g(31365);
                    var27 = 0;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    stackIn_128_0 = var27;
                    stackIn_128_1 = var12;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    if (stackIn_128_0 >= stackIn_128_1) {
                        statePc = 142;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var44 = var13[var27];
                    stackIn_143_0 = var44.field_l;
                    stackIn_130_0 = stackIn_143_0;
                    if (var36 != 0) {
                        statePc = 143;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    if (stackIn_130_0 == null) {
                        statePc = 135;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    var29 = 1;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    if (var44.field_l.length <= var29) {
                        statePc = 135;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var44.field_l[var29] = var37.d(-249699580);
                    var29 += 2;
                    if (var36 != 0) {
                        statePc = 141;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if (var36 == 0) {
                        statePc = 132;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (var44.field_e == null) {
                        statePc = 140;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var29 = 3;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    if ((var44.field_e.length - 2 ^ -1) >= (var29 ^ -1)) {
                        statePc = 140;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var44.field_e[var29] = var37.d(-249699580);
                    var29 += 2;
                    if (var36 != 0) {
                        statePc = 141;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (var36 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var27++;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    if (var36 == 0) {
                        statePc = 127;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    stackIn_143_0 = (byte[]) (var15_array);
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if (stackIn_143_0 == null) {
                        statePc = 148;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var27 = 1;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    if ((var57.length ^ -1) >= (var27 ^ -1)) {
                        statePc = 148;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var15_array[var27] = var37.d(-249699580);
                    var27 += 2;
                    if (var36 != 0) {
                        statePc = 149;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if (var36 == 0) {
                        statePc = 145;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    if (var16 == null) {
                        statePc = 153;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    var27 = 1;
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    if ((var46.length ^ -1) >= (var27 ^ -1)) {
                        statePc = 153;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    var16[var27] = var37.d(-249699580);
                    var27 += 2;
                    if (var36 != 0) {
                        statePc = 154;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    if (var36 == 0) {
                        statePc = 150;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    var27 = 0;
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    if (var27 >= var12) {
                        statePc = 163;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    var47 = var13[var27];
                    stackIn_196_0 = var47.field_e;
                    stackIn_156_0 = stackIn_196_0;
                    if (var36 != 0) {
                        statePc = 196;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    if (stackIn_156_0 == null) {
                        statePc = 161;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var19 = 0;
                    var29 = 2;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    if (var29 >= var47.field_e.length) {
                        statePc = 161;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    var19 = 1 + var19 + var37.g(31365);
                    var47.field_e[var29] = (byte)var19;
                    var29 += 2;
                    if (var36 != 0) {
                        statePc = 162;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    if (var36 == 0) {
                        statePc = 158;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    var27++;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    if (var36 == 0) {
                        statePc = 154;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    var27 = 0;
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    if (var27 >= var12) {
                        statePc = 173;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    var48 = var13[var27];
                    stackIn_196_0 = var48.field_l;
                    stackIn_166_0 = stackIn_196_0;
                    if (var36 != 0) {
                        statePc = 196;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if (stackIn_166_0 == null) {
                        statePc = 171;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    var19 = 0;
                    var29 = 2;
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    if (var29 >= var48.field_l.length) {
                        statePc = 171;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    var19 = 1 + var19 + var37.g(31365);
                    var48.field_l[var29] = (byte)var19;
                    var29 += 2;
                    if (var36 != 0) {
                        statePc = 172;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    if (var36 == 0) {
                        statePc = 168;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    var27++;
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    if (var36 == 0) {
                        statePc = 164;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    if (var15_array == null) {
                        statePc = 195;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var19 = var37.g(31365);
                    var15_array[0] = (byte)var19;
                    var27 = 2;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    if (var57.length <= var27) {
                        statePc = 178;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    var19 = var37.g(31365) + var19 + 1;
                    var15_array[var27] = (byte)var19;
                    var27 += 2;
                    if (var36 != 0) {
                        statePc = 179;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    if (var36 == 0) {
                        statePc = 175;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    var27 = var57[0];
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    var28 = var57[1];
                    var29 = 0;
                    statePc = 180;
                    continue stateLoop;
                }
                case 180: {
                    if (var29 >= var27) {
                        statePc = 183;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    this.field_h[var29] = (byte)(32 + this.field_h[var29] * var28 >> -686192218);
                    var29++;
                    if (var36 != 0) {
                        statePc = 184;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    if (var36 == 0) {
                        statePc = 180;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    var29 = 2;
                    statePc = 184;
                    continue stateLoop;
                }
                case 184: {
                    if ((var57.length ^ -1) >= (var29 ^ -1)) {
                        statePc = 192;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    var30 = var57[var29];
                    var31 = var15_array[var29 - -1];
                    var32 = (var30 - var27) / 2 + var28 * (var30 - var27);
                    stackIn_198_0 = var27;
                    stackIn_186_0 = stackIn_198_0;
                    if (var36 != 0) {
                        statePc = 198;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    var33 = stackIn_186_0;
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    if ((var33 ^ -1) <= (var30 ^ -1)) {
                        statePc = 190;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    var34 = cn.a(-var27 + var30, -95, var32);
                    var32 = var32 + (-var28 + var31);
                    this.field_h[var33] = (byte)(32 + var34 * this.field_h[var33] >> 1073544614);
                    var33++;
                    if (var36 != 0) {
                        statePc = 191;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    if (var36 == 0) {
                        statePc = 187;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    var28 = var31;
                    var27 = var30;
                    var29 += 2;
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    if (var36 == 0) {
                        statePc = 184;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    var15_array = null;
                    var30 = var27;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if (var30 >= 128) {
                        statePc = 195;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    this.field_h[var30] = (byte)(this.field_h[var30] * var28 + 32 >> -1195203930);
                    var30++;
                    statePc = 193;
                    continue stateLoop;
                }
                case 195: {
                    stackIn_196_0 = (byte[]) (var16);
                    statePc = 196;
                    continue stateLoop;
                }
                case 196: {
                    if (stackIn_196_0 == null) {
                        statePc = 235;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    var19 = var37.g(31365);
                    var16[0] = (byte)var19;
                    stackIn_198_0 = 2;
                    statePc = 198;
                    continue stateLoop;
                }
                case 198: {
                    var27 = stackIn_198_0;
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    if (var46.length <= var27) {
                        statePc = 202;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    var19 = var19 + 1 - -var37.g(31365);
                    var16[var27] = (byte)var19;
                    var27 += 2;
                    if (var36 != 0) {
                        statePc = 203;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (var36 == 0) {
                        statePc = 199;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    var27 = var46[0];
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    var28 = var46[1] << -377749055;
                    var29 = 0;
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    if (var27 <= var29) {
                        statePc = 211;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    var30 = (this.field_j[var29] & 255) - -var28;
                    stackIn_212_0 = var30;
                    stackIn_206_0 = stackIn_212_0;
                    if (var36 != 0) {
                        statePc = 212;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    if (stackIn_206_0 >= 0) {
                        statePc = 208;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    var30 = 0;
                    statePc = 208;
                    continue stateLoop;
                }
                case 208: {
                    if (128 >= var30) {
                        statePc = 210;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    var30 = 128;
                    statePc = 210;
                    continue stateLoop;
                }
                case 210: {
                    this.field_j[var29] = (byte)var30;
                    var29++;
                    if (var36 == 0) {
                        statePc = 204;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    stackIn_212_0 = 2;
                    statePc = 212;
                    continue stateLoop;
                }
                case 212: {
                    var29 = stackIn_212_0;
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    stackIn_214_0 = var29 ^ -1;
                    stackIn_214_1 = var46.length ^ -1;
                    statePc = 214;
                    continue stateLoop;
                }
                case 214: {
                    if (stackIn_214_0 <= stackIn_214_1) {
                        statePc = 225;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    var30 = var46[var29];
                    var31 = var16[var29 + 1] << 1772214753;
                    var32 = (var30 - var27) / 2 + (-var27 + var30) * var28;
                    stackIn_226_0 = var27;
                    stackIn_216_0 = stackIn_226_0;
                    if (var36 != 0) {
                        statePc = 226;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    var33 = stackIn_216_0;
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    if (var30 <= var33) {
                        statePc = 224;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    var34 = cn.a(-var27 + var30, -125, var32);
                    var35 = (this.field_j[var33] & 255) - -var34;
                    stackIn_214_0 = 0;
                    stackIn_219_0 = stackIn_214_0;
                    stackIn_214_1 = var35;
                    stackIn_219_1 = stackIn_214_1;
                    if (var36 != 0) {
                        statePc = 214;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    if (stackIn_219_0 <= stackIn_219_1) {
                        statePc = 221;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    var35 = 0;
                    statePc = 221;
                    continue stateLoop;
                }
                case 221: {
                    if (128 >= var35) {
                        statePc = 223;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    var35 = 128;
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    var32 = var32 + (var31 - var28);
                    this.field_j[var33] = (byte)var35;
                    var33++;
                    if (var36 == 0) {
                        statePc = 217;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    var28 = var31;
                    var29 += 2;
                    var27 = var30;
                    if (var36 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    stackIn_226_0 = var27;
                    statePc = 226;
                    continue stateLoop;
                }
                case 226: {
                    var30 = stackIn_226_0;
                    statePc = 227;
                    continue stateLoop;
                }
                case 227: {
                    if ((var30 ^ -1) <= -129) {
                        statePc = 234;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    var31 = (255 & this.field_j[var30]) + var28;
                    stackIn_237_0 = 0;
                    stackIn_229_0 = stackIn_237_0;
                    stackIn_237_1 = var31;
                    stackIn_229_1 = stackIn_237_1;
                    if (var36 != 0) {
                        statePc = 237;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    if (stackIn_229_0 <= stackIn_229_1) {
                        statePc = 231;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    var31 = 0;
                    statePc = 231;
                    continue stateLoop;
                }
                case 231: {
                    if (var31 <= 128) {
                        statePc = 233;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    var31 = 128;
                    statePc = 233;
                    continue stateLoop;
                }
                case 233: {
                    this.field_j[var30] = (byte)var31;
                    var30++;
                    if (var36 == 0) {
                        statePc = 227;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    var16 = null;
                    statePc = 235;
                    continue stateLoop;
                }
                case 235: {
                    var27 = 0;
                    statePc = 236;
                    continue stateLoop;
                }
                case 236: {
                    stackIn_237_0 = var12;
                    stackIn_237_1 = var27;
                    statePc = 237;
                    continue stateLoop;
                }
                case 237: {
                    if (stackIn_237_0 <= stackIn_237_1) {
                        statePc = 240;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    var13[var27].field_b = var37.g(31365);
                    var27++;
                    if (var36 != 0) {
                        statePc = 241;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    if (var36 == 0) {
                        statePc = 236;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    var27 = 0;
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    if ((var12 ^ -1) >= (var27 ^ -1)) {
                        statePc = 250;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    var49 = var13[var27];
                    if (var36 != 0) {
                        statePc = 251;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    if (null == var49.field_l) {
                        statePc = 245;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    var49.field_c = var37.g(31365);
                    statePc = 245;
                    continue stateLoop;
                }
                case 245: {
                    if (null == var49.field_e) {
                        statePc = 247;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    var49.field_m = var37.g(31365);
                    statePc = 247;
                    continue stateLoop;
                }
                case 247: {
                    if (var49.field_b <= 0) {
                        statePc = 249;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    var49.field_i = var37.g(31365);
                    statePc = 249;
                    continue stateLoop;
                }
                case 249: {
                    var27++;
                    if (var36 == 0) {
                        statePc = 241;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    var27 = 0;
                    statePc = 251;
                    continue stateLoop;
                }
                case 251: {
                    if (var27 >= var12) {
                        statePc = 254;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    var13[var27].field_k = var37.g(31365);
                    var27++;
                    if (var36 != 0) {
                        statePc = 255;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    if (var36 == 0) {
                        statePc = 251;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    var27 = 0;
                    statePc = 255;
                    continue stateLoop;
                }
                case 255: {
                    if ((var27 ^ -1) <= (var12 ^ -1)) {
                        statePc = 260;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    var50 = var13[var27];
                    stackIn_262_0 = var50.field_k ^ -1;
                    stackIn_257_0 = stackIn_262_0;
                    stackIn_262_1 = -1;
                    stackIn_257_1 = stackIn_262_1;
                    if (var36 != 0) {
                        statePc = 262;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    if (stackIn_257_0 >= stackIn_257_1) {
                        statePc = 259;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    var50.field_g = var37.g(31365);
                    statePc = 259;
                    continue stateLoop;
                }
                case 259: {
                    var27++;
                    if (var36 == 0) {
                        statePc = 255;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    var27 = 0;
                    statePc = 261;
                    continue stateLoop;
                }
                case 261: {
                    stackIn_262_0 = var27;
                    stackIn_262_1 = var12;
                    statePc = 262;
                    continue stateLoop;
                }
                case 262: {
                    if (stackIn_262_0 >= stackIn_262_1) {
                        statePc = 272;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    var51 = var13[var27];
                    if (var36 != 0) {
                        statePc = 273;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    if ((var51.field_g ^ -1) >= -1) {
                        statePc = 266;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    var51.field_j = var37.g(31365);
                    statePc = 266;
                    continue stateLoop;
                }
                case 266: {
                    var27++;
                    if (var36 == 0) {
                        statePc = 261;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    return;
                }
                case 273: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(me param0, int param1, byte[] param2, int[] param3) {
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 1;
                        if (param1 >= 39) {
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
                        po.c(-70);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var6 = 0;
                        var7 = null;
                        var8 = 0;
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
                        if (var8 >= 128) {
                            statePc = 22;
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
                        if (param2 == null) {
                            statePc = 8;
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
                        if (-1 != (param2[var8] ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var9 = this.field_r[var8];
                        if ((var9 ^ -1) != -1) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var10 == 0) {
                            statePc = 21;
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
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var9 != var6) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6 = var9;
                        var9--;
                        if ((1 & var9) == 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7 = param0.a(var9 >> 606635074, (byte) -64, param3);
                        if (var10 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var7 = param0.a(var9 >> 729298978, param3, 115);
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
                        if (var7 == null) {
                            statePc = 18;
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
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5_int = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var7 == null) {
                            statePc = 21;
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
                        this.field_s[var8] = (jd) (var7);
                        this.field_r[var8] = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var8++;
                        if (var10 == 0) {
                            statePc = 4;
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
                        stackIn_23_0 = var5_int;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0 != 0;
                }
                case 24: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_26_0 = (RuntimeException) (var5);
                    stackIn_25_0 = stackIn_26_0;
                    stackIn_26_1 = new StringBuilder().append("po.E(");
                    stackIn_25_1 = stackIn_26_1;
                    if (param0 == null) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_27_2 = "{...}";
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_27_2 = "null";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_0 = stackIn_29_0;
                    stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',');
                    stackIn_28_1 = stackIn_29_1;
                    if (param2 == null) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_30_2 = "{...}";
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_30_2 = "null";
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_31_0 = stackIn_32_0;
                    stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
                    stackIn_31_1 = stackIn_32_1;
                    if (param3 == null) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_31_1);
                    stackIn_33_2 = "{...}";
                    statePc = 33;
                    continue stateLoop;
                }
                case 32: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
                    stackIn_33_2 = "null";
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    throw fa.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_f = "Searching for an opponent";
        field_i = "";
        field_p = false;
    }
}
