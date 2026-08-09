/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gja extends ka {
    private eo field_S;
    private int field_I;
    private short field_T;
    private gca[] field_nb;
    private int[][] field_D;
    private short[] field_m;
    private int field_i;
    private short[] field_P;
    private int field_H;
    private short[] field_lb;
    private int[] field_j;
    private int field_v;
    private hg field_d;
    private int[] field_R;
    private short[] field_M;
    private int field_Q;
    private float[] field_eb;
    private int field_L;
    private hg field_E;
    private int[] field_r;
    private boolean field_F;
    private int[] field_U;
    private short[] field_V;
    private int[][] field_q;
    private boolean field_f;
    private short[] field_jb;
    static boolean[] field_B;
    private byte[] field_C;
    private int[] field_J;
    private rga[] field_s;
    private float[] field_t;
    private hg field_ib;
    private int field_h;
    private gg field_g;
    private int field_K;
    private short[] field_G;
    private short[] field_p;
    private short[] field_kb;
    static String field_bb;
    private mca field_e;
    private ava[] field_X;
    private int field_n;
    private short[] field_hb;
    private int field_W;
    private short[] field_gb;
    static int field_x;
    private int[][] field_mb;
    private int field_fb;
    private int field_y;
    private int field_o;
    private hg field_O;
    private boolean field_A;
    private short field_ab;
    private int field_Y;
    private byte[] field_w;
    private int[] field_l;
    private ll[] field_u;
    private int[] field_Z;
    private boolean field_N;
    private short[] field_z;
    private short[] field_db;
    private int field_cb;
    static String field_k;

    gja(eo param0, oc param1, int param2, int param3, int param4, int param5) {
        this(param0, param2, param5, true, false);
        int fieldTemp$0 = 0;
        short dupTemp$1 = 0;
        short dupTemp$2 = 0;
        short dupTemp$3 = 0;
        gta dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] arrayValue$7 = null;
        int stackIn_36_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_86_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        int stackIn_120_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_123_1 = 0;
        int stackIn_125_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_142_1 = 0;
        int stackIn_158_0 = 0;
        int stackIn_158_1 = 0;
        int stackIn_165_0 = 0;
        int stackIn_175_0 = 0;
        oc stackIn_178_0 = null;
        int stackIn_190_0 = 0;
        int stackIn_295_0 = 0;
        int stackIn_308_0 = 0;
        int stackIn_308_1 = 0;
        int stackIn_316_0 = 0;
        int stackIn_316_1 = 0;
        oc stackIn_351_0 = null;
        int stackIn_354_0 = 0;
        int stackIn_354_1 = 0;
        int stackIn_358_0 = 0;
        int stackIn_358_1 = 0;
        int stackIn_371_0 = 0;
        int stackIn_371_1 = 0;
        RuntimeException stackIn_390_0 = null;
        StringBuilder stackIn_390_1 = null;
        RuntimeException stackIn_392_0 = null;
        StringBuilder stackIn_392_1 = null;
        RuntimeException stackIn_393_0 = null;
        StringBuilder stackIn_393_1 = null;
        String stackIn_393_2 = null;
        RuntimeException stackIn_394_0 = null;
        StringBuilder stackIn_394_1 = null;
        RuntimeException stackIn_396_0 = null;
        StringBuilder stackIn_396_1 = null;
        RuntimeException stackIn_397_0 = null;
        StringBuilder stackIn_397_1 = null;
        String stackIn_397_2 = null;
        Throwable caughtException = null;
        int statePc = 0;
        d var7 = null;
        RuntimeException var7_ref = null;
        int[] var8 = null;
        int var9_int = 0;
        long[] var9 = null;
        dw var10_ref_dw = null;
        int var10 = 0;
        int var11_int = 0;
        eda[] var11 = null;
        int var12 = 0;
        Object var13_ref = null;
        int var13 = 0;
        int var14_int = 0;
        lp var14 = null;
        ima var14_ref = null;
        int var15_int = 0;
        gta[] var15 = null;
        int var16 = 0;
        int var17_int = 0;
        int[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        jt var20_ref_jt = null;
        int var20 = 0;
        lp var21_ref_lp = null;
        int var21 = 0;
        dw var22_ref_dw = null;
        int var22 = 0;
        float var22_float = 0.0f;
        int var23_int = 0;
        float var23 = 0.0f;
        int var24_int = 0;
        float var24 = 0.0f;
        int var25_int = 0;
        float var25 = 0.0f;
        int var26_int = 0;
        float var26 = 0.0f;
        int var27_int = 0;
        float var27 = 0.0f;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        gta var31_ref_gta = null;
        eda var31_ref_eda = null;
        int var31 = 0;
        int var32_int = 0;
        long var32_long = 0L;
        gta var32 = null;
        int var33_int = 0;
        long var33 = 0L;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37_int = 0;
        eda var37 = null;
        float var38_float = 0.0f;
        float[] var38 = null;
        float var39_float = 0.0f;
        int var39 = 0;
        float var40 = 0.0f;
        float var41 = 0.0f;
        float var42 = 0.0f;
        float var43_float = 0.0f;
        int var43 = 0;
        float var44_float = 0.0f;
        int var44 = 0;
        float var45_float = 0.0f;
        int var45 = 0;
        float var46_float = 0.0f;
        int var46 = 0;
        float var47_float = 0.0f;
        int var47 = 0;
        float var48_float = 0.0f;
        int var48 = 0;
        float var49_float = 0.0f;
        int var49 = 0;
        float var50_float = 0.0f;
        int var50 = 0;
        float var51_float = 0.0f;
        int var51 = 0;
        float var52 = 0.0f;
        float var53 = 0.0f;
        float var54 = 0.0f;
        float var55 = 0.0f;
        float var56 = 0.0f;
        float var57 = 0.0f;
        float var58 = 0.0f;
        float var59 = 0.0f;
        float var60 = 0.0f;
        float var61 = 0.0f;
        float var62 = 0.0f;
        int var63 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var63 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var7 = param0.field_c;
                    this.field_J = new int[1 + param1.field_L];
                    var8 = new int[param1.field_o];
                    var9_int = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if ((var9_int ^ -1) <= (param1.field_o ^ -1)) {
                        statePc = 31;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var63 != 0) {
                        statePc = 32;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (param1.field_G == null) {
                        statePc = 13;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (2 != param1.field_G[var9_int]) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var63 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (param1.field_r == null) {
                        statePc = 28;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (param1.field_r[var9_int] != -1) {
                        statePc = 21;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var10_ref_dw = var7.a((byte) -71, param1.field_r[var9_int] & 65535);
                    if ((64 & this.field_h) == 0) {
                        statePc = 25;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (var10_ref_dw.field_p) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var10_ref_dw.field_f) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    fieldTemp$0 = this.field_I;
                    this.field_I = this.field_I + 1;
                    var8[fieldTemp$0] = var9_int;
                    dupTemp$1 = param1.field_a[var9_int];
                    this.field_J[dupTemp$1] = this.field_J[dupTemp$1] + 1;
                    dupTemp$2 = param1.field_t[var9_int];
                    this.field_J[dupTemp$2] = this.field_J[dupTemp$2] + 1;
                    dupTemp$3 = param1.field_J[var9_int];
                    this.field_J[dupTemp$3] = this.field_J[dupTemp$3] + 1;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    var9_int++;
                    if (var63 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    this.field_v = this.field_I;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var9 = new long[this.field_I];
                    if ((this.field_Y & 256 ^ -1) == -1) {
                        statePc = 35;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_36_0 = 1;
                    statePc = 36;
                    continue stateLoop;
                }
                case 35: {
                    stackIn_36_0 = 0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    var10 = stackIn_36_0;
                    var11_int = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (this.field_I <= var11_int) {
                        statePc = 98;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var12 = var8[var11_int];
                    var13_ref = null;
                    var14_int = 0;
                    var15_int = 0;
                    var16 = 0;
                    var17_int = 0;
                    if (var63 != 0) {
                        statePc = 99;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (null != param1.field_m) {
                        statePc = 44;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var18 = 0;
                    var19 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if ((param1.field_m.length ^ -1) >= (var19 ^ -1)) {
                        statePc = 57;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var20_ref_jt = param1.field_m[var19];
                    stackIn_65_0 = var12;
                    stackIn_47_0 = stackIn_65_0;
                    stackIn_65_1 = var20_ref_jt.field_a;
                    stackIn_47_1 = stackIn_65_1;
                    if (var63 != 0) {
                        statePc = 65;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (stackIn_47_0 != stackIn_47_1) {
                        statePc = 56;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var21_ref_lp = fw.a(var20_ref_jt.field_d, false);
                    if (!var21_ref_lp.field_i) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var18 = 1;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (-1 == var21_ref_lp.field_f) {
                        statePc = 56;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var22_ref_dw = var7.a((byte) 103, var21_ref_lp.field_f);
                    if (2 != var22_ref_dw.field_d) {
                        statePc = 56;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    this.field_f = true;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    var19++;
                    if (var63 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (var18 == 0) {
                        statePc = 61;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var9[var11_int] = 9223372036854775807L;
                    this.field_v = this.field_v - 1;
                    if (var63 == 0) {
                        statePc = 97;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var18 = -1;
                    if (null != param1.field_r) {
                        statePc = 64;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var18 = param1.field_r[var12];
                    stackIn_65_0 = -1;
                    stackIn_65_1 = var18;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    if (stackIn_65_0 != stackIn_65_1) {
                        statePc = 67;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var13_ref = var7.a((byte) -27, var18 & 65535);
                    if (0 == (this.field_h & 64)) {
                        statePc = 71;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (((dw) (var13_ref)).field_p) {
                        statePc = 72;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var17_int = ((dw) (var13_ref)).field_a;
                    var16 = ((dw) (var13_ref)).field_h;
                    if (var63 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var18 = -1;
                    var13_ref = null;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    if (null == param1.field_n) {
                        statePc = 77;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (0 != param1.field_n[var12]) {
                        statePc = 83;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (var13_ref == null) {
                        statePc = 85;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (((dw) (var13_ref)).field_d == 0) {
                        statePc = 85;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    stackIn_86_0 = 1;
                    statePc = 86;
                    continue stateLoop;
                }
                case 85: {
                    stackIn_86_0 = 0;
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    var19 = stackIn_86_0;
                    if (var10 != 0) {
                        statePc = 90;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (var19 == 0) {
                        statePc = 94;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (param1.field_C == null) {
                        statePc = 94;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var14_int = var14_int + (param1.field_C[var12] << 828183153);
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    if (var19 == 0) {
                        statePc = 96;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var14_int = var14_int + 65536;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    var14_int = var14_int + (var16 << -1553559672 & 65280);
                    var15_int = var15_int + (var18 << -591675856 & -65536);
                    var14_int = var14_int + (255 & var17_int);
                    var15_int = var15_int + (65535 & var11_int);
                    var9[var11_int] = (long)var15_int + ((long)var14_int << -1743052128);
                    this.field_f = this.field_f | var19 != 0;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    var11_int++;
                    if (var63 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    ofa.a(var8, var9, 67);
                    this.field_hb = param1.field_y;
                    this.field_W = param1.field_L;
                    this.field_r = param1.field_I;
                    this.field_y = param1.field_E;
                    this.field_l = param1.field_p;
                    this.field_Z = param1.field_b;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    var11 = new eda[this.field_W];
                    this.field_s = param1.field_e;
                    this.field_X = param1.field_B;
                    if (null != param1.field_m) {
                        statePc = 102;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 102: {
                    this.field_L = param1.field_m.length;
                    this.field_u = new ll[this.field_L];
                    this.field_nb = new gca[this.field_L];
                    var12 = 0;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    if (this.field_L <= var12) {
                        statePc = 124;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var13_ref = param1.field_m[var12];
                    var14 = fw.a(((jt) (var13_ref)).field_d, false);
                    var15_int = -1;
                    stackIn_125_0 = 0;
                    stackIn_105_0 = stackIn_125_0;
                    if (var63 != 0) {
                        statePc = 125;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    var16 = stackIn_105_0;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    if ((this.field_I ^ -1) >= (var16 ^ -1)) {
                        statePc = 115;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    stackIn_116_0 = ((jt) (var13_ref)).field_a ^ -1;
                    stackIn_108_0 = stackIn_116_0;
                    stackIn_116_1 = var8[var16] ^ -1;
                    stackIn_108_1 = stackIn_116_1;
                    if (var63 != 0) {
                        statePc = 116;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (stackIn_108_0 != stackIn_108_1) {
                        statePc = 112;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    var15_int = var16;
                    if (var63 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var16++;
                    if (var63 == 0) {
                        statePc = 106;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    stackIn_116_0 = -1;
                    stackIn_116_1 = var15_int;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    if (stackIn_116_0 != stackIn_116_1) {
                        statePc = 119;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    throw new RuntimeException();
                }
                case 119: {
                    var16 = 16777215 & cla.field_m[65535 & param1.field_A[((jt) (var13_ref)).field_a]];
                    stackIn_122_0 = var16;
                    stackIn_120_0 = stackIn_122_0;
                    if (param1.field_n != null) {
                        statePc = 122;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    stackIn_123_0 = stackIn_120_0;
                    stackIn_123_1 = 0;
                    statePc = 123;
                    continue stateLoop;
                }
                case 122: {
                    stackIn_123_0 = stackIn_122_0;
                    stackIn_123_1 = param1.field_n[((jt) (var13_ref)).field_a];
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    var16 = stackIn_123_0 | -stackIn_123_1 + 255 << 196408536;
                    this.field_u[var12] = new ll(var15_int, (int) param1.field_a[((jt) (var13_ref)).field_a], (int) param1.field_t[((jt) (var13_ref)).field_a], (int) param1.field_J[((jt) (var13_ref)).field_a], var14.field_d, var14.field_b, var14.field_f, var14.field_c, var14.field_e, var14.field_i, var14.field_a, ((jt) (var13_ref)).field_c);
                    this.field_nb[var12] = new gca(var16);
                    var12++;
                    if (var63 == 0) {
                        statePc = 103;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    stackIn_125_0 = 3 * this.field_I;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    var12 = stackIn_125_0;
                    this.field_db = new short[var12];
                    this.field_V = new short[this.field_I];
                    this.field_eb = new float[var12];
                    this.field_M = new short[this.field_I];
                    this.field_p = new short[var12];
                    this.field_C = new byte[this.field_I];
                    this.field_w = new byte[var12];
                    this.field_kb = new short[var12];
                    this.field_ab = (short)param4;
                    this.field_lb = new short[var12];
                    if (null != param1.field_h) {
                        statePc = 128;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 128: {
                    this.field_jb = new short[this.field_I];
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    this.field_gb = new short[this.field_I];
                    tl.field_q = new long[var12];
                    this.field_T = (short)param3;
                    this.field_t = new float[var12];
                    this.field_P = new short[this.field_I];
                    this.field_z = new short[this.field_I];
                    this.field_G = new short[var12];
                    this.field_m = new short[var12];
                    var13 = 0;
                    var14_int = 0;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    if (var14_int >= param1.field_L) {
                        statePc = 135;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    var15_int = this.field_J[var14_int];
                    this.field_J[var14_int] = var13;
                    var11[var14_int] = new eda();
                    var13 = var13 + var15_int;
                    var14_int++;
                    if (var63 != 0) {
                        statePc = 136;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if (var63 == 0) {
                        statePc = 130;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    this.field_J[param1.field_L] = var13;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    var14_ref = qqa.a(var8, param1, this.field_I, (byte) -6);
                    var15 = new gta[param1.field_o];
                    var16 = 0;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    if (var16 >= param1.field_o) {
                        statePc = 174;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var17_int = param1.field_a[var16];
                    var18 = param1.field_t[var16];
                    var19 = param1.field_J[var16];
                    var20 = this.field_Z[var18] - this.field_Z[var17_int];
                    var21 = this.field_r[var18] + -this.field_r[var17_int];
                    var22 = -this.field_l[var17_int] + this.field_l[var18];
                    var23_int = this.field_Z[var19] + -this.field_Z[var17_int];
                    var24_int = -this.field_r[var17_int] + this.field_r[var19];
                    var25_int = this.field_l[var19] - this.field_l[var17_int];
                    var26_int = -(var22 * var24_int) + var25_int * var21;
                    var27_int = -(var20 * var25_int) + var23_int * var22;
                    stackIn_175_0 = -(var21 * var23_int) + var24_int * var20;
                    stackIn_139_0 = stackIn_175_0;
                    if (var63 != 0) {
                        statePc = 175;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    var28 = stackIn_139_0;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if (var26_int > 8192) {
                        statePc = 157;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    stackIn_158_0 = var27_int ^ -1;
                    stackIn_142_0 = stackIn_158_0;
                    stackIn_158_1 = -8193;
                    stackIn_142_1 = stackIn_158_1;
                    if (var63 != 0) {
                        statePc = 158;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (stackIn_142_0 < stackIn_142_1) {
                        statePc = 157;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if ((var28 ^ -1) < -8193) {
                        statePc = 157;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    if (var26_int < -8192) {
                        statePc = 157;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if (8191 < (var27_int ^ -1)) {
                        statePc = 157;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    if (8191 >= (var28 ^ -1)) {
                        statePc = 159;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var26_int = var26_int >> 1;
                    var27_int = var27_int >> 1;
                    stackIn_158_0 = var28;
                    stackIn_158_1 = 1;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    var28 = stackIn_158_0 >> stackIn_158_1;
                    if (var63 == 0) {
                        statePc = 140;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    var29 = (int)Math.sqrt((double)(var27_int * var27_int + (var26_int * var26_int + var28 * var28)));
                    if (0 < var29) {
                        statePc = 161;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    var29 = 1;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    var26_int = 256 * var26_int / var29;
                    var28 = var28 * 256 / var29;
                    var27_int = 256 * var27_int / var29;
                    if (null == param1.field_G) {
                        statePc = 164;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    stackIn_165_0 = param1.field_G[var16];
                    statePc = 165;
                    continue stateLoop;
                }
                case 164: {
                    stackIn_165_0 = 0;
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    var30 = stackIn_165_0;
                    if ((var30 ^ -1) == -1) {
                        statePc = 172;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if ((var30 ^ -1) == -2) {
                        statePc = 171;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 171: {
                    dupTemp$4 = new gta();
                    var15[var16] = dupTemp$4;
                    var31_ref_gta = dupTemp$4;
                    var31_ref_gta.field_c = var26_int;
                    var31_ref_gta.field_h = var28;
                    var31_ref_gta.field_d = var27_int;
                    if (var63 == 0) {
                        statePc = 173;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    var31_ref_eda = var11[var17_int];
                    var31_ref_eda.field_c = var31_ref_eda.field_c + 1;
                    var31_ref_eda.field_b = var31_ref_eda.field_b + var26_int;
                    var31_ref_eda.field_d = var31_ref_eda.field_d + var27_int;
                    var31_ref_eda.field_a = var31_ref_eda.field_a + var28;
                    var31_ref_eda = var11[var18];
                    var31_ref_eda.field_b = var31_ref_eda.field_b + var26_int;
                    var31_ref_eda.field_a = var31_ref_eda.field_a + var28;
                    var31_ref_eda.field_d = var31_ref_eda.field_d + var27_int;
                    var31_ref_eda.field_c = var31_ref_eda.field_c + 1;
                    var31_ref_eda = var11[var19];
                    var31_ref_eda.field_b = var31_ref_eda.field_b + var26_int;
                    var31_ref_eda.field_c = var31_ref_eda.field_c + 1;
                    var31_ref_eda.field_a = var31_ref_eda.field_a + var28;
                    var31_ref_eda.field_d = var31_ref_eda.field_d + var27_int;
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    var16++;
                    if (var63 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    stackIn_175_0 = 0;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    var16 = stackIn_175_0;
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    if (this.field_I <= var16) {
                        statePc = 304;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    var17_int = var8[var16];
                    var18 = 65535 & param1.field_A[var17_int];
                    stackIn_351_0 = (oc) (param1);
                    stackIn_178_0 = stackIn_351_0;
                    if (var63 != 0) {
                        statePc = 351;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    if (stackIn_178_0.field_g == null) {
                        statePc = 182;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    var19 = param1.field_g[var17_int];
                    if (var63 == 0) {
                        statePc = 183;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    var19 = -1;
                    statePc = 183;
                    continue stateLoop;
                }
                case 183: {
                    if (null != param1.field_n) {
                        statePc = 185;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    var20 = 0;
                    if (var63 == 0) {
                        statePc = 186;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    var20 = 255 & param1.field_n[var17_int];
                    statePc = 186;
                    continue stateLoop;
                }
                case 186: {
                    if (null != param1.field_r) {
                        statePc = 189;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    stackIn_190_0 = -1;
                    statePc = 190;
                    continue stateLoop;
                }
                case 189: {
                    stackIn_190_0 = param1.field_r[var17_int];
                    statePc = 190;
                    continue stateLoop;
                }
                case 190: {
                    var21 = stackIn_190_0;
                    if (0 == (var21 ^ -1)) {
                        statePc = 198;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    if (0 != (this.field_h & 64)) {
                        statePc = 196;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 196: {
                    var22_ref_dw = var7.a((byte) 2, 65535 & var21);
                    if (!var22_ref_dw.field_p) {
                        statePc = 198;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    var21 = -1;
                    statePc = 198;
                    continue stateLoop;
                }
                case 198: {
                    var22_float = 0.0f;
                    var23 = 0.0f;
                    var24 = 0.0f;
                    var25 = 0.0f;
                    var26 = 0.0f;
                    var27 = 0.0f;
                    var28 = 0;
                    var29 = 0;
                    var30 = 0;
                    if ((var21 ^ -1) == 0) {
                        statePc = 283;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    if (0 != (var19 ^ -1)) {
                        statePc = 203;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    var27 = 0.0f;
                    var25 = 1.0f;
                    var22_float = 0.0f;
                    var28 = 1;
                    var24 = 1.0f;
                    var26 = 0.0f;
                    var29 = 2;
                    var23 = 1.0f;
                    if (var63 == 0) {
                        statePc = 283;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    var19 = var19 & 255;
                    var31 = param1.field_u[var19];
                    if (var31 != 0) {
                        statePc = 205;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    var32_int = param1.field_a[var17_int];
                    var33_int = param1.field_t[var17_int];
                    var34 = param1.field_J[var17_int];
                    var35 = param1.field_s[var19];
                    var36 = param1.field_q[var19];
                    var37_int = param1.field_K[var19];
                    var38_float = (float)param1.field_b[var35];
                    var39_float = (float)param1.field_I[var35];
                    var40 = (float)param1.field_p[var35];
                    var41 = (float)param1.field_b[var36] - var38_float;
                    var42 = (float)param1.field_I[var36] - var39_float;
                    var43_float = -var40 + (float)param1.field_p[var36];
                    var44_float = -var38_float + (float)param1.field_b[var37_int];
                    var45_float = (float)param1.field_I[var37_int] - var39_float;
                    var46_float = -var40 + (float)param1.field_p[var37_int];
                    var47_float = (float)param1.field_b[var32_int] - var38_float;
                    var48_float = (float)param1.field_I[var32_int] - var39_float;
                    var49_float = -var40 + (float)param1.field_p[var32_int];
                    var50_float = -var38_float + (float)param1.field_b[var33_int];
                    var51_float = -var39_float + (float)param1.field_I[var33_int];
                    var52 = (float)param1.field_p[var33_int] - var40;
                    var53 = (float)param1.field_b[var34] - var38_float;
                    var54 = (float)param1.field_I[var34] - var39_float;
                    var55 = (float)param1.field_p[var34] - var40;
                    var56 = -(var43_float * var45_float) + var46_float * var42;
                    var57 = -(var41 * var46_float) + var44_float * var43_float;
                    var58 = -(var42 * var44_float) + var45_float * var41;
                    var59 = var58 * var45_float - var57 * var46_float;
                    var60 = -(var58 * var44_float) + var46_float * var56;
                    var61 = -(var45_float * var56) + var44_float * var57;
                    var62 = 1.0f / (var41 * var59 + var60 * var42 + var61 * var43_float);
                    var24 = var62 * (var50_float * var59 + var60 * var51_float + var52 * var61);
                    var22_float = (var47_float * var59 + var48_float * var60 + var49_float * var61) * var62;
                    var26 = var62 * (var53 * var59 + var60 * var54 + var55 * var61);
                    var59 = -(var57 * var43_float) + var58 * var42;
                    var60 = var43_float * var56 - var58 * var41;
                    var61 = -(var42 * var56) + var41 * var57;
                    var62 = 1.0f / (var61 * var46_float + (var60 * var45_float + var59 * var44_float));
                    var27 = (var61 * var55 + (var54 * var60 + var53 * var59)) * var62;
                    var25 = (var59 * var50_float + var60 * var51_float + var52 * var61) * var62;
                    var23 = var62 * (var59 * var47_float + var48_float * var60 + var61 * var49_float);
                    if (var63 == 0) {
                        statePc = 283;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    var32_int = param1.field_a[var17_int];
                    var33_int = param1.field_t[var17_int];
                    var34 = param1.field_J[var17_int];
                    var35 = var14_ref.field_a[var19];
                    var36 = var14_ref.field_c[var19];
                    var37_int = var14_ref.field_d[var19];
                    var38 = var14_ref.field_b[var19];
                    var39 = param1.field_z[var19];
                    var40 = (float)param1.field_d[var19] / 256.0f;
                    if ((var31 ^ -1) == -2) {
                        statePc = 250;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    if (-3 == (var31 ^ -1)) {
                        statePc = 249;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    if ((var31 ^ -1) != -4) {
                        statePc = 283;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    ifa.a(param1.field_p[var32_int], param1.field_b[var32_int], var36, var37_int, rn.field_a, var40, var39, var35, var38, (byte) -44, param1.field_I[var32_int]);
                    var23 = rn.field_a[1];
                    var22_float = rn.field_a[0];
                    ifa.a(param1.field_p[var33_int], param1.field_b[var33_int], var36, var37_int, rn.field_a, var40, var39, var35, var38, (byte) -44, param1.field_I[var33_int]);
                    var24 = rn.field_a[0];
                    var25 = rn.field_a[1];
                    ifa.a(param1.field_p[var34], param1.field_b[var34], var36, var37_int, rn.field_a, var40, var39, var35, var38, (byte) -44, param1.field_I[var34]);
                    var27 = rn.field_a[1];
                    var26 = rn.field_a[0];
                    if (-1 != (1 & var39 ^ -1)) {
                        statePc = 231;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    if (0.5f < var26 - var22_float) {
                        statePc = 222;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    if (0.5f < -var26 + var22_float) {
                        statePc = 221;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 221: {
                    var29 = 2;
                    var26 = var26 + 1.0f;
                    if (var63 == 0) {
                        statePc = 223;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    var26 = var26 - 1.0f;
                    var29 = 1;
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    if (var24 - var22_float > 0.5f) {
                        statePc = 230;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    if (0.5f < var22_float - var24) {
                        statePc = 229;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 229: {
                    var28 = 2;
                    var24 = var24 + 1.0f;
                    if (var63 == 0) {
                        statePc = 283;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    var28 = 1;
                    var24 = var24 - 1.0f;
                    if (var63 == 0) {
                        statePc = 283;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    if (0.5f < var27 - var23) {
                        statePc = 240;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (-var27 + var23 > 0.5f) {
                        statePc = 239;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 239: {
                    var27 = var27 + 1.0f;
                    var29 = 2;
                    if (var63 == 0) {
                        statePc = 241;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    var27 = var27 - 1.0f;
                    var29 = 1;
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    if (0.5f >= var25 - var23) {
                        statePc = 243;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    var25 = var25 - 1.0f;
                    var28 = 1;
                    if (var63 == 0) {
                        statePc = 283;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    if (0.5f < var23 - var25) {
                        statePc = 248;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 248: {
                    var28 = 2;
                    var25 = var25 + 1.0f;
                    if (var63 == 0) {
                        statePc = 283;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    var41 = (float)param1.field_v[var19] / 256.0f;
                    var42 = (float)param1.field_c[var19] / 256.0f;
                    var43 = param1.field_b[var33_int] + -param1.field_b[var32_int];
                    var44 = param1.field_I[var33_int] + -param1.field_I[var32_int];
                    var45 = param1.field_p[var33_int] + -param1.field_p[var32_int];
                    var46 = param1.field_b[var34] + -param1.field_b[var32_int];
                    var47 = param1.field_I[var34] + -param1.field_I[var32_int];
                    var48 = -param1.field_p[var32_int] + param1.field_p[var34];
                    var49 = var44 * var48 - var47 * var45;
                    var50 = -(var43 * var48) + var46 * var45;
                    var51 = -(var44 * var46) + var47 * var43;
                    var52 = 64.0f / (float)param1.field_j[var19];
                    var53 = 64.0f / (float)param1.field_f[var19];
                    var54 = 64.0f / (float)param1.field_x[var19];
                    var55 = (var38[2] * (float)var51 + (var38[0] * (float)var49 + var38[1] * (float)var50)) / var52;
                    var56 = (var38[4] * (float)var50 + var38[3] * (float)var49 + (float)var51 * var38[5]) / var53;
                    var57 = ((float)var51 * var38[8] + (var38[6] * (float)var49 + var38[7] * (float)var50)) / var54;
                    var30 = mr.a(var57, var56, false, var55);
                    as.a(var36, rn.field_a, param1.field_I[var32_int], var35, var42, var37_int, var41, param1.field_b[var32_int], var30, param1.field_p[var32_int], -102, var40, var39, var38);
                    var22_float = rn.field_a[0];
                    var23 = rn.field_a[1];
                    as.a(var36, rn.field_a, param1.field_I[var33_int], var35, var42, var37_int, var41, param1.field_b[var33_int], var30, param1.field_p[var33_int], 32, var40, var39, var38);
                    var25 = rn.field_a[1];
                    var24 = rn.field_a[0];
                    as.a(var36, rn.field_a, param1.field_I[var34], var35, var42, var37_int, var41, param1.field_b[var34], var30, param1.field_p[var34], 79, var40, var39, var38);
                    var26 = rn.field_a[0];
                    var27 = rn.field_a[1];
                    if (var63 == 0) {
                        statePc = 283;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    var41 = (float)param1.field_x[var19] / 1024.0f;
                    loa.a(var39, rn.field_a, var41, param1.field_p[var32_int], param1.field_I[var32_int], -126, var38, var40, var36, var37_int, param1.field_b[var32_int], var35);
                    var22_float = rn.field_a[0];
                    var23 = rn.field_a[1];
                    loa.a(var39, rn.field_a, var41, param1.field_p[var33_int], param1.field_I[var33_int], 72, var38, var40, var36, var37_int, param1.field_b[var33_int], var35);
                    var24 = rn.field_a[0];
                    var25 = rn.field_a[1];
                    loa.a(var39, rn.field_a, var41, param1.field_p[var34], param1.field_I[var34], -108, var38, var40, var36, var37_int, param1.field_b[var34], var35);
                    var27 = rn.field_a[1];
                    var26 = rn.field_a[0];
                    var42 = var41 / 2.0f;
                    if ((1 & var39 ^ -1) != -1) {
                        statePc = 269;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    if (-var22_float + var24 > var42) {
                        statePc = 260;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    if (-var24 + var22_float > var42) {
                        statePc = 259;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 259: {
                    var28 = 2;
                    var24 = var24 + var41;
                    if (var63 == 0) {
                        statePc = 261;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    var28 = 1;
                    var24 = var24 - var41;
                    statePc = 261;
                    continue stateLoop;
                }
                case 261: {
                    if (var42 < var26 - var22_float) {
                        statePc = 268;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    if (-var26 + var22_float > var42) {
                        statePc = 267;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 267: {
                    var26 = var26 + var41;
                    var29 = 2;
                    if (var63 == 0) {
                        statePc = 283;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    var29 = 1;
                    var26 = var26 - var41;
                    if (var63 == 0) {
                        statePc = 283;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    if (var25 - var23 <= var42) {
                        statePc = 273;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    var28 = 1;
                    var25 = var25 - var41;
                    if (var63 == 0) {
                        statePc = 277;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    if (-var25 + var23 <= var42) {
                        statePc = 277;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    var25 = var25 + var41;
                    var28 = 2;
                    statePc = 277;
                    continue stateLoop;
                }
                case 277: {
                    if (-var23 + var27 > var42) {
                        statePc = 282;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    if (-var27 + var23 <= var42) {
                        statePc = 283;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    var27 = var27 + var41;
                    var29 = 2;
                    if (var63 == 0) {
                        statePc = 283;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 282: {
                    var29 = 1;
                    var27 = var27 - var41;
                    statePc = 283;
                    continue stateLoop;
                }
                case 283: {
                    if (null != param1.field_G) {
                        statePc = 285;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    var31 = 0;
                    if (var63 == 0) {
                        statePc = 286;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    var31 = param1.field_G[var17_int];
                    statePc = 286;
                    continue stateLoop;
                }
                case 286: {
                    if (0 != var31) {
                        statePc = 288;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    var32_long = (long)(var19 << 2028038562) + ((long)(var18 << -730046072) + (long)(var30 << -561891880) - -(long)var20 << 63058080);
                    var34 = param1.field_a[var17_int];
                    var35 = param1.field_t[var17_int];
                    var36 = param1.field_J[var17_int];
                    var37 = var11[var34];
                    this.field_M[var16] = this.a(var37.field_d, var16, var22_float, var34, var37.field_a, var37.field_c, var32_long, var37.field_b, var23, true, param1);
                    var37 = var11[var35];
                    this.field_z[var16] = this.a(var37.field_d, var16, var24, var35, var37.field_a, var37.field_c, var32_long + (long)var28, var37.field_b, var25, true, param1);
                    var37 = var11[var36];
                    this.field_V[var16] = this.a(var37.field_d, var16, var26, var36, var37.field_a, var37.field_c, var32_long + (long)var29, var37.field_b, var27, true, param1);
                    if (var63 == 0) {
                        statePc = 296;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    if (-2 != (var31 ^ -1)) {
                        statePc = 296;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    var32 = var15[var17_int];
                    if (0 >= var32.field_c) {
                        statePc = 294;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    stackIn_295_0 = 1024;
                    statePc = 295;
                    continue stateLoop;
                }
                case 294: {
                    stackIn_295_0 = 2048;
                    statePc = 295;
                    continue stateLoop;
                }
                case 295: {
                    var33 = (long)(stackIn_295_0 + ((var19 << -1545577054) + (var32.field_d + 256 << -148287444)) - -(var32.field_h - -256 << -1303013514)) - -((long)var20 + (long)(var30 << 1658284536) + (long)(var18 << -1751739576) << 1321630816);
                    this.field_M[var16] = this.a(var32.field_d, var16, var22_float, (int) param1.field_a[var17_int], var32.field_h, 0, var33, var32.field_c, var23, true, param1);
                    this.field_z[var16] = this.a(var32.field_d, var16, var24, (int) param1.field_t[var17_int], var32.field_h, 0, (long)var28 + var33, var32.field_c, var25, true, param1);
                    this.field_V[var16] = this.a(var32.field_d, var16, var26, (int) param1.field_J[var17_int], var32.field_h, 0, (long)var29 + var33, var32.field_c, var27, true, param1);
                    statePc = 296;
                    continue stateLoop;
                }
                case 296: {
                    if (null == param1.field_n) {
                        statePc = 299;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    this.field_C[var16] = param1.field_n[var17_int];
                    statePc = 299;
                    continue stateLoop;
                }
                case 299: {
                    if (param1.field_h != null) {
                        statePc = 302;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 302: {
                    this.field_jb[var16] = param1.field_h[var17_int];
                    statePc = 303;
                    continue stateLoop;
                }
                case 303: {
                    this.field_P[var16] = param1.field_A[var17_int];
                    this.field_gb[var16] = (short) var21;
                    var16++;
                    if (var63 == 0) {
                        statePc = 176;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    if ((this.field_v ^ -1) >= -1) {
                        statePc = 338;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 305: {
                    var16 = 1;
                    var17_int = this.field_gb[0];
                    var18 = 0;
                    statePc = 306;
                    continue stateLoop;
                }
                case 306: {
                    if ((this.field_v ^ -1) >= (var18 ^ -1)) {
                        statePc = 313;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    var19 = this.field_gb[var18];
                    stackIn_354_0 = var19;
                    stackIn_308_0 = stackIn_354_0;
                    stackIn_354_1 = var17_int;
                    stackIn_308_1 = stackIn_354_1;
                    if (var63 != 0) {
                        statePc = 354;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 308: {
                    if (stackIn_308_0 == stackIn_308_1) {
                        statePc = 312;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    var16++;
                    var17_int = var19;
                    statePc = 312;
                    continue stateLoop;
                }
                case 312: {
                    var18++;
                    if (var63 == 0) {
                        statePc = 306;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 313: {
                    this.field_U = new int[var16 - -1];
                    this.field_j = new int[var16];
                    this.field_R = new int[var16];
                    this.field_U[0] = 0;
                    var18 = this.field_fb;
                    var17_int = this.field_gb[0];
                    var16 = 0;
                    var19 = 0;
                    var20 = 0;
                    statePc = 314;
                    continue stateLoop;
                }
                case 314: {
                    if ((var20 ^ -1) <= (this.field_v ^ -1)) {
                        statePc = 337;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 315: {
                    var21 = this.field_gb[var20];
                    stackIn_354_0 = var17_int;
                    stackIn_316_0 = stackIn_354_0;
                    stackIn_354_1 = var21;
                    stackIn_316_1 = stackIn_354_1;
                    if (var63 != 0) {
                        statePc = 354;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 316: {
                    if (stackIn_316_0 == stackIn_316_1) {
                        statePc = 320;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    this.field_j[var16] = var18;
                    this.field_R[var16] = 1 + var19 - var18;
                    var16++;
                    this.field_U[var16] = var20;
                    var18 = this.field_fb;
                    var17_int = var21;
                    var19 = 0;
                    statePc = 320;
                    continue stateLoop;
                }
                case 320: {
                    var22 = this.field_M[var20];
                    if (var22 < var18) {
                        statePc = 323;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 323: {
                    var18 = var22;
                    statePc = 324;
                    continue stateLoop;
                }
                case 324: {
                    if (var19 < var22) {
                        statePc = 327;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 327: {
                    var19 = var22;
                    statePc = 328;
                    continue stateLoop;
                }
                case 328: {
                    var22 = this.field_z[var20];
                    if ((var22 ^ -1) >= (var19 ^ -1)) {
                        statePc = 330;
                    } else {
                        statePc = 329;
                    }
                    continue stateLoop;
                }
                case 329: {
                    var19 = var22;
                    statePc = 330;
                    continue stateLoop;
                }
                case 330: {
                    if (var18 <= var22) {
                        statePc = 332;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 331: {
                    var18 = var22;
                    statePc = 332;
                    continue stateLoop;
                }
                case 332: {
                    var22 = this.field_V[var20];
                    if ((var19 ^ -1) <= (var22 ^ -1)) {
                        statePc = 334;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    var19 = var22;
                    statePc = 334;
                    continue stateLoop;
                }
                case 334: {
                    if (var18 <= var22) {
                        statePc = 336;
                    } else {
                        statePc = 335;
                    }
                    continue stateLoop;
                }
                case 335: {
                    var18 = var22;
                    statePc = 336;
                    continue stateLoop;
                }
                case 336: {
                    var20++;
                    if (var63 == 0) {
                        statePc = 314;
                    } else {
                        statePc = 337;
                    }
                    continue stateLoop;
                }
                case 337: {
                    this.field_j[var16] = var18;
                    this.field_R[var16] = 1 + -var18 + var19;
                    var16++;
                    this.field_U[var16] = this.field_v;
                    statePc = 338;
                    continue stateLoop;
                }
                case 338: {
                    tl.field_q = null;
                    this.field_kb = op.a(this.field_kb, 119, this.field_fb);
                    this.field_G = op.a(this.field_G, 112, this.field_fb);
                    this.field_lb = op.a(this.field_lb, 114, this.field_fb);
                    this.field_m = op.a(this.field_m, 114, this.field_fb);
                    this.field_p = op.a(this.field_p, 123, this.field_fb);
                    this.field_w = kaa.a(0, this.field_w, this.field_fb);
                    this.field_eb = fba.a(1, this.field_eb, this.field_fb);
                    this.field_t = fba.a(1, this.field_t, this.field_fb);
                    if (null == param1.field_l) {
                        statePc = 344;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    if (!qr.d(param2, this.field_h, 32)) {
                        statePc = 344;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 342: {
                    this.field_D = param1.a(false, (byte) 64);
                    statePc = 344;
                    continue stateLoop;
                }
                case 344: {
                    if (null == param1.field_m) {
                        statePc = 350;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    if (!ub.a(this.field_h, param2, (byte) -122)) {
                        statePc = 350;
                    } else {
                        statePc = 348;
                    }
                    continue stateLoop;
                }
                case 348: {
                    this.field_mb = param1.b((byte) -124);
                    statePc = 350;
                    continue stateLoop;
                }
                case 350: {
                    stackIn_351_0 = (oc) (param1);
                    statePc = 351;
                    continue stateLoop;
                }
                case 351: {
                    if (stackIn_351_0.field_D == null) {
                        statePc = 398;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 352: {
                    stackIn_354_0 = param2;
                    stackIn_354_1 = this.field_h;
                    statePc = 354;
                    continue stateLoop;
                }
                case 354: {
                    if (!ofa.a(stackIn_354_0, stackIn_354_1, (byte) -126)) {
                        statePc = 398;
                    } else {
                        statePc = 355;
                    }
                    continue stateLoop;
                }
                case 355: {
                    var16 = 0;
                    var17 = new int[256];
                    var18 = 0;
                    statePc = 356;
                    continue stateLoop;
                }
                case 356: {
                    if ((this.field_I ^ -1) >= (var18 ^ -1)) {
                        statePc = 369;
                    } else {
                        statePc = 357;
                    }
                    continue stateLoop;
                }
                case 357: {
                    var19 = param1.field_D[var8[var18]];
                    stackIn_371_0 = var19 ^ -1;
                    stackIn_358_0 = stackIn_371_0;
                    stackIn_371_1 = -1;
                    stackIn_358_1 = stackIn_371_1;
                    if (var63 != 0) {
                        statePc = 371;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 358: {
                    if (stackIn_358_0 > stackIn_358_1) {
                        statePc = 368;
                    } else {
                        statePc = 361;
                    }
                    continue stateLoop;
                }
                case 361: {
                    if (var16 < var19) {
                        statePc = 366;
                    } else {
                        statePc = 367;
                    }
                    continue stateLoop;
                }
                case 366: {
                    var16 = var19;
                    statePc = 367;
                    continue stateLoop;
                }
                case 367: {
                    var17[var19] = var17[var19] + 1;
                    statePc = 368;
                    continue stateLoop;
                }
                case 368: {
                    var18++;
                    if (var63 == 0) {
                        statePc = 356;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 369: {
                    this.field_q = new int[1 + var16][];
                    var18 = 0;
                    statePc = 370;
                    continue stateLoop;
                }
                case 370: {
                    stackIn_371_0 = var16;
                    stackIn_371_1 = var18;
                    statePc = 371;
                    continue stateLoop;
                }
                case 371: {
                    if (stackIn_371_0 < stackIn_371_1) {
                        statePc = 378;
                    } else {
                        statePc = 372;
                    }
                    continue stateLoop;
                }
                case 372: {
                    array$5 = new int[var17[var18]];
                    this.field_q[var18] = array$5;
                    var17[var18] = 0;
                    var18++;
                    if (var63 != 0) {
                        statePc = 379;
                    } else {
                        statePc = 375;
                    }
                    continue stateLoop;
                }
                case 375: {
                    if (var63 == 0) {
                        statePc = 370;
                    } else {
                        statePc = 378;
                    }
                    continue stateLoop;
                }
                case 378: {
                    var18 = 0;
                    statePc = 379;
                    continue stateLoop;
                }
                case 379: {
                    if (this.field_I <= var18) {
                        statePc = 398;
                    } else {
                        statePc = 380;
                    }
                    continue stateLoop;
                }
                case 380: {
                    var19 = param1.field_D[var8[var18]];
                    if (var63 != 0) {
                        statePc = 398;
                    } else {
                        statePc = 381;
                    }
                    continue stateLoop;
                }
                case 381: {
                    if (-1 >= (var19 ^ -1)) {
                        statePc = 386;
                    } else {
                        statePc = 387;
                    }
                    continue stateLoop;
                }
                case 386: {
                    dupTemp$6 = var17[var19];
                    arrayValue$7 = this.field_q[var19];
                    var17[var19] = dupTemp$6 + 1;
                    arrayValue$7[dupTemp$6] = var18;
                    statePc = 387;
                    continue stateLoop;
                }
                case 387: {
                    var18++;
                    if (var63 == 0) {
                        statePc = 379;
                    } else {
                        statePc = 398;
                    }
                    continue stateLoop;
                }
                case 398: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean NA() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_D != null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        var1_int = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var1_int >= this.field_y) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.field_Z[var1_int] = this.field_Z[var1_int] << 4;
                        this.field_r[var1_int] = this.field_r[var1_int] << 4;
                        this.field_l[var1_int] = this.field_l[var1_int] << 4;
                        var1_int++;
                        if (var2 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var2 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        pb.field_k = 0;
                        uu.field_c = 0;
                        ina.field_a = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = 1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0 != 0;
                }
                case 13: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw tba.a((Throwable) ((Object) var1), "gja.NA()");
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void d(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = 69 / ((param0 - 66) / 38);
                if ((55 & this.field_h ^ -1) != -1) {
                  break L2;
                } else {
                  if (this.field_E != null) {
                    this.field_E.field_h = false;
                    if (!TombRacer.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              if (null != this.field_O) {
                this.field_O.field_h = false;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "gja.R(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6_int = 0;
        ll var6 = null;
        int var7_int = 0;
        gca var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var5_int ^ -1) <= (this.field_I ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var6_int = this.field_P[var5_int] & 65535;
                        var7_int = (var6_int & 65039) >> 1360517322;
                        var8 = (var6_int & 951) >> 218434919;
                        stackIn_20_0 = 0;
                        stackIn_4_0 = stackIn_20_0;
                        stackIn_20_1 = param0 ^ -1;
                        stackIn_4_1 = stackIn_20_1;
                        if (var10 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 == stackIn_4_1) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var7_int = var7_int + (param3 * (-var7_int + param0) >> -1000039705);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var9 = var6_int & 127;
                        if (param1 == -1) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var8 = var8 + (param3 * (-var8 + param1) >> 1709488231);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (-1 != param2) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9 = var9 - -((param2 + -var9) * param3 >> -744327673);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_P[var5_int] = (short)fh.a(var9, fh.a(var8 << -160360345, var7_int << 797556682));
                        var5_int++;
                        if (var10 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (this.field_u != null) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 27;
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
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = this.field_L;
                        stackIn_20_1 = var5_int;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 <= stackIn_20_1) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var6 = this.field_u[var5_int];
                        var7 = this.field_nb[var5_int];
                        var7.field_h = -16777216 & var7.field_h | cla.field_m[65535 & this.field_P[var6.field_m]] & 16777215;
                        var5_int++;
                        if (var10 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var10 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.e(0);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    throw tba.a((Throwable) ((Object) var5), "gja.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 28: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a() {
    }

    final void a(gda param0, el param1, int param2, int param3) {
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        StringBuilder stackIn_54_1 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        asa var5 = null;
        RuntimeException var5_ref = null;
        asa var6 = null;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (0 == this.field_fb) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var5 = this.field_S.field_bb;
                var6 = (asa) ((Object) param0);
                if (!this.field_A) {
                  this.f(-913);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                L3: {
                  qra.field_d = var5.field_o * var6.field_q + var6.field_l * var5.field_p + var6.field_o * var5.field_h;
                  gj.field_h = var6.field_e * var5.field_p + var5.field_o * var6.field_n + var6.field_i * var5.field_h + var5.field_i;
                  var7 = qra.field_d * (float)this.field_o + gj.field_h;
                  var8 = gj.field_h + qra.field_d * (float)this.field_n;
                  if (var8 < var7) {
                    break L3;
                  } else {
                    var9 = var7 - (float)this.field_H;
                    var10 = var8 + (float)this.field_H;
                    if (var23 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var9 = var8 - (float)this.field_H;
                var10 = (float)this.field_H + var7;
                break L2;
              }
              if (this.field_S.field_Cb > var9) {
                if ((float)this.field_S.field_D >= var10) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L4: {
                    L5: {
                      vta.field_e = var6.field_q * var5.field_l + var6.field_l * var5.field_g + var6.field_o * var5.field_f;
                      fba.field_a = var5.field_e + (var6.field_i * var5.field_f + (var6.field_n * var5.field_l + var5.field_g * var6.field_e));
                      var11 = fba.field_a + vta.field_e * (float)this.field_o;
                      var12 = (float)this.field_n * vta.field_e + fba.field_a;
                      if (var11 > var12) {
                        break L5;
                      } else {
                        var14 = (var12 + (float)this.field_H) * (float)this.field_S.field_Ic;
                        var13 = (var11 - (float)this.field_H) * (float)this.field_S.field_Ic;
                        if (var23 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var13 = (float)this.field_S.field_Ic * (var12 - (float)this.field_H);
                    var14 = (float)this.field_S.field_Ic * ((float)this.field_H + var11);
                    break L4;
                  }
                  if (var13 / (float)param2 >= this.field_S.field_uc) {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (var14 / (float)param2 > this.field_S.field_f) {
                      L6: {
                        L7: {
                          tu.field_g = var5.field_k * var6.field_e + var6.field_n * var5.field_q + var6.field_i * var5.field_m + var5.field_n;
                          kb.field_p = var6.field_l * var5.field_k + var6.field_q * var5.field_q + var5.field_m * var6.field_o;
                          var15 = tu.field_g + (float)this.field_o * kb.field_p;
                          var16 = tu.field_g + (float)this.field_n * kb.field_p;
                          if (var15 > var16) {
                            break L7;
                          } else {
                            var18 = (float)this.field_S.field_h * (var16 + (float)this.field_H);
                            var17 = ((float)(-this.field_H) + var15) * (float)this.field_S.field_h;
                            if (var23 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var17 = (float)this.field_S.field_h * (var16 - (float)this.field_H);
                        var18 = (var15 + (float)this.field_H) * (float)this.field_S.field_h;
                        break L6;
                      }
                      if (this.field_S.field_H <= var17 / (float)param2) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (var18 / (float)param2 > this.field_S.field_zc) {
                          L8: {
                            L9: {
                              if (null != param1) {
                                break L9;
                              } else {
                                if (null == this.field_u) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            vs.field_O = var5.field_k * var6.field_g + var6.field_k * var5.field_q + var5.field_m * var6.field_p;
                            wka.field_b = var5.field_f * var6.field_h + (var6.field_f * var5.field_g + var5.field_l * var6.field_m);
                            pl.field_a = var6.field_g * var5.field_p + var5.field_o * var6.field_k + var6.field_p * var5.field_h;
                            baa.field_c = var5.field_f * var6.field_p + (var6.field_k * var5.field_l + var5.field_g * var6.field_g);
                            ct.field_b = var6.field_h * var5.field_m + (var5.field_q * var6.field_m + var6.field_f * var5.field_k);
                            hs.field_c = var6.field_h * var5.field_h + (var6.field_m * var5.field_o + var5.field_p * var6.field_f);
                            break L8;
                          }
                          L10: {
                            if (param1 == null) {
                              break L10;
                            } else {
                              var19 = this.field_K + this.field_i >> 791591361;
                              var20 = this.field_Q + this.field_cb >> 1970446689;
                              var21 = (int)(hs.field_c * (float)var20 + (gj.field_h + pl.field_a * (float)var19 + qra.field_d * (float)this.field_o));
                              var22 = (int)((float)this.field_n * qra.field_d + (gj.field_h + (float)var19 * pl.field_a) + hs.field_c * (float)var20);
                              if ((var21 ^ -1) <= (this.field_S.field_D ^ -1)) {
                                break L10;
                              } else {
                                if (var22 < this.field_S.field_D) {
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                          this.field_S.a((float)param2, -229);
                          this.field_S.j((byte) 102);
                          this.field_S.a(var6, (byte) 88);
                          this.b((byte) -100);
                          this.c(-125);
                          decompiledRegionSelector0 = 7;
                          break L0;
                        } else {
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    } else {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5_ref = decompiledCaughtException;
            stackIn_50_0 = (RuntimeException) (var5_ref);

            stackIn_50_1 = new StringBuilder().append("gja.Q(");

            if (param0 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L11;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',');

            if (param1 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L12;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L12;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_51_0), stackIn_55_2 + ',' + param2 + ',' + param3 + ')');
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

    final static void a(cn param0, int param1) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        kh var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        an var5 = null;
        int[] var6 = null;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = new kh(param0.a("logo.fo3d", (byte) 126, ""));
                        var3 = var2.h(255);
                        var2.h((byte) 119);
                        ej.field_d = uea.a(var2, (byte) 8);
                        tfa.field_e = new int[var3][];
                        cq.field_b = new an[var3];
                        var4 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var3 ^ -1) >= (var4 ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        cq.field_b[var4] = jo.a(var2, true);
                        var4++;
                        if (var7 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var7 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2.i((byte) 98);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4 = param1;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var4 >= var3) {
                            statePc = 20;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = cq.field_b[var4];
                        var5.a(6, 6, 6, true, 1);
                        var5.a((byte) -120);
                        var6 = new int[]{var5.field_i + var5.field_z >> 404139873, var5.field_b + var5.field_m >> -72386815, var5.field_a + var5.field_p >> -393482079};
                        tfa.field_e[var4] = var6;
                        var5.a(-var6[2], -var6[0], (byte) -86, -var6[1]);
                        var4++;
                        if (var7 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var7 == 0) {
                            statePc = 9;
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
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (var2_ref);
                    stackIn_16_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("gja.M(");
                    stackIn_16_1 = stackIn_18_1;
                    if (param0 == null) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void f(int param0) {
        ka discarded$0 = null;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
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
        int var15 = 0;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = 32767;
            var3 = 32767;
            var4 = 32767;
            var5 = -32768;
            var6 = -32768;
            var7 = -32768;
            var8 = 0;
            var9 = 0;
            var10 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var10 >= this.field_W) {
                    break L3;
                  } else {
                    var11 = this.field_Z[var10];
                    var12 = this.field_r[var10];
                    stackIn_32_0 = var12 ^ -1;

                    stackIn_32_1 = var6 ^ -1;

                    if (var15 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_32_0 >= stackIn_32_1) {
                          break L4;
                        } else {
                          var6 = var12;
                          break L4;
                        }
                      }
                      L5: {
                        if ((var3 ^ -1) >= (var12 ^ -1)) {
                          break L5;
                        } else {
                          var3 = var12;
                          break L5;
                        }
                      }
                      L6: {
                        if ((var11 ^ -1) <= (var2_int ^ -1)) {
                          break L6;
                        } else {
                          var2_int = var11;
                          break L6;
                        }
                      }
                      L7: {
                        var13 = this.field_l[var10];
                        if ((var5 ^ -1) > (var11 ^ -1)) {
                          var5 = var11;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (var7 >= var13) {
                          break L8;
                        } else {
                          var7 = var13;
                          break L8;
                        }
                      }
                      L9: {
                        if ((var13 ^ -1) > (var4 ^ -1)) {
                          var4 = var13;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        var14 = var13 * var13 + var11 * var11;
                        if ((var14 ^ -1) < (var8 ^ -1)) {
                          var8 = var14;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        var14 = var13 * var13 + var11 * var11 - -(var12 * var12);
                        if ((var14 ^ -1) < (var9 ^ -1)) {
                          var9 = var14;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      var10++;
                      if (var15 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_Q = var7;
                this.field_n = var6;
                this.field_K = var5;
                this.field_i = var2_int;
                this.field_o = var3;
                this.field_cb = var4;
                this.field_H = (int)(Math.sqrt((double)var8) + 0.99);
                Math.sqrt((double)var9);
                this.field_A = true;
                stackIn_32_0 = param0;
                stackIn_32_1 = -913;
                break L2;
              }
              L12: {
                if (stackIn_32_0 == stackIn_32_1) {
                  break L12;
                } else {
                  discarded$0 = this.a((gja) null, true, (gja) null, false, -20, false);
                  break L12;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "gja.IA(" + param0 + ')');
        }
    }

    final static byte[] a(int param0, File param1, int param2) {
        try {
            byte[] var3 = null;
            IOException var3_ref = null;
            RuntimeException var3_ref2 = null;
            byte[] stackIn_2_0 = null;
            byte[] stackIn_4_0 = null;
            Object stackIn_6_0 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    var3 = new byte[param0];
                    if (param2 == 0) {
                      nj.a(var3, 107, param0, param1);
                      stackIn_4_0 = (byte[]) (var3);
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      stackIn_2_0 = (byte[]) null;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3_ref = (IOException) (Object) decompiledCaughtException;
                  stackIn_6_0 = null;
                  return (byte[]) ((Object) stackIn_6_0);
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_10_0 = (RuntimeException) (var3_ref2);

                stackIn_10_1 = new StringBuilder().append("gja.K(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "null";
                  break L2;
                } else {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "{...}";
                  break L2;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_2_0;
            } else {
              return stackIn_4_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean h(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        eja var2 = null;
        RuntimeException var2_ref = null;
        jaclib.memory.Buffer var3 = null;
        jaclib.memory.Stream var4 = null;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_g.field_a) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = 1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        if (this.field_g.field_d == null) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.field_g.field_d = this.field_S.a(26, this.field_F);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param0 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.a((byte) -37, -100, true);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var2 = this.field_g.field_d;
                        var2.a(param0 + 28, 6 * this.field_v);
                        var3 = var2.a(true, (byte) -10);
                        if (null == var3) {
                            statePc = 32;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4 = this.field_S.a(var3, 127);
                        if (!jaclib.memory.Stream.b()) {
                            statePc = 22;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var5 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((var5 ^ -1) <= (this.field_v ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var4.a((int) this.field_M[var5]);
                        var4.a((int) this.field_z[var5]);
                        var4.a((int) this.field_V[var5]);
                        var5++;
                        if (var6 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 34;
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
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var6 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var5 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((var5 ^ -1) <= (this.field_v ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var4.b((int) this.field_M[var5]);
                        var4.b((int) this.field_z[var5]);
                        var4.b((int) this.field_V[var5]);
                        var5++;
                        if (var6 != 0) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var6 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var4.a();
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (!var2.a((byte) 95)) {
                            statePc = 32;
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
                        this.field_g.field_a = true;
                        this.field_g.field_c = var2;
                        this.field_N = true;
                        stackIn_31_0 = 1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return stackIn_31_0 != 0;
                }
                case 32: {
                    try {
                        stackIn_33_0 = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    return stackIn_33_0 != 0;
                }
                case 34: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw tba.a((Throwable) ((Object) var2_ref), "gja.B(" + param0 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_N) {
              L1: {
                this.field_N = false;
                if (null != this.field_X) {
                  break L1;
                } else {
                  if (this.field_s != null) {
                    break L1;
                  } else {
                    if (this.field_u != null) {
                      break L1;
                    } else {
                      if (!ei.a(this.field_h, this.field_Y, (byte) 27)) {
                        L2: {
                          var2_int = 0;
                          var3 = 0;
                          var4 = 0;
                          if (null == this.field_Z) {
                            break L2;
                          } else {
                            if (!tp.a(this.field_h, (byte) 3, this.field_Y)) {
                              L3: {
                                L4: {
                                  if (null == this.field_ib) {
                                    break L4;
                                  } else {
                                    if (!this.field_ib.b(16440)) {
                                      break L3;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                var2_int = 1;
                                if (!this.field_A) {
                                  this.f(-913);
                                  if (var5 == 0) {
                                    break L2;
                                  } else {
                                    break L3;
                                  }
                                } else {
                                  break L2;
                                }
                              }
                              this.field_N = true;
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                        }
                        L5: {
                          if (null == this.field_r) {
                            break L5;
                          } else {
                            if (!qr.c(458752, this.field_h, this.field_Y)) {
                              L6: {
                                L7: {
                                  if (null == this.field_ib) {
                                    break L7;
                                  } else {
                                    if (!this.field_ib.b(16440)) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                var3 = 1;
                                if (!this.field_A) {
                                  this.f(-913);
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                } else {
                                  break L5;
                                }
                              }
                              this.field_N = true;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L8: {
                          if (this.field_l == null) {
                            break L8;
                          } else {
                            if (cu.a(-79, this.field_Y, this.field_h)) {
                              break L8;
                            } else {
                              L9: {
                                if (null == this.field_ib) {
                                  break L9;
                                } else {
                                  if (this.field_ib.b(16440)) {
                                    break L9;
                                  } else {
                                    this.field_N = true;
                                    if (var5 == 0) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              L10: {
                                if (this.field_A) {
                                  break L10;
                                } else {
                                  this.f(-913);
                                  break L10;
                                }
                              }
                              var4 = 1;
                              break L8;
                            }
                          }
                        }
                        L11: {
                          if (var3 != 0) {
                            this.field_r = null;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          if (var4 != 0) {
                            this.field_l = null;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        if (var2_int == 0) {
                          break L1;
                        } else {
                          this.field_Z = null;
                          break L1;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              L13: {
                if (this.field_db == null) {
                  break L13;
                } else {
                  if (this.field_Z != null) {
                    break L13;
                  } else {
                    if (null != this.field_r) {
                      break L13;
                    } else {
                      if (this.field_l != null) {
                        break L13;
                      } else {
                        this.field_J = null;
                        this.field_db = null;
                        break L13;
                      }
                    }
                  }
                }
              }
              L14: {
                if (null == this.field_w) {
                  break L14;
                } else {
                  if (dba.a(this.field_h, 98, this.field_Y)) {
                    break L14;
                  } else {
                    L15: {
                      L16: {
                        if (0 == (55 & this.field_h)) {
                          if (this.field_E == null) {
                            break L16;
                          } else {
                            if (!this.field_E.b(16440)) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        } else {
                          if (null == this.field_O) {
                            break L16;
                          } else {
                            if (!this.field_O.b(16440)) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                      this.field_lb = null;
                      this.field_p = null;
                      this.field_m = null;
                      this.field_w = null;
                      if (var5 == 0) {
                        break L14;
                      } else {
                        break L15;
                      }
                    }
                    this.field_N = true;
                    break L14;
                  }
                }
              }
              L17: {
                if (null == this.field_P) {
                  break L17;
                } else {
                  if (!th.b(this.field_Y, 8, this.field_h)) {
                    L18: {
                      if (this.field_E == null) {
                        break L18;
                      } else {
                        if (this.field_E.b(16440)) {
                          break L18;
                        } else {
                          this.field_N = true;
                          if (var5 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                    this.field_P = null;
                    break L17;
                  } else {
                    break L17;
                  }
                }
              }
              L19: {
                if (this.field_C == null) {
                  break L19;
                } else {
                  if (!jda.d(this.field_h, -28090, this.field_Y)) {
                    L20: {
                      L21: {
                        if (null == this.field_E) {
                          break L21;
                        } else {
                          if (!this.field_E.b(16440)) {
                            break L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                      this.field_C = null;
                      if (var5 == 0) {
                        break L19;
                      } else {
                        break L20;
                      }
                    }
                    this.field_N = true;
                    break L19;
                  } else {
                    break L19;
                  }
                }
              }
              L22: {
                if (null == this.field_eb) {
                  break L22;
                } else {
                  if (!ov.a((byte) -96, this.field_Y, this.field_h)) {
                    L23: {
                      if (this.field_d == null) {
                        break L23;
                      } else {
                        if (this.field_d.b(16440)) {
                          break L23;
                        } else {
                          this.field_N = true;
                          if (var5 == 0) {
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                    this.field_t = null;
                    this.field_eb = null;
                    break L22;
                  } else {
                    break L22;
                  }
                }
              }
              L24: {
                if (this.field_gb == null) {
                  break L24;
                } else {
                  if (!uw.a(this.field_h, this.field_Y, -102)) {
                    L25: {
                      if (null == this.field_E) {
                        break L25;
                      } else {
                        if (this.field_E.b(16440)) {
                          break L25;
                        } else {
                          this.field_N = true;
                          if (var5 == 0) {
                            break L24;
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                    this.field_gb = null;
                    break L24;
                  } else {
                    break L24;
                  }
                }
              }
              L26: {
                if (null == this.field_M) {
                  break L26;
                } else {
                  if (kd.c(-58, this.field_Y, this.field_h)) {
                    break L26;
                  } else {
                    L27: {
                      L28: {
                        L29: {
                          if (this.field_g == null) {
                            break L29;
                          } else {
                            if (!this.field_g.a(false)) {
                              break L28;
                            } else {
                              break L29;
                            }
                          }
                        }
                        if (null == this.field_E) {
                          break L27;
                        } else {
                          if (this.field_E.b(16440)) {
                            break L27;
                          } else {
                            break L28;
                          }
                        }
                      }
                      this.field_N = true;
                      if (var5 == 0) {
                        break L26;
                      } else {
                        break L27;
                      }
                    }
                    this.field_z = null;
                    this.field_M = null;
                    this.field_V = null;
                    break L26;
                  }
                }
              }
              L30: {
                if (this.field_kb != null) {
                  L31: {
                    L32: {
                      if (this.field_ib == null) {
                        break L32;
                      } else {
                        if (!this.field_ib.b(16440)) {
                          break L31;
                        } else {
                          break L32;
                        }
                      }
                    }
                    this.field_kb = null;
                    if (var5 == 0) {
                      break L30;
                    } else {
                      break L31;
                    }
                  }
                  this.field_N = true;
                  break L30;
                } else {
                  break L30;
                }
              }
              L33: {
                if (null == this.field_G) {
                  break L33;
                } else {
                  L34: {
                    L35: {
                      if (this.field_E == null) {
                        break L35;
                      } else {
                        if (!this.field_E.b(16440)) {
                          break L34;
                        } else {
                          break L35;
                        }
                      }
                    }
                    this.field_G = null;
                    if (var5 == 0) {
                      break L33;
                    } else {
                      break L34;
                    }
                  }
                  this.field_N = true;
                  break L33;
                }
              }
              L36: {
                if (null == this.field_q) {
                  break L36;
                } else {
                  if (ofa.a(this.field_Y, this.field_h, (byte) -126)) {
                    break L36;
                  } else {
                    this.field_q = (int[][]) null;
                    this.field_jb = null;
                    break L36;
                  }
                }
              }
              L37: {
                var2_int = -112 / ((47 - param0) / 41);
                if (this.field_D == null) {
                  break L37;
                } else {
                  if (!qr.d(this.field_Y, this.field_h, 32)) {
                    this.field_D = (int[][]) null;
                    this.field_hb = null;
                    break L37;
                  } else {
                    break L37;
                  }
                }
              }
              L38: {
                if (this.field_mb == null) {
                  break L38;
                } else {
                  if (ub.a(this.field_h, this.field_Y, (byte) 21)) {
                    break L38;
                  } else {
                    this.field_mb = (int[][]) null;
                    break L38;
                  }
                }
              }
              L39: {
                if (this.field_U == null) {
                  break L39;
                } else {
                  if ((2048 & this.field_Y) != 0) {
                    break L39;
                  } else {
                    if (-1 == (262144 & this.field_Y ^ -1)) {
                      this.field_U = null;
                      this.field_j = null;
                      this.field_R = null;
                      break L39;
                    } else {
                      break L39;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "gja.GA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void g(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_k = null;
              if (param0 == 3) {
                break L1;
              } else {
                field_x = 122;
                break L1;
              }
            }
            field_bb = null;
            field_B = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "gja.P(" + param0 + ')');
        }
    }

    private final void b(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (0 != this.field_v) {
              if (param0 <= -8) {
                L1: {
                  L2: {
                    if (!this.c((byte) 66)) {
                      break L2;
                    } else {
                      if (!this.h(0)) {
                        break L2;
                      } else {
                        L3: {
                          L4: {
                            this.field_S.a(-126, 0, this.field_ib.field_e);
                            this.field_S.a(-128, 1, this.field_E.field_e);
                            this.field_S.a(-127, 2, this.field_d.field_e);
                            if ((55 & this.field_h ^ -1) == -1) {
                              break L4;
                            } else {
                              this.field_S.d(0, true);
                              var2_int = 1;
                              this.field_S.a(-127, 3, this.field_O.field_e);
                              this.field_S.a(this.field_S.field_nc, -32);
                              if (var7 == 0) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          this.field_S.d(0, false);
                          var2_int = 0;
                          this.field_S.a(this.field_S.field_ob, -32);
                          break L3;
                        }
                        var3 = 0;
                        L5: while (true) {
                          if ((var3 ^ -1) <= (this.field_j.length ^ -1)) {
                            break L2;
                          } else {
                            var4 = this.field_U[var3];
                            var5 = this.field_U[var3 - -1];
                            var6 = this.field_gb[var4] & 65535;
                            if (var7 != 0) {
                              break L1;
                            } else {
                              L6: {
                                if (var6 == 65535) {
                                  var6 = -1;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              this.field_S.a((byte) -80, var2_int != 0, true, var6);
                              this.field_S.a(this.field_g.field_c, -19394, this.field_j[var3], var4 * 3, fma.field_f, this.field_R[var3], var5 + -var4);
                              var3++;
                              if (var7 == 0) {
                                continue L5;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  this.b(-46);
                  break L1;
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "gja.T(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void H(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((this.field_W ^ -1) >= (var4_int ^ -1)) {
                    break L3;
                  } else {
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (-1 != (param0 ^ -1)) {
                          this.field_Z[var4_int] = this.field_Z[var4_int] + param0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if ((param1 ^ -1) != -1) {
                          this.field_r[var4_int] = this.field_r[var4_int] + param1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (0 == param2) {
                          break L6;
                        } else {
                          this.field_l[var4_int] = this.field_l[var4_int] + param2;
                          break L6;
                        }
                      }
                      var4_int++;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.d(1);
                this.field_A = false;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "gja.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void wa() {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_int = 0;
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
                        if ((var1_int ^ -1) <= (this.field_y ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_Z[var1_int] = this.field_Z[var1_int] + 7 >> 701932932;
                        this.field_r[var1_int] = 7 + this.field_r[var1_int] >> 862535460;
                        this.field_l[var1_int] = 7 + this.field_l[var1_int] >> 715582212;
                        var1_int++;
                        if (var2 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var2 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.d(-121);
                        this.field_A = false;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw tba.a((Throwable) ((Object) runtimeException), "gja.wa()");
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b() {
    }

    private final boolean c(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_114_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        qm var7 = null;
        jaclib.memory.Buffer var8 = null;
        short[] var9 = null;
        short[] var10 = null;
        short[] var11 = null;
        byte[] var12 = null;
        int var13 = 0;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_E.field_h) {
                stackIn_5_0 = 0;
                break L1;
              } else {
                stackIn_5_0 = 1;
                break L1;
              }
            }
            L2: {
              L3: {
                var2_int = stackIn_5_0;
                if (0 == (55 & this.field_h)) {
                  break L3;
                } else {
                  if (this.field_O.field_h) {
                    break L3;
                  } else {
                    stackIn_12_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_12_0 = 0;
              break L2;
            }
            L4: {
              var3 = stackIn_12_0;
              if (this.field_ib.field_h) {
                stackIn_16_0 = 0;
                break L4;
              } else {
                stackIn_16_0 = 1;
                break L4;
              }
            }
            L5: {
              var4 = stackIn_16_0;
              if (this.field_d.field_h) {
                stackIn_20_0 = 0;
                break L5;
              } else {
                stackIn_20_0 = 1;
                break L5;
              }
            }
            L6: {
              var5 = stackIn_20_0;
              if (var4 != 0) {
                break L6;
              } else {
                if (var2_int != 0) {
                  break L6;
                } else {
                  if (var3 != 0) {
                    break L6;
                  } else {
                    if (var5 == 0) {
                      stackIn_33_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L6;
                    }
                  }
                }
              }
            }
            if (param0 == 66) {
              L7: {
                var6 = 1;
                if (var4 == 0) {
                  break L7;
                } else {
                  if (this.field_kb != null) {
                    L8: {
                      if (this.field_ib.field_a != null) {
                        break L8;
                      } else {
                        this.field_ib.field_a = this.field_S.c(6, this.field_F);
                        break L8;
                      }
                    }
                    L9: {
                      var7 = this.field_ib.field_a;
                      var7.a(12 * this.field_fb, 12, true);
                      var8 = var7.a(-15730, true);
                      if (var8 != null) {
                        break L9;
                      } else {
                        var6 = 0;
                        if (var13 == 0) {
                          break L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      this.field_S.field_P.copyPositions(this.field_Z, this.field_r, this.field_l, this.field_kb, 0, 12, this.field_fb, var8.getAddress());
                      if (!var7.a(true)) {
                        break L10;
                      } else {
                        this.field_ib.field_e = var7;
                        this.field_ib.field_h = true;
                        if (var13 == 0) {
                          break L7;
                        } else {
                          break L10;
                        }
                      }
                    }
                    var6 = 0;
                    break L7;
                  } else {
                    stackIn_42_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              L11: {
                if (var2_int == 0) {
                  break L11;
                } else {
                  L12: {
                    if (null != this.field_E.field_a) {
                      break L12;
                    } else {
                      this.field_E.field_a = this.field_S.c(param0 + -60, this.field_F);
                      break L12;
                    }
                  }
                  L13: {
                    var7 = this.field_E.field_a;
                    var7.a(this.field_fb * 4, 4, true);
                    var8 = var7.a(-15730, true);
                    if (var8 == null) {
                      break L13;
                    } else {
                      L14: {
                        L15: {
                          if ((55 & this.field_h ^ -1) == -1) {
                            break L15;
                          } else {
                            this.field_S.field_P.copyColours(this.field_P, this.field_C, this.field_gb, (int) this.field_T, this.field_G, 0, 4, this.field_fb, var8.getAddress());
                            if (var13 == 0) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        L16: {
                          L17: {
                            if (this.field_e != null) {
                              break L17;
                            } else {
                              var10 = this.field_m;
                              var9 = this.field_lb;
                              var12 = this.field_w;
                              var11 = this.field_p;
                              if (var13 == 0) {
                                break L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                          var11 = this.field_e.field_e;
                          var9 = this.field_e.field_a;
                          var10 = this.field_e.field_c;
                          var12 = this.field_e.field_b;
                          break L16;
                        }
                        this.field_S.field_P.copyLighting(this.field_P, this.field_C, this.field_gb, var9, var10, var11, var12, (int) this.field_T, (int) this.field_ab, this.field_G, 0, 4, this.field_fb, var8.getAddress());
                        break L14;
                      }
                      L18: {
                        if (!var7.a(true)) {
                          break L18;
                        } else {
                          this.field_E.field_h = true;
                          this.field_E.field_e = var7;
                          if (var13 == 0) {
                            break L11;
                          } else {
                            break L18;
                          }
                        }
                      }
                      var6 = 0;
                      if (var13 == 0) {
                        break L11;
                      } else {
                        break L13;
                      }
                    }
                  }
                  var6 = 0;
                  break L11;
                }
              }
              L19: {
                if (var3 == 0) {
                  break L19;
                } else {
                  L20: {
                    if (null == this.field_O.field_a) {
                      this.field_O.field_a = this.field_S.c(param0 ^ 68, this.field_F);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    var7 = this.field_O.field_a;
                    var7.a(this.field_fb * 12, 12, true);
                    var8 = var7.a(-15730, true);
                    if (var8 != null) {
                      break L21;
                    } else {
                      var6 = 0;
                      if (var13 == 0) {
                        break L19;
                      } else {
                        break L21;
                      }
                    }
                  }
                  L22: {
                    L23: {
                      if (this.field_e != null) {
                        break L23;
                      } else {
                        var11 = this.field_p;
                        var9 = this.field_lb;
                        var10 = this.field_m;
                        var12 = this.field_w;
                        if (var13 == 0) {
                          break L22;
                        } else {
                          break L23;
                        }
                      }
                    }
                    var10 = this.field_e.field_c;
                    var9 = this.field_e.field_a;
                    var11 = this.field_e.field_e;
                    var12 = this.field_e.field_b;
                    break L22;
                  }
                  L24: {
                    this.field_S.field_P.copyNormals(var9, var10, var11, var12, 3.0f / (float)this.field_ab, 3.0f / (float)(this.field_ab / 2 + this.field_ab), 0, 12, this.field_fb, var8.getAddress());
                    if (var7.a(true)) {
                      break L24;
                    } else {
                      var6 = 0;
                      if (var13 == 0) {
                        break L19;
                      } else {
                        break L24;
                      }
                    }
                  }
                  this.field_O.field_e = var7;
                  this.field_O.field_h = true;
                  break L19;
                }
              }
              L25: {
                if (var5 == 0) {
                  break L25;
                } else {
                  L26: {
                    if (this.field_d.field_a == null) {
                      this.field_d.field_a = this.field_S.c(6, this.field_F);
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    var7 = this.field_d.field_a;
                    var7.a(this.field_fb * 8, 8, true);
                    var8 = var7.a(-15730, true);
                    if (null != var8) {
                      break L27;
                    } else {
                      var6 = 0;
                      if (var13 == 0) {
                        break L25;
                      } else {
                        break L27;
                      }
                    }
                  }
                  L28: {
                    this.field_S.field_P.copyTexCoords(this.field_eb, this.field_t, 0, 8, this.field_fb, var8.getAddress());
                    if (var7.a(true)) {
                      break L28;
                    } else {
                      var6 = 0;
                      if (var13 == 0) {
                        break L25;
                      } else {
                        break L28;
                      }
                    }
                  }
                  this.field_d.field_h = true;
                  this.field_d.field_e = var7;
                  break L25;
                }
              }
              stackIn_114_0 = var6;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              stackIn_36_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "gja.L(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_33_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_36_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_42_0 != 0;
            } else {
              return stackIn_114_0 != 0;
            }
          }
        }
    }

    private final void c(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        asa var3 = null;
        int var4 = 0;
        ll var5 = null;
        gca var6 = null;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int var14 = 0;
        int var15 = 0;
        eo stackIn_3_0 = null;
        eo stackIn_5_0 = null;
        eo stackIn_7_0 = null;
        eo stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 55 % ((param0 - -30) / 59);
                        if (null == this.field_u) {
                            statePc = 26;
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
                        stackIn_7_0 = this.field_S;
                        stackIn_3_0 = stackIn_7_0;
                        if (this.field_f) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_5_0 = (eo) ((Object) stackIn_3_0);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_8_0 = (eo) ((Object) stackIn_5_0);
                        stackIn_8_1 = 1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = (eo) ((Object) stackIn_7_0);
                        stackIn_8_1 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ((eo) (Object) stackIn_8_0).a(stackIn_8_1 != 0, 0);
                        this.field_S.d(0, false);
                        this.field_S.a(pea.field_c, 1, -79);
                        this.field_S.a(1, false, pea.field_c);
                        var4 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var4 ^ -1) <= (this.field_L ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = this.field_u[var4];
                        var6 = this.field_nb[var4];
                        if (var15 != 0) {
                            statePc = 23;
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
                    try {
                        if (!var5.field_e) {
                            statePc = 20;
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
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (!this.field_S.f()) {
                            statePc = 20;
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
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var15 == 0) {
                            statePc = 21;
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
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var7 = 0.3333333134651184f * (float)(this.field_Z[var5.field_i] + (this.field_Z[var5.field_c] - -this.field_Z[var5.field_k]));
                        var8 = 0.3333333134651184f * (float)(this.field_r[var5.field_k] + (this.field_r[var5.field_i] + this.field_r[var5.field_c]));
                        var9 = (float)(this.field_l[var5.field_k] + this.field_l[var5.field_c] - -this.field_l[var5.field_i]) * 0.3333333134651184f;
                        var10 = var9 * wka.field_b + (vta.field_e * var8 + baa.field_c * var7) + fba.field_a;
                        var11 = var9 * ct.field_b + (kb.field_p * var8 + var7 * vs.field_O) + tu.field_g;
                        var12 = gj.field_h + (var9 * hs.field_c + (var7 * pl.field_a + qra.field_d * var8));
                        var13 = (float)(1.0 / Math.sqrt((double)(var12 * var12 + (var11 * var11 + var10 * var10)))) * (float)var5.field_b;
                        var3 = this.field_S.y((byte) -77);
                        var3.a(var10 + (float)var6.field_e - var10 * var13, var6.field_m * var5.field_j >> 746327975, var5.field_a * var6.field_k >> -1246777529, var6.field_c, 2, var12 - var12 * var13, var11 + (float)var6.field_b - var13 * var11);
                        var3.b(this.field_S.field_Y, 3);
                        this.field_S.F(-1662);
                        var14 = var6.field_h;
                        this.field_S.a((byte) -80, false, false, (int) var5.field_l);
                        this.field_S.c((int) var5.field_f, 1);
                        this.field_S.g(3625, var14);
                        this.field_S.y(2);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var4++;
                        if (var15 == 0) {
                            statePc = 9;
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
                        this.field_S.a(1, false, lja.field_j);
                        this.field_S.a(lja.field_j, 1, -117);
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
                        this.field_S.a(true, 0);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw tba.a((Throwable) ((Object) runtimeException), "gja.D(" + param0 + ')');
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (null == this.field_E) {
                break L1;
              } else {
                this.field_E.field_h = false;
                break L1;
              }
            }
            L2: {
              if (param0 == 0) {
                break L2;
              } else {
                this.I(-112, (int[]) null, 56, 86, -123, true, 104, (int[]) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "gja.HA(" + param0 + ')');
        }
    }

    final void O(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4_int >= this.field_W) {
                    break L3;
                  } else {
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if ((param0 ^ -1) == -129) {
                          break L4;
                        } else {
                          this.field_Z[var4_int] = this.field_Z[var4_int] * param0 >> -885558809;
                          break L4;
                        }
                      }
                      L5: {
                        if (128 != param1) {
                          this.field_r[var4_int] = this.field_r[var4_int] * param1 >> 699480647;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (param2 != 128) {
                          this.field_l[var4_int] = param2 * this.field_l[var4_int] >> -1054421881;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var4_int++;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.d(11);
                this.field_A = false;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "gja.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void FA(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = qu.field_b[param0];
                        var3 = qu.field_d[param0];
                        var4 = 0;
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
                        if ((var4 ^ -1) <= (this.field_W ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5 = -(this.field_l[var4] * var2_int) + var3 * this.field_r[var4] >> 796594702;
                        this.field_l[var4] = this.field_l[var4] * var3 + this.field_r[var4] * var2_int >> 215139918;
                        this.field_r[var4] = var5;
                        var4++;
                        if (var6 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.d(94);
                        this.field_A = false;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw tba.a((Throwable) ((Object) runtimeException), "gja.FA(" + param0 + ')');
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final ka a(gja param0, boolean param1, gja param2, boolean param3, int param4, boolean param5) {
        int[] array$0 = null;
        int[] array$1 = null;
        int[] array$2 = null;
        short[] array$3 = null;
        byte[] array$4 = null;
        short[] array$5 = null;
        short[] array$6 = null;
        short[] array$7 = null;
        mca fieldTemp$8 = null;
        float[] array$9 = null;
        float[] array$10 = null;
        short[] array$11 = null;
        short[] array$12 = null;
        short[] array$13 = null;
        short[] array$14 = null;
        gca[] array$15 = null;
        short discarded$16 = 0;
        int stackIn_61_0 = 0;
        int stackIn_75_0 = 0;
        gja stackIn_310_0 = null;
        RuntimeException stackIn_312_0 = null;
        StringBuilder stackIn_312_1 = null;
        RuntimeException stackIn_314_0 = null;
        StringBuilder stackIn_314_1 = null;
        RuntimeException stackIn_315_0 = null;
        StringBuilder stackIn_315_1 = null;
        String stackIn_315_2 = null;
        RuntimeException stackIn_316_0 = null;
        StringBuilder stackIn_316_1 = null;
        RuntimeException stackIn_318_0 = null;
        StringBuilder stackIn_318_1 = null;
        RuntimeException stackIn_319_0 = null;
        StringBuilder stackIn_319_1 = null;
        String stackIn_319_2 = null;
        Throwable caughtException = null;
        int statePc = 0;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        mca var11_ref_mca = null;
        int var12 = 0;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    param0.field_y = this.field_y;
                    param0.field_I = this.field_I;
                    param0.field_Y = param4;
                    param0.field_ab = this.field_ab;
                    param0.field_L = this.field_L;
                    param0.field_W = this.field_W;
                    param0.field_h = this.field_h;
                    param0.field_fb = this.field_fb;
                    if (-1 == (param4 & 256 ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    param0.field_f = true;
                    if (var13 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    param0.field_f = this.field_f;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    param0.field_T = this.field_T;
                    param0.field_v = this.field_v;
                    var7_int = ir.a(param4, this.field_h, (byte) -100) ? 1 : 0;
                    var8 = cga.a(param4, -62, this.field_h) ? 1 : 0;
                    var9 = er.c(param4, this.field_h, 52) ? 1 : 0;
                    var10 = var8 | var7_int | var9;
                    if (var10 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    param0.field_Z = this.field_Z;
                    param0.field_r = this.field_r;
                    param0.field_l = this.field_l;
                    if (var13 == 0) {
                        statePc = 74;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var7_int != 0) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    param0.field_Z = this.field_Z;
                    if (var13 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (null == param2.field_Z) {
                        statePc = 26;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if ((param2.field_Z.length ^ -1) > (this.field_y ^ -1)) {
                        statePc = 26;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    param0.field_Z = param2.field_Z;
                    if (var13 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    array$0 = new int[this.field_y];
                    param2.field_Z = array$0;
                    param0.field_Z = array$0;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (var8 == 0) {
                        statePc = 41;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (param2.field_r == null) {
                        statePc = 35;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (this.field_y <= param2.field_r.length) {
                        statePc = 38;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    array$1 = new int[this.field_y];
                    param2.field_r = array$1;
                    param0.field_r = array$1;
                    if (var13 == 0) {
                        statePc = 43;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    param0.field_r = param2.field_r;
                    if (var13 == 0) {
                        statePc = 43;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    param0.field_r = this.field_r;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (var9 != 0) {
                        statePc = 47;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    param0.field_l = this.field_l;
                    if (var13 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (param2.field_l == null) {
                        statePc = 53;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if ((param2.field_l.length ^ -1) <= (this.field_y ^ -1)) {
                        statePc = 56;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    array$2 = new int[this.field_y];
                    param2.field_l = array$2;
                    param0.field_l = array$2;
                    if (var13 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    param0.field_l = param2.field_l;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    var11 = 0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if ((this.field_y ^ -1) >= (var11 ^ -1)) {
                        statePc = 74;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    stackIn_75_0 = var7_int;
                    stackIn_61_0 = stackIn_75_0;
                    if (var13 != 0) {
                        statePc = 75;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (stackIn_61_0 != 0) {
                        statePc = 65;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 65: {
                    param0.field_Z[var11] = this.field_Z[var11];
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if (var8 == 0) {
                        statePc = 69;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    param0.field_r[var11] = this.field_r[var11];
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if (var9 != 0) {
                        statePc = 72;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 72: {
                    param0.field_l[var11] = this.field_l[var11];
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    var11++;
                    if (var13 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    stackIn_75_0 = uu.a(true, param4, this.field_h) ? 1 : 0;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    if (stackIn_75_0 != 0) {
                        statePc = 85;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (ss.a((byte) 114, this.field_h, param4)) {
                        statePc = 82;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    param0.field_ib = null;
                    if (var13 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    param0.field_ib = this.field_ib;
                    if (var13 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    param0.field_ib = param2.field_ib;
                    param0.field_ib.field_h = this.field_ib.field_h;
                    param0.field_ib.field_b = true;
                    param0.field_ib.field_e = this.field_ib.field_e;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if (bqa.a(540800, param4, this.field_h)) {
                        statePc = 91;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    param0.field_P = this.field_P;
                    if (var13 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (param2.field_P == null) {
                        statePc = 100;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if ((this.field_I ^ -1) < (param2.field_P.length ^ -1)) {
                        statePc = 100;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    param0.field_P = param2.field_P;
                    if (var13 == 0) {
                        statePc = 102;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    array$3 = new short[this.field_I];
                    param2.field_P = array$3;
                    param0.field_P = array$3;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    var11 = 0;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    if ((var11 ^ -1) <= (this.field_I ^ -1)) {
                        statePc = 108;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    param0.field_P[var11] = this.field_P[var11];
                    var11++;
                    if (var13 != 0) {
                        statePc = 127;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    if (var13 == 0) {
                        statePc = 103;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (!go.d(this.field_h, param4, 26205)) {
                        statePc = 127;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (null == param2.field_C) {
                        statePc = 115;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    if ((param2.field_C.length ^ -1) <= (this.field_I ^ -1)) {
                        statePc = 118;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    array$4 = new byte[this.field_I];
                    param2.field_C = array$4;
                    param0.field_C = array$4;
                    if (var13 == 0) {
                        statePc = 120;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    param0.field_C = param2.field_C;
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    var11 = 0;
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    if (var11 >= this.field_I) {
                        statePc = 126;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    param0.field_C[var11] = this.field_C[var11];
                    var11++;
                    if (var13 != 0) {
                        statePc = 128;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    if (var13 == 0) {
                        statePc = 121;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    if (var13 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    param0.field_C = this.field_C;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    if (!no.a(this.field_h, param4, 36864)) {
                        statePc = 132;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    param0.field_E = param2.field_E;
                    param0.field_E.field_h = this.field_E.field_h;
                    param0.field_E.field_b = true;
                    param0.field_E.field_e = this.field_E.field_e;
                    if (var13 == 0) {
                        statePc = 140;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if (!lf.a(this.field_h, param4, 128)) {
                        statePc = 138;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    param0.field_E = this.field_E;
                    if (var13 == 0) {
                        statePc = 140;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    param0.field_E = null;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if (!kaa.a(this.field_h, param4, param1)) {
                        statePc = 179;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    if (null == param2.field_lb) {
                        statePc = 147;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if ((this.field_fb ^ -1) >= (param2.field_lb.length ^ -1)) {
                        statePc = 148;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var11 = this.field_fb;
                    array$5 = new short[var11];
                    param2.field_lb = array$5;
                    param0.field_lb = array$5;
                    array$6 = new short[var11];
                    param2.field_p = array$6;
                    param0.field_p = array$6;
                    array$7 = new short[var11];
                    param2.field_m = array$7;
                    param0.field_m = array$7;
                    if (var13 == 0) {
                        statePc = 150;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    param0.field_p = param2.field_p;
                    param0.field_lb = param2.field_lb;
                    param0.field_m = param2.field_m;
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    if (null == this.field_e) {
                        statePc = 171;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if (param2.field_e == null) {
                        statePc = 156;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 156: {
                    param2.field_e = new mca();
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    fieldTemp$8 = param2.field_e;
                    param0.field_e = param2.field_e;
                    var11_ref_mca = fieldTemp$8;
                    if (var11_ref_mca.field_a == null) {
                        statePc = 163;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if (var11_ref_mca.field_a.length < this.field_fb) {
                        statePc = 163;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 163: {
                    var12 = this.field_fb;
                    var11_ref_mca.field_a = new short[var12];
                    var11_ref_mca.field_e = new short[var12];
                    var11_ref_mca.field_b = new byte[var12];
                    var11_ref_mca.field_c = new short[var12];
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    var12 = 0;
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    if (this.field_fb <= var12) {
                        statePc = 170;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    param0.field_lb[var12] = this.field_lb[var12];
                    param0.field_m[var12] = this.field_m[var12];
                    param0.field_p[var12] = this.field_p[var12];
                    var11_ref_mca.field_a[var12] = this.field_e.field_a[var12];
                    var11_ref_mca.field_c[var12] = this.field_e.field_c[var12];
                    var11_ref_mca.field_e[var12] = this.field_e.field_e[var12];
                    var11_ref_mca.field_b[var12] = this.field_e.field_b[var12];
                    var12++;
                    if (var13 != 0) {
                        statePc = 178;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    if (var13 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    if (var13 == 0) {
                        statePc = 177;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    param0.field_e = null;
                    var11 = 0;
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    if ((var11 ^ -1) <= (this.field_fb ^ -1)) {
                        statePc = 177;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    param0.field_lb[var11] = this.field_lb[var11];
                    param0.field_m[var11] = this.field_m[var11];
                    param0.field_p[var11] = this.field_p[var11];
                    var11++;
                    if (var13 != 0) {
                        statePc = 178;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    if (var13 == 0) {
                        statePc = 172;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    param0.field_w = this.field_w;
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    if (var13 == 0) {
                        statePc = 181;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    param0.field_p = this.field_p;
                    param0.field_m = this.field_m;
                    param0.field_w = this.field_w;
                    param0.field_e = this.field_e;
                    param0.field_lb = this.field_lb;
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    if (oba.c(param4, this.field_h, -19531)) {
                        statePc = 191;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    if (!vta.a(this.field_h, param4, 2048)) {
                        statePc = 188;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    param0.field_O = this.field_O;
                    if (var13 == 0) {
                        statePc = 193;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    param0.field_O = null;
                    if (var13 == 0) {
                        statePc = 193;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    param0.field_O = param2.field_O;
                    param0.field_O.field_h = this.field_O.field_h;
                    param0.field_O.field_e = this.field_O.field_e;
                    param0.field_O.field_b = true;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if (!uk.a(this.field_h, (byte) -47, param4)) {
                        statePc = 210;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    if (param2.field_eb == null) {
                        statePc = 200;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if ((this.field_I ^ -1) >= (param2.field_eb.length ^ -1)) {
                        statePc = 201;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    var11 = this.field_fb;
                    array$9 = new float[var11];
                    param2.field_t = array$9;
                    param0.field_t = array$9;
                    array$10 = new float[var11];
                    param2.field_eb = array$10;
                    param0.field_eb = array$10;
                    if (var13 == 0) {
                        statePc = 203;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    param0.field_eb = param2.field_eb;
                    param0.field_t = param2.field_t;
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    var11 = 0;
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    if (this.field_fb <= var11) {
                        statePc = 209;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    param0.field_eb[var11] = this.field_eb[var11];
                    param0.field_t[var11] = this.field_t[var11];
                    var11++;
                    if (var13 != 0) {
                        statePc = 212;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    if (var13 == 0) {
                        statePc = 204;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    if (var13 == 0) {
                        statePc = 212;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    param0.field_t = this.field_t;
                    param0.field_eb = this.field_eb;
                    statePc = 212;
                    continue stateLoop;
                }
                case 212: {
                    if (!pr.a(param4, -23611, this.field_h)) {
                        statePc = 216;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    param0.field_d = param2.field_d;
                    param0.field_d.field_e = this.field_d.field_e;
                    param0.field_d.field_h = this.field_d.field_h;
                    param0.field_d.field_b = true;
                    if (var13 == 0) {
                        statePc = 224;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    if (foa.a(param4, this.field_h, 0)) {
                        statePc = 222;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    param0.field_d = null;
                    if (var13 == 0) {
                        statePc = 224;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    param0.field_d = this.field_d;
                    statePc = 224;
                    continue stateLoop;
                }
                case 224: {
                    if (!pca.b(this.field_h, 71, param4)) {
                        statePc = 242;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    if (null == param2.field_M) {
                        statePc = 234;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    if ((param2.field_M.length ^ -1) > (this.field_I ^ -1)) {
                        statePc = 234;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    param0.field_z = param2.field_z;
                    param0.field_M = param2.field_M;
                    param0.field_V = param2.field_V;
                    if (var13 == 0) {
                        statePc = 235;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    var11 = this.field_I;
                    array$11 = new short[var11];
                    param2.field_z = array$11;
                    param0.field_z = array$11;
                    array$12 = new short[var11];
                    param2.field_M = array$12;
                    param0.field_M = array$12;
                    array$13 = new short[var11];
                    param2.field_V = array$13;
                    param0.field_V = array$13;
                    statePc = 235;
                    continue stateLoop;
                }
                case 235: {
                    var11 = 0;
                    statePc = 236;
                    continue stateLoop;
                }
                case 236: {
                    if (this.field_I <= var11) {
                        statePc = 241;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    param0.field_M[var11] = this.field_M[var11];
                    param0.field_z[var11] = this.field_z[var11];
                    param0.field_V[var11] = this.field_V[var11];
                    var11++;
                    if (var13 != 0) {
                        statePc = 244;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    if (var13 == 0) {
                        statePc = 236;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    if (var13 == 0) {
                        statePc = 244;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    param0.field_z = this.field_z;
                    param0.field_V = this.field_V;
                    param0.field_M = this.field_M;
                    statePc = 244;
                    continue stateLoop;
                }
                case 244: {
                    if (uu.a(param4, this.field_h, (byte) -116)) {
                        statePc = 254;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    if (ag.b(-1, param4, this.field_h)) {
                        statePc = 251;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    param0.field_g = null;
                    if (var13 == 0) {
                        statePc = 256;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    param0.field_g = this.field_g;
                    if (var13 == 0) {
                        statePc = 256;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    param0.field_g = param2.field_g;
                    param0.field_g.field_g = true;
                    param0.field_g.field_a = this.field_g.field_a;
                    param0.field_g.field_c = this.field_g.field_c;
                    statePc = 256;
                    continue stateLoop;
                }
                case 256: {
                    if (!fua.a(98, param4, this.field_h)) {
                        statePc = 274;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    if (param2.field_gb == null) {
                        statePc = 266;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    if ((param2.field_gb.length ^ -1) > (this.field_I ^ -1)) {
                        statePc = 266;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    param0.field_gb = param2.field_gb;
                    if (var13 == 0) {
                        statePc = 267;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    var11 = this.field_I;
                    array$14 = new short[var11];
                    param2.field_gb = array$14;
                    param0.field_gb = array$14;
                    statePc = 267;
                    continue stateLoop;
                }
                case 267: {
                    var11 = 0;
                    statePc = 268;
                    continue stateLoop;
                }
                case 268: {
                    if (this.field_I <= var11) {
                        statePc = 273;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    param0.field_gb[var11] = this.field_gb[var11];
                    var11++;
                    if (var13 != 0) {
                        statePc = 276;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 270: {
                    if (var13 == 0) {
                        statePc = 268;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    if (var13 == 0) {
                        statePc = 276;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    param0.field_gb = this.field_gb;
                    statePc = 276;
                    continue stateLoop;
                }
                case 276: {
                    if (hk.a(param4, this.field_h, -93)) {
                        statePc = 280;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    param0.field_nb = this.field_nb;
                    if (var13 == 0) {
                        statePc = 299;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    if (param2.field_nb == null) {
                        statePc = 293;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    if (this.field_L > param2.field_nb.length) {
                        statePc = 293;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 286: {
                    param0.field_nb = param2.field_nb;
                    var11 = 0;
                    statePc = 287;
                    continue stateLoop;
                }
                case 287: {
                    if ((var11 ^ -1) <= (this.field_L ^ -1)) {
                        statePc = 292;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    param0.field_nb[var11].a((byte) -81, this.field_nb[var11]);
                    var11++;
                    if (var13 != 0) {
                        statePc = 299;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    if (var13 == 0) {
                        statePc = 287;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    if (var13 == 0) {
                        statePc = 299;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 293: {
                    var11 = this.field_L;
                    array$15 = new gca[var11];
                    param2.field_nb = array$15;
                    param0.field_nb = array$15;
                    var12 = 0;
                    statePc = 294;
                    continue stateLoop;
                }
                case 294: {
                    if (this.field_L <= var12) {
                        statePc = 299;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    param0.field_nb[var12] = this.field_nb[var12].a(6);
                    var12++;
                    if (var13 != 0) {
                        statePc = 303;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    if (var13 == 0) {
                        statePc = 294;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 299: {
                    if (!param1) {
                        statePc = 302;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 300: {
                    discarded$16 = this.a(119, -102, -0.9161184430122375f, 115, -91, 115, -41L, -82, 0.9345446825027466f, false, (oc) null);
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    param0.field_hb = this.field_hb;
                    param0.field_mb = this.field_mb;
                    param0.field_X = this.field_X;
                    param0.field_db = this.field_db;
                    param0.field_D = this.field_D;
                    param0.field_R = this.field_R;
                    param0.field_U = this.field_U;
                    param0.field_s = this.field_s;
                    param0.field_kb = this.field_kb;
                    param0.field_j = this.field_j;
                    param0.field_G = this.field_G;
                    param0.field_jb = this.field_jb;
                    param0.field_J = this.field_J;
                    param0.field_u = this.field_u;
                    param0.field_q = this.field_q;
                    statePc = 303;
                    continue stateLoop;
                }
                case 303: {
                    if (!this.field_A) {
                        statePc = 307;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    param0.field_H = this.field_H;
                    param0.field_o = this.field_o;
                    param0.field_cb = this.field_cb;
                    param0.field_i = this.field_i;
                    param0.field_K = this.field_K;
                    param0.field_A = true;
                    param0.field_Q = this.field_Q;
                    param0.field_n = this.field_n;
                    if (var13 == 0) {
                        statePc = 309;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    param0.field_A = false;
                    statePc = 309;
                    continue stateLoop;
                }
                case 309: {
                    stackIn_310_0 = (gja) (param0);
                    statePc = 310;
                    continue stateLoop;
                }
                case 310: {
                    return (ka) ((Object) stackIn_310_0);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, int param5, boolean param6) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_143_0 = 0;
        int stackIn_143_1 = 0;
        int stackIn_150_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_165_0 = 0;
        int stackIn_166_0 = 0;
        int stackIn_166_1 = 0;
        int stackIn_174_0 = 0;
        int stackIn_174_1 = 0;
        int stackIn_190_0 = 0;
        int stackIn_190_1 = 0;
        int stackIn_197_0 = 0;
        int stackIn_197_1 = 0;
        int stackIn_215_0 = 0;
        int stackIn_215_1 = 0;
        int stackIn_216_0 = 0;
        int stackIn_218_0 = 0;
        int stackIn_219_0 = 0;
        int stackIn_219_1 = 0;
        int stackIn_229_0 = 0;
        int stackIn_229_1 = 0;
        RuntimeException stackIn_290_0 = null;
        StringBuilder stackIn_290_1 = null;
        RuntimeException stackIn_292_0 = null;
        StringBuilder stackIn_292_1 = null;
        RuntimeException stackIn_293_0 = null;
        StringBuilder stackIn_293_1 = null;
        String stackIn_293_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        int[] var11 = null;
        ll var11_ref = null;
        int[] var12_ref_int__ = null;
        int var12 = 0;
        gca var12_ref_gca = null;
        int var13_int = 0;
        gca var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var21 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var8_int = param1.length;
                    if (0 != param0) {
                        statePc = 24;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    param3 = param3 << 4;
                    param2 = param2 << 4;
                    param4 = param4 << 4;
                    ina.field_a = 0;
                    pb.field_k = 0;
                    uu.field_c = 0;
                    var9 = 0;
                    var10 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var10 >= var8_int) {
                        statePc = 16;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var11_int = param1[var10];
                    stackIn_17_0 = var11_int;
                    stackIn_5_0 = stackIn_17_0;
                    stackIn_17_1 = this.field_D.length;
                    stackIn_5_1 = stackIn_17_1;
                    if (var21 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (stackIn_5_0 >= stackIn_5_1) {
                        statePc = 14;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var12_ref_int__ = this.field_D[var11_int];
                    var13_int = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if ((var13_int ^ -1) <= (var12_ref_int__.length ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var14 = var12_ref_int__[var13_int];
                    ina.field_a = ina.field_a + this.field_Z[var14];
                    pb.field_k = pb.field_k + this.field_r[var14];
                    var9++;
                    uu.field_c = uu.field_c + this.field_l[var14];
                    var13_int++;
                    if (var21 != 0) {
                        statePc = 15;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var21 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var10++;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var21 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = 0;
                    stackIn_17_1 = var9;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (stackIn_17_0 < stackIn_17_1) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    ina.field_a = param2;
                    pb.field_k = param3;
                    uu.field_c = param4;
                    if (var21 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    uu.field_c = uu.field_c / var9 - -param4;
                    ina.field_a = ina.field_a / var9 + param2;
                    pb.field_k = param3 + pb.field_k / var9;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    return;
                }
                case 24: {
                    if (-2 == (param0 ^ -1)) {
                        statePc = 27;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 27: {
                    param3 = param3 << 4;
                    param2 = param2 << 4;
                    param4 = param4 << 4;
                    var9 = 0;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (var8_int <= var9) {
                        statePc = 40;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var10 = param1[var9];
                    if (this.field_D.length > var10) {
                        statePc = 32;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var11 = this.field_D[var10];
                    var12 = 0;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if ((var12 ^ -1) <= (var11.length ^ -1)) {
                        statePc = 38;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var13_int = var11[var12];
                    this.field_Z[var13_int] = this.field_Z[var13_int] + param2;
                    this.field_r[var13_int] = this.field_r[var13_int] + param3;
                    this.field_l[var13_int] = this.field_l[var13_int] + param4;
                    var12++;
                    if (var21 != 0) {
                        statePc = 39;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (var21 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var9++;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var21 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    return;
                }
                case 41: {
                    if (2 != param0) {
                        statePc = 117;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var9 = 0;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    stackIn_44_0 = var8_int;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    stackIn_45_0 = stackIn_44_0;
                    stackIn_45_1 = var9;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (stackIn_45_0 <= stackIn_45_1) {
                        statePc = 80;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var10 = param1[var9];
                    stackIn_86_0 = var10 ^ -1;
                    stackIn_47_0 = stackIn_86_0;
                    stackIn_86_1 = this.field_D.length ^ -1;
                    stackIn_47_1 = stackIn_86_1;
                    if (var21 != 0) {
                        statePc = 86;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (stackIn_47_0 <= stackIn_47_1) {
                        statePc = 79;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var11 = this.field_D[var10];
                    if ((param5 & 1 ^ -1) == -1) {
                        statePc = 67;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var12 = 0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if ((var12 ^ -1) <= (var11.length ^ -1)) {
                        statePc = 66;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var13_int = var11[var12];
                    this.field_Z[var13_int] = this.field_Z[var13_int] - ina.field_a;
                    this.field_r[var13_int] = this.field_r[var13_int] - pb.field_k;
                    this.field_l[var13_int] = this.field_l[var13_int] - uu.field_c;
                    stackIn_44_0 = param2;
                    stackIn_54_0 = stackIn_44_0;
                    if (var21 != 0) {
                        statePc = 44;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (stackIn_54_0 != 0) {
                        statePc = 56;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var14 = qu.field_b[param2];
                    var15 = qu.field_d[param2];
                    var16 = -(this.field_l[var13_int] * var14) + (this.field_r[var13_int] * var15 - -16383) >> 149415118;
                    this.field_l[var13_int] = this.field_r[var13_int] * var14 + (var15 * this.field_l[var13_int] + 16383) >> 897059438;
                    this.field_r[var13_int] = var16;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (param4 != 0) {
                        statePc = 60;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var14 = qu.field_b[param4];
                    var15 = qu.field_d[param4];
                    var16 = 16383 + var14 * this.field_r[var13_int] + this.field_Z[var13_int] * var15 >> -599770354;
                    this.field_r[var13_int] = 16383 + (-(this.field_Z[var13_int] * var14) + var15 * this.field_r[var13_int]) >> -797693554;
                    this.field_Z[var13_int] = var16;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    if (-1 != (param3 ^ -1)) {
                        statePc = 64;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var14 = qu.field_b[param3];
                    var15 = qu.field_d[param3];
                    var16 = 16383 + var14 * this.field_l[var13_int] - -(var15 * this.field_Z[var13_int]) >> 437860238;
                    this.field_l[var13_int] = this.field_l[var13_int] * var15 - (this.field_Z[var13_int] * var14 - 16383) >> -1880370386;
                    this.field_Z[var13_int] = var16;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    this.field_Z[var13_int] = this.field_Z[var13_int] + ina.field_a;
                    this.field_r[var13_int] = this.field_r[var13_int] + pb.field_k;
                    this.field_l[var13_int] = this.field_l[var13_int] + uu.field_c;
                    var12++;
                    if (var21 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (var21 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var12 = 0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (var11.length <= var12) {
                        statePc = 79;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var13_int = var11[var12];
                    this.field_Z[var13_int] = this.field_Z[var13_int] - ina.field_a;
                    this.field_r[var13_int] = this.field_r[var13_int] - pb.field_k;
                    this.field_l[var13_int] = this.field_l[var13_int] - uu.field_c;
                    stackIn_45_0 = -1;
                    stackIn_70_0 = stackIn_45_0;
                    stackIn_45_1 = param4 ^ -1;
                    stackIn_70_1 = stackIn_45_1;
                    if (var21 != 0) {
                        statePc = 45;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (stackIn_70_0 == stackIn_70_1) {
                        statePc = 72;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var14 = qu.field_b[param4];
                    var15 = qu.field_d[param4];
                    var16 = 16383 + (this.field_r[var13_int] * var14 + this.field_Z[var13_int] * var15) >> 1480945454;
                    this.field_r[var13_int] = -(var14 * this.field_Z[var13_int]) + this.field_r[var13_int] * var15 + 16383 >> 2033584814;
                    this.field_Z[var13_int] = var16;
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    if ((param2 ^ -1) == -1) {
                        statePc = 74;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var14 = qu.field_b[param2];
                    var15 = qu.field_d[param2];
                    var16 = 16383 + -(var14 * this.field_l[var13_int]) + var15 * this.field_r[var13_int] >> 2032661230;
                    this.field_l[var13_int] = 16383 + var14 * this.field_r[var13_int] - -(this.field_l[var13_int] * var15) >> 311363182;
                    this.field_r[var13_int] = var16;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (-1 != (param3 ^ -1)) {
                        statePc = 77;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var14 = qu.field_b[param3];
                    var15 = qu.field_d[param3];
                    var16 = 16383 + var15 * this.field_Z[var13_int] + this.field_l[var13_int] * var14 >> -1180152306;
                    this.field_l[var13_int] = this.field_l[var13_int] * var15 + (-(this.field_Z[var13_int] * var14) - -16383) >> -1465875090;
                    this.field_Z[var13_int] = var16;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    this.field_Z[var13_int] = this.field_Z[var13_int] + ina.field_a;
                    this.field_r[var13_int] = this.field_r[var13_int] + pb.field_k;
                    this.field_l[var13_int] = this.field_l[var13_int] + uu.field_c;
                    var12++;
                    if (var21 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var9++;
                    if (var21 == 0) {
                        statePc = 43;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (param6) {
                        statePc = 83;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 83: {
                    var9 = 0;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    stackIn_85_0 = var9 ^ -1;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    stackIn_86_0 = stackIn_85_0;
                    stackIn_86_1 = var8_int ^ -1;
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    if (stackIn_86_0 <= stackIn_86_1) {
                        statePc = 115;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var10 = param1[var9];
                    if (var21 != 0) {
                        statePc = 116;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if ((var10 ^ -1) > (this.field_D.length ^ -1)) {
                        statePc = 93;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var11 = this.field_D[var10];
                    var12 = 0;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    stackIn_95_0 = var11.length;
                    stackIn_95_1 = var12;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    if (stackIn_95_0 <= stackIn_95_1) {
                        statePc = 114;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    var13_int = var11[var12];
                    var14 = this.field_J[var13_int];
                    var15 = this.field_J[1 + var13_int];
                    stackIn_85_0 = var14;
                    stackIn_97_0 = stackIn_85_0;
                    if (var21 != 0) {
                        statePc = 85;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var16 = stackIn_97_0;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    if (var16 >= var15) {
                        statePc = 113;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var17 = this.field_db[var16] + -1;
                    stackIn_95_0 = -1;
                    stackIn_100_0 = stackIn_95_0;
                    stackIn_95_1 = var17;
                    stackIn_100_1 = stackIn_95_1;
                    if (var21 != 0) {
                        statePc = 95;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if (stackIn_100_0 != stackIn_100_1) {
                        statePc = 104;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (var21 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if (param4 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    var18 = qu.field_b[param4];
                    var19 = qu.field_d[param4];
                    var20 = 16383 + (this.field_lb[var17] * var19 + this.field_m[var17] * var18) >> -1117593746;
                    this.field_m[var17] = (short)(-(var18 * this.field_lb[var17]) + this.field_m[var17] * var19 - -16383 >> 948940238);
                    this.field_lb[var17] = (short)var20;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    if (param2 == 0) {
                        statePc = 110;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    var18 = qu.field_b[param2];
                    var19 = qu.field_d[param2];
                    var20 = var19 * this.field_m[var17] + (-(this.field_p[var17] * var18) - -16383) >> -1142044146;
                    this.field_p[var17] = (short)(this.field_m[var17] * var18 + (var19 * this.field_p[var17] - -16383) >> -1785035250);
                    this.field_m[var17] = (short)var20;
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    if (-1 == (param3 ^ -1)) {
                        statePc = 112;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    var18 = qu.field_b[param3];
                    var19 = qu.field_d[param3];
                    var20 = var18 * this.field_p[var17] - (-(this.field_lb[var17] * var19) + -16383) >> 1390212782;
                    this.field_p[var17] = (short)(-(this.field_lb[var17] * var18) + (this.field_p[var17] * var19 - -16383) >> -1407613906);
                    this.field_lb[var17] = (short)var20;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    var16++;
                    if (var21 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    var12++;
                    if (var21 == 0) {
                        statePc = 94;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    var9++;
                    if (var21 == 0) {
                        statePc = 84;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    this.d((byte) 28);
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    return;
                }
                case 117: {
                    if ((param0 ^ -1) == -4) {
                        statePc = 120;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 120: {
                    var9 = 0;
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    if (var8_int <= var9) {
                        statePc = 133;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var10 = param1[var9];
                    if ((var10 ^ -1) > (this.field_D.length ^ -1)) {
                        statePc = 125;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 125: {
                    var11 = this.field_D[var10];
                    var12 = 0;
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    if ((var12 ^ -1) <= (var11.length ^ -1)) {
                        statePc = 131;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var13_int = var11[var12];
                    this.field_Z[var13_int] = this.field_Z[var13_int] - ina.field_a;
                    this.field_r[var13_int] = this.field_r[var13_int] - pb.field_k;
                    this.field_l[var13_int] = this.field_l[var13_int] - uu.field_c;
                    this.field_Z[var13_int] = param2 * this.field_Z[var13_int] >> -1250635033;
                    this.field_r[var13_int] = param3 * this.field_r[var13_int] >> 459435143;
                    this.field_l[var13_int] = this.field_l[var13_int] * param4 >> 1874874535;
                    this.field_Z[var13_int] = this.field_Z[var13_int] + ina.field_a;
                    this.field_r[var13_int] = this.field_r[var13_int] + pb.field_k;
                    this.field_l[var13_int] = this.field_l[var13_int] + uu.field_c;
                    var12++;
                    if (var21 != 0) {
                        statePc = 132;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if (var21 == 0) {
                        statePc = 126;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    var9++;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    if (var21 == 0) {
                        statePc = 121;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    return;
                }
                case 134: {
                    if (-6 != (param0 ^ -1)) {
                        statePc = 181;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (this.field_q != null) {
                        statePc = 140;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var9 = 0;
                    var10 = 0;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    if (var8_int <= var10) {
                        statePc = 168;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var11_int = param1[var10];
                    stackIn_174_0 = var11_int;
                    stackIn_143_0 = stackIn_174_0;
                    stackIn_174_1 = this.field_q.length;
                    stackIn_143_1 = stackIn_174_1;
                    if (var21 != 0) {
                        statePc = 174;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if (stackIn_143_0 < stackIn_143_1) {
                        statePc = 147;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var12_ref_int__ = this.field_q[var11_int];
                    var13_int = 0;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    if ((var12_ref_int__.length ^ -1) >= (var13_int ^ -1)) {
                        statePc = 161;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    var14 = var12_ref_int__[var13_int];
                    var15 = 8 * param2 + (this.field_C[var14] & 255);
                    stackIn_162_0 = var15;
                    stackIn_150_0 = stackIn_162_0;
                    if (var21 != 0) {
                        statePc = 162;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    if (stackIn_150_0 < 0) {
                        statePc = 159;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if (var15 > 255) {
                        statePc = 158;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 158: {
                    var15 = 255;
                    if (var21 == 0) {
                        statePc = 160;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    var15 = 0;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    this.field_C[var14] = (byte)var15;
                    var13_int++;
                    if (var21 == 0) {
                        statePc = 148;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    stackIn_162_0 = var9;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    stackIn_165_0 = stackIn_162_0;
                    stackIn_163_0 = stackIn_165_0;
                    if (var12_ref_int__.length <= 0) {
                        statePc = 165;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    stackIn_166_0 = stackIn_163_0;
                    stackIn_166_1 = 1;
                    statePc = 166;
                    continue stateLoop;
                }
                case 165: {
                    stackIn_166_0 = stackIn_165_0;
                    stackIn_166_1 = 0;
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    var9 = stackIn_166_0 | stackIn_166_1;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    var10++;
                    if (var21 == 0) {
                        statePc = 141;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if (var9 == 0) {
                        statePc = 180;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    if (this.field_u == null) {
                        statePc = 179;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    var10 = 0;
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    stackIn_174_0 = var10 ^ -1;
                    stackIn_174_1 = this.field_L ^ -1;
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    if (stackIn_174_0 <= stackIn_174_1) {
                        statePc = 179;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    var11_ref = this.field_u[var10];
                    var12_ref_gca = this.field_nb[var10];
                    var12_ref_gca.field_h = 255 - (255 & this.field_C[var11_ref.field_m]) << -431912168 | 16777215 & var12_ref_gca.field_h;
                    var10++;
                    if (var21 != 0) {
                        statePc = 180;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    if (var21 == 0) {
                        statePc = 173;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    this.e(0);
                    statePc = 180;
                    continue stateLoop;
                }
                case 180: {
                    return;
                }
                case 181: {
                    if (-8 == (param0 ^ -1)) {
                        statePc = 184;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 184: {
                    if (null != this.field_q) {
                        statePc = 187;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 187: {
                    var9 = 0;
                    var10 = 0;
                    statePc = 188;
                    continue stateLoop;
                }
                case 188: {
                    if ((var10 ^ -1) <= (var8_int ^ -1)) {
                        statePc = 221;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    var11_int = param1[var10];
                    stackIn_229_0 = this.field_q.length;
                    stackIn_190_0 = stackIn_229_0;
                    stackIn_229_1 = var11_int;
                    stackIn_190_1 = stackIn_229_1;
                    if (var21 != 0) {
                        statePc = 229;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if (stackIn_190_0 > stackIn_190_1) {
                        statePc = 194;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 194: {
                    var12_ref_int__ = this.field_q[var11_int];
                    var13_int = 0;
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    if ((var13_int ^ -1) <= (var12_ref_int__.length ^ -1)) {
                        statePc = 214;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    var14 = var12_ref_int__[var13_int];
                    var15 = this.field_P[var14] & 65535;
                    var16 = 63 & var15 >> 2556426;
                    var17 = (var15 & 1004) >> -1917344601;
                    var18 = 127 & var15;
                    var16 = 63 & param2 + var16;
                    var17 = var17 + param3 / 4;
                    stackIn_215_0 = 0;
                    stackIn_197_0 = stackIn_215_0;
                    stackIn_215_1 = var17;
                    stackIn_197_1 = stackIn_215_1;
                    if (var21 != 0) {
                        statePc = 215;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if (stackIn_197_0 <= stackIn_197_1) {
                        statePc = 201;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    var17 = 0;
                    if (var21 == 0) {
                        statePc = 205;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (-8 <= (var17 ^ -1)) {
                        statePc = 205;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    var17 = 7;
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    var18 = var18 + param4;
                    if (0 <= var18) {
                        statePc = 207;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    var18 = 0;
                    if (var21 == 0) {
                        statePc = 213;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    if (var18 > 127) {
                        statePc = 212;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 212: {
                    var18 = 127;
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    this.field_P[var14] = (short)fh.a(fh.a(var17 << -1943078265, var16 << 1172976938), var18);
                    var13_int++;
                    if (var21 == 0) {
                        statePc = 195;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    stackIn_215_0 = var9;
                    stackIn_215_1 = var12_ref_int__.length ^ -1;
                    statePc = 215;
                    continue stateLoop;
                }
                case 215: {
                    stackIn_218_0 = stackIn_215_0;
                    stackIn_216_0 = stackIn_218_0;
                    if (stackIn_215_1 >= -1) {
                        statePc = 218;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    stackIn_219_0 = stackIn_216_0;
                    stackIn_219_1 = 1;
                    statePc = 219;
                    continue stateLoop;
                }
                case 218: {
                    stackIn_219_0 = stackIn_218_0;
                    stackIn_219_1 = 0;
                    statePc = 219;
                    continue stateLoop;
                }
                case 219: {
                    var9 = stackIn_219_0 | stackIn_219_1;
                    statePc = 220;
                    continue stateLoop;
                }
                case 220: {
                    var10++;
                    if (var21 == 0) {
                        statePc = 188;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    if (var9 == 0) {
                        statePc = 235;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    if (this.field_u != null) {
                        statePc = 227;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 227: {
                    var10 = 0;
                    statePc = 228;
                    continue stateLoop;
                }
                case 228: {
                    stackIn_229_0 = var10 ^ -1;
                    stackIn_229_1 = this.field_L ^ -1;
                    statePc = 229;
                    continue stateLoop;
                }
                case 229: {
                    if (stackIn_229_0 <= stackIn_229_1) {
                        statePc = 234;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    var11_ref = this.field_u[var10];
                    var12_ref_gca = this.field_nb[var10];
                    var12_ref_gca.field_h = 16777215 & cla.field_m[this.field_P[var11_ref.field_m] & 65535] | var12_ref_gca.field_h & -16777216;
                    var10++;
                    if (var21 != 0) {
                        statePc = 235;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    if (var21 == 0) {
                        statePc = 228;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    this.e(0);
                    statePc = 235;
                    continue stateLoop;
                }
                case 235: {
                    return;
                }
                case 236: {
                    if ((param0 ^ -1) == -9) {
                        statePc = 239;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 239: {
                    if (this.field_mb == null) {
                        statePc = 251;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    var9 = 0;
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    if ((var9 ^ -1) <= (var8_int ^ -1)) {
                        statePc = 251;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    var10 = param1[var9];
                    if ((this.field_mb.length ^ -1) >= (var10 ^ -1)) {
                        statePc = 249;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    var11 = this.field_mb[var10];
                    var12 = 0;
                    statePc = 244;
                    continue stateLoop;
                }
                case 244: {
                    if ((var12 ^ -1) <= (var11.length ^ -1)) {
                        statePc = 249;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    var13 = this.field_nb[var11[var12]];
                    var13.field_b = var13.field_b + param3;
                    var13.field_e = var13.field_e + param2;
                    var12++;
                    if (var21 != 0) {
                        statePc = 250;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    if (var21 == 0) {
                        statePc = 244;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    var9++;
                    statePc = 250;
                    continue stateLoop;
                }
                case 250: {
                    if (var21 == 0) {
                        statePc = 241;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    return;
                }
                case 252: {
                    if (10 == param0) {
                        statePc = 255;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 255: {
                    if (this.field_mb != null) {
                        statePc = 258;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 258: {
                    var9 = 0;
                    statePc = 259;
                    continue stateLoop;
                }
                case 259: {
                    if (var8_int <= var9) {
                        statePc = 269;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    var10 = param1[var9];
                    if ((var10 ^ -1) <= (this.field_mb.length ^ -1)) {
                        statePc = 267;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    var11 = this.field_mb[var10];
                    var12 = 0;
                    statePc = 262;
                    continue stateLoop;
                }
                case 262: {
                    if ((var11.length ^ -1) >= (var12 ^ -1)) {
                        statePc = 267;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    var13 = this.field_nb[var11[var12]];
                    var13.field_k = param3 * var13.field_k >> 1652240135;
                    var13.field_m = var13.field_m * param2 >> -574794041;
                    var12++;
                    if (var21 != 0) {
                        statePc = 268;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    if (var21 == 0) {
                        statePc = 262;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    var9++;
                    statePc = 268;
                    continue stateLoop;
                }
                case 268: {
                    if (var21 == 0) {
                        statePc = 259;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    return;
                }
                case 270: {
                    if (9 != param0) {
                        statePc = 294;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    if (null == this.field_mb) {
                        statePc = 287;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    var9 = 0;
                    statePc = 275;
                    continue stateLoop;
                }
                case 275: {
                    if (var8_int <= var9) {
                        statePc = 287;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    var10 = param1[var9];
                    if ((this.field_mb.length ^ -1) < (var10 ^ -1)) {
                        statePc = 279;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 279: {
                    var11 = this.field_mb[var10];
                    var12 = 0;
                    statePc = 280;
                    continue stateLoop;
                }
                case 280: {
                    if ((var12 ^ -1) <= (var11.length ^ -1)) {
                        statePc = 285;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    var13 = this.field_nb[var11[var12]];
                    var13.field_c = 16383 & var13.field_c - -param2;
                    var12++;
                    if (var21 != 0) {
                        statePc = 286;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 282: {
                    if (var21 == 0) {
                        statePc = 280;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    var9++;
                    statePc = 286;
                    continue stateLoop;
                }
                case 286: {
                    if (var21 == 0) {
                        statePc = 275;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    return;
                }
                case 294: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void d(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = 85 / ((param0 - -81) / 40);
              if (null == this.field_ib) {
                break L1;
              } else {
                this.field_ib.field_h = false;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "gja.J(" + param0 + ')');
        }
    }

    final void e(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (this.field_ib != null) {
                this.field_ib.c(-5941);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null == this.field_d) {
                break L2;
              } else {
                this.field_d.c(-5941);
                break L2;
              }
            }
            L3: {
              if (this.field_E == null) {
                break L3;
              } else {
                this.field_E.c(-5941);
                break L3;
              }
            }
            L4: {
              if (null == this.field_O) {
                break L4;
              } else {
                this.field_O.c(-5941);
                break L4;
              }
            }
            L5: {
              if (null == this.field_g) {
                break L5;
              } else {
                this.field_g.a(-17253);
                break L5;
              }
            }
            L6: {
              if (param0 >= 109) {
                break L6;
              } else {
                this.field_mb = (int[][]) null;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "gja.F(" + param0 + ')');
        }
    }

    final void I(int param0, int[] param1, int param2, int param3, int param4, boolean param5, int param6, int[] param7) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        Object stackIn_111_0 = null;
        int stackIn_120_0 = 0;
        int stackIn_120_1 = 0;
        Object stackIn_138_0 = null;
        int stackIn_146_0 = 0;
        int stackIn_148_0 = 0;
        int stackIn_151_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_165_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_178_0 = 0;
        Object stackIn_184_0 = null;
        Object stackIn_187_0 = null;
        Object stackIn_208_0 = null;
        Object stackIn_211_0 = null;
        int stackIn_226_0 = 0;
        int stackIn_228_0 = 0;
        int stackIn_231_0 = 0;
        int stackIn_241_0 = 0;
        Object stackIn_246_0 = null;
        Object stackIn_249_0 = null;
        int stackIn_264_0 = 0;
        int stackIn_264_1 = 0;
        Object stackIn_270_0 = null;
        Object stackIn_270_1 = null;
        int stackIn_290_0 = 0;
        int stackIn_292_0 = 0;
        int stackIn_293_0 = 0;
        int stackIn_293_1 = 0;
        Object stackIn_298_0 = null;
        Object stackIn_298_1 = null;
        int stackIn_301_0 = 0;
        int stackIn_301_1 = 0;
        int stackIn_315_0 = 0;
        int stackIn_315_1 = 0;
        Object stackIn_322_0 = null;
        Object stackIn_322_1 = null;
        int stackIn_345_0 = 0;
        int stackIn_347_0 = 0;
        int stackIn_348_0 = 0;
        int stackIn_348_1 = 0;
        Object stackIn_353_0 = null;
        Object stackIn_353_1 = null;
        int stackIn_358_0 = 0;
        int stackIn_358_1 = 0;
        RuntimeException stackIn_419_0 = null;
        StringBuilder stackIn_419_1 = null;
        RuntimeException stackIn_421_0 = null;
        StringBuilder stackIn_421_1 = null;
        RuntimeException stackIn_422_0 = null;
        StringBuilder stackIn_422_1 = null;
        String stackIn_422_2 = null;
        RuntimeException stackIn_423_0 = null;
        StringBuilder stackIn_423_1 = null;
        RuntimeException stackIn_425_0 = null;
        StringBuilder stackIn_425_1 = null;
        RuntimeException stackIn_426_0 = null;
        StringBuilder stackIn_426_1 = null;
        String stackIn_426_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        int[] var12 = null;
        ll var12_ref = null;
        int[] var13_ref_int__ = null;
        int var13 = 0;
        gca var13_ref_gca = null;
        int var14_int = 0;
        gca var14 = null;
        int var15 = 0;
        int var16 = 0;
        int[] var16_ref_int__ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        int[] var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29_int = 0;
        int[] var29 = null;
        int var30 = 0;
        int[] var31_ref_int__ = null;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35_int = 0;
        int[] var35 = null;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var47 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var9_int = param1.length;
                    if (0 != param0) {
                        statePc = 34;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    param3 = param3 << 4;
                    param4 = param4 << 4;
                    param2 = param2 << 4;
                    var10 = 0;
                    pb.field_k = 0;
                    ina.field_a = 0;
                    uu.field_c = 0;
                    var11 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var11 >= var9_int) {
                        statePc = 26;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var12_int = param1[var11];
                    stackIn_32_0 = var12_int;
                    stackIn_5_0 = stackIn_32_0;
                    stackIn_32_1 = this.field_D.length;
                    stackIn_5_1 = stackIn_32_1;
                    if (var47 != 0) {
                        statePc = 32;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (stackIn_5_0 < stackIn_5_1) {
                        statePc = 9;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var13_ref_int__ = this.field_D[var12_int];
                    var14_int = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if ((var14_int ^ -1) <= (var13_ref_int__.length ^ -1)) {
                        statePc = 24;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var15 = var13_ref_int__[var14_int];
                    if (var47 != 0) {
                        statePc = 25;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (null == this.field_hb) {
                        statePc = 21;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if ((param6 & this.field_hb[var15]) != 0) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (var47 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    ina.field_a = ina.field_a + this.field_Z[var15];
                    pb.field_k = pb.field_k + this.field_r[var15];
                    uu.field_c = uu.field_c + this.field_l[var15];
                    var10++;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var14_int++;
                    if (var47 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var11++;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (var47 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var10 > 0) {
                        statePc = 30;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    uu.field_c = param4;
                    pb.field_k = param3;
                    ina.field_a = param2;
                    if (var47 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    vr.field_o = true;
                    uu.field_c = param4 + uu.field_c / var10;
                    ina.field_a = ina.field_a / var10 - -param2;
                    stackIn_32_0 = param3;
                    stackIn_32_1 = pb.field_k / var10;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    pb.field_k = stackIn_32_0 + stackIn_32_1;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    return;
                }
                case 34: {
                    if (param0 != 1) {
                        statePc = 62;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (null == param7) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var10 = 8192 + (param3 * param7[1] + param2 * param7[0] + param4 * param7[2]) >> 2103059054;
                    var11 = 8192 + (param4 * param7[5] + param3 * param7[4] + param2 * param7[3]) >> -873298066;
                    var12_int = 8192 + param7[8] * param4 + (param7[7] * param3 + param2 * param7[6]) >> -144060114;
                    param3 = var11;
                    param2 = var10;
                    param4 = var12_int;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    param3 = param3 << 4;
                    param4 = param4 << 4;
                    param2 = param2 << 4;
                    var10 = 0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if ((var9_int ^ -1) >= (var10 ^ -1)) {
                        statePc = 61;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var11 = param1[var10];
                    if ((this.field_D.length ^ -1) < (var11 ^ -1)) {
                        statePc = 44;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var12 = this.field_D[var11];
                    var13 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (var13 >= var12.length) {
                        statePc = 59;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var14_int = var12[var13];
                    if (var47 != 0) {
                        statePc = 60;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (null == this.field_hb) {
                        statePc = 56;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if ((this.field_hb[var14_int] & param6 ^ -1) != -1) {
                        statePc = 56;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (var47 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    this.field_Z[var14_int] = this.field_Z[var14_int] + param2;
                    this.field_r[var14_int] = this.field_r[var14_int] + param3;
                    this.field_l[var14_int] = this.field_l[var14_int] + param4;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    var13++;
                    if (var47 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var10++;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if (var47 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    return;
                }
                case 62: {
                    if (-3 == (param0 ^ -1)) {
                        statePc = 65;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (param7 != null) {
                        statePc = 140;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    var10 = 0;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if (var10 >= var9_int) {
                        statePc = 97;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var11 = param1[var10];
                    stackIn_102_0 = var11;
                    stackIn_69_0 = stackIn_102_0;
                    stackIn_102_1 = this.field_D.length;
                    stackIn_69_1 = stackIn_102_1;
                    if (var47 != 0) {
                        statePc = 102;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (stackIn_69_0 >= stackIn_69_1) {
                        statePc = 95;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var12 = this.field_D[var11];
                    var13 = 0;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    if (var12.length <= var13) {
                        statePc = 95;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var14_int = var12[var13];
                    if (var47 != 0) {
                        statePc = 96;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (null == this.field_hb) {
                        statePc = 81;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if ((this.field_hb[var14_int] & param6) == 0) {
                        statePc = 94;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    this.field_Z[var14_int] = this.field_Z[var14_int] - ina.field_a;
                    this.field_r[var14_int] = this.field_r[var14_int] - pb.field_k;
                    this.field_l[var14_int] = this.field_l[var14_int] - uu.field_c;
                    if (0 != param4) {
                        statePc = 86;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var15 = qu.field_b[param4];
                    var16 = qu.field_d[param4];
                    var17 = var16 * this.field_Z[var14_int] + var15 * this.field_r[var14_int] - -16383 >> 2047719310;
                    this.field_r[var14_int] = 16383 + var16 * this.field_r[var14_int] + -(this.field_Z[var14_int] * var15) >> -199087826;
                    this.field_Z[var14_int] = var17;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if ((param2 ^ -1) == -1) {
                        statePc = 89;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var15 = qu.field_b[param2];
                    var16 = qu.field_d[param2];
                    var17 = 16383 + (var16 * this.field_r[var14_int] - var15 * this.field_l[var14_int]) >> 1602735406;
                    this.field_l[var14_int] = var16 * this.field_l[var14_int] + var15 * this.field_r[var14_int] - -16383 >> 149711630;
                    this.field_r[var14_int] = var17;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if (param3 != 0) {
                        statePc = 92;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var15 = qu.field_b[param3];
                    var16 = qu.field_d[param3];
                    var17 = var16 * this.field_Z[var14_int] + var15 * this.field_l[var14_int] - -16383 >> 918812014;
                    this.field_l[var14_int] = 16383 + var16 * this.field_l[var14_int] + -(var15 * this.field_Z[var14_int]) >> 827230094;
                    this.field_Z[var14_int] = var17;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    this.field_Z[var14_int] = this.field_Z[var14_int] + ina.field_a;
                    this.field_r[var14_int] = this.field_r[var14_int] + pb.field_k;
                    this.field_l[var14_int] = this.field_l[var14_int] + uu.field_c;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    var13++;
                    if (var47 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var10++;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    if (var47 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (param5) {
                        statePc = 100;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 100: {
                    var10 = 0;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    stackIn_102_0 = var9_int ^ -1;
                    stackIn_102_1 = var10 ^ -1;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    if (stackIn_102_0 >= stackIn_102_1) {
                        statePc = 137;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    var11 = param1[var10];
                    if (var47 != 0) {
                        statePc = 139;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if (var11 >= this.field_D.length) {
                        statePc = 136;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    var12 = this.field_D[var11];
                    var13 = 0;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    stackIn_109_0 = var13;
                    stackIn_109_1 = var12.length;
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    if (stackIn_109_0 >= stackIn_109_1) {
                        statePc = 136;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    var14_int = var12[var13];
                    stackIn_138_0 = this;
                    stackIn_111_0 = stackIn_138_0;
                    if (var47 != 0) {
                        statePc = 138;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if (((gja) (this)).field_hb == null) {
                        statePc = 117;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if ((this.field_hb[var14_int] & param6 ^ -1) == -1) {
                        statePc = 135;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    var15 = this.field_J[var14_int];
                    var16 = this.field_J[1 + var14_int];
                    var17 = var15;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    if ((var16 ^ -1) >= (var17 ^ -1)) {
                        statePc = 135;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    var18 = this.field_db[var17] - 1;
                    stackIn_109_0 = -1;
                    stackIn_120_0 = stackIn_109_0;
                    stackIn_109_1 = var18;
                    stackIn_120_1 = stackIn_109_1;
                    if (var47 != 0) {
                        statePc = 109;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (stackIn_120_0 != stackIn_120_1) {
                        statePc = 124;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if (var47 == 0) {
                        statePc = 135;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (0 == param4) {
                        statePc = 128;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var19 = qu.field_b[param4];
                    var20 = qu.field_d[param4];
                    var21 = var19 * this.field_m[var18] + this.field_lb[var18] * var20 + 16383 >> 289769006;
                    this.field_m[var18] = (short)(-(this.field_lb[var18] * var19) + this.field_m[var18] * var20 - -16383 >> -1366402450);
                    this.field_lb[var18] = (short)var21;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    if ((param2 ^ -1) != -1) {
                        statePc = 131;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 131: {
                    var19 = qu.field_b[param2];
                    var20 = qu.field_d[param2];
                    var21 = var20 * this.field_m[var18] + -(this.field_p[var18] * var19) + 16383 >> -232201970;
                    this.field_p[var18] = (short)(16383 + (this.field_m[var18] * var19 + var20 * this.field_p[var18]) >> -521257234);
                    this.field_m[var18] = (short)var21;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    if (0 == param3) {
                        statePc = 134;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var19 = qu.field_b[param3];
                    var20 = qu.field_d[param3];
                    var21 = 16383 + var19 * this.field_p[var18] - -(this.field_lb[var18] * var20) >> 1348708686;
                    this.field_p[var18] = (short)(16383 + this.field_p[var18] * var20 + -(this.field_lb[var18] * var19) >> 1259144398);
                    this.field_lb[var18] = (short)var21;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    var17++;
                    if (var47 == 0) {
                        statePc = 118;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    var13++;
                    if (var47 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var10++;
                    if (var47 == 0) {
                        statePc = 101;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    stackIn_138_0 = this;
                    statePc = 138;
                    continue stateLoop;
                }
                case 138: {
                    this.d((byte) 123);
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    if (var47 == 0) {
                        statePc = 194;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var10 = param7[9] << 22178692;
                    var11 = param7[10] << 353547428;
                    var12_int = param7[11] << -516736508;
                    var13 = param7[12] << -58444764;
                    var14_int = param7[13] << 166590180;
                    var15 = param7[14] << 1512349956;
                    if (vr.field_o) {
                        statePc = 143;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 143: {
                    var16 = 8192 + ina.field_a * param7[0] + (param7[3] * pb.field_k + param7[6] * uu.field_c) >> -752966322;
                    var17 = 8192 + ina.field_a * param7[1] - -(param7[4] * pb.field_k) - -(uu.field_c * param7[7]) >> -806385330;
                    var18 = param7[8] * uu.field_c + param7[5] * pb.field_k + param7[2] * ina.field_a + 8192 >> 695318318;
                    var16 = var16 + var13;
                    var17 = var17 + var14_int;
                    ina.field_a = var16;
                    pb.field_k = var17;
                    var18 = var18 + var15;
                    vr.field_o = false;
                    uu.field_c = var18;
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    var16_ref_int__ = new int[9];
                    var17 = qu.field_d[param2];
                    var18 = qu.field_b[param2];
                    var19 = qu.field_d[param3];
                    var20 = qu.field_b[param3];
                    var21 = qu.field_d[param4];
                    var22 = qu.field_b[param4];
                    var23 = 8192 + var18 * var21 >> 1137990574;
                    var24 = var18 * var22 + 8192 >> -1268889938;
                    var16_ref_int__[8] = var17 * var19 - -8192 >> 480003854;
                    var16_ref_int__[5] = -var18;
                    var16_ref_int__[6] = var24 * var19 + (var21 * -var20 - -8192) >> -121983154;
                    var16_ref_int__[3] = 8192 + var22 * var17 >> 1778792622;
                    var16_ref_int__[1] = 8192 + var20 * var23 + var22 * -var19 >> 1178176974;
                    var16_ref_int__[7] = var22 * var20 - -(var19 * var23) - -8192 >> -547796498;
                    var16_ref_int__[2] = var17 * var20 + 8192 >> -1328860466;
                    var16_ref_int__[4] = var17 * var21 + 8192 >> -884441074;
                    var16_ref_int__[0] = 8192 + (var21 * var19 - -(var20 * var24)) >> 1834076974;
                    var25_int = 8192 + (var16_ref_int__[2] * -uu.field_c + -ina.field_a * var16_ref_int__[0]) + var16_ref_int__[1] * -pb.field_k >> 770500014;
                    var26 = 8192 + (var16_ref_int__[3] * -ina.field_a - (-(var16_ref_int__[4] * -pb.field_k) - -uu.field_c * var16_ref_int__[5])) >> 729317710;
                    var27 = 8192 + var16_ref_int__[8] * -uu.field_c + (-pb.field_k * var16_ref_int__[7] + var16_ref_int__[6] * -ina.field_a) >> -943117138;
                    var28 = var25_int + ina.field_a;
                    var29_int = pb.field_k + var26;
                    var30 = var27 + uu.field_c;
                    var31_ref_int__ = new int[9];
                    var32 = 0;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    stackIn_146_0 = 3;
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    if (stackIn_146_0 <= var32) {
                        statePc = 160;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    stackIn_161_0 = 0;
                    stackIn_148_0 = stackIn_161_0;
                    if (var47 != 0) {
                        statePc = 161;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var33 = stackIn_148_0;
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    if (var33 >= 3) {
                        statePc = 159;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    var34 = 0;
                    stackIn_146_0 = 0;
                    stackIn_151_0 = stackIn_146_0;
                    if (var47 != 0) {
                        statePc = 146;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    var35_int = stackIn_151_0;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    if (var35_int >= 3) {
                        statePc = 157;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    var34 = var34 + var16_ref_int__[var32 * 3 + var35_int] * param7[var35_int + 3 * var33];
                    var35_int++;
                    if (var47 != 0) {
                        statePc = 158;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    if (var47 == 0) {
                        statePc = 152;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var31_ref_int__[3 * var32 + var33] = var34 + 8192 >> 31999310;
                    var33++;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    if (var47 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    var32++;
                    if (var47 == 0) {
                        statePc = 145;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    var32 = 8192 + var16_ref_int__[2] * var15 + (var13 * var16_ref_int__[0] + var14_int * var16_ref_int__[1]) >> 2142740174;
                    stackIn_161_0 = var15 * var16_ref_int__[5] + (var14_int * var16_ref_int__[4] + var16_ref_int__[3] * var13) + 8192 >> 866364718;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    var33 = stackIn_161_0;
                    var32 = var32 + var28;
                    var34 = var15 * var16_ref_int__[8] + var13 * var16_ref_int__[6] + var16_ref_int__[7] * var14_int + 8192 >> -115548786;
                    var33 = var33 + var29_int;
                    var34 = var34 + var30;
                    var35 = new int[9];
                    var36 = 0;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    stackIn_163_0 = 3;
                    statePc = 163;
                    continue stateLoop;
                }
                case 163: {
                    if (stackIn_163_0 <= var36) {
                        statePc = 177;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    stackIn_178_0 = 0;
                    stackIn_165_0 = stackIn_178_0;
                    if (var47 != 0) {
                        statePc = 178;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    var37 = stackIn_165_0;
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    if (-4 >= (var37 ^ -1)) {
                        statePc = 176;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    var38 = 0;
                    stackIn_163_0 = 0;
                    stackIn_168_0 = stackIn_163_0;
                    if (var47 != 0) {
                        statePc = 163;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    var39 = stackIn_168_0;
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    if (3 <= var39) {
                        statePc = 174;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    var38 = var38 + var31_ref_int__[3 * var39 + var37] * param7[3 * var36 - -var39];
                    var39++;
                    if (var47 != 0) {
                        statePc = 175;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    if (var47 == 0) {
                        statePc = 169;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var35[var36 * 3 - -var37] = var38 - -8192 >> 1776382734;
                    var37++;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    if (var47 == 0) {
                        statePc = 166;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    var36++;
                    if (var47 == 0) {
                        statePc = 162;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    var36 = 8192 + var34 * param7[2] + (param7[0] * var32 + var33 * param7[1]) >> 159692654;
                    stackIn_178_0 = var33 * param7[4] + var32 * param7[3] - (-(param7[5] * var34) - 8192) >> 1983123470;
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    var37 = stackIn_178_0;
                    var38 = param7[8] * var34 + (param7[6] * var32 + param7[7] * var33 - -8192) >> 719951630;
                    var36 = var36 + var10;
                    var37 = var37 + var11;
                    var38 = var38 + var12_int;
                    var39 = 0;
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    if ((var39 ^ -1) <= (var9_int ^ -1)) {
                        statePc = 194;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    var40 = param1[var39];
                    if ((var40 ^ -1) > (this.field_D.length ^ -1)) {
                        statePc = 183;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 183: {
                    stackIn_184_0 = this;
                    statePc = 184;
                    continue stateLoop;
                }
                case 184: {
                    var41 = ((gja) (this)).field_D[var40];
                    var42 = 0;
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    if (var42 >= var41.length) {
                        statePc = 193;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    var43 = var41[var42];
                    stackIn_184_0 = this;
                    stackIn_187_0 = stackIn_184_0;
                    if (var47 != 0) {
                        statePc = 184;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    if (((gja) (this)).field_hb == null) {
                        statePc = 191;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    if ((param6 & this.field_hb[var43] ^ -1) == -1) {
                        statePc = 192;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    var44 = this.field_Z[var43] * var35[0] - -(var35[1] * this.field_r[var43]) - (-(var35[2] * this.field_l[var43]) - 8192) >> 1694490414;
                    var45 = var35[3] * this.field_Z[var43] - -(this.field_r[var43] * var35[4]) - (-(this.field_l[var43] * var35[5]) - 8192) >> 1013706542;
                    var45 = var45 + var37;
                    var46 = 8192 + this.field_l[var43] * var35[8] + (var35[7] * this.field_r[var43] + var35[6] * this.field_Z[var43]) >> 1441623182;
                    var44 = var44 + var36;
                    this.field_Z[var43] = var44;
                    var46 = var46 + var38;
                    this.field_r[var43] = var45;
                    this.field_l[var43] = var46;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    var42++;
                    if (var47 == 0) {
                        statePc = 185;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    var39++;
                    if (var47 == 0) {
                        statePc = 179;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    return;
                }
                case 195: {
                    if (3 == param0) {
                        statePc = 198;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if (param7 != null) {
                        statePc = 220;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    var10 = 0;
                    statePc = 200;
                    continue stateLoop;
                }
                case 200: {
                    if ((var9_int ^ -1) >= (var10 ^ -1)) {
                        statePc = 219;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    var11 = param1[var10];
                    if (var47 != 0) {
                        statePc = 256;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    if ((var11 ^ -1) > (this.field_D.length ^ -1)) {
                        statePc = 207;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 207: {
                    stackIn_208_0 = this;
                    statePc = 208;
                    continue stateLoop;
                }
                case 208: {
                    var12 = ((gja) (this)).field_D[var11];
                    var13 = 0;
                    statePc = 209;
                    continue stateLoop;
                }
                case 209: {
                    if ((var13 ^ -1) <= (var12.length ^ -1)) {
                        statePc = 218;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    var14_int = var12[var13];
                    stackIn_208_0 = this;
                    stackIn_211_0 = stackIn_208_0;
                    if (var47 != 0) {
                        statePc = 208;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    if (((gja) (this)).field_hb == null) {
                        statePc = 215;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    if ((param6 & this.field_hb[var14_int]) == 0) {
                        statePc = 217;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    this.field_Z[var14_int] = this.field_Z[var14_int] - ina.field_a;
                    this.field_r[var14_int] = this.field_r[var14_int] - pb.field_k;
                    this.field_l[var14_int] = this.field_l[var14_int] - uu.field_c;
                    this.field_Z[var14_int] = param2 * this.field_Z[var14_int] >> -751015033;
                    this.field_r[var14_int] = this.field_r[var14_int] * param3 >> 597001735;
                    this.field_l[var14_int] = this.field_l[var14_int] * param4 >> -914476025;
                    this.field_Z[var14_int] = this.field_Z[var14_int] + ina.field_a;
                    this.field_r[var14_int] = this.field_r[var14_int] + pb.field_k;
                    this.field_l[var14_int] = this.field_l[var14_int] + uu.field_c;
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    var13++;
                    if (var47 == 0) {
                        statePc = 209;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    var10++;
                    if (var47 == 0) {
                        statePc = 200;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    if (var47 == 0) {
                        statePc = 256;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    var10 = param7[9] << -1338175228;
                    var11 = param7[10] << -1270325660;
                    var12_int = param7[11] << -2076591452;
                    var13 = param7[12] << -1371611740;
                    var14_int = param7[13] << -1120837244;
                    var15 = param7[14] << -1655869212;
                    if (vr.field_o) {
                        statePc = 223;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 223: {
                    var16 = 8192 + ina.field_a * param7[0] + (pb.field_k * param7[3] + param7[6] * uu.field_c) >> -2143031634;
                    var17 = 8192 + (param7[1] * ina.field_a - (-(pb.field_k * param7[4]) - uu.field_c * param7[7])) >> 602886446;
                    var18 = uu.field_c * param7[8] + (param7[2] * ina.field_a + param7[5] * pb.field_k - -8192) >> 732607534;
                    var16 = var16 + var13;
                    var17 = var17 + var14_int;
                    var18 = var18 + var15;
                    ina.field_a = var16;
                    pb.field_k = var17;
                    vr.field_o = false;
                    uu.field_c = var18;
                    statePc = 224;
                    continue stateLoop;
                }
                case 224: {
                    var16 = param2 << -530543793 >> -957034329;
                    var17 = param3 << 1075409551 >> 1174744423;
                    var18 = param4 << -81791217 >> -574684249;
                    var19 = 8192 + var16 * -ina.field_a >> -630444562;
                    var20 = 8192 + -pb.field_k * var17 >> 660881390;
                    var21 = 8192 + var18 * -uu.field_c >> -301892690;
                    var22 = ina.field_a + var19;
                    var23 = pb.field_k + var20;
                    var24 = uu.field_c + var21;
                    var25 = new int[9];
                    var25[2] = var16 * param7[6] - -8192 >> 1157800974;
                    var25[0] = var16 * param7[0] + 8192 >> -2126321522;
                    var25[1] = 8192 + param7[3] * var16 >> -706774290;
                    var25[6] = param7[2] * var18 - -8192 >> 1679584078;
                    var25[4] = 8192 + var17 * param7[4] >> 993766478;
                    var25[5] = 8192 + param7[7] * var17 >> 1579122862;
                    var25[3] = 8192 + param7[1] * var17 >> 8317134;
                    var25[7] = param7[5] * var18 + 8192 >> -510753906;
                    var25[8] = var18 * param7[8] + 8192 >> -37034962;
                    var26 = 8192 + var13 * var16 >> -1097205138;
                    var27 = var14_int * var17 + 8192 >> 314942350;
                    var26 = var26 + var22;
                    var28 = var18 * var15 + 8192 >> -927559538;
                    var27 = var27 + var23;
                    var28 = var28 + var24;
                    var29 = new int[9];
                    var30 = 0;
                    statePc = 225;
                    continue stateLoop;
                }
                case 225: {
                    stackIn_226_0 = -4;
                    statePc = 226;
                    continue stateLoop;
                }
                case 226: {
                    if (stackIn_226_0 >= (var30 ^ -1)) {
                        statePc = 240;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    stackIn_241_0 = 0;
                    stackIn_228_0 = stackIn_241_0;
                    if (var47 != 0) {
                        statePc = 241;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    var31 = stackIn_228_0;
                    statePc = 229;
                    continue stateLoop;
                }
                case 229: {
                    if (-4 >= (var31 ^ -1)) {
                        statePc = 239;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    var32 = 0;
                    stackIn_226_0 = 0;
                    stackIn_231_0 = stackIn_226_0;
                    if (var47 != 0) {
                        statePc = 226;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    var33 = stackIn_231_0;
                    statePc = 232;
                    continue stateLoop;
                }
                case 232: {
                    if ((var33 ^ -1) <= -4) {
                        statePc = 237;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    var32 = var32 + param7[var33 + var30 * 3] * var25[var33 * 3 + var31];
                    var33++;
                    if (var47 != 0) {
                        statePc = 238;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (var47 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    var29[3 * var30 - -var31] = 8192 + var32 >> 639691822;
                    var31++;
                    statePc = 238;
                    continue stateLoop;
                }
                case 238: {
                    if (var47 == 0) {
                        statePc = 229;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    var30++;
                    if (var47 == 0) {
                        statePc = 225;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    var30 = 8192 + (var27 * param7[1] + param7[0] * var26) + param7[2] * var28 >> -1640362770;
                    stackIn_241_0 = 8192 + var28 * param7[5] + (var26 * param7[3] - -(param7[4] * var27)) >> 2010050926;
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    var31 = stackIn_241_0;
                    var30 = var30 + var10;
                    var32 = param7[7] * var27 + (param7[6] * var26 - (-(param7[8] * var28) + -8192)) >> -1270572146;
                    var31 = var31 + var11;
                    var32 = var32 + var12_int;
                    var33 = 0;
                    statePc = 242;
                    continue stateLoop;
                }
                case 242: {
                    if (var33 >= var9_int) {
                        statePc = 256;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    var34 = param1[var33];
                    if ((var34 ^ -1) <= (this.field_D.length ^ -1)) {
                        statePc = 255;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    stackIn_246_0 = this;
                    statePc = 246;
                    continue stateLoop;
                }
                case 246: {
                    var35 = ((gja) (this)).field_D[var34];
                    var36 = 0;
                    statePc = 247;
                    continue stateLoop;
                }
                case 247: {
                    if ((var36 ^ -1) <= (var35.length ^ -1)) {
                        statePc = 255;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    var37 = var35[var36];
                    stackIn_246_0 = this;
                    stackIn_249_0 = stackIn_246_0;
                    if (var47 != 0) {
                        statePc = 246;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    if (((gja) (this)).field_hb == null) {
                        statePc = 253;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    if ((this.field_hb[var37] & param6 ^ -1) == -1) {
                        statePc = 254;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    var38 = this.field_r[var37] * var29[1] + var29[0] * this.field_Z[var37] + var29[2] * this.field_l[var37] - -8192 >> -951958898;
                    var39 = this.field_r[var37] * var29[4] + var29[3] * this.field_Z[var37] + (var29[5] * this.field_l[var37] + 8192) >> 1616958414;
                    var39 = var39 + var31;
                    var38 = var38 + var30;
                    var40 = 8192 + var29[8] * this.field_l[var37] + this.field_Z[var37] * var29[6] + var29[7] * this.field_r[var37] >> -1467132178;
                    var40 = var40 + var32;
                    this.field_Z[var37] = var38;
                    this.field_r[var37] = var39;
                    this.field_l[var37] = var40;
                    statePc = 254;
                    continue stateLoop;
                }
                case 254: {
                    var36++;
                    if (var47 == 0) {
                        statePc = 247;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    var33++;
                    if (var47 == 0) {
                        statePc = 242;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    return;
                }
                case 257: {
                    if (-6 != (param0 ^ -1)) {
                        statePc = 308;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    if (this.field_q == null) {
                        statePc = 307;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    var10 = 0;
                    var11 = 0;
                    statePc = 262;
                    continue stateLoop;
                }
                case 262: {
                    if (var11 >= var9_int) {
                        statePc = 295;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    var12_int = param1[var11];
                    stackIn_301_0 = var12_int ^ -1;
                    stackIn_264_0 = stackIn_301_0;
                    stackIn_301_1 = this.field_q.length ^ -1;
                    stackIn_264_1 = stackIn_301_1;
                    if (var47 != 0) {
                        statePc = 301;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    if (stackIn_264_0 <= stackIn_264_1) {
                        statePc = 294;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    var13_ref_int__ = this.field_q[var12_int];
                    var14_int = 0;
                    statePc = 268;
                    continue stateLoop;
                }
                case 268: {
                    if ((var13_ref_int__.length ^ -1) >= (var14_int ^ -1)) {
                        statePc = 289;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    var15 = var13_ref_int__[var14_int];
                    stackIn_298_0 = null;
                    stackIn_270_0 = stackIn_298_0;
                    stackIn_298_1 = this;
                    stackIn_270_1 = stackIn_298_1;
                    if (var47 != 0) {
                        statePc = 298;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 270: {
                    if (stackIn_270_0 == ((gja) (this)).field_jb) {
                        statePc = 279;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    if (0 != (param6 & this.field_jb[var15])) {
                        statePc = 279;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    if (var47 == 0) {
                        statePc = 288;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    var16 = 8 * param2 + (255 & this.field_C[var15]);
                    if (0 <= var16) {
                        statePc = 281;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    var16 = 0;
                    if (var47 == 0) {
                        statePc = 287;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    if (255 < var16) {
                        statePc = 286;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 286: {
                    var16 = 255;
                    statePc = 287;
                    continue stateLoop;
                }
                case 287: {
                    this.field_C[var15] = (byte)var16;
                    statePc = 288;
                    continue stateLoop;
                }
                case 288: {
                    var14_int++;
                    if (var47 == 0) {
                        statePc = 268;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    stackIn_292_0 = var10;
                    stackIn_290_0 = stackIn_292_0;
                    if ((var13_ref_int__.length ^ -1) >= -1) {
                        statePc = 292;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 290: {
                    stackIn_293_0 = stackIn_290_0;
                    stackIn_293_1 = 1;
                    statePc = 293;
                    continue stateLoop;
                }
                case 292: {
                    stackIn_293_0 = stackIn_292_0;
                    stackIn_293_1 = 0;
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    var10 = stackIn_293_0 | stackIn_293_1;
                    statePc = 294;
                    continue stateLoop;
                }
                case 294: {
                    var11++;
                    if (var47 == 0) {
                        statePc = 262;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    if (var10 == 0) {
                        statePc = 307;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    stackIn_298_0 = null;
                    stackIn_298_1 = this;
                    statePc = 298;
                    continue stateLoop;
                }
                case 298: {
                    if (stackIn_298_0 == ((gja) (this)).field_u) {
                        statePc = 306;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 299: {
                    var11 = 0;
                    statePc = 300;
                    continue stateLoop;
                }
                case 300: {
                    stackIn_301_0 = this.field_L ^ -1;
                    stackIn_301_1 = var11 ^ -1;
                    statePc = 301;
                    continue stateLoop;
                }
                case 301: {
                    if (stackIn_301_0 >= stackIn_301_1) {
                        statePc = 306;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 302: {
                    var12_ref = this.field_u[var11];
                    var13_ref_gca = this.field_nb[var11];
                    var13_ref_gca.field_h = var13_ref_gca.field_h & 16777215 | 255 + -(this.field_C[var12_ref.field_m] & 255) << 1001884504;
                    var11++;
                    if (var47 != 0) {
                        statePc = 307;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 303: {
                    if (var47 == 0) {
                        statePc = 300;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 306: {
                    this.e(0);
                    statePc = 307;
                    continue stateLoop;
                }
                case 307: {
                    return;
                }
                case 308: {
                    if (param0 != 7) {
                        statePc = 365;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    if (null == this.field_q) {
                        statePc = 364;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 312: {
                    var10 = 0;
                    var11 = 0;
                    statePc = 313;
                    continue stateLoop;
                }
                case 313: {
                    if (var9_int <= var11) {
                        statePc = 350;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 314: {
                    var12_int = param1[var11];
                    stackIn_358_0 = this.field_q.length ^ -1;
                    stackIn_315_0 = stackIn_358_0;
                    stackIn_358_1 = var12_int ^ -1;
                    stackIn_315_1 = stackIn_358_1;
                    if (var47 != 0) {
                        statePc = 358;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 315: {
                    if (stackIn_315_0 < stackIn_315_1) {
                        statePc = 319;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 319: {
                    var13_ref_int__ = this.field_q[var12_int];
                    var14_int = 0;
                    statePc = 320;
                    continue stateLoop;
                }
                case 320: {
                    if ((var14_int ^ -1) <= (var13_ref_int__.length ^ -1)) {
                        statePc = 344;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 321: {
                    var15 = var13_ref_int__[var14_int];
                    stackIn_353_0 = null;
                    stackIn_322_0 = stackIn_353_0;
                    stackIn_353_1 = this;
                    stackIn_322_1 = stackIn_353_1;
                    if (var47 != 0) {
                        statePc = 353;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 322: {
                    if (stackIn_322_0 == ((gja) (this)).field_jb) {
                        statePc = 328;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    if ((this.field_jb[var15] & param6 ^ -1) == -1) {
                        statePc = 343;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    var16 = this.field_P[var15] & 65535;
                    var17 = var16 >> -867095574 & 63;
                    var18 = 7 & var16 >> -12622009;
                    var18 = var18 + param3 / 4;
                    var19 = var16 & 127;
                    var17 = param2 + var17 & 63;
                    if ((var18 ^ -1) <= -1) {
                        statePc = 330;
                    } else {
                        statePc = 329;
                    }
                    continue stateLoop;
                }
                case 329: {
                    var18 = 0;
                    if (var47 == 0) {
                        statePc = 334;
                    } else {
                        statePc = 330;
                    }
                    continue stateLoop;
                }
                case 330: {
                    if (var18 <= 7) {
                        statePc = 334;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    var18 = 7;
                    statePc = 334;
                    continue stateLoop;
                }
                case 334: {
                    var19 = var19 + param4;
                    if ((var19 ^ -1) <= -1) {
                        statePc = 336;
                    } else {
                        statePc = 335;
                    }
                    continue stateLoop;
                }
                case 335: {
                    var19 = 0;
                    if (var47 == 0) {
                        statePc = 342;
                    } else {
                        statePc = 336;
                    }
                    continue stateLoop;
                }
                case 336: {
                    if ((var19 ^ -1) < -128) {
                        statePc = 341;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 341: {
                    var19 = 127;
                    statePc = 342;
                    continue stateLoop;
                }
                case 342: {
                    this.field_P[var15] = (short)fh.a(var19, fh.a(var18 << -539796377, var17 << 1237115018));
                    statePc = 343;
                    continue stateLoop;
                }
                case 343: {
                    var14_int++;
                    if (var47 == 0) {
                        statePc = 320;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 344: {
                    stackIn_347_0 = var10;
                    stackIn_345_0 = stackIn_347_0;
                    if ((var13_ref_int__.length ^ -1) >= -1) {
                        statePc = 347;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    stackIn_348_0 = stackIn_345_0;
                    stackIn_348_1 = 1;
                    statePc = 348;
                    continue stateLoop;
                }
                case 347: {
                    stackIn_348_0 = stackIn_347_0;
                    stackIn_348_1 = 0;
                    statePc = 348;
                    continue stateLoop;
                }
                case 348: {
                    var10 = stackIn_348_0 | stackIn_348_1;
                    statePc = 349;
                    continue stateLoop;
                }
                case 349: {
                    var11++;
                    if (var47 == 0) {
                        statePc = 313;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 350: {
                    if (var10 == 0) {
                        statePc = 364;
                    } else {
                        statePc = 351;
                    }
                    continue stateLoop;
                }
                case 351: {
                    stackIn_353_0 = null;
                    stackIn_353_1 = this;
                    statePc = 353;
                    continue stateLoop;
                }
                case 353: {
                    if (stackIn_353_0 != ((gja) (this)).field_u) {
                        statePc = 356;
                    } else {
                        statePc = 363;
                    }
                    continue stateLoop;
                }
                case 356: {
                    var11 = 0;
                    statePc = 357;
                    continue stateLoop;
                }
                case 357: {
                    stackIn_358_0 = this.field_L;
                    stackIn_358_1 = var11;
                    statePc = 358;
                    continue stateLoop;
                }
                case 358: {
                    if (stackIn_358_0 <= stackIn_358_1) {
                        statePc = 363;
                    } else {
                        statePc = 359;
                    }
                    continue stateLoop;
                }
                case 359: {
                    var12_ref = this.field_u[var11];
                    var13_ref_gca = this.field_nb[var11];
                    var13_ref_gca.field_h = cla.field_m[65535 & this.field_P[var12_ref.field_m]] & 16777215 | var13_ref_gca.field_h & -16777216;
                    var11++;
                    if (var47 != 0) {
                        statePc = 364;
                    } else {
                        statePc = 360;
                    }
                    continue stateLoop;
                }
                case 360: {
                    if (var47 == 0) {
                        statePc = 357;
                    } else {
                        statePc = 363;
                    }
                    continue stateLoop;
                }
                case 363: {
                    this.e(0);
                    statePc = 364;
                    continue stateLoop;
                }
                case 364: {
                    return;
                }
                case 365: {
                    if (param0 == 8) {
                        statePc = 368;
                    } else {
                        statePc = 383;
                    }
                    continue stateLoop;
                }
                case 368: {
                    if (null == this.field_mb) {
                        statePc = 382;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 369: {
                    var10 = 0;
                    statePc = 370;
                    continue stateLoop;
                }
                case 370: {
                    if (var10 >= var9_int) {
                        statePc = 382;
                    } else {
                        statePc = 371;
                    }
                    continue stateLoop;
                }
                case 371: {
                    var11 = param1[var10];
                    if (this.field_mb.length > var11) {
                        statePc = 374;
                    } else {
                        statePc = 380;
                    }
                    continue stateLoop;
                }
                case 374: {
                    var12 = this.field_mb[var11];
                    var13 = 0;
                    statePc = 375;
                    continue stateLoop;
                }
                case 375: {
                    if (var13 >= var12.length) {
                        statePc = 380;
                    } else {
                        statePc = 376;
                    }
                    continue stateLoop;
                }
                case 376: {
                    var14 = this.field_nb[var12[var13]];
                    var14.field_b = var14.field_b + param3;
                    var14.field_e = var14.field_e + param2;
                    var13++;
                    if (var47 != 0) {
                        statePc = 381;
                    } else {
                        statePc = 377;
                    }
                    continue stateLoop;
                }
                case 377: {
                    if (var47 == 0) {
                        statePc = 375;
                    } else {
                        statePc = 380;
                    }
                    continue stateLoop;
                }
                case 380: {
                    var10++;
                    statePc = 381;
                    continue stateLoop;
                }
                case 381: {
                    if (var47 == 0) {
                        statePc = 370;
                    } else {
                        statePc = 382;
                    }
                    continue stateLoop;
                }
                case 382: {
                    return;
                }
                case 383: {
                    if (param0 == 10) {
                        statePc = 386;
                    } else {
                        statePc = 401;
                    }
                    continue stateLoop;
                }
                case 386: {
                    if (null != this.field_mb) {
                        statePc = 389;
                    } else {
                        statePc = 400;
                    }
                    continue stateLoop;
                }
                case 389: {
                    var10 = 0;
                    statePc = 390;
                    continue stateLoop;
                }
                case 390: {
                    if ((var10 ^ -1) <= (var9_int ^ -1)) {
                        statePc = 400;
                    } else {
                        statePc = 391;
                    }
                    continue stateLoop;
                }
                case 391: {
                    var11 = param1[var10];
                    if ((this.field_mb.length ^ -1) >= (var11 ^ -1)) {
                        statePc = 398;
                    } else {
                        statePc = 392;
                    }
                    continue stateLoop;
                }
                case 392: {
                    var12 = this.field_mb[var11];
                    var13 = 0;
                    statePc = 393;
                    continue stateLoop;
                }
                case 393: {
                    if ((var12.length ^ -1) >= (var13 ^ -1)) {
                        statePc = 398;
                    } else {
                        statePc = 394;
                    }
                    continue stateLoop;
                }
                case 394: {
                    var14 = this.field_nb[var12[var13]];
                    var14.field_m = var14.field_m * param2 >> 1068050695;
                    var14.field_k = var14.field_k * param3 >> -1502683481;
                    var13++;
                    if (var47 != 0) {
                        statePc = 399;
                    } else {
                        statePc = 395;
                    }
                    continue stateLoop;
                }
                case 395: {
                    if (var47 == 0) {
                        statePc = 393;
                    } else {
                        statePc = 398;
                    }
                    continue stateLoop;
                }
                case 398: {
                    var10++;
                    statePc = 399;
                    continue stateLoop;
                }
                case 399: {
                    if (var47 == 0) {
                        statePc = 390;
                    } else {
                        statePc = 400;
                    }
                    continue stateLoop;
                }
                case 400: {
                    return;
                }
                case 401: {
                    if (param0 == 9) {
                        statePc = 404;
                    } else {
                        statePc = 427;
                    }
                    continue stateLoop;
                }
                case 404: {
                    if (null == this.field_mb) {
                        statePc = 416;
                    } else {
                        statePc = 405;
                    }
                    continue stateLoop;
                }
                case 405: {
                    var10 = 0;
                    statePc = 406;
                    continue stateLoop;
                }
                case 406: {
                    if (var10 >= var9_int) {
                        statePc = 416;
                    } else {
                        statePc = 407;
                    }
                    continue stateLoop;
                }
                case 407: {
                    var11 = param1[var10];
                    if (this.field_mb.length <= var11) {
                        statePc = 414;
                    } else {
                        statePc = 408;
                    }
                    continue stateLoop;
                }
                case 408: {
                    var12 = this.field_mb[var11];
                    var13 = 0;
                    statePc = 409;
                    continue stateLoop;
                }
                case 409: {
                    if (var12.length <= var13) {
                        statePc = 414;
                    } else {
                        statePc = 410;
                    }
                    continue stateLoop;
                }
                case 410: {
                    var14 = this.field_nb[var12[var13]];
                    var14.field_c = 16383 & param2 + var14.field_c;
                    var13++;
                    if (var47 != 0) {
                        statePc = 415;
                    } else {
                        statePc = 411;
                    }
                    continue stateLoop;
                }
                case 411: {
                    if (var47 == 0) {
                        statePc = 409;
                    } else {
                        statePc = 414;
                    }
                    continue stateLoop;
                }
                case 414: {
                    var10++;
                    statePc = 415;
                    continue stateLoop;
                }
                case 415: {
                    if (var47 == 0) {
                        statePc = 406;
                    } else {
                        statePc = 416;
                    }
                    continue stateLoop;
                }
                case 416: {
                    return;
                }
                case 427: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final short a(int param0, int param1, float param2, int param3, int param4, int param5, long param6, int param7, float param8, boolean param9, oc param10) {
        int fieldTemp$0 = 0;
        short stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var13_int = 0;
        RuntimeException var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var18 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param9) {
                break L1;
              } else {
                this.field_W = -119;
                break L1;
              }
            }
            var13_int = this.field_J[param3];
            var14 = this.field_J[1 + param3];
            var15 = 0;
            var16 = var13_int;
            L2: while (true) {
              L3: {
                L4: {
                  if ((var14 ^ -1) >= (var16 ^ -1)) {
                    break L4;
                  } else {
                    var17 = this.field_db[var16];
                    stackIn_22_0 = 0;

                    if (var18 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_22_0 == var17) {
                          var15 = var16;
                          if (var18 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      }
                      if ((param6 ^ -1L) == (tl.field_q[var16] ^ -1L)) {
                        stackIn_19_0 = (short)(var17 - 1);
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var16++;
                        if (var18 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                this.field_db[var15] = (short)(this.field_fb + 1);
                tl.field_q[var15] = param6;
                this.field_G[this.field_fb] = (short)param1;
                this.field_kb[this.field_fb] = (short)param3;
                this.field_lb[this.field_fb] = (short)param7;
                this.field_m[this.field_fb] = (short)param0;
                this.field_p[this.field_fb] = (short)param4;
                this.field_w[this.field_fb] = (byte)param5;
                this.field_eb[this.field_fb] = param2;
                this.field_t[this.field_fb] = param8;
                fieldTemp$0 = this.field_fb;
                this.field_fb = this.field_fb + 1;
                stackIn_22_0 = (short)fieldTemp$0;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var13 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var13);

            stackIn_26_1 = new StringBuilder().append("gja.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L6;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (short) stackIn_22_0;
        } else {
          return stackIn_19_0;
        }
    }

    final ka a(byte param0, int param1, boolean param2) {
        gja dupTemp$0 = null;
        Object stackIn_23_0;
        gja stackIn_23_1;
        int stackIn_23_2;
        gja stackIn_23_3;
        Object stackIn_24_0;
        gja stackIn_24_1;
        int stackIn_24_2;
        gja stackIn_24_3;
        int stackIn_24_4;
        ka stackIn_25_0 = null;
        RuntimeException decompiledCaughtException = null;
        gja var4 = null;
        RuntimeException var4_ref = null;
        gja var5 = null;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 != 1) {
                  break L2;
                } else {
                  var5 = this.field_S.field_tb;
                  var4 = this.field_S.field_cc;
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param0 == 2) {
                  break L3;
                } else {
                  L4: {
                    if (param0 == 3) {
                      break L4;
                    } else {
                      L5: {
                        if ((param0 ^ -1) != -5) {
                          break L5;
                        } else {
                          var5 = this.field_S.field_n;
                          var4 = this.field_S.field_O;
                          if (var6 == 0) {
                            break L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (5 == param0) {
                          break L6;
                        } else {
                          dupTemp$0 = new gja(this.field_S, 0, 0, true, false);
                          var5 = dupTemp$0;
                          var4 = dupTemp$0;
                          if (var6 == 0) {
                            break L1;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var5 = this.field_S.field_tc;
                      var4 = this.field_S.field_ec;
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var4 = this.field_S.field_fb;
                  var5 = this.field_S.field_E;
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              var5 = this.field_S.field_W;
              var4 = this.field_S.field_gc;
              break L1;
            }
            L7: {
              stackIn_23_0 = this;

              stackIn_23_1 = (gja) (var4);

              stackIn_23_2 = 0;

              stackIn_23_3 = (gja) (var5);

              if (-1 == (param0 ^ -1)) {
                stackIn_24_0 = this;
                stackIn_24_1 = (gja) ((Object) stackIn_23_1);
                stackIn_24_2 = stackIn_23_2;
                stackIn_24_3 = (gja) ((Object) stackIn_23_3);
                stackIn_24_4 = 0;
                break L7;
              } else {
                stackIn_24_0 = this;
                stackIn_24_1 = (gja) ((Object) stackIn_23_1);
                stackIn_24_2 = stackIn_23_2;
                stackIn_24_3 = (gja) ((Object) stackIn_23_3);
                stackIn_24_4 = 1;
                break L7;
              }
            }
            stackIn_25_0 = this.a(stackIn_24_1, stackIn_24_2 != 0, stackIn_24_3, stackIn_24_4 != 0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4_ref), "gja.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_25_0;
    }

    final void a(gda param0, el param1, int param2) {
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_74_1 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        asa var4 = null;
        RuntimeException var4_ref = null;
        asa var5 = null;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        var24 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_fb != 0) {
              L1: {
                var4 = this.field_S.field_bb;
                var5 = (asa) ((Object) param0);
                if (this.field_A) {
                  break L1;
                } else {
                  this.f(-913);
                  break L1;
                }
              }
              L2: {
                L3: {
                  qra.field_d = var5.field_o * var4.field_h + (var4.field_o * var5.field_q + var4.field_p * var5.field_l);
                  gj.field_h = var5.field_n * var4.field_o + var5.field_e * var4.field_p + var4.field_h * var5.field_i + var4.field_i;
                  var6 = gj.field_h + qra.field_d * (float)this.field_o;
                  var7 = gj.field_h + (float)this.field_n * qra.field_d;
                  if (var7 < var6) {
                    break L3;
                  } else {
                    var8 = var6 - (float)this.field_H;
                    var9 = (float)this.field_H + var7;
                    if (var24 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var8 = (float)(-this.field_H) + var7;
                var9 = (float)this.field_H + var6;
                break L2;
              }
              if (var8 < this.field_S.field_d) {
                if (var9 > (float)this.field_S.field_D) {
                  L4: {
                    L5: {
                      fba.field_a = var5.field_n * var4.field_l + var4.field_g * var5.field_e + var5.field_i * var4.field_f + var4.field_e;
                      vta.field_e = var4.field_f * var5.field_o + (var5.field_l * var4.field_g + var4.field_l * var5.field_q);
                      var10 = (float)this.field_o * vta.field_e + fba.field_a;
                      var11 = (float)this.field_n * vta.field_e + fba.field_a;
                      if (var11 >= var10) {
                        break L5;
                      } else {
                        var13 = (var10 + (float)this.field_H) * (float)this.field_S.field_Ic;
                        var12 = (float)this.field_S.field_Ic * ((float)(-this.field_H) + var11);
                        if (var24 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var12 = (var10 - (float)this.field_H) * (float)this.field_S.field_Ic;
                    var13 = (float)this.field_S.field_Ic * (var11 + (float)this.field_H);
                    break L4;
                  }
                  if (this.field_S.field_uc > var12 / var9) {
                    if (this.field_S.field_f < var13 / var9) {
                      L6: {
                        L7: {
                          tu.field_g = var5.field_i * var4.field_m + (var5.field_e * var4.field_k + var4.field_q * var5.field_n) + var4.field_n;
                          kb.field_p = var4.field_m * var5.field_o + (var4.field_q * var5.field_q + var4.field_k * var5.field_l);
                          var14 = tu.field_g + (float)this.field_o * kb.field_p;
                          var15 = tu.field_g + kb.field_p * (float)this.field_n;
                          if (var15 >= var14) {
                            break L7;
                          } else {
                            var17 = ((float)this.field_H + var14) * (float)this.field_S.field_h;
                            var16 = ((float)(-this.field_H) + var15) * (float)this.field_S.field_h;
                            if (var24 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var16 = ((float)(-this.field_H) + var14) * (float)this.field_S.field_h;
                        var17 = (float)this.field_S.field_h * ((float)this.field_H + var15);
                        break L6;
                      }
                      if (var16 / var9 < this.field_S.field_H) {
                        if (var17 / var9 > this.field_S.field_zc) {
                          L8: {
                            L9: {
                              if (null != param1) {
                                break L9;
                              } else {
                                if (this.field_u != null) {
                                  break L9;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            vs.field_O = var4.field_m * var5.field_p + (var5.field_k * var4.field_q + var5.field_g * var4.field_k);
                            wka.field_b = var4.field_f * var5.field_h + (var5.field_f * var4.field_g + var5.field_m * var4.field_l);
                            ct.field_b = var5.field_m * var4.field_q + var5.field_f * var4.field_k + var5.field_h * var4.field_m;
                            hs.field_c = var4.field_o * var5.field_m + var4.field_p * var5.field_f + var4.field_h * var5.field_h;
                            pl.field_a = var4.field_o * var5.field_k + var5.field_g * var4.field_p + var4.field_h * var5.field_p;
                            baa.field_c = var4.field_g * var5.field_g + var4.field_l * var5.field_k + var5.field_p * var4.field_f;
                            break L8;
                          }
                          L10: {
                            if (null != param1) {
                              L11: {
                                var18 = 0;
                                var19 = 1;
                                var20 = this.field_K + this.field_i >> -759126463;
                                var21 = this.field_cb - -this.field_Q >> -1468036991;
                                var22 = (int)(hs.field_c * (float)var21 + ((float)this.field_o * qra.field_d + (gj.field_h + (float)var20 * pl.field_a)));
                                if (var22 < this.field_S.field_D) {
                                  var18 = 1;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              L12: {
                                var23 = (int)(gj.field_h + pl.field_a * (float)var20 + qra.field_d * (float)this.field_n + hs.field_c * (float)var21);
                                if (this.field_S.field_D > var23) {
                                  var18 = 1;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              L13: {
                                if (var18 == 0) {
                                  break L13;
                                } else {
                                  L14: {
                                    if (this.field_S.field_D <= var22) {
                                      break L14;
                                    } else {
                                      if (var23 < this.field_S.field_D) {
                                        var19 = 0;
                                        break L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  if ((var22 ^ -1) <= (this.field_S.field_D ^ -1)) {
                                    if (this.field_S.field_D <= var23) {
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              if (var19 == 0) {
                                break L10;
                              } else {
                                if (var23 >= var22) {
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                            } else {
                              break L10;
                            }
                          }
                          this.field_S.s(11);
                          this.field_S.a(var5, (byte) 93);
                          this.b((byte) -51);
                          this.c(-119);
                          decompiledRegionSelector0 = 7;
                          break L0;
                        } else {
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var4_ref = decompiledCaughtException;
            stackIn_70_0 = (RuntimeException) (var4_ref);

            stackIn_70_1 = new StringBuilder().append("gja.N(");

            if (param0 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L15;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L15;
            }
          }
          L16: {


            stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');

            if (param1 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L16;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L16;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_71_0), stackIn_75_2 + ',' + param2 + ')');
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

    gja(eo param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        this.field_I = 0;
        this.field_F = false;
        this.field_v = 0;
        this.field_f = false;
        this.field_A = false;
        this.field_fb = 0;
        this.field_y = 0;
        this.field_N = true;
        this.field_W = 0;
        try {
          L0: {
            L1: {
              L2: {
                this.field_F = param4;
                this.field_S = param0;
                this.field_h = param2;
                this.field_Y = param1;
                if (param3) {
                  break L2;
                } else {
                  if (ss.a((byte) 112, this.field_h, this.field_Y)) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              this.field_ib = new hg(uu.a(true, this.field_Y, this.field_h));
              break L1;
            }
            L3: {
              L4: {
                if (param3) {
                  break L4;
                } else {
                  if (foa.a(this.field_Y, this.field_h, 0)) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_d = new hg(pr.a(this.field_Y, -23611, this.field_h));
              break L3;
            }
            L5: {
              L6: {
                if (param3) {
                  break L6;
                } else {
                  if (lf.a(this.field_h, this.field_Y, 128)) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
              this.field_E = new hg(no.a(this.field_h, this.field_Y, 36864));
              break L5;
            }
            L7: {
              L8: {
                if (param3) {
                  break L8;
                } else {
                  if (!vta.a(this.field_h, this.field_Y, 2048)) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              this.field_O = new hg(oba.c(this.field_Y, this.field_h, -19531));
              break L7;
            }
            L9: {
              L10: {
                if (param3) {
                  break L10;
                } else {
                  if (!ag.b(-1, this.field_Y, this.field_h)) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              this.field_g = new gg(uu.a(this.field_Y, this.field_h, (byte) -111));
              break L9;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var6);

            stackIn_36_1 = new StringBuilder().append("gja.<init>(");

            if (param0 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L11;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_bb = "Logging in...";
        field_k = "Auto-respond to <%0>";
    }
}
