/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class up {
    private int field_e;
    private sna field_g;
    private sna[] field_a;
    private gj field_f;
    private boolean field_d;
    private ad[] field_b;
    private int field_c;

    final void a(int param0) {
        String stackIn_17_0 = null;
        fea stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        fea stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        fea stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        fea stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        fea stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        fea stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int statePc = 0;
        int var2 = 0;
        String var3 = null;
        int var4 = 0;
        ad var5 = null;
        String var6 = null;
        String var7 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = BachelorFridge.field_y;
                    nu.field_e.e(0, 0);
                    nna.field_v.e(77, 44);
                    jha.field_g.a(eha.field_p, 320, 68, 16776960, -1);
                    hfa.field_z.a(eha.field_p, 320, 68, 65793, -1);
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((var2 ^ -1) <= -9) {
                        statePc = 14;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var5 = this.field_b[var2];
                    if (var5 != null) {
                        statePc = 5;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var4 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (0 == (1 << var2 & this.field_e)) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    tp.field_x.e(ka.field_a[var2][0] - -2, ka.field_a[var2][1] + 2);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (4 <= var2) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var5 != null) {
                        statePc = 10;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var5.field_f.a(true, false, 2048, 2048, 0, -52, 256, 58 + var2 * 126, 64);
                    if (var4 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var5 == null) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var5.field_f.a(true, false, 2048, 2048, 0, -118, 256, 58 + (var2 + -4) * 126, 200);
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var2++;
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var6 = lga.a(true, new String[]{Integer.toString(this.field_c), Integer.toString(this.field_f.field_h.field_k)}, vu.field_l);
                    hfa.field_z.c(vk.field_r, 105, 380, 65793, -1);
                    jha.field_g.c(vk.field_r, 105, 380, 16777215, -1);
                    hfa.field_z.c(var6, 180, 380, param0, -1);
                    jha.field_g.c(var6, 180, 380, 16776960, -1);
                    pw.field_y.e(490, 430);
                    if (this.field_d) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_17_0 = bh.field_p;
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = wda.field_g;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var7 = stackIn_17_0;
                    var3 = var7;
                    hfa.field_z.a(var7, 542, 452, 65793, -1);
                    stackIn_22_0 = jha.field_g;
                    stackIn_18_0 = stackIn_22_0;
                    stackIn_22_1 = (String) (var7);
                    stackIn_18_1 = stackIn_22_1;
                    stackIn_22_2 = 542;
                    stackIn_18_2 = stackIn_22_2;
                    stackIn_22_3 = 452;
                    stackIn_18_3 = stackIn_22_3;
                    if (!this.field_g.field_u) {
                        statePc = 22;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_22_0 = (fea) ((Object) stackIn_18_0);
                    stackIn_19_0 = stackIn_22_0;
                    stackIn_22_1 = (String) ((Object) stackIn_18_1);
                    stackIn_19_1 = stackIn_22_1;
                    stackIn_22_2 = stackIn_18_2;
                    stackIn_19_2 = stackIn_22_2;
                    stackIn_22_3 = stackIn_18_3;
                    stackIn_19_3 = stackIn_22_3;
                    if (this.field_d) {
                        statePc = 22;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = (fea) ((Object) stackIn_19_0);
                    stackIn_20_0 = stackIn_21_0;
                    stackIn_21_1 = (String) ((Object) stackIn_19_1);
                    stackIn_20_1 = stackIn_21_1;
                    stackIn_21_2 = stackIn_19_2;
                    stackIn_20_2 = stackIn_21_2;
                    stackIn_21_3 = stackIn_19_3;
                    stackIn_20_3 = stackIn_21_3;
                    if (!this.field_g.field_T) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_23_0 = (fea) ((Object) stackIn_20_0);
                    stackIn_23_1 = (String) ((Object) stackIn_20_1);
                    stackIn_23_2 = stackIn_20_2;
                    stackIn_23_3 = stackIn_20_3;
                    stackIn_23_4 = 16776960;
                    statePc = 23;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = (fea) ((Object) stackIn_21_0);
                    stackIn_23_1 = (String) ((Object) stackIn_21_1);
                    stackIn_23_2 = stackIn_21_2;
                    stackIn_23_3 = stackIn_21_3;
                    stackIn_23_4 = 16777215;
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = (fea) ((Object) stackIn_22_0);
                    stackIn_23_1 = (String) ((Object) stackIn_22_1);
                    stackIn_23_2 = stackIn_22_2;
                    stackIn_23_3 = stackIn_22_3;
                    stackIn_23_4 = 11250603;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    ((fea) (Object) stackIn_23_0).a(stackIn_23_1, stackIn_23_2, stackIn_23_3, stackIn_23_4, -1);
                    jha.field_g.a(st.field_e, 300, 360, 300, 100, 16776960, -1, 1, 0, 14);
                    hfa.field_z.a(st.field_e, 300, 340, 300, 100, 65793, -1, 1, 0, 14);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_54_0 = 0;
        ad[] stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        ad[] stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_81_0 = 0;
        int stackIn_87_0 = 0;
        ad[] stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        ad[] stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_115_0 = 0;
        int stackIn_121_0 = 0;
        ad[] stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        ad[] stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        int stackIn_142_0 = 0;
        int stackIn_148_0 = 0;
        ad[] stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        ad[] stackIn_157_0 = null;
        int stackIn_157_1 = 0;
        int stackIn_168_0 = 0;
        int stackIn_174_0 = 0;
        ad[] stackIn_177_0 = null;
        int stackIn_177_1 = 0;
        ad[] stackIn_183_0 = null;
        int stackIn_183_1 = 0;
        int stackIn_193_0 = 0;
        int stackIn_199_0 = 0;
        ad[] stackIn_202_0 = null;
        int stackIn_202_1 = 0;
        ad[] stackIn_208_0 = null;
        int stackIn_208_1 = 0;
        int statePc = 0;
        int var2_int = 0;
        ad[] var2 = null;
        int var3 = 0;
        ad var3_ref_ad = null;
        int var4_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        ad[] var7 = null;
        ad var8 = null;
        int[] var9 = null;
        ad[] var10 = null;
        int[] var11 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = BachelorFridge.field_y;
                    if (param0 > 69) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.a(-49);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var7 = this.field_b;
                    var3 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var7.length <= var3) {
                        statePc = 10;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var8 = var7[var3];
                    if (var6 != 0) {
                        statePc = 98;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var8 != null) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var6 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var8.a(106);
                    var8.field_f.c(11);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var3++;
                    if (var6 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (this.field_f.h((byte) 115)) {
                        statePc = 98;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if ((lf.field_c ^ -1) == -2) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (2 == lf.field_c) {
                        statePc = 14;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var2_int = -1;
                    var3 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if ((var3 ^ -1) <= -9) {
                        statePc = 22;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.field_a[var3].a(19842, true);
                    stackIn_23_0 = 1;
                    stackIn_17_0 = stackIn_23_0;
                    stackIn_23_1 = this.field_a[var3].field_R;
                    stackIn_17_1 = stackIn_23_1;
                    if (var6 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (stackIn_17_0 == stackIn_17_1) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (-3 != (this.field_a[var3].field_R ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var2_int = var3;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    var3++;
                    if (var6 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = -1;
                    stackIn_23_1 = var2_int;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (stackIn_23_0 != stackIn_23_1) {
                        statePc = 25;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var3_ref_ad = this.field_b[var2_int];
                    if (var3_ref_ad != null) {
                        statePc = 27;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (-2 != (lf.field_c ^ -1)) {
                        statePc = 67;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var4_int = 1 << var2_int;
                    if ((this.field_e & var4_int) == 0) {
                        statePc = 31;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    this.field_c = this.field_c - 1;
                    this.field_e = this.field_e & (var4_int ^ -1);
                    if (var6 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if ((this.field_c ^ -1) > (this.field_f.field_h.field_k ^ -1)) {
                        statePc = 65;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (var6 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    this.field_f.a(var3_ref_ad, (byte) -52);
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (this.field_c == 0) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (wf.field_x) {
                        statePc = 39;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    this.field_g.field_u = false;
                    if (var6 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    this.field_g.field_u = true;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    this.field_g.a(19842, true);
                    if (this.field_d) {
                        statePc = 64;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (-2 == (this.field_g.field_R ^ -1)) {
                        statePc = 43;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (0 >= this.field_c) {
                        statePc = 64;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if ((this.field_c ^ -1) < (this.field_f.field_h.field_k ^ -1)) {
                        statePc = 64;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var10 = new ad[this.field_c];
                    var2 = var10;
                    var3 = 0;
                    var4_int = 0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (8 <= var4_int) {
                        statePc = 53;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    stackIn_54_0 = this.field_e & 1 << var4_int ^ -1;
                    stackIn_48_0 = stackIn_54_0;
                    if (var6 != 0) {
                        statePc = 54;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (stackIn_48_0 != -1) {
                        statePc = 51;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (var6 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    incrementValue$0 = var3;
                    var3++;
                    var2[incrementValue$0] = this.field_b[var4_int];
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var4_int++;
                    if (var6 == 0) {
                        statePc = 46;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    stackIn_54_0 = this.field_c;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    var11 = new int[stackIn_54_0];
                    var9 = var11;
                    var4 = var9;
                    var5 = 0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (this.field_c <= var5) {
                        statePc = 62;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    stackIn_63_0 = (ad[]) (var2);
                    stackIn_57_0 = stackIn_63_0;
                    stackIn_63_1 = var5;
                    stackIn_57_1 = stackIn_63_1;
                    if (var6 != 0) {
                        statePc = 63;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (stackIn_57_0[stackIn_57_1] != null) {
                        statePc = 60;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var10 = var2;
                    var11 = var9;
                    var11[var5] = 2147483647;
                    if (var6 == 0) {
                        statePc = 61;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var10 = var2;
                    var11 = var9;
                    var4[var5] = -var10[var5].field_s.field_k[1];
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    var5++;
                    if (var6 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var10 = var2;
                    var11 = var9;
                    stackIn_63_0 = (ad[]) (var10);
                    stackIn_63_1 = 109;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    var10 = var2;
                    var11 = var9;
                    dk.a(stackIn_63_0, (byte) stackIn_63_1, var11);
                    this.field_f.a(this.field_e, var10, false);
                    System.gc();
                    this.field_d = true;
                    this.field_g.field_u = false;
                    uca.a(18, (byte) 119);
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    lf.field_c = 0;
                    return;
                }
                case 65: {
                    this.field_c = this.field_c + 1;
                    this.field_e = this.field_e | var4_int;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if (var6 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    this.field_f.a(var3_ref_ad, (byte) -52);
                    if (this.field_c == 0) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (wf.field_x) {
                        statePc = 72;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    this.field_g.field_u = false;
                    if (var6 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    this.field_g.field_u = true;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    this.field_g.a(19842, true);
                    if (this.field_d) {
                        statePc = 97;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (-2 == (this.field_g.field_R ^ -1)) {
                        statePc = 76;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (0 >= this.field_c) {
                        statePc = 97;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if ((this.field_c ^ -1) < (this.field_f.field_h.field_k ^ -1)) {
                        statePc = 97;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var10 = new ad[this.field_c];
                    var2 = var10;
                    var3 = 0;
                    var4_int = 0;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    if (8 <= var4_int) {
                        statePc = 86;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    stackIn_87_0 = this.field_e & 1 << var4_int ^ -1;
                    stackIn_81_0 = stackIn_87_0;
                    if (var6 != 0) {
                        statePc = 87;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (stackIn_81_0 != -1) {
                        statePc = 84;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (var6 == 0) {
                        statePc = 85;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    incrementValue$1 = var3;
                    var3++;
                    var2[incrementValue$1] = this.field_b[var4_int];
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    var4_int++;
                    if (var6 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    stackIn_87_0 = this.field_c;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    var11 = new int[stackIn_87_0];
                    var9 = var11;
                    var4 = var9;
                    var5 = 0;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    if (this.field_c <= var5) {
                        statePc = 95;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    stackIn_96_0 = (ad[]) (var2);
                    stackIn_90_0 = stackIn_96_0;
                    stackIn_96_1 = var5;
                    stackIn_90_1 = stackIn_96_1;
                    if (var6 != 0) {
                        statePc = 96;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (stackIn_90_0[stackIn_90_1] != null) {
                        statePc = 93;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var10 = var2;
                    var11 = var9;
                    var11[var5] = 2147483647;
                    if (var6 == 0) {
                        statePc = 94;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var10 = var2;
                    var11 = var9;
                    var4[var5] = -var10[var5].field_s.field_k[1];
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    var5++;
                    if (var6 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var10 = var2;
                    var11 = var9;
                    stackIn_96_0 = (ad[]) (var10);
                    stackIn_96_1 = 109;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    var10 = var2;
                    var11 = var9;
                    dk.a(stackIn_96_0, (byte) stackIn_96_1, var11);
                    this.field_f.a(this.field_e, var10, false);
                    System.gc();
                    this.field_d = true;
                    this.field_g.field_u = false;
                    uca.a(18, (byte) 119);
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    lf.field_c = 0;
                    return;
                }
                case 98: {
                    if (this.field_c == 0) {
                        statePc = 132;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    if (wf.field_x) {
                        statePc = 159;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    this.field_g.field_u = false;
                    if (var6 == 0) {
                        statePc = 102;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    this.field_g.field_u = true;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    this.field_g.a(19842, true);
                    if (!this.field_d) {
                        statePc = 105;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    lf.field_c = 0;
                    return;
                }
                case 105: {
                    if (-2 == (this.field_g.field_R ^ -1)) {
                        statePc = 108;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    lf.field_c = 0;
                    return;
                }
                case 108: {
                    if (0 < this.field_c) {
                        statePc = 111;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    lf.field_c = 0;
                    return;
                }
                case 111: {
                    if ((this.field_c ^ -1) < (this.field_f.field_h.field_k ^ -1)) {
                        statePc = 131;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var10 = new ad[this.field_c];
                    var2 = var10;
                    var3 = 0;
                    var4_int = 0;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    if (8 <= var4_int) {
                        statePc = 120;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    stackIn_121_0 = this.field_e & 1 << var4_int ^ -1;
                    stackIn_115_0 = stackIn_121_0;
                    if (var6 != 0) {
                        statePc = 121;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    if (stackIn_115_0 != -1) {
                        statePc = 118;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    if (var6 == 0) {
                        statePc = 119;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    incrementValue$2 = var3;
                    var3++;
                    var2[incrementValue$2] = this.field_b[var4_int];
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    var4_int++;
                    if (var6 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    stackIn_121_0 = this.field_c;
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    var11 = new int[stackIn_121_0];
                    var9 = var11;
                    var4 = var9;
                    var5 = 0;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    if (this.field_c <= var5) {
                        statePc = 129;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    stackIn_130_0 = (ad[]) (var2);
                    stackIn_124_0 = stackIn_130_0;
                    stackIn_130_1 = var5;
                    stackIn_124_1 = stackIn_130_1;
                    if (var6 != 0) {
                        statePc = 130;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (stackIn_124_0[stackIn_124_1] != null) {
                        statePc = 127;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    var10 = var2;
                    var11 = var9;
                    var11[var5] = 2147483647;
                    if (var6 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var10 = var2;
                    var11 = var9;
                    var4[var5] = -var10[var5].field_s.field_k[1];
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    var5++;
                    if (var6 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var10 = var2;
                    var11 = var9;
                    stackIn_130_0 = (ad[]) (var10);
                    stackIn_130_1 = 109;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    var10 = var2;
                    var11 = var9;
                    dk.a(stackIn_130_0, (byte) stackIn_130_1, var11);
                    this.field_f.a(this.field_e, var10, false);
                    System.gc();
                    this.field_d = true;
                    this.field_g.field_u = false;
                    uca.a(18, (byte) 119);
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    lf.field_c = 0;
                    return;
                }
                case 132: {
                    this.field_g.field_u = false;
                    if (var6 == 0) {
                        statePc = 185;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    this.field_g.field_u = true;
                    this.field_g.a(19842, true);
                    if (this.field_d) {
                        statePc = 158;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    if (-2 == (this.field_g.field_R ^ -1)) {
                        statePc = 137;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    lf.field_c = 0;
                    return;
                }
                case 137: {
                    if (0 >= this.field_c) {
                        statePc = 158;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    if ((this.field_c ^ -1) < (this.field_f.field_h.field_k ^ -1)) {
                        statePc = 158;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    var10 = new ad[this.field_c];
                    var2 = var10;
                    var3 = 0;
                    var4_int = 0;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if (8 <= var4_int) {
                        statePc = 147;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    stackIn_148_0 = this.field_e & 1 << var4_int ^ -1;
                    stackIn_142_0 = stackIn_148_0;
                    if (var6 != 0) {
                        statePc = 148;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (stackIn_142_0 != -1) {
                        statePc = 145;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if (var6 == 0) {
                        statePc = 146;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    incrementValue$3 = var3;
                    var3++;
                    var2[incrementValue$3] = this.field_b[var4_int];
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    var4_int++;
                    if (var6 == 0) {
                        statePc = 140;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    stackIn_148_0 = this.field_c;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    var11 = new int[stackIn_148_0];
                    var9 = var11;
                    var4 = var9;
                    var5 = 0;
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    if (this.field_c <= var5) {
                        statePc = 156;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    stackIn_157_0 = (ad[]) (var2);
                    stackIn_151_0 = stackIn_157_0;
                    stackIn_157_1 = var5;
                    stackIn_151_1 = stackIn_157_1;
                    if (var6 != 0) {
                        statePc = 157;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if (stackIn_151_0[stackIn_151_1] != null) {
                        statePc = 154;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    var10 = var2;
                    var11 = var9;
                    var11[var5] = 2147483647;
                    if (var6 == 0) {
                        statePc = 155;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    var10 = var2;
                    var11 = var9;
                    var4[var5] = -var10[var5].field_s.field_k[1];
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    var5++;
                    if (var6 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    var10 = var2;
                    var11 = var9;
                    stackIn_157_0 = (ad[]) (var10);
                    stackIn_157_1 = 109;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    var10 = var2;
                    var11 = var9;
                    dk.a(stackIn_157_0, (byte) stackIn_157_1, var11);
                    this.field_f.a(this.field_e, var10, false);
                    System.gc();
                    this.field_d = true;
                    this.field_g.field_u = false;
                    uca.a(18, (byte) 119);
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    lf.field_c = 0;
                    return;
                }
                case 159: {
                    this.field_g.field_u = true;
                    this.field_g.a(19842, true);
                    if (this.field_d) {
                        statePc = 184;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    if (-2 == (this.field_g.field_R ^ -1)) {
                        statePc = 163;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    lf.field_c = 0;
                    return;
                }
                case 163: {
                    if (0 >= this.field_c) {
                        statePc = 184;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    if ((this.field_c ^ -1) < (this.field_f.field_h.field_k ^ -1)) {
                        statePc = 184;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    var10 = new ad[this.field_c];
                    var2 = var10;
                    var3 = 0;
                    var4_int = 0;
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    if (8 <= var4_int) {
                        statePc = 173;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    stackIn_174_0 = this.field_e & 1 << var4_int ^ -1;
                    stackIn_168_0 = stackIn_174_0;
                    if (var6 != 0) {
                        statePc = 174;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if (stackIn_168_0 != -1) {
                        statePc = 171;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    if (var6 == 0) {
                        statePc = 172;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    incrementValue$4 = var3;
                    var3++;
                    var2[incrementValue$4] = this.field_b[var4_int];
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    var4_int++;
                    if (var6 == 0) {
                        statePc = 166;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    stackIn_174_0 = this.field_c;
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    var11 = new int[stackIn_174_0];
                    var9 = var11;
                    var4 = var9;
                    var5 = 0;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    if (this.field_c <= var5) {
                        statePc = 182;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    stackIn_183_0 = (ad[]) (var2);
                    stackIn_177_0 = stackIn_183_0;
                    stackIn_183_1 = var5;
                    stackIn_177_1 = stackIn_183_1;
                    if (var6 != 0) {
                        statePc = 183;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    if (stackIn_177_0[stackIn_177_1] != null) {
                        statePc = 180;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    var10 = var2;
                    var11 = var9;
                    var11[var5] = 2147483647;
                    if (var6 == 0) {
                        statePc = 181;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    var10 = var2;
                    var11 = var9;
                    var4[var5] = -var10[var5].field_s.field_k[1];
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    var5++;
                    if (var6 == 0) {
                        statePc = 175;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    var10 = var2;
                    var11 = var9;
                    stackIn_183_0 = (ad[]) (var10);
                    stackIn_183_1 = 109;
                    statePc = 183;
                    continue stateLoop;
                }
                case 183: {
                    var10 = var2;
                    var11 = var9;
                    dk.a(stackIn_183_0, (byte) stackIn_183_1, var11);
                    this.field_f.a(this.field_e, var10, false);
                    System.gc();
                    this.field_d = true;
                    this.field_g.field_u = false;
                    uca.a(18, (byte) 119);
                    statePc = 184;
                    continue stateLoop;
                }
                case 184: {
                    lf.field_c = 0;
                    return;
                }
                case 185: {
                    this.field_g.a(19842, true);
                    if (this.field_d) {
                        statePc = 209;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    if (-2 == (this.field_g.field_R ^ -1)) {
                        statePc = 188;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    lf.field_c = 0;
                    return;
                }
                case 188: {
                    if (0 >= this.field_c) {
                        statePc = 209;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    if ((this.field_c ^ -1) < (this.field_f.field_h.field_k ^ -1)) {
                        statePc = 209;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    var10 = new ad[this.field_c];
                    var2 = var10;
                    var3 = 0;
                    var4_int = 0;
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    if (8 <= var4_int) {
                        statePc = 198;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    stackIn_199_0 = this.field_e & 1 << var4_int ^ -1;
                    stackIn_193_0 = stackIn_199_0;
                    if (var6 != 0) {
                        statePc = 199;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    if (stackIn_193_0 != -1) {
                        statePc = 196;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    if (var6 == 0) {
                        statePc = 197;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    incrementValue$5 = var3;
                    var3++;
                    var2[incrementValue$5] = this.field_b[var4_int];
                    statePc = 197;
                    continue stateLoop;
                }
                case 197: {
                    var4_int++;
                    if (var6 == 0) {
                        statePc = 191;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    stackIn_199_0 = this.field_c;
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    var11 = new int[stackIn_199_0];
                    var9 = var11;
                    var4 = var9;
                    var5 = 0;
                    statePc = 200;
                    continue stateLoop;
                }
                case 200: {
                    if (this.field_c <= var5) {
                        statePc = 207;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    stackIn_208_0 = (ad[]) (var2);
                    stackIn_202_0 = stackIn_208_0;
                    stackIn_208_1 = var5;
                    stackIn_202_1 = stackIn_208_1;
                    if (var6 != 0) {
                        statePc = 208;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    if (stackIn_202_0[stackIn_202_1] != null) {
                        statePc = 205;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    var10 = var2;
                    var11 = var9;
                    var11[var5] = 2147483647;
                    if (var6 == 0) {
                        statePc = 206;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    var10 = var2;
                    var11 = var9;
                    var4[var5] = -var10[var5].field_s.field_k[1];
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    var5++;
                    if (var6 == 0) {
                        statePc = 200;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    var10 = var2;
                    var11 = var9;
                    stackIn_208_0 = (ad[]) (var10);
                    stackIn_208_1 = 109;
                    statePc = 208;
                    continue stateLoop;
                }
                case 208: {
                    var10 = var2;
                    var11 = var9;
                    dk.a(stackIn_208_0, (byte) stackIn_208_1, var11);
                    this.field_f.a(this.field_e, var10, false);
                    System.gc();
                    this.field_d = true;
                    this.field_g.field_u = false;
                    uca.a(18, (byte) 119);
                    statePc = 209;
                    continue stateLoop;
                }
                case 209: {
                    lf.field_c = 0;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    up(gj param0, sna param1, rk[] param2) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        rk[] var5_ref_rk__ = null;
        int var5 = 0;
        int var6 = 0;
        rk var7 = null;
        aga var8 = null;
        ad var9 = null;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = BachelorFridge.field_y;
                    this.field_e = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_f = param0;
                        this.field_b = new ad[8];
                        var4_int = 0;
                        var5_ref_rk__ = param2;
                        var6 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var6 ^ -1) <= (var5_ref_rk__.length ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var7 = var5_ref_rk__[var6];
                        if (var10 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var7 != null) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var10 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8 = new aga(var7, this.field_f.field_h, this.field_f.field_n, -1);
                        var9 = new ad(var8);
                        var9.b(false);
                        incrementValue$0 = var4_int;
                        var4_int++;
                        this.field_b[incrementValue$0] = var9;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6++;
                        if (var10 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_g = new sna("commit", param1, 490, 430, 100, 40, bh.field_p);
                        this.field_a = new sna[8];
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((var5 ^ -1) > -9) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        return;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_a[var5] = new sna("" + var5, param1, ka.field_a[var5][0], ka.field_a[var5][1], 100, 100, "");
                        var5++;
                        if (var10 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        return;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var10 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        return;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (var4);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("up.<init>(");
                    stackIn_17_1 = stackIn_18_1;
                    if (param0 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_17_1);
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
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_20_0 = stackIn_21_0;
                    stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
                    stackIn_20_1 = stackIn_21_1;
                    if (param1 == null) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_22_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_22_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_22_2 = "{...}";
                    statePc = 22;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_22_2 = "null";
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_23_0 = stackIn_24_0;
                    stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
                    stackIn_23_1 = stackIn_24_1;
                    if (param2 == null) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_25_2 = "{...}";
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_25_2 = "null";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    throw pe.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
