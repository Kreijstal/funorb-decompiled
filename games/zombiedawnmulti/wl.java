/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl {
    static int[] field_k;
    private long[] field_b;
    private int field_c;
    private byte[] field_e;
    private byte[] field_m;
    private long[] field_a;
    private long[] field_j;
    static String field_g;
    private long[] field_d;
    private long[] field_h;
    static String field_i;
    private int field_f;
    static ri field_l;

    final void b(int param0) {
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = ZombieDawnMulti.field_E ? 1 : 0;
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (32 <= var2) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_e[var2] = (byte) 0;
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
                    this.field_c = 0;
                    this.field_m[0] = (byte) 0;
                    if (param0 != 32) {
                        statePc = 14;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_f = 0;
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
                    this.field_j[var2] = 0L;
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
                    var4 = (byte[]) null;
                    this.a((byte[]) null, 76, -115);
                    this.field_f = 0;
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
                    this.field_j[var2] = 0L;
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
                    this.field_c = 0;
                    this.field_m[0] = (byte) 0;
                    if (param0 != 32) {
                        statePc = 30;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.field_f = 0;
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
                    this.field_j[var2] = 0L;
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
                    var4 = (byte[]) null;
                    this.a((byte[]) null, 76, -115);
                    this.field_f = 0;
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
                    this.field_j[var2] = 0L;
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
                    if (param0 == 32) {
                        statePc = 45;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var4 = (byte[]) null;
                    this.a((byte[]) null, 76, -115);
                    this.field_f = 0;
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
                    this.field_j[var2] = 0L;
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
                    this.field_f = 0;
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
                    this.field_j[var2] = 0L;
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

    final void a(byte[] param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        dm var9 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_m[this.field_c] = (byte)cr.b((int) this.field_m[this.field_c], 128 >>> tq.b(this.field_f, 7));
                        this.field_c = this.field_c + 1;
                        if (this.field_c > 32) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((this.field_c ^ -1) <= -65) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        fieldTemp$0 = this.field_c;
                        this.field_c = this.field_c + 1;
                        this.field_m[fieldTemp$0] = (byte) 0;
                        if (var8 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var8 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.a(param1 + -3);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_c = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((this.field_c ^ -1) <= -33) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        fieldTemp$1 = this.field_c;
                        this.field_c = this.field_c + 1;
                        this.field_m[fieldTemp$1] = (byte) 0;
                        if (var8 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 23;
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
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        d.a(this.field_e, 0, this.field_m, 32, 32);
                        this.a(-2);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4_int = 0;
                        if (param1 == 1) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9 = (dm) null;
                        wl.a(-29, (tq) null, -43, 102, (byte) 41, -126, (dm) null);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var5 = param2;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((var4_int ^ -1) <= -9) {
                            statePc = 27;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var6 = this.field_j[var4_int];
                        param0[var5] = (byte)(int)(var6 >>> -1166254472);
                        param0[1 + var5] = (byte)(int)(var6 >>> 679474672);
                        param0[2 + var5] = (byte)(int)(var6 >>> 1090002664);
                        param0[var5 + 3] = (byte)(int)(var6 >>> 1434736480);
                        param0[4 + var5] = (byte)(int)(var6 >>> 357681880);
                        param0[5 + var5] = (byte)(int)(var6 >>> -414042864);
                        param0[6 + var5] = (byte)(int)(var6 >>> 1378884168);
                        param0[var5 - -7] = (byte)(int)var6;
                        var5 += 8;
                        var4_int++;
                        if (var8 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        return;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var8 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_25_0 = (RuntimeException) (var4);
                    stackIn_24_0 = stackIn_25_0;
                    stackIn_25_1 = new StringBuilder().append("wl.E(");
                    stackIn_24_1 = stackIn_25_1;
                    if (param0 == null) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_26_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_26_2 = "{...}";
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_26_2 = "null";
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    throw fa.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 27: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        long dupTemp$2 = 0L;
        long arrayValue$3 = 0L;
        long dupTemp$4 = 0L;
        long arrayValue$5 = 0L;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_172_0 = 0;
        int stackIn_180_0 = 0;
        int stackIn_190_0 = 0;
        int stackIn_198_0 = 0;
        int stackIn_206_0 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    var2 = 0;
                    if (param0 == -2) {
                        statePc = 58;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_l = (ri) null;
                    var3 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if ((var2 ^ -1) <= -9) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.field_h[var2] = tq.a(en.a(255L, (long)this.field_m[7 + var3]), tq.a(en.a(255L, (long)this.field_m[6 + var3]) << -1875600760, tq.a(en.a(255L, (long)this.field_m[var3 - -5]) << -123496432, tq.a(tq.a(tq.a(en.a(280375465082880L, (long)this.field_m[var3 - -2] << 1214363432), tq.a((long)this.field_m[var3] << -1784848840, en.a((long)this.field_m[var3 - -1], 255L) << 389801712)), en.a((long)this.field_m[var3 - -3] << -497941920, 1095216660480L)), en.a((long)this.field_m[var3 + 4] << -1172507688, 4278190080L)))));
                    var2++;
                    var3 += 8;
                    if (var6 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var6 == 0) {
                        statePc = 2;
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
                    if (8 <= var2) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    dupTemp$0 = this.field_j[var2];
                    arrayValue$1 = this.field_h[var2];
                    this.field_d[var2] = dupTemp$0;
                    this.field_b[var2] = tq.a(arrayValue$1, dupTemp$0);
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
                    if (var2 > 10) {
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
                    if (var3 >= 8) {
                        statePc = 24;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.field_a[var3] = 0L;
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
                    if (-9 >= (var4 ^ -1)) {
                        statePc = 22;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.field_a[var3] = tq.a(this.field_a[var3], p.field_f[var4][tq.b(255, (int)(this.field_d[tq.b(7, -var4 + var3)] >>> var5))]);
                    var4++;
                    var5 -= 8;
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
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    this.field_d[var3] = this.field_a[var3];
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
                    this.field_d[0] = tq.a(this.field_d[0], p.field_d[var2]);
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    this.field_d[0] = tq.a(this.field_d[0], p.field_d[var2]);
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var3 = 0;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 42;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    this.field_a[var3] = this.field_d[var3];
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
                    this.field_a[var3] = tq.a(this.field_a[var3], p.field_f[var4][tq.b((int)(this.field_b[tq.b(7, var3 - var4)] >>> var5), 255)]);
                    var4++;
                    var5 -= 8;
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
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 48;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    this.field_b[var3] = this.field_a[var3];
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
                    if (8 > var2) {
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
                    this.field_j[var2] = tq.a(this.field_j[var2], tq.a(this.field_h[var2], this.field_b[var2]));
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
                    var3 = 0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if ((var2 ^ -1) <= -9) {
                        statePc = 114;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    this.field_h[var2] = tq.a(en.a(255L, (long)this.field_m[7 + var3]), tq.a(en.a(255L, (long)this.field_m[6 + var3]) << -1875600760, tq.a(en.a(255L, (long)this.field_m[var3 - -5]) << -123496432, tq.a(tq.a(tq.a(en.a(280375465082880L, (long)this.field_m[var3 - -2] << 1214363432), tq.a((long)this.field_m[var3] << -1784848840, en.a((long)this.field_m[var3 - -1], 255L) << 389801712)), en.a((long)this.field_m[var3 - -3] << -497941920, 1095216660480L)), en.a((long)this.field_m[var3 + 4] << -1172507688, 4278190080L)))));
                    var2++;
                    var3 += 8;
                    if (var6 != 0) {
                        statePc = 115;
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
                    var2 = 0;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    if (8 <= var2) {
                        statePc = 67;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    dupTemp$2 = this.field_j[var2];
                    arrayValue$3 = this.field_h[var2];
                    this.field_d[var2] = dupTemp$2;
                    this.field_b[var2] = tq.a(arrayValue$3, dupTemp$2);
                    var2++;
                    if (var6 != 0) {
                        statePc = 68;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (var6 == 0) {
                        statePc = 63;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var2 = 1;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (var2 > 10) {
                        statePc = 106;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    stackIn_107_0 = 0;
                    stackIn_70_0 = stackIn_107_0;
                    if (var6 != 0) {
                        statePc = 107;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var3 = stackIn_70_0;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if (var3 >= 8) {
                        statePc = 80;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    this.field_a[var3] = 0L;
                    var4 = 0;
                    stackIn_81_0 = 56;
                    stackIn_73_0 = stackIn_81_0;
                    if (var6 != 0) {
                        statePc = 81;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var5 = stackIn_73_0;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    if (-9 >= (var4 ^ -1)) {
                        statePc = 78;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    this.field_a[var3] = tq.a(this.field_a[var3], p.field_f[var4][tq.b(255, (int)(this.field_d[tq.b(7, -var4 + var3)] >>> var5))]);
                    var4++;
                    var5 -= 8;
                    if (var6 != 0) {
                        statePc = 79;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (var6 == 0) {
                        statePc = 74;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var3++;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    if (var6 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    stackIn_81_0 = 0;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    var3 = stackIn_81_0;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 86;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    this.field_d[var3] = this.field_a[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 88;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (var6 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 86: {
                    this.field_d[0] = tq.a(this.field_d[0], p.field_d[var2]);
                    statePc = 88;
                    continue stateLoop;
                }
                case 87: {
                    this.field_d[0] = tq.a(this.field_d[0], p.field_d[var2]);
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    var3 = 0;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 98;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    this.field_a[var3] = this.field_d[var3];
                    var4 = 0;
                    stackIn_99_0 = 56;
                    stackIn_91_0 = stackIn_99_0;
                    if (var6 != 0) {
                        statePc = 99;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var5 = stackIn_91_0;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    if (-9 >= (var4 ^ -1)) {
                        statePc = 96;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    this.field_a[var3] = tq.a(this.field_a[var3], p.field_f[var4][tq.b((int)(this.field_b[tq.b(7, var3 - var4)] >>> var5), 255)]);
                    var4++;
                    var5 -= 8;
                    if (var6 != 0) {
                        statePc = 97;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if (var6 == 0) {
                        statePc = 92;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    var3++;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    if (var6 == 0) {
                        statePc = 89;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    stackIn_99_0 = 0;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    var3 = stackIn_99_0;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 104;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    this.field_b[var3] = this.field_a[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 105;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (var6 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var2++;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if (var6 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    stackIn_107_0 = 0;
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    var2 = stackIn_107_0;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    if (8 > var2) {
                        statePc = 110;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    return;
                }
                case 110: {
                    this.field_j[var2] = tq.a(this.field_j[var2], tq.a(this.field_h[var2], this.field_b[var2]));
                    var2++;
                    if (var6 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    return;
                }
                case 112: {
                    if (var6 == 0) {
                        statePc = 108;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    return;
                }
                case 114: {
                    var2 = 0;
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    if (8 <= var2) {
                        statePc = 166;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    dupTemp$4 = this.field_j[var2];
                    arrayValue$5 = this.field_h[var2];
                    this.field_d[var2] = dupTemp$4;
                    this.field_b[var2] = tq.a(arrayValue$5, dupTemp$4);
                    var2++;
                    if (var6 != 0) {
                        statePc = 167;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    if (var6 == 0) {
                        statePc = 115;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    var2 = 1;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if (var2 > 10) {
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
                    if (var3 >= 8) {
                        statePc = 131;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    this.field_a[var3] = 0L;
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
                    this.field_a[var3] = tq.a(this.field_a[var3], p.field_f[var4][tq.b(255, (int)(this.field_d[tq.b(7, -var4 + var3)] >>> var5))]);
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
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 137;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    this.field_d[var3] = this.field_a[var3];
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
                    this.field_d[0] = tq.a(this.field_d[0], p.field_d[var2]);
                    statePc = 139;
                    continue stateLoop;
                }
                case 138: {
                    this.field_d[0] = tq.a(this.field_d[0], p.field_d[var2]);
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
                    this.field_a[var3] = this.field_d[var3];
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
                    if (-9 >= (var4 ^ -1)) {
                        statePc = 147;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    this.field_a[var3] = tq.a(this.field_a[var3], p.field_f[var4][tq.b((int)(this.field_b[tq.b(7, var3 - var4)] >>> var5), 255)]);
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
                    this.field_b[var3] = this.field_a[var3];
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
                    stackIn_158_0 = 0;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    var2 = stackIn_158_0;
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    if (8 > var2) {
                        statePc = 161;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    return;
                }
                case 161: {
                    this.field_j[var2] = tq.a(this.field_j[var2], tq.a(this.field_h[var2], this.field_b[var2]));
                    var2++;
                    if (var6 == 0) {
                        statePc = 163;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    return;
                }
                case 163: {
                    if (var6 == 0) {
                        statePc = 159;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    return;
                }
                case 166: {
                    var2 = 1;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    if (var2 > 10) {
                        statePc = 205;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    stackIn_206_0 = 0;
                    stackIn_169_0 = stackIn_206_0;
                    if (var6 != 0) {
                        statePc = 206;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    var3 = stackIn_169_0;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    if (var3 >= 8) {
                        statePc = 179;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    this.field_a[var3] = 0L;
                    var4 = 0;
                    stackIn_180_0 = 56;
                    stackIn_172_0 = stackIn_180_0;
                    if (var6 != 0) {
                        statePc = 180;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    var5 = stackIn_172_0;
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    if (-9 >= (var4 ^ -1)) {
                        statePc = 177;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    this.field_a[var3] = tq.a(this.field_a[var3], p.field_f[var4][tq.b(255, (int)(this.field_d[tq.b(7, -var4 + var3)] >>> var5))]);
                    var4++;
                    var5 -= 8;
                    if (var6 != 0) {
                        statePc = 178;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    if (var6 == 0) {
                        statePc = 173;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    var3++;
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    if (var6 == 0) {
                        statePc = 170;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    stackIn_180_0 = 0;
                    statePc = 180;
                    continue stateLoop;
                }
                case 180: {
                    var3 = stackIn_180_0;
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 185;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    this.field_d[var3] = this.field_a[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 187;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (var6 == 0) {
                        statePc = 181;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 185: {
                    this.field_d[0] = tq.a(this.field_d[0], p.field_d[var2]);
                    statePc = 187;
                    continue stateLoop;
                }
                case 186: {
                    this.field_d[0] = tq.a(this.field_d[0], p.field_d[var2]);
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    var3 = 0;
                    statePc = 188;
                    continue stateLoop;
                }
                case 188: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 197;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    this.field_a[var3] = this.field_d[var3];
                    var4 = 0;
                    stackIn_198_0 = 56;
                    stackIn_190_0 = stackIn_198_0;
                    if (var6 != 0) {
                        statePc = 198;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    var5 = stackIn_190_0;
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    if (-9 >= (var4 ^ -1)) {
                        statePc = 195;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    this.field_a[var3] = tq.a(this.field_a[var3], p.field_f[var4][tq.b((int)(this.field_b[tq.b(7, var3 - var4)] >>> var5), 255)]);
                    var4++;
                    var5 -= 8;
                    if (var6 != 0) {
                        statePc = 196;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    if (var6 == 0) {
                        statePc = 191;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    var3++;
                    statePc = 196;
                    continue stateLoop;
                }
                case 196: {
                    if (var6 == 0) {
                        statePc = 188;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    stackIn_198_0 = 0;
                    statePc = 198;
                    continue stateLoop;
                }
                case 198: {
                    var3 = stackIn_198_0;
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 203;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    this.field_b[var3] = this.field_a[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 204;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (var6 == 0) {
                        statePc = 199;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    var2++;
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    if (var6 == 0) {
                        statePc = 167;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    stackIn_206_0 = 0;
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    var2 = stackIn_206_0;
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    if (8 > var2) {
                        statePc = 209;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    return;
                }
                case 209: {
                    this.field_j[var2] = tq.a(this.field_j[var2], tq.a(this.field_h[var2], this.field_b[var2]));
                    var2++;
                    if (var6 == 0) {
                        statePc = 211;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    return;
                }
                case 211: {
                    if (var6 == 0) {
                        statePc = 207;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        field_l = null;
        field_k = null;
        field_g = null;
        if (!param0) {
            wl.a(true);
            field_i = null;
            return;
        }
        field_i = null;
    }

    final void a(byte[] param0, int param1, long param2) {
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
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
        int var9 = 0;
        long var10 = 0L;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = -58 / ((-10 - param1) / 50);
                        var6 = 0;
                        var7 = 8 + -((int)param2 & 7) & 7;
                        var8 = 7 & this.field_f;
                        var10 = param2;
                        var12 = 31;
                        var13 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var12 ^ -1) > -1) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var13 = var13 + ((255 & this.field_e[var12]) + (255 & (int)var10));
                        this.field_e[var12] = (byte)var13;
                        var10 = var10 >>> 8;
                        var13 = var13 >>> 8;
                        var12--;
                        if (var14 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var14 == 0) {
                            statePc = 2;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (-9L <= (param2 ^ -1L)) {
                            statePc = 16;
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
                        var9 = param0[var6] << var7 & 255 | (param0[1 + var6] & 255) >>> 8 + -var7;
                        stackIn_19_0 = 0;
                        stackIn_8_0 = stackIn_19_0;
                        stackIn_19_1 = var9;
                        stackIn_8_1 = stackIn_19_1;
                        if (var14 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 > stackIn_8_1) {
                            statePc = 11;
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
                        if (-257 < (var9 ^ -1)) {
                            statePc = 12;
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
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw new RuntimeException("LOGIC ERROR");
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_m[this.field_c] = (byte)cr.b((int) this.field_m[this.field_c], var9 >>> var8);
                        this.field_c = this.field_c + 1;
                        this.field_f = this.field_f + (-var8 + 8);
                        if (512 == this.field_f) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.a(-2);
                        this.field_f = 0;
                        this.field_c = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.field_m[this.field_c] = (byte)tq.b(var9 << 8 + -var8, 255);
                        param2 = param2 - 8L;
                        this.field_f = this.field_f + var8;
                        var6++;
                        if (var14 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((param2 ^ -1L) < -1L) {
                            statePc = 18;
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
                        var9 = 0;
                        if (var14 == 0) {
                            statePc = 20;
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
                        stackIn_19_0 = 255;
                        stackIn_19_1 = param0[var6] << var7;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9 = stackIn_19_0 & stackIn_19_1;
                        this.field_m[this.field_c] = (byte)cr.b((int) this.field_m[this.field_c], var9 >>> var8);
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
                        if (-9L >= ((long)var8 - -param2 ^ -1L)) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        this.field_f = (int)((long)this.field_f + param2);
                        if (var14 == 0) {
                            statePc = 32;
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
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        param2 = param2 - (long)(-var8 + 8);
                        this.field_c = this.field_c + 1;
                        this.field_f = this.field_f + (8 + -var8);
                        if (this.field_f == 512) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.a(-2);
                        this.field_c = 0;
                        this.field_f = 0;
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
                        this.field_m[this.field_c] = (byte)tq.b(255, var9 << -var8 + 8);
                        this.field_f = this.field_f + (int)param2;
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
                    stackIn_30_1 = new StringBuilder().append("wl.D(");
                    stackIn_29_1 = stackIn_30_1;
                    if (param0 == null) {
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
                    throw fa.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 32: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        StringBuilder discarded$0 = null;
        int var3;
        int var4;
        String var4_ref_String;
        int var5;
        String var7;
        String var8;
        int var9;
        int var10;
        int var11;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        String var18;
        String var19;
        String var27;
        String var30;
        String var31;
        String var32;
        Object var33;
        CharSequence var34;
        L0: {
          var33 = null;
          var11 = ZombieDawnMulti.field_E ? 1 : 0;
          var3 = 1;
          if (sp.field_h) {
            break L0;
          } else {
            if (lj.field_v == null) {
              var3 = 0;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (-1 != (va.field_a ^ -1)) {
            break L1;
          } else {
            if (ej.field_n != null) {
              var3 = 0;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if ((va.field_a ^ -1) != -3) {
            break L2;
          } else {
            if (!tl.d((byte) -20)) {
              var3 = 0;
              break L2;
            } else {
              break L2;
            }
          }
        }
        if (-85 != (sj.field_p ^ -1)) {
          L3: {
            if (sj.field_p == 85) {
              break L3;
            } else {
              var4 = pn.field_d;
              if (og.a((char) var4, (byte) 123)) {
                if (var3 != 0) {
                  if (80 > rm.field_a.length()) {
                    L4: {
                      L5: {
                        discarded$0 = rm.field_a.append((char) var4);
                        var5 = 485;
                        var17 = ta.field_lb;
                        var16 = nh.a(2, var17);
                        var19 = var16;
                        if (va.field_a != 2) {
                          break L5;
                        } else {
                          L6: {
                            L7: {
                              var34 = (CharSequence) ((Object) qf.field_g);
                              var18 = vl.a(v.field_c, new String[]{ld.a((byte) 0, var34)}, 2);
                              var8 = vl.a(lc.field_n, new String[]{var16}, 2);
                              var7 = var8;
                              var9 = w.field_A.a(var18);
                              var10 = w.field_A.a(var8);
                              if (var10 < var9) {
                                break L7;
                              } else {
                                var5 = var5 - var10;
                                if (var11 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var5 = var5 - var9;
                            break L6;
                          }
                          if (var11 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var7 = "";
                      if (va.field_a == 0) {
                        L8: {
                          if (null != mh.field_c) {
                            break L8;
                          } else {
                            if (!sn.field_Hb) {
                              break L8;
                            } else {
                              var7 = "[" + ne.field_vb + "] ";
                              break L8;
                            }
                          }
                        }
                        if (mh.field_c != null) {
                          L9: {
                            L10: {
                              if (!wa.field_k) {
                                var7 = "[" + vl.a(ae.field_g, new String[]{mh.field_c.field_Nb}, 2) + "] ";
                                if (var11 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              } else {
                                if (bp.field_t != null) {
                                  break L10;
                                } else {
                                  L11: {
                                    var7 = "[" + vl.a(ae.field_g, new String[]{mh.field_c.field_Nb}, 2) + "] ";
                                    if (var11 == 0) {
                                      break L11;
                                    } else {
                                      var7 = "[" + bp.field_t + "] ";
                                      break L11;
                                    }
                                  }
                                  var31 = var7 + var19 + ": ";
                                  var7 = var31;
                                  var7 = var31;
                                  var5 = var5 - w.field_A.a(var31);
                                  if (w.field_A.a(rm.field_a.toString()) > var5) {
                                    lf.a(' ', -1 + rm.field_a.length(), 0, rm.field_a);
                                    return true;
                                  } else {
                                    return true;
                                  }
                                }
                              }
                            }
                            var7 = "[" + bp.field_t + "] ";
                            break L9;
                          }
                          var32 = var7 + var19 + ": ";
                          var5 = var5 - w.field_A.a(var32);
                          break L4;
                        } else {
                          var30 = var7 + var19 + ": ";
                          var7 = var30;
                          var7 = var30;
                          var5 = var5 - w.field_A.a(var30);
                          if (w.field_A.a(rm.field_a.toString()) > var5) {
                            lf.a(' ', -1 + rm.field_a.length(), 0, rm.field_a);
                            return true;
                          } else {
                            return true;
                          }
                        }
                      } else {
                        L12: {
                          var27 = var7 + var19 + ": ";
                          var7 = var27;
                          var7 = var27;
                          var5 = var5 - w.field_A.a(var27);
                          if (w.field_A.a(rm.field_a.toString()) <= var5) {
                            break L12;
                          } else {
                            lf.a(' ', -1 + rm.field_a.length(), 0, rm.field_a);
                            break L12;
                          }
                        }
                        return true;
                      }
                    }
                    if (w.field_A.a(rm.field_a.toString()) > var5) {
                      lf.a(' ', -1 + rm.field_a.length(), 0, rm.field_a);
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                if (var11 == 0) {
                  if (param1 < 30) {
                    field_i = (String) null;
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  break L3;
                }
              }
            }
          }
          if (var3 != 0) {
            if (rm.field_a.length() <= 0) {
              return true;
            } else {
              lf.a(' ', rm.field_a.length() - 1, 0, rm.field_a);
              return true;
            }
          } else {
            return true;
          }
        } else {
          if (var3 == 0) {
            if (0 != va.field_a) {
              pf.a(48);
              if (var11 == 0) {
                return true;
              } else {
                L13: {
                  if (-1 > (rm.field_a.length() ^ -1)) {
                    L14: {
                      var4_ref_String = rm.field_a.toString();
                      if (!so.a(-115, var4_ref_String)) {
                        break L14;
                      } else {
                        var13 = (String) null;
                        var12 = (String) null;
                        vm.a((String) null, 0, (String) null, iq.field_d, 2, 0);
                        var15 = (String) null;
                        var14 = (String) null;
                        vm.a((String) null, 0, (String) null, o.field_l, 2, 0);
                        if (var11 == 0) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      var5 = va.field_a;
                      if (-1 != (var5 ^ -1)) {
                        break L15;
                      } else {
                        if (mh.field_c == null) {
                          break L15;
                        } else {
                          var5 = 1;
                          break L15;
                        }
                      }
                    }
                    L16: {
                      if (ga.a(var5, true) == 2) {
                        kp.a(var5, param2, 1, true);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    kb.a(-1, qf.field_g, param0, var4_ref_String, va.field_a, 29602);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                pf.a(64);
                return true;
              }
            } else {
              return true;
            }
          } else {
            L17: {
              if (-1 > (rm.field_a.length() ^ -1)) {
                L18: {
                  var4_ref_String = rm.field_a.toString();
                  if (!so.a(-115, var4_ref_String)) {
                    break L18;
                  } else {
                    var13 = (String) null;
                    var12 = (String) null;
                    vm.a((String) null, 0, (String) null, iq.field_d, 2, 0);
                    var15 = (String) null;
                    var14 = (String) null;
                    vm.a((String) null, 0, (String) null, o.field_l, 2, 0);
                    if (var11 == 0) {
                      break L17;
                    } else {
                      break L18;
                    }
                  }
                }
                L19: {
                  var5 = va.field_a;
                  if (-1 != (var5 ^ -1)) {
                    break L19;
                  } else {
                    if (mh.field_c == null) {
                      break L19;
                    } else {
                      var5 = 1;
                      break L19;
                    }
                  }
                }
                L20: {
                  if (ga.a(var5, true) == 2) {
                    kp.a(var5, param2, 1, true);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                kb.a(-1, qf.field_g, param0, var4_ref_String, va.field_a, 29602);
                break L17;
              } else {
                break L17;
              }
            }
            pf.a(64);
            return true;
          }
        }
    }

    final static void a(int param0, tq param1, int param2, int param3, byte param4, int param5, dm param6) {
        jb var13 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        try {
            ve.a(param6.field_ec, 196, param6.field_Lb, param1, param6.field_Jb, param6, -1, (int[]) null, -1);
            pk.field_b.a(true, (byte) -102);
            pk.field_b.a(0, (int[]) null, (byte) 13);
            pk.field_b.c(param4 ^ -42);
            if (param4 != 81) {
                wl.a(-56, -95, -27);
            }
            var13 = pk.field_b;
            var8 = param5;
            var9 = param0;
            var10 = param3;
            var11 = param2;
            var13.field_j.b(4542, var8, var11, var9, var10);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "wl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    wl() {
        this.field_b = new long[8];
        this.field_m = new byte[64];
        this.field_j = new long[8];
        this.field_d = new long[8];
        this.field_e = new byte[32];
        this.field_a = new long[8];
        this.field_f = 0;
        this.field_h = new long[8];
        this.field_c = 0;
    }

    static {
        field_g = "Powerups with this modifier can be used on enemy zombies, but can only be applied to a few - experiment with it...";
        field_i = "End of Free Game";
    }
}
