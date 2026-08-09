/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    private byte[] field_c;
    private long[] field_b;
    private byte[] field_j;
    private int field_h;
    static String field_i;
    static int[] field_d;
    private long[] field_f;
    private long[] field_g;
    private long[] field_e;
    private long[] field_k;
    private int field_a;

    private final void a(byte param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        long dupTemp$2 = 0L;
        long arrayValue$3 = 0L;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_134_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_150_0 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Transmogrify.field_A ? 1 : 0;
                    if (param0 <= -86) {
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
                    var2 = 0;
                    var3 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (-9 >= (var2 ^ -1)) {
                        statePc = 58;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.field_b[var2] = aj.a(ej.a(255L, (long)this.field_j[7 + var3]), aj.a(aj.a(ej.a((long)this.field_j[5 + var3], 255L) << -640331824, aj.a(ej.a(4278190080L, (long)this.field_j[var3 - -4] << 212529752), aj.a(aj.a(ej.a(280375465082880L, (long)this.field_j[var3 + 2] << 861818856), aj.a((long)this.field_j[var3] << -1322827016, ej.a((long)this.field_j[1 + var3] << 73813488, 71776119061217280L))), ej.a(255L, (long)this.field_j[var3 - -3]) << -1053287136))), ej.a((long)this.field_j[6 + var3] << -1986427384, 65280L)));
                    var3 += 8;
                    var2++;
                    if (var6 != 0) {
                        statePc = 59;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var6 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var2 = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (-9 >= (var2 ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    dupTemp$0 = this.field_e[var2];
                    arrayValue$1 = this.field_b[var2];
                    this.field_f[var2] = dupTemp$0;
                    this.field_g[var2] = aj.a(arrayValue$1, dupTemp$0);
                    var2++;
                    if (var6 != 0) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var6 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var2 = 1;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (10 < var2) {
                        statePc = 50;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_51_0 = 0;
                    stackIn_14_0 = stackIn_51_0;
                    if (var6 != 0) {
                        statePc = 51;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var3 = stackIn_14_0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if ((var3 ^ -1) <= -9) {
                        statePc = 24;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.field_k[var3] = 0L;
                    var4 = 0;
                    stackIn_25_0 = 56;
                    stackIn_17_0 = stackIn_25_0;
                    if (var6 != 0) {
                        statePc = 25;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var5 = stackIn_17_0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (var4 >= 8) {
                        statePc = 22;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.field_k[var3] = aj.a(this.field_k[var3], dl.field_n[var4][vg.c((int)(this.field_f[vg.c(var3 + -var4, 7)] >>> var5), 255)]);
                    var5 -= 8;
                    var4++;
                    if (var6 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (var6 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var3++;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (var6 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = 0;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    var3 = stackIn_25_0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (8 <= var3) {
                        statePc = 30;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    this.field_f[var3] = this.field_k[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 32;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (var6 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 30: {
                    this.field_f[0] = aj.a(this.field_f[0], dl.field_q[var2]);
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    this.field_f[0] = aj.a(this.field_f[0], dl.field_q[var2]);
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var3 = 0;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (8 <= var3) {
                        statePc = 42;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    this.field_k[var3] = this.field_f[var3];
                    var4 = 0;
                    stackIn_43_0 = 56;
                    stackIn_35_0 = stackIn_43_0;
                    if (var6 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var5 = stackIn_35_0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (-9 >= (var4 ^ -1)) {
                        statePc = 40;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    this.field_k[var3] = aj.a(this.field_k[var3], dl.field_n[var4][vg.c(255, (int)(this.field_g[vg.c(-var4 + var3, 7)] >>> var5))]);
                    var5 -= 8;
                    var4++;
                    if (var6 != 0) {
                        statePc = 41;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (var6 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var3++;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (var6 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    stackIn_43_0 = 0;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    var3 = stackIn_43_0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (var3 >= 8) {
                        statePc = 48;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    this.field_g[var3] = this.field_k[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 49;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var6 == 0) {
                        statePc = 44;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var2++;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (var6 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    stackIn_51_0 = 0;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    var2 = stackIn_51_0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (-9 < (var2 ^ -1)) {
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
                    this.field_e[var2] = aj.a(this.field_e[var2], aj.a(this.field_g[var2], this.field_b[var2]));
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
                    if (-9 >= (var2 ^ -1)) {
                        statePc = 110;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    dupTemp$2 = this.field_e[var2];
                    arrayValue$3 = this.field_b[var2];
                    this.field_f[var2] = dupTemp$2;
                    this.field_g[var2] = aj.a(arrayValue$3, dupTemp$2);
                    var2++;
                    if (var6 != 0) {
                        statePc = 111;
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
                    if (10 < var2) {
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
                    if ((var3 ^ -1) <= -9) {
                        statePc = 75;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    this.field_k[var3] = 0L;
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
                    this.field_k[var3] = aj.a(this.field_k[var3], dl.field_n[var4][vg.c((int)(this.field_f[vg.c(var3 + -var4, 7)] >>> var5), 255)]);
                    var5 -= 8;
                    var4++;
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
                    if (8 <= var3) {
                        statePc = 81;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    this.field_f[var3] = this.field_k[var3];
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
                    this.field_f[0] = aj.a(this.field_f[0], dl.field_q[var2]);
                    statePc = 83;
                    continue stateLoop;
                }
                case 82: {
                    this.field_f[0] = aj.a(this.field_f[0], dl.field_q[var2]);
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    var3 = 0;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (8 <= var3) {
                        statePc = 93;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    this.field_k[var3] = this.field_f[var3];
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
                    if (-9 >= (var4 ^ -1)) {
                        statePc = 91;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    this.field_k[var3] = aj.a(this.field_k[var3], dl.field_n[var4][vg.c(255, (int)(this.field_g[vg.c(-var4 + var3, 7)] >>> var5))]);
                    var5 -= 8;
                    var4++;
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
                    if (var3 >= 8) {
                        statePc = 99;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    this.field_g[var3] = this.field_k[var3];
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
                    stackIn_102_0 = 0;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    var2 = stackIn_102_0;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    if (-9 < (var2 ^ -1)) {
                        statePc = 105;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    return;
                }
                case 105: {
                    this.field_e[var2] = aj.a(this.field_e[var2], aj.a(this.field_g[var2], this.field_b[var2]));
                    var2++;
                    if (var6 == 0) {
                        statePc = 107;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    return;
                }
                case 107: {
                    if (var6 == 0) {
                        statePc = 103;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    return;
                }
                case 110: {
                    var2 = 1;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    if (10 < var2) {
                        statePc = 149;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    stackIn_150_0 = 0;
                    stackIn_113_0 = stackIn_150_0;
                    if (var6 != 0) {
                        statePc = 150;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    var3 = stackIn_113_0;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    if ((var3 ^ -1) <= -9) {
                        statePc = 123;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    this.field_k[var3] = 0L;
                    var4 = 0;
                    stackIn_124_0 = 56;
                    stackIn_116_0 = stackIn_124_0;
                    if (var6 != 0) {
                        statePc = 124;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    var5 = stackIn_116_0;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    if (var4 >= 8) {
                        statePc = 121;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    this.field_k[var3] = aj.a(this.field_k[var3], dl.field_n[var4][vg.c((int)(this.field_f[vg.c(var3 + -var4, 7)] >>> var5), 255)]);
                    var5 -= 8;
                    var4++;
                    if (var6 != 0) {
                        statePc = 122;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if (var6 == 0) {
                        statePc = 117;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    var3++;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    if (var6 == 0) {
                        statePc = 114;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    stackIn_124_0 = 0;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    var3 = stackIn_124_0;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    if (8 <= var3) {
                        statePc = 129;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    this.field_f[var3] = this.field_k[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 131;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    if (var6 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 129: {
                    this.field_f[0] = aj.a(this.field_f[0], dl.field_q[var2]);
                    statePc = 131;
                    continue stateLoop;
                }
                case 130: {
                    this.field_f[0] = aj.a(this.field_f[0], dl.field_q[var2]);
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    var3 = 0;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    if (8 <= var3) {
                        statePc = 141;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    this.field_k[var3] = this.field_f[var3];
                    var4 = 0;
                    stackIn_142_0 = 56;
                    stackIn_134_0 = stackIn_142_0;
                    if (var6 != 0) {
                        statePc = 142;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    var5 = stackIn_134_0;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    if (-9 >= (var4 ^ -1)) {
                        statePc = 139;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    this.field_k[var3] = aj.a(this.field_k[var3], dl.field_n[var4][vg.c(255, (int)(this.field_g[vg.c(-var4 + var3, 7)] >>> var5))]);
                    var5 -= 8;
                    var4++;
                    if (var6 != 0) {
                        statePc = 140;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    if (var6 == 0) {
                        statePc = 135;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    var3++;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if (var6 == 0) {
                        statePc = 132;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    stackIn_142_0 = 0;
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    var3 = stackIn_142_0;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if (var3 >= 8) {
                        statePc = 147;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    this.field_g[var3] = this.field_k[var3];
                    var3++;
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
                    var2++;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    if (var6 == 0) {
                        statePc = 111;
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
                    var2 = stackIn_150_0;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    if (-9 < (var2 ^ -1)) {
                        statePc = 153;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    return;
                }
                case 153: {
                    this.field_e[var2] = aj.a(this.field_e[var2], aj.a(this.field_g[var2], this.field_b[var2]));
                    var2++;
                    if (var6 == 0) {
                        statePc = 155;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    return;
                }
                case 155: {
                    if (var6 == 0) {
                        statePc = 151;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int b(byte param0) {
        if (param0 != -6) {
            return 92;
        }
        we.field_j.a(false);
        if (!oh.field_h.c((byte) 124)) {
            return ai.a(2);
        }
        return 0;
    }

    final static boolean a(int param0, int param1, int param2, ci param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = param3.a((byte) -93, param0, param2);
            var4 = var5;
            if (var5 == null) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 == 0) {
                kf.a(var5, param1 ^ 108);
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4_ref);

            stackIn_11_1 = new StringBuilder().append("rl.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_8_0 != 0;
          }
        }
    }

    public static void b(int param0) {
        field_i = null;
        if (param0 != 7) {
            field_d = (int[]) null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final void a(int param0, long param1, byte[] param2) {
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
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
                    var13 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 14027) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var5_int = 0;
                        var6 = 7 & 8 + -(7 & (int)param1);
                        var7 = 7 & this.field_h;
                        var9 = param1;
                        var11 = 31;
                        var12 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var11 < 0) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var12 = var12 + ((this.field_c[var11] & 255) - -(255 & (int)var9));
                        this.field_c[var11] = (byte)var12;
                        var9 = var9 >>> 8;
                        var12 = var12 >>> 8;
                        var11--;
                        if (var13 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 29;
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
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (-9L <= (param1 ^ -1L)) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var8 = 255 & param2[var5_int] << var6 | (255 & param2[1 + var5_int]) >>> -var6 + 8;
                        stackIn_18_0 = var8;
                        stackIn_10_0 = stackIn_18_0;
                        if (var13 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 < 0) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (256 > var8) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw new RuntimeException("LOGIC ERROR");
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_j[this.field_a] = (byte)cl.b((int) this.field_j[this.field_a], var8 >>> var7);
                        this.field_h = this.field_h + (-var7 + 8);
                        this.field_a = this.field_a + 1;
                        if (-513 != (this.field_h ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.a((byte) -97);
                        this.field_h = 0;
                        this.field_a = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.field_j[this.field_a] = (byte)vg.c(var8 << 8 + -var7, 255);
                        var5_int++;
                        param1 = param1 - 8L;
                        this.field_h = this.field_h + var7;
                        if (var13 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = (param1 < 0L ? -1 : (param1 == 0L ? 0 : 1));
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (stackIn_18_0 > 0) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var8 = 0;
                        if (var13 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var8 = param2[var5_int] << var6 & 255;
                        this.field_j[this.field_a] = (byte)cl.b((int) this.field_j[this.field_a], var8 >>> var7);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (8L <= param1 + (long)var7) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.field_h = (int)((long)this.field_h + param1);
                        if (var13 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        param1 = param1 - (long)(-var7 + 8);
                        this.field_h = this.field_h + (-var7 + 8);
                        this.field_a = this.field_a + 1;
                        if (this.field_h == 512) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        this.a((byte) -94);
                        this.field_a = 0;
                        this.field_h = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        this.field_j[this.field_a] = (byte)vg.c(255, var8 << -var7 + 8);
                        this.field_h = this.field_h + (int)param1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_31_0 = (RuntimeException) (var5);
                    stackIn_30_0 = stackIn_31_0;
                    stackIn_31_1 = new StringBuilder().append("rl.F(").append(param0).append(',').append(param1).append(',');
                    stackIn_30_1 = stackIn_31_1;
                    if (param2 == null) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_32_2 = "{...}";
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
                    stackIn_32_2 = "null";
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    throw ch.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
                }
                case 33: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte[] param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
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
                    var8 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_j[this.field_a] = (byte)cl.b((int) this.field_j[this.field_a], 128 >>> vg.c(this.field_h, 7));
                        this.field_a = this.field_a + 1;
                        if (-33 <= (this.field_a ^ -1)) {
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
                        if (this.field_a >= 64) {
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
                        fieldTemp$0 = this.field_a;
                        this.field_a = this.field_a + 1;
                        this.field_j[fieldTemp$0] = (byte) 0;
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
                        this.a((byte) -87);
                        this.field_a = 0;
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
                        this.a((byte) -87);
                        this.field_a = 0;
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
                        this.field_a = 0;
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
                        if (-33 >= (this.field_a ^ -1)) {
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
                        fieldTemp$1 = this.field_a;
                        this.field_a = this.field_a + 1;
                        this.field_j[fieldTemp$1] = (byte) 0;
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
                        ji.a(this.field_c, 0, this.field_j, 32, 32);
                        this.a((byte) -119);
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
                        var5 = param2;
                        if (param1 > 51) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return;
                }
                case 16: {
                    try {
                        if ((var4_int ^ -1) <= -9) {
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
                        var6 = this.field_e[var4_int];
                        param0[var5] = (byte)(int)(var6 >>> 764252024);
                        param0[1 + var5] = (byte)(int)(var6 >>> -740567376);
                        param0[2 + var5] = (byte)(int)(var6 >>> 1386401128);
                        param0[var5 + 3] = (byte)(int)(var6 >>> -2042330144);
                        param0[4 + var5] = (byte)(int)(var6 >>> 682001624);
                        param0[5 + var5] = (byte)(int)(var6 >>> -230296944);
                        param0[6 + var5] = (byte)(int)(var6 >>> -1223563576);
                        param0[7 + var5] = (byte)(int)var6;
                        var5 += 8;
                        var4_int++;
                        if (var8 == 0) {
                            statePc = 19;
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
                        return;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var8 == 0) {
                            statePc = 16;
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
                    stackIn_24_1 = new StringBuilder().append("rl.C(");
                    stackIn_23_1 = stackIn_24_1;
                    if (param0 == null) {
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
                    throw ch.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    rl() {
        this.field_h = 0;
        this.field_b = new long[8];
        this.field_f = new long[8];
        this.field_j = new byte[64];
        this.field_e = new long[8];
        this.field_g = new long[8];
        this.field_k = new long[8];
        this.field_c = new byte[32];
        this.field_a = 0;
    }

    final void a(int param0) {
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Transmogrify.field_A ? 1 : 0;
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
                    this.field_c[var2] = (byte) 0;
                    var2++;
                    if (var3 != 0) {
                        statePc = 37;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var3 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_a = 0;
                    this.field_h = 0;
                    this.field_j[0] = (byte) 0;
                    if (param0 != 15298) {
                        statePc = 14;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var2 = 0;
                    statePc = 7;
                    continue stateLoop;
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
                    this.field_e[var2] = 0L;
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
                    this.field_g = (long[]) null;
                    var2 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (-9 < (var2 ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    return;
                }
                case 17: {
                    this.field_e[var2] = 0L;
                    var2++;
                    if (var3 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return;
                }
                case 19: {
                    if (var3 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                case 21: {
                    this.field_a = 0;
                    this.field_h = 0;
                    this.field_j[0] = (byte) 0;
                    if (param0 != 15298) {
                        statePc = 30;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var2 = 0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (-9 < (var2 ^ -1)) {
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
                    this.field_e[var2] = 0L;
                    var2++;
                    if (var3 == 0) {
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
                    if (var3 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    return;
                }
                case 30: {
                    this.field_g = (long[]) null;
                    var2 = 0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (-9 < (var2 ^ -1)) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    return;
                }
                case 33: {
                    this.field_e[var2] = 0L;
                    var2++;
                    if (var3 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    return;
                }
                case 35: {
                    if (var3 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    return;
                }
                case 37: {
                    if (param0 == 15298) {
                        statePc = 45;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    this.field_g = (long[]) null;
                    var2 = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (-9 < (var2 ^ -1)) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    return;
                }
                case 41: {
                    this.field_e[var2] = 0L;
                    var2++;
                    if (var3 == 0) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    return;
                }
                case 43: {
                    if (var3 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    return;
                }
                case 45: {
                    var2 = 0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (-9 < (var2 ^ -1)) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    return;
                }
                case 48: {
                    this.field_e[var2] = 0L;
                    var2++;
                    if (var3 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    return;
                }
                case 50: {
                    if (var3 == 0) {
                        statePc = 46;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_i = "Achieved";
        field_d = new int[8192];
    }
}
