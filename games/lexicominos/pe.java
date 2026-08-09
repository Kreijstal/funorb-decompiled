/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    static String field_e;
    static char field_b;
    private int field_i;
    private int field_f;
    private int[] field_g;
    private int[] field_h;
    static String field_a;
    private int field_d;
    static String field_j;
    private int field_c;

    public static void a(byte param0) {
        int var1 = -40 / ((36 - param0) / 44);
        field_j = null;
        field_e = null;
        field_a = null;
    }

    final int c(int param0) {
        if (!(this.field_d != param0)) {
            this.a(param0 ^ -2034);
            this.field_d = 256;
        }
        int fieldTemp$0 = this.field_d - 1;
        this.field_d = this.field_d - 1;
        return this.field_g[fieldTemp$0];
    }

    final static void a(int param0, int param1, int param2, le param3, int param4, db[] param5, db[] param6, int param7, le param8, int param9, int param10, int param11, int param12, int param13, boolean param14) {
        try {
            db[] var16 = (db[]) null;
            aj.a(0, param9, 0, ea.field_b, param3, g.field_n, 480, param7, ec.field_c, param8, param13, param0, param5, (db[]) null, param4, true, param12, param6, param2, param10, param1);
            if (param11 > -58) {
                field_e = (String) null;
            }
            bl.a(param14, 2);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "pe.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
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
                    var5 = Lexicominos.field_L ? 1 : 0;
                    fieldTemp$0 = this.field_i + 1;
                    this.field_i = this.field_i + 1;
                    this.field_f = this.field_f + fieldTemp$0;
                    if (param0 == -2034) {
                        statePc = 18;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_d = 0;
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
                    if ((var2 & 2) != 0) {
                        statePc = 12;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (0 == (var2 & 1)) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_c = this.field_c ^ this.field_c >>> -1807891514;
                    if (var5 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_c = this.field_c ^ this.field_c << -1151052115;
                    if (var5 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (-1 != (1 & var2 ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    this.field_c = this.field_c ^ this.field_c << 924088194;
                    if (var5 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    this.field_c = this.field_c ^ this.field_c >>> 1629135984;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    this.field_c = this.field_c + this.field_h[255 & 128 + var2];
                    dupTemp$1 = this.field_f + this.field_c + this.field_h[vg.a(1020, var3) >> -525883838];
                    var4 = dupTemp$1;
                    this.field_h[var2] = dupTemp$1;
                    dupTemp$2 = this.field_h[vg.a(255, var4 >> -261288888 >> -436990558)] - -var3;
                    this.field_f = dupTemp$2;
                    this.field_g[var2] = dupTemp$2;
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
                    if ((var2 & 2) != 0) {
                        statePc = 29;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (0 == (var2 & 1)) {
                        statePc = 27;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    this.field_c = this.field_c ^ this.field_c >>> -1807891514;
                    if (var5 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    this.field_c = this.field_c ^ this.field_c << -1151052115;
                    if (var5 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (-1 != (1 & var2 ^ -1)) {
                        statePc = 32;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    this.field_c = this.field_c ^ this.field_c << 924088194;
                    if (var5 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    this.field_c = this.field_c ^ this.field_c >>> 1629135984;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    this.field_c = this.field_c + this.field_h[255 & 128 + var2];
                    dupTemp$3 = this.field_f + this.field_c + this.field_h[vg.a(1020, var3) >> -525883838];
                    var4 = dupTemp$3;
                    this.field_h[var2] = dupTemp$3;
                    dupTemp$4 = this.field_h[vg.a(255, var4 >> -261288888 >> -436990558)] - -var3;
                    this.field_f = dupTemp$4;
                    this.field_g[var2] = dupTemp$4;
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

    private final void b(int param0) {
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
                    var11 = Lexicominos.field_L ? 1 : 0;
                    if (param0 == -24892) {
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
                    var8 = -1640531527;
                    var4 = -1640531527;
                    var3 = -1640531527;
                    var6 = -1640531527;
                    var5 = -1640531527;
                    var10 = -1640531527;
                    var9 = -1640531527;
                    var7 = -1640531527;
                    var2 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if ((var2 ^ -1) <= -5) {
                        statePc = 21;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var3 = var3 ^ var4 << -1744189045;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> 230049858;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << -1354752056;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -928714640;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << -1383598294;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -267155900;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 1211697160;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> -427202519;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    var2++;
                    if (var11 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var11 == 0) {
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
                    if (-257 >= (var2 ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var4 = var4 + this.field_g[1 + var2];
                    var3 = var3 + this.field_g[var2];
                    var10 = var10 + this.field_g[var2 + 7];
                    var6 = var6 + this.field_g[var2 - -3];
                    var9 = var9 + this.field_g[6 + var2];
                    var8 = var8 + this.field_g[var2 + 5];
                    var5 = var5 + this.field_g[2 + var2];
                    var7 = var7 + this.field_g[var2 - -4];
                    var3 = var3 ^ var4 << 1244647339;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> 2024320354;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << 852485224;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> -959607888;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << -1949847414;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 580294468;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << -730799000;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 1723287689;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_h[var2] = var3;
                    this.field_h[1 + var2] = var4;
                    this.field_h[var2 + 2] = var5;
                    this.field_h[var2 - -3] = var6;
                    this.field_h[4 + var2] = var7;
                    this.field_h[var2 + 5] = var8;
                    this.field_h[var2 + 6] = var9;
                    this.field_h[7 + var2] = var10;
                    var2 += 8;
                    if (var11 != 0) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var11 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var2 = 0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (-257 < (var2 ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    this.a(-2034);
                    this.field_d = 256;
                    return;
                }
                case 14: {
                    var9 = var9 + this.field_h[var2 - -6];
                    var8 = var8 + this.field_h[5 + var2];
                    var4 = var4 + this.field_h[var2 + 1];
                    var7 = var7 + this.field_h[var2 + 4];
                    var3 = var3 + this.field_h[var2];
                    var10 = var10 + this.field_h[7 + var2];
                    var5 = var5 + this.field_h[2 + var2];
                    var6 = var6 + this.field_h[var2 - -3];
                    var3 = var3 ^ var4 << -74087637;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -512437438;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << -933219704;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -153572816;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -626644502;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -1133152316;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 557812456;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> 2083273353;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_h[var2] = var3;
                    this.field_h[1 + var2] = var4;
                    this.field_h[var2 + 2] = var5;
                    this.field_h[var2 + 3] = var6;
                    this.field_h[4 + var2] = var7;
                    this.field_h[var2 - -5] = var8;
                    this.field_h[6 + var2] = var9;
                    this.field_h[var2 - -7] = var10;
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
                    this.a(-2034);
                    this.field_d = 256;
                    return;
                }
                case 21: {
                    var2 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (-257 >= (var2 ^ -1)) {
                        statePc = 44;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var4 = var4 + this.field_g[1 + var2];
                    var3 = var3 + this.field_g[var2];
                    var10 = var10 + this.field_g[var2 + 7];
                    var6 = var6 + this.field_g[var2 - -3];
                    var9 = var9 + this.field_g[6 + var2];
                    var8 = var8 + this.field_g[var2 + 5];
                    var5 = var5 + this.field_g[2 + var2];
                    var7 = var7 + this.field_g[var2 - -4];
                    var3 = var3 ^ var4 << 1244647339;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> 2024320354;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << 852485224;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> -959607888;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << -1949847414;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 580294468;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << -730799000;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 1723287689;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_h[var2] = var3;
                    this.field_h[1 + var2] = var4;
                    this.field_h[var2 + 2] = var5;
                    this.field_h[var2 - -3] = var6;
                    this.field_h[4 + var2] = var7;
                    this.field_h[var2 + 5] = var8;
                    this.field_h[var2 + 6] = var9;
                    this.field_h[7 + var2] = var10;
                    var2 += 8;
                    if (var11 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (-257 < (var2 ^ -1)) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    this.a(-2034);
                    this.field_d = 256;
                    return;
                }
                case 26: {
                    var9 = var9 + this.field_h[var2 - -6];
                    var8 = var8 + this.field_h[5 + var2];
                    var4 = var4 + this.field_h[var2 + 1];
                    var7 = var7 + this.field_h[var2 + 4];
                    var3 = var3 + this.field_h[var2];
                    var10 = var10 + this.field_h[7 + var2];
                    var5 = var5 + this.field_h[2 + var2];
                    var6 = var6 + this.field_h[var2 - -3];
                    var3 = var3 ^ var4 << -74087637;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -512437438;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << -933219704;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -153572816;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -626644502;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -1133152316;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 557812456;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> 2083273353;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_h[var2] = var3;
                    this.field_h[1 + var2] = var4;
                    this.field_h[var2 + 2] = var5;
                    this.field_h[var2 + 3] = var6;
                    this.field_h[4 + var2] = var7;
                    this.field_h[var2 - -5] = var8;
                    this.field_h[6 + var2] = var9;
                    this.field_h[var2 - -7] = var10;
                    var2 += 8;
                    if (var11 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    return;
                }
                case 28: {
                    if (var11 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    this.a(-2034);
                    this.field_d = 256;
                    return;
                }
                case 33: {
                    if (var11 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var2 = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (-257 < (var2 ^ -1)) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    this.a(-2034);
                    this.field_d = 256;
                    return;
                }
                case 37: {
                    var9 = var9 + this.field_h[var2 - -6];
                    var8 = var8 + this.field_h[5 + var2];
                    var4 = var4 + this.field_h[var2 + 1];
                    var7 = var7 + this.field_h[var2 + 4];
                    var3 = var3 + this.field_h[var2];
                    var10 = var10 + this.field_h[7 + var2];
                    var5 = var5 + this.field_h[2 + var2];
                    var6 = var6 + this.field_h[var2 - -3];
                    var3 = var3 ^ var4 << -74087637;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -512437438;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << -933219704;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -153572816;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -626644502;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -1133152316;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 557812456;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> 2083273353;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_h[var2] = var3;
                    this.field_h[1 + var2] = var4;
                    this.field_h[var2 + 2] = var5;
                    this.field_h[var2 + 3] = var6;
                    this.field_h[4 + var2] = var7;
                    this.field_h[var2 - -5] = var8;
                    this.field_h[6 + var2] = var9;
                    this.field_h[var2 - -7] = var10;
                    var2 += 8;
                    if (var11 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    return;
                }
                case 39: {
                    if (var11 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    this.a(-2034);
                    this.field_d = 256;
                    return;
                }
                case 44: {
                    var2 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (-257 < (var2 ^ -1)) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    this.a(-2034);
                    this.field_d = 256;
                    return;
                }
                case 47: {
                    var9 = var9 + this.field_h[var2 - -6];
                    var8 = var8 + this.field_h[5 + var2];
                    var4 = var4 + this.field_h[var2 + 1];
                    var7 = var7 + this.field_h[var2 + 4];
                    var3 = var3 + this.field_h[var2];
                    var10 = var10 + this.field_h[7 + var2];
                    var5 = var5 + this.field_h[2 + var2];
                    var6 = var6 + this.field_h[var2 - -3];
                    var3 = var3 ^ var4 << -74087637;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -512437438;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << -933219704;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> -153572816;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -626644502;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> -1133152316;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 557812456;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> 2083273353;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_h[var2] = var3;
                    this.field_h[1 + var2] = var4;
                    this.field_h[var2 + 2] = var5;
                    this.field_h[var2 + 3] = var6;
                    this.field_h[4 + var2] = var7;
                    this.field_h[var2 - -5] = var8;
                    this.field_h[6 + var2] = var9;
                    this.field_h[var2 - -7] = var10;
                    var2 += 8;
                    if (var11 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    return;
                }
                case 49: {
                    if (var11 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    this.a(-2034);
                    this.field_d = 256;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    pe(int[] param0) {
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
                    var3 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_g = new int[256];
                        this.field_h = new int[256];
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
                        this.b(-24892);
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
                    stackIn_9_1 = new StringBuilder().append("pe.<init>(");
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
                    throw ld.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_a = "Passwords must be between 5 and 20 characters long";
        field_j = "Please send me news and updates (I can unsubscribe at any time)";
        field_e = "Loading graphics";
    }
}
