/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    static String field_b;
    private long[] field_f;
    static String field_h;
    private byte[] field_d;
    static String field_c;
    private byte[] field_l;
    static int[] field_k;
    private long[] field_a;
    private int field_o;
    private long[] field_g;
    private long[] field_n;
    static String field_j;
    private long[] field_i;
    static String field_e;
    private int field_m;

    final void b(byte param0) {
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = client.field_A ? 1 : 0;
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((var2 ^ -1) <= -33) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_l[var2] = (byte) 0;
                    var2++;
                    if (var3 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var3 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_o = 0;
                    this.field_m = 0;
                    this.field_d[0] = (byte) 0;
                    var2 = 0;
                    if (param0 < -32) {
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
                    if (-9 < (var2 ^ -1)) {
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
                    this.field_g[var2] = 0L;
                    var2++;
                    if (var3 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return;
                }
                case 11: {
                    if (var3 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                case 14: {
                    this.field_o = 0;
                    this.field_m = 0;
                    this.field_d[0] = (byte) 0;
                    var2 = 0;
                    if (param0 < -32) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return;
                }
                case 16: {
                    if (-9 < (var2 ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return;
                }
                case 18: {
                    this.field_g[var2] = 0L;
                    var2++;
                    if (var3 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    return;
                }
                case 20: {
                    if (var3 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    return;
                }
                case 23: {
                    if (param0 < -32) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    return;
                }
                case 25: {
                    if (-9 < (var2 ^ -1)) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    return;
                }
                case 27: {
                    this.field_g[var2] = 0L;
                    var2++;
                    if (var3 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    return;
                }
                case 29: {
                    if (var3 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        long dupTemp$2 = 0L;
        long arrayValue$3 = 0L;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_158_0 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = client.field_A ? 1 : 0;
                    var2 = 0;
                    var3 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((var2 ^ -1) <= -9) {
                        statePc = 58;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_f[var2] = pj.a(pj.a(jg.a((long)this.field_d[var3 + 6], 255L) << -383590584, pj.a(jg.a((long)this.field_d[var3 + 5] << -306192304, 16711680L), pj.a(jg.a(4278190080L, (long)this.field_d[var3 + 4] << 413393112), pj.a(jg.a((long)this.field_d[3 + var3] << 459903008, 1095216660480L), pj.a(pj.a((long)this.field_d[var3] << 1570355832, jg.a((long)this.field_d[var3 + 1] << -455555024, 71776119061217280L)), jg.a(280375465082880L, (long)this.field_d[2 + var3] << -197783768)))))), jg.a(255L, (long)this.field_d[7 + var3]));
                    var2++;
                    var3 += 8;
                    if (var6 != 0) {
                        statePc = 59;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var6 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var2 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if ((var2 ^ -1) <= -9) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    dupTemp$0 = this.field_g[var2];
                    arrayValue$1 = this.field_f[var2];
                    this.field_a[var2] = dupTemp$0;
                    this.field_n[var2] = pj.a(arrayValue$1, dupTemp$0);
                    var2++;
                    if (var6 != 0) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var6 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var2 = 1;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (-11 > (var2 ^ -1)) {
                        statePc = 48;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_49_0 = 0;
                    stackIn_12_0 = stackIn_49_0;
                    if (var6 != 0) {
                        statePc = 49;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var3 = stackIn_12_0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (8 <= var3) {
                        statePc = 22;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    this.field_i[var3] = 0L;
                    var4 = 0;
                    stackIn_23_0 = 56;
                    stackIn_15_0 = stackIn_23_0;
                    if (var6 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var5 = stackIn_15_0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var4 >= 8) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.field_i[var3] = pj.a(this.field_i[var3], uk.field_s[var4][lb.a((int)(this.field_a[lb.a(7, -var4 + var3)] >>> var5), 255)]);
                    var4++;
                    var5 -= 8;
                    if (var6 != 0) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (var6 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var3++;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (var6 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = 0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var3 = stackIn_23_0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if ((var3 ^ -1) <= -9) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    this.field_a[var3] = this.field_i[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 30;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var6 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    this.field_a[0] = pj.a(this.field_a[0], uk.field_x[var2]);
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    this.field_a[0] = pj.a(this.field_a[0], uk.field_x[var2]);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    var3 = 0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 40;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    this.field_i[var3] = this.field_a[var3];
                    var4 = 0;
                    stackIn_41_0 = 56;
                    stackIn_33_0 = stackIn_41_0;
                    if (var6 != 0) {
                        statePc = 41;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var5 = stackIn_33_0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (8 <= var4) {
                        statePc = 38;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    this.field_i[var3] = pj.a(this.field_i[var3], uk.field_s[var4][lb.a((int)(this.field_n[lb.a(7, var3 + -var4)] >>> var5), 255)]);
                    var4++;
                    var5 -= 8;
                    if (var6 != 0) {
                        statePc = 39;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (var6 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var3++;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var6 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackIn_41_0 = 0;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    var3 = stackIn_41_0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 46;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    this.field_n[var3] = this.field_i[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 47;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (var6 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var2++;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (var6 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    stackIn_49_0 = param0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (stackIn_49_0 <= -24) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    this.field_l = (byte[]) null;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    var2 = 0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (var2 < 8) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    return;
                }
                case 54: {
                    this.field_g[var2] = pj.a(this.field_g[var2], pj.a(this.field_f[var2], this.field_n[var2]));
                    var2++;
                    if (var6 == 0) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    return;
                }
                case 56: {
                    if (var6 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    return;
                }
                case 58: {
                    var2 = 0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if ((var2 ^ -1) <= -9) {
                        statePc = 118;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    dupTemp$2 = this.field_g[var2];
                    arrayValue$3 = this.field_f[var2];
                    this.field_a[var2] = dupTemp$2;
                    this.field_n[var2] = pj.a(arrayValue$3, dupTemp$2);
                    var2++;
                    if (var6 != 0) {
                        statePc = 119;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (var6 == 0) {
                        statePc = 59;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var2 = 1;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    if (-11 > (var2 ^ -1)) {
                        statePc = 101;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    stackIn_102_0 = 0;
                    stackIn_65_0 = stackIn_102_0;
                    if (var6 != 0) {
                        statePc = 102;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var3 = stackIn_65_0;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if (8 <= var3) {
                        statePc = 75;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    this.field_i[var3] = 0L;
                    var4 = 0;
                    stackIn_76_0 = 56;
                    stackIn_68_0 = stackIn_76_0;
                    if (var6 != 0) {
                        statePc = 76;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var5 = stackIn_68_0;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if (var4 >= 8) {
                        statePc = 73;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    this.field_i[var3] = pj.a(this.field_i[var3], uk.field_s[var4][lb.a((int)(this.field_a[lb.a(7, -var4 + var3)] >>> var5), 255)]);
                    var4++;
                    var5 -= 8;
                    if (var6 != 0) {
                        statePc = 74;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (var6 == 0) {
                        statePc = 69;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var3++;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (var6 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    stackIn_76_0 = 0;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    var3 = stackIn_76_0;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if ((var3 ^ -1) <= -9) {
                        statePc = 81;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    this.field_a[var3] = this.field_i[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 83;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (var6 == 0) {
                        statePc = 77;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 81: {
                    this.field_a[0] = pj.a(this.field_a[0], uk.field_x[var2]);
                    statePc = 83;
                    continue stateLoop;
                }
                case 82: {
                    this.field_a[0] = pj.a(this.field_a[0], uk.field_x[var2]);
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    var3 = 0;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 93;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    this.field_i[var3] = this.field_a[var3];
                    var4 = 0;
                    stackIn_94_0 = 56;
                    stackIn_86_0 = stackIn_94_0;
                    if (var6 != 0) {
                        statePc = 94;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var5 = stackIn_86_0;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if (8 <= var4) {
                        statePc = 91;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    this.field_i[var3] = pj.a(this.field_i[var3], uk.field_s[var4][lb.a((int)(this.field_n[lb.a(7, var3 + -var4)] >>> var5), 255)]);
                    var4++;
                    var5 -= 8;
                    if (var6 != 0) {
                        statePc = 92;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if (var6 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var3++;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    if (var6 == 0) {
                        statePc = 84;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    stackIn_94_0 = 0;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    var3 = stackIn_94_0;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 99;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    this.field_n[var3] = this.field_i[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 100;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (var6 == 0) {
                        statePc = 95;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var2++;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    if (var6 == 0) {
                        statePc = 63;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    stackIn_102_0 = param0;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    if (stackIn_102_0 > -24) {
                        statePc = 111;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    var2 = 0;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    if (var2 < 8) {
                        statePc = 106;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    return;
                }
                case 106: {
                    this.field_g[var2] = pj.a(this.field_g[var2], pj.a(this.field_f[var2], this.field_n[var2]));
                    var2++;
                    if (var6 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    return;
                }
                case 108: {
                    if (var6 == 0) {
                        statePc = 104;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    return;
                }
                case 111: {
                    this.field_l = (byte[]) null;
                    var2 = 0;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if (var2 < 8) {
                        statePc = 114;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    return;
                }
                case 114: {
                    this.field_g[var2] = pj.a(this.field_g[var2], pj.a(this.field_f[var2], this.field_n[var2]));
                    var2++;
                    if (var6 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    return;
                }
                case 116: {
                    if (var6 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    return;
                }
                case 118: {
                    var2 = 1;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if (-11 > (var2 ^ -1)) {
                        statePc = 157;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    stackIn_158_0 = 0;
                    stackIn_121_0 = stackIn_158_0;
                    if (var6 != 0) {
                        statePc = 158;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    var3 = stackIn_121_0;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    if (8 <= var3) {
                        statePc = 131;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    this.field_i[var3] = 0L;
                    var4 = 0;
                    stackIn_132_0 = 56;
                    stackIn_124_0 = stackIn_132_0;
                    if (var6 != 0) {
                        statePc = 132;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    var5 = stackIn_124_0;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    if (var4 >= 8) {
                        statePc = 129;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    this.field_i[var3] = pj.a(this.field_i[var3], uk.field_s[var4][lb.a((int)(this.field_a[lb.a(7, -var4 + var3)] >>> var5), 255)]);
                    var4++;
                    var5 -= 8;
                    if (var6 != 0) {
                        statePc = 130;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    if (var6 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var3++;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    if (var6 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    stackIn_132_0 = 0;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    var3 = stackIn_132_0;
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if ((var3 ^ -1) <= -9) {
                        statePc = 137;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    this.field_a[var3] = this.field_i[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 139;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (var6 == 0) {
                        statePc = 133;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 137: {
                    this.field_a[0] = pj.a(this.field_a[0], uk.field_x[var2]);
                    statePc = 139;
                    continue stateLoop;
                }
                case 138: {
                    this.field_a[0] = pj.a(this.field_a[0], uk.field_x[var2]);
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    var3 = 0;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 149;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    this.field_i[var3] = this.field_a[var3];
                    var4 = 0;
                    stackIn_150_0 = 56;
                    stackIn_142_0 = stackIn_150_0;
                    if (var6 != 0) {
                        statePc = 150;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var5 = stackIn_142_0;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if (8 <= var4) {
                        statePc = 147;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    this.field_i[var3] = pj.a(this.field_i[var3], uk.field_s[var4][lb.a((int)(this.field_n[lb.a(7, var3 + -var4)] >>> var5), 255)]);
                    var4++;
                    var5 -= 8;
                    if (var6 != 0) {
                        statePc = 148;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (var6 == 0) {
                        statePc = 143;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var3++;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    if (var6 == 0) {
                        statePc = 140;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    stackIn_150_0 = 0;
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    var3 = stackIn_150_0;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 155;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    this.field_n[var3] = this.field_i[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 156;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if (var6 == 0) {
                        statePc = 151;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    var2++;
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    if (var6 == 0) {
                        statePc = 119;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    stackIn_158_0 = param0;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    if (stackIn_158_0 <= -24) {
                        statePc = 166;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    this.field_l = (byte[]) null;
                    var2 = 0;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    if (var2 < 8) {
                        statePc = 162;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    return;
                }
                case 162: {
                    this.field_g[var2] = pj.a(this.field_g[var2], pj.a(this.field_f[var2], this.field_n[var2]));
                    var2++;
                    if (var6 == 0) {
                        statePc = 164;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    return;
                }
                case 164: {
                    if (var6 == 0) {
                        statePc = 160;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    return;
                }
                case 166: {
                    var2 = 0;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    if (var2 < 8) {
                        statePc = 169;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    return;
                }
                case 169: {
                    this.field_g[var2] = pj.a(this.field_g[var2], pj.a(this.field_f[var2], this.field_n[var2]));
                    var2++;
                    if (var6 == 0) {
                        statePc = 171;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    return;
                }
                case 171: {
                    if (var6 == 0) {
                        statePc = 167;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, byte[] param1, long param2) {
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 0;
                        var6 = 7 & 8 - ((int)param2 & 7);
                        if (param0 == 255) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        qe.a((byte) 13);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var7 = 7 & this.field_o;
                        var9 = param2;
                        var11 = 31;
                        var12 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (0 > var11) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var12 = var12 + ((this.field_l[var11] & 255) - -(255 & (int)var9));
                        this.field_l[var11] = (byte)var12;
                        var12 = var12 >>> 8;
                        var9 = var9 >>> 8;
                        var11--;
                        if (var13 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var13 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((param2 ^ -1L) >= -9L) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var8 = 255 & param1[var5_int] << var6 | (param1[1 + var5_int] & 255) >>> 8 + -var6;
                        stackIn_20_0 = 0;
                        stackIn_10_0 = stackIn_20_0;
                        stackIn_20_1 = var8;
                        stackIn_10_1 = stackIn_20_1;
                        if (var13 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 > stackIn_10_1) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (-257 < (var8 ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw new RuntimeException("LOGIC ERROR");
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_d[this.field_m] = (byte)de.b((int) this.field_d[this.field_m], var8 >>> var7);
                        this.field_o = this.field_o + (-var7 + 8);
                        this.field_m = this.field_m + 1;
                        if (-513 != (this.field_o ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.b(-63);
                        this.field_o = 0;
                        this.field_m = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.field_d[this.field_m] = (byte)lb.a(255, var8 << 8 + -var7);
                        param2 = param2 - 8L;
                        var5_int++;
                        this.field_o = this.field_o + var7;
                        if (var13 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (param2 > 0L) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var8 = 0;
                        if (var13 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = param1[var5_int] << var6;
                        stackIn_20_1 = 255;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var8 = stackIn_20_0 & stackIn_20_1;
                        this.field_d[this.field_m] = (byte)de.b((int) this.field_d[this.field_m], var8 >>> var7);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((param2 + (long)var7 ^ -1L) <= -9L) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.field_o = (int)((long)this.field_o + param2);
                        if (var13 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.field_o = this.field_o + (-var7 + 8);
                        this.field_m = this.field_m + 1;
                        param2 = param2 - (long)(8 - var7);
                        if ((this.field_o ^ -1) != -513) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.b(-26);
                        this.field_m = 0;
                        this.field_o = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        this.field_d[this.field_m] = (byte)lb.a(255, var8 << 8 + -var7);
                        this.field_o = this.field_o + (int)param2;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_30_0 = (RuntimeException) (var5);
                    stackIn_29_0 = stackIn_30_0;
                    stackIn_30_1 = new StringBuilder().append("qe.H(").append(param0).append(',');
                    stackIn_29_1 = stackIn_30_1;
                    if (param1 == null) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_31_2 = "{...}";
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_31_2 = "null";
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    throw dh.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ')');
                }
                case 32: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(String param0, int param1) {
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
              if (param1 == 3) {
                break L1;
              } else {
                field_k = (int[]) null;
                break L1;
              }
            }
            L2: {
              if (null == ed.a(param0, (byte) -108)) {
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

            stackIn_8_1 = new StringBuilder().append("qe.D(");

            if (param0 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(int param0, int param1, byte[] param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
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
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_d[this.field_m] = (byte)de.b((int) this.field_d[this.field_m], 128 >>> lb.a(this.field_o, 7));
                        this.field_m = this.field_m + 1;
                        if ((this.field_m ^ -1) >= -33) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((this.field_m ^ -1) <= -65) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        fieldTemp$0 = this.field_m;
                        this.field_m = this.field_m + 1;
                        this.field_d[fieldTemp$0] = (byte) 0;
                        if (var8 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var8 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.b(-115);
                        this.field_m = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.b(-115);
                        this.field_m = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_m = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (32 <= this.field_m) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        fieldTemp$1 = this.field_m;
                        this.field_m = this.field_m + 1;
                        this.field_d[fieldTemp$1] = (byte) 0;
                        if (var8 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var8 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        an.a(this.field_l, 0, this.field_d, 32, 32);
                        this.b(-76);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4_int = 0;
                        var5 = param1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var4_int >= 8) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var6 = this.field_g[var4_int];
                        param2[var5] = (byte)(int)(var6 >>> 1762041848);
                        param2[var5 - -1] = (byte)(int)(var6 >>> 442716528);
                        param2[2 + var5] = (byte)(int)(var6 >>> -499075224);
                        param2[3 + var5] = (byte)(int)(var6 >>> 1507390240);
                        param2[var5 + 4] = (byte)(int)(var6 >>> 1776836824);
                        param2[5 + var5] = (byte)(int)(var6 >>> -396321520);
                        param2[6 + var5] = (byte)(int)(var6 >>> 64767752);
                        param2[7 + var5] = (byte)(int)var6;
                        var5 += 8;
                        var4_int++;
                        if (var8 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var8 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (param0 == 64767752) {
                            statePc = 26;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        this.field_m = -86;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_24_0 = (RuntimeException) (var4);
                    stackIn_23_0 = stackIn_24_0;
                    stackIn_24_1 = new StringBuilder().append("qe.C(").append(param0).append(',').append(param1).append(',');
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
                    throw dh.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(byte param0) {
        String var1;
        var1 = "";
        if (param0 < 85) {
          return (String) null;
        } else {
          L0: {
            if (dm.field_c != null) {
              var1 = dm.field_c.j(80);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-1 == (var1.length() ^ -1)) {
              var1 = db.b((byte) 122);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (var1.length() != 0) {
              break L2;
            } else {
              var1 = wh.field_e;
              break L2;
            }
          }
          return var1;
        }
    }

    final static ck[] a(boolean param0, int param1, boolean param2, int param3, int param4, int param5) {
        int[] var6;
        int var7;
        int var8;
        Object var10;
        Object var11;
        int[] var12;
        int[] var15;
        int[] var16;
        ck var17;
        ck var18;
        ck var19;
        ck var20;
        ck var21;
        ck var22;
        if (param5 != -26198) {
          L0: {
            field_j = (String) null;
            var16 = hk.field_l;
            var15 = var16;
            var12 = var15;
            var6 = var12;
            var7 = hk.field_j;
            var8 = hk.field_i;
            var17 = new ck(16, param1);
            var17.a();
            hk.d(0, 0, 16, param1, param3, param4);
            var10 = null;
            if (param2) {
              var18 = var17.c();
              var10 = var18;
              var18.a();
              hk.a(0, 0, 5, 0);
              hk.a(0, 1, 3, 0);
              hk.a(0, 2, 2, 0);
              hk.a(0, 3, 1, 0);
              hk.a(0, 4, 1, 0);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var11 = null;
            if (!param0) {
              break L1;
            } else {
              var19 = var17.c();
              var11 = var19;
              var19.a();
              hk.a(11, 0, 5, 0);
              hk.a(13, 1, 3, 0);
              hk.a(14, 2, 2, 0);
              hk.a(15, 3, 1, 0);
              hk.a(15, 4, 1, 0);
              break L1;
            }
          }
          hk.a(var16, var7, var8);
          return new ck[]{null, null, null, (ck) (var10), var17, (ck) (var11), null, null, null};
        } else {
          L2: {
            var16 = hk.field_l;
            var15 = var16;
            var12 = var15;
            var6 = var12;
            var7 = hk.field_j;
            var8 = hk.field_i;
            var20 = new ck(16, param1);
            var20.a();
            hk.d(0, 0, 16, param1, param3, param4);
            var10 = null;
            if (param2) {
              var21 = var20.c();
              var10 = var21;
              var21.a();
              hk.a(0, 0, 5, 0);
              hk.a(0, 1, 3, 0);
              hk.a(0, 2, 2, 0);
              hk.a(0, 3, 1, 0);
              hk.a(0, 4, 1, 0);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var11 = null;
            if (!param0) {
              break L3;
            } else {
              var22 = var20.c();
              var11 = var22;
              var22.a();
              hk.a(11, 0, 5, 0);
              hk.a(13, 1, 3, 0);
              hk.a(14, 2, 2, 0);
              hk.a(15, 3, 1, 0);
              hk.a(15, 4, 1, 0);
              break L3;
            }
          }
          hk.a(var16, var7, var8);
          return new ck[]{null, null, null, (ck) (var10), var20, (ck) (var11), null, null, null};
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        field_e = null;
        field_k = null;
        field_b = null;
        field_j = null;
        if (param0 == -20007) {
          return;
        } else {
          field_c = (String) null;
          return;
        }
    }

    final static void a(long param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            InterruptedException var3 = null;
            if (param1 < -100) {
              try {
                L0: {
                  Thread.sleep(param0);
                  break L0;
                }
              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var3 = (InterruptedException) (Object) decompiledCaughtException;
                  break L1;
                }
              }
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    qe() {
        this.field_d = new byte[64];
        this.field_f = new long[8];
        this.field_o = 0;
        this.field_g = new long[8];
        this.field_l = new byte[32];
        this.field_i = new long[8];
        this.field_n = new long[8];
        this.field_m = 0;
        this.field_a = new long[8];
    }

    static {
        field_k = new int[8];
        field_h = "Unable to add name - system busy";
        field_j = "To activate a special item, pop a shape next to it.";
        field_b = "Asking to join <%0>'s game...";
        field_e = "Age:";
        field_c = "Play rated game";
    }
}
