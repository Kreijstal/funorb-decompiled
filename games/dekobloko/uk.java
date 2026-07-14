/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uk extends bh {
    int field_v;
    static java.math.BigInteger field_p;
    int field_o;
    int field_n;
    int field_r;
    int field_t;
    int field_w;
    int field_A;
    int field_u;
    pi[] field_q;
    static long[] field_x;
    static int[] field_z;
    static long[][] field_s;
    static String field_y;

    final void b(int param0, int param1) {
        RuntimeException var3 = null;
        uk var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        pi var15_ref_pi = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        pi var19_ref_pi = null;
        pi var20 = null;
        int var21 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        pi stackIn_34_0 = null;
        int stackIn_52_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        pi stackIn_56_0 = null;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        pi stackIn_67_0 = null;
        pi stackIn_67_1 = null;
        pi stackIn_78_0 = null;
        pi stackIn_81_0 = null;
        pi stackIn_81_1 = null;
        int stackIn_93_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        pi stackIn_120_0 = null;
        int stackIn_134_0 = 0;
        int stackIn_136_0 = 0;
        int stackIn_136_1 = 0;
        pi stackIn_138_0 = null;
        int stackIn_141_0 = 0;
        int stackIn_141_1 = 0;
        int stackIn_143_0 = 0;
        int stackIn_143_1 = 0;
        pi stackIn_146_0 = null;
        pi stackIn_146_1 = null;
        pi stackIn_157_0 = null;
        pi stackIn_160_0 = null;
        pi stackIn_160_1 = null;
        Throwable caughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        pi stackOut_32_0 = null;
        int stackOut_51_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        pi stackOut_55_0 = null;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        pi stackOut_65_0 = null;
        pi stackOut_65_1 = null;
        pi stackOut_77_0 = null;
        pi stackOut_80_0 = null;
        pi stackOut_80_1 = null;
        int stackOut_92_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        pi stackOut_118_0 = null;
        int stackOut_133_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_135_1 = 0;
        pi stackOut_137_0 = null;
        int stackOut_140_0 = 0;
        int stackOut_140_1 = 0;
        int stackOut_141_0 = 0;
        int stackOut_141_1 = 0;
        pi stackOut_144_0 = null;
        pi stackOut_144_1 = null;
        pi stackOut_156_0 = null;
        pi stackOut_159_0 = null;
        pi stackOut_159_1 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var21 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (param1 < ((uk) this).field_n) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    var3_ref = new uk();
                    var3_ref.field_v = ((uk) this).field_v;
                    var3_ref.field_u = ((uk) this).field_u;
                    var3_ref.field_A = ((uk) this).field_A;
                    var3_ref.field_w = ((uk) this).field_w;
                    var3_ref.field_r = ((uk) this).field_r;
                    var3_ref.field_t = ((uk) this).field_t;
                    var3_ref.field_q = new pi[((uk) this).field_t * ((uk) this).field_A];
                    if (((uk) this).field_A <= ((uk) this).field_t) {
                        statePc = 91;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var4 = ka.a((byte) 53, ((uk) this).field_w * ((uk) this).field_t, tf.field_cb) - -(((uk) this).field_w * (((uk) this).field_A + -((uk) this).field_t) / 2);
                    var5 = -1 + (((uk) this).field_A * ((uk) this).field_w - var4);
                    var6 = ka.a((byte) 117, 1 + 2 * ((uk) this).field_t * ((uk) this).field_w, tf.field_cb) - ((uk) this).field_t * ((uk) this).field_w;
                    var3_ref.field_n = (((uk) this).field_A * ((uk) this).field_w / 2 - var6 / 6) * ((uk) this).field_n / (((uk) this).field_w * ((uk) this).field_A);
                    ((uk) this).field_n = ((uk) this).field_n - var3_ref.field_n;
                    var7 = ((uk) this).field_t * ((uk) this).field_v;
                    var8 = var7 * var7;
                    var9 = 0;
                    var10 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    stackOut_5_0 = ((uk) this).field_t;
                    stackIn_6_0 = stackOut_5_0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (stackIn_6_0 <= var10) {
                        statePc = 90;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var11 = ((uk) this).field_A;
                    var12 = 0;
                    if (var21 != 0) {
                        statePc = 174;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var13 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if ((((uk) this).field_v ^ -1) >= (var13 ^ -1)) {
                        statePc = 19;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var14 = var4 + (var9 * (var5 - var4) / var7 - -((var7 + -var9) * (var9 * var6) / var8));
                    ub.field_d[var13] = var14;
                    var9++;
                    stackOut_10_0 = var11 ^ -1;
                    stackOut_10_1 = var14 / ((uk) this).field_w ^ -1;
                    stackIn_22_0 = stackOut_10_0;
                    stackIn_22_1 = stackOut_10_1;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    if (var21 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (stackIn_11_0 < stackIn_11_1) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var11 = var14 / ((uk) this).field_w;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (((((uk) this).field_w + var14 + -1) / ((uk) this).field_w ^ -1) >= (var12 ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var12 = (var14 - (-((uk) this).field_w + 1)) / ((uk) this).field_w;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    var13++;
                    if (var21 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var11 >= 0) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var11 = 0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    stackOut_21_0 = var12 ^ -1;
                    stackOut_21_1 = ((uk) this).field_A ^ -1;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (stackIn_22_0 >= stackIn_22_1) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var12 = ((uk) this).field_A;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var13 = var10 * ((uk) this).field_A;
                    var14 = 0;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (var11 <= var14) {
                        statePc = 30;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var3_ref.field_q[var13 - -var14] = me.field_J;
                    var14++;
                    if (var21 != 0) {
                        statePc = 31;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (var21 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var14 = var11;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (var12 <= var14) {
                        statePc = 43;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackOut_32_0 = ((uk) this).field_q[var13 - -var14];
                    stackIn_34_0 = stackOut_32_0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var15_ref_pi = stackIn_34_0;
                    if (var21 != 0) {
                        statePc = 44;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (null == var15_ref_pi) {
                        statePc = 42;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (me.field_J != var15_ref_pi) {
                        statePc = 41;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var15_ref_pi = var15_ref_pi.b();
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var3_ref.field_q[var14 + var13] = var15_ref_pi;
                    var14++;
                    if (var21 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var14 = var12;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if ((((uk) this).field_A ^ -1) >= (var14 ^ -1)) {
                        statePc = 49;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var3_ref.field_q[var13 + var14] = ((uk) this).field_q[var14 + var13];
                    ((uk) this).field_q[var14 + var13] = me.field_J;
                    var14++;
                    if (var21 != 0) {
                        statePc = 50;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var21 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var14 = 0;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (((uk) this).field_v <= var14) {
                        statePc = 89;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var15 = ub.field_d[var14];
                    var16 = ((uk) this).field_w * var11;
                    var17 = var11;
                    stackOut_51_0 = 0;
                    stackIn_6_0 = stackOut_51_0;
                    stackIn_52_0 = stackOut_51_0;
                    if (var21 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var18 = stackIn_52_0;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    stackOut_53_0 = var16 ^ -1;
                    stackOut_53_1 = var15 ^ -1;
                    stackIn_54_0 = stackOut_53_0;
                    stackIn_54_1 = stackOut_53_1;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (stackIn_54_0 <= stackIn_54_1) {
                        statePc = 76;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackOut_55_0 = var3_ref.field_q[var10 * ((uk) this).field_A + var17];
                    stackIn_34_0 = stackOut_55_0;
                    stackIn_56_0 = stackOut_55_0;
                    if (var21 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var19_ref_pi = stackIn_56_0;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (var18 >= ((uk) this).field_w) {
                        statePc = 75;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    stackOut_58_0 = var16 ^ -1;
                    stackOut_58_1 = var15 ^ -1;
                    stackIn_54_0 = stackOut_58_0;
                    stackIn_54_1 = stackOut_58_1;
                    stackIn_59_0 = stackOut_58_0;
                    stackIn_59_1 = stackOut_58_1;
                    if (var21 != 0) {
                        statePc = 54;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    stackOut_59_0 = stackIn_59_0;
                    stackOut_59_1 = stackIn_59_1;
                    stackIn_61_0 = stackOut_59_0;
                    stackIn_61_1 = stackOut_59_1;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    if (stackIn_61_0 > stackIn_61_1) {
                        statePc = 65;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (var21 == 0) {
                        statePc = 76;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    stackOut_65_0 = (pi) var19_ref_pi;
                    stackOut_65_1 = me.field_J;
                    stackIn_67_0 = stackOut_65_0;
                    stackIn_67_1 = stackOut_65_1;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if (stackIn_67_0 != stackIn_67_1) {
                        statePc = 69;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (var19_ref_pi == null) {
                        statePc = 72;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var19_ref_pi = new pi(((uk) this).field_w, ((uk) this).field_v, 0);
                    an.a(var19_ref_pi.field_k, 0, ((uk) this).field_w * ((uk) this).field_v, (byte) 1);
                    var3_ref.field_q[var17 + ((uk) this).field_A * var10] = var19_ref_pi;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    var19_ref_pi.field_k[var18 + var14 * ((uk) this).field_w] = (byte) 0;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    var16++;
                    var18++;
                    if (var21 == 0) {
                        statePc = 57;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var17++;
                    var18 = 0;
                    if (var21 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if ((var17 ^ -1) <= (var12 ^ -1)) {
                        statePc = 88;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    stackOut_77_0 = ((uk) this).field_q[var17 + ((uk) this).field_A * var10];
                    stackIn_34_0 = stackOut_77_0;
                    stackIn_78_0 = stackOut_77_0;
                    if (var21 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var19_ref_pi = stackIn_78_0;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    if (((uk) this).field_w <= var18) {
                        statePc = 87;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    stackOut_80_0 = me.field_J;
                    stackOut_80_1 = (pi) var19_ref_pi;
                    stackIn_67_0 = stackOut_80_0;
                    stackIn_67_1 = stackOut_80_1;
                    stackIn_81_0 = stackOut_80_0;
                    stackIn_81_1 = stackOut_80_1;
                    if (var21 != 0) {
                        statePc = 67;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (stackIn_81_0 != stackIn_81_1) {
                        statePc = 83;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (var19_ref_pi != null) {
                        statePc = 85;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var19_ref_pi = new pi(((uk) this).field_w, ((uk) this).field_v, 0);
                    an.a(var19_ref_pi.field_k, 0, ((uk) this).field_w * ((uk) this).field_v, (byte) 1);
                    ((uk) this).field_q[((uk) this).field_A * var10 + var17] = var19_ref_pi;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    var19_ref_pi.field_k[var14 * ((uk) this).field_w + var18] = (byte) 0;
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    var18++;
                    var16++;
                    if (var21 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var17++;
                    var18 = 0;
                    if (var21 == 0) {
                        statePc = 76;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var14++;
                    if (var21 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var10++;
                    if (var21 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (var21 == 0) {
                        statePc = 171;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var4 = ka.a((byte) 51, ((uk) this).field_A * ((uk) this).field_v, tf.field_cb) + ((uk) this).field_v * (((uk) this).field_t - ((uk) this).field_A) / 2;
                    var5 = ((uk) this).field_v * ((uk) this).field_t - 1 + -var4;
                    var6 = ka.a((byte) 56, ((uk) this).field_A * (((uk) this).field_v * 2) - -1, tf.field_cb) + -(((uk) this).field_v * ((uk) this).field_A);
                    var3_ref.field_n = (-(var6 / 6) + ((uk) this).field_t * ((uk) this).field_v / 2) * ((uk) this).field_n / (((uk) this).field_t * ((uk) this).field_v);
                    ((uk) this).field_n = ((uk) this).field_n - var3_ref.field_n;
                    var7 = ((uk) this).field_A * ((uk) this).field_w;
                    var8 = var7 * var7;
                    var9 = 0;
                    var10 = 0;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    stackOut_92_0 = ((uk) this).field_A ^ -1;
                    stackIn_93_0 = stackOut_92_0;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    if (stackIn_93_0 >= (var10 ^ -1)) {
                        statePc = 171;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var11 = ((uk) this).field_t;
                    var12 = 0;
                    if (var21 != 0) {
                        statePc = 174;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var13 = 0;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    if ((((uk) this).field_w ^ -1) >= (var13 ^ -1)) {
                        statePc = 105;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var14 = var4 - (-(var9 * (-var4 + var5) / var7) - var9 * var6 * (var7 - var9) / var8);
                    ub.field_d[var13] = var14;
                    stackOut_97_0 = var11;
                    stackOut_97_1 = var14 / ((uk) this).field_v;
                    stackIn_106_0 = stackOut_97_0;
                    stackIn_106_1 = stackOut_97_1;
                    stackIn_98_0 = stackOut_97_0;
                    stackIn_98_1 = stackOut_97_1;
                    if (var21 != 0) {
                        statePc = 106;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (stackIn_98_0 <= stackIn_98_1) {
                        statePc = 102;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    var11 = var14 / ((uk) this).field_v;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    var9++;
                    if (((((uk) this).field_v + var14 - 1) / ((uk) this).field_v ^ -1) >= (var12 ^ -1)) {
                        statePc = 104;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    var12 = (-1 + ((uk) this).field_v + var14) / ((uk) this).field_v;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    var13++;
                    if (var21 == 0) {
                        statePc = 96;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    stackOut_105_0 = var12 ^ -1;
                    stackOut_105_1 = ((uk) this).field_t ^ -1;
                    stackIn_106_0 = stackOut_105_0;
                    stackIn_106_1 = stackOut_105_1;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    if (stackIn_106_0 >= stackIn_106_1) {
                        statePc = 108;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    var12 = ((uk) this).field_t;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    if (var11 >= 0) {
                        statePc = 110;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    var11 = 0;
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    var13 = var10;
                    var14 = ((uk) this).field_A * var11;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    if (var13 >= var14) {
                        statePc = 116;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var3_ref.field_q[var13] = me.field_J;
                    var13 = var13 + ((uk) this).field_A;
                    if (var21 != 0) {
                        statePc = 117;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    if (var21 == 0) {
                        statePc = 111;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    var14 = ((uk) this).field_A * var12;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    if (var13 >= var14) {
                        statePc = 127;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    stackOut_118_0 = ((uk) this).field_q[var13];
                    stackIn_120_0 = stackOut_118_0;
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    var15_ref_pi = stackIn_120_0;
                    if (var21 != 0) {
                        statePc = 128;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if (var15_ref_pi == null) {
                        statePc = 126;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if (me.field_J == var15_ref_pi) {
                        statePc = 126;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    var15_ref_pi = var15_ref_pi.b();
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    var3_ref.field_q[var13] = var15_ref_pi;
                    var13 = var13 + ((uk) this).field_A;
                    if (var21 == 0) {
                        statePc = 117;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var14 = ((uk) this).field_A * ((uk) this).field_t;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    if ((var14 ^ -1) >= (var13 ^ -1)) {
                        statePc = 131;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var3_ref.field_q[var13] = ((uk) this).field_q[var13];
                    ((uk) this).field_q[var13] = me.field_J;
                    var13 = var13 + ((uk) this).field_A;
                    if (var21 != 0) {
                        statePc = 92;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    if (var21 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    var15 = 0;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    if ((var15 ^ -1) <= (((uk) this).field_w ^ -1)) {
                        statePc = 170;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var16 = ub.field_d[var15];
                    var17 = var11 * ((uk) this).field_v;
                    var18 = var11;
                    stackOut_133_0 = 0;
                    stackIn_93_0 = stackOut_133_0;
                    stackIn_134_0 = stackOut_133_0;
                    if (var21 != 0) {
                        statePc = 93;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    var19 = stackIn_134_0;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    stackOut_135_0 = var17;
                    stackOut_135_1 = var16;
                    stackIn_136_0 = stackOut_135_0;
                    stackIn_136_1 = stackOut_135_1;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    if (stackIn_136_0 >= stackIn_136_1) {
                        statePc = 155;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    stackOut_137_0 = var3_ref.field_q[((uk) this).field_A * var18 + var10];
                    stackIn_120_0 = stackOut_137_0;
                    stackIn_138_0 = stackOut_137_0;
                    if (var21 != 0) {
                        statePc = 120;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var20 = stackIn_138_0;
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    if ((((uk) this).field_v ^ -1) >= (var19 ^ -1)) {
                        statePc = 154;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    stackOut_140_0 = var16;
                    stackOut_140_1 = var17;
                    stackIn_136_0 = stackOut_140_0;
                    stackIn_136_1 = stackOut_140_1;
                    stackIn_141_0 = stackOut_140_0;
                    stackIn_141_1 = stackOut_140_1;
                    if (var21 != 0) {
                        statePc = 136;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    stackOut_141_0 = stackIn_141_0;
                    stackOut_141_1 = stackIn_141_1;
                    stackIn_143_0 = stackOut_141_0;
                    stackIn_143_1 = stackOut_141_1;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if (stackIn_143_0 <= stackIn_143_1) {
                        statePc = 155;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    stackOut_144_0 = me.field_J;
                    stackOut_144_1 = (pi) var20;
                    stackIn_146_0 = stackOut_144_0;
                    stackIn_146_1 = stackOut_144_1;
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    if (stackIn_146_0 != stackIn_146_1) {
                        statePc = 148;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 148: {
                    if (null == var20) {
                        statePc = 151;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 151: {
                    var20 = new pi(((uk) this).field_w, ((uk) this).field_v, 0);
                    an.a(var20.field_k, 0, ((uk) this).field_w * ((uk) this).field_v, (byte) 1);
                    var3_ref.field_q[((uk) this).field_A * var18 + var10] = var20;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    var20.field_k[var19 * ((uk) this).field_w - -var15] = (byte) 0;
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    var19++;
                    var17++;
                    if (var21 == 0) {
                        statePc = 139;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    var18++;
                    var19 = 0;
                    if (var21 == 0) {
                        statePc = 135;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if ((var12 ^ -1) >= (var18 ^ -1)) {
                        statePc = 169;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    stackOut_156_0 = ((uk) this).field_q[var10 + ((uk) this).field_A * var18];
                    stackIn_120_0 = stackOut_156_0;
                    stackIn_157_0 = stackOut_156_0;
                    if (var21 != 0) {
                        statePc = 120;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var20 = stackIn_157_0;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    if ((((uk) this).field_v ^ -1) >= (var19 ^ -1)) {
                        statePc = 168;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    stackOut_159_0 = (pi) var20;
                    stackOut_159_1 = me.field_J;
                    stackIn_146_0 = stackOut_159_0;
                    stackIn_146_1 = stackOut_159_1;
                    stackIn_160_0 = stackOut_159_0;
                    stackIn_160_1 = stackOut_159_1;
                    if (var21 != 0) {
                        statePc = 146;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    if (stackIn_160_0 != stackIn_160_1) {
                        statePc = 162;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 162: {
                    if (null == var20) {
                        statePc = 165;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 165: {
                    var20 = new pi(((uk) this).field_w, ((uk) this).field_v, 0);
                    an.a(var20.field_k, 0, ((uk) this).field_w * ((uk) this).field_v, (byte) 1);
                    ((uk) this).field_q[var10 + var18 * ((uk) this).field_A] = var20;
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    var20.field_k[var15 + ((uk) this).field_w * var19] = (byte) 0;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    var17++;
                    var19++;
                    if (var21 == 0) {
                        statePc = 158;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    var18++;
                    var19 = 0;
                    if (var21 == 0) {
                        statePc = 155;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    var15++;
                    if (var21 == 0) {
                        statePc = 132;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    var10++;
                    if (var21 == 0) {
                        statePc = 92;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    this.d((byte) 116);
                    var3_ref.d((byte) -110);
                    var3_ref.field_b = ((uk) this).field_b;
                    var3_ref.field_a = (bh) this;
                    var3_ref.field_a.field_b = (bh) (Object) var3_ref;
                    var3_ref.field_b.field_a = (bh) (Object) var3_ref;
                    ((uk) this).b(11976, param1);
                    var3_ref.b(param0, param1);
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean c(byte param0) {
        RuntimeException var1 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            if (param0 == -17) {
              break L0;
            } else {
              boolean discarded$2 = uk.c((byte) 22);
              break L0;
            }
          }
          L1: {
            if (pa.field_V != ka.field_P) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_4_0 = 1;
              stackIn_7_0 = stackOut_4_0;
              break L1;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "uk.D(" + param0 + 41);
        }
        return stackIn_7_0 != 0;
    }

    public static void c(int param0) {
        field_x = null;
        field_z = null;
        field_s = null;
        field_y = null;
        if (param0 <= 122) {
            return;
        }
        try {
            field_p = null;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "uk.B(" + param0 + 41);
        }
    }

    final static boolean a(int param0) {
        RuntimeException var1 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            if (param0 == -22802) {
              break L0;
            } else {
              field_y = null;
              break L0;
            }
          }
          L1: {
            L2: {
              if (u.field_i == null) {
                break L2;
              } else {
                if (u.field_i.g((byte) -104) == null) {
                  break L2;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_10_0 = stackOut_7_0;
                  break L1;
                }
              }
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "uk.E(" + param0 + 41);
        }
        return stackIn_10_0 != 0;
    }

    private final void d(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        pi[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_4_0 = 0;
        Object stackIn_7_0 = null;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        pi stackIn_24_0 = null;
        pi stackIn_24_1 = null;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        pi stackIn_39_0 = null;
        pi stackIn_39_1 = null;
        int stackIn_50_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_54_0 = 0;
        pi stackIn_59_0 = null;
        pi stackIn_59_1 = null;
        int stackIn_69_0 = 0;
        Object stackIn_72_0 = null;
        int stackOut_3_0 = 0;
        Object stackOut_6_0 = null;
        int stackOut_17_0 = 0;
        int stackOut_20_0 = 0;
        pi stackOut_23_0 = null;
        pi stackOut_23_1 = null;
        int stackOut_31_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_34_0 = 0;
        pi stackOut_38_0 = null;
        pi stackOut_38_1 = null;
        int stackOut_49_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_52_0 = 0;
        pi stackOut_57_0 = null;
        pi stackOut_57_1 = null;
        int stackOut_68_0 = 0;
        Object stackOut_70_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        var3 = ((uk) this).field_A;
                        var4 = 0;
                        var5 = ((uk) this).field_t;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 >= var5) {
                            statePc = 17;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5--;
                        stackOut_3_0 = var2_int;
                        stackIn_18_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var12 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6 = stackIn_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var6 ^ -1) <= (var3 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = this;
                        stackIn_72_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var12 != 0) {
                            statePc = 72;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (((uk) this).field_q[var5 * ((uk) this).field_A + var6] == me.field_J) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5++;
                        if (var12 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6++;
                        if (var12 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var12 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = 32 / ((-48 - param0) / 43);
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var6 = stackIn_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var5 ^ -1) >= (var4 ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = var2_int;
                        stackIn_32_0 = stackOut_20_0;
                        stackIn_21_0 = stackOut_20_0;
                        if (var12 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var7 = stackIn_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if ((var7 ^ -1) <= (var3 ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = me.field_J;
                        stackOut_23_1 = ((uk) this).field_q[var4 * ((uk) this).field_A + var7];
                        stackIn_59_0 = stackOut_23_0;
                        stackIn_59_1 = stackOut_23_1;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        if (var12 != 0) {
                            statePc = 59;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0 != stackIn_24_1) {
                            statePc = 31;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var7++;
                        if (var12 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var4++;
                        if (var12 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackOut_31_0 = var3 ^ -1;
                        stackIn_32_0 = stackOut_31_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (stackIn_32_0 >= (var2_int ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var3--;
                        stackOut_33_0 = var4;
                        stackIn_50_0 = stackOut_33_0;
                        stackIn_34_0 = stackOut_33_0;
                        if (var12 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = stackIn_34_0;
                        stackIn_36_0 = stackOut_34_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var7 = stackIn_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var7 >= var5) {
                            statePc = 48;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = ((uk) this).field_q[var3 + ((uk) this).field_A * var7];
                        stackOut_38_1 = me.field_J;
                        stackIn_59_0 = stackOut_38_0;
                        stackIn_59_1 = stackOut_38_1;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        if (var12 != 0) {
                            statePc = 59;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 == stackIn_39_1) {
                            statePc = 45;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var3++;
                        if (var12 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var7++;
                        if (var12 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var12 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = var2_int ^ -1;
                        stackIn_50_0 = stackOut_49_0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (stackIn_50_0 <= (var3 ^ -1)) {
                            statePc = 68;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = var4;
                        stackIn_69_0 = stackOut_51_0;
                        stackIn_52_0 = stackOut_51_0;
                        if (var12 != 0) {
                            statePc = 69;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackOut_52_0 = stackIn_52_0;
                        stackIn_54_0 = stackOut_52_0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var7 = stackIn_54_0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var7 >= var5) {
                            statePc = 66;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var12 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = me.field_J;
                        stackOut_57_1 = ((uk) this).field_q[var2_int + ((uk) this).field_A * var7];
                        stackIn_59_0 = stackOut_57_0;
                        stackIn_59_1 = stackOut_57_1;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (stackIn_59_0 == stackIn_59_1) {
                            statePc = 63;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var12 == 0) {
                            statePc = 68;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var7++;
                        if (var12 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var2_int++;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var12 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackOut_68_0 = 0;
                        stackIn_69_0 = stackOut_68_0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (stackIn_69_0 < var2_int) {
                            statePc = 79;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackOut_70_0 = this;
                        stackIn_72_0 = stackOut_70_0;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if ((((uk) this).field_A ^ -1) < (var3 ^ -1)) {
                            statePc = 79;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (0 < var4) {
                            statePc = 79;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if ((((uk) this).field_t ^ -1) >= (var5 ^ -1)) {
                            statePc = 94;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var7 = var3 - var2_int;
                        var8 = -var4 + var5;
                        var9 = new pi[var7 * var8];
                        var10 = 0;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if ((var8 ^ -1) >= (var10 ^ -1)) {
                            statePc = 90;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (var12 != 0) {
                            statePc = 91;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var11 = 0;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if ((var7 ^ -1) >= (var11 ^ -1)) {
                            statePc = 88;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var9[var11 + var10 * var7] = ((uk) this).field_q[(var10 + var4) * ((uk) this).field_A - (-var2_int + -var11)];
                        var11++;
                        if (var12 != 0) {
                            statePc = 89;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (var12 == 0) {
                            statePc = 83;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var10++;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (var12 == 0) {
                            statePc = 80;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        ((uk) this).field_u = ((uk) this).field_u + var4;
                        ((uk) this).field_A = var7;
                        ((uk) this).field_t = var8;
                        ((uk) this).field_r = ((uk) this).field_r + var2_int;
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
                        ((uk) this).field_q = var9;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 93: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw dh.a((Throwable) (Object) var2, "uk.C(" + param0 + 41);
                }
                case 94: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    uk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        long stackIn_6_0 = 0L;
        long stackOut_5_0 = 0L;
        long stackOut_3_0 = 0L;
        field_p = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_z = new int[8192];
        field_x = new long[11];
        field_s = new long[8][256];
        var0 = 0;
        L0: while (true) {
          if (256 <= var0) {
            field_x[0] = 0L;
            var0 = 1;
            L1: while (true) {
              if (10 < var0) {
                field_y = "Passwords can only contain letters and numbers";
              } else {
                var1 = (-1 + var0) * 8;
                field_x[var0] = pj.a(jg.a(255L, field_s[7][7 + var1]), pj.a(pj.a(pj.a(pj.a(pj.a(pj.a(jg.a(field_s[1][var1 - -1], 71776119061217280L), jg.a(field_s[0][var1], -72057594037927936L)), jg.a(field_s[2][2 + var1], 280375465082880L)), jg.a(1095216660480L, field_s[3][var1 - -3])), jg.a(4278190080L, field_s[4][var1 - -4])), jg.a(16711680L, field_s[5][var1 - -5])), jg.a(65280L, field_s[6][var1 - -6])));
                var0++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦���䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬���贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀���﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓���鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if (0 != (1 & var0)) {
                stackOut_5_0 = (long)(var1 & 255);
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(var1 >>> 1748502536);
                stackIn_6_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_6_0;
              var4 = var2 << -1739026111;
              if ((var4 ^ -1L) <= -257L) {
                var4 = var4 ^ 285L;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var6 = var4 << -2116044543;
              if ((var6 ^ -1L) > -257L) {
                break L4;
              } else {
                var6 = var6 ^ 285L;
                break L4;
              }
            }
            L5: {
              var8 = var2 ^ var6;
              var10 = var6 << -1833427391;
              if (-257L < (var10 ^ -1L)) {
                break L5;
              } else {
                var10 = var10 ^ 285L;
                break L5;
              }
            }
            var12 = var10 ^ var2;
            field_s[0][var0] = jj.a(jj.a(jj.a(var8 << -536369200, jj.a(var10 << 1383493720, jj.a(jj.a(var6 << -473011736, jj.a(var2 << 962775152, var2 << 851384312)), var2 << -1186783072))), var4 << -1696148856), var12);
            var14 = 1;
            L6: while (true) {
              if (-9 >= (var14 ^ -1)) {
                var0++;
                continue L0;
              } else {
                field_s[var14][var0] = jj.a(field_s[var14 + -1][var0] >>> 225008840, field_s[var14 + -1][var0] << 538906104);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
