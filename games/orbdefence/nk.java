/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    private int field_u;
    static gk field_q;
    private int[] field_d;
    private int field_o;
    private int field_n;
    private int field_h;
    private int field_m;
    private im field_v;
    private boolean field_g;
    private int field_p;
    static char[] field_r;
    private boolean field_j;
    private int field_e;
    private int field_t;
    private lb field_s;
    private int field_a;
    int field_b;
    private int field_f;
    int field_i;
    static tl field_w;
    private int field_c;
    private int field_x;
    private boolean field_k;
    private int field_l;

    final void a(int param0, boolean param1) {
        String[] array$0 = null;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        int stackIn_130_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        int stackIn_138_0 = 0;
        int stackIn_138_1 = 0;
        String[] stackIn_139_0 = null;
        String[] stackIn_139_1 = null;
        int stackIn_139_2 = 0;
        String[] stackIn_140_0 = null;
        String[] stackIn_140_1 = null;
        int stackIn_140_2 = 0;
        String[] stackIn_141_0 = null;
        String[] stackIn_141_1 = null;
        int stackIn_141_2 = 0;
        String stackIn_141_3 = null;
        int stackIn_144_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_158_1 = 0;
        int stackIn_162_0 = 0;
        int stackIn_162_1 = 0;
        int stackIn_179_0 = 0;
        int stackIn_179_1 = 0;
        int stackIn_236_0 = 0;
        int stackIn_236_1 = 0;
        int stackIn_243_0 = 0;
        int stackIn_434_0 = 0;
        int stackIn_437_0 = 0;
        int stackIn_443_0 = 0;
        int stackIn_446_0 = 0;
        int stackIn_458_0 = 0;
        int stackIn_461_0 = 0;
        int stackIn_473_0 = 0;
        int stackIn_473_1 = 0;
        int stackIn_475_0 = 0;
        int stackIn_477_0 = 0;
        int statePc = 0;
        int var3 = 0;
        kb var3_ref_kb = null;
        int var4 = 0;
        pd var4_ref_pd = null;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kb var8_ref_kb = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        int[] var11_ref_int__ = null;
        int var12 = 0;
        int var13 = 0;
        hj var13_ref_hj = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        Object var15_ref = null;
        String var15_ref_String = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        Object var22 = null;
        Object var23 = null;
        Object var24 = null;
        kb var25 = null;
        hj var26 = null;
        int[] var27 = null;
        String var28 = null;
        hj var29 = null;
        hj var30 = null;
        String[][] var31 = null;
        String var32 = null;
        int[] var33 = null;
        pd var34 = null;
        pd var35 = null;
        me var36 = null;
        oj var37 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var21 = null;
                    var22 = null;
                    var23 = null;
                    var24 = null;
                    var20 = OrbDefence.field_D ? 1 : 0;
                    wf.field_c.field_f.a(this.field_h, -32, this.field_t, false);
                    wf.field_c.field_f.a(this.field_h, 121, this.field_t, true);
                    var34 = (pd) ((Object) this.field_v.b((byte) 115));
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var34 == null) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var34.a(this.field_t, (byte) 100, this.field_h);
                    var34 = (pd) ((Object) this.field_v.d(param0 ^ 855));
                    if (var20 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var20 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (3 >= this.field_b) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (200 < this.field_u) {
                        statePc = 8;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ul.d(0, 0, 640, 480, 0, this.field_u - 200);
                    if (var20 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (-1 <= (this.field_u ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ul.d(0, 0, 640, 480, 0, this.field_u);
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var3 = -this.field_t + ol.field_e * eh.field_a + (320 + -(ol.field_e / 2));
                    var4 = uh.field_b * ol.field_e - -240 - ol.field_e / 2 + -this.field_h;
                    var5 = eh.field_a - -(wf.field_c.field_f.field_c * uh.field_b);
                    var6 = 16724787;
                    var7 = oj.a((byte) 47, this.field_f);
                    if (var5 < 0) {
                        statePc = 20;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (wf.field_c.field_f.field_i <= var5) {
                        statePc = 20;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (!this.a(var7, param0 + 22725, var5)) {
                        statePc = 18;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (6 != this.field_f) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (this.a(var5, var7, (byte) -40) == 0) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var6 = 65399;
                    if (var20 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if ((wf.field_c.field_f.field_o[var5] ^ -1) != -8) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var6 = 16777011;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    var8 = 0;
                    if (var6 != 65399) {
                        statePc = 37;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (wf.field_c.field_e[0].b(true) < ui.field_a[this.field_f][0]) {
                        statePc = 36;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (this.field_f != 0) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var8 = 10;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (this.field_f != 1) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var8 = 8;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (-3 != (this.field_f ^ -1)) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var8 = 20;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if ((this.field_f ^ -1) == -4) {
                        statePc = 30;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var8 = 6;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (this.field_f == 4) {
                        statePc = 33;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var8 = 30;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (5 != this.field_f) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var8 = 6;
                    if (var20 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var6 = 16724787;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (var6 != 16777011) {
                        statePc = 41;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var25 = wf.field_c.a(var5, param0 ^ 123);
                    if (var25 == null) {
                        statePc = 41;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (6 == var25.field_C) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var4 = -(ol.field_e / 2) + ol.field_e * var25.field_h + (240 - this.field_h);
                    var3 = -(ol.field_e / 2) + ol.field_e * var25.field_g + 320 + -this.field_t;
                    var8 = var25.field_l;
                    var5 = wf.field_c.field_f.field_c * var25.field_h + var25.field_g;
                    var7 = oj.a((byte) 47, var25.field_C);
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    var26 = new hj(64, 64);
                    var26.d();
                    if ((this.field_f ^ -1) != -1) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    hf.field_g[0].a(32 + ol.field_e / 2, 27 + ol.field_e / 2, 0, 1300);
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if ((this.field_f ^ -1) != -2) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    hf.field_g[7].a(32 - -ol.field_e, ol.field_e + 27, 0, 1950);
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (-3 != (this.field_f ^ -1)) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    hf.field_g[14].a(32 + ol.field_e, ol.field_e + 27, 0, 1950);
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (3 != this.field_f) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    hf.field_g[21].a(ol.field_e / 2 + 32, 27 - -(ol.field_e / 2), 0, 1300);
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (4 != this.field_f) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    hf.field_g[28].a(32 - -(ol.field_e * 3 / 2), 27 - -(3 * ol.field_e / 2), 0, 2600);
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (-6 != (this.field_f ^ -1)) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    hf.field_g[35].a(ol.field_e + 32, ol.field_e + 27, 0, 1950);
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (6 != this.field_f) {
                        statePc = 55;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    hf.field_g[42].a(ol.field_e / 2 + 32, ol.field_e / 2 + 27, 0, 1300);
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    var10 = 0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (var10 >= var26.field_v.length) {
                        statePc = 60;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var11 = var26.field_v[var10];
                    var12 = 255 & var11 | (var11 & 65280) >> -848353848 | var11 >> 1272784112 & 255;
                    var26.field_v[var10] = vi.a(16711680, var12 * vi.a(var6, 16711680) / 255) + (vi.a(var12 * vi.a(65280, var6) / 255, 65280) - -vi.a(255, var12 * vi.a(255, var6) / 255));
                    var10++;
                    if (var20 != 0) {
                        statePc = 61;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (var20 == 0) {
                        statePc = 56;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    cb.field_a.a(-40);
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    if (16777011 != var6) {
                        statePc = 63;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var26.c(var3 + -32, -32 + var4);
                    if (this.field_f != 6) {
                        statePc = 74;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (!this.a(var7, 22727, var5)) {
                        statePc = 74;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var10 = this.a(var5, var7, (byte) -64);
                    var11 = 255 & var10;
                    if (0 >= var11) {
                        statePc = 67;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    var12 = 320 + (ol.field_e * (var11 + eh.field_a) + (-(ol.field_e / 2) + -this.field_t));
                    var13 = -this.field_h + (ol.field_e * uh.field_b + (240 - ol.field_e / 2));
                    var26.c(-32 + var12, var13 - 32);
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    var12 = (65280 & var10) >> 582179656;
                    if (-1 <= (var12 ^ -1)) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var13 = (-var12 + eh.field_a) * ol.field_e + (320 - (ol.field_e / 2 + this.field_t));
                    var14_int = -this.field_h + (-(ol.field_e / 2) + 240 + uh.field_b * ol.field_e);
                    var26.c(-32 + var13, var14_int - 32);
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    var13 = var10 >> -2138413392 & 255;
                    if ((var13 ^ -1) >= -1) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var14_int = -this.field_t + (-(ol.field_e / 2) + ol.field_e * eh.field_a) + 320;
                    var15 = -this.field_h + ((var13 + uh.field_b) * ol.field_e + 240) + -(ol.field_e / 2);
                    var26.c(-32 + var14_int, -32 + var15);
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    var14_int = (var10 & -16777216) >> -1961284936;
                    if (var14_int > 0) {
                        statePc = 73;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var15 = ol.field_e * eh.field_a - -320 + -(ol.field_e / 2) - this.field_t;
                    var16 = -this.field_h + 240 + ((-var14_int + uh.field_b) * ol.field_e + -(ol.field_e / 2));
                    var26.c(-32 + var15, -32 + var16);
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (-1 <= (var8 ^ -1)) {
                        statePc = 87;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var10 = ol.field_e;
                    var12 = 0;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    if (var12 >= 16) {
                        statePc = 80;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var12++;
                    if (var20 != 0) {
                        statePc = 87;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (var20 == 0) {
                        statePc = 76;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var33 = new int[256];
                    var27 = var33;
                    var11_ref_int__ = var27;
                    var4 = var4 + (var7 - 1) * var10;
                    var12 = 0;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    if (var12 >= 4) {
                        statePc = 85;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var11_ref_int__[4 - var12] = -(var12 * 4112) - (-32896 - 2097152 * (4 - var12));
                    var11_ref_int__[4 - -var12] = 32896 - (4112 * var12 - -(var12 * 2097152) - 8388608);
                    var12++;
                    if (var20 != 0) {
                        statePc = 86;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (var20 == 0) {
                        statePc = 81;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var3 = var3 + var10 * (var7 + -1);
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    ul.a(var3 << 1997568868, var4 << 209319428, var10 * var8 << -1559761852, 32, var33);
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    var3_ref_kb = (kb) ((Object) wf.field_c.field_o.b((byte) 116));
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    if (var3_ref_kb == null) {
                        statePc = 92;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var3_ref_kb.a(this.field_t, this.field_h, param0 + -10);
                    var3_ref_kb = (kb) ((Object) wf.field_c.field_o.d(param0 + 851));
                    if (var20 != 0) {
                        statePc = 94;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (var20 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var3_ref_kb = (kb) ((Object) wf.field_c.field_o.b((byte) 122));
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    if (var3_ref_kb == null) {
                        statePc = 100;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    stackIn_473_0 = -7;
                    stackIn_96_0 = stackIn_473_0;
                    stackIn_473_1 = var3_ref_kb.field_C ^ -1;
                    stackIn_96_1 = stackIn_473_1;
                    if (var20 != 0) {
                        statePc = 473;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (stackIn_96_0 == stackIn_96_1) {
                        statePc = 98;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var4 = -this.field_t + var3_ref_kb.field_g * ol.field_e + 320;
                    var5 = 240 + ol.field_e * var3_ref_kb.field_h - this.field_h;
                    hf.field_g[1 - -(7 * var3_ref_kb.field_C)].a(var4, var5 - 5, 0, 1300);
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    var3_ref_kb = (kb) ((Object) wf.field_c.field_o.d(853));
                    if (var20 == 0) {
                        statePc = 94;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    var35 = (pd) ((Object) wf.field_c.field_r.b((byte) 127));
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    if (var35 == null) {
                        statePc = 105;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var35.a(this.field_t, (byte) 86, this.field_h);
                    var35 = (pd) ((Object) wf.field_c.field_r.d(853));
                    if (var20 != 0) {
                        statePc = 129;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (var20 == 0) {
                        statePc = 101;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    var3_ref_kb = (kb) ((Object) wf.field_c.field_o.b((byte) 114));
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    if (var3_ref_kb == null) {
                        statePc = 113;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    stackIn_130_0 = var3_ref_kb.field_C ^ -1;
                    stackIn_108_0 = stackIn_130_0;
                    if (var20 != 0) {
                        statePc = 130;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    stackIn_109_0 = stackIn_108_0;
                    stackIn_109_1 = -6;
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    if (stackIn_109_0 != stackIn_109_1) {
                        statePc = 112;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    var4 = var3_ref_kb.f(100);
                    if ((var4 ^ -1) >= -1) {
                        statePc = 112;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    var5 = ol.field_e / 2 + -this.field_t + var3_ref_kb.field_g * ol.field_e + 320;
                    var6 = -24 + ol.field_e * var3_ref_kb.field_h + (-this.field_h + 240);
                    ob.field_I.c(Integer.toString(var4), var5, var6, 16777215, 0);
                    var3_ref_kb.a(this.field_t, (byte) -108, this.field_h);
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    var3_ref_kb = (kb) ((Object) wf.field_c.field_o.d(853));
                    if (var20 == 0) {
                        statePc = 106;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    var36 = (me) ((Object) wf.field_c.field_h.b((byte) 114));
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    if (var36 == null) {
                        statePc = 118;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var36.a(this.field_t, this.field_h, (byte) 102);
                    var36 = (me) ((Object) wf.field_c.field_h.d(853));
                    if (var20 != 0) {
                        statePc = 120;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    if (var20 == 0) {
                        statePc = 114;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if (-1 > (l.field_c ^ -1)) {
                        statePc = 120;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 120: {
                    var3 = 16711680;
                    if ((4 & l.field_c) == 0) {
                        statePc = 122;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var3 = 16729156;
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    var4 = 8 + jd.field_c.a(hd.field_j);
                    if ((var4 / 2 ^ -1) < (wl.field_a ^ -1)) {
                        statePc = 125;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 125: {
                    wl.field_a = var4 / 2;
                    statePc = 126;
                    continue stateLoop;
                }
                case 126: {
                    if ((-(var4 / 2) + 640 ^ -1) <= (wl.field_a ^ -1)) {
                        statePc = 128;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    wl.field_a = -(var4 / 2) + 640;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    ul.g(-8 + wl.field_a + -(var4 / 2), md.field_f - 16, 16 + var4, 24, 16777215, 192);
                    ul.d(wl.field_a - (var4 / 2 - -8), md.field_f - 16, var4 + 16, 24, 0, 192);
                    jd.field_c.c(hd.field_j, -1 + wl.field_a, md.field_f, 0, 0);
                    jd.field_c.c(hd.field_j, wl.field_a, md.field_f + -1, 0, 0);
                    jd.field_c.c(hd.field_j, wl.field_a, md.field_f, var3, -1);
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    stackIn_130_0 = 0;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    var3 = stackIn_130_0;
                    var4_ref_pd = (pd) ((Object) wf.field_c.field_r.b((byte) -18));
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    if (var4_ref_pd == null) {
                        statePc = 137;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    stackIn_138_0 = -1;
                    stackIn_133_0 = stackIn_138_0;
                    stackIn_138_1 = var4_ref_pd.field_o ^ -1;
                    stackIn_133_1 = stackIn_138_1;
                    if (var20 != 0) {
                        statePc = 138;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    if (stackIn_133_0 > stackIn_133_1) {
                        statePc = 135;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 135: {
                    var3 = var3 + var4_ref_pd.field_o;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    var4_ref_pd = (pd) ((Object) wf.field_c.field_r.d(param0 + 851));
                    if (var20 == 0) {
                        statePc = 131;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    em.c((byte) 67);
                    i.field_a.b(0, 0);
                    hc.field_i.b(0, 358);
                    ul.e(0, 0, param0, 480);
                    ul.a(0, 0, 640, 480, 11184810, 4605510);
                    ul.e(638, 0, 640, 480);
                    ul.a(0, 0, 640, 480, 11184810, 4605510);
                    ul.c();
                    stackIn_138_0 = 2;
                    stackIn_138_1 = 2;
                    statePc = 138;
                    continue stateLoop;
                }
                case 138: {
                    ul.d(stackIn_138_0, stackIn_138_1, 636, 476, 0);
                    array$0 = new String[13];
                    stackIn_140_0 = (String[]) (array$0);
                    stackIn_139_0 = stackIn_140_0;
                    stackIn_140_1 = (String[]) (array$0);
                    stackIn_139_1 = stackIn_140_1;
                    stackIn_140_2 = 7;
                    stackIn_139_2 = stackIn_140_2;
                    if (!ok.a(0, false)) {
                        statePc = 140;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    stackIn_141_0 = (String[]) ((Object) stackIn_139_0);
                    stackIn_141_1 = (String[]) ((Object) stackIn_139_1);
                    stackIn_141_2 = stackIn_139_2;
                    stackIn_141_3 = jl.field_f;
                    statePc = 141;
                    continue stateLoop;
                }
                case 140: {
                    stackIn_141_0 = (String[]) ((Object) stackIn_140_0);
                    stackIn_141_1 = (String[]) ((Object) stackIn_140_1);
                    stackIn_141_2 = stackIn_140_2;
                    stackIn_141_3 = uh.field_c;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    stackIn_141_1[stackIn_141_2] = stackIn_141_3;
                    stackIn_141_0[8] = bk.field_b;
                    stackIn_141_0[9] = k.field_a;
                    stackIn_141_0[10] = bi.field_a;
                    stackIn_141_0[11] = bi.field_a;
                    stackIn_141_0[12] = od.field_a;
                    var4_ref_String__ = stackIn_141_0;
                    ul.e(177, 0, 462, 480);
                    var5 = -79 + 79 * wf.field_c.field_x;
                    if (wf.field_c.field_x <= 0) {
                        statePc = 143;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    stackIn_144_0 = 1;
                    statePc = 144;
                    continue stateLoop;
                }
                case 143: {
                    stackIn_144_0 = 0;
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    var6 = stackIn_144_0;
                    if (0 >= wf.field_c.field_y) {
                        statePc = 146;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    var5 = var5 - wf.field_c.field_y * 79 / 50;
                    var6 = 0;
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    if (var3 == 0) {
                        statePc = 148;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var6 = 0;
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    var7 = 39;
                    ad.field_e.c(-var7 + -(var5 % ad.field_e.field_s), 358);
                    ad.field_e.c(-(var5 % ad.field_e.field_s) - (var7 + -ad.field_e.field_s), 358);
                    if (var6 == 0) {
                        statePc = 155;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    var8 = 276;
                    var9 = 358;
                    var10 = 79;
                    var11 = 33;
                    ul.a(var8 - 8, var9 + -8, var10 + 16, var11 - -16, 8, 16776960, 64);
                    ul.a(var8 - 7, -7 + var9, 14 + var10, var11 - -14, 8, 16776960, 64);
                    ul.a(var8 + -6, -6 + var9, 12 + var10, 12 + var11, 8, 16776960, 64);
                    ul.a(-5 + var8, var9 - 5, var10 - -10, 10 + var11, 8, 16776960, 64);
                    if ((wf.field_c.field_x % 11 ^ -1) == -1) {
                        statePc = 153;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    ul.a(var8, var9, var10, var11, 8947848, 65280);
                    if (var20 == 0) {
                        statePc = 154;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    ul.a(var8, var9, var10, var11, 8947848, 16711680);
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    gk.field_a.e(var8, var9, var10, var11, 64);
                    var8--;
                    var11 += 2;
                    var10 += 2;
                    var9--;
                    ul.d(var8, var9, var10, var11, 0);
                    var10 += 2;
                    var8--;
                    var11 += 2;
                    var9--;
                    ul.d(var8, var9, var10, var11, 11184810);
                    var9--;
                    var11 += 2;
                    var8--;
                    var10 += 2;
                    ul.d(var8, var9, var10, var11, 0);
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    var8 = 0;
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    if (var8 >= 99) {
                        statePc = 161;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var28 = var4_ref_String__[jc.field_f[this.field_b][var8]];
                    var9_ref_String = var28;
                    stackIn_162_0 = 10;
                    stackIn_158_0 = stackIn_162_0;
                    stackIn_162_1 = var8 % 11;
                    stackIn_158_1 = stackIn_162_1;
                    if (var20 != 0) {
                        statePc = 162;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if (stackIn_158_0 != stackIn_158_1) {
                        statePc = 160;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    var9_ref_String = t.a(-415993727, new String[]{var28}, ia.field_e);
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    cc.field_t.a(Integer.toString(var8 - -1), -4 + -var5 + (320 + 79 * var8), 387, 0, -1, 128);
                    ob.field_I.a(var9_ref_String, -4 + -var5 + (320 - -(79 * var8)) - 39 - 1, 358, 76, 33, 0, 0, 1, 1, 12);
                    ob.field_I.a(var9_ref_String, -39 + 79 * var8 + (-var5 + 320) - 4, 357, 76, 33, 0, 0, 1, 1, 12);
                    ob.field_I.a(var9_ref_String, -43 + (79 * var8 + -var5 + 320), 358, 76, 33, 16777215, -1, 1, 1, 12);
                    var8++;
                    if (var20 == 0) {
                        statePc = 156;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    ul.c();
                    ob.field_I.c(Integer.toString(wf.field_c.field_x), 111, 29, 0, 0);
                    ob.field_I.c(Integer.toString(wf.field_c.field_x), 110, 30, 0, 0);
                    ob.field_I.c(Integer.toString(wf.field_c.field_x), 111, 30, 16777215, -1);
                    stackIn_162_0 = -wf.field_c.field_i + wf.field_c.field_g;
                    stackIn_162_1 = 50;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    var4 = stackIn_162_0 / stackIn_162_1;
                    if ((var4 ^ -1) > -1) {
                        statePc = 164;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 164: {
                    var4 = 0;
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    ob.field_I.a(Integer.toString(var4), 200, 24, 16777215, -1);
                    if (0 >= wf.field_c.field_e[0].field_f) {
                        statePc = 169;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    ob.field_I.b(t.a(-415993727, new String[]{Integer.toString(wf.field_c.field_e[0].field_d)}, ke.field_a), 400, 32, 16777215, -1);
                    var4 = 32;
                    var5 = 526;
                    if ((wj.field_m ^ -1) != -2) {
                        statePc = 168;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    var5 = 465;
                    var4 = 48;
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    jd.field_c.b(t.a(-415993727, new String[]{Integer.toString(wf.field_c.field_e[0].field_f)}, rl.field_d), var5, var4, 16777215, -1);
                    if (var20 == 0) {
                        statePc = 170;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    ob.field_I.b(t.a(-415993727, new String[]{Integer.toString(wf.field_c.field_e[0].field_d)}, ke.field_a), 400, 32, 16777215, -1);
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    var31 = new String[][]{new String[]{jg.field_l, jg.field_l + " I", jg.field_l + " II", jg.field_l + " III", nd.field_f, ob.field_L}, new String[]{am.field_g, am.field_g + " I", am.field_g + " II", am.field_g + " III", p.field_e, kd.field_b}, new String[]{oj.field_o, oj.field_o + " I", oj.field_o + " II", oj.field_o + " III", ug.field_o, cd.field_r}, new String[]{fd.field_g, fd.field_g + " I", fd.field_g + " II", fd.field_g + " III", b.field_q, ua.field_b}, new String[]{q.field_c, q.field_c + " I", q.field_c + " II", q.field_c + " III", lj.field_B, ob.field_E}, new String[]{kg.field_l, kg.field_l + " I", kg.field_l + " II", kg.field_l + " III", de.field_c, ua.field_d}, new String[]{gl.field_c, gl.field_c, gl.field_c + " II", gl.field_c + " III", lj.field_B, ob.field_E}};
                    var5 = this.field_f;
                    var6 = 0;
                    var7 = uh.field_b * wf.field_c.field_f.field_c + eh.field_a;
                    if (var7 < 0) {
                        statePc = 176;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    if ((var7 ^ -1) <= (wf.field_c.field_f.field_i ^ -1)) {
                        statePc = 176;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    if ((wf.field_c.field_f.field_o[var7] ^ -1) != -8) {
                        statePc = 176;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    var8_ref_kb = wf.field_c.a(var7, 126);
                    if (var8_ref_kb != null) {
                        statePc = 175;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 175: {
                    var6 = var8_ref_kb.field_F - -1;
                    var5 = var8_ref_kb.field_C;
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    var7 = 0;
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    if ((var7 ^ -1) <= -6) {
                        statePc = 235;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    var8 = var7;
                    stackIn_236_0 = 3;
                    stackIn_179_0 = stackIn_236_0;
                    stackIn_236_1 = this.field_b;
                    stackIn_179_1 = stackIn_236_1;
                    if (var20 != 0) {
                        statePc = 236;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    if (stackIn_179_0 >= stackIn_179_1) {
                        statePc = 184;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if (-4 == (var7 ^ -1)) {
                        statePc = 183;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    if (-5 != (var7 ^ -1)) {
                        statePc = 184;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    var8 = 6;
                    if (var20 == 0) {
                        statePc = 184;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    var8 = 5;
                    statePc = 184;
                    continue stateLoop;
                }
                case 184: {
                    var9 = 56;
                    var10 = ck.field_c[0].field_s;
                    var11 = 320 + -(var10 / 2) - (var9 * 2 - var9 * var7);
                    var12 = 405;
                    if (-1 < (jk.field_j[var8] ^ -1)) {
                        statePc = 195;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    ck.field_c[1].c(var11, var12);
                    if ((this.field_f ^ -1) != (var8 ^ -1)) {
                        statePc = 187;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    ul.b(var11, var12, var10, var10, 3, 16777215, 128);
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    if ((ua.field_a ^ -1) > (var11 ^ -1)) {
                        statePc = 196;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    if ((var12 ^ -1) < (vl.field_d ^ -1)) {
                        statePc = 196;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    if (ua.field_a >= var10 + var11) {
                        statePc = 196;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if ((vl.field_d ^ -1) <= (var12 - -var10 ^ -1)) {
                        statePc = 196;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    ul.d(var11 + 6, var12 - -6, var10 - 12, var10 + -12, 16777215, 128);
                    var6 = 0;
                    var5 = var8;
                    if (of.field_G != 1) {
                        statePc = 196;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    if (var8 == this.field_f) {
                        statePc = 196;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    this.field_f = var8;
                    gk.a(mh.field_a[2], (byte) -11);
                    if (var20 == 0) {
                        statePc = 196;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    ck.field_c[0].c(var11, var12);
                    statePc = 196;
                    continue stateLoop;
                }
                case 196: {
                    ul.e(var11 + 6, var12, var11 + 46, 46 + var12);
                    if (jk.field_j[var8] < 3) {
                        statePc = 218;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    var12 += 10;
                    var11 += 10;
                    hf.field_g[0 - -(7 * var8)].d(var11, var12);
                    if ((var8 ^ -1) < -4) {
                        statePc = 199;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    var12 += 4;
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    if (3 != var8) {
                        statePc = 201;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    var12 -= 4;
                    statePc = 201;
                    continue stateLoop;
                }
                case 201: {
                    if (var8 != 5) {
                        statePc = 203;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    var29 = hf.field_g[7 * var8 + 6];
                    var13_ref_hj = var29;
                    var13_ref_hj.a(var29.field_s << -1325038525, var29.field_t << 637088483, 16 + var11 << 265044900, 10 + var12 << 1598848932, wf.field_c.field_i * 1000, 2048);
                    if (var20 == 0) {
                        statePc = 204;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    hf.field_g[7 * var8 + 6].a(512, 128, var11 + 16 << 1117748548, var12 - -6 << -446087644, (int)(Math.sin(0.1 * (double)wf.field_c.field_i + (double)var8) * 10000.0), 2048);
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    if ((var8 ^ -1) != -6) {
                        statePc = 206;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    var12 -= 2;
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    if (var8 <= 3) {
                        statePc = 208;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 208: {
                    var12 -= 4;
                    statePc = 209;
                    continue stateLoop;
                }
                case 209: {
                    if ((var8 ^ -1) == -3) {
                        statePc = 211;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 211: {
                    var12 -= 4;
                    statePc = 212;
                    continue stateLoop;
                }
                case 212: {
                    if (-4 != (var8 ^ -1)) {
                        statePc = 214;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    var12 -= 2;
                    statePc = 214;
                    continue stateLoop;
                }
                case 214: {
                    if ((var8 ^ -1) == -5) {
                        statePc = 216;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 216: {
                    var12 -= 8;
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    hf.field_g[7 * var8 + 1].d(var11, var12);
                    if (var20 == 0) {
                        statePc = 234;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    if (0 <= jk.field_j[var8]) {
                        statePc = 221;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    al.field_d.a(10 + var11, var12 - -10);
                    if (var20 == 0) {
                        statePc = 234;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    var11 += 10;
                    var12 += 10;
                    hf.field_g[var8 * 7 + 0].d(var11, var12);
                    if ((var8 ^ -1) == -6) {
                        statePc = 224;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    hf.field_g[var8 * 7 + 2].a(512, 256, 16 + var11 << -171477660, 6 + var12 << 1777914180, (int)(Math.sin(0.1 * (double)wf.field_c.field_i + (double)var8) * 10000.0), 2048);
                    if (var20 == 0) {
                        statePc = 225;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    var30 = hf.field_g[2 + 7 * var8];
                    var13_ref_hj = var30;
                    var13_ref_hj.a(var30.field_s << 1827844739, var30.field_t << 910739971, var11 - -16 << -235870204, var12 + 10 << 211117348, wf.field_c.field_i * 1000, 2048);
                    statePc = 225;
                    continue stateLoop;
                }
                case 225: {
                    if ((var8 ^ -1) != -3) {
                        statePc = 227;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    var12 -= 4;
                    statePc = 227;
                    continue stateLoop;
                }
                case 227: {
                    if (3 == var8) {
                        statePc = 229;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 229: {
                    var12 -= 6;
                    statePc = 230;
                    continue stateLoop;
                }
                case 230: {
                    if (4 == var8) {
                        statePc = 232;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 232: {
                    var12 -= 8;
                    statePc = 233;
                    continue stateLoop;
                }
                case 233: {
                    hf.field_g[var8 * 7 + 1].d(var11, var12);
                    statePc = 234;
                    continue stateLoop;
                }
                case 234: {
                    ul.c();
                    var7++;
                    if (var20 == 0) {
                        statePc = 177;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    ob.field_I.c(var31[var5][var6], 549, 380, 16777215, -1);
                    stackIn_236_0 = 0;
                    stackIn_236_1 = var5;
                    statePc = 236;
                    continue stateLoop;
                }
                case 236: {
                    if (stackIn_236_0 == stackIn_236_1) {
                        statePc = 242;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    if ((var5 ^ -1) == -2) {
                        statePc = 242;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    if (var5 == 4) {
                        statePc = 242;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    if (var5 == 3) {
                        statePc = 241;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    stackIn_243_0 = 1;
                    statePc = 243;
                    continue stateLoop;
                }
                case 241: {
                    stackIn_243_0 = 2;
                    statePc = 243;
                    continue stateLoop;
                }
                case 242: {
                    stackIn_243_0 = 0;
                    statePc = 243;
                    continue stateLoop;
                }
                case 243: {
                    var7 = stackIn_243_0;
                    if ((var5 ^ -1) != -7) {
                        statePc = 245;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    var7 = 3;
                    statePc = 245;
                    continue stateLoop;
                }
                case 245: {
                    if (5 != var5) {
                        statePc = 247;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    var7 = 0;
                    statePc = 247;
                    continue stateLoop;
                }
                case 247: {
                    var8 = 1;
                    var9 = 5;
                    var10 = 25;
                    var11 = 40;
                    var12 = 30;
                    var13 = 0;
                    if (-3 == (var5 ^ -1)) {
                        statePc = 254;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    if ((var5 ^ -1) == -4) {
                        statePc = 253;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    if (var5 != 4) {
                        statePc = 251;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    var12 = 30;
                    var13 = -10;
                    var11 = 45;
                    if (var20 == 0) {
                        statePc = 255;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    if ((var5 ^ -1) != -6) {
                        statePc = 255;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    var12 = 24;
                    var13 = 0;
                    var11 = 37;
                    if (var20 == 0) {
                        statePc = 255;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    var12 = 20;
                    var13 = -10;
                    if (var20 == 0) {
                        statePc = 255;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    var12 = 25;
                    var13 = -10;
                    statePc = 255;
                    continue stateLoop;
                }
                case 255: {
                    if ((var5 ^ -1) != -1) {
                        statePc = 265;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    var8 = 5;
                    var9 = 30;
                    if ((var6 ^ -1) == -3) {
                        statePc = 264;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    if ((var6 ^ -1) != -4) {
                        statePc = 259;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    var8 = 20;
                    if (var20 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    if (var6 == 4) {
                        statePc = 263;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    if (-6 == (var6 ^ -1)) {
                        statePc = 262;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 262: {
                    var8 = 40;
                    if (var20 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    var8 = 25;
                    if (var20 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    var8 = 10;
                    if (var20 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    if ((var5 ^ -1) != -2) {
                        statePc = 275;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    var8 = 12;
                    var9 = 8;
                    if (-3 == (var6 ^ -1)) {
                        statePc = 274;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    if ((var6 ^ -1) != -4) {
                        statePc = 269;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    var9 = 12;
                    var8 = 22;
                    if (var20 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    if (4 == var6) {
                        statePc = 273;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 270: {
                    if (-6 == (var6 ^ -1)) {
                        statePc = 272;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 272: {
                    var9 = 16;
                    var8 = 64;
                    if (var20 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    var9 = 14;
                    var8 = 32;
                    if (var20 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    var9 = 10;
                    var8 = 16;
                    if (var20 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    if (2 == var5) {
                        statePc = 304;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    if (-4 == (var5 ^ -1)) {
                        statePc = 295;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    if (var5 != 4) {
                        statePc = 286;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    var8 = 200;
                    var9 = 30;
                    if (-3 != (var6 ^ -1)) {
                        statePc = 280;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    var8 = 250;
                    if (var20 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    if ((var6 ^ -1) == -4) {
                        statePc = 285;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    if ((var6 ^ -1) != -5) {
                        statePc = 283;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 282: {
                    var8 = 500;
                    if (var20 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    if (var6 != 5) {
                        statePc = 312;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    var8 = 1000;
                    if (var20 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    var8 = 333;
                    if (var20 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 286: {
                    if (-6 != (var5 ^ -1)) {
                        statePc = 312;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    var8 = 5;
                    var10 = 25;
                    var9 = 6;
                    if (-3 == (var6 ^ -1)) {
                        statePc = 294;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    if (3 == var6) {
                        statePc = 293;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    if (var6 == 4) {
                        statePc = 292;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 290: {
                    if (-6 != (var6 ^ -1)) {
                        statePc = 312;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    var10 = 125;
                    var8 = 80;
                    if (var20 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    var10 = 100;
                    var8 = 40;
                    if (var20 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 293: {
                    var8 = 20;
                    var10 = 75;
                    if (var20 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    var10 = 50;
                    var8 = 10;
                    if (var20 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    var9 = 6;
                    var8 = 1;
                    if (var6 != 2) {
                        statePc = 297;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    var8 = 2;
                    if (var20 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    if (-4 == (var6 ^ -1)) {
                        statePc = 303;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    if (4 != var6) {
                        statePc = 300;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 299: {
                    var8 = 4;
                    if (var20 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 300: {
                    if (5 == var6) {
                        statePc = 302;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 302: {
                    var8 = 5;
                    if (var20 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 303: {
                    var8 = 3;
                    if (var20 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    var9 = 20;
                    var8 = 40;
                    if ((var6 ^ -1) == -3) {
                        statePc = 311;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 305: {
                    if (-4 == (var6 ^ -1)) {
                        statePc = 310;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 306: {
                    if ((var6 ^ -1) != -5) {
                        statePc = 308;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    var8 = 80;
                    var9 = 25;
                    if (var20 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 308: {
                    if (var6 != 5) {
                        statePc = 312;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    var8 = 100;
                    var9 = 30;
                    if (var20 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    var8 = 70;
                    if (var20 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    var8 = 50;
                    statePc = 312;
                    continue stateLoop;
                }
                case 312: {
                    hf.field_g[7 * var5].c(469, 405);
                    if (-7 == (var5 ^ -1)) {
                        statePc = 319;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 313: {
                    var14_int = 4000;
                    if (-6 == (var5 ^ -1)) {
                        statePc = 315;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 315: {
                    var14_int = 102100;
                    statePc = 316;
                    continue stateLoop;
                }
                case 316: {
                    var15 = var6 + var5 * 7 + 1;
                    if (var6 != 0) {
                        statePc = 318;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    var15++;
                    statePc = 318;
                    continue stateLoop;
                }
                case 318: {
                    var16 = var11 + 465;
                    var17 = 405 + var12;
                    hf.field_g[var15].a(-85, var16, var17, var14_int, 4096);
                    statePc = 319;
                    continue stateLoop;
                }
                case 319: {
                    hf.field_g[7 * var5 + 1].c(469, 405 - -var13);
                    if (var5 == 6) {
                        statePc = 332;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 320: {
                    if ((var7 ^ -1) != -1) {
                        statePc = 322;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 321: {
                    jd.field_c.b(sd.field_d, 530, 420, 16777215, 0);
                    statePc = 322;
                    continue stateLoop;
                }
                case 322: {
                    if (1 != var7) {
                        statePc = 324;
                    } else {
                        statePc = 323;
                    }
                    continue stateLoop;
                }
                case 323: {
                    jd.field_c.b(ei.field_b, 530, 420, 16777215, 0);
                    statePc = 324;
                    continue stateLoop;
                }
                case 324: {
                    if (var7 == 2) {
                        statePc = 326;
                    } else {
                        statePc = 327;
                    }
                    continue stateLoop;
                }
                case 326: {
                    jd.field_c.b(t.field_k, 530, 420, 16777215, 0);
                    statePc = 327;
                    continue stateLoop;
                }
                case 327: {
                    jd.field_c.a(Integer.toString(var8), 625, 420, 16777215, 0);
                    if ((var5 ^ -1) != -6) {
                        statePc = 330;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    jd.field_c.b(ca.field_a, 530, 440, 16777215, 0);
                    jd.field_c.a(Integer.toString(var10), 625, 440, 16777215, 0);
                    if (var20 == 0) {
                        statePc = 333;
                    } else {
                        statePc = 330;
                    }
                    continue stateLoop;
                }
                case 330: {
                    jd.field_c.b(ed.field_e, 530, 440, 16777215, 0);
                    jd.field_c.a(Integer.toString(var9), 625, 440, 16777215, 0);
                    if (var20 == 0) {
                        statePc = 333;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 332: {
                    jd.field_c.b(wg.field_n, 530, 420, 16777215, 0);
                    jd.field_c.b(ed.field_d, 530, 440, 16777215, 0);
                    statePc = 333;
                    continue stateLoop;
                }
                case 333: {
                    if (var6 <= jk.field_j[var5]) {
                        statePc = 335;
                    } else {
                        statePc = 338;
                    }
                    continue stateLoop;
                }
                case 335: {
                    var14_int = 16777215;
                    if ((wf.field_c.field_e[0].b(true) ^ -1) <= (ui.field_a[var5][var6] ^ -1)) {
                        statePc = 337;
                    } else {
                        statePc = 336;
                    }
                    continue stateLoop;
                }
                case 336: {
                    var14_int = 16711680;
                    statePc = 337;
                    continue stateLoop;
                }
                case 337: {
                    jd.field_c.a(Integer.toString(ui.field_a[var5][var6]), 625, 460, var14_int, 0);
                    jd.field_c.b(rh.field_a, 530, 460, var14_int, 0);
                    statePc = 338;
                    continue stateLoop;
                }
                case 338: {
                    if ((var6 ^ -1) <= -6) {
                        statePc = 339;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    if (-1 <= (wf.field_c.field_x ^ -1)) {
                        statePc = 391;
                    } else {
                        statePc = 340;
                    }
                    continue stateLoop;
                }
                case 340: {
                    var14_int = -1;
                    if (1 > wf.field_c.field_x) {
                        statePc = 344;
                    } else {
                        statePc = 341;
                    }
                    continue stateLoop;
                }
                case 341: {
                    if (wf.field_c.field_x < 100) {
                        statePc = 343;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 343: {
                    var14_int = jc.field_f[this.field_b][wf.field_c.field_x + -1];
                    statePc = 344;
                    continue stateLoop;
                }
                case 344: {
                    ul.e(8, 363, 172, 473);
                    if (0 > this.field_a) {
                        statePc = 348;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    if (-12 <= (this.field_a ^ -1)) {
                        statePc = 347;
                    } else {
                        statePc = 348;
                    }
                    continue stateLoop;
                }
                case 347: {
                    var15 = mg.a(this.field_a, (byte) -114);
                    ab.field_g[var15 * 12 + da.field_b / 10 % wh.field_a[var15]].c(hi.field_m + 43, 363);
                    statePc = 348;
                    continue stateLoop;
                }
                case 348: {
                    var15_ref = null;
                    if (var3 > 0) {
                        statePc = 358;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 349: {
                    var15_ref_String = nl.field_c;
                    if (-1 != (hi.field_m ^ -1)) {
                        statePc = 351;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 350: {
                    gk.a(mh.field_a[47], (byte) -11);
                    statePc = 351;
                    continue stateLoop;
                }
                case 351: {
                    if (hi.field_m < 0) {
                        statePc = 353;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 352: {
                    hi.field_m = hi.field_m + 10;
                    statePc = 353;
                    continue stateLoop;
                }
                case 353: {
                    if (hi.field_m >= 0) {
                        statePc = 356;
                    } else {
                        statePc = 354;
                    }
                    continue stateLoop;
                }
                case 354: {
                    if (149 <= (hi.field_m ^ -1)) {
                        statePc = 356;
                    } else {
                        statePc = 355;
                    }
                    continue stateLoop;
                }
                case 355: {
                    hi.field_m = hi.field_m - 10;
                    statePc = 356;
                    continue stateLoop;
                }
                case 356: {
                    if (hi.field_m <= 150) {
                        statePc = 378;
                    } else {
                        statePc = 357;
                    }
                    continue stateLoop;
                }
                case 357: {
                    hi.field_m = -150;
                    statePc = 378;
                    continue stateLoop;
                }
                case 358: {
                    var15_ref_String = t.a(param0 + -415993729, new String[]{Integer.toString(var3)}, d.field_h);
                    if (this.field_a == var14_int) {
                        statePc = 373;
                    } else {
                        statePc = 359;
                    }
                    continue stateLoop;
                }
                case 359: {
                    if (-1 != (hi.field_m ^ -1)) {
                        statePc = 361;
                    } else {
                        statePc = 360;
                    }
                    continue stateLoop;
                }
                case 360: {
                    gk.a(mh.field_a[47], (byte) -11);
                    statePc = 361;
                    continue stateLoop;
                }
                case 361: {
                    if (hi.field_m >= 0) {
                        statePc = 363;
                    } else {
                        statePc = 364;
                    }
                    continue stateLoop;
                }
                case 363: {
                    hi.field_m = hi.field_m + 10;
                    statePc = 364;
                    continue stateLoop;
                }
                case 364: {
                    if ((hi.field_m ^ -1) <= -1) {
                        statePc = 367;
                    } else {
                        statePc = 365;
                    }
                    continue stateLoop;
                }
                case 365: {
                    if ((hi.field_m ^ -1) >= 149) {
                        statePc = 367;
                    } else {
                        statePc = 366;
                    }
                    continue stateLoop;
                }
                case 366: {
                    hi.field_m = hi.field_m - 10;
                    statePc = 367;
                    continue stateLoop;
                }
                case 367: {
                    if (-151 > (hi.field_m ^ -1)) {
                        statePc = 369;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 369: {
                    hi.field_m = -150;
                    statePc = 370;
                    continue stateLoop;
                }
                case 370: {
                    if ((hi.field_m ^ -1) < 149) {
                        statePc = 378;
                    } else {
                        statePc = 371;
                    }
                    continue stateLoop;
                }
                case 371: {
                    gk.a(mh.field_a[46], (byte) -11);
                    this.field_a = var14_int;
                    if (var20 == 0) {
                        statePc = 378;
                    } else {
                        statePc = 373;
                    }
                    continue stateLoop;
                }
                case 373: {
                    if ((hi.field_m ^ -1) <= -1) {
                        statePc = 375;
                    } else {
                        statePc = 374;
                    }
                    continue stateLoop;
                }
                case 374: {
                    hi.field_m = hi.field_m + 10;
                    statePc = 375;
                    continue stateLoop;
                }
                case 375: {
                    if (0 < hi.field_m) {
                        statePc = 377;
                    } else {
                        statePc = 378;
                    }
                    continue stateLoop;
                }
                case 377: {
                    hi.field_m = hi.field_m - 10;
                    statePc = 378;
                    continue stateLoop;
                }
                case 378: {
                    ob.field_I.a(var15_ref_String, 14, 362, 158, 105, 0, 0, 1, 2, 18);
                    ob.field_I.a(var15_ref_String, 13, 363, 158, 105, 0, 0, 1, 2, 18);
                    ob.field_I.a(var15_ref_String, 14, 363, 158, 105, 16777215, -1, 1, 2, 18);
                    var16 = (wf.field_c.field_g - wf.field_c.field_i) / 50;
                    if (-1 >= (var16 ^ -1)) {
                        statePc = 380;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 379: {
                    var16 = 0;
                    statePc = 380;
                    continue stateLoop;
                }
                case 380: {
                    var15_ref_String = t.a(param0 ^ -415993725, new String[]{Integer.toString(var16)}, nb.field_p);
                    if ((hi.field_m ^ -1) == 149) {
                        statePc = 382;
                    } else {
                        statePc = 390;
                    }
                    continue stateLoop;
                }
                case 382: {
                    if (-1 == (wf.field_c.field_x % 11 ^ -1)) {
                        statePc = 385;
                    } else {
                        statePc = 383;
                    }
                    continue stateLoop;
                }
                case 383: {
                    if (0 < wf.field_c.field_x) {
                        statePc = 389;
                    } else {
                        statePc = 385;
                    }
                    continue stateLoop;
                }
                case 385: {
                    if (-1 == (wf.field_c.field_x ^ -1)) {
                        statePc = 389;
                    } else {
                        statePc = 386;
                    }
                    continue stateLoop;
                }
                case 386: {
                    if (!wf.field_c.field_r.c(param0 ^ -3086)) {
                        statePc = 390;
                    } else {
                        statePc = 387;
                    }
                    continue stateLoop;
                }
                case 387: {
                    if (wf.field_c.field_e[0].field_f > 0) {
                        statePc = 389;
                    } else {
                        statePc = 390;
                    }
                    continue stateLoop;
                }
                case 389: {
                    var15_ref_String = p.field_b;
                    ob.field_I.a(var15_ref_String, 14, Math.abs(hi.field_m) / 4 + 327, 158, 105, 0, 0, 1, 0, 16);
                    ob.field_I.a(var15_ref_String, 13, 328 + Math.abs(hi.field_m) / 4, 158, 105, 0, 0, 1, 0, 16);
                    ob.field_I.a(var15_ref_String, 14, Math.abs(hi.field_m) / 4 + 328, 158, 105, 16777215, -1, 1, 0, 16);
                    statePc = 390;
                    continue stateLoop;
                }
                case 390: {
                    ul.c();
                    if (var20 == 0) {
                        statePc = 395;
                    } else {
                        statePc = 391;
                    }
                    continue stateLoop;
                }
                case 391: {
                    var32 = jm.field_c;
                    var14 = var32;
                    var14 = var32;
                    ob.field_I.a(var32, 14, 332, 158, 105, 0, 0, 1, 2, 18);
                    ob.field_I.a(var32, 13, 333, 158, 105, 0, 0, 1, 2, 18);
                    ob.field_I.a(var32, 14, 333, 158, 105, 16777215, -1, 1, 2, 18);
                    var15 = (wf.field_c.field_g + -wf.field_c.field_i) / 50;
                    if (0 > var15) {
                        statePc = 393;
                    } else {
                        statePc = 394;
                    }
                    continue stateLoop;
                }
                case 393: {
                    var15 = 0;
                    statePc = 394;
                    continue stateLoop;
                }
                case 394: {
                    var14 = t.a(param0 + -415993729, new String[]{Integer.toString(var15)}, nb.field_p);
                    statePc = 395;
                    continue stateLoop;
                }
                case 395: {
                    var37 = (oj) ((Object) wf.field_c.field_b.b((byte) 126));
                    statePc = 396;
                    continue stateLoop;
                }
                case 396: {
                    if (var37 == null) {
                        statePc = 398;
                    } else {
                        statePc = 397;
                    }
                    continue stateLoop;
                }
                case 397: {
                    var37.a((byte) 54, this.field_t, this.field_h);
                    var37 = (oj) ((Object) wf.field_c.field_b.d(param0 ^ 855));
                    if (var20 == 0) {
                        statePc = 396;
                    } else {
                        statePc = 398;
                    }
                    continue stateLoop;
                }
                case 398: {
                    var14 = "";
                    if (wf.field_c.field_e[0].b(true) >= 1000) {
                        statePc = 400;
                    } else {
                        statePc = 399;
                    }
                    continue stateLoop;
                }
                case 399: {
                    var14 = Integer.toString(wf.field_c.field_e[0].b(true));
                    if (var20 == 0) {
                        statePc = 403;
                    } else {
                        statePc = 400;
                    }
                    continue stateLoop;
                }
                case 400: {
                    if (-10000 < (wf.field_c.field_e[0].b(true) ^ -1)) {
                        statePc = 402;
                    } else {
                        statePc = 401;
                    }
                    continue stateLoop;
                }
                case 401: {
                    var14 = ci.field_m;
                    if (var20 == 0) {
                        statePc = 403;
                    } else {
                        statePc = 402;
                    }
                    continue stateLoop;
                }
                case 402: {
                    var14 = t.a(-415993727, new String[]{Integer.toString(wf.field_c.field_e[0].b(true) / 1000), Integer.toString(wf.field_c.field_e[0].b(true) / 100 % 10)}, rf.field_H);
                    statePc = 403;
                    continue stateLoop;
                }
                case 403: {
                    ob.field_I.c(var14, 362, 30, 0, 0);
                    ob.field_I.c(var14, 363, 29, 0, 0);
                    ob.field_I.c(var14, 363, 30, 16777215, -1);
                    if (0 == this.field_b) {
                        statePc = 406;
                    } else {
                        statePc = 404;
                    }
                    continue stateLoop;
                }
                case 404: {
                    if (-4 > (this.field_b ^ -1)) {
                        statePc = 406;
                    } else {
                        statePc = 414;
                    }
                    continue stateLoop;
                }
                case 406: {
                    al.field_d.a(598, 10);
                    if (df.field_f) {
                        statePc = 408;
                    } else {
                        statePc = 407;
                    }
                    continue stateLoop;
                }
                case 407: {
                    ul.i(614, 26, 16, 0, 128);
                    statePc = 408;
                    continue stateLoop;
                }
                case 408: {
                    if (ua.field_a < 598) {
                        statePc = 414;
                    } else {
                        statePc = 409;
                    }
                    continue stateLoop;
                }
                case 409: {
                    if (-11 < (vl.field_d ^ -1)) {
                        statePc = 414;
                    } else {
                        statePc = 410;
                    }
                    continue stateLoop;
                }
                case 410: {
                    if (ua.field_a > 630) {
                        statePc = 414;
                    } else {
                        statePc = 411;
                    }
                    continue stateLoop;
                }
                case 411: {
                    if ((vl.field_d ^ -1) >= -43) {
                        statePc = 413;
                    } else {
                        statePc = 414;
                    }
                    continue stateLoop;
                }
                case 413: {
                    ob.field_I.a(jg.field_n[25], 635, 49, 0, 0);
                    ob.field_I.a(jg.field_n[25], 634, 50, 0, 0);
                    ob.field_I.a(jg.field_n[25], 635, 50, 16777215, -1);
                    statePc = 414;
                    continue stateLoop;
                }
                case 414: {
                    if (1 == of.field_G) {
                        statePc = 416;
                    } else {
                        statePc = 415;
                    }
                    continue stateLoop;
                }
                case 415: {
                    this.field_j = false;
                    statePc = 416;
                    continue stateLoop;
                }
                case 416: {
                    if ((this.field_m ^ -1) == 0) {
                        statePc = 428;
                    } else {
                        statePc = 417;
                    }
                    continue stateLoop;
                }
                case 417: {
                    if (!df.field_f) {
                        statePc = 427;
                    } else {
                        statePc = 418;
                    }
                    continue stateLoop;
                }
                case 418: {
                    if ((this.field_b ^ -1) == -1) {
                        statePc = 421;
                    } else {
                        statePc = 419;
                    }
                    continue stateLoop;
                }
                case 419: {
                    if ((this.field_m ^ -1) > -17) {
                        statePc = 427;
                    } else {
                        statePc = 421;
                    }
                    continue stateLoop;
                }
                case 421: {
                    var15 = 300;
                    var16 = jd.field_c.a(sa.field_d[this.field_m], var15, 16);
                    var17 = -var15 + 640;
                    var18 = -var16 + 480 - 120;
                    var19 = 8;
                    ug.a(101, -(2 * var19) + var18, -(2 * var19) + var17, var16 - -(2 * var19), var15 - -(var19 * 2));
                    jd.field_c.a(sa.field_d[this.field_m], var17 - var19, -var19 + var18, var15, var16, 16777215, 0, 0, 1, 16);
                    if (ua.field_a < var17 - 2 * var19) {
                        statePc = 426;
                    } else {
                        statePc = 422;
                    }
                    continue stateLoop;
                }
                case 422: {
                    if ((vl.field_d ^ -1) > (-(var19 * 2) + var18 ^ -1)) {
                        statePc = 426;
                    } else {
                        statePc = 423;
                    }
                    continue stateLoop;
                }
                case 423: {
                    if ((ua.field_a ^ -1) <= (var15 + var17 ^ -1)) {
                        statePc = 426;
                    } else {
                        statePc = 424;
                    }
                    continue stateLoop;
                }
                case 424: {
                    if (var16 + var18 <= vl.field_d) {
                        statePc = 426;
                    } else {
                        statePc = 425;
                    }
                    continue stateLoop;
                }
                case 425: {
                    this.field_j = true;
                    statePc = 426;
                    continue stateLoop;
                }
                case 426: {
                    if (var20 == 0) {
                        statePc = 428;
                    } else {
                        statePc = 427;
                    }
                    continue stateLoop;
                }
                case 427: {
                    ob.field_I.c(pa.field_a[this.field_m], 320, 339, 0, 0);
                    ob.field_I.c(pa.field_a[this.field_m], 319, 340, 0, 0);
                    ob.field_I.c(pa.field_a[this.field_m], 320, 340, 16777215, -1);
                    statePc = 428;
                    continue stateLoop;
                }
                case 428: {
                    if (-1 <= (this.field_o ^ -1)) {
                        statePc = 467;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 429: {
                    if (wf.field_c.field_f.field_k <= 0) {
                        statePc = 455;
                    } else {
                        statePc = 430;
                    }
                    continue stateLoop;
                }
                case 430: {
                    if (wf.field_c.field_x < 90) {
                        statePc = 440;
                    } else {
                        statePc = 431;
                    }
                    continue stateLoop;
                }
                case 431: {
                    if (-51 >= (this.field_o ^ -1)) {
                        statePc = 433;
                    } else {
                        statePc = 432;
                    }
                    continue stateLoop;
                }
                case 432: {
                    stackIn_434_0 = 5 * this.field_o;
                    statePc = 434;
                    continue stateLoop;
                }
                case 433: {
                    stackIn_434_0 = 255;
                    statePc = 434;
                    continue stateLoop;
                }
                case 434: {
                    var15 = stackIn_434_0;
                    if (-101 < (this.field_o ^ -1)) {
                        statePc = 436;
                    } else {
                        statePc = 435;
                    }
                    continue stateLoop;
                }
                case 435: {
                    stackIn_437_0 = 255;
                    statePc = 437;
                    continue stateLoop;
                }
                case 436: {
                    stackIn_437_0 = 5 * this.field_o + -250;
                    statePc = 437;
                    continue stateLoop;
                }
                case 437: {
                    var16 = stackIn_437_0;
                    if (-1 >= (var16 ^ -1)) {
                        statePc = 439;
                    } else {
                        statePc = 438;
                    }
                    continue stateLoop;
                }
                case 438: {
                    var16 = 0;
                    statePc = 439;
                    continue stateLoop;
                }
                case 439: {
                    pj.field_u[0].c(0, 0, var15, var16);
                    if (var20 == 0) {
                        statePc = 464;
                    } else {
                        statePc = 440;
                    }
                    continue stateLoop;
                }
                case 440: {
                    if (50 > this.field_o) {
                        statePc = 442;
                    } else {
                        statePc = 441;
                    }
                    continue stateLoop;
                }
                case 441: {
                    stackIn_443_0 = 255;
                    statePc = 443;
                    continue stateLoop;
                }
                case 442: {
                    stackIn_443_0 = 5 * this.field_o;
                    statePc = 443;
                    continue stateLoop;
                }
                case 443: {
                    var15 = stackIn_443_0;
                    if (-101 < (this.field_o ^ -1)) {
                        statePc = 445;
                    } else {
                        statePc = 444;
                    }
                    continue stateLoop;
                }
                case 444: {
                    stackIn_446_0 = 255;
                    statePc = 446;
                    continue stateLoop;
                }
                case 445: {
                    stackIn_446_0 = -250 + this.field_o * 5;
                    statePc = 446;
                    continue stateLoop;
                }
                case 446: {
                    var16 = stackIn_446_0;
                    if (0 > var16) {
                        statePc = 448;
                    } else {
                        statePc = 449;
                    }
                    continue stateLoop;
                }
                case 448: {
                    var16 = 0;
                    statePc = 449;
                    continue stateLoop;
                }
                case 449: {
                    pj.field_u[2].c(0, 0, var15, var16);
                    if (-301 > (this.field_o ^ -1)) {
                        statePc = 451;
                    } else {
                        statePc = 450;
                    }
                    continue stateLoop;
                }
                case 450: {
                    ob.field_I.a(sl.field_Z, 149, -this.field_o + 500, 340, 200, 0, 0, 1, 1, 14);
                    ob.field_I.a(sl.field_Z, 150, -this.field_o + 499, 340, 200, 0, 0, 1, 1, 14);
                    ob.field_I.a(sl.field_Z, 150, -this.field_o + 500, 340, 200, 16777215, -1, 1, 1, 14);
                    statePc = 451;
                    continue stateLoop;
                }
                case 451: {
                    if (-301 > (this.field_o ^ -1)) {
                        statePc = 453;
                    } else {
                        statePc = 454;
                    }
                    continue stateLoop;
                }
                case 453: {
                    ob.field_I.a(sl.field_Z, 149, 200, 340, 200, 0, 0, 1, 1, 14);
                    ob.field_I.a(sl.field_Z, 150, 199, 340, 200, 0, 0, 1, 1, 14);
                    ob.field_I.a(sl.field_Z, 150, 200, 340, 200, 16777215, -1, 1, 1, 14);
                    ob.field_I.c(oh.field_d, 319, 450, 0, 0);
                    ob.field_I.c(oh.field_d, 320, 449, 0, 0);
                    ob.field_I.c(oh.field_d, 320, 450, 16777215, -1);
                    statePc = 454;
                    continue stateLoop;
                }
                case 454: {
                    if (var20 == 0) {
                        statePc = 464;
                    } else {
                        statePc = 455;
                    }
                    continue stateLoop;
                }
                case 455: {
                    if ((this.field_o ^ -1) <= -51) {
                        statePc = 457;
                    } else {
                        statePc = 456;
                    }
                    continue stateLoop;
                }
                case 456: {
                    stackIn_458_0 = this.field_o * 5;
                    statePc = 458;
                    continue stateLoop;
                }
                case 457: {
                    stackIn_458_0 = 255;
                    statePc = 458;
                    continue stateLoop;
                }
                case 458: {
                    var15 = stackIn_458_0;
                    if (-101 >= (this.field_o ^ -1)) {
                        statePc = 460;
                    } else {
                        statePc = 459;
                    }
                    continue stateLoop;
                }
                case 459: {
                    stackIn_461_0 = 5 * this.field_o + -250;
                    statePc = 461;
                    continue stateLoop;
                }
                case 460: {
                    stackIn_461_0 = 255;
                    statePc = 461;
                    continue stateLoop;
                }
                case 461: {
                    var16 = stackIn_461_0;
                    if (var16 >= 0) {
                        statePc = 463;
                    } else {
                        statePc = 462;
                    }
                    continue stateLoop;
                }
                case 462: {
                    var16 = 0;
                    statePc = 463;
                    continue stateLoop;
                }
                case 463: {
                    pj.field_u[1].c(0, 0, var15, var16);
                    statePc = 464;
                    continue stateLoop;
                }
                case 464: {
                    if (400 < this.field_o) {
                        statePc = 466;
                    } else {
                        statePc = 467;
                    }
                    continue stateLoop;
                }
                case 466: {
                    ul.d(0, 0, 640, 480, 0, (this.field_o * 250 + -100000) / 100);
                    statePc = 467;
                    continue stateLoop;
                }
                case 467: {
                    return;
                }
                case 468: {
                    var5 = ol.field_e / 2 + -this.field_t + var3_ref_kb.field_g * ol.field_e + 320;
                    var6 = -24 + ol.field_e * var3_ref_kb.field_h + (-this.field_h + 240);
                    ob.field_I.c(Integer.toString(var4), var5, var6, 16777215, 0);
                    var3_ref_kb.a(this.field_t, (byte) -108, this.field_h);
                    statePc = 471;
                    continue stateLoop;
                }
                case 469: {
                    var4 = var3_ref_kb.f(100);
                    if ((var4 ^ -1) >= -1) {
                        statePc = 471;
                    } else {
                        statePc = 468;
                    }
                    continue stateLoop;
                }
                case 471: {
                    var3_ref_kb = (kb) ((Object) wf.field_c.field_o.d(853));
                    if (var20 == 0) {
                        statePc = 478;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 473: {
                    if (stackIn_473_0 != stackIn_473_1) {
                        statePc = 471;
                    } else {
                        statePc = 469;
                    }
                    continue stateLoop;
                }
                case 475: {
                    stackIn_473_0 = stackIn_475_0;
                    stackIn_473_1 = -6;
                    statePc = 473;
                    continue stateLoop;
                }
                case 476: {
                    stackIn_130_0 = var3_ref_kb.field_C ^ -1;
                    stackIn_477_0 = stackIn_130_0;
                    if (var20 != 0) {
                        statePc = 130;
                    } else {
                        statePc = 477;
                    }
                    continue stateLoop;
                }
                case 477: {
                    stackIn_475_0 = stackIn_477_0;
                    statePc = 475;
                    continue stateLoop;
                }
                case 478: {
                    if (var3_ref_kb == null) {
                        statePc = 113;
                    } else {
                        statePc = 476;
                    }
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_34_0 = 0;
        int statePc = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = OrbDefence.field_D ? 1 : 0;
                    var5 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    stackIn_2_0 = param0 ^ -1;
                    stackIn_2_1 = var5 ^ -1;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (stackIn_2_0 >= stackIn_2_1) {
                        statePc = 16;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackIn_17_0 = 0;
                    stackIn_4_0 = stackIn_17_0;
                    if (var7 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var6 = stackIn_4_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if ((param0 ^ -1) >= (var6 ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var4 = wf.field_c.field_f.field_c * var6 + var5 + param2;
                    stackIn_2_0 = -1;
                    stackIn_7_0 = stackIn_2_0;
                    stackIn_2_1 = var4 ^ -1;
                    stackIn_7_1 = stackIn_2_1;
                    if (var7 != 0) {
                        statePc = 2;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (stackIn_7_0 < stackIn_7_1) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if ((var4 ^ -1) <= (wf.field_c.field_f.field_i ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return false;
                }
                case 11: {
                    if (-2 == (wf.field_c.field_f.field_o[var4] ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if ((wf.field_c.field_f.field_o[var4] ^ -1) == -10) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return false;
                }
                case 14: {
                    var6++;
                    if (var7 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var5++;
                    if (var7 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var5 = -1;
                    stackIn_17_0 = param1;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (stackIn_17_0 == 22727) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    this.field_t = 89;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = 1 + param0 ^ -1;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (stackIn_20_0 >= (var5 ^ -1)) {
                        statePc = 33;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_34_0 = -1;
                    stackIn_22_0 = stackIn_34_0;
                    if (var7 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var6 = stackIn_22_0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if ((1 + param0 ^ -1) >= (var6 ^ -1)) {
                        statePc = 32;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var4 = wf.field_c.field_f.field_c * var6 + param2 - -var5;
                    stackIn_20_0 = var4;
                    stackIn_25_0 = stackIn_20_0;
                    if (var7 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (stackIn_25_0 < 0) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (wf.field_c.field_f.field_i > var4) {
                        statePc = 29;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    return false;
                }
                case 28: {
                    return false;
                }
                case 29: {
                    if ((wf.field_c.field_f.field_o[var4] ^ -1) != -8) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    return false;
                }
                case 31: {
                    var6++;
                    if (var7 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var5++;
                    if (var7 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    return true;
                }
                case 34: {
                    return stackIn_34_0 != 0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(int param0, int param1, byte param2) {
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_78_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_114_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        int stackIn_135_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_138_1 = 0;
        int stackIn_157_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_171_0 = 0;
        int stackIn_171_1 = 0;
        int stackIn_173_0 = 0;
        int stackIn_176_0 = 0;
        int stackIn_176_1 = 0;
        int stackIn_187_0 = 0;
        int stackIn_189_0 = 0;
        int stackIn_191_0 = 0;
        int stackIn_194_0 = 0;
        int stackIn_213_0 = 0;
        int stackIn_215_0 = 0;
        int statePc = 0;
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
        int var16 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = OrbDefence.field_D ? 1 : 0;
                    var4 = 0;
                    var5 = 0;
                    var6 = 0;
                    var7 = 0;
                    var8 = 0;
                    var9 = 0;
                    var10 = 0;
                    var11 = param0 + 16;
                    var12 = param0 + 1;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    stackIn_2_0 = var11 ^ -1;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (stackIn_2_0 >= (var12 ^ -1)) {
                        statePc = 48;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackIn_49_0 = -1;
                    stackIn_4_0 = stackIn_49_0;
                    stackIn_49_1 = var12 % wf.field_c.field_f.field_c ^ -1;
                    stackIn_4_1 = stackIn_49_1;
                    if (var16 != 0) {
                        statePc = 49;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (stackIn_4_0 == stackIn_4_1) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var5 = 0;
                    if (var16 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var14 = -1;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    stackIn_9_0 = var14;
                    stackIn_9_1 = 1 + param1;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (stackIn_9_0 >= stackIn_9_1) {
                        statePc = 23;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_24_0 = -1;
                    stackIn_11_0 = stackIn_24_0;
                    if (var16 != 0) {
                        statePc = 24;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var15 = stackIn_11_0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (1 + param1 <= var15) {
                        statePc = 22;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var13 = var14 + (var12 - -(wf.field_c.field_f.field_c * var15));
                    stackIn_9_0 = 0;
                    stackIn_14_0 = stackIn_9_0;
                    stackIn_9_1 = var13;
                    stackIn_14_1 = stackIn_9_1;
                    if (var16 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (stackIn_14_0 > stackIn_14_1) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var13 < wf.field_c.field_f.field_i) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var5 = 0;
                    if (var16 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (wf.field_c.field_f.field_o[var13] != 7) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var5 = 0;
                    if (var16 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var15++;
                    if (var16 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var14++;
                    if (var16 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var14 = stackIn_24_0;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = param1;
                    stackIn_26_1 = var14;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (stackIn_26_0 <= stackIn_26_1) {
                        statePc = 47;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_2_0 = 0;
                    stackIn_28_0 = stackIn_2_0;
                    if (var16 != 0) {
                        statePc = 2;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var15 = stackIn_28_0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if ((var15 ^ -1) <= (param1 ^ -1)) {
                        statePc = 46;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var13 = var14 + var12 - -(wf.field_c.field_f.field_c * var15);
                    stackIn_26_0 = 0;
                    stackIn_31_0 = stackIn_26_0;
                    stackIn_26_1 = var13;
                    stackIn_31_1 = stackIn_26_1;
                    if (var16 != 0) {
                        statePc = 26;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (stackIn_31_0 > stackIn_31_1) {
                        statePc = 34;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if ((wf.field_c.field_f.field_i ^ -1) < (var13 ^ -1)) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var5 = 0;
                    if (var16 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (-1 == (wf.field_c.field_f.field_o[var13] ^ -1)) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var10 = 0;
                    if (var16 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (var9 == 0) {
                        statePc = 41;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (var10 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var5 = 0;
                    if (var16 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var9 = 1;
                    var10 = 1;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (-2 == (wf.field_c.field_f.field_o[var13] ^ -1)) {
                        statePc = 48;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (wf.field_c.field_f.field_o[var13] == 9) {
                        statePc = 48;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var15++;
                    if (var16 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var14++;
                    if (var16 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var5++;
                    var12++;
                    if (var16 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    stackIn_49_0 = var5 ^ -1;
                    stackIn_49_1 = -1;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (stackIn_49_0 >= stackIn_49_1) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var5++;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (16 == var5) {
                        statePc = 54;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (var9 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var5 = 0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    var10 = 0;
                    var9 = 0;
                    var12 = -1 + param0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    stackIn_57_0 = var12;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (stackIn_57_0 <= -16 + param0) {
                        statePc = 102;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    stackIn_103_0 = -1;
                    stackIn_59_0 = stackIn_103_0;
                    stackIn_103_1 = var12 % wf.field_c.field_f.field_c ^ -1;
                    stackIn_59_1 = stackIn_103_1;
                    if (var16 != 0) {
                        statePc = 103;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (stackIn_59_0 != stackIn_59_1) {
                        statePc = 61;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var6 = 0;
                    if (var16 == 0) {
                        statePc = 102;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var14 = -1;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    stackIn_63_0 = var14;
                    stackIn_63_1 = 1 + param1;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    if (stackIn_63_0 >= stackIn_63_1) {
                        statePc = 77;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    stackIn_78_0 = -1;
                    stackIn_65_0 = stackIn_78_0;
                    if (var16 != 0) {
                        statePc = 78;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var15 = stackIn_65_0;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if ((1 + param1 ^ -1) >= (var15 ^ -1)) {
                        statePc = 76;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var13 = var12 + var14 - -(var15 * wf.field_c.field_f.field_c);
                    stackIn_63_0 = -1;
                    stackIn_68_0 = stackIn_63_0;
                    stackIn_63_1 = var13 ^ -1;
                    stackIn_68_1 = stackIn_63_1;
                    if (var16 != 0) {
                        statePc = 63;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (stackIn_68_0 < stackIn_68_1) {
                        statePc = 71;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (var13 < wf.field_c.field_f.field_i) {
                        statePc = 72;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var6 = 0;
                    if (var16 == 0) {
                        statePc = 102;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (-8 != (wf.field_c.field_f.field_o[var13] ^ -1)) {
                        statePc = 74;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var6 = 0;
                    if (var16 == 0) {
                        statePc = 102;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var15++;
                    if (var16 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var14++;
                    if (var16 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    stackIn_78_0 = 0;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    var14 = stackIn_78_0;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    stackIn_80_0 = param1 ^ -1;
                    stackIn_80_1 = var14 ^ -1;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if (stackIn_80_0 >= stackIn_80_1) {
                        statePc = 101;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    stackIn_57_0 = 0;
                    stackIn_82_0 = stackIn_57_0;
                    if (var16 != 0) {
                        statePc = 57;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var15 = stackIn_82_0;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if ((var15 ^ -1) <= (param1 ^ -1)) {
                        statePc = 100;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var13 = wf.field_c.field_f.field_c * var15 + (var14 + var12);
                    stackIn_80_0 = var13 ^ -1;
                    stackIn_85_0 = stackIn_80_0;
                    stackIn_80_1 = -1;
                    stackIn_85_1 = stackIn_80_1;
                    if (var16 != 0) {
                        statePc = 80;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (stackIn_85_0 > stackIn_85_1) {
                        statePc = 88;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if ((var13 ^ -1) > (wf.field_c.field_f.field_i ^ -1)) {
                        statePc = 89;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var6 = 0;
                    if (var16 == 0) {
                        statePc = 102;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (wf.field_c.field_f.field_o[var13] == 0) {
                        statePc = 91;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var10 = 0;
                    if (var16 == 0) {
                        statePc = 96;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (var9 == 0) {
                        statePc = 95;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (var10 == 0) {
                        statePc = 94;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var6 = 0;
                    if (var16 == 0) {
                        statePc = 102;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var10 = 1;
                    var9 = 1;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    if (wf.field_c.field_f.field_o[var13] == 1) {
                        statePc = 102;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if ((wf.field_c.field_f.field_o[var13] ^ -1) == -10) {
                        statePc = 102;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var15++;
                    if (var16 == 0) {
                        statePc = 83;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    var14++;
                    if (var16 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    var6++;
                    var12--;
                    if (var16 == 0) {
                        statePc = 56;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    stackIn_103_0 = 0;
                    stackIn_103_1 = var6;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    if (stackIn_103_0 >= stackIn_103_1) {
                        statePc = 105;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var6++;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if ((var6 ^ -1) == -17) {
                        statePc = 108;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    if (var9 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 108: {
                    var6 = 0;
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    var9 = 0;
                    var10 = 0;
                    if (param2 < -13) {
                        statePc = 111;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    this.field_l = -57;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    var12 = param0 + wf.field_c.field_f.field_c;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if ((var12 ^ -1) <= (param0 + 16 * wf.field_c.field_f.field_c ^ -1)) {
                        statePc = 158;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    stackIn_159_0 = -1;
                    stackIn_114_0 = stackIn_159_0;
                    if (var16 != 0) {
                        statePc = 159;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    var14 = stackIn_114_0;
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    stackIn_116_0 = var14;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    if (stackIn_116_0 >= param1 + 1) {
                        statePc = 130;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    stackIn_131_0 = -1;
                    stackIn_118_0 = stackIn_131_0;
                    if (var16 != 0) {
                        statePc = 131;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    var15 = stackIn_118_0;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if (var15 >= 1 + param1) {
                        statePc = 129;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    var13 = wf.field_c.field_f.field_c * var15 + (var14 + var12);
                    stackIn_116_0 = var13;
                    stackIn_121_0 = stackIn_116_0;
                    if (var16 != 0) {
                        statePc = 116;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if (stackIn_121_0 < 0) {
                        statePc = 124;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if ((var13 ^ -1) > (wf.field_c.field_f.field_i ^ -1)) {
                        statePc = 125;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    var7 = 0;
                    if (var16 == 0) {
                        statePc = 158;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if (7 != wf.field_c.field_f.field_o[var13]) {
                        statePc = 127;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    var7 = 0;
                    if (var16 == 0) {
                        statePc = 158;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var15++;
                    if (var16 == 0) {
                        statePc = 119;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var14++;
                    if (var16 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    stackIn_131_0 = 0;
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    var14 = stackIn_131_0;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    stackIn_133_0 = var14 ^ -1;
                    stackIn_133_1 = param1 ^ -1;
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if (stackIn_133_0 <= stackIn_133_1) {
                        statePc = 156;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    stackIn_157_0 = 0;
                    stackIn_135_0 = stackIn_157_0;
                    if (var16 != 0) {
                        statePc = 157;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    var15 = stackIn_135_0;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    if (var15 >= param1) {
                        statePc = 155;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    var13 = wf.field_c.field_f.field_c * var15 + var12 + var14;
                    stackIn_133_0 = var13 ^ -1;
                    stackIn_138_0 = stackIn_133_0;
                    stackIn_133_1 = -1;
                    stackIn_138_1 = stackIn_133_1;
                    if (var16 != 0) {
                        statePc = 133;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    if (stackIn_138_0 > stackIn_138_1) {
                        statePc = 141;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if ((var13 ^ -1) > (wf.field_c.field_f.field_i ^ -1)) {
                        statePc = 142;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    var7 = 0;
                    if (var16 == 0) {
                        statePc = 158;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (wf.field_c.field_f.field_o[var13] != 0) {
                        statePc = 148;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if (var9 == 0) {
                        statePc = 147;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if (var10 == 0) {
                        statePc = 146;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var7 = 0;
                    if (var16 == 0) {
                        statePc = 158;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var10 = 1;
                    var9 = 1;
                    if (var16 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var10 = 0;
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    if (wf.field_c.field_f.field_o[var13] == 1) {
                        statePc = 158;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    if (9 != wf.field_c.field_f.field_o[var13]) {
                        statePc = 153;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if (var16 == 0) {
                        statePc = 158;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    var15++;
                    if (var16 == 0) {
                        statePc = 136;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    var14++;
                    if (var16 == 0) {
                        statePc = 132;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    var7++;
                    stackIn_157_0 = var12 + wf.field_c.field_f.field_c;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    var12 = stackIn_157_0;
                    if (var16 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    stackIn_159_0 = 0;
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    if (stackIn_159_0 < var7) {
                        statePc = 161;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 161: {
                    var7++;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    if (var7 == 16) {
                        statePc = 165;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    if (var9 == 0) {
                        statePc = 165;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 165: {
                    var7 = 0;
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    var9 = 0;
                    var10 = 0;
                    var12 = param0 + -wf.field_c.field_f.field_c;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    if ((param0 - 16 * wf.field_c.field_f.field_c ^ -1) <= (var12 ^ -1)) {
                        statePc = 214;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    stackIn_215_0 = -1;
                    stackIn_169_0 = stackIn_215_0;
                    if (var16 != 0) {
                        statePc = 215;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    var14 = stackIn_169_0;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    stackIn_171_0 = var14 ^ -1;
                    stackIn_171_1 = param1 - -1 ^ -1;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    if (stackIn_171_0 <= stackIn_171_1) {
                        statePc = 186;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    stackIn_187_0 = -1;
                    stackIn_173_0 = stackIn_187_0;
                    if (var16 != 0) {
                        statePc = 187;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    var15 = stackIn_173_0;
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    if ((var15 ^ -1) <= (1 + param1 ^ -1)) {
                        statePc = 185;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    var13 = var14 + (var12 - -(var15 * wf.field_c.field_f.field_c));
                    stackIn_171_0 = -1;
                    stackIn_176_0 = stackIn_171_0;
                    stackIn_171_1 = var13 ^ -1;
                    stackIn_176_1 = stackIn_171_1;
                    if (var16 != 0) {
                        statePc = 171;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    if (stackIn_176_0 < stackIn_176_1) {
                        statePc = 179;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    if (var13 < wf.field_c.field_f.field_i) {
                        statePc = 180;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    var8 = 0;
                    if (var16 == 0) {
                        statePc = 214;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if (wf.field_c.field_f.field_o[var13] == 7) {
                        statePc = 182;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 182: {
                    var8 = 0;
                    if (var16 == 0) {
                        statePc = 214;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    var15++;
                    if (var16 == 0) {
                        statePc = 174;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    var14++;
                    if (var16 == 0) {
                        statePc = 170;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    stackIn_187_0 = 0;
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    var14 = stackIn_187_0;
                    statePc = 188;
                    continue stateLoop;
                }
                case 188: {
                    stackIn_189_0 = param1;
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    if (stackIn_189_0 <= var14) {
                        statePc = 212;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    stackIn_213_0 = 0;
                    stackIn_191_0 = stackIn_213_0;
                    if (var16 != 0) {
                        statePc = 213;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    var15 = stackIn_191_0;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    if ((var15 ^ -1) <= (param1 ^ -1)) {
                        statePc = 211;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    var13 = wf.field_c.field_f.field_c * var15 + (var12 + var14);
                    stackIn_189_0 = var13;
                    stackIn_194_0 = stackIn_189_0;
                    if (var16 != 0) {
                        statePc = 189;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    if (stackIn_194_0 < 0) {
                        statePc = 197;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if (wf.field_c.field_f.field_i > var13) {
                        statePc = 198;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    var8 = 0;
                    if (var16 == 0) {
                        statePc = 214;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if (0 == wf.field_c.field_f.field_o[var13]) {
                        statePc = 200;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    var10 = 0;
                    if (var16 == 0) {
                        statePc = 205;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if (var9 == 0) {
                        statePc = 204;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (var10 == 0) {
                        statePc = 203;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 203: {
                    var8 = 0;
                    if (var16 == 0) {
                        statePc = 214;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    var9 = 1;
                    var10 = 1;
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    if (1 == wf.field_c.field_f.field_o[var13]) {
                        statePc = 214;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    if ((wf.field_c.field_f.field_o[var13] ^ -1) != -10) {
                        statePc = 209;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    if (var16 == 0) {
                        statePc = 214;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    var15++;
                    if (var16 == 0) {
                        statePc = 192;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    var14++;
                    if (var16 == 0) {
                        statePc = 188;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    var8++;
                    stackIn_213_0 = var12 - wf.field_c.field_f.field_c;
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    var12 = stackIn_213_0;
                    if (var16 == 0) {
                        statePc = 167;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    stackIn_215_0 = 0;
                    statePc = 215;
                    continue stateLoop;
                }
                case 215: {
                    if (stackIn_215_0 >= var8) {
                        statePc = 217;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    var8++;
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    if (-17 == (var8 ^ -1)) {
                        statePc = 220;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    if (var9 == 0) {
                        statePc = 220;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 220: {
                    var8 = 0;
                    statePc = 221;
                    continue stateLoop;
                }
                case 221: {
                    var4 = var5 + ((var8 << -1698284744) + (var7 << -2037038320)) + (var6 << -2056082296);
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0, boolean param1) {
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_110_0 = 0;
        boolean stackIn_276_0 = false;
        int stackIn_284_0 = 0;
        int stackIn_287_0 = 0;
        int stackIn_287_1 = 0;
        int stackIn_291_0 = 0;
        int stackIn_291_1 = 0;
        int stackIn_400_0 = 0;
        int stackIn_409_0 = 0;
        int stackIn_413_0 = 0;
        int stackIn_422_0 = 0;
        int stackIn_427_0 = 0;
        int stackIn_436_0 = 0;
        int stackIn_441_0 = 0;
        int stackIn_450_0 = 0;
        int stackIn_453_0 = 0;
        int stackIn_461_0 = 0;
        kb stackIn_475_0 = null;
        int stackIn_478_0 = 0;
        int stackIn_478_1 = 0;
        kb stackIn_498_0 = null;
        f stackIn_510_0 = null;
        int stackIn_513_0 = 0;
        int stackIn_513_1 = 0;
        f stackIn_531_0 = null;
        int stackIn_532_0 = 0;
        int stackIn_532_1 = 0;
        int stackIn_536_0 = 0;
        int stackIn_539_0 = 0;
        int stackIn_539_1 = 0;
        int stackIn_546_0 = 0;
        int stackIn_546_1 = 0;
        int stackIn_553_0 = 0;
        boolean stackOut_275_0;
        int statePc = 0;
        int var3 = 0;
        pd var3_ref_pd = null;
        int var4 = 0;
        pd var4_ref_pd = null;
        int var5 = 0;
        pd var6_ref_pd = null;
        int var6 = 0;
        int var7_int = 0;
        lb var7 = null;
        int var8 = 0;
        kb var9_ref_kb = null;
        int var9 = 0;
        int var10_int = 0;
        int[] var10 = null;
        kb var11_ref_kb = null;
        int var11 = 0;
        int var12 = 0;
        im var12_ref_im = null;
        int var13_int = 0;
        Object var13 = null;
        int var14_int = 0;
        Object var14 = null;
        int var15_int = 0;
        kb var15 = null;
        Object var15_ref = null;
        int var16 = 0;
        kb var16_ref_kb = null;
        int var17_int = 0;
        kb var17 = null;
        int var18 = 0;
        int var19 = 0;
        lb[] var21 = null;
        pd var22 = null;
        kb var23 = null;
        Object var24 = null;
        kb var24_ref = null;
        Object var25 = null;
        kb var25_ref = null;
        kb var26 = null;
        Object var27 = null;
        kb var27_ref = null;
        im var28 = null;
        Object var29 = null;
        kb var29_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var24 = null;
                    var25 = null;
                    var27 = null;
                    var29 = null;
                    var19 = OrbDefence.field_D ? 1 : 0;
                    if (-3 >= (va.field_d ^ -1)) {
                        statePc = 2;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (!ek.field_a[12]) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ob.field_F = true;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (ek.field_a[11]) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ob.field_F = false;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (0 < this.field_n) {
                        statePc = 22;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_n = 10;
                    if (wf.field_c.field_x >= 99) {
                        statePc = 23;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (0 != wf.field_c.field_x % 11) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (wf.field_c.field_r.c(-3088)) {
                        statePc = 12;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var3 = wf.field_c.field_f.field_s[wf.field_c.field_x % wf.field_c.field_f.field_s.length];
                    var4 = var3 % wf.field_c.field_f.field_c;
                    var5 = var3 / wf.field_c.field_f.field_c;
                    var22 = new pd(var4, var5, wf.field_c, 12, 1);
                    var22 = var22;
                    var22.field_o = 1;
                    this.field_v.a(-118, var22);
                    if (jc.field_f[this.field_b][wf.field_c.field_x] == 1) {
                        statePc = 14;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var7_int = 1;
                    if (wf.field_c.field_x % 11 != 10) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var7_int = 3;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var8 = 1;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if ((var8 ^ -1) < (var7_int ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var3 = wf.field_c.field_f.field_s[(var8 + wf.field_c.field_x) % wf.field_c.field_f.field_s.length];
                    var5 = var3 / wf.field_c.field_f.field_c;
                    var4 = var3 % wf.field_c.field_f.field_c;
                    var6_ref_pd = new pd(var4, var5, wf.field_c, 12, 1);
                    var6_ref_pd.field_o = 1;
                    this.field_v.a(-81, var6_ref_pd);
                    var8++;
                    if (var19 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var19 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (var19 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.field_n = this.field_n - 1;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var3_ref_pd = (pd) ((Object) this.field_v.b((byte) -39));
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (var3_ref_pd == null) {
                        statePc = 30;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var3_ref_pd.c(1);
                    stackIn_37_0 = 6;
                    stackIn_26_0 = stackIn_37_0;
                    stackIn_37_1 = wf.field_c.field_f.field_o[var3_ref_pd.field_t];
                    stackIn_26_1 = stackIn_37_1;
                    if (var19 != 0) {
                        statePc = 37;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (stackIn_26_0 == stackIn_26_1) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var3_ref_pd.field_o = 0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    var3_ref_pd = (pd) ((Object) this.field_v.d(param0 + -27950));
                    if (var19 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var3_ref_pd = (pd) ((Object) this.field_v.d((byte) -122));
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (var3_ref_pd == null) {
                        statePc = 36;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackIn_37_0 = var3_ref_pd.field_o ^ -1;
                    stackIn_33_0 = stackIn_37_0;
                    stackIn_37_1 = -1;
                    stackIn_33_1 = stackIn_37_1;
                    if (var19 != 0) {
                        statePc = 37;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (stackIn_33_0 < stackIn_33_1) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var3_ref_pd.b(57);
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    var3_ref_pd = (pd) ((Object) this.field_v.b(10708));
                    if (var19 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_37_0 = this.field_b ^ -1;
                    stackIn_37_1 = -1;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (stackIn_37_0 == stackIn_37_1) {
                        statePc = 40;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (3 >= this.field_b) {
                        statePc = 49;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (-599 < (ua.field_a ^ -1)) {
                        statePc = 49;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if ((vl.field_d ^ -1) > -11) {
                        statePc = 49;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (ua.field_a > 630) {
                        statePc = 49;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if ((vl.field_d ^ -1) < -43) {
                        statePc = 49;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (1 != gi.field_e) {
                        statePc = 49;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (df.field_f) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    stackIn_48_0 = 1;
                    statePc = 48;
                    continue stateLoop;
                }
                case 47: {
                    stackIn_48_0 = 0;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    df.field_f = stackIn_48_0 != 0;
                    gk.a(mh.field_a[2], (byte) -11);
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (-1 > (this.field_u ^ -1)) {
                        statePc = 51;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 51: {
                    this.field_u = this.field_u - 1;
                    wf.field_c.field_i = 0;
                    if (this.field_b > 3) {
                        statePc = 57;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (-101 > (this.field_u ^ -1)) {
                        statePc = 55;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    this.field_t = -3 + (63 * this.field_t + 320) / 64;
                    if (var19 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    this.field_t = (-320 + 63 * this.field_t + ol.field_e * (wf.field_c.field_f.field_c - 1)) / 64 - -3;
                    if (var19 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (this.field_u > 300) {
                        statePc = 66;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if ((this.field_u ^ -1) >= -201) {
                        statePc = 61;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    this.field_h = (-120 + this.field_h * 63 + ol.field_e * (-1 + wf.field_c.field_f.field_t)) / 64 + 3;
                    if (var19 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (this.field_u <= 100) {
                        statePc = 64;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    this.field_t = (320 + 63 * this.field_t) / 64 + -3;
                    if (var19 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    this.field_h = -3 + (120 + this.field_h * 63) / 64;
                    if (var19 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    this.field_t = (-320 + ol.field_e * (-1 + wf.field_c.field_f.field_c) + this.field_t * 63) / 64 - -3;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if (-1 == (wf.field_c.field_f.field_k ^ -1)) {
                        statePc = 69;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 69: {
                    wf.field_c.field_k = true;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    if (l.field_c <= 0) {
                        statePc = 72;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    l.field_c = l.field_c - 1;
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    if (wf.field_c.field_k) {
                        statePc = 74;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (this.field_o == 0) {
                        statePc = 76;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 76: {
                    hi.a(ee.field_b[14], 2, false, 1, false, 2);
                    if ((wf.field_c.field_f.field_k ^ -1) < -1) {
                        statePc = 78;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (-45 <= (wf.field_c.field_x ^ -1)) {
                        statePc = 92;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    wf.field_c.field_x = wf.field_c.field_f.field_k / 25 + 99;
                    if (this.field_b == 0) {
                        statePc = 81;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 81: {
                    f.a(6, 249, (byte) -25);
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    if (0 != this.field_b) {
                        statePc = 85;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (-126 < (wf.field_c.field_f.field_k ^ -1)) {
                        statePc = 85;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    f.a(7, 248, (byte) -25);
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    if (3 == this.field_b) {
                        statePc = 87;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 87: {
                    f.a(8, 247, (byte) -25);
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    if (-1 != (wf.field_c.field_s ^ -1)) {
                        statePc = 92;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if ((this.field_b ^ -1) == -1) {
                        statePc = 91;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 91: {
                    f.a(16, 239, (byte) -25);
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    this.field_o = this.field_o + 1;
                    if (-401 != (this.field_o ^ -1)) {
                        statePc = 99;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (0 >= wf.field_c.field_f.field_k) {
                        statePc = 99;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if (44 < wf.field_c.field_x) {
                        statePc = 99;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (of.field_G != 0) {
                        statePc = 99;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (!ek.field_a[13]) {
                        statePc = 98;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 98: {
                    this.field_o = 399;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    if (this.field_o <= 500) {
                        statePc = 556;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if (!n.b((byte) 93)) {
                        statePc = 103;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    rh.a((byte) -91, 6, true);
                    if (var19 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    il.field_f.c(-1);
                    kj.field_x = null;
                    if (dm.field_f == 0) {
                        statePc = 106;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    rh.a((byte) 113, 5, true);
                    if (var19 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    rh.a((byte) -45, 2, true);
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    if ((tc.field_b ^ -1) < -1) {
                        statePc = 109;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    stackIn_110_0 = 7;
                    statePc = 110;
                    continue stateLoop;
                }
                case 109: {
                    stackIn_110_0 = 0;
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    bk.field_e = stackIn_110_0;
                    return;
                }
                case 111: {
                    da.field_b = da.field_b + 1;
                    if (!df.field_f) {
                        statePc = 115;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    if (-1 == (this.field_b ^ -1)) {
                        statePc = 120;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    if ((this.field_m ^ -1) <= -17) {
                        statePc = 120;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    if (0 != (this.field_m ^ -1)) {
                        statePc = 117;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 117: {
                    this.field_c = this.field_c + 1;
                    if (-251 > (this.field_c ^ -1)) {
                        statePc = 119;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 119: {
                    this.field_c = 0;
                    this.field_m = -1;
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    if (0 != this.field_b) {
                        statePc = 187;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if (0 != hm.field_C) {
                        statePc = 128;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if (-1 != (wf.field_c.field_i ^ -1)) {
                        statePc = 128;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    if (-1 != (this.field_c ^ -1)) {
                        statePc = 128;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (!this.field_k) {
                        statePc = 126;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 126: {
                    if (this.field_m != -1) {
                        statePc = 128;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    this.field_m = 0;
                    this.field_c = 0;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    if (hm.field_C != 0) {
                        statePc = 135;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if (wf.field_c.field_o.c((byte) 52) >= 10) {
                        statePc = 135;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    if ((wf.field_c.field_e[0].b(true) ^ -1) >= -31) {
                        statePc = 135;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if (!wf.field_c.field_b.c(-3088)) {
                        statePc = 135;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if (this.field_m != -1) {
                        statePc = 152;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    this.field_m = 1;
                    this.field_c = 0;
                    if (var19 == 0) {
                        statePc = 152;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if ((hm.field_C ^ -1) != -1) {
                        statePc = 152;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    if (this.field_m == 2) {
                        statePc = 144;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if (-4 <= (wf.field_c.field_o.c((byte) 52) ^ -1)) {
                        statePc = 140;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    if ((wf.field_c.field_e[0].b(true) ^ -1) >= -31) {
                        statePc = 142;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    if (wf.field_c.field_o.c((byte) 52) < 10) {
                        statePc = 152;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (wf.field_c.field_b.c(-3088)) {
                        statePc = 144;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if ((this.field_m ^ -1) == 0) {
                        statePc = 147;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (this.field_m != 1) {
                        statePc = 148;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    this.field_m = 2;
                    this.field_c = 0;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    if (!this.field_j) {
                        statePc = 152;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    if (gi.field_e == 1) {
                        statePc = 151;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 151: {
                    hm.field_C = 1;
                    this.field_m = -1;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    if (hm.field_C == 1) {
                        statePc = 154;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 154: {
                    this.field_c = 0;
                    this.field_m = 3;
                    if (wf.field_c.field_x <= 1) {
                        statePc = 156;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    hm.field_C = 2;
                    this.field_m = -1;
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    if (2 != hm.field_C) {
                        statePc = 162;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    if (!this.field_j) {
                        statePc = 160;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if (gi.field_e != 1) {
                        statePc = 160;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    this.field_m = -1;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    if (wf.field_c.field_x != 2) {
                        statePc = 162;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    hm.field_C = 3;
                    this.field_m = 15;
                    this.field_c = 0;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    if ((hm.field_C ^ -1) == -4) {
                        statePc = 164;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 164: {
                    if (!this.field_j) {
                        statePc = 168;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if ((gi.field_e ^ -1) == -2) {
                        statePc = 167;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 167: {
                    this.field_m = -1;
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    if (wf.field_c.field_x != 5) {
                        statePc = 170;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    this.field_m = 5;
                    hm.field_C = 4;
                    this.field_c = 0;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    if ((hm.field_C ^ -1) == -5) {
                        statePc = 172;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 172: {
                    if (!this.field_j) {
                        statePc = 176;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    if (1 == gi.field_e) {
                        statePc = 175;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 175: {
                    this.field_m = -1;
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    if ((wf.field_c.field_x ^ -1) != -11) {
                        statePc = 179;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    if (fd.field_b < 500 + wf.field_c.field_i) {
                        statePc = 181;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    if ((wf.field_c.field_x ^ -1) <= -12) {
                        statePc = 181;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 181: {
                    this.field_m = 4;
                    this.field_c = 0;
                    hm.field_C = 5;
                    statePc = 182;
                    continue stateLoop;
                }
                case 182: {
                    if ((this.field_m ^ -1) != 0) {
                        statePc = 194;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (wf.field_c.field_f.field_k >= 125) {
                        statePc = 194;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    if (!this.field_g) {
                        statePc = 186;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 186: {
                    this.field_g = true;
                    this.field_c = 0;
                    this.field_m = 6;
                    if (var19 == 0) {
                        statePc = 194;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    if (-4 <= (this.field_b ^ -1)) {
                        statePc = 194;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    if (-1 != (hm.field_C ^ -1)) {
                        statePc = 194;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    if (0 != wf.field_c.field_i) {
                        statePc = 194;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if (0 != this.field_c) {
                        statePc = 194;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    if (this.field_k) {
                        statePc = 194;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    if (0 != (this.field_m ^ -1)) {
                        statePc = 194;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    this.field_m = 18;
                    this.field_c = 0;
                    statePc = 194;
                    continue stateLoop;
                }
                case 194: {
                    if (this.field_m != -1) {
                        statePc = 252;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if (wf.field_c.field_r.c(-3088)) {
                        statePc = 198;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    if (0 == wf.field_c.field_x % 11) {
                        statePc = 252;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if (wf.field_c.field_f.field_k > 0) {
                        statePc = 200;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if (wf.field_c.field_x < 11) {
                        statePc = 203;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (jk.field_j[2] < 2) {
                        statePc = 248;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    if ((this.field_b ^ -1) <= -5) {
                        statePc = 207;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    if (wf.field_c.field_x < 22) {
                        statePc = 207;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    if (2 > jk.field_j[3]) {
                        statePc = 246;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    if ((this.field_b ^ -1) <= -5) {
                        statePc = 212;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    if (wf.field_c.field_x < 33) {
                        statePc = 212;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    if (2 <= jk.field_j[4]) {
                        statePc = 212;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    jk.field_j[4] = 2;
                    this.field_m = 9;
                    if (var19 == 0) {
                        statePc = 249;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    if (4 > this.field_b) {
                        statePc = 217;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    if (wf.field_c.field_x < 22) {
                        statePc = 217;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    if ((jk.field_j[5] ^ -1) <= -3) {
                        statePc = 217;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    jk.field_j[5] = 2;
                    this.field_m = 16;
                    if (var19 == 0) {
                        statePc = 249;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    if ((wf.field_c.field_x ^ -1) > -45) {
                        statePc = 221;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    if (-5 >= (jk.field_j[0] ^ -1)) {
                        statePc = 221;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    this.field_m = 10;
                    jk.field_j[0] = 4;
                    if (var19 == 0) {
                        statePc = 249;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    if (wf.field_c.field_x < 55) {
                        statePc = 224;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    if (-5 < (jk.field_j[1] ^ -1)) {
                        statePc = 244;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    if ((wf.field_c.field_x ^ -1) > -67) {
                        statePc = 228;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    if (-5 >= (jk.field_j[2] ^ -1)) {
                        statePc = 228;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    this.field_m = 12;
                    jk.field_j[2] = 4;
                    if (var19 == 0) {
                        statePc = 249;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    if (this.field_b >= 4) {
                        statePc = 232;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    if (77 > wf.field_c.field_x) {
                        statePc = 232;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    if (jk.field_j[3] < 4) {
                        statePc = 242;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    if ((this.field_b ^ -1) <= -5) {
                        statePc = 237;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    if (wf.field_c.field_x < 88) {
                        statePc = 237;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (-5 >= (jk.field_j[4] ^ -1)) {
                        statePc = 237;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    jk.field_j[4] = 4;
                    this.field_m = 14;
                    if (var19 == 0) {
                        statePc = 249;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    if (4 > this.field_b) {
                        statePc = 249;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    if (wf.field_c.field_x < 77) {
                        statePc = 249;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    if (jk.field_j[5] < 4) {
                        statePc = 241;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 241: {
                    this.field_m = 17;
                    jk.field_j[5] = 4;
                    if (var19 == 0) {
                        statePc = 249;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    jk.field_j[3] = 4;
                    this.field_m = 13;
                    if (var19 == 0) {
                        statePc = 249;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    this.field_m = 11;
                    jk.field_j[1] = 4;
                    if (var19 == 0) {
                        statePc = 249;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    this.field_m = 8;
                    jk.field_j[3] = 2;
                    if (var19 == 0) {
                        statePc = 249;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    jk.field_j[2] = 2;
                    this.field_m = 7;
                    statePc = 249;
                    continue stateLoop;
                }
                case 249: {
                    if (-1 != this.field_m) {
                        statePc = 251;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 251: {
                    this.field_c = 0;
                    statePc = 252;
                    continue stateLoop;
                }
                case 252: {
                    nh.field_b = nh.field_b + 1;
                    mm.field_C = mm.field_C + 1;
                    if (4 <= this.field_m) {
                        statePc = 255;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    if (0 != this.field_m) {
                        statePc = 259;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    if (!this.field_j) {
                        statePc = 259;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    if ((gi.field_e ^ -1) == -2) {
                        statePc = 258;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 258: {
                    this.field_k = true;
                    this.field_m = -1;
                    statePc = 259;
                    continue stateLoop;
                }
                case 259: {
                    if (!ek.field_a[56]) {
                        statePc = 269;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    if (2 <= va.field_d) {
                        statePc = 262;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 262: {
                    var3 = 0;
                    statePc = 263;
                    continue stateLoop;
                }
                case 263: {
                    if (jk.field_j.length <= var3) {
                        statePc = 267;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    jk.field_j[var3] = 4;
                    var3++;
                    if (var19 != 0) {
                        statePc = 268;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    if (var19 == 0) {
                        statePc = 263;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    jk.field_j[-1 + jk.field_j.length] = 0;
                    fc.field_d = true;
                    this.field_s.a((byte) -6, 1000);
                    statePc = 268;
                    continue stateLoop;
                }
                case 268: {
                    gk.a(mh.field_a[1], (byte) -11);
                    statePc = 269;
                    continue stateLoop;
                }
                case 269: {
                    if (this.field_s.b(-59)) {
                        statePc = 271;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 270: {
                    fc.field_d = true;
                    statePc = 271;
                    continue stateLoop;
                }
                case 271: {
                    var3 = 0;
                    if (param0 == 28803) {
                        statePc = 273;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    this.field_v = (im) null;
                    statePc = 273;
                    continue stateLoop;
                }
                case 273: {
                    var4_ref_pd = (pd) ((Object) wf.field_c.field_r.b((byte) -85));
                    statePc = 274;
                    continue stateLoop;
                }
                case 274: {
                    if (var4_ref_pd == null) {
                        statePc = 283;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    stackOut_275_0 = ek.field_a[55];
                    stackIn_284_0 = stackOut_275_0 ? 1 : 0;
                    stackIn_276_0 = stackOut_275_0;
                    if (var19 != 0) {
                        statePc = 284;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    if (!stackIn_276_0) {
                        statePc = 279;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    if ((va.field_d ^ -1) > -3) {
                        statePc = 279;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    fc.field_d = true;
                    var4_ref_pd.field_o = 0;
                    statePc = 279;
                    continue stateLoop;
                }
                case 279: {
                    if ((var4_ref_pd.field_o ^ -1) < -1) {
                        statePc = 281;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 281: {
                    var3 = var3 + var4_ref_pd.field_o;
                    statePc = 282;
                    continue stateLoop;
                }
                case 282: {
                    var4_ref_pd = (pd) ((Object) wf.field_c.field_r.d(param0 ^ 29654));
                    if (var19 == 0) {
                        statePc = 274;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    stackIn_284_0 = 0;
                    statePc = 284;
                    continue stateLoop;
                }
                case 284: {
                    var4 = stackIn_284_0;
                    statePc = 285;
                    continue stateLoop;
                }
                case 285: {
                    if (-1 + this.field_d.length <= var4) {
                        statePc = 290;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 286: {
                    this.field_d[var4] = this.field_d[var4 - -1];
                    stackIn_291_0 = this.field_d[var4];
                    stackIn_287_0 = stackIn_291_0;
                    stackIn_291_1 = this.field_x;
                    stackIn_287_1 = stackIn_291_1;
                    if (var19 != 0) {
                        statePc = 291;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    if (stackIn_287_0 <= stackIn_287_1) {
                        statePc = 289;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    this.field_x = this.field_d[var4];
                    statePc = 289;
                    continue stateLoop;
                }
                case 289: {
                    var4++;
                    if (var19 == 0) {
                        statePc = 285;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 290: {
                    this.field_d[-1 + this.field_d.length] = var3;
                    this.field_x = this.field_x - 1;
                    bc.field_r = bc.field_r + this.field_x;
                    a.field_r = a.field_r + this.field_x;
                    stackIn_291_0 = -1;
                    stackIn_291_1 = wf.field_c.field_x % 11 ^ -1;
                    statePc = 291;
                    continue stateLoop;
                }
                case 291: {
                    if (stackIn_291_0 != stackIn_291_1) {
                        statePc = 296;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    if ((var3 ^ -1) != -1) {
                        statePc = 296;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 293: {
                    if (0 >= wf.field_c.field_x) {
                        statePc = 296;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    this.b(-106);
                    if (var19 == 0) {
                        statePc = 308;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    if (0 != var3) {
                        statePc = 301;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    var4 = this.b((byte) -127);
                    if (var4 != bl.field_p) {
                        statePc = 299;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 299: {
                    hi.a(ee.field_b[var4], 2, false, 1, true, 2);
                    statePc = 300;
                    continue stateLoop;
                }
                case 300: {
                    bl.field_p = var4;
                    if (var19 == 0) {
                        statePc = 308;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 301: {
                    var4 = 1 + this.b((byte) 98);
                    if ((wf.field_c.field_x % 11 ^ -1) == -1) {
                        statePc = 303;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 303: {
                    var4++;
                    statePc = 304;
                    continue stateLoop;
                }
                case 304: {
                    if ((var4 ^ -1) != (bl.field_p ^ -1)) {
                        statePc = 306;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 306: {
                    hi.a(ee.field_b[var4], 2, false, 1, true, 2);
                    statePc = 307;
                    continue stateLoop;
                }
                case 307: {
                    bl.field_p = var4;
                    statePc = 308;
                    continue stateLoop;
                }
                case 308: {
                    mm.field_C = mm.field_C - (vl.field_d - ua.field_a);
                    bc.field_r = bc.field_r - ua.field_a;
                    a.field_r = a.field_r - vl.field_d;
                    if (param1) {
                        statePc = 310;
                    } else {
                        statePc = 555;
                    }
                    continue stateLoop;
                }
                case 310: {
                    if (!nf.e(32722)) {
                        statePc = 314;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    this.a(true);
                    if (var19 != 0) {
                        statePc = 555;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 312: {
                    if (var19 == 0) {
                        statePc = 310;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 314: {
                    if (ia.a(param0 ^ 28803)) {
                        statePc = 555;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 315: {
                    if (this.field_s != null) {
                        statePc = 317;
                    } else {
                        statePc = 555;
                    }
                    continue stateLoop;
                }
                case 317: {
                    if (!ek.field_a[96]) {
                        statePc = 319;
                    } else {
                        statePc = 318;
                    }
                    continue stateLoop;
                }
                case 318: {
                    this.field_t = this.field_t - 16;
                    this.a(94);
                    statePc = 319;
                    continue stateLoop;
                }
                case 319: {
                    if (ek.field_a[97]) {
                        statePc = 321;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 321: {
                    this.field_t = this.field_t + 16;
                    this.a(125);
                    statePc = 322;
                    continue stateLoop;
                }
                case 322: {
                    if (ek.field_a[98]) {
                        statePc = 324;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 324: {
                    this.field_h = this.field_h - 16;
                    this.a(74);
                    statePc = 325;
                    continue stateLoop;
                }
                case 325: {
                    if (ek.field_a[99]) {
                        statePc = 327;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 327: {
                    this.field_h = this.field_h + 16;
                    this.a(83);
                    statePc = 328;
                    continue stateLoop;
                }
                case 328: {
                    if (-1 == (lg.field_a & 4 ^ -1)) {
                        statePc = 334;
                    } else {
                        statePc = 329;
                    }
                    continue stateLoop;
                }
                case 329: {
                    var4 = (-ua.field_a + this.field_e) / 4;
                    var5 = (-vl.field_d + this.field_p) / 4;
                    var6 = var4 * 4;
                    var7_int = var5 * 4;
                    if (var4 != 0) {
                        statePc = 332;
                    } else {
                        statePc = 330;
                    }
                    continue stateLoop;
                }
                case 330: {
                    if (-1 != (var5 ^ -1)) {
                        statePc = 332;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 332: {
                    this.field_p = this.field_p - var7_int;
                    this.field_e = this.field_e - var6;
                    this.field_h = this.field_h + var7_int;
                    this.field_t = this.field_t + var6;
                    statePc = 333;
                    continue stateLoop;
                }
                case 333: {
                    this.a(param0 + -28713);
                    if (var19 == 0) {
                        statePc = 335;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 334: {
                    this.field_p = vl.field_d;
                    this.field_e = ua.field_a;
                    statePc = 335;
                    continue stateLoop;
                }
                case 335: {
                    cb.field_a.a(param0 + -28843);
                    if (this.field_h < 192) {
                        statePc = 337;
                    } else {
                        statePc = 338;
                    }
                    continue stateLoop;
                }
                case 337: {
                    this.field_h = 192;
                    statePc = 338;
                    continue stateLoop;
                }
                case 338: {
                    if (-321 >= (this.field_t ^ -1)) {
                        statePc = 340;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    this.field_t = 320;
                    statePc = 340;
                    continue stateLoop;
                }
                case 340: {
                    if ((-128 + (-1 + wf.field_c.field_f.field_t) * ol.field_e ^ -1) > (this.field_h ^ -1)) {
                        statePc = 342;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 342: {
                    this.field_h = -128 + (wf.field_c.field_f.field_t - 1) * ol.field_e;
                    statePc = 343;
                    continue stateLoop;
                }
                case 343: {
                    if ((ol.field_e * (wf.field_c.field_f.field_c + -1) + -320 ^ -1) > (this.field_t ^ -1)) {
                        statePc = 345;
                    } else {
                        statePc = 346;
                    }
                    continue stateLoop;
                }
                case 345: {
                    this.field_t = ol.field_e * (wf.field_c.field_f.field_c - 1) - 320;
                    statePc = 346;
                    continue stateLoop;
                }
                case 346: {
                    if (null == this.field_s) {
                        statePc = 525;
                    } else {
                        statePc = 347;
                    }
                    continue stateLoop;
                }
                case 347: {
                    eh.field_a = (-320 + (ua.field_a + ol.field_e / 2 + this.field_t)) / ol.field_e;
                    uh.field_b = (this.field_h + (ol.field_e / 2 + (vl.field_d - 240))) / ol.field_e;
                    if ((gi.field_e ^ -1) != -3) {
                        statePc = 357;
                    } else {
                        statePc = 348;
                    }
                    continue stateLoop;
                }
                case 348: {
                    if (this.field_j) {
                        statePc = 357;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 349: {
                    if (null != this.field_s) {
                        statePc = 351;
                    } else {
                        statePc = 357;
                    }
                    continue stateLoop;
                }
                case 351: {
                    var4 = eh.field_a - -(uh.field_b * wf.field_c.field_f.field_c);
                    if (var4 < 0) {
                        statePc = 357;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 352: {
                    if (var4 >= wf.field_c.field_f.field_i) {
                        statePc = 357;
                    } else {
                        statePc = 353;
                    }
                    continue stateLoop;
                }
                case 353: {
                    if (wf.field_c.field_f.field_o[var4] != 7) {
                        statePc = 357;
                    } else {
                        statePc = 354;
                    }
                    continue stateLoop;
                }
                case 354: {
                    l.field_c = -1;
                    var23 = wf.field_c.a(var4, param0 + -28908);
                    eh.field_a = var23.field_g;
                    uh.field_b = var23.field_h;
                    if (var23 != null) {
                        statePc = 355;
                    } else {
                        statePc = 355;
                    }
                    continue stateLoop;
                }
                case 355: {
                    if (var23.field_p != this.field_s) {
                        statePc = 357;
                    } else {
                        statePc = 356;
                    }
                    continue stateLoop;
                }
                case 356: {
                    gk.a(mh.field_a[3], (byte) -11);
                    var23.d(param0 ^ 28810);
                    wf.field_c.a(-1);
                    statePc = 357;
                    continue stateLoop;
                }
                case 357: {
                    if (-2 != (of.field_G ^ -1)) {
                        statePc = 525;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 358: {
                    if (this.field_j) {
                        statePc = 525;
                    } else {
                        statePc = 359;
                    }
                    continue stateLoop;
                }
                case 359: {
                    if (vl.field_d >= 360) {
                        statePc = 525;
                    } else {
                        statePc = 360;
                    }
                    continue stateLoop;
                }
                case 360: {
                    if (vl.field_d > 60) {
                        statePc = 362;
                    } else {
                        statePc = 525;
                    }
                    continue stateLoop;
                }
                case 362: {
                    this.a(85);
                    if (null == this.field_s) {
                        statePc = 525;
                    } else {
                        statePc = 363;
                    }
                    continue stateLoop;
                }
                case 363: {
                    var4 = eh.field_a + wf.field_c.field_f.field_c * uh.field_b;
                    var5 = this.field_s.b(true);
                    var6 = ui.field_a[this.field_f][0];
                    var7_int = oj.a((byte) 47, this.field_f);
                    var8 = 0;
                    if (var4 < 0) {
                        statePc = 488;
                    } else {
                        statePc = 364;
                    }
                    continue stateLoop;
                }
                case 364: {
                    if ((var4 ^ -1) <= (wf.field_c.field_f.field_i ^ -1)) {
                        statePc = 488;
                    } else {
                        statePc = 365;
                    }
                    continue stateLoop;
                }
                case 365: {
                    if ((jk.field_j[this.field_f] ^ -1) > -1) {
                        statePc = 488;
                    } else {
                        statePc = 366;
                    }
                    continue stateLoop;
                }
                case 366: {
                    if (!this.a(var7_int, param0 + -6076, var4)) {
                        statePc = 370;
                    } else {
                        statePc = 367;
                    }
                    continue stateLoop;
                }
                case 367: {
                    if (-7 != (this.field_f ^ -1)) {
                        statePc = 381;
                    } else {
                        statePc = 368;
                    }
                    continue stateLoop;
                }
                case 368: {
                    if (-1 != (this.a(var4, var7_int, (byte) -126) ^ -1)) {
                        statePc = 381;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 370: {
                    if (gi.field_e != 1) {
                        statePc = 488;
                    } else {
                        statePc = 371;
                    }
                    continue stateLoop;
                }
                case 371: {
                    if (!this.b(var4, var7_int, 1)) {
                        statePc = 488;
                    } else {
                        statePc = 372;
                    }
                    continue stateLoop;
                }
                case 372: {
                    wl.field_a = ua.field_a;
                    if ((this.field_f ^ -1) == -7) {
                        statePc = 375;
                    } else {
                        statePc = 373;
                    }
                    continue stateLoop;
                }
                case 373: {
                    hd.field_j = aa.field_a;
                    if (var19 == 0) {
                        statePc = 376;
                    } else {
                        statePc = 375;
                    }
                    continue stateLoop;
                }
                case 375: {
                    hd.field_j = ue.field_J;
                    statePc = 376;
                    continue stateLoop;
                }
                case 376: {
                    md.field_f = vl.field_d;
                    if (wl.field_a >= 128) {
                        statePc = 378;
                    } else {
                        statePc = 377;
                    }
                    continue stateLoop;
                }
                case 377: {
                    wl.field_a = 128;
                    statePc = 378;
                    continue stateLoop;
                }
                case 378: {
                    if (-513 <= (wl.field_a ^ -1)) {
                        statePc = 380;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 379: {
                    wl.field_a = 512;
                    statePc = 380;
                    continue stateLoop;
                }
                case 380: {
                    l.field_c = 100;
                    if (var19 == 0) {
                        statePc = 488;
                    } else {
                        statePc = 381;
                    }
                    continue stateLoop;
                }
                case 381: {
                    if (var5 >= var6) {
                        statePc = 390;
                    } else {
                        statePc = 382;
                    }
                    continue stateLoop;
                }
                case 382: {
                    if (gi.field_e == 1) {
                        statePc = 384;
                    } else {
                        statePc = 488;
                    }
                    continue stateLoop;
                }
                case 384: {
                    md.field_f = vl.field_d;
                    wl.field_a = ua.field_a;
                    hd.field_j = ih.field_b;
                    if (wl.field_a < 128) {
                        statePc = 386;
                    } else {
                        statePc = 387;
                    }
                    continue stateLoop;
                }
                case 386: {
                    wl.field_a = 128;
                    statePc = 387;
                    continue stateLoop;
                }
                case 387: {
                    l.field_c = 100;
                    if (-513 <= (wl.field_a ^ -1)) {
                        statePc = 488;
                    } else {
                        statePc = 388;
                    }
                    continue stateLoop;
                }
                case 388: {
                    wl.field_a = 512;
                    if (var19 == 0) {
                        statePc = 488;
                    } else {
                        statePc = 390;
                    }
                    continue stateLoop;
                }
                case 390: {
                    l.field_c = -1;
                    var9_ref_kb = wf.field_c.a(var4, -116);
                    var5 = var5 - var6;
                    if (var9_ref_kb != null) {
                        statePc = 392;
                    } else {
                        statePc = 393;
                    }
                    continue stateLoop;
                }
                case 392: {
                    System.out.println("Oops");
                    statePc = 393;
                    continue stateLoop;
                }
                case 393: {
                    var11_ref_kb = new kb(eh.field_a, uh.field_b, this.field_f, 0, this.field_s, wf.field_c);
                    if (-7 == (this.field_f ^ -1)) {
                        statePc = 395;
                    } else {
                        statePc = 449;
                    }
                    continue stateLoop;
                }
                case 395: {
                    var12 = this.a(var4, var7_int, (byte) -74);
                    var13_int = var12 & 255;
                    if (var13_int > 0) {
                        statePc = 397;
                    } else {
                        statePc = 408;
                    }
                    continue stateLoop;
                }
                case 397: {
                    var14_int = 0;
                    statePc = 398;
                    continue stateLoop;
                }
                case 398: {
                    if (var14_int >= var7_int) {
                        statePc = 407;
                    } else {
                        statePc = 399;
                    }
                    continue stateLoop;
                }
                case 399: {
                    stackIn_409_0 = 0;
                    stackIn_400_0 = stackIn_409_0;
                    if (var19 != 0) {
                        statePc = 409;
                    } else {
                        statePc = 400;
                    }
                    continue stateLoop;
                }
                case 400: {
                    var15_int = stackIn_400_0;
                    statePc = 401;
                    continue stateLoop;
                }
                case 401: {
                    if ((var7_int ^ -1) >= (var15_int ^ -1)) {
                        statePc = 405;
                    } else {
                        statePc = 402;
                    }
                    continue stateLoop;
                }
                case 402: {
                    var10_int = wf.field_c.field_f.field_c * var15_int + var4 + var13_int + var14_int;
                    wf.field_c.field_f.field_o[var10_int] = 7;
                    wf.field_c.field_f.field_j[var10_int] = 29;
                    var15_int++;
                    if (var19 != 0) {
                        statePc = 406;
                    } else {
                        statePc = 403;
                    }
                    continue stateLoop;
                }
                case 403: {
                    if (var19 == 0) {
                        statePc = 401;
                    } else {
                        statePc = 405;
                    }
                    continue stateLoop;
                }
                case 405: {
                    var14_int++;
                    statePc = 406;
                    continue stateLoop;
                }
                case 406: {
                    if (var19 == 0) {
                        statePc = 398;
                    } else {
                        statePc = 407;
                    }
                    continue stateLoop;
                }
                case 407: {
                    var14 = new kb(var13_int + eh.field_a, uh.field_b, this.field_f, 0, this.field_s, wf.field_c);
                    ((kb) (var14)).field_s = var11_ref_kb;
                    wf.field_c.field_o.a(-96, (ca) (var14));
                    statePc = 408;
                    continue stateLoop;
                }
                case 408: {
                    var14_int = 255 & var12 >> -682911992;
                    stackIn_409_0 = 0;
                    statePc = 409;
                    continue stateLoop;
                }
                case 409: {
                    if (stackIn_409_0 >= var14_int) {
                        statePc = 421;
                    } else {
                        statePc = 410;
                    }
                    continue stateLoop;
                }
                case 410: {
                    var15_int = 0;
                    statePc = 411;
                    continue stateLoop;
                }
                case 411: {
                    if ((var7_int ^ -1) >= (var15_int ^ -1)) {
                        statePc = 420;
                    } else {
                        statePc = 412;
                    }
                    continue stateLoop;
                }
                case 412: {
                    stackIn_422_0 = 0;
                    stackIn_413_0 = stackIn_422_0;
                    if (var19 != 0) {
                        statePc = 422;
                    } else {
                        statePc = 413;
                    }
                    continue stateLoop;
                }
                case 413: {
                    var16 = stackIn_413_0;
                    statePc = 414;
                    continue stateLoop;
                }
                case 414: {
                    if (var16 >= var7_int) {
                        statePc = 418;
                    } else {
                        statePc = 415;
                    }
                    continue stateLoop;
                }
                case 415: {
                    var10_int = -var14_int + (var15_int + var4 + var16 * wf.field_c.field_f.field_c);
                    wf.field_c.field_f.field_o[var10_int] = 7;
                    wf.field_c.field_f.field_j[var10_int] = 29;
                    var16++;
                    if (var19 != 0) {
                        statePc = 419;
                    } else {
                        statePc = 416;
                    }
                    continue stateLoop;
                }
                case 416: {
                    if (var19 == 0) {
                        statePc = 414;
                    } else {
                        statePc = 418;
                    }
                    continue stateLoop;
                }
                case 418: {
                    var15_int++;
                    statePc = 419;
                    continue stateLoop;
                }
                case 419: {
                    if (var19 == 0) {
                        statePc = 411;
                    } else {
                        statePc = 420;
                    }
                    continue stateLoop;
                }
                case 420: {
                    var15 = new kb(eh.field_a - var14_int, uh.field_b, this.field_f, 0, this.field_s, wf.field_c);
                    var15.field_s = var11_ref_kb;
                    wf.field_c.field_o.a(param0 + -28887, var15);
                    statePc = 421;
                    continue stateLoop;
                }
                case 421: {
                    var15_int = var12 >> 1354175024 & 255;
                    stackIn_422_0 = var15_int;
                    statePc = 422;
                    continue stateLoop;
                }
                case 422: {
                    if (stackIn_422_0 > 0) {
                        statePc = 424;
                    } else {
                        statePc = 435;
                    }
                    continue stateLoop;
                }
                case 424: {
                    var16 = 0;
                    statePc = 425;
                    continue stateLoop;
                }
                case 425: {
                    if ((var7_int ^ -1) >= (var16 ^ -1)) {
                        statePc = 434;
                    } else {
                        statePc = 426;
                    }
                    continue stateLoop;
                }
                case 426: {
                    stackIn_436_0 = 0;
                    stackIn_427_0 = stackIn_436_0;
                    if (var19 != 0) {
                        statePc = 436;
                    } else {
                        statePc = 427;
                    }
                    continue stateLoop;
                }
                case 427: {
                    var17_int = stackIn_427_0;
                    statePc = 428;
                    continue stateLoop;
                }
                case 428: {
                    if ((var7_int ^ -1) >= (var17_int ^ -1)) {
                        statePc = 432;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 429: {
                    var10_int = wf.field_c.field_f.field_c * (var17_int - -var15_int) + var16 + var4;
                    wf.field_c.field_f.field_o[var10_int] = 7;
                    wf.field_c.field_f.field_j[var10_int] = 29;
                    var17_int++;
                    if (var19 != 0) {
                        statePc = 433;
                    } else {
                        statePc = 430;
                    }
                    continue stateLoop;
                }
                case 430: {
                    if (var19 == 0) {
                        statePc = 428;
                    } else {
                        statePc = 432;
                    }
                    continue stateLoop;
                }
                case 432: {
                    var16++;
                    statePc = 433;
                    continue stateLoop;
                }
                case 433: {
                    if (var19 == 0) {
                        statePc = 425;
                    } else {
                        statePc = 434;
                    }
                    continue stateLoop;
                }
                case 434: {
                    var16_ref_kb = new kb(eh.field_a, uh.field_b - -var15_int, this.field_f, 0, this.field_s, wf.field_c);
                    var16_ref_kb.field_s = var11_ref_kb;
                    wf.field_c.field_o.a(-128, var16_ref_kb);
                    statePc = 435;
                    continue stateLoop;
                }
                case 435: {
                    var16 = (var12 & -16777216) >> 734520152;
                    stackIn_436_0 = var16 ^ -1;
                    statePc = 436;
                    continue stateLoop;
                }
                case 436: {
                    if (stackIn_436_0 < -1) {
                        statePc = 438;
                    } else {
                        statePc = 449;
                    }
                    continue stateLoop;
                }
                case 438: {
                    var17_int = 0;
                    statePc = 439;
                    continue stateLoop;
                }
                case 439: {
                    if ((var7_int ^ -1) >= (var17_int ^ -1)) {
                        statePc = 448;
                    } else {
                        statePc = 440;
                    }
                    continue stateLoop;
                }
                case 440: {
                    stackIn_450_0 = 0;
                    stackIn_441_0 = stackIn_450_0;
                    if (var19 != 0) {
                        statePc = 450;
                    } else {
                        statePc = 441;
                    }
                    continue stateLoop;
                }
                case 441: {
                    var18 = stackIn_441_0;
                    statePc = 442;
                    continue stateLoop;
                }
                case 442: {
                    if (var18 >= var7_int) {
                        statePc = 446;
                    } else {
                        statePc = 443;
                    }
                    continue stateLoop;
                }
                case 443: {
                    var10_int = var17_int + var4 - -((var18 - var16) * wf.field_c.field_f.field_c);
                    wf.field_c.field_f.field_o[var10_int] = 7;
                    wf.field_c.field_f.field_j[var10_int] = 29;
                    var18++;
                    if (var19 != 0) {
                        statePc = 447;
                    } else {
                        statePc = 444;
                    }
                    continue stateLoop;
                }
                case 444: {
                    if (var19 == 0) {
                        statePc = 442;
                    } else {
                        statePc = 446;
                    }
                    continue stateLoop;
                }
                case 446: {
                    var17_int++;
                    statePc = 447;
                    continue stateLoop;
                }
                case 447: {
                    if (var19 == 0) {
                        statePc = 439;
                    } else {
                        statePc = 448;
                    }
                    continue stateLoop;
                }
                case 448: {
                    var17 = new kb(eh.field_a, uh.field_b - var16, this.field_f, 0, this.field_s, wf.field_c);
                    var17.field_s = var11_ref_kb;
                    wf.field_c.field_o.a(param0 ^ -28908, var17);
                    statePc = 449;
                    continue stateLoop;
                }
                case 449: {
                    stackIn_450_0 = 0;
                    statePc = 450;
                    continue stateLoop;
                }
                case 450: {
                    var12 = stackIn_450_0;
                    statePc = 451;
                    continue stateLoop;
                }
                case 451: {
                    if ((var12 ^ -1) <= (var7_int ^ -1)) {
                        statePc = 460;
                    } else {
                        statePc = 452;
                    }
                    continue stateLoop;
                }
                case 452: {
                    stackIn_461_0 = 0;
                    stackIn_453_0 = stackIn_461_0;
                    if (var19 != 0) {
                        statePc = 461;
                    } else {
                        statePc = 453;
                    }
                    continue stateLoop;
                }
                case 453: {
                    var13_int = stackIn_453_0;
                    statePc = 454;
                    continue stateLoop;
                }
                case 454: {
                    if ((var7_int ^ -1) >= (var13_int ^ -1)) {
                        statePc = 458;
                    } else {
                        statePc = 455;
                    }
                    continue stateLoop;
                }
                case 455: {
                    var10_int = var13_int * wf.field_c.field_f.field_c + var12 + var4;
                    wf.field_c.field_f.field_o[var10_int] = 7;
                    wf.field_c.field_f.field_j[var10_int] = 29;
                    var13_int++;
                    if (var19 != 0) {
                        statePc = 459;
                    } else {
                        statePc = 456;
                    }
                    continue stateLoop;
                }
                case 456: {
                    if (var19 == 0) {
                        statePc = 454;
                    } else {
                        statePc = 458;
                    }
                    continue stateLoop;
                }
                case 458: {
                    var12++;
                    statePc = 459;
                    continue stateLoop;
                }
                case 459: {
                    if (var19 == 0) {
                        statePc = 451;
                    } else {
                        statePc = 460;
                    }
                    continue stateLoop;
                }
                case 460: {
                    stackIn_461_0 = 3;
                    statePc = 461;
                    continue stateLoop;
                }
                case 461: {
                    if (stackIn_461_0 == this.field_f) {
                        statePc = 463;
                    } else {
                        statePc = 464;
                    }
                    continue stateLoop;
                }
                case 463: {
                    wf.field_c.field_s = wf.field_c.field_s + 1;
                    statePc = 464;
                    continue stateLoop;
                }
                case 464: {
                    if ((this.field_f ^ -1) == -7) {
                        statePc = 467;
                    } else {
                        statePc = 465;
                    }
                    continue stateLoop;
                }
                case 465: {
                    gk.a(mh.field_a[1], (byte) -11);
                    if (var19 == 0) {
                        statePc = 468;
                    } else {
                        statePc = 467;
                    }
                    continue stateLoop;
                }
                case 467: {
                    ea.a(param0 + -28749, mh.field_a[56], 800);
                    statePc = 468;
                    continue stateLoop;
                }
                case 468: {
                    wf.field_c.field_o.a(-117, var11_ref_kb);
                    var12_ref_im = new im();
                    statePc = 469;
                    continue stateLoop;
                }
                case 469: {
                    if (wf.field_c.field_o.c(-3088)) {
                        statePc = 473;
                    } else {
                        statePc = 470;
                    }
                    continue stateLoop;
                }
                case 470: {
                    var24_ref = (kb) ((Object) wf.field_c.field_o.b((byte) -74));
                    var24_ref.b(param0 ^ 28858);
                    var12_ref_im.a(-98, var24_ref);
                    if (var19 != 0) {
                        statePc = 487;
                    } else {
                        statePc = 471;
                    }
                    continue stateLoop;
                }
                case 471: {
                    if (var19 == 0) {
                        statePc = 469;
                    } else {
                        statePc = 473;
                    }
                    continue stateLoop;
                }
                case 473: {
                    if (var12_ref_im.c(-3088)) {
                        statePc = 487;
                    } else {
                        statePc = 474;
                    }
                    continue stateLoop;
                }
                case 474: {
                    var25_ref = (kb) ((Object) var12_ref_im.b((byte) -78));
                    var13 = var25_ref;
                    stackIn_498_0 = (kb) ((Object) wf.field_c.field_o.b((byte) -29));
                    stackIn_475_0 = stackIn_498_0;
                    if (var19 != 0) {
                        statePc = 498;
                    } else {
                        statePc = 475;
                    }
                    continue stateLoop;
                }
                case 475: {
                    var14 = stackIn_475_0;
                    statePc = 476;
                    continue stateLoop;
                }
                case 476: {
                    if (var14 == null) {
                        statePc = 484;
                    } else {
                        statePc = 477;
                    }
                    continue stateLoop;
                }
                case 477: {
                    stackIn_532_0 = ((kb) (var14)).field_h;
                    stackIn_478_0 = stackIn_532_0;
                    stackIn_532_1 = var25_ref.field_h;
                    stackIn_478_1 = stackIn_532_1;
                    if (var19 != 0) {
                        statePc = 532;
                    } else {
                        statePc = 478;
                    }
                    continue stateLoop;
                }
                case 478: {
                    if (stackIn_478_0 > stackIn_478_1) {
                        statePc = 482;
                    } else {
                        statePc = 479;
                    }
                    continue stateLoop;
                }
                case 479: {
                    if (var25_ref.field_g >= ((kb) (var14)).field_g) {
                        statePc = 483;
                    } else {
                        statePc = 480;
                    }
                    continue stateLoop;
                }
                case 480: {
                    if ((((kb) (var14)).field_h ^ -1) != (var25_ref.field_h ^ -1)) {
                        statePc = 483;
                    } else {
                        statePc = 482;
                    }
                    continue stateLoop;
                }
                case 482: {
                    vk.a(var25_ref, (byte) -65, (ca) (var14));
                    var14 = null;
                    var13 = null;
                    statePc = 484;
                    continue stateLoop;
                }
                case 483: {
                    var14 = (kb) ((Object) wf.field_c.field_o.d(853));
                    if (var19 == 0) {
                        statePc = 476;
                    } else {
                        statePc = 484;
                    }
                    continue stateLoop;
                }
                case 484: {
                    if (var13 == null) {
                        statePc = 486;
                    } else {
                        statePc = 485;
                    }
                    continue stateLoop;
                }
                case 485: {
                    wf.field_c.field_o.a(param0 + -28907, (ca) (var13));
                    statePc = 486;
                    continue stateLoop;
                }
                case 486: {
                    if (var19 == 0) {
                        statePc = 473;
                    } else {
                        statePc = 487;
                    }
                    continue stateLoop;
                }
                case 487: {
                    var8 = 1;
                    statePc = 488;
                    continue stateLoop;
                }
                case 488: {
                    if (var8 != 0) {
                        statePc = 523;
                    } else {
                        statePc = 489;
                    }
                    continue stateLoop;
                }
                case 489: {
                    if (var4 < 0) {
                        statePc = 523;
                    } else {
                        statePc = 490;
                    }
                    continue stateLoop;
                }
                case 490: {
                    if ((wf.field_c.field_f.field_i ^ -1) >= (var4 ^ -1)) {
                        statePc = 523;
                    } else {
                        statePc = 491;
                    }
                    continue stateLoop;
                }
                case 491: {
                    if (gi.field_e == 1) {
                        statePc = 495;
                    } else {
                        statePc = 492;
                    }
                    continue stateLoop;
                }
                case 492: {
                    if ((of.field_G ^ -1) != -2) {
                        statePc = 523;
                    } else {
                        statePc = 493;
                    }
                    continue stateLoop;
                }
                case 493: {
                    if (!ek.field_a[81]) {
                        statePc = 523;
                    } else {
                        statePc = 495;
                    }
                    continue stateLoop;
                }
                case 495: {
                    if (-1 <= (var5 ^ -1)) {
                        statePc = 523;
                    } else {
                        statePc = 496;
                    }
                    continue stateLoop;
                }
                case 496: {
                    if (wf.field_c.field_f.field_o[var4] != 7) {
                        statePc = 523;
                    } else {
                        statePc = 497;
                    }
                    continue stateLoop;
                }
                case 497: {
                    l.field_c = -1;
                    var26 = wf.field_c.a(var4, -120);
                    var9_ref_kb = var26;
                    uh.field_b = var26.field_h;
                    stackIn_498_0 = (kb) (var26);
                    statePc = 498;
                    continue stateLoop;
                }
                case 498: {
                    eh.field_a = stackIn_498_0.field_g;
                    if (this.field_s != var9_ref_kb.field_p) {
                        statePc = 523;
                    } else {
                        statePc = 499;
                    }
                    continue stateLoop;
                }
                case 499: {
                    if (var9_ref_kb.field_F >= jk.field_j[var9_ref_kb.field_C]) {
                        statePc = 523;
                    } else {
                        statePc = 500;
                    }
                    continue stateLoop;
                }
                case 500: {
                    var10 = ui.field_a[var9_ref_kb.field_C];
                    var11 = var10.length;
                    var12 = var9_ref_kb.field_F + 1;
                    if (var12 >= var11) {
                        statePc = 523;
                    } else {
                        statePc = 501;
                    }
                    continue stateLoop;
                }
                case 501: {
                    if (var5 >= var10[var12]) {
                        statePc = 503;
                    } else {
                        statePc = 523;
                    }
                    continue stateLoop;
                }
                case 503: {
                    var5 = var5 - var10[var12];
                    gk.a(mh.field_a[3], (byte) -11);
                    wf.field_c.field_o.a(-125, new kb(eh.field_a, uh.field_b, var9_ref_kb.field_C, var12, this.field_s, wf.field_c));
                    var9_ref_kb.field_C = -1;
                    var28 = new im();
                    statePc = 504;
                    continue stateLoop;
                }
                case 504: {
                    if (wf.field_c.field_o.c(-3088)) {
                        statePc = 508;
                    } else {
                        statePc = 505;
                    }
                    continue stateLoop;
                }
                case 505: {
                    var27_ref = (kb) ((Object) wf.field_c.field_o.b((byte) -85));
                    var27_ref.b(57);
                    var28.a(param0 + -28917, var27_ref);
                    if (var19 != 0) {
                        statePc = 524;
                    } else {
                        statePc = 506;
                    }
                    continue stateLoop;
                }
                case 506: {
                    if (var19 == 0) {
                        statePc = 504;
                    } else {
                        statePc = 508;
                    }
                    continue stateLoop;
                }
                case 508: {
                    if (var28.c(-3088)) {
                        statePc = 523;
                    } else {
                        statePc = 509;
                    }
                    continue stateLoop;
                }
                case 509: {
                    var29_ref = (kb) ((Object) var28.b((byte) 119));
                    var14 = var29_ref;
                    stackIn_531_0 = wf.field_c;
                    stackIn_510_0 = stackIn_531_0;
                    if (var19 != 0) {
                        statePc = 531;
                    } else {
                        statePc = 510;
                    }
                    continue stateLoop;
                }
                case 510: {
                    var15 = (kb) ((Object) ((im) (Object) stackIn_510_0.field_o).b((byte) 124));
                    statePc = 511;
                    continue stateLoop;
                }
                case 511: {
                    if (var15 == null) {
                        statePc = 519;
                    } else {
                        statePc = 512;
                    }
                    continue stateLoop;
                }
                case 512: {
                    stackIn_532_0 = var15.field_h;
                    stackIn_513_0 = stackIn_532_0;
                    stackIn_532_1 = var29_ref.field_h;
                    stackIn_513_1 = stackIn_532_1;
                    if (var19 != 0) {
                        statePc = 532;
                    } else {
                        statePc = 513;
                    }
                    continue stateLoop;
                }
                case 513: {
                    if (stackIn_513_0 > stackIn_513_1) {
                        statePc = 517;
                    } else {
                        statePc = 514;
                    }
                    continue stateLoop;
                }
                case 514: {
                    if ((var29_ref.field_g ^ -1) <= (var15.field_g ^ -1)) {
                        statePc = 518;
                    } else {
                        statePc = 515;
                    }
                    continue stateLoop;
                }
                case 515: {
                    if ((var29_ref.field_h ^ -1) != (var15.field_h ^ -1)) {
                        statePc = 518;
                    } else {
                        statePc = 517;
                    }
                    continue stateLoop;
                }
                case 517: {
                    vk.a(var29_ref, (byte) -65, var15);
                    var14 = null;
                    var15_ref = null;
                    statePc = 519;
                    continue stateLoop;
                }
                case 518: {
                    var15 = (kb) ((Object) wf.field_c.field_o.d(853));
                    if (var19 == 0) {
                        statePc = 511;
                    } else {
                        statePc = 519;
                    }
                    continue stateLoop;
                }
                case 519: {
                    if (var14 != null) {
                        statePc = 521;
                    } else {
                        statePc = 522;
                    }
                    continue stateLoop;
                }
                case 521: {
                    wf.field_c.field_o.a(-83, (ca) (var14));
                    statePc = 522;
                    continue stateLoop;
                }
                case 522: {
                    if (var19 == 0) {
                        statePc = 508;
                    } else {
                        statePc = 523;
                    }
                    continue stateLoop;
                }
                case 523: {
                    this.field_s.c(false);
                    statePc = 524;
                    continue stateLoop;
                }
                case 524: {
                    this.field_s.a((byte) -6, var5);
                    statePc = 525;
                    continue stateLoop;
                }
                case 525: {
                    if (!df.field_f) {
                        statePc = 530;
                    } else {
                        statePc = 526;
                    }
                    continue stateLoop;
                }
                case 526: {
                    if (-1 == this.field_m) {
                        statePc = 530;
                    } else {
                        statePc = 527;
                    }
                    continue stateLoop;
                }
                case 527: {
                    if (-1 == (this.field_b ^ -1)) {
                        statePc = 555;
                    } else {
                        statePc = 528;
                    }
                    continue stateLoop;
                }
                case 528: {
                    if (this.field_m >= 16) {
                        statePc = 555;
                    } else {
                        statePc = 530;
                    }
                    continue stateLoop;
                }
                case 530: {
                    wf.field_c.b((byte) 98);
                    stackIn_531_0 = wf.field_c;
                    statePc = 531;
                    continue stateLoop;
                }
                case 531: {
                    ((f) (Object) stackIn_531_0).d((byte) 104);
                    df.field_g = df.field_g + 1;
                    stackIn_532_0 = df.field_g ^ -1;
                    stackIn_532_1 = -1001;
                    statePc = 532;
                    continue stateLoop;
                }
                case 532: {
                    if (stackIn_532_0 >= stackIn_532_1) {
                        statePc = 555;
                    } else {
                        statePc = 533;
                    }
                    continue stateLoop;
                }
                case 533: {
                    var4 = df.field_g / 1000;
                    var21 = wf.field_c.field_e;
                    var6 = 0;
                    statePc = 534;
                    continue stateLoop;
                }
                case 534: {
                    if (var6 >= var21.length) {
                        statePc = 552;
                    } else {
                        statePc = 535;
                    }
                    continue stateLoop;
                }
                case 535: {
                    var7 = var21[var6];
                    var8 = 0;
                    stackIn_553_0 = 0;
                    stackIn_536_0 = stackIn_553_0;
                    if (var19 != 0) {
                        statePc = 553;
                    } else {
                        statePc = 536;
                    }
                    continue stateLoop;
                }
                case 536: {
                    var9 = stackIn_536_0;
                    statePc = 537;
                    continue stateLoop;
                }
                case 537: {
                    if (wf.field_c.field_f.field_o.length <= var9) {
                        statePc = 545;
                    } else {
                        statePc = 538;
                    }
                    continue stateLoop;
                }
                case 538: {
                    stackIn_546_0 = wf.field_c.field_f.field_o[var9];
                    stackIn_539_0 = stackIn_546_0;
                    stackIn_546_1 = 6;
                    stackIn_539_1 = stackIn_546_1;
                    if (var19 != 0) {
                        statePc = 546;
                    } else {
                        statePc = 539;
                    }
                    continue stateLoop;
                }
                case 539: {
                    if (stackIn_539_0 == stackIn_539_1) {
                        statePc = 541;
                    } else {
                        statePc = 544;
                    }
                    continue stateLoop;
                }
                case 541: {
                    wf.field_c.field_b.a(-123, new oj(var9 % wf.field_c.field_f.field_c, var9 / wf.field_c.field_f.field_c, var7, var9 / wf.field_c.field_f.field_c + var9 % wf.field_c.field_f.field_c, var4));
                    if ((var9 % wf.field_c.field_f.field_c ^ -1) < (var8 ^ -1)) {
                        statePc = 543;
                    } else {
                        statePc = 544;
                    }
                    continue stateLoop;
                }
                case 543: {
                    var8 = var9 % wf.field_c.field_f.field_c;
                    statePc = 544;
                    continue stateLoop;
                }
                case 544: {
                    var9++;
                    if (var19 == 0) {
                        statePc = 537;
                    } else {
                        statePc = 545;
                    }
                    continue stateLoop;
                }
                case 545: {
                    stackIn_546_0 = -1;
                    stackIn_546_1 = var8 ^ -1;
                    statePc = 546;
                    continue stateLoop;
                }
                case 546: {
                    if (stackIn_546_0 <= stackIn_546_1) {
                        statePc = 551;
                    } else {
                        statePc = 547;
                    }
                    continue stateLoop;
                }
                case 547: {
                    if (-65 >= (var8 ^ -1)) {
                        statePc = 551;
                    } else {
                        statePc = 548;
                    }
                    continue stateLoop;
                }
                case 548: {
                    if (33 >= wf.field_c.field_x) {
                        statePc = 551;
                    } else {
                        statePc = 549;
                    }
                    continue stateLoop;
                }
                case 549: {
                    if (!wf.field_c.field_a) {
                        statePc = 551;
                    } else {
                        statePc = 550;
                    }
                    continue stateLoop;
                }
                case 550: {
                    f.a(17, 238, (byte) -25);
                    statePc = 551;
                    continue stateLoop;
                }
                case 551: {
                    var6++;
                    if (var19 == 0) {
                        statePc = 534;
                    } else {
                        statePc = 552;
                    }
                    continue stateLoop;
                }
                case 552: {
                    stackIn_553_0 = df.field_g - 1000 * var4;
                    statePc = 553;
                    continue stateLoop;
                }
                case 553: {
                    df.field_g = stackIn_553_0;
                    statePc = 555;
                    continue stateLoop;
                }
                case 555: {
                    return;
                }
                case 556: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0) {
        lb dupTemp$0 = null;
        int stackIn_5_0 = 0;
        int var2;
        int var3;
        L0: {
          if ((ob.field_K ^ -1) != -14) {
            break L0;
          } else {
            if (this.field_o != 0) {
              break L0;
            } else {
              L1: {
                var2 = 1;
                gk.a(mh.field_a[45], (byte) -11);
                var3 = var2;
                if (!qb.b((byte) 123)) {
                  stackIn_5_0 = 0;
                  break L1;
                } else {
                  stackIn_5_0 = 7;
                  break L1;
                }
              }
              o.a(stackIn_5_0, 2, false, var3);
              return;
            }
          }
        }
        if (param0) {
          L2: {
            if ((ob.field_K ^ -1) != -84) {
              break L2;
            } else {
              L3: {
                if ((wf.field_c.field_g ^ -1) >= (10 + wf.field_c.field_i ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if ((wf.field_c.field_x % 11 ^ -1) == -1) {
                        break L5;
                      } else {
                        if (0 < wf.field_c.field_x) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (0 == wf.field_c.field_x) {
                      break L4;
                    } else {
                      if (!wf.field_c.field_r.c(-3088)) {
                        break L3;
                      } else {
                        if (wf.field_c.field_e[0].field_f <= 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  dupTemp$0 = wf.field_c.field_e[0];
                  dupTemp$0.field_f = dupTemp$0.field_f + (-wf.field_c.field_i + wf.field_c.field_g);
                  wf.field_c.field_g = 10 + wf.field_c.field_i;
                  break L3;
                }
              }
              if (1 != hm.field_C) {
                break L2;
              } else {
                hm.field_C = 2;
                this.field_m = -1;
                break L2;
              }
            }
          }
          L6: {
            if (16 != ob.field_K) {
              break L6;
            } else {
              if (-1 == (this.field_f ^ -1)) {
                break L6;
              } else {
                if ((jk.field_j[0] ^ -1) <= -1) {
                  this.field_f = 0;
                  gk.a(mh.field_a[2], (byte) -11);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
          }
          L7: {
            if (-18 != (ob.field_K ^ -1)) {
              break L7;
            } else {
              if ((this.field_f ^ -1) == -2) {
                break L7;
              } else {
                if ((jk.field_j[1] ^ -1) <= -1) {
                  this.field_f = 1;
                  gk.a(mh.field_a[2], (byte) -11);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
          }
          L8: {
            if ((ob.field_K ^ -1) != -19) {
              break L8;
            } else {
              if ((this.field_f ^ -1) == -3) {
                break L8;
              } else {
                if (0 <= jk.field_j[2]) {
                  this.field_f = 2;
                  gk.a(mh.field_a[2], (byte) -11);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
          }
          L9: {
            if (19 != ob.field_K) {
              break L9;
            } else {
              if ((this.field_b ^ -1) <= -5) {
                break L9;
              } else {
                if (this.field_f == 3) {
                  break L9;
                } else {
                  if ((jk.field_j[3] ^ -1) <= -1) {
                    this.field_f = 3;
                    gk.a(mh.field_a[2], (byte) -11);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
            }
          }
          L10: {
            if (-21 != (ob.field_K ^ -1)) {
              break L10;
            } else {
              if (this.field_b >= 4) {
                break L10;
              } else {
                if (-5 == (this.field_f ^ -1)) {
                  break L10;
                } else {
                  if (-1 >= (jk.field_j[4] ^ -1)) {
                    this.field_f = 4;
                    gk.a(mh.field_a[2], (byte) -11);
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
            }
          }
          L11: {
            if (ob.field_K != 19) {
              break L11;
            } else {
              if (this.field_b < 4) {
                break L11;
              } else {
                if (-6 == (this.field_f ^ -1)) {
                  break L11;
                } else {
                  if (-1 < (jk.field_j[5] ^ -1)) {
                    break L11;
                  } else {
                    this.field_f = 5;
                    gk.a(mh.field_a[2], (byte) -11);
                    break L11;
                  }
                }
              }
            }
          }
          L12: {
            if (20 != ob.field_K) {
              break L12;
            } else {
              L13: {
                if (-5 < (this.field_b ^ -1)) {
                  break L13;
                } else {
                  if (-7 == (this.field_f ^ -1)) {
                    break L13;
                  } else {
                    if (jk.field_j[6] >= 0) {
                      this.field_f = 6;
                      gk.a(mh.field_a[2], (byte) -11);
                      break L13;
                    } else {
                      break L12;
                    }
                  }
                }
              }
              break L12;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        int discarded$1 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_19_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = OrbDefence.field_D ? 1 : 0;
                    if (param2 == 1) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    discarded$1 = this.a(79, -127, (byte) -25);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var5 = -1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    stackIn_4_0 = var5 ^ -1;
                    stackIn_4_1 = 1 + param1 ^ -1;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (stackIn_4_0 <= stackIn_4_1) {
                        statePc = 18;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackIn_19_0 = -1;
                    stackIn_6_0 = stackIn_19_0;
                    if (var7 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var6 = stackIn_6_0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if ((1 + param1 ^ -1) >= (var6 ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var4 = wf.field_c.field_f.field_c * var6 + (var5 + param0);
                    stackIn_4_0 = var4 ^ -1;
                    stackIn_9_0 = stackIn_4_0;
                    stackIn_4_1 = -1;
                    stackIn_9_1 = stackIn_4_1;
                    if (var7 != 0) {
                        statePc = 4;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (stackIn_9_0 > stackIn_9_1) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if ((wf.field_c.field_f.field_i ^ -1) >= (var4 ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return false;
                }
                case 13: {
                    if (-8 == (wf.field_c.field_f.field_o[var4] ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return false;
                }
                case 16: {
                    var6++;
                    if (var7 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var5++;
                    if (var7 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return true;
                }
                case 19: {
                    return stackIn_19_0 != 0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(int param0) {
        L0: {
          if (mm.field_A != null) {
            break L0;
          } else {
            if (-1 <= (wf.field_c.field_e[0].field_d ^ -1)) {
              break L0;
            } else {
              if (fc.field_d) {
                break L0;
              } else {
                L1: {
                  if (0 == this.field_b) {
                    mm.field_A = new vg(0, 65535, bc.field_r, mm.field_C, a.field_r, nh.field_b, new int[]{wf.field_c.field_x + wf.field_c.field_e[0].field_d * 105});
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (1 == this.field_b) {
                    mm.field_A = new vg(1, 65534, bc.field_r, mm.field_C, a.field_r, nh.field_b, new int[]{105 * wf.field_c.field_e[0].field_d + wf.field_c.field_x});
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if ((this.field_b ^ -1) != -3) {
                    break L3;
                  } else {
                    mm.field_A = new vg(2, 65533, bc.field_r, mm.field_C, a.field_r, nh.field_b, new int[]{wf.field_c.field_e[0].field_d * 105 - -wf.field_c.field_x});
                    break L3;
                  }
                }
                L4: {
                  if (this.field_b != 3) {
                    break L4;
                  } else {
                    mm.field_A = new vg(3, 65532, bc.field_r, mm.field_C, a.field_r, nh.field_b, new int[]{wf.field_c.field_x + wf.field_c.field_e[0].field_d * 105});
                    break L4;
                  }
                }
                L5: {
                  if (-5 != (this.field_b ^ -1)) {
                    break L5;
                  } else {
                    mm.field_A = new vg(4, 65531, bc.field_r, mm.field_C, a.field_r, nh.field_b, new int[]{wf.field_c.field_e[0].field_d * 105 + wf.field_c.field_x});
                    break L5;
                  }
                }
                L6: {
                  if (5 == this.field_b) {
                    mm.field_A = new vg(5, 65530, bc.field_r, mm.field_C, a.field_r, nh.field_b, new int[]{wf.field_c.field_e[0].field_d * 105 + wf.field_c.field_x});
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (!n.b((byte) 31)) {
                  vl.a(3, 10, mm.field_A);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L7: {
          if (param0 == -1) {
            break L7;
          } else {
            this.field_e = -41;
            break L7;
          }
        }
    }

    final static void a(int param0, mj param1, int param2) {
        se var3 = null;
        try {
            var3 = uk.field_b;
            var3.i(param0, param2 ^ 108);
            if (param2 != 14) {
                field_r = (char[]) null;
            }
            var3.a(param1.field_g, -68);
            var3.b((byte) -60, param1.field_h);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "nk.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void b(int param0) {
        int discarded$1 = 0;
        int var2;
        L0: {
          var2 = this.b((byte) 111);
          hi.a(ee.field_b[var2], 2, false, 1, true, 2);
          if (param0 <= -80) {
            break L0;
          } else {
            discarded$1 = this.b((byte) -48);
            break L0;
          }
        }
        L1: {
          bl.field_p = var2;
          if (0 == wf.field_c.field_x) {
            break L1;
          } else {
            L2: {
              if (wf.field_c.field_g >= wf.field_c.field_i - -50) {
                break L2;
              } else {
                if (wf.field_c.field_r.c(-3088)) {
                  break L2;
                } else {
                  wf.field_c.field_g = 50 + wf.field_c.field_i;
                  break L1;
                }
              }
            }
            break L1;
          }
        }
    }

    public static void c(byte param0) {
        if (param0 != 15) {
            field_q = (gk) null;
        }
        field_w = null;
        field_q = null;
        field_r = null;
    }

    final static int a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        bm.field_d.a(em.field_o, false, true, ke.field_b);
                        bm.field_d.o(123);
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
                        if (!nf.e(32722)) {
                            statePc = 6;
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
                        bm.field_d.a(od.field_k, true, ob.field_K);
                        if (var2 != 0) {
                            statePc = 9;
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
                        if (var2 == 0) {
                            statePc = 2;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (mc.field_g == -1) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var1_int = mc.field_g;
                        il.a(-1, 0);
                        stackIn_8_0 = var1_int;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    try {
                        if (param0 < -93) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        field_w = (tl) null;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (oe.field_p) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_14_0 = 3;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0;
                }
                case 15: {
                    try {
                        if (mg.field_m != tg.field_c) {
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
                        stackIn_17_0 = 1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0;
                }
                case 18: {
                    try {
                        if (!bd.field_u.a(false)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = 1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0;
                }
                case 22: {
                    try {
                        if (mg.field_m != qc.field_g) {
                            statePc = 25;
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
                        stackIn_24_0 = 2;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0;
                }
                case 25: {
                    try {
                        stackIn_26_0 = -1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return stackIn_26_0;
                }
                case 27: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) var1), "nk.D(" + param0 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0) {
        if (param0 < 69) {
            return;
        }
        if (!(-1 <= (this.field_u ^ -1))) {
            this.field_u = 0;
            this.field_t = this.field_t / 4 * 4;
            this.field_h = 4 * (this.field_h / 4);
        }
    }

    private final int b(byte param0) {
        int var5 = 0;
        int var3 = 86 % ((-68 - param0) / 57);
        int var2 = 0;
        if (33 <= wf.field_c.field_x) {
            var2 = 3;
        }
        if (66 <= wf.field_c.field_x) {
            var2 = 6;
        }
        int var4 = wf.field_c.field_x / 11 * 11 + 11;
        if (!((var4 ^ -1) < (jc.field_f[wf.field_c.field_m].length ^ -1))) {
            var5 = jc.field_f[wf.field_c.field_m][var4 - 1];
            if ((var5 ^ -1) == -10 || (var5 ^ -1) == -11) {
                var2 = 9;
            }
        }
        return var2;
    }

    nk(int param0) {
        this.field_h = 192;
        this.field_d = new int[1500];
        this.field_t = 320;
        this.field_e = 0;
        this.field_p = 0;
        this.field_f = 0;
        this.field_g = false;
        this.field_i = 0;
        this.field_u = 200;
        this.field_a = -1;
        this.field_x = 1;
        n.field_a = param0;
        this.field_b = param0;
        this.field_k = false;
        if ((param0 ^ -1) < -4) {
            this.field_u = 400;
        }
        this.field_v = new im();
        this.field_i = 0;
        this.field_m = -1;
        bc.field_r = 0;
        this.field_o = 0;
        dm.field_f = 0;
        mm.field_C = 0;
        jk.field_j = new int[]{2, 2, -1, -1, -1, -1, 0};
        a.field_r = 0;
        nh.field_b = 0;
        this.field_c = 0;
        df.field_g = 1000;
        wf.field_c = new f(param0);
        this.field_s = -1 < (this.field_l ^ -1) ? null : wf.field_c.field_e[this.field_l];
        wf.field_c.a((byte) -4, 0, 0);
        hm.field_C = 0;
        this.b(-97);
    }

    static {
        field_q = new gk();
        field_r = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_w = new tl();
    }
}
