/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o {
    static boolean field_j;
    private int[] field_c;
    private int field_f;
    static int field_b;
    static ja field_h;
    static String field_l;
    private int field_k;
    static boolean field_i;
    private int field_a;
    private int[] field_g;
    private int field_e;
    static String field_d;

    final static void d(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        kj.field_r.b(-102);
                        var1_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-33 >= (var1_int ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        dc.field_Ib[var1_int] = 0L;
                        var1_int++;
                        if (var2 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var2 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param0 == 26673) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        o.b(-5);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var1_int = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (-33 >= (var1_int ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        pj.field_K[var1_int] = 0L;
                        var1_int++;
                        if (var2 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var2 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ic.field_a = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) runtimeException), "o.F(" + param0 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void c(int param0) {
        int fieldTemp$3 = 0;
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ZombieDawnMulti.field_E ? 1 : 0;
                    fieldTemp$3 = this.field_f + 1;
                    this.field_f = this.field_f + 1;
                    this.field_e = this.field_e + fieldTemp$3;
                    var2 = 0;
                    if (param0 == 2) {
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
                    var3 = this.field_c[var2];
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
                    if ((2 & var2) != 0) {
                        statePc = 12;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if ((1 & var2) == 0) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_a = this.field_a ^ this.field_a >>> 143456070;
                    if (var5 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_a = this.field_a ^ this.field_a << 30377645;
                    if (var5 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (-1 == (var2 & 1 ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    this.field_a = this.field_a ^ this.field_a >>> -465059280;
                    if (var5 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    this.field_a = this.field_a ^ this.field_a << 1147010754;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    this.field_a = this.field_a + this.field_c[255 & var2 + 128];
                    dupTemp$4 = this.field_c[tq.b(var3 >> 2130026562, 255)] - (-this.field_a + -this.field_e);
                    var4 = dupTemp$4;
                    this.field_c[var2] = dupTemp$4;
                    dupTemp$5 = var3 + this.field_c[tq.b(var4 >> 2054902344, 1020) >> -2036713214];
                    this.field_e = dupTemp$5;
                    this.field_g[var2] = dupTemp$5;
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
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        if (param0 <= -20) {
          if (this.field_k == 0) {
            this.c(2);
            this.field_k = 256;
            fieldTemp$4 = this.field_k - 1;
            this.field_k = this.field_k - 1;
            return this.field_g[fieldTemp$4];
          } else {
            fieldTemp$5 = this.field_k - 1;
            this.field_k = this.field_k - 1;
            return this.field_g[fieldTemp$5];
          }
        } else {
          field_b = -115;
          if (this.field_k != 0) {
            fieldTemp$6 = this.field_k - 1;
            this.field_k = this.field_k - 1;
            return this.field_g[fieldTemp$6];
          } else {
            this.c(2);
            this.field_k = 256;
            fieldTemp$7 = this.field_k - 1;
            this.field_k = this.field_k - 1;
            return this.field_g[fieldTemp$7];
          }
        }
    }

    public static void b(int param0) {
        field_l = null;
        field_d = null;
        field_h = null;
        if (param0 == -13532) {
            return;
        }
        o.b(-51);
    }

    private final void a(boolean param0) {
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
                    var11 = ZombieDawnMulti.field_E ? 1 : 0;
                    var3 = -1640531527;
                    var10 = -1640531527;
                    var6 = -1640531527;
                    var7 = -1640531527;
                    var5 = -1640531527;
                    var8 = -1640531527;
                    var9 = -1640531527;
                    var4 = -1640531527;
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (4 <= var2) {
                        statePc = 19;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var3 = var3 ^ var4 << -1613804693;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> -1121109854;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << 913084296;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> -691264880;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -683511286;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -1328579900;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 688162056;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> -1655429527;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    var2++;
                    if (var11 != 0) {
                        statePc = 20;
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
                    var9 = var9 + this.field_g[var2 + 6];
                    var10 = var10 + this.field_g[7 + var2];
                    var7 = var7 + this.field_g[4 + var2];
                    var3 = var3 + this.field_g[var2];
                    var5 = var5 + this.field_g[var2 + 2];
                    var8 = var8 + this.field_g[5 + var2];
                    var4 = var4 + this.field_g[1 + var2];
                    var6 = var6 + this.field_g[3 + var2];
                    var3 = var3 ^ var4 << 1979023147;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> -1830220158;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << 664497352;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -1421901168;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 1588423242;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 391159908;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 302716168;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> -1688836407;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_c[var2] = var3;
                    this.field_c[1 + var2] = var4;
                    this.field_c[2 + var2] = var5;
                    this.field_c[3 + var2] = var6;
                    this.field_c[var2 + 4] = var7;
                    this.field_c[5 + var2] = var8;
                    this.field_c[6 + var2] = var9;
                    this.field_c[var2 + 7] = var10;
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
                    if (var2 >= 256) {
                        statePc = 15;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var9 = var9 + this.field_c[var2 + 6];
                    var5 = var5 + this.field_c[2 + var2];
                    var6 = var6 + this.field_c[3 + var2];
                    var4 = var4 + this.field_c[1 + var2];
                    var3 = var3 + this.field_c[var2];
                    var8 = var8 + this.field_c[5 + var2];
                    var10 = var10 + this.field_c[7 + var2];
                    var7 = var7 + this.field_c[4 + var2];
                    var3 = var3 ^ var4 << 912764459;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> -1922193342;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << 689781704;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> 136627088;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -215086742;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -1417220188;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << -1419521080;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> -2047021143;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    this.field_c[var2] = var3;
                    this.field_c[var2 - -1] = var4;
                    this.field_c[2 + var2] = var5;
                    this.field_c[var2 - -3] = var6;
                    this.field_c[var2 + 4] = var7;
                    this.field_c[var2 - -5] = var8;
                    this.field_c[var2 - -6] = var9;
                    this.field_c[7 + var2] = var10;
                    var2 += 8;
                    if (var11 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                case 13: {
                    if (var11 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (!param0) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.c(104);
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    this.c(2);
                    this.field_k = 256;
                    return;
                }
                case 18: {
                    this.c(2);
                    this.field_k = 256;
                    return;
                }
                case 19: {
                    var2 = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (-257 >= (var2 ^ -1)) {
                        statePc = 37;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var9 = var9 + this.field_g[var2 + 6];
                    var10 = var10 + this.field_g[7 + var2];
                    var7 = var7 + this.field_g[4 + var2];
                    var3 = var3 + this.field_g[var2];
                    var5 = var5 + this.field_g[var2 + 2];
                    var8 = var8 + this.field_g[5 + var2];
                    var4 = var4 + this.field_g[1 + var2];
                    var6 = var6 + this.field_g[3 + var2];
                    var3 = var3 ^ var4 << 1979023147;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> -1830220158;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << 664497352;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -1421901168;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 1588423242;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 391159908;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 302716168;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> -1688836407;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_c[var2] = var3;
                    this.field_c[1 + var2] = var4;
                    this.field_c[2 + var2] = var5;
                    this.field_c[3 + var2] = var6;
                    this.field_c[var2 + 4] = var7;
                    this.field_c[5 + var2] = var8;
                    this.field_c[6 + var2] = var9;
                    this.field_c[var2 + 7] = var10;
                    var2 += 8;
                    if (var11 != 0) {
                        statePc = 38;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (var11 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var2 = 0;
                    statePc = 54;
                    continue stateLoop;
                }
                case 25: {
                    if (!param0) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    this.c(104);
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    this.c(2);
                    this.field_k = 256;
                    return;
                }
                case 28: {
                    this.c(2);
                    this.field_k = 256;
                    return;
                }
                case 31: {
                    return;
                }
                case 33: {
                    if (!param0) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    this.c(104);
                    statePc = 36;
                    continue stateLoop;
                }
                case 35: {
                    this.c(2);
                    this.field_k = 256;
                    return;
                }
                case 36: {
                    this.c(2);
                    this.field_k = 256;
                    return;
                }
                case 37: {
                    var2 = 0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (var2 >= 256) {
                        statePc = 46;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var9 = var9 + this.field_c[var2 + 6];
                    var5 = var5 + this.field_c[2 + var2];
                    var6 = var6 + this.field_c[3 + var2];
                    var4 = var4 + this.field_c[1 + var2];
                    var3 = var3 + this.field_c[var2];
                    var8 = var8 + this.field_c[5 + var2];
                    var10 = var10 + this.field_c[7 + var2];
                    var7 = var7 + this.field_c[4 + var2];
                    var3 = var3 ^ var4 << 912764459;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> -1922193342;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << 689781704;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> 136627088;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -215086742;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -1417220188;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << -1419521080;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> -2047021143;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    this.field_c[var2] = var3;
                    this.field_c[var2 - -1] = var4;
                    this.field_c[2 + var2] = var5;
                    this.field_c[var2 - -3] = var6;
                    this.field_c[var2 + 4] = var7;
                    this.field_c[var2 - -5] = var8;
                    this.field_c[var2 - -6] = var9;
                    this.field_c[7 + var2] = var10;
                    var2 += 8;
                    if (var11 == 0) {
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
                    if (var11 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (!param0) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    this.c(104);
                    statePc = 45;
                    continue stateLoop;
                }
                case 44: {
                    this.c(2);
                    this.field_k = 256;
                    return;
                }
                case 45: {
                    this.c(2);
                    this.field_k = 256;
                    return;
                }
                case 46: {
                    if (!param0) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    this.c(104);
                    statePc = 49;
                    continue stateLoop;
                }
                case 48: {
                    this.c(2);
                    this.field_k = 256;
                    return;
                }
                case 49: {
                    this.c(2);
                    this.field_k = 256;
                    return;
                }
                case 50: {
                    if (var11 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var9 = var9 + this.field_c[var2 + 6];
                    var5 = var5 + this.field_c[2 + var2];
                    var6 = var6 + this.field_c[3 + var2];
                    var4 = var4 + this.field_c[1 + var2];
                    var3 = var3 + this.field_c[var2];
                    var8 = var8 + this.field_c[5 + var2];
                    var10 = var10 + this.field_c[7 + var2];
                    var7 = var7 + this.field_c[4 + var2];
                    var3 = var3 ^ var4 << 912764459;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> -1922193342;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << 689781704;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> 136627088;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -215086742;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -1417220188;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << -1419521080;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> -2047021143;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    this.field_c[var2] = var3;
                    this.field_c[var2 - -1] = var4;
                    this.field_c[2 + var2] = var5;
                    this.field_c[var2 - -3] = var6;
                    this.field_c[var2 + 4] = var7;
                    this.field_c[var2 - -5] = var8;
                    this.field_c[var2 - -6] = var9;
                    this.field_c[7 + var2] = var10;
                    var2 += 8;
                    if (var11 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (var2 < 256) {
                        statePc = 52;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    o(int[] param0) {
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
                    var3 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_c = new int[256];
                        this.field_g = new int[256];
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
                        if (var2_int >= param0.length) {
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
                        this.field_g[var2_int] = param0[var2_int];
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
                        this.a(false);
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
                    stackIn_9_1 = new StringBuilder().append("o.<init>(");
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
                    throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(u param0, int param1, int param2) {
        ga var3 = ma.field_a;
        var3.b((byte) -35, param1);
        var3.a(-54, 2);
        if (param2 >= -69) {
            return;
        }
        try {
            var3.a(125, 0);
            var3.a(-55, param0.field_g);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "o.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_l = "If you are not, please change your password to something more obscure!";
        field_i = true;
        field_d = "Type your email address again to make sure it's correct";
    }
}
