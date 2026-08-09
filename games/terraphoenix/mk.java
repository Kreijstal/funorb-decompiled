/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mk {
    private int field_l;
    int field_a;
    int field_b;
    int field_g;
    private dk field_i;
    private int field_n;
    static String field_h;
    int field_e;
    private int field_c;
    static String field_f;
    private int field_m;
    int field_d;
    int field_k;
    static uc field_j;

    public static void d(byte param0) {
        field_j = null;
        field_f = null;
        int var1 = 61 % ((-36 - param0) / 54);
        field_h = null;
    }

    final void b(int param0) {
        dl stackIn_106_0 = null;
        dl stackIn_107_0 = null;
        dl stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        dl stackIn_111_0 = null;
        dl stackIn_112_0 = null;
        dl stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        dl stackIn_117_0 = null;
        dl stackIn_118_0 = null;
        dl stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        int statePc = 0;
        int var2 = 0;
        dl var3 = null;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Terraphoenix.field_V;
                    if (1 == this.field_a) {
                        statePc = 2;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if ((this.field_b ^ -1) >= -1) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.field_b = this.field_b - 1;
                    this.field_m = this.field_m + 1;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if ((this.field_b ^ -1) <= -1) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_b = this.field_b + 1;
                    this.field_m = this.field_m - 1;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if ((this.field_m ^ -1) > -1) {
                        statePc = 8;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_m = this.field_m + 16;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (16 > this.field_m) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_m = this.field_m - 16;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (0 >= j.field_R) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    j.field_R = j.field_R - 1;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (this.field_a == 2) {
                        statePc = 15;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (this.field_b <= 0) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.field_b = this.field_b - 1;
                    this.field_l = this.field_l + 4;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if ((this.field_b ^ -1) > -1) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.field_b = this.field_b + 1;
                    this.field_l = this.field_l - 4;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (this.field_l < 0) {
                        statePc = 22;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.field_l = this.field_l + 84;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (-85 < (this.field_l ^ -1)) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    this.field_l = this.field_l - 84;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    var2 = -51 % ((param0 - 35) / 37);
                    if (3 != this.field_a) {
                        statePc = 35;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (-1 <= (this.field_b ^ -1)) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    this.field_b = this.field_b - 1;
                    this.field_n = this.field_n + 1;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if ((this.field_b ^ -1) <= -1) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    this.field_n = this.field_n - 1;
                    this.field_b = this.field_b + 1;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if ((this.field_n ^ -1) > -1) {
                        statePc = 32;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 32: {
                    this.field_n = this.field_n + 80;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if ((this.field_n ^ -1) > -81) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    this.field_n = this.field_n - 80;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if ((this.field_g ^ -1) != -1) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if ((this.field_e ^ -1) == -1) {
                        statePc = 124;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (null == this.field_i) {
                        statePc = 124;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (uf.field_c != -1) {
                        statePc = 41;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var3 = this.field_i.field_f[uf.field_c][vf.field_a];
                    if (this.field_a != 0) {
                        statePc = 43;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (var3 != null) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    this.field_i.field_f[uf.field_c][vf.field_a] = new dl(uf.field_c, vf.field_a, 0, this.field_i);
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var3 = this.field_i.field_f[uf.field_c][vf.field_a];
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if ((tg.field_l ^ -1) >= -1) {
                        statePc = 65;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (var3 == null) {
                        statePc = 65;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (null == var3.field_C) {
                        statePc = 51;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (tg.field_l <= var3.field_r) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var3 = var3.field_C;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (var3.field_C == null) {
                        statePc = 54;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if ((var3.field_r ^ -1) <= (tg.field_l ^ -1)) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var3 = var3.field_C;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (null == var3.field_C) {
                        statePc = 57;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if ((tg.field_l ^ -1) >= (var3.field_r ^ -1)) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var3 = var3.field_C;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (var3.field_C == null) {
                        statePc = 61;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if ((var3.field_r ^ -1) <= (tg.field_l ^ -1)) {
                        statePc = 61;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var3 = var3.field_C;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    if ((var3.field_r ^ -1) <= (tg.field_l ^ -1)) {
                        statePc = 65;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var3.field_C = new dl(uf.field_c, vf.field_a, 1 + var3.field_r, this.field_i);
                    var3.field_C.field_c = var3;
                    var3 = var3.field_C;
                    if (var5 != 0) {
                        statePc = 124;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (var5 == 0) {
                        statePc = 61;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var4 = this.field_a;
                    if (var4 != 0) {
                        statePc = 68;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (var5 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (var4 != 1) {
                        statePc = 71;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (var5 == 0) {
                        statePc = 99;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (var4 != 2) {
                        statePc = 74;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (var5 == 0) {
                        statePc = 104;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if ((var4 ^ -1) != -4) {
                        statePc = 124;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (var5 == 0) {
                        statePc = 114;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if ((this.field_g ^ -1) != -2) {
                        statePc = 87;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (var3 != null) {
                        statePc = 81;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    this.field_i.field_f[uf.field_c][vf.field_a] = new dl(uf.field_c, vf.field_a, 0, this.field_i);
                    if (var5 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (null == var3.field_C) {
                        statePc = 85;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var3 = var3.field_C;
                    if (var5 != 0) {
                        statePc = 86;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (var5 == 0) {
                        statePc = 81;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var3.field_C = new dl(uf.field_c, vf.field_a, 1 + var3.field_r, this.field_i);
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    var3.field_C.field_c = var3;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if (-3 != (this.field_e ^ -1)) {
                        statePc = 124;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if (var3 != null) {
                        statePc = 90;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (null == var3.field_C) {
                        statePc = 94;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var3 = var3.field_C;
                    if (var5 != 0) {
                        statePc = 98;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (var5 == 0) {
                        statePc = 90;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if (var3.field_c == null) {
                        statePc = 97;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var3.field_c.field_C = null;
                    if (var5 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    this.field_i.field_f[uf.field_c][vf.field_a] = null;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    if (var5 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    if (1 != this.field_e) {
                        statePc = 101;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    var3.field_b = this.field_m;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    if (this.field_e != 2) {
                        statePc = 124;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var3.field_b = -1;
                    if (var5 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    if (this.field_g != 2) {
                        statePc = 109;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    stackIn_107_0 = (dl) (var3);
                    stackIn_106_0 = stackIn_107_0;
                    if ((this.field_l ^ -1) == (var3.field_k ^ -1)) {
                        statePc = 107;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    stackIn_108_0 = (dl) ((Object) stackIn_106_0);
                    stackIn_108_1 = this.field_l;
                    statePc = 108;
                    continue stateLoop;
                }
                case 107: {
                    stackIn_108_0 = (dl) ((Object) stackIn_107_0);
                    stackIn_108_1 = -1;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    stackIn_108_0.field_k = stackIn_108_1;
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    if (-2 != (this.field_g ^ -1)) {
                        statePc = 124;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    stackIn_112_0 = (dl) (var3);
                    stackIn_111_0 = stackIn_112_0;
                    if ((var3.field_g ^ -1) != (this.field_l ^ -1)) {
                        statePc = 112;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    stackIn_113_0 = (dl) ((Object) stackIn_111_0);
                    stackIn_113_1 = -1;
                    statePc = 113;
                    continue stateLoop;
                }
                case 112: {
                    stackIn_113_0 = (dl) ((Object) stackIn_112_0);
                    stackIn_113_1 = this.field_l;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    stackIn_113_0.field_g = stackIn_113_1;
                    if (var5 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (1 == this.field_g) {
                        statePc = 116;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 116: {
                    stackIn_118_0 = (dl) (var3);
                    stackIn_117_0 = stackIn_118_0;
                    if ((this.field_n ^ -1) != (var3.field_j ^ -1)) {
                        statePc = 118;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    stackIn_119_0 = (dl) ((Object) stackIn_117_0);
                    stackIn_119_1 = -1;
                    statePc = 119;
                    continue stateLoop;
                }
                case 118: {
                    stackIn_119_0 = (dl) ((Object) stackIn_118_0);
                    stackIn_119_1 = this.field_n;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    stackIn_119_0.field_j = stackIn_119_1;
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    if (-3 == (this.field_e ^ -1)) {
                        statePc = 122;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var3.field_j = -1;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0) {
        Object var2 = null;
        byte[] var2_array = of.field_k[this.field_c];
        if (var2_array == null) {
            this.field_i = new dk(16, 16);
            this.field_i.field_l = (mk) (this);
            return;
        }
        this.a(false, var2_array);
        if (param0 > -42) {
            this.a(true, (byte[]) null);
        }
    }

    final void b(byte param0) {
        int statePc = 0;
        dl var2 = null;
        int var3 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Terraphoenix.field_V;
                    var2 = this.field_i.field_f[uf.field_c][vf.field_a];
                    if (param0 > 121) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    mk.d((byte) 89);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (0 != this.field_a) {
                        statePc = 4;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var2 != null) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_i.field_f[uf.field_c][vf.field_a] = new dl(uf.field_c, vf.field_a, 0, this.field_i);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var2 = this.field_i.field_f[uf.field_c][vf.field_a];
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (tg.field_l <= 0) {
                        statePc = 28;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var2 == null) {
                        statePc = 28;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (null == var2.field_C) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if ((var2.field_r ^ -1) <= (tg.field_l ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var2 = var2.field_C;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (null == var2.field_C) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if ((var2.field_r ^ -1) > (tg.field_l ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var2 = var2.field_C;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (null == var2.field_C) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var2.field_r < tg.field_l) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var2 = var2.field_C;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (var2.field_C == null) {
                        statePc = 24;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (var2.field_r >= tg.field_l) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var2 = var2.field_C;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if ((tg.field_l ^ -1) >= (var2.field_r ^ -1)) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var2.field_C = new dl(uf.field_c, vf.field_a, 1 + var2.field_r, this.field_i);
                    var2.field_C.field_c = var2;
                    var2 = var2.field_C;
                    if (var3 != 0) {
                        statePc = 30;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var3 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (var2 != null) {
                        statePc = 30;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (var2.field_k == -1) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var2.field_k = 3 + var2.field_k / 4 * 4;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (0 != (var2.field_g ^ -1)) {
                        statePc = 34;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var2.field_g = 3 + 4 * (var2.field_g / 4);
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1) {
        this.c(-13859);
        this.field_c = this.field_c + param1;
        if (param0 != 23172) {
            this.a(true, (byte[]) null);
        }
        if (this.field_c < 0) {
            this.field_c = ph.field_n.length + -1;
        }
        if (!(this.field_c < ph.field_n.length)) {
            this.field_c = 0;
        }
        this.a((byte) -118);
        fg.field_c = "LEVEL CHANGED";
        j.field_R = 256;
    }

    final void c(int param0) {
        if (!(null != this.field_i)) {
            return;
        }
        fg.field_c = "MAP SAVING";
        j.field_R = 256;
        String var2 = ph.field_n[this.field_c] + ".lev";
        byte[] var3 = this.field_i.a(true);
        of.field_k[wf.a(var2, true)] = var3;
        fg.field_c = "MAP SAVED";
        j.field_R = 256;
        if (param0 != -13859) {
            this.b(-93, 17);
        }
    }

    final static int a(int param0) {
        if (param0 != -1) {
            field_f = (String) null;
        }
        return -vi.field_o + ql.field_g;
    }

    private final void a(boolean param0, String param1, int param2, int param3, int param4) {
        og.field_f.a(param1, param4 - -3, param2 - -3, 8421504, -1);
        og.field_f.a(param1, param4 - -2, param2 + 2, 8421504, -1);
        if (param0) {
            return;
        }
        try {
            og.field_f.a(param1, 1 + param4, param2 + 1, 8421504, -1);
            og.field_f.a(param1, param4 - -1, param2, 0, -1);
            og.field_f.a(param1, param4 + -1, param2, 0, -1);
            og.field_f.a(param1, param4, -1 + param2, 0, -1);
            og.field_f.a(param1, param4, param2 - -1, 0, -1);
            og.field_f.a(param1, param4, param2, param3, -1);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "mk.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(boolean param0, byte[] param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              fg.field_c = "MAP LOADING";
              j.field_R = 256;
              this.field_i = new dk(param1);
              if (!param0) {
                break L1;
              } else {
                this.b((byte) -127);
                break L1;
              }
            }
            L2: {
              fg.field_c = "MAP LOADED";
              j.field_R = 256;
              if (this.field_i == null) {
                break L2;
              } else {
                this.field_i.field_l = (mk) (this);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("mk.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final void b(int param0, int param1) {
        Exception exception = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        byte[] var5_array = null;
        String var6 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (null == this.field_i) {
            break L0;
          } else {
            L1: {
              if ((param0 ^ -1) >= -1) {
                break L1;
              } else {
                var3 = param0 + this.field_i.field_b;
                var4 = this.field_i.field_e + param0;
                this.c(-13859);
                var5 = null;
                var6 = ph.field_n[this.field_c] + ".lev";
                try {
                  L2: {
                    var5_array = vl.a(75, new File(var6));
                    break L2;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    exception = (Exception) (Object) decompiledCaughtException;
                    System.out.println(exception);
                    break L3;
                  }
                }
                L4: {
                  this.field_i = new dk(var3, var4);
                  this.field_i.field_l = (mk) (this);
                  if (var5_array == null) {
                    break L4;
                  } else {
                    this.field_i.a(0, (byte) 104, 0, var5_array);
                    break L4;
                  }
                }
                if (Terraphoenix.field_V == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L5: {
              this.field_i.field_b = this.field_i.field_b + param0;
              this.field_i.field_e = this.field_i.field_e + param0;
              if (this.field_i.field_b < 2) {
                this.field_i.field_b = 2;
                break L5;
              } else {
                break L5;
              }
            }
            if (-3 >= (this.field_i.field_e ^ -1)) {
              break L0;
            } else {
              this.field_i.field_e = 2;
              break L0;
            }
          }
        }
        L6: {
          if (param1 > 83) {
            break L6;
          } else {
            this.b(51, -121);
            break L6;
          }
        }
    }

    final void c(byte param0) {
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        L0: {
          L1: {
            var7 = Terraphoenix.field_V;
            vc.field_f.b(ph.field_n[this.field_c], 24, 24, 0, -1);
            if (this.field_i == null) {
              break L1;
            } else {
              vc.field_f.b("MAP: " + this.field_i.field_b + " x " + this.field_i.field_e, 24, 48, 16711935, -1);
              vc.field_f.b("Level:" + tg.field_l, 24, 72, 16711935, -1);
              this.field_i.d(-125);
              if (var7 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          vc.field_f.b("MAP IS NULL", 24, 48, 16711680, -1);
          break L0;
        }
        L2: {
          if ((this.field_a ^ -1) > -1) {
            this.field_a = 0;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (3 < this.field_a) {
            this.field_a = 3;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (0 != this.field_a) {
            break L4;
          } else {
            var2 = 616;
            var3 = 36;
            this.a(false, "MODE: Add/Remove Squares", var3, 16777215, var2);
            var3 += 14;
            this.a(false, "lmb - add square", var3, 16777215, var2);
            var3 += 12;
            this.a(false, "rmb - remove square", var3, 16777215, var2);
            var3 += 20;
            this.a(false, "a/s - change mode", var3, 16777215, var2);
            break L4;
          }
        }
        L5: {
          if ((this.field_a ^ -1) == -2) {
            var2 = 616;
            var3 = 36;
            this.a(false, "MODE: Floors", var3, 16777215, var2);
            var3 += 14;
            this.a(false, "lmb - set floor", var3, 16777215, var2);
            var3 += 12;
            this.a(false, "rmb - remove floor", var3, 16777215, var2);
            var3 += 12;
            this.a(false, "z/x - change floor", var3, 16777215, var2);
            var3 += 20;
            this.a(false, "a/s - change mode", var3, 16777215, var2);
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          L7: {
            if (2 != this.field_a) {
              break L7;
            } else {
              var2 = 616;
              var3 = 36;
              this.a(false, "MODE: Walls", var3, 16777215, var2);
              var3 += 14;
              this.a(false, "lmb - toggle left", var3, 16777215, var2);
              var3 += 12;
              this.a(false, "rmb - toggle right", var3, 16777215, var2);
              var3 += 12;
              this.a(false, "z/x - change wall", var3, 16777215, var2);
              var3 += 20;
              this.a(false, "a/s - change mode", var3, 16777215, var2);
              this.a(false, "MODE: Objects", var3, 16777215, var2);
              var3 += 14;
              this.a(false, "lmb - add object", var3, 16777215, var2);
              var3 += 12;
              this.a(false, "rmb - remove object", var3, 16777215, var2);
              var3 += 12;
              this.a(false, "z/x - change object", var3, 16777215, var2);
              var3 += 20;
              this.a(false, "a/s - change mode", var3, 16777215, var2);
              var4 = 40;
              var5 = 32;
              var6 = 0;
              L8: while (true) {
                if (80 <= var6) {
                  break L7;
                } else {
                  var3 = -192 + (var5 * (var6 / 16) - -480);
                  var2 = var4 * (var6 % 16);
                  kg.field_r[var6].a(var2, var3, var4, var5);
                  stackIn_37_0 = this.field_n;

                  stackIn_37_1 = var6;

                  if (var7 != 0) {
                    break L6;
                  } else {
                    L9: {
                      if (stackIn_37_0 == stackIn_37_1) {
                        l.e(var2, var3, var4, var5, 65280);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    var6++;
                    if (var7 == 0) {
                      continue L8;
                    } else {
                      break L7;
                    }
                  }
                }
              }
            }
          }
          L10: {
            var2 = 616;
            var3 = 110;
            this.a(false, "9 / 0 - change level size", var3, 16711680, var2);
            var3 += 14;
            this.a(false, "[ / ] - switch level", var3, 16711680, var2);
            var3 += 14;
            this.a(false, "o / p - change view level", var3, 16777215, var2);
            var3 += 14;
            if (!dh.field_j) {
              break L10;
            } else {
              this.a(false, "q - view current level", var3, 65535, var2);
              break L10;
            }
          }
          L11: {
            var3 += 14;
            if (dh.field_j) {
              break L11;
            } else {
              this.a(false, "q - view below", var3, 16776960, var2);
              break L11;
            }
          }
          L12: {
            var3 += 14;
            if (!ll.field_c) {
              break L12;
            } else {
              this.a(false, "w - turn off walls", var3, 65535, var2);
              break L12;
            }
          }
          L13: {
            var3 += 14;
            if (ll.field_c) {
              break L13;
            } else {
              this.a(false, "w - turn on walls", var3, 16776960, var2);
              break L13;
            }
          }
          L14: {
            var3 += 14;
            if (!jb.field_a) {
              break L14;
            } else {
              this.a(false, "e - hide objects", var3, 65535, var2);
              break L14;
            }
          }
          L15: {
            var3 += 14;
            if (!jb.field_a) {
              this.a(false, "e - show objects", var3, 16776960, var2);
              break L15;
            } else {
              break L15;
            }
          }
          var3 += 14;
          var3 += 14;
          this.a(false, "IMPORTANT", var3, 16711680, var2);
          var3 += 14;
          this.a(false, "YOU CANNOT SAVE LEVELS", var3, 16711680, var2);
          var3 += 14;
          this.a(false, "DO NOT BUILD LEVELS ON", var3, 16711680, var2);
          stackIn_37_0 = param0;
          stackIn_37_1 = -17;
          break L6;
        }
        if (stackIn_37_0 <= stackIn_37_1) {
          L16: {
            var3 += 14;
            this.a(false, "THIS VERSION THAT YOU", var3, 16711680, var2);
            var3 += 14;
            this.a(false, "WISH TO KEEP", var3, 16711680, var2);
            var3 += 14;
            if (null != fg.field_c) {
              vc.field_f.b(fg.field_c, 24, 456, j.field_R, -1);
              break L16;
            } else {
              break L16;
            }
          }
          return;
        } else {
          return;
        }
    }

    mk() {
        j.field_R = 256;
        this.field_l = 0;
        this.field_a = 0;
        this.field_n = 0;
        this.field_m = 0;
        this.field_b = 0;
        this.field_c = 0;
        fg.field_c = "Editor started";
    }

    static {
        field_h = "Try again";
        field_f = "Enemy Turn";
    }
}
