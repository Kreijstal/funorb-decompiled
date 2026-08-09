/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj extends br {
    static int field_n;
    private int field_w;
    static String[] field_t;
    static String field_q;
    static String field_m;
    private uj field_g;
    private uj field_i;
    static cj field_v;
    static String field_k;
    private int field_j;
    static String field_p;
    private um[] field_u;
    static String[] field_h;
    private int field_r;
    static String field_f;
    private boolean field_o;
    private int field_l;
    static String field_s;

    final void a(int param0) {
        int statePc = 0;
        um[] var2 = null;
        int var3 = 0;
        int var5 = 0;
        um[] var6 = null;
        um var8 = null;
        um var11 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (param0 == -20587) {
                        statePc = 37;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_p = (String) null;
                    var6 = this.field_u;
                    var2 = var6;
                    var3 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (var3 < var6.length) {
                        statePc = 15;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (this.field_i == null) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (this.field_i.k()) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_i = null;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    this.field_r = this.field_r + 6;
                    if (this.field_j < this.field_r) {
                        statePc = 9;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (!this.field_o) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    fb.field_e.field_u.field_i.a((byte) 127);
                    fb.field_e.field_u.a(48);
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    this.a(true);
                    return;
                }
                case 12: {
                    this.a(true);
                    return;
                }
                case 13: {
                    return;
                }
                case 15: {
                    var8 = var6[var3];
                    var8.a(this.field_w, this.field_l, (byte) -125);
                    var3++;
                    if (var5 != 0) {
                        statePc = 30;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var5 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (this.field_i != null) {
                        statePc = 26;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    this.field_r = this.field_r + 6;
                    if (this.field_j < this.field_r) {
                        statePc = 20;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (!this.field_o) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    fb.field_e.field_u.field_i.a((byte) 127);
                    fb.field_e.field_u.a(48);
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    this.a(true);
                    return;
                }
                case 23: {
                    this.a(true);
                    return;
                }
                case 24: {
                    return;
                }
                case 26: {
                    if (this.field_i.k()) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    this.field_i = null;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    this.field_r = this.field_r + 6;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (this.field_j < this.field_r) {
                        statePc = 32;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (!this.field_o) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    fb.field_e.field_u.field_i.a((byte) 127);
                    fb.field_e.field_u.a(48);
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    this.a(true);
                    return;
                }
                case 35: {
                    this.a(true);
                    return;
                }
                case 36: {
                    return;
                }
                case 37: {
                    var6 = this.field_u;
                    var2 = var6;
                    var3 = 0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (var3 >= var6.length) {
                        statePc = 58;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var11 = var6[var3];
                    var11.a(this.field_w, this.field_l, (byte) -125);
                    var3++;
                    if (var5 != 0) {
                        statePc = 69;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (var5 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (this.field_i == null) {
                        statePc = 51;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (this.field_i.k()) {
                        statePc = 50;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    this.field_r = this.field_r + 6;
                    if (this.field_j < this.field_r) {
                        statePc = 45;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (!this.field_o) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    fb.field_e.field_u.field_i.a((byte) 127);
                    fb.field_e.field_u.a(48);
                    statePc = 48;
                    continue stateLoop;
                }
                case 47: {
                    this.a(true);
                    return;
                }
                case 48: {
                    this.a(true);
                    return;
                }
                case 49: {
                    return;
                }
                case 50: {
                    this.field_i = null;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    this.field_r = this.field_r + 6;
                    if (this.field_j < this.field_r) {
                        statePc = 53;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (!this.field_o) {
                        statePc = 55;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    fb.field_e.field_u.field_i.a((byte) 127);
                    fb.field_e.field_u.a(48);
                    statePc = 56;
                    continue stateLoop;
                }
                case 55: {
                    this.a(true);
                    return;
                }
                case 56: {
                    this.a(true);
                    return;
                }
                case 57: {
                    return;
                }
                case 58: {
                    if (this.field_i == null) {
                        statePc = 68;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (this.field_i.k()) {
                        statePc = 67;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    this.field_r = this.field_r + 6;
                    if (this.field_j < this.field_r) {
                        statePc = 62;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (!this.field_o) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    fb.field_e.field_u.field_i.a((byte) 127);
                    fb.field_e.field_u.a(48);
                    statePc = 65;
                    continue stateLoop;
                }
                case 64: {
                    this.a(true);
                    return;
                }
                case 65: {
                    this.a(true);
                    return;
                }
                case 66: {
                    return;
                }
                case 67: {
                    this.field_i = null;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    this.field_r = this.field_r + 6;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if (this.field_j < this.field_r) {
                        statePc = 71;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (!this.field_o) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    fb.field_e.field_u.field_i.a((byte) 127);
                    fb.field_e.field_u.a(48);
                    statePc = 74;
                    continue stateLoop;
                }
                case 73: {
                    this.a(true);
                    return;
                }
                case 74: {
                    this.a(true);
                    return;
                }
                case 75: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, nm param1) {
        int stackIn_5_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = param1.c(this.field_l, -20126);
                        var4 = param1.d(this.field_w, 122);
                        if (this.field_g != null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (this.field_i != null) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_5_0 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = sd.b(126, var4, var3_int);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5 = stackIn_5_0;
                        if (this.field_g != null) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (this.field_g.k()) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_g.h(var5);
                        if (var12 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_g = null;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_g = null;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (this.field_i == null) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (this.field_i.k()) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_i.h(var5);
                        if (var12 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.field_i = null;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_i = null;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var6 = (int)(15.0f * (float)this.field_r / (float)this.field_j);
                        var7 = (int)((float)this.field_r * 128.0f / (float)this.field_j);
                        var9 = 18 / ((-61 - param0) / 36);
                        if (-97 > (var7 ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_21_0 = var7;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = 288 + (-(3 * var7) + 96);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var8 = stackIn_21_0;
                        var10 = 128 + -var7 >> -91337791;
                        if (-33 > (var10 ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var10 = 32;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var11 = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (this.field_u.length / 2 <= var11) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        this.field_u[var11].a(var4, (byte) 33, td.field_c[var6], var10 / 2, var8 / 2, var3_int);
                        var11++;
                        if (var12 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var12 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var11 = this.field_u.length / 2;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (this.field_u.length <= var11) {
                            statePc = 40;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        this.field_u[var11].a(var4, (byte) 33, td.field_c[var6], var10, var8, var3_int);
                        var11++;
                        if (var12 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        return;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var12 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 36: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_38_0 = (RuntimeException) (var3);
                    stackIn_37_0 = stackIn_38_0;
                    stackIn_38_1 = new StringBuilder().append("lj.D(").append(param0).append(',');
                    stackIn_37_1 = stackIn_38_1;
                    if (param1 == null) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_39_0 = (RuntimeException) ((Object) stackIn_37_0);
                    stackIn_39_1 = (StringBuilder) ((Object) stackIn_37_1);
                    stackIn_39_2 = "{...}";
                    statePc = 39;
                    continue stateLoop;
                }
                case 38: {
                    stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                    stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                    stackIn_39_2 = "null";
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    throw fa.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
                }
                case 40: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_m = null;
        int var1 = -50 / ((-24 - param0) / 43);
        field_p = null;
        field_h = null;
        field_f = null;
        field_q = null;
        field_t = null;
        field_s = null;
        field_v = null;
    }

    final static void a(fm param0, int param1, fm param2, int param3) {
        try {
            m.field_C = param0;
            int var4_int = 43 / ((12 - param3) / 47);
            ib.field_b = param1;
            uq.field_f = param2;
            uo.a(oo.field_l / 2, oo.field_b / 2, 1633);
            ek.a(param0.field_J, param2.field_r + param2.field_J, 1829947600, param2.field_J, param0.field_r + param0.field_J);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "lj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    lj(int param0, int param1, boolean param2) {
        th discarded$0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int statePc = 0;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ZombieDawnMulti.field_E ? 1 : 0;
                    this.field_g = null;
                    this.field_o = false;
                    this.field_i = null;
                    if (fb.field_e.field_u.a(-113, param1, param0)) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    param1 = param1 - (param1 % 24 - 4);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    this.field_w = param1;
                    this.field_u = new um[150];
                    this.field_r = 0;
                    this.field_l = param0;
                    var4 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (this.field_u.length / 2 <= var4) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.field_u[var4] = new um(jm.field_n[var4] * 6.0f, jm.field_k[var4] * 6.0f);
                    var4++;
                    if (var5 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var5 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var4 = this.field_u.length / 2;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (this.field_u.length <= var4) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.field_u[var4] = new um(jm.field_n[var4 % jm.field_n.length] * 6.0f / 2.0f, jm.field_k[var4 % jm.field_k.length] * 6.0f / 2.0f);
                    var4++;
                    if (var5 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var5 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    discarded$0 = new th();
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_13_0 = this;
                    stackIn_12_0 = stackIn_13_0;
                    if (!param2) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_14_0 = this;
                    stackIn_14_1 = 90;
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    stackIn_14_0 = this;
                    stackIn_14_1 = 180;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    ((lj) (this)).field_j = stackIn_14_1;
                    this.field_g = nm.b(-127, 0);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_p = "Breaking real-world laws";
        field_q = "Make your zombies hunger for human flesh. They will lunge faster and from further away.";
        field_h = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_t = new String[16];
        field_m = "Tutorial";
        field_f = "Username: ";
        field_k = "Invite more players, or alternatively try changing the following settings:  ";
        field_s = "You must be a member to play with the current options.";
    }
}
