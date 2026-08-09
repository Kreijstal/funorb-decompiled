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
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int stackIn_114_0 = 0;
        int stackIn_114_1 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        String[] stackIn_120_0 = null;
        String[] stackIn_120_1 = null;
        int stackIn_120_2 = 0;
        String[] stackIn_121_0 = null;
        String[] stackIn_121_1 = null;
        int stackIn_121_2 = 0;
        String[] stackIn_122_0 = null;
        String[] stackIn_122_1 = null;
        int stackIn_122_2 = 0;
        String stackIn_122_3 = null;
        int stackIn_125_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_138_1 = 0;
        int stackIn_142_0 = 0;
        int stackIn_142_1 = 0;
        int stackIn_159_0 = 0;
        int stackIn_159_1 = 0;
        int stackIn_213_0 = 0;
        int stackIn_213_1 = 0;
        int stackIn_220_0 = 0;
        int stackIn_408_0 = 0;
        int stackIn_411_0 = 0;
        int stackIn_417_0 = 0;
        int stackIn_420_0 = 0;
        int stackIn_431_0 = 0;
        int stackIn_434_0 = 0;
        int stackIn_445_0 = 0;
        int stackIn_445_1 = 0;
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
        hj var21 = null;
        String var22 = null;
        Object var23 = null;
        Object var24 = null;
        Object var25 = null;
        Object var26 = null;
        kb var27 = null;
        hj var28 = null;
        int[] var29 = null;
        hj var30 = null;
        hj var31 = null;
        String[][] var32 = null;
        String var33 = null;
        int[] var34 = null;
        pd var35 = null;
        pd var36 = null;
        me var37 = null;
        oj var38 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var23 = null;
                    var24 = null;
                    var25 = null;
                    var26 = null;
                    var20 = OrbDefence.field_D ? 1 : 0;
                    wf.field_c.field_f.a(this.field_h, -32, this.field_t, false);
                    wf.field_c.field_f.a(this.field_h, 121, this.field_t, true);
                    var35 = (pd) ((Object) this.field_v.b((byte) 115));
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var35 == null) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var35.a(this.field_t, (byte) 100, this.field_h);
                    var35 = (pd) ((Object) this.field_v.d(param0 ^ 855));
                    statePc = 1;
                    continue stateLoop;
                }
                case 3: {
                    if (3 >= this.field_b) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (200 < this.field_u) {
                        statePc = 6;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ul.d(0, 0, 640, 480, 0, this.field_u - 200);
                    statePc = 9;
                    continue stateLoop;
                }
                case 7: {
                    if (-1 <= (this.field_u ^ -1)) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ul.d(0, 0, 640, 480, 0, this.field_u);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var3 = -this.field_t + ol.field_e * eh.field_a + (320 + -(ol.field_e / 2));
                    var4 = uh.field_b * ol.field_e - -240 - ol.field_e / 2 + -this.field_h;
                    var5 = eh.field_a - -(wf.field_c.field_f.field_c * uh.field_b);
                    var6 = 16724787;
                    var7 = oj.a((byte) 47, this.field_f);
                    if (var5 < 0) {
                        statePc = 18;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (wf.field_c.field_f.field_i <= var5) {
                        statePc = 18;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (!this.a(var7, param0 + 22725, var5)) {
                        statePc = 16;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (6 != this.field_f) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (this.a(var5, var7, (byte) -40) == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var6 = 65399;
                    statePc = 18;
                    continue stateLoop;
                }
                case 16: {
                    if ((wf.field_c.field_f.field_o[var5] ^ -1) != -8) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var6 = 16777011;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    var8 = 0;
                    if (var6 != 65399) {
                        statePc = 35;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (wf.field_c.field_e[0].b(true) < ui.field_a[this.field_f][0]) {
                        statePc = 34;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (this.field_f != 0) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var8 = 10;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (this.field_f != 1) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var8 = 8;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (-3 != (this.field_f ^ -1)) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var8 = 20;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if ((this.field_f ^ -1) == -4) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var8 = 6;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (this.field_f == 4) {
                        statePc = 31;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var8 = 30;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (5 != this.field_f) {
                        statePc = 35;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var8 = 6;
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    var6 = 16724787;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var6 != 16777011) {
                        statePc = 39;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var27 = wf.field_c.a(var5, param0 ^ 123);
                    if (var27 == null) {
                        statePc = 39;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (6 == var27.field_C) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var4 = -(ol.field_e / 2) + ol.field_e * var27.field_h + (240 - this.field_h);
                    var3 = -(ol.field_e / 2) + ol.field_e * var27.field_g + 320 + -this.field_t;
                    var8 = var27.field_l;
                    var5 = wf.field_c.field_f.field_c * var27.field_h + var27.field_g;
                    var7 = oj.a((byte) 47, var27.field_C);
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    var21 = new hj(64, 64);
                    var28 = var21;
                    var28.d();
                    if ((this.field_f ^ -1) != -1) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    hf.field_g[0].a(32 + ol.field_e / 2, 27 + ol.field_e / 2, 0, 1300);
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if ((this.field_f ^ -1) != -2) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    hf.field_g[7].a(32 - -ol.field_e, ol.field_e + 27, 0, 1950);
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (-3 != (this.field_f ^ -1)) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    hf.field_g[14].a(32 + ol.field_e, ol.field_e + 27, 0, 1950);
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (3 != this.field_f) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    hf.field_g[21].a(ol.field_e / 2 + 32, 27 - -(ol.field_e / 2), 0, 1300);
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (4 != this.field_f) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    hf.field_g[28].a(32 - -(ol.field_e * 3 / 2), 27 - -(3 * ol.field_e / 2), 0, 2600);
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (-6 != (this.field_f ^ -1)) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    hf.field_g[35].a(ol.field_e + 32, ol.field_e + 27, 0, 1950);
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (6 != this.field_f) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    hf.field_g[42].a(ol.field_e / 2 + 32, ol.field_e / 2 + 27, 0, 1300);
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    var10 = 0;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (var10 >= var28.field_v.length) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var11 = var21.field_v[var10];
                    var12 = 255 & var11 | (var11 & 65280) >> -848353848 | var11 >> 1272784112 & 255;
                    var28.field_v[var10] = vi.a(16711680, var12 * vi.a(var6, 16711680) / 255) + (vi.a(var12 * vi.a(65280, var6) / 255, 65280) - -vi.a(255, var12 * vi.a(255, var6) / 255));
                    var10++;
                    statePc = 54;
                    continue stateLoop;
                }
                case 56: {
                    cb.field_a.a(-40);
                    if (16777011 != var6) {
                        statePc = 58;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var28.c(var3 + -32, -32 + var4);
                    if (this.field_f != 6) {
                        statePc = 69;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (!this.a(var7, 22727, var5)) {
                        statePc = 69;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var10 = this.a(var5, var7, (byte) -64);
                    var11 = 255 & var10;
                    if (0 >= var11) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var12 = 320 + (ol.field_e * (var11 + eh.field_a) + (-(ol.field_e / 2) + -this.field_t));
                    var13 = -this.field_h + (ol.field_e * uh.field_b + (240 - ol.field_e / 2));
                    var28.c(-32 + var12, var13 - 32);
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    var12 = (65280 & var10) >> 582179656;
                    if (-1 <= (var12 ^ -1)) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var13 = (-var12 + eh.field_a) * ol.field_e + (320 - (ol.field_e / 2 + this.field_t));
                    var14_int = -this.field_h + (-(ol.field_e / 2) + 240 + uh.field_b * ol.field_e);
                    var28.c(-32 + var13, var14_int - 32);
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    var13 = var10 >> -2138413392 & 255;
                    if ((var13 ^ -1) >= -1) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var14_int = -this.field_t + (-(ol.field_e / 2) + ol.field_e * eh.field_a) + 320;
                    var15 = -this.field_h + ((var13 + uh.field_b) * ol.field_e + 240) + -(ol.field_e / 2);
                    var28.c(-32 + var14_int, -32 + var15);
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    var14_int = (var10 & -16777216) >> -1961284936;
                    if (var14_int > 0) {
                        statePc = 68;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var15 = ol.field_e * eh.field_a - -320 + -(ol.field_e / 2) - this.field_t;
                    var16 = -this.field_h + 240 + ((-var14_int + uh.field_b) * ol.field_e + -(ol.field_e / 2));
                    var28.c(-32 + var15, -32 + var16);
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if (-1 <= (var8 ^ -1)) {
                        statePc = 77;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var10 = ol.field_e;
                    var12 = 0;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if (var12 >= 16) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var12++;
                    statePc = 71;
                    continue stateLoop;
                }
                case 73: {
                    var34 = new int[256];
                    var29 = var34;
                    var11_ref_int__ = var29;
                    var4 = var4 + (var7 - 1) * var10;
                    var12 = 0;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (var12 >= 4) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var11_ref_int__[4 - var12] = -(var12 * 4112) - (-32896 - 2097152 * (4 - var12));
                    var11_ref_int__[4 - -var12] = 32896 - (4112 * var12 - -(var12 * 2097152) - 8388608);
                    var12++;
                    statePc = 74;
                    continue stateLoop;
                }
                case 76: {
                    var3 = var3 + var10 * (var7 + -1);
                    ul.a(var3 << 1997568868, var4 << 209319428, var10 * var8 << -1559761852, 32, var34);
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    var3_ref_kb = (kb) ((Object) wf.field_c.field_o.b((byte) 116));
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (var3_ref_kb == null) {
                        statePc = 80;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var3_ref_kb.a(this.field_t, this.field_h, param0 + -10);
                    var3_ref_kb = (kb) ((Object) wf.field_c.field_o.d(param0 + 851));
                    statePc = 78;
                    continue stateLoop;
                }
                case 80: {
                    var3_ref_kb = (kb) ((Object) wf.field_c.field_o.b((byte) 122));
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    if (var3_ref_kb == null) {
                        statePc = 87;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    stackIn_445_0 = -7;
                    stackIn_83_0 = stackIn_445_0;
                    stackIn_445_1 = var3_ref_kb.field_C ^ -1;
                    stackIn_83_1 = stackIn_445_1;
                    if (false) {
                        statePc = 445;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (stackIn_83_0 == stackIn_83_1) {
                        statePc = 85;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var4 = -this.field_t + var3_ref_kb.field_g * ol.field_e + 320;
                    var5 = 240 + ol.field_e * var3_ref_kb.field_h - this.field_h;
                    hf.field_g[1 - -(7 * var3_ref_kb.field_C)].a(var4, var5 - 5, 0, 1300);
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    var3_ref_kb = (kb) ((Object) wf.field_c.field_o.d(853));
                    statePc = 81;
                    continue stateLoop;
                }
                case 87: {
                    var36 = (pd) ((Object) wf.field_c.field_r.b((byte) 127));
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    if (var36 == null) {
                        statePc = 90;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var36.a(this.field_t, (byte) 86, this.field_h);
                    var36 = (pd) ((Object) wf.field_c.field_r.d(853));
                    statePc = 88;
                    continue stateLoop;
                }
                case 90: {
                    var3_ref_kb = (kb) ((Object) wf.field_c.field_o.b((byte) 114));
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if (var3_ref_kb == null) {
                        statePc = 97;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    stackIn_93_0 = var3_ref_kb.field_C ^ -1;
                    stackIn_93_1 = -6;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    if (stackIn_93_0 != stackIn_93_1) {
                        statePc = 96;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var4 = var3_ref_kb.f(100);
                    if ((var4 ^ -1) >= -1) {
                        statePc = 96;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var5 = ol.field_e / 2 + -this.field_t + var3_ref_kb.field_g * ol.field_e + 320;
                    var6 = -24 + ol.field_e * var3_ref_kb.field_h + (-this.field_h + 240);
                    ob.field_I.c(Integer.toString(var4), var5, var6, 16777215, 0);
                    var3_ref_kb.a(this.field_t, (byte) -108, this.field_h);
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    var3_ref_kb = (kb) ((Object) wf.field_c.field_o.d(853));
                    statePc = 91;
                    continue stateLoop;
                }
                case 97: {
                    var37 = (me) ((Object) wf.field_c.field_h.b((byte) 114));
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    if (var37 == null) {
                        statePc = 100;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var37.a(this.field_t, this.field_h, (byte) 102);
                    var37 = (me) ((Object) wf.field_c.field_h.d(853));
                    statePc = 98;
                    continue stateLoop;
                }
                case 100: {
                    if (-1 > (l.field_c ^ -1)) {
                        statePc = 102;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var3 = 16711680;
                    if ((4 & l.field_c) == 0) {
                        statePc = 104;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var3 = 16729156;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    var4 = 8 + jd.field_c.a(hd.field_j);
                    if ((var4 / 2 ^ -1) < (wl.field_a ^ -1)) {
                        statePc = 107;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 107: {
                    wl.field_a = var4 / 2;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    if ((-(var4 / 2) + 640 ^ -1) <= (wl.field_a ^ -1)) {
                        statePc = 110;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    wl.field_a = -(var4 / 2) + 640;
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    ul.g(-8 + wl.field_a + -(var4 / 2), md.field_f - 16, 16 + var4, 24, 16777215, 192);
                    ul.d(wl.field_a - (var4 / 2 - -8), md.field_f - 16, var4 + 16, 24, 0, 192);
                    jd.field_c.c(hd.field_j, -1 + wl.field_a, md.field_f, 0, 0);
                    jd.field_c.c(hd.field_j, wl.field_a, md.field_f + -1, 0, 0);
                    jd.field_c.c(hd.field_j, wl.field_a, md.field_f, var3, -1);
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    var3 = 0;
                    var4_ref_pd = (pd) ((Object) wf.field_c.field_r.b((byte) -18));
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if (var4_ref_pd == null) {
                        statePc = 118;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    stackIn_119_0 = -1;
                    stackIn_114_0 = stackIn_119_0;
                    stackIn_119_1 = var4_ref_pd.field_o ^ -1;
                    stackIn_114_1 = stackIn_119_1;
                    if (false) {
                        statePc = 119;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (stackIn_114_0 > stackIn_114_1) {
                        statePc = 116;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 116: {
                    var3 = var3 + var4_ref_pd.field_o;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    var4_ref_pd = (pd) ((Object) wf.field_c.field_r.d(param0 + 851));
                    statePc = 112;
                    continue stateLoop;
                }
                case 118: {
                    em.c((byte) 67);
                    i.field_a.b(0, 0);
                    hc.field_i.b(0, 358);
                    ul.e(0, 0, param0, 480);
                    ul.a(0, 0, 640, 480, 11184810, 4605510);
                    ul.e(638, 0, 640, 480);
                    ul.a(0, 0, 640, 480, 11184810, 4605510);
                    ul.c();
                    stackIn_119_0 = 2;
                    stackIn_119_1 = 2;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    ul.d(stackIn_119_0, stackIn_119_1, 636, 476, 0);
                    array$0 = new String[13];
                    stackIn_121_0 = (String[]) (array$0);
                    stackIn_120_0 = stackIn_121_0;
                    stackIn_121_1 = (String[]) (array$0);
                    stackIn_120_1 = stackIn_121_1;
                    stackIn_121_2 = 7;
                    stackIn_120_2 = stackIn_121_2;
                    if (!ok.a(0, false)) {
                        statePc = 121;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    stackIn_122_0 = (String[]) ((Object) stackIn_120_0);
                    stackIn_122_1 = (String[]) ((Object) stackIn_120_1);
                    stackIn_122_2 = stackIn_120_2;
                    stackIn_122_3 = jl.field_f;
                    statePc = 122;
                    continue stateLoop;
                }
                case 121: {
                    stackIn_122_0 = (String[]) ((Object) stackIn_121_0);
                    stackIn_122_1 = (String[]) ((Object) stackIn_121_1);
                    stackIn_122_2 = stackIn_121_2;
                    stackIn_122_3 = uh.field_c;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    stackIn_122_1[stackIn_122_2] = stackIn_122_3;
                    stackIn_122_0[8] = bk.field_b;
                    stackIn_122_0[9] = k.field_a;
                    stackIn_122_0[10] = bi.field_a;
                    stackIn_122_0[11] = bi.field_a;
                    stackIn_122_0[12] = od.field_a;
                    var4_ref_String__ = stackIn_122_0;
                    ul.e(177, 0, 462, 480);
                    var5 = -79 + 79 * wf.field_c.field_x;
                    if (wf.field_c.field_x <= 0) {
                        statePc = 124;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    stackIn_125_0 = 1;
                    statePc = 125;
                    continue stateLoop;
                }
                case 124: {
                    stackIn_125_0 = 0;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    var6 = stackIn_125_0;
                    if (0 >= wf.field_c.field_y) {
                        statePc = 127;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    var5 = var5 - wf.field_c.field_y * 79 / 50;
                    var6 = 0;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    if (var3 == 0) {
                        statePc = 129;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var6 = 0;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    var7 = 39;
                    ad.field_e.c(-var7 + -(var5 % ad.field_e.field_s), 358);
                    ad.field_e.c(-(var5 % ad.field_e.field_s) - (var7 + -ad.field_e.field_s), 358);
                    if (var6 == 0) {
                        statePc = 135;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    var8 = 276;
                    var9 = 358;
                    var10 = 79;
                    var11 = 33;
                    ul.a(var8 - 8, var9 + -8, var10 + 16, var11 - -16, 8, 16776960, 64);
                    ul.a(var8 - 7, -7 + var9, 14 + var10, var11 - -14, 8, 16776960, 64);
                    ul.a(var8 + -6, -6 + var9, 12 + var10, 12 + var11, 8, 16776960, 64);
                    ul.a(-5 + var8, var9 - 5, var10 - -10, 10 + var11, 8, 16776960, 64);
                    if ((wf.field_c.field_x % 11 ^ -1) == -1) {
                        statePc = 133;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    ul.a(var8, var9, var10, var11, 8947848, 65280);
                    statePc = 134;
                    continue stateLoop;
                }
                case 133: {
                    ul.a(var8, var9, var10, var11, 8947848, 16711680);
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
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
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    var8 = 0;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    if (var8 >= 99) {
                        statePc = 141;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    var22 = var4_ref_String__[jc.field_f[this.field_b][var8]];
                    var9_ref_String = var22;
                    stackIn_142_0 = 10;
                    stackIn_138_0 = stackIn_142_0;
                    stackIn_142_1 = var8 % 11;
                    stackIn_138_1 = stackIn_142_1;
                    if (false) {
                        statePc = 142;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    if (stackIn_138_0 != stackIn_138_1) {
                        statePc = 140;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    var9_ref_String = t.a(-415993727, new String[]{var22}, ia.field_e);
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    cc.field_t.a(Integer.toString(var8 - -1), -4 + -var5 + (320 + 79 * var8), 387, 0, -1, 128);
                    ob.field_I.a(var9_ref_String, -4 + -var5 + (320 - -(79 * var8)) - 39 - 1, 358, 76, 33, 0, 0, 1, 1, 12);
                    ob.field_I.a(var9_ref_String, -39 + 79 * var8 + (-var5 + 320) - 4, 357, 76, 33, 0, 0, 1, 1, 12);
                    ob.field_I.a(var9_ref_String, -43 + (79 * var8 + -var5 + 320), 358, 76, 33, 16777215, -1, 1, 1, 12);
                    var8++;
                    statePc = 136;
                    continue stateLoop;
                }
                case 141: {
                    ul.c();
                    ob.field_I.c(Integer.toString(wf.field_c.field_x), 111, 29, 0, 0);
                    ob.field_I.c(Integer.toString(wf.field_c.field_x), 110, 30, 0, 0);
                    ob.field_I.c(Integer.toString(wf.field_c.field_x), 111, 30, 16777215, -1);
                    stackIn_142_0 = -wf.field_c.field_i + wf.field_c.field_g;
                    stackIn_142_1 = 50;
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    var4 = stackIn_142_0 / stackIn_142_1;
                    if ((var4 ^ -1) > -1) {
                        statePc = 144;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var4 = 0;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    ob.field_I.a(Integer.toString(var4), 200, 24, 16777215, -1);
                    if (0 >= wf.field_c.field_e[0].field_f) {
                        statePc = 149;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    ob.field_I.b(t.a(-415993727, new String[]{Integer.toString(wf.field_c.field_e[0].field_d)}, ke.field_a), 400, 32, 16777215, -1);
                    var4 = 32;
                    var5 = 526;
                    if ((wj.field_m ^ -1) != -2) {
                        statePc = 148;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var5 = 465;
                    var4 = 48;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    jd.field_c.b(t.a(-415993727, new String[]{Integer.toString(wf.field_c.field_e[0].field_f)}, rl.field_d), var5, var4, 16777215, -1);
                    statePc = 150;
                    continue stateLoop;
                }
                case 149: {
                    ob.field_I.b(t.a(-415993727, new String[]{Integer.toString(wf.field_c.field_e[0].field_d)}, ke.field_a), 400, 32, 16777215, -1);
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    var32 = new String[][]{new String[]{jg.field_l, jg.field_l + " I", jg.field_l + " II", jg.field_l + " III", nd.field_f, ob.field_L}, new String[]{am.field_g, am.field_g + " I", am.field_g + " II", am.field_g + " III", p.field_e, kd.field_b}, new String[]{oj.field_o, oj.field_o + " I", oj.field_o + " II", oj.field_o + " III", ug.field_o, cd.field_r}, new String[]{fd.field_g, fd.field_g + " I", fd.field_g + " II", fd.field_g + " III", b.field_q, ua.field_b}, new String[]{q.field_c, q.field_c + " I", q.field_c + " II", q.field_c + " III", lj.field_B, ob.field_E}, new String[]{kg.field_l, kg.field_l + " I", kg.field_l + " II", kg.field_l + " III", de.field_c, ua.field_d}, new String[]{gl.field_c, gl.field_c, gl.field_c + " II", gl.field_c + " III", lj.field_B, ob.field_E}};
                    var5 = this.field_f;
                    var6 = 0;
                    var7 = uh.field_b * wf.field_c.field_f.field_c + eh.field_a;
                    if (var7 < 0) {
                        statePc = 156;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    if ((var7 ^ -1) <= (wf.field_c.field_f.field_i ^ -1)) {
                        statePc = 156;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    if ((wf.field_c.field_f.field_o[var7] ^ -1) != -8) {
                        statePc = 156;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    var8_ref_kb = wf.field_c.a(var7, 126);
                    if (var8_ref_kb != null) {
                        statePc = 155;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 155: {
                    var6 = var8_ref_kb.field_F - -1;
                    var5 = var8_ref_kb.field_C;
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    var7 = 0;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    if ((var7 ^ -1) <= -6) {
                        statePc = 212;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    var8 = var7;
                    stackIn_213_0 = 3;
                    stackIn_159_0 = stackIn_213_0;
                    stackIn_213_1 = this.field_b;
                    stackIn_159_1 = stackIn_213_1;
                    if (false) {
                        statePc = 213;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if (stackIn_159_0 >= stackIn_159_1) {
                        statePc = 164;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    if (-4 == (var7 ^ -1)) {
                        statePc = 163;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    if (-5 != (var7 ^ -1)) {
                        statePc = 164;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    var8 = 6;
                    statePc = 164;
                    continue stateLoop;
                }
                case 163: {
                    var8 = 5;
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    var9 = 56;
                    var10 = ck.field_c[0].field_s;
                    var11 = 320 + -(var10 / 2) - (var9 * 2 - var9 * var7);
                    var12 = 405;
                    if (-1 < (jk.field_j[var8] ^ -1)) {
                        statePc = 174;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    ck.field_c[1].c(var11, var12);
                    if ((this.field_f ^ -1) != (var8 ^ -1)) {
                        statePc = 167;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    ul.b(var11, var12, var10, var10, 3, 16777215, 128);
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    if ((ua.field_a ^ -1) > (var11 ^ -1)) {
                        statePc = 175;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if ((var12 ^ -1) < (vl.field_d ^ -1)) {
                        statePc = 175;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    if (ua.field_a >= var10 + var11) {
                        statePc = 175;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    if ((vl.field_d ^ -1) <= (var12 - -var10 ^ -1)) {
                        statePc = 175;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    ul.d(var11 + 6, var12 - -6, var10 - 12, var10 + -12, 16777215, 128);
                    var6 = 0;
                    var5 = var8;
                    if (of.field_G != 1) {
                        statePc = 175;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    if (var8 == this.field_f) {
                        statePc = 175;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    this.field_f = var8;
                    gk.a(mh.field_a[2], (byte) -11);
                    statePc = 175;
                    continue stateLoop;
                }
                case 174: {
                    ck.field_c[0].c(var11, var12);
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    ul.e(var11 + 6, var12, var11 + 46, 46 + var12);
                    if (jk.field_j[var8] < 3) {
                        statePc = 197;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    var12 += 10;
                    var11 += 10;
                    hf.field_g[0 - -(7 * var8)].d(var11, var12);
                    if ((var8 ^ -1) < -4) {
                        statePc = 178;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    var12 += 4;
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    if (3 != var8) {
                        statePc = 180;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    var12 -= 4;
                    statePc = 180;
                    continue stateLoop;
                }
                case 180: {
                    if (var8 != 5) {
                        statePc = 182;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    var30 = hf.field_g[7 * var8 + 6];
                    var13_ref_hj = var30;
                    var13_ref_hj.a(var30.field_s << -1325038525, var30.field_t << 637088483, 16 + var11 << 265044900, 10 + var12 << 1598848932, wf.field_c.field_i * 1000, 2048);
                    statePc = 183;
                    continue stateLoop;
                }
                case 182: {
                    hf.field_g[7 * var8 + 6].a(512, 128, var11 + 16 << 1117748548, var12 - -6 << -446087644, (int)(Math.sin(0.1 * (double)wf.field_c.field_i + (double)var8) * 10000.0), 2048);
                    statePc = 183;
                    continue stateLoop;
                }
                case 183: {
                    if ((var8 ^ -1) != -6) {
                        statePc = 185;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    var12 -= 2;
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    if (var8 <= 3) {
                        statePc = 187;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 187: {
                    var12 -= 4;
                    statePc = 188;
                    continue stateLoop;
                }
                case 188: {
                    if ((var8 ^ -1) == -3) {
                        statePc = 190;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 190: {
                    var12 -= 4;
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    if (-4 != (var8 ^ -1)) {
                        statePc = 193;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    var12 -= 2;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if ((var8 ^ -1) == -5) {
                        statePc = 195;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 195: {
                    var12 -= 8;
                    statePc = 196;
                    continue stateLoop;
                }
                case 196: {
                    hf.field_g[7 * var8 + 1].d(var11, var12);
                    statePc = 211;
                    continue stateLoop;
                }
                case 197: {
                    if (0 <= jk.field_j[var8]) {
                        statePc = 199;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    al.field_d.a(10 + var11, var12 - -10);
                    statePc = 211;
                    continue stateLoop;
                }
                case 199: {
                    var11 += 10;
                    var12 += 10;
                    hf.field_g[var8 * 7 + 0].d(var11, var12);
                    if ((var8 ^ -1) == -6) {
                        statePc = 201;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    hf.field_g[var8 * 7 + 2].a(512, 256, 16 + var11 << -171477660, 6 + var12 << 1777914180, (int)(Math.sin(0.1 * (double)wf.field_c.field_i + (double)var8) * 10000.0), 2048);
                    statePc = 202;
                    continue stateLoop;
                }
                case 201: {
                    var31 = hf.field_g[2 + 7 * var8];
                    var13_ref_hj = var31;
                    var13_ref_hj.a(var31.field_s << 1827844739, var31.field_t << 910739971, var11 - -16 << -235870204, var12 + 10 << 211117348, wf.field_c.field_i * 1000, 2048);
                    statePc = 202;
                    continue stateLoop;
                }
                case 202: {
                    if ((var8 ^ -1) != -3) {
                        statePc = 204;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    var12 -= 4;
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    if (3 == var8) {
                        statePc = 206;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 206: {
                    var12 -= 6;
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    if (4 == var8) {
                        statePc = 209;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 209: {
                    var12 -= 8;
                    statePc = 210;
                    continue stateLoop;
                }
                case 210: {
                    hf.field_g[var8 * 7 + 1].d(var11, var12);
                    statePc = 211;
                    continue stateLoop;
                }
                case 211: {
                    ul.c();
                    var7++;
                    statePc = 157;
                    continue stateLoop;
                }
                case 212: {
                    ob.field_I.c(var32[var5][var6], 549, 380, 16777215, -1);
                    stackIn_213_0 = 0;
                    stackIn_213_1 = var5;
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    if (stackIn_213_0 == stackIn_213_1) {
                        statePc = 219;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    if ((var5 ^ -1) == -2) {
                        statePc = 219;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    if (var5 == 4) {
                        statePc = 219;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    if (var5 == 3) {
                        statePc = 218;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    stackIn_220_0 = 1;
                    statePc = 220;
                    continue stateLoop;
                }
                case 218: {
                    stackIn_220_0 = 2;
                    statePc = 220;
                    continue stateLoop;
                }
                case 219: {
                    stackIn_220_0 = 0;
                    statePc = 220;
                    continue stateLoop;
                }
                case 220: {
                    var7 = stackIn_220_0;
                    if ((var5 ^ -1) != -7) {
                        statePc = 222;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    var7 = 3;
                    statePc = 222;
                    continue stateLoop;
                }
                case 222: {
                    if (5 != var5) {
                        statePc = 224;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    var7 = 0;
                    statePc = 224;
                    continue stateLoop;
                }
                case 224: {
                    var8 = 1;
                    var9 = 5;
                    var10 = 25;
                    var11 = 40;
                    var12 = 30;
                    var13 = 0;
                    if (-3 == (var5 ^ -1)) {
                        statePc = 231;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    if ((var5 ^ -1) == -4) {
                        statePc = 230;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    if (var5 != 4) {
                        statePc = 228;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    var12 = 30;
                    var13 = -10;
                    var11 = 45;
                    statePc = 232;
                    continue stateLoop;
                }
                case 228: {
                    if ((var5 ^ -1) != -6) {
                        statePc = 232;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    var12 = 24;
                    var13 = 0;
                    var11 = 37;
                    statePc = 232;
                    continue stateLoop;
                }
                case 230: {
                    var12 = 20;
                    var13 = -10;
                    statePc = 232;
                    continue stateLoop;
                }
                case 231: {
                    var12 = 25;
                    var13 = -10;
                    statePc = 232;
                    continue stateLoop;
                }
                case 232: {
                    if ((var5 ^ -1) != -1) {
                        statePc = 242;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    var8 = 5;
                    var9 = 30;
                    if ((var6 ^ -1) == -3) {
                        statePc = 241;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if ((var6 ^ -1) != -4) {
                        statePc = 236;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    var8 = 20;
                    statePc = 289;
                    continue stateLoop;
                }
                case 236: {
                    if (var6 == 4) {
                        statePc = 240;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    if (-6 == (var6 ^ -1)) {
                        statePc = 239;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 239: {
                    var8 = 40;
                    statePc = 289;
                    continue stateLoop;
                }
                case 240: {
                    var8 = 25;
                    statePc = 289;
                    continue stateLoop;
                }
                case 241: {
                    var8 = 10;
                    statePc = 289;
                    continue stateLoop;
                }
                case 242: {
                    if ((var5 ^ -1) != -2) {
                        statePc = 252;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    var8 = 12;
                    var9 = 8;
                    if (-3 == (var6 ^ -1)) {
                        statePc = 251;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    if ((var6 ^ -1) != -4) {
                        statePc = 246;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    var9 = 12;
                    var8 = 22;
                    statePc = 289;
                    continue stateLoop;
                }
                case 246: {
                    if (4 == var6) {
                        statePc = 250;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 247: {
                    if (-6 == (var6 ^ -1)) {
                        statePc = 249;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 249: {
                    var9 = 16;
                    var8 = 64;
                    statePc = 289;
                    continue stateLoop;
                }
                case 250: {
                    var9 = 14;
                    var8 = 32;
                    statePc = 289;
                    continue stateLoop;
                }
                case 251: {
                    var9 = 10;
                    var8 = 16;
                    statePc = 289;
                    continue stateLoop;
                }
                case 252: {
                    if (2 == var5) {
                        statePc = 281;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    if (-4 == (var5 ^ -1)) {
                        statePc = 272;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    if (var5 != 4) {
                        statePc = 263;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    var8 = 200;
                    var9 = 30;
                    if (-3 != (var6 ^ -1)) {
                        statePc = 257;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    var8 = 250;
                    statePc = 289;
                    continue stateLoop;
                }
                case 257: {
                    if ((var6 ^ -1) == -4) {
                        statePc = 262;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    if ((var6 ^ -1) != -5) {
                        statePc = 260;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    var8 = 500;
                    statePc = 289;
                    continue stateLoop;
                }
                case 260: {
                    if (var6 != 5) {
                        statePc = 289;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    var8 = 1000;
                    statePc = 289;
                    continue stateLoop;
                }
                case 262: {
                    var8 = 333;
                    statePc = 289;
                    continue stateLoop;
                }
                case 263: {
                    if (-6 != (var5 ^ -1)) {
                        statePc = 289;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    var8 = 5;
                    var10 = 25;
                    var9 = 6;
                    if (-3 == (var6 ^ -1)) {
                        statePc = 271;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    if (3 == var6) {
                        statePc = 270;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    if (var6 == 4) {
                        statePc = 269;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    if (-6 != (var6 ^ -1)) {
                        statePc = 289;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    var10 = 125;
                    var8 = 80;
                    statePc = 289;
                    continue stateLoop;
                }
                case 269: {
                    var10 = 100;
                    var8 = 40;
                    statePc = 289;
                    continue stateLoop;
                }
                case 270: {
                    var8 = 20;
                    var10 = 75;
                    statePc = 289;
                    continue stateLoop;
                }
                case 271: {
                    var10 = 50;
                    var8 = 10;
                    statePc = 289;
                    continue stateLoop;
                }
                case 272: {
                    var9 = 6;
                    var8 = 1;
                    if (var6 != 2) {
                        statePc = 274;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    var8 = 2;
                    statePc = 289;
                    continue stateLoop;
                }
                case 274: {
                    if (-4 == (var6 ^ -1)) {
                        statePc = 280;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    if (4 != var6) {
                        statePc = 277;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    var8 = 4;
                    statePc = 289;
                    continue stateLoop;
                }
                case 277: {
                    if (5 == var6) {
                        statePc = 279;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 279: {
                    var8 = 5;
                    statePc = 289;
                    continue stateLoop;
                }
                case 280: {
                    var8 = 3;
                    statePc = 289;
                    continue stateLoop;
                }
                case 281: {
                    var9 = 20;
                    var8 = 40;
                    if ((var6 ^ -1) == -3) {
                        statePc = 288;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 282: {
                    if (-4 == (var6 ^ -1)) {
                        statePc = 287;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    if ((var6 ^ -1) != -5) {
                        statePc = 285;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    var8 = 80;
                    var9 = 25;
                    statePc = 289;
                    continue stateLoop;
                }
                case 285: {
                    if (var6 != 5) {
                        statePc = 289;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 286: {
                    var8 = 100;
                    var9 = 30;
                    statePc = 289;
                    continue stateLoop;
                }
                case 287: {
                    var8 = 70;
                    statePc = 289;
                    continue stateLoop;
                }
                case 288: {
                    var8 = 50;
                    statePc = 289;
                    continue stateLoop;
                }
                case 289: {
                    hf.field_g[7 * var5].c(469, 405);
                    if (-7 == (var5 ^ -1)) {
                        statePc = 296;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 290: {
                    var14_int = 4000;
                    if (-6 == (var5 ^ -1)) {
                        statePc = 292;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 292: {
                    var14_int = 102100;
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    var15 = var6 + var5 * 7 + 1;
                    if (var6 != 0) {
                        statePc = 295;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    var15++;
                    statePc = 295;
                    continue stateLoop;
                }
                case 295: {
                    var16 = var11 + 465;
                    var17 = 405 + var12;
                    hf.field_g[var15].a(-85, var16, var17, var14_int, 4096);
                    statePc = 296;
                    continue stateLoop;
                }
                case 296: {
                    hf.field_g[7 * var5 + 1].c(469, 405 - -var13);
                    if (var5 == 6) {
                        statePc = 307;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    if ((var7 ^ -1) != -1) {
                        statePc = 299;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    jd.field_c.b(sd.field_d, 530, 420, 16777215, 0);
                    statePc = 299;
                    continue stateLoop;
                }
                case 299: {
                    if (1 != var7) {
                        statePc = 301;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 300: {
                    jd.field_c.b(ei.field_b, 530, 420, 16777215, 0);
                    statePc = 301;
                    continue stateLoop;
                }
                case 301: {
                    if (var7 == 2) {
                        statePc = 303;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 303: {
                    jd.field_c.b(t.field_k, 530, 420, 16777215, 0);
                    statePc = 304;
                    continue stateLoop;
                }
                case 304: {
                    jd.field_c.a(Integer.toString(var8), 625, 420, 16777215, 0);
                    if ((var5 ^ -1) != -6) {
                        statePc = 306;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 305: {
                    jd.field_c.b(ca.field_a, 530, 440, 16777215, 0);
                    jd.field_c.a(Integer.toString(var10), 625, 440, 16777215, 0);
                    statePc = 308;
                    continue stateLoop;
                }
                case 306: {
                    jd.field_c.b(ed.field_e, 530, 440, 16777215, 0);
                    jd.field_c.a(Integer.toString(var9), 625, 440, 16777215, 0);
                    statePc = 308;
                    continue stateLoop;
                }
                case 307: {
                    jd.field_c.b(wg.field_n, 530, 420, 16777215, 0);
                    jd.field_c.b(ed.field_d, 530, 440, 16777215, 0);
                    statePc = 308;
                    continue stateLoop;
                }
                case 308: {
                    if (var6 <= jk.field_j[var5]) {
                        statePc = 310;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 310: {
                    var14_int = 16777215;
                    if ((wf.field_c.field_e[0].b(true) ^ -1) <= (ui.field_a[var5][var6] ^ -1)) {
                        statePc = 312;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    var14_int = 16711680;
                    statePc = 312;
                    continue stateLoop;
                }
                case 312: {
                    jd.field_c.a(Integer.toString(ui.field_a[var5][var6]), 625, 460, var14_int, 0);
                    jd.field_c.b(rh.field_a, 530, 460, var14_int, 0);
                    statePc = 313;
                    continue stateLoop;
                }
                case 313: {
                    if ((var6 ^ -1) <= -6) {
                        statePc = 314;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 314: {
                    if (-1 <= (wf.field_c.field_x ^ -1)) {
                        statePc = 365;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 315: {
                    var14_int = -1;
                    if (1 > wf.field_c.field_x) {
                        statePc = 319;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 316: {
                    if (wf.field_c.field_x < 100) {
                        statePc = 318;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 318: {
                    var14_int = jc.field_f[this.field_b][wf.field_c.field_x + -1];
                    statePc = 319;
                    continue stateLoop;
                }
                case 319: {
                    ul.e(8, 363, 172, 473);
                    if (0 > this.field_a) {
                        statePc = 323;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 320: {
                    if (-12 <= (this.field_a ^ -1)) {
                        statePc = 322;
                    } else {
                        statePc = 323;
                    }
                    continue stateLoop;
                }
                case 322: {
                    var15 = mg.a(this.field_a, (byte) -114);
                    ab.field_g[var15 * 12 + da.field_b / 10 % wh.field_a[var15]].c(hi.field_m + 43, 363);
                    statePc = 323;
                    continue stateLoop;
                }
                case 323: {
                    var15_ref = null;
                    if (var3 > 0) {
                        statePc = 333;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 324: {
                    var15_ref_String = nl.field_c;
                    if (-1 != (hi.field_m ^ -1)) {
                        statePc = 326;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    gk.a(mh.field_a[47], (byte) -11);
                    statePc = 326;
                    continue stateLoop;
                }
                case 326: {
                    if (hi.field_m < 0) {
                        statePc = 328;
                    } else {
                        statePc = 327;
                    }
                    continue stateLoop;
                }
                case 327: {
                    hi.field_m = hi.field_m + 10;
                    statePc = 328;
                    continue stateLoop;
                }
                case 328: {
                    if (hi.field_m >= 0) {
                        statePc = 331;
                    } else {
                        statePc = 329;
                    }
                    continue stateLoop;
                }
                case 329: {
                    if (149 <= (hi.field_m ^ -1)) {
                        statePc = 331;
                    } else {
                        statePc = 330;
                    }
                    continue stateLoop;
                }
                case 330: {
                    hi.field_m = hi.field_m - 10;
                    statePc = 331;
                    continue stateLoop;
                }
                case 331: {
                    if (hi.field_m <= 150) {
                        statePc = 352;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 332: {
                    hi.field_m = -150;
                    statePc = 352;
                    continue stateLoop;
                }
                case 333: {
                    var15_ref_String = t.a(param0 + -415993729, new String[]{Integer.toString(var3)}, d.field_h);
                    if (this.field_a == var14_int) {
                        statePc = 347;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 334: {
                    if (-1 != (hi.field_m ^ -1)) {
                        statePc = 336;
                    } else {
                        statePc = 335;
                    }
                    continue stateLoop;
                }
                case 335: {
                    gk.a(mh.field_a[47], (byte) -11);
                    statePc = 336;
                    continue stateLoop;
                }
                case 336: {
                    if (hi.field_m >= 0) {
                        statePc = 338;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 338: {
                    hi.field_m = hi.field_m + 10;
                    statePc = 339;
                    continue stateLoop;
                }
                case 339: {
                    if ((hi.field_m ^ -1) <= -1) {
                        statePc = 342;
                    } else {
                        statePc = 340;
                    }
                    continue stateLoop;
                }
                case 340: {
                    if ((hi.field_m ^ -1) >= 149) {
                        statePc = 342;
                    } else {
                        statePc = 341;
                    }
                    continue stateLoop;
                }
                case 341: {
                    hi.field_m = hi.field_m - 10;
                    statePc = 342;
                    continue stateLoop;
                }
                case 342: {
                    if (-151 > (hi.field_m ^ -1)) {
                        statePc = 344;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 344: {
                    hi.field_m = -150;
                    statePc = 345;
                    continue stateLoop;
                }
                case 345: {
                    if ((hi.field_m ^ -1) < 149) {
                        statePc = 352;
                    } else {
                        statePc = 346;
                    }
                    continue stateLoop;
                }
                case 346: {
                    gk.a(mh.field_a[46], (byte) -11);
                    this.field_a = var14_int;
                    statePc = 352;
                    continue stateLoop;
                }
                case 347: {
                    if ((hi.field_m ^ -1) <= -1) {
                        statePc = 349;
                    } else {
                        statePc = 348;
                    }
                    continue stateLoop;
                }
                case 348: {
                    hi.field_m = hi.field_m + 10;
                    statePc = 349;
                    continue stateLoop;
                }
                case 349: {
                    if (0 < hi.field_m) {
                        statePc = 351;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 351: {
                    hi.field_m = hi.field_m - 10;
                    statePc = 352;
                    continue stateLoop;
                }
                case 352: {
                    ob.field_I.a(var15_ref_String, 14, 362, 158, 105, 0, 0, 1, 2, 18);
                    ob.field_I.a(var15_ref_String, 13, 363, 158, 105, 0, 0, 1, 2, 18);
                    ob.field_I.a(var15_ref_String, 14, 363, 158, 105, 16777215, -1, 1, 2, 18);
                    var16 = (wf.field_c.field_g - wf.field_c.field_i) / 50;
                    if (-1 >= (var16 ^ -1)) {
                        statePc = 354;
                    } else {
                        statePc = 353;
                    }
                    continue stateLoop;
                }
                case 353: {
                    var16 = 0;
                    statePc = 354;
                    continue stateLoop;
                }
                case 354: {
                    var15_ref_String = t.a(param0 ^ -415993725, new String[]{Integer.toString(var16)}, nb.field_p);
                    if ((hi.field_m ^ -1) == 149) {
                        statePc = 356;
                    } else {
                        statePc = 364;
                    }
                    continue stateLoop;
                }
                case 356: {
                    if (-1 == (wf.field_c.field_x % 11 ^ -1)) {
                        statePc = 359;
                    } else {
                        statePc = 357;
                    }
                    continue stateLoop;
                }
                case 357: {
                    if (0 < wf.field_c.field_x) {
                        statePc = 363;
                    } else {
                        statePc = 359;
                    }
                    continue stateLoop;
                }
                case 359: {
                    if (-1 == (wf.field_c.field_x ^ -1)) {
                        statePc = 363;
                    } else {
                        statePc = 360;
                    }
                    continue stateLoop;
                }
                case 360: {
                    if (!wf.field_c.field_r.c(param0 ^ -3086)) {
                        statePc = 364;
                    } else {
                        statePc = 361;
                    }
                    continue stateLoop;
                }
                case 361: {
                    if (wf.field_c.field_e[0].field_f > 0) {
                        statePc = 363;
                    } else {
                        statePc = 364;
                    }
                    continue stateLoop;
                }
                case 363: {
                    var15_ref_String = p.field_b;
                    var14 = var15_ref_String;
                    ob.field_I.a(var15_ref_String, 14, Math.abs(hi.field_m) / 4 + 327, 158, 105, 0, 0, 1, 0, 16);
                    ob.field_I.a(var15_ref_String, 13, 328 + Math.abs(hi.field_m) / 4, 158, 105, 0, 0, 1, 0, 16);
                    ob.field_I.a(var15_ref_String, 14, Math.abs(hi.field_m) / 4 + 328, 158, 105, 16777215, -1, 1, 0, 16);
                    statePc = 364;
                    continue stateLoop;
                }
                case 364: {
                    ul.c();
                    statePc = 369;
                    continue stateLoop;
                }
                case 365: {
                    var33 = jm.field_c;
                    var14 = var33;
                    var14 = var33;
                    ob.field_I.a(var33, 14, 332, 158, 105, 0, 0, 1, 2, 18);
                    ob.field_I.a(var33, 13, 333, 158, 105, 0, 0, 1, 2, 18);
                    ob.field_I.a(var33, 14, 333, 158, 105, 16777215, -1, 1, 2, 18);
                    var15 = (wf.field_c.field_g + -wf.field_c.field_i) / 50;
                    if (0 > var15) {
                        statePc = 367;
                    } else {
                        statePc = 368;
                    }
                    continue stateLoop;
                }
                case 367: {
                    var15 = 0;
                    statePc = 368;
                    continue stateLoop;
                }
                case 368: {
                    var14 = t.a(param0 + -415993729, new String[]{Integer.toString(var15)}, nb.field_p);
                    statePc = 369;
                    continue stateLoop;
                }
                case 369: {
                    var38 = (oj) ((Object) wf.field_c.field_b.b((byte) 126));
                    statePc = 370;
                    continue stateLoop;
                }
                case 370: {
                    if (var38 == null) {
                        statePc = 372;
                    } else {
                        statePc = 371;
                    }
                    continue stateLoop;
                }
                case 371: {
                    var38.a((byte) 54, this.field_t, this.field_h);
                    var38 = (oj) ((Object) wf.field_c.field_b.d(param0 ^ 855));
                    statePc = 370;
                    continue stateLoop;
                }
                case 372: {
                    var14 = "";
                    if (wf.field_c.field_e[0].b(true) >= 1000) {
                        statePc = 374;
                    } else {
                        statePc = 373;
                    }
                    continue stateLoop;
                }
                case 373: {
                    var14 = Integer.toString(wf.field_c.field_e[0].b(true));
                    statePc = 377;
                    continue stateLoop;
                }
                case 374: {
                    if (-10000 < (wf.field_c.field_e[0].b(true) ^ -1)) {
                        statePc = 376;
                    } else {
                        statePc = 375;
                    }
                    continue stateLoop;
                }
                case 375: {
                    var14 = ci.field_m;
                    statePc = 377;
                    continue stateLoop;
                }
                case 376: {
                    var14 = t.a(-415993727, new String[]{Integer.toString(wf.field_c.field_e[0].b(true) / 1000), Integer.toString(wf.field_c.field_e[0].b(true) / 100 % 10)}, rf.field_H);
                    statePc = 377;
                    continue stateLoop;
                }
                case 377: {
                    ob.field_I.c(var14, 362, 30, 0, 0);
                    ob.field_I.c(var14, 363, 29, 0, 0);
                    ob.field_I.c(var14, 363, 30, 16777215, -1);
                    if (0 == this.field_b) {
                        statePc = 380;
                    } else {
                        statePc = 378;
                    }
                    continue stateLoop;
                }
                case 378: {
                    if (-4 > (this.field_b ^ -1)) {
                        statePc = 380;
                    } else {
                        statePc = 388;
                    }
                    continue stateLoop;
                }
                case 380: {
                    al.field_d.a(598, 10);
                    if (df.field_f) {
                        statePc = 382;
                    } else {
                        statePc = 381;
                    }
                    continue stateLoop;
                }
                case 381: {
                    ul.i(614, 26, 16, 0, 128);
                    statePc = 382;
                    continue stateLoop;
                }
                case 382: {
                    if (ua.field_a < 598) {
                        statePc = 388;
                    } else {
                        statePc = 383;
                    }
                    continue stateLoop;
                }
                case 383: {
                    if (-11 < (vl.field_d ^ -1)) {
                        statePc = 388;
                    } else {
                        statePc = 384;
                    }
                    continue stateLoop;
                }
                case 384: {
                    if (ua.field_a > 630) {
                        statePc = 388;
                    } else {
                        statePc = 385;
                    }
                    continue stateLoop;
                }
                case 385: {
                    if ((vl.field_d ^ -1) >= -43) {
                        statePc = 387;
                    } else {
                        statePc = 388;
                    }
                    continue stateLoop;
                }
                case 387: {
                    ob.field_I.a(jg.field_n[25], 635, 49, 0, 0);
                    ob.field_I.a(jg.field_n[25], 634, 50, 0, 0);
                    ob.field_I.a(jg.field_n[25], 635, 50, 16777215, -1);
                    statePc = 388;
                    continue stateLoop;
                }
                case 388: {
                    if (1 == of.field_G) {
                        statePc = 390;
                    } else {
                        statePc = 389;
                    }
                    continue stateLoop;
                }
                case 389: {
                    this.field_j = false;
                    statePc = 390;
                    continue stateLoop;
                }
                case 390: {
                    if ((this.field_m ^ -1) == 0) {
                        statePc = 402;
                    } else {
                        statePc = 391;
                    }
                    continue stateLoop;
                }
                case 391: {
                    if (!df.field_f) {
                        statePc = 401;
                    } else {
                        statePc = 392;
                    }
                    continue stateLoop;
                }
                case 392: {
                    if ((this.field_b ^ -1) == -1) {
                        statePc = 395;
                    } else {
                        statePc = 393;
                    }
                    continue stateLoop;
                }
                case 393: {
                    if ((this.field_m ^ -1) > -17) {
                        statePc = 401;
                    } else {
                        statePc = 395;
                    }
                    continue stateLoop;
                }
                case 395: {
                    var15 = 300;
                    var16 = jd.field_c.a(sa.field_d[this.field_m], var15, 16);
                    var17 = -var15 + 640;
                    var18 = -var16 + 480 - 120;
                    var19 = 8;
                    ug.a(101, -(2 * var19) + var18, -(2 * var19) + var17, var16 - -(2 * var19), var15 - -(var19 * 2));
                    jd.field_c.a(sa.field_d[this.field_m], var17 - var19, -var19 + var18, var15, var16, 16777215, 0, 0, 1, 16);
                    if (ua.field_a < var17 - 2 * var19) {
                        statePc = 402;
                    } else {
                        statePc = 396;
                    }
                    continue stateLoop;
                }
                case 396: {
                    if ((vl.field_d ^ -1) > (-(var19 * 2) + var18 ^ -1)) {
                        statePc = 402;
                    } else {
                        statePc = 397;
                    }
                    continue stateLoop;
                }
                case 397: {
                    if ((ua.field_a ^ -1) <= (var15 + var17 ^ -1)) {
                        statePc = 402;
                    } else {
                        statePc = 398;
                    }
                    continue stateLoop;
                }
                case 398: {
                    if (var16 + var18 <= vl.field_d) {
                        statePc = 402;
                    } else {
                        statePc = 399;
                    }
                    continue stateLoop;
                }
                case 399: {
                    this.field_j = true;
                    statePc = 402;
                    continue stateLoop;
                }
                case 401: {
                    ob.field_I.c(pa.field_a[this.field_m], 320, 339, 0, 0);
                    ob.field_I.c(pa.field_a[this.field_m], 319, 340, 0, 0);
                    ob.field_I.c(pa.field_a[this.field_m], 320, 340, 16777215, -1);
                    statePc = 402;
                    continue stateLoop;
                }
                case 402: {
                    if (-1 <= (this.field_o ^ -1)) {
                        statePc = 440;
                    } else {
                        statePc = 403;
                    }
                    continue stateLoop;
                }
                case 403: {
                    if (wf.field_c.field_f.field_k <= 0) {
                        statePc = 428;
                    } else {
                        statePc = 404;
                    }
                    continue stateLoop;
                }
                case 404: {
                    if (wf.field_c.field_x < 90) {
                        statePc = 414;
                    } else {
                        statePc = 405;
                    }
                    continue stateLoop;
                }
                case 405: {
                    if (-51 >= (this.field_o ^ -1)) {
                        statePc = 407;
                    } else {
                        statePc = 406;
                    }
                    continue stateLoop;
                }
                case 406: {
                    stackIn_408_0 = 5 * this.field_o;
                    statePc = 408;
                    continue stateLoop;
                }
                case 407: {
                    stackIn_408_0 = 255;
                    statePc = 408;
                    continue stateLoop;
                }
                case 408: {
                    var15 = stackIn_408_0;
                    if (-101 < (this.field_o ^ -1)) {
                        statePc = 410;
                    } else {
                        statePc = 409;
                    }
                    continue stateLoop;
                }
                case 409: {
                    stackIn_411_0 = 255;
                    statePc = 411;
                    continue stateLoop;
                }
                case 410: {
                    stackIn_411_0 = 5 * this.field_o + -250;
                    statePc = 411;
                    continue stateLoop;
                }
                case 411: {
                    var16 = stackIn_411_0;
                    if (-1 >= (var16 ^ -1)) {
                        statePc = 413;
                    } else {
                        statePc = 412;
                    }
                    continue stateLoop;
                }
                case 412: {
                    var16 = 0;
                    statePc = 413;
                    continue stateLoop;
                }
                case 413: {
                    pj.field_u[0].c(0, 0, var15, var16);
                    statePc = 437;
                    continue stateLoop;
                }
                case 414: {
                    if (50 > this.field_o) {
                        statePc = 416;
                    } else {
                        statePc = 415;
                    }
                    continue stateLoop;
                }
                case 415: {
                    stackIn_417_0 = 255;
                    statePc = 417;
                    continue stateLoop;
                }
                case 416: {
                    stackIn_417_0 = 5 * this.field_o;
                    statePc = 417;
                    continue stateLoop;
                }
                case 417: {
                    var15 = stackIn_417_0;
                    if (-101 < (this.field_o ^ -1)) {
                        statePc = 419;
                    } else {
                        statePc = 418;
                    }
                    continue stateLoop;
                }
                case 418: {
                    stackIn_420_0 = 255;
                    statePc = 420;
                    continue stateLoop;
                }
                case 419: {
                    stackIn_420_0 = -250 + this.field_o * 5;
                    statePc = 420;
                    continue stateLoop;
                }
                case 420: {
                    var16 = stackIn_420_0;
                    if (0 > var16) {
                        statePc = 422;
                    } else {
                        statePc = 423;
                    }
                    continue stateLoop;
                }
                case 422: {
                    var16 = 0;
                    statePc = 423;
                    continue stateLoop;
                }
                case 423: {
                    pj.field_u[2].c(0, 0, var15, var16);
                    if (-301 > (this.field_o ^ -1)) {
                        statePc = 425;
                    } else {
                        statePc = 424;
                    }
                    continue stateLoop;
                }
                case 424: {
                    ob.field_I.a(sl.field_Z, 149, -this.field_o + 500, 340, 200, 0, 0, 1, 1, 14);
                    ob.field_I.a(sl.field_Z, 150, -this.field_o + 499, 340, 200, 0, 0, 1, 1, 14);
                    ob.field_I.a(sl.field_Z, 150, -this.field_o + 500, 340, 200, 16777215, -1, 1, 1, 14);
                    statePc = 425;
                    continue stateLoop;
                }
                case 425: {
                    if (-301 > (this.field_o ^ -1)) {
                        statePc = 427;
                    } else {
                        statePc = 437;
                    }
                    continue stateLoop;
                }
                case 427: {
                    ob.field_I.a(sl.field_Z, 149, 200, 340, 200, 0, 0, 1, 1, 14);
                    ob.field_I.a(sl.field_Z, 150, 199, 340, 200, 0, 0, 1, 1, 14);
                    ob.field_I.a(sl.field_Z, 150, 200, 340, 200, 16777215, -1, 1, 1, 14);
                    ob.field_I.c(oh.field_d, 319, 450, 0, 0);
                    ob.field_I.c(oh.field_d, 320, 449, 0, 0);
                    ob.field_I.c(oh.field_d, 320, 450, 16777215, -1);
                    statePc = 437;
                    continue stateLoop;
                }
                case 428: {
                    if ((this.field_o ^ -1) <= -51) {
                        statePc = 430;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 429: {
                    stackIn_431_0 = this.field_o * 5;
                    statePc = 431;
                    continue stateLoop;
                }
                case 430: {
                    stackIn_431_0 = 255;
                    statePc = 431;
                    continue stateLoop;
                }
                case 431: {
                    var15 = stackIn_431_0;
                    if (-101 >= (this.field_o ^ -1)) {
                        statePc = 433;
                    } else {
                        statePc = 432;
                    }
                    continue stateLoop;
                }
                case 432: {
                    stackIn_434_0 = 5 * this.field_o + -250;
                    statePc = 434;
                    continue stateLoop;
                }
                case 433: {
                    stackIn_434_0 = 255;
                    statePc = 434;
                    continue stateLoop;
                }
                case 434: {
                    var16 = stackIn_434_0;
                    if (var16 >= 0) {
                        statePc = 436;
                    } else {
                        statePc = 435;
                    }
                    continue stateLoop;
                }
                case 435: {
                    var16 = 0;
                    statePc = 436;
                    continue stateLoop;
                }
                case 436: {
                    pj.field_u[1].c(0, 0, var15, var16);
                    statePc = 437;
                    continue stateLoop;
                }
                case 437: {
                    if (400 < this.field_o) {
                        statePc = 439;
                    } else {
                        statePc = 440;
                    }
                    continue stateLoop;
                }
                case 439: {
                    ul.d(0, 0, 640, 480, 0, (this.field_o * 250 + -100000) / 100);
                    statePc = 440;
                    continue stateLoop;
                }
                case 440: {
                    return;
                }
                case 441: {
                    var5 = ol.field_e / 2 + -this.field_t + var3_ref_kb.field_g * ol.field_e + 320;
                    var6 = -24 + ol.field_e * var3_ref_kb.field_h + (-this.field_h + 240);
                    ob.field_I.c(Integer.toString(var4), var5, var6, 16777215, 0);
                    var3_ref_kb.a(this.field_t, (byte) -108, this.field_h);
                    statePc = 444;
                    continue stateLoop;
                }
                case 442: {
                    var4 = var3_ref_kb.f(100);
                    if ((var4 ^ -1) >= -1) {
                        statePc = 444;
                    } else {
                        statePc = 441;
                    }
                    continue stateLoop;
                }
                case 444: {
                    var3_ref_kb = (kb) ((Object) wf.field_c.field_o.d(853));
                    statePc = 448;
                    continue stateLoop;
                }
                case 445: {
                    if (stackIn_445_0 != stackIn_445_1) {
                        statePc = 444;
                    } else {
                        statePc = 442;
                    }
                    continue stateLoop;
                }
                case 447: {
                    stackIn_445_0 = var3_ref_kb.field_C ^ -1;
                    stackIn_445_1 = -6;
                    statePc = 445;
                    continue stateLoop;
                }
                case 448: {
                    if (var3_ref_kb == null) {
                        statePc = 97;
                    } else {
                        statePc = 447;
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
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
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
                        statePc = 15;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var6 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if ((param0 ^ -1) >= (var6 ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var4 = wf.field_c.field_f.field_c * var6 + var5 + param2;
                    stackIn_2_0 = -1;
                    stackIn_6_0 = stackIn_2_0;
                    stackIn_2_1 = var4 ^ -1;
                    stackIn_6_1 = stackIn_2_1;
                    if (false) {
                        statePc = 2;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (stackIn_6_0 < stackIn_6_1) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if ((var4 ^ -1) <= (wf.field_c.field_f.field_i ^ -1)) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return false;
                }
                case 10: {
                    if (-2 == (wf.field_c.field_f.field_o[var4] ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if ((wf.field_c.field_f.field_o[var4] ^ -1) == -10) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return false;
                }
                case 13: {
                    var6++;
                    statePc = 4;
                    continue stateLoop;
                }
                case 14: {
                    var5++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 15: {
                    var5 = -1;
                    if (param1 == 22727) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.field_t = 89;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = 1 + param0 ^ -1;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (stackIn_18_0 >= (var5 ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var6 = -1;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if ((1 + param0 ^ -1) >= (var6 ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var4 = wf.field_c.field_f.field_c * var6 + param2 - -var5;
                    stackIn_18_0 = var4;
                    stackIn_22_0 = stackIn_18_0;
                    if (false) {
                        statePc = 18;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (stackIn_22_0 < 0) {
                        statePc = 25;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (wf.field_c.field_f.field_i > var4) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    return false;
                }
                case 25: {
                    return false;
                }
                case 26: {
                    if ((wf.field_c.field_f.field_o[var4] ^ -1) != -8) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    return false;
                }
                case 28: {
                    var6++;
                    statePc = 20;
                    continue stateLoop;
                }
                case 29: {
                    var5++;
                    statePc = 17;
                    continue stateLoop;
                }
                case 30: {
                    return true;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(int param0, int param1, byte param2) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        int stackIn_123_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_137_0 = 0;
        int stackIn_137_1 = 0;
        int stackIn_141_0 = 0;
        int stackIn_141_1 = 0;
        int stackIn_169_0 = 0;
        int stackIn_169_1 = 0;
        int stackIn_173_0 = 0;
        int stackIn_173_1 = 0;
        int stackIn_184_0 = 0;
        int stackIn_188_0 = 0;
        int stackIn_217_0 = 0;
        int stackIn_220_0 = 0;
        int stackIn_241_0 = 0;
        int stackIn_241_1 = 0;
        int stackIn_244_0 = 0;
        int stackIn_244_1 = 0;
        int stackIn_250_0 = 0;
        int stackIn_250_1 = 0;
        int stackIn_254_0 = 0;
        int stackIn_265_0 = 0;
        int stackIn_268_0 = 0;
        int stackIn_289_0 = 0;
        int stackIn_289_1 = 0;
        int stackIn_292_0 = 0;
        int stackIn_292_1 = 0;
        int stackIn_298_0 = 0;
        int stackIn_298_1 = 0;
        int stackIn_302_0 = 0;
        int stackIn_313_0 = 0;
        int stackIn_316_0 = 0;
        int stackIn_337_0 = 0;
        int stackIn_337_1 = 0;
        int stackIn_340_0 = 0;
        int stackIn_340_1 = 0;
        int stackIn_346_0 = 0;
        int stackIn_346_1 = 0;
        int stackIn_350_0 = 0;
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
                    if ((var11 ^ -1) >= (var12 ^ -1)) {
                        statePc = 44;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackIn_45_0 = -1;
                    stackIn_3_0 = stackIn_45_0;
                    stackIn_45_1 = var12 % wf.field_c.field_f.field_c ^ -1;
                    stackIn_3_1 = stackIn_45_1;
                    if (false) {
                        statePc = 45;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0 == stackIn_3_1) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var5 = 0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 6: {
                    var14 = -1;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    stackIn_8_0 = var14;
                    stackIn_8_1 = 1 + param1;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (stackIn_8_0 >= stackIn_8_1) {
                        statePc = 20;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var15 = -1;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (1 + param1 <= var15) {
                        statePc = 19;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var13 = var14 + (var12 - -(wf.field_c.field_f.field_c * var15));
                    stackIn_8_0 = 0;
                    stackIn_12_0 = stackIn_8_0;
                    stackIn_8_1 = var13;
                    stackIn_12_1 = stackIn_8_1;
                    if (false) {
                        statePc = 8;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (stackIn_12_0 > stackIn_12_1) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var13 < wf.field_c.field_f.field_i) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var5 = 0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 16: {
                    if (wf.field_c.field_f.field_o[var13] != 7) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var5 = 0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 18: {
                    var15++;
                    statePc = 10;
                    continue stateLoop;
                }
                case 19: {
                    var14++;
                    statePc = 7;
                    continue stateLoop;
                }
                case 20: {
                    var14 = 0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = param1;
                    stackIn_22_1 = var14;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (stackIn_22_0 <= stackIn_22_1) {
                        statePc = 43;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var15 = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if ((var15 ^ -1) <= (param1 ^ -1)) {
                        statePc = 42;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var13 = var14 + var12 - -(wf.field_c.field_f.field_c * var15);
                    stackIn_22_0 = 0;
                    stackIn_26_0 = stackIn_22_0;
                    stackIn_22_1 = var13;
                    stackIn_26_1 = stackIn_22_1;
                    if (false) {
                        statePc = 22;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (stackIn_26_0 > stackIn_26_1) {
                        statePc = 29;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if ((wf.field_c.field_f.field_i ^ -1) < (var13 ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var5 = 0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 30: {
                    if (-1 == (wf.field_c.field_f.field_o[var13] ^ -1)) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var10 = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 32: {
                    if (var9 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (var10 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var9 = 1;
                    var10 = 1;
                    if (-2 == (wf.field_c.field_f.field_o[var13] ^ -1)) {
                        statePc = 87;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (wf.field_c.field_f.field_o[var13] == 9) {
                        statePc = 87;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var15++;
                    statePc = 24;
                    continue stateLoop;
                }
                case 37: {
                    var5 = 0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 38: {
                    var9 = 1;
                    var10 = 1;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (-2 == (wf.field_c.field_f.field_o[var13] ^ -1)) {
                        statePc = 44;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (wf.field_c.field_f.field_o[var13] == 9) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var15++;
                    statePc = 24;
                    continue stateLoop;
                }
                case 42: {
                    var14++;
                    statePc = 21;
                    continue stateLoop;
                }
                case 43: {
                    var5++;
                    var12++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 44: {
                    stackIn_45_0 = var5 ^ -1;
                    stackIn_45_1 = -1;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (stackIn_45_0 >= stackIn_45_1) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var5++;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (16 == var5) {
                        statePc = 50;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (var9 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var5 = 0;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    var10 = 0;
                    var9 = 0;
                    var12 = -1 + param0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (var12 <= -16 + param0) {
                        statePc = 110;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    stackIn_111_0 = -1;
                    stackIn_54_0 = stackIn_111_0;
                    stackIn_111_1 = var12 % wf.field_c.field_f.field_c ^ -1;
                    stackIn_54_1 = stackIn_111_1;
                    if (false) {
                        statePc = 111;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (stackIn_54_0 != stackIn_54_1) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var6 = 0;
                    statePc = 110;
                    continue stateLoop;
                }
                case 56: {
                    var14 = -1;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    stackIn_58_0 = var14;
                    stackIn_58_1 = 1 + param1;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    if (stackIn_58_0 >= stackIn_58_1) {
                        statePc = 70;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var15 = -1;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if ((1 + param1 ^ -1) >= (var15 ^ -1)) {
                        statePc = 69;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var13 = var12 + var14 - -(var15 * wf.field_c.field_f.field_c);
                    stackIn_58_0 = -1;
                    stackIn_62_0 = stackIn_58_0;
                    stackIn_58_1 = var13 ^ -1;
                    stackIn_62_1 = stackIn_58_1;
                    if (false) {
                        statePc = 58;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (stackIn_62_0 < stackIn_62_1) {
                        statePc = 65;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (var13 < wf.field_c.field_f.field_i) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var6 = 0;
                    statePc = 110;
                    continue stateLoop;
                }
                case 66: {
                    if (-8 != (wf.field_c.field_f.field_o[var13] ^ -1)) {
                        statePc = 68;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var6 = 0;
                    statePc = 110;
                    continue stateLoop;
                }
                case 68: {
                    var15++;
                    statePc = 60;
                    continue stateLoop;
                }
                case 69: {
                    var14++;
                    statePc = 57;
                    continue stateLoop;
                }
                case 70: {
                    var14 = 0;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    stackIn_72_0 = param1 ^ -1;
                    stackIn_72_1 = var14 ^ -1;
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    if (stackIn_72_0 >= stackIn_72_1) {
                        statePc = 109;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var15 = 0;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if ((var15 ^ -1) <= (param1 ^ -1)) {
                        statePc = 108;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var13 = wf.field_c.field_f.field_c * var15 + (var14 + var12);
                    stackIn_72_0 = var13 ^ -1;
                    stackIn_76_0 = stackIn_72_0;
                    stackIn_72_1 = -1;
                    stackIn_76_1 = stackIn_72_1;
                    if (false) {
                        statePc = 72;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (stackIn_76_0 > stackIn_76_1) {
                        statePc = 79;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if ((var13 ^ -1) > (wf.field_c.field_f.field_i ^ -1)) {
                        statePc = 80;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var6 = 0;
                    statePc = 110;
                    continue stateLoop;
                }
                case 80: {
                    if (wf.field_c.field_f.field_o[var13] == 0) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var10 = 0;
                    statePc = 105;
                    continue stateLoop;
                }
                case 82: {
                    if (var9 == 0) {
                        statePc = 104;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (var10 == 0) {
                        statePc = 103;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var10 = 1;
                    var9 = 1;
                    if (wf.field_c.field_f.field_o[var13] == 1) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if ((wf.field_c.field_f.field_o[var13] ^ -1) == -10) {
                        statePc = 87;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var15++;
                    statePc = 74;
                    continue stateLoop;
                }
                case 87: {
                    if (0 >= var6) {
                        statePc = 89;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var6++;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if ((var6 ^ -1) == -17) {
                        statePc = 92;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (var9 == 0) {
                        statePc = 92;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var6 = 0;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    var9 = 0;
                    var10 = 0;
                    if (param2 < -13) {
                        statePc = 95;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    this.field_l = -57;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    var12 = param0 + wf.field_c.field_f.field_c;
                    if ((var12 ^ -1) <= (param0 + 16 * wf.field_c.field_f.field_c ^ -1)) {
                        statePc = 158;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    var14 = -1;
                    stackIn_97_0 = var14;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    if (stackIn_97_0 >= param1 + 1) {
                        statePc = 349;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var15 = -1;
                    if (var15 >= 1 + param1) {
                        statePc = 269;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var13 = wf.field_c.field_f.field_c * var15 + (var14 + var12);
                    stackIn_97_0 = var13;
                    stackIn_100_0 = stackIn_97_0;
                    if (false) {
                        statePc = 97;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if (stackIn_100_0 < 0) {
                        statePc = 130;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if ((var13 ^ -1) > (wf.field_c.field_f.field_i ^ -1)) {
                        statePc = 213;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 103: {
                    var6 = 0;
                    statePc = 110;
                    continue stateLoop;
                }
                case 104: {
                    var10 = 1;
                    var9 = 1;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if (wf.field_c.field_f.field_o[var13] == 1) {
                        statePc = 110;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    if ((wf.field_c.field_f.field_o[var13] ^ -1) == -10) {
                        statePc = 110;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    var15++;
                    statePc = 74;
                    continue stateLoop;
                }
                case 108: {
                    var14++;
                    statePc = 71;
                    continue stateLoop;
                }
                case 109: {
                    var6++;
                    var12--;
                    statePc = 52;
                    continue stateLoop;
                }
                case 110: {
                    stackIn_111_0 = 0;
                    stackIn_111_1 = var6;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    if (stackIn_111_0 >= stackIn_111_1) {
                        statePc = 113;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var6++;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    if ((var6 ^ -1) == -17) {
                        statePc = 116;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (var9 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 116: {
                    var6 = 0;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    var9 = 0;
                    var10 = 0;
                    if (param2 < -13) {
                        statePc = 119;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    this.field_l = -57;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    var12 = param0 + wf.field_c.field_f.field_c;
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    if ((var12 ^ -1) <= (param0 + 16 * wf.field_c.field_f.field_c ^ -1)) {
                        statePc = 158;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    var14 = -1;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    stackIn_123_0 = var14;
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    if (stackIn_123_0 >= param1 + 1) {
                        statePc = 135;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    var15 = -1;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    if (var15 >= 1 + param1) {
                        statePc = 134;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    var13 = wf.field_c.field_f.field_c * var15 + (var14 + var12);
                    stackIn_123_0 = var13;
                    stackIn_127_0 = stackIn_123_0;
                    if (false) {
                        statePc = 123;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    if (stackIn_127_0 < 0) {
                        statePc = 130;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if ((var13 ^ -1) > (wf.field_c.field_f.field_i ^ -1)) {
                        statePc = 131;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    var7 = 0;
                    statePc = 158;
                    continue stateLoop;
                }
                case 131: {
                    if (7 != wf.field_c.field_f.field_o[var13]) {
                        statePc = 133;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    var7 = 0;
                    statePc = 158;
                    continue stateLoop;
                }
                case 133: {
                    var15++;
                    statePc = 125;
                    continue stateLoop;
                }
                case 134: {
                    var14++;
                    statePc = 122;
                    continue stateLoop;
                }
                case 135: {
                    var14 = 0;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    stackIn_137_0 = var14 ^ -1;
                    stackIn_137_1 = param1 ^ -1;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    if (stackIn_137_0 <= stackIn_137_1) {
                        statePc = 157;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var15 = 0;
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    if (var15 >= param1) {
                        statePc = 156;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var13 = wf.field_c.field_f.field_c * var15 + var12 + var14;
                    stackIn_137_0 = var13 ^ -1;
                    stackIn_141_0 = stackIn_137_0;
                    stackIn_137_1 = -1;
                    stackIn_141_1 = stackIn_137_1;
                    if (false) {
                        statePc = 137;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    if (stackIn_141_0 > stackIn_141_1) {
                        statePc = 144;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if ((var13 ^ -1) > (wf.field_c.field_f.field_i ^ -1)) {
                        statePc = 145;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var7 = 0;
                    statePc = 158;
                    continue stateLoop;
                }
                case 145: {
                    if (wf.field_c.field_f.field_o[var13] != 0) {
                        statePc = 151;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    if (var9 == 0) {
                        statePc = 150;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if (var10 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 149: {
                    var7 = 0;
                    statePc = 158;
                    continue stateLoop;
                }
                case 150: {
                    var10 = 1;
                    var9 = 1;
                    statePc = 152;
                    continue stateLoop;
                }
                case 151: {
                    var10 = 0;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    if (wf.field_c.field_f.field_o[var13] == 1) {
                        statePc = 158;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if (9 != wf.field_c.field_f.field_o[var13]) {
                        statePc = 155;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 155: {
                    var15++;
                    statePc = 139;
                    continue stateLoop;
                }
                case 156: {
                    var14++;
                    statePc = 136;
                    continue stateLoop;
                }
                case 157: {
                    var7++;
                    var12 = var12 + wf.field_c.field_f.field_c;
                    statePc = 120;
                    continue stateLoop;
                }
                case 158: {
                    if (0 < var7) {
                        statePc = 160;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 160: {
                    var7++;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    if (var7 == 16) {
                        statePc = 164;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    if (var9 == 0) {
                        statePc = 164;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 164: {
                    var7 = 0;
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    var9 = 0;
                    var10 = 0;
                    var12 = param0 + -wf.field_c.field_f.field_c;
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    if ((param0 - 16 * wf.field_c.field_f.field_c ^ -1) <= (var12 ^ -1)) {
                        statePc = 205;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    var14 = -1;
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    stackIn_169_0 = var14 ^ -1;
                    stackIn_169_1 = param1 - -1 ^ -1;
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    if (stackIn_169_0 <= stackIn_169_1) {
                        statePc = 182;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    var15 = -1;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    if ((var15 ^ -1) <= (1 + param1 ^ -1)) {
                        statePc = 181;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    var13 = var14 + (var12 - -(var15 * wf.field_c.field_f.field_c));
                    stackIn_169_0 = -1;
                    stackIn_173_0 = stackIn_169_0;
                    stackIn_169_1 = var13 ^ -1;
                    stackIn_173_1 = stackIn_169_1;
                    if (false) {
                        statePc = 169;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    if (stackIn_173_0 < stackIn_173_1) {
                        statePc = 176;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    if (var13 < wf.field_c.field_f.field_i) {
                        statePc = 177;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    var8 = 0;
                    statePc = 205;
                    continue stateLoop;
                }
                case 177: {
                    if (wf.field_c.field_f.field_o[var13] == 7) {
                        statePc = 179;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 179: {
                    var8 = 0;
                    statePc = 205;
                    continue stateLoop;
                }
                case 180: {
                    var15++;
                    statePc = 171;
                    continue stateLoop;
                }
                case 181: {
                    var14++;
                    statePc = 168;
                    continue stateLoop;
                }
                case 182: {
                    var14 = 0;
                    statePc = 183;
                    continue stateLoop;
                }
                case 183: {
                    stackIn_184_0 = param1;
                    statePc = 184;
                    continue stateLoop;
                }
                case 184: {
                    if (stackIn_184_0 <= var14) {
                        statePc = 204;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    var15 = 0;
                    statePc = 186;
                    continue stateLoop;
                }
                case 186: {
                    if ((var15 ^ -1) <= (param1 ^ -1)) {
                        statePc = 203;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    var13 = wf.field_c.field_f.field_c * var15 + (var12 + var14);
                    stackIn_184_0 = var13;
                    stackIn_188_0 = stackIn_184_0;
                    if (false) {
                        statePc = 184;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    if (stackIn_188_0 < 0) {
                        statePc = 191;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    if (wf.field_c.field_f.field_i > var13) {
                        statePc = 192;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    var8 = 0;
                    statePc = 205;
                    continue stateLoop;
                }
                case 192: {
                    if (0 == wf.field_c.field_f.field_o[var13]) {
                        statePc = 194;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    var10 = 0;
                    statePc = 199;
                    continue stateLoop;
                }
                case 194: {
                    if (var9 == 0) {
                        statePc = 198;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if (var10 == 0) {
                        statePc = 197;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 197: {
                    var8 = 0;
                    statePc = 205;
                    continue stateLoop;
                }
                case 198: {
                    var9 = 1;
                    var10 = 1;
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    if (1 == wf.field_c.field_f.field_o[var13]) {
                        statePc = 205;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if ((wf.field_c.field_f.field_o[var13] ^ -1) != -10) {
                        statePc = 202;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 202: {
                    var15++;
                    statePc = 186;
                    continue stateLoop;
                }
                case 203: {
                    var14++;
                    statePc = 183;
                    continue stateLoop;
                }
                case 204: {
                    var8++;
                    var12 = var12 - wf.field_c.field_f.field_c;
                    statePc = 166;
                    continue stateLoop;
                }
                case 205: {
                    if (0 >= var8) {
                        statePc = 207;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    var8++;
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    if (-17 == (var8 ^ -1)) {
                        statePc = 210;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    if (var9 == 0) {
                        statePc = 210;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 210: {
                    var8 = 0;
                    statePc = 211;
                    continue stateLoop;
                }
                case 211: {
                    var4 = var5 + ((var8 << -1698284744) + (var7 << -2037038320)) + (var6 << -2056082296);
                    return var4;
                }
                case 212: {
                    var15++;
                    statePc = 222;
                    continue stateLoop;
                }
                case 213: {
                    if (7 != wf.field_c.field_f.field_o[var13]) {
                        statePc = 212;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 215: {
                    if ((var13 ^ -1) > (wf.field_c.field_f.field_i ^ -1)) {
                        statePc = 213;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 217: {
                    if (stackIn_217_0 < 0) {
                        statePc = 130;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 219: {
                    var13 = wf.field_c.field_f.field_c * var15 + (var14 + var12);
                    stackIn_254_0 = var13;
                    stackIn_220_0 = stackIn_254_0;
                    if (false) {
                        statePc = 254;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    stackIn_217_0 = stackIn_220_0;
                    statePc = 217;
                    continue stateLoop;
                }
                case 221: {
                    var14++;
                    statePc = 256;
                    continue stateLoop;
                }
                case 222: {
                    if (var15 >= 1 + param1) {
                        statePc = 221;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 224: {
                    var15 = -1;
                    statePc = 222;
                    continue stateLoop;
                }
                case 226: {
                    if (var10 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    var10 = 1;
                    var9 = 1;
                    statePc = 234;
                    continue stateLoop;
                }
                case 229: {
                    if (var9 == 0) {
                        statePc = 228;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 231: {
                    var15++;
                    statePc = 246;
                    continue stateLoop;
                }
                case 232: {
                    if (9 != wf.field_c.field_f.field_o[var13]) {
                        statePc = 231;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (wf.field_c.field_f.field_o[var13] == 1) {
                        statePc = 158;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 236: {
                    var10 = 0;
                    statePc = 234;
                    continue stateLoop;
                }
                case 237: {
                    if (wf.field_c.field_f.field_o[var13] != 0) {
                        statePc = 236;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 239: {
                    if ((var13 ^ -1) > (wf.field_c.field_f.field_i ^ -1)) {
                        statePc = 237;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 241: {
                    if (stackIn_241_0 > stackIn_241_1) {
                        statePc = 144;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 243: {
                    var13 = wf.field_c.field_f.field_c * var15 + var12 + var14;
                    stackIn_250_0 = var13 ^ -1;
                    stackIn_244_0 = stackIn_250_0;
                    stackIn_250_1 = -1;
                    stackIn_244_1 = stackIn_250_1;
                    if (false) {
                        statePc = 250;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    stackIn_241_0 = stackIn_244_0;
                    stackIn_241_1 = stackIn_244_1;
                    statePc = 241;
                    continue stateLoop;
                }
                case 245: {
                    var14++;
                    statePc = 252;
                    continue stateLoop;
                }
                case 246: {
                    if (var15 >= param1) {
                        statePc = 245;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 248: {
                    var15 = 0;
                    statePc = 246;
                    continue stateLoop;
                }
                case 249: {
                    var7++;
                    var12 = var12 + wf.field_c.field_f.field_c;
                    statePc = 258;
                    continue stateLoop;
                }
                case 250: {
                    if (stackIn_250_0 <= stackIn_250_1) {
                        statePc = 249;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 252: {
                    stackIn_250_0 = var14 ^ -1;
                    stackIn_250_1 = param1 ^ -1;
                    statePc = 250;
                    continue stateLoop;
                }
                case 253: {
                    var14 = 0;
                    statePc = 252;
                    continue stateLoop;
                }
                case 254: {
                    if (stackIn_254_0 >= param1 + 1) {
                        statePc = 253;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 256: {
                    stackIn_254_0 = var14;
                    statePc = 254;
                    continue stateLoop;
                }
                case 257: {
                    var14 = -1;
                    statePc = 256;
                    continue stateLoop;
                }
                case 258: {
                    if ((var12 ^ -1) <= (param0 + 16 * wf.field_c.field_f.field_c ^ -1)) {
                        statePc = 158;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 260: {
                    var15++;
                    statePc = 270;
                    continue stateLoop;
                }
                case 261: {
                    if (7 != wf.field_c.field_f.field_o[var13]) {
                        statePc = 260;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 263: {
                    if ((var13 ^ -1) > (wf.field_c.field_f.field_i ^ -1)) {
                        statePc = 261;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 265: {
                    if (stackIn_265_0 < 0) {
                        statePc = 130;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 267: {
                    var13 = wf.field_c.field_f.field_c * var15 + (var14 + var12);
                    stackIn_302_0 = var13;
                    stackIn_268_0 = stackIn_302_0;
                    if (false) {
                        statePc = 302;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    stackIn_265_0 = stackIn_268_0;
                    statePc = 265;
                    continue stateLoop;
                }
                case 269: {
                    var14++;
                    statePc = 304;
                    continue stateLoop;
                }
                case 270: {
                    if (var15 >= 1 + param1) {
                        statePc = 269;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 272: {
                    var15 = -1;
                    statePc = 270;
                    continue stateLoop;
                }
                case 274: {
                    if (var10 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    var10 = 1;
                    var9 = 1;
                    statePc = 282;
                    continue stateLoop;
                }
                case 277: {
                    if (var9 == 0) {
                        statePc = 276;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 279: {
                    var15++;
                    statePc = 294;
                    continue stateLoop;
                }
                case 280: {
                    if (9 != wf.field_c.field_f.field_o[var13]) {
                        statePc = 279;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 282: {
                    if (wf.field_c.field_f.field_o[var13] == 1) {
                        statePc = 158;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 284: {
                    var10 = 0;
                    statePc = 282;
                    continue stateLoop;
                }
                case 285: {
                    if (wf.field_c.field_f.field_o[var13] != 0) {
                        statePc = 284;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 287: {
                    if ((var13 ^ -1) > (wf.field_c.field_f.field_i ^ -1)) {
                        statePc = 285;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 289: {
                    if (stackIn_289_0 > stackIn_289_1) {
                        statePc = 144;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 291: {
                    var13 = wf.field_c.field_f.field_c * var15 + var12 + var14;
                    stackIn_298_0 = var13 ^ -1;
                    stackIn_292_0 = stackIn_298_0;
                    stackIn_298_1 = -1;
                    stackIn_292_1 = stackIn_298_1;
                    if (false) {
                        statePc = 298;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    stackIn_289_0 = stackIn_292_0;
                    stackIn_289_1 = stackIn_292_1;
                    statePc = 289;
                    continue stateLoop;
                }
                case 293: {
                    var14++;
                    statePc = 300;
                    continue stateLoop;
                }
                case 294: {
                    if (var15 >= param1) {
                        statePc = 293;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 296: {
                    var15 = 0;
                    statePc = 294;
                    continue stateLoop;
                }
                case 297: {
                    var7++;
                    var12 = var12 + wf.field_c.field_f.field_c;
                    statePc = 306;
                    continue stateLoop;
                }
                case 298: {
                    if (stackIn_298_0 <= stackIn_298_1) {
                        statePc = 297;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 300: {
                    stackIn_298_0 = var14 ^ -1;
                    stackIn_298_1 = param1 ^ -1;
                    statePc = 298;
                    continue stateLoop;
                }
                case 301: {
                    var14 = 0;
                    statePc = 300;
                    continue stateLoop;
                }
                case 302: {
                    if (stackIn_302_0 >= param1 + 1) {
                        statePc = 301;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 304: {
                    stackIn_302_0 = var14;
                    statePc = 302;
                    continue stateLoop;
                }
                case 305: {
                    var14 = -1;
                    statePc = 304;
                    continue stateLoop;
                }
                case 306: {
                    if ((var12 ^ -1) <= (param0 + 16 * wf.field_c.field_f.field_c ^ -1)) {
                        statePc = 158;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 308: {
                    var15++;
                    statePc = 318;
                    continue stateLoop;
                }
                case 309: {
                    if (7 != wf.field_c.field_f.field_o[var13]) {
                        statePc = 308;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 311: {
                    if ((var13 ^ -1) > (wf.field_c.field_f.field_i ^ -1)) {
                        statePc = 309;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 313: {
                    if (stackIn_313_0 < 0) {
                        statePc = 130;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 315: {
                    var13 = wf.field_c.field_f.field_c * var15 + (var14 + var12);
                    stackIn_350_0 = var13;
                    stackIn_316_0 = stackIn_350_0;
                    if (false) {
                        statePc = 350;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 316: {
                    stackIn_313_0 = stackIn_316_0;
                    statePc = 313;
                    continue stateLoop;
                }
                case 317: {
                    var14++;
                    statePc = 352;
                    continue stateLoop;
                }
                case 318: {
                    if (var15 >= 1 + param1) {
                        statePc = 317;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 320: {
                    var15 = -1;
                    statePc = 318;
                    continue stateLoop;
                }
                case 322: {
                    if (var10 == 0) {
                        statePc = 149;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 324: {
                    var10 = 1;
                    var9 = 1;
                    statePc = 330;
                    continue stateLoop;
                }
                case 325: {
                    if (var9 == 0) {
                        statePc = 324;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 327: {
                    var15++;
                    statePc = 342;
                    continue stateLoop;
                }
                case 328: {
                    if (9 != wf.field_c.field_f.field_o[var13]) {
                        statePc = 327;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 330: {
                    if (wf.field_c.field_f.field_o[var13] == 1) {
                        statePc = 158;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 332: {
                    var10 = 0;
                    statePc = 330;
                    continue stateLoop;
                }
                case 333: {
                    if (wf.field_c.field_f.field_o[var13] != 0) {
                        statePc = 332;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 335: {
                    if ((var13 ^ -1) > (wf.field_c.field_f.field_i ^ -1)) {
                        statePc = 333;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 337: {
                    if (stackIn_337_0 > stackIn_337_1) {
                        statePc = 144;
                    } else {
                        statePc = 335;
                    }
                    continue stateLoop;
                }
                case 339: {
                    var13 = wf.field_c.field_f.field_c * var15 + var12 + var14;
                    stackIn_346_0 = var13 ^ -1;
                    stackIn_340_0 = stackIn_346_0;
                    stackIn_346_1 = -1;
                    stackIn_340_1 = stackIn_346_1;
                    if (false) {
                        statePc = 346;
                    } else {
                        statePc = 340;
                    }
                    continue stateLoop;
                }
                case 340: {
                    stackIn_337_0 = stackIn_340_0;
                    stackIn_337_1 = stackIn_340_1;
                    statePc = 337;
                    continue stateLoop;
                }
                case 341: {
                    var14++;
                    statePc = 348;
                    continue stateLoop;
                }
                case 342: {
                    if (var15 >= param1) {
                        statePc = 341;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 344: {
                    var15 = 0;
                    statePc = 342;
                    continue stateLoop;
                }
                case 345: {
                    var7++;
                    var12 = var12 + wf.field_c.field_f.field_c;
                    statePc = 354;
                    continue stateLoop;
                }
                case 346: {
                    if (stackIn_346_0 <= stackIn_346_1) {
                        statePc = 345;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 348: {
                    stackIn_346_0 = var14 ^ -1;
                    stackIn_346_1 = param1 ^ -1;
                    statePc = 346;
                    continue stateLoop;
                }
                case 349: {
                    var14 = 0;
                    statePc = 348;
                    continue stateLoop;
                }
                case 350: {
                    if (stackIn_350_0 >= param1 + 1) {
                        statePc = 349;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 352: {
                    stackIn_350_0 = var14;
                    statePc = 350;
                    continue stateLoop;
                }
                case 353: {
                    var14 = -1;
                    statePc = 352;
                    continue stateLoop;
                }
                case 354: {
                    if ((var12 ^ -1) <= (param0 + 16 * wf.field_c.field_f.field_c ^ -1)) {
                        statePc = 158;
                    } else {
                        statePc = 353;
                    }
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0, boolean param1) {
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_100_0 = 0;
        boolean stackIn_254_0 = false;
        int stackIn_262_0 = 0;
        int stackIn_269_0 = 0;
        int stackIn_269_1 = 0;
        int stackIn_468_0 = 0;
        int stackIn_468_1 = 0;
        int stackIn_481_0 = 0;
        int stackIn_481_1 = 0;
        boolean stackOut_253_0;
        int var3;
        pd var3_ref_pd;
        int var4;
        pd var4_ref_pd;
        int var5;
        pd var6_ref_pd;
        int var6;
        int var7_int;
        lb var7;
        int var8;
        kb var9_ref_kb;
        int var9;
        int var10_int;
        int[] var10;
        kb var11_ref_kb;
        int var11;
        int var12;
        im var12_ref_im;
        int var13_int;
        Object var13;
        int var14_int;
        Object var14;
        int var15_int;
        kb var15;
        Object var15_ref;
        int var16;
        kb var16_ref_kb;
        int var17_int;
        kb var17;
        int var18;
        int var19;
        kb var20;
        Object var21;
        kb var21_ref;
        Object var22;
        kb var22_ref;
        kb var23;
        Object var24;
        kb var24_ref;
        im var25;
        Object var26;
        kb var26_ref;
        lb[] var27;
        L0: {
          var21 = null;
          var22 = null;
          var24 = null;
          var26 = null;
          var19 = OrbDefence.field_D ? 1 : 0;
          if (-3 >= (va.field_d ^ -1)) {
            L1: {
              if (!ek.field_a[12]) {
                break L1;
              } else {
                ob.field_F = true;
                break L1;
              }
            }
            if (ek.field_a[11]) {
              ob.field_F = false;
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (0 < this.field_n) {
            this.field_n = this.field_n - 1;
            break L2;
          } else {
            this.field_n = 10;
            if (wf.field_c.field_x >= 99) {
              break L2;
            } else {
              L3: {
                if (0 != wf.field_c.field_x % 11) {
                  break L3;
                } else {
                  if (wf.field_c.field_r.c(-3088)) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = wf.field_c.field_f.field_s[wf.field_c.field_x % wf.field_c.field_f.field_s.length];
              var4 = var3 % wf.field_c.field_f.field_c;
              var5 = var3 / wf.field_c.field_f.field_c;
              var6_ref_pd = new pd(var4, var5, wf.field_c, 12, 1);
              var6_ref_pd.field_o = 1;
              this.field_v.a(-118, var6_ref_pd);
              if (jc.field_f[this.field_b][wf.field_c.field_x] == 1) {
                L4: {
                  var7_int = 1;
                  if (wf.field_c.field_x % 11 != 10) {
                    break L4;
                  } else {
                    var7_int = 3;
                    break L4;
                  }
                }
                var8 = 1;
                L5: while (true) {
                  if ((var8 ^ -1) < (var7_int ^ -1)) {
                    break L2;
                  } else {
                    var3 = wf.field_c.field_f.field_s[(var8 + wf.field_c.field_x) % wf.field_c.field_f.field_s.length];
                    var5 = var3 / wf.field_c.field_f.field_c;
                    var4 = var3 % wf.field_c.field_f.field_c;
                    var6_ref_pd = new pd(var4, var5, wf.field_c, 12, 1);
                    var6_ref_pd.field_o = 1;
                    this.field_v.a(-81, var6_ref_pd);
                    var8++;
                    continue L5;
                  }
                }
              } else {
                break L2;
              }
            }
          }
        }
        var3_ref_pd = (pd) ((Object) this.field_v.b((byte) -39));
        L6: while (true) {
          L7: {
            if (var3_ref_pd == null) {
              var3_ref_pd = (pd) ((Object) this.field_v.d((byte) -122));
              L8: while (true) {
                if (var3_ref_pd == null) {
                  stackIn_34_0 = this.field_b ^ -1;
                  stackIn_34_1 = -1;
                  break L7;
                } else {
                  stackIn_34_0 = var3_ref_pd.field_o ^ -1;

                  stackIn_34_1 = -1;

                  L9: {
                    if (stackIn_34_0 < stackIn_34_1) {
                      break L9;
                    } else {
                      var3_ref_pd.b(57);
                      break L9;
                    }
                  }
                  var3_ref_pd = (pd) ((Object) this.field_v.b(10708));
                  continue L8;
                }
              }
            } else {
              var3_ref_pd.c(1);
              stackIn_34_0 = 6;

              stackIn_34_1 = wf.field_c.field_f.field_o[var3_ref_pd.field_t];

              L10: {
                if (stackIn_34_0 == stackIn_34_1) {
                  var3_ref_pd.field_o = 0;
                  break L10;
                } else {
                  break L10;
                }
              }
              var3_ref_pd = (pd) ((Object) this.field_v.d(param0 + -27950));
              continue L6;
            }
          }
          L11: {
            L12: {
              if (stackIn_34_0 == stackIn_34_1) {
                break L12;
              } else {
                if (3 >= this.field_b) {
                  break L11;
                } else {
                  break L12;
                }
              }
            }
            if (-599 < (ua.field_a ^ -1)) {
              break L11;
            } else {
              if ((vl.field_d ^ -1) > -11) {
                break L11;
              } else {
                if (ua.field_a > 630) {
                  break L11;
                } else {
                  if ((vl.field_d ^ -1) < -43) {
                    break L11;
                  } else {
                    if (1 != gi.field_e) {
                      break L11;
                    } else {
                      L13: {
                        if (df.field_f) {
                          stackIn_45_0 = 0;
                          break L13;
                        } else {
                          stackIn_45_0 = 1;
                          break L13;
                        }
                      }
                      df.field_f = stackIn_45_0 != 0;
                      gk.a(mh.field_a[2], (byte) -11);
                      break L11;
                    }
                  }
                }
              }
            }
          }
          L14: {
            if (-1 > (this.field_u ^ -1)) {
              this.field_u = this.field_u - 1;
              wf.field_c.field_i = 0;
              if (this.field_b > 3) {
                if (this.field_u > 300) {
                  this.field_t = (-320 + ol.field_e * (-1 + wf.field_c.field_f.field_c) + this.field_t * 63) / 64 - -3;
                  break L14;
                } else {
                  if ((this.field_u ^ -1) >= -201) {
                    if (this.field_u <= 100) {
                      this.field_h = -3 + (120 + this.field_h * 63) / 64;
                      break L14;
                    } else {
                      this.field_t = (320 + 63 * this.field_t) / 64 + -3;
                      break L14;
                    }
                  } else {
                    this.field_h = (-120 + this.field_h * 63 + ol.field_e * (-1 + wf.field_c.field_f.field_t)) / 64 + 3;
                    break L14;
                  }
                }
              } else {
                if (-101 > (this.field_u ^ -1)) {
                  this.field_t = (-320 + 63 * this.field_t + ol.field_e * (wf.field_c.field_f.field_c - 1)) / 64 - -3;
                  break L14;
                } else {
                  this.field_t = -3 + (63 * this.field_t + 320) / 64;
                  break L14;
                }
              }
            } else {
              break L14;
            }
          }
          L15: {
            if (-1 == (wf.field_c.field_f.field_k ^ -1)) {
              wf.field_c.field_k = true;
              break L15;
            } else {
              break L15;
            }
          }
          L16: {
            if (l.field_c <= 0) {
              break L16;
            } else {
              l.field_c = l.field_c - 1;
              break L16;
            }
          }
          if (wf.field_c.field_k) {
            L17: {
              if (this.field_o == 0) {
                hi.a(ee.field_b[14], 2, false, 1, false, 2);
                if ((wf.field_c.field_f.field_k ^ -1) < -1) {
                  if (-45 <= (wf.field_c.field_x ^ -1)) {
                    break L17;
                  } else {
                    L18: {
                      wf.field_c.field_x = wf.field_c.field_f.field_k / 25 + 99;
                      if (this.field_b == 0) {
                        f.a(6, 249, (byte) -25);
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L19: {
                      if (0 != this.field_b) {
                        break L19;
                      } else {
                        if (-126 < (wf.field_c.field_f.field_k ^ -1)) {
                          break L19;
                        } else {
                          f.a(7, 248, (byte) -25);
                          break L19;
                        }
                      }
                    }
                    L20: {
                      if (3 == this.field_b) {
                        f.a(8, 247, (byte) -25);
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    if (-1 != (wf.field_c.field_s ^ -1)) {
                      break L17;
                    } else {
                      if ((this.field_b ^ -1) == -1) {
                        f.a(16, 239, (byte) -25);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                  }
                } else {
                  break L17;
                }
              } else {
                break L17;
              }
            }
            L21: {
              this.field_o = this.field_o + 1;
              if (-401 != (this.field_o ^ -1)) {
                break L21;
              } else {
                if (0 >= wf.field_c.field_f.field_k) {
                  break L21;
                } else {
                  if (44 < wf.field_c.field_x) {
                    break L21;
                  } else {
                    if (of.field_G != 0) {
                      break L21;
                    } else {
                      if (!ek.field_a[13]) {
                        this.field_o = 399;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                  }
                }
              }
            }
            if (this.field_o <= 500) {
              return;
            } else {
              L22: {
                if (!n.b((byte) 93)) {
                  il.field_f.c(-1);
                  kj.field_x = null;
                  if (dm.field_f == 0) {
                    rh.a((byte) -45, 2, true);
                    break L22;
                  } else {
                    rh.a((byte) 113, 5, true);
                    break L22;
                  }
                } else {
                  rh.a((byte) -91, 6, true);
                  break L22;
                }
              }
              L23: {
                if ((tc.field_b ^ -1) < -1) {
                  stackIn_100_0 = 0;
                  break L23;
                } else {
                  stackIn_100_0 = 7;
                  break L23;
                }
              }
              bk.field_e = stackIn_100_0;
              return;
            }
          } else {
            L24: {
              L25: {
                da.field_b = da.field_b + 1;
                if (!df.field_f) {
                  break L25;
                } else {
                  if (-1 == (this.field_b ^ -1)) {
                    break L24;
                  } else {
                    if ((this.field_m ^ -1) <= -17) {
                      break L24;
                    } else {
                      break L25;
                    }
                  }
                }
              }
              if (0 != (this.field_m ^ -1)) {
                this.field_c = this.field_c + 1;
                if (-251 > (this.field_c ^ -1)) {
                  this.field_c = 0;
                  this.field_m = -1;
                  break L24;
                } else {
                  break L24;
                }
              } else {
                break L24;
              }
            }
            L26: {
              if (0 != this.field_b) {
                if (-4 <= (this.field_b ^ -1)) {
                  break L26;
                } else {
                  if (-1 != (hm.field_C ^ -1)) {
                    break L26;
                  } else {
                    if (0 != wf.field_c.field_i) {
                      break L26;
                    } else {
                      if (0 != this.field_c) {
                        break L26;
                      } else {
                        if (this.field_k) {
                          break L26;
                        } else {
                          if (0 != (this.field_m ^ -1)) {
                            break L26;
                          } else {
                            this.field_m = 18;
                            this.field_c = 0;
                            break L26;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                L27: {
                  if (0 != hm.field_C) {
                    break L27;
                  } else {
                    if (-1 != (wf.field_c.field_i ^ -1)) {
                      break L27;
                    } else {
                      if (-1 != (this.field_c ^ -1)) {
                        break L27;
                      } else {
                        if (!this.field_k) {
                          if (this.field_m != -1) {
                            break L27;
                          } else {
                            this.field_m = 0;
                            this.field_c = 0;
                            break L27;
                          }
                        } else {
                          break L27;
                        }
                      }
                    }
                  }
                }
                L28: {
                  L29: {
                    if (hm.field_C != 0) {
                      break L29;
                    } else {
                      if (wf.field_c.field_o.c((byte) 52) >= 10) {
                        break L29;
                      } else {
                        if ((wf.field_c.field_e[0].b(true) ^ -1) >= -31) {
                          break L29;
                        } else {
                          if (!wf.field_c.field_b.c(-3088)) {
                            break L29;
                          } else {
                            if (this.field_m != -1) {
                              break L28;
                            } else {
                              this.field_m = 1;
                              this.field_c = 0;
                              break L28;
                            }
                          }
                        }
                      }
                    }
                  }
                  if ((hm.field_C ^ -1) != -1) {
                    break L28;
                  } else {
                    L30: {
                      if (this.field_m == 2) {
                        break L30;
                      } else {
                        L31: {
                          L32: {
                            if (-4 <= (wf.field_c.field_o.c((byte) 52) ^ -1)) {
                              break L32;
                            } else {
                              if ((wf.field_c.field_e[0].b(true) ^ -1) >= -31) {
                                break L31;
                              } else {
                                break L32;
                              }
                            }
                          }
                          if (wf.field_c.field_o.c((byte) 52) < 10) {
                            break L28;
                          } else {
                            break L31;
                          }
                        }
                        if (wf.field_c.field_b.c(-3088)) {
                          break L30;
                        } else {
                          break L28;
                        }
                      }
                    }
                    L33: {
                      L34: {
                        if ((this.field_m ^ -1) == 0) {
                          break L34;
                        } else {
                          if (this.field_m != 1) {
                            break L33;
                          } else {
                            break L34;
                          }
                        }
                      }
                      this.field_m = 2;
                      this.field_c = 0;
                      break L33;
                    }
                    if (!this.field_j) {
                      break L28;
                    } else {
                      if (gi.field_e == 1) {
                        hm.field_C = 1;
                        this.field_m = -1;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                  }
                }
                L35: {
                  if (hm.field_C == 1) {
                    this.field_c = 0;
                    this.field_m = 3;
                    if (wf.field_c.field_x <= 1) {
                      break L35;
                    } else {
                      hm.field_C = 2;
                      this.field_m = -1;
                      break L35;
                    }
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if (2 != hm.field_C) {
                    break L36;
                  } else {
                    L37: {
                      if (!this.field_j) {
                        break L37;
                      } else {
                        if (gi.field_e != 1) {
                          break L37;
                        } else {
                          this.field_m = -1;
                          break L37;
                        }
                      }
                    }
                    if (wf.field_c.field_x != 2) {
                      break L36;
                    } else {
                      hm.field_C = 3;
                      this.field_m = 15;
                      this.field_c = 0;
                      break L36;
                    }
                  }
                }
                L38: {
                  if ((hm.field_C ^ -1) == -4) {
                    L39: {
                      if (!this.field_j) {
                        break L39;
                      } else {
                        if ((gi.field_e ^ -1) == -2) {
                          this.field_m = -1;
                          break L39;
                        } else {
                          break L39;
                        }
                      }
                    }
                    if (wf.field_c.field_x != 5) {
                      break L38;
                    } else {
                      this.field_m = 5;
                      hm.field_C = 4;
                      this.field_c = 0;
                      break L38;
                    }
                  } else {
                    break L38;
                  }
                }
                L40: {
                  if ((hm.field_C ^ -1) == -5) {
                    L41: {
                      if (!this.field_j) {
                        break L41;
                      } else {
                        if (1 == gi.field_e) {
                          this.field_m = -1;
                          break L41;
                        } else {
                          break L41;
                        }
                      }
                    }
                    L42: {
                      L43: {
                        if ((wf.field_c.field_x ^ -1) != -11) {
                          break L43;
                        } else {
                          if (fd.field_b < 500 + wf.field_c.field_i) {
                            break L42;
                          } else {
                            break L43;
                          }
                        }
                      }
                      if ((wf.field_c.field_x ^ -1) <= -12) {
                        break L42;
                      } else {
                        break L40;
                      }
                    }
                    this.field_m = 4;
                    this.field_c = 0;
                    hm.field_C = 5;
                    break L40;
                  } else {
                    break L40;
                  }
                }
                if ((this.field_m ^ -1) != 0) {
                  break L26;
                } else {
                  if (wf.field_c.field_f.field_k >= 125) {
                    break L26;
                  } else {
                    if (!this.field_g) {
                      this.field_g = true;
                      this.field_c = 0;
                      this.field_m = 6;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                }
              }
            }
            L44: {
              if (this.field_m != -1) {
                break L44;
              } else {
                L45: {
                  if (wf.field_c.field_r.c(-3088)) {
                    break L45;
                  } else {
                    if (0 == wf.field_c.field_x % 11) {
                      break L44;
                    } else {
                      break L45;
                    }
                  }
                }
                if (wf.field_c.field_f.field_k > 0) {
                  L46: {
                    L47: {
                      if (wf.field_c.field_x < 11) {
                        break L47;
                      } else {
                        if (jk.field_j[2] < 2) {
                          jk.field_j[2] = 2;
                          this.field_m = 7;
                          break L46;
                        } else {
                          break L47;
                        }
                      }
                    }
                    L48: {
                      if ((this.field_b ^ -1) <= -5) {
                        break L48;
                      } else {
                        if (wf.field_c.field_x < 22) {
                          break L48;
                        } else {
                          if (2 > jk.field_j[3]) {
                            this.field_m = 8;
                            jk.field_j[3] = 2;
                            break L46;
                          } else {
                            break L48;
                          }
                        }
                      }
                    }
                    L49: {
                      if ((this.field_b ^ -1) <= -5) {
                        break L49;
                      } else {
                        if (wf.field_c.field_x < 33) {
                          break L49;
                        } else {
                          if (2 <= jk.field_j[4]) {
                            break L49;
                          } else {
                            jk.field_j[4] = 2;
                            this.field_m = 9;
                            break L46;
                          }
                        }
                      }
                    }
                    L50: {
                      if (4 > this.field_b) {
                        break L50;
                      } else {
                        if (wf.field_c.field_x < 22) {
                          break L50;
                        } else {
                          if ((jk.field_j[5] ^ -1) <= -3) {
                            break L50;
                          } else {
                            jk.field_j[5] = 2;
                            this.field_m = 16;
                            break L46;
                          }
                        }
                      }
                    }
                    L51: {
                      if ((wf.field_c.field_x ^ -1) > -45) {
                        break L51;
                      } else {
                        if (-5 >= (jk.field_j[0] ^ -1)) {
                          break L51;
                        } else {
                          this.field_m = 10;
                          jk.field_j[0] = 4;
                          break L46;
                        }
                      }
                    }
                    L52: {
                      if (wf.field_c.field_x < 55) {
                        break L52;
                      } else {
                        if (-5 < (jk.field_j[1] ^ -1)) {
                          this.field_m = 11;
                          jk.field_j[1] = 4;
                          break L46;
                        } else {
                          break L52;
                        }
                      }
                    }
                    L53: {
                      if ((wf.field_c.field_x ^ -1) > -67) {
                        break L53;
                      } else {
                        if (-5 >= (jk.field_j[2] ^ -1)) {
                          break L53;
                        } else {
                          this.field_m = 12;
                          jk.field_j[2] = 4;
                          break L46;
                        }
                      }
                    }
                    L54: {
                      if (this.field_b >= 4) {
                        break L54;
                      } else {
                        if (77 > wf.field_c.field_x) {
                          break L54;
                        } else {
                          if (jk.field_j[3] < 4) {
                            jk.field_j[3] = 4;
                            this.field_m = 13;
                            break L46;
                          } else {
                            break L54;
                          }
                        }
                      }
                    }
                    L55: {
                      if ((this.field_b ^ -1) <= -5) {
                        break L55;
                      } else {
                        if (wf.field_c.field_x < 88) {
                          break L55;
                        } else {
                          if (-5 >= (jk.field_j[4] ^ -1)) {
                            break L55;
                          } else {
                            jk.field_j[4] = 4;
                            this.field_m = 14;
                            break L46;
                          }
                        }
                      }
                    }
                    if (4 > this.field_b) {
                      break L46;
                    } else {
                      if (wf.field_c.field_x < 77) {
                        break L46;
                      } else {
                        if (jk.field_j[5] < 4) {
                          this.field_m = 17;
                          jk.field_j[5] = 4;
                          break L46;
                        } else {
                          break L46;
                        }
                      }
                    }
                  }
                  if (-1 != this.field_m) {
                    this.field_c = 0;
                    break L44;
                  } else {
                    break L44;
                  }
                } else {
                  break L44;
                }
              }
            }
            L56: {
              L57: {
                nh.field_b = nh.field_b + 1;
                mm.field_C = mm.field_C + 1;
                if (4 <= this.field_m) {
                  break L57;
                } else {
                  if (0 != this.field_m) {
                    break L56;
                  } else {
                    break L57;
                  }
                }
              }
              if (!this.field_j) {
                break L56;
              } else {
                if ((gi.field_e ^ -1) == -2) {
                  this.field_k = true;
                  this.field_m = -1;
                  break L56;
                } else {
                  break L56;
                }
              }
            }
            L58: {
              if (!ek.field_a[56]) {
                break L58;
              } else {
                if (2 <= va.field_d) {
                  var3 = 0;
                  L59: while (true) {
                    if (jk.field_j.length <= var3) {
                      jk.field_j[-1 + jk.field_j.length] = 0;
                      fc.field_d = true;
                      this.field_s.a((byte) -6, 1000);
                      gk.a(mh.field_a[1], (byte) -11);
                      break L58;
                    } else {
                      jk.field_j[var3] = 4;
                      var3++;
                      continue L59;
                    }
                  }
                } else {
                  break L58;
                }
              }
            }
            L60: {
              if (this.field_s.b(-59)) {
                break L60;
              } else {
                fc.field_d = true;
                break L60;
              }
            }
            L61: {
              var3 = 0;
              if (param0 == 28803) {
                break L61;
              } else {
                this.field_v = (im) null;
                break L61;
              }
            }
            var4_ref_pd = (pd) ((Object) wf.field_c.field_r.b((byte) -85));
            L62: while (true) {
              L63: {
                if (var4_ref_pd == null) {
                  stackIn_262_0 = 0;
                  break L63;
                } else {
                  stackOut_253_0 = ek.field_a[55];
                  stackIn_262_0 = stackOut_253_0 ? 1 : 0;
                  stackIn_254_0 = stackOut_253_0;
                  L64: {
                    if (!stackIn_254_0) {
                      break L64;
                    } else {
                      if ((va.field_d ^ -1) > -3) {
                        break L64;
                      } else {
                        fc.field_d = true;
                        var4_ref_pd.field_o = 0;
                        break L64;
                      }
                    }
                  }
                  L65: {
                    if ((var4_ref_pd.field_o ^ -1) < -1) {
                      var3 = var3 + var4_ref_pd.field_o;
                      break L65;
                    } else {
                      break L65;
                    }
                  }
                  var4_ref_pd = (pd) ((Object) wf.field_c.field_r.d(param0 ^ 29654));
                  continue L62;
                }
              }
              var4 = stackIn_262_0;
              L66: while (true) {
                L67: {
                  if (-1 + this.field_d.length <= var4) {
                    this.field_d[-1 + this.field_d.length] = var3;
                    this.field_x = this.field_x - 1;
                    bc.field_r = bc.field_r + this.field_x;
                    a.field_r = a.field_r + this.field_x;
                    stackIn_269_0 = -1;
                    stackIn_269_1 = wf.field_c.field_x % 11 ^ -1;
                    break L67;
                  } else {
                    this.field_d[var4] = this.field_d[var4 - -1];
                    stackIn_269_0 = this.field_d[var4];

                    stackIn_269_1 = this.field_x;

                    L68: {
                      if (stackIn_269_0 <= stackIn_269_1) {
                        break L68;
                      } else {
                        this.field_x = this.field_d[var4];
                        break L68;
                      }
                    }
                    var4++;
                    continue L66;
                  }
                }
                L69: {
                  L70: {
                    if (stackIn_269_0 != stackIn_269_1) {
                      break L70;
                    } else {
                      if ((var3 ^ -1) != -1) {
                        break L70;
                      } else {
                        if (0 >= wf.field_c.field_x) {
                          break L70;
                        } else {
                          this.b(-106);
                          break L69;
                        }
                      }
                    }
                  }
                  if (0 != var3) {
                    L71: {
                      var4 = 1 + this.b((byte) 98);
                      if ((wf.field_c.field_x % 11 ^ -1) == -1) {
                        var4++;
                        break L71;
                      } else {
                        break L71;
                      }
                    }
                    L72: {
                      if ((var4 ^ -1) != (bl.field_p ^ -1)) {
                        hi.a(ee.field_b[var4], 2, false, 1, true, 2);
                        break L72;
                      } else {
                        break L72;
                      }
                    }
                    bl.field_p = var4;
                    break L69;
                  } else {
                    L73: {
                      var4 = this.b((byte) -127);
                      if (var4 != bl.field_p) {
                        hi.a(ee.field_b[var4], 2, false, 1, true, 2);
                        break L73;
                      } else {
                        break L73;
                      }
                    }
                    bl.field_p = var4;
                    break L69;
                  }
                }
                L74: {
                  mm.field_C = mm.field_C - (vl.field_d - ua.field_a);
                  bc.field_r = bc.field_r - ua.field_a;
                  a.field_r = a.field_r - vl.field_d;
                  if (param1) {
                    L75: while (true) {
                      if (!nf.e(32722)) {
                        if (ia.a(param0 ^ 28803)) {
                          break L74;
                        } else {
                          if (this.field_s != null) {
                            L76: {
                              if (!ek.field_a[96]) {
                                break L76;
                              } else {
                                this.field_t = this.field_t - 16;
                                this.a(94);
                                break L76;
                              }
                            }
                            L77: {
                              if (ek.field_a[97]) {
                                this.field_t = this.field_t + 16;
                                this.a(125);
                                break L77;
                              } else {
                                break L77;
                              }
                            }
                            L78: {
                              if (ek.field_a[98]) {
                                this.field_h = this.field_h - 16;
                                this.a(74);
                                break L78;
                              } else {
                                break L78;
                              }
                            }
                            L79: {
                              if (ek.field_a[99]) {
                                this.field_h = this.field_h + 16;
                                this.a(83);
                                break L79;
                              } else {
                                break L79;
                              }
                            }
                            L80: {
                              if (-1 == (lg.field_a & 4 ^ -1)) {
                                this.field_p = vl.field_d;
                                this.field_e = ua.field_a;
                                break L80;
                              } else {
                                L81: {
                                  L82: {
                                    var4 = (-ua.field_a + this.field_e) / 4;
                                    var5 = (-vl.field_d + this.field_p) / 4;
                                    var6 = var4 * 4;
                                    var7_int = var5 * 4;
                                    if (var4 != 0) {
                                      break L82;
                                    } else {
                                      if (-1 != (var5 ^ -1)) {
                                        break L82;
                                      } else {
                                        break L81;
                                      }
                                    }
                                  }
                                  this.field_p = this.field_p - var7_int;
                                  this.field_e = this.field_e - var6;
                                  this.field_h = this.field_h + var7_int;
                                  this.field_t = this.field_t + var6;
                                  break L81;
                                }
                                this.a(param0 + -28713);
                                break L80;
                              }
                            }
                            L83: {
                              cb.field_a.a(param0 + -28843);
                              if (this.field_h < 192) {
                                this.field_h = 192;
                                break L83;
                              } else {
                                break L83;
                              }
                            }
                            L84: {
                              if (-321 >= (this.field_t ^ -1)) {
                                break L84;
                              } else {
                                this.field_t = 320;
                                break L84;
                              }
                            }
                            L85: {
                              if ((-128 + (-1 + wf.field_c.field_f.field_t) * ol.field_e ^ -1) > (this.field_h ^ -1)) {
                                this.field_h = -128 + (wf.field_c.field_f.field_t - 1) * ol.field_e;
                                break L85;
                              } else {
                                break L85;
                              }
                            }
                            L86: {
                              if ((ol.field_e * (wf.field_c.field_f.field_c + -1) + -320 ^ -1) > (this.field_t ^ -1)) {
                                this.field_t = ol.field_e * (wf.field_c.field_f.field_c - 1) - 320;
                                break L86;
                              } else {
                                break L86;
                              }
                            }
                            L87: {
                              L88: {
                                if (null == this.field_s) {
                                  break L88;
                                } else {
                                  L89: {
                                    eh.field_a = (-320 + (ua.field_a + ol.field_e / 2 + this.field_t)) / ol.field_e;
                                    uh.field_b = (this.field_h + (ol.field_e / 2 + (vl.field_d - 240))) / ol.field_e;
                                    if ((gi.field_e ^ -1) != -3) {
                                      break L89;
                                    } else {
                                      if (this.field_j) {
                                        break L89;
                                      } else {
                                        if (null != this.field_s) {
                                          var4 = eh.field_a - -(uh.field_b * wf.field_c.field_f.field_c);
                                          if (var4 < 0) {
                                            break L89;
                                          } else {
                                            if (var4 >= wf.field_c.field_f.field_i) {
                                              break L89;
                                            } else {
                                              if (wf.field_c.field_f.field_o[var4] != 7) {
                                                break L89;
                                              } else {
                                                L90: {
                                                  l.field_c = -1;
                                                  var20 = wf.field_c.a(var4, param0 + -28908);
                                                  eh.field_a = var20.field_g;
                                                  uh.field_b = var20.field_h;
                                                  if (var20 != null) {
                                                    break L90;
                                                  } else {
                                                    break L90;
                                                  }
                                                }
                                                if (var20.field_p != this.field_s) {
                                                  break L89;
                                                } else {
                                                  gk.a(mh.field_a[3], (byte) -11);
                                                  var20.d(param0 ^ 28810);
                                                  wf.field_c.a(-1);
                                                  break L89;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          break L89;
                                        }
                                      }
                                    }
                                  }
                                  if (-2 != (of.field_G ^ -1)) {
                                    break L88;
                                  } else {
                                    if (this.field_j) {
                                      break L88;
                                    } else {
                                      if (vl.field_d >= 360) {
                                        break L88;
                                      } else {
                                        if (vl.field_d > 60) {
                                          this.a(85);
                                          if (null == this.field_s) {
                                            break L88;
                                          } else {
                                            L91: {
                                              var4 = eh.field_a + wf.field_c.field_f.field_c * uh.field_b;
                                              var5 = this.field_s.b(true);
                                              var6 = ui.field_a[this.field_f][0];
                                              var7_int = oj.a((byte) 47, this.field_f);
                                              var8 = 0;
                                              if (var4 < 0) {
                                                break L91;
                                              } else {
                                                if ((var4 ^ -1) <= (wf.field_c.field_f.field_i ^ -1)) {
                                                  break L91;
                                                } else {
                                                  if ((jk.field_j[this.field_f] ^ -1) > -1) {
                                                    break L91;
                                                  } else {
                                                    L92: {
                                                      if (!this.a(var7_int, param0 + -6076, var4)) {
                                                        break L92;
                                                      } else {
                                                        L93: {
                                                          if (-7 != (this.field_f ^ -1)) {
                                                            break L93;
                                                          } else {
                                                            if (-1 != (this.a(var4, var7_int, (byte) -126) ^ -1)) {
                                                              break L93;
                                                            } else {
                                                              break L92;
                                                            }
                                                          }
                                                        }
                                                        if (var5 >= var6) {
                                                          L94: {
                                                            l.field_c = -1;
                                                            var9_ref_kb = wf.field_c.a(var4, -116);
                                                            var5 = var5 - var6;
                                                            if (var9_ref_kb != null) {
                                                              System.out.println("Oops");
                                                              break L94;
                                                            } else {
                                                              break L94;
                                                            }
                                                          }
                                                          L95: {
                                                            var11_ref_kb = new kb(eh.field_a, uh.field_b, this.field_f, 0, this.field_s, wf.field_c);
                                                            if (-7 == (this.field_f ^ -1)) {
                                                              L96: {
                                                                var12 = this.a(var4, var7_int, (byte) -74);
                                                                var13_int = var12 & 255;
                                                                if (var13_int > 0) {
                                                                  var14_int = 0;
                                                                  L97: while (true) {
                                                                    if (var14_int >= var7_int) {
                                                                      var14 = new kb(var13_int + eh.field_a, uh.field_b, this.field_f, 0, this.field_s, wf.field_c);
                                                                      ((kb) (var14)).field_s = var11_ref_kb;
                                                                      wf.field_c.field_o.a(-96, (ca) (var14));
                                                                      break L96;
                                                                    } else {
                                                                      var15_int = 0;
                                                                      L98: while (true) {
                                                                        if ((var7_int ^ -1) >= (var15_int ^ -1)) {
                                                                          var14_int++;
                                                                          continue L97;
                                                                        } else {
                                                                          var10_int = wf.field_c.field_f.field_c * var15_int + var4 + var13_int + var14_int;
                                                                          wf.field_c.field_f.field_o[var10_int] = 7;
                                                                          wf.field_c.field_f.field_j[var10_int] = 29;
                                                                          var15_int++;
                                                                          continue L98;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  break L96;
                                                                }
                                                              }
                                                              L99: {
                                                                var14_int = 255 & var12 >> -682911992;
                                                                if (0 >= var14_int) {
                                                                  break L99;
                                                                } else {
                                                                  var15_int = 0;
                                                                  L100: while (true) {
                                                                    if ((var7_int ^ -1) >= (var15_int ^ -1)) {
                                                                      var15 = new kb(eh.field_a - var14_int, uh.field_b, this.field_f, 0, this.field_s, wf.field_c);
                                                                      var15.field_s = var11_ref_kb;
                                                                      wf.field_c.field_o.a(param0 + -28887, var15);
                                                                      break L99;
                                                                    } else {
                                                                      var16 = 0;
                                                                      L101: while (true) {
                                                                        if (var16 >= var7_int) {
                                                                          var15_int++;
                                                                          continue L100;
                                                                        } else {
                                                                          var10_int = -var14_int + (var15_int + var4 + var16 * wf.field_c.field_f.field_c);
                                                                          wf.field_c.field_f.field_o[var10_int] = 7;
                                                                          wf.field_c.field_f.field_j[var10_int] = 29;
                                                                          var16++;
                                                                          continue L101;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              L102: {
                                                                var15_int = var12 >> 1354175024 & 255;
                                                                if (var15_int > 0) {
                                                                  var16 = 0;
                                                                  L103: while (true) {
                                                                    if ((var7_int ^ -1) >= (var16 ^ -1)) {
                                                                      var16_ref_kb = new kb(eh.field_a, uh.field_b - -var15_int, this.field_f, 0, this.field_s, wf.field_c);
                                                                      var16_ref_kb.field_s = var11_ref_kb;
                                                                      wf.field_c.field_o.a(-128, var16_ref_kb);
                                                                      break L102;
                                                                    } else {
                                                                      var17_int = 0;
                                                                      L104: while (true) {
                                                                        if ((var7_int ^ -1) >= (var17_int ^ -1)) {
                                                                          var16++;
                                                                          continue L103;
                                                                        } else {
                                                                          var10_int = wf.field_c.field_f.field_c * (var17_int - -var15_int) + var16 + var4;
                                                                          wf.field_c.field_f.field_o[var10_int] = 7;
                                                                          wf.field_c.field_f.field_j[var10_int] = 29;
                                                                          var17_int++;
                                                                          continue L104;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  break L102;
                                                                }
                                                              }
                                                              var16 = (var12 & -16777216) >> 734520152;
                                                              if ((var16 ^ -1) < -1) {
                                                                var17_int = 0;
                                                                L105: while (true) {
                                                                  if ((var7_int ^ -1) >= (var17_int ^ -1)) {
                                                                    var17 = new kb(eh.field_a, uh.field_b - var16, this.field_f, 0, this.field_s, wf.field_c);
                                                                    var17.field_s = var11_ref_kb;
                                                                    wf.field_c.field_o.a(param0 ^ -28908, var17);
                                                                    break L95;
                                                                  } else {
                                                                    var18 = 0;
                                                                    L106: while (true) {
                                                                      if (var18 >= var7_int) {
                                                                        var17_int++;
                                                                        continue L105;
                                                                      } else {
                                                                        var10_int = var17_int + var4 - -((var18 - var16) * wf.field_c.field_f.field_c);
                                                                        wf.field_c.field_f.field_o[var10_int] = 7;
                                                                        wf.field_c.field_f.field_j[var10_int] = 29;
                                                                        var18++;
                                                                        continue L106;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                break L95;
                                                              }
                                                            } else {
                                                              break L95;
                                                            }
                                                          }
                                                          var12 = 0;
                                                          L107: while (true) {
                                                            if ((var12 ^ -1) <= (var7_int ^ -1)) {
                                                              L108: {
                                                                if (3 == this.field_f) {
                                                                  wf.field_c.field_s = wf.field_c.field_s + 1;
                                                                  break L108;
                                                                } else {
                                                                  break L108;
                                                                }
                                                              }
                                                              L109: {
                                                                if ((this.field_f ^ -1) == -7) {
                                                                  ea.a(param0 + -28749, mh.field_a[56], 800);
                                                                  break L109;
                                                                } else {
                                                                  gk.a(mh.field_a[1], (byte) -11);
                                                                  break L109;
                                                                }
                                                              }
                                                              wf.field_c.field_o.a(-117, var11_ref_kb);
                                                              var12_ref_im = new im();
                                                              L110: while (true) {
                                                                if (wf.field_c.field_o.c(-3088)) {
                                                                  L111: while (true) {
                                                                    if (var12_ref_im.c(-3088)) {
                                                                      var8 = 1;
                                                                      break L91;
                                                                    } else {
                                                                      var22_ref = (kb) ((Object) var12_ref_im.b((byte) -78));
                                                                      var13 = var22_ref;
                                                                      var14 = (kb) ((Object) wf.field_c.field_o.b((byte) -29));
                                                                      L112: while (true) {
                                                                        L113: {
                                                                          if (var14 == null) {
                                                                            break L113;
                                                                          } else {
                                                                            stackIn_468_0 = ((kb) (var14)).field_h;

                                                                            stackIn_468_1 = var22_ref.field_h;

                                                                            L114: {
                                                                              if (stackIn_468_0 > stackIn_468_1) {
                                                                                break L114;
                                                                              } else {
                                                                                L115: {
                                                                                  if (var22_ref.field_g >= ((kb) (var14)).field_g) {
                                                                                    break L115;
                                                                                  } else {
                                                                                    if ((((kb) (var14)).field_h ^ -1) != (var22_ref.field_h ^ -1)) {
                                                                                      break L115;
                                                                                    } else {
                                                                                      break L114;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var14 = (kb) ((Object) wf.field_c.field_o.d(853));
                                                                                continue L112;
                                                                              }
                                                                            }
                                                                            vk.a(var22_ref, (byte) -65, (ca) (var14));
                                                                            var14 = null;
                                                                            var13 = null;
                                                                            break L113;
                                                                          }
                                                                        }
                                                                        if (var13 == null) {
                                                                          continue L111;
                                                                        } else {
                                                                          wf.field_c.field_o.a(param0 + -28907, (ca) (var13));
                                                                          continue L111;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  var21_ref = (kb) ((Object) wf.field_c.field_o.b((byte) -74));
                                                                  var21_ref.b(param0 ^ 28858);
                                                                  var12_ref_im.a(-98, var21_ref);
                                                                  continue L110;
                                                                }
                                                              }
                                                            } else {
                                                              var13_int = 0;
                                                              L116: while (true) {
                                                                if ((var7_int ^ -1) >= (var13_int ^ -1)) {
                                                                  var12++;
                                                                  continue L107;
                                                                } else {
                                                                  var10_int = var13_int * wf.field_c.field_f.field_c + var12 + var4;
                                                                  wf.field_c.field_f.field_o[var10_int] = 7;
                                                                  wf.field_c.field_f.field_j[var10_int] = 29;
                                                                  var13_int++;
                                                                  continue L116;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          if (gi.field_e == 1) {
                                                            L117: {
                                                              md.field_f = vl.field_d;
                                                              wl.field_a = ua.field_a;
                                                              hd.field_j = ih.field_b;
                                                              if (wl.field_a < 128) {
                                                                wl.field_a = 128;
                                                                break L117;
                                                              } else {
                                                                break L117;
                                                              }
                                                            }
                                                            l.field_c = 100;
                                                            if (-513 <= (wl.field_a ^ -1)) {
                                                              break L91;
                                                            } else {
                                                              wl.field_a = 512;
                                                              break L91;
                                                            }
                                                          } else {
                                                            break L91;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if (gi.field_e != 1) {
                                                      break L91;
                                                    } else {
                                                      if (!this.b(var4, var7_int, 1)) {
                                                        break L91;
                                                      } else {
                                                        L118: {
                                                          wl.field_a = ua.field_a;
                                                          if ((this.field_f ^ -1) == -7) {
                                                            hd.field_j = ue.field_J;
                                                            break L118;
                                                          } else {
                                                            hd.field_j = aa.field_a;
                                                            break L118;
                                                          }
                                                        }
                                                        L119: {
                                                          md.field_f = vl.field_d;
                                                          if (wl.field_a >= 128) {
                                                            break L119;
                                                          } else {
                                                            wl.field_a = 128;
                                                            break L119;
                                                          }
                                                        }
                                                        L120: {
                                                          if (-513 <= (wl.field_a ^ -1)) {
                                                            break L120;
                                                          } else {
                                                            wl.field_a = 512;
                                                            break L120;
                                                          }
                                                        }
                                                        l.field_c = 100;
                                                        break L91;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            L121: {
                                              if (var8 != 0) {
                                                break L121;
                                              } else {
                                                if (var4 < 0) {
                                                  break L121;
                                                } else {
                                                  if ((wf.field_c.field_f.field_i ^ -1) >= (var4 ^ -1)) {
                                                    break L121;
                                                  } else {
                                                    L122: {
                                                      if (gi.field_e == 1) {
                                                        break L122;
                                                      } else {
                                                        if ((of.field_G ^ -1) != -2) {
                                                          break L121;
                                                        } else {
                                                          if (!ek.field_a[81]) {
                                                            break L121;
                                                          } else {
                                                            break L122;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if (-1 <= (var5 ^ -1)) {
                                                      break L121;
                                                    } else {
                                                      if (wf.field_c.field_f.field_o[var4] != 7) {
                                                        break L121;
                                                      } else {
                                                        l.field_c = -1;
                                                        var23 = wf.field_c.a(var4, -120);
                                                        uh.field_b = var23.field_h;
                                                        eh.field_a = var23.field_g;
                                                        if (this.field_s != var23.field_p) {
                                                          break L121;
                                                        } else {
                                                          if (var23.field_F >= jk.field_j[var23.field_C]) {
                                                            break L121;
                                                          } else {
                                                            var10 = ui.field_a[var23.field_C];
                                                            var11 = var10.length;
                                                            var12 = var23.field_F + 1;
                                                            if (var12 >= var11) {
                                                              break L121;
                                                            } else {
                                                              if (var5 >= var10[var12]) {
                                                                var5 = var5 - var10[var12];
                                                                gk.a(mh.field_a[3], (byte) -11);
                                                                wf.field_c.field_o.a(-125, new kb(eh.field_a, uh.field_b, var23.field_C, var12, this.field_s, wf.field_c));
                                                                var23.field_C = -1;
                                                                var25 = new im();
                                                                L123: while (true) {
                                                                  if (wf.field_c.field_o.c(-3088)) {
                                                                    L124: while (true) {
                                                                      if (var25.c(-3088)) {
                                                                        break L121;
                                                                      } else {
                                                                        var26_ref = (kb) ((Object) var25.b((byte) 119));
                                                                        var14 = var26_ref;
                                                                        var15 = (kb) ((Object) wf.field_c.field_o.b((byte) 124));
                                                                        L125: while (true) {
                                                                          L126: {
                                                                            if (var15 == null) {
                                                                              break L126;
                                                                            } else {
                                                                              stackIn_468_0 = var15.field_h;

                                                                              stackIn_468_1 = var26_ref.field_h;

                                                                              L127: {
                                                                                if (stackIn_468_0 > stackIn_468_1) {
                                                                                  break L127;
                                                                                } else {
                                                                                  L128: {
                                                                                    if ((var26_ref.field_g ^ -1) <= (var15.field_g ^ -1)) {
                                                                                      break L128;
                                                                                    } else {
                                                                                      if ((var26_ref.field_h ^ -1) != (var15.field_h ^ -1)) {
                                                                                        break L128;
                                                                                      } else {
                                                                                        break L127;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  var15 = (kb) ((Object) wf.field_c.field_o.d(853));
                                                                                  continue L125;
                                                                                }
                                                                              }
                                                                              vk.a(var26_ref, (byte) -65, var15);
                                                                              var14 = null;
                                                                              var15_ref = null;
                                                                              break L126;
                                                                            }
                                                                          }
                                                                          if (var14 != null) {
                                                                            wf.field_c.field_o.a(-83, (ca) (var14));
                                                                            continue L124;
                                                                          } else {
                                                                            continue L124;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var24_ref = (kb) ((Object) wf.field_c.field_o.b((byte) -85));
                                                                    var24_ref.b(57);
                                                                    var25.a(param0 + -28917, var24_ref);
                                                                    continue L123;
                                                                  }
                                                                }
                                                              } else {
                                                                break L121;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            this.field_s.c(false);
                                            this.field_s.a((byte) -6, var5);
                                            break L88;
                                          }
                                        } else {
                                          break L88;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L129: {
                                if (!df.field_f) {
                                  break L129;
                                } else {
                                  if (-1 == this.field_m) {
                                    break L129;
                                  } else {
                                    if (-1 == (this.field_b ^ -1)) {
                                      break L74;
                                    } else {
                                      if (this.field_m >= 16) {
                                        break L74;
                                      } else {
                                        break L129;
                                      }
                                    }
                                  }
                                }
                              }
                              wf.field_c.b((byte) 98);
                              wf.field_c.d((byte) 104);
                              df.field_g = df.field_g + 1;
                              stackIn_468_0 = df.field_g ^ -1;
                              stackIn_468_1 = -1001;
                              break L87;
                            }
                            if (stackIn_468_0 >= stackIn_468_1) {
                              break L74;
                            } else {
                              var4 = df.field_g / 1000;
                              var27 = wf.field_c.field_e;
                              var6 = 0;
                              L130: while (true) {
                                if (var6 >= var27.length) {
                                  df.field_g = df.field_g - 1000 * var4;
                                  break L74;
                                } else {
                                  var7 = var27[var6];
                                  var8 = 0;
                                  var9 = 0;
                                  L131: while (true) {
                                    L132: {
                                      if (wf.field_c.field_f.field_o.length <= var9) {
                                        stackIn_481_0 = -1;
                                        stackIn_481_1 = var8 ^ -1;
                                        break L132;
                                      } else {
                                        stackIn_481_0 = wf.field_c.field_f.field_o[var9];

                                        stackIn_481_1 = 6;

                                        L133: {
                                          if (stackIn_481_0 == stackIn_481_1) {
                                            wf.field_c.field_b.a(-123, new oj(var9 % wf.field_c.field_f.field_c, var9 / wf.field_c.field_f.field_c, var7, var9 / wf.field_c.field_f.field_c + var9 % wf.field_c.field_f.field_c, var4));
                                            if ((var9 % wf.field_c.field_f.field_c ^ -1) < (var8 ^ -1)) {
                                              var8 = var9 % wf.field_c.field_f.field_c;
                                              break L133;
                                            } else {
                                              break L133;
                                            }
                                          } else {
                                            break L133;
                                          }
                                        }
                                        var9++;
                                        continue L131;
                                      }
                                    }
                                    L134: {
                                      if (stackIn_481_0 <= stackIn_481_1) {
                                        break L134;
                                      } else {
                                        if (-65 >= (var8 ^ -1)) {
                                          break L134;
                                        } else {
                                          if (33 >= wf.field_c.field_x) {
                                            break L134;
                                          } else {
                                            if (!wf.field_c.field_a) {
                                              break L134;
                                            } else {
                                              f.a(17, 238, (byte) -25);
                                              break L134;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L130;
                                  }
                                }
                              }
                            }
                          } else {
                            break L74;
                          }
                        }
                      } else {
                        this.a(true);
                        continue L75;
                      }
                    }
                  } else {
                    break L74;
                  }
                }
                return;
              }
            }
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
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
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
                        statePc = 17;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var6 = -1;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if ((1 + param1 ^ -1) >= (var6 ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var4 = wf.field_c.field_f.field_c * var6 + (var5 + param0);
                    stackIn_4_0 = var4 ^ -1;
                    stackIn_8_0 = stackIn_4_0;
                    stackIn_4_1 = -1;
                    stackIn_8_1 = stackIn_4_1;
                    if (false) {
                        statePc = 4;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (stackIn_8_0 > stackIn_8_1) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if ((wf.field_c.field_f.field_i ^ -1) >= (var4 ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return false;
                }
                case 12: {
                    if (-8 == (wf.field_c.field_f.field_o[var4] ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    return false;
                }
                case 15: {
                    var6++;
                    statePc = 6;
                    continue stateLoop;
                }
                case 16: {
                    var5++;
                    statePc = 3;
                    continue stateLoop;
                }
                case 17: {
                    return true;
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
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            bm.field_d.a(em.field_o, false, true, ke.field_b);
            bm.field_d.o(123);
            L1: while (true) {
              if (!nf.e(32722)) {
                if (mc.field_g == -1) {
                  L2: {
                    if (param0 < -93) {
                      break L2;
                    } else {
                      field_w = (tl) null;
                      break L2;
                    }
                  }
                  if (oe.field_p) {
                    stackIn_12_0 = 3;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (mg.field_m != tg.field_c) {
                      if (!bd.field_u.a(false)) {
                        stackIn_19_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        if (mg.field_m != qc.field_g) {
                          stackIn_24_0 = -1;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          stackIn_22_0 = 2;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    } else {
                      stackIn_15_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  var1_int = mc.field_g;
                  il.a(-1, 0);
                  stackIn_6_0 = var1_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                bm.field_d.a(od.field_k, true, ob.field_K);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "nk.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0;
                } else {
                  return stackIn_24_0;
                }
              }
            }
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
