/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti extends pc {
    static j field_u;
    private int field_o;
    private int field_w;
    private int[] field_q;
    float field_t;
    private int field_v;
    int field_y;
    private int field_s;
    int field_p;
    static ll field_x;
    private int field_r;
    static int field_z;

    final void a(int param0) {
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_79_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_98_0 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        hj var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var13 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = HoldTheLine.field_D;
                    if (param0 == -55) {
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
                    var2 = 50 - this.field_s;
                    if (this.field_y != 2) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var2 = -(this.field_a * 5) + (this.field_r + 25);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if ((var2 ^ -1) <= -1) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var2 = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var3 = (int)((double)we.field_n * (-Math.exp((double)((float)var2 * 0.20000000298023224f)) + 1.0));
                    if ((this.field_y ^ -1) < -3) {
                        statePc = 8;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var3 = 640;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (this.field_o == 12) {
                        statePc = 18;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var4 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (this.field_a <= var4) {
                        statePc = 17;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_51_0 = this;
                    stackIn_13_0 = stackIn_51_0;
                    stackIn_51_1 = this.e(var4, -125);
                    stackIn_13_1 = stackIn_51_1;
                    stackIn_51_2 = var4;
                    stackIn_13_2 = stackIn_51_2;
                    if (var9 != 0) {
                        statePc = 51;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = this;
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = stackIn_13_1;
                    stackIn_14_1 = stackIn_15_1;
                    stackIn_15_2 = stackIn_13_2;
                    stackIn_14_2 = stackIn_15_2;
                    if ((this.field_c ^ -1) != (var4 ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = this;
                    stackIn_16_1 = stackIn_14_1;
                    stackIn_16_2 = stackIn_14_2;
                    stackIn_16_3 = 1;
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = this;
                    stackIn_16_1 = stackIn_15_1;
                    stackIn_16_2 = stackIn_15_2;
                    stackIn_16_3 = 0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    this.a(stackIn_16_1, stackIn_16_2, stackIn_16_3 != 0, (byte) -116);
                    var4++;
                    if (var9 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var9 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    this.c(var3, false);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if ((this.field_o ^ -1) == -3) {
                        statePc = 50;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if ((this.field_o ^ -1) != -4) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    this.a(true, var3);
                    if (var9 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (this.field_o != 4) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    this.i(var3, -11468);
                    if (var9 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (-6 == (this.field_o ^ -1)) {
                        statePc = 48;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (6 != this.field_o) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    this.f(45, var3);
                    if (var9 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (this.field_o != 9) {
                        statePc = 33;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    this.l(29280);
                    if (var9 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if ((this.field_o ^ -1) != -8) {
                        statePc = 36;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    this.c((byte) -18);
                    if (var9 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (8 == this.field_o) {
                        statePc = 46;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if ((this.field_o ^ -1) != -11) {
                        statePc = 43;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (480.0f == this.field_t) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    this.h(12);
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (0.0f == this.field_t) {
                        statePc = 52;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    this.n(param0 + -10912);
                    if (var9 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if ((this.field_o ^ -1) != -12) {
                        statePc = 52;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    this.h(12);
                    if (var9 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    this.c((byte) -18);
                    if (var9 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    this.i(var3, -11468);
                    if (var9 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    stackIn_51_0 = this;
                    stackIn_51_1 = 1;
                    stackIn_51_2 = var3;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    this.a(stackIn_51_1 != 0, stackIn_51_2);
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (-1 == (this.field_o ^ -1)) {
                        statePc = 62;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if ((this.field_o ^ -1) == -13) {
                        statePc = 62;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (-3 <= (this.field_y ^ -1)) {
                        statePc = 56;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var4 = 0;
                    var5_int = 8;
                    if (10 == this.field_o) {
                        statePc = 58;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 58: {
                    var5_int = var5_int - (int)this.field_t;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if (-3 != (this.field_y ^ -1)) {
                        statePc = 61;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var6 = -(this.field_a * 5) + -5 + (25 + this.field_r);
                    var4 = (int)((double)we.field_n * (1.0 - Math.exp((double)(0.20000000298023224f * (float)var6))));
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    fl.a(qe.field_g[this.field_o].toUpperCase(), var4, 5, param0 + -1698, var5_int);
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (-1 == (this.field_o ^ -1)) {
                        statePc = 64;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var4 = -140 + this.field_j;
                    if ((this.field_y ^ -1) != -1) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var5_int = -this.field_s + 50;
                    var4 = var4 - (int)((double)this.field_j * Math.exp((double)(0.20000000298023224f * (float)var5_int)));
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if (-4 != (this.field_y ^ -1)) {
                        statePc = 68;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var4 = (int)((double)this.field_j * (Math.exp((double)(0.20000000298023224f * (float)(40 - this.field_w))) - 1.0) / (-1.0 + Math.exp(8.0))) + -140;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    tc.c(0, var4 - -100, 640, 5, 0, 128);
                    var5 = fd.field_e.a(8192);
                    if (var5 != null) {
                        statePc = 70;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var13 = new int[4];
                    tc.b(var13);
                    tc.e(0, var4, 640, var4 - -100);
                    var7 = 0;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if (-12 >= (var7 ^ -1)) {
                        statePc = 75;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    fd.field_e.a(8192).b(60 * var7, var4);
                    fd.field_e.a(param0 ^ -8247).b(60 * var7, 60 + var4);
                    var7++;
                    if (var9 != 0) {
                        statePc = 76;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (var9 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    tc.a(var13);
                    tc.b(0, -1 + var4, 640, 0);
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    var7 = 0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if ((var7 ^ -1) <= -12) {
                        statePc = 86;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    tc.b(-16 + 64 * var7, var4, 32, 16777215);
                    tc.b(16 + 64 * var7, var4, 32, 16711680);
                    stackIn_87_0 = 0;
                    stackIn_79_0 = stackIn_87_0;
                    if (var9 != 0) {
                        statePc = 87;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var8 = stackIn_79_0;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if ((var8 ^ -1) <= -7) {
                        statePc = 84;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    tc.b(-17 + 64 * var7, var8 + var4 - -1, 32, 14737632);
                    tc.b(15 + var7 * 64, 1 + var4 + var8, 32, 14680064);
                    var8++;
                    if (var9 != 0) {
                        statePc = 85;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (var9 == 0) {
                        statePc = 80;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    tc.b(64 * var7 + -16, 7 + var4, 32, 8421504);
                    tc.b(16 + 64 * var7, 7 + var4, 32, 8388608);
                    var7++;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    if (var9 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    tc.b(0, var4 + 8, 640, 0);
                    tc.b(0, 90 + var4, 640, 0);
                    stackIn_87_0 = 0;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    var7 = stackIn_87_0;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    if ((var7 ^ -1) <= -12) {
                        statePc = 97;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    tc.b(var7 * 64, 91 + var4, 32, 16777215);
                    tc.b(var7 * 64 - -32, var4 + 91, 32, 16711680);
                    stackIn_98_0 = 0;
                    stackIn_90_0 = stackIn_98_0;
                    if (var9 != 0) {
                        statePc = 98;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var8 = stackIn_90_0;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if (-7 >= (var8 ^ -1)) {
                        statePc = 95;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    tc.b(var7 * 64 - 1, 92 + (var4 - -var8), 32, 14737632);
                    tc.b(31 + var7 * 64, 92 + var4 - -var8, 32, 14680064);
                    var8++;
                    if (var9 != 0) {
                        statePc = 96;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (var9 == 0) {
                        statePc = 91;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    tc.b(var7 * 64, 98 + var4, 32, 8421504);
                    tc.b(var7 * 64 - -32, 98 + var4, 32, 8388608);
                    var7++;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    if (var9 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    stackIn_98_0 = 0;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    tc.b(stackIn_98_0, var4 + 99, 640, 0);
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    uk.field_a.d(207, -15 + var4, 128);
                    im.field_b.a(202, -20 + var4);
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    oi.a(param0 ^ -56, this.field_o);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_29_0 = 0;
        int stackIn_37_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = HoldTheLine.field_D;
                    cg.a(-param2 + 40, 102, 560, (byte) 41, 312);
                    if (param1 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.a(-4);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var4 = 132;
                    q.a(od.field_i[param0], HoldTheLine.field_F, 2, -param2 + 320, (byte) -127, var4);
                    var4 += 40;
                    var5 = sf.field_m % 180 / 5;
                    var6 = param0;
                    if (-1 == (var6 ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (-2 != (var6 ^ -1)) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var8 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var6 == 2) {
                        statePc = 19;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if ((var6 ^ -1) == -4) {
                        statePc = 26;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if ((var6 ^ -1) != -5) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var8 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (-6 != (var6 ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var8 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if ((var6 ^ -1) == -7) {
                        statePc = 42;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 16: {
                    wb.a(20, sk.field_f, 0, 0, 560, var4 + -20, 40 - param2, 414 - var4, -1, 1, HoldTheLine.field_F);
                    var4 += 120;
                    q.a(am.field_c, HoldTheLine.field_F, 2, -param2 + 320, (byte) -127, var4);
                    var4 += 30;
                    am.a(310 + -param2, qm.field_a, true, HoldTheLine.field_F, var4, 1);
                    var4 += 20;
                    am.a(-param2 + 310, ra.field_fb, true, HoldTheLine.field_F, var4, 1);
                    var4 += 20;
                    am.a(310 - param2, fk.field_a, true, HoldTheLine.field_F, var4, 1);
                    var4 += 20;
                    am.a(310 - param2, en.field_c, true, HoldTheLine.field_F, var4, 1);
                    var4 += 20;
                    am.a(-param2 + 310, vm.field_xb, true, HoldTheLine.field_F, var4, 1);
                    var4 -= 80;
                    ei.a(-param2 + 320, 1, b.field_a, 0, var4, HoldTheLine.field_F);
                    var4 += 20;
                    ei.a(-param2 + 320, param1 ^ 1, pa.field_i, 0, var4, HoldTheLine.field_F);
                    var4 += 20;
                    ei.a(320 + -param2, 1, gi.field_H, 0, var4, HoldTheLine.field_F);
                    var4 += 20;
                    ei.a(320 + -param2, 1, cf.field_t, 0, var4, HoldTheLine.field_F);
                    var4 += 20;
                    ei.a(320 + -param2, param1 + 1, kc.field_c, 0, var4, HoldTheLine.field_F);
                    var4 += 20;
                    if (var8 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    wb.a(20, vg.field_L, 0, 0, 560, -20 + var4, 40 - param2, -var4 + 414, -1, 1, HoldTheLine.field_F);
                    if (var8 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    wb.a(20, sf.field_k, 0, 0, 560, -20 + var4, 40 - param2, 414 - var4, -1, 1, HoldTheLine.field_F);
                    var4 += 185;
                    var6 = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (-4 >= (var6 ^ -1)) {
                        statePc = 24;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    oi.field_a.b(-(20 * var6) + 168 - param2, -20 + var4 + 5);
                    oi.field_a.b(-(var6 * 20) + 408 + -param2, -20 + (var4 - -5));
                    oi.field_a.b(-param2 + (168 - var6 * 20), 10 + (var4 - -5));
                    oi.field_a.b(408 - (param2 + 20 * var6), var4 + 10 + 5);
                    ha.field_k.a(16, var5, 9, 16).a(-(var6 * 20) + (-param2 + 170), -20 + (var4 - -7));
                    pk.field_O.a(16, var5, param1 ^ 9, 16).a(-param2 + 410 + -(var6 * 20), 7 + var4 - 20);
                    na.field_q.a(16, var5, 9, 16).a(-(var6 * 20) + -param2 + 170, 10 + (var4 + 7));
                    cf.field_u.a(16, var5, param1 + 9, 16).a(-param2 + 410 - var6 * 20, 10 + (var4 - -7));
                    var6++;
                    if (var8 != 0) {
                        statePc = 25;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (var8 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    ei.a(200 - param2, param1 + 1, wn.field_k, 0, var4, HoldTheLine.field_F);
                    ei.a(-param2 + 440, 1, gn.field_h, 0, var4, HoldTheLine.field_F);
                    var4 += 30;
                    ei.a(200 - param2, 1, bf.field_a, 0, var4, HoldTheLine.field_F);
                    ei.a(440 - param2, 1, HoldTheLine.field_B, 0, var4, HoldTheLine.field_F);
                    var4 += 30;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (var8 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    wb.a(20, ik.field_k, 0, 0, 560, var4 - 20, -param2 + 40, -var4 + 414, -1, 1, HoldTheLine.field_F);
                    var4 += 25;
                    var6 = 1;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (4 <= var6) {
                        statePc = 36;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_37_0 = 0;
                    stackIn_29_0 = stackIn_37_0;
                    if (var8 != 0) {
                        statePc = 37;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var7 = stackIn_29_0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if ((var6 ^ -1) >= (var7 ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    oi.field_a.b(-param2 + 93 + -(var7 * 20), var4 + (-20 - (-5 + -(20 * var6))));
                    oi.field_a.b(-param2 + (383 + -(var7 * 20)), -20 + var4 - (-5 - 20 * var6));
                    oi.field_a.b(288 + -param2 - var7 * 20, 20 * var6 + (60 + var4 + 5));
                    ha.field_k.a(16, var5, 9, 16).a(-(20 * var7) + (95 - param2), 20 * var6 + (var4 - 20 - -7));
                    pk.field_O.a(16, var5, 9, 16).a(-param2 + (385 + -(20 * var7)), 7 + (-20 + var4) + 20 * var6);
                    na.field_q.a(16, var5, param1 ^ 9, 16).a(290 - param2 - 20 * var7, var6 * 20 + var4 - -60 + 7);
                    var7++;
                    if (var8 != 0) {
                        statePc = 35;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (var8 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var6++;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var8 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var4 += 20;
                    ei.a(125 - param2, 1, bj.field_J, 0, var4, HoldTheLine.field_F);
                    ei.a(-param2 + 415, 1, uk.field_f, 0, var4, HoldTheLine.field_F);
                    var4 += 20;
                    ei.a(-param2 + 125, 1, vg.field_K, 0, var4, HoldTheLine.field_F);
                    ei.a(-param2 + 415, param1 + 1, ga.field_h, 0, var4, HoldTheLine.field_F);
                    var4 += 20;
                    ei.a(-param2 + 125, 1, oa.field_o, 0, var4, HoldTheLine.field_F);
                    ei.a(-param2 + 415, 1, sg.field_K, 0, var4, HoldTheLine.field_F);
                    var4 += 40;
                    ei.a(320 - param2, 1, wl.field_e, 0, var4, HoldTheLine.field_F);
                    var4 += 20;
                    ei.a(-param2 + 320, 1, kb.field_d, 0, var4, HoldTheLine.field_F);
                    var4 += 20;
                    ei.a(320 + -param2, 1, gj.field_v, 0, var4, HoldTheLine.field_F);
                    var4 += 40;
                    stackIn_37_0 = 20;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    wb.a(stackIn_37_0, mk.field_o, 0, 0, 560, -20 + var4, 40 - param2, -var4 + 414, param1 + -1, 1, HoldTheLine.field_F);
                    if (var8 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    wb.a(20, aa.field_p, 0, 0, 560, -20 + var4, -param2 + 40, 414 + -var4, -1, 1, HoldTheLine.field_F);
                    var4 += 40;
                    wb.a(20, hl.field_e, 0, 0, 560, -20 + var4, -param2 + 40, 414 - var4, -1, 1, HoldTheLine.field_F);
                    var4 += 80;
                    wb.a(20, wb.field_b, 0, 0, 560, var4 + -20, 40 + -param2, -var4 + 414, -1, 1, HoldTheLine.field_F);
                    var4 += 60;
                    wb.a(20, ub.field_D, 0, 0, 560, -20 + var4, 40 - param2, 414 - var4, -1, 1, HoldTheLine.field_F);
                    var4 += 60;
                    if (var8 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    wb.a(20, ji.field_n, 0, 0, 560, var4 - 20, -param2 + 40, -var4 + 414, param1 ^ -1, 1, HoldTheLine.field_F);
                    var4 += 80;
                    q.a(hc.field_a, HoldTheLine.field_F, 2, 160 - param2, (byte) -127, var4);
                    q.a(o.field_a, HoldTheLine.field_F, 2, 480 + -param2, (byte) -128, var4);
                    var4 += 20;
                    q.a(gm.field_a, HoldTheLine.field_F, 2, -param2 + 160, (byte) -128, var4);
                    q.a(im.field_f, HoldTheLine.field_F, 2, 480 - param2, (byte) -128, var4);
                    q.a(m.field_b, HoldTheLine.field_F, 1, -param2 + 320, (byte) -127, var4);
                    var4 += 40;
                    am.a(-param2 + 200, qm.field_a, true, HoldTheLine.field_F, var4, 1);
                    var4 += 20;
                    am.a(-param2 + 200, ra.field_fb, true, HoldTheLine.field_F, var4, 1);
                    var4 += 20;
                    am.a(-param2 + 200, fk.field_a, true, HoldTheLine.field_F, var4, 1);
                    var4 += 20;
                    am.a(-param2 + 200, en.field_c, true, HoldTheLine.field_F, var4, 1);
                    var4 += 20;
                    am.a(200 + -param2, cc.field_A, true, HoldTheLine.field_F, var4, 1);
                    var4 -= 80;
                    ei.a(440 - param2, 1, dj.field_H, 1, var4, HoldTheLine.field_F);
                    var4 += 20;
                    ei.a(-param2 + 440, param1 ^ 1, p.field_f, 1, var4, HoldTheLine.field_F);
                    var4 += 20;
                    ei.a(-param2 + 440, 1, vd.field_e, 1, var4, HoldTheLine.field_F);
                    var4 += 20;
                    ei.a(-param2 + 440, 1, ka.field_a, 1, var4, HoldTheLine.field_F);
                    var4 += 20;
                    ei.a(-param2 + 440, param1 ^ 1, jh.field_b, 1, var4, HoldTheLine.field_F);
                    var4 -= 80;
                    q.a(b.field_a, HoldTheLine.field_F, 0, -param2 + 320, (byte) -128, var4);
                    var4 += 20;
                    q.a(pa.field_i, HoldTheLine.field_F, 0, 320 + -param2, (byte) -127, var4);
                    var4 += 20;
                    q.a(gi.field_H, HoldTheLine.field_F, 0, 320 - param2, (byte) -127, var4);
                    var4 += 20;
                    q.a(cf.field_t, HoldTheLine.field_F, 0, 320 - param2, (byte) -127, var4);
                    var4 += 20;
                    q.a(kc.field_c, HoldTheLine.field_F, 0, 320 - param2, (byte) -127, var4);
                    var4 += 20;
                    if (var8 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    wb.a(20, io.field_f, 0, 0, 560, -20 + var4, 40 - param2, -var4 + 414, param1 + -1, 1, HoldTheLine.field_F);
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0, int param1) {
        int var3;
        int var4;
        L0: {
          L1: {
            L2: {
              var4 = HoldTheLine.field_D;
              var3 = em.field_i[this.field_o][param0];
              if (18 == var3) {
                L3: {
                  if (-103 != (aa.field_n ^ -1)) {
                    break L3;
                  } else {
                    ol.field_d = 0;
                    if (var4 == 0) {
                      break L0;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if ((aa.field_n ^ -1) != -104) {
                    break L4;
                  } else {
                    if (256 <= ol.field_d) {
                      break L0;
                    } else {
                      ol.field_d = 256;
                      qf.a(293, cf.field_r);
                      if (var4 == 0) {
                        break L0;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                super.b(param0, -24489);
                if (var4 == 0) {
                  break L0;
                } else {
                  break L2;
                }
              } else {
                if ((var3 ^ -1) == -20) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            L5: {
              if (-103 != (aa.field_n ^ -1)) {
                break L5;
              } else {
                ll.a(-118, 0);
                if (var4 == 0) {
                  break L0;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if ((aa.field_n ^ -1) != -104) {
                break L6;
              } else {
                ll.a(param1 + 24365, 160);
                if (var4 == 0) {
                  break L0;
                } else {
                  break L6;
                }
              }
            }
            super.b(param0, -24489);
            if (var4 == 0) {
              break L0;
            } else {
              break L1;
            }
          }
          super.b(param0, -24489);
          break L0;
        }
        L7: {
          if (param1 == -24489) {
            break L7;
          } else {
            this.field_r = 66;
            break L7;
          }
        }
    }

    final boolean b(boolean param0) {
        if (param0) {
            field_z = -119;
        }
        return (this.field_y ^ -1) == -5 ? true : false;
    }

    private final void e(byte param0) {
        this.field_y = 1;
        if (param0 >= -95) {
            return;
        }
        this.field_s = 50 + 5 * this.field_a;
    }

    private final void l(int param0) {
        int var2 = 0;
        if (this.field_y > 2) {
            return;
        }
        cg.a(-var2 + 40, 140, 560, (byte) 41, 200);
        int var3 = 170;
        nm.field_c.b(nc.field_b, 320 - var2, var3, 2, -1);
        var3 += 40;
        wb.a(20, ko.field_a, 0, 0, 560, -20 + var3, 40 + -var2, -var3 + 414, -1, 1, HoldTheLine.field_F);
        if (param0 != 29280) {
            this.field_t = 0.7895873785018921f;
        }
    }

    private final void j(int param0) {
        int var2 = -this.field_s + 50;
        if (!(-3 != (this.field_y ^ -1))) {
            var2 = -(this.field_a * 5) + this.field_r + 25;
        }
        if ((var2 ^ -1) > -1) {
            var2 = 0;
        }
        int var3 = (int)((double)we.field_n * (-Math.exp((double)(0.20000000298023224f * (float)var2)) + 1.0));
        if (param0 != -5302) {
            return;
        }
        if (this.field_y > 2) {
            var3 = 640;
        }
        tn.field_a = this.a(rf.field_X, (byte) -128, nc.field_g, var3);
        if (tn.field_a != -1) {
            ci.a(0, (byte) 118, this.field_o, tn.field_a);
        }
        ci.field_j = this.a(rf.field_X, param0 + 5465, nc.field_g, var3);
        if (!(gg.field_J != 1)) {
            qf.a(293, cf.field_r);
            if (0 != (tn.field_a ^ -1)) {
                if (!((tn.field_a ^ -1) == (ha.field_p ^ -1))) {
                    if (pj.field_m != en.field_b || ha.field_p != wa.field_j) {
                        this.field_t = this.field_t - 640.0f;
                        wa.field_j = ha.field_p;
                        en.field_b = pj.field_m;
                    }
                    this.field_p = 640;
                    ha.field_p = tn.field_a;
                }
            }
        }
    }

    final void i(int param0) {
        this.field_y = 2;
        int var2 = 44 / ((param0 - -25) / 61);
        sf.field_m = 0;
    }

    private final void m(int param0) {
        int discarded$0 = 0;
        int var3;
        L0: {
          L1: {
            var3 = HoldTheLine.field_D;
            if (0.0f >= this.field_t) {
              break L1;
            } else {
              L2: {
                if (-85 == (aa.field_n ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    if (aa.field_n != 98) {
                      break L3;
                    } else {
                      this.field_c = 0;
                      if (var3 == 0) {
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (99 != aa.field_n) {
                      break L4;
                    } else {
                      this.field_c = 1;
                      if (var3 == 0) {
                        break L0;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (96 != aa.field_n) {
                        break L6;
                      } else {
                        if (this.field_c == 1) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      L8: {
                        if (-98 != (aa.field_n ^ -1)) {
                          break L8;
                        } else {
                          if (-2 == (this.field_c ^ -1)) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (-1 == (this.field_c ^ -1)) {
                        this.a(true);
                        if (var3 == 0) {
                          break L0;
                        } else {
                          break L7;
                        }
                      } else {
                        break L0;
                      }
                    }
                    t.field_l = go.field_g[kn.b((byte) -49).field_p][1];
                    if (var3 == 0) {
                      break L0;
                    } else {
                      break L5;
                    }
                  }
                  t.field_l = go.field_g[kn.b((byte) -49).field_p][0];
                  if (var3 == 0) {
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              L9: {
                if (this.field_c == 0) {
                  break L9;
                } else {
                  if (bl.field_r != null) {
                    L10: {
                      if (t.field_l == -1) {
                        break L10;
                      } else {
                        bl.field_r.field_C[0].a(20385, ge.field_c[t.field_l]);
                        break L10;
                      }
                    }
                    wm.a(false, false, -1);
                    qf.a(293, cf.field_r);
                    if (var3 == 0) {
                      break L0;
                    } else {
                      break L9;
                    }
                  } else {
                    break L0;
                  }
                }
              }
              this.c(this.field_c, param0 ^ 3564);
              if (var3 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L11: {
            L12: {
              if (-85 != (aa.field_n ^ -1)) {
                break L12;
              } else {
                if (-2 == (this.field_c ^ -1)) {
                  break L11;
                } else {
                  break L12;
                }
              }
            }
            L13: {
              L14: {
                if (aa.field_n != 98) {
                  break L14;
                } else {
                  if (this.field_o == 10) {
                    break L13;
                  } else {
                    break L14;
                  }
                }
              }
              L15: {
                if ((aa.field_n ^ -1) == -100) {
                  break L15;
                } else {
                  if (-1 == (this.field_c ^ -1)) {
                    this.a(true);
                    if (var3 == 0) {
                      break L0;
                    } else {
                      break L15;
                    }
                  } else {
                    break L0;
                  }
                }
              }
              this.field_c = 1;
              if (var3 == 0) {
                break L0;
              } else {
                break L13;
              }
            }
            this.field_c = 0;
            if (var3 == 0) {
              break L0;
            } else {
              break L11;
            }
          }
          this.a((byte) 117, 6, false);
          break L0;
        }
        L16: {
          if (param0 == -1) {
            break L16;
          } else {
            discarded$0 = this.a(65, -46, 28, -26);
            break L16;
          }
        }
    }

    private final void b(int param0, byte param1, int param2, int param3) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_39_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int stackIn_47_3 = 0;
        int stackIn_47_4 = 0;
        int statePc = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = HoldTheLine.field_D;
                    var5 = -7 + param3 - -param2;
                    if (param1 < -45) {
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
                    var6 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    stackIn_4_0 = -9;
                    stackIn_4_1 = var6 ^ -1;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (stackIn_4_0 >= stackIn_4_1) {
                        statePc = 38;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var7 = param2 - -(256 * var6 / 16);
                    var8 = var7 + 8;
                    var9 = var6 * 30 / 16;
                    var10 = 22 + param0;
                    var11 = var10 - var9;
                    tc.b(var7 - -(var9 / 2), -1 + var11, 10, 0);
                    stackIn_39_0 = 1;
                    stackIn_6_0 = stackIn_39_0;
                    if (var13 != 0) {
                        statePc = 39;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var12 = stackIn_6_0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (var12 > var9) {
                        statePc = 20;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    tc.b(var7 + (var12 / 2 + -1), -var12 + var10, 1, 0);
                    stackIn_47_0 = var12 / 2 + var7;
                    stackIn_9_0 = stackIn_47_0;
                    stackIn_47_1 = var10 - var12;
                    stackIn_9_1 = stackIn_47_1;
                    stackIn_47_2 = 2;
                    stackIn_9_2 = stackIn_47_2;
                    stackIn_47_3 = var7;
                    stackIn_9_3 = stackIn_47_3;
                    stackIn_47_4 = var5;
                    stackIn_9_4 = stackIn_47_4;
                    if (var13 != 0) {
                        statePc = 47;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_11_0 = stackIn_9_0;
                    stackIn_10_0 = stackIn_11_0;
                    stackIn_11_1 = stackIn_9_1;
                    stackIn_10_1 = stackIn_11_1;
                    stackIn_11_2 = stackIn_9_2;
                    stackIn_10_2 = stackIn_11_2;
                    if (stackIn_9_3 > stackIn_9_4) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = stackIn_10_0;
                    stackIn_12_1 = stackIn_10_1;
                    stackIn_12_2 = stackIn_10_2;
                    stackIn_12_3 = 8421504;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = stackIn_11_0;
                    stackIn_12_1 = stackIn_11_1;
                    stackIn_12_2 = stackIn_11_2;
                    stackIn_12_3 = 4210752;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    tc.b(stackIn_12_0, stackIn_12_1, stackIn_12_2, stackIn_12_3);
                    stackIn_16_0 = 2 + (var7 + var12 / 2);
                    stackIn_13_0 = stackIn_16_0;
                    stackIn_16_1 = var10 - var12;
                    stackIn_13_1 = stackIn_16_1;
                    stackIn_16_2 = 6;
                    stackIn_13_2 = stackIn_16_2;
                    if ((var9 ^ -1) == (var12 ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = stackIn_13_0;
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = stackIn_13_1;
                    stackIn_14_1 = stackIn_15_1;
                    stackIn_15_2 = stackIn_13_2;
                    stackIn_14_2 = stackIn_15_2;
                    if ((var5 ^ -1) <= (var7 ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_19_0 = stackIn_14_0;
                    stackIn_19_1 = stackIn_14_1;
                    stackIn_19_2 = stackIn_14_2;
                    stackIn_19_3 = 8421504;
                    statePc = 19;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_19_0 = stackIn_15_0;
                    stackIn_19_1 = stackIn_15_1;
                    stackIn_19_2 = stackIn_15_2;
                    stackIn_19_3 = 16777215;
                    statePc = 19;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = stackIn_16_0;
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = stackIn_16_1;
                    stackIn_17_1 = stackIn_18_1;
                    stackIn_18_2 = stackIn_16_2;
                    stackIn_17_2 = stackIn_18_2;
                    if ((var5 ^ -1) > (var7 ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = stackIn_17_0;
                    stackIn_19_1 = stackIn_17_1;
                    stackIn_19_2 = stackIn_17_2;
                    stackIn_19_3 = 8421504;
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = stackIn_18_0;
                    stackIn_19_1 = stackIn_18_1;
                    stackIn_19_2 = stackIn_18_2;
                    stackIn_19_3 = 4210752;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    tc.b(stackIn_19_0, stackIn_19_1, stackIn_19_2, stackIn_19_3);
                    tc.b(8 + (var12 / 2 + var7), -var12 + var10, 1, 0);
                    var12++;
                    if (var13 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    tc.b(-1 + var7, var10, 10, 0);
                    if ((var7 ^ -1) < (var5 ^ -1)) {
                        statePc = 37;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if ((var5 ^ -1) > (var8 ^ -1)) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (var13 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var12 = 1;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (var12 > var9) {
                        statePc = 37;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_4_0 = var5;
                    stackIn_27_0 = stackIn_4_0;
                    stackIn_4_1 = 2 + var7;
                    stackIn_27_1 = stackIn_4_1;
                    if (var13 != 0) {
                        statePc = 4;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (stackIn_27_0 >= stackIn_27_1) {
                        statePc = 32;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    tc.b(var5 - -(var12 / 2), var10 - var12, var7 + (2 - var5), 4210752);
                    stackIn_30_0 = var12 / 2 + (var7 + 2);
                    stackIn_29_0 = stackIn_30_0;
                    stackIn_30_1 = var10 + -var12;
                    stackIn_29_1 = stackIn_30_1;
                    stackIn_30_2 = 6;
                    stackIn_29_2 = stackIn_30_2;
                    if ((var9 ^ -1) != (var12 ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_31_0 = stackIn_29_0;
                    stackIn_31_1 = stackIn_29_1;
                    stackIn_31_2 = stackIn_29_2;
                    stackIn_31_3 = 4210752;
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = stackIn_30_0;
                    stackIn_31_1 = stackIn_30_1;
                    stackIn_31_2 = stackIn_30_2;
                    stackIn_31_3 = 8421504;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    tc.b(stackIn_31_0, stackIn_31_1, stackIn_31_2, stackIn_31_3);
                    if (var13 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackIn_34_0 = var5 + var12 / 2;
                    stackIn_33_0 = stackIn_34_0;
                    stackIn_34_1 = -var12 + var10;
                    stackIn_33_1 = stackIn_34_1;
                    stackIn_34_2 = var7 - (-8 - -var5);
                    stackIn_33_2 = stackIn_34_2;
                    if (var12 == var9) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_35_0 = stackIn_33_0;
                    stackIn_35_1 = stackIn_33_1;
                    stackIn_35_2 = stackIn_33_2;
                    stackIn_35_3 = 8421504;
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = stackIn_34_0;
                    stackIn_35_1 = stackIn_34_1;
                    stackIn_35_2 = stackIn_34_2;
                    stackIn_35_3 = 4210752;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    tc.b(stackIn_35_0, stackIn_35_1, stackIn_35_2, stackIn_35_3);
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    var12++;
                    if (var13 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var6++;
                    if (var13 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    stackIn_39_0 = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    var6 = stackIn_39_0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if ((var6 ^ -1) <= -5) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    tc.b(-var6 + (param3 + param2) + -7, param0 + (var6 - -22), 1 + var6 * 2, 16711680);
                    var6++;
                    if (var13 != 0) {
                        statePc = 44;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (var13 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    return;
                }
                case 45: {
                    if (var13 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 47: {
                    tc.b(stackIn_47_0, stackIn_47_1, stackIn_47_2 + stackIn_47_3 * stackIn_47_4, 16711680);
                    var6++;
                    if (var13 != 0) {
                        statePc = 44;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 49: {
                    stackIn_47_0 = -var6 + (param3 + param2) + -7;
                    stackIn_47_1 = param0 + (var6 - -22);
                    stackIn_47_2 = 1;
                    stackIn_47_3 = var6;
                    stackIn_47_4 = 2;
                    statePc = 47;
                    continue stateLoop;
                }
                case 50: {
                    if ((var6 ^ -1) <= -5) {
                        statePc = 44;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void c(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        hj var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = HoldTheLine.field_D;
                    cg.a(60, 101, 520, (byte) 41, 320);
                    qe.field_a = 0;
                    var2 = 160;
                    var3 = 125;
                    var4 = 0;
                    if (param0 == -18) {
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
                    var5 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var5 >= 16) {
                        statePc = 9;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var6_int = e.field_d[var5];
                    stackIn_10_0 = 0;
                    stackIn_5_0 = stackIn_10_0;
                    stackIn_10_1 = 1 << var6_int & ii.field_c;
                    stackIn_5_1 = stackIn_10_1;
                    if (var12 != 0) {
                        statePc = 10;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (stackIn_5_0 == stackIn_5_1) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.a(true, var6_int, vl.field_h[var6_int], var3, 12, var2);
                    var2 += 40;
                    var4++;
                    if (9 != var4) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var3 += 40;
                    var2 = 180;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var5++;
                    if (var12 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_10_0 = -1;
                    stackIn_10_1 = ok.field_e;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (stackIn_10_0 != stackIn_10_1) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_13_0 = v.field_E;
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = ok.field_e;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var5 = stackIn_13_0;
                    if (-1 != var5) {
                        statePc = 15;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 15: {
                    this.a(false, var5, 128, 291, param0 + 30, 320);
                    am.a(200, pf.field_b, true, HoldTheLine.field_F, 252, 0);
                    ei.a(440, 1, vj.field_o, 0, 252, HoldTheLine.field_F);
                    q.a(Integer.toString(le.field_o[var5][0]), HoldTheLine.field_F, 0, 140, (byte) -128, 282);
                    var6 = pf.a((byte) -123);
                    var7 = le.field_o[var5][1];
                    var8 = sf.field_m / 15 % (var7 + 2);
                    var9 = sf.field_m / 5 % 3;
                    var10 = 0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if ((var10 ^ -1) <= (var7 ^ -1)) {
                        statePc = 24;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var11 = 0;
                    stackIn_25_0 = var8;
                    stackIn_18_0 = stackIn_25_0;
                    if (var12 != 0) {
                        statePc = 25;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (stackIn_18_0 == var10) {
                        statePc = 22;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if ((var10 ^ -1) == (var8 + -1 ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var11 = -var9 + 3;
                    if (var12 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var11 = var9;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var6.d(-var11 + 460 + 16 * var10, -var11 + 262, 32 + 2 * var11, 32 - -(var11 * 2));
                    var10++;
                    if (var12 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    nm.field_c.b(ae.field_c[var5], 320, 217, 0, -1);
                    stackIn_25_0 = 20;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    wb.a(stackIn_25_0, lf.field_j[var5], 0, 0, 400, 362, 120, 80, param0 + 17, 1, HoldTheLine.field_F);
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    fl.a(p.field_b, 0, 0, -1753, 448);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void k(int param0) {
        if (param0 >= -77) {
            ti.a(56, 62, (byte) 72);
        }
        ce.field_n.field_c = 0;
        ce.field_n.field_f = 0;
    }

    private final void i(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = HoldTheLine.field_D;
                    if (this.field_y <= 2) {
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
                    if (param1 == -11468) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    if ((this.field_y ^ -1) == -2) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.a(ih.field_p, 0, param0);
                    if (var4 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var3 = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if ((var3 ^ -1) <= -8) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.a(var3, 0, (int)this.field_t + param0 - 640 * var3);
                    var3++;
                    if (var4 != 0) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var4 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void f(int param0, int param1) {
        boolean stackIn_7_0 = false;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        boolean stackOut_6_0;
        int statePc = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        hj var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = HoldTheLine.field_D;
                    if (-3 <= (this.field_y ^ -1)) {
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
                    if (param0 > 4) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.f((byte) -103);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    cg.a(60 - param1, 101, 520, (byte) 41, 320);
                    qe.field_a = 0;
                    var3 = 156;
                    var4 = 125;
                    var5 = 0;
                    var6 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (16 <= var6) {
                        statePc = 14;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    stackOut_6_0 = this.h(var6, 176);
                    stackIn_15_0 = stackOut_6_0 ? 1 : 0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var13 != 0) {
                        statePc = 15;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (stackIn_7_0) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var13 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var7_int = e.field_d[var6];
                    this.a(true, var7_int, vl.field_h[var7_int], var4, 12, -param1 + var3);
                    var3 += 46;
                    var5++;
                    if ((var5 ^ -1) != -9) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var4 += 40;
                    var3 = 179;
                    if (!this.h(15, 176)) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var3 -= 23;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var6++;
                    if (var13 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (stackIn_15_0 != (ok.field_e ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = v.field_E;
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = ok.field_e;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    var6 = stackIn_18_0;
                    if (var6 == -1) {
                        statePc = 36;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.a(false, var6, 128, 276, 12, -param1 + 320);
                    am.a(200 - param1, pf.field_b, true, HoldTheLine.field_F, 252, 0);
                    ei.a(-param1 + 440, 1, vj.field_o, 0, 252, HoldTheLine.field_F);
                    q.a(Integer.toString(le.field_o[var6][0]), HoldTheLine.field_F, 0, -param1 + 160, (byte) -127, 282);
                    var7 = pf.a((byte) -123);
                    var8 = le.field_o[var6][1];
                    var9 = sf.field_m / 15 % (2 + var8);
                    var10 = sf.field_m / 5 % 3;
                    var11 = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (var11 >= var8) {
                        statePc = 28;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var12 = 0;
                    stackIn_29_0 = var11;
                    stackIn_22_0 = stackIn_29_0;
                    stackIn_29_1 = var9;
                    stackIn_22_1 = stackIn_29_1;
                    if (var13 != 0) {
                        statePc = 29;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (stackIn_22_0 == stackIn_22_1) {
                        statePc = 26;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if ((var11 ^ -1) == (var9 + -1 ^ -1)) {
                        statePc = 25;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var12 = 3 + -var10;
                    if (var13 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var12 = var10;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    var7.d(-var12 + (460 + (-param1 + 16 * var11)), 262 + -var12, 32 - -(2 * var12), 32 + 2 * var12);
                    var11++;
                    if (var13 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = 0;
                    stackIn_29_1 = field_z & 1 << var6;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (stackIn_29_0 == stackIn_29_1) {
                        statePc = 32;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    q.a(ln.field_j, HoldTheLine.field_F, 1, 320 + -param1, (byte) -127, 357);
                    if (var13 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (sf.field_m % 80 < 40) {
                        statePc = 34;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 34: {
                    q.a(fc.field_b, HoldTheLine.field_F, 2, 320 - param1, (byte) -127, 352);
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    nm.field_c.b(ae.field_c[var6], 320 - param1, 207, 0, -1);
                    wb.a(20, lf.field_j[var6], 0, 0, 400, 357, 120 - param1, 80, -1, 1, HoldTheLine.field_F);
                    if (var13 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (pj.b((byte) 104)) {
                        statePc = 38;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 38: {
                    q.a(nk.field_M, HoldTheLine.field_F, 0, 320 + -param1, (byte) -127, 270);
                    q.a(ue.field_b, HoldTheLine.field_F, 0, 320 - param1, (byte) -128, 290);
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    fl.a(p.field_b, param1, 0, -1753, 448);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0, boolean param1) {
        int discarded$1 = 0;
        int var3;
        int var4;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        L0: {
          var4 = HoldTheLine.field_D;
          if (param0 == 0) {
            break L0;
          } else {
            discarded$1 = this.b(123, -77, -90);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!hn.field_T) {
              break L2;
            } else {
              L3: {
                stackIn_5_0 = -86;

                if (param1) {
                  stackIn_6_0 = stackIn_5_0;
                  stackIn_6_1 = 0;
                  break L3;
                } else {
                  stackIn_6_0 = stackIn_5_0;
                  stackIn_6_1 = 1;
                  break L3;
                }
              }
              L4: {
                L5: {
                  var3 = pd.a((byte) stackIn_6_0, stackIn_6_1 != 0);
                  if (3 == var3) {
                    break L5;
                  } else {
                    L6: {
                      if (-2 == (var3 ^ -1)) {
                        break L6;
                      } else {
                        if (-3 != (var3 ^ -1)) {
                          break L4;
                        } else {
                          this.a((byte) 117, 0, true);
                          if (var4 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    this.a((byte) 117, 0, false);
                    if (var4 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                ch.a(en.a(99), (byte) 65);
                break L4;
              }
              if (var4 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L7: {
            kc.field_a.a(180);
            rm.field_A.a(param0 + 8192);
            jf.field_a.a(8192);
            bo.field_d.a(8192);
            if (!kc.field_a.a((byte) 127)) {
              break L7;
            } else {
              if (!rm.field_A.b((byte) 10)) {
                break L7;
              } else {
                if (!jf.field_a.b((byte) 10)) {
                  break L7;
                } else {
                  if (bo.field_d.b((byte) 10)) {
                    gd.a(di.field_w, rm.field_A.field_b, 0);
                    wj.a(0, 19189, 80, 20, 50, 0, -1500, jf.field_a.field_b, 80);
                    te.a(param0 + -4, kc.field_a.field_i);
                    nm.a(bo.field_d.field_b, 22210);
                    oh.a(true, true);
                    hn.field_T = true;
                    break L7;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          break L1;
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        hj stackIn_18_0 = null;
        int var7;
        int var8;
        int var9;
        hj var10;
        int var11;
        L0: {
          var11 = HoldTheLine.field_D;
          if (0 == (1 << param1 & field_z)) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if ((1 << param1 & 65284) == 0) {
            stackIn_6_0 = 0;
            break L1;
          } else {
            stackIn_6_0 = 1;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          if (-33 != (param2 ^ -1)) {
            stackIn_9_0 = 0;
            break L2;
          } else {
            stackIn_9_0 = 1;
            break L2;
          }
        }
        L3: {
          L4: {
            var9 = stackIn_9_0;
            if (var7 == 0) {
              break L4;
            } else {
              var10 = ak.a(param4 + -48, var9 != 0, param1);
              if (var11 == 0) {
                break L3;
              } else {
                break L4;
              }
            }
          }
          L5: {
            L6: {
              if (var8 != 0) {
                break L6;
              } else {
                if (!of.a(param4 + -981)) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            var10 = ak.a(param4 ^ -108, var9 != 0, -1);
            if (var11 == 0) {
              break L3;
            } else {
              break L5;
            }
          }
          L7: {
            if (var9 == 0) {
              stackIn_18_0 = kj.field_q;
              break L7;
            } else {
              stackIn_18_0 = ka.field_f;
              break L7;
            }
          }
          var10 = stackIn_18_0;
          break L3;
        }
        L8: {
          L9: {
            if (var9 != 0) {
              break L9;
            } else {
              L10: {
                if ((param2 ^ -1) == -129) {
                  break L10;
                } else {
                  var10.d(-(param2 >> 1864025985) + param5, -(param2 >> -156740287) + param3, param2, param2);
                  if (var11 == 0) {
                    break L8;
                  } else {
                    break L10;
                  }
                }
              }
              var10.a(-64 + param5, param3 + -64);
              if (var11 == 0) {
                break L8;
              } else {
                break L9;
              }
            }
          }
          var10.a(-16 + param5, -16 + param3);
          break L8;
        }
        L11: {
          if (param4 != param1) {
            break L11;
          } else {
            if (var7 == 0) {
              break L11;
            } else {
              pe.a(param2, 4209, param5, param3);
              break L11;
            }
          }
        }
        L12: {
          if (!param0) {
            break L12;
          } else {
            dm.field_e[qe.field_a] = param5;
            co.field_d[qe.field_a] = param3;
            kn.field_b[qe.field_a] = param2;
            nk.field_J[qe.field_a] = param1;
            qe.field_a = qe.field_a + 1;
            break L12;
          }
        }
    }

    private final void a(byte param0, int param1, boolean param2) {
        if (param0 != 117) {
            return;
        }
        qf.a(293, cf.field_r);
        this.a(param1, param2, param0 ^ -95);
    }

    final void f(int param0) {
        this.field_y = 2;
        ie.field_n = -ie.field_n + 80;
        this.field_r = -this.field_s + (this.field_a * 5 + 25);
        if (param0 != 0) {
            this.field_w = 0;
        }
    }

    private final void f(byte param0) {
        L0: {
          v.field_E = this.b(-21, nc.field_g, rf.field_X);
          if (-2 == (gg.field_J ^ -1)) {
            L1: {
              qf.a(293, cf.field_r);
              if ((ok.field_e ^ -1) == (v.field_E ^ -1)) {
                break L1;
              } else {
                if (v.field_E == -1) {
                  break L0;
                } else {
                  ok.field_e = v.field_E;
                  if (HoldTheLine.field_D == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            ok.field_e = -1;
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          if (param0 > 82) {
            break L2;
          } else {
            this.a(49, false);
            break L2;
          }
        }
    }

    final void b(boolean param0, int param1) {
        String[][] array$0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        String[][] stackIn_30_0 = null;
        String[][] stackIn_30_1 = null;
        int stackIn_30_2 = 0;
        String[][] stackIn_31_0 = null;
        String[][] stackIn_31_1 = null;
        int stackIn_31_2 = 0;
        String[][] stackIn_32_0 = null;
        String[][] stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        String[][] stackIn_33_0 = null;
        String[][] stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        String[][] stackIn_34_0 = null;
        String[][] stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        String[][] stackIn_35_0 = null;
        String[][] stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        String[][] stackIn_36_0 = null;
        String[][] stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        String[] stackIn_36_3 = null;
        int statePc = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = HoldTheLine.field_D;
                    this.field_y = 0;
                    this.field_w = 0;
                    this.field_r = 0;
                    this.field_s = 0;
                    var3 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((var3 ^ -1) <= (this.field_q.length ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_q[var3] = 0;
                    var3++;
                    if (var5 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var5 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    bd.field_S = -20;
                    sf.field_m = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (this.field_o == 4) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (this.field_o != 5) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ih.field_p = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (this.field_o == 2) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if ((this.field_o ^ -1) != -4) {
                        statePc = 18;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var3 = 0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (-5 >= (var3 ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    mg.field_g[var3] = null;
                    var3++;
                    if (var5 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var5 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = this;
                    stackIn_19_0 = stackIn_20_0;
                    if (param0) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = this;
                    stackIn_21_1 = 1;
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = this;
                    stackIn_21_1 = 0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    ((ti) (this)).field_g = stackIn_21_1 != 0;
                    v.field_E = -1;
                    this.field_t = 0.0f;
                    ca.field_s = 0;
                    qd.field_h = 2;
                    this.field_p = 0;
                    ci.field_j = -1;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_25_0 = this;
                    stackIn_23_0 = stackIn_25_0;
                    if (10 == this.field_o) {
                        statePc = 25;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = this;
                    stackIn_24_0 = stackIn_25_0;
                    if ((this.field_o ^ -1) == -12) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_26_0 = this;
                    stackIn_26_1 = 0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = this;
                    stackIn_26_1 = 1;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    ((ti) (this)).field_c = stackIn_26_1;
                    qe.field_a = 0;
                    ok.field_e = -1;
                    g.field_o = 0;
                    this.field_v = -1;
                    if (-1 != (this.field_o ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (cf.field_v == -1) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    this.field_c = cf.field_v;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    this.a((byte) 117);
                    var3 = cf.field_w;
                    array$0 = new String[1][];
                    stackIn_31_0 = (String[][]) (array$0);
                    stackIn_30_0 = stackIn_31_0;
                    stackIn_31_1 = (String[][]) (array$0);
                    stackIn_30_1 = stackIn_31_1;
                    stackIn_31_2 = 0;
                    stackIn_30_2 = stackIn_31_2;
                    if (10 != this.field_o) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_36_0 = (String[][]) ((Object) stackIn_30_0);
                    stackIn_36_1 = (String[][]) ((Object) stackIn_30_1);
                    stackIn_36_2 = stackIn_30_2;
                    stackIn_36_3 = v.field_A[var3];
                    statePc = 36;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_35_0 = (String[][]) ((Object) stackIn_31_0);
                    stackIn_32_0 = stackIn_35_0;
                    stackIn_35_1 = (String[][]) ((Object) stackIn_31_1);
                    stackIn_32_1 = stackIn_35_1;
                    stackIn_35_2 = stackIn_31_2;
                    stackIn_32_2 = stackIn_35_2;
                    if (2 == this.field_o) {
                        statePc = 35;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackIn_34_0 = (String[][]) ((Object) stackIn_32_0);
                    stackIn_33_0 = stackIn_34_0;
                    stackIn_34_1 = (String[][]) ((Object) stackIn_32_1);
                    stackIn_33_1 = stackIn_34_1;
                    stackIn_34_2 = stackIn_32_2;
                    stackIn_33_2 = stackIn_34_2;
                    if (-4 != (this.field_o ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_36_0 = (String[][]) ((Object) stackIn_33_0);
                    stackIn_36_1 = (String[][]) ((Object) stackIn_33_1);
                    stackIn_36_2 = stackIn_33_2;
                    stackIn_36_3 = ga.field_k;
                    statePc = 36;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_36_0 = (String[][]) ((Object) stackIn_34_0);
                    stackIn_36_1 = (String[][]) ((Object) stackIn_34_1);
                    stackIn_36_2 = stackIn_34_2;
                    stackIn_36_3 = null;
                    statePc = 36;
                    continue stateLoop;
                }
                case 35: {
                    stackIn_36_0 = (String[][]) ((Object) stackIn_35_0);
                    stackIn_36_1 = (String[][]) ((Object) stackIn_35_1);
                    stackIn_36_2 = stackIn_35_2;
                    stackIn_36_3 = ga.field_k;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    stackIn_36_1[stackIn_36_2] = stackIn_36_3;
                    om.a(stackIn_36_0, 79, this.field_o);
                    if (param1 < -81) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    this.field_q = (int[]) null;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var4 = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (-17 >= (var4 ^ -1)) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    vl.field_h[var4] = 32;
                    var4++;
                    if (var5 != 0) {
                        statePc = 45;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (var5 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (hn.field_T) {
                        statePc = 45;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 45: {
                    oh.a(param0, true);
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(byte param0) {
        boolean discarded$0 = false;
        if (param0 >= -56) {
            discarded$0 = this.h(45, -17);
        }
        this.field_y = 4;
        this.field_w = 40;
    }

    final void d(int param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_45_0 = 0;
        int var3;
        int var4;
        L0: {
          L1: {
            L2: {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        var4 = HoldTheLine.field_D;
                        var3 = em.field_i[this.field_o][param1];
                        if (var3 != 5) {
                          break L7;
                        } else {
                          if (var4 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (10 == var3) {
                        break L6;
                      } else {
                        L8: {
                          if (var3 != 24) {
                            break L8;
                          } else {
                            if (var4 == 0) {
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (25 != var3) {
                            break L9;
                          } else {
                            if (var4 == 0) {
                              break L4;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          if (var3 != 18) {
                            break L10;
                          } else {
                            if (var4 == 0) {
                              break L3;
                            } else {
                              break L10;
                            }
                          }
                        }
                        if ((var3 ^ -1) == -20) {
                          break L2;
                        } else {
                          if ((var3 ^ -1) == -22) {
                            break L1;
                          } else {
                            break L0;
                          }
                        }
                      }
                    }
                    fieldTemp$0 = g.field_o + 1;
                    g.field_o = g.field_o + 1;
                    if (fieldTemp$0 <= 1) {
                      break L0;
                    } else {
                      g.field_o = 0;
                      if (var4 == 0) {
                        break L0;
                      } else {
                        break L5;
                      }
                    }
                  }
                  fieldTemp$1 = ca.field_s + 1;
                  ca.field_s = ca.field_s + 1;
                  if (fieldTemp$1 <= 3) {
                    break L0;
                  } else {
                    ca.field_s = 0;
                    if (var4 == 0) {
                      break L0;
                    } else {
                      break L4;
                    }
                  }
                }
                L11: {
                  fieldTemp$2 = qd.field_h + 1;
                  qd.field_h = qd.field_h + 1;
                  stackIn_24_0 = fieldTemp$2 ^ -1;

                  if (ih.field_p != -1 + od.field_i.length) {
                    stackIn_25_0 = stackIn_24_0;
                    stackIn_25_1 = 2;
                    break L11;
                  } else {
                    stackIn_25_0 = stackIn_24_0;
                    stackIn_25_1 = 1;
                    break L11;
                  }
                }
                if (stackIn_25_0 < (stackIn_25_1 ^ -1)) {
                  L12: {
                    if ((ih.field_p ^ -1) == -1) {
                      stackIn_30_0 = 1;
                      break L12;
                    } else {
                      stackIn_30_0 = 0;
                      break L12;
                    }
                  }
                  qd.field_h = stackIn_30_0;
                  if (var4 == 0) {
                    break L0;
                  } else {
                    break L3;
                  }
                } else {
                  break L0;
                }
              }
              L13: {
                if ((ol.field_d ^ -1) > -225) {
                  break L13;
                } else {
                  if (-257 >= (ol.field_d ^ -1)) {
                    break L0;
                  } else {
                    ol.field_d = 256;
                    qf.a(293, cf.field_r);
                    if (var4 == 0) {
                      break L0;
                    } else {
                      break L13;
                    }
                  }
                }
              }
              ol.field_d = 32 * (1 + ol.field_d * 8 / 256);
              qf.a(293, cf.field_r);
              if (var4 == 0) {
                break L0;
              } else {
                break L2;
              }
            }
            L14: {
              if ((mk.field_e ^ -1) <= -141) {
                break L14;
              } else {
                ll.a(-108, 20 * (8 * mk.field_e / 160) - -20);
                if (var4 == 0) {
                  break L0;
                } else {
                  break L14;
                }
              }
            }
            ll.a(-125, 160);
            if (var4 == 0) {
              break L0;
            } else {
              break L1;
            }
          }
          L15: {
            qf.a(293, cf.field_r);
            if (em.field_o) {
              stackIn_45_0 = 0;
              break L15;
            } else {
              stackIn_45_0 = 1;
              break L15;
            }
          }
          em.field_o = stackIn_45_0 != 0;
          this.field_q[param1] = 50;
          break L0;
        }
        L16: {
          if (param0 > 97) {
            break L16;
          } else {
            this.field_v = -111;
            break L16;
          }
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        Object stackIn_85_0 = null;
        Object stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_101_0 = 0;
        Object stackIn_107_0 = null;
        Object stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        boolean stackIn_160_0 = false;
        int stackIn_160_1 = 0;
        boolean stackIn_161_0 = false;
        int stackIn_161_1 = 0;
        int stackIn_161_2 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        L0: {
          L1: {
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
                                  L13: {
                                    L14: {
                                      L15: {
                                        L16: {
                                          L17: {
                                            L18: {
                                              L19: {
                                                L20: {
                                                  L21: {
                                                    L22: {
                                                      var7 = HoldTheLine.field_D;
                                                      var4 = -78 % ((param2 - 36) / 41);
                                                      var6 = param0;
                                                      if (-3 == (var6 ^ -1)) {
                                                        break L22;
                                                      } else {
                                                        L23: {
                                                          if (-14 != (var6 ^ -1)) {
                                                            break L23;
                                                          } else {
                                                            if (var7 == 0) {
                                                              break L21;
                                                            } else {
                                                              break L23;
                                                            }
                                                          }
                                                        }
                                                        L24: {
                                                          if ((var6 ^ -1) != -15) {
                                                            break L24;
                                                          } else {
                                                            if (var7 == 0) {
                                                              break L20;
                                                            } else {
                                                              break L24;
                                                            }
                                                          }
                                                        }
                                                        if (var6 == 15) {
                                                          break L19;
                                                        } else {
                                                          L25: {
                                                            if ((var6 ^ -1) != -17) {
                                                              break L25;
                                                            } else {
                                                              if (var7 == 0) {
                                                                break L18;
                                                              } else {
                                                                break L25;
                                                              }
                                                            }
                                                          }
                                                          L26: {
                                                            if (-18 != (var6 ^ -1)) {
                                                              break L26;
                                                            } else {
                                                              if (var7 == 0) {
                                                                break L17;
                                                              } else {
                                                                break L26;
                                                              }
                                                            }
                                                          }
                                                          L27: {
                                                            if ((var6 ^ -1) != -1) {
                                                              break L27;
                                                            } else {
                                                              if (var7 == 0) {
                                                                break L16;
                                                              } else {
                                                                break L27;
                                                              }
                                                            }
                                                          }
                                                          if (var6 == 3) {
                                                            break L15;
                                                          } else {
                                                            L28: {
                                                              if ((var6 ^ -1) != -8) {
                                                                break L28;
                                                              } else {
                                                                if (var7 == 0) {
                                                                  break L14;
                                                                } else {
                                                                  break L28;
                                                                }
                                                              }
                                                            }
                                                            L29: {
                                                              if (-9 != (var6 ^ -1)) {
                                                                break L29;
                                                              } else {
                                                                if (var7 == 0) {
                                                                  break L13;
                                                                } else {
                                                                  break L29;
                                                                }
                                                              }
                                                            }
                                                            L30: {
                                                              if (-5 != (var6 ^ -1)) {
                                                                break L30;
                                                              } else {
                                                                if (var7 == 0) {
                                                                  break L12;
                                                                } else {
                                                                  break L30;
                                                                }
                                                              }
                                                            }
                                                            L31: {
                                                              if (5 != var6) {
                                                                break L31;
                                                              } else {
                                                                if (var7 == 0) {
                                                                  break L11;
                                                                } else {
                                                                  break L31;
                                                                }
                                                              }
                                                            }
                                                            if ((var6 ^ -1) == -10) {
                                                              break L10;
                                                            } else {
                                                              L32: {
                                                                if (-11 != (var6 ^ -1)) {
                                                                  break L32;
                                                                } else {
                                                                  if (var7 == 0) {
                                                                    break L9;
                                                                  } else {
                                                                    break L32;
                                                                  }
                                                                }
                                                              }
                                                              L33: {
                                                                if (-12 != (var6 ^ -1)) {
                                                                  break L33;
                                                                } else {
                                                                  if (var7 == 0) {
                                                                    break L8;
                                                                  } else {
                                                                    break L33;
                                                                  }
                                                                }
                                                              }
                                                              if (-25 == (var6 ^ -1)) {
                                                                break L7;
                                                              } else {
                                                                if (var6 == 25) {
                                                                  break L6;
                                                                } else {
                                                                  if (-13 == (var6 ^ -1)) {
                                                                    break L5;
                                                                  } else {
                                                                    if (-7 == (var6 ^ -1)) {
                                                                      break L4;
                                                                    } else {
                                                                      if ((var6 ^ -1) == -27) {
                                                                        break L3;
                                                                      } else {
                                                                        if ((var6 ^ -1) != -2) {
                                                                          break L0;
                                                                        } else {
                                                                          if (var7 == 0) {
                                                                            break L2;
                                                                          } else {
                                                                            break L22;
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
                                                      }
                                                    }
                                                    wm.a(param1, false, -1);
                                                    if (var7 == 0) {
                                                      break L1;
                                                    } else {
                                                      break L21;
                                                    }
                                                  }
                                                  wm.a(param1, false, 2);
                                                  this.field_v = param0;
                                                  if (var7 == 0) {
                                                    break L1;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                                wm.a(param1, false, 6);
                                                this.field_v = param0;
                                                if (var7 == 0) {
                                                  break L1;
                                                } else {
                                                  break L19;
                                                }
                                              }
                                              wm.a(param1, false, 4);
                                              this.field_v = param0;
                                              if (var7 == 0) {
                                                break L1;
                                              } else {
                                                break L18;
                                              }
                                            }
                                            wm.a(param1, false, 5);
                                            this.field_v = param0;
                                            if (var7 == 0) {
                                              break L1;
                                            } else {
                                              break L17;
                                            }
                                          }
                                          L34: {
                                            if (null != kf.field_U) {
                                              break L34;
                                            } else {
                                              oe.b((byte) 108);
                                              if (var7 == 0) {
                                                break L1;
                                              } else {
                                                break L34;
                                              }
                                            }
                                          }
                                          em.a(-29486, false);
                                          if (var7 == 0) {
                                            break L1;
                                          } else {
                                            break L16;
                                          }
                                        }
                                        L35: {
                                          L36: {
                                            if (of.a(-969)) {
                                              break L36;
                                            } else {
                                              if ((this.field_o ^ -1) == -10) {
                                                break L35;
                                              } else {
                                                if (7 == this.field_o) {
                                                  break L35;
                                                } else {
                                                  if (8 == this.field_o) {
                                                    break L35;
                                                  } else {
                                                    if (-4 == (this.field_o ^ -1)) {
                                                      break L35;
                                                    } else {
                                                      break L36;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          wm.a(param1, false, 0);
                                          if (var7 == 0) {
                                            break L1;
                                          } else {
                                            break L35;
                                          }
                                        }
                                        wm.a(param1, false, 12);
                                        if (var7 == 0) {
                                          break L1;
                                        } else {
                                          break L15;
                                        }
                                      }
                                      wm.a(param1, false, lm.field_a);
                                      if (var7 == 0) {
                                        break L1;
                                      } else {
                                        break L14;
                                      }
                                    }
                                    bl.field_r.field_mb = -1;
                                    qn.a(7, param1, true);
                                    if (var7 == 0) {
                                      break L1;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  L37: {
                                    if ((this.field_o ^ -1) != -11) {
                                      break L37;
                                    } else {
                                      if (0.0f >= this.field_t) {
                                        break L37;
                                      } else {
                                        if (3 != ek.field_x) {
                                          break L37;
                                        } else {
                                          wm.a(param1, false, 13);
                                          if (var7 == 0) {
                                            break L1;
                                          } else {
                                            break L37;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  this.a(7, param1, -12);
                                  if (var7 == 0) {
                                    break L1;
                                  } else {
                                    break L12;
                                  }
                                }
                                wm.a(param1, false, 3);
                                if (var7 == 0) {
                                  break L1;
                                } else {
                                  break L11;
                                }
                              }
                              L38: {
                                stackIn_85_0 = this;

                                if ((g.field_o ^ -1) != -1) {
                                  stackIn_86_0 = this;
                                  stackIn_86_1 = 0;
                                  break L38;
                                } else {
                                  stackIn_86_0 = this;
                                  stackIn_86_1 = 4;
                                  break L38;
                                }
                              }
                              this.a(stackIn_86_1, param1, -24);
                              if (var7 == 0) {
                                break L1;
                              } else {
                                break L10;
                              }
                            }
                            L39: {
                              L40: {
                                if ((this.field_o ^ -1) == -3) {
                                  break L40;
                                } else {
                                  if ((this.field_o ^ -1) != -7) {
                                    break L39;
                                  } else {
                                    break L40;
                                  }
                                }
                              }
                              i.a((byte) 71, true);
                              if (var7 == 0) {
                                break L1;
                              } else {
                                break L39;
                              }
                            }
                            L41: {
                              if (this.field_o != 9) {
                                break L41;
                              } else {
                                L42: {
                                  L43: {
                                    if ((mi.field_d ^ -1) != -8) {
                                      break L43;
                                    } else {
                                      L44: {
                                        if (-1 == (ii.field_c ^ -1)) {
                                          stackIn_97_0 = 3;
                                          break L44;
                                        } else {
                                          stackIn_97_0 = 7;
                                          break L44;
                                        }
                                      }
                                      var6 = stackIn_97_0;
                                      if (var7 == 0) {
                                        break L42;
                                      } else {
                                        break L43;
                                      }
                                    }
                                  }
                                  L45: {
                                    if (0 != ii.field_c) {
                                      stackIn_101_0 = 8;
                                      break L45;
                                    } else {
                                      stackIn_101_0 = 12;
                                      break L45;
                                    }
                                  }
                                  var6 = stackIn_101_0;
                                  break L42;
                                }
                                qf.a(var6, true, 3865, param1);
                                if (var7 == 0) {
                                  break L1;
                                } else {
                                  break L41;
                                }
                              }
                            }
                            ch.a(en.a(98), (byte) 47);
                            if (var7 == 0) {
                              break L1;
                            } else {
                              break L9;
                            }
                          }
                          L46: {
                            stackIn_107_0 = this;

                            if (g.field_o == 0) {
                              stackIn_108_0 = this;
                              stackIn_108_1 = 9;
                              break L46;
                            } else {
                              stackIn_108_0 = this;
                              stackIn_108_1 = 0;
                              break L46;
                            }
                          }
                          this.a(stackIn_108_1, param1, -35);
                          if (var7 == 0) {
                            break L1;
                          } else {
                            break L8;
                          }
                        }
                        eb.field_o = null;
                        field_z = 0;
                        ii.field_c = 0;
                        wm.a(param1, false, 12);
                        if (var7 == 0) {
                          break L1;
                        } else {
                          break L7;
                        }
                      }
                      L47: {
                        if (-1 != ca.field_s) {
                          break L47;
                        } else {
                          if (var7 == 0) {
                            break L1;
                          } else {
                            break L47;
                          }
                        }
                      }
                      L48: {
                        if (-1 != (ca.field_s ^ -1)) {
                          break L48;
                        } else {
                          this.a(0, param1, -125);
                          if (var7 == 0) {
                            break L1;
                          } else {
                            break L48;
                          }
                        }
                      }
                      var5 = -1 + ca.field_s;
                      if ((var5 ^ -1) == (pj.field_m ^ -1)) {
                        break L1;
                      } else {
                        L49: {
                          L50: {
                            if ((en.field_b ^ -1) != (pj.field_m ^ -1)) {
                              break L50;
                            } else {
                              if ((ha.field_p ^ -1) == (wa.field_j ^ -1)) {
                                break L49;
                              } else {
                                break L50;
                              }
                            }
                          }
                          this.field_t = this.field_t - 640.0f;
                          en.field_b = pj.field_m;
                          wa.field_j = ha.field_p;
                          break L49;
                        }
                        pj.field_m = var5;
                        this.field_p = 640;
                        if (var7 == 0) {
                          break L1;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L51: {
                      if ((qd.field_h ^ -1) == -1) {
                        break L51;
                      } else {
                        L52: {
                          if (2 != qd.field_h) {
                            break L52;
                          } else {
                            if (ih.field_p < 6) {
                              L53: {
                                fieldTemp$0 = ih.field_p + 1;
                                ih.field_p = ih.field_p + 1;
                                if (-7 != (fieldTemp$0 ^ -1)) {
                                  break L53;
                                } else {
                                  qd.field_h = 1;
                                  break L53;
                                }
                              }
                              this.field_p = 640 * ih.field_p;
                              if (var7 == 0) {
                                break L1;
                              } else {
                                break L52;
                              }
                            } else {
                              break L0;
                            }
                          }
                        }
                        if (-2 == (qd.field_h ^ -1)) {
                          wm.a(param1, false, lm.field_a);
                          if (var7 == 0) {
                            break L1;
                          } else {
                            break L51;
                          }
                        } else {
                          break L0;
                        }
                      }
                    }
                    if (0 < ih.field_p) {
                      L54: {
                        fieldTemp$1 = ih.field_p - 1;
                        ih.field_p = ih.field_p - 1;
                        if (0 != fieldTemp$1) {
                          break L54;
                        } else {
                          qd.field_h = 2;
                          break L54;
                        }
                      }
                      this.field_p = ih.field_p * 640;
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L5;
                      }
                    } else {
                      break L0;
                    }
                  }
                  L55: {
                    if (nd.field_e) {
                      break L55;
                    } else {
                      wm.a(param1, false, 13);
                      this.field_v = param0;
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L55;
                      }
                    }
                  }
                  hf.c(0);
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L4;
                  }
                }
                L56: {
                  if (-3 == (ek.field_x ^ -1)) {
                    break L56;
                  } else {
                    if ((ek.field_x ^ -1) == -7) {
                      break L56;
                    } else {
                      L57: {
                        if (ek.field_x == 4) {
                          break L57;
                        } else {
                          if (-6 == (ek.field_x ^ -1)) {
                            break L57;
                          } else {
                            ij.a(param1, -81);
                            if (var7 == 0) {
                              break L1;
                            } else {
                              break L57;
                            }
                          }
                        }
                      }
                      L58: {
                        if (!pj.b((byte) 108)) {
                          break L58;
                        } else {
                          L59: {
                            L60: {
                              if (0 != ii.field_c) {
                                break L60;
                              } else {
                                if (!ad.field_a) {
                                  break L59;
                                } else {
                                  break L60;
                                }
                              }
                            }
                            wm.a(param1, false, 9);
                            if (var7 == 0) {
                              break L1;
                            } else {
                              break L59;
                            }
                          }
                          wm.a(param1, false, 12);
                          if (var7 == 0) {
                            break L1;
                          } else {
                            break L58;
                          }
                        }
                      }
                      L61: {
                        if (-1 != (ii.field_c ^ -1)) {
                          break L61;
                        } else {
                          L62: {
                            stackIn_160_0 = param1;

                            stackIn_160_1 = 0;

                            if (of.a(-969)) {
                              stackIn_161_0 = stackIn_160_0;
                              stackIn_161_1 = stackIn_160_1;
                              stackIn_161_2 = 0;
                              break L62;
                            } else {
                              stackIn_161_0 = stackIn_160_0;
                              stackIn_161_1 = stackIn_160_1;
                              stackIn_161_2 = 12;
                              break L62;
                            }
                          }
                          wm.a(stackIn_161_0, stackIn_161_1 != 0, stackIn_161_2);
                          if (var7 == 0) {
                            break L1;
                          } else {
                            break L61;
                          }
                        }
                      }
                      wm.a(param1, false, 8);
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L56;
                      }
                    }
                  }
                }
                L63: {
                  if (!pj.b((byte) 102)) {
                    break L63;
                  } else {
                    wm.a(param1, false, 9);
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L63;
                    }
                  }
                }
                L64: {
                  if (ii.field_c != 0) {
                    break L64;
                  } else {
                    wm.a(param1, false, 3);
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L64;
                    }
                  }
                }
                wm.a(param1, false, 7);
                if (var7 == 0) {
                  break L1;
                } else {
                  break L3;
                }
              }
              hf.c(0);
              if (var7 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
            te.a(true);
            break L0;
          }
          break L0;
        }
    }

    final static void c(boolean param0) {
        if (!(null == mc.field_a)) {
            return;
        }
        mc.field_a = new om[73];
        mc.field_a[1] = new om(5, 543, cf.field_u, i.field_j, -1);
        mc.field_a[2] = new om(5, 540, ha.field_k, i.field_j, -1);
        mc.field_a[3] = new om(5, 541, pk.field_O, i.field_j, -1);
        mc.field_a[4] = new om(5, 542, na.field_q, i.field_j, -1);
        mc.field_a[5] = new om(12, 6, 352, 0);
        mc.field_a[6] = new om(12, 6, 352, 0);
        mc.field_a[7] = new om(12, 6, 352, 0);
        mc.field_a[8] = new om(12, 6, 352, 0);
        mc.field_a[9] = new om(4, 1180, wn.field_f, fh.field_d, -1);
        mc.field_a[10] = null;
        mc.field_a[11] = new om(4, 8300, wb.field_d, ao.field_d, -1);
        mc.field_a[12] = new om(10, 0, qb.field_b, 2);
        mc.field_a[13] = new om(15, 0, t.field_i, 2);
        mc.field_a[14] = new om(20, 0, cd.field_d, 2);
        mc.field_a[15] = new om(25, 0, ci.field_k, 2);
        mc.field_a[16] = new om(40, 0, ud.field_o, 2);
        mc.field_a[17] = new om(25, 50, 524320, ub.field_A, 0);
        mc.field_a[18] = new om(25, 50, 524320, aj.field_c, 0);
        mc.field_a[19] = new om(25, 50, 524320, jf.field_c, 0);
        mc.field_a[20] = new om(15, 30, 32, ie.field_k, 0);
        mc.field_a[21] = new om(15, 30, 32, sj.field_I, 0);
        mc.field_a[22] = new om(15, 30, 32, ch.field_u, 0);
        mc.field_a[23] = new om(10, 10, 16384, bl.field_s, 0);
        mc.field_a[24] = new om(5, 0, vh.field_i, 0);
        mc.field_a[25] = new om(5, 0, ae.field_b, 0);
        mc.field_a[26] = new om(5, 0, ma.field_l, 0);
        mc.field_a[27] = new om(80, 40, 1081376, h.field_b, 0);
        mc.field_a[28] = new om(80, 4, 32, pd.field_h, 1);
        mc.field_a[29] = new om(10, 0, aj.field_a, -1);
        mc.field_a[30] = new om(15, 25, 16416, gh.field_a, 0);
        mc.field_a[31] = new om(15, 25, 16416, ag.field_r, 0);
        mc.field_a[32] = new om(10, 0, 16384, w.field_a, 2);
        mc.field_a[33] = new om(15, 0, 16384, n.field_r, 2);
        mc.field_a[34] = new om(20, 0, 16384, tf.field_o, 2);
        mc.field_a[35] = new om(15, 0, 16384, aa.field_q, 2);
        mc.field_a[36] = new om(20, 0, 16384, kc.field_d, 2);
        mc.field_a[37] = new om(25, 0, 16384, nd.field_c, 2);
        mc.field_a[38] = new om(50, 50, 16416, ig.field_t, ko.field_c, 0);
        mc.field_a[39] = new om(5, 0, n.field_j, 0);
        mc.field_a[40] = new om(5, 0, mo.field_r, 0);
        mc.field_a[41] = new om(10, 10, 65568, gi.field_J, 0);
        mc.field_a[42] = new om(10, 10, 65568, gk.field_b, 0);
        mc.field_a[43] = new om(10, 10, 16384, om.field_i, 0);
        if (param0) {
            return;
        }
        mc.field_a[44] = new om(15, 15, 16384, en.field_e, 0);
        mc.field_a[45] = new om(20, 20, 16384, q.field_d, 0);
        mc.field_a[46] = new om(10, 16384, co.field_b, 2);
        mc.field_a[47] = new om(15, 16384, tf.field_A, 2);
        mc.field_a[48] = new om(20, 16384, uk.field_b, 2);
        mc.field_a[49] = new om(25, 16384, ac.field_c, 2);
        mc.field_a[50] = new om(40, 16384, ri.field_a, 2);
        mc.field_a[51] = new om(15, 32, ci.field_l, 0);
        mc.field_a[52] = new om(10, 32, fj.field_s, 0);
        mc.field_a[53] = new om(5, 25, 32, gn.field_f, 3);
        mc.field_a[54] = new om(3, 40, ai.field_b, 3);
        mc.field_a[55] = new om(80, 40, 32, um.field_e, 0);
        mc.field_a[56] = new om(8, 4, 1146912, we.field_p, 0);
        mc.field_a[57] = new om(15, 7, 32, lc.field_c, 0);
        mc.field_a[58] = new om(10, 16384, jo.field_a, 2);
        mc.field_a[59] = new om(15, 16384, hm.field_b, 2);
        mc.field_a[60] = new om(20, 16384, in.field_b, 2);
        mc.field_a[61] = new om(25, 16384, ie.field_i, 2);
        mc.field_a[62] = new om(12, 6, 352, 0);
        mc.field_a[63] = new om(12, 6, 352, 0);
        mc.field_a[64] = new om(12, 6, 352, 0);
        mc.field_a[65] = new om(12, 6, 352, 0);
        mc.field_a[66] = new om(12, 6, 352, 0);
        mc.field_a[67] = new om(12, 6, 352, 0);
        mc.field_a[68] = new om(12, 6, 352, 0);
        mc.field_a[69] = new om(12, 6, 352, 0);
        mc.field_a[70] = new om(10, 10, 360488, pg.field_K, fk.field_c, -1);
        mc.field_a[71] = new om(10, 10, 360489, jk.field_p, fk.field_c, -1);
        mc.field_a[72] = new om(12, 360490, la.field_g, -1);
    }

    public static void g(int param0) {
        field_u = null;
        if (param0 != -21006) {
            ti.k(-12);
        }
        field_x = null;
    }

    private final void a(boolean param0, int param1) {
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_2 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int var3;
        int var4;
        L0: {
          var4 = HoldTheLine.field_D;
          if (param0) {
            break L0;
          } else {
            this.j(35);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          L2: {
            L3: {
              L4: {
                if ((var3 ^ -1) <= -5) {
                  break L4;
                } else {
                  stackIn_18_0 = this;

                  stackIn_18_1 = var3 ^ -1;

                  stackIn_18_2 = tn.field_a ^ -1;

                  if (var4 != 0) {
                    break L3;
                  } else {
                    L5: {
                      stackIn_7_0 = this;

                      if (stackIn_18_1 == stackIn_18_2) {
                        stackIn_8_0 = this;
                        stackIn_8_1 = 4210752;
                        break L5;
                      } else {
                        stackIn_8_0 = this;
                        stackIn_8_1 = wd.field_l[var3];
                        break L5;
                      }
                    }
                    L6: {
                      stackIn_10_0 = this;

                      stackIn_10_2 = 2;

                      if ((tn.field_a ^ -1) == (var3 ^ -1)) {
                        stackIn_11_0 = this;

                        stackIn_11_2 = stackIn_10_2;
                        stackIn_11_3 = 16777215;
                        break L6;
                      } else {
                        stackIn_11_0 = this;

                        stackIn_11_2 = stackIn_10_2;
                        stackIn_11_3 = vk.field_q[var3];
                        break L6;
                      }
                    }
                    this.a(stackIn_8_1, stackIn_11_2, stackIn_11_3, 2, var3 * 128 + 128 + -param1, 110, 80, p.a(0, (byte) -83, var3), 60);
                    var3++;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              L7: {
                bn.a(ha.field_p + 4, -107);
                if (!pj.b((byte) 118)) {
                  break L7;
                } else {
                  cg.a(30 - param1, 170, 580, (byte) 41, 260);
                  var3 = 280;
                  q.a(nk.field_M, nm.field_c, 0, -param1 + 320, (byte) -128, var3 + -nm.field_c.field_G);
                  q.a(ue.field_b, nm.field_c, 0, -param1 + 320, (byte) -127, var3);
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if (1 != this.field_y) {
                  break L8;
                } else {
                  this.a(en.field_b, -(int)this.field_t + param1, wa.field_j, (byte) 116);
                  this.a(pj.field_m, -(int)this.field_t + (param1 - -640), ha.field_p, (byte) -108);
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L8;
                  }
                }
              }
              stackIn_18_0 = this;
              stackIn_18_1 = en.field_b;
              stackIn_18_2 = param1;
              break L3;
            }
            this.a(stackIn_18_1, stackIn_18_2, ha.field_p, (byte) 83);
            break L2;
          }
          ni.field_a.b(e.field_b, 320 + param1, 474, 0, -1);
          return;
        }
    }

    private final void c(int param0, boolean param1) {
        bn.a(7, -119);
        b.field_c.a(param1);
        if (!(!hn.field_T)) {
            en.a((byte) 49);
        }
    }

    private final boolean h(int param0, int param1) {
        int var3;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        L0: {
          if (param1 == 176) {
            break L0;
          } else {
            this.field_t = 0.4921543300151825f;
            break L0;
          }
        }
        L1: {
          if ((1 << param0 & field_z) == 0) {
            stackIn_5_0 = 0;
            break L1;
          } else {
            stackIn_5_0 = 1;
            break L1;
          }
        }
        L2: {
          L3: {
            var3 = stackIn_5_0;
            if (var3 != 0) {
              break L3;
            } else {
              if (15 != param0) {
                break L3;
              } else {
                if (!kb.a(16616, 0)) {
                  stackIn_11_0 = 0;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
          }
          stackIn_11_0 = 1;
          break L2;
        }
        return stackIn_11_0 != 0;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, hj param7, int param8) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var10_int = param4 - param6 / 2;
                        var11 = param5 + -(param8 / param1);
                        var12 = var10_int + param6;
                        var13 = var11 - -param8;
                        var14 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var14 >= param3) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        tc.b(var10_int + (-1 + -var14), -var14 + (var11 + -1), var14 * 2 + (2 + param6), param2);
                        tc.b(-var14 + -1 + var10_int, var13 - -var14, param6 - -2 + var14 * 2, param0);
                        tc.h(var10_int - (1 - -var14), var11 + -var14, 2 * var14 + param8, param2);
                        tc.h(var12 - -var14, var11 - var14, 2 * var14 + param8, param0);
                        var14++;
                        if (var15 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var15 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param6 != param7.field_s) {
                            statePc = 9;
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
                        if (param8 == param7.field_y) {
                            statePc = 11;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        param7.a(var10_int, var11, param6, param8);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var15 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        param7.b(var10_int, var11);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var10 = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (var10);
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("ti.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
                    stackIn_14_1 = stackIn_15_1;
                    if (param7 == null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_16_2 = "{...}";
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_16_2 = "null";
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    throw kk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param8 + ')');
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void e(int param0) {
        this.field_a = em.field_i[this.field_o].length;
        int var2 = 76 % ((param0 - 25) / 35);
        this.field_q = new int[this.field_a];
    }

    final void a(int param0, boolean param1) {
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int statePc = 0;
        int var3 = 0;
        float var3_float = 0.0f;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = HoldTheLine.field_D;
                    if (gg.field_J != 1) {
                        statePc = 8;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (0 == this.field_y) {
                        statePc = 3;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 3: {
                    gg.field_J = 0;
                    this.e((byte) -116);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if ((this.field_y ^ -1) == -3) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (-4 == (this.field_y ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    gg.field_J = 0;
                    this.b((byte) -100);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if ((this.field_o ^ -1) == -13) {
                        statePc = 76;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (-2 <= (this.field_y ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (!qh.c(-47)) {
                        statePc = 61;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_107_0 = aa.field_n;
                    stackIn_13_0 = stackIn_107_0;
                    stackIn_107_1 = 13;
                    stackIn_13_1 = stackIn_107_1;
                    if (var5 != 0) {
                        statePc = 107;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (stackIn_13_0 != stackIn_13_1) {
                        statePc = 23;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (0 != this.field_o) {
                        statePc = 16;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (-1 <= (em.field_i[this.field_o].length ^ -1)) {
                        statePc = 23;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (2 == em.field_i[this.field_o][0]) {
                        statePc = 22;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (0 == em.field_i[this.field_o][0]) {
                        statePc = 22;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (em.field_i[this.field_o][0] == 4) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (em.field_i[this.field_o][0] == 3) {
                        statePc = 22;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.c(0, -3565);
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (mg.field_c) {
                        statePc = 25;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (aa.field_n == 28) {
                        statePc = 27;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 27: {
                    hn.field_T = false;
                    wm.a(false, false, 12);
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if ((aa.field_n ^ -1) == -2) {
                        statePc = 30;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (kb.field_c) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    stackIn_33_0 = 1;
                    statePc = 33;
                    continue stateLoop;
                }
                case 32: {
                    stackIn_33_0 = 0;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    kb.field_c = stackIn_33_0 != 0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (!mg.field_c) {
                        statePc = 40;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (aa.field_n != 1) {
                        statePc = 40;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (!mg.field_c) {
                        statePc = 40;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (lk.field_g[82]) {
                        statePc = 39;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ao.field_b = 3;
                    l.field_b = true;
                    hk.field_d = -1 + pc.field_l[3];
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (2 == this.field_o) {
                        statePc = 60;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (3 == this.field_o) {
                        statePc = 60;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if ((this.field_o ^ -1) == -11) {
                        statePc = 45;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (11 != this.field_o) {
                        statePc = 47;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    this.m(-1);
                    if (var5 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (-5 == (this.field_o ^ -1)) {
                        statePc = 51;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (-6 == (this.field_o ^ -1)) {
                        statePc = 51;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    this.a(true);
                    if (var5 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    this.a(true);
                    if (-1 == this.field_c) {
                        statePc = 11;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (em.field_i[this.field_o][this.field_c] != 25) {
                        statePc = 11;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (2 > qd.field_h) {
                        statePc = 56;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (ih.field_p == -1 + od.field_i.length) {
                        statePc = 59;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (qd.field_h > 0) {
                        statePc = 11;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (0 == ih.field_p) {
                        statePc = 59;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 59: {
                    qd.field_h = 1;
                    if (var5 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    this.o(-1);
                    if (var5 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (!na.field_k) {
                        statePc = 76;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    this.b(12515);
                    if (this.field_o == 2) {
                        statePc = 65;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (this.field_o != 3) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    this.j(-5302);
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if (10 == this.field_o) {
                        statePc = 69;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (-12 == (this.field_o ^ -1)) {
                        statePc = 69;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 69: {
                    this.d((byte) -88);
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    if (this.field_o == 6) {
                        statePc = 75;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (-8 == (this.field_o ^ -1)) {
                        statePc = 75;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if ((this.field_o ^ -1) == -9) {
                        statePc = 75;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (-10 == (this.field_o ^ -1)) {
                        statePc = 75;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 75: {
                    this.f((byte) 98);
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    var3 = 0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if ((this.field_q.length ^ -1) >= (var3 ^ -1)) {
                        statePc = 83;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    stackIn_90_0 = this.field_q[var3] ^ -1;
                    stackIn_79_0 = stackIn_90_0;
                    stackIn_90_1 = -1;
                    stackIn_79_1 = stackIn_90_1;
                    if (var5 != 0) {
                        statePc = 90;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (stackIn_79_0 < stackIn_79_1) {
                        statePc = 81;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 81: {
                    this.field_q[var3] = this.field_q[var3] - 1;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    var3++;
                    if (var5 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (this.field_y != 0) {
                        statePc = 89;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (-1 != (this.field_s ^ -1)) {
                        statePc = 86;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    bd.a(17405, 64, 0, j.field_c.field_f);
                    bd.a(17405, 64, 256, j.field_c.field_h);
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    this.field_s = this.field_s + 1;
                    if ((this.field_a * 5 + 25 ^ -1) == (this.field_s ^ -1)) {
                        statePc = 88;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 88: {
                    this.field_y = 1;
                    if (var5 == 0) {
                        statePc = 99;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    stackIn_90_0 = 2;
                    stackIn_90_1 = this.field_y;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    if (stackIn_90_0 == stackIn_90_1) {
                        statePc = 96;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (-4 == (this.field_y ^ -1)) {
                        statePc = 93;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 93: {
                    this.field_w = this.field_w + 1;
                    if (40 > this.field_w) {
                        statePc = 99;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    this.field_y = 4;
                    if (var5 == 0) {
                        statePc = 99;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    this.field_r = this.field_r + 1;
                    var3 = this.field_r + 25 + -(5 * (1 + this.field_a));
                    var4 = (int)((double)we.field_n * (-Math.exp((double)(0.20000000298023224f * (float)var3)) + 1.0));
                    if (259 < (var4 ^ -1)) {
                        statePc = 98;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 98: {
                    this.field_y = 3;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    sf.field_m = sf.field_m + 1;
                    if ((float)this.field_p != this.field_t) {
                        statePc = 101;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 101: {
                    var3_float = (float)this.field_p - this.field_t;
                    this.field_t = this.field_t + var3_float * 0.20000000298023224f;
                    if (1.0f <= var3_float) {
                        statePc = 106;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if ((this.field_o ^ -1) == -3) {
                        statePc = 105;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (this.field_o == 3) {
                        statePc = 105;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 105: {
                    this.field_p = 0;
                    this.field_t = 0.0f;
                    en.field_b = pj.field_m;
                    wa.field_j = ha.field_p;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    stackIn_107_0 = -125;
                    stackIn_107_1 = (-30 - param0) / 62;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    var3 = stackIn_107_0 % stackIn_107_1;
                    if ((this.field_o ^ -1) == -7) {
                        statePc = 111;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (7 == this.field_o) {
                        statePc = 111;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if ((this.field_o ^ -1) == -9) {
                        statePc = 111;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 111: {
                    this.d(1);
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if (-13 != (this.field_o ^ -1)) {
                        statePc = 114;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    this.b(0, param1);
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(boolean param0, int param1, int param2) {
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        L0: {
          var7 = HoldTheLine.field_D;
          if (!param0) {
            break L0;
          } else {
            this.a(true, -31, -22, -74, -57, -16);
            break L0;
          }
        }
        var4 = -1;
        var5 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if (this.field_a <= var5) {
                break L3;
              } else {
                var6 = param1 + -this.e(var5, 6);
                stackIn_10_0 = -1;

                stackIn_10_1 = var6 ^ -1;

                if (var7 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (stackIn_10_0 < stackIn_10_1) {
                      break L4;
                    } else {
                      if ((var6 ^ -1) < -31) {
                        break L4;
                      } else {
                        var4 = var5;
                        break L4;
                      }
                    }
                  }
                  var5++;
                  if (var7 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            stackIn_10_0 = var4;
            stackIn_10_1 = -1;
            break L2;
          }
          if (stackIn_10_0 != stackIn_10_1) {
            if (-6 != (em.field_i[this.field_o][var4] ^ -1)) {
              if ((em.field_i[this.field_o][var4] ^ -1) != -11) {
                if (em.field_i[this.field_o][var4] == 24) {
                  ca.field_s = fj.a(qb.field_a, (byte) -119, param2);
                  return var4;
                } else {
                  if ((em.field_i[this.field_o][var4] ^ -1) == -26) {
                    qd.field_h = fj.a(mo.field_v, (byte) -119, param2);
                    return var4;
                  } else {
                    L5: {
                      if (param2 < this.field_m) {
                        break L5;
                      } else {
                        if (this.field_f <= param2) {
                          break L5;
                        } else {
                          return var4;
                        }
                      }
                    }
                    return -1;
                  }
                }
              } else {
                g.field_o = fj.a(qd.field_l, (byte) -119, param2);
                return var4;
              }
            } else {
              g.field_o = fj.a(va.field_c, (byte) -119, param2);
              return var4;
            }
          } else {
            return -1;
          }
        }
    }

    private final int e(int param0, int param1) {
        int var4 = -87 % ((param1 - -65) / 43);
        int var3 = 10 != this.field_o ? 0 : (int)this.field_t;
        if (!((this.field_o ^ -1) != -2)) {
            return (param0 ^ -1) == -1 ? 43 : 35 * (param0 - 1) + 165 + -var3;
        }
        if (!((em.field_i[this.field_o][param0] ^ -1) != -27)) {
            return 445;
        }
        return -var3 + ((this.field_o != 0 ? 43 : 165) + 35 * param0);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        L0: {
          var12 = HoldTheLine.field_D;
          var7 = 50 - this.field_s - -(5 * param1);
          if (0 <= var7) {
            break L0;
          } else {
            var7 = 0;
            break L0;
          }
        }
        L1: {
          L2: {
            var7 = var7 + this.field_q[param1];
            if (-5 != (this.field_y ^ -1)) {
              break L2;
            } else {
              param0 = 0;
              if (var12 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          if (3 == this.field_y) {
            param0 = (int)((double)param0 * ((-1.0 + Math.exp((double)((float)(-this.field_w + 40) * 0.20000000298023224f))) / (-1.0 + Math.exp(8.0))));
            break L1;
          } else {
            break L1;
          }
        }
        L3: {
          var8 = 123 % ((-51 - param3) / 46);
          if (this.field_y != 2) {
            break L3;
          } else {
            if (param1 != this.field_v) {
              var7 = -(5 * (-param1 + this.field_a)) + (25 + this.field_r);
              if (-1 >= (var7 ^ -1)) {
                break L3;
              } else {
                var7 = 0;
                break L3;
              }
            } else {
              break L3;
            }
          }
        }
        L4: {
          L5: {
            L6: {
              L7: {
                L8: {
                  L9: {
                    var9 = (int)((double)we.field_n * (-Math.exp((double)((float)var7 * 0.20000000298023224f)) + 1.0));
                    var10 = em.field_i[this.field_o][param1];
                    var11 = var10;
                    if ((var11 ^ -1) != -19) {
                      break L9;
                    } else {
                      if (var12 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (var11 != 19) {
                    break L5;
                  } else {
                    if (var12 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                L10: {
                  L11: {
                    param4 = param4 - (var9 - -165);
                    if (0 >= param4) {
                      break L11;
                    } else {
                      L12: {
                        if (128 > param4) {
                          break L12;
                        } else {
                          ol.field_d = 256;
                          if (var12 == 0) {
                            break L10;
                          } else {
                            break L12;
                          }
                        }
                      }
                      ol.field_d = 256 * param4 / 128;
                      if (var12 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  ol.field_d = 0;
                  break L10;
                }
                if ((-bd.field_S + sf.field_m ^ -1) >= -21) {
                  break L4;
                } else {
                  qf.a(293, cf.field_r);
                  bd.field_S = sf.field_m;
                  if (var12 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              L13: {
                param4 = param4 - (-7 + (172 + var9));
                if (-1 > (param4 ^ -1)) {
                  break L13;
                } else {
                  ll.a(-111, 0);
                  if (var12 == 0) {
                    break L6;
                  } else {
                    break L13;
                  }
                }
              }
              L14: {
                if (param4 < 128) {
                  break L14;
                } else {
                  ll.a(93, 160);
                  if (var12 == 0) {
                    break L6;
                  } else {
                    break L14;
                  }
                }
              }
              ll.a(-128, param4 * 160 / 128);
              if (var12 == 0) {
                break L6;
              } else {
                break L5;
              }
            }
            break L4;
          }
          super.a(param0, param1, param2, 81, param4, param5);
          break L4;
        }
    }

    final void c(int param0, int param1) {
        if (param1 != -3565) {
            this.field_q = (int[]) null;
        }
        if (0 == this.field_o) {
            cf.field_v = param0;
        }
        qf.a(293, cf.field_r);
        this.a(em.field_i[this.field_o][param0], !this.field_g ? true : false, 103);
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = HoldTheLine.field_D;
                    var2 = 0;
                    if (param0 == 1) {
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
                    if ((var2 ^ -1) <= -17) {
                        statePc = 16;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var4 != 0) {
                        statePc = 16;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (ok.field_e == var2) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if ((v.field_E ^ -1) != (var2 ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    stackIn_9_0 = 40;
                    statePc = 9;
                    continue stateLoop;
                }
                case 7: {
                    stackIn_9_0 = 32;
                    statePc = 9;
                    continue stateLoop;
                }
                case 8: {
                    stackIn_9_0 = 48;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var3 = stackIn_9_0;
                    if (vl.field_h[var2] > var3) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (vl.field_h[var2] < var3) {
                        statePc = 12;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 12: {
                    vl.field_h[var2] = vl.field_h[var2] + 1;
                    if (var4 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    vl.field_h[var2] = vl.field_h[var2] - 1;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    var2++;
                    if (var4 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        long[] dupTemp$0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        hj stackIn_22_2 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        hj stackIn_23_2 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        hj stackIn_24_2 = null;
        int stackIn_24_3 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        hj stackIn_25_2 = null;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        hj stackIn_26_2 = null;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        hj stackIn_27_2 = null;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int stackIn_27_7 = 0;
        String stackIn_35_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        String stackIn_62_0 = null;
        int stackIn_68_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_78_0 = 0;
        String stackIn_102_0 = null;
        int statePc = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        String[][] var7 = null;
        int var8 = 0;
        String[] var9 = null;
        String var9_ref = null;
        hj var10_ref_hj = null;
        long[] var10_ref_long__ = null;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16_int = 0;
        String var16 = null;
        int var17 = 0;
        String var18 = null;
        int var19 = 0;
        int var20 = 0;
        String[] var21 = null;
        long[] var22 = null;
        vk var23 = null;
        String var24 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = HoldTheLine.field_D;
                    var6 = 6 / ((23 - param3) / 55);
                    var7_int = param2;
                    if (var7_int == 0) {
                        statePc = 9;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (var7_int != 1) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (var20 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if ((var7_int ^ -1) != -3) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var20 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if ((var7_int ^ -1) == -4) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var5 = 32;
                    if (var20 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var5 = 34;
                    if (var20 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var5 = 33;
                    if (var20 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var5 = 35;
                    if (var20 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    throw new RuntimeException();
                }
                case 14: {
                    cg.a(30 + -param1, 170, 580, (byte) 41, 260);
                    if (null != mg.field_g[param2]) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (-1 == var5) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    mg.field_g[param2] = il.a(5, 3, var5, 10, (byte) -66);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var7 = mg.field_g[param2].field_m;
                    var8 = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (-5 >= (var8 ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var23 = tk.field_c[param2][var8];
                    var23.b(3);
                    var10_ref_hj = var23.a(9392, 0, 60);
                    if (var20 != 0) {
                        statePc = 30;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (var10_ref_hj == null) {
                        statePc = 28;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = this;
                    stackIn_22_0 = stackIn_23_0;
                    stackIn_23_1 = -141;
                    stackIn_22_1 = stackIn_23_1;
                    stackIn_23_2 = (hj) (var10_ref_hj);
                    stackIn_22_2 = stackIn_23_2;
                    if ((var8 ^ -1) != (ci.field_j ^ -1)) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_24_0 = this;
                    stackIn_24_1 = stackIn_22_1;
                    stackIn_24_2 = (hj) ((Object) stackIn_22_2);
                    stackIn_24_3 = 16777215;
                    statePc = 24;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = this;
                    stackIn_24_1 = stackIn_23_1;
                    stackIn_24_2 = (hj) ((Object) stackIn_23_2);
                    stackIn_24_3 = vk.field_q[param2];
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_26_0 = this;
                    stackIn_25_0 = stackIn_26_0;
                    stackIn_26_1 = stackIn_24_1;
                    stackIn_25_1 = stackIn_26_1;
                    stackIn_26_2 = (hj) ((Object) stackIn_24_2);
                    stackIn_25_2 = stackIn_26_2;
                    stackIn_26_3 = stackIn_24_3;
                    stackIn_25_3 = stackIn_26_3;
                    stackIn_26_4 = -param1 + (32 + cj.field_K[var8]);
                    stackIn_25_4 = stackIn_26_4;
                    stackIn_26_5 = 190;
                    stackIn_25_5 = stackIn_26_5;
                    stackIn_26_6 = 2;
                    stackIn_25_6 = stackIn_26_6;
                    if (ci.field_j != var8) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = this;
                    stackIn_27_1 = stackIn_25_1;
                    stackIn_27_2 = (hj) ((Object) stackIn_25_2);
                    stackIn_27_3 = stackIn_25_3;
                    stackIn_27_4 = stackIn_25_4;
                    stackIn_27_5 = stackIn_25_5;
                    stackIn_27_6 = stackIn_25_6;
                    stackIn_27_7 = 0;
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = this;
                    stackIn_27_1 = stackIn_26_1;
                    stackIn_27_2 = (hj) ((Object) stackIn_26_2);
                    stackIn_27_3 = stackIn_26_3;
                    stackIn_27_4 = stackIn_26_4;
                    stackIn_27_5 = stackIn_26_5;
                    stackIn_27_6 = stackIn_26_6;
                    stackIn_27_7 = wd.field_l[param2];
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    this.a(stackIn_27_1, stackIn_27_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7);
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    var8++;
                    if (var20 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    q.a(gl.field_a, HoldTheLine.field_F, 0, 280 + -param1, (byte) -127, 204);
                    var8 = 0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (var7 != null) {
                        statePc = 32;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var21 = var7[param0];
                    var9 = var21;
                    dupTemp$0 = mg.field_g[param2].field_k[param0];
                    var22 = dupTemp$0;
                    var10_ref_long__ = dupTemp$0;
                    var11 = mg.field_g[param2].field_p[param0];
                    var12 = -1;
                    var13 = -1;
                    var14 = 0;
                    var15 = 0;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (-11 >= (var15 ^ -1)) {
                        statePc = 59;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    stackIn_102_0 = var21[var15];
                    stackIn_35_0 = stackIn_102_0;
                    if (var20 != 0) {
                        statePc = 102;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (stackIn_35_0 != null) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (var20 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (eb.field_o == null) {
                        statePc = 51;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (!ra.a(var21[var15], false)) {
                        statePc = 51;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (eb.field_o.field_m == var22[var15]) {
                        statePc = 42;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var16_int = 1;
                    var17 = 0;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (-5 >= (var17 ^ -1)) {
                        statePc = 49;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackIn_52_0 = eb.field_o.field_r[var17] ^ -1;
                    stackIn_45_0 = stackIn_52_0;
                    stackIn_52_1 = var11[5 * var15 + var17] ^ -1;
                    stackIn_45_1 = stackIn_52_1;
                    if (var20 != 0) {
                        statePc = 52;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (stackIn_45_0 == stackIn_45_1) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var16_int = 0;
                    if (var20 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var17++;
                    if (var20 == 0) {
                        statePc = 43;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (var16_int == 0) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var12 = var15;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    stackIn_52_0 = 0;
                    stackIn_52_1 = ci.field_j ^ -1;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (stackIn_52_0 != stackIn_52_1) {
                        statePc = 54;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (0 == (var13 ^ -1)) {
                        statePc = 57;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (var14 > var11[var15 * 5 + 1 - -ci.field_j]) {
                        statePc = 57;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var13 = var15;
                    var14 = var11[1 + 5 * var15 - -ci.field_j];
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    var15++;
                    if (var20 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var15 = 220 + nm.field_c.field_G + -6;
                    var16_int = 0;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if (10 <= var16_int) {
                        statePc = 86;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    stackIn_102_0 = var21[var16_int];
                    stackIn_62_0 = stackIn_102_0;
                    if (var20 != 0) {
                        statePc = 102;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (stackIn_62_0 == null) {
                        statePc = 84;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if ((var12 ^ -1) != (var16_int ^ -1)) {
                        statePc = 65;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    stackIn_68_0 = 5;
                    statePc = 68;
                    continue stateLoop;
                }
                case 65: {
                    if ((var13 ^ -1) != (var16_int ^ -1)) {
                        statePc = 67;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    stackIn_68_0 = 3;
                    statePc = 68;
                    continue stateLoop;
                }
                case 67: {
                    stackIn_68_0 = 0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    var17 = stackIn_68_0;
                    var18 = var21[var16_int];
                    am.a(-param1 + 54, 1 + var16_int + ". ", true, HoldTheLine.field_F, var15, var17);
                    ei.a(54 + -param1, 1, var18, var17, var15, HoldTheLine.field_F);
                    if (var12 != var16_int) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    stackIn_73_0 = 5;
                    statePc = 73;
                    continue stateLoop;
                }
                case 70: {
                    if (var13 != var16_int) {
                        statePc = 72;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    stackIn_73_0 = 2;
                    statePc = 73;
                    continue stateLoop;
                }
                case 72: {
                    stackIn_73_0 = 1;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    var17 = stackIn_73_0;
                    ei.a(-param1 + 235, 1, cb.a(42, -var11[5 * var16_int]), var17, var15, HoldTheLine.field_F);
                    if ((var16_int ^ -1) != (var13 ^ -1)) {
                        statePc = 75;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    stackIn_78_0 = 3;
                    statePc = 78;
                    continue stateLoop;
                }
                case 75: {
                    if (var12 != var16_int) {
                        statePc = 77;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    stackIn_78_0 = 5;
                    statePc = 78;
                    continue stateLoop;
                }
                case 77: {
                    stackIn_78_0 = 0;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    var17 = stackIn_78_0;
                    var19 = 0;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    if (-5 >= (var19 ^ -1)) {
                        statePc = 83;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    q.a(io.a(var11[5 * var16_int - (-1 + -var19)], (byte) -61), HoldTheLine.field_F, var17, 32 + cj.field_K[var19] + -param1, (byte) -127, var15);
                    var19++;
                    if (var20 != 0) {
                        statePc = 85;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (var20 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    var8 = 1;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    var16_int++;
                    var15 += 20;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    if (var20 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (-1 != var12) {
                        statePc = 94;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (eb.field_o == null) {
                        statePc = 94;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if (var5 != eb.field_o.field_j) {
                        statePc = 94;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var16 = ng.field_e;
                    ei.a(-param1 + 54, 1, var16, 5, var15, HoldTheLine.field_F);
                    ei.a(240 - param1, 1, cb.a(48, -eb.field_o.field_r[0]), 5, var15, HoldTheLine.field_F);
                    var17 = 0;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    if (var17 >= 4) {
                        statePc = 94;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    q.a(io.a(eb.field_o.field_r[1 - -var17], (byte) -61), HoldTheLine.field_F, 5, cj.field_K[var17] + (32 - param1), (byte) -127, var15);
                    var17++;
                    if (var20 != 0) {
                        statePc = 104;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (var20 == 0) {
                        statePc = 90;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if (var8 != 0) {
                        statePc = 104;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    if (40 > sf.field_m % 80) {
                        statePc = 97;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (var7 == null) {
                        statePc = 101;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (!mg.field_g[param2].field_j) {
                        statePc = 100;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    stackIn_102_0 = an.field_d;
                    statePc = 102;
                    continue stateLoop;
                }
                case 100: {
                    stackIn_102_0 = ri.field_d;
                    statePc = 102;
                    continue stateLoop;
                }
                case 101: {
                    stackIn_102_0 = fm.field_b;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    var24 = stackIn_102_0;
                    var9_ref = var24;
                    var10 = 90 + (220 + nm.field_c.field_G);
                    nm.field_c.b(var24, 337 - param1, var10, 0, -1);
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void o(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        L0: {
          if (99 == aa.field_n) {
            break L0;
          } else {
            if (-99 == (aa.field_n ^ -1)) {
              break L0;
            } else {
              L1: {
                if (this.field_c == 0) {
                  break L1;
                } else {
                  L2: {
                    if (-2 != (this.field_c ^ -1)) {
                      break L2;
                    } else {
                      L3: {
                        if ((aa.field_n ^ -1) == -85) {
                          qf.a(293, cf.field_r);
                          if ((tn.field_a ^ -1) == 0) {
                            break L3;
                          } else {
                            if (tn.field_a == ha.field_p) {
                              break L3;
                            } else {
                              L4: {
                                L5: {
                                  if ((pj.field_m ^ -1) != (en.field_b ^ -1)) {
                                    break L5;
                                  } else {
                                    if ((wa.field_j ^ -1) != (ha.field_p ^ -1)) {
                                      break L5;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                wa.field_j = ha.field_p;
                                this.field_t = this.field_t - 640.0f;
                                en.field_b = pj.field_m;
                                break L4;
                              }
                              this.field_p = 640;
                              ha.field_p = tn.field_a;
                              break L3;
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                      L6: {
                        if ((aa.field_n ^ -1) != -97) {
                          break L6;
                        } else {
                          fieldTemp$0 = tn.field_a - 1;
                          tn.field_a = tn.field_a - 1;
                          if (fieldTemp$0 >= 0) {
                            break L6;
                          } else {
                            tn.field_a = 3;
                            break L6;
                          }
                        }
                      }
                      if (97 != aa.field_n) {
                        break L2;
                      } else {
                        fieldTemp$1 = tn.field_a + 1;
                        tn.field_a = tn.field_a + 1;
                        if ((fieldTemp$1 ^ -1) <= -5) {
                          tn.field_a = 0;
                          if (HoldTheLine.field_D == 0) {
                            break L2;
                          } else {
                            break L1;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L7: {
                    if (param0 == -1) {
                      break L7;
                    } else {
                      field_u = (j) null;
                      break L7;
                    }
                  }
                  return;
                }
              }
              this.b(this.field_c, -24489);
              return;
            }
          }
        }
        L8: {
          stackIn_5_0 = this;

          if (0 != this.field_c) {
            stackIn_6_0 = this;
            stackIn_6_1 = 0;
            break L8;
          } else {
            stackIn_6_0 = this;
            stackIn_6_1 = 1;
            break L8;
          }
        }
        ((ti) (this)).field_c = stackIn_6_1;
        if (this.field_c != 1) {
          return;
        } else {
          L9: {
            if (tn.field_a == -1) {
              tn.field_a = 0;
              break L9;
            } else {
              break L9;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_30_0 = 0;
        int var3;
        int var4;
        L0: {
          var4 = HoldTheLine.field_D;
          if (param0 == 1) {
            break L0;
          } else {
            this.i(-61);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              L4: {
                L5: {
                  L6: {
                    L7: {
                      L8: {
                        var3 = em.field_i[this.field_o][param1];
                        if (var3 != 5) {
                          break L8;
                        } else {
                          if (var4 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (-11 != (var3 ^ -1)) {
                          break L9;
                        } else {
                          if (var4 == 0) {
                            break L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (var3 != 24) {
                          break L10;
                        } else {
                          if (var4 == 0) {
                            break L6;
                          } else {
                            break L10;
                          }
                        }
                      }
                      if (-26 == (var3 ^ -1)) {
                        break L5;
                      } else {
                        L11: {
                          if (18 != var3) {
                            break L11;
                          } else {
                            if (var4 == 0) {
                              break L4;
                            } else {
                              break L11;
                            }
                          }
                        }
                        if (-20 == (var3 ^ -1)) {
                          break L3;
                        } else {
                          break L1;
                        }
                      }
                    }
                    fieldTemp$0 = g.field_o - 1;
                    g.field_o = g.field_o - 1;
                    if ((fieldTemp$0 ^ -1) <= -1) {
                      break L1;
                    } else {
                      g.field_o = 1;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  fieldTemp$1 = ca.field_s - 1;
                  ca.field_s = ca.field_s - 1;
                  if (-1 >= (fieldTemp$1 ^ -1)) {
                    break L2;
                  } else {
                    ca.field_s = 3;
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
                L12: {
                  fieldTemp$2 = qd.field_h - 1;
                  qd.field_h = qd.field_h - 1;
                  stackIn_25_0 = fieldTemp$2 ^ -1;

                  if (-1 != (ih.field_p ^ -1)) {
                    stackIn_26_0 = stackIn_25_0;
                    stackIn_26_1 = 0;
                    break L12;
                  } else {
                    stackIn_26_0 = stackIn_25_0;
                    stackIn_26_1 = 1;
                    break L12;
                  }
                }
                if (stackIn_26_0 <= (stackIn_26_1 ^ -1)) {
                  break L2;
                } else {
                  L13: {
                    if (-1 + od.field_i.length != ih.field_p) {
                      stackIn_30_0 = 2;
                      break L13;
                    } else {
                      stackIn_30_0 = 1;
                      break L13;
                    }
                  }
                  qd.field_h = stackIn_30_0;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              L14: {
                if ((ol.field_d ^ -1) >= -33) {
                  break L14;
                } else {
                  ol.field_d = -32 + 32 * ((ol.field_d * 8 - -256 + -1) / 256);
                  qf.a(293, cf.field_r);
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L14;
                  }
                }
              }
              if (0 < ol.field_d) {
                ol.field_d = 0;
                qf.a(293, cf.field_r);
                if (var4 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              } else {
                break L1;
              }
            }
            L15: {
              if ((mk.field_e ^ -1) >= -21) {
                break L15;
              } else {
                ll.a(param0 ^ -123, (-1 + (-1 + (8 * mk.field_e + 160)) / 160) * 20);
                if (var4 == 0) {
                  break L2;
                } else {
                  break L15;
                }
              }
            }
            ll.a(49, 0);
            break L1;
          }
          break L1;
        }
    }

    ti(int param0) {
        super(em.field_i[param0].length, 15, 360, 165, 35);
        this.field_o = param0;
        this.field_q = new int[em.field_i[param0].length];
        nk.field_J = new int[16];
        vl.field_h = new int[16];
        dm.field_e = new int[16];
        kn.field_b = new int[16];
        co.field_d = new int[16];
        this.b(false, -116);
    }

    final void a(int param0, int param1, boolean param2, byte param3) {
        String[] array$0 = null;
        String stackIn_35_0 = null;
        int stackIn_56_0 = 0;
        int[] stackIn_72_0 = null;
        String[] stackIn_72_1 = null;
        int stackIn_72_2 = 0;
        int[] stackIn_74_0 = null;
        String[] stackIn_74_1 = null;
        int stackIn_74_2 = 0;
        int stackIn_74_3 = 0;
        int[] stackIn_79_0 = null;
        String[] stackIn_79_1 = null;
        int stackIn_79_2 = 0;
        int[] stackIn_80_0 = null;
        String[] stackIn_80_1 = null;
        int stackIn_80_2 = 0;
        int stackIn_80_3 = 0;
        int[] stackIn_85_0 = null;
        String[] stackIn_85_1 = null;
        int stackIn_85_2 = 0;
        int[] stackIn_87_0 = null;
        String[] stackIn_87_1 = null;
        int stackIn_87_2 = 0;
        int stackIn_87_3 = 0;
        String[] stackIn_102_0 = null;
        String[] stackIn_102_1 = null;
        int stackIn_102_2 = 0;
        String[] stackIn_103_0 = null;
        String[] stackIn_103_1 = null;
        int stackIn_103_2 = 0;
        String stackIn_103_3 = null;
        int stackIn_105_2 = 0;
        int stackIn_106_2 = 0;
        String stackIn_106_3 = null;
        int[] stackIn_109_0 = null;
        String[] stackIn_109_1 = null;
        int stackIn_109_2 = 0;
        int[] stackIn_111_0 = null;
        String[] stackIn_111_1 = null;
        int stackIn_111_2 = 0;
        int stackIn_111_3 = 0;
        int[] stackIn_115_0 = null;
        String[] stackIn_115_1 = null;
        int stackIn_115_2 = 0;
        int[] stackIn_117_0;
        String[] stackIn_117_1;
        int stackIn_117_2;
        int stackIn_117_3;
        int stackIn_124_0 = 0;
        int var5;
        int var6;
        float var7_float;
        int var7;
        String var8;
        int var9;
        int var10;
        String var10_ref_String;
        int var11;
        String[] var11_ref_String__;
        int var12;
        int var13;
        int var14;
        String var15;
        L0: {
          var14 = HoldTheLine.field_D;
          var5 = em.field_i[this.field_o][param1];
          if (this.field_y < 3) {
            break L0;
          } else {
            if (var5 == this.field_v) {
              break L0;
            } else {
              return;
            }
          }
        }
        L1: {
          if (param3 < -75) {
            break L1;
          } else {
            this.f(-38);
            break L1;
          }
        }
        L2: {
          var6 = 50 - (this.field_s + -(5 * param1));
          if (-1 < (var6 ^ -1)) {
            var6 = 0;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          L4: {
            var6 = var6 + this.field_q[param1];
            if ((this.field_y ^ -1) != -5) {
              break L4;
            } else {
              param0 = 0;
              if (var14 == 0) {
                break L3;
              } else {
                break L4;
              }
            }
          }
          if (this.field_y != 3) {
            break L3;
          } else {
            var7_float = (float)((Math.exp((double)((float)(40 - this.field_w) * 0.20000000298023224f)) - 1.0) / (Math.exp(8.0) - 1.0));
            param0 = (int)((float)param0 - (float)(param0 - 8) * (1.0f - var7_float));
            break L3;
          }
        }
        L5: {
          if (2 != this.field_y) {
            break L5;
          } else {
            if ((var5 ^ -1) == (this.field_v ^ -1)) {
              break L5;
            } else {
              var6 = 25 + (this.field_r - (-param1 + this.field_a) * 5);
              if ((var6 ^ -1) > -1) {
                var6 = 0;
                break L5;
              } else {
                break L5;
              }
            }
          }
        }
        L6: {
          L7: {
            L8: {
              var7 = (int)((double)we.field_n * (-Math.exp((double)((float)var6 * 0.20000000298023224f)) + 1.0));
              var15 = uk.field_c[var5];
              var8 = var15;
              var8 = var15;
              var8 = var15;
              if (var15 == null) {
                break L8;
              } else {
                if ((this.field_o ^ -1) == -1) {
                  break L7;
                } else {
                  break L8;
                }
              }
            }
            if (this.field_o == 1) {
              break L7;
            } else {
              break L6;
            }
          }
          var8 = var15.toUpperCase();
          break L6;
        }
        L9: {
          if ((var5 ^ -1) != -4) {
            break L9;
          } else {
            L10: {
              if ((lm.field_a ^ -1) == -1) {
                break L10;
              } else {
                if (0 == ej.field_b) {
                  break L10;
                } else {
                  L11: {
                    if (lm.field_a == 1) {
                      break L11;
                    } else {
                      if (-2 == (ej.field_b ^ -1)) {
                        break L11;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var8 = gb.field_J;
                  if (var14 == 0) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
            }
            var8 = uk.field_c[0];
            break L9;
          }
        }
        L12: {
          if (-7 != (var5 ^ -1)) {
            break L12;
          } else {
            L13: {
              if ((ek.field_x ^ -1) != -2) {
                stackIn_35_0 = hk.field_b;
                break L13;
              } else {
                stackIn_35_0 = qj.field_J;
                break L13;
              }
            }
            var8 = stackIn_35_0;
            break L12;
          }
        }
        L14: {
          if (12 != var5) {
            break L14;
          } else {
            if (!nd.field_e) {
              break L14;
            } else {
              var8 = eb.field_p.toUpperCase();
              break L14;
            }
          }
        }
        L15: {
          if (var5 != 7) {
            break L15;
          } else {
            if (bl.field_r == null) {
              break L15;
            } else {
              if (3 != bl.field_r.field_J) {
                break L15;
              } else {
                var8 = sa.field_c.toUpperCase();
                break L15;
              }
            }
          }
        }
        L16: {
          if (-9 == (var5 ^ -1)) {
            L17: {
              if ((this.field_o ^ -1) != -11) {
                break L17;
              } else {
                if (0.0f >= this.field_t) {
                  break L17;
                } else {
                  if (-4 != (ek.field_x ^ -1)) {
                    break L17;
                  } else {
                    var8 = hl.field_c.toUpperCase();
                    if (var14 == 0) {
                      break L16;
                    } else {
                      break L17;
                    }
                  }
                }
              }
            }
            var8 = ka.field_e.toUpperCase();
            break L16;
          } else {
            break L16;
          }
        }
        L18: {
          if (var8 != null) {
            break L18;
          } else {
            var8 = "ERROR: missing text";
            break L18;
          }
        }
        L19: {
          L20: {
            if (!param2) {
              break L20;
            } else {
              if (-2 != (this.field_y ^ -1)) {
                break L20;
              } else {
                stackIn_56_0 = 2;
                break L19;
              }
            }
          }
          stackIn_56_0 = 1;
          break L19;
        }
        L21: {
          var9 = stackIn_56_0;
          if (this.field_v != var5) {
            break L21;
          } else {
            L22: {
              if (this.field_y == 3) {
                break L22;
              } else {
                if (-3 != (this.field_y ^ -1)) {
                  break L21;
                } else {
                  break L22;
                }
              }
            }
            var9 = 5;
            break L21;
          }
        }
        L23: {
          L24: {
            if ((var5 ^ -1) == -25) {
              break L24;
            } else {
              L25: {
                if ((var5 ^ -1) == -26) {
                  break L25;
                } else {
                  L26: {
                    if (26 != var5) {
                      break L26;
                    } else {
                      fl.a(var8, var7, var9, -1753, param0);
                      if (var14 == 0) {
                        break L23;
                      } else {
                        break L26;
                      }
                    }
                  }
                  L27: {
                    L28: {
                      if (var5 == 0) {
                        break L28;
                      } else {
                        if (-4 != (var5 ^ -1)) {
                          break L27;
                        } else {
                          break L28;
                        }
                      }
                    }
                    L29: {
                      L30: {
                        stackIn_72_0 = th.field_k;

                        stackIn_72_1 = new String[]{var8};

                        stackIn_72_2 = 82;

                        if (!param2) {
                          break L30;
                        } else {






                          if ((this.field_y ^ -1) == -2) {
                            stackIn_74_0 = (int[]) ((Object) stackIn_72_0);
                            stackIn_74_1 = (String[]) ((Object) stackIn_72_1);
                            stackIn_74_2 = stackIn_72_2;
                            stackIn_74_3 = 0;
                            break L29;
                          } else {
                            stackIn_72_0 = (int[]) ((Object) stackIn_72_0);
                            stackIn_72_1 = (String[]) ((Object) stackIn_72_1);

                            break L30;
                          }
                        }
                      }
                      stackIn_74_0 = (int[]) ((Object) stackIn_72_0);
                      stackIn_74_1 = (String[]) ((Object) stackIn_72_1);
                      stackIn_74_2 = stackIn_72_2;
                      stackIn_74_3 = -1;
                      break L29;
                    }
                    fk.a(stackIn_74_0, stackIn_74_1, stackIn_74_2, stackIn_74_3, param0, -1, var7);
                    if (var14 == 0) {
                      break L23;
                    } else {
                      break L27;
                    }
                  }
                  L31: {
                    if ((var5 ^ -1) != -6) {
                      break L31;
                    } else {
                      L32: {
                        L33: {
                          stackIn_79_0 = va.field_c;

                          stackIn_79_1 = th.field_n;

                          stackIn_79_2 = -120;

                          if (!param2) {
                            break L33;
                          } else {
                            stackIn_79_0 = (int[]) ((Object) stackIn_79_0);

                            stackIn_79_1 = (String[]) ((Object) stackIn_79_1);

                            if (1 != this.field_y) {
                              break L33;
                            } else {
                              stackIn_80_0 = (int[]) ((Object) stackIn_79_0);
                              stackIn_80_1 = (String[]) ((Object) stackIn_79_1);
                              stackIn_80_2 = stackIn_79_2;
                              stackIn_80_3 = g.field_o;
                              break L32;
                            }
                          }
                        }
                        stackIn_80_0 = (int[]) ((Object) stackIn_79_0);
                        stackIn_80_1 = (String[]) ((Object) stackIn_79_1);
                        stackIn_80_2 = stackIn_79_2;
                        stackIn_80_3 = -1;
                        break L32;
                      }
                      fk.a(stackIn_80_0, stackIn_80_1, stackIn_80_2, stackIn_80_3, param0, -1, var7);
                      if (var14 == 0) {
                        break L23;
                      } else {
                        break L31;
                      }
                    }
                  }
                  L34: {
                    if ((var5 ^ -1) != -11) {
                      break L34;
                    } else {
                      L35: {
                        L36: {
                          stackIn_85_0 = qd.field_l;

                          stackIn_85_1 = ki.field_i;

                          stackIn_85_2 = -127;

                          if (!param2) {
                            break L36;
                          } else {






                            if ((this.field_y ^ -1) == -2) {
                              stackIn_87_0 = (int[]) ((Object) stackIn_85_0);
                              stackIn_87_1 = (String[]) ((Object) stackIn_85_1);
                              stackIn_87_2 = stackIn_85_2;
                              stackIn_87_3 = g.field_o;
                              break L35;
                            } else {
                              stackIn_85_0 = (int[]) ((Object) stackIn_85_0);
                              stackIn_85_1 = (String[]) ((Object) stackIn_85_1);

                              break L36;
                            }
                          }
                        }
                        stackIn_87_0 = (int[]) ((Object) stackIn_85_0);
                        stackIn_87_1 = (String[]) ((Object) stackIn_85_1);
                        stackIn_87_2 = stackIn_85_2;
                        stackIn_87_3 = -1;
                        break L35;
                      }
                      fk.a(stackIn_87_0, stackIn_87_1, stackIn_87_2, stackIn_87_3, param0, -1, var7);
                      if (var14 == 0) {
                        break L23;
                      } else {
                        break L34;
                      }
                    }
                  }
                  L37: {
                    if (var5 != this.field_v) {
                      break L37;
                    } else {
                      if (this.field_y != 3) {
                        break L37;
                      } else {
                        var10 = (-this.field_w + 80) * this.field_w;
                        var10 = (-var10 + 3200) * var10;
                        var11 = var10 * 381 / 2560000;
                        var12 = (-nm.field_c.a(var8) + 640) / 2;
                        var13 = 15 - -(var10 * (-15 + var12) / 2560000);
                        rd.a(var11, var9, (byte) -83, var13, param0, var8);
                        if (var14 == 0) {
                          break L23;
                        } else {
                          break L37;
                        }
                      }
                    }
                  }
                  v.a((byte) -122, var8, var9, var7, param0);
                  if (var14 == 0) {
                    break L23;
                  } else {
                    break L25;
                  }
                }
              }
              L38: {
                L39: {
                  var10_ref_String = uk.field_c[3];
                  if (0 == lm.field_a) {
                    break L39;
                  } else {
                    if (-1 == (ej.field_b ^ -1)) {
                      break L39;
                    } else {
                      L40: {
                        if (-2 == (lm.field_a ^ -1)) {
                          break L40;
                        } else {
                          if (ej.field_b != 1) {
                            break L38;
                          } else {
                            break L40;
                          }
                        }
                      }
                      var10_ref_String = gb.field_J;
                      if (var14 == 0) {
                        break L38;
                      } else {
                        break L39;
                      }
                    }
                  }
                }
                var10_ref_String = uk.field_c[0];
                break L38;
              }
              L41: {
                array$0 = new String[3];
                stackIn_102_0 = (String[]) (array$0);

                stackIn_102_1 = (String[]) (array$0);

                stackIn_102_2 = 0;

                if (0 >= ih.field_p) {
                  stackIn_103_0 = (String[]) ((Object) stackIn_102_0);
                  stackIn_103_1 = (String[]) ((Object) stackIn_102_1);
                  stackIn_103_2 = stackIn_102_2;
                  stackIn_103_3 = "";
                  break L41;
                } else {
                  stackIn_103_0 = (String[]) ((Object) stackIn_102_0);
                  stackIn_103_1 = (String[]) ((Object) stackIn_102_1);
                  stackIn_103_2 = stackIn_102_2;
                  stackIn_103_3 = lg.field_r;
                  break L41;
                }
              }
              L42: {
                stackIn_103_1[stackIn_103_2] = stackIn_103_3;
                stackIn_103_0[1] = var10_ref_String;




                stackIn_105_2 = 2;

                if (-7 >= (ih.field_p ^ -1)) {
                  stackIn_103_0 = (String[]) ((Object) stackIn_103_0);
                  stackIn_103_0 = (String[]) ((Object) stackIn_103_0);
                  stackIn_106_2 = stackIn_105_2;
                  stackIn_106_3 = "";
                  break L42;
                } else {
                  stackIn_103_0 = (String[]) ((Object) stackIn_103_0);
                  stackIn_103_0 = (String[]) ((Object) stackIn_103_0);
                  stackIn_106_2 = stackIn_105_2;
                  stackIn_106_3 = ej.field_d;
                  break L42;
                }
              }
              L43: {
                L44: {
                  stackIn_103_0[stackIn_106_2] = stackIn_106_3;
                  var11_ref_String__ = stackIn_103_0;
                  stackIn_109_0 = mo.field_v;

                  stackIn_109_1 = (String[]) (var11_ref_String__);

                  stackIn_109_2 = -111;

                  if (!param2) {
                    break L44;
                  } else {






                    if (-2 == (this.field_y ^ -1)) {
                      stackIn_111_0 = (int[]) ((Object) stackIn_109_0);
                      stackIn_111_1 = (String[]) ((Object) stackIn_109_1);
                      stackIn_111_2 = stackIn_109_2;
                      stackIn_111_3 = qd.field_h;
                      break L43;
                    } else {
                      stackIn_109_0 = (int[]) ((Object) stackIn_109_0);
                      stackIn_109_1 = (String[]) ((Object) stackIn_109_1);

                      break L44;
                    }
                  }
                }
                stackIn_111_0 = (int[]) ((Object) stackIn_109_0);
                stackIn_111_1 = (String[]) ((Object) stackIn_109_1);
                stackIn_111_2 = stackIn_109_2;
                stackIn_111_3 = -1;
                break L43;
              }
              fk.a(stackIn_111_0, stackIn_111_1, stackIn_111_2, stackIn_111_3, param0, -1, var7);
              if (var14 == 0) {
                break L23;
              } else {
                break L24;
              }
            }
          }
          L45: {
            L46: {
              stackIn_115_0 = qb.field_a;

              stackIn_115_1 = pg.field_L;

              stackIn_115_2 = -121;

              if (!param2) {
                break L46;
              } else {






                if (1 == this.field_y) {
                  stackIn_117_0 = (int[]) ((Object) stackIn_115_0);
                  stackIn_117_1 = (String[]) ((Object) stackIn_115_1);
                  stackIn_117_2 = stackIn_115_2;
                  stackIn_117_3 = ca.field_s;
                  break L45;
                } else {
                  stackIn_115_0 = (int[]) ((Object) stackIn_115_0);
                  stackIn_115_1 = (String[]) ((Object) stackIn_115_1);

                  break L46;
                }
              }
            }
            stackIn_117_0 = (int[]) ((Object) stackIn_115_0);
            stackIn_117_1 = (String[]) ((Object) stackIn_115_1);
            stackIn_117_2 = stackIn_115_2;
            stackIn_117_3 = -1;
            break L45;
          }
          fk.a(stackIn_117_0, stackIn_117_1, stackIn_117_2, stackIn_117_3, param0, 1 + pj.field_m, var7);
          break L23;
        }
        L47: {
          L48: {
            if (18 == var5) {
              break L48;
            } else {
              if (var5 != 19) {
                break L47;
              } else {
                break L48;
              }
            }
          }
          L49: {
            if (-19 == (var5 ^ -1)) {
              stackIn_124_0 = ol.field_d * 128 / 256;
              break L49;
            } else {
              stackIn_124_0 = mk.field_e * 128 / 160;
              break L49;
            }
          }
          var10 = stackIn_124_0;
          var11 = 172 + var7;
          this.b(param0, (byte) -52, var11, var10);
          break L47;
        }
    }

    private final void n(int param0) {
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        int stackIn_33_4 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        String stackIn_65_0 = null;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        float var8_float = 0.0f;
        vk var8 = null;
        float var9_float = 0.0f;
        int[] var9 = null;
        float var10_float = 0.0f;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14_int = 0;
        String var14 = null;
        float var15 = 0.0f;
        float var16 = 0.0f;
        int var17 = 0;
        int var18 = 0;
        int[] var19 = null;
        int[] var20 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = HoldTheLine.field_D;
                    var2 = -(int)this.field_t + 570;
                    if (-3 > (this.field_y ^ -1)) {
                        statePc = 4;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var3 = 0;
                    if ((this.field_y ^ -1) != -3) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var4 = this.field_r + 25 + -((this.field_a - -1) * 5);
                    var3 = (int)((double)we.field_n * (-Math.exp((double)(0.20000000298023224f * (float)var4)) + 1.0));
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    fl.a(ik.field_e, var3, 1, -1753, 488 - (int)this.field_t);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var3 = 0;
                    if (param0 == -10967) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_y = 8;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var4 = 298;
                    var5 = 224;
                    var6 = 331;
                    var7 = 10 + var2;
                    stackIn_8_0 = this;
                    stackIn_7_0 = stackIn_8_0;
                    stackIn_8_1 = this.e(0, -110) + 480;
                    stackIn_7_1 = stackIn_8_1;
                    stackIn_8_2 = 0;
                    stackIn_7_2 = stackIn_8_2;
                    if (this.field_c != 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackIn_9_0 = this;
                    stackIn_9_1 = stackIn_7_1;
                    stackIn_9_2 = stackIn_7_2;
                    stackIn_9_3 = 1;
                    statePc = 9;
                    continue stateLoop;
                }
                case 8: {
                    stackIn_9_0 = this;
                    stackIn_9_1 = stackIn_8_1;
                    stackIn_9_2 = stackIn_8_2;
                    stackIn_9_3 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    this.a(stackIn_9_1, stackIn_9_2, stackIn_9_3 != 0, (byte) -94);
                    if (this.field_y != 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var8_int = 80;
                    var9_float = 0.10000000149011612f;
                    var10_float = (float)Math.exp((double)(-var9_float * 80.0f));
                    var11 = -sf.field_m + var8_int;
                    var3 = (int)((Math.exp((double)(var9_float * (float)var11)) - 1.0) * (double)(300.0f * var10_float)) - 10;
                    var6 = var6 + (-5 + (int)((Math.exp((double)(var9_float * (float)(-5 + var11))) - 1.0) * (double)(var10_float * 300.0f)));
                    if (var18 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if ((this.field_y ^ -1) != -3) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (0 != (ej.field_b ^ -1)) {
                        statePc = 22;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (2 >= this.field_y) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (ej.field_b != -1) {
                        statePc = 70;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (1 < this.field_y) {
                        statePc = 19;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (0 != (ej.field_b ^ -1)) {
                        statePc = 23;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var8_float = 0.20000000298023224f;
                    var9_float = -(float)Math.exp((double)(-var8_float * (float)sf.field_m)) + 1.0f;
                    var4 = (int)(var9_float * 342.0f) + 298;
                    var6 = (int)((1.0f - var9_float) * (float)var6);
                    var5 = (int)(var9_float * 256.0f) + 224;
                    var3 = (int)(600.0f * var9_float);
                    var7 = (int)((float)var7 * (-var9_float + 1.0f));
                    if (var18 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    return;
                }
                case 22: {
                    var8_float = 0.10000000149011612f;
                    var9_float = (float)Math.exp((double)(-var8_float * 80.0f));
                    var10 = this.field_r + 40;
                    var3 = (int)((-1.0 + Math.exp((double)(var8_float * (float)var10))) * (double)(300.0f * var9_float));
                    var6 = var6 + (int)((-1.0 + Math.exp((double)(var8_float * (float)(var10 - -5)))) * (double)(var9_float * 300.0f));
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var8 = kn.b((byte) -49);
                    nm.field_c.b(ue.field_c + var8.field_b, var3 + 320, var2, 0, -1);
                    var2 += 15;
                    if (we.field_o != null) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    we.field_o = new hj(640, 480);
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    vb.a(-72, we.field_o);
                    vl.a(0);
                    ug.b(param0 + 10966);
                    tc.c(var6 + -5, var7 - 5, 10 + var4, var5 - -10, 0, 128);
                    if (bl.field_r == null) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (-4 != (bl.field_r.field_r ^ -1)) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    tc.f(var6, var7, var4, var5, 0);
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    we.field_o.a(var6, var7, var4, var5);
                    var2 += 247;
                    nm.field_c.b(jc.field_a, -var3 + 320, var2, 0, -1);
                    var2 += 8;
                    var9 = go.field_g[var8.field_p];
                    stackIn_31_0 = 166 + -var3;
                    stackIn_29_0 = stackIn_31_0;
                    stackIn_31_1 = -5 + var2;
                    stackIn_29_1 = stackIn_31_1;
                    stackIn_31_2 = 148;
                    stackIn_29_2 = stackIn_31_2;
                    stackIn_31_3 = 114;
                    stackIn_29_3 = stackIn_31_3;
                    if (var9[0] != t.field_l) {
                        statePc = 31;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_32_0 = stackIn_29_0;
                    stackIn_30_0 = stackIn_32_0;
                    stackIn_32_1 = stackIn_29_1;
                    stackIn_30_1 = stackIn_32_1;
                    stackIn_32_2 = stackIn_29_2;
                    stackIn_30_2 = stackIn_32_2;
                    stackIn_32_3 = stackIn_29_3;
                    stackIn_30_3 = stackIn_32_3;
                    if ((this.field_c ^ -1) == -2) {
                        statePc = 32;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = stackIn_30_0;
                    stackIn_31_1 = stackIn_30_1;
                    stackIn_31_2 = stackIn_30_2;
                    stackIn_31_3 = stackIn_30_3;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_33_0 = stackIn_31_0;
                    stackIn_33_1 = stackIn_31_1;
                    stackIn_33_2 = stackIn_31_2;
                    stackIn_33_3 = stackIn_31_3;
                    stackIn_33_4 = 0;
                    statePc = 33;
                    continue stateLoop;
                }
                case 32: {
                    stackIn_33_0 = stackIn_32_0;
                    stackIn_33_1 = stackIn_32_1;
                    stackIn_33_2 = stackIn_32_2;
                    stackIn_33_3 = stackIn_32_3;
                    stackIn_33_4 = 16777215;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    tc.c(stackIn_33_0, stackIn_33_1, stackIn_33_2, stackIn_33_3, stackIn_33_4, 128);
                    oe.field_i.a(104, var9[0], 9, 138).b(-var3 + 171, var2);
                    stackIn_36_0 = var3 + 326;
                    stackIn_34_0 = stackIn_36_0;
                    stackIn_36_1 = -5 + var2;
                    stackIn_34_1 = stackIn_36_1;
                    stackIn_36_2 = 148;
                    stackIn_34_2 = stackIn_36_2;
                    stackIn_36_3 = 114;
                    stackIn_34_3 = stackIn_36_3;
                    if ((var9[1] ^ -1) != (t.field_l ^ -1)) {
                        statePc = 36;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    stackIn_37_0 = stackIn_34_0;
                    stackIn_35_0 = stackIn_37_0;
                    stackIn_37_1 = stackIn_34_1;
                    stackIn_35_1 = stackIn_37_1;
                    stackIn_37_2 = stackIn_34_2;
                    stackIn_35_2 = stackIn_37_2;
                    stackIn_37_3 = stackIn_34_3;
                    stackIn_35_3 = stackIn_37_3;
                    if ((this.field_c ^ -1) == -2) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_36_0 = stackIn_35_0;
                    stackIn_36_1 = stackIn_35_1;
                    stackIn_36_2 = stackIn_35_2;
                    stackIn_36_3 = stackIn_35_3;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    stackIn_38_0 = stackIn_36_0;
                    stackIn_38_1 = stackIn_36_1;
                    stackIn_38_2 = stackIn_36_2;
                    stackIn_38_3 = stackIn_36_3;
                    stackIn_38_4 = 0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 37: {
                    stackIn_38_0 = stackIn_37_0;
                    stackIn_38_1 = stackIn_37_1;
                    stackIn_38_2 = stackIn_37_2;
                    stackIn_38_3 = stackIn_37_3;
                    stackIn_38_4 = 16777215;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    tc.c(stackIn_38_0, stackIn_38_1, stackIn_38_2, stackIn_38_3, stackIn_38_4, 128);
                    oe.field_i.a(104, var9[1], 9, 138).b(var3 + 331, var2);
                    var12 = 0;
                    var20 = new int[4];
                    var19 = var20;
                    var13 = var19;
                    var10 = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    stackIn_40_0 = -5;
                    stackIn_40_1 = var10 ^ -1;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (stackIn_40_0 >= stackIn_40_1) {
                        statePc = 50;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    stackIn_51_0 = 0;
                    stackIn_42_0 = stackIn_51_0;
                    if (var18 != 0) {
                        statePc = 51;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var11 = stackIn_42_0;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (-5 >= (var11 ^ -1)) {
                        statePc = 49;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackIn_40_0 = t.field_j[var11];
                    stackIn_45_0 = stackIn_40_0;
                    stackIn_40_1 = t.field_j[var10];
                    stackIn_45_1 = stackIn_40_1;
                    if (var18 != 0) {
                        statePc = 40;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (stackIn_45_0 > stackIn_45_1) {
                        statePc = 47;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var13[var10] = var13[var10] + 1;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    var11++;
                    if (var18 == 0) {
                        statePc = 43;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var10++;
                    if (var18 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var2 = 640 + -(int)this.field_t;
                    nm.field_c.b(qh.field_e, 160 + -var3, var2, 0, -1);
                    var2 += 40;
                    stackIn_51_0 = 0;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    var10 = stackIn_51_0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    stackIn_53_0 = 4;
                    stackIn_53_1 = var10;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (stackIn_53_0 <= stackIn_53_1) {
                        statePc = 69;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (var18 != 0) {
                        statePc = 69;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var11 = 0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (4 <= var11) {
                        statePc = 67;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    stackIn_53_0 = var10 ^ -1;
                    stackIn_58_0 = stackIn_53_0;
                    stackIn_53_1 = var20[var11] ^ -1;
                    stackIn_58_1 = stackIn_53_1;
                    if (var18 != 0) {
                        statePc = 53;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (stackIn_58_0 != stackIn_58_1) {
                        statePc = 66;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if ((this.field_y ^ -1) == -1) {
                        statePc = 61;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var14_int = 60;
                    var15 = 0.10000000149011612f;
                    var16 = (float)Math.exp((double)(-var15 * 80.0f));
                    var17 = -sf.field_m + var14_int + 5 * var12;
                    var3 = (int)((-1.0 + Math.exp((double)(var15 * (float)var17))) * (double)(var16 * 300.0f));
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (t.field_j[var11] != 1) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    stackIn_65_0 = la.field_h;
                    statePc = 65;
                    continue stateLoop;
                }
                case 64: {
                    stackIn_65_0 = t.field_j[var11] + ij.field_a;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    var14 = stackIn_65_0;
                    nm.field_c.a(var14, -var3 + 170, var2, var11 + 6, -1);
                    nm.field_c.c(rf.field_Y[var10], 150 + -var3, var2, var11 + 6, -1);
                    var12++;
                    var2 += 30;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    var11++;
                    if (var18 == 0) {
                        statePc = 56;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var10++;
                    if (var18 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    return;
                }
                case 70: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int[] a(int param0, int param1, byte param2) {
        int var3 = tn.a(param1, 5255);
        if (param2 >= -42) {
            return (int[]) null;
        }
        int var4 = hc.a(0, param1);
        int var5 = tn.a(param0, 5255);
        int var6 = hc.a(0, param0);
        int var7 = (int)((long)var5 * (long)var3 >> -1918720048);
        int var8 = (int)((long)var3 * (long)var6 >> 1278060368);
        int var9 = (int)((long)var5 * (long)var4 >> 50850512);
        int var10 = (int)((long)var4 * (long)var6 >> -2075183792);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    private final int a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int stackIn_15_0 = 0;
        L0: {
          var6 = HoldTheLine.field_D;
          if (-169 < (param0 ^ -1)) {
            break L0;
          } else {
            if (param0 <= 213) {
              if (param1 == 163) {
                var5 = 0;
                L1: while (true) {
                  L2: {
                    if (-5 >= (var5 ^ -1)) {
                      break L2;
                    } else {
                      stackIn_15_0 = param2 ^ -1;

                      if (var6 != 0) {
                        return stackIn_15_0;
                      } else {
                        L3: {
                          if (stackIn_15_0 > (-param3 + (2 + cj.field_K[var5]) ^ -1)) {
                            break L3;
                          } else {
                            if (param2 <= cj.field_K[var5] - (-62 + param3)) {
                              return var5;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var5++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  return -1;
                }
              } else {
                return -42;
              }
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    private final void a(int param0, hj param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            this.a(param6, 2, param2, param5, param3, param4, param1.field_s, param1, param1.field_y);
            if (param0 != -141) {
                this.field_w = 23;
            }
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ti.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void h(int param0) {
        int stackIn_7_0 = 0;
        double stackIn_9_0 = 0.0;
        double stackIn_10_0 = 0.0;
        double stackIn_11_0 = 0.0;
        int stackIn_11_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_47_0 = 0;
        String stackIn_58_0 = null;
        int stackIn_66_0 = 0;
        int stackIn_75_0 = 0;
        String stackIn_90_0 = null;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        int stackIn_97_3 = 0;
        String stackIn_97_4 = null;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_98_2 = 0;
        int stackIn_98_3 = 0;
        String stackIn_98_4 = null;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        int stackIn_99_3 = 0;
        String stackIn_99_4 = null;
        int stackIn_99_5 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        uf var14 = null;
        uf var15 = null;
        uf var16 = null;
        String var17 = null;
        String var18 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = HoldTheLine.field_D;
                    if (bl.field_r != null) {
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
                    var2 = 140 + -(int)this.field_t;
                    var3 = 0;
                    var4 = 500;
                    if (param0 == 12) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    var5 = 0.10000000149011612f;
                    var6 = (float)Math.exp((double)(400.0f * -var5));
                    if (-2 > (this.field_y ^ -1)) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackIn_7_0 = -sf.field_m + var4;
                    statePc = 7;
                    continue stateLoop;
                }
                case 6: {
                    stackIn_7_0 = sf.field_m;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var7 = stackIn_7_0;
                    if (!bl.field_r.field_E) {
                        statePc = 23;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var8 = (int)((double)(300.0f * var6) * (Math.exp((double)((float)var7 * var5)) - 1.0));
                    stackIn_10_0 = (double)(var6 * 300.0f);
                    stackIn_9_0 = stackIn_10_0;
                    if ((var7 ^ -1) < -11) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_11_0 = stackIn_9_0;
                    stackIn_11_1 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = stackIn_10_0;
                    stackIn_11_1 = -10 + var7;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var9_int = (int)(stackIn_11_0 * (Math.exp((double)((float)stackIn_11_1 * var5)) - 1.0));
                    if (-4 < (bl.field_r.field_C[0].field_R ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var14 = ha.field_o[bl.field_r.field_C[0].field_R];
                    if (null != var14.a(8192)) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    ra.field_hb.a(352, var2 + (-var8 - 64));
                    if (var13 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var14.field_b.a(336, var2 - (var8 - -64));
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (3 <= bl.field_r.field_C[1].field_R) {
                        statePc = 22;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var15 = ha.field_o[bl.field_r.field_C[1].field_R];
                    if (var15.a(8192) != null) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    ra.field_hb.a(192, var2 + (-var9_int + -64));
                    if (var13 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var15.field_b.a(176, -var9_int + var2 + -64);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (var13 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var8 = (int)((-1.0 + Math.exp((double)(var5 * (float)var7))) * (double)(300.0f * var6));
                    if (bl.field_r.field_C[0].field_R < 3) {
                        statePc = 25;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var16 = ha.field_o[bl.field_r.field_C[0].field_R];
                    if (var16.a(param0 + 8180) != null) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    ra.field_hb.a(272, -64 + (-var8 + var2));
                    if (var13 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var16.field_b.a(256, -64 + var2 + -var8);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    var2 += 120;
                    if ((ek.field_x ^ -1) != -6) {
                        statePc = 37;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (-2 <= (this.field_y ^ -1)) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    stackIn_33_0 = sf.field_m;
                    statePc = 33;
                    continue stateLoop;
                }
                case 32: {
                    stackIn_33_0 = -sf.field_m + var4;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    var7 = stackIn_33_0;
                    var7 -= 75;
                    if (-1 < (var7 ^ -1)) {
                        statePc = 35;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var7 = 0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    var8 = 320 - -(int)((double)(var6 * 500.0f) * (Math.exp((double)((float)var7 * var5)) - 1.0));
                    nm.field_c.b("-", var8 + 2, var2, 0, -1);
                    nm.field_c.c(vf.field_u, -8 + var8, var2, 0, -1);
                    nm.field_c.a(bl.field_o, 12 + var8, var2, 0, -1);
                    var2 += 30;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    var9_int = 0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    stackIn_39_0 = var9_int;
                    stackIn_39_1 = 4;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (stackIn_39_0 >= stackIn_39_1) {
                        statePc = 74;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackIn_75_0 = 0;
                    stackIn_41_0 = stackIn_75_0;
                    if (var13 != 0) {
                        statePc = 75;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var10 = stackIn_41_0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (bl.field_r.field_h <= var10) {
                        statePc = 73;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    stackIn_39_0 = this.field_y;
                    stackIn_44_0 = stackIn_39_0;
                    stackIn_39_1 = 1;
                    stackIn_44_1 = stackIn_39_1;
                    if (var13 != 0) {
                        statePc = 39;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (stackIn_44_0 > stackIn_44_1) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    stackIn_47_0 = var4 - sf.field_m;
                    statePc = 47;
                    continue stateLoop;
                }
                case 46: {
                    stackIn_47_0 = sf.field_m;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    var7 = stackIn_47_0;
                    var7 = var7 - (5 + -var3) * 10;
                    if (0 <= var7) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var7 = 0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    var8 = (int)((Math.exp((double)(var5 * (float)var7)) - 1.0) * (double)(var6 * 500.0f));
                    if (var3 % 2 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var8 = 320 + var8;
                    if (var13 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var8 = -var8 + 320;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if ((var9_int ^ -1) != (bl.field_r.field_C[var10].field_R ^ -1)) {
                        statePc = 72;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (ek.field_x == 4) {
                        statePc = 67;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (-6 == (ek.field_x ^ -1)) {
                        statePc = 63;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var11 = ub.field_C[var9_int];
                    if (var11 == 1) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    stackIn_58_0 = var11 + ij.field_a;
                    statePc = 58;
                    continue stateLoop;
                }
                case 57: {
                    stackIn_58_0 = la.field_h;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    var12 = stackIn_58_0;
                    nm.field_c.a(var12, -55 + var8, var2, var10 + 6, -1);
                    nm.field_c.c(rf.field_Y[var9_int], -80 + var8, var2, 6 - -var10, -1);
                    if (pe.field_g[var10] != -1) {
                        statePc = 61;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    nm.field_c.a(ln.field_m, 40 + var8, var2, var10 + 6, -1);
                    if (var13 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    nm.field_c.a(cb.a(48, pe.field_g[var10]), 40 + var8, var2, var10 + 6, -1);
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (var13 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    nm.field_c.c(rf.field_Y[var9_int], var8 - 15, var2, var10 + 6, -1);
                    if (kb.a(param0 + 16604, 0)) {
                        statePc = 65;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    stackIn_66_0 = 1;
                    statePc = 66;
                    continue stateLoop;
                }
                case 65: {
                    stackIn_66_0 = 3;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    var11 = stackIn_66_0;
                    nm.field_c.a(Integer.toString(bl.field_r.field_C[var10].field_Sb), 15 + var8, var2, 6 + var10, -1);
                    nm.field_c.a("-", 16 + var8 + 14 * var11, var2, 6 + var10, -1);
                    nm.field_c.a(Integer.toString(bl.field_r.field_C[var10].field_oc), 31 + var8 - -(var11 * 14), var2, var10 + 6, -1);
                    if (var13 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    nm.field_c.c(rf.field_Y[var9_int], -15 + var8, var2, var10 + 6, -1);
                    if (-1 == pe.field_g[var10]) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    nm.field_c.a(cb.a(47, pe.field_g[var10]), 15 + var8, var2, var10 + 6, -1);
                    if (var13 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    nm.field_c.a(ln.field_m, var8 - -15, var2, 6 + var10, -1);
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    var3++;
                    var2 += 30;
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    var10++;
                    if (var13 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var9_int++;
                    if (var13 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    stackIn_75_0 = ek.field_x;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    if (stackIn_75_0 == 5) {
                        statePc = 77;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var2 += 30;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if (sf.field_m % 50 >= 25) {
                        statePc = 91;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (-3 != (ek.field_x ^ -1)) {
                        statePc = 84;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (-1 == ce.field_r) {
                        statePc = 84;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var9 = sd.a(kj.field_n, new String[]{gh.field_t[ce.field_r]}, true);
                    if (!of.a(param0 + -981)) {
                        statePc = 82;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var9 = ub.field_E;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    nm.field_c.b(var9, 320, var2, 1, -1);
                    statePc = 91;
                    continue stateLoop;
                }
                case 84: {
                    if (ek.field_x == 1) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (6 != ek.field_x) {
                        statePc = 91;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var17 = h.field_a;
                    nm.field_c.b(var17, 320, var2, 1, -1);
                    statePc = 91;
                    continue stateLoop;
                }
                case 87: {
                    if ((kk.field_l ^ -1) != -2) {
                        statePc = 89;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    stackIn_90_0 = va.field_f;
                    statePc = 90;
                    continue stateLoop;
                }
                case 89: {
                    stackIn_90_0 = sd.a(sh.field_c, new String[]{Integer.toString(kk.field_l)}, true);
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    var18 = stackIn_90_0;
                    var9 = var18;
                    nm.field_c.b(var18, 320, var2, 1, -1);
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    if (1 == ek.field_x) {
                        statePc = 95;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (ek.field_x == 6) {
                        statePc = 94;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var9 = hk.field_b;
                    statePc = 96;
                    continue stateLoop;
                }
                case 94: {
                    var9 = ka.field_e;
                    statePc = 96;
                    continue stateLoop;
                }
                case 95: {
                    var9 = qj.field_J;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    stackIn_98_0 = 240;
                    stackIn_97_0 = stackIn_98_0;
                    stackIn_98_1 = 0;
                    stackIn_97_1 = stackIn_98_1;
                    stackIn_98_2 = -5;
                    stackIn_97_2 = stackIn_98_2;
                    stackIn_98_3 = 430 + -(int)this.field_t;
                    stackIn_97_3 = stackIn_98_3;
                    stackIn_98_4 = (String) (var9);
                    stackIn_97_4 = stackIn_98_4;
                    if (this.field_c != 1) {
                        statePc = 98;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    stackIn_99_0 = stackIn_97_0;
                    stackIn_99_1 = stackIn_97_1;
                    stackIn_99_2 = stackIn_97_2;
                    stackIn_99_3 = stackIn_97_3;
                    stackIn_99_4 = (String) ((Object) stackIn_97_4);
                    stackIn_99_5 = 1;
                    statePc = 99;
                    continue stateLoop;
                }
                case 98: {
                    stackIn_99_0 = stackIn_98_0;
                    stackIn_99_1 = stackIn_98_1;
                    stackIn_99_2 = stackIn_98_2;
                    stackIn_99_3 = stackIn_98_3;
                    stackIn_99_4 = (String) ((Object) stackIn_98_4);
                    stackIn_99_5 = 0;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    te.a(stackIn_99_0, stackIn_99_1, stackIn_99_2, stackIn_99_3, stackIn_99_4, stackIn_99_5 != 0);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(int param0, byte param1, int param2, int param3) {
        int var5;
        int var6;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        L0: {
          var6 = HoldTheLine.field_D;
          if (-81 < (param0 ^ -1)) {
            break L0;
          } else {
            if (-141 > (param0 ^ -1)) {
              break L0;
            } else {
              var5 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if ((var5 ^ -1) <= -5) {
                      break L3;
                    } else {
                      stackIn_13_0 = 88 + (128 * var5 + -param3);

                      stackIn_13_1 = param2;

                      if (var6 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_13_0 > stackIn_13_1) {
                            break L4;
                          } else {
                            if ((param2 ^ -1) >= (-param3 + (var5 * 128 + 168) ^ -1)) {
                              return var5;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var5++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackIn_13_0 = param1;
                  stackIn_13_1 = -87;
                  break L2;
                }
                L5: {
                  if (stackIn_13_0 <= stackIn_13_1) {
                    break L5;
                  } else {
                    this.field_r = 9;
                    break L5;
                  }
                }
                return -1;
              }
            }
          }
        }
        return -1;
    }

    private final void d(byte param0) {
        int stackIn_13_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int var2;
        int var3;
        int var4;
        L0: {
          var4 = HoldTheLine.field_D;
          if (200 > nc.field_g) {
            break L0;
          } else {
            if ((nc.field_g ^ -1) <= -441) {
              break L0;
            } else {
              if ((float)rf.field_X < 430.0f - this.field_t) {
                break L0;
              } else {
                if (-this.field_t + 460.0f > (float)rf.field_X) {
                  this.field_c = 1;
                  if (1 != gg.field_J) {
                    break L0;
                  } else {
                    this.a((byte) 117, 6, true);
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
        }
        var2 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if (2 <= var2) {
                break L3;
              } else {
                stackIn_26_0 = 0;

                stackIn_26_1 = var2;

                if (var4 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (stackIn_26_0 == stackIn_26_1) {
                      stackIn_13_0 = 240;
                      break L4;
                    } else {
                      stackIn_13_0 = 400;
                      break L4;
                    }
                  }
                  L5: {
                    var3 = stackIn_13_0;
                    if ((-69 + var3 ^ -1) < (nc.field_g ^ -1)) {
                      break L5;
                    } else {
                      if (var3 + 69 <= nc.field_g) {
                        break L5;
                      } else {
                        if ((float)rf.field_X < 845.0f - this.field_t) {
                          break L5;
                        } else {
                          if ((float)rf.field_X < 949.0f - this.field_t) {
                            t.field_l = go.field_g[kn.b((byte) -49).field_p][var2];
                            ci.a(0, (byte) 120, this.field_o, var2);
                            this.field_c = 1;
                            if (-2 == (gg.field_J ^ -1)) {
                              if (null == bl.field_r) {
                                break L3;
                              } else {
                                bl.field_r.field_C[0].a(20385, ge.field_c[t.field_l]);
                                wm.a(true, false, -1);
                                qf.a(293, cf.field_r);
                                if (var4 == 0) {
                                  break L3;
                                } else {
                                  break L5;
                                }
                              }
                            } else {
                              break L3;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  var2++;
                  if (var4 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            stackIn_26_0 = this.field_o;
            stackIn_26_1 = 10;
            break L2;
          }
          L6: {
            if (stackIn_26_0 != stackIn_26_1) {
              break L6;
            } else {
              if (this.field_t > 0.0f) {
                if (!na.field_k) {
                  break L6;
                } else {
                  if (nc.field_g <= this.field_m) {
                    break L6;
                  } else {
                    if ((this.field_f ^ -1) > (nc.field_g ^ -1)) {
                      break L6;
                    } else {
                      if ((rf.field_X ^ -1) > -36) {
                        break L6;
                      } else {
                        if ((rf.field_X ^ -1) >= -66) {
                          this.field_c = 0;
                          if (0 != gg.field_J) {
                            this.c(this.field_c, -3565);
                            break L6;
                          } else {
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
              } else {
                break L6;
              }
            }
          }
          L7: {
            if (param0 == -88) {
              break L7;
            } else {
              this.field_q = (int[]) null;
              break L7;
            }
          }
          return;
        }
    }

    private final int b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        var8 = HoldTheLine.field_D;
        var4 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if ((qe.field_a ^ -1) >= (var4 ^ -1)) {
                break L2;
              } else {
                var5 = -param1 + dm.field_e[var4];
                var6 = -param2 + co.field_d[var4];
                var7 = kn.field_b[var4] >> -286748927;
                stackIn_10_0 = -var7;

                stackIn_10_1 = var5;

                if (var8 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_10_0 > stackIn_10_1) {
                      break L3;
                    } else {
                      if ((var5 ^ -1) < (var7 ^ -1)) {
                        break L3;
                      } else {
                        if (-var7 > var6) {
                          break L3;
                        } else {
                          if (var6 > var7) {
                            break L3;
                          } else {
                            return nk.field_J[var4];
                          }
                        }
                      }
                    }
                  }
                  var4++;
                  if (var8 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackIn_10_0 = param0;
            stackIn_10_1 = -21;
            break L1;
          }
          L4: {
            if (stackIn_10_0 == stackIn_10_1) {
              break L4;
            } else {
              this.field_r = -80;
              break L4;
            }
          }
          return -1;
        }
    }

    final void g(int param0, int param1) {
        this.field_p = 0;
        this.field_t = (float)param0;
        ha.field_p = param1;
        wa.field_j = param1;
        mg.field_g[param1] = null;
    }

    static {
        field_x = new ll();
    }
}
