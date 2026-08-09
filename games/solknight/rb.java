/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rb {
    int field_d;
    static int field_f;
    int field_j;
    int field_a;
    private int field_n;
    int field_c;
    private int field_k;
    private int field_i;
    private boolean field_h;
    int field_b;
    private int field_m;
    private int field_g;
    private int field_e;
    private int field_l;

    final rb b(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_244_0 = 0;
        int stackIn_244_1 = 0;
        int stackIn_245_0 = 0;
        int stackIn_245_1 = 0;
        int stackIn_246_0 = 0;
        int stackIn_246_1 = 0;
        int stackIn_246_2 = 0;
        int stackIn_269_0 = 0;
        int stackIn_269_1 = 0;
        int stackIn_270_0 = 0;
        int stackIn_270_1 = 0;
        int stackIn_271_0 = 0;
        int stackIn_271_1 = 0;
        int stackIn_271_2 = 0;
        int stackIn_298_0 = 0;
        int stackIn_298_1 = 0;
        int stackIn_299_0 = 0;
        int stackIn_299_1 = 0;
        int stackIn_300_0 = 0;
        int stackIn_300_1 = 0;
        int stackIn_300_2 = 0;
        int stackIn_328_0 = 0;
        int stackIn_328_1 = 0;
        int stackIn_329_0 = 0;
        int stackIn_329_1 = 0;
        int stackIn_330_0 = 0;
        int stackIn_330_1 = 0;
        int stackIn_330_2 = 0;
        int stackIn_361_0 = 0;
        int stackIn_361_1 = 0;
        int stackIn_362_0 = 0;
        int stackIn_362_1 = 0;
        int stackIn_363_0 = 0;
        int stackIn_363_1 = 0;
        int stackIn_363_2 = 0;
        int stackIn_391_0 = 0;
        int stackIn_391_1 = 0;
        int stackIn_392_0 = 0;
        int stackIn_392_1 = 0;
        int stackIn_393_0 = 0;
        int stackIn_393_1 = 0;
        int stackIn_393_2 = 0;
        int stackIn_414_0 = 0;
        int stackIn_414_1 = 0;
        int statePc = 0;
        int var2 = 0;
        Object var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        rb var10 = null;
        rb var11 = null;
        rb var12 = null;
        rb var13 = null;
        rb var14 = null;
        rb var15 = null;
        rb var16 = null;
        rb var17 = null;
        rb var18 = null;
        rb var19 = null;
        rb var20 = null;
        rb var21 = null;
        rb var22 = null;
        rb var23 = null;
        rb var24 = null;
        rb var25 = null;
        rb var26 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = SolKnight.field_L ? 1 : 0;
                    if (param0 > 2) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return (rb) null;
                }
                case 2: {
                    this.field_a = this.field_a + this.field_c;
                    this.field_b = this.field_b + this.field_d;
                    var2 = 32;
                    if (-26 == (this.field_j ^ -1)) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var2 = 9;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    stackIn_6_0 = this.field_j;
                    stackIn_6_1 = 26;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (stackIn_6_0 != stackIn_6_1) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var2 = 14;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (-28 == (this.field_j ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var2 = 27;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (-29 != (this.field_j ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var2 = 40;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (this.field_j != 29) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var2 = 53;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (30 == this.field_j) {
                        statePc = 17;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var2 = 70;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (this.field_a < -(640 - -var2 << -1870610300)) {
                        statePc = 20;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 20: {
                    this.a((byte) 62);
                    this.field_h = true;
                    return null;
                }
                case 21: {
                    if (var2 + 640 << -1241679836 < this.field_a) {
                        statePc = 23;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 23: {
                    this.a((byte) 62);
                    this.field_h = true;
                    return null;
                }
                case 24: {
                    if (this.field_b > var2 + 720 << 501376132) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 26: {
                    this.a((byte) 62);
                    this.field_h = true;
                    return null;
                }
                case 27: {
                    if (-(var2 << 1643983140) <= this.field_b) {
                        statePc = 31;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (-1 < (this.field_d ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 30: {
                    this.a((byte) 62);
                    this.field_h = true;
                    return null;
                }
                case 31: {
                    if (3 >= this.field_j) {
                        statePc = 33;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 33: {
                    this.field_i = bk.a(120, jb.field_g, (byte) 49);
                    this.field_n = bk.a(120, jb.field_g, (byte) 57);
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var4 = this.field_j;
                    if (var4 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (-2 != (var4 ^ -1)) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (var9 == 0) {
                        statePc = 96;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (2 == var4) {
                        statePc = 125;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (-4 == (var4 ^ -1)) {
                        statePc = 138;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (var4 == 4) {
                        statePc = 157;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (5 == var4) {
                        statePc = 159;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (6 == var4) {
                        statePc = 186;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (-8 != (var4 ^ -1)) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (var9 == 0) {
                        statePc = 198;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var4 == 8) {
                        statePc = 206;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if ((var4 ^ -1) == -10) {
                        statePc = 208;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (-11 == (var4 ^ -1)) {
                        statePc = 210;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (var4 == 11) {
                        statePc = 216;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (-13 == (var4 ^ -1)) {
                        statePc = 222;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (var4 == 13) {
                        statePc = 222;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (17 != var4) {
                        statePc = 55;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (var9 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (14 == var4) {
                        statePc = 224;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (15 != var4) {
                        statePc = 59;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (var9 == 0) {
                        statePc = 224;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if ((var4 ^ -1) != -17) {
                        statePc = 62;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (var9 == 0) {
                        statePc = 224;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (18 == var4) {
                        statePc = 226;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (19 != var4) {
                        statePc = 66;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (var9 == 0) {
                        statePc = 228;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (25 == var4) {
                        statePc = 230;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (var4 == 26) {
                        statePc = 253;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if ((var4 ^ -1) == -28) {
                        statePc = 282;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (var4 != 28) {
                        statePc = 72;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (var9 == 0) {
                        statePc = 312;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (var4 == 29) {
                        statePc = 343;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (30 != var4) {
                        statePc = 76;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (var9 == 0) {
                        statePc = 375;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (20 == var4) {
                        statePc = 406;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (21 == var4) {
                        statePc = 406;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (-23 == (var4 ^ -1)) {
                        statePc = 406;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (23 != var4) {
                        statePc = 82;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (var9 == 0) {
                        statePc = 406;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (24 != var4) {
                        statePc = 85;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (var9 == 0) {
                        statePc = 406;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if ((var4 ^ -1) != -32) {
                        statePc = 412;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (var9 == 0) {
                        statePc = 409;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    this.field_g = 4;
                    this.field_e = this.field_e + 1;
                    if (kb.field_b == 0) {
                        statePc = 91;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    this.a(9, -19, 8);
                    if (var9 == 0) {
                        statePc = 412;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (-51 >= (this.field_e ^ -1)) {
                        statePc = 95;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    this.field_b = this.field_b - this.field_d * (-this.field_e + 50) / 100;
                    this.field_a = this.field_a - this.field_c * (50 + -this.field_e) / 100;
                    if (-1 == (this.field_e % 2 ^ -1)) {
                        statePc = 94;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 94: {
                    pk.a((byte) 32, new rb(12, (rb) (this)));
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    this.a(9, -19, 16);
                    if (var9 == 0) {
                        statePc = 412;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    this.field_g = 4;
                    this.field_e = this.field_e + 1;
                    if (this.field_e % 10 == 0) {
                        statePc = 109;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (100 <= this.field_e) {
                        statePc = 101;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (bi.field_h != 0) {
                        statePc = 101;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    if (this.field_e % 3 == 0) {
                        statePc = 109;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if ((this.field_e ^ -1) <= -101) {
                        statePc = 105;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if ((bi.field_h ^ -1) != -2) {
                        statePc = 105;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (0 == this.field_e % 4) {
                        statePc = 109;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    if ((this.field_e ^ -1) <= -101) {
                        statePc = 115;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    if ((bi.field_h ^ -1) != -3) {
                        statePc = 115;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (this.field_e % 5 == 0) {
                        statePc = 109;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (this.field_e < 100) {
                        statePc = 111;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 111: {
                    pk.a((byte) 32, new rb(8, (rb) (this)));
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if (this.field_e < 100) {
                        statePc = 114;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 114: {
                    pk.a((byte) 32, new rb(12, (rb) (this)));
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    if ((this.field_e ^ -1) > -101) {
                        statePc = 117;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 117: {
                    var4 = (this.field_a >> -1496168924) + -wd.field_c - -320;
                    var5 = (this.field_b >> 19910308) - si.field_E;
                    var6 = -var4 + gb.field_j;
                    var7 = -var5 + ad.field_m;
                    if (-1 >= (ve.field_b ^ -1)) {
                        statePc = 119;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 119: {
                    var7 = -si.field_E + (wg.field_e >> 212158404) + -var5;
                    var6 = -var4 + 320 + (-wd.field_c + (sk.field_o >> 573939300));
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    var8 = (int)Math.sqrt((double)(var7 * var7 + var6 * var6));
                    if (-9 <= (var8 ^ -1)) {
                        statePc = 124;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    this.field_c = this.field_c + var6 * 8 / var8;
                    this.field_d = this.field_d + 8 * var7 / var8;
                    var8 = (int)Math.sqrt((double)(this.field_c * this.field_c - -(this.field_d * this.field_d)));
                    if (var8 > 128) {
                        statePc = 123;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 123: {
                    this.field_d = 128 * this.field_d / var8;
                    this.field_c = this.field_c * 128 / var8;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    this.a(9, -19, 42);
                    if (var9 == 0) {
                        statePc = 412;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    this.field_g = 5;
                    this.field_e = this.field_e + 1;
                    if (0 != this.field_e % 10) {
                        statePc = 129;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    pk.a((byte) 32, new rb(8, (rb) (this)));
                    if (-1 == (this.field_e % 2 ^ -1)) {
                        statePc = 128;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 128: {
                    pk.a((byte) 32, new rb(12, (rb) (this)));
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    this.field_g = 32;
                    this.a(13, -19, 0);
                    this.field_g = 5;
                    if ((this.field_j ^ -1) != -14) {
                        statePc = 412;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    if (-3 >= (bi.field_h ^ -1)) {
                        statePc = 133;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    mb.a(true, 7, 128);
                    if (var9 == 0) {
                        statePc = 134;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    mb.a(true, 7, 256);
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    this.field_j = 0;
                    var10 = new rb(0, (rb) (this));
                    var10.field_c = this.field_c / 3 - -(this.field_d / 4);
                    var10.field_d = -(this.field_c / 4) + this.field_d / 3;
                    pk.a((byte) 32, var10);
                    var11 = new rb(0, (rb) (this));
                    var11.field_c = this.field_d / 5 + this.field_c / 2;
                    var11.field_d = -(this.field_c / 5) + this.field_d / 2;
                    pk.a((byte) 32, var11);
                    var12 = new rb(0, (rb) (this));
                    var12.field_c = this.field_c / 3 - this.field_d / 4;
                    var12.field_d = this.field_d / 3 + this.field_c / 4;
                    pk.a((byte) 32, var12);
                    var13 = new rb(0, (rb) (this));
                    var13.field_c = -(this.field_d / 5) + this.field_c / 2;
                    var13.field_d = this.field_c / 5 + this.field_d / 2;
                    pk.a((byte) 32, var13);
                    if (-3 == (bi.field_h ^ -1)) {
                        statePc = 136;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var14 = new rb(0, (rb) (this));
                    var14.field_d = this.field_d / 3;
                    var14.field_c = this.field_c / 3;
                    pk.a((byte) 32, var14);
                    var15 = new rb(0, (rb) (this));
                    var15.field_c = this.field_c / 5 + this.field_d / 2;
                    var15.field_d = -(this.field_c / 2) + this.field_d / 5;
                    pk.a((byte) 32, var15);
                    var16 = new rb(0, (rb) (this));
                    var16.field_c = this.field_d / 4 + this.field_c / 4;
                    var16.field_d = this.field_d / 4 - this.field_c / 4;
                    pk.a((byte) 32, var16);
                    var17 = new rb(0, (rb) (this));
                    var17.field_c = -(this.field_d / 2) + this.field_c / 5;
                    var17.field_d = this.field_c / 2 + this.field_d / 5;
                    pk.a((byte) 32, var17);
                    var18 = new rb(0, (rb) (this));
                    var18.field_c = this.field_c / 4 + -(this.field_d / 4);
                    var18.field_d = this.field_d / 4 - -(this.field_c / 4);
                    pk.a((byte) 32, var18);
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    this.field_c = 2 * this.field_c / 3;
                    this.field_d = 2 * this.field_d / 3;
                    if (var9 == 0) {
                        statePc = 412;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    this.field_e = this.field_e + 1;
                    this.field_g = 6;
                    if (0 == this.field_e % 4) {
                        statePc = 140;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 140: {
                    pk.a((byte) 32, new rb(8, (rb) (this)));
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    if (this.field_e % 2 == 0) {
                        statePc = 143;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 143: {
                    var4 = 15 & this.field_e >> -1101118655;
                    if (var4 <= 8) {
                        statePc = 145;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var4 = -var4 + 16;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    var19 = new rb(12, (rb) (this));
                    var4 -= 4;
                    var19.field_a = var19.field_a - this.field_d * var4 / 4;
                    var19.field_b = var19.field_b + var4 * this.field_c / 4;
                    pk.a((byte) 32, var19);
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    if (bi.field_h >= 2) {
                        statePc = 148;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    this.a(10, -19, 16);
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    if ((bi.field_h ^ -1) == -3) {
                        statePc = 150;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 150: {
                    this.a(11, -19, 16);
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    if (10 == this.field_j) {
                        statePc = 153;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 153: {
                    this.field_g = 128;
                    this.a(10, -19, 50);
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    if ((this.field_j ^ -1) == -12) {
                        statePc = 156;
                    } else {
                        statePc = 412;
                    }
                    continue stateLoop;
                }
                case 156: {
                    this.field_g = 192;
                    this.a(11, -19, 75);
                    if (var9 == 0) {
                        statePc = 412;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    this.field_g = 4;
                    this.a(12, -19, 8);
                    if (var9 == 0) {
                        statePc = 412;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    this.field_g = 4;
                    var3 = null;
                    if (bi.field_h == 0) {
                        statePc = 166;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    if (bi.field_h != 1) {
                        statePc = 163;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    if (10 < this.field_e) {
                        statePc = 166;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    if (2 != bi.field_h) {
                        statePc = 167;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    if (-21 <= (this.field_e ^ -1)) {
                        statePc = 167;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var3 = new rb(14, (rb) (this));
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    if ((bi.field_h ^ -1) == -2) {
                        statePc = 171;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if (bi.field_h != 2) {
                        statePc = 172;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    if (this.field_e > 10) {
                        statePc = 171;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 171: {
                    var3 = new rb(15, (rb) (this));
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    if (2 == bi.field_h) {
                        statePc = 174;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var3 = new rb(16, (rb) (this));
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    ((rb) (var3)).field_d = this.field_d;
                    ((rb) (var3)).field_c = this.field_c;
                    pk.a((byte) 32, (rb) (var3));
                    if (-1 != (bi.field_h ^ -1)) {
                        statePc = 177;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    this.a(13, -19, 1);
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    if (1 != bi.field_h) {
                        statePc = 179;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    this.a(13, -19, 1);
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    if (bi.field_h == 2) {
                        statePc = 181;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 181: {
                    this.a(13, -19, 1);
                    statePc = 182;
                    continue stateLoop;
                }
                case 182: {
                    if (this.field_j != 13) {
                        statePc = 412;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (this.field_e < 10 + 10 * bi.field_h) {
                        statePc = 185;
                    } else {
                        statePc = 412;
                    }
                    continue stateLoop;
                }
                case 185: {
                    this.field_e = this.field_e + 1;
                    var20 = new rb(13, (rb) (this));
                    pk.a((byte) 32, var20);
                    this.field_j = 5;
                    if (var9 == 0) {
                        statePc = 412;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    this.field_e = this.field_e + 1;
                    this.field_g = 6;
                    var4 = 320 + (-wd.field_c + (this.field_a >> 1564375396));
                    var5 = (this.field_b >> -567602620) + -si.field_E;
                    var6 = -var4 + gb.field_j;
                    var7 = ad.field_m - var5;
                    if (ve.field_b >= 0) {
                        statePc = 188;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 188: {
                    var6 = -var4 + (sk.field_o >> -664643676) - wd.field_c - -320;
                    var7 = -var5 + ((wg.field_e >> -219328956) - si.field_E);
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    var8 = (int)Math.sqrt((double)(var7 * var7 + var6 * var6));
                    if (var8 <= 8) {
                        statePc = 192;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    this.field_c = this.field_c + (-this.field_e + 500) * 8 * var6 / (500 * var8);
                    this.field_d = this.field_d + 8 * var7 * (500 + -this.field_e) / (var8 * 500);
                    var8 = (int)Math.sqrt((double)(this.field_d * this.field_d + this.field_c * this.field_c));
                    if ((var8 ^ -1) >= -256) {
                        statePc = 192;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    this.field_d = 255 * this.field_d / var8;
                    this.field_c = 255 * this.field_c / var8;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    if (-3 < (bi.field_h ^ -1)) {
                        statePc = 196;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    this.a(17, -19, 0);
                    if (this.field_j != 17) {
                        statePc = 412;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    this.field_g = 64;
                    this.a(18, -19, 30);
                    if (var9 == 0) {
                        statePc = 412;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    this.a(17, -19, 15);
                    if (var9 == 0) {
                        statePc = 412;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    this.field_g = 8;
                    if ((bi.field_h ^ -1) != -2) {
                        statePc = 200;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    this.field_g = 16;
                    statePc = 200;
                    continue stateLoop;
                }
                case 200: {
                    if (-3 != (bi.field_h ^ -1)) {
                        statePc = 202;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    this.field_g = 32;
                    statePc = 202;
                    continue stateLoop;
                }
                case 202: {
                    var21 = new rb(19, (rb) (this));
                    var21.field_d = this.field_d;
                    var21.field_g = this.field_g;
                    var21.field_c = this.field_c;
                    pk.a((byte) 32, var21);
                    this.a(10, -19, 0);
                    if (-11 != (this.field_j ^ -1)) {
                        statePc = 412;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    var4 = this.field_g;
                    if (bi.field_h != 0) {
                        statePc = 205;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    var4 = 5;
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    this.field_g = 64;
                    this.a(10, -19, var4);
                    if (var9 == 0) {
                        statePc = 412;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    this.field_e = this.field_e + 4;
                    if ((this.field_e ^ -1) >= -65) {
                        statePc = 412;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    return null;
                }
                case 208: {
                    this.field_e = this.field_e + 1;
                    if (-65 <= (this.field_e ^ -1)) {
                        statePc = 412;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    return null;
                }
                case 210: {
                    if (!pg.field_e) {
                        statePc = 213;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    if (0 != (kd.field_a ^ -1)) {
                        statePc = 213;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 213: {
                    this.field_e = this.field_e + 3;
                    statePc = 214;
                    continue stateLoop;
                }
                case 214: {
                    this.field_e = this.field_e + 1;
                    if (this.field_e <= 85) {
                        statePc = 412;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    return null;
                }
                case 216: {
                    if (!pg.field_e) {
                        statePc = 219;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    if (0 == (kd.field_a ^ -1)) {
                        statePc = 220;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    this.field_e = this.field_e + 3;
                    statePc = 220;
                    continue stateLoop;
                }
                case 220: {
                    this.field_e = this.field_e + 1;
                    if (128 >= this.field_e) {
                        statePc = 412;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    return null;
                }
                case 222: {
                    this.field_e = this.field_e + 1;
                    if ((this.field_e ^ -1) >= -17) {
                        statePc = 412;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    return null;
                }
                case 224: {
                    this.field_e = this.field_e + 1;
                    this.field_a = this.field_a - this.field_c;
                    this.field_b = this.field_b - this.field_d;
                    if ((this.field_e ^ -1) >= -3) {
                        statePc = 412;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    return null;
                }
                case 226: {
                    this.field_e = this.field_e + 1;
                    if ((this.field_e ^ -1) >= -33) {
                        statePc = 412;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    return null;
                }
                case 228: {
                    this.field_b = this.field_b - this.field_d;
                    this.field_a = this.field_a - this.field_c;
                    this.field_e = this.field_e + 1;
                    if (this.field_e <= 1) {
                        statePc = 412;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    return null;
                }
                case 230: {
                    this.field_l = this.field_l + 50;
                    if (150 >= this.field_l) {
                        statePc = 232;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    this.field_l = this.field_l - 150;
                    this.field_m = this.field_m + 1;
                    statePc = 232;
                    continue stateLoop;
                }
                case 232: {
                    this.field_g = 8;
                    if ((this.field_m ^ -1) > -37) {
                        statePc = 234;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    this.field_m = this.field_m - 36;
                    statePc = 234;
                    continue stateLoop;
                }
                case 234: {
                    if (!pg.field_e) {
                        statePc = 237;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    if ((kd.field_a ^ -1) != 0) {
                        statePc = 237;
                    } else {
                        statePc = 247;
                    }
                    continue stateLoop;
                }
                case 237: {
                    var4 = this.field_a >> 1582992804;
                    var5 = ea.field_p[kb.field_b] + ((this.field_b >> 1452039076) - 720);
                    var6 = (int)Math.sqrt((double)(var5 * var5 + var4 * var4));
                    if (var6 >= this.field_g - -kd.field_b[kb.field_b]) {
                        statePc = 241;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    if (pg.field_e) {
                        statePc = 240;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    mb.a(true, 12, 256);
                    statePc = 240;
                    continue stateLoop;
                }
                case 240: {
                    pg.field_e = true;
                    this.field_e = 5;
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    if (-1 != (this.field_m % 8 ^ -1)) {
                        statePc = 247;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    if (-101 >= (this.field_l ^ -1)) {
                        statePc = 247;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    stackIn_245_0 = 1;
                    stackIn_244_0 = stackIn_245_0;
                    stackIn_245_1 = 21;
                    stackIn_244_1 = stackIn_245_1;
                    if (var6 >= 32) {
                        statePc = 245;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    stackIn_246_0 = stackIn_244_0;
                    stackIn_246_1 = stackIn_244_1;
                    stackIn_246_2 = 256;
                    statePc = 246;
                    continue stateLoop;
                }
                case 245: {
                    stackIn_246_0 = stackIn_245_0;
                    stackIn_246_1 = stackIn_245_1;
                    stackIn_246_2 = 8192 / var6;
                    statePc = 246;
                    continue stateLoop;
                }
                case 246: {
                    mb.a(stackIn_246_0 != 0, stackIn_246_1, stackIn_246_2);
                    statePc = 247;
                    continue stateLoop;
                }
                case 247: {
                    if (0 < this.field_k) {
                        statePc = 249;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 249: {
                    this.field_k = this.field_k - 1;
                    statePc = 250;
                    continue stateLoop;
                }
                case 250: {
                    if ((this.field_e ^ -1) >= -5) {
                        statePc = 412;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    vk.field_p = vk.field_p + 1;
                    mb.a(true, 30, 256);
                    pl.field_a = pl.field_a + vk.field_p * 1;
                    ud.field_k = ud.field_k + 1;
                    ic.field_t = ic.field_t + (lc.field_h >>> 709568401);
                    this.field_c = 0;
                    this.field_j = this.field_j - 5;
                    ob.field_j = vk.field_p;
                    bi.field_i = bi.field_i + 1;
                    cb.field_a = 256;
                    this.field_d = 0;
                    this.field_e = 0;
                    if (var9 == 0) {
                        statePc = 412;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    this.field_l = this.field_l + 40;
                    if (-151 <= (this.field_l ^ -1)) {
                        statePc = 255;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    this.field_l = this.field_l - 150;
                    this.field_m = this.field_m + 1;
                    statePc = 255;
                    continue stateLoop;
                }
                case 255: {
                    this.field_g = 12;
                    if ((this.field_m ^ -1) > -37) {
                        statePc = 257;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 256: {
                    this.field_m = this.field_m - 36;
                    statePc = 257;
                    continue stateLoop;
                }
                case 257: {
                    if (!pg.field_e) {
                        statePc = 260;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    if (0 != (kd.field_a ^ -1)) {
                        statePc = 260;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 260: {
                    var4 = this.field_a >> 1772885476;
                    var5 = -720 + ((this.field_b >> -1476439580) + ea.field_p[kb.field_b]);
                    var6 = (int)Math.sqrt((double)(var5 * var5 + var4 * var4));
                    if (this.field_g + kd.field_b[kb.field_b] > var6) {
                        statePc = 262;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 262: {
                    if (!pg.field_e) {
                        statePc = 264;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 264: {
                    mb.a(true, 12, 256);
                    statePc = 265;
                    continue stateLoop;
                }
                case 265: {
                    this.field_e = 13;
                    pg.field_e = true;
                    statePc = 266;
                    continue stateLoop;
                }
                case 266: {
                    if (-1 != (this.field_m % 8 ^ -1)) {
                        statePc = 272;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    if ((this.field_l ^ -1) <= -81) {
                        statePc = 272;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    stackIn_270_0 = 1;
                    stackIn_269_0 = stackIn_270_0;
                    stackIn_270_1 = 22;
                    stackIn_269_1 = stackIn_270_1;
                    if (-33 >= (var6 ^ -1)) {
                        statePc = 270;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    stackIn_271_0 = stackIn_269_0;
                    stackIn_271_1 = stackIn_269_1;
                    stackIn_271_2 = 256;
                    statePc = 271;
                    continue stateLoop;
                }
                case 270: {
                    stackIn_271_0 = stackIn_270_0;
                    stackIn_271_1 = stackIn_270_1;
                    stackIn_271_2 = 8192 / var6;
                    statePc = 271;
                    continue stateLoop;
                }
                case 271: {
                    mb.a(stackIn_271_0 != 0, stackIn_271_1, stackIn_271_2);
                    statePc = 272;
                    continue stateLoop;
                }
                case 272: {
                    if (-1 <= (this.field_k ^ -1)) {
                        statePc = 274;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    this.field_k = this.field_k - 1;
                    statePc = 274;
                    continue stateLoop;
                }
                case 274: {
                    if (-13 <= (this.field_e ^ -1)) {
                        statePc = 412;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    vk.field_p = vk.field_p + 1;
                    var4 = 0;
                    statePc = 276;
                    continue stateLoop;
                }
                case 276: {
                    if (-9 >= (var4 ^ -1)) {
                        statePc = 280;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    var22 = new rb(31, (rb) (this));
                    pk.a((byte) 32, var22);
                    var4++;
                    if (var9 != 0) {
                        statePc = 281;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    if (var9 == 0) {
                        statePc = 276;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    mb.a(true, 29, 256);
                    this.field_j = this.field_j - 5;
                    this.field_c = 0;
                    pl.field_a = pl.field_a + vk.field_p * 2;
                    ob.field_j = vk.field_p;
                    cb.field_a = 256;
                    ud.field_k = ud.field_k + 2;
                    bi.field_i = bi.field_i + 2;
                    ic.field_t = ic.field_t + ((lc.field_h & -125932) >>> 1157229776);
                    this.field_e = 0;
                    this.field_d = 0;
                    statePc = 281;
                    continue stateLoop;
                }
                case 281: {
                    if (var9 == 0) {
                        statePc = 412;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 282: {
                    this.field_l = this.field_l + 30;
                    if ((this.field_l ^ -1) >= -151) {
                        statePc = 284;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    this.field_m = this.field_m + 1;
                    this.field_l = this.field_l - 150;
                    statePc = 284;
                    continue stateLoop;
                }
                case 284: {
                    this.field_g = 24;
                    if (36 > this.field_m) {
                        statePc = 286;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    this.field_m = this.field_m - 36;
                    statePc = 286;
                    continue stateLoop;
                }
                case 286: {
                    if (!pg.field_e) {
                        statePc = 289;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    if (kd.field_a == -1) {
                        statePc = 301;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    var4 = this.field_a >> -458679932;
                    var5 = -720 + (this.field_b >> -201451132) - -ea.field_p[kb.field_b];
                    var6 = (int)Math.sqrt((double)(var4 * var4 + var5 * var5));
                    if (var6 >= kd.field_b[kb.field_b] + this.field_g) {
                        statePc = 294;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 290: {
                    if (!pg.field_e) {
                        statePc = 292;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 292: {
                    mb.a(true, 12, 256);
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    this.field_e = 37;
                    pg.field_e = true;
                    statePc = 294;
                    continue stateLoop;
                }
                case 294: {
                    if (this.field_m % 8 != 0) {
                        statePc = 301;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    if ((this.field_l ^ -1) > -61) {
                        statePc = 297;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 297: {
                    stackIn_299_0 = 1;
                    stackIn_298_0 = stackIn_299_0;
                    stackIn_299_1 = 23;
                    stackIn_298_1 = stackIn_299_1;
                    if (-33 >= (var6 ^ -1)) {
                        statePc = 299;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    stackIn_300_0 = stackIn_298_0;
                    stackIn_300_1 = stackIn_298_1;
                    stackIn_300_2 = 256;
                    statePc = 300;
                    continue stateLoop;
                }
                case 299: {
                    stackIn_300_0 = stackIn_299_0;
                    stackIn_300_1 = stackIn_299_1;
                    stackIn_300_2 = 8192 / var6;
                    statePc = 300;
                    continue stateLoop;
                }
                case 300: {
                    mb.a(stackIn_300_0 != 0, stackIn_300_1, stackIn_300_2);
                    statePc = 301;
                    continue stateLoop;
                }
                case 301: {
                    if (-1 > (this.field_k ^ -1)) {
                        statePc = 303;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 303: {
                    this.field_k = this.field_k - 1;
                    statePc = 304;
                    continue stateLoop;
                }
                case 304: {
                    if (-37 <= (this.field_e ^ -1)) {
                        statePc = 412;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 305: {
                    vk.field_p = vk.field_p + 1;
                    var4 = 0;
                    statePc = 306;
                    continue stateLoop;
                }
                case 306: {
                    if (var4 >= 12) {
                        statePc = 310;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    var23 = new rb(31, (rb) (this));
                    pk.a((byte) 32, var23);
                    var4++;
                    if (var9 != 0) {
                        statePc = 311;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 308: {
                    if (var9 == 0) {
                        statePc = 306;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    mb.a(true, 28, 256);
                    this.field_d = 0;
                    ic.field_t = ic.field_t + 3 * (lc.field_h >>> 562160497);
                    ud.field_k = ud.field_k + 3;
                    ob.field_j = vk.field_p;
                    bi.field_i = bi.field_i + 3;
                    this.field_c = 0;
                    this.field_e = 0;
                    this.field_j = this.field_j - 5;
                    pl.field_a = pl.field_a + 3 * vk.field_p;
                    cb.field_a = 256;
                    statePc = 311;
                    continue stateLoop;
                }
                case 311: {
                    if (var9 == 0) {
                        statePc = 412;
                    } else {
                        statePc = 312;
                    }
                    continue stateLoop;
                }
                case 312: {
                    this.field_l = this.field_l + 20;
                    if ((this.field_l ^ -1) < -151) {
                        statePc = 314;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 314: {
                    this.field_l = this.field_l - 150;
                    this.field_m = this.field_m + 1;
                    statePc = 315;
                    continue stateLoop;
                }
                case 315: {
                    if (this.field_m < 36) {
                        statePc = 317;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 316: {
                    this.field_m = this.field_m - 36;
                    statePc = 317;
                    continue stateLoop;
                }
                case 317: {
                    this.field_g = 32;
                    if (!pg.field_e) {
                        statePc = 320;
                    } else {
                        statePc = 318;
                    }
                    continue stateLoop;
                }
                case 318: {
                    if (0 != (kd.field_a ^ -1)) {
                        statePc = 320;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 320: {
                    var4 = this.field_a >> -1459430012;
                    var5 = ea.field_p[kb.field_b] + ((this.field_b >> 1931708676) + -720);
                    var6 = (int)Math.sqrt((double)(var4 * var4 + var5 * var5));
                    if (var6 >= kd.field_b[kb.field_b] + this.field_g) {
                        statePc = 325;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 321: {
                    if (!pg.field_e) {
                        statePc = 323;
                    } else {
                        statePc = 324;
                    }
                    continue stateLoop;
                }
                case 323: {
                    mb.a(true, 12, 256);
                    statePc = 324;
                    continue stateLoop;
                }
                case 324: {
                    pg.field_e = true;
                    this.field_e = 73;
                    statePc = 325;
                    continue stateLoop;
                }
                case 325: {
                    if (0 != this.field_m % 8) {
                        statePc = 331;
                    } else {
                        statePc = 326;
                    }
                    continue stateLoop;
                }
                case 326: {
                    if (-41 >= (this.field_l ^ -1)) {
                        statePc = 331;
                    } else {
                        statePc = 327;
                    }
                    continue stateLoop;
                }
                case 327: {
                    stackIn_329_0 = 1;
                    stackIn_328_0 = stackIn_329_0;
                    stackIn_329_1 = 24;
                    stackIn_328_1 = stackIn_329_1;
                    if ((var6 ^ -1) <= -33) {
                        statePc = 329;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    stackIn_330_0 = stackIn_328_0;
                    stackIn_330_1 = stackIn_328_1;
                    stackIn_330_2 = 256;
                    statePc = 330;
                    continue stateLoop;
                }
                case 329: {
                    stackIn_330_0 = stackIn_329_0;
                    stackIn_330_1 = stackIn_329_1;
                    stackIn_330_2 = 8192 / var6;
                    statePc = 330;
                    continue stateLoop;
                }
                case 330: {
                    mb.a(stackIn_330_0 != 0, stackIn_330_1, stackIn_330_2);
                    statePc = 331;
                    continue stateLoop;
                }
                case 331: {
                    if ((this.field_k ^ -1) < -1) {
                        statePc = 333;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 333: {
                    this.field_k = this.field_k - 1;
                    statePc = 334;
                    continue stateLoop;
                }
                case 334: {
                    if (this.field_e > 72) {
                        statePc = 336;
                    } else {
                        statePc = 412;
                    }
                    continue stateLoop;
                }
                case 336: {
                    vk.field_p = vk.field_p + 1;
                    var4 = 0;
                    statePc = 337;
                    continue stateLoop;
                }
                case 337: {
                    if (16 <= var4) {
                        statePc = 341;
                    } else {
                        statePc = 338;
                    }
                    continue stateLoop;
                }
                case 338: {
                    var24 = new rb(31, (rb) (this));
                    pk.a((byte) 32, var24);
                    var4++;
                    if (var9 != 0) {
                        statePc = 342;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    if (var9 == 0) {
                        statePc = 337;
                    } else {
                        statePc = 341;
                    }
                    continue stateLoop;
                }
                case 341: {
                    mb.a(true, 27, 256);
                    this.field_e = 0;
                    ob.field_j = vk.field_p;
                    pl.field_a = pl.field_a + vk.field_p * 4;
                    ud.field_k = ud.field_k + 4;
                    cb.field_a = 256;
                    bi.field_i = bi.field_i + 4;
                    ic.field_t = ic.field_t + ((-111141 & lc.field_h) >>> 131248687);
                    this.field_c = 0;
                    this.field_d = 0;
                    this.field_j = this.field_j - 5;
                    statePc = 342;
                    continue stateLoop;
                }
                case 342: {
                    if (var9 == 0) {
                        statePc = 412;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 343: {
                    this.field_l = this.field_l + 10;
                    if (150 < this.field_l) {
                        statePc = 345;
                    } else {
                        statePc = 346;
                    }
                    continue stateLoop;
                }
                case 345: {
                    this.field_l = this.field_l - 150;
                    this.field_m = this.field_m + 1;
                    statePc = 346;
                    continue stateLoop;
                }
                case 346: {
                    if ((this.field_m ^ -1) <= -37) {
                        statePc = 348;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 348: {
                    this.field_m = this.field_m - 36;
                    statePc = 349;
                    continue stateLoop;
                }
                case 349: {
                    this.field_g = 48;
                    if (!pg.field_e) {
                        statePc = 352;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 350: {
                    if (-1 == kd.field_a) {
                        statePc = 364;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 352: {
                    var4 = this.field_a >> -863563004;
                    var5 = (this.field_b >> -1449769372) + -720 - -ea.field_p[kb.field_b];
                    var6 = (int)Math.sqrt((double)(var5 * var5 + var4 * var4));
                    if (kd.field_b[kb.field_b] + this.field_g <= var6) {
                        statePc = 357;
                    } else {
                        statePc = 353;
                    }
                    continue stateLoop;
                }
                case 353: {
                    if (!pg.field_e) {
                        statePc = 355;
                    } else {
                        statePc = 356;
                    }
                    continue stateLoop;
                }
                case 355: {
                    mb.a(true, 12, 256);
                    statePc = 356;
                    continue stateLoop;
                }
                case 356: {
                    this.field_e = 129;
                    pg.field_e = true;
                    statePc = 357;
                    continue stateLoop;
                }
                case 357: {
                    if (-1 != (this.field_m % 8 ^ -1)) {
                        statePc = 364;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 358: {
                    if (20 > this.field_l) {
                        statePc = 360;
                    } else {
                        statePc = 364;
                    }
                    continue stateLoop;
                }
                case 360: {
                    stackIn_362_0 = 1;
                    stackIn_361_0 = stackIn_362_0;
                    stackIn_362_1 = 25;
                    stackIn_361_1 = stackIn_362_1;
                    if (-33 < (var6 ^ -1)) {
                        statePc = 362;
                    } else {
                        statePc = 361;
                    }
                    continue stateLoop;
                }
                case 361: {
                    stackIn_363_0 = stackIn_361_0;
                    stackIn_363_1 = stackIn_361_1;
                    stackIn_363_2 = 8192 / var6;
                    statePc = 363;
                    continue stateLoop;
                }
                case 362: {
                    stackIn_363_0 = stackIn_362_0;
                    stackIn_363_1 = stackIn_362_1;
                    stackIn_363_2 = 256;
                    statePc = 363;
                    continue stateLoop;
                }
                case 363: {
                    mb.a(stackIn_363_0 != 0, stackIn_363_1, stackIn_363_2);
                    statePc = 364;
                    continue stateLoop;
                }
                case 364: {
                    if (this.field_k > 0) {
                        statePc = 366;
                    } else {
                        statePc = 367;
                    }
                    continue stateLoop;
                }
                case 366: {
                    this.field_k = this.field_k - 1;
                    statePc = 367;
                    continue stateLoop;
                }
                case 367: {
                    if (this.field_e <= 128) {
                        statePc = 412;
                    } else {
                        statePc = 368;
                    }
                    continue stateLoop;
                }
                case 368: {
                    vk.field_p = vk.field_p + 1;
                    var4 = 0;
                    statePc = 369;
                    continue stateLoop;
                }
                case 369: {
                    if (32 <= var4) {
                        statePc = 373;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 370: {
                    var25 = new rb(31, (rb) (this));
                    pk.a((byte) 32, var25);
                    var4++;
                    if (var9 != 0) {
                        statePc = 374;
                    } else {
                        statePc = 371;
                    }
                    continue stateLoop;
                }
                case 371: {
                    if (var9 == 0) {
                        statePc = 369;
                    } else {
                        statePc = 373;
                    }
                    continue stateLoop;
                }
                case 373: {
                    mb.a(true, 26, 256);
                    pl.field_a = pl.field_a + 5 * vk.field_p;
                    cb.field_a = 256;
                    this.field_c = 0;
                    bi.field_i = bi.field_i + 5;
                    this.field_j = this.field_j - 5;
                    ic.field_t = ic.field_t + (lc.field_h >>> -546010799) * 5;
                    this.field_e = 0;
                    ob.field_j = vk.field_p;
                    this.field_d = 0;
                    ud.field_k = ud.field_k + 5;
                    statePc = 374;
                    continue stateLoop;
                }
                case 374: {
                    if (var9 == 0) {
                        statePc = 412;
                    } else {
                        statePc = 375;
                    }
                    continue stateLoop;
                }
                case 375: {
                    this.field_l = this.field_l + 10;
                    if ((this.field_l ^ -1) >= -151) {
                        statePc = 377;
                    } else {
                        statePc = 376;
                    }
                    continue stateLoop;
                }
                case 376: {
                    this.field_l = this.field_l - 150;
                    this.field_m = this.field_m + 1;
                    statePc = 377;
                    continue stateLoop;
                }
                case 377: {
                    if (36 <= this.field_m) {
                        statePc = 379;
                    } else {
                        statePc = 380;
                    }
                    continue stateLoop;
                }
                case 379: {
                    this.field_m = this.field_m - 36;
                    statePc = 380;
                    continue stateLoop;
                }
                case 380: {
                    this.field_g = 64;
                    if (!pg.field_e) {
                        statePc = 383;
                    } else {
                        statePc = 381;
                    }
                    continue stateLoop;
                }
                case 381: {
                    if ((kd.field_a ^ -1) != 0) {
                        statePc = 383;
                    } else {
                        statePc = 394;
                    }
                    continue stateLoop;
                }
                case 383: {
                    var4 = this.field_a >> -1637183836;
                    var5 = (this.field_b >> 1116271908) - (720 - ea.field_p[kb.field_b]);
                    var6 = (int)Math.sqrt((double)(var4 * var4 + var5 * var5));
                    if (kd.field_b[kb.field_b] + this.field_g <= var6) {
                        statePc = 388;
                    } else {
                        statePc = 384;
                    }
                    continue stateLoop;
                }
                case 384: {
                    if (!pg.field_e) {
                        statePc = 386;
                    } else {
                        statePc = 387;
                    }
                    continue stateLoop;
                }
                case 386: {
                    mb.a(true, 12, 256);
                    statePc = 387;
                    continue stateLoop;
                }
                case 387: {
                    this.field_e = 513;
                    pg.field_e = true;
                    statePc = 388;
                    continue stateLoop;
                }
                case 388: {
                    if (this.field_m % 8 != 0) {
                        statePc = 394;
                    } else {
                        statePc = 389;
                    }
                    continue stateLoop;
                }
                case 389: {
                    if ((this.field_l ^ -1) <= -21) {
                        statePc = 394;
                    } else {
                        statePc = 390;
                    }
                    continue stateLoop;
                }
                case 390: {
                    stackIn_392_0 = 1;
                    stackIn_391_0 = stackIn_392_0;
                    stackIn_392_1 = 25;
                    stackIn_391_1 = stackIn_392_1;
                    if ((var6 ^ -1) <= -33) {
                        statePc = 392;
                    } else {
                        statePc = 391;
                    }
                    continue stateLoop;
                }
                case 391: {
                    stackIn_393_0 = stackIn_391_0;
                    stackIn_393_1 = stackIn_391_1;
                    stackIn_393_2 = 256;
                    statePc = 393;
                    continue stateLoop;
                }
                case 392: {
                    stackIn_393_0 = stackIn_392_0;
                    stackIn_393_1 = stackIn_392_1;
                    stackIn_393_2 = 8192 / var6;
                    statePc = 393;
                    continue stateLoop;
                }
                case 393: {
                    mb.a(stackIn_393_0 != 0, stackIn_393_1, stackIn_393_2);
                    statePc = 394;
                    continue stateLoop;
                }
                case 394: {
                    if (0 < this.field_k) {
                        statePc = 396;
                    } else {
                        statePc = 397;
                    }
                    continue stateLoop;
                }
                case 396: {
                    this.field_k = this.field_k - 1;
                    statePc = 397;
                    continue stateLoop;
                }
                case 397: {
                    if ((this.field_e ^ -1) < -257) {
                        statePc = 399;
                    } else {
                        statePc = 412;
                    }
                    continue stateLoop;
                }
                case 399: {
                    vk.field_p = vk.field_p + 1;
                    var4 = 0;
                    statePc = 400;
                    continue stateLoop;
                }
                case 400: {
                    if (var4 >= 32) {
                        statePc = 404;
                    } else {
                        statePc = 401;
                    }
                    continue stateLoop;
                }
                case 401: {
                    var26 = new rb(31, (rb) (this));
                    pk.a((byte) 32, var26);
                    var4++;
                    if (var9 != 0) {
                        statePc = 405;
                    } else {
                        statePc = 402;
                    }
                    continue stateLoop;
                }
                case 402: {
                    if (var9 == 0) {
                        statePc = 400;
                    } else {
                        statePc = 404;
                    }
                    continue stateLoop;
                }
                case 404: {
                    mb.a(true, 26, 256);
                    ic.field_t = ic.field_t + 6 * (lc.field_h >>> -33709039);
                    this.field_j = this.field_j - 6;
                    this.field_c = 0;
                    cb.field_a = 256;
                    ob.field_j = vk.field_p;
                    ud.field_k = ud.field_k + 6;
                    this.field_e = 0;
                    this.field_d = 0;
                    bi.field_i = bi.field_i + 6;
                    pl.field_a = pl.field_a + 6 * vk.field_p;
                    statePc = 405;
                    continue stateLoop;
                }
                case 405: {
                    if (var9 == 0) {
                        statePc = 412;
                    } else {
                        statePc = 406;
                    }
                    continue stateLoop;
                }
                case 406: {
                    this.field_e = this.field_e + 1;
                    if (this.field_g < this.field_e) {
                        statePc = 408;
                    } else {
                        statePc = 412;
                    }
                    continue stateLoop;
                }
                case 408: {
                    this.field_h = true;
                    return null;
                }
                case 409: {
                    this.field_e = this.field_e + 2;
                    if (256 < this.field_e) {
                        statePc = 411;
                    } else {
                        statePc = 412;
                    }
                    continue stateLoop;
                }
                case 411: {
                    this.field_h = true;
                    return null;
                }
                case 412: {
                    if ((this.field_j ^ -1) == -6) {
                        statePc = 2;
                    } else {
                        statePc = 413;
                    }
                    continue stateLoop;
                }
                case 413: {
                    stackIn_6_0 = 7;
                    stackIn_414_0 = stackIn_6_0;
                    stackIn_6_1 = this.field_j;
                    stackIn_414_1 = stackIn_6_1;
                    if (var9 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 414;
                    }
                    continue stateLoop;
                }
                case 414: {
                    if (stackIn_414_0 == stackIn_414_1) {
                        statePc = 2;
                    } else {
                        statePc = 415;
                    }
                    continue stateLoop;
                }
                case 415: {
                    return (rb) (this);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void c(int param0) {
        if (ad.field_h != -a.field_i + 0 && ad.field_h != 250 + -a.field_i) {
        }
        ad.field_h = ad.field_h + 1;
        if (param0 != -27347) {
            rb.a(78);
        }
    }

    final static boolean a(int param0) {
        if (param0 != -1) {
            return false;
        }
        return lb.b(ia.g(-45), 6669);
    }

    private final void a(int param0, int param1, int param2) {
        int statePc = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        rb var12 = null;
        rb var13 = null;
        rb var14 = null;
        rb var15 = null;
        rb var16 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = SolKnight.field_L ? 1 : 0;
                    if (param1 == -19) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_f = -7;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var8 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var8 < kf.field_G.length) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    if (var11 == 0) {
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
                    if (null != kf.field_G[var8]) {
                        statePc = 9;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var12 = kf.field_G[var8];
                    if (0 >= var12.field_g) {
                        statePc = 81;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var12.field_h) {
                        statePc = 81;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (-26 < (var12.field_j ^ -1)) {
                        statePc = 81;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if ((var12.field_j ^ -1) >= -31) {
                        statePc = 14;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var5 = var12.field_a - this.field_a >> 1173828164;
                    var6 = -this.field_b + var12.field_b >> -632933532;
                    var7 = (int)Math.sqrt((double)(var5 * var5 + var6 * var6));
                    if (this.field_g + var12.field_g < var7) {
                        statePc = 81;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if ((var7 ^ -1) < -1) {
                        statePc = 17;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var12.field_d = var12.field_d + param2 * var6 * 6400 / (var12.field_g * (var7 * var12.field_g * var12.field_g));
                    var12.field_c = var12.field_c + 6400 * (var5 * param2) / (var12.field_g * (var7 * var12.field_g * var12.field_g));
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (this.field_j != param0) {
                        statePc = 20;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (9 == param0) {
                        statePc = 22;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 22: {
                    mb.a(true, 4, 256);
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (param0 == 12) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    mb.a(true, 31, 256);
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (17 != param0) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    mb.a(true, 32, 256);
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (18 == param0) {
                        statePc = 30;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 30: {
                    mb.a(true, 33, 256);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (param0 == 13) {
                        statePc = 33;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 33: {
                    mb.a(true, 16, 256 * (bi.field_h + 1) / 3);
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (-11 == (param0 ^ -1)) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (-12 != (param0 ^ -1)) {
                        statePc = 44;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (-4 != (this.field_j ^ -1)) {
                        statePc = 43;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (11 != param0) {
                        statePc = 41;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    mb.a(true, 34, 256);
                    if (var11 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    mb.a(true, 9, 256);
                    if (var11 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    mb.a(true, 4, 256);
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    this.field_j = param0;
                    if (param0 == 13) {
                        statePc = 74;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (9 == this.field_j) {
                        statePc = 47;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var9 = 0;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if ((var9 ^ -1) <= -3) {
                        statePc = 52;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var13 = new rb(31, (rb) (this));
                    pk.a((byte) 32, var13);
                    var13.field_c = bk.a(32, jb.field_g, (byte) 59) + -16;
                    var13.field_d = -16 + bk.a(32, jb.field_g, (byte) 84);
                    var9++;
                    if (var11 != 0) {
                        statePc = 54;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (var11 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if ((this.field_j ^ -1) == -13) {
                        statePc = 54;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var9 = 0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if ((var9 ^ -1) <= -2) {
                        statePc = 59;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var14 = new rb(31, (rb) (this));
                    pk.a((byte) 32, var14);
                    var14.field_c = -16 + bk.a(32, jb.field_g, (byte) 65);
                    var14.field_d = bk.a(32, jb.field_g, (byte) 123) - 16;
                    var9++;
                    if (var11 != 0) {
                        statePc = 61;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (var11 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (-18 == (this.field_j ^ -1)) {
                        statePc = 61;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var9 = 0;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (-3 >= (var9 ^ -1)) {
                        statePc = 66;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var15 = new rb(31, (rb) (this));
                    pk.a((byte) 32, var15);
                    var15.field_c = bk.a(32, jb.field_g, (byte) 74) - 16;
                    var15.field_d = bk.a(32, jb.field_g, (byte) 79) + -16;
                    var9++;
                    if (var11 != 0) {
                        statePc = 73;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (var11 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if ((this.field_j ^ -1) != -19) {
                        statePc = 72;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var9 = 0;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (4 <= var9) {
                        statePc = 72;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var16 = new rb(31, (rb) (this));
                    pk.a((byte) 32, var16);
                    var16.field_c = bk.a(32, jb.field_g, (byte) 111) + -16;
                    var16.field_d = -16 + bk.a(32, jb.field_g, (byte) -127);
                    var9++;
                    if (var11 != 0) {
                        statePc = 73;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (var11 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    this.field_d = 0;
                    this.field_c = 0;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    this.field_e = 0;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (param2 > 0) {
                        statePc = 76;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var12.field_k = 50;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    var12.field_e = var12.field_e + param2;
                    ia.field_hb = 0;
                    if (param0 == 10) {
                        statePc = 81;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if ((param0 ^ -1) == -12) {
                        statePc = 81;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (-19 == (param0 ^ -1)) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    return;
                }
                case 81: {
                    var8++;
                    if (var11 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        L0: {
          var11 = SolKnight.field_L ? 1 : 0;
          var4 = (this.field_a >> 1631781604) + (-wd.field_c - -320);
          var5 = -si.field_E + (this.field_b >> -1425112636);
          if (param0 > 69) {
            break L0;
          } else {
            this.a((byte) 84);
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
                                                    L23: {
                                                      L24: {
                                                        L25: {
                                                          L26: {
                                                            L27: {
                                                              L28: {
                                                                L29: {
                                                                  var8 = 0;
                                                                  var9 = 0;
                                                                  var10 = this.field_j;
                                                                  if (var10 == 0) {
                                                                    break L29;
                                                                  } else {
                                                                    L30: {
                                                                      if (1 != var10) {
                                                                        break L30;
                                                                      } else {
                                                                        if (var11 == 0) {
                                                                          break L28;
                                                                        } else {
                                                                          break L30;
                                                                        }
                                                                      }
                                                                    }
                                                                    L31: {
                                                                      if (2 != var10) {
                                                                        break L31;
                                                                      } else {
                                                                        if (var11 == 0) {
                                                                          break L27;
                                                                        } else {
                                                                          break L31;
                                                                        }
                                                                      }
                                                                    }
                                                                    L32: {
                                                                      if (var10 != 3) {
                                                                        break L32;
                                                                      } else {
                                                                        if (var11 == 0) {
                                                                          break L26;
                                                                        } else {
                                                                          break L32;
                                                                        }
                                                                      }
                                                                    }
                                                                    L33: {
                                                                      if (var10 != 4) {
                                                                        break L33;
                                                                      } else {
                                                                        if (var11 == 0) {
                                                                          break L25;
                                                                        } else {
                                                                          break L33;
                                                                        }
                                                                      }
                                                                    }
                                                                    L34: {
                                                                      if ((var10 ^ -1) != -6) {
                                                                        break L34;
                                                                      } else {
                                                                        if (var11 == 0) {
                                                                          break L24;
                                                                        } else {
                                                                          break L34;
                                                                        }
                                                                      }
                                                                    }
                                                                    if (-7 == (var10 ^ -1)) {
                                                                      break L23;
                                                                    } else {
                                                                      L35: {
                                                                        if (var10 != 7) {
                                                                          break L35;
                                                                        } else {
                                                                          if (var11 == 0) {
                                                                            break L1;
                                                                          } else {
                                                                            break L35;
                                                                          }
                                                                        }
                                                                      }
                                                                      L36: {
                                                                        if ((var10 ^ -1) != -9) {
                                                                          break L36;
                                                                        } else {
                                                                          if (var11 == 0) {
                                                                            break L22;
                                                                          } else {
                                                                            break L36;
                                                                          }
                                                                        }
                                                                      }
                                                                      L37: {
                                                                        if (-10 != (var10 ^ -1)) {
                                                                          break L37;
                                                                        } else {
                                                                          if (var11 == 0) {
                                                                            break L21;
                                                                          } else {
                                                                            break L37;
                                                                          }
                                                                        }
                                                                      }
                                                                      if ((var10 ^ -1) == -11) {
                                                                        break L20;
                                                                      } else {
                                                                        L38: {
                                                                          if (-12 != (var10 ^ -1)) {
                                                                            break L38;
                                                                          } else {
                                                                            if (var11 == 0) {
                                                                              break L19;
                                                                            } else {
                                                                              break L38;
                                                                            }
                                                                          }
                                                                        }
                                                                        L39: {
                                                                          if (var10 != 12) {
                                                                            break L39;
                                                                          } else {
                                                                            if (var11 == 0) {
                                                                              break L18;
                                                                            } else {
                                                                              break L39;
                                                                            }
                                                                          }
                                                                        }
                                                                        L40: {
                                                                          if (13 != var10) {
                                                                            break L40;
                                                                          } else {
                                                                            if (var11 == 0) {
                                                                              break L17;
                                                                            } else {
                                                                              break L40;
                                                                            }
                                                                          }
                                                                        }
                                                                        L41: {
                                                                          if (14 != var10) {
                                                                            break L41;
                                                                          } else {
                                                                            if (var11 == 0) {
                                                                              break L16;
                                                                            } else {
                                                                              break L41;
                                                                            }
                                                                          }
                                                                        }
                                                                        if (var10 == 15) {
                                                                          break L15;
                                                                        } else {
                                                                          L42: {
                                                                            if (16 != var10) {
                                                                              break L42;
                                                                            } else {
                                                                              if (var11 == 0) {
                                                                                break L14;
                                                                              } else {
                                                                                break L42;
                                                                              }
                                                                            }
                                                                          }
                                                                          L43: {
                                                                            if (var10 != 17) {
                                                                              break L43;
                                                                            } else {
                                                                              if (var11 == 0) {
                                                                                break L13;
                                                                              } else {
                                                                                break L43;
                                                                              }
                                                                            }
                                                                          }
                                                                          L44: {
                                                                            if (var10 != 18) {
                                                                              break L44;
                                                                            } else {
                                                                              if (var11 == 0) {
                                                                                break L12;
                                                                              } else {
                                                                                break L44;
                                                                              }
                                                                            }
                                                                          }
                                                                          L45: {
                                                                            if (19 != var10) {
                                                                              break L45;
                                                                            } else {
                                                                              if (var11 == 0) {
                                                                                break L11;
                                                                              } else {
                                                                                break L45;
                                                                              }
                                                                            }
                                                                          }
                                                                          L46: {
                                                                            if (25 != var10) {
                                                                              break L46;
                                                                            } else {
                                                                              if (var11 == 0) {
                                                                                break L10;
                                                                              } else {
                                                                                break L46;
                                                                              }
                                                                            }
                                                                          }
                                                                          L47: {
                                                                            if (26 != var10) {
                                                                              break L47;
                                                                            } else {
                                                                              if (var11 == 0) {
                                                                                break L9;
                                                                              } else {
                                                                                break L47;
                                                                              }
                                                                            }
                                                                          }
                                                                          L48: {
                                                                            if (-28 != (var10 ^ -1)) {
                                                                              break L48;
                                                                            } else {
                                                                              if (var11 == 0) {
                                                                                break L8;
                                                                              } else {
                                                                                break L48;
                                                                              }
                                                                            }
                                                                          }
                                                                          if (-29 == (var10 ^ -1)) {
                                                                            break L7;
                                                                          } else {
                                                                            if ((var10 ^ -1) == -30) {
                                                                              break L6;
                                                                            } else {
                                                                              L49: {
                                                                                if (30 != var10) {
                                                                                  break L49;
                                                                                } else {
                                                                                  if (var11 == 0) {
                                                                                    break L5;
                                                                                  } else {
                                                                                    break L49;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L50: {
                                                                                if ((var10 ^ -1) != -21) {
                                                                                  break L50;
                                                                                } else {
                                                                                  if (var11 == 0) {
                                                                                    break L4;
                                                                                  } else {
                                                                                    break L50;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L51: {
                                                                                if (21 != var10) {
                                                                                  break L51;
                                                                                } else {
                                                                                  if (var11 == 0) {
                                                                                    break L4;
                                                                                  } else {
                                                                                    break L51;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L52: {
                                                                                if ((var10 ^ -1) != -23) {
                                                                                  break L52;
                                                                                } else {
                                                                                  if (var11 == 0) {
                                                                                    break L4;
                                                                                  } else {
                                                                                    break L52;
                                                                                  }
                                                                                }
                                                                              }
                                                                              if ((var10 ^ -1) == -24) {
                                                                                break L4;
                                                                              } else {
                                                                                L53: {
                                                                                  if (var10 != 24) {
                                                                                    break L53;
                                                                                  } else {
                                                                                    if (var11 == 0) {
                                                                                      break L4;
                                                                                    } else {
                                                                                      break L53;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                if ((var10 ^ -1) != -32) {
                                                                                  break L2;
                                                                                } else {
                                                                                  if (var11 == 0) {
                                                                                    break L3;
                                                                                  } else {
                                                                                    break L29;
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
                                                                L54: {
                                                                  var6 = (int)(128.0 * Math.atan2((double)(-this.field_c), (double)(-this.field_d)) / 3.141592653589793);
                                                                  if ((this.field_d | this.field_c) != 0) {
                                                                    var10 = (int)Math.sqrt((double)(this.field_d * this.field_d + this.field_c * this.field_c));
                                                                    var8 = this.field_c * 12 / var10;
                                                                    var9 = this.field_d * 12 / var10;
                                                                    break L54;
                                                                  } else {
                                                                    break L54;
                                                                  }
                                                                }
                                                                L55: {
                                                                  if (kb.field_b != 0) {
                                                                    break L55;
                                                                  } else {
                                                                    hf.field_c[0].a(128, var5, 125, var6, var4);
                                                                    mi.a(var4 - var8, -var9 + var5, 1 - -(this.field_i / 30), 16776960, 128);
                                                                    mi.e(var4 + -var8, var5 + -var9, this.field_n / 40 + 1, 16777215);
                                                                    if (var11 == 0) {
                                                                      break L1;
                                                                    } else {
                                                                      break L55;
                                                                    }
                                                                  }
                                                                }
                                                                hf.field_c[2].a(64, var5, 110, var6, var4);
                                                                mi.a(-var8 + var4, -var9 + var5, this.field_i / 40 + 1, 16776960, 128);
                                                                mi.e(-var8 + var4, -var9 + var5, 1 - -(this.field_n / 60), 16777215);
                                                                if (var11 == 0) {
                                                                  break L1;
                                                                } else {
                                                                  break L28;
                                                                }
                                                              }
                                                              L56: {
                                                                var6 = (int)(128.0 * Math.atan2((double)(-this.field_c), (double)(-this.field_d)) / 3.141592653589793);
                                                                hf.field_c[1].a(128, var5, 109, var6, var4);
                                                                if (0 != (this.field_d | this.field_c)) {
                                                                  var10 = (int)Math.sqrt((double)(this.field_d * this.field_d + this.field_c * this.field_c));
                                                                  var9 = 12 * this.field_d / var10;
                                                                  var8 = 12 * this.field_c / var10;
                                                                  break L56;
                                                                } else {
                                                                  break L56;
                                                                }
                                                              }
                                                              mi.a(-var8 + var4, var5 - var9, 1 + this.field_i / 30, 16776960, 128);
                                                              mi.e(-var8 + var4, -var9 + var5, this.field_n / 40 + 1, 16777215);
                                                              if (var11 == 0) {
                                                                break L1;
                                                              } else {
                                                                break L27;
                                                              }
                                                            }
                                                            L57: {
                                                              var6 = (int)(Math.atan2((double)(-this.field_c), (double)(-this.field_d)) * 128.0 / 3.141592653589793);
                                                              hf.field_c[2].a(128, var5, 121, var6, var4);
                                                              if (-1 == ((this.field_c | this.field_d) ^ -1)) {
                                                                break L57;
                                                              } else {
                                                                var10 = (int)Math.sqrt((double)(this.field_c * this.field_c + this.field_d * this.field_d));
                                                                var9 = this.field_d * 12 / var10;
                                                                var8 = this.field_c * 12 / var10;
                                                                break L57;
                                                              }
                                                            }
                                                            mi.a(var4 - var8, -var9 + var5, this.field_i / 24 + 1, 16776960, 128);
                                                            mi.e(var4 + -var8, var5 - var9, 1 + this.field_n / 30, 16777215);
                                                            if (var11 == 0) {
                                                              break L1;
                                                            } else {
                                                              break L26;
                                                            }
                                                          }
                                                          var6 = (int)(128.0 * Math.atan2((double)(-this.field_c), (double)(-this.field_d)) / 3.141592653589793);
                                                          hf.field_c[3].a(128, var5, 89, var6, var4);
                                                          mi.a(-var8 + var4, -var9 + var5, 1 + this.field_i / 20, 16776960, 128);
                                                          mi.e(var4 + -var8, -var9 + var5, 1 + this.field_n / 24, 16777215);
                                                          if (var11 == 0) {
                                                            break L1;
                                                          } else {
                                                            break L25;
                                                          }
                                                        }
                                                        mi.e(var4, var5, -(this.field_c / 16) + var4, -(this.field_d / 16) + var5, 16777215);
                                                        mi.e(var4 + -((this.field_c - -(this.field_d / 10)) / 16), var5 - (this.field_d - this.field_c / 10) / 16, var4, var5, 16777215);
                                                        mi.e(var4 + -((-(this.field_d / 10) + this.field_c) / 16), var5 + -((this.field_d + this.field_c / 10) / 16), var4, var5, 16777215);
                                                        mi.e(var4 + -((this.field_c + this.field_d / 20) / 16), var5 - (-(this.field_c / 20) + this.field_d) / 16, var4, var5, 16777215);
                                                        mi.e(-((this.field_c + -(this.field_d / 20)) / 16) + var4, -((this.field_d - -(this.field_c / 20)) / 16) + var5, var4, var5, 16777215);
                                                        if (var11 == 0) {
                                                          break L1;
                                                        } else {
                                                          break L24;
                                                        }
                                                      }
                                                      mi.e(var4, var5, 1, 16711680);
                                                      if (var11 == 0) {
                                                        break L1;
                                                      } else {
                                                        break L23;
                                                      }
                                                    }
                                                    mi.e(var4, var5, 4, 65280);
                                                    mi.e(var4 + -(this.field_c / 32), -(this.field_d / 32) + var5, 3, 65280);
                                                    mi.e(-(this.field_c / 16) + var4, var5 - this.field_d / 16, 2, 65280);
                                                    mi.e(var4, var5, 3, 16776960);
                                                    mi.e(var4, var5, 2, 16777215);
                                                    if (var11 == 0) {
                                                      break L1;
                                                    } else {
                                                      break L22;
                                                    }
                                                  }
                                                  var7 = this.field_e * 64 / 256;
                                                  if (-17 < (var7 ^ -1)) {
                                                    eh.field_b[var7].d(-this.field_e + var4, var5 - this.field_e, this.field_e * 2, this.field_e * 2, (256 - this.field_e * 4) / 2);
                                                    if (var11 == 0) {
                                                      break L1;
                                                    } else {
                                                      break L21;
                                                    }
                                                  } else {
                                                    break L1;
                                                  }
                                                }
                                                L58: {
                                                  var7 = this.field_e * 256 / 256;
                                                  if (var7 < 16) {
                                                    ii.field_g[var7].c(-(this.field_e * 4) + var4, -(this.field_e * 4) + var5, 8 * this.field_e, 8 * this.field_e, 256 + -(this.field_e * 16));
                                                    break L58;
                                                  } else {
                                                    break L58;
                                                  }
                                                }
                                                var7 = 64 * this.field_e / 256;
                                                if (16 <= var7) {
                                                  break L1;
                                                } else {
                                                  ii.field_g[var7].c(-(2 * this.field_e) + var4, -(this.field_e * 2) + var5, this.field_e * 4, 4 * this.field_e, -(this.field_e * 4) + 256);
                                                  if (var11 == 0) {
                                                    break L1;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                              }
                                              L59: {
                                                var7 = 256 * this.field_e / 256;
                                                if (16 > var7) {
                                                  ua.field_F[var7].c(var4 - 4 * this.field_e, var5 - 4 * this.field_e, 8 * this.field_e, 8 * this.field_e, 256 + -(this.field_e * 16));
                                                  break L59;
                                                } else {
                                                  break L59;
                                                }
                                              }
                                              var7 = 2 + this.field_e * 42 / 256;
                                              if ((var7 ^ -1) > -17) {
                                                L60: {
                                                  L61: {
                                                    if (4 > var7) {
                                                      break L61;
                                                    } else {
                                                      var7 = var7 - 4;
                                                      if (var11 == 0) {
                                                        break L60;
                                                      } else {
                                                        break L61;
                                                      }
                                                    }
                                                  }
                                                  var7 = 0;
                                                  break L60;
                                                }
                                                ua.field_F[var7].c(var4 - (-this.field_e - -128), -128 - (-this.field_e - var5), 2 * -this.field_e - -256, 256 + 2 * -this.field_e, -(this.field_e * 3) + 256);
                                                if (var11 == 0) {
                                                  break L1;
                                                } else {
                                                  break L19;
                                                }
                                              } else {
                                                break L1;
                                              }
                                            }
                                            L62: {
                                              var7 = 256 * this.field_e / 256;
                                              if ((var7 ^ -1) > -17) {
                                                ua.field_F[var7].c(-(4 * this.field_e) + var4, var5 + -(this.field_e * 4), 8 * this.field_e, 8 * this.field_e, -(this.field_e * 16) + 256);
                                                break L62;
                                              } else {
                                                break L62;
                                              }
                                            }
                                            var7 = 28 * this.field_e / 256 + 2;
                                            if (-17 >= (var7 ^ -1)) {
                                              break L1;
                                            } else {
                                              L63: {
                                                L64: {
                                                  if (-5 < (var7 ^ -1)) {
                                                    break L64;
                                                  } else {
                                                    var7 = -4 + var7;
                                                    if (var11 == 0) {
                                                      break L63;
                                                    } else {
                                                      break L64;
                                                    }
                                                  }
                                                }
                                                var7 = 0;
                                                break L63;
                                              }
                                              ua.field_F[var7].c(this.field_e + -192 + var4, this.field_e - 192 + var5, 2 * (-this.field_e - -192), -this.field_e * 2 - -384, -(2 * this.field_e) + 256);
                                              if (var11 == 0) {
                                                break L1;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                          var7 = 256 * this.field_e / 256;
                                          if ((var7 ^ -1) > -17) {
                                            ii.field_g[var7].c(var4 + -8, -8 + var5, 16, 16, -(16 * this.field_e) + 256);
                                            if (var11 == 0) {
                                              break L1;
                                            } else {
                                              break L17;
                                            }
                                          } else {
                                            break L1;
                                          }
                                        }
                                        var7 = 256 * this.field_e / 256;
                                        if ((var7 ^ -1) > -17) {
                                          ii.field_g[var7].c(var4 - 16, -16 + var5, 32, 32, 256 - this.field_e * 16);
                                          if (var11 == 0) {
                                            break L1;
                                          } else {
                                            break L16;
                                          }
                                        } else {
                                          break L1;
                                        }
                                      }
                                      mi.e(-(this.field_c / 16) + var4, var5 + -(this.field_d / 16), var4, var5, 16711680);
                                      if (var11 == 0) {
                                        break L1;
                                      } else {
                                        break L15;
                                      }
                                    }
                                    mi.e(1 + var4 - this.field_c / 16, var5 - this.field_d / 16, 1 + var4, var5, 16711680);
                                    mi.e(-(this.field_c / 16) + var4 + -1, -(this.field_d / 16) + var5, var4 + -1, var5, 16711680);
                                    mi.e(var4 - this.field_c / 16, 1 + var5 - this.field_d / 16, var4, 1 + var5, 16711680);
                                    mi.e(-(this.field_c / 16) + var4, -1 + -(this.field_d / 16) + var5, var4, -1 + var5, 16711680);
                                    mi.e(-(this.field_c / 16) + var4, var5 - this.field_d / 16, var4, var5, 16776960);
                                    if (var11 == 0) {
                                      break L1;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  mi.e(1 + (-(this.field_c / 16) + var4), var5 - this.field_d / 16, 1 + var4, var5, 16776960);
                                  mi.e(-1 + (-(this.field_c / 16) + var4), -(this.field_d / 16) + var5, var4 + -1, var5, 16776960);
                                  mi.e(var4 + -(this.field_c / 16), -(this.field_d / 16) + (var5 + 1), var4, 1 + var5, 16776960);
                                  mi.e(-(this.field_c / 16) + var4, -(this.field_d / 16) + (var5 - 1), var4, -1 + var5, 16776960);
                                  mi.e(-(this.field_c / 16) + var4, var5 - this.field_d / 16, var4, var5, 16777215);
                                  if (var11 == 0) {
                                    break L1;
                                  } else {
                                    break L13;
                                  }
                                }
                                if (255 <= this.field_e * 16) {
                                  break L1;
                                } else {
                                  mi.a(var4, var5, this.field_e * 4, 65280, 255 - 16 * this.field_e);
                                  if (var11 == 0) {
                                    break L1;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              L65: {
                                if (this.field_e * 8 >= 255) {
                                  break L65;
                                } else {
                                  mi.a(var4, var5, 2 * this.field_e, 65280, -(this.field_e * 8) + 255);
                                  break L65;
                                }
                              }
                              if ((this.field_e * 16 ^ -1) > -256) {
                                mi.a(var4, var5, this.field_e, 16776960, -(this.field_e * 16) + 255);
                                if (var11 == 0) {
                                  break L1;
                                } else {
                                  break L11;
                                }
                              } else {
                                break L1;
                              }
                            }
                            mi.a((this.field_c >> -625165724) + var4, (this.field_d >> 1225961508) + var5, this.field_g - -4, 16711680, 32);
                            mi.e(var4, var5, this.field_g, 16777215);
                            if (var11 == 0) {
                              break L1;
                            } else {
                              break L10;
                            }
                          }
                          L66: {
                            wi.field_i[this.field_m].a(21, var5, 110, 0, var4);
                            if ((this.field_k ^ -1) < -1) {
                              break L66;
                            } else {
                              if (param1 < -this.field_g + var4) {
                                break L1;
                              } else {
                                if (param1 > this.field_g + var4) {
                                  break L1;
                                } else {
                                  if (param2 < var5 + -this.field_g) {
                                    break L1;
                                  } else {
                                    if (param2 <= this.field_g + var5) {
                                      break L66;
                                    } else {
                                      break L1;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if ((kd.field_a ^ -1) == 0) {
                            mi.b(var4 - this.field_g / 2, -2 + var5, this.field_g + -(this.field_e * this.field_g / 4), 4, 16744576);
                            mi.g(var4 - this.field_g / 2, -2 + var5, this.field_g, 4, 16711680);
                            if (var11 == 0) {
                              break L1;
                            } else {
                              break L9;
                            }
                          } else {
                            break L1;
                          }
                        }
                        L67: {
                          wi.field_i[this.field_m].a(32, var5, 100, 0, var4);
                          if (0 < this.field_k) {
                            break L67;
                          } else {
                            if (var4 + -this.field_g > param1) {
                              break L1;
                            } else {
                              if (param1 > this.field_g + var4) {
                                break L1;
                              } else {
                                if (var5 - this.field_g > param2) {
                                  break L1;
                                } else {
                                  if (param2 > var5 + this.field_g) {
                                    break L1;
                                  } else {
                                    break L67;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if ((kd.field_a ^ -1) != 0) {
                          break L1;
                        } else {
                          mi.b(var4 - this.field_g / 2, -2 + var5, -(this.field_g * this.field_e / 12) + this.field_g, 4, 16744576);
                          mi.g(var4 + -(this.field_g / 2), -2 + var5, this.field_g, 4, 16711680);
                          if (var11 == 0) {
                            break L1;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L68: {
                        wi.field_i[this.field_m].a(64, var5, 126, 0, var4);
                        if (this.field_k > 0) {
                          break L68;
                        } else {
                          if (var4 + -this.field_g > param1) {
                            break L1;
                          } else {
                            if (param1 > var4 - -this.field_g) {
                              break L1;
                            } else {
                              if (var5 - this.field_g > param2) {
                                break L1;
                              } else {
                                if (this.field_g + var5 >= param2) {
                                  break L68;
                                } else {
                                  break L1;
                                }
                              }
                            }
                          }
                        }
                      }
                      if (kd.field_a != -1) {
                        break L1;
                      } else {
                        mi.b(-(this.field_g / 2) + var4, var5 + -2, this.field_g + -(this.field_e * this.field_g / 36), 4, 16744576);
                        mi.g(-(this.field_g / 2) + var4, -2 + var5, this.field_g, 4, 16711680);
                        if (var11 == 0) {
                          break L1;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L69: {
                      wi.field_i[this.field_m].a(96, var5, 116, 0, var4);
                      if (-1 > (this.field_k ^ -1)) {
                        break L69;
                      } else {
                        if (param1 < -this.field_g + var4) {
                          break L1;
                        } else {
                          if (this.field_g + var4 < param1) {
                            break L1;
                          } else {
                            if (-this.field_g + var5 > param2) {
                              break L1;
                            } else {
                              if (param2 <= var5 + this.field_g) {
                                break L69;
                              } else {
                                break L1;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (0 == (kd.field_a ^ -1)) {
                      mi.b(var4 + -(this.field_g / 2), var5 + -2, -(this.field_e * this.field_g / 72) + this.field_g, 4, 16744576);
                      mi.g(-(this.field_g / 2) + var4, var5 - 2, this.field_g, 4, 16711680);
                      if (var11 == 0) {
                        break L1;
                      } else {
                        break L6;
                      }
                    } else {
                      break L1;
                    }
                  }
                  L70: {
                    wi.field_i[this.field_m].a(128, var5, 92, 0, var4);
                    if (0 < this.field_k) {
                      break L70;
                    } else {
                      if (var4 + -this.field_g > param1) {
                        break L1;
                      } else {
                        if (this.field_g + var4 < param1) {
                          break L1;
                        } else {
                          if (var5 - this.field_g > param2) {
                            break L1;
                          } else {
                            if (param2 > var5 - -this.field_g) {
                              break L1;
                            } else {
                              break L70;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (-1 != kd.field_a) {
                    break L1;
                  } else {
                    mi.b(-(this.field_g / 2) + var4, var5 + -2, this.field_g - this.field_e * this.field_g / 128, 4, 16744576);
                    mi.g(var4 - this.field_g / 2, var5 - 2, this.field_g, 4, 16711680);
                    if (var11 == 0) {
                      break L1;
                    } else {
                      break L5;
                    }
                  }
                }
                L71: {
                  wi.field_i[this.field_m].a(170, var5, 110, 0, var4);
                  if (-1 > (this.field_k ^ -1)) {
                    break L71;
                  } else {
                    if (param1 < -this.field_g + var4) {
                      break L1;
                    } else {
                      if (var4 + this.field_g < param1) {
                        break L1;
                      } else {
                        if (-this.field_g + var5 > param2) {
                          break L1;
                        } else {
                          if (this.field_g + var5 < param2) {
                            break L1;
                          } else {
                            break L71;
                          }
                        }
                      }
                    }
                  }
                }
                if (kd.field_a == -1) {
                  mi.b(-(this.field_g / 2) + var4, var5 - 2, this.field_g - this.field_g * this.field_e / 256, 4, 16744576);
                  mi.g(var4 - this.field_g / 2, -2 + var5, this.field_g, 4, 16711680);
                  if (var11 == 0) {
                    break L1;
                  } else {
                    break L4;
                  }
                } else {
                  break L1;
                }
              }
              if (-1 <= (-this.field_e + this.field_g ^ -1)) {
                break L1;
              } else {
                var7 = 16 * this.field_e / this.field_g;
                if (-17 < (var7 ^ -1)) {
                  ii.field_g[var7].c(this.field_e + (-this.field_g + var4), this.field_e + -this.field_g + var5, (-this.field_e + this.field_g) * 2, (this.field_g - this.field_e) * 2, 255 - this.field_e * 255 / this.field_g);
                  ua.field_F[0].c(var4 + -(this.field_e * 4), var5 + -(4 * this.field_e), this.field_e * 8, this.field_e * 8, -(128 * this.field_e / this.field_g) + 128);
                  if (var11 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                } else {
                  break L1;
                }
              }
            }
            if ((this.field_e ^ -1) > -129) {
              wi.field_i[this.field_m].a((128 + -this.field_e) * 16 / 128, var5, 104, 0, var4);
              if (var11 == 0) {
                break L1;
              } else {
                break L2;
              }
            } else {
              break L1;
            }
          }
          mi.e(var4, var5, 4, 16777215);
          break L1;
        }
    }

    final static o a(String param0, String param1, da param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        o stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param2.c(91, param1);
              var5 = param2.a(param0, -1, var4_int);
              if (param3 < -108) {
                break L1;
              } else {
                field_f = 75;
                break L1;
              }
            }
            stackIn_3_0 = mh.a(true, param2, var4_int, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("rb.C(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(byte param0) {
        if (param0 != 62) {
            this.a((byte) 96);
        }
        if (!pg.field_e && -26 >= (this.field_j ^ -1)) {
            if (!(this.field_j > 30)) {
                lk.field_f = lk.field_f + (1 - -this.field_j + -25);
            }
        }
        if (7 >= this.field_j) {
            if (!(ia.field_hb != 0)) {
                ia.field_hb = ia.field_hb + 1;
            }
        }
    }

    rb(int param0, int param1, int param2, int param3, int param4) {
        this.field_j = param0;
        this.field_b = param2;
        this.field_d = param4;
        this.field_e = 0;
        this.field_c = param3;
        this.field_a = param1;
        this.field_h = false;
    }

    private rb(int param0, rb param1) {
        double var3_double = 0.0;
        double var5 = 0.0;
        int var7 = 0;
        int var8 = 0;
        try {
            this.field_c = 0;
            this.field_b = param1.field_b;
            this.field_d = 0;
            this.field_a = param1.field_a;
            this.field_e = 0;
            if (param0 == 31) {
                this.field_c = param1.field_c;
                this.field_d = param1.field_d;
                var3_double = 3.141592653589793 * Math.random();
                var5 = Math.random() * (double)param1.field_g * 2.0 - (double)param1.field_g;
                var7 = (int)(Math.sin(var3_double) * var5);
                var8 = (int)(Math.cos(var3_double) * var5);
                this.field_e = (int)var5;
                this.field_a = this.field_a + var7;
                this.field_d = this.field_d + var8;
                this.field_c = this.field_c + var7;
                this.field_b = this.field_b + var8;
                this.field_m = bk.a(36, jb.field_g, (byte) 106);
            }
            this.field_j = param0;
            this.field_h = false;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "rb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
