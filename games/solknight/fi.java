/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    private long[] field_d;
    private byte[] field_g;
    private long[] field_h;
    private long[] field_b;
    static String field_j;
    static o[] field_a;
    private byte[] field_e;
    private long[] field_i;
    private long[] field_k;
    private int field_f;
    private int field_c;

    final static void a(sd param0, int param1, int param2) {
        jd var3 = null;
        try {
            if (param2 != -24045) {
                fi.b(101);
            }
            var3 = id.field_c;
            var3.e(param1, param2 + -2147459603);
            var3.c(1, 5);
            var3.c(-113, 0);
            var3.a(true, param0.field_o);
            var3.c(50, param0.field_k);
            var3.c(param2 ^ -24018, param0.field_l);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "fi.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        uj.a(param4, param5, param2, h.field_d, param6, 2);
        uj.a(param3, param0, (param4 - param3 >> -309134335) + param2, of.field_b, param6 - (param0 + -18 >> 2135951233), 2);
        th.field_H.d((param4 + -param3 >> -277449695) + param2 + -20, -10 + param6);
        uk.field_k.d(-18 + param3 + ((-param3 + param4 >> -1231169183) + param2), param6 - 10);
        if (param1) {
          return;
        } else {
          fi.a(-46);
          return;
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    private final void c(int param0) {
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
                    var6 = SolKnight.field_L ? 1 : 0;
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
                    this.field_k[var2] = ke.a(tk.a((long)this.field_g[var3 + 7], 255L), ke.a(tk.a((long)this.field_g[6 + var3] << -1358238136, 65280L), ke.a(tk.a((long)this.field_g[5 + var3], 255L) << -1353661168, ke.a(ke.a(tk.a(255L, (long)this.field_g[3 + var3]) << -1446647392, ke.a(ke.a((long)this.field_g[var3] << -795572616, tk.a((long)this.field_g[1 + var3], 255L) << 1743967536), tk.a((long)this.field_g[var3 - -2] << 350230440, 280375465082880L))), tk.a(255L, (long)this.field_g[4 + var3]) << 1456127320))));
                    var3 += 8;
                    var2++;
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
                    if (-9 >= (var2 ^ -1)) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    dupTemp$0 = this.field_d[var2];
                    arrayValue$1 = this.field_k[var2];
                    this.field_b[var2] = dupTemp$0;
                    this.field_i[var2] = ke.a(arrayValue$1, dupTemp$0);
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
                    if ((var2 ^ -1) < -11) {
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
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 22;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    this.field_h[var3] = 0L;
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
                    if (-9 >= (var4 ^ -1)) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.field_h[var3] = ke.a(this.field_h[var3], ie.field_c[var4][fi.a(255, (int)(this.field_b[fi.a(7, var3 + -var4)] >>> var5))]);
                    var5 -= 8;
                    var4++;
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
                    this.field_b[var3] = this.field_h[var3];
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
                    this.field_b[0] = ke.a(this.field_b[0], ie.field_g[var2]);
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    this.field_b[0] = ke.a(this.field_b[0], ie.field_g[var2]);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    var3 = 0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if ((var3 ^ -1) <= -9) {
                        statePc = 40;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    this.field_h[var3] = this.field_b[var3];
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
                    this.field_h[var3] = ke.a(this.field_h[var3], ie.field_c[var4][fi.a(255, (int)(this.field_i[fi.a(7, -var4 + var3)] >>> var5))]);
                    var5 -= 8;
                    var4++;
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
                    if (var3 >= 8) {
                        statePc = 46;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    this.field_i[var3] = this.field_h[var3];
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
                    if (stackIn_49_0 == 24843) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    field_j = (String) null;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    var2 = 0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if ((var2 ^ -1) > -9) {
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
                    this.field_d[var2] = ke.a(this.field_d[var2], ke.a(this.field_i[var2], this.field_k[var2]));
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
                        statePc = 118;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    dupTemp$2 = this.field_d[var2];
                    arrayValue$3 = this.field_k[var2];
                    this.field_b[var2] = dupTemp$2;
                    this.field_i[var2] = ke.a(arrayValue$3, dupTemp$2);
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
                    if ((var2 ^ -1) < -11) {
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
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 75;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    this.field_h[var3] = 0L;
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
                    if (-9 >= (var4 ^ -1)) {
                        statePc = 73;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    this.field_h[var3] = ke.a(this.field_h[var3], ie.field_c[var4][fi.a(255, (int)(this.field_b[fi.a(7, var3 + -var4)] >>> var5))]);
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
                    if ((var3 ^ -1) <= -9) {
                        statePc = 81;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    this.field_b[var3] = this.field_h[var3];
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
                    this.field_b[0] = ke.a(this.field_b[0], ie.field_g[var2]);
                    statePc = 83;
                    continue stateLoop;
                }
                case 82: {
                    this.field_b[0] = ke.a(this.field_b[0], ie.field_g[var2]);
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    var3 = 0;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if ((var3 ^ -1) <= -9) {
                        statePc = 93;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    this.field_h[var3] = this.field_b[var3];
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
                    this.field_h[var3] = ke.a(this.field_h[var3], ie.field_c[var4][fi.a(255, (int)(this.field_i[fi.a(7, -var4 + var3)] >>> var5))]);
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
                    this.field_i[var3] = this.field_h[var3];
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
                    if (stackIn_102_0 != 24843) {
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
                    if ((var2 ^ -1) > -9) {
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
                    this.field_d[var2] = ke.a(this.field_d[var2], ke.a(this.field_i[var2], this.field_k[var2]));
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
                    field_j = (String) null;
                    var2 = 0;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if ((var2 ^ -1) > -9) {
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
                    this.field_d[var2] = ke.a(this.field_d[var2], ke.a(this.field_i[var2], this.field_k[var2]));
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
                    if ((var2 ^ -1) < -11) {
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
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 131;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    this.field_h[var3] = 0L;
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
                    if (-9 >= (var4 ^ -1)) {
                        statePc = 129;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    this.field_h[var3] = ke.a(this.field_h[var3], ie.field_c[var4][fi.a(255, (int)(this.field_b[fi.a(7, var3 + -var4)] >>> var5))]);
                    var5 -= 8;
                    var4++;
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
                    this.field_b[var3] = this.field_h[var3];
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
                    this.field_b[0] = ke.a(this.field_b[0], ie.field_g[var2]);
                    statePc = 139;
                    continue stateLoop;
                }
                case 138: {
                    this.field_b[0] = ke.a(this.field_b[0], ie.field_g[var2]);
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    var3 = 0;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if ((var3 ^ -1) <= -9) {
                        statePc = 149;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    this.field_h[var3] = this.field_b[var3];
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
                    this.field_h[var3] = ke.a(this.field_h[var3], ie.field_c[var4][fi.a(255, (int)(this.field_i[fi.a(7, -var4 + var3)] >>> var5))]);
                    var5 -= 8;
                    var4++;
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
                    if (var3 >= 8) {
                        statePc = 155;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    this.field_i[var3] = this.field_h[var3];
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
                    if (stackIn_158_0 == 24843) {
                        statePc = 166;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    field_j = (String) null;
                    var2 = 0;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    if ((var2 ^ -1) > -9) {
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
                    this.field_d[var2] = ke.a(this.field_d[var2], ke.a(this.field_i[var2], this.field_k[var2]));
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
                    if ((var2 ^ -1) > -9) {
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
                    this.field_d[var2] = ke.a(this.field_d[var2], ke.a(this.field_i[var2], this.field_k[var2]));
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

    public static void a(int param0) {
        field_a = null;
        field_j = null;
        if (param0 == -18120) {
            return;
        }
        field_a = (o[]) null;
    }

    final static String a(byte param0) {
        if (param0 != 84) {
            return (String) null;
        }
        if (!(gf.field_Z != ma.field_o)) {
            return lf.field_e;
        }
        return ec.field_j;
    }

    final void b(byte param0) {
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = SolKnight.field_L ? 1 : 0;
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (-33 >= (var2 ^ -1)) {
                        statePc = 22;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_e[var2] = (byte) 0;
                    var2++;
                    if (var3 != 0) {
                        statePc = 38;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var3 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (param0 >= 95) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    fi.a(-125);
                    statePc = 14;
                    continue stateLoop;
                }
                case 6: {
                    this.field_f = 0;
                    this.field_c = 0;
                    this.field_g[0] = (byte) 0;
                    var2 = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if ((var2 ^ -1) > -9) {
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
                    this.field_d[var2] = 0L;
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
                    this.field_f = 0;
                    this.field_c = 0;
                    this.field_g[0] = (byte) 0;
                    var2 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if ((var2 ^ -1) > -9) {
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
                    this.field_d[var2] = 0L;
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
                case 22: {
                    if (param0 >= 95) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    fi.a(-125);
                    statePc = 31;
                    continue stateLoop;
                }
                case 24: {
                    this.field_f = 0;
                    this.field_c = 0;
                    this.field_g[0] = (byte) 0;
                    var2 = 0;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if ((var2 ^ -1) > -9) {
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
                    this.field_d[var2] = 0L;
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
                case 31: {
                    this.field_f = 0;
                    this.field_c = 0;
                    this.field_g[0] = (byte) 0;
                    var2 = 0;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if ((var2 ^ -1) > -9) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    return;
                }
                case 34: {
                    this.field_d[var2] = 0L;
                    var2++;
                    if (var3 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    return;
                }
                case 36: {
                    if (var3 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    return;
                }
                case 38: {
                    var2 = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if ((var2 ^ -1) > -9) {
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
                    this.field_d[var2] = 0L;
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
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(long param0, byte[] param1, int param2) {
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
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
                    var13 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 0;
                        var6 = -((int)param0 & 7) + 8 & 7;
                        var7 = this.field_f & 7;
                        var9 = param0;
                        var11 = 31;
                        var12 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var11 < 0) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var12 = var12 + ((255 & (int)var9) + (this.field_e[var11] & 255));
                        this.field_e[var11] = (byte)var12;
                        var9 = var9 >>> 8;
                        var12 = var12 >>> 8;
                        var11--;
                        if (var13 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var13 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (8L >= param0) {
                            statePc = 15;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var8 = 255 & param1[var5_int] << var6 | (param1[var5_int - -1] & 255) >>> 8 - var6;
                        stackIn_16_0 = var8;
                        stackIn_8_0 = stackIn_16_0;
                        if (var13 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 < 0) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (-257 < (var8 ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw new RuntimeException("LOGIC ERROR");
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_g[this.field_c] = (byte)qk.a((int) this.field_g[this.field_c], var8 >>> var7);
                        this.field_c = this.field_c + 1;
                        this.field_f = this.field_f + (8 - var7);
                        if (this.field_f != 512) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.c(24843);
                        this.field_c = 0;
                        this.field_f = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_g[this.field_c] = (byte)fi.a(255, var8 << -var7 + 8);
                        var5_int++;
                        this.field_f = this.field_f + var7;
                        param0 = param0 - 8L;
                        if (var13 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = ((long)param2 < param0 ? -1 : ((long)param2 == param0 ? 0 : 1));
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (stackIn_16_0 >= 0) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8 = 255 & param1[var5_int] << var6;
                        this.field_g[this.field_c] = (byte)qk.a((int) this.field_g[this.field_c], var8 >>> var7);
                        if (var13 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var8 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((param0 + (long)var7 ^ -1L) <= -9L) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        this.field_f = (int)((long)this.field_f + param0);
                        if (var13 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.field_f = this.field_f + (8 + -var7);
                        this.field_c = this.field_c + 1;
                        param0 = param0 - (long)(8 + -var7);
                        if (512 != this.field_f) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.c(24843);
                        this.field_c = 0;
                        this.field_f = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.field_g[this.field_c] = (byte)fi.a(var8 << -var7 + 8, 255);
                        this.field_f = this.field_f + (int)param0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_28_0 = (RuntimeException) (var5);
                    stackIn_27_0 = stackIn_28_0;
                    stackIn_28_1 = new StringBuilder().append("fi.B(").append(param0).append(',');
                    stackIn_27_1 = stackIn_28_1;
                    if (param1 == null) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_29_2 = "{...}";
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_29_2 = "null";
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    throw fc.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ')');
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static o[] b(int param0) {
        o[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int[] var11 = null;
        byte[] var13 = null;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = SolKnight.field_L ? 1 : 0;
                    if (param0 != 255) {
                        statePc = 14;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var1 = new o[nb.field_c];
                    var2 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (nb.field_c <= var2) {
                        statePc = 12;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var3 = uj.field_b[var2] * sa.field_l[var2];
                    var13 = jc.field_c[var2];
                    var11 = new int[var3];
                    var9 = var11;
                    var5 = var9;
                    stackIn_13_0 = 0;
                    stackIn_4_0 = stackIn_13_0;
                    if (var7 != 0) {
                        statePc = 13;
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
                    if (var3 <= var6) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var5[var6] = ig.field_H[fi.a((int) var13[var6], 255)];
                    var6++;
                    if (var7 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var7 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var1[var2] = new o(kl.field_a, we.field_e, ph.field_h[var2], qf.field_d[var2], sa.field_l[var2], uj.field_b[var2], var11);
                    var2++;
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    var1[var2] = new o(kl.field_a, we.field_e, ph.field_h[var2], qf.field_d[var2], sa.field_l[var2], uj.field_b[var2], var11);
                    var2++;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (var7 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = -97;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    og.a((byte) stackIn_13_0);
                    return var1;
                }
                case 14: {
                    return (o[]) null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    fi() {
        this.field_b = new long[8];
        this.field_e = new byte[32];
        this.field_i = new long[8];
        this.field_k = new long[8];
        this.field_g = new byte[64];
        this.field_f = 0;
        this.field_h = new long[8];
        this.field_d = new long[8];
        this.field_c = 0;
    }

    final void a(byte[] param0, int param1, byte param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        byte[] var9 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_g[this.field_c] = (byte)qk.a((int) this.field_g[this.field_c], 128 >>> fi.a(7, this.field_f));
                        this.field_c = this.field_c + 1;
                        if (param2 >= 106) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var9 = (byte[]) null;
                        this.a((byte[]) null, 111, (byte) -30);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (this.field_c > 32) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (64 <= this.field_c) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        fieldTemp$0 = this.field_c;
                        this.field_c = this.field_c + 1;
                        this.field_g[fieldTemp$0] = (byte) 0;
                        if (var8 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var8 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.c(24843);
                        this.field_c = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.c(24843);
                        this.field_c = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_c = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (this.field_c >= 32) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        fieldTemp$1 = this.field_c;
                        this.field_c = this.field_c + 1;
                        this.field_g[fieldTemp$1] = (byte) 0;
                        if (var8 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var8 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        fk.a(this.field_e, 0, this.field_g, 32, 32);
                        this.c(24843);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var4_int = 0;
                        var5 = param1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((var4_int ^ -1) <= -9) {
                            statePc = 28;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var6 = this.field_d[var4_int];
                        param0[var5] = (byte)(int)(var6 >>> -2093644040);
                        param0[1 + var5] = (byte)(int)(var6 >>> -629523920);
                        param0[2 + var5] = (byte)(int)(var6 >>> -1022155480);
                        param0[3 + var5] = (byte)(int)(var6 >>> -1125435552);
                        param0[var5 + 4] = (byte)(int)(var6 >>> -1744101736);
                        param0[5 + var5] = (byte)(int)(var6 >>> 369595344);
                        param0[6 + var5] = (byte)(int)(var6 >>> 298427400);
                        param0[var5 + 7] = (byte)(int)var6;
                        var5 += 8;
                        var4_int++;
                        if (var8 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        return;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var8 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_26_0 = (RuntimeException) (var4);
                    stackIn_25_0 = stackIn_26_0;
                    stackIn_26_1 = new StringBuilder().append("fi.H(");
                    stackIn_25_1 = stackIn_26_1;
                    if (param0 == null) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_27_2 = "{...}";
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_27_2 = "null";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    throw fc.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 28: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_j = "Unfortunately we are unable to create an account for you at this time.";
    }
}
