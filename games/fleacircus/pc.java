/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static String field_d;
    static int field_b;
    private int field_a;
    static String field_m;
    static String[] field_f;
    static int field_j;
    private int[] field_e;
    private int[] field_l;
    private int field_c;
    static byte[][][] field_h;
    static int[] field_i;
    private int field_g;
    private int field_k;

    final static void a(boolean param0, String param1, String param2) {
        try {
            af.a(param2, param0, param1, (byte) 50);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "pc.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(int param0) {
        int fieldTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int dupTemp$3 = 0;
        int dupTemp$4 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = fleas.field_A ? 1 : 0;
                    fieldTemp$0 = this.field_a + 1;
                    this.field_a = this.field_a + 1;
                    this.field_k = this.field_k + fieldTemp$0;
                    if (param0 == 2) {
                        statePc = 18;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_e = (int[]) null;
                    var2 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if ((var2 ^ -1) > -257) {
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
                    var3 = this.field_l[var2];
                    if (var5 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    if ((2 & var2) == 0) {
                        statePc = 12;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (0 != (var2 & 1)) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_g = this.field_g ^ this.field_g << -1391240510;
                    if (var5 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_g = this.field_g ^ this.field_g >>> -532527344;
                    if (var5 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (0 != (1 & var2)) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    this.field_g = this.field_g ^ this.field_g << -1837300083;
                    if (var5 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    this.field_g = this.field_g ^ this.field_g >>> -341989914;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    this.field_g = this.field_g + this.field_l[255 & var2 + 128];
                    dupTemp$1 = this.field_k + (this.field_l[sc.a(var3 >> 1698005762, 255)] + this.field_g);
                    var4 = dupTemp$1;
                    this.field_l[var2] = dupTemp$1;
                    dupTemp$2 = this.field_l[sc.a(var4 >> 1267318600 >> -587620766, 255)] + var3;
                    this.field_k = dupTemp$2;
                    this.field_e[var2] = dupTemp$2;
                    var2++;
                    if (var5 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return;
                }
                case 18: {
                    var2 = 0;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if ((var2 ^ -1) > -257) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                case 21: {
                    var3 = this.field_l[var2];
                    if (var5 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    return;
                }
                case 23: {
                    if ((2 & var2) == 0) {
                        statePc = 29;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (0 != (var2 & 1)) {
                        statePc = 27;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    this.field_g = this.field_g ^ this.field_g << -1391240510;
                    if (var5 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    this.field_g = this.field_g ^ this.field_g >>> -532527344;
                    if (var5 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (0 != (1 & var2)) {
                        statePc = 32;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    this.field_g = this.field_g ^ this.field_g << -1837300083;
                    if (var5 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    this.field_g = this.field_g ^ this.field_g >>> -341989914;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    this.field_g = this.field_g + this.field_l[255 & var2 + 128];
                    dupTemp$3 = this.field_k + (this.field_l[sc.a(var3 >> 1698005762, 255)] + this.field_g);
                    var4 = dupTemp$3;
                    this.field_l[var2] = dupTemp$3;
                    dupTemp$4 = this.field_l[sc.a(var4 >> 1267318600 >> -587620766, 255)] + var3;
                    this.field_k = dupTemp$4;
                    this.field_e[var2] = dupTemp$4;
                    var2++;
                    if (var5 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = fleas.field_A ? 1 : 0;
                    var4 = -1640531527;
                    var8 = -1640531527;
                    var7 = -1640531527;
                    var9 = -1640531527;
                    var6 = -1640531527;
                    var10 = -1640531527;
                    var3 = -1640531527;
                    var5 = -1640531527;
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (-5 >= (var2 ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var3 = var3 ^ var4 << -2015297717;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> 668902946;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << -436004888;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> 13382000;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << -1448364374;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -834576252;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 407289352;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> -1797963831;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    var2++;
                    if (var11 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var11 == 0) {
                        statePc = 1;
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
                    if (-257 >= (var2 ^ -1)) {
                        statePc = 40;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var10 = var10 + this.field_e[var2 - -7];
                    var3 = var3 + this.field_e[var2];
                    var5 = var5 + this.field_e[var2 - -2];
                    var9 = var9 + this.field_e[var2 + 6];
                    var8 = var8 + this.field_e[var2 + 5];
                    var6 = var6 + this.field_e[3 + var2];
                    var7 = var7 + this.field_e[var2 - -4];
                    var4 = var4 + this.field_e[var2 + 1];
                    var3 = var3 ^ var4 << 752481515;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> 1252690018;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << 378258120;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> 995108848;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 1868451370;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -124228988;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 1914765640;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> -1948714423;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_l[var2] = var3;
                    this.field_l[var2 + 1] = var4;
                    this.field_l[2 + var2] = var5;
                    this.field_l[var2 - -3] = var6;
                    this.field_l[4 + var2] = var7;
                    this.field_l[5 + var2] = var8;
                    this.field_l[6 + var2] = var9;
                    this.field_l[var2 - -7] = var10;
                    var2 += 8;
                    if (var11 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (256 <= var2) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var10 = var10 + this.field_l[7 + var2];
                    var6 = var6 + this.field_l[var2 - -3];
                    var9 = var9 + this.field_l[var2 + 6];
                    var8 = var8 + this.field_l[5 + var2];
                    var4 = var4 + this.field_l[1 + var2];
                    var3 = var3 + this.field_l[var2];
                    var5 = var5 + this.field_l[var2 + 2];
                    var7 = var7 + this.field_l[var2 + 4];
                    var3 = var3 ^ var4 << -1800222357;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> -1119398814;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << -2078926168;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -471242704;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << -272567606;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -1705790300;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << -1200075448;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> -1831714679;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_l[var2] = var3;
                    this.field_l[1 + var2] = var4;
                    this.field_l[var2 - -2] = var5;
                    this.field_l[3 + var2] = var6;
                    this.field_l[var2 + 4] = var7;
                    this.field_l[var2 - -5] = var8;
                    this.field_l[6 + var2] = var9;
                    this.field_l[7 + var2] = var10;
                    var2 += 8;
                    if (var11 != 0) {
                        statePc = 18;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var11 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.b(2);
                    this.field_c = 256;
                    if (param0 == -125) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    this.a(-54);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    return;
                }
                case 15: {
                    this.b(2);
                    this.field_c = 256;
                    if (param0 == -125) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.a(-54);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    return;
                }
                case 18: {
                    if (param0 != -125) {
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
                    this.a(-54);
                    return;
                }
                case 22: {
                    if (var11 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var2 = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (256 > var2) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    this.b(2);
                    this.field_c = 256;
                    if (param0 == -125) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    this.a(-54);
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    return;
                }
                case 28: {
                    var10 = var10 + this.field_l[7 + var2];
                    var6 = var6 + this.field_l[var2 - -3];
                    var9 = var9 + this.field_l[var2 + 6];
                    var8 = var8 + this.field_l[5 + var2];
                    var4 = var4 + this.field_l[1 + var2];
                    var3 = var3 + this.field_l[var2];
                    var5 = var5 + this.field_l[var2 + 2];
                    var7 = var7 + this.field_l[var2 + 4];
                    var3 = var3 ^ var4 << -1800222357;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> -1119398814;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << -2078926168;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -471242704;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << -272567606;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -1705790300;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << -1200075448;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> -1831714679;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_l[var2] = var3;
                    this.field_l[1 + var2] = var4;
                    this.field_l[var2 - -2] = var5;
                    this.field_l[3 + var2] = var6;
                    this.field_l[var2 + 4] = var7;
                    this.field_l[var2 - -5] = var8;
                    this.field_l[6 + var2] = var9;
                    this.field_l[7 + var2] = var10;
                    var2 += 8;
                    if (var11 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (param0 == -125) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    this.a(-54);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    return;
                }
                case 33: {
                    if (var11 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    this.b(2);
                    this.field_c = 256;
                    if (param0 == -125) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    this.a(-54);
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    return;
                }
                case 40: {
                    var2 = 0;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (256 <= var2) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var10 = var10 + this.field_l[7 + var2];
                    var6 = var6 + this.field_l[var2 - -3];
                    var9 = var9 + this.field_l[var2 + 6];
                    var8 = var8 + this.field_l[5 + var2];
                    var4 = var4 + this.field_l[1 + var2];
                    var3 = var3 + this.field_l[var2];
                    var5 = var5 + this.field_l[var2 + 2];
                    var7 = var7 + this.field_l[var2 + 4];
                    var3 = var3 ^ var4 << -1800222357;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> -1119398814;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << -2078926168;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -471242704;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << -272567606;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -1705790300;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << -1200075448;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> -1831714679;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_l[var2] = var3;
                    this.field_l[1 + var2] = var4;
                    this.field_l[var2 - -2] = var5;
                    this.field_l[3 + var2] = var6;
                    this.field_l[var2 + 4] = var7;
                    this.field_l[var2 - -5] = var8;
                    this.field_l[6 + var2] = var9;
                    this.field_l[7 + var2] = var10;
                    var2 += 8;
                    if (var11 != 0) {
                        statePc = 51;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (var11 == 0) {
                        statePc = 41;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 45: {
                    this.b(2);
                    this.field_c = 256;
                    if (param0 == -125) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    this.a(-54);
                    return;
                }
                case 47: {
                    return;
                }
                case 48: {
                    this.b(2);
                    this.field_c = 256;
                    if (param0 == -125) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    this.a(-54);
                    return;
                }
                case 50: {
                    return;
                }
                case 51: {
                    if (param0 == -125) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    this.a(-54);
                    return;
                }
                case 53: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(boolean param0) {
        String var2;
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        if (param0) {
          if (wi.field_b == 0) {
            if (-1 == (fleas.field_L ^ -1)) {
              if (hj.field_a[1] == 0) {
                if (-1 != (hj.field_a[0] ^ -1)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_20_0 = 1;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          var2 = (String) null;
          pc.a(false, (String) null, (String) null);
          if (wi.field_b == 0) {
            if (-1 == (fleas.field_L ^ -1)) {
              if (hj.field_a[1] == 0) {
                if (-1 != (hj.field_a[0] ^ -1)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackIn_8_0 = 1;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public static void c(int param0) {
        field_d = null;
        field_f = null;
        field_i = null;
        field_m = null;
        field_h = (byte[][][]) null;
        int var1 = -53 / ((-72 - param0) / 43);
    }

    final int a(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        if (param0 == 995108848) {
          if (this.field_c == 0) {
            this.b(2);
            this.field_c = 256;
            fieldTemp$4 = this.field_c - 1;
            this.field_c = this.field_c - 1;
            return this.field_e[fieldTemp$4];
          } else {
            fieldTemp$5 = this.field_c - 1;
            this.field_c = this.field_c - 1;
            return this.field_e[fieldTemp$5];
          }
        } else {
          field_m = (String) null;
          if (this.field_c != 0) {
            fieldTemp$6 = this.field_c - 1;
            this.field_c = this.field_c - 1;
            return this.field_e[fieldTemp$6];
          } else {
            this.b(2);
            this.field_c = 256;
            fieldTemp$7 = this.field_c - 1;
            this.field_c = this.field_c - 1;
            return this.field_e[fieldTemp$7];
          }
        }
    }

    pc(int[] param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_e = new int[256];
                        this.field_l = new int[256];
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param0.length <= var2_int) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_e[var2_int] = param0[var2_int];
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.a((byte) -125);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_9_0 = (RuntimeException) (runtimeException);
                    stackIn_8_0 = stackIn_9_0;
                    stackIn_9_1 = new StringBuilder().append("pc.<init>(");
                    stackIn_8_1 = stackIn_9_1;
                    if (param0 == null) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_10_0 = (RuntimeException) ((Object) stackIn_8_0);
                    stackIn_10_1 = (StringBuilder) ((Object) stackIn_8_1);
                    stackIn_10_2 = "{...}";
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                    stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                    stackIn_10_2 = "null";
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_m = "Create a free account to store your progress.";
        field_i = new int[8192];
        field_d = "Achievements";
    }
}
