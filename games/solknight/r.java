/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    private int field_k;
    private int[] field_f;
    private int[] field_h;
    private int field_a;
    private int field_c;
    private int field_j;
    static od[] field_i;
    static nc field_b;
    static o field_d;
    static char[] field_g;
    static String field_e;

    final static wg b(int param0) {
        if (ma.field_o != el.field_p) {
          if (ma.field_o == da.field_d) {
            ma.field_o = el.field_p;
            return vb.field_j;
          } else {
            if (param0 >= 14) {
              return null;
            } else {
              field_g = (char[]) null;
              return null;
            }
          }
        } else {
          throw new IllegalStateException();
        }
    }

    private final void a(int param0) {
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
                    var5 = SolKnight.field_L ? 1 : 0;
                    fieldTemp$0 = this.field_a + 1;
                    this.field_a = this.field_a + 1;
                    this.field_j = this.field_j + fieldTemp$0;
                    if (param0 == 12009) {
                        statePc = 18;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_k = 0;
                    var2 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (-257 < (var2 ^ -1)) {
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
                    var3 = this.field_h[var2];
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
                    if (0 != (2 & var2)) {
                        statePc = 12;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (-1 == (1 & var2 ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_c = this.field_c ^ this.field_c >>> 1204613894;
                    if (var5 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_c = this.field_c ^ this.field_c << -543514227;
                    if (var5 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if ((1 & var2) != 0) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    this.field_c = this.field_c ^ this.field_c << 741576098;
                    if (var5 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    this.field_c = this.field_c ^ this.field_c >>> -1674131120;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    this.field_c = this.field_c + this.field_h[var2 + 128 & 255];
                    dupTemp$1 = this.field_j + this.field_c + this.field_h[fi.a(1020, var3) >> 249695458];
                    var4 = dupTemp$1;
                    this.field_h[var2] = dupTemp$1;
                    dupTemp$2 = this.field_h[fi.a(var4 >> 1038198280, 1020) >> -146635614] + var3;
                    this.field_j = dupTemp$2;
                    this.field_f[var2] = dupTemp$2;
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
                    if (-257 < (var2 ^ -1)) {
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
                    var3 = this.field_h[var2];
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
                    if (0 != (2 & var2)) {
                        statePc = 29;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (-1 == (1 & var2 ^ -1)) {
                        statePc = 27;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    this.field_c = this.field_c ^ this.field_c >>> 1204613894;
                    if (var5 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    this.field_c = this.field_c ^ this.field_c << -543514227;
                    if (var5 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if ((1 & var2) != 0) {
                        statePc = 32;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    this.field_c = this.field_c ^ this.field_c << 741576098;
                    if (var5 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    this.field_c = this.field_c ^ this.field_c >>> -1674131120;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    this.field_c = this.field_c + this.field_h[var2 + 128 & 255];
                    dupTemp$3 = this.field_j + this.field_c + this.field_h[fi.a(1020, var3) >> 249695458];
                    var4 = dupTemp$3;
                    this.field_h[var2] = dupTemp$3;
                    dupTemp$4 = this.field_h[fi.a(var4 >> 1038198280, 1020) >> -146635614] + var3;
                    this.field_j = dupTemp$4;
                    this.field_f[var2] = dupTemp$4;
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

    final int a(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2;
        var2 = 58 % ((66 - param0) / 35);
        if (this.field_k == 0) {
          this.a(12009);
          this.field_k = 256;
          fieldTemp$2 = this.field_k - 1;
          this.field_k = this.field_k - 1;
          return this.field_f[fieldTemp$2];
        } else {
          fieldTemp$3 = this.field_k - 1;
          this.field_k = this.field_k - 1;
          return this.field_f[fieldTemp$3];
        }
    }

    r(int[] param0) {
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
                    var3 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_h = new int[256];
                        this.field_f = new int[256];
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
                        this.field_f[var2_int] = param0[var2_int];
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
                        this.d(93);
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
                    stackIn_9_1 = new StringBuilder().append("r.<init>(");
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
                    throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static da a(int param0, int param1) {
        if (param1 <= 71) {
            return (da) null;
        }
        return ab.a(2097152, param0, 1, false, true, false);
    }

    public static void c(int param0) {
        field_g = null;
        field_d = null;
        int var1 = 121 % ((-28 - param0) / 52);
        field_b = null;
        field_e = null;
        field_i = null;
    }

    private final void d(int param0) {
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
                    var11 = SolKnight.field_L ? 1 : 0;
                    var10 = -1640531527;
                    var4 = -1640531527;
                    var8 = -1640531527;
                    var5 = -1640531527;
                    var6 = -1640531527;
                    var7 = -1640531527;
                    var3 = -1640531527;
                    var9 = -1640531527;
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((var2 ^ -1) <= -5) {
                        statePc = 21;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var3 = var3 ^ var4 << 1173189387;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -703423006;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << 1306579432;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> -1864505584;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << 1085041322;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -1705574268;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 2025044552;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> -1849570999;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    var2++;
                    if (var11 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var11 == 0) {
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
                    if (-257 >= (var2 ^ -1)) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var5 = var5 + this.field_f[var2 + 2];
                    var10 = var10 + this.field_f[var2 - -7];
                    var8 = var8 + this.field_f[var2 - -5];
                    var7 = var7 + this.field_f[var2 + 4];
                    var6 = var6 + this.field_f[var2 + 3];
                    var9 = var9 + this.field_f[6 + var2];
                    var4 = var4 + this.field_f[1 + var2];
                    var3 = var3 + this.field_f[var2];
                    var3 = var3 ^ var4 << -422290325;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> 1345224994;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << 1139981768;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -1842368240;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -327332886;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 148293348;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 2100529704;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> -817450103;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_h[var2] = var3;
                    this.field_h[1 + var2] = var4;
                    this.field_h[var2 - -2] = var5;
                    this.field_h[3 + var2] = var6;
                    this.field_h[var2 - -4] = var7;
                    this.field_h[5 + var2] = var8;
                    this.field_h[6 + var2] = var9;
                    this.field_h[7 + var2] = var10;
                    var2 += 8;
                    if (var11 != 0) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var11 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var2 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (param0 > 38) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    this.d(-101);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (256 > var2) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    this.a(12009);
                    this.field_k = 256;
                    return;
                }
                case 14: {
                    var10 = var10 + this.field_h[7 + var2];
                    var5 = var5 + this.field_h[2 + var2];
                    var4 = var4 + this.field_h[1 + var2];
                    var7 = var7 + this.field_h[4 + var2];
                    var8 = var8 + this.field_h[5 + var2];
                    var6 = var6 + this.field_h[3 + var2];
                    var3 = var3 + this.field_h[var2];
                    var9 = var9 + this.field_h[var2 - -6];
                    var3 = var3 ^ var4 << 1784184779;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> -1997580862;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << -866398008;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> 1874927984;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -1459882710;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -566889948;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 1787884008;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> -1875758071;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    this.field_h[var2] = var3;
                    this.field_h[var2 + 1] = var4;
                    this.field_h[var2 - -2] = var5;
                    this.field_h[3 + var2] = var6;
                    this.field_h[4 + var2] = var7;
                    this.field_h[5 + var2] = var8;
                    this.field_h[6 + var2] = var9;
                    this.field_h[var2 + 7] = var10;
                    var2 += 8;
                    if (var11 == 0) {
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
                    if (var11 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.a(12009);
                    this.field_k = 256;
                    return;
                }
                case 21: {
                    var2 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (-257 >= (var2 ^ -1)) {
                        statePc = 36;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var5 = var5 + this.field_f[var2 + 2];
                    var10 = var10 + this.field_f[var2 - -7];
                    var8 = var8 + this.field_f[var2 - -5];
                    var7 = var7 + this.field_f[var2 + 4];
                    var6 = var6 + this.field_f[var2 + 3];
                    var9 = var9 + this.field_f[6 + var2];
                    var4 = var4 + this.field_f[1 + var2];
                    var3 = var3 + this.field_f[var2];
                    var3 = var3 ^ var4 << -422290325;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> 1345224994;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << 1139981768;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -1842368240;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -327332886;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 148293348;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 2100529704;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> -817450103;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_h[var2] = var3;
                    this.field_h[1 + var2] = var4;
                    this.field_h[var2 - -2] = var5;
                    this.field_h[3 + var2] = var6;
                    this.field_h[var2 - -4] = var7;
                    this.field_h[5 + var2] = var8;
                    this.field_h[6 + var2] = var9;
                    this.field_h[7 + var2] = var10;
                    var2 += 8;
                    if (var11 != 0) {
                        statePc = 37;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (var11 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var2 = 0;
                    if (param0 > 38) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    this.d(-101);
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (256 > var2) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    this.a(12009);
                    this.field_k = 256;
                    return;
                }
                case 29: {
                    var10 = var10 + this.field_h[7 + var2];
                    var5 = var5 + this.field_h[2 + var2];
                    var4 = var4 + this.field_h[1 + var2];
                    var7 = var7 + this.field_h[4 + var2];
                    var8 = var8 + this.field_h[5 + var2];
                    var6 = var6 + this.field_h[3 + var2];
                    var3 = var3 + this.field_h[var2];
                    var9 = var9 + this.field_h[var2 - -6];
                    var3 = var3 ^ var4 << 1784184779;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> -1997580862;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << -866398008;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> 1874927984;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -1459882710;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -566889948;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 1787884008;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> -1875758071;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    this.field_h[var2] = var3;
                    this.field_h[var2 + 1] = var4;
                    this.field_h[var2 - -2] = var5;
                    this.field_h[3 + var2] = var6;
                    this.field_h[4 + var2] = var7;
                    this.field_h[5 + var2] = var8;
                    this.field_h[6 + var2] = var9;
                    this.field_h[var2 + 7] = var10;
                    var2 += 8;
                    if (var11 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    return;
                }
                case 31: {
                    if (var11 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    this.a(12009);
                    this.field_k = 256;
                    return;
                }
                case 36: {
                    var2 = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (param0 <= 38) {
                        statePc = 47;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (256 > var2) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    this.a(12009);
                    this.field_k = 256;
                    return;
                }
                case 40: {
                    var10 = var10 + this.field_h[7 + var2];
                    var5 = var5 + this.field_h[2 + var2];
                    var4 = var4 + this.field_h[1 + var2];
                    var7 = var7 + this.field_h[4 + var2];
                    var8 = var8 + this.field_h[5 + var2];
                    var6 = var6 + this.field_h[3 + var2];
                    var3 = var3 + this.field_h[var2];
                    var9 = var9 + this.field_h[var2 - -6];
                    var3 = var3 ^ var4 << 1784184779;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> -1997580862;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << -866398008;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> 1874927984;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -1459882710;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -566889948;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 1787884008;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> -1875758071;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    this.field_h[var2] = var3;
                    this.field_h[var2 + 1] = var4;
                    this.field_h[var2 - -2] = var5;
                    this.field_h[3 + var2] = var6;
                    this.field_h[4 + var2] = var7;
                    this.field_h[5 + var2] = var8;
                    this.field_h[6 + var2] = var9;
                    this.field_h[var2 + 7] = var10;
                    var2 += 8;
                    if (var11 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    return;
                }
                case 42: {
                    if (var11 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    this.a(12009);
                    this.field_k = 256;
                    return;
                }
                case 47: {
                    this.d(-101);
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (256 > var2) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    this.a(12009);
                    this.field_k = 256;
                    return;
                }
                case 50: {
                    var10 = var10 + this.field_h[7 + var2];
                    var5 = var5 + this.field_h[2 + var2];
                    var4 = var4 + this.field_h[1 + var2];
                    var7 = var7 + this.field_h[4 + var2];
                    var8 = var8 + this.field_h[5 + var2];
                    var6 = var6 + this.field_h[3 + var2];
                    var3 = var3 + this.field_h[var2];
                    var9 = var9 + this.field_h[var2 - -6];
                    var3 = var3 ^ var4 << 1784184779;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> -1997580862;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << -866398008;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> 1874927984;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -1459882710;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -566889948;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 1787884008;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> -1875758071;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    this.field_h[var2] = var3;
                    this.field_h[var2 + 1] = var4;
                    this.field_h[var2 - -2] = var5;
                    this.field_h[3 + var2] = var6;
                    this.field_h[4 + var2] = var7;
                    this.field_h[5 + var2] = var8;
                    this.field_h[6 + var2] = var9;
                    this.field_h[var2 + 7] = var10;
                    var2 += 8;
                    if (var11 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    return;
                }
                case 52: {
                    if (var11 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    this.a(12009);
                    this.field_k = 256;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(da param0, int param1, int param2, e param3) {
        try {
            a.field_i = param1 * l.a((byte) 96) / 1000;
            ae.a(26197, param0);
            pb.a(param0, param2 ^ -89);
            pj.a(param2 + 2, param0);
            qk.e(param2 ^ param2);
            gl.a((byte) 28);
            ad.field_h = 0 + -a.field_i;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "r.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new nc();
        field_e = "Waiting for graphics";
        field_g = new char[128];
    }
}
