/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static pc field_f;
    private boolean field_t;
    static String field_u;
    ei field_e;
    static String field_I;
    static int field_p;
    ei field_B;
    int field_n;
    private int field_j;
    private int[] field_m;
    private double field_h;
    private int field_E;
    kh field_i;
    private tl[] field_D;
    private int field_S;
    private int field_U;
    private int field_o;
    private int field_F;
    private double field_K;
    private int field_N;
    private String field_T;
    vg field_P;
    private boolean field_w;
    private sg field_C;
    private int field_H;
    private kg[] field_Q;
    int field_s;
    int field_L;
    private int field_r;
    private int field_x;
    private int field_l;
    private int field_G;
    private int field_c;
    private Torquing field_A;
    private int field_M;
    hc field_d;
    private int[] field_a;
    private int field_v;
    private boolean field_g;
    private int field_k;
    private boolean field_y;
    int[] field_b;
    int field_z;
    int field_q;
    private boolean field_J;

    private final void h(int param0) {
        int[] array$0 = null;
        boolean stackIn_3_0 = false;
        int stackIn_7_0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_14_0 = 0;
        kh stackIn_17_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        kh stackIn_31_0 = null;
        boolean stackOut_2_0;
        boolean stackOut_9_0;
        int statePc = 0;
        tl[] var2 = null;
        int var3 = 0;
        int var4_int = 0;
        int[] var4 = null;
        int var5_int = 0;
        pj var5 = null;
        kh[] var6_ref_kh__ = null;
        int var6 = 0;
        int var7 = 0;
        kh var8 = null;
        int var9 = 0;
        tl[] var10 = null;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Torquing.field_u;
                    fd.a(-109);
                    re.field_d[1] = 80.0;
                    this.field_x = 0;
                    re.field_d[0] = 0.0;
                    var10 = this.field_d.field_q;
                    var2 = var10;
                    this.field_D = new tl[var10.length];
                    dk.a(var2, 0, this.field_D, 0, this.field_D.length);
                    var3 = 0;
                    var4_int = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((var4_int ^ -1) <= (this.field_D.length ^ -1)) {
                        statePc = 6;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = this.field_D[var4_int].f(25468);
                    stackIn_7_0 = stackOut_2_0 ? 1 : 0;
                    stackIn_3_0 = stackOut_2_0;
                    if (var9 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (!stackIn_3_0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var3++;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var4_int++;
                    if (var9 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_m = new int[var3];
                    stackIn_7_0 = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var11 = stackIn_7_0;
                    var4_int = var11;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (var11 >= this.field_D.length) {
                        statePc = 13;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackOut_9_0 = this.field_D[var11].f(25468);
                    stackIn_14_0 = stackOut_9_0 ? 1 : 0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var9 != 0) {
                        statePc = 14;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (!stackIn_10_0) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var3--;
                    this.field_m[var3] = var11;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var11++;
                    if (var9 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    this.field_C = this.field_P.a(-63, this.field_d);
                    this.field_P.b(0, this.field_i);
                    stackIn_14_0 = 12;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    array$0 = new int[stackIn_14_0];
                    array$0[0] = 0;
                    array$0[1] = 0;
                    array$0[2] = 0;
                    array$0[3] = 65536;
                    array$0[4] = 0;
                    array$0[5] = 0;
                    array$0[6] = 0;
                    array$0[7] = 65536;
                    array$0[8] = 0;
                    array$0[9] = 0;
                    array$0[10] = 0;
                    array$0[11] = 65536;
                    var4 = array$0;
                    var5_int = 42 % ((-34 - param0) / 44);
                    var6_ref_kh__ = vc.field_c;
                    var7 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var7 >= var6_ref_kh__.length) {
                        statePc = 21;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var8 = var6_ref_kh__[var7];
                    stackIn_31_0 = (kh) (var8);
                    stackIn_17_0 = stackIn_31_0;
                    if (var9 != 0) {
                        statePc = 31;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (stackIn_17_0 != null) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.field_C.a(var8, var4);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    var7++;
                    if (var9 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var5_int = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (var5_int >= this.field_C.field_y) {
                        statePc = 26;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    this.field_C.a(var5_int, 80, 1365, -1, -12, 12);
                    var5_int++;
                    if (var9 != 0) {
                        statePc = 27;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (var9 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    this.a(false, 0);
                    this.field_w = false;
                    this.field_T = ki.a("ff9040", "ffffff", 93, this.field_T);
                    this.field_z = 0;
                    this.field_k = this.field_d.a(-31648);
                    this.field_r = 3000;
                    this.field_c = 0;
                    this.field_v = this.field_d.a(false);
                    ap.a(gj.field_i, il.field_m[this.field_v]);
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_29_0 = this;
                    stackIn_28_0 = stackIn_29_0;
                    if ((this.field_L ^ -1) != -19) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = this;
                    stackIn_30_1 = 1;
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_30_0 = this;
                    stackIn_30_1 = 0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    ((bi) (this)).field_y = stackIn_30_1 != 0;
                    this.field_J = false;
                    this.field_h = Double.NEGATIVE_INFINITY;
                    this.field_K = -1.0;
                    stackIn_31_0 = this.field_d.a(-100, false);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var5 = stackIn_31_0.field_k;
                    var6 = var5.field_k + -1;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (var6 < 0) {
                        statePc = 39;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (var9 != 0) {
                        statePc = 39;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (this.field_h < re.field_d[1] * (double)var5.field_y[var6]) {
                        statePc = 36;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 36: {
                    this.field_h = re.field_d[1] * (double)var5.field_y[var6];
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    var6--;
                    if (var9 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void g(int param0) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int stackIn_12_0 = 0;
        int statePc = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        tl[] var10 = null;
        tl[] var11 = null;
        qk var12 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Torquing.field_u;
                    var12 = new qk(0, this.field_L, this.field_N, this.field_S, this.field_F, this.field_G);
                    if (!je.a((byte) 77)) {
                        statePc = 3;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    bo.field_l.a((byte) 54, var12);
                    if (var9 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    le.a((byte) 83, 5, var12);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (1 + this.field_L > nh.field_k) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    nh.field_k = this.field_L - -1;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (wi.field_a.length - 1 == this.field_L) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if ((wi.field_a[this.field_L + 1] ^ -1) == (wi.field_a[this.field_L] ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = 1;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = 0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var3 = stackIn_12_0;
                    var4 = wi.field_a[this.field_L];
                    if (var3 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var4 == 1) {
                        statePc = 23;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if ((var4 ^ -1) == -3) {
                        statePc = 21;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var4 != 4) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.a(2, (byte) 78, 253);
                    if (var9 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (7 != var4) {
                        statePc = 24;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.a(3, (byte) 125, 252);
                    if (var9 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    this.a(1, (byte) 9, 254);
                    if (var9 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    this.a(0, (byte) 83, 255);
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var5 = this.field_G & 63;
                    if (-1 <= (var4 ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var4 > wi.field_a[var5]) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if ((hg.field_d[var5] ^ -1) == -1) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    this.a(4, (byte) 118, 251);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (0 == var5) {
                        statePc = 42;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (-1 >= this.field_T.indexOf("ff9040")) {
                        statePc = 34;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if ((this.field_T.indexOf("ffffff") ^ -1) == 0) {
                        statePc = 33;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 33: {
                    this.field_l = this.field_l + this.field_U;
                    this.field_U = this.field_U * 2;
                    this.field_s = this.field_U;
                    this.a(12, (byte) 61, 243);
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    this.field_T = ki.a("ff9040", "ff0000", -104, this.field_T);
                    var10 = this.field_d.field_q;
                    var6 = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (this.field_D.length <= var6) {
                        statePc = 63;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (var9 != 0) {
                        statePc = 85;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (null != this.field_D[var6]) {
                        statePc = 41;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if ((var10[var6].field_r ^ -1) == -1) {
                        statePc = 41;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (var10[var6].field_r == 7) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    dupTemp$0 = wi.field_a[this.field_L];
                    this.field_b[dupTemp$0] = this.field_b[dupTemp$0] + 1;
                    this.field_G = this.field_G + 4096;
                    this.field_S = this.field_S + (this.field_N << 114136940);
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    var6++;
                    if (var9 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if ((var4 ^ -1) != -3) {
                        statePc = 45;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    this.a(5, (byte) 71, 250);
                    if (var9 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (-5 == (var4 ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var4 != 7) {
                        statePc = 51;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    this.a(7, (byte) 112, 248);
                    if (-1 == this.field_T.indexOf("ffffff")) {
                        statePc = 49;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 49: {
                    this.a(13, (byte) 25, 242);
                    if (var9 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    this.a(6, (byte) 6, 249);
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (-1 >= this.field_T.indexOf("ff9040")) {
                        statePc = 55;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if ((this.field_T.indexOf("ffffff") ^ -1) == 0) {
                        statePc = 54;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 54: {
                    this.field_l = this.field_l + this.field_U;
                    this.field_U = this.field_U * 2;
                    this.field_s = this.field_U;
                    this.a(12, (byte) 61, 243);
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    this.field_T = ki.a("ff9040", "ff0000", -104, this.field_T);
                    var11 = this.field_d.field_q;
                    var6 = 0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (this.field_D.length <= var6) {
                        statePc = 63;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (var9 != 0) {
                        statePc = 85;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (null != this.field_D[var6]) {
                        statePc = 62;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if ((var11[var6].field_r ^ -1) == -1) {
                        statePc = 62;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (var11[var6].field_r == 7) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    dupTemp$1 = wi.field_a[this.field_L];
                    this.field_b[dupTemp$1] = this.field_b[dupTemp$1] + 1;
                    this.field_G = this.field_G + 4096;
                    this.field_S = this.field_S + (this.field_N << 114136940);
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    var6++;
                    if (var9 == 0) {
                        statePc = 56;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (var3 == 0) {
                        statePc = 84;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if ((var4 ^ -1) == -2) {
                        statePc = 67;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if ((var4 ^ -1) == -4) {
                        statePc = 67;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var6 = 0;
                    var7 = 0;
                    var8 = 0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (var4 < var8) {
                        statePc = 72;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var7 = var7 + mh.field_k[var4];
                    var6 = var6 + this.field_b[var4];
                    var8++;
                    if (var9 != 0) {
                        statePc = 74;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (var9 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (var6 >= var7 * 8 / 10) {
                        statePc = 74;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (1 != var4) {
                        statePc = 77;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    this.a(8, (byte) 33, 247);
                    if (var9 == 0) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    this.a(10, (byte) 13, 245);
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (var7 == var6) {
                        statePc = 80;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if ((var4 ^ -1) != -2) {
                        statePc = 83;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    this.a(9, (byte) 23, 246);
                    if (var9 == 0) {
                        statePc = 84;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    this.a(11, (byte) 24, 244);
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    dd.field_d = dd.field_d | this.field_z;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    if (-256 == (dd.field_d ^ -1)) {
                        statePc = 87;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (!ia.a(-22426, 0)) {
                        statePc = 90;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    this.a(16, (byte) 11, 239);
                    if (var9 == 0) {
                        statePc = 91;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    this.a(15, (byte) 30, 240);
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if (param0 >= 25) {
                        statePc = 93;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    return;
                }
                case 93: {
                    if (-1 > (wp.field_w ^ -1)) {
                        statePc = 97;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if (qc.field_ab.length <= 1) {
                        statePc = 97;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if ((qc.field_ab[1] + qc.field_ab[0] ^ -1) < (nh.field_k ^ -1)) {
                        statePc = 97;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    nh.field_k = -1 + (qc.field_ab[0] - -qc.field_ab[1]);
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    this.field_J = true;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void e(int param0) {
        this.field_w = true;
        if (param0 != -7045) {
            java.applet.Applet var3 = (java.applet.Applet) null;
            bi.a((java.applet.Applet) null, (byte) -76);
        }
    }

    final void b(byte param0, int param1) {
        this.field_k = this.field_k + param1;
        if (param0 < 120) {
            this.field_k = -84;
        }
    }

    final void d(int param0) {
        int statePc = 0;
        ti[] var2_ref_ti__ = null;
        tl[] var2_ref_tl__ = null;
        int var2 = 0;
        int var3 = 0;
        tl var4 = null;
        int var5 = 0;
        ti[] var6 = null;
        tl[] var7 = null;
        int var8 = 0;
        ti var9 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Torquing.field_u;
                    this.field_e.a(0);
                    if (null == this.field_d.field_k) {
                        statePc = 8;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var6 = this.field_d.field_k;
                    var2_ref_ti__ = var6;
                    var3 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if ((var3 ^ -1) <= (var6.length ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var9 = var6[var3];
                    if (var5 != 0) {
                        statePc = 10;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var9 != null) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var9.b((byte) 62);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var3++;
                    if (var5 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (param0 == 1) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 10: {
                    var7 = this.field_d.field_q;
                    var2_ref_tl__ = var7;
                    var8 = 0;
                    var3 = var8;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (var7.length <= var8) {
                        statePc = 15;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var4 = var7[var8];
                    var4.field_c = -1;
                    var4.field_h = null;
                    var8++;
                    if (var5 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var5 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (this.field_d.field_m != null) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.b(param0 ^ 8);
                    this.field_g = true;
                    this.field_q = 9;
                    this.field_d = ig.field_q;
                    la.field_k[9].a(true);
                    this.h(-83);
                    this.field_r = 0;
                    if (var5 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    this.field_d = this.field_d.field_m;
                    this.field_G = this.field_G + 64;
                    this.field_L = this.field_L + 1;
                    this.field_F = this.field_F + (this.field_N << -961057594);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    var2 = wi.field_a[this.field_L];
                    if ((1 + var2 ^ -1) != (this.field_q ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 21: {
                    this.field_i = tp.field_a;
                    this.field_q = var2 + 1;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (ri.field_E < 2) {
                        statePc = 25;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (!la.field_k[this.field_q].e(17)) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    la.field_k[this.field_q].g();
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    this.h(67);
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static af a(sm param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        di stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -94 / ((23 - param1) / 43);
            stackIn_1_0 = new di(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("bi.B(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return (af) ((Object) stackIn_1_0);
    }

    final void a(int param0, int param1) {
        StringBuilder var3;
        CharSequence var4;
        L0: {
          var3 = new StringBuilder(this.field_T);
          var4 = (CharSequence) ((Object) "ff9040");
          gd.a(-20980, var3, var4, 5 + 13 * param0);
          this.field_T = var3.toString();
          if (param1 < -26) {
            break L0;
          } else {
            this.field_Q = (kg[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_T.indexOf("ffffff") != -1) {
              break L2;
            } else {
              th.a(100, th.field_F[18]);
              if (Torquing.field_u == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          th.a(100, th.field_F[17]);
          break L1;
        }
        th.a(100, th.field_F[19]);
    }

    final void a(byte param0) {
        int var2 = -38 % ((param0 - 62) / 48);
        this.field_x = Math.max(10, this.field_x);
    }

    final void a(byte param0, kh param1, int param2, int param3) {
        try {
            if (param0 != -68) {
                this.b((byte) 62);
            }
            this.field_H = param3;
            this.field_E = param2;
            this.field_P.b(0, param1);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "bi.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, sg param2, int param3) {
        kg var5 = null;
        int var6 = 0;
        kg[] var7 = null;
        int var8 = 0;
        kg var9 = null;
        kg[] stackIn_11_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Torquing.field_u;
        try {
          L0: {
            var9 = new kg(param2, param3, param1);
            var5 = var9;
            var6 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((this.field_Q.length ^ -1) >= (var6 ^ -1)) {
                    break L3;
                  } else {
                    stackIn_11_0 = this.field_Q;

                    if (var8 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_11_0[var6] == null) {
                          break L4;
                        } else {
                          if (this.field_Q[var6].field_a == null) {
                            break L4;
                          } else {
                            var6++;
                            if (var8 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      this.field_Q[var6] = var9;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                var6 = this.field_Q.length;
                stackIn_11_0 = new kg[var6 - -1];
                break L2;
              }
              L5: {
                var7 = stackIn_11_0;
                dk.a(this.field_Q, 0, var7, 0, var6);
                if (param0 == 538) {
                  break L5;
                } else {
                  this.field_L = -15;
                  break L5;
                }
              }
              var7[var6] = var9;
              this.field_Q = var7;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5_ref);

            stackIn_17_1 = new StringBuilder().append("bi.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) {
        sm var3;
        int stackIn_9_0 = 0;
        Torquing stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Torquing stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Torquing stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Torquing stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int var2;
        L0: {
          if (param0 == -103) {
            break L0;
          } else {
            var3 = (sm) null;
            bi.a((sm) null, -1);
            break L0;
          }
        }
        L1: {
          L2: {
            this.b(9);
            this.field_g = true;
            if (!je.a((byte) 77)) {
              break L2;
            } else {
              L3: {
                L4: {
                  if (this.field_U != 0) {
                    break L4;
                  } else {
                    if (-1 != (ao.field_f ^ -1)) {
                      break L4;
                    } else {
                      if (this.field_L == 0) {
                        stackIn_9_0 = 0;
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackIn_9_0 = 1;
                break L3;
              }
              L5: {
                var2 = stackIn_9_0;
                stackIn_11_0 = this.field_A;

                stackIn_11_1 = 1;

                if (var2 == 0) {
                  stackIn_12_0 = (Torquing) ((Object) stackIn_11_0);
                  stackIn_12_1 = stackIn_11_1;
                  stackIn_12_2 = 0;
                  break L5;
                } else {
                  stackIn_12_0 = (Torquing) ((Object) stackIn_11_0);
                  stackIn_12_1 = stackIn_11_1;
                  stackIn_12_2 = 7;
                  break L5;
                }
              }
              ((Torquing) (Object) stackIn_12_0).a(stackIn_12_1 != 0, stackIn_12_2, 1, false);
              if (Torquing.field_u == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L6: {
            stackIn_15_0 = this.field_A;

            stackIn_15_1 = 1;

            if (ao.field_f == 0) {
              stackIn_16_0 = (Torquing) ((Object) stackIn_15_0);
              stackIn_16_1 = stackIn_15_1;
              stackIn_16_2 = 2;
              break L6;
            } else {
              stackIn_16_0 = (Torquing) ((Object) stackIn_15_0);
              stackIn_16_1 = stackIn_15_1;
              stackIn_16_2 = 8;
              break L6;
            }
          }
          ((Torquing) (Object) stackIn_16_0).a(stackIn_16_1 != 0, stackIn_16_2, 1, false);
          break L1;
        }
    }

    private final void a(boolean param0, int param1) {
        tl[] var3 = null;
        int var4 = 0;
        tl var5 = null;
        pj var6 = null;
        int var7 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Torquing.field_u;
                    var3 = this.field_D;
                    var4 = 0;
                    if (!param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_v = 112;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if ((var4 ^ -1) <= (var3.length ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var5 = var3[var4];
                    if (var7 != 0) {
                        statePc = 10;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var5 == null) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (31 == var5.field_r) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var6 = var5.d(-2).field_k;
                    gq.a(var6.field_f, 4, param1);
                    gq.a(var6.field_s, 4, param1);
                    gq.a(var6.field_l, 4, param1);
                    if (var7 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var4++;
                    if (var7 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static we a(fj param0, byte param1) {
        RuntimeException var2 = null;
        java.applet.Applet var3 = null;
        we stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 13) {
                break L1;
              } else {
                var3 = (java.applet.Applet) null;
                bi.a((java.applet.Applet) null, (byte) 44);
                break L1;
              }
            }
            stackIn_3_0 = new we(param0.g(65536), param0.g(65536), param0.g(65536), param0.g(65536), param0.e((byte) 62), param0.e((byte) 62), param0.i((byte) -101));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("bi.BA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 77) {
                break L1;
              } else {
                field_f = (pc) null;
                break L1;
              }
            }
            L2: {
              if (qm.a(param1, (byte) 45) == null) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("bi.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(byte param0, int param1) {
        if (0 == (this.field_T.indexOf("ffffff") ^ -1)) {
            if (!((this.field_T.indexOf("ff9040") ^ -1) != 0)) {
                param1 = param1 * 2;
            }
        }
        this.field_j = this.field_j - param1;
        this.field_U = this.field_U + param1;
        this.field_s = this.field_U;
        if (param0 < 94) {
            sg var4 = (sg) null;
            this.a(91, -43, (sg) null, 50);
        }
    }

    final void a(int param0, double param1, double param2, sg param3, double param4, int param5) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_c < param5) {
                  break L2;
                } else {
                  fieldTemp$1 = this.field_c - 1;
                  this.field_c = this.field_c - 1;
                  if ((fieldTemp$1 ^ -1) <= -1) {
                    break L2;
                  } else {
                    this.field_P.a(param5 + 80);
                    this.a(538, 16, param3, this.field_P.field_c);
                    th.a(param5 ^ 100, th.field_F[14]);
                    th.a(100, th.field_F[15]);
                    if (Torquing.field_u == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              th.a(100, th.field_F[16]);
              break L1;
            }
            this.field_P.a(param1, param4, param5 + 1, param2);
            this.a(538, 0, param3, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (runtimeException);

            stackIn_9_1 = new StringBuilder().append("bi.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0) {
        this.field_c = this.field_c + 1;
        if (param0 != 0) {
            this.field_z = -49;
        }
    }

    final void f(int param0) {
        int var2 = 0;
        if (param0 != 1000) {
            this.field_G = 31;
        }
        this.field_i = tp.field_a;
        this.field_c = 0;
        this.a((byte) -68, tp.field_a, 1365, 80);
        this.field_j = this.field_j + this.field_U;
        if (!(ri.field_E >= 2)) {
            var2 = this.field_G & 63;
            this.field_S = this.field_S + (this.field_L - var2) * this.field_N;
            this.field_G = this.field_G + (this.field_L + -var2);
        }
        this.field_U = 0;
        this.h(-116);
    }

    final void b(int param0) {
        int var3;
        bm var4;
        bm var5;
        L0: {
          L1: {
            var3 = Torquing.field_u;
            if ((ri.field_E ^ -1) > -3) {
              break L1;
            } else {
              if (!this.field_t) {
                break L1;
              } else {
                this.field_M = 779830527;
                this.field_j = -this.field_U + 318907172;
                this.field_o = 1086213241;
                this.field_t = false;
                this.field_l = 2121488289;
                if (var3 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          if (0 >= this.field_U) {
            break L0;
          } else {
            if (gn.field_l != null) {
              break L0;
            } else {
              if (this.field_U <= 0) {
                return;
              } else {
                if (!je.a((byte) 85)) {
                  L2: {
                    var4 = vl.field_c;
                    var5 = var4;
                    if (var5 == null) {
                      break L2;
                    } else {
                      if (null == var5.field_p) {
                        break L2;
                      } else {
                        if (!bn.a(var4.field_p[1][9], -17310)) {
                          break L2;
                        } else {
                          if ((var4.field_n[1][9] ^ -1) >= (this.field_U ^ -1)) {
                            break L2;
                          } else {
                            gn.field_l = new wc(11, 65524, this.field_M, this.field_o, this.field_l, this.field_j, new int[]{this.field_U});
                            if (var3 == 0) {
                              break L0;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                  gn.field_l = va.a(true, this.field_j, this.field_M, 11, this.field_o, 3, this.field_l, new int[]{this.field_U}, 65524);
                  vl.field_c = null;
                  break L0;
                } else {
                  return;
                }
              }
            }
          }
        }
        L3: {
          if (param0 == 9) {
            break L3;
          } else {
            field_f = (pc) null;
            break L3;
          }
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int var4;
        qp var5;
        sm var6;
        L0: {
          if (param1 > 1) {
            break L0;
          } else {
            var6 = (sm) null;
            bi.a((sm) null, 34);
            break L0;
          }
        }
        var4 = 1 << param0;
        if ((var4 & fa.field_b ^ -1) != -1) {
          return;
        } else {
          L1: {
            ao.field_f = ao.field_f | var4;
            fa.field_b = fa.field_b | var4;
            this.field_B.a((byte) 54, new tj(param0));
            if (!this.field_t) {
              L2: {
                var5 = new qp(param0, param2, this.field_N, this.field_S, this.field_F, this.field_G);
                if (je.a((byte) 61)) {
                  break L2;
                } else {
                  wc.a(var5, (byte) 99, 4);
                  if (Torquing.field_u == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              jh.field_y.a((byte) 54, var5);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void c(byte param0) {
        if (param0 < 121) {
            this.a(-53);
        }
        this.field_P.e(66);
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            int var2_int = 0;
            java.net.URL var3 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2 = null;
            RuntimeException var2_ref = null;
            try {
              L0: {
                try {
                  L1: {
                    var2_int = 35 % ((param1 - -53) / 50);
                    var3 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                    param0.getAppletContext().showDocument(og.a(var3, param0, (byte) -70), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2 = (Exception) (Object) decompiledCaughtException;
                    var2.printStackTrace();
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_6_0 = (RuntimeException) (var2_ref);

                stackIn_6_1 = new StringBuilder().append("bi.A(");

                if (param0 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "null";
                  break L3;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "{...}";
                  break L3;
                }
              }
              throw rb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0) {
        sg discarded$0 = null;
        vn stackIn_60_0 = null;
        String stackIn_60_1 = null;
        int stackIn_60_2 = 0;
        int stackIn_60_3 = 0;
        vn stackIn_61_0 = null;
        String stackIn_61_1 = null;
        int stackIn_61_2 = 0;
        int stackIn_61_3 = 0;
        vn stackIn_62_0 = null;
        String stackIn_62_1 = null;
        int stackIn_62_2 = 0;
        int stackIn_62_3 = 0;
        int stackIn_62_4 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int[] var3_ref_int__ = null;
        String var3_ref_String = null;
        int var4 = 0;
        int var5_int = 0;
        t var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        kh var10 = null;
        sb var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Torquing.field_u;
                    if (this.field_c >= 0) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_c != -2147483648) {
                        statePc = 3;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ph.d(0, 0, ph.field_j, ph.field_d, 16777215);
                    this.field_c = -2147483648;
                    return;
                }
                case 4: {
                    var2 = this.field_q - 1;
                    if ((var2 ^ -1) > -1) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var2 < 8) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    gm.field_r[7].b(0, 0);
                    if (var8 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (1 != this.field_d.a(false)) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (null != hi.field_h[var2]) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    gm.field_r[var2].b(0, 0);
                    if (var8 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    hi.field_h[var2].b(0, 0);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (this.field_K < 0.0) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (ce.field_b) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    gj.field_i[1] = (int)((double)gj.field_i[1] + this.field_K);
                    if (var8 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.field_P.a(true, gj.field_i);
                    var3 = vf.field_j[this.field_v][0];
                    var4 = vf.field_j[this.field_v][1];
                    var5_int = vf.field_j[this.field_v][2];
                    gj.field_i[1] = gj.field_i[1] + (var4 * gj.field_i[7] + var3 * gj.field_i[4] + var5_int * gj.field_i[10] >> -207182928);
                    gj.field_i[0] = gj.field_i[0] + (gj.field_i[9] * var5_int + (gj.field_i[6] * var4 + var3 * gj.field_i[3]) >> 2033481328);
                    gj.field_i[2] = gj.field_i[2] + (gj.field_i[11] * var5_int + (var3 * gj.field_i[5] - -(var4 * gj.field_i[8])) >> 200640624);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    this.field_C.a(this.field_P.field_c, this.field_H, this.field_E, -1, -12, 12);
                    if (this.field_J) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (this.field_c < 0) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.field_P.b(1);
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var13 = this.field_m;
                    var12 = var13;
                    var9 = var12;
                    var3_ref_int__ = var9;
                    var4 = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if ((var13.length ^ -1) >= (var4 ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var5_int = var13[var4];
                    if (var8 != 0) {
                        statePc = 31;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (null != this.field_D[var5_int]) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    this.field_D[var5_int].b(1);
                    this.field_C.a(this.field_D[var5_int].field_c, 80, 1365, -1, -12, 12);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    var4++;
                    if (var8 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    sg.a(this.field_C.field_g[this.field_P.field_c], 80, 1365, -1, -12, 12);
                    sg.a(vc.field_c[1], 80, 1365, -1, -12, 12);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (!param0) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    this.e(14);
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    sg.a(vc.field_c[7], 80, 1365, -1, -12, 12);
                    var10 = (kh) ((Object) on.field_e.c((byte) -122));
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (var10 == null) {
                        statePc = 38;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    sg.a(var10, 80, 1365, -1, -12, 12);
                    var10 = (kh) ((Object) on.field_e.b((byte) -110));
                    if (var8 != 0) {
                        statePc = 81;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (var8 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var3 = 9;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var3 > 16) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    discarded$0 = this.field_C;
                    sg.a(vc.field_c[var3], 80, 1365, -1, -12, 12);
                    var3++;
                    if (var8 != 0) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (var8 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    this.field_C.a(gj.field_i);
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    var11 = (sb) ((Object) this.field_e.b(0));
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (var11 == null) {
                        statePc = 49;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var11.c(-103);
                    var11 = (sb) ((Object) this.field_e.f(-24059));
                    if (var8 != 0) {
                        statePc = 52;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (var8 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (!ti.field_k) {
                        statePc = 51;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 51: {
                    bd.field_w.e(-bd.field_w.field_s + 640, 0, 162);
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var3_ref_String = wh.a(this.field_k, (byte) -119);
                    if (this.field_d == ig.field_q) {
                        statePc = 59;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    dd.field_c.a(var3_ref_String, 628, 23, 16711680, -1);
                    if (10000 <= this.field_k) {
                        statePc = 59;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (this.field_J) {
                        statePc = 59;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if ((this.field_v ^ -1) == -1) {
                        statePc = 58;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    dd.field_c.c(var3_ref_String, 258, 224, 16711680, -1);
                    if (var8 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    dd.field_c.c(var3_ref_String, 344, 262, 16711680, -1);
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    stackIn_61_0 = dd.field_c;
                    stackIn_60_0 = stackIn_61_0;
                    stackIn_61_1 = Integer.toString(Math.abs(this.field_U));
                    stackIn_60_1 = stackIn_61_1;
                    stackIn_61_2 = 628;
                    stackIn_60_2 = stackIn_61_2;
                    stackIn_61_3 = 67;
                    stackIn_60_3 = stackIn_61_3;
                    if (!this.field_t) {
                        statePc = 61;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    stackIn_62_0 = (vn) ((Object) stackIn_60_0);
                    stackIn_62_1 = (String) ((Object) stackIn_60_1);
                    stackIn_62_2 = stackIn_60_2;
                    stackIn_62_3 = stackIn_60_3;
                    stackIn_62_4 = 16776960;
                    statePc = 62;
                    continue stateLoop;
                }
                case 61: {
                    stackIn_62_0 = (vn) ((Object) stackIn_61_0);
                    stackIn_62_1 = (String) ((Object) stackIn_61_1);
                    stackIn_62_2 = stackIn_61_2;
                    stackIn_62_3 = stackIn_61_3;
                    stackIn_62_4 = 16711680;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    ((vn) (Object) stackIn_62_0).a(stackIn_62_1, stackIn_62_2, stackIn_62_3, stackIn_62_4, -1);
                    var4 = 0;
                    var5_int = 528;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    if (8 <= var4) {
                        statePc = 73;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    stackIn_88_0 = -1;
                    stackIn_65_0 = stackIn_88_0;
                    stackIn_88_1 = dd.field_d >> var4 & 1 ^ -1;
                    stackIn_65_1 = stackIn_88_1;
                    if (var8 != 0) {
                        statePc = 88;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (stackIn_65_0 != stackIn_65_1) {
                        statePc = 69;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if ((1 & this.field_z >> var4 ^ -1) == -1) {
                        statePc = 71;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if ((this.field_k % 1000 ^ -1) <= -501) {
                        statePc = 71;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    ue.field_c[var4].e(var5_int, 118, 162);
                    if (var8 == 0) {
                        statePc = 72;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    ph.b(var5_int, 118, ue.field_c[var4].field_w, ue.field_c[var4].field_u, 16777215, 118);
                    ue.field_c[var4 + 8].e(var5_int, 118, 81);
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    var5_int = var5_int + ue.field_c[var4].field_w;
                    var4++;
                    if (var8 == 0) {
                        statePc = 63;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var4 = 0;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if ((this.field_c ^ -1) >= (var4 ^ -1)) {
                        statePc = 78;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    kk.field_n.d(583 - -(var4 * 8), 143);
                    var4++;
                    if (var8 != 0) {
                        statePc = 80;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (var8 == 0) {
                        statePc = 74;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (!this.field_w) {
                        statePc = 80;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    ia.field_f.d(553, 143);
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    dd.field_c.b(this.field_T, 538, 102, 16711680, -1);
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    if (-1 <= (this.field_r ^ -1)) {
                        statePc = 83;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var3 = (this.field_r - 1) / 1000;
                    var4 = -(1000 * var3) + this.field_r;
                    var5 = hq.field_h[var3];
                    var6 = var4 * var5.field_s / 1000;
                    var7 = var5.field_t * var4 / 1000;
                    var5.b((-var6 + 640) / 2, (480 - var7) / 2, var6, var7);
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    return;
                }
                case 84: {
                    if (var8 == 0) {
                        statePc = 90;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 86: {
                    kk.field_n.d(583 - -(var4 * 8), 143);
                    var4++;
                    if (var8 != 0) {
                        statePc = 80;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if (stackIn_88_0 >= stackIn_88_1) {
                        statePc = 78;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 90: {
                    stackIn_88_0 = this.field_c ^ -1;
                    stackIn_88_1 = var4 ^ -1;
                    statePc = 88;
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void i(int param0) {
        int stackIn_9_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_110_0 = 0;
        double stackIn_181_0 = 0.0;
        vg stackIn_188_0 = null;
        double[] stackIn_188_1 = null;
        int stackIn_188_2 = 0;
        double stackIn_188_3 = 0.0;
        int stackIn_188_4 = 0;
        int stackIn_188_5 = 0;
        vg stackIn_189_0 = null;
        double[] stackIn_189_1 = null;
        int stackIn_189_2 = 0;
        double stackIn_189_3 = 0.0;
        int stackIn_189_4 = 0;
        int stackIn_189_5 = 0;
        vg stackIn_190_0 = null;
        double[] stackIn_190_1 = null;
        int stackIn_190_2 = 0;
        double stackIn_190_3 = 0.0;
        int stackIn_190_4 = 0;
        int stackIn_190_5 = 0;
        int stackIn_190_6 = 0;
        int stackIn_202_0 = 0;
        kg[] stackIn_225_0 = null;
        Torquing stackIn_262_0 = null;
        int stackIn_262_1 = 0;
        Torquing stackIn_263_0 = null;
        int stackIn_263_1 = 0;
        Torquing stackIn_264_0 = null;
        int stackIn_264_1 = 0;
        int stackIn_264_2 = 0;
        int stackIn_271_0 = 0;
        Torquing stackIn_272_0 = null;
        int stackIn_272_1 = 0;
        Torquing stackIn_273_0 = null;
        int stackIn_273_1 = 0;
        Torquing stackIn_274_0 = null;
        int stackIn_274_1 = 0;
        int stackIn_274_2 = 0;
        kg[] stackIn_276_0 = null;
        Object stackIn_279_0 = null;
        Object stackIn_288_0 = null;
        Object stackIn_291_0 = null;
        tl stackIn_291_1 = null;
        Object stackIn_302_0 = null;
        Object stackIn_302_1 = null;
        Object stackIn_316_0 = null;
        Object stackIn_316_1 = null;
        tl stackOut_290_1;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        double[] var7 = null;
        int var8 = 0;
        pj var8_ref_pj = null;
        int var9_int = 0;
        Object var9 = null;
        double var9_double = 0.0;
        int var10 = 0;
        short[] var10_ref_short__ = null;
        double var10_double = 0.0;
        kg[] var10_ref_kg__ = null;
        int var11_int = 0;
        tl var11 = null;
        double var12_double = 0.0;
        kg var12 = null;
        double var14_double = 0.0;
        tl var14 = null;
        ed var16 = null;
        double var17 = 0.0;
        double var19 = 0.0;
        int var21 = 0;
        Object var22 = null;
        Object var23 = null;
        short[] var24 = null;
        ed var25 = null;
        double[] var26 = null;
        kg[] var29 = null;
        short[] var30 = null;
        double[] var31 = null;
        double[] var36 = null;
        int[] var37 = null;
        kh var38 = null;
        sb var39 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var22 = null;
                    var23 = null;
                    var21 = Torquing.field_u;
                    if (jb.a(110)) {
                        statePc = 3;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_J) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    np.a(la.field_k[this.field_q], false, 124);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    this.field_j = this.field_j + 1;
                    this.field_F = this.field_F - this.field_M;
                    this.field_S = this.field_S + this.field_M;
                    this.field_l = this.field_l + 1;
                    this.field_s = this.field_U;
                    if (-3 < (ri.field_E ^ -1)) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (!ce.field_b) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ko.field_b = false;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var2 = 0;
                    var3 = 0;
                    var4 = 0;
                    var5 = 0;
                    var6 = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (!ak.c(-85)) {
                        statePc = 109;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var7_int = po.field_z;
                    stackIn_110_0 = var7_int ^ -1;
                    stackIn_9_0 = stackIn_110_0;
                    if (var21 != 0) {
                        statePc = 110;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (stackIn_9_0 != -99) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var21 == 0) {
                        statePc = 43;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var7_int != 99) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var21 == 0) {
                        statePc = 46;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (-97 == (var7_int ^ -1)) {
                        statePc = 49;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (97 == var7_int) {
                        statePc = 52;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var7_int != 102) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (var21 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if ((var7_int ^ -1) != -105) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (var21 == 0) {
                        statePc = 57;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (-106 != (var7_int ^ -1)) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (var21 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (103 != var7_int) {
                        statePc = 29;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (var21 == 0) {
                        statePc = 61;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (42 == var7_int) {
                        statePc = 63;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if ((var7_int ^ -1) != -44) {
                        statePc = 33;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (var21 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (-101 == (var7_int ^ -1)) {
                        statePc = 69;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if ((var7_int ^ -1) == -83) {
                        statePc = 69;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (84 != var7_int) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (var21 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if ((var7_int ^ -1) != -84) {
                        statePc = 41;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (var21 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (-14 == (var7_int ^ -1)) {
                        statePc = 72;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (!mm.field_h) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    this.field_P.field_g[2] = this.field_P.field_g[2] + 10.0;
                    this.field_M = this.field_M + 1;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var3++;
                    if (var21 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var3--;
                    if (!mm.field_h) {
                        statePc = 73;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    this.field_P.field_g[2] = this.field_P.field_g[2] - 10.0;
                    this.field_M = this.field_M + 2;
                    if (var21 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var4++;
                    this.field_y = false;
                    if (mm.field_h) {
                        statePc = 51;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 51: {
                    this.field_P.field_g[0] = this.field_P.field_g[0] - 10.0;
                    this.field_M = this.field_M + 4;
                    if (var21 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    this.field_y = false;
                    var4--;
                    if (mm.field_h) {
                        statePc = 54;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 54: {
                    this.field_M = this.field_M + 8;
                    this.field_P.field_g[0] = this.field_P.field_g[0] + 10.0;
                    if (var21 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    this.field_y = false;
                    var4++;
                    var3++;
                    if (var21 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    this.field_y = false;
                    var3++;
                    var4--;
                    if (var21 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    this.field_y = false;
                    var3--;
                    var4--;
                    if (var21 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var4++;
                    this.field_y = false;
                    var3--;
                    if (var21 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (!mm.field_h) {
                        statePc = 73;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    this.field_M = this.field_M + 16;
                    this.field_P.field_g[1] = this.field_P.field_g[1] + 10.0;
                    if (var21 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (mm.field_h) {
                        statePc = 68;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 68: {
                    this.field_P.field_g[1] = this.field_P.field_g[1] - 10.0;
                    this.field_M = this.field_M + 32;
                    if (var21 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (!this.field_w) {
                        statePc = 73;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var6 = 1;
                    if (var21 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var5 = 1;
                    if (var21 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var2 = 1;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    if (2 <= ri.field_E) {
                        statePc = 75;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var7_int = po.field_z;
                    if (var7_int != 70) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (var21 == 0) {
                        statePc = 93;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (var7_int == 51) {
                        statePc = 95;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (38 != var7_int) {
                        statePc = 82;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (var21 == 0) {
                        statePc = 96;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (var7_int == 49) {
                        statePc = 97;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (var7_int != 101) {
                        statePc = 86;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (var21 == 0) {
                        statePc = 99;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (var7_int == 48) {
                        statePc = 100;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (-81 == (var7_int ^ -1)) {
                        statePc = 101;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if ((var7_int ^ -1) != -70) {
                        statePc = 91;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (var21 == 0) {
                        statePc = 101;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (-58 != (var7_int ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (var21 == 0) {
                        statePc = 105;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    ti.field_k = ti.field_k ^ true;
                    if (var21 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    ce.field_b = true;
                    if (var21 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    ce.field_b = false;
                    if (var21 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (!ce.field_b) {
                        statePc = 7;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    ko.field_b = true;
                    if (var21 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    this.field_k = this.field_k + 30000;
                    this.field_t = true;
                    if (var21 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    this.field_k = this.field_k - 1000;
                    if (var21 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    this.field_k = 0;
                    this.field_T = ki.a("ff9040", "ffffff", -93, this.field_T.toString());
                    this.g(62);
                    vl.field_c = null;
                    if (!je.a((byte) 117)) {
                        statePc = 103;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 103: {
                    gn.field_l = va.a(true, this.field_j, this.field_M, 11, this.field_o, 3, this.field_l, new int[]{this.field_U}, 65524);
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    this.field_l = this.field_l - this.field_U;
                    this.field_U = 0;
                    return;
                }
                case 105: {
                    if (i.field_P[81]) {
                        statePc = 107;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    stackIn_108_0 = 1;
                    statePc = 108;
                    continue stateLoop;
                }
                case 107: {
                    stackIn_108_0 = 0;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    mm.field_h = stackIn_108_0 != 0;
                    this.field_t = this.field_t | mm.field_h;
                    if (var21 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    var7_int = this.field_a[0];
                    stackIn_110_0 = be.field_o[var7_int * 32 & 2047];
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    var8 = stackIn_110_0;
                    var9_int = be.field_l[32 * var7_int & 2047];
                    this.field_a[0] = 0;
                    this.field_a[11] = var8;
                    this.field_a[3] = var8;
                    this.field_a[9] = var9_int;
                    this.field_a[5] = -var9_int;
                    this.field_P.field_h.a(vc.field_c[1], this.field_a);
                    var38 = (kh) ((Object) on.field_e.c((byte) -119));
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    if (var38 == null) {
                        statePc = 115;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    this.field_P.field_h.a(var38, this.field_a);
                    var38 = (kh) ((Object) on.field_e.b((byte) 72));
                    if (var21 != 0) {
                        statePc = 124;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    if (var21 == 0) {
                        statePc = 111;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var10 = 9;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    if (-17 > (var10 ^ -1)) {
                        statePc = 120;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    this.field_P.field_h.a(vc.field_c[var10], this.field_a);
                    var10++;
                    if (var21 != 0) {
                        statePc = 121;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if (var21 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    this.field_a[0] = 1 + var7_int;
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    if (0 != (7 & var7_int)) {
                        statePc = 123;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var30 = vc.field_c[9].field_l.field_m;
                    var24 = var30;
                    var10_ref_short__ = var24;
                    var11_int = (short)(65535 & var30[0] - -1024);
                    dk.a(var10_ref_short__, 0, var30.length, (short) var11_int);
                    this.field_M = this.field_M ^ var11_int << 613208131;
                    this.field_o = this.field_o ^ var11_int << 1035955139;
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    this.a(false, var7_int);
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    var39 = (sb) ((Object) this.field_e.b(0));
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    if (var39 == null) {
                        statePc = 129;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    var39.a((byte) -114);
                    var39 = (sb) ((Object) this.field_e.f(-24059));
                    if (var21 != 0) {
                        statePc = 311;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    if (var21 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if (var2 != 0) {
                        statePc = 131;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 131: {
                    this.field_A.a(true, 1, 2, false);
                    return;
                }
                case 132: {
                    if ((ri.field_E ^ -1) > -3) {
                        statePc = 136;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    if (!ce.field_b) {
                        statePc = 136;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if (ko.field_b) {
                        statePc = 136;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    return;
                }
                case 136: {
                    if (-1 > (this.field_r ^ -1)) {
                        statePc = 138;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 138: {
                    if (-1001 != (this.field_r ^ -1)) {
                        statePc = 141;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    th.a(100, th.field_F[4]);
                    if (var21 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    if (-2001 == (this.field_r ^ -1)) {
                        statePc = 148;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (-3001 == (this.field_r ^ -1)) {
                        statePc = 146;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if ((this.field_r ^ -1) < -21) {
                        statePc = 149;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    qj.a(this.field_r, -5205, 96, th.field_F[5]);
                    if (var21 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    th.a(100, th.field_F[2]);
                    if (var21 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    th.a(100, th.field_F[3]);
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    this.field_r = this.field_r - 20;
                    return;
                }
                case 150: {
                    if (-1 <= (this.field_x ^ -1)) {
                        statePc = 157;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if ((this.field_x ^ -1) <= -513) {
                        statePc = 157;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    var25 = ql.field_u;
                    this.field_x = Math.min(512, this.field_x + 10);
                    bc.field_a.a(true);
                    var25.a(0.0, 0.0, 1.0, (byte) 51, 3.141592653589793 * (double)(il.field_m[this.field_v][2] * 2) / 2048.0);
                    bc.field_a.a(var25, 65536);
                    var25.a(1.0, 0.0, 0.0, (byte) 54, 3.141592653589793 * (double)(2 * il.field_m[this.field_v][0]) / 2048.0);
                    bc.field_a.a(var25, 65536);
                    var25.a(0.0, 1.0, 0.0, (byte) 63, (double)(il.field_m[this.field_v][1] * 2) * 3.141592653589793 / 2048.0);
                    bc.field_a.a(var25, 65536);
                    var25.a(0.0, 0.0, 1.0, (byte) 87, 3.141592653589793 * (double)(2 * -this.field_x) / 2048.0);
                    bc.field_a.a(var25, 65536);
                    bc.field_a.a(gj.field_i, (byte) 113);
                    re.field_d[0] = 80.0 * (double)be.field_l[this.field_x] / 65535.0;
                    re.field_d[1] = (double)be.field_o[this.field_x] * 80.0 / 65535.0;
                    this.field_h = Double.NEGATIVE_INFINITY;
                    var8_ref_pj = this.field_d.a(-100, false).field_k;
                    var9_int = -1 + var8_ref_pj.field_k;
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    if (-1 < (var9_int ^ -1)) {
                        statePc = 157;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    this.field_h = Math.max(this.field_h, re.field_d[1] * (double)var8_ref_pj.field_y[var9_int] + (1000.0 + (double)var8_ref_pj.field_j[var9_int] * re.field_d[0]) + (double)var8_ref_pj.field_v[var9_int] * re.field_d[2]);
                    var9_int--;
                    if (var21 != 0) {
                        statePc = 158;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if (var21 == 0) {
                        statePc = 153;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var3 = Math.min(Math.max(var3, -10), 10);
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    var7 = new double[3];
                    var7[0] = 2670.0 * (double)(be.field_o[this.field_x] * var3) / 65535.0;
                    var7[1] = 2670.0 * (double)(-be.field_l[this.field_x] * var3) / 65535.0;
                    var7[2] = (double)Math.min(Math.max(var4, -10), 10) * 2670.0;
                    if ((this.field_c ^ -1) > -1) {
                        statePc = 162;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if (mm.field_h) {
                        statePc = 162;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    if (!this.field_J) {
                        statePc = 187;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    if (!mm.field_h) {
                        statePc = 164;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    this.field_P.c(0);
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    var8 = 1;
                    if (!this.field_J) {
                        statePc = 203;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    var31 = new double[4];
                    var26 = var31;
                    var9 = var26;
                    ap.a(this.field_P.field_g, 6, this.field_P.field_g, 10, (double[]) (var9), 0, 0.08);
                    var10 = 0;
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    if (-5 >= (var10 ^ -1)) {
                        statePc = 170;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    this.field_P.field_g[var10 + 6] = this.field_P.field_g[var10 + 6] + var31[var10];
                    var10++;
                    if (var21 != 0) {
                        statePc = 172;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if (var21 == 0) {
                        statePc = 166;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    var10 = 0;
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    if ((var10 ^ -1) <= -4) {
                        statePc = 176;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    this.field_P.field_g[10 - -var10] = this.field_P.field_g[10 - -var10] * 0.8;
                    var10++;
                    if (var21 != 0) {
                        statePc = 203;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    if (var21 == 0) {
                        statePc = 172;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    var10_double = 0.1;
                    var12_double = this.field_P.field_g[8];
                    if (var12_double >= 1.0) {
                        statePc = 180;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    if (-1.0 < var12_double) {
                        statePc = 179;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    stackIn_181_0 = 3.141592653589793;
                    statePc = 181;
                    continue stateLoop;
                }
                case 179: {
                    stackIn_181_0 = Math.acos(var12_double);
                    statePc = 181;
                    continue stateLoop;
                }
                case 180: {
                    stackIn_181_0 = 0.0;
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    var14_double = stackIn_181_0;
                    var16 = ql.field_u;
                    if (0.0001 > var14_double) {
                        statePc = 184;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    if (3.141492653589793 >= var14_double) {
                        statePc = 185;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    var19 = var10_double;
                    var17 = 1.0 - var10_double;
                    if (var21 == 0) {
                        statePc = 186;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    var17 = Math.sin((-var10_double + 1.0) * var14_double);
                    var19 = Math.sin(var14_double * var10_double);
                    statePc = 186;
                    continue stateLoop;
                }
                case 186: {
                    var16.field_b = var19 + var17 * this.field_P.field_g[8];
                    var16.field_d = this.field_P.field_g[7] * var17;
                    var16.field_a = var17 * this.field_P.field_g[6];
                    var16.field_e = this.field_P.field_g[9] * var17;
                    var16.a((byte) -123);
                    this.field_P.field_g[8] = var16.field_b;
                    this.field_P.field_g[6] = var16.field_a;
                    this.field_P.field_g[7] = var16.field_d;
                    this.field_P.field_g[9] = var16.field_e;
                    this.field_P.c(0);
                    this.field_P.field_h.a(this.field_P.field_h.field_g[this.field_P.field_c], this.field_P.field_f);
                    statePc = 203;
                    continue stateLoop;
                }
                case 187: {
                    stackIn_189_0 = this.field_P;
                    stackIn_188_0 = stackIn_189_0;
                    stackIn_189_1 = (double[]) (var7);
                    stackIn_188_1 = stackIn_189_1;
                    stackIn_189_2 = var5;
                    stackIn_188_2 = stackIn_189_2;
                    stackIn_189_3 = 0.08;
                    stackIn_188_3 = stackIn_189_3;
                    stackIn_189_4 = var6;
                    stackIn_188_4 = stackIn_189_4;
                    stackIn_189_5 = 0;
                    stackIn_188_5 = stackIn_189_5;
                    if (this.field_d != ig.field_q) {
                        statePc = 189;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    stackIn_190_0 = (vg) ((Object) stackIn_188_0);
                    stackIn_190_1 = (double[]) ((Object) stackIn_188_1);
                    stackIn_190_2 = stackIn_188_2;
                    stackIn_190_3 = stackIn_188_3;
                    stackIn_190_4 = stackIn_188_4;
                    stackIn_190_5 = stackIn_188_5;
                    stackIn_190_6 = 1;
                    statePc = 190;
                    continue stateLoop;
                }
                case 189: {
                    stackIn_190_0 = (vg) ((Object) stackIn_189_0);
                    stackIn_190_1 = (double[]) ((Object) stackIn_189_1);
                    stackIn_190_2 = stackIn_189_2;
                    stackIn_190_3 = stackIn_189_3;
                    stackIn_190_4 = stackIn_189_4;
                    stackIn_190_5 = stackIn_189_5;
                    stackIn_190_6 = 0;
                    statePc = 190;
                    continue stateLoop;
                }
                case 190: {
                    var9_double = ((vg) (Object) stackIn_190_0).a(stackIn_190_1, stackIn_190_2 != 0, stackIn_190_3, stackIn_190_4 != 0, stackIn_190_5, stackIn_190_6 != 0);
                    if (!this.field_y) {
                        statePc = 195;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    if (this.field_P.field_g[2] > 1400.0) {
                        statePc = 195;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    if (0.0 <= this.field_P.field_g[5]) {
                        statePc = 194;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 194: {
                    this.a(14, (byte) 127, 241);
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    if (var9_double <= this.field_h) {
                        statePc = 199;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    if (-1.0 == this.field_K) {
                        statePc = 198;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 198: {
                    this.field_K = 0.08 * this.field_P.field_g[4];
                    th.a(100, th.field_F[22]);
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    if (var9_double >= 100000.0 + this.field_h) {
                        statePc = 201;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    stackIn_202_0 = 1;
                    statePc = 202;
                    continue stateLoop;
                }
                case 201: {
                    stackIn_202_0 = 0;
                    statePc = 202;
                    continue stateLoop;
                }
                case 202: {
                    var8 = stackIn_202_0;
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    if (ig.field_q == this.field_d) {
                        statePc = 205;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 205: {
                    var36 = this.field_d.f(14);
                    this.field_P.field_g[0] = var36[0];
                    this.field_P.field_g[2] = var36[2];
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    var37 = this.field_m;
                    var10 = 0;
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    if ((var37.length ^ -1) >= (var10 ^ -1)) {
                        statePc = 220;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    var11_int = var37[var10];
                    if (var21 != 0) {
                        statePc = 222;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    if (this.field_D[var11_int] == null) {
                        statePc = 219;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    var12_double = this.field_D[var11_int].a(0, 0.08);
                    if (var12_double > this.field_h + 100000.0) {
                        statePc = 212;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 212: {
                    var14 = this.field_D[var11_int];
                    this.a(538, 0, var14.field_h, var14.field_c);
                    if (null == ig.field_r[13]) {
                        statePc = 214;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 214: {
                    ig.field_r[13] = nj.a(th.field_F[13], 100, 96);
                    statePc = 215;
                    continue stateLoop;
                }
                case 215: {
                    if (!ig.field_r[13].e(17)) {
                        statePc = 217;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 217: {
                    ig.field_r[13].c(0);
                    ni.a(ig.field_r[13], true);
                    statePc = 218;
                    continue stateLoop;
                }
                case 218: {
                    this.field_D[var11_int] = null;
                    statePc = 219;
                    continue stateLoop;
                }
                case 219: {
                    var10++;
                    if (var21 == 0) {
                        statePc = 207;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    if (param0 > 35) {
                        statePc = 222;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    return;
                }
                case 222: {
                    var9_int = 0;
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    if ((this.field_Q.length ^ -1) >= (var9_int ^ -1)) {
                        statePc = 230;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    stackIn_276_0 = this.field_Q;
                    stackIn_225_0 = stackIn_276_0;
                    if (var21 != 0) {
                        statePc = 276;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    if (stackIn_225_0[var9_int] == null) {
                        statePc = 229;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    this.field_Q[var9_int].a(true);
                    if (this.field_Q[var9_int].field_a == null) {
                        statePc = 228;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 228: {
                    this.field_Q[var9_int] = null;
                    statePc = 229;
                    continue stateLoop;
                }
                case 229: {
                    var9_int++;
                    if (var21 == 0) {
                        statePc = 223;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    if (!this.field_J) {
                        statePc = 232;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 232: {
                    this.field_k = this.field_k - 20;
                    if (this.field_d == ig.field_q) {
                        statePc = 237;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    if (10000 < this.field_k) {
                        statePc = 237;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (0 >= this.field_k) {
                        statePc = 237;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    if (-21 >= ((20 + (this.field_k + -1)) % 1000 ^ -1)) {
                        statePc = 237;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    th.a(100, th.field_F[20]);
                    statePc = 237;
                    continue stateLoop;
                }
                case 237: {
                    if (!this.field_J) {
                        statePc = 250;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    if (this.field_k <= 0) {
                        statePc = 243;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    var9_int = 300;
                    if (this.field_k < var9_int) {
                        statePc = 241;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 241: {
                    var9_int = this.field_k;
                    statePc = 242;
                    continue stateLoop;
                }
                case 242: {
                    this.field_k = this.field_k - var9_int;
                    this.a((byte) 115, (1 + this.field_d.field_s) * var9_int / 100);
                    if (var21 == 0) {
                        statePc = 285;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    if (this.field_d.field_m == null) {
                        statePc = 246;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    if ((wi.field_a[this.field_L - -1] ^ -1) == (wi.field_a[this.field_L] ^ -1)) {
                        statePc = 248;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    this.field_A.a(true, wi.field_a[this.field_L], 8, false);
                    if (var21 == 0) {
                        statePc = 285;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    this.field_A.a(true, this.field_L + 1, 6, false);
                    if (var21 == 0) {
                        statePc = 285;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    if (ig.field_q == this.field_d) {
                        statePc = 255;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    if (0 < this.field_k) {
                        statePc = 255;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    if (this.field_k <= -20) {
                        statePc = 255;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    this.b(12, 1);
                    th.a(100, th.field_F[21]);
                    if (var21 == 0) {
                        statePc = 285;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    if (var8 != 0) {
                        statePc = 258;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    this.b(12, 0);
                    if (var21 == 0) {
                        statePc = 285;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    if ((this.field_c ^ -1) > -1) {
                        statePc = 275;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    if (0 <= this.field_k) {
                        statePc = 285;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    this.b(9);
                    this.field_g = true;
                    if (je.a((byte) 69)) {
                        statePc = 265;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    stackIn_263_0 = this.field_A;
                    stackIn_262_0 = stackIn_263_0;
                    stackIn_263_1 = 1;
                    stackIn_262_1 = stackIn_263_1;
                    if (0 != ao.field_f) {
                        statePc = 263;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    stackIn_264_0 = (Torquing) ((Object) stackIn_262_0);
                    stackIn_264_1 = stackIn_262_1;
                    stackIn_264_2 = 2;
                    statePc = 264;
                    continue stateLoop;
                }
                case 263: {
                    stackIn_264_0 = (Torquing) ((Object) stackIn_263_0);
                    stackIn_264_1 = stackIn_263_1;
                    stackIn_264_2 = 8;
                    statePc = 264;
                    continue stateLoop;
                }
                case 264: {
                    ((Torquing) (Object) stackIn_264_0).a(stackIn_264_1 != 0, stackIn_264_2, 2, false);
                    if (var21 == 0) {
                        statePc = 285;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    if (this.field_U != 0) {
                        statePc = 269;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    if (ao.field_f != 0) {
                        statePc = 269;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    if ((this.field_L ^ -1) == -1) {
                        statePc = 270;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    stackIn_271_0 = 1;
                    statePc = 271;
                    continue stateLoop;
                }
                case 270: {
                    stackIn_271_0 = 0;
                    statePc = 271;
                    continue stateLoop;
                }
                case 271: {
                    var9_int = stackIn_271_0;
                    stackIn_273_0 = this.field_A;
                    stackIn_272_0 = stackIn_273_0;
                    stackIn_273_1 = 1;
                    stackIn_272_1 = stackIn_273_1;
                    if (var9_int == 0) {
                        statePc = 273;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    stackIn_274_0 = (Torquing) ((Object) stackIn_272_0);
                    stackIn_274_1 = stackIn_272_1;
                    stackIn_274_2 = 7;
                    statePc = 274;
                    continue stateLoop;
                }
                case 273: {
                    stackIn_274_0 = (Torquing) ((Object) stackIn_273_0);
                    stackIn_274_1 = stackIn_273_1;
                    stackIn_274_2 = 0;
                    statePc = 274;
                    continue stateLoop;
                }
                case 274: {
                    ((Torquing) (Object) stackIn_274_0).a(stackIn_274_1 != 0, stackIn_274_2, 2, false);
                    if (var21 == 0) {
                        statePc = 285;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    var9_int = 1;
                    stackIn_276_0 = this.field_Q;
                    statePc = 276;
                    continue stateLoop;
                }
                case 276: {
                    var29 = stackIn_276_0;
                    var10_ref_kg__ = var29;
                    var11_int = 0;
                    statePc = 277;
                    continue stateLoop;
                }
                case 277: {
                    if ((var29.length ^ -1) >= (var11_int ^ -1)) {
                        statePc = 282;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    var12 = var29[var11_int];
                    stackIn_288_0 = null;
                    stackIn_279_0 = stackIn_288_0;
                    if (var21 != 0) {
                        statePc = 288;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    if (stackIn_279_0 == var12) {
                        statePc = 281;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    var9_int = 0;
                    statePc = 281;
                    continue stateLoop;
                }
                case 281: {
                    var11_int++;
                    if (var21 == 0) {
                        statePc = 277;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 282: {
                    if (var9_int != 0) {
                        statePc = 284;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 284: {
                    this.b(12, 2);
                    statePc = 285;
                    continue stateLoop;
                }
                case 285: {
                    if (this.field_g) {
                        statePc = 306;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 286: {
                    if (this.field_J) {
                        statePc = 306;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    stackIn_288_0 = null;
                    statePc = 288;
                    continue stateLoop;
                }
                case 288: {
                    var9 = stackIn_288_0;
                    var10 = 0;
                    statePc = 289;
                    continue stateLoop;
                }
                case 289: {
                    if ((var10 ^ -1) <= (this.field_D.length ^ -1)) {
                        statePc = 318;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 290: {
                    var11 = this.field_D[var10];
                    stackIn_302_0 = null;
                    stackIn_291_0 = stackIn_302_0;
                    stackOut_290_1 = (tl) (var11);
                    stackIn_302_1 = stackOut_290_1;
                    stackIn_291_1 = stackOut_290_1;
                    if (var21 != 0) {
                        statePc = 302;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    if (stackIn_291_0 == stackIn_291_1) {
                        statePc = 299;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    if ((var11.field_r ^ -1) == -4) {
                        statePc = 299;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 293: {
                    if (-26 < (var11.field_r ^ -1)) {
                        statePc = 297;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    if ((var11.field_r ^ -1) < -32) {
                        statePc = 297;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    if (var21 == 0) {
                        statePc = 299;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    if (!var11.a(0, this.field_P.field_g)) {
                        statePc = 299;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    var11.field_t = (tl) (var9);
                    var9 = var11;
                    var11.a(80);
                    this.field_D[var10] = null;
                    statePc = 299;
                    continue stateLoop;
                }
                case 299: {
                    var10++;
                    if (var21 == 0) {
                        statePc = 289;
                    } else {
                        statePc = 318;
                    }
                    continue stateLoop;
                }
                case 301: {
                    stackIn_302_0 = null;
                    stackIn_302_1 = var9;
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    if (stackIn_302_0 == stackIn_302_1) {
                        statePc = 306;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 303: {
                    ((tl) (var9)).a((bi) (this), 19);
                    var9 = ((tl) (var9)).field_t;
                    if (var21 != 0) {
                        statePc = 310;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    if (var21 == 0) {
                        statePc = 301;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 306: {
                    if (jb.field_d != 10) {
                        statePc = 310;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    if (la.field_k[10].e(17)) {
                        statePc = 310;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 308: {
                    np.a(la.field_k[this.field_q], false, 127);
                    statePc = 310;
                    continue stateLoop;
                }
                case 310: {
                    return;
                }
                case 311: {
                    return;
                }
                case 312: {
                    if (var21 == 0) {
                        statePc = 318;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 314: {
                    ((tl) (var9)).a((bi) (this), 19);
                    var9 = ((tl) (var9)).field_t;
                    if (var21 != 0) {
                        statePc = 310;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 316: {
                    if (stackIn_316_0 == stackIn_316_1) {
                        statePc = 306;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 318: {
                    stackIn_316_0 = null;
                    stackIn_316_1 = var9;
                    statePc = 316;
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(int param0) {
        field_u = null;
        field_I = null;
        field_f = null;
        if (param0 != -3) {
            sm var2 = (sm) null;
            bi.a((sm) null, 58);
        }
    }

    private final void b(int param0, int param1) {
        this.b(param0 ^ 5);
        eq.field_b = param1;
        this.field_A.a(true, 5, 2, false);
        la.field_k[param0].a(false);
        jh.a(la.field_k[12], param0 ^ 12);
    }

    bi(Torquing param0, int param1) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException runtimeException = null;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        StringBuilder var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Torquing.field_u;
                    this.field_t = false;
                    this.field_e = new ei();
                    this.field_B = new ei();
                    this.field_E = 1365;
                    this.field_N = -17;
                    this.field_S = -1878996731;
                    this.field_L = 0;
                    this.field_H = 80;
                    this.field_w = false;
                    this.field_F = 68616224;
                    this.field_G = 0;
                    this.field_i = tp.field_a;
                    this.field_n = 0;
                    this.field_v = 0;
                    this.field_a = new int[]{0, 0, 0, 65535, 0, 0, 0, 65535, 0, 0, 0, 65535};
                    this.field_Q = new kg[1];
                    this.field_c = 0;
                    this.field_b = new int[qc.field_ab.length];
                    this.field_z = 0;
                    this.field_J = false;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_o = 50456792;
                        this.field_A = param0;
                        dd.field_d = 0;
                        ao.field_f = 0;
                        this.field_M = -1046390103;
                        this.field_G = this.field_G + (param1 + (param1 << -954880442));
                        this.field_S = this.field_S + this.field_N * ((param1 << -1531723610) + param1);
                        this.field_l = -547216422;
                        this.field_j = 538264946;
                        this.field_L = param1;
                        if (null != gj.field_i) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        gj.field_i = new int[12];
                        ap.a(gj.field_i, il.field_m[this.field_v]);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (this.field_T != null) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6 = new StringBuilder(104);
                        var3 = var6;
                        var4 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var4 ^ -1) <= -9) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        discarded$2 = var3.append("<col=ffffff>");
                        discarded$3 = var3.append(fh.field_s.charAt(var4));
                        var4++;
                        if (var5 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var5 == 0) {
                            statePc = 5;
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
                        this.field_T = var6.toString();
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
                        this.field_d = ol.field_f[param1];
                        this.field_q = 1 + wi.field_a[param1];
                        this.field_P = new vg();
                        this.h(104);
                        vl.field_c = null;
                        gn.field_l = null;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_13_0 = (RuntimeException) (runtimeException);
                    stackIn_12_0 = stackIn_13_0;
                    stackIn_13_1 = new StringBuilder().append("bi.<init>(");
                    stackIn_12_1 = stackIn_13_1;
                    if (param0 == null) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_14_2 = "{...}";
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_14_2 = "null";
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    throw rb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_u = null;
        field_I = "Suggested names: ";
    }
}
