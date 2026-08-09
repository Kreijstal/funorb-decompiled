/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class re {
    private int field_m;
    private int field_t;
    private int field_J;
    private boolean field_u;
    private be field_C;
    static ub field_r;
    private bd field_H;
    private le[] field_b;
    private int field_s;
    private int field_e;
    private pb field_z;
    private le[][] field_w;
    private int field_j;
    static bd[][] field_D;
    private boolean field_c;
    private int field_x;
    private th field_F;
    static boolean field_k;
    int field_p;
    private fj field_h;
    th field_E;
    private int field_y;
    private int field_v;
    static String field_B;
    int field_d;
    int field_f;
    private int field_o;
    private int field_a;
    static oj[] field_n;
    boolean field_K;
    private th field_G;
    private int field_g;
    static java.awt.Color field_A;
    static bl field_i;
    static boolean field_l;
    static String field_I;
    static bd field_q;

    private final void b(int param0, int param1, int param2) {
        int statePc = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = HostileSpawn.field_I ? 1 : 0;
                    var5 = 35 / ((param1 - -16) / 62);
                    var4 = 54;
                    if (18 != param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var4 = -11 + -var4 + 640;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var5 = 325;
                    var6 = 8421376;
                    if (this.field_K) {
                        statePc = 10;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (!ka.a(var5, 0, 21, 11, var4)) {
                        statePc = 10;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (-19 != (param0 ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (!this.g((byte) 30)) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (this.c(24834)) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.field_t = param2;
                    this.field_u = true;
                    var6 = 16776960;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (this.field_t != param2) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (0 == this.field_j) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var6 = 16776960;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    si.b(var4, var5, 11, 21, 2, var6);
                    if (param0 != 18) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (!this.g((byte) 30)) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if ((param0 ^ -1) != -18) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (this.c(24834)) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    si.a(var4, var5, 11, 21, 0, 192);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    var5 += 5;
                    if (param0 == 18) {
                        statePc = 34;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var4 += 9;
                    var7 = 1;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (var7 > 6) {
                        statePc = 27;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    si.a(-var7 + var4, var5, var7, 0);
                    si.e(-var7 + (var4 + -1), var5, 1, 0, 128);
                    var5++;
                    var7++;
                    if (var8 != 0) {
                        statePc = 29;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var8 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var7 = 5;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if ((var7 ^ -1) > -2) {
                        statePc = 33;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    si.a(var4 - var7, var5, var7, 0);
                    si.e(-var7 + var4 + -1, var5, 1, 0, 128);
                    var5++;
                    var7--;
                    if (var8 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (var8 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (var8 == 0) {
                        statePc = 46;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var4 += 2;
                    var7 = 1;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var7 > 6) {
                        statePc = 39;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    si.a(var4, var5, var7, 0);
                    si.e(var7 + var4, var5, 1, 0, 128);
                    var5++;
                    var7++;
                    if (var8 != 0) {
                        statePc = 41;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (var8 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var7 = 5;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (-2 < (var7 ^ -1)) {
                        statePc = 46;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    si.a(var4, var5, var7, 0);
                    si.e(var4 + var7, var5, 1, 0, 128);
                    var5++;
                    var7--;
                    if (var8 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (var8 == 0) {
                        statePc = 41;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, boolean param1) {
        boolean stackIn_6_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_9_1 = null;
        int stackIn_10_0 = 0;
        int[] stackIn_10_1 = null;
        int stackIn_11_0 = 0;
        int[] stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        int stackIn_14_0 = 0;
        boolean stackIn_35_0 = false;
        int stackIn_43_0 = 0;
        int[] stackIn_43_1 = null;
        int stackIn_44_0 = 0;
        int[] stackIn_44_1 = null;
        int stackIn_45_0 = 0;
        int[] stackIn_45_1 = null;
        int stackIn_45_2 = 0;
        int stackIn_55_0 = 0;
        int[] stackIn_55_1 = null;
        int stackIn_56_0 = 0;
        int[] stackIn_56_1 = null;
        int stackIn_57_0 = 0;
        int[] stackIn_57_1 = null;
        int stackIn_57_2 = 0;
        int stackIn_60_0 = 0;
        int statePc = 0;
        int var3 = 0;
        int var4 = 0;
        bd var5_ref_bd = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = HostileSpawn.field_I ? 1 : 0;
                    if (param1) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_C = (be) null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    this.l(-7);
                    this.a((byte) -119, ob.field_E.toUpperCase());
                    si.d(0, 0, 640, 400);
                    var3 = ib.a((byte) -72) ? 1 : 0;
                    if (ta.p(3)) {
                        statePc = 34;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var4 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (-43 >= (var4 ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackIn_35_0 = hb.a(var4, mc.field_E, false);
                    stackIn_6_0 = stackIn_35_0;
                    if (var9 != 0) {
                        statePc = 35;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (stackIn_6_0) {
                        statePc = 33;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var5_ref_bd = this.field_b[var4].field_Y;
                    if (var5_ref_bd == null) {
                        statePc = 33;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var5_ref_bd.a();
                    si.d();
                    stackIn_10_0 = var4;
                    stackIn_9_0 = stackIn_10_0;
                    stackIn_10_1 = uk.field_c;
                    stackIn_9_1 = stackIn_10_1;
                    if (param1) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_11_0 = stackIn_9_0;
                    stackIn_11_1 = (int[]) ((Object) stackIn_9_1);
                    stackIn_11_2 = 1;
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = stackIn_10_0;
                    stackIn_11_1 = (int[]) ((Object) stackIn_10_1);
                    stackIn_11_2 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (!hb.a(stackIn_11_0, stackIn_11_1, stackIn_11_2 != 0)) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_14_0 = 1;
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    stackIn_14_0 = 0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    var6 = stackIn_14_0;
                    if (var6 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    qc.field_v.c(3, 3);
                    if (var4 == this.field_J) {
                        statePc = 23;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var7_int = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (var5_ref_bd.field_D.length <= var7_int) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var5_ref_bd.field_D[var7_int] = he.c(var5_ref_bd.field_D[var7_int], (byte) -127);
                    var7_int++;
                    if (var9 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var9 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (var9 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    fj.field_Kb[var4].b(3, 3);
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if ((this.field_J ^ -1) == (var4 ^ -1)) {
                        statePc = 25;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var6 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var5_ref_bd.e(16776960);
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if ((this.field_x ^ -1) == (var4 ^ -1)) {
                        statePc = 31;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (this.field_x >= 0) {
                        statePc = 32;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if ((this.field_J ^ -1) == (var4 ^ -1)) {
                        statePc = 31;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var5_ref_bd.a();
                    this.a(-1 + var5_ref_bd.field_A, 0, 0, -18, -1 + var5_ref_bd.field_z);
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    this.field_b[var4].field_Y = var5_ref_bd;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    o.field_n.b((byte) 108);
                    this.a(100, (byte) -55, 286, 72, 496);
                    si.d(72, 286, 568, 386);
                    this.field_F.a(103, false);
                    si.c();
                    stackIn_35_0 = ta.p(3);
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (stackIn_35_0) {
                        statePc = 74;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (this.field_x != -1) {
                        statePc = 40;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (0 != (this.field_J ^ -1)) {
                        statePc = 40;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    id.field_A.b(jd.field_i.toUpperCase(), 320, 177, 8421376, -1);
                    if (var9 == 0) {
                        statePc = 75;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    this.a(160, (byte) -55, 92, 58, 160);
                    this.a(160, (byte) -55, 92, 244, 340);
                    var4 = this.field_x;
                    if (var4 != -1) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var4 = this.field_J;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    stackIn_44_0 = var4;
                    stackIn_43_0 = stackIn_44_0;
                    stackIn_44_1 = uk.field_c;
                    stackIn_43_1 = stackIn_44_1;
                    if (param1) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    stackIn_45_0 = stackIn_43_0;
                    stackIn_45_1 = (int[]) ((Object) stackIn_43_1);
                    stackIn_45_2 = 1;
                    statePc = 45;
                    continue stateLoop;
                }
                case 44: {
                    stackIn_45_0 = stackIn_44_0;
                    stackIn_45_1 = (int[]) ((Object) stackIn_44_1);
                    stackIn_45_2 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var5 = hb.a(stackIn_45_0, stackIn_45_1, stackIn_45_2 != 0) ? 1 : 0;
                    wh.field_d.c(il.field_b[var4].toUpperCase(), 260, 121, 16776960, -1);
                    if (var5 != 0) {
                        statePc = 52;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var3 != 0) {
                        statePc = 50;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (qa.a(e.field_w, var4, param1)) {
                        statePc = 50;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    de.field_i.e(74, 108);
                    if (var9 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    qc.field_v.a(74, 108);
                    if (var9 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    fj.field_Kb[var4].e(74, 108);
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    var6 = 0;
                    if (var5 != 0) {
                        statePc = 61;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    al.field_Z.c(vc.field_j.toUpperCase(), 260, 140, 16776960, -1);
                    stackIn_56_0 = var4;
                    stackIn_55_0 = stackIn_56_0;
                    stackIn_56_1 = e.field_g;
                    stackIn_55_1 = stackIn_56_1;
                    if (param1) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackIn_57_0 = stackIn_55_0;
                    stackIn_57_1 = (int[]) ((Object) stackIn_55_1);
                    stackIn_57_2 = 1;
                    statePc = 57;
                    continue stateLoop;
                }
                case 56: {
                    stackIn_57_0 = stackIn_56_0;
                    stackIn_57_1 = (int[]) ((Object) stackIn_56_1);
                    stackIn_57_2 = 0;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (!hb.a(stackIn_57_0, stackIn_57_1, stackIn_57_2 != 0)) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    stackIn_60_0 = 1;
                    statePc = 60;
                    continue stateLoop;
                }
                case 59: {
                    stackIn_60_0 = 0;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    var6 = stackIn_60_0;
                    if (var9 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    al.field_Z.c(g.field_N.toUpperCase(), 260, 140, 16776960, -1);
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    var7 = bh.field_g[var4];
                    if (var6 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var7 = qc.field_t;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    al.field_Z.a(var7.toUpperCase(), 260, 150, 320, 64, 16776960, -1, 0, 0, 16);
                    if (var6 != 0) {
                        statePc = 73;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    al.field_Z.c(ml.field_b.toUpperCase() + j.field_d[var4] * 100, 260, 233, 16776960, -1);
                    al.field_Z.c(li.field_v.toUpperCase(), 420, 233, 16776960, -1);
                    if (10 == j.field_d[var4]) {
                        statePc = 72;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    var8 = 0;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if ((j.field_d[var4] ^ -1) >= (var8 ^ -1)) {
                        statePc = 71;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    ob.field_B[0].a(var8 * 8 + 500, 209);
                    var8++;
                    if (var9 != 0) {
                        statePc = 73;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (var9 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (var9 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    ob.field_B[1].a(500, 209);
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    if (var9 == 0) {
                        statePc = 75;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    id.field_A.b(u.field_a.toUpperCase(), 320, 199, 8421376, -1);
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void k(int param0) {
        int var3;
        L0: {
          L1: {
            var3 = HostileSpawn.field_I ? 1 : 0;
            if (12 != this.field_f) {
              break L1;
            } else {
              L2: {
                uh.field_i = uh.field_i - 8;
                if (0 >= uh.field_i) {
                  uh.field_i = 0;
                  if (1 == uj.field_l) {
                    this.f((byte) 76);
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              ed.a(uh.field_i, (byte) -99);
              if (var3 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (this.field_f != 13) {
            break L0;
          } else {
            L3: {
              qg.field_p = qg.field_p - 32;
              if (0 >= qg.field_p) {
                qg.field_p = 0;
                break L3;
              } else {
                break L3;
              }
            }
            qi.b(qg.field_p, (byte) -116);
            break L0;
          }
        }
        L4: {
          L5: {
            if ((this.field_d ^ -1) == -17) {
              break L5;
            } else {
              if (-5 == (this.field_d ^ -1)) {
                L6: {
                  if (-6 != (this.field_C.field_b ^ -1)) {
                    break L6;
                  } else {
                    if (this.field_t >= 4) {
                      break L4;
                    } else {
                      this.field_t = this.field_t - 1;
                      if (-1 >= (this.field_t ^ -1)) {
                        break L4;
                      } else {
                        this.field_t = this.field_t + 4;
                        if (var3 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
                this.field_t = this.field_t - 1;
                if (-1 < (this.field_t ^ -1)) {
                  this.field_t = this.field_t + this.field_C.field_b;
                  if (var3 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
          }
          this.field_t = 0;
          break L4;
        }
        L7: {
          if (param0 <= -11) {
            break L7;
          } else {
            field_i = (bl) null;
            break L7;
          }
        }
        L8: {
          if ((this.field_d ^ -1) == -7) {
            L9: {
              if (this.field_C.field_b == 3) {
                break L9;
              } else {
                if (1 < this.field_C.field_b) {
                  this.field_t = this.field_t - 1;
                  if (0 > this.field_t) {
                    this.field_t = this.field_C.field_b - 1;
                    if (var3 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  } else {
                    break L8;
                  }
                } else {
                  break L8;
                }
              }
            }
            this.field_t = 1;
            break L8;
          } else {
            break L8;
          }
        }
        L10: {
          if ((this.field_d ^ -1) == -3) {
            this.field_t = 1;
            if (3 != this.field_C.field_b) {
              break L10;
            } else {
              this.field_t = 1;
              break L10;
            }
          } else {
            break L10;
          }
        }
        L11: {
          L12: {
            if (1 == this.field_d) {
              break L12;
            } else {
              if (7 != this.field_d) {
                break L11;
              } else {
                break L12;
              }
            }
          }
          this.field_t = 0;
          break L11;
        }
        L13: {
          L14: {
            if (this.field_d == 12) {
              break L14;
            } else {
              if ((this.field_d ^ -1) == -15) {
                break L14;
              } else {
                if (this.field_d == 15) {
                  break L14;
                } else {
                  if (-14 == (this.field_d ^ -1)) {
                    break L14;
                  } else {
                    if ((this.field_d ^ -1) == -12) {
                      break L14;
                    } else {
                      if ((this.field_d ^ -1) == -11) {
                        break L14;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
              }
            }
          }
          this.field_t = this.field_t - 1;
          if (-1 >= (this.field_t ^ -1)) {
            break L13;
          } else {
            this.field_t = -1 + this.field_C.field_b;
            break L13;
          }
        }
        L15: {
          if ((this.field_d ^ -1) == -9) {
            this.field_t = 0;
            break L15;
          } else {
            break L15;
          }
        }
    }

    private final boolean g(byte param0) {
        if (param0 != 30) {
            this.field_o = 3;
        }
        return (lh.field_b.length + -1) * 500 > -jj.field_g ? true : false;
    }

    final void c(byte param0) {
        int var2;
        int var3;
        L0: {
          L1: {
            L2: {
              var3 = HostileSpawn.field_I ? 1 : 0;
              if (this.field_d == 16) {
                break L2;
              } else {
                if (-2 == (this.field_d ^ -1)) {
                  break L1;
                } else {
                  if ((this.field_d ^ -1) != -8) {
                    L3: {
                      if (6 == this.field_d) {
                        break L3;
                      } else {
                        L4: {
                          if (this.field_d == 4) {
                            break L4;
                          } else {
                            L5: {
                              if (2 != this.field_d) {
                                break L5;
                              } else {
                                if ((this.a((byte) -126) ^ -1) <= -1) {
                                  break L5;
                                } else {
                                  this.field_t = 1;
                                  if (var3 == 0) {
                                    break L1;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                            this.field_t = this.field_t + 1;
                            if (this.field_t < this.field_C.field_b) {
                              break L1;
                            } else {
                              this.field_t = 0;
                              if (var3 == 0) {
                                break L1;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        if ((this.field_C.field_b ^ -1) != -6) {
                          break L1;
                        } else {
                          if (4 == this.field_t) {
                            this.field_t = 3;
                            if (var3 == 0) {
                              break L1;
                            } else {
                              break L3;
                            }
                          } else {
                            var2 = 81 / ((77 - param0) / 45);
                            break L0;
                          }
                        }
                      }
                    }
                    if (3 != this.field_C.field_b) {
                      break L1;
                    } else {
                      this.field_t = 0;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            this.field_t = 2;
            break L1;
          }
          var2 = 81 / ((77 - param0) / 45);
          break L0;
        }
    }

    private final void a(int param0, int param1, int param2, String param3, boolean param4, int param5) {
        String dupTemp$0 = null;
        int stackIn_11_0;
        int stackIn_11_1;
        int stackIn_11_2;
        nc stackIn_11_3;
        int stackIn_11_4;
        int stackIn_11_5;
        int stackIn_12_0;
        int stackIn_12_1;
        int stackIn_12_2;
        nc stackIn_12_3;
        int stackIn_12_4;
        int stackIn_12_5;
        String stackIn_12_6;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        String var10_ref = null;
        int var11 = 0;
        String var12 = null;
        try {
          L0: {
            L1: {
              if (!param4) {
                break L1;
              } else {
                si.a(60, param1 - 14, 520, 18, 16776960, 32);
                break L1;
              }
            }
            L2: {
              var7_int = de.a(19926, 20, param0);
              if (param2 < -114) {
                break L2;
              } else {
                this.a(-24, 74, -79, 78, -101);
                break L2;
              }
            }
            L3: {
              param0 = um.a(20, param0, 10179);
              var8 = de.a(19926, 11, param0);
              var9 = um.a(11, param0, 10179);
              var10 = null;
              var11 = bm.field_c;
              if ((var8 ^ -1) <= -11) {
                var10_ref = ae.field_r;
                break L3;
              } else {
                var10_ref = kh.field_fb[var11][var8];
                break L3;
              }
            }
            L4: {
              dupTemp$0 = var10_ref.toUpperCase();
              var12 = dupTemp$0;
              var10_ref = dupTemp$0;
              if (param5 > 0) {
                L5: {
                  stackIn_11_0 = 8;

                  stackIn_11_1 = param1;

                  stackIn_11_2 = 0;

                  stackIn_11_3 = al.field_Z;

                  stackIn_11_4 = -16 + ce.field_b[0];

                  stackIn_11_5 = 16776960;

                  if (-11 >= (param5 ^ -1)) {
                    stackIn_12_0 = stackIn_11_0;
                    stackIn_12_1 = stackIn_11_1;
                    stackIn_12_2 = stackIn_11_2;
                    stackIn_12_3 = (nc) ((Object) stackIn_11_3);
                    stackIn_12_4 = stackIn_11_4;
                    stackIn_12_5 = stackIn_11_5;
                    stackIn_12_6 = "10";
                    break L5;
                  } else {
                    stackIn_12_0 = stackIn_11_0;
                    stackIn_12_1 = stackIn_11_1;
                    stackIn_12_2 = stackIn_11_2;
                    stackIn_12_3 = (nc) ((Object) stackIn_11_3);
                    stackIn_12_4 = stackIn_11_4;
                    stackIn_12_5 = stackIn_11_5;
                    stackIn_12_6 = "0" + param5;
                    break L5;
                  }
                }
                ec.a(stackIn_12_0, stackIn_12_1, stackIn_12_2 != 0, stackIn_12_3, stackIn_12_4, stackIn_12_5, stackIn_12_6);
                break L4;
              } else {
                break L4;
              }
            }
            al.field_Z.c(param3, ce.field_b[0], param1, 16776960, -1);
            al.field_Z.c(t.field_k[var7_int].toUpperCase(), ce.field_b[1], param1, 16776960, -1);
            al.field_Z.c(var12, ce.field_b[2], param1, 16776960, -1);
            ec.a(9, param1, false, al.field_Z, ce.field_b[3], 16776960, Integer.toString(var9));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var7);

            stackIn_17_1 = new StringBuilder().append("re.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void d(byte param0) {
        int var2;
        int var3;
        int var4;
        L0: {
          L1: {
            var4 = HostileSpawn.field_I ? 1 : 0;
            var2 = 108 / ((param0 - 33) / 53);
            var3 = this.field_d;
            if (var3 != 0) {
              break L1;
            } else {
              if (var4 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            L3: {
              L4: {
                L5: {
                  L6: {
                    L7: {
                      L8: {
                        L9: {
                          L10: {
                            L11: {
                              L12: {
                                if (-2 != (var3 ^ -1)) {
                                  break L12;
                                } else {
                                  if (var4 == 0) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              if ((var3 ^ -1) == -8) {
                                break L10;
                              } else {
                                L13: {
                                  if (-3 != (var3 ^ -1)) {
                                    break L13;
                                  } else {
                                    if (var4 == 0) {
                                      break L9;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                if (var3 == 16) {
                                  break L8;
                                } else {
                                  if (var3 == 8) {
                                    break L7;
                                  } else {
                                    if ((var3 ^ -1) == -5) {
                                      break L6;
                                    } else {
                                      L14: {
                                        if (-7 != (var3 ^ -1)) {
                                          break L14;
                                        } else {
                                          if (var4 == 0) {
                                            break L5;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                      L15: {
                                        if (-6 != (var3 ^ -1)) {
                                          break L15;
                                        } else {
                                          if (var4 == 0) {
                                            break L4;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      if (17 != var3) {
                                        break L2;
                                      } else {
                                        if (var4 == 0) {
                                          break L3;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            this.field_f = 5;
                            this.a((byte) -79, false);
                            if (var4 == 0) {
                              break L2;
                            } else {
                              break L10;
                            }
                          }
                          this.field_f = 6;
                          this.a((byte) 117, false);
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L9;
                          }
                        }
                        this.field_f = 5;
                        this.a((byte) 106, false);
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L8;
                        }
                      }
                      this.field_f = 5;
                      this.a((byte) -59, false);
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L7;
                      }
                    }
                    if (u.field_f[7] != nl.field_f) {
                      break L2;
                    } else {
                      this.field_f = 7;
                      this.a((byte) -56, false);
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  this.field_f = 5;
                  this.a((byte) -33, false);
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L5;
                  }
                }
                this.field_f = 5;
                this.a((byte) 103, false);
                if (var4 == 0) {
                  break L2;
                } else {
                  break L4;
                }
              }
              this.field_f = 1;
              this.a((byte) 104, false);
              if (var4 == 0) {
                break L2;
              } else {
                break L3;
              }
            }
            this.field_f = 5;
            this.a((byte) 125, false);
            break L0;
          }
          break L0;
        }
    }

    private final bd e(byte param0, int param1) {
        if (param0 != -44) {
            this.a(false);
        }
        int var3 = an.field_r[param1];
        bd var4 = new bd(128, 128);
        int[] var5 = new int[4];
        si.b(var5);
        var4.a();
        if (!((param1 ^ -1) > -1)) {
            qa.field_g[param1].e(16, 0);
        }
        if (!((var3 ^ -1) > -1)) {
            hh.field_a[var3].e(32, 48);
        }
        var4.e();
        o.field_n.b((byte) 121);
        si.a(var5);
        return var4;
    }

    private final void a(boolean param0) {
        int statePc = 0;
        le var3 = null;
        le var4 = null;
        le var5 = null;
        int var7 = 0;
        int var8 = 0;
        le var9 = null;
        int[] var13 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = HostileSpawn.field_I ? 1 : 0;
                    if (null == this.field_z) {
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
                    var9 = new le(0L, (le) null);
                    if (!param0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.a(-34, 19, 26, -62);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var3 = new le(0L, (le) null);
                    var4 = new le(0L, (le) null);
                    var5 = new le(0L, (le) null);
                    var9.field_pb = nm.field_f.h();
                    var13 = var9.field_pb.field_D;
                    var7 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if ((var13.length ^ -1) >= (var7 ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var8 != 0) {
                        statePc = 15;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (-1048577 > (var13[var7] & 16711680 ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var13[var7] = 16776960;
                    if (var8 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var13[var7] = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var7++;
                    if (var8 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (null == var9.field_Y) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var3.field_Y = var9.field_Y.h();
                    var3.field_Y.f();
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    var3.field_pb = var9.field_pb.h();
                    var3.field_pb.f();
                    var5.field_nb = oa.field_m;
                    var9.field_pb = var9.field_pb.h();
                    this.field_z = new pb(0L, var9, var3, var4, var5, false);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void e(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        L0: {
          var6 = HostileSpawn.field_I ? 1 : 0;
          if (param0 == 16777215) {
            break L0;
          } else {
            this.k(38);
            break L0;
          }
        }
        L1: {
          var3 = ec.a(bm.field_b, (byte) 19);
          if ((var3 ^ -1) >= -1) {
            break L1;
          } else {
            var4 = -(16 * var3) + 320;
            var5 = 0;
            L2: while (true) {
              L3: {
                if ((il.field_b.length ^ -1) >= (var5 ^ -1)) {
                  break L3;
                } else {
                  if (var6 != 0) {
                    break L1;
                  } else {
                    L4: {
                      if (hb.a(var5, bm.field_b, false)) {
                        L5: {
                          L6: {
                            L7: {
                              if ((var4 ^ -1) < (j.field_c ^ -1)) {
                                break L7;
                              } else {
                                if (param1 > rb.field_m) {
                                  break L7;
                                } else {
                                  if ((var4 - -32 ^ -1) >= (j.field_c ^ -1)) {
                                    break L7;
                                  } else {
                                    if (rb.field_m < 32 + param1) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                            }
                            fj.field_Kb[var5].b(var4, param1);
                            if (var6 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                          fj.field_Kb[var5].a(-6 + var4, param1 + -6, 44, 44);
                          al.field_Z.b(il.field_b[var5].toUpperCase(), var4 - -16, -8 + param1, 16776960, -1);
                          al.field_Z.b(bh.field_g[var5].toUpperCase(), 320, param1 + 50, 16777215, -1);
                          break L5;
                        }
                        var4 += 32;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var5++;
                    if (var6 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              break L1;
            }
          }
        }
    }

    private final void d(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        L0: {
          var6 = HostileSpawn.field_I ? 1 : 0;
          var3 = 79 % ((-56 - param0) / 44);
          this.a((byte) 114, nl.field_f);
          var4 = -3 + (448 - dd.field_o[this.field_d].length * 30);
          var5 = -10 + (-99 + var4);
          if ((var5 ^ -1) == (this.field_E.field_sb ^ -1)) {
            break L0;
          } else {
            this.field_E.field_sb = var5;
            this.field_E.a(16, 0, (byte) -101);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!ib.a((byte) -72)) {
              break L2;
            } else {
              this.a(288, (byte) -55, 74, 57, 228);
              this.a(288, (byte) -55, 74, 290, 20);
              if (var6 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          this.a(288, (byte) -55, 74, 57, 240);
          break L1;
        }
        L3: {
          L4: {
            if (-1 >= (rl.field_c ^ -1)) {
              break L4;
            } else {
              if (!ta.p(3)) {
                ul.field_O = false;
                if (var6 == 0) {
                  break L3;
                } else {
                  break L4;
                }
              } else {
                break L3;
              }
            }
          }
          L5: {
            this.a(138, (byte) -55, 74, 324, 235);
            nj.field_d[bm.field_c][rl.field_c].b(327, 77);
            this.a(146, (byte) -55, 216, 324, 235);
            this.a(146, (byte) -55, 216, 567, 20);
            if (null != this.field_G) {
              this.field_G.a(106, false);
              break L5;
            } else {
              break L5;
            }
          }
          ul.field_O = false;
          break L3;
        }
        L6: {
          if (!ul.field_O) {
            break L6;
          } else {
            this.a(70, (byte) -55, 74, 324, 235);
            al.field_Z.a(la.field_i.toUpperCase(), 334, 80, 215, 200, 16776960, -1, 0, 0, 16);
            break L6;
          }
        }
        this.field_E.a(124, false);
    }

    private final void e(byte param0) {
        L0: {
          if (param0 == -29) {
            break L0;
          } else {
            this.h(-58, -28);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((this.field_d ^ -1) == -3) {
              break L2;
            } else {
              ul.field_O = false;
              this.field_E = null;
              if (!HostileSpawn.field_I) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          if (null != this.field_E) {
            break L1;
          } else {
            this.h((byte) 33);
            break L1;
          }
        }
    }

    private final int a(byte param0) {
        int var5;
        int stackIn_5_0 = 0;
        int stackIn_19_0 = 0;
        bd[] stackIn_27_0 = null;
        int var2;
        int var3;
        int var4;
        L0: {
          L1: {
            var5 = HostileSpawn.field_I ? 1 : 0;
            if (10 != gn.field_k[0]) {
              break L1;
            } else {
              if (null != this.field_w[0][10]) {
                stackIn_5_0 = 11;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackIn_5_0 = 10;
          break L0;
        }
        var2 = stackIn_5_0;
        var3 = -9 % ((-59 - param0) / 46);
        var4 = 0;
        L2: while (true) {
          L3: {
            L4: {
              L5: {
                if (var4 >= var2) {
                  break L5;
                } else {
                  stackIn_27_0 = this.field_w[0][var4].field_nb;

                  if (var5 != 0) {
                    L6: while (true) {
                      if (stackIn_27_0 == null) {
                        var3++;
                        if (var5 == 0) {
                          if ((var2 ^ -1) >= (var3 ^ -1)) {
                            break L3;
                          } else {
                            stackIn_27_0 = this.field_w[1][var3].field_nb;
                            continue L6;
                          }
                        } else {
                          break L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                  } else {
                    if (stackIn_27_0 != null) {
                      return var4;
                    } else {
                      var4++;
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
              if (ib.a((byte) -72)) {
                L7: {
                  L8: {
                    if (gn.field_k[1] != 10) {
                      break L8;
                    } else {
                      if (null != this.field_w[1][10]) {
                        stackIn_19_0 = 11;
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  stackIn_19_0 = 10;
                  break L7;
                }
                var2 = stackIn_19_0;
                var3 = 0;
                L9: while (true) {
                  if ((var2 ^ -1) >= (var3 ^ -1)) {
                    break L3;
                  } else {
                    if (this.field_w[1][var3].field_nb == null) {
                      var3++;
                      if (var5 == 0) {
                        continue L9;
                      } else {
                        break L3;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            return 32 | var3;
          }
          return -1;
        }
    }

    private final void e(int param0) {
        boolean stackIn_17_0 = false;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        boolean stackIn_33_0 = false;
        int stackIn_37_0 = 0;
        boolean stackIn_40_0 = false;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        boolean stackOut_16_0;
        boolean stackOut_32_0;
        boolean stackOut_39_0;
        int statePc = 0;
        le var3 = null;
        le var4 = null;
        le var5 = null;
        le var6 = null;
        le var7 = null;
        le var8 = null;
        le var9 = null;
        le var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15_ref_int__ = null;
        int var15 = 0;
        int[] var16_ref_int__ = null;
        int var16 = 0;
        int[] var17_ref_int__ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int[] var24 = null;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        le var29 = null;
        int var30 = 0;
        int[] var31 = null;
        int[] var32 = null;
        pb var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var38 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var44 = null;
        int[] var48 = null;
        int[] var49 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var30 = HostileSpawn.field_I ? 1 : 0;
                    var5 = new le(0L, (le) null);
                    var6 = new le(0L, (le) null);
                    var7 = new le(0L, (le) null);
                    var8 = new le(0L, (le) null);
                    var33 = new pb(0L, var5, var6, var7, var8, false);
                    var3 = new le(0L, (le) null);
                    var4 = new le(0L, (le) null);
                    this.field_F = new th(0L, var3, var4, var33);
                    this.field_F.field_zb = 299;
                    this.field_F.field_sb = 115;
                    this.field_F.field_qb = 568;
                    this.field_F.field_tb = 36;
                    var9 = this.field_F.field_Kb;
                    var9.field_qb = 576;
                    var9.field_sb = 128;
                    var10 = this.field_F.field_Ib;
                    var11 = 32;
                    var12 = 32;
                    var13 = 0;
                    var14 = ib.a((byte) -72) ? 1 : 0;
                    if (hb.a(31, uk.field_c, false)) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var40 = e.field_y;
                    var34 = var40;
                    var15_ref_int__ = var34;
                    var15_ref_int__[0] = ua.a(var40[0], -1073741825);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    var15 = 48;
                    mc.field_E = nf.a(false);
                    kf.a(e.field_y, 0, mc.field_E, 0, mc.field_E.length);
                    if (var14 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var41 = mc.field_E;
                    var35 = var41;
                    var31 = var35;
                    var16_ref_int__ = var31;
                    var42 = e.field_w;
                    var36 = var42;
                    var32 = var36;
                    var17_ref_int__ = var32;
                    var18 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (8 <= var18) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var31[var18] = ll.a(var41[var18], var42[var18]);
                    var18++;
                    if (var30 != 0) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var30 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var16_ref_int__ = mc.field_E;
                    var17_ref_int__ = uk.field_c;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    var18 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (8 <= var18) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var16_ref_int__[var18] = ua.a(var16_ref_int__[var18], var17_ref_int__[var18] ^ -1);
                    var18++;
                    if (var30 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var16 = var14;
                    if (var16 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var48 = lh.field_b[1];
                    var18 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var18 >= var48.length) {
                        statePc = 22;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var19 = var48[var18];
                    stackOut_16_0 = qa.a(mc.field_E, var19, true);
                    stackIn_23_0 = stackOut_16_0 ? 1 : 0;
                    stackIn_17_0 = stackOut_16_0;
                    if (var30 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (stackIn_17_0) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var16 = 1;
                    if (var30 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var18++;
                    if (var30 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = 114 % ((param0 - 71) / 49);
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var17 = stackIn_23_0;
                    var18 = 42 + -ec.a(mc.field_E, (byte) 19);
                    var19 = (1 + var18) / 2;
                    var10.field_sb = 92;
                    var10.field_qb = var15 * var19 + 64;
                    var10.field_I = null;
                    var11 = 76;
                    var20 = 0;
                    var12 = var11;
                    var21 = 0;
                    var22 = lh.field_b.length;
                    var23 = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = var23 ^ -1;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (stackIn_25_0 <= (var22 ^ -1)) {
                        statePc = 51;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_52_0 = -2;
                    stackIn_27_0 = stackIn_52_0;
                    stackIn_52_1 = var23 ^ -1;
                    stackIn_27_1 = stackIn_52_1;
                    if (var30 != 0) {
                        statePc = 52;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (stackIn_27_0 == stackIn_27_1) {
                        statePc = 29;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var15 = 40;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    var44 = lh.field_b[var23];
                    var38 = var44;
                    var24 = var38;
                    var25 = 0;
                    var26 = 0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if ((var44.length ^ -1) >= (var26 ^ -1)) {
                        statePc = 36;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackOut_32_0 = qa.a(mc.field_E, var44[var26], true);
                    stackIn_37_0 = stackOut_32_0 ? 1 : 0;
                    stackIn_33_0 = stackOut_32_0;
                    if (var30 != 0) {
                        statePc = 37;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (!stackIn_33_0) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var25++;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    var26++;
                    if (var30 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var13 = 0;
                    var12 = var11;
                    var19 = (1 + var25) / 2;
                    stackIn_37_0 = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    var20 = stackIn_37_0;
                    var49 = var24;
                    var27 = 0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if ((var49.length ^ -1) >= (var27 ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var28 = var49[var27];
                    this.field_b[var28] = null;
                    stackOut_39_0 = hb.a(var28, mc.field_E, false);
                    stackIn_25_0 = stackOut_39_0 ? 1 : 0;
                    stackIn_40_0 = stackOut_39_0;
                    if (var30 != 0) {
                        statePc = 25;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (!stackIn_40_0) {
                        statePc = 43;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (var30 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var29 = new le(0L, (le) null);
                    this.field_b[var28] = var29;
                    var29.field_Y = new bd(38, 38);
                    var29.field_sb = var29.field_Y.field_z;
                    var29.field_qb = var29.field_Y.field_z;
                    var29.field_zb = var13;
                    var29.field_tb = var12;
                    if (var21 < var12) {
                        statePc = 45;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var21 = var12;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    var10.a(false, var29);
                    var20++;
                    var12 = var12 + var15;
                    if (var19 == var20) {
                        statePc = 48;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var13 += 40;
                    var12 = var11 + var15 * (var25 & 1) / 2;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    var27++;
                    if (var30 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var11 += 468;
                    var23++;
                    if (var30 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var10.field_qb = var21 - -64;
                    stackIn_52_0 = 500;
                    stackIn_52_1 = var21;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (stackIn_52_0 >= stackIn_52_1) {
                        statePc = 56;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    dd.field_o[6] = ak.field_c;
                    if ((this.field_d ^ -1) == -7) {
                        statePc = 55;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 55: {
                    this.field_C.field_b = dd.field_o[this.field_d].length;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    o.field_n.b((byte) 123);
                    this.field_F.a(16, 0, (byte) -105);
                    this.field_F.a(true, true);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void j(byte param0) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        Object var2;
        String var2_ref;
        int var3;
        StringBuilder var4;
        String var5;
        L0: {
          L1: {
            this.a((byte) 121, jf.field_a);
            var2 = null;
            if (!om.field_b) {
              break L1;
            } else {
              if ((fg.field_c[bm.field_c] ^ -1) != (rl.field_c ^ -1)) {
                break L1;
              } else {
                var2_ref = f.field_a[bm.field_c][10];
                break L0;
              }
            }
          }
          var2_ref = f.field_a[bm.field_c][rl.field_c];
          break L0;
        }
        L2: {
          var3 = 10;
          this.a(275, (byte) -55, 86, 57, 2 * var3 + 270);
          var4 = new StringBuilder(32);
          discarded$0 = var4.append(mc.field_J);
          if (rl.field_c >= 9) {
            break L2;
          } else {
            discarded$1 = var4.append('0');
            break L2;
          }
        }
        L3: {
          discarded$2 = var4.append(rl.field_c - -1);
          discarded$3 = var4.append(" <col=ffffff>");
          discarded$4 = var4.append(kh.field_fb[bm.field_c][rl.field_c].toUpperCase());
          discarded$5 = var4.append("</col>");
          if (param0 == 84) {
            break L3;
          } else {
            this.j((byte) 35);
            break L3;
          }
        }
        L4: {
          wh.field_d.c(var4.toString(), 67, 110, 16776960, -1);
          if (var2_ref == null) {
            break L4;
          } else {
            var5 = var2_ref.toUpperCase();
            al.field_Z.a(var5, 67, 120, 270, 210, 16776960, -1, 0, 0, 14);
            break L4;
          }
        }
        this.a(138, (byte) -55, 86, 353, 235);
        nj.field_d[bm.field_c][rl.field_c].b(356, 89);
        this.a(131, (byte) -55, 230, 353, 235);
        this.a(235, 230, (byte) 56, 353, 131);
    }

    private final void c(boolean param0) {
        int stackIn_16_0 = 0;
        Object stackIn_26_0;
        int stackIn_26_1;
        int stackIn_26_2;
        int stackIn_26_3;
        String stackIn_26_4;
        Object stackIn_27_0;
        int stackIn_27_1;
        int stackIn_27_2;
        int stackIn_27_3;
        String stackIn_27_4;
        int stackIn_27_5;
        String stackIn_38_0 = null;
        Object var2;
        String var3;
        String var4;
        Object var4_ref;
        String[] var5;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        vh var13;
        ic var14;
        ic var15;
        int[] var19;
        L0: {
          var12 = HostileSpawn.field_I ? 1 : 0;
          var2 = null;
          if (!param0) {
            break L0;
          } else {
            var13 = (vh) null;
            re.a(-52, (vh) null, -73, -122, 75, (vh) null);
            break L0;
          }
        }
        var3 = q.field_m[bm.field_c];
        var4 = var3;
        var4 = var3;
        this.a((byte) -36, var3.toUpperCase());
        if (!ta.p(3)) {
          L1: {
            var4_ref = null;
            if (null == p.field_m[bm.field_c]) {
              p.field_m[bm.field_c] = pi.a(10, 6413, 3, ka.field_p[bm.field_c], 1);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            L3: {
              L4: {
                var14 = p.field_m[bm.field_c];
                var15 = var14;
                if (var15.field_m) {
                  if (null != var15.field_l) {
                    L5: {
                      L6: {
                        var4 = kh.field_X;
                        var5 = var14.field_p[ue.field_e];
                        var19 = var14.field_l[ue.field_e];
                        var7 = fg.a(var15, ue.field_e, false, ch.field_h);
                        var8 = 18;
                        if (null == ch.field_h) {
                          break L6;
                        } else {
                          if (var15.field_j != ch.field_h.field_t) {
                            break L6;
                          } else {
                            if (var7 >= 0) {
                              break L6;
                            } else {
                              stackIn_16_0 = 1;
                              break L5;
                            }
                          }
                        }
                      }
                      stackIn_16_0 = 0;
                      break L5;
                    }
                    L7: {
                      var9 = stackIn_16_0;
                      if (var9 == 0) {
                        var8 += 2;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var10 = 90;
                    this.a(244, (byte) -55, 90, 56, 528);
                    var10 += 16;
                    al.field_Z.c(ii.field_f[0].toUpperCase(), ce.field_b[0], var10, 16776960, -1);
                    al.field_Z.c(ii.field_f[1].toUpperCase(), ce.field_b[1], var10, 16776960, -1);
                    al.field_Z.c(ii.field_f[2].toUpperCase(), ce.field_b[2], var10, 16776960, -1);
                    al.field_Z.a(ii.field_f[3].toUpperCase(), ce.field_b[3], var10, 16776960, -1);
                    var10 += 6;
                    var10 += 18;
                    var11 = 0;
                    L8: while (true) {
                      L9: {
                        if (10 <= var11) {
                          break L9;
                        } else {
                          stackIn_38_0 = var5[var11];

                          if (var12 != 0) {
                            break L3;
                          } else {
                            L10: {
                              if (stackIn_38_0 != null) {
                                L11: {
                                  stackIn_26_0 = this;

                                  stackIn_26_1 = var19[var11];

                                  stackIn_26_2 = var10;

                                  stackIn_26_3 = -128;

                                  stackIn_26_4 = var5[var11].toUpperCase();

                                  if (var7 != var11) {
                                    stackIn_27_0 = this;
                                    stackIn_27_1 = stackIn_26_1;
                                    stackIn_27_2 = stackIn_26_2;
                                    stackIn_27_3 = stackIn_26_3;
                                    stackIn_27_4 = (String) ((Object) stackIn_26_4);
                                    stackIn_27_5 = 0;
                                    break L11;
                                  } else {
                                    stackIn_27_0 = this;
                                    stackIn_27_1 = stackIn_26_1;
                                    stackIn_27_2 = stackIn_26_2;
                                    stackIn_27_3 = stackIn_26_3;
                                    stackIn_27_4 = (String) ((Object) stackIn_26_4);
                                    stackIn_27_5 = 1;
                                    break L11;
                                  }
                                }
                                this.a(stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_27_4, stackIn_27_5 != 0, var11 - -1);
                                var4 = "";
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            var10 = var10 + var8;
                            var11++;
                            if (var12 == 0) {
                              continue L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      if (var9 != 0) {
                        this.a(tf.field_a, 8 + var10, -126, qg.field_r.toUpperCase(), true, -1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  } else {
                    var4 = ci.field_c;
                    break L4;
                  }
                } else {
                  var4 = jf.field_h;
                  break L4;
                }
              }
              L12: {
                if (var4 == null) {
                  break L12;
                } else {
                  if (var4.length() > 0) {
                    this.a(26, (byte) -55, 174, 56, 528);
                    al.field_Z.b(var4.toUpperCase(), 320, 193, 16776960, -1);
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
              this.a(30, (byte) -55, 360, 56, 528);
              wh.field_d.b(pl.field_a.toUpperCase(), 320, 383, 16776960, -1);
              if (ta.p(3)) {
                break L2;
              } else {
                stackIn_38_0 = (String) (var4);
                break L3;
              }
            }
            L13: {
              if (stackIn_38_0 == kh.field_X) {
                break L13;
              } else {
                if (var15 == null) {
                  break L13;
                } else {
                  if (!p.field_m[bm.field_c].field_m) {
                    break L13;
                  } else {
                    if (var15.field_l == null) {
                      break L13;
                    } else {
                      if (var14.field_l[ue.field_e] == null) {
                        break L13;
                      } else {
                        if ((var14.field_l[ue.field_e].length ^ -1) != -1) {
                          break L13;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            break L2;
          }
          return;
        } else {
          wh.field_d.a(kh.field_X.toUpperCase(), 64, 200, 512, 100, 16776960, -1, 1, 0, wh.field_d.field_y + wh.field_d.field_F);
          al.field_Z.a(u.field_a.toUpperCase(), 64, 345, 512, 1000, 16776960, -1, 1, 0, wh.field_d.field_F + wh.field_d.field_y);
          hm.a(576, ul.field_J, false, 30, 353, 32);
          return;
        }
    }

    private final boolean c(int param0) {
        if (param0 != 24834) {
            this.field_g = -26;
        }
        return -jj.field_g > 0 ? true : false;
    }

    private final void a(byte param0, boolean param1) {
        int stackIn_115_0 = 0;
        int stackIn_122_0 = 0;
        int[][] stackIn_150_0 = null;
        int stackIn_150_1 = 0;
        int[][] stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        int[][] stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        int[] stackIn_152_2 = null;
        int stackIn_156_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_159_1 = 0;
        int stackIn_188_0 = 0;
        int statePc = 0;
        ic[] var3_ref_ic__ = null;
        int var3 = 0;
        int var4_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = HostileSpawn.field_I ? 1 : 0;
                    if (this.field_j > 0) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    var4_int = this.field_f;
                    if (var4_int == 29) {
                        statePc = 65;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (-1 == (var4_int ^ -1)) {
                        statePc = 67;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (27 == var4_int) {
                        statePc = 67;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var4_int == 3) {
                        statePc = 79;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (-23 != (var4_int ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var7 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (6 == var4_int) {
                        statePc = 85;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (2 == var4_int) {
                        statePc = 91;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (-33 == (var4_int ^ -1)) {
                        statePc = 96;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if ((var4_int ^ -1) != -25) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (var7 == 0) {
                        statePc = 96;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (-26 != (var4_int ^ -1)) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var7 == 0) {
                        statePc = 132;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (5 != var4_int) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (var7 == 0) {
                        statePc = 135;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if ((var4_int ^ -1) != -2) {
                        statePc = 25;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var7 == 0) {
                        statePc = 147;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (7 != var4_int) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var7 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if ((var4_int ^ -1) != -29) {
                        statePc = 31;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (var7 == 0) {
                        statePc = 171;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (30 == var4_int) {
                        statePc = 173;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (31 == var4_int) {
                        statePc = 178;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if ((var4_int ^ -1) != -27) {
                        statePc = 36;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var7 == 0) {
                        statePc = 183;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (-13 != (var4_int ^ -1)) {
                        statePc = 39;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (var7 == 0) {
                        statePc = 193;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (var4_int != 13) {
                        statePc = 42;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (var7 == 0) {
                        statePc = 201;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (-5 == (var4_int ^ -1)) {
                        statePc = 208;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (-15 != (var4_int ^ -1)) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (var7 == 0) {
                        statePc = 210;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (-12 == (var4_int ^ -1)) {
                        statePc = 217;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (-9 != (var4_int ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (var7 == 0) {
                        statePc = 221;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if ((var4_int ^ -1) != -11) {
                        statePc = 53;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (var7 == 0) {
                        statePc = 223;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (-10 == (var4_int ^ -1)) {
                        statePc = 225;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (var4_int != 15) {
                        statePc = 57;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (var7 == 0) {
                        statePc = 227;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if ((var4_int ^ -1) == -17) {
                        statePc = 229;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (-34 == (var4_int ^ -1)) {
                        statePc = 243;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if ((var4_int ^ -1) != -19) {
                        statePc = 62;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (var7 == 0) {
                        statePc = 244;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (var4_int != 17) {
                        statePc = 252;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (var7 == 0) {
                        statePc = 248;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    this.field_j = 1;
                    dh.field_a.a((byte) -48, true);
                    this.field_s = 3;
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    this.field_s = 2;
                    hh.field_d = 0;
                    this.field_j = 1;
                    vj.field_s = 0;
                    n.field_s = 0;
                    kh.field_ab.a(0);
                    u.field_e = u.field_e - ei.field_l;
                    ja.field_d = ja.field_d + 1;
                    cf.field_s = 0;
                    qb.field_k = qb.field_k + w.field_r;
                    w.field_r = 0;
                    rl.field_c = -1;
                    le.field_D = 0;
                    var14 = bm.field_b;
                    var11 = var14;
                    var8 = var11;
                    var4 = var8;
                    var5 = 0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if ((var5 ^ -1) <= -9) {
                        statePc = 72;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var14[var5] = 0;
                    var5++;
                    if (var7 != 0) {
                        statePc = 73;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (var7 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    kh.field_ib[2] = 0;
                    kh.field_ib[0] = 600;
                    kh.field_ib[3] = 0;
                    eh.field_g = 64;
                    kh.field_ib[1] = 0;
                    kh.field_U[0] = 1;
                    kh.field_U[1] = 0;
                    jf.field_g = 0;
                    qh.field_k = 0;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    if (1 != bm.field_c) {
                        statePc = 77;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (hh.field_d == 0) {
                        statePc = 76;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 76: {
                    kh.field_U[0] = 0;
                    kh.field_ib[0] = 0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    rf.field_f = 0;
                    gb.field_h = 0;
                    uf.field_h = false;
                    bh.field_d = 0;
                    gf.field_j = 0;
                    wb.field_R = 0;
                    pl.field_l = false;
                    if (jh.field_ab != 1) {
                        statePc = 252;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    db.a(true, 256, rb.field_s);
                    statePc = 252;
                    continue stateLoop;
                }
                case 79: {
                    this.field_v = 0;
                    this.field_j = 1;
                    this.field_s = 1;
                    si.d(0, 0, 0, 0);
                    this.field_g = this.b((byte) 82, 0);
                    si.c();
                    this.g(12169);
                    if (param1) {
                        statePc = 252;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    this.field_t = 0;
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    this.field_v = 0;
                    this.field_s = 7;
                    this.field_j = 1;
                    si.d(0, 0, 0, 0);
                    this.field_g = this.b((byte) 82, 0);
                    si.c();
                    this.g(12169);
                    if (!param1) {
                        statePc = 84;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 84: {
                    this.field_t = 0;
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (!param1) {
                        statePc = 87;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 87: {
                    this.field_t = 0;
                    if (-8 == (this.field_d ^ -1)) {
                        statePc = 89;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 89: {
                    this.field_t = 1;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    this.field_j = 1;
                    this.field_s = 5;
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    this.field_j = 1;
                    this.field_s = 4;
                    if (!ta.p(3)) {
                        statePc = 94;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    this.field_t = 1;
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    this.field_t = 3;
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (this.field_f == 32) {
                        statePc = 98;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var15 = bm.field_b;
                    var12 = var15;
                    var9 = var12;
                    var4 = var9;
                    var5 = 0;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    if ((var5 ^ -1) <= -9) {
                        statePc = 103;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    var15[var5] = 0;
                    var5++;
                    if (var7 != 0) {
                        statePc = 108;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (var7 == 0) {
                        statePc = 99;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (-11 != (this.field_d ^ -1)) {
                        statePc = 108;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if (0 < w.field_r) {
                        statePc = 106;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 106: {
                    ib.a(bm.field_c, w.field_r, rl.field_c, 109);
                    cf.field_s = 0;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    rg.a((byte) -21);
                    ta.a((byte) -117, rl.field_c);
                    if (var7 == 0) {
                        statePc = 123;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (this.field_d != 2) {
                        statePc = 123;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    var4_int = 0;
                    var5 = 0;
                    var6 = this.a((byte) -110);
                    if (param1) {
                        statePc = 111;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    this.field_t = 0;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    if (var6 < 0) {
                        statePc = 116;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    if ((31 & var6) != 10) {
                        statePc = 114;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    stackIn_115_0 = 1;
                    statePc = 115;
                    continue stateLoop;
                }
                case 114: {
                    stackIn_115_0 = 0;
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    var5 = stackIn_115_0;
                    var4_int = 1;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    if (var4_int == 0) {
                        statePc = 118;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 118: {
                    return;
                }
                case 119: {
                    le.field_D = 0;
                    if (var5 == 0) {
                        statePc = 121;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    stackIn_122_0 = 1;
                    statePc = 122;
                    continue stateLoop;
                }
                case 121: {
                    stackIn_122_0 = 0;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    om.field_b = stackIn_122_0 != 0;
                    u.field_f[7] = nl.field_f;
                    this.field_s = 8;
                    this.field_j = 1;
                    ta.a((byte) -126, rl.field_c);
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    var3_ref_ic__ = p.field_m;
                    p.field_m[1] = null;
                    u.field_f[7] = jh.field_bb;
                    mc.field_I = 1;
                    hg.field_e = 1;
                    if ((jh.field_ab ^ -1) == -2) {
                        statePc = 124;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    jf.field_c = 128;
                    if (param1) {
                        statePc = 126;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    this.field_t = 0;
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    var3_ref_ic__[0] = null;
                    of.field_h = null;
                    if (1 != bm.field_c) {
                        statePc = 129;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    if (rl.field_c != 0) {
                        statePc = 129;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    ei.field_o = new eg();
                    ei.field_o.a(tf.field_e, (byte) 118);
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    if (0 != bm.field_c) {
                        statePc = 252;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    if (0 != rl.field_c) {
                        statePc = 252;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    ei.field_o = new eg();
                    ei.field_o.a(il.field_a, (byte) -13);
                    ei.field_o.field_g = false;
                    statePc = 252;
                    continue stateLoop;
                }
                case 132: {
                    this.field_s = 8;
                    this.field_j = 1;
                    if (!param1) {
                        statePc = 134;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 134: {
                    this.field_t = 0;
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (param1) {
                        statePc = 143;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    this.field_t = 0;
                    if ((this.field_d ^ -1) != -2) {
                        statePc = 138;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    this.field_t = 1;
                    statePc = 138;
                    continue stateLoop;
                }
                case 138: {
                    if (this.field_d != 4) {
                        statePc = 140;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    this.field_t = 5;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if (this.field_d == 6) {
                        statePc = 142;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 142: {
                    this.field_t = 6;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    this.field_j = 1;
                    this.field_s = 0;
                    if (1 != jh.field_ab) {
                        statePc = 252;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if (this.field_d != 2) {
                        statePc = 252;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    db.a(true, 256, vg.field_h);
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    mc.field_I = 1;
                    of.field_h = null;
                    hg.field_e = 1;
                    jf.field_c = 128;
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    this.field_s = 10;
                    u.field_f[26] = jh.field_bb;
                    this.field_j = 1;
                    stackIn_151_0 = dd.field_o;
                    stackIn_150_0 = stackIn_151_0;
                    stackIn_151_1 = 10;
                    stackIn_150_1 = stackIn_151_1;
                    if (om.field_b) {
                        statePc = 151;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    stackIn_152_0 = (int[][]) ((Object) stackIn_150_0);
                    stackIn_152_1 = stackIn_150_1;
                    stackIn_152_2 = ja.field_h;
                    statePc = 152;
                    continue stateLoop;
                }
                case 151: {
                    stackIn_152_0 = (int[][]) ((Object) stackIn_151_0);
                    stackIn_152_1 = stackIn_151_1;
                    stackIn_152_2 = nm.field_c;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    stackIn_152_0[stackIn_152_1] = stackIn_152_2;
                    if (!ta.p(3)) {
                        statePc = 161;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if (-1 == (w.field_r ^ -1)) {
                        statePc = 155;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    stackIn_156_0 = 1;
                    statePc = 156;
                    continue stateLoop;
                }
                case 155: {
                    stackIn_156_0 = 0;
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    stackIn_158_0 = stackIn_156_0;
                    stackIn_157_0 = stackIn_158_0;
                    if (ei.field_q.e(-20049)) {
                        statePc = 158;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    stackIn_159_0 = stackIn_157_0;
                    stackIn_159_1 = 1;
                    statePc = 159;
                    continue stateLoop;
                }
                case 158: {
                    stackIn_159_0 = stackIn_158_0;
                    stackIn_159_1 = 0;
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    if (wb.a(stackIn_159_0 != 0, stackIn_159_1 != 0, false, rg.a((byte) -51)) == null) {
                        statePc = 161;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    this.field_s = 9;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    if (!param1) {
                        statePc = 163;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 163: {
                    this.field_t = 0;
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    if (rl.field_c != hh.field_d) {
                        statePc = 167;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if ((this.field_d ^ -1) != -9) {
                        statePc = 167;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    this.field_s = 2;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    if (-2 != (jh.field_ab ^ -1)) {
                        statePc = 252;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if (this.field_s != 10) {
                        statePc = 252;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    db.a(false, 256, pe.field_ab);
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    bm.field_c = 1 - bm.field_c;
                    this.h((byte) 33);
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    if (this.field_d == 4) {
                        statePc = 176;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    bm.field_c = 0;
                    this.h((byte) 33);
                    this.field_s = 2;
                    this.field_j = 1;
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    bm.field_c = 0;
                    this.h((byte) 33);
                    this.field_s = 4;
                    this.field_j = 1;
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    bm.field_c = 1;
                    this.h((byte) 33);
                    this.field_j = 1;
                    if ((this.field_d ^ -1) == -5) {
                        statePc = 181;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    this.field_s = 2;
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    this.field_s = 4;
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    kh.field_ab.a(0);
                    this.field_j = 1;
                    this.field_s = 0;
                    if (-1 > (w.field_r ^ -1)) {
                        statePc = 185;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 185: {
                    if (13 != this.field_d) {
                        statePc = 187;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    stackIn_188_0 = 10;
                    statePc = 188;
                    continue stateLoop;
                }
                case 187: {
                    stackIn_188_0 = rl.field_c;
                    statePc = 188;
                    continue stateLoop;
                }
                case 188: {
                    var4_int = stackIn_188_0;
                    ib.a(bm.field_c, w.field_r, var4_int, 102);
                    this.field_s = 4;
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    if ((this.field_s ^ -1) != -1) {
                        statePc = 190;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if (1 == jh.field_ab) {
                        statePc = 192;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 192: {
                    ja.a((byte) 103, vg.field_h, true);
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    if (param1) {
                        statePc = 195;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 195: {
                    var4_int = 64 * this.field_m / 160;
                    if ((var4_int ^ -1) > -1) {
                        statePc = 197;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 197: {
                    var4_int = 0;
                    statePc = 198;
                    continue stateLoop;
                }
                case 198: {
                    if ((var4_int ^ -1) >= -65) {
                        statePc = 200;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    var4_int = 64;
                    statePc = 200;
                    continue stateLoop;
                }
                case 200: {
                    uh.field_i = var4_int;
                    ed.a(var4_int, (byte) -49);
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (param1) {
                        statePc = 203;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 203: {
                    var4_int = this.field_m * 256 / 160;
                    if (-1 >= (var4_int ^ -1)) {
                        statePc = 205;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    var4_int = 0;
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    if (256 >= var4_int) {
                        statePc = 207;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    var4_int = 256;
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    qg.field_p = var4_int;
                    qi.b(var4_int, (byte) -90);
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    ri.field_o = true;
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    this.field_j = 1;
                    this.field_x = -1;
                    this.field_s = 6;
                    if (!param1) {
                        statePc = 212;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    var3 = -3 % ((45 - param0) / 55);
                    statePc = 253;
                    continue stateLoop;
                }
                case 212: {
                    if (!ta.p(3)) {
                        statePc = 215;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    this.field_t = 1;
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    this.field_t = 0;
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    if (wa.field_q != null) {
                        statePc = 219;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 219: {
                    tb.f((byte) -119);
                    statePc = 220;
                    continue stateLoop;
                }
                case 220: {
                    dc.a(76, bn.c(-1));
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    ue.field_e = 0;
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    ue.field_e = 2;
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    ue.field_e = 1;
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    mn.c((byte) 67);
                    this.field_F = null;
                    wl.field_b = true;
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    if (jh.field_ab != 1) {
                        statePc = 231;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    db.a(true, 256, vg.field_h);
                    statePc = 231;
                    continue stateLoop;
                }
                case 231: {
                    qb.field_k = qb.field_k + w.field_r;
                    w.field_r = 0;
                    var16 = bm.field_b;
                    var13 = var16;
                    var10 = var13;
                    var4 = var10;
                    var5 = 0;
                    statePc = 232;
                    continue stateLoop;
                }
                case 232: {
                    if ((var5 ^ -1) <= -9) {
                        statePc = 236;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    var16[var5] = 0;
                    var5++;
                    if (var7 != 0) {
                        statePc = 237;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (var7 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    var4 = uk.field_c;
                    statePc = 237;
                    continue stateLoop;
                }
                case 237: {
                    var5 = 0;
                    statePc = 238;
                    continue stateLoop;
                }
                case 238: {
                    if ((var5 ^ -1) <= -9) {
                        statePc = 242;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    var4[var5] = 0;
                    var5++;
                    if (var7 != 0) {
                        statePc = 252;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    if (var7 == 0) {
                        statePc = 238;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    this.field_j = 1;
                    gn.field_k[0] = 0;
                    this.field_s = 0;
                    statePc = 252;
                    continue stateLoop;
                }
                case 243: {
                    this.field_j = 1;
                    this.field_s = 17;
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    if ((this.field_d ^ -1) != -7) {
                        statePc = 252;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    if (!this.g((byte) 30)) {
                        statePc = 252;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    jj.field_g = jj.field_g - 500;
                    if (var7 == 0) {
                        statePc = 252;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    if (-7 != (this.field_d ^ -1)) {
                        statePc = 252;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    if (this.c(24834)) {
                        statePc = 251;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 251: {
                    jj.field_g = jj.field_g + 500;
                    statePc = 252;
                    continue stateLoop;
                }
                case 252: {
                    var3 = -3 % ((45 - param0) / 55);
                    statePc = 253;
                    continue stateLoop;
                }
                case 253: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(bd param0, String param1, int param2, String param3, byte param4, bd param5) {
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                break L1;
              } else {
                if (param3 == null) {
                  L2: {
                    var7_int = 100;
                    if (param1 == null) {
                      break L2;
                    } else {
                      param1 = param1.toUpperCase();
                      break L2;
                    }
                  }
                  L3: {
                    var8 = 8;
                    if (param3 != null) {
                      param3 = param3.toUpperCase();
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (param4 == 80) {
                    L4: {
                      if ((var7_int + param2 ^ -1) > (si.field_j ^ -1)) {
                        break L4;
                      } else {
                        if ((si.field_a ^ -1) > (param2 ^ -1)) {
                          break L4;
                        } else {
                          L5: {
                            var9 = 13;
                            if (param0 == null) {
                              break L5;
                            } else {
                              param5.e(-param5.field_w + 112 - param5.field_z / 2, -param5.field_y + param2 - (-64 + param5.field_A / 2));
                              al.field_Z.a(param1, 161 + var8, param2, 143 - var8 * 2, 128, 16776960, -1, 1, 1, var9);
                              param0.e(-param0.field_w + -(param0.field_z / 2) + 367, -param0.field_y + (param2 + (64 - param0.field_A / 2)));
                              al.field_Z.a(param3, var8 + 431, param2, 114 + -(var8 * 2), 128, 16776960, -1, 1, 1, var9);
                              if (var10 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (param5 == null) {
                              break L6;
                            } else {
                              param5.e(112 - param5.field_z / 2 - param5.field_w, -param5.field_y + (param2 - -64 - param5.field_A / 2));
                              al.field_Z.a(param1, var8 + 161, param2, -(var8 * 2) + 384, 128, 16776960, -1, 0, 1, var9);
                              if (var10 == 0) {
                                break L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                          al.field_Z.a(param1, var8 + 64, param2, -(2 * var8) + 481, 128, 16776960, -1, 1, 1, var9);
                          break L4;
                        }
                      }
                    }
                    param2 = param2 + var7_int;
                    stackIn_24_0 = param2;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackIn_13_0 = 15;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            param2 = this.a((bd) null, param1, param2, (String) null, (byte) 80, param5);
            param2 = this.a((bd) null, param3, param2, (String) null, (byte) 80, param0);
            stackIn_5_0 = param2;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var7);

            stackIn_27_1 = new StringBuilder().append("re.O(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L7;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L10;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L10;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_28_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_24_0;
          }
        }
    }

    private final void b(byte param0) {
        if (param0 > -119) {
            this.c((byte) -6);
        }
    }

    final static boolean c(byte param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_10_0 = 0;
            int stackIn_12_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            if ((param1 ^ -1) < (sc.field_g.field_i ^ -1)) {
              if (null == ag.field_t) {
                return false;
              } else {
                try {
                  L0: {
                    var2_int = ag.field_t.b((byte) 120);
                    if (var2_int <= 0) {
                      L1: {
                        L2: {
                          if (0 > var2_int) {
                            break L2;
                          } else {
                            if (m.a(true) <= 30000L) {
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                        le.c((byte) 56);
                        break L1;
                      }
                      if (param0 == 33) {
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        field_r = (ub) null;
                        return false;
                      }
                    } else {
                      L3: {
                        if ((var2_int ^ -1) >= (param1 - sc.field_g.field_i ^ -1)) {
                          break L3;
                        } else {
                          var2_int = -sc.field_g.field_i + param1;
                          break L3;
                        }
                      }
                      ag.field_t.a(-1, sc.field_g.field_n, sc.field_g.field_i, var2_int);
                      bb.field_c = hn.a((byte) 80);
                      sc.field_g.field_i = sc.field_g.field_i + var2_int;
                      if (sc.field_g.field_i >= param1) {
                        sc.field_g.field_i = 0;
                        stackIn_12_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        stackIn_10_0 = 0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = (IOException) (Object) decompiledCaughtException;
                    le.c((byte) 86);
                    decompiledRegionSelector0 = 2;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_10_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    return stackIn_12_0 != 0;
                  } else {
                    return false;
                  }
                }
              }
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void c(int param0, int param1) {
        le dupTemp$0 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_15_0 = 0;
        boolean stackIn_18_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_42_0 = 0;
        boolean stackIn_45_0 = false;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        boolean stackOut_17_0;
        boolean stackOut_44_0;
        int statePc = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = HostileSpawn.field_I ? 1 : 0;
                    this.field_E.a(true, true);
                    this.field_E.a((byte) -121, ll.field_c * 50, 30, true);
                    if (pf.field_o != 1) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (!this.field_E.field_S) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (j.field_c < -30 + this.field_E.field_qb + this.field_E.field_K) {
                        statePc = 30;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var3 = li.field_s;
                    li.field_s = -1;
                    if (!ib.a((byte) -72)) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackIn_7_0 = 2;
                    statePc = 7;
                    continue stateLoop;
                }
                case 6: {
                    stackIn_7_0 = 1;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var4 = stackIn_7_0;
                    var5 = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    stackIn_9_0 = var5;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (stackIn_9_0 >= var4) {
                        statePc = 24;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_25_0 = -11;
                    stackIn_11_0 = stackIn_25_0;
                    stackIn_25_1 = gn.field_k[var5] ^ -1;
                    stackIn_11_1 = stackIn_25_1;
                    if (var9 != 0) {
                        statePc = 25;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (stackIn_11_0 != stackIn_11_1) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (this.field_w[var5][10] == null) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = 11;
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = 10;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var6 = stackIn_15_0;
                    var7 = 0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var6 <= var7) {
                        statePc = 23;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackOut_17_0 = this.field_w[var5][var7].field_S;
                    stackIn_9_0 = stackOut_17_0 ? 1 : 0;
                    stackIn_18_0 = stackOut_17_0;
                    if (var9 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (!stackIn_18_0) {
                        statePc = 22;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (0 != (this.field_w[var5][var7].field_v ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 21: {
                    li.field_s = var7;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var7++;
                    if (var9 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var5++;
                    if (var9 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = -1;
                    stackIn_25_1 = li.field_s ^ -1;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (stackIn_25_0 < stackIn_25_1) {
                        statePc = 29;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var3 != li.field_s) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    eh.field_c.a(lm.field_A[3], 100, uh.field_i);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (var9 == 0) {
                        statePc = 70;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var3 = rl.field_c;
                    var4 = bm.field_c;
                    if (!ib.a((byte) -72)) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    stackIn_33_0 = 2;
                    statePc = 33;
                    continue stateLoop;
                }
                case 32: {
                    stackIn_33_0 = 1;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    var5 = stackIn_33_0;
                    rl.field_c = -1;
                    var6 = 0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = var5;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (stackIn_35_0 <= var6) {
                        statePc = 63;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_64_0 = -11;
                    stackIn_37_0 = stackIn_64_0;
                    stackIn_64_1 = gn.field_k[var6] ^ -1;
                    stackIn_37_1 = stackIn_64_1;
                    if (var9 != 0) {
                        statePc = 64;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (stackIn_37_0 != stackIn_37_1) {
                        statePc = 40;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (this.field_w[var6][10] != null) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackIn_42_0 = 10;
                    statePc = 42;
                    continue stateLoop;
                }
                case 41: {
                    stackIn_42_0 = 11;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var7 = stackIn_42_0;
                    var8 = 0;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (var8 >= var7) {
                        statePc = 62;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackOut_44_0 = this.field_w[var6][var8].field_S;
                    stackIn_35_0 = stackOut_44_0 ? 1 : 0;
                    stackIn_45_0 = stackOut_44_0;
                    if (var9 != 0) {
                        statePc = 35;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (stackIn_45_0) {
                        statePc = 56;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    this.field_w[var6][var8].field_nb = null;
                    if ((var8 ^ -1) < (gn.field_k[var6] ^ -1)) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    this.field_w[var6][var8].field_Y = en.field_y;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    this.field_w[var6][var8].field_T = 8421376;
                    if ((var8 ^ -1) == -11) {
                        statePc = 50;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 50: {
                    dupTemp$0 = this.field_w[var6][var8];
                    dupTemp$0.field_T = dupTemp$0.field_T & 16742263;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (!ta.p(param1 + 10102)) {
                        statePc = 61;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (pf.field_o != 1) {
                        statePc = 61;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (this.field_w[var6][var8].field_Eb) {
                        statePc = 55;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 55: {
                    ul.field_O = true;
                    if (var9 == 0) {
                        statePc = 61;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    bm.field_c = var6;
                    this.field_w[var6][var8].field_nb = fm.field_a;
                    this.field_w[var6][var8].field_Y = en.field_t;
                    this.field_w[var6][var8].field_T = 65793;
                    if (-11 != (var8 ^ -1)) {
                        statePc = 59;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    rl.field_c = fg.field_c[var6];
                    om.field_b = true;
                    if (var9 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    om.field_b = false;
                    rl.field_c = var8;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    hh.field_d = rl.field_c;
                    kh.field_ab.a(0);
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    var8++;
                    if (var9 == 0) {
                        statePc = 43;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var6++;
                    if (var9 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    stackIn_64_0 = var3 ^ -1;
                    stackIn_64_1 = rl.field_c ^ -1;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if (stackIn_64_0 != stackIn_64_1) {
                        statePc = 67;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (bm.field_c == var4) {
                        statePc = 70;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (-1 >= (rl.field_c ^ -1)) {
                        statePc = 69;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 69: {
                    this.i(104);
                    eh.field_c.a(lm.field_A[4], 100, uh.field_i);
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    if (0 <= rl.field_c) {
                        statePc = 72;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 72: {
                    this.field_G.a(true, true);
                    this.field_G.a((byte) -115, ll.field_c * 50, 30, true);
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    if (param1 == -10099) {
                        statePc = 75;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    field_B = (String) null;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, byte param2, int param3, int param4) {
        boolean[] stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        boolean[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        boolean stackIn_12_0 = false;
        String stackIn_35_0 = null;
        int stackIn_43_0 = 0;
        boolean[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        boolean[] stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        boolean stackOut_11_0;
        int statePc = 0;
        int var6 = 0;
        int var7 = 0;
        boolean[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var10_ref_String = null;
        int var11_int = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var15 = null;
        String var16 = null;
        boolean[] var17 = null;
        boolean[] var18 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = HostileSpawn.field_I ? 1 : 0;
                    wh.field_d.c(mb.field_k.toUpperCase(), 10 + param3, 22 + param1, 16776960, -1);
                    var6 = 8 + param3;
                    var7 = param1 - -30;
                    var18 = new boolean[kh.field_ib.length];
                    var17 = var18;
                    var8 = var17;
                    var9 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((var9 ^ -1) <= (kh.field_ib.length ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackIn_86_0 = (boolean[]) (var8);
                    stackIn_3_0 = stackIn_86_0;
                    stackIn_86_1 = var9;
                    stackIn_3_1 = stackIn_86_1;
                    if (var14 != 0) {
                        statePc = 86;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackIn_5_0 = (boolean[]) ((Object) stackIn_3_0);
                    stackIn_4_0 = stackIn_5_0;
                    stackIn_5_1 = stackIn_3_1;
                    stackIn_4_1 = stackIn_5_1;
                    if (kh.field_ib[var9] <= 0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackIn_6_0 = (boolean[]) ((Object) stackIn_4_0);
                    stackIn_6_1 = stackIn_4_1;
                    stackIn_6_2 = 1;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    stackIn_6_0 = (boolean[]) ((Object) stackIn_5_0);
                    stackIn_6_1 = stackIn_5_1;
                    stackIn_6_2 = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    stackIn_6_0[stackIn_6_1] = stackIn_6_2 != 0;
                    var9++;
                    if (var14 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (param2 == 56) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    var9 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (-9 >= (var9 ^ -1)) {
                        statePc = 42;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackOut_11_0 = kh.field_Q[var9];
                    stackIn_43_0 = stackOut_11_0 ? 1 : 0;
                    stackIn_12_0 = stackOut_11_0;
                    if (var14 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (stackIn_12_0) {
                        statePc = 14;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 14: {
                    dn.a(-4 + var6, param2 + -169, var9, var7 - 10, 16772608);
                    if ((var9 ^ -1) == -1) {
                        statePc = 29;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var10 = kh.field_ib[an.field_r[var9]];
                    var8[an.field_r[var9]] = false;
                    var11_int = var9;
                    if (-4 != (var11_int ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var14 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if ((var11_int ^ -1) != -5) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var14 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (-3 == (var11_int ^ -1)) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var10 = var10 / 50;
                    if (var14 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var10 = var10 / 5;
                    if (var14 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var10 = var10 / 10;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (var10 >= 0) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var10 = 0;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    al.field_Z.b(Integer.toString(var10), var6 - -16, var7 + 38, 16776960, -1);
                    if (var14 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    of.field_e.a(pc.field_b.charAt(0), var6 + 10, var7 + 27, 16776960);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (ka.a(var7, 0, 40, 40, var6)) {
                        statePc = 32;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (0 == var9) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_35_0 = rf.field_s[var9 - 1];
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = gi.field_m;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    var15 = stackIn_35_0;
                    var10_ref_String = var15;
                    var16 = var15.toUpperCase();
                    var11_int = al.field_Z.a(var16);
                    var12 = var6 + 16;
                    if (-641 >= (var12 + var11_int / 2 ^ -1)) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var12 = var12 - var11_int / 2;
                    if (var14 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var12 = -var11_int + 639;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    al.field_Z.c(var16.toUpperCase(), var12, 6 + var7, 16777215, -1);
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    var6 += 58;
                    if (-551 < (var6 ^ -1)) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var7 += 58;
                    var6 = param3 + 8;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    var18 = var17;
                    var9++;
                    if (var14 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var18 = var17;
                    stackIn_43_0 = 0;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    var18 = var17;
                    var9 = stackIn_43_0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if ((var9 ^ -1) <= (var18.length ^ -1)) {
                        statePc = 63;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (var14 != 0) {
                        statePc = 63;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    stackIn_47_0 = (boolean[]) (var8);
                    stackIn_47_1 = var9;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (stackIn_47_0[stackIn_47_1]) {
                        statePc = 49;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 49: {
                    s.a(var9, 65792, var7, var6);
                    var10 = kh.field_ib[var9];
                    if (0 <= var10) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var10 = 0;
                    if (var14 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (1 == var9) {
                        statePc = 53;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var10 = var10 / 50;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    al.field_Z.b(Integer.toString(var10), var6 + 16, 38 + var7, 16776960, -1);
                    if (!ka.a(var7, 0, 40, 40, var6)) {
                        statePc = 59;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var11 = lg.field_n[var9].toUpperCase();
                    var12 = al.field_Z.a(var11);
                    var13 = 16 + var6;
                    if (var12 / 2 + var13 < 640) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var13 = 639 + -var12;
                    if (var14 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var13 = var13 - var12 / 2;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    al.field_Z.c(var11.toUpperCase(), var13, var7 + 6, 16777215, -1);
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    var6 += 58;
                    if (550 > var6) {
                        statePc = 61;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var6 = param3 + 8;
                    var7 += 58;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    var9++;
                    if (var14 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    return;
                }
                case 65: {
                    var10 = 0;
                    if (var14 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var13 = 639 + -var12;
                    if (var14 == 0) {
                        statePc = 70;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 70: {
                    al.field_Z.c(var11.toUpperCase(), var13, var7 + 6, 16777215, -1);
                    statePc = 77;
                    continue stateLoop;
                }
                case 71: {
                    var13 = var13 - var12 / 2;
                    statePc = 70;
                    continue stateLoop;
                }
                case 72: {
                    var11 = lg.field_n[var9].toUpperCase();
                    var12 = al.field_Z.a(var11);
                    var13 = 16 + var6;
                    if (var12 / 2 + var13 < 640) {
                        statePc = 71;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var6 = param3 + 8;
                    var7 += 58;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    var9++;
                    if (var14 == 0) {
                        statePc = 91;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var6 += 58;
                    if (550 > var6) {
                        statePc = 75;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 79: {
                    al.field_Z.b(Integer.toString(var10), var6 + 16, 38 + var7, 16776960, -1);
                    if (!ka.a(var7, 0, 40, 40, var6)) {
                        statePc = 77;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var10 = var10 / 50;
                    statePc = 79;
                    continue stateLoop;
                }
                case 82: {
                    if (1 == var9) {
                        statePc = 81;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 84: {
                    s.a(var9, 65792, var7, var6);
                    var10 = kh.field_ib[var9];
                    if (0 <= var10) {
                        statePc = 82;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (stackIn_86_0[stackIn_86_1]) {
                        statePc = 84;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 88: {
                    stackIn_86_0 = (boolean[]) (var8);
                    stackIn_86_1 = var9;
                    statePc = 86;
                    continue stateLoop;
                }
                case 89: {
                    if (var14 != 0) {
                        statePc = 63;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if ((var9 ^ -1) <= (var18.length ^ -1)) {
                        statePc = 63;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param0 != 89) {
            field_q = (bd) null;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        if (param3 == -18) {
          L0: {
            L1: {
              var6 = this.field_e;
              if (this.field_s == 17) {
                break L1;
              } else {
                if ((this.field_d ^ -1) == -18) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            var6 = 256;
            break L0;
          }
          gn.a(param1, param4, param2, var6, param0, (byte) 74);
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, byte param1) {
        int var3;
        int var4;
        String var5;
        String var6_ref_String;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        String var11;
        String var12;
        String var13;
        String var14;
        L0: {
          u.field_f[26] = jf.field_e;
          mk.field_L.b(tc.field_d, 320, 95, 16777215, -1);
          var3 = 0;
          var4 = wl.b(25685);
          var11 = vg.a(new String[]{Integer.toString(var4)}, 88, bi.field_f);
          var12 = var11;
          var5 = var12;
          var5 = var11;
          var5 = var11;
          var12 = var5;
          var5 = var12;
          if (param1 >= 98) {
            break L0;
          } else {
            this.a(-98, false);
            break L0;
          }
        }
        L1: {
          var3 = rl.field_c + -hh.field_d;
          if (0 >= w.field_r) {
            break L1;
          } else {
            L2: {
              if (rl.field_c <= hh.field_d) {
                break L2;
              } else {
                var12 = var11 + "<br>" + vg.a(new String[]{Integer.toString(-hh.field_d + rl.field_c)}, 77, vc.field_f);
                var14 = var12;
                var5 = var14;
                var5 = var12;
                var3 = ad.field_a / 50;
                var13 = var12 + "<br>" + c.field_d + jh.a((byte) -80, var3);
                var14 = var13;
                var5 = var14;
                var5 = var13;
                var3 = ub.field_a[bm.field_c][rl.field_c - 1];
                var5 = var13 + "<br>" + ki.field_d + jh.a((byte) -67, var3);
                var14 = var5;
                var5 = var14;
                if (!HostileSpawn.field_I) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            var3 = ad.field_a / 50;
            var14 = var5 + "<br>" + c.field_d + jh.a((byte) -61, var3);
            var5 = var14;
            var5 = var14;
            var3 = ub.field_a[bm.field_c][rl.field_c - 1];
            var5 = var14 + "<br>" + ki.field_d + jh.a((byte) -73, var3);
            break L1;
          }
        }
        L3: {
          if (-1 <= (w.field_r ^ -1)) {
            break L3;
          } else {
            var5 = var5 + "<br>" + vg.a(new String[]{Integer.toString(w.field_r)}, 99, hj.field_s);
            break L3;
          }
        }
        L4: {
          if (50 <= sg.field_i) {
            var6_ref_String = sg.d(24);
            var5 = var6_ref_String;
            var5 = var6_ref_String;
            if (var6_ref_String == null) {
              break L4;
            } else {
              var5 = var5 + "<br>" + vg.a(new String[]{var6_ref_String}, 120, ag.field_j);
              break L4;
            }
          } else {
            break L4;
          }
        }
        var6 = 25;
        var7 = 250;
        var8 = (640 - var7) / 2;
        var9 = 130;
        var10 = 180;
        this.a(var10 + 16, (byte) -55, -8 + var9, -8 + var8, 16 + var7);
        wh.field_d.a(var5.toUpperCase(), var8, var9, var7, var10, 16776960, -1, 1, 1, var6);
        this.e(16777215, 340);
    }

    private final void j(int param0) {
        int var2 = -113 % ((71 - param0) / 52);
        hm.a(8, ul.field_J, false, 330, 76, 316);
        hm.a(576, ul.field_J, false, 47, 32, 32);
        this.a((byte) -29, il.field_e);
        hm.a(576, ul.field_J, false, 46, 362, 32);
        this.a((byte) 50, 39, hn.field_e, 80);
        this.a((byte) 50, 325, ec.field_c, 80);
    }

    private final void h(byte param0) {
        le stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        le stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        le stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_24_0 = 0;
        le stackIn_25_0 = null;
        le stackIn_26_0 = null;
        le stackIn_27_0 = null;
        String stackIn_27_1 = null;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        le stackIn_32_0 = null;
        le stackIn_33_0 = null;
        le stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int statePc = 0;
        le var3 = null;
        int var4_int = 0;
        le var4 = null;
        le var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        le var12_ref_le = null;
        int var12 = 0;
        le var13 = null;
        int var14 = 0;
        le var15 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = HostileSpawn.field_I ? 1 : 0;
                    this.a(false);
                    rl.field_c = -1;
                    var4_int = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (2 <= var4_int) {
                        statePc = 6;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (-11 == (gn.field_k[var4_int] ^ -1)) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    ln.field_b[var4_int] = true;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var4_int++;
                    if (var14 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var15 = new le(0L, (le) null);
                    var3 = new le(0L, (le) null);
                    this.field_E = new th(0L, var15, var3, this.field_z);
                    var4 = this.field_E.field_Kb;
                    var4.field_qb = 234;
                    var4.field_sb = 270;
                    var5 = this.field_E.field_Ib;
                    var5.field_qb = var4.field_qb;
                    var5.field_I = null;
                    var6 = 0;
                    var7 = 3;
                    var8 = 10;
                    if (-11 == (gn.field_k[0] ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var8++;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var9 = 1;
                    if (ib.a((byte) -72)) {
                        statePc = 11;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var9 = 2;
                    var8 += 10;
                    if (gn.field_k[1] == 10) {
                        statePc = 13;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var8++;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = (le) (var5);
                    stackIn_15_0 = stackIn_16_0;
                    stackIn_16_1 = var8 * 25;
                    stackIn_15_1 = stackIn_16_1;
                    if (ib.a((byte) -72)) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_17_0 = (le) ((Object) stackIn_15_0);
                    stackIn_17_1 = stackIn_15_1;
                    stackIn_17_2 = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = (le) ((Object) stackIn_16_0);
                    stackIn_17_1 = stackIn_16_1;
                    stackIn_17_2 = 10;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_17_0.field_sb = stackIn_17_1 + stackIn_17_2;
                    rl.field_c = -1;
                    var10 = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = var10 ^ -1;
                    stackIn_19_1 = var9 ^ -1;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (stackIn_19_0 <= stackIn_19_1) {
                        statePc = 41;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (var14 != 0) {
                        statePc = 42;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (-11 == (gn.field_k[var10] ^ -1)) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_24_0 = 10;
                    statePc = 24;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = 11;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var11 = stackIn_24_0;
                    var12_ref_le = new le(-1L, (le) null);
                    var12_ref_le.field_L = 22;
                    var12_ref_le.field_R = 20;
                    var12_ref_le.field_G = 2;
                    var12_ref_le.field_ab = (vm) ((Object) wh.field_d);
                    stackIn_26_0 = (le) (var12_ref_le);
                    stackIn_25_0 = stackIn_26_0;
                    if ((var10 ^ -1) == -1) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = (le) ((Object) stackIn_25_0);
                    stackIn_27_1 = og.field_e;
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = (le) ((Object) stackIn_26_0);
                    stackIn_27_1 = c.field_b;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_27_0.field_fb = ((String) (Object) stackIn_27_1).toUpperCase();
                    var12_ref_le.field_jb = false;
                    var12_ref_le.field_zb = var7 + var10 * 4;
                    var12_ref_le.field_sb = 20;
                    var12_ref_le.field_nb = qc.field_x;
                    var12_ref_le.field_tb = var6;
                    var12_ref_le.field_qb = var4.field_qb + -20;
                    var12_ref_le.field_T = 0;
                    var5.a(false, var12_ref_le);
                    var7 = var7 + (2 + (var12_ref_le.field_sb + 4 * var10));
                    var12 = 0;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (var12 >= var11) {
                        statePc = 40;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var13 = new le((long)var12, (le) null);
                    var13.field_G = 2;
                    var13.field_J = 4;
                    var13.field_R = 20;
                    var13.field_L = 18;
                    var13.field_ab = (vm) ((Object) wh.field_d);
                    stackIn_19_0 = var12 ^ -1;
                    stackIn_30_0 = stackIn_19_0;
                    stackIn_19_1 = -11;
                    stackIn_30_1 = stackIn_19_1;
                    if (var14 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (stackIn_30_0 <= stackIn_30_1) {
                        statePc = 35;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var13.field_fb = kh.field_fb[var10][var12].toUpperCase();
                    stackIn_33_0 = (le) (var13);
                    stackIn_32_0 = stackIn_33_0;
                    if ((gn.field_k[var10] ^ -1) > (var12 ^ -1)) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackIn_34_0 = (le) ((Object) stackIn_32_0);
                    stackIn_34_1 = 1;
                    statePc = 34;
                    continue stateLoop;
                }
                case 33: {
                    stackIn_34_0 = (le) ((Object) stackIn_33_0);
                    stackIn_34_1 = 0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_34_0.field_jb = stackIn_34_1 != 0;
                    var13.field_T = 8421376;
                    if (var14 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var13.field_fb = nj.field_e.toUpperCase();
                    var13.field_T = 8388608;
                    var13.field_jb = true;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    var13.field_zb = var7;
                    if (!var13.field_jb) {
                        statePc = 39;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var13.field_v = 16776960;
                    var13.field_pb = en.field_q;
                    var13.field_Y = en.field_y;
                    if (var12 != 10) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var13.field_v = 16742144;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    var13.field_tb = var6;
                    var13.field_sb = 20;
                    var13.field_qb = -20 + var4.field_qb;
                    var5.a(false, var13);
                    var7 = var7 + (var13.field_sb - -2);
                    var5.field_sb = var7;
                    this.field_w[var10][var12] = var13;
                    var12++;
                    if (var14 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var10++;
                    if (var14 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    o.field_n.b((byte) 107);
                    this.field_E.field_tb = 64;
                    this.field_E.field_qb = var4.field_qb - -10;
                    this.field_E.field_zb = 80;
                    this.field_E.field_sb = 290;
                    this.field_E.a(16, 0, param0);
                    this.field_E.a((byte) -124, 0, 30, true);
                    this.field_E.a(true, true);
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void i(byte param0) {
        int var3;
        L0: {
          L1: {
            var3 = HostileSpawn.field_I ? 1 : 0;
            if (this.field_d == 16) {
              break L1;
            } else {
              L2: {
                if (-7 != (this.field_d ^ -1)) {
                  break L2;
                } else {
                  if (-4 == (this.field_C.field_b ^ -1)) {
                    if (-1 > (this.field_t ^ -1)) {
                      break L0;
                    } else {
                      L3: {
                        if (!this.g((byte) 30)) {
                          break L3;
                        } else {
                          this.field_t = 2;
                          if (var3 == 0) {
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.field_t = 1;
                      if (var3 == 0) {
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    break L0;
                  }
                }
              }
              L4: {
                if ((this.field_d ^ -1) != -5) {
                  break L4;
                } else {
                  if (this.field_C.field_b == 5) {
                    this.field_t = 4;
                    if (var3 == 0) {
                      break L0;
                    } else {
                      break L4;
                    }
                  } else {
                    break L0;
                  }
                }
              }
              L5: {
                if (2 != this.field_d) {
                  break L5;
                } else {
                  if (-1 >= (this.a((byte) -119) ^ -1)) {
                    break L5;
                  } else {
                    this.field_t = 1;
                    if (var3 == 0) {
                      break L0;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              this.field_t = this.field_t - 1;
              if (this.field_t >= 0) {
                break L0;
              } else {
                this.field_t = -1 + this.field_C.field_b;
                if (var3 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          if (this.field_t == 2) {
            this.field_t = 0;
            break L0;
          } else {
            break L0;
          }
        }
        L6: {
          if (param0 <= -96) {
            break L6;
          } else {
            this.field_o = -96;
            break L6;
          }
        }
    }

    private final int b(byte param0, int param1) {
        int var3;
        int var4;
        L0: {
          var3 = param1;
          var4 = si.field_a;
          this.a(320, (byte) -55, 78, 60, 481);
          if (null != this.field_h) {
            this.a(10 + this.field_h.field_sb, (byte) -55, -5 + this.field_h.field_mb, this.field_h.field_K + -5, 10 + this.field_h.field_qb);
            si.f(32, 83, 605, 393);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          L2: {
            var3 += 81;
            var3 = this.a(bj.field_g, 82, var3);
            if (hk.field_q) {
              break L2;
            } else {
              var3 = this.a(il.field_c[1], df.field_b, var3, df.field_e, (byte) 80, il.field_c[0]);
              if (!HostileSpawn.field_I) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          var3 = this.a(il.field_c[0], df.field_b, var3, df.field_e, (byte) 80, il.field_c[1]);
          break L1;
        }
        L3: {
          var3 = this.a(pl.field_f, wl.field_a, var3, rl.field_a, (byte) 80, qi.field_H);
          if (param0 == 82) {
            break L3;
          } else {
            this.field_o = 34;
            break L3;
          }
        }
        L4: {
          var3 = this.a(il.field_c[4], field_I, var3, tk.field_f, (byte) 80, il.field_c[3]);
          var3 = this.a(il.field_c[6], u.field_c, var3, of.field_b, (byte) 80, il.field_c[5]);
          var3 = this.a(jf.field_f, param0 + 8, var3);
          var3 = this.a((bd) null, al.field_S, var3, (String) null, (byte) 80, il.field_c[7]);
          var3 = this.a(il.field_c[10], g.field_K, var3, ln.field_p, (byte) 80, il.field_c[8]);
          var3 = this.a((bd) null, kb.field_a, var3, (String) null, (byte) 80, il.field_c[9]);
          var3 = this.a((bd) null, eh.field_h, var3, (String) null, (byte) 80, km.field_A[0]);
          var3 = this.a((bd) null, ga.field_c, var3, (String) null, (byte) 80, pi.field_b);
          var3 = this.a(mb.field_k, param0 ^ 58, var3);
          var3 = this.a((bd) null, w.field_A, var3, (String) null, (byte) 80, this.e((byte) -44, 0));
          var3 = this.a((bd) null, uj.field_q, var3, (String) null, (byte) 80, this.e((byte) -44, 1));
          var3 = this.a((bd) null, h.field_f, var3, (String) null, (byte) 80, this.e((byte) -44, 2));
          var3 = this.a((bd) null, tk.field_b, var3, (String) null, (byte) 80, this.e((byte) -44, 3));
          var3 = this.a((bd) null, vb.field_Hb, var3, (String) null, (byte) 80, this.e((byte) -44, 4));
          var3 = this.a((bd) null, di.field_c, var3, (String) null, (byte) 80, this.e((byte) -44, 5));
          var3 = this.a((bd) null, m.field_r, var3, (String) null, (byte) 80, this.e((byte) -44, 6));
          var3 = this.a((bd) null, od.field_C, var3, (String) null, (byte) 80, this.e((byte) -44, 7));
          var3 = this.a(al.field_O, 87, var3);
          var3 = this.a((bd) null, od.field_B, var3, (String) null, (byte) 80, wk.field_b[1]);
          var3 = this.a((bd) null, mf.field_a, var3, (String) null, (byte) 80, wk.field_b[3]);
          var3 = this.a((bd) null, ha.field_x, var3, (String) null, (byte) 80, wk.field_b[11]);
          si.d(0, 0, 640, var4);
          if (null != this.field_h) {
            this.field_h.a(param0 + -177, false);
            break L4;
          } else {
            break L4;
          }
        }
        si.c();
        return var3 + -param1 - 94;
    }

    public static void a(int param0) {
        field_i = null;
        field_B = null;
        field_I = null;
        field_q = null;
        field_D = (bd[][]) null;
        field_n = null;
        field_A = null;
        field_r = null;
        int var1 = -29 / ((param0 - -75) / 39);
    }

    private final void d(int param0, int param1, int param2) {
        int stackIn_80_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_118_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_195_1 = 0;
        int stackIn_217_0 = 0;
        int stackIn_294_0 = 0;
        int stackIn_310_0 = 0;
        int stackIn_310_1 = 0;
        int statePc = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12_int = 0;
        nc var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = HostileSpawn.field_I ? 1 : 0;
                    if (0 == li.field_p) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    li.field_p = Math.max(wh.field_d.a(na.field_q.toUpperCase()), mk.field_L.a(wc.field_s.toUpperCase()));
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (param0 == this.field_d) {
                        statePc = 5;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var4 = param0;
                    if (var4 != 10) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var19 == 0) {
                        statePc = 47;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var4 != 9) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var19 == 0) {
                        statePc = 47;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (12 != var4) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var19 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (-15 == (var4 ^ -1)) {
                        statePc = 49;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var4 != 15) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var19 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (-12 != (var4 ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var19 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if ((var4 ^ -1) == -14) {
                        statePc = 53;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (-4 != (var4 ^ -1)) {
                        statePc = 25;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var19 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var4 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (17 == var4) {
                        statePc = 58;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (var4 != 5) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (var19 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (var4 != 4) {
                        statePc = 33;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (var19 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (-3 == (var4 ^ -1)) {
                        statePc = 64;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (-9 != (var4 ^ -1)) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (var19 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (6 != var4) {
                        statePc = 40;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (var19 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (-2 == (var4 ^ -1)) {
                        statePc = 70;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (-8 != (var4 ^ -1)) {
                        statePc = 44;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (var19 == 0) {
                        statePc = 70;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (var4 != 16) {
                        statePc = 73;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (var19 == 0) {
                        statePc = 72;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    this.c(-50, param0, param1);
                    if (var19 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    this.f(117, param1);
                    if (var19 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    this.a(param1, (byte) 126);
                    if (var19 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    this.f(114, param1);
                    if (var19 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (dh.field_a != null) {
                        statePc = 57;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 57: {
                    dh.field_a.a((byte) -67);
                    if (var19 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    this.d(-112, param1);
                    if (var19 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    this.g(152, 7 + param1);
                    if (var19 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    this.c(false);
                    if (var19 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    this.d((byte) 28, param1);
                    if (var19 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    this.j((byte) 84);
                    if (var19 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    this.a(param1, true);
                    if (var19 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    this.a((byte) -109, il.field_d.toUpperCase());
                    this.field_g = this.b((byte) 82, -this.field_v);
                    if (var19 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    this.j(18);
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    if (this.field_C == null) {
                        statePc = 75;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 75: {
                    wh.field_d.b("ERROR! 0", 320, 240, 2158368, -1);
                    return;
                }
                case 76: {
                    if ((this.field_d ^ -1) != -1) {
                        statePc = 79;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if ((dd.field_o[this.field_d].length ^ -1) != -10) {
                        statePc = 79;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    stackIn_80_0 = 1;
                    statePc = 80;
                    continue stateLoop;
                }
                case 79: {
                    stackIn_80_0 = 0;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    var4 = stackIn_80_0;
                    var5 = param1 - 1;
                    stackIn_82_0 = var5;
                    stackIn_81_0 = stackIn_82_0;
                    if (var4 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    stackIn_83_0 = stackIn_81_0;
                    stackIn_83_1 = 37;
                    statePc = 83;
                    continue stateLoop;
                }
                case 82: {
                    stackIn_83_0 = stackIn_82_0;
                    stackIn_83_1 = 42;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    var5 = stackIn_83_0 + stackIn_83_1;
                    var6 = 555;
                    var7 = this.field_t;
                    if (!this.field_K) {
                        statePc = 85;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 85: {
                    this.field_t = -1;
                    this.field_f = -1;
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    if (param0 != 16) {
                        statePc = 115;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    var8 = 0;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    if (dd.field_o[param0].length <= var8) {
                        statePc = 114;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var9 = dd.field_o[param0][var8];
                    var10 = 16776960;
                    var11_ref_String = u.field_f[var9];
                    stackIn_310_0 = param0 ^ -1;
                    stackIn_90_0 = stackIn_310_0;
                    stackIn_310_1 = this.field_d ^ -1;
                    stackIn_90_1 = stackIn_310_1;
                    if (var19 != 0) {
                        statePc = 310;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (stackIn_90_0 != stackIn_90_1) {
                        statePc = 104;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (!jk.a(-23322)) {
                        statePc = 93;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (this.field_K) {
                        statePc = 100;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if ((e.field_c[var8] ^ -1) <= (j.field_c ^ -1)) {
                        statePc = 100;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (e.field_c[var8] - -pk.field_e[var8] <= j.field_c) {
                        statePc = 100;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if ((rb.field_m ^ -1) >= (sj.field_h[var8] ^ -1)) {
                        statePc = 100;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if ((rb.field_m ^ -1) > (sj.field_h[var8] + 30 ^ -1)) {
                        statePc = 99;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 99: {
                    this.field_u = true;
                    this.field_t = var8;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    if ((this.field_t ^ -1) != (var8 ^ -1)) {
                        statePc = 104;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (0 == this.field_j) {
                        statePc = 103;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 103: {
                    var10 = 65793;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    if (var11_ref_String != null) {
                        statePc = 106;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    var11_ref_String = "ERROR! TEXT NOT FOUND (" + var9 + ")";
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    if (-65794 != (var10 ^ -1)) {
                        statePc = 110;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (this.field_e < 256) {
                        statePc = 109;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 109: {
                    var10 = 16776960;
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    if (var10 != 65793) {
                        statePc = 113;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if (this.field_j != 0) {
                        statePc = 113;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    si.c(e.field_c[var8], sj.field_h[var8], pk.field_e[var8], 30, 16776960);
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    wh.field_d.a(var11_ref_String.toUpperCase(), e.field_c[var8], sj.field_h[var8], pk.field_e[var8], 30, var10, -1, this.field_e, 1, 1, wh.field_d.field_u);
                    var8++;
                    if (var19 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (var19 == 0) {
                        statePc = 309;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    if (var4 == 0) {
                        statePc = 117;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    stackIn_118_0 = 26;
                    statePc = 118;
                    continue stateLoop;
                }
                case 117: {
                    stackIn_118_0 = 30;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    var8 = stackIn_118_0;
                    var9 = 64;
                    var10 = 1;
                    var11 = 0;
                    var12_int = param0;
                    if (-1 == (var12_int ^ -1)) {
                        statePc = 150;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if (17 == var12_int) {
                        statePc = 150;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (var12_int != 4) {
                        statePc = 123;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if (var19 == 0) {
                        statePc = 161;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    if (6 == var12_int) {
                        statePc = 165;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if ((var12_int ^ -1) == -11) {
                        statePc = 166;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if (-2 != (var12_int ^ -1)) {
                        statePc = 128;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    if (var19 == 0) {
                        statePc = 167;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if (var12_int != 7) {
                        statePc = 131;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if (var19 == 0) {
                        statePc = 167;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if (-14 != (var12_int ^ -1)) {
                        statePc = 134;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if (var19 == 0) {
                        statePc = 168;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if (var12_int == 14) {
                        statePc = 168;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (-13 != (var12_int ^ -1)) {
                        statePc = 138;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    if (var19 == 0) {
                        statePc = 168;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    if (-16 != (var12_int ^ -1)) {
                        statePc = 141;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (var19 == 0) {
                        statePc = 168;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    if (-12 != (var12_int ^ -1)) {
                        statePc = 144;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (var19 == 0) {
                        statePc = 175;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if (5 != var12_int) {
                        statePc = 147;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (var19 == 0) {
                        statePc = 176;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if (var12_int == 2) {
                        statePc = 182;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    if ((var12_int ^ -1) == -9) {
                        statePc = 183;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 150: {
                    var8 = 30;
                    var9 = 312;
                    var5 = 140 - (-var8 - 10);
                    if (param0 != 0) {
                        statePc = 154;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if (!ib.a((byte) -72)) {
                        statePc = 153;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 153: {
                    var8 = 26;
                    var5 -= 4;
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    if (-18 == (param0 ^ -1)) {
                        statePc = 156;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 156: {
                    var5 += 30;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    if (!ka.a(140, 0, 200, 300, 280)) {
                        statePc = 159;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    stackIn_160_0 = 1;
                    statePc = 160;
                    continue stateLoop;
                }
                case 159: {
                    stackIn_160_0 = 0;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    var10 = stackIn_160_0;
                    if (var19 == 0) {
                        statePc = 186;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    if (ta.p(3)) {
                        statePc = 163;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    var8 = 140;
                    if (var19 == 0) {
                        statePc = 164;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    var8 = 240;
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    var11 = 1;
                    if (var19 == 0) {
                        statePc = 186;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    var11 = 1;
                    var8 = 240;
                    if (var19 == 0) {
                        statePc = 186;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var11 = 1;
                    var8 = 340;
                    if (var19 == 0) {
                        statePc = 186;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    var8 = 200;
                    var11 = 1;
                    if (var19 == 0) {
                        statePc = 186;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    var5 = 460;
                    var8 = 200;
                    var9 = 460;
                    if (ta.p(3)) {
                        statePc = 170;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 170: {
                    var9 = 400;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    if (-3 == (ig.field_L ^ -1)) {
                        statePc = 174;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    if (270 > uk.field_e) {
                        statePc = 174;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var5 = 1000;
                    if (var19 == 0) {
                        statePc = 186;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    var8 = 200;
                    var11 = 1;
                    if (var19 == 0) {
                        statePc = 186;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    if ((this.field_C.field_b ^ -1) >= -1) {
                        statePc = 178;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    var8 = 166 / this.field_C.field_b;
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    var5 = 5 + var8 + 228;
                    if (!ka.a(228, 0, 176, 288, 60)) {
                        statePc = 180;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    stackIn_181_0 = 1;
                    statePc = 181;
                    continue stateLoop;
                }
                case 180: {
                    stackIn_181_0 = 0;
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    var10 = stackIn_181_0;
                    var9 = 84;
                    if (var19 == 0) {
                        statePc = 186;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    var11 = 0;
                    var5 = 394;
                    if (var19 == 0) {
                        statePc = 186;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    var5 = 394;
                    var9 = 500;
                    var11 = 0;
                    if (var5 > rb.field_m) {
                        statePc = 186;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    if (j.field_c >= -20 + var9) {
                        statePc = 186;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    var10 = 0;
                    statePc = 186;
                    continue stateLoop;
                }
                case 186: {
                    if (var11 == 0) {
                        statePc = 188;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    var5 = 430;
                    statePc = 188;
                    continue stateLoop;
                }
                case 188: {
                    var12 = wh.field_d;
                    if (-1 == (param0 ^ -1)) {
                        statePc = 191;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    if (17 == param0) {
                        statePc = 191;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 191: {
                    var12 = mk.field_L;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    var13 = 0;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if (var13 >= dd.field_o[param0].length) {
                        statePc = 309;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    var14 = dd.field_o[param0][var13];
                    stackIn_310_0 = var14 ^ -1;
                    stackIn_195_0 = stackIn_310_0;
                    stackIn_310_1 = -19;
                    stackIn_195_1 = stackIn_310_1;
                    if (var19 != 0) {
                        statePc = 310;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if (stackIn_195_0 == stackIn_195_1) {
                        statePc = 198;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    if (17 == var14) {
                        statePc = 198;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 198: {
                    this.b(var14, 89, var13);
                    if (var19 == 0) {
                        statePc = 308;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    var15 = 8421376;
                    var16 = u.field_f[var14];
                    if (var14 != 28) {
                        statePc = 203;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if (-5 == (param0 ^ -1)) {
                        statePc = 202;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 202: {
                    var9 = 400;
                    var8 = 180;
                    var5 = 70;
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    if (var16 == null) {
                        statePc = 205;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 205: {
                    var16 = "UNKNOWN OPTION (" + var14 + ")";
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    if (-3 != (var13 ^ -1)) {
                        statePc = 209;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    if (param0 != 2) {
                        statePc = 209;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    var5 = var5 - var8;
                    var9 += 420;
                    statePc = 209;
                    continue stateLoop;
                }
                case 209: {
                    if (-13 == (this.field_d ^ -1)) {
                        statePc = 214;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    if (this.field_d == 14) {
                        statePc = 214;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    if (15 == this.field_d) {
                        statePc = 214;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    if (13 == this.field_d) {
                        statePc = 214;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 214: {
                    if (j.field_c <= 380) {
                        statePc = 216;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    stackIn_217_0 = 1;
                    statePc = 217;
                    continue stateLoop;
                }
                case 216: {
                    stackIn_217_0 = 0;
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    var10 = stackIn_217_0;
                    statePc = 218;
                    continue stateLoop;
                }
                case 218: {
                    if ((param0 ^ -1) != (this.field_d ^ -1)) {
                        statePc = 279;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    if (!jk.a(-23322)) {
                        statePc = 221;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 221: {
                    if (2 == param0) {
                        statePc = 250;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    if (var11 != 0) {
                        statePc = 231;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    if (this.field_K) {
                        statePc = 267;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    if (var10 == 0) {
                        statePc = 267;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    if ((320 + -(var6 / 2) ^ -1) <= (j.field_c ^ -1)) {
                        statePc = 267;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    if (var6 / 2 + 320 <= j.field_c) {
                        statePc = 267;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    if ((rb.field_m ^ -1) >= (7 + (-mk.field_L.field_y + var5) ^ -1)) {
                        statePc = 267;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    if ((rb.field_m ^ -1) > (-6 + mk.field_L.field_F + var5 ^ -1)) {
                        statePc = 230;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 230: {
                    this.field_t = var13;
                    this.field_u = true;
                    if (var19 == 0) {
                        statePc = 267;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    if (this.field_K) {
                        statePc = 245;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    if (var10 == 0) {
                        statePc = 245;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    if (dd.field_o[param0] != ja.field_h) {
                        statePc = 245;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (7 + (-mk.field_L.field_y + var5) > rb.field_m) {
                        statePc = 267;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    if ((rb.field_m ^ -1) <= (30 + (var5 + -mk.field_L.field_y) + 7 ^ -1)) {
                        statePc = 267;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    if (var13 == 0) {
                        statePc = 240;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    if (j.field_c < 320) {
                        statePc = 267;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    if (-601 >= (j.field_c ^ -1)) {
                        statePc = 267;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 240: {
                    if (var9 + -32 > j.field_c) {
                        statePc = 267;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    if (-321 >= (j.field_c ^ -1)) {
                        statePc = 267;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    this.field_t = var13;
                    this.field_u = true;
                    if (var19 == 0) {
                        statePc = 267;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    if (this.field_K) {
                        statePc = 267;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    if (var10 == 0) {
                        statePc = 267;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    if (ka.a(-mk.field_L.field_y + (var5 - -7), 0, 30, var8, -32 + var9)) {
                        statePc = 249;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 249: {
                    this.field_t = var13;
                    this.field_u = true;
                    if (var19 == 0) {
                        statePc = 267;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    if ((var14 ^ -1) != -25) {
                        statePc = 253;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    if ((this.a((byte) 123) ^ -1) > -1) {
                        statePc = 267;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    if (this.field_K) {
                        statePc = 267;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    if (var10 == 0) {
                        statePc = 267;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    if (j.field_c <= -(var6 / 2) + 320) {
                        statePc = 267;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    if (j.field_c >= 320 + var6 / 2) {
                        statePc = 267;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    if (rb.field_m <= 7 + (var5 - mk.field_L.field_y)) {
                        statePc = 267;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    if ((rb.field_m ^ -1) <= (-6 + (var5 - -mk.field_L.field_F) ^ -1)) {
                        statePc = 267;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    if (0 == var13) {
                        statePc = 266;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    if (-321 >= (j.field_c ^ -1)) {
                        statePc = 263;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    if (var13 == 1) {
                        statePc = 266;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    if (-321 <= (j.field_c ^ -1)) {
                        statePc = 267;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    if (-3 == (var13 ^ -1)) {
                        statePc = 266;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 266: {
                    this.field_t = var13;
                    this.field_u = true;
                    statePc = 267;
                    continue stateLoop;
                }
                case 267: {
                    if ((this.field_t ^ -1) != (var13 ^ -1)) {
                        statePc = 270;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    if (0 != this.field_j) {
                        statePc = 270;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    var15 = 16776960;
                    statePc = 270;
                    continue stateLoop;
                }
                case 270: {
                    if (-13 == (this.field_d ^ -1)) {
                        statePc = 275;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    if (14 == this.field_d) {
                        statePc = 275;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    if (this.field_d == 15) {
                        statePc = 275;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    if ((this.field_d ^ -1) != -14) {
                        statePc = 279;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    if (this.field_t != var13) {
                        statePc = 278;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    if (-1 != (this.field_j ^ -1)) {
                        statePc = 278;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    var15 = 16777215;
                    if (var19 == 0) {
                        statePc = 279;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    var15 = 16776960;
                    statePc = 279;
                    continue stateLoop;
                }
                case 279: {
                    if (65793 != var15) {
                        statePc = 282;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    if ((this.field_e ^ -1) <= -257) {
                        statePc = 282;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    var15 = 16776960;
                    statePc = 282;
                    continue stateLoop;
                }
                case 282: {
                    if (var15 != 65793) {
                        statePc = 286;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    if (this.field_t != var13) {
                        statePc = 286;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    if (-1 != (this.field_j ^ -1)) {
                        statePc = 286;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    si.c(42, -5 + (-wh.field_d.field_y + var5), 555, 24, 16776960);
                    statePc = 286;
                    continue stateLoop;
                }
                case 286: {
                    if (var14 == 24) {
                        statePc = 289;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    ((vm) ((Object) var12)).b(var16.toUpperCase(), var9, var5 + -5, var15, -1, this.field_e);
                    si.a(-16 + var9, var5 - 17, 8, 8, var15, this.field_e);
                    if (var19 == 0) {
                        statePc = 300;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    if (param0 == 8) {
                        statePc = 292;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 290: {
                    if (-1 < (this.a((byte) -108) ^ -1)) {
                        statePc = 293;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    stackIn_294_0 = 1;
                    statePc = 294;
                    continue stateLoop;
                }
                case 293: {
                    stackIn_294_0 = 0;
                    statePc = 294;
                    continue stateLoop;
                }
                case 294: {
                    var17 = stackIn_294_0;
                    this.a(26, (byte) -55, 365, 57, 530);
                    if (var17 != 0) {
                        statePc = 296;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 296: {
                    if ((ca.field_c & 128 ^ -1) == -1) {
                        statePc = 298;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 298: {
                    var15 = 16777215;
                    statePc = 299;
                    continue stateLoop;
                }
                case 299: {
                    var18 = -8 + (320 - mk.field_L.a(var16.toUpperCase()) / 2);
                    mk.field_L.a(var16.toUpperCase(), 328, var5 + -5, var15, -1, this.field_e);
                    si.c(var18, var5 - 17, 8, 8, var15);
                    statePc = 300;
                    continue stateLoop;
                }
                case 300: {
                    if (var14 == 12) {
                        statePc = 302;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 302: {
                    var17 = -17 + var5;
                    var18 = wj.field_O << -593588159;
                    this.b(-18902, var18, var9 + li.field_p, var17);
                    statePc = 303;
                    continue stateLoop;
                }
                case 303: {
                    if (var14 != 13) {
                        statePc = 305;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    var17 = var5 - 17;
                    var18 = ga.field_b >> -1208471935;
                    this.b(-18902, var18, li.field_p + var9, var17);
                    statePc = 305;
                    continue stateLoop;
                }
                case 305: {
                    if (var11 != 0) {
                        statePc = 307;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 306: {
                    var5 = var5 + var8;
                    if (var19 == 0) {
                        statePc = 308;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    var9 = var9 + var8;
                    statePc = 308;
                    continue stateLoop;
                }
                case 308: {
                    var13++;
                    if (var19 == 0) {
                        statePc = 193;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    stackIn_310_0 = var7 ^ -1;
                    stackIn_310_1 = this.field_t ^ -1;
                    statePc = 310;
                    continue stateLoop;
                }
                case 310: {
                    if (stackIn_310_0 == stackIn_310_1) {
                        statePc = 314;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    if (0 <= this.field_t) {
                        statePc = 313;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 313: {
                    eh.field_c.a(lm.field_A[3], 100, uh.field_i);
                    statePc = 314;
                    continue stateLoop;
                }
                case 314: {
                    var8 = 35 % ((param2 - 3) / 48);
                    si.c();
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void h(int param0) {
        int var2;
        L0: {
          if (3 == this.field_d) {
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (wl.field_b) {
            this.f(-112);
            break L1;
          } else {
            break L1;
          }
        }
        this.l(param0 + -33);
        this.e((byte) -29);
        si.d();
        te.a(true);
        this.field_e = 256;
        this.a(430, 32, 32, -18, 608);
        if (param0 == 26) {
          L2: {
            if (this.field_j <= 0) {
              break L2;
            } else {
              L3: {
                var2 = this.field_j;
                if (-257 <= (var2 ^ -1)) {
                  break L3;
                } else {
                  var2 = 512 - var2;
                  break L3;
                }
              }
              this.field_e = 256 - var2;
              break L2;
            }
          }
          this.d(this.field_d, ij.field_F, 67);
          if (-4 != (this.field_d ^ -1)) {
            L4: {
              if (13 == this.field_d) {
                break L4;
              } else {
                L5: {
                  if (12 == this.field_d) {
                    break L5;
                  } else {
                    if (-15 == (this.field_d ^ -1)) {
                      break L5;
                    } else {
                      if ((this.field_d ^ -1) == -16) {
                        break L5;
                      } else {
                        fb.a(32, 398, 11992, 32, 576);
                        jn.a(100, Math.min(lk.field_H, 30), 0, 0);
                        break L4;
                      }
                    }
                  }
                }
                break L4;
              }
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final void c(int param0, int param1, int param2) {
        int stackIn_15_0 = 0;
        int stackIn_18_1 = 0;
        String[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        StringBuilder stackIn_21_2 = null;
        String[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        StringBuilder stackIn_22_2 = null;
        int stackIn_22_3 = 0;
        int stackIn_25_4 = 0;
        StringBuilder stackIn_27_2 = null;
        StringBuilder stackIn_28_2 = null;
        int stackIn_28_3 = 0;
        int stackIn_31_4;
        int var4;
        String var5;
        String var6_ref_String;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        String var11;
        String var12;
        String var13;
        String var14;
        L0: {
          u.field_f[26] = jh.field_bb;
          mk.field_L.b(i.field_e.toUpperCase(), 320, 95, 16724736, -1);
          var4 = wl.b(25685);
          var12 = vg.a(new String[]{Integer.toString(var4)}, 74, bi.field_f);
          var5 = var12;
          var5 = var12;
          var5 = var12;
          if (0 >= w.field_r) {
            break L0;
          } else {
            L1: {
              if (hh.field_d < rl.field_c) {
                break L1;
              } else {
                var4 = sg.field_i / 50;
                var5 = var12 + "<br>" + oa.field_j + jh.a((byte) -80, var4);
                if (!HostileSpawn.field_I) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var13 = var5 + "<br>" + vg.a(new String[]{Integer.toString(rl.field_c + -hh.field_d)}, 50, vc.field_f);
            var4 = sg.field_i / 50;
            var5 = var13 + "<br>" + oa.field_j + jh.a((byte) -128, var4);
            break L0;
          }
        }
        L2: {
          if (-1 > (w.field_r ^ -1)) {
            var5 = var5 + "<br>" + vg.a(new String[]{"<col=ffffff>" + w.field_r + "</col>"}, 84, o.field_j);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if ((sg.field_i ^ -1) > -51) {
            break L3;
          } else {
            var11 = sg.d(24);
            var6_ref_String = var11;
            if (var6_ref_String != null) {
              var5 = var5 + "<br>" + vg.a(new String[]{var11}, 95, ag.field_j);
              break L3;
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (param1 != 9) {
            break L4;
          } else {
            L5: {
              if ((w.field_r ^ -1) == -1) {
                stackIn_15_0 = 0;
                break L5;
              } else {
                stackIn_15_0 = 1;
                break L5;
              }
            }
            L6: {


              if (ei.field_q.e(-20049)) {

                stackIn_18_1 = 0;
                break L6;
              } else {

                stackIn_18_1 = 1;
                break L6;
              }
            }
            if (wb.a(stackIn_15_0 != 0, stackIn_18_1 != 0, false, rg.a((byte) -117)) == null) {
              break L4;
            } else {
              L7: {
                stackIn_21_0 = new String[]{ch.field_d.toLowerCase()};

                stackIn_21_1 = 74;

                stackIn_21_2 = new StringBuilder();

                if (w.field_r == 0) {
                  stackIn_22_0 = (String[]) ((Object) stackIn_21_0);
                  stackIn_22_1 = stackIn_21_1;
                  stackIn_22_2 = (StringBuilder) ((Object) stackIn_21_2);
                  stackIn_22_3 = 0;
                  break L7;
                } else {
                  stackIn_22_0 = (String[]) ((Object) stackIn_21_0);
                  stackIn_22_1 = stackIn_21_1;
                  stackIn_22_2 = (StringBuilder) ((Object) stackIn_21_2);
                  stackIn_22_3 = 1;
                  break L7;
                }
              }
              L8: {








                if (ei.field_q.e(-20049)) {
                  stackIn_22_0 = (String[]) ((Object) stackIn_22_0);

                  stackIn_22_2 = (StringBuilder) ((Object) stackIn_22_2);

                  stackIn_25_4 = 0;
                  break L8;
                } else {
                  stackIn_22_0 = (String[]) ((Object) stackIn_22_0);

                  stackIn_22_2 = (StringBuilder) ((Object) stackIn_22_2);

                  stackIn_25_4 = 1;
                  break L8;
                }
              }
              L9: {




                stackIn_27_2 = ((StringBuilder) (Object) stackIn_22_2).append(cj.a(wb.a(stackIn_22_3 != 0, stackIn_25_4 != 0, false, rg.a((byte) 121)), -51, '#')[0]).append(" ");

                if (0 == w.field_r) {
                  stackIn_22_0 = (String[]) ((Object) stackIn_22_0);

                  stackIn_28_2 = (StringBuilder) ((Object) stackIn_27_2);
                  stackIn_28_3 = 0;
                  break L9;
                } else {
                  stackIn_22_0 = (String[]) ((Object) stackIn_22_0);

                  stackIn_28_2 = (StringBuilder) ((Object) stackIn_27_2);
                  stackIn_28_3 = 1;
                  break L9;
                }
              }
              L10: {








                if (ei.field_q.e(-20049)) {
                  stackIn_22_0 = (String[]) ((Object) stackIn_22_0);

                  stackIn_28_2 = (StringBuilder) ((Object) stackIn_28_2);

                  stackIn_31_4 = 0;
                  break L10;
                } else {
                  stackIn_22_0 = (String[]) ((Object) stackIn_22_0);

                  stackIn_28_2 = (StringBuilder) ((Object) stackIn_28_2);

                  stackIn_31_4 = 1;
                  break L10;
                }
              }
              var14 = vg.a(stackIn_22_0, stackIn_22_1, cj.a(wb.a(stackIn_28_3 != 0, stackIn_31_4 != 0, false, rg.a((byte) 122)), -119, '#')[1]);
              al.field_Z.a(var14.toUpperCase(), 70, 165, 500, -8 + (-164 + param2), 16711680, -1, 1, 2, 12);
              break L4;
            }
          }
        }
        if (param0 <= -29) {
          L11: {
            var6 = 25;
            var7 = 260;
            var8 = 120;
            var9 = (-var7 + 640) / 2;
            var10 = 180;
            this.a(var8 + 16, (byte) -55, -8 + var10, var9 - 8, 16 + var7);
            wh.field_d.a(var5.toUpperCase(), var9, var10, var7, var8, 16776960, -1, 1, 1, var6);
            if (!ta.p(3)) {
              this.e(16777215, 340);
              break L11;
            } else {
              break L11;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void b(int param0) {
        int var2;
        int var3;
        L0: {
          L1: {
            var3 = HostileSpawn.field_I ? 1 : 0;
            if (12 == this.field_f) {
              break L1;
            } else {
              if ((this.field_f ^ -1) != -14) {
                break L0;
              } else {
                L2: {
                  if (jh.field_ab == 0) {
                    this.f((byte) 121);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  qg.field_p = qg.field_p + 32;
                  if (256 >= qg.field_p) {
                    break L3;
                  } else {
                    qg.field_p = 256;
                    break L3;
                  }
                }
                qi.b(qg.field_p, (byte) -99);
                if (var3 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          L4: {
            if ((uj.field_l ^ -1) != -1) {
              break L4;
            } else {
              this.f((byte) 110);
              break L4;
            }
          }
          L5: {
            uh.field_i = uh.field_i + 8;
            if (64 >= uh.field_i) {
              break L5;
            } else {
              uh.field_i = 64;
              break L5;
            }
          }
          ed.a(uh.field_i, (byte) -108);
          break L0;
        }
        L6: {
          if ((this.field_d ^ -1) == -17) {
            this.field_t = 1;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (this.field_d != 2) {
            break L7;
          } else {
            L8: {
              L9: {
                if (-1 < (this.a((byte) -106) ^ -1)) {
                  break L9;
                } else {
                  this.field_t = 0;
                  if (var3 == 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              this.field_t = 1;
              break L8;
            }
            if (-4 == (this.field_C.field_b ^ -1)) {
              this.field_t = 2;
              break L7;
            } else {
              break L7;
            }
          }
        }
        L10: {
          var2 = -73 / ((param0 - 9) / 63);
          if ((this.field_d ^ -1) != -5) {
            break L10;
          } else {
            L11: {
              if (5 == this.field_C.field_b) {
                break L11;
              } else {
                this.field_t = this.field_t + 1;
                if ((this.field_C.field_b ^ -1) >= (this.field_t ^ -1)) {
                  this.field_t = this.field_t - this.field_C.field_b;
                  if (var3 == 0) {
                    break L10;
                  } else {
                    break L11;
                  }
                } else {
                  break L10;
                }
              }
            }
            if (4 > this.field_t) {
              this.field_t = this.field_t + 1;
              if ((this.field_t ^ -1) > -5) {
                break L10;
              } else {
                this.field_t = this.field_t - 4;
                break L10;
              }
            } else {
              break L10;
            }
          }
        }
        L12: {
          if (this.field_d != 6) {
            break L12;
          } else {
            L13: {
              if ((this.field_C.field_b ^ -1) == -4) {
                break L13;
              } else {
                if (1 >= this.field_C.field_b) {
                  break L12;
                } else {
                  this.field_t = this.field_t + 1;
                  if (this.field_t >= this.field_C.field_b) {
                    this.field_t = 0;
                    if (var3 == 0) {
                      break L12;
                    } else {
                      break L13;
                    }
                  } else {
                    break L12;
                  }
                }
              }
            }
            this.field_t = 2;
            break L12;
          }
        }
        L14: {
          L15: {
            if (this.field_d == 1) {
              break L15;
            } else {
              if (this.field_d == 7) {
                break L15;
              } else {
                break L14;
              }
            }
          }
          this.field_t = 0;
          break L14;
        }
        L16: {
          L17: {
            if ((this.field_d ^ -1) == -13) {
              break L17;
            } else {
              if (this.field_d == 14) {
                break L17;
              } else {
                if (this.field_d == 15) {
                  break L17;
                } else {
                  if (13 == this.field_d) {
                    break L17;
                  } else {
                    if (11 == this.field_d) {
                      break L17;
                    } else {
                      if (this.field_d == 10) {
                        break L17;
                      } else {
                        break L16;
                      }
                    }
                  }
                }
              }
            }
          }
          this.field_t = this.field_t + 1;
          if (this.field_C.field_b <= this.field_t) {
            this.field_t = 0;
            break L16;
          } else {
            break L16;
          }
        }
        L18: {
          if (this.field_d != 8) {
            break L18;
          } else {
            this.field_t = 1;
            break L18;
          }
        }
    }

    private final void a(int param0, byte param1, int param2, int param3, int param4) {
        int var6;
        L0: {
          if (param1 == -55) {
            break L0;
          } else {
            this.field_o = 40;
            break L0;
          }
        }
        L1: {
          L2: {
            var6 = this.field_e;
            if (-18 == (this.field_s ^ -1)) {
              break L2;
            } else {
              if (-18 == (this.field_d ^ -1)) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          var6 = 256;
          break L1;
        }
        si.a(param3, param2, param4, param0, 0, 160 * var6 / 256);
        this.a(-1 + (param0 + param2), param2, param3, -18, -1 + param3 + param4);
    }

    private final void i(int param0, int param1) {
        if (30000 > uk.field_e) {
            uk.field_e = uk.field_e + 1;
        }
        if (param1 != 17691) {
            String var4 = (String) null;
            this.a(2, 78, 7, (String) null, false, -14);
        }
    }

    private final void h(int param0, int param1) {
        if (param1 != -4) {
            this.h(115);
        }
    }

    private final void g(int param0, int param1) {
        String stackIn_50_0 = null;
        int var3;
        String var4;
        String var5;
        String var6;
        int var7;
        int var8;
        int var9;
        String var10;
        String var11;
        String var12;
        String var13;
        String var14;
        L0: {
          this.a((byte) -103, ad.field_d);
          var3 = 2;
          if (null == this.field_H) {
            this.field_H = new bd(ln.field_a.field_d * var3, var3 * ln.field_a.field_a);
            this.field_H.a();
            am.field_d.a(4, var3);
            o.field_n.b((byte) 113);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          L2: {
            this.a(150, (byte) -55, 70, 52, 304);
            this.a(150, (byte) -55, 70, 364, 220);
            this.a(176, (byte) -55, 228, 52, 304);
            this.a(176, (byte) -55, 228, 364, 220);
            si.d(367, 73, 581, 217);
            this.field_H.e(364 + -mm.field_m[0].field_j.field_e * var3 + 110, -mm.field_m[0].field_j.field_g * var3 + 150);
            if ((ca.field_c & 128) > 0) {
              break L2;
            } else {
              si.f(var3 / 2 + 152, 128 - (-(var3 / 2) - 1), 4, 65535, 128);
              si.f(var3 / 2 + 152, 128 + (var3 / 2 + 1), 3, 65535, 128);
              si.f(1 + var3 / 2 + 151, 128 + (var3 / 2 - -1), 2, 16777215, 64);
              si.b(152 - -(var3 / 2), var3 / 2 + 128 + 1, 4, 0);
              if (!HostileSpawn.field_I) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          si.f(var3 / 2 + 152, 1 + (var3 / 2 + 128), 4, 16777215, 128);
          si.f(var3 / 2 + 151 - -1, var3 / 2 + 129, 3, 16777215, 128);
          si.f(151 - -(var3 / 2) + 1, 128 + (var3 / 2 - -1), 2, 16777215, 64);
          si.b(152 - -(var3 / 2), 1 + (var3 / 2 + 128), 4, 0);
          break L1;
        }
        L3: {
          si.c();
          var4 = "Missing text";
          if (bm.field_c != 0) {
            break L3;
          } else {
            L4: {
              if (0 != rl.field_c) {
                break L4;
              } else {
                var4 = pk.field_j;
                break L4;
              }
            }
            L5: {
              if (1 == rl.field_c) {
                var4 = vg.field_b;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-3 == (rl.field_c ^ -1)) {
                var4 = wi.field_a;
                if ((r.field_a ^ -1) == -2) {
                  break L6;
                } else {
                  var4 = ie.field_a;
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L7: {
              if ((rl.field_c ^ -1) != -4) {
                break L7;
              } else {
                var4 = cb.field_h;
                break L7;
              }
            }
            L8: {
              if (4 != rl.field_c) {
                break L8;
              } else {
                var4 = jg.field_k;
                if (-2 != (r.field_a ^ -1)) {
                  var4 = ph.field_B;
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            L9: {
              if ((rl.field_c ^ -1) == -6) {
                L10: {
                  var4 = id.field_b;
                  if (kh.field_U[0] == 5) {
                    break L10;
                  } else {
                    if (5 != kh.field_U[1]) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                var4 = od.field_E;
                if (0 < kh.field_ib[2]) {
                  break L9;
                } else {
                  var4 = g.field_O;
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L11: {
              if (rl.field_c == 6) {
                var4 = ld.field_q;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if ((rl.field_c ^ -1) == -8) {
                var4 = rg.field_c;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (-9 == (rl.field_c ^ -1)) {
                var4 = cn.field_c;
                if (0 != r.field_a) {
                  break L13;
                } else {
                  var4 = kc.field_b;
                  break L13;
                }
              } else {
                break L13;
              }
            }
            if (9 == rl.field_c) {
              var4 = dn.field_g;
              var5 = var4;
              var4 = var5;
              var5 = var4;
              var4 = var5;
              break L3;
            } else {
              break L3;
            }
          }
        }
        L14: {
          if (null == q.field_g) {
            break L14;
          } else {
            var5 = q.field_g.a(false);
            if (var5 != null) {
              var4 = var5;
              break L14;
            } else {
              break L14;
            }
          }
        }
        L15: {
          if (rl.field_c >= 9) {
            stackIn_50_0 = fh.field_d + (rl.field_c - -1);
            break L15;
          } else {
            stackIn_50_0 = fh.field_d + '0' + (1 + rl.field_c);
            break L15;
          }
        }
        var11 = stackIn_50_0;
        var5 = var11;
        String dupTemp$0 = var11.toUpperCase();
        var10 = dupTemp$0;
        var5 = dupTemp$0;
        var6 = var10 + "  <col=ffffff>" + kh.field_fb[bm.field_c][rl.field_c].toUpperCase() + "</col>";
        var7 = 62;
        var7 = var7 + 16 * wh.field_d.a(var6, 60, var7, 288, 146, 16776960, -1, 0, 0, 16);
        var7 += 8;
        var12 = var4.toUpperCase();
        al.field_Z.a(var12, 60, var7, 288, 150, 16776960, -1, 0, 0, 12);
        var8 = ng.field_u / 50;
        var9 = 60;
        var7 = 212;
        if (param0 == 152) {
          L16: {
            var13 = c.field_e.toUpperCase() + jh.a((byte) -66, var8);
            wh.field_d.c(var13, var9, var7, 16776960, -1);
            if ((rl.field_c ^ -1) > -1) {
              break L16;
            } else {
              if (rl.field_c < ub.field_a[bm.field_c].length) {
                var8 = ub.field_a[bm.field_c][rl.field_c];
                var14 = ki.field_d.toUpperCase() + jh.a((byte) -105, var8);
                var9 = 348;
                wh.field_d.a(var14, var9, var7, 16776960, -1);
                break L16;
              } else {
                break L16;
              }
            }
          }
          this.a(220, 228, (byte) 56, 364, 176);
          return;
        } else {
          return;
        }
    }

    private final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = 20;
              if ((si.field_j ^ -1) < (var4_int + param2 ^ -1)) {
                break L1;
              } else {
                if ((param2 ^ -1) < (si.field_a ^ -1)) {
                  break L1;
                } else {
                  wh.field_d.c(param0.toUpperCase(), 96, 35 + param2, 16776960, -1);
                  break L1;
                }
              }
            }
            L2: {
              param2 = param2 + var4_int;
              if (param1 > 56) {
                break L2;
              } else {
                var5 = (String) null;
                re.a((String) null, (String) null, (String) null, 41);
                break L2;
              }
            }
            stackIn_6_0 = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("re.W(");

            if (param0 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    private final void f(int param0, int param1) {
        int stackIn_5_0 = 0;
        int statePc = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        nc var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        String var21 = null;
        String var22 = null;
        String var23 = null;
        String var24 = null;
        String var25 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = HostileSpawn.field_I ? 1 : 0;
                    u.field_f[26] = jf.field_e;
                    if (-1 != (bm.field_c ^ -1)) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackIn_5_0 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 2: {
                    if (ng.field_k) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackIn_5_0 = 1;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    stackIn_5_0 = 2;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var3 = stackIn_5_0;
                    uf.field_g[var3].b(0, 0);
                    if (param0 > 112) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    if (-151 <= (uk.field_e ^ -1)) {
                        statePc = 28;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (2 != ig.field_L) {
                        statePc = 10;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var4 = Math.min(480, 4 * (uk.field_e + -150));
                    var5 = 355;
                    var6 = 274;
                    var7 = 10;
                    var8 = 460;
                    var9 = var5 + var6 / 2;
                    var10 = 38 + var7;
                    si.a(var5, var7, var6, var8, 0, 160 * var4 / 480);
                    si.d(0, 0, 640, var4);
                    this.a(1 + var7 - -var8, var7 - 2, var5 - 2, -18, 1 + var5 - -var6);
                    mk.field_L.b(dl.field_p, var9, var10, 16777215, -1);
                    var10 += 38;
                    var12 = wh.field_d;
                    var13 = 16776960;
                    var17 = vg.a(new String[]{Integer.toString(wl.b(25685))}, 30, bi.field_f).toUpperCase();
                    ((vm) ((Object) var12)).b(var17, var9, var10, var13, -1);
                    var18 = vg.a(new String[]{Integer.toString(10 + -hh.field_d)}, 28, vc.field_f).toUpperCase();
                    var10 += 26;
                    ((vm) ((Object) var12)).b(var18, var9, var10, var13, -1);
                    var19 = md.field_m + jh.a((byte) -67, sg.field_i / 50);
                    var10 += 26;
                    var20 = var19.toUpperCase();
                    var11 = var20;
                    ((vm) ((Object) var12)).b(var20, var9, var10, var13, -1);
                    var10 += 26;
                    var14 = 0;
                    var15 = hh.field_d;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if ((var15 ^ -1) <= -11) {
                        statePc = 15;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var14 = var14 + ub.field_a[bm.field_c][var15];
                    var15++;
                    if (var16 != 0) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var16 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var21 = ki.field_d + jh.a((byte) -78, var14);
                    var22 = var21.toUpperCase();
                    ((vm) ((Object) var12)).b(var22, var9, var10, var13, -1);
                    var23 = vg.a(new String[]{"<col=ffffff>" + w.field_r + "</col>"}, 67, o.field_j.toUpperCase());
                    var10 += 36;
                    mk.field_L.b(var23, var9, var10, var13, -1);
                    var11 = sg.d(24);
                    var10 += 36;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var11 != null) {
                        statePc = 18;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var24 = vg.a(new String[]{var11}, 65, ag.field_j).toUpperCase();
                    if ((-4 + var6 ^ -1) <= (mk.field_L.a(var24) ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    wh.field_d.a(var24, var5 - -4, var10 + -35, var6 + -8, 100, var13, -1, 1, 0, 18);
                    if (var16 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    mk.field_L.b(var24, var9, var10 + 8, var13, -1);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var10 += 36;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    ne.a(24, 280, var9);
                    if (om.field_b) {
                        statePc = 28;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (!ln.field_b[bm.field_c]) {
                        statePc = 26;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var25 = am.field_a.toUpperCase();
                    ((vm) ((Object) var12)).a(var25, -130 + var9, 340, 260, 80, var13, -1, 1, 0, 24);
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1) {
        if (param1 != -25345) {
            this.field_b = (le[]) null;
        }
    }

    private final void a(byte param0, int param1) {
        boolean stackIn_15_0 = false;
        int stackIn_24_0 = 0;
        boolean stackOut_14_0;
        int statePc = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = HostileSpawn.field_I ? 1 : 0;
                    this.field_F.a(true, true);
                    var3 = this.field_J;
                    this.field_J = -1;
                    if (param0 == -125) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.h((byte) -70);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (jj.field_g <= this.field_F.field_Ib.field_tb) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.field_F.field_Ib.field_tb = this.field_F.field_Ib.field_tb + 8;
                    if ((jj.field_g ^ -1) <= (this.field_F.field_Ib.field_tb ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.field_F.field_Ib.field_tb = jj.field_g;
                    if (var5 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if ((jj.field_g ^ -1) <= (this.field_F.field_Ib.field_tb ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.field_F.field_Ib.field_tb = this.field_F.field_Ib.field_tb - 8;
                    if (jj.field_g > this.field_F.field_Ib.field_tb) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.field_F.field_Ib.field_tb = jj.field_g;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (ka.a(286, 0, 100, 496, 72)) {
                        statePc = 12;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var4 = 0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (42 <= var4) {
                        statePc = 23;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackOut_14_0 = hb.a(var4, mc.field_E, false);
                    stackIn_24_0 = stackOut_14_0 ? 1 : 0;
                    stackIn_15_0 = stackOut_14_0;
                    if (var5 != 0) {
                        statePc = 24;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (!stackIn_15_0) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var5 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (!this.field_b[var4].field_S) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.field_J = var4;
                    if (var5 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var4++;
                    if (var5 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = 1;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (stackIn_24_0 != pf.field_o) {
                        statePc = 34;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if ((this.field_x ^ -1) <= -1) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (0 <= this.field_J) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    eh.field_c.a(lm.field_A[4], 100, uh.field_i);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if ((this.field_J ^ -1) == (this.field_x ^ -1)) {
                        statePc = 32;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    this.field_x = this.field_J;
                    if (var5 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    this.field_x = -1;
                    if (var5 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (this.field_J < 0) {
                        statePc = 39;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (var3 != this.field_J) {
                        statePc = 37;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 37: {
                    eh.field_c.a(lm.field_A[3], 100, uh.field_i);
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int stackIn_57_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_C != null) {
          L0: {
            var4 = 0;
            var4 = var4 * 2;
            if (256 < var4) {
              var4 = 256;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param1 <= -6) {
              break L1;
            } else {
              this.h(46, 16);
              break L1;
            }
          }
          L2: {
            var5 = this.field_t;
            if (this.field_t == var5) {
              break L2;
            } else {
              if ((this.field_t ^ -1) > -1) {
                break L2;
              } else {
                eh.field_c.a(lm.field_A[3], 100, uh.field_i);
                break L2;
              }
            }
          }
          L3: {
            if (this.field_d != param0) {
              break L3;
            } else {
              L4: {
                L5: {
                  L6: {
                    L7: {
                      L8: {
                        L9: {
                          var8 = param0;
                          if ((var8 ^ -1) == -11) {
                            break L9;
                          } else {
                            if ((var8 ^ -1) == -10) {
                              break L9;
                            } else {
                              L10: {
                                if (var8 != 12) {
                                  break L10;
                                } else {
                                  if (var9 == 0) {
                                    break L8;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              if ((var8 ^ -1) == -15) {
                                break L8;
                              } else {
                                if (15 == var8) {
                                  break L8;
                                } else {
                                  L11: {
                                    if ((var8 ^ -1) != -12) {
                                      break L11;
                                    } else {
                                      if (var9 == 0) {
                                        break L7;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  L12: {
                                    if (-14 != (var8 ^ -1)) {
                                      break L12;
                                    } else {
                                      if (var9 == 0) {
                                        break L6;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  if (var8 == 3) {
                                    break L5;
                                  } else {
                                    L13: {
                                      L14: {
                                        L15: {
                                          L16: {
                                            L17: {
                                              L18: {
                                                L19: {
                                                  if (-1 != (var8 ^ -1)) {
                                                    break L19;
                                                  } else {
                                                    if (var9 == 0) {
                                                      this.h(param2, -4);
                                                      if (var9 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L18;
                                                      }
                                                    } else {
                                                      break L19;
                                                    }
                                                  }
                                                }
                                                if (5 == var8) {
                                                  break L18;
                                                } else {
                                                  L20: {
                                                    if (4 != var8) {
                                                      break L20;
                                                    } else {
                                                      if (var9 == 0) {
                                                        break L17;
                                                      } else {
                                                        break L20;
                                                      }
                                                    }
                                                  }
                                                  L21: {
                                                    if (-3 != (var8 ^ -1)) {
                                                      break L21;
                                                    } else {
                                                      if (var9 == 0) {
                                                        break L16;
                                                      } else {
                                                        break L21;
                                                      }
                                                    }
                                                  }
                                                  if (8 == var8) {
                                                    break L15;
                                                  } else {
                                                    L22: {
                                                      if (-7 != (var8 ^ -1)) {
                                                        break L22;
                                                      } else {
                                                        if (var9 == 0) {
                                                          break L14;
                                                        } else {
                                                          break L22;
                                                        }
                                                      }
                                                    }
                                                    if (-2 == (var8 ^ -1)) {
                                                      break L4;
                                                    } else {
                                                      L23: {
                                                        if (var8 != 7) {
                                                          break L23;
                                                        } else {
                                                          if (var9 == 0) {
                                                            break L4;
                                                          } else {
                                                            break L23;
                                                          }
                                                        }
                                                      }
                                                      if (var8 != 16) {
                                                        break L4;
                                                      } else {
                                                        if (var9 == 0) {
                                                          break L13;
                                                        } else {
                                                          break L9;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              this.b(param2, -27961);
                                              if (var9 == 0) {
                                                break L4;
                                              } else {
                                                break L17;
                                              }
                                            }
                                            this.d(3);
                                            if (var9 == 0) {
                                              break L4;
                                            } else {
                                              break L16;
                                            }
                                          }
                                          this.c(param2, -10099);
                                          if (var9 == 0) {
                                            break L4;
                                          } else {
                                            break L15;
                                          }
                                        }
                                        this.b((byte) -123);
                                        if (var9 == 0) {
                                          break L4;
                                        } else {
                                          break L14;
                                        }
                                      }
                                      this.a((byte) -125, param2);
                                      if (var9 == 0) {
                                        break L4;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    this.b(false);
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                        }
                        this.a(89, param0, param2);
                        if (var9 == 0) {
                          break L4;
                        } else {
                          break L8;
                        }
                      }
                      this.i(param2, 17691);
                      if (var9 == 0) {
                        break L4;
                      } else {
                        break L7;
                      }
                    }
                    this.a(param2, -25345);
                    if (var9 == 0) {
                      break L4;
                    } else {
                      break L6;
                    }
                  }
                  this.i(param2, 17691);
                  if (var9 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
                L24: {
                  if (pf.a(-124)) {
                    stackIn_57_0 = 0;
                    break L24;
                  } else {
                    stackIn_57_0 = 1;
                    break L24;
                  }
                }
                L25: {
                  var6 = stackIn_57_0;
                  var7 = dh.field_a.a(-1, var6 != 0);
                  if (3 != var7) {
                    break L25;
                  } else {
                    this.field_s = 0;
                    this.field_j = 1;
                    break L25;
                  }
                }
                L26: {
                  if (-2 == (var7 ^ -1)) {
                    this.field_s = 0;
                    this.field_j = 1;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (-3 == (var7 ^ -1)) {
                    this.field_j = 1;
                    this.field_s = 0;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return;
              }
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, int param1, bd param2, int param3) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var5_int = (int)((double)ch.field_q / 2.0);
                var6 = this.field_e;
                if (this.field_d == 17) {
                  break L2;
                } else {
                  if (this.field_s != 17) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var6 = 256;
              break L1;
            }
            if (param0 == 50) {
              L3: {
                L4: {
                  if (-11 <= (var5_int ^ -1)) {
                    break L4;
                  } else {
                    param2.b(param1, param3, var6);
                    if (var11 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  L6: {
                    var7 = var5_int - 5;
                    if (0 <= var7) {
                      break L6;
                    } else {
                      var7 = 5 + var7;
                      if (var11 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var7 = -var7 + 5;
                  break L5;
                }
                var7 = (int)((double)var7 * 1.5);
                var8 = param2.field_A;
                var9 = 0;
                L7: while (true) {
                  L8: {
                    if (var8 <= var9) {
                      break L8;
                    } else {
                      si.d(0, var9 - -param3, 640, var9 + (param3 + 1));
                      var10 = (int)(Math.random() * (double)var7);
                      if (var11 != 0) {
                        break L3;
                      } else {
                        L9: {
                          if (Math.random() >= 0.5) {
                            break L9;
                          } else {
                            var10 = -var10;
                            break L9;
                          }
                        }
                        param2.b(var10 + param1, param3, var6);
                        param2.c(var10 + param1, param3, (int)(8.0 * (Math.random() * (double)var7) * (double)var6 / 256.0));
                        var9++;
                        if (var11 == 0) {
                          continue L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  si.c();
                  break L3;
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
          L10: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("re.JB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L10;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L10;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void i(int param0) {
        le var2_ref = null;
        if (0 > rl.field_c) {
            return;
        }
        Object var2 = null;
        if (null == this.field_G) {
            var2_ref = new le(-1L, (le) null);
        } else {
            var2_ref = this.field_G.field_Ib;
        }
        var2_ref.field_fb = f.field_a[bm.field_c][rl.field_c];
        if (!(!om.field_b)) {
            var2_ref.field_fb = f.field_a[bm.field_c][10];
        }
        var2_ref.field_fb = var2_ref.field_fb.toUpperCase();
        var2_ref.field_T = 16776960;
        var2_ref.field_R = 15;
        var2_ref.field_qb = 220;
        var2_ref.field_ab = (vm) ((Object) al.field_Z);
        var2_ref.field_L = 4;
        var2_ref.field_sb = Math.max(141, var2_ref.field_ab.b(var2_ref.field_fb, var2_ref.field_qb + -(2 * var2_ref.field_L), var2_ref.field_R));
        this.a(false);
        le var3 = new le(-1L, (le) null);
        var3.field_qb = 41 + var2_ref.field_qb;
        var3.field_sb = 140;
        this.field_G = new th(-1L, var2_ref, var3, this.field_z);
        this.field_G.field_qb = var3.field_qb;
        if (param0 <= 100) {
            field_D = (bd[][]) null;
        }
        this.field_G.field_sb = 140;
        this.field_G.field_zb = 216;
        this.field_G.field_tb = 324;
        this.field_G.a(16, 16, (byte) -123);
        this.field_G.a(true, true);
    }

    private final void b(boolean param0) {
        if (param0) {
            this.j(118);
        }
    }

    private final void l(int param0) {
        L0: {
          L1: {
            if ((this.field_d ^ -1) != param0) {
              break L1;
            } else {
              if (null == this.field_F) {
                this.e(-18);
                if (!HostileSpawn.field_I) {
                  break L0;
                } else {
                  break L1;
                }
              } else {
                break L0;
              }
            }
          }
          this.field_F = null;
          break L0;
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        si.a(-3 + param2, param3 - 3, 174, 13, 0, this.field_e);
        si.d(0, 0, param2 - -(160 * param1 / 128), 480);
        si.a(param2, param3, 160, 8, 4210688, this.field_e);
        this.field_m = -param2 + (-2 + j.field_c);
        si.c();
        if (param0 != -18902) {
            this.field_g = -42;
        }
        si.a(param1 * 160 / 128 + param2, param3, 8, 8, 14408449, this.field_e);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int fieldTemp$0 = 0;
        int stackIn_50_0 = 0;
        float var5;
        int var6;
        int var7;
        int var8;
        int var9;
        L0: {
          var9 = HostileSpawn.field_I ? 1 : 0;
          if (-1 == (7 & em.field_c ^ -1)) {
            L1: {
              L2: {
                f.a((byte) 119);
                if (0 < this.field_j) {
                  break L2;
                } else {
                  kc.field_c = 16;
                  if (var9 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              kc.field_c = 0;
              break L1;
            }
            L3: {
              L4: {
                if ((kc.field_c ^ -1) < (lk.field_H ^ -1)) {
                  break L4;
                } else {
                  if ((lk.field_H ^ -1) >= (kc.field_c ^ -1)) {
                    break L3;
                  } else {
                    lk.field_H = lk.field_H - 1;
                    if (var9 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              lk.field_H = lk.field_H + 1;
              break L3;
            }
            L5: {
              f.a((byte) 119);
              if (null != ec.field_b) {
                eh.field_c.a(ec.field_b);
                ec.field_b = null;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (null == q.field_i) {
                break L6;
              } else {
                eh.field_c.a(q.field_i);
                q.field_i = null;
                break L6;
              }
            }
            if (null == e.field_l) {
              break L0;
            } else {
              eh.field_c.a(e.field_l);
              e.field_l = null;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L7: {
          ag.field_w = 30.0f;
          vb.field_Jb = 0.8999999761581421f;
          qm.field_O = 0.5f;
          ea.field_d = 0.5f;
          vc.field_a = 0.30000001192092896f;
          an.field_n = 0.20000000298023224f;
          var5 = kd.field_v.j();
          if (vc.field_a != var5) {
            kd.field_v.d(ua.a((byte) -67, vc.field_a, var5, 0.07000000029802322f));
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          var5 = kd.field_v.h();
          if (var5 == qm.field_O) {
            break L8;
          } else {
            kd.field_v.f(ua.a((byte) -68, qm.field_O, var5, 0.07000000029802322f));
            break L8;
          }
        }
        var5 = kd.field_v.f();
        if (param3 == -99) {
          L9: {
            if (var5 == ea.field_d) {
              break L9;
            } else {
              kd.field_v.b(ua.a((byte) -54, ea.field_d, var5, 0.009999999776482582f));
              break L9;
            }
          }
          L10: {
            var5 = kd.field_v.g();
            if (var5 == ag.field_w) {
              break L10;
            } else {
              kd.field_v.e(ua.a((byte) -40, ag.field_w, var5, 1.0f));
              break L10;
            }
          }
          L11: {
            var5 = kd.field_v.k();
            if (an.field_n == var5) {
              break L11;
            } else {
              kd.field_v.c(ua.a((byte) -108, an.field_n, var5, 0.009999999776482582f));
              break L11;
            }
          }
          L12: {
            var5 = kd.field_v.e();
            if (vb.field_Jb != var5) {
              kd.field_v.a(ua.a((byte) -114, vb.field_Jb, var5, 0.009999999776482582f));
              break L12;
            } else {
              break L12;
            }
          }
          L13: {
            fieldTemp$0 = ch.field_q + 1;
            ch.field_q = ch.field_q + 1;
            if ((fieldTemp$0 ^ -1) >= -51) {
              break L13;
            } else {
              if (Math.random() >= 0.005) {
                break L13;
              } else {
                ch.field_q = 0;
                break L13;
              }
            }
          }
          L14: {
            if (!wl.field_b) {
              break L14;
            } else {
              this.f(param3 ^ 31);
              break L14;
            }
          }
          L15: {
            L16: {
              this.l(-7);
              this.e((byte) -29);
              if ((this.field_a ^ -1) != (param2 ^ -1)) {
                break L16;
              } else {
                if (param1 != this.field_o) {
                  break L16;
                } else {
                  if (this.field_y != param0) {
                    break L16;
                  } else {
                    if (-1 != (ll.field_c ^ -1)) {
                      break L16;
                    } else {
                      break L15;
                    }
                  }
                }
              }
            }
            this.field_K = false;
            this.field_o = param1;
            this.field_a = param2;
            this.field_y = param0;
            break L15;
          }
          L17: {
            L18: {
              this.a(this.field_d, (byte) -86, ij.field_F);
              if ((this.field_d ^ -1) != -1) {
                break L18;
              } else {
                if (dd.field_o[this.field_d].length == 9) {
                  stackIn_50_0 = 26;
                  break L17;
                } else {
                  break L18;
                }
              }
            }
            stackIn_50_0 = 30;
            break L17;
          }
          L19: {
            var6 = stackIn_50_0;
            var7 = 432 - var6 * this.field_C.field_b;
            if (this.field_d == 3) {
              var7 = 448;
              break L19;
            } else {
              break L19;
            }
          }
          L20: {
            ij.field_F = var7;
            if (!this.field_c) {
              if (0 < this.field_p) {
                this.field_p = this.field_p - 16;
                break L20;
              } else {
                break L20;
              }
            } else {
              this.field_p = this.field_p + 16;
              if (256 < this.field_p) {
                of.field_h = null;
                mc.field_I = 1;
                hg.field_e = 1;
                jf.field_c = 128;
                le.field_D = 0;
                return;
              } else {
                break L20;
              }
            }
          }
          L21: {
            L22: {
              if ((this.field_d ^ -1) == -2) {
                break L22;
              } else {
                if ((this.field_d ^ -1) != -8) {
                  break L21;
                } else {
                  break L22;
                }
              }
            }
            L23: {
              L24: {
                this.field_h.a(true, true);
                if (this.field_h.f(2)) {
                  break L24;
                } else {
                  if (-99 != (gf.field_i ^ -1)) {
                    break L23;
                  } else {
                    break L24;
                  }
                }
              }
              this.field_v = this.field_v - 20;
              break L23;
            }
            L25: {
              L26: {
                if (this.field_h.j(0)) {
                  break L26;
                } else {
                  if (gf.field_i != 99) {
                    break L25;
                  } else {
                    break L26;
                  }
                }
              }
              this.field_v = this.field_v + 20;
              break L25;
            }
            L27: {
              if (ll.field_c == 0) {
                break L27;
              } else {
                this.field_v = this.field_v + ll.field_c * 20;
                break L27;
              }
            }
            L28: {
              L29: {
                if (this.field_h.g(-1)) {
                  break L29;
                } else {
                  if ((gf.field_i ^ -1) == -103) {
                    break L29;
                  } else {
                    if (104 == gf.field_i) {
                      break L29;
                    } else {
                      break L28;
                    }
                  }
                }
              }
              this.field_v = this.field_v - 128;
              break L28;
            }
            L30: {
              L31: {
                if (this.field_h.c(false)) {
                  break L31;
                } else {
                  if (103 == gf.field_i) {
                    break L31;
                  } else {
                    if ((gf.field_i ^ -1) == -106) {
                      break L31;
                    } else {
                      break L30;
                    }
                  }
                }
              }
              this.field_v = this.field_v + 128;
              break L30;
            }
            L32: {
              if (gf.field_i == 102) {
                this.field_v = 0;
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              if (-104 != (gf.field_i ^ -1)) {
                break L33;
              } else {
                this.field_v = this.field_g;
                break L33;
              }
            }
            L34: {
              if (this.field_g - 304 >= this.field_v) {
                break L34;
              } else {
                this.field_v = -304 + this.field_g;
                break L34;
              }
            }
            L35: {
              if (this.field_v >= 0) {
                break L35;
              } else {
                this.field_v = 0;
                break L35;
              }
            }
            L36: {
              if (!this.field_h.h(-24467)) {
                break L36;
              } else {
                this.field_v = this.field_h.a(this.field_g, (byte) 126, 304);
                break L36;
              }
            }
            gf.field_i = -1;
            this.field_h.a(this.field_g, 0, 304, this.field_v);
            break L21;
          }
          L37: {
            if (0 >= this.field_j) {
              break L37;
            } else {
              L38: {
                this.field_j = this.field_j + 16;
                if ((this.field_j ^ -1) != -258) {
                  break L38;
                } else {
                  L39: {
                    var8 = this.field_s;
                    if (-1 == (this.field_s ^ -1)) {
                      if (ta.p(3)) {
                        break L39;
                      } else {
                        if (0 >= wb.field_S) {
                          break L39;
                        } else {
                          break L39;
                        }
                      }
                    } else {
                      break L39;
                    }
                  }
                  L40: {
                    this.field_s = this.field_d;
                    this.field_d = var8;
                    if (-1 == (this.field_d ^ -1)) {
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                  L41: {
                    this.field_C.field_b = dd.field_o[this.field_d].length;
                    if (8 != this.field_d) {
                      break L41;
                    } else {
                      L42: {
                        if ((this.field_s ^ -1) == -3) {
                          break L42;
                        } else {
                          if ((this.field_s ^ -1) == -1) {
                            break L42;
                          } else {
                            break L41;
                          }
                        }
                      }
                      L43: {
                        if (rl.field_c < 0) {
                          rl.field_c = 0;
                          break L43;
                        } else {
                          break L43;
                        }
                      }
                      ta.a((byte) 2, rl.field_c);
                      break L41;
                    }
                  }
                  L44: {
                    if (-5 == (this.field_d ^ -1)) {
                      hg.field_e = 0;
                      break L44;
                    } else {
                      break L44;
                    }
                  }
                  L45: {
                    if (this.field_d == 6) {
                      hg.field_e = 0;
                      break L45;
                    } else {
                      break L45;
                    }
                  }
                  if (this.field_t >= this.field_C.field_b) {
                    this.field_t = -1 + this.field_C.field_b;
                    break L38;
                  } else {
                    break L38;
                  }
                }
              }
              if (512 <= this.field_j) {
                this.field_j = 0;
                break L37;
              } else {
                break L37;
              }
            }
          }
          L46: {
            if (this.field_t < 0) {
              break L46;
            } else {
              if (dd.field_o[this.field_d].length <= this.field_t) {
                break L46;
              } else {
                this.field_f = dd.field_o[this.field_d][this.field_t];
                break L46;
              }
            }
          }
          L47: {
            L48: {
              if ((param0 ^ -1) != -2) {
                break L48;
              } else {
                if (0 <= (this.field_f ^ -1)) {
                  break L48;
                } else {
                  if (!this.field_u) {
                    break L48;
                  } else {
                    L49: {
                      if (uj.field_l == 1) {
                        eh.field_c.a(lm.field_A[4], 100, uh.field_i);
                        break L49;
                      } else {
                        break L49;
                      }
                    }
                    this.a((byte) 111, true);
                    if (var9 == 0) {
                      break L47;
                    } else {
                      break L48;
                    }
                  }
                }
              }
            }
            L50: {
              if ((ig.field_L ^ -1) != -2) {
                break L50;
              } else {
                if (this.field_f <= -1) {
                  break L50;
                } else {
                  if (!this.field_u) {
                    break L50;
                  } else {
                    L51: {
                      if (-13 == (this.field_f ^ -1)) {
                        break L51;
                      } else {
                        if ((this.field_f ^ -1) != -14) {
                          break L50;
                        } else {
                          break L51;
                        }
                      }
                    }
                    this.a((byte) 121, true);
                    break L47;
                  }
                }
              }
            }
            break L47;
          }
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, vh param1, int param2, int param3, int param4, vh param5) {
        try {
            al.field_N = param1;
            ab.field_b = param2;
            jd.field_l = param4;
            if (param0 != 4) {
                field_D = (bd[][]) null;
            }
            tk.field_c = param5;
            cl.field_l = param3;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "re.IB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(int param0, int param1) {
        if (param1 != -27961) {
            this.j((byte) 93);
        }
    }

    final static String a(String param0, String param1, String param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = HostileSpawn.field_I ? 1 : 0;
                    if (param3 < -106) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_q = (bd) null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var4 = param0.indexOf(param1);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (-1 == var4) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    param0 = param0.substring(0, var4) + param2 + param0.substring(var4 + param1.length());
                    stackIn_7_0 = (String) (param0);
                    stackIn_5_0 = stackIn_7_0;
                    if (var5 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var4 = ((String) (Object) stackIn_5_0).indexOf(param1, param2.length() + var4);
                    if (var5 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return param0;
                }
                case 7: {
                    return stackIn_7_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void g(int param0) {
        le var3 = null;
        le var4 = null;
        le var5 = null;
        bd var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        le var11 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = HostileSpawn.field_I ? 1 : 0;
                    var11 = new le(0L, (le) null);
                    if (param0 == 12169) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.b((byte) -30);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var3 = new le(0L, (le) null);
                    var4 = new le(0L, (le) null);
                    var5 = new le(0L, (le) null);
                    var6 = new bd(16, 16);
                    var6.a();
                    var7 = 2;
                    var8 = 6;
                    var9 = 12;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (-1 <= (var9 ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    si.a(var7, var8, var9, 16776960);
                    var7++;
                    var8--;
                    var9 -= 2;
                    if (var10 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var10 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var11.field_pb = var6;
                    o.field_n.b((byte) -47);
                    var3.field_pb = var6.h();
                    var3.field_pb.f();
                    var5.field_Bb = oa.field_m;
                    var5.field_nb = oa.field_m;
                    o.field_n.b((byte) -31);
                    this.field_h = new fj(0L, var11, var3, var4, var5);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (this.field_s == 1) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if ((this.field_s ^ -1) != -8) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    this.field_h.a(559, 16, this.field_v, 20, 83, 310, 307, this.field_g);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void f(int param0) {
        int[][] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int[][] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_9_2 = null;
        int[][] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int[][] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int[] stackIn_15_2 = null;
        int[][] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int[][] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int[] stackIn_19_2 = null;
        int var2;
        if (!ta.p(3)) {
          L0: {
            if (!ib.a((byte) -72)) {
              break L0;
            } else {
              if (null != gi.field_h) {
                oc.field_h[1][0] = gi.field_h.a("level_01.dat", "", 0);
                oc.field_h[1][1] = gi.field_h.a("level_02.dat", "", 0);
                oc.field_h[1][2] = gi.field_h.a("level_03.dat", "", 0);
                oc.field_h[1][3] = gi.field_h.a("level_04.dat", "", 0);
                oc.field_h[1][4] = gi.field_h.a("level_05.dat", "", 0);
                oc.field_h[1][5] = gi.field_h.a("level_06.dat", "", 0);
                oc.field_h[1][6] = gi.field_h.a("level_07.dat", "", 0);
                oc.field_h[1][7] = gi.field_h.a("level_08.dat", "", 0);
                oc.field_h[1][8] = gi.field_h.a("level_09.dat", "", 0);
                oc.field_h[1][9] = gi.field_h.a("level_10.dat", "", 0);
                gi.field_h = null;
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            dd.field_o[4] = bh.field_j;
            dd.field_o[15] = nm.field_c;
            dd.field_o[13] = nm.field_c;
            dd.field_o[10] = nm.field_c;
            stackIn_8_0 = dd.field_o;

            stackIn_8_1 = 10;

            if (!om.field_b) {
              stackIn_9_0 = (int[][]) ((Object) stackIn_8_0);
              stackIn_9_1 = stackIn_8_1;
              stackIn_9_2 = ja.field_h;
              break L1;
            } else {
              stackIn_9_0 = (int[][]) ((Object) stackIn_8_0);
              stackIn_9_1 = stackIn_8_1;
              stackIn_9_2 = nm.field_c;
              break L1;
            }
          }
          L2: {
            L3: {
              stackIn_9_0[stackIn_9_1] = stackIn_9_2;
              var2 = 0;
              if (!ib.a((byte) -72)) {
                break L3;
              } else {
                L4: {
                  if (this.field_d != 2) {
                    break L4;
                  } else {
                    this.h((byte) 33);
                    break L4;
                  }
                }
                L5: {
                  stackIn_14_0 = dd.field_o;

                  stackIn_14_1 = 2;

                  if (var2 != 0) {
                    stackIn_15_0 = (int[][]) ((Object) stackIn_14_0);
                    stackIn_15_1 = stackIn_14_1;
                    stackIn_15_2 = ob.field_e;
                    break L5;
                  } else {
                    stackIn_15_0 = (int[][]) ((Object) stackIn_14_0);
                    stackIn_15_1 = stackIn_14_1;
                    stackIn_15_2 = r.field_d;
                    break L5;
                  }
                }
                stackIn_15_0[stackIn_15_1] = stackIn_15_2;
                dd.field_o[0] = wl.field_d;
                dd.field_o[5] = eh.field_f;
                if (!HostileSpawn.field_I) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L6: {
              stackIn_18_0 = dd.field_o;

              stackIn_18_1 = 2;

              if (var2 != 0) {
                stackIn_19_0 = (int[][]) ((Object) stackIn_18_0);
                stackIn_19_1 = stackIn_18_1;
                stackIn_19_2 = j.field_b;
                break L6;
              } else {
                stackIn_19_0 = (int[][]) ((Object) stackIn_18_0);
                stackIn_19_1 = stackIn_18_1;
                stackIn_19_2 = HostileSpawn.field_K;
                break L6;
              }
            }
            stackIn_19_0[stackIn_19_1] = stackIn_19_2;
            break L2;
          }
          L7: {
            dd.field_o[6] = td.field_d;
            if (!ib.a((byte) -72)) {
              break L7;
            } else {
              dd.field_o[6] = ak.field_c;
              dd.field_o[4] = oj.field_y;
              break L7;
            }
          }
          L8: {
            this.field_C.field_b = dd.field_o[this.field_d].length;
            sg.field_j = wk.a(4, -2178);
            vf.k(-8255);
            sa.a(5);
            if (9 == this.field_d) {
              L9: {
                if (rg.a((byte) -95)) {
                  break L9;
                } else {
                  break L9;
                }
              }
              if ((this.field_d ^ -1) == -10) {
                this.field_d = 10;
                break L8;
              } else {
                break L8;
              }
            } else {
              break L8;
            }
          }
          L10: {
            if ((this.field_d ^ -1) != -15) {
              break L10;
            } else {
              this.field_d = 12;
              if (wb.field_S > 0) {
                break L10;
              } else {
                this.field_d = 15;
                break L10;
              }
            }
          }
          this.field_C.field_b = dd.field_o[this.field_d].length;
          if (param0 < -100) {
            wl.field_b = false;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void f(byte param0) {
        L0: {
          if (param0 > 57) {
            break L0;
          } else {
            this.b(true);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((this.field_f ^ -1) != 0) {
              break L2;
            } else {
              this.d((byte) 101);
              if (!HostileSpawn.field_I) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          this.a((byte) 116, false);
          this.field_t = 0;
          break L1;
        }
    }

    private final void d(int param0) {
        ic var2 = null;
        if (!(ta.p(param0))) {
            if (!(null != p.field_m[bm.field_c])) {
                p.field_m[bm.field_c] = pi.a(10, 6413, 3, ka.field_p[bm.field_c], 1);
            }
            var2 = p.field_m[bm.field_c];
            if (var2.field_m) {
                if (!(null == var2.field_p)) {
                    fg.a(var2, ue.field_e, false, ch.field_h);
                }
            }
        }
    }

    private final void d(int param0, int param1) {
        int var3;
        this.a(200, (byte) -55, 140, 54, 200);
        this.a((byte) 50, 54 + (200 - hk.field_h.field_z) / 2, hk.field_h, 140 - -((200 + -hk.field_h.field_A) / 2));
        if (param0 < -103) {
          L0: {
            L1: {
              this.a(200, (byte) -55, 140, 280, 300);
              if ((this.field_d ^ -1) == -18) {
                break L1;
              } else {
                this.a((byte) -126, sa.field_d.toUpperCase());
                if (!HostileSpawn.field_I) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            this.a((byte) 112, ln.field_h.toUpperCase());
            break L0;
          }
          L2: {
            if (ib.a((byte) -72)) {
              L3: {
                L4: {
                  var3 = this.field_e;
                  if (-18 == (this.field_s ^ -1)) {
                    break L4;
                  } else {
                    if (-18 != (this.field_d ^ -1)) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var3 = 256;
                break L3;
              }
              id.field_A.c(eg.field_j.toUpperCase(), 600, 55, 8421376, -1, var3);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, String param1) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var4 = -72 % ((48 - param0) / 59);
                var3_int = (int)((double)ch.field_q / 2.0);
                if ((this.field_j ^ -1) >= -201) {
                  break L2;
                } else {
                  if (-301 >= (this.field_j ^ -1)) {
                    break L2;
                  } else {
                    stackIn_5_0 = 1;
                    break L1;
                  }
                }
              }
              stackIn_5_0 = 0;
              break L1;
            }
            L3: {
              var5 = stackIn_5_0;
              if (var5 == 0) {
                break L3;
              } else {
                if ((var3_int ^ -1) >= -11) {
                  break L3;
                } else {
                  var3_int = 16 - -(var3_int % 16);
                  break L3;
                }
              }
            }
            L4: {
              L5: {
                L6: {
                  if ((var3_int ^ -1) >= -11) {
                    break L6;
                  } else {
                    if (var5 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  L8: {
                    var6 = -5 + var3_int;
                    if (0 <= var6) {
                      break L8;
                    } else {
                      var6 = 5 - -var6;
                      if (var10 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var6 = 5 + -var6;
                  break L7;
                }
                var6 = (int)((double)var6 * 0.8);
                var7 = mk.field_L.field_u;
                var8 = 0;
                L9: while (true) {
                  L10: {
                    L11: {
                      if ((var8 ^ -1) <= (var7 ^ -1)) {
                        break L11;
                      } else {
                        si.d(0, 60 + -var8, 640, 1 + -var8 + 60);
                        var9 = (int)(Math.random() * (double)var6);
                        if (var10 != 0) {
                          break L10;
                        } else {
                          L12: {
                            if (0.5 > Math.random()) {
                              var9 = -var9;
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          mk.field_L.c(param1, 54 + var9, 60, 16776960, -1);
                          var8++;
                          if (var10 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    si.c();
                    break L10;
                  }
                  if (var10 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              mk.field_L.c(param1, 54, 60, 16776960, -1);
              break L4;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("re.JA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L13;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L13;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    re(boolean param0) {
        L0: {
          L1: {
            this.field_J = -1;
            this.field_b = new le[42];
            this.field_w = new le[2][11];
            this.field_v = 0;
            this.field_x = -1;
            this.field_e = 0;
            this.field_g = 0;
            this.field_C = new be();
            this.field_f = -1;
            if (param0) {
              break L1;
            } else {
              this.field_p = 256;
              this.field_d = 4;
              if (!rg.a((byte) -85)) {
                break L0;
              } else {
                this.field_d = 6;
                if (!HostileSpawn.field_I) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          L2: {
            if (1 != hg.field_e) {
              break L2;
            } else {
              this.field_p = 256;
              break L2;
            }
          }
          this.field_d = 0;
          if ((hg.field_e ^ -1) != -2) {
            break L0;
          } else {
            this.field_d = 5;
            this.field_H = null;
            break L0;
          }
        }
        this.field_C.field_b = dd.field_o[this.field_d].length;
        ij.field_F = 448;
    }

    re(int param0) {
        this.field_J = -1;
        this.field_b = new le[42];
        this.field_w = new le[2][11];
        this.field_v = 0;
        this.field_x = -1;
        this.field_e = 0;
        this.field_g = 0;
        this.field_C = new be();
        this.field_d = param0;
        this.field_f = -1;
        this.field_p = 256;
        if (5 == this.field_d) {
            this.field_H = null;
        }
        this.field_C.field_b = dd.field_o[this.field_d].length;
        ij.field_F = 448;
    }

    static {
        field_r = new ub();
        field_B = "Finally, this pass should unlock all the doors.";
        field_k = false;
        field_A = new java.awt.Color(10040319);
        field_I = "Use the mouse to direct the marine's fire.";
        field_i = new bl(0);
    }
}
