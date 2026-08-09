/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends hf {
    private wb field_i;
    private int field_p;
    private byte[] field_w;
    private byte[] field_g;
    static String[] field_r;
    private int field_n;
    static double field_u;
    private e field_z;
    private int field_j;
    static dg field_q;
    private dl field_B;
    private kl field_C;
    private si field_t;
    static eg field_A;
    private dl field_f;
    private na field_k;
    static java.awt.Canvas field_y;
    private ng field_l;
    private int field_o;
    static int field_m;
    private boolean field_D;
    private boolean field_d;
    static String field_s;
    static long field_x;
    private ng field_v;
    private boolean field_e;
    private long field_h;

    final void b(int param0) {
        si discarded$2 = null;
        si discarded$3 = null;
        kd var2 = null;
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Lexicominos.field_L ? 1 : 0;
                    if (null == this.field_v) {
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
                    if (this.a(false) == null) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    if (param0 <= -68) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.a(true);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var2 = this.field_l.a(true);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (var2 == null) {
                        statePc = 26;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var3 = (int)var2.field_d;
                    if (var4 != 0) {
                        statePc = 26;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (-1 < (var3 ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var3 >= this.field_z.field_d) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if ((this.field_z.field_m[var3] ^ -1) != -1) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var2.b((byte) -122);
                    if (var4 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (-1 == (this.field_w[var3] ^ -1)) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 19: {
                    discarded$2 = this.a((byte) -128, 1, var3);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if ((this.field_w[var3] ^ -1) != 0) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    discarded$3 = this.a((byte) -91, 2, var3);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (1 != this.field_w[var3]) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var2.b((byte) -118);
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var2 = this.field_l.f(2);
                    if (var4 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(boolean param0) {
        si discarded$0 = null;
        si discarded$1 = null;
        si discarded$2 = null;
        si discarded$3 = null;
        si discarded$4 = null;
        si discarded$5 = null;
        byte stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_64_0 = 0;
        boolean stackIn_72_0 = false;
        boolean stackIn_83_0 = false;
        int stackIn_102_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_126_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_130_1 = 0;
        byte stackOut_9_0;
        int statePc = 0;
        int var2_int = 0;
        si var2 = null;
        kd var3 = null;
        int var4 = 0;
        int var5 = 0;
        kd var6 = null;
        kd var7 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Lexicominos.field_L ? 1 : 0;
                    if (null == this.field_v) {
                        statePc = 67;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (null != this.a(false)) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    if (this.field_D) {
                        statePc = 37;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (this.field_d) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_v = null;
                    if (var5 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var2_int = 1;
                    var3 = this.field_v.a(true);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (var3 == null) {
                        statePc = 132;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var4 = (int)var3.field_d;
                    stackOut_9_0 = this.field_w[var4];
                    stackIn_19_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_19_1 = 1;
                    stackIn_10_1 = stackIn_19_1;
                    if (var5 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (stackIn_10_0 != stackIn_10_1) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    discarded$0 = this.a((byte) -56, 2, var4);
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (-2 == (this.field_w[var4] ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var3.b((byte) -128);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var3 = this.field_v.f(2);
                    if (var5 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = this.field_z.field_m.length;
                    stackIn_19_1 = this.field_o;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (stackIn_19_0 <= stackIn_19_1) {
                        statePc = 33;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_34_0 = 0;
                    stackIn_21_0 = stackIn_34_0;
                    if (var5 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (stackIn_21_0 != this.field_z.field_m[this.field_o]) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.field_o = this.field_o + 1;
                    if (var5 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (this.field_i.a(9172)) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (-2 != (this.field_w[this.field_o] ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 29: {
                    discarded$1 = this.a((byte) -25, 2, this.field_o);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if ((this.field_w[this.field_o] ^ -1) == -2) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var6 = new kd();
                    var6.field_d = (long)this.field_o;
                    this.field_v.b(105, var6);
                    var2_int = 0;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    this.field_o = this.field_o + 1;
                    if (var5 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_34_0 = var2_int;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (stackIn_34_0 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    this.field_o = 0;
                    this.field_d = false;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (var5 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var2_int = 1;
                    var3 = this.field_v.a(true);
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (var3 == null) {
                        statePc = 108;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var4 = (int)var3.field_d;
                    stackIn_50_0 = this.field_w[var4] ^ -1;
                    stackIn_40_0 = stackIn_50_0;
                    stackIn_50_1 = -1;
                    stackIn_40_1 = stackIn_50_1;
                    if (var5 != 0) {
                        statePc = 50;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (stackIn_40_0 == stackIn_40_1) {
                        statePc = 42;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 42: {
                    discarded$2 = this.a((byte) -93, 1, var4);
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if ((this.field_w[var4] ^ -1) == -1) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var3.b((byte) -116);
                    if (var5 == 0) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var2_int = 0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    var3 = this.field_v.f(2);
                    if (var5 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 49: {
                    stackIn_50_0 = this.field_o ^ -1;
                    stackIn_50_1 = this.field_z.field_m.length ^ -1;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (stackIn_50_0 <= stackIn_50_1) {
                        statePc = 63;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    stackIn_64_0 = -1;
                    stackIn_52_0 = stackIn_64_0;
                    if (var5 != 0) {
                        statePc = 64;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (stackIn_52_0 != (this.field_z.field_m[this.field_o] ^ -1)) {
                        statePc = 55;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    this.field_o = this.field_o + 1;
                    if (var5 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if ((this.field_C.field_c ^ -1) <= -251) {
                        statePc = 57;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 63;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (this.field_w[this.field_o] != 0) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    discarded$3 = this.a((byte) -88, 1, this.field_o);
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if ((this.field_w[this.field_o] ^ -1) != -1) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var7 = new kd();
                    var7.field_d = (long)this.field_o;
                    var2_int = 0;
                    this.field_v.b(123, var7);
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    this.field_o = this.field_o + 1;
                    if (var5 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    stackIn_64_0 = var2_int;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if (stackIn_64_0 != 0) {
                        statePc = 66;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 66: {
                    this.field_o = 0;
                    this.field_D = false;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if (!this.field_e) {
                        statePc = 82;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (this.field_h > rf.c(0)) {
                        statePc = 82;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var2 = (si) ((Object) this.field_k.c((byte) -120));
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    if (var2 == null) {
                        statePc = 81;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    stackIn_83_0 = var2.field_v;
                    stackIn_72_0 = stackIn_83_0;
                    if (var5 != 0) {
                        statePc = 83;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (stackIn_72_0) {
                        statePc = 80;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (var2.field_r) {
                        statePc = 76;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var2.field_r = true;
                    if (var5 == 0) {
                        statePc = 80;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (!var2.field_p) {
                        statePc = 78;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 78: {
                    throw new RuntimeException();
                }
                case 79: {
                    var2.b((byte) -122);
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    var2 = (si) ((Object) this.field_k.a((byte) -91));
                    if (var5 == 0) {
                        statePc = 70;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    this.field_h = 1000L + rf.c(0);
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    stackIn_83_0 = param0;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if (!stackIn_83_0) {
                        statePc = 85;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    this.a(15, 40);
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    return;
                }
                case 87: {
                    this.field_o = this.field_o + 1;
                    if (var5 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 90: {
                    discarded$4 = this.a((byte) -88, 1, this.field_o);
                    statePc = 94;
                    continue stateLoop;
                }
                case 91: {
                    var7 = new kd();
                    var7.field_d = (long)this.field_o;
                    var2_int = 0;
                    this.field_v.b(123, var7);
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    this.field_o = this.field_o + 1;
                    if (var5 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if ((this.field_w[this.field_o] ^ -1) != -1) {
                        statePc = 92;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (this.field_w[this.field_o] != 0) {
                        statePc = 94;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 63;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if ((this.field_C.field_c ^ -1) <= -251) {
                        statePc = 98;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (stackIn_102_0 != (this.field_z.field_m[this.field_o] ^ -1)) {
                        statePc = 100;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 104: {
                    stackIn_64_0 = -1;
                    stackIn_105_0 = stackIn_64_0;
                    if (var5 != 0) {
                        statePc = 64;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    stackIn_102_0 = stackIn_105_0;
                    statePc = 102;
                    continue stateLoop;
                }
                case 106: {
                    if (stackIn_106_0 <= stackIn_106_1) {
                        statePc = 63;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 108: {
                    stackIn_106_0 = this.field_o ^ -1;
                    stackIn_106_1 = this.field_z.field_m.length ^ -1;
                    statePc = 106;
                    continue stateLoop;
                }
                case 110: {
                    this.field_o = this.field_o + 1;
                    if (var5 == 0) {
                        statePc = 132;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 114: {
                    var6 = new kd();
                    var6.field_d = (long)this.field_o;
                    this.field_v.b(105, var6);
                    var2_int = 0;
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    this.field_o = this.field_o + 1;
                    if (var5 == 0) {
                        statePc = 132;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 117: {
                    if ((this.field_w[this.field_o] ^ -1) == -2) {
                        statePc = 115;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 119: {
                    discarded$5 = this.a((byte) -25, 2, this.field_o);
                    statePc = 117;
                    continue stateLoop;
                }
                case 120: {
                    if (-2 != (this.field_w[this.field_o] ^ -1)) {
                        statePc = 119;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var2_int = 0;
                    if (var5 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if (this.field_i.a(9172)) {
                        statePc = 122;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 126: {
                    if (stackIn_126_0 != this.field_z.field_m[this.field_o]) {
                        statePc = 124;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 128: {
                    stackIn_34_0 = 0;
                    stackIn_129_0 = stackIn_34_0;
                    if (var5 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    stackIn_126_0 = stackIn_129_0;
                    statePc = 126;
                    continue stateLoop;
                }
                case 130: {
                    if (stackIn_130_0 <= stackIn_130_1) {
                        statePc = 33;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 132: {
                    stackIn_130_0 = this.field_z.field_m.length;
                    stackIn_130_1 = this.field_o;
                    statePc = 130;
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, int param1) {
        si var3 = (si) ((Object) this.field_k.a((long)param0, (byte) 96));
        if (!(var3 == null)) {
            return var3.c((byte) 16);
        }
        if (param1 != 1215) {
            return -35;
        }
        return 0;
    }

    final void c(int param0) {
        if (!(null != this.field_B)) {
            return;
        }
        if (param0 != 11002) {
            this.field_v = (ng) null;
        }
        this.field_d = true;
        if (!(this.field_v != null)) {
            this.field_v = new ng();
        }
    }

    final e a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (this.field_z == null) {
          L0: {
            if (null != this.field_t) {
              break L0;
            } else {
              if (!this.field_i.e(20)) {
                this.field_t = (si) ((Object) this.field_i.a(5, 255, this.field_j, (byte) 0, true));
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!this.field_t.field_v) {
            L1: {
              L2: {
                var7 = this.field_t.d((byte) -125);
                var6 = var7;
                var5 = var6;
                var2 = var5;
                if (this.field_t instanceof fj) {
                  break L2;
                } else {
                  try {
                    L3: {
                      if (var5 != null) {
                        this.field_z = new e(var7, this.field_p, this.field_g);
                        break L3;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var3 = decompiledCaughtException;
                      this.field_i.c(-28488);
                      this.field_z = null;
                      if (this.field_i.e(20)) {
                        break L4;
                      } else {
                        this.field_t = (si) ((Object) this.field_i.a(5, 255, this.field_j, (byte) 0, true));
                        if (var4 != 0) {
                          break L4;
                        } else {
                          return null;
                        }
                      }
                    }
                    this.field_t = null;
                    return null;
                  }
                  if (null != this.field_f) {
                    this.field_C.a(var7, this.field_j, 1, this.field_f);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              try {
                L5: {
                  if (var5 != null) {
                    this.field_z = new e(var7, this.field_p, this.field_g);
                    if (this.field_z.field_s == this.field_n) {
                      break L5;
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L6: {
                  var3 = decompiledCaughtException;
                  this.field_z = null;
                  if (this.field_i.e(20)) {
                    break L6;
                  } else {
                    this.field_t = (si) ((Object) this.field_i.a(5, 255, this.field_j, (byte) 0, true));
                    if (var4 != 0) {
                      break L6;
                    } else {
                      return null;
                    }
                  }
                }
                this.field_t = null;
                return null;
              }
              break L1;
            }
            L7: {
              if (null == this.field_B) {
                break L7;
              } else {
                this.field_w = new byte[this.field_z.field_d];
                break L7;
              }
            }
            L8: {
              if (!param0) {
                break L8;
              } else {
                field_m = 43;
                break L8;
              }
            }
            this.field_t = null;
            return this.field_z;
          } else {
            return null;
          }
        } else {
          return this.field_z;
        }
    }

    final static void a(byte param0) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 >= 121) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_s = (String) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5 = bd.field_l;
                        var1 = var5;
                        var2 = 0;
                        var3 = var5.length;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var2 ^ -1) <= (var3 ^ -1)) {
                            statePc = 10;
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
                        incrementValue$8 = var2;
                        var2++;
                        var5[incrementValue$8] = 0;
                        incrementValue$9 = var2;
                        var2++;
                        var5[incrementValue$9] = 0;
                        incrementValue$10 = var2;
                        var2++;
                        var5[incrementValue$10] = 0;
                        incrementValue$11 = var2;
                        var2++;
                        var5[incrementValue$11] = 0;
                        incrementValue$12 = var2;
                        var2++;
                        var5[incrementValue$12] = 0;
                        incrementValue$13 = var2;
                        var2++;
                        var5[incrementValue$13] = 0;
                        incrementValue$14 = var2;
                        var2++;
                        var5[incrementValue$14] = 0;
                        incrementValue$15 = var2;
                        var2++;
                        var5[incrementValue$15] = 0;
                        if (var4 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw ld.a((Throwable) ((Object) var1_ref), "ug.L(" + param0 + ')');
                }
                case 10: {
                    return;
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static wj a(sh param0, int param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        wj stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                field_q = (dg) null;
                break L1;
              }
            }
            var4 = param0.a(param1, -117);
            var3 = var4;
            if (var4 != null) {
              stackIn_6_0 = new wj(var4);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("ug.H(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    final byte[] a(int param0, boolean param1) {
        si var3 = this.a((byte) -3, 0, param0);
        if (var3 == null) {
            return null;
        }
        if (!param1) {
            this.field_e = true;
        }
        byte[] var4 = var3.d((byte) -106);
        var3.b((byte) -116);
        return var4;
    }

    private final si a(byte param0, int param1, int param2) {
        byte stackIn_48_0 = 0;
        byte stackIn_48_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        Object stackIn_62_0 = null;
        byte stackIn_79_0 = 0;
        byte stackIn_79_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte stackOut_78_0;
        byte stackOut_78_1;
        byte stackOut_47_0;
        byte stackOut_47_1;
        Object var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        si var11 = null;
        byte[] var12 = null;
        byte[] var17 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        L0: {
          var10 = Lexicominos.field_L ? 1 : 0;
          var11 = (si) ((Object) this.field_k.a((long)param2, (byte) 107));
          var4 = var11;
          if (var11 == null) {
            break L0;
          } else {
            if (0 != param1) {
              break L0;
            } else {
              if (var11.field_p) {
                break L0;
              } else {
                if (!var11.field_v) {
                  break L0;
                } else {
                  var11.b((byte) -116);
                  var4 = null;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 != null) {
            break L1;
          } else {
            L2: {
              if ((param1 ^ -1) == -1) {
                L3: {
                  L4: {
                    if (null == this.field_B) {
                      break L4;
                    } else {
                      if ((this.field_w[param2] ^ -1) != 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!this.field_i.e(20)) {
                    var4 = this.field_i.a(5, this.field_j, param2, (byte) 2, true);
                    if (var10 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    return null;
                  }
                }
                var4 = this.field_C.a(this.field_B, (byte) -6, param2);
                break L2;
              } else {
                L5: {
                  if ((param1 ^ -1) != -2) {
                    break L5;
                  } else {
                    if (null == this.field_B) {
                      throw new RuntimeException();
                    } else {
                      var4 = this.field_C.a(param2, this.field_B, 3);
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                L6: {
                  if ((param1 ^ -1) != -3) {
                    break L6;
                  } else {
                    if (this.field_B == null) {
                      throw new RuntimeException();
                    } else {
                      if (-1 == this.field_w[param2]) {
                        if (!this.field_i.a(9172)) {
                          var4 = this.field_i.a(5, this.field_j, param2, (byte) 2, false);
                          if (var10 == 0) {
                            break L2;
                          } else {
                            break L6;
                          }
                        } else {
                          return null;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            }
            this.field_k.a((kd) (var4), (byte) -114, (long)param2);
            break L1;
          }
        }
        L7: {
          if (param0 < 0) {
            break L7;
          } else {
            ug.a((byte) -68);
            break L7;
          }
        }
        if (!((si) (var4)).field_v) {
          var17 = ((si) (var4)).d((byte) 123);
          var12 = var17;
          var5 = var12;
          if (!(var4 instanceof fj)) {
            try {
              L8: {
                L9: {
                  if (var5 == null) {
                    break L9;
                  } else {
                    if ((var17.length ^ -1) >= -3) {
                      break L9;
                    } else {
                      uh.field_v.reset();
                      uh.field_v.update(var5, 0, -2 + var17.length);
                      var6_int = (int)uh.field_v.getValue();
                      if (var6_int == this.field_z.field_r[param2]) {
                        L10: {
                          if (null == this.field_z.field_o) {
                            break L10;
                          } else {
                            if (null == this.field_z.field_o[param2]) {
                              break L10;
                            } else {
                              var29 = this.field_z.field_o[param2];
                              var28 = si.a(0, var5, -121, var17.length - 2);
                              var9 = 0;
                              L11: while (true) {
                                if (var9 >= 64) {
                                  break L10;
                                } else {
                                  stackOut_78_0 = var28[var9];
                                  stackIn_93_0 = stackOut_78_0;
                                  stackIn_79_0 = stackOut_78_0;
                                  stackOut_78_1 = var29[var9];
                                  stackIn_93_1 = stackOut_78_1;
                                  stackIn_79_1 = stackOut_78_1;
                                  if (var10 != 0) {
                                    decompiledRegionSelector0 = 0;
                                    break L8;
                                  } else {
                                    if (stackIn_79_0 == stackIn_79_1) {
                                      var9++;
                                      if (var10 == 0) {
                                        continue L11;
                                      } else {
                                        break L10;
                                      }
                                    } else {
                                      throw new RuntimeException();
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        this.field_i.field_p = 0;
                        this.field_i.field_j = 0;
                        decompiledRegionSelector0 = 1;
                        break L8;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (RuntimeException) (Object) decompiledCaughtException;
              this.field_i.c(-28488);
              ((si) (var4)).b((byte) -121);
              if (((si) (var4)).field_p) {
                L12: {
                  if (!this.field_i.e(20)) {
                    var4 = this.field_i.a(5, this.field_j, param2, (byte) 2, true);
                    this.field_k.a((kd) (var4), (byte) -75, (long)param2);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            L13: {
              L14: {
                if (decompiledRegionSelector0 == 0) {
                  break L14;
                } else {
                  var5[-2 + var17.length] = (byte)(this.field_z.field_t[param2] >>> -1305027192);
                  var5[var17.length + -1] = (byte)this.field_z.field_t[param2];
                  if (this.field_B != null) {
                    this.field_C.a(var17, param2, 1, this.field_B);
                    stackIn_93_0 = this.field_w[param2] ^ -1;
                    stackIn_93_1 = -2;
                    break L14;
                  } else {
                    break L13;
                  }
                }
              }
              if (stackIn_93_0 != stackIn_93_1) {
                this.field_w[param2] = (byte) 1;
                break L13;
              } else {
                break L13;
              }
            }
            L15: {
              if (!((si) (var4)).field_p) {
                ((si) (var4)).b((byte) -128);
                break L15;
              } else {
                break L15;
              }
            }
            return (si) (var4);
          } else {
            try {
              L16: {
                L17: {
                  if (var5 == null) {
                    break L17;
                  } else {
                    if (-3 <= (var17.length ^ -1)) {
                      break L17;
                    } else {
                      uh.field_v.reset();
                      uh.field_v.update(var5, 0, var17.length + -2);
                      var6_int = (int)uh.field_v.getValue();
                      if ((var6_int ^ -1) != (this.field_z.field_r[param2] ^ -1)) {
                        throw new RuntimeException();
                      } else {
                        L18: {
                          L19: {
                            if (this.field_z.field_o == null) {
                              break L19;
                            } else {
                              if (null != this.field_z.field_o[param2]) {
                                var26 = this.field_z.field_o[param2];
                                var27 = si.a(0, var5, -99, var17.length - 2);
                                var9 = 0;
                                L20: while (true) {
                                  if (64 <= var9) {
                                    break L19;
                                  } else {
                                    stackOut_47_0 = var26[var9];
                                    stackIn_52_0 = stackOut_47_0;
                                    stackIn_48_0 = stackOut_47_0;
                                    stackOut_47_1 = var27[var9];
                                    stackIn_52_1 = stackOut_47_1;
                                    stackIn_48_1 = stackOut_47_1;
                                    if (var10 != 0) {
                                      break L18;
                                    } else {
                                      if (stackIn_48_0 == stackIn_48_1) {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L20;
                                        } else {
                                          break L19;
                                        }
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L19;
                              }
                            }
                          }
                          stackIn_52_0 = (var5[var17.length - 2] & 255) << -966605144;
                          stackIn_52_1 = 255 & var5[-1 + var17.length];
                          break L18;
                        }
                        var7 = stackIn_52_0 + stackIn_52_1;
                        if ((var7 ^ -1) != (this.field_z.field_t[param2] & 65535 ^ -1)) {
                          throw new RuntimeException();
                        } else {
                          L21: {
                            if (1 != this.field_w[param2]) {
                              L22: {
                                if (this.field_w[param2] == 0) {
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                              this.field_w[param2] = (byte) 1;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          L23: {
                            if (((si) (var4)).field_p) {
                              break L23;
                            } else {
                              ((si) (var4)).b((byte) -128);
                              break L23;
                            }
                          }
                          stackIn_62_0 = var4;
                          break L16;
                        }
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6_ref = (Exception) (Object) decompiledCaughtException;
              this.field_w[param2] = (byte)-1;
              ((si) (var4)).b((byte) -117);
              if (((si) (var4)).field_p) {
                if (!this.field_i.e(20)) {
                  var4 = this.field_i.a(5, this.field_j, param2, (byte) 2, true);
                  this.field_k.a((kd) (var4), (byte) -92, (long)param2);
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            return (si) ((Object) stackIn_62_0);
          }
        } else {
          return null;
        }
    }

    public static void d(int param0) {
        field_s = null;
        field_r = null;
        field_A = null;
        field_y = null;
        if (param0 != 64) {
            field_y = (java.awt.Canvas) null;
        }
        field_q = null;
    }

    ug(int param0, dl param1, dl param2, wb param3, kl param4, int param5, byte[] param6, int param7, boolean param8) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_k = new na(16);
        this.field_o = 0;
        this.field_l = new ng();
        this.field_h = 0L;
        try {
          L0: {
            L1: {
              L2: {
                this.field_j = param0;
                this.field_B = param1;
                if (this.field_B == null) {
                  break L2;
                } else {
                  this.field_D = true;
                  this.field_v = new ng();
                  if (!Lexicominos.field_L) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_D = false;
              break L1;
            }
            L3: {
              this.field_i = param3;
              this.field_n = param7;
              this.field_f = param2;
              this.field_g = param6;
              this.field_p = param5;
              stackIn_6_0 = this;

              if (!param8) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L3;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L3;
              }
            }
            L4: {
              ((ug) (this)).field_e = stackIn_7_1 != 0;
              this.field_C = param4;
              if (null == this.field_f) {
                break L4;
              } else {
                this.field_t = (si) ((Object) this.field_C.a(this.field_f, (byte) -6, this.field_j));
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var10);

            stackIn_12_1 = new StringBuilder().append("ug.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L7;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_r = new String[16];
        field_u = 0.0;
        field_q = new dg();
        field_m = 0;
        field_s = "en-gb";
    }
}
