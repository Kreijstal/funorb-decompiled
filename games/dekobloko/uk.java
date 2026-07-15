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
        pi stackIn_25_0 = null;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        pi stackIn_46_0 = null;
        pi stackIn_46_1 = null;
        pi stackIn_56_0 = null;
        pi stackIn_59_0 = null;
        pi stackIn_59_1 = null;
        pi stackIn_90_0 = null;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        pi stackIn_109_0 = null;
        pi stackIn_109_1 = null;
        pi stackIn_120_0 = null;
        pi stackIn_123_0 = null;
        pi stackIn_123_1 = null;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        pi stackOut_45_0 = null;
        pi stackOut_45_1 = null;
        pi stackOut_55_0 = null;
        pi stackOut_58_0 = null;
        pi stackOut_58_1 = null;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        pi stackOut_108_0 = null;
        pi stackOut_108_1 = null;
        pi stackOut_119_0 = null;
        pi stackOut_122_0 = null;
        pi stackOut_122_1 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var21 = client.field_A ? 1 : 0;
                    if (param1 < ((uk) this).field_n) {
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
                    var22.field_v = ((uk) this).field_v;
                    var22.field_u = ((uk) this).field_u;
                    var22.field_A = ((uk) this).field_A;
                    var22.field_w = ((uk) this).field_w;
                    var22.field_r = ((uk) this).field_r;
                    var22.field_t = ((uk) this).field_t;
                    var22.field_q = new pi[((uk) this).field_t * ((uk) this).field_A];
                    if (((uk) this).field_A <= ((uk) this).field_t) {
                        statePc = 69;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var4 = ka.a((byte) 53, ((uk) this).field_w * ((uk) this).field_t, tf.field_cb) - -(((uk) this).field_w * (((uk) this).field_A + -((uk) this).field_t) / 2);
                    var5 = -1 + (((uk) this).field_A * ((uk) this).field_w - var4);
                    var6 = ka.a((byte) 117, 1 + 2 * ((uk) this).field_t * ((uk) this).field_w, tf.field_cb) - ((uk) this).field_t * ((uk) this).field_w;
                    var22.field_n = (((uk) this).field_A * ((uk) this).field_w / 2 - var6 / 6) * ((uk) this).field_n / (((uk) this).field_w * ((uk) this).field_A);
                    ((uk) this).field_n = ((uk) this).field_n - var22.field_n;
                    var7 = ((uk) this).field_t * ((uk) this).field_v;
                    var8 = var7 * var7;
                    var9 = 0;
                    var10 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (((uk) this).field_t <= var10) {
                        statePc = 68;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var11 = ((uk) this).field_A;
                    var12 = 0;
                    if (var21 != 0) {
                        statePc = 134;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var13 = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (((uk) this).field_v <= var13) {
                        statePc = 14;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var14 = var4 + (var9 * (var5 - var4) / var7 - -((var7 + -var9) * (var9 * var6) / var8));
                    ub.field_d[var13] = var14;
                    var9++;
                    if ((var11 ^ -1) < (var14 / ((uk) this).field_w ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var11 = var14 / ((uk) this).field_w;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if ((((uk) this).field_w + var14 + -1) / ((uk) this).field_w <= var12) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var12 = (var14 - (-((uk) this).field_w + 1)) / ((uk) this).field_w;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var13++;
                    if (var21 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var11 >= 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var11 = 0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var12 <= ((uk) this).field_A) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var12 = ((uk) this).field_A;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    var13 = var10 * ((uk) this).field_A;
                    var14 = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (var11 <= var14) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var22.field_q[var13 - -var14] = me.field_J;
                    var14++;
                    if (var21 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var14 = var11;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (var12 <= var14) {
                        statePc = 32;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var15_ref_pi = ((uk) this).field_q[var13 - -var14];
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    var15_ref_pi = stackIn_25_0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (var21 != 0) {
                        statePc = 33;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (var15_ref_pi == null) {
                        statePc = 31;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (me.field_J != var15_ref_pi) {
                        statePc = 30;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var15_ref_pi = var15_ref_pi.b();
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var22.field_q[var14 + var13] = var15_ref_pi;
                    var14++;
                    statePc = 23;
                    continue stateLoop;
                }
                case 32: {
                    var14 = var12;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (((uk) this).field_A <= var14) {
                        statePc = 36;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var22.field_q[var13 + var14] = ((uk) this).field_q[var14 + var13];
                    ((uk) this).field_q[var14 + var13] = me.field_J;
                    var14++;
                    if (var21 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var14 = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (((uk) this).field_v <= var14) {
                        statePc = 67;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var15 = ub.field_d[var14];
                    var16 = ((uk) this).field_w * var11;
                    var17 = var11;
                    var18 = 0;
                    stackOut_38_0 = var16;
                    stackOut_38_1 = var15;
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (stackIn_39_0 >= stackIn_39_1) {
                        statePc = 54;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var19_ref_pi = var22.field_q[var10 * ((uk) this).field_A + var17];
                    if (var18 >= ((uk) this).field_w) {
                        statePc = 53;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    stackOut_41_0 = var16 ^ -1;
                    stackOut_41_1 = var15 ^ -1;
                    stackIn_39_0 = stackOut_41_0;
                    stackIn_39_1 = stackOut_41_1;
                    stackIn_42_0 = stackOut_41_0;
                    stackIn_42_1 = stackOut_41_1;
                    if (var21 != 0) {
                        statePc = 39;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (stackIn_42_0 > stackIn_42_1) {
                        statePc = 45;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (var21 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    stackOut_45_0 = (pi) var19_ref_pi;
                    stackOut_45_1 = me.field_J;
                    stackIn_46_0 = stackOut_45_0;
                    stackIn_46_1 = stackOut_45_1;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (stackIn_46_0 != stackIn_46_1) {
                        statePc = 48;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (var19_ref_pi == null) {
                        statePc = 50;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var23 = new pi(((uk) this).field_w, ((uk) this).field_v, 0);
                    var19_ref_pi = var23;
                    an.a(var23.field_k, 0, ((uk) this).field_w * ((uk) this).field_v, (byte) 1);
                    var22.field_q[var17 + ((uk) this).field_A * var10] = var23;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    var19_ref_pi.field_k[var18 + var14 * ((uk) this).field_w] = (byte) 0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var16++;
                    var18++;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    var17++;
                    var18 = 0;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (var17 >= var12) {
                        statePc = 66;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackOut_55_0 = ((uk) this).field_q[var17 + ((uk) this).field_A * var10];
                    stackIn_25_0 = stackOut_55_0;
                    stackIn_56_0 = stackOut_55_0;
                    if (var21 != 0) {
                        statePc = 25;
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
                    if (((uk) this).field_w <= var18) {
                        statePc = 65;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    stackOut_58_0 = me.field_J;
                    stackOut_58_1 = (pi) var19_ref_pi;
                    stackIn_46_0 = stackOut_58_0;
                    stackIn_46_1 = stackOut_58_1;
                    stackIn_59_0 = stackOut_58_0;
                    stackIn_59_1 = stackOut_58_1;
                    if (var21 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (stackIn_59_0 != stackIn_59_1) {
                        statePc = 61;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (var19_ref_pi != null) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var24 = new pi(((uk) this).field_w, ((uk) this).field_v, 0);
                    var19_ref_pi = var24;
                    an.a(var24.field_k, 0, ((uk) this).field_w * ((uk) this).field_v, (byte) 1);
                    ((uk) this).field_q[((uk) this).field_A * var10 + var17] = var24;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    var19_ref_pi.field_k[var14 * ((uk) this).field_w + var18] = (byte) 0;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    var18++;
                    var16++;
                    if (var21 == 0) {
                        statePc = 57;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var17++;
                    var18 = 0;
                    if (var21 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    var14++;
                    if (var21 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var10++;
                    if (var21 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (var21 == 0) {
                        statePc = 133;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var4 = ka.a((byte) 51, ((uk) this).field_A * ((uk) this).field_v, tf.field_cb) + ((uk) this).field_v * (((uk) this).field_t - ((uk) this).field_A) / 2;
                    var5 = ((uk) this).field_v * ((uk) this).field_t - 1 + -var4;
                    var6 = ka.a((byte) 56, ((uk) this).field_A * (((uk) this).field_v * 2) - -1, tf.field_cb) + -(((uk) this).field_v * ((uk) this).field_A);
                    var22.field_n = (-(var6 / 6) + ((uk) this).field_t * ((uk) this).field_v / 2) * ((uk) this).field_n / (((uk) this).field_t * ((uk) this).field_v);
                    ((uk) this).field_n = ((uk) this).field_n - var22.field_n;
                    var7 = ((uk) this).field_A * ((uk) this).field_w;
                    var8 = var7 * var7;
                    var9 = 0;
                    var10 = 0;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    if (((uk) this).field_A <= var10) {
                        statePc = 133;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var11 = ((uk) this).field_t;
                    var12 = 0;
                    if (var21 != 0) {
                        statePc = 134;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var13 = 0;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    if (((uk) this).field_w <= var13) {
                        statePc = 79;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var14 = var4 - (-(var9 * (-var4 + var5) / var7) - var9 * var6 * (var7 - var9) / var8);
                    ub.field_d[var13] = var14;
                    if (var11 <= var14 / ((uk) this).field_v) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var11 = var14 / ((uk) this).field_v;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    var9++;
                    if ((((uk) this).field_v + var14 - 1) / ((uk) this).field_v <= var12) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var12 = (-1 + ((uk) this).field_v + var14) / ((uk) this).field_v;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    var13++;
                    if (var21 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (var12 <= ((uk) this).field_t) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var12 = ((uk) this).field_t;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    if (var11 >= 0) {
                        statePc = 83;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var11 = 0;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    var13 = var10;
                    var14 = ((uk) this).field_A * var11;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (var13 >= var14) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var22.field_q[var13] = me.field_J;
                    var13 = var13 + ((uk) this).field_A;
                    if (var21 == 0) {
                        statePc = 84;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var14 = ((uk) this).field_A * var12;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    if (var13 >= var14) {
                        statePc = 96;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var15_ref_pi = ((uk) this).field_q[var13];
                    statePc = 91;
                    continue stateLoop;
                }
                case 90: {
                    var15_ref_pi = stackIn_90_0;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if (var21 != 0) {
                        statePc = 97;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (var15_ref_pi == null) {
                        statePc = 95;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (me.field_J == var15_ref_pi) {
                        statePc = 95;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var15_ref_pi = var15_ref_pi.b();
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    var22.field_q[var13] = var15_ref_pi;
                    var13 = var13 + ((uk) this).field_A;
                    statePc = 88;
                    continue stateLoop;
                }
                case 96: {
                    var14 = ((uk) this).field_A * ((uk) this).field_t;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    if (var14 <= var13) {
                        statePc = 99;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var22.field_q[var13] = ((uk) this).field_q[var13];
                    ((uk) this).field_q[var13] = me.field_J;
                    var13 = var13 + ((uk) this).field_A;
                    if (var21 == 0) {
                        statePc = 97;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var15 = 0;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    if (var15 >= ((uk) this).field_w) {
                        statePc = 132;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    var16 = ub.field_d[var15];
                    var17 = var11 * ((uk) this).field_v;
                    var18 = var11;
                    var19 = 0;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    stackOut_102_0 = var17;
                    stackOut_102_1 = var16;
                    stackIn_103_0 = stackOut_102_0;
                    stackIn_103_1 = stackOut_102_1;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    if (stackIn_103_0 >= stackIn_103_1) {
                        statePc = 118;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var20 = var22.field_q[((uk) this).field_A * var18 + var10];
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if (((uk) this).field_v <= var19) {
                        statePc = 116;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    stackOut_106_0 = var16;
                    stackOut_106_1 = var17;
                    stackIn_103_0 = stackOut_106_0;
                    stackIn_103_1 = stackOut_106_1;
                    stackIn_107_0 = stackOut_106_0;
                    stackIn_107_1 = stackOut_106_1;
                    if (var21 != 0) {
                        statePc = 103;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (stackIn_107_0 <= stackIn_107_1) {
                        statePc = 118;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    stackOut_108_0 = me.field_J;
                    stackOut_108_1 = (pi) var20;
                    stackIn_109_0 = stackOut_108_0;
                    stackIn_109_1 = stackOut_108_1;
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    if (stackIn_109_0 != stackIn_109_1) {
                        statePc = 111;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if (var20 == null) {
                        statePc = 113;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 113: {
                    var25 = new pi(((uk) this).field_w, ((uk) this).field_v, 0);
                    var20 = var25;
                    an.a(var25.field_k, 0, ((uk) this).field_w * ((uk) this).field_v, (byte) 1);
                    var22.field_q[((uk) this).field_A * var18 + var10] = var25;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    var20.field_k[var19 * ((uk) this).field_w - -var15] = (byte) 0;
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    var19++;
                    var17++;
                    if (var21 == 0) {
                        statePc = 105;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    var18++;
                    var19 = 0;
                    if (var21 == 0) {
                        statePc = 102;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if (var12 <= var18) {
                        statePc = 131;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    stackOut_119_0 = ((uk) this).field_q[var10 + ((uk) this).field_A * var18];
                    stackIn_90_0 = stackOut_119_0;
                    stackIn_120_0 = stackOut_119_0;
                    if (var21 != 0) {
                        statePc = 90;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    var20 = stackIn_120_0;
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    if (((uk) this).field_v <= var19) {
                        statePc = 130;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    stackOut_122_0 = (pi) var20;
                    stackOut_122_1 = me.field_J;
                    stackIn_109_0 = stackOut_122_0;
                    stackIn_109_1 = stackOut_122_1;
                    stackIn_123_0 = stackOut_122_0;
                    stackIn_123_1 = stackOut_122_1;
                    if (var21 != 0) {
                        statePc = 109;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    if (stackIn_123_0 != stackIn_123_1) {
                        statePc = 125;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if (var20 == null) {
                        statePc = 127;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var26 = new pi(((uk) this).field_w, ((uk) this).field_v, 0);
                    var20 = var26;
                    an.a(var26.field_k, 0, ((uk) this).field_w * ((uk) this).field_v, (byte) 1);
                    ((uk) this).field_q[var10 + var18 * ((uk) this).field_A] = var26;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    var20.field_k[var15 + ((uk) this).field_w * var19] = (byte) 0;
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    var17++;
                    var19++;
                    if (var21 == 0) {
                        statePc = 121;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    var18++;
                    var19 = 0;
                    if (var21 == 0) {
                        statePc = 118;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    var15++;
                    if (var21 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    var10++;
                    if (var21 == 0) {
                        statePc = 70;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    this.d((byte) 116);
                    var22.d((byte) -110);
                    var22.field_b = ((uk) this).field_b;
                    var22.field_a = (bh) this;
                    var22.field_a.field_b = (bh) (Object) var22;
                    var22.field_b.field_a = (bh) (Object) var22;
                    ((uk) this).b(11976, param1);
                    var22.b(param0, param1);
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean c(byte param0) {
        if (param0 != -17) {
            boolean discarded$0 = uk.c((byte) 22);
        }
        return pa.field_V == ka.field_P ? true : false;
    }

    public static void c(int param0) {
        field_x = null;
        field_z = null;
        field_s = null;
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
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        pi stackIn_34_0 = null;
        pi stackIn_34_1 = null;
        int stackIn_40_0 = 0;
        Object stackIn_42_0 = null;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_68_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        pi stackOut_33_0 = null;
        pi stackOut_33_1 = null;
        int stackOut_39_0 = 0;
        Object stackOut_41_0 = null;
        var12 = client.field_A ? 1 : 0;
        var2 = 0;
        var3 = ((uk) this).field_A;
        var4 = 0;
        var5 = ((uk) this).field_t;
        L0: while (true) {
          L1: {
            L2: {
              if (var4 >= var5) {
                break L2;
              } else {
                var5--;
                stackOut_2_0 = var2;
                stackIn_10_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var12 != 0) {
                  break L1;
                } else {
                  L3: {
                    var6 = stackIn_3_0;
                    if (var6 >= var3) {
                      break L3;
                    } else {
                      L4: {
                        if (((uk) this).field_q[var5 * ((uk) this).field_A + var6] == me.field_J) {
                          break L4;
                        } else {
                          var5++;
                          if (var12 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var6++;
                      break L3;
                    }
                  }
                  continue L0;
                }
              }
            }
            stackOut_9_0 = 32 / ((-48 - param0) / 43);
            stackIn_10_0 = stackOut_9_0;
            break L1;
          }
          var6 = stackIn_10_0;
          L5: while (true) {
            L6: {
              L7: {
                L8: {
                  if (var5 <= var4) {
                    break L8;
                  } else {
                    stackOut_12_0 = var2;
                    stackIn_68_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (var12 != 0) {
                      L9: while (true) {
                        if (stackIn_68_0 <= var2) {
                          break L7;
                        } else {
                          var3--;
                          stackOut_66_0 = var4;
                          stackIn_30_0 = stackOut_66_0;
                          stackIn_67_0 = stackOut_66_0;
                          if (var12 != 0) {
                            break L6;
                          } else {
                            stackOut_67_0 = stackIn_67_0;
                            stackIn_64_0 = stackOut_67_0;
                            L10: {
                              var7 = stackIn_64_0;
                              if (var7 >= var5) {
                                break L10;
                              } else {
                                L11: {
                                  if (((uk) this).field_q[var3 + ((uk) this).field_A * var7] == me.field_J) {
                                    break L11;
                                  } else {
                                    var3++;
                                    if (var12 == 0) {
                                      break L7;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                var7++;
                                break L10;
                              }
                            }
                            stackOut_70_0 = var3;
                            stackIn_68_0 = stackOut_70_0;
                            continue L9;
                          }
                        }
                      }
                    } else {
                      var7 = stackIn_13_0;
                      L12: while (true) {
                        if (var7 >= var3) {
                          var4++;
                          continue L5;
                        } else {
                          if (me.field_J != ((uk) this).field_q[var4 * ((uk) this).field_A + var7]) {
                            break L8;
                          } else {
                            var7++;
                            continue L12;
                          }
                        }
                      }
                    }
                  }
                }
                L13: while (true) {
                  if (var3 <= var2) {
                    break L7;
                  } else {
                    var3--;
                    stackOut_21_0 = var4;
                    stackIn_30_0 = stackOut_21_0;
                    stackIn_22_0 = stackOut_21_0;
                    if (var12 != 0) {
                      break L6;
                    } else {
                      L14: {
                        var7 = stackIn_22_0;
                        if (var7 >= var5) {
                          break L14;
                        } else {
                          L15: {
                            if (((uk) this).field_q[var3 + ((uk) this).field_A * var7] == me.field_J) {
                              break L15;
                            } else {
                              var3++;
                              if (var12 == 0) {
                                break L7;
                              } else {
                                break L15;
                              }
                            }
                          }
                          var7++;
                          break L14;
                        }
                      }
                      continue L13;
                    }
                  }
                }
              }
              stackOut_29_0 = var2;
              stackIn_30_0 = stackOut_29_0;
              break L6;
            }
            L16: {
              L17: {
                if (stackIn_30_0 >= var3) {
                  break L17;
                } else {
                  stackOut_31_0 = var4;
                  stackIn_40_0 = stackOut_31_0;
                  stackIn_32_0 = stackOut_31_0;
                  if (var12 != 0) {
                    break L16;
                  } else {
                    L18: {
                      var7 = stackIn_32_0;
                      if (var7 >= var5) {
                        break L18;
                      } else {
                        stackOut_33_0 = me.field_J;
                        stackOut_33_1 = ((uk) this).field_q[var2 + ((uk) this).field_A * var7];
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        L19: {
                          if (stackIn_34_0 == stackIn_34_1) {
                            break L19;
                          } else {
                            if (var12 == 0) {
                              break L17;
                            } else {
                              break L19;
                            }
                          }
                        }
                        var7++;
                        break L18;
                      }
                    }
                    var2++;
                    break L17;
                  }
                }
              }
              stackOut_39_0 = 0;
              stackIn_40_0 = stackOut_39_0;
              break L16;
            }
            L20: {
              L21: {
                if (stackIn_40_0 < var2) {
                  break L21;
                } else {
                  stackOut_41_0 = this;
                  stackIn_42_0 = stackOut_41_0;
                  if (((uk) this).field_A > var3) {
                    break L21;
                  } else {
                    if (0 < var4) {
                      break L21;
                    } else {
                      if (((uk) this).field_t <= var5) {
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                }
              }
              var7 = var3 - var2;
              var8 = -var4 + var5;
              var9 = new pi[var7 * var8];
              var10 = 0;
              L22: while (true) {
                L23: {
                  if (var8 <= var10) {
                    ((uk) this).field_u = ((uk) this).field_u + var4;
                    ((uk) this).field_A = var7;
                    ((uk) this).field_t = var8;
                    ((uk) this).field_r = ((uk) this).field_r + var2;
                    break L23;
                  } else {
                    if (var12 != 0) {
                      break L23;
                    } else {
                      var11 = 0;
                      L24: while (true) {
                        if (var7 <= var11) {
                          var10++;
                          continue L22;
                        } else {
                          var9[var11 + var10 * var7] = ((uk) this).field_q[(var10 + var4) * ((uk) this).field_A - (-var2 + -var11)];
                          var11++;
                          continue L24;
                        }
                      }
                    }
                  }
                }
                ((uk) this).field_q = var9;
                break L20;
              }
            }
            return;
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
                return;
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
