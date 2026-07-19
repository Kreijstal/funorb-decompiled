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
        uk var22 = null;
        pi var23 = null;
        pi var24 = null;
        pi var25 = null;
        pi var26 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        pi stackIn_30_0 = null;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        pi stackIn_51_0 = null;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        pi stackIn_58_0 = null;
        pi stackIn_58_1 = null;
        pi stackIn_69_0 = null;
        pi stackIn_72_0 = null;
        pi stackIn_72_1 = null;
        int stackIn_84_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        pi stackIn_108_0 = null;
        int stackIn_122_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        pi stackIn_126_0 = null;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        pi stackIn_131_0 = null;
        pi stackIn_131_1 = null;
        pi stackIn_142_0 = null;
        pi stackIn_145_0 = null;
        pi stackIn_145_1 = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        pi stackOut_50_0 = null;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        pi stackOut_57_0 = null;
        pi stackOut_57_1 = null;
        pi stackOut_68_0 = null;
        pi stackOut_71_0 = null;
        pi stackOut_71_1 = null;
        int stackOut_83_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
        int stackOut_121_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_123_1 = 0;
        pi stackOut_125_0 = null;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        pi stackOut_130_0 = null;
        pi stackOut_130_1 = null;
        pi stackOut_141_0 = null;
        pi stackOut_144_0 = null;
        pi stackOut_144_1 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var21 = client.field_A ? 1 : 0;
                    if (param1 < this.field_n) {
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
                    var22 = new uk();
                    var22.field_v = this.field_v;
                    var22.field_u = this.field_u;
                    var22.field_A = this.field_A;
                    var22.field_w = this.field_w;
                    var22.field_r = this.field_r;
                    var22.field_t = this.field_t;
                    var22.field_q = new pi[this.field_t * this.field_A];
                    if (this.field_A <= this.field_t) {
                        statePc = 82;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var4 = ka.a((byte) 53, this.field_w * this.field_t, tf.field_cb) - -(this.field_w * (this.field_A + -this.field_t) / 2);
                    var5 = -1 + (this.field_A * this.field_w - var4);
                    var6 = ka.a((byte) 117, 1 + 2 * this.field_t * this.field_w, tf.field_cb) - this.field_t * this.field_w;
                    var22.field_n = (this.field_A * this.field_w / 2 - var6 / 6) * this.field_n / (this.field_w * this.field_A);
                    this.field_n = this.field_n - var22.field_n;
                    var7 = this.field_t * this.field_v;
                    var8 = var7 * var7;
                    var9 = 0;
                    var10 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    stackOut_4_0 = this.field_t;
                    stackIn_5_0 = stackOut_4_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (stackIn_5_0 <= var10) {
                        statePc = 81;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var11 = this.field_A;
                    var12 = 0;
                    if (var21 != 0) {
                        statePc = 157;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var13 = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if ((this.field_v ^ -1) >= (var13 ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var14 = var4 + (var9 * (var5 - var4) / var7 - -((var7 + -var9) * (var9 * var6) / var8));
                    ub.field_d[var13] = var14;
                    var9++;
                    stackOut_9_0 = var11 ^ -1;
                    stackOut_9_1 = var14 / this.field_w ^ -1;
                    stackIn_19_0 = stackOut_9_0;
                    stackIn_19_1 = stackOut_9_1;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    if (var21 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (stackIn_10_0 < stackIn_10_1) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var11 = var14 / this.field_w;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (((this.field_w + var14 + -1) / this.field_w ^ -1) >= (var12 ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var12 = (var14 - (-this.field_w + 1)) / this.field_w;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var13++;
                    if (var21 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var11 >= 0) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var11 = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    stackOut_18_0 = var12 ^ -1;
                    stackOut_18_1 = this.field_A ^ -1;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (stackIn_19_0 >= stackIn_19_1) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var12 = this.field_A;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    var13 = var10 * this.field_A;
                    var14 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (var11 <= var14) {
                        statePc = 26;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var22.field_q[var13 - -var14] = me.field_J;
                    var14++;
                    if (var21 != 0) {
                        statePc = 28;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (var21 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var14 = var11;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (var12 <= var14) {
                        statePc = 37;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var15_ref_pi = this.field_q[var13 - -var14];
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    var15_ref_pi = stackIn_30_0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (var21 != 0) {
                        statePc = 39;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (var15_ref_pi == null) {
                        statePc = 36;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (me.field_J != var15_ref_pi) {
                        statePc = 35;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var15_ref_pi = var15_ref_pi.b();
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    var22.field_q[var14 + var13] = var15_ref_pi;
                    var14++;
                    if (var21 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var14 = var12;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if ((this.field_A ^ -1) >= (var14 ^ -1)) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var22.field_q[var13 + var14] = this.field_q[var14 + var13];
                    this.field_q[var14 + var13] = me.field_J;
                    var14++;
                    if (var21 != 0) {
                        statePc = 45;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (var21 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var14 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (this.field_v <= var14) {
                        statePc = 80;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var15 = ub.field_d[var14];
                    var16 = this.field_w * var11;
                    var17 = var11;
                    stackOut_46_0 = 0;
                    stackIn_5_0 = stackOut_46_0;
                    stackIn_47_0 = stackOut_46_0;
                    if (var21 != 0) {
                        statePc = 5;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var18 = stackIn_47_0;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    stackOut_48_0 = var16 ^ -1;
                    stackOut_48_1 = var15 ^ -1;
                    stackIn_49_0 = stackOut_48_0;
                    stackIn_49_1 = stackOut_48_1;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (stackIn_49_0 <= stackIn_49_1) {
                        statePc = 67;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    stackOut_50_0 = var22.field_q[var10 * this.field_A + var17];
                    stackIn_30_0 = stackOut_50_0;
                    stackIn_51_0 = stackOut_50_0;
                    if (var21 != 0) {
                        statePc = 30;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var19_ref_pi = stackIn_51_0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (var18 >= this.field_w) {
                        statePc = 65;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    stackOut_53_0 = var16 ^ -1;
                    stackOut_53_1 = var15 ^ -1;
                    stackIn_49_0 = stackOut_53_0;
                    stackIn_49_1 = stackOut_53_1;
                    stackIn_54_0 = stackOut_53_0;
                    stackIn_54_1 = stackOut_53_1;
                    if (var21 != 0) {
                        statePc = 49;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (stackIn_54_0 > stackIn_54_1) {
                        statePc = 57;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (var21 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    stackOut_57_0 = (pi) (var19_ref_pi);
                    stackOut_57_1 = me.field_J;
                    stackIn_58_0 = stackOut_57_0;
                    stackIn_58_1 = stackOut_57_1;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    if (stackIn_58_0 != stackIn_58_1) {
                        statePc = 60;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (var19_ref_pi == null) {
                        statePc = 62;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var23 = new pi(this.field_w, this.field_v, 0);
                    var19_ref_pi = var23;
                    an.a(var23.field_k, 0, this.field_w * this.field_v, (byte) 1);
                    var22.field_q[var17 + this.field_A * var10] = var23;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    var19_ref_pi.field_k[var18 + var14 * this.field_w] = (byte) 0;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    var16++;
                    var18++;
                    if (var21 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var17++;
                    var18 = 0;
                    if (var21 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if ((var17 ^ -1) <= (var12 ^ -1)) {
                        statePc = 79;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    stackOut_68_0 = this.field_q[var17 + this.field_A * var10];
                    stackIn_30_0 = stackOut_68_0;
                    stackIn_69_0 = stackOut_68_0;
                    if (var21 != 0) {
                        statePc = 30;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var19_ref_pi = stackIn_69_0;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    if (this.field_w <= var18) {
                        statePc = 78;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    stackOut_71_0 = me.field_J;
                    stackOut_71_1 = (pi) (var19_ref_pi);
                    stackIn_58_0 = stackOut_71_0;
                    stackIn_58_1 = stackOut_71_1;
                    stackIn_72_0 = stackOut_71_0;
                    stackIn_72_1 = stackOut_71_1;
                    if (var21 != 0) {
                        statePc = 58;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (stackIn_72_0 != stackIn_72_1) {
                        statePc = 74;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (var19_ref_pi != null) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var24 = new pi(this.field_w, this.field_v, 0);
                    var19_ref_pi = var24;
                    an.a(var24.field_k, 0, this.field_w * this.field_v, (byte) 1);
                    this.field_q[this.field_A * var10 + var17] = var24;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    var19_ref_pi.field_k[var14 * this.field_w + var18] = (byte) 0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    var18++;
                    var16++;
                    if (var21 == 0) {
                        statePc = 70;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var17++;
                    var18 = 0;
                    if (var21 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var14++;
                    if (var21 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var10++;
                    if (var21 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (var21 == 0) {
                        statePc = 155;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var4 = ka.a((byte) 51, this.field_A * this.field_v, tf.field_cb) + this.field_v * (this.field_t - this.field_A) / 2;
                    var5 = this.field_v * this.field_t - 1 + -var4;
                    var6 = ka.a((byte) 56, this.field_A * (this.field_v * 2) - -1, tf.field_cb) + -(this.field_v * this.field_A);
                    var22.field_n = (-(var6 / 6) + this.field_t * this.field_v / 2) * this.field_n / (this.field_t * this.field_v);
                    this.field_n = this.field_n - var22.field_n;
                    var7 = this.field_A * this.field_w;
                    var8 = var7 * var7;
                    var9 = 0;
                    var10 = 0;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    stackOut_83_0 = this.field_A ^ -1;
                    stackIn_84_0 = stackOut_83_0;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (stackIn_84_0 >= (var10 ^ -1)) {
                        statePc = 155;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var11 = this.field_t;
                    var12 = 0;
                    if (var21 != 0) {
                        statePc = 157;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var13 = 0;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if ((this.field_w ^ -1) >= (var13 ^ -1)) {
                        statePc = 94;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var14 = var4 - (-(var9 * (-var4 + var5) / var7) - var9 * var6 * (var7 - var9) / var8);
                    ub.field_d[var13] = var14;
                    stackOut_88_0 = var11;
                    stackOut_88_1 = var14 / this.field_v;
                    stackIn_95_0 = stackOut_88_0;
                    stackIn_95_1 = stackOut_88_1;
                    stackIn_89_0 = stackOut_88_0;
                    stackIn_89_1 = stackOut_88_1;
                    if (var21 != 0) {
                        statePc = 95;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (stackIn_89_0 <= stackIn_89_1) {
                        statePc = 91;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var11 = var14 / this.field_v;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    var9++;
                    if (((this.field_v + var14 - 1) / this.field_v ^ -1) >= (var12 ^ -1)) {
                        statePc = 93;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var12 = (-1 + this.field_v + var14) / this.field_v;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    var13++;
                    if (var21 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    stackOut_94_0 = var12 ^ -1;
                    stackOut_94_1 = this.field_t ^ -1;
                    stackIn_95_0 = stackOut_94_0;
                    stackIn_95_1 = stackOut_94_1;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    if (stackIn_95_0 >= stackIn_95_1) {
                        statePc = 97;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    var12 = this.field_t;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    if (var11 >= 0) {
                        statePc = 99;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var11 = 0;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    var13 = var10;
                    var14 = this.field_A * var11;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    if (var13 >= var14) {
                        statePc = 104;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    var22.field_q[var13] = me.field_J;
                    var13 = var13 + this.field_A;
                    if (var21 != 0) {
                        statePc = 106;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (var21 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var14 = this.field_A * var12;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    if (var13 >= var14) {
                        statePc = 114;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    var15_ref_pi = this.field_q[var13];
                    statePc = 109;
                    continue stateLoop;
                }
                case 108: {
                    var15_ref_pi = stackIn_108_0;
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    if (var21 != 0) {
                        statePc = 116;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if (var15_ref_pi == null) {
                        statePc = 113;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if (me.field_J == var15_ref_pi) {
                        statePc = 113;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var15_ref_pi = var15_ref_pi.b();
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    var22.field_q[var13] = var15_ref_pi;
                    var13 = var13 + this.field_A;
                    if (var21 == 0) {
                        statePc = 106;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    var14 = this.field_A * this.field_t;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    if ((var14 ^ -1) >= (var13 ^ -1)) {
                        statePc = 119;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    var22.field_q[var13] = this.field_q[var13];
                    this.field_q[var13] = me.field_J;
                    var13 = var13 + this.field_A;
                    if (var21 != 0) {
                        statePc = 83;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if (var21 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    var15 = 0;
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    if ((var15 ^ -1) <= (this.field_w ^ -1)) {
                        statePc = 154;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    var16 = ub.field_d[var15];
                    var17 = var11 * this.field_v;
                    var18 = var11;
                    stackOut_121_0 = 0;
                    stackIn_84_0 = stackOut_121_0;
                    stackIn_122_0 = stackOut_121_0;
                    if (var21 != 0) {
                        statePc = 84;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var19 = stackIn_122_0;
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    stackOut_123_0 = var17;
                    stackOut_123_1 = var16;
                    stackIn_124_0 = stackOut_123_0;
                    stackIn_124_1 = stackOut_123_1;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    if (stackIn_124_0 >= stackIn_124_1) {
                        statePc = 140;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    stackOut_125_0 = var22.field_q[this.field_A * var18 + var10];
                    stackIn_108_0 = stackOut_125_0;
                    stackIn_126_0 = stackOut_125_0;
                    if (var21 != 0) {
                        statePc = 108;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    var20 = stackIn_126_0;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    if ((this.field_v ^ -1) >= (var19 ^ -1)) {
                        statePc = 138;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    stackOut_128_0 = var16;
                    stackOut_128_1 = var17;
                    stackIn_124_0 = stackOut_128_0;
                    stackIn_124_1 = stackOut_128_1;
                    stackIn_129_0 = stackOut_128_0;
                    stackIn_129_1 = stackOut_128_1;
                    if (var21 != 0) {
                        statePc = 124;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if (stackIn_129_0 <= stackIn_129_1) {
                        statePc = 140;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    stackOut_130_0 = me.field_J;
                    stackOut_130_1 = (pi) (var20);
                    stackIn_131_0 = stackOut_130_0;
                    stackIn_131_1 = stackOut_130_1;
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    if (stackIn_131_0 != stackIn_131_1) {
                        statePc = 133;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 133: {
                    if (var20 == null) {
                        statePc = 135;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 135: {
                    var25 = new pi(this.field_w, this.field_v, 0);
                    var20 = var25;
                    an.a(var25.field_k, 0, this.field_w * this.field_v, (byte) 1);
                    var22.field_q[this.field_A * var18 + var10] = var25;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    var20.field_k[var19 * this.field_w - -var15] = (byte) 0;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    var19++;
                    var17++;
                    if (var21 == 0) {
                        statePc = 127;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var18++;
                    var19 = 0;
                    if (var21 == 0) {
                        statePc = 123;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    if ((var12 ^ -1) >= (var18 ^ -1)) {
                        statePc = 153;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    stackOut_141_0 = this.field_q[var10 + this.field_A * var18];
                    stackIn_108_0 = stackOut_141_0;
                    stackIn_142_0 = stackOut_141_0;
                    if (var21 != 0) {
                        statePc = 108;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var20 = stackIn_142_0;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if ((this.field_v ^ -1) >= (var19 ^ -1)) {
                        statePc = 152;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    stackOut_144_0 = (pi) (var20);
                    stackOut_144_1 = me.field_J;
                    stackIn_131_0 = stackOut_144_0;
                    stackIn_131_1 = stackOut_144_1;
                    stackIn_145_0 = stackOut_144_0;
                    stackIn_145_1 = stackOut_144_1;
                    if (var21 != 0) {
                        statePc = 131;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (stackIn_145_0 != stackIn_145_1) {
                        statePc = 147;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if (var20 == null) {
                        statePc = 149;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 149: {
                    var26 = new pi(this.field_w, this.field_v, 0);
                    var20 = var26;
                    an.a(var26.field_k, 0, this.field_w * this.field_v, (byte) 1);
                    this.field_q[var10 + var18 * this.field_A] = var26;
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    var20.field_k[var15 + this.field_w * var19] = (byte) 0;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    var17++;
                    var19++;
                    if (var21 == 0) {
                        statePc = 143;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    var18++;
                    var19 = 0;
                    if (var21 == 0) {
                        statePc = 140;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    var15++;
                    if (var21 == 0) {
                        statePc = 120;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    var10++;
                    if (var21 == 0) {
                        statePc = 83;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    this.d((byte) 116);
                    var22.d((byte) -110);
                    var22.field_b = this.field_b;
                    var22.field_a = (bh) (this);
                    var22.field_a.field_b = (bh) ((Object) var22);
                    var22.field_b.field_a = (bh) ((Object) var22);
                    this.b(11976, param1);
                    var22.b(param0, param1);
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean c(byte param0) {
        boolean discarded$0 = false;
        if (param0 != -17) {
            discarded$0 = uk.c((byte) 22);
        }
        return pa.field_V == ka.field_P ? true : false;
    }

    public static void c(int param0) {
        field_x = null;
        field_z = null;
        field_s = (long[][]) null;
        field_y = null;
        if (param0 <= 122) {
            return;
        }
        field_p = null;
    }

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -22802) {
            break L0;
          } else {
            field_y = (String) null;
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
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final void d(byte param0) {
        int var2 = 0;
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
        int stackIn_3_0 = 0;
        Object stackIn_6_0 = null;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        pi stackIn_19_0 = null;
        pi stackIn_19_1 = null;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        pi stackIn_30_0 = null;
        pi stackIn_30_1 = null;
        int stackIn_39_0 = 0;
        pi stackIn_43_0 = null;
        pi stackIn_43_1 = null;
        int stackIn_51_0 = 0;
        Object stackIn_53_0 = null;
        pi stackIn_76_0 = null;
        pi stackIn_76_1 = null;
        int stackIn_86_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_89_0 = 0;
        pi stackIn_98_0 = null;
        pi stackIn_98_1 = null;
        int stackIn_108_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        pi stackIn_120_0 = null;
        pi stackIn_120_1 = null;
        pi stackIn_123_0 = null;
        pi stackIn_123_1 = null;
        int stackIn_128_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_131_0 = 0;
        int stackOut_2_0 = 0;
        Object stackOut_5_0 = null;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        pi stackOut_18_0 = null;
        pi stackOut_18_1 = null;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        pi stackOut_29_0 = null;
        pi stackOut_29_1 = null;
        int stackOut_38_0 = 0;
        pi stackOut_42_0 = null;
        pi stackOut_42_1 = null;
        int stackOut_50_0 = 0;
        Object stackOut_52_0 = null;
        pi stackOut_78_0 = null;
        pi stackOut_78_1 = null;
        int stackOut_87_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_91_0 = 0;
        pi stackOut_100_0 = null;
        pi stackOut_100_1 = null;
        int stackOut_109_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_113_0 = 0;
        pi stackOut_122_0 = null;
        pi stackOut_122_1 = null;
        pi stackOut_123_0 = null;
        pi stackOut_123_1 = null;
        int stackOut_129_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_133_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = client.field_A ? 1 : 0;
                    var2 = 0;
                    var3 = this.field_A;
                    var4 = 0;
                    var5 = this.field_t;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var4 >= var5) {
                        statePc = 12;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var5--;
                    stackOut_2_0 = var2;
                    stackIn_13_0 = stackOut_2_0;
                    stackIn_3_0 = stackOut_2_0;
                    if (var12 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var6 = stackIn_3_0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if ((var6 ^ -1) <= (var3 ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackOut_5_0 = this;
                    stackIn_53_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var12 != 0) {
                        statePc = 53;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (((uk) (this)).field_q[var5 * this.field_A + var6] == me.field_J) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var6++;
                    if (var12 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var12 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackOut_12_0 = 32 / ((-48 - param0) / 43);
                    stackIn_13_0 = stackOut_12_0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var6 = stackIn_13_0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if ((var5 ^ -1) >= (var4 ^ -1)) {
                        statePc = 133;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackOut_15_0 = var2;
                    stackIn_25_0 = stackOut_15_0;
                    stackIn_16_0 = stackOut_15_0;
                    if (var12 != 0) {
                        statePc = 25;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var7 = stackIn_16_0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if ((var7 ^ -1) <= (var3 ^ -1)) {
                        statePc = 22;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackOut_18_0 = me.field_J;
                    stackOut_18_1 = this.field_q[var4 * this.field_A + var7];
                    stackIn_43_0 = stackOut_18_0;
                    stackIn_43_1 = stackOut_18_1;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    if (var12 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (stackIn_19_0 != stackIn_19_1) {
                        statePc = 133;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var7++;
                    if (var12 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var4++;
                    if (var12 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackOut_24_0 = var3 ^ -1;
                    stackIn_25_0 = stackOut_24_0;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (stackIn_25_0 >= (var2 ^ -1)) {
                        statePc = 113;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var3--;
                    stackOut_26_0 = var4;
                    stackIn_89_0 = stackOut_26_0;
                    stackIn_27_0 = stackOut_26_0;
                    if (var12 != 0) {
                        statePc = 89;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var7 = stackIn_27_0;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (var7 >= var5) {
                        statePc = 35;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackOut_29_0 = this.field_q[var3 + this.field_A * var7];
                    stackOut_29_1 = me.field_J;
                    stackIn_43_0 = stackOut_29_0;
                    stackIn_43_1 = stackOut_29_1;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    if (var12 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (stackIn_30_0 == stackIn_30_1) {
                        statePc = 33;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var3++;
                    if (var12 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var7++;
                    if (var12 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (var12 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if ((var2 ^ -1) <= (var3 ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    stackOut_38_0 = var4;
                    stackIn_51_0 = stackOut_38_0;
                    stackIn_39_0 = stackOut_38_0;
                    if (var12 != 0) {
                        statePc = 51;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var7 = stackIn_39_0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (var7 >= var5) {
                        statePc = 48;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (var12 != 0) {
                        statePc = 49;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    stackOut_42_0 = me.field_J;
                    stackOut_42_1 = this.field_q[var2 + this.field_A * var7];
                    stackIn_43_0 = stackOut_42_0;
                    stackIn_43_1 = stackOut_42_1;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (stackIn_43_0 == stackIn_43_1) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (var12 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var7++;
                    if (var12 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var2++;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (var12 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    stackOut_50_0 = 0;
                    stackIn_51_0 = stackOut_50_0;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (stackIn_51_0 < var2) {
                        statePc = 57;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    stackOut_52_0 = this;
                    stackIn_53_0 = stackOut_52_0;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if ((((uk) (this)).field_A ^ -1) < (var3 ^ -1)) {
                        statePc = 57;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (0 < var4) {
                        statePc = 57;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if ((this.field_t ^ -1) >= (var5 ^ -1)) {
                        statePc = 69;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var7 = var3 - var2;
                    var8 = -var4 + var5;
                    var9 = new pi[var7 * var8];
                    var10 = 0;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    if ((var8 ^ -1) >= (var10 ^ -1)) {
                        statePc = 67;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (var12 != 0) {
                        statePc = 68;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var11 = 0;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    if ((var7 ^ -1) >= (var11 ^ -1)) {
                        statePc = 65;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var9[var11 + var10 * var7] = this.field_q[(var10 + var4) * this.field_A - (-var2 + -var11)];
                    var11++;
                    if (var12 != 0) {
                        statePc = 66;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (var12 == 0) {
                        statePc = 61;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var10++;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if (var12 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    this.field_u = this.field_u + var4;
                    this.field_A = var7;
                    this.field_t = var8;
                    this.field_r = this.field_r + var2;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    this.field_q = var9;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    return;
                }
                case 71: {
                    if (var12 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var7++;
                    if (var12 == 0) {
                        statePc = 84;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (stackIn_76_0 == stackIn_76_1) {
                        statePc = 74;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 78: {
                    stackOut_78_0 = me.field_J;
                    stackOut_78_1 = this.field_q[var2 + this.field_A * var7];
                    stackIn_76_0 = stackOut_78_0;
                    stackIn_76_1 = stackOut_78_1;
                    statePc = 76;
                    continue stateLoop;
                }
                case 79: {
                    if (var12 != 0) {
                        statePc = 81;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (var12 == 0) {
                        statePc = 91;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 83: {
                    var2++;
                    statePc = 81;
                    continue stateLoop;
                }
                case 84: {
                    if (var7 >= var5) {
                        statePc = 83;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var7 = stackIn_86_0;
                    statePc = 84;
                    continue stateLoop;
                }
                case 87: {
                    stackOut_87_0 = var4;
                    stackIn_51_0 = stackOut_87_0;
                    stackIn_88_0 = stackOut_87_0;
                    if (var12 != 0) {
                        statePc = 51;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    stackOut_88_0 = stackIn_88_0;
                    stackIn_86_0 = stackOut_88_0;
                    statePc = 86;
                    continue stateLoop;
                }
                case 89: {
                    if (stackIn_89_0 <= (var3 ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 91: {
                    stackOut_91_0 = var2 ^ -1;
                    stackIn_89_0 = stackOut_91_0;
                    statePc = 89;
                    continue stateLoop;
                }
                case 93: {
                    if (var12 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    var7++;
                    if (var12 == 0) {
                        statePc = 106;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (stackIn_98_0 == stackIn_98_1) {
                        statePc = 96;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 100: {
                    stackOut_100_0 = me.field_J;
                    stackOut_100_1 = this.field_q[var2 + this.field_A * var7];
                    stackIn_98_0 = stackOut_100_0;
                    stackIn_98_1 = stackOut_100_1;
                    statePc = 98;
                    continue stateLoop;
                }
                case 101: {
                    if (var12 != 0) {
                        statePc = 103;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (var12 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 105: {
                    var2++;
                    statePc = 103;
                    continue stateLoop;
                }
                case 106: {
                    if (var7 >= var5) {
                        statePc = 105;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 108: {
                    var7 = stackIn_108_0;
                    statePc = 106;
                    continue stateLoop;
                }
                case 109: {
                    stackOut_109_0 = var4;
                    stackIn_51_0 = stackOut_109_0;
                    stackIn_110_0 = stackOut_109_0;
                    if (var12 != 0) {
                        statePc = 51;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    stackOut_110_0 = stackIn_110_0;
                    stackIn_108_0 = stackOut_110_0;
                    statePc = 108;
                    continue stateLoop;
                }
                case 111: {
                    if (stackIn_111_0 <= (var3 ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 113: {
                    stackOut_113_0 = var2 ^ -1;
                    stackIn_111_0 = stackOut_113_0;
                    statePc = 111;
                    continue stateLoop;
                }
                case 115: {
                    var3++;
                    if (var12 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    var7++;
                    if (var12 == 0) {
                        statePc = 126;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (stackIn_120_0 == stackIn_120_1) {
                        statePc = 118;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 122: {
                    stackOut_122_0 = this.field_q[var3 + this.field_A * var7];
                    stackOut_122_1 = me.field_J;
                    stackIn_43_0 = stackOut_122_0;
                    stackIn_43_1 = stackOut_122_1;
                    stackIn_123_0 = stackOut_122_0;
                    stackIn_123_1 = stackOut_122_1;
                    if (var12 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    stackOut_123_0 = (pi) ((Object) stackIn_123_0);
                    stackOut_123_1 = (pi) ((Object) stackIn_123_1);
                    stackIn_120_0 = stackOut_123_0;
                    stackIn_120_1 = stackOut_123_1;
                    statePc = 120;
                    continue stateLoop;
                }
                case 124: {
                    if (var12 == 0) {
                        statePc = 133;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 126: {
                    if (var7 >= var5) {
                        statePc = 124;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 128: {
                    var7 = stackIn_128_0;
                    statePc = 126;
                    continue stateLoop;
                }
                case 129: {
                    var3--;
                    stackOut_129_0 = var4;
                    stackIn_89_0 = stackOut_129_0;
                    stackIn_130_0 = stackOut_129_0;
                    if (var12 != 0) {
                        statePc = 89;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    stackOut_130_0 = stackIn_130_0;
                    stackIn_128_0 = stackOut_130_0;
                    statePc = 128;
                    continue stateLoop;
                }
                case 131: {
                    if (stackIn_131_0 >= (var2 ^ -1)) {
                        statePc = 113;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 133: {
                    stackOut_133_0 = var3 ^ -1;
                    stackIn_131_0 = stackOut_133_0;
                    statePc = 131;
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    uk() {
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            int var1 = 0;
            long var2 = 0L;
            long var4 = 0L;
            long var6 = 0L;
            long var8 = 0L;
            long var10 = 0L;
            long var12 = 0L;
            int var14 = 0;
            long stackIn_5_0 = 0L;
            long stackOut_4_0 = 0L;
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
                    break $cfr$clinit;
                  } else {
                    var1 = (-1 + var0) * 8;
                    field_x[var0] = pj.a(jg.a(255L, field_s[7][7 + var1]), pj.a(pj.a(pj.a(pj.a(pj.a(pj.a(jg.a(field_s[1][var1 - -1], 71776119061217280L), jg.a(field_s[0][var1], -72057594037927936L)), jg.a(field_s[2][2 + var1], 280375465082880L)), jg.a(1095216660480L, field_s[3][var1 - -3])), jg.a(4278190080L, field_s[4][var1 - -4])), jg.a(16711680L, field_s[5][var1 - -5])), jg.a(65280L, field_s[6][var1 - -6])));
                    var0++;
                    continue L1;
                  }
                }
              } else {
                L2: {
                  var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
                  if (0 != (1 & var0)) {
                    stackOut_4_0 = (long)(var1 & 255);
                    stackIn_5_0 = stackOut_4_0;
                    break L2;
                  } else {
                    stackOut_3_0 = (long)(var1 >>> 1748502536);
                    stackIn_5_0 = stackOut_3_0;
                    break L2;
                  }
                }
                L3: {
                  var2 = stackIn_5_0;
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
}
