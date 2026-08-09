/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    private int field_c;
    im field_h;
    int field_t;
    kd field_f;
    int field_m;
    int field_g;
    boolean field_k;
    int field_u;
    im field_o;
    int field_s;
    im field_r;
    int field_x;
    boolean field_a;
    private int field_d;
    int field_y;
    private int field_q;
    static hj[] field_w;
    int field_p;
    lb[] field_e;
    im field_b;
    int field_i;
    private boolean field_n;
    int field_l;
    private int field_v;
    static boolean field_j;

    final void a(int param0, int param1, byte param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var5 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == -38) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_u = -105;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var5_int = param1 - param0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = var5_int ^ -1;
                        stackIn_6_1 = param0 + param1 ^ -1;
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
                        if (stackIn_6_0 < stackIn_6_1) {
                            statePc = 27;
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
                        if (var7 != 0) {
                            statePc = 27;
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
                        var6 = param3 - param0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((param0 + param3 ^ -1) > (var6 ^ -1)) {
                            statePc = 24;
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
                        stackIn_6_0 = 0;
                        stackIn_11_0 = stackIn_6_0;
                        stackIn_6_1 = var5_int;
                        stackIn_11_1 = stackIn_6_1;
                        if (var7 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 > stackIn_11_1) {
                            statePc = 23;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var5_int >= this.field_f.field_c) {
                            statePc = 23;
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
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var6 < 0) {
                            statePc = 23;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var6 >= this.field_f.field_t) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        this.field_h.a(-81, new me((double)param1, (double)param3, (double)(-param1 + var5_int) * 0.05, (double)(var6 + -param3) * 0.05, 1));
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var6++;
                        if (var7 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5_int++;
                        if (var7 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) var5), "f.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 27: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0, int param1) {
        try {
            this.field_k = true;
            if (param0) {
                f.a(-16, (ha) null, (byte) 46);
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "f.O(" + param0 + ',' + param1 + ')');
        }
    }

    final static int c(byte param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 8) {
                break L1;
              } else {
                f.a((java.applet.Applet) null, (java.net.URL) null, 96);
                break L1;
              }
            }
            stackIn_4_0 = ji.field_c;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "f.A(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void b(byte param0) {
        lb dupTemp$0 = null;
        lb dupTemp$1 = null;
        lb dupTemp$2 = null;
        int stackIn_278_0 = 0;
        int stackIn_278_1 = 0;
        int stackIn_354_0 = 0;
        int stackIn_354_1 = 0;
        ca stackIn_397_0 = null;
        ca stackIn_399_0 = null;
        ca stackIn_399_1 = null;
        ca stackIn_401_0 = null;
        ca stackIn_401_1 = null;
        ca stackIn_421_0 = null;
        int stackIn_431_0 = 0;
        int stackIn_431_1 = 0;
        int stackIn_448_0 = 0;
        int stackIn_457_0 = 0;
        int stackIn_469_0 = 0;
        int stackIn_469_1 = 0;
        int stackIn_476_0 = 0;
        int stackIn_476_1 = 0;
        int stackIn_485_0 = 0;
        int stackIn_485_1 = 0;
        int stackIn_491_0 = 0;
        int stackIn_491_1 = 0;
        pd stackIn_497_0 = null;
        int stackIn_507_0 = 0;
        int stackIn_507_1 = 0;
        int stackIn_521_0 = 0;
        int stackIn_521_1 = 0;
        Object stackIn_527_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        pd stackOut_496_0;
        int statePc = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ca var3_ref_ca = null;
        oj var3_ref_oj = null;
        int var4 = 0;
        pd var4_ref_pd = null;
        int var5_int = 0;
        pd var5 = null;
        kb var5_ref = null;
        oj var5_ref2 = null;
        int var6 = 0;
        int var7_int = 0;
        pd var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        pd var11 = null;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (!this.field_k) {
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
                    if ((this.field_f.field_k ^ -1) == -1) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.a(false, -1);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    this.field_i = this.field_i + 1;
                    if (-1 != (this.field_x % 11 ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (this.field_r.c(-3088)) {
                        statePc = 16;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (-1 <= (this.field_x ^ -1)) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    this.field_g = this.field_i - -500;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (this.field_y <= 0) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.field_y = this.field_y - 1;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (this.field_f.field_n >= 0) {
                        statePc = 22;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    this.field_f.field_n = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (this.field_k) {
                        statePc = 50;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (99 != this.field_x) {
                        statePc = 50;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (this.field_r.c(-3088)) {
                        statePc = 31;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (0 >= this.field_e[0].field_f) {
                        statePc = 48;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if ((this.field_m ^ -1) == -1) {
                        statePc = 37;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 37: {
                    this.field_d = this.field_d + 1;
                    if (1 == this.field_d) {
                        statePc = 40;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 40: {
                    f.a(13, 242, (byte) -25);
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (this.field_d == 3) {
                        statePc = 44;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 44: {
                    f.a(14, 241, (byte) -25);
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (this.field_d != 9) {
                        statePc = 48;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    f.a(15, 240, (byte) -25);
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    nh.field_b = nh.field_b + this.field_e[0].field_f;
                    dupTemp$0 = this.field_e[0];
                    dupTemp$0.field_d = dupTemp$0.field_d + this.field_e[0].field_f;
                    this.field_e[0].field_f = 0;
                    this.a(false, 0);
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    return;
                }
                case 50: {
                    if (-2 == (this.field_m ^ -1)) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (2 != this.field_m) {
                        statePc = 59;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if ((this.field_e[0].field_d ^ -1) > -1000001) {
                        statePc = 59;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    f.a(3, 252, (byte) -25);
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if (-5 == (this.field_m ^ -1)) {
                        statePc = 63;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if ((this.field_m ^ -1) != -6) {
                        statePc = 69;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (this.field_e[0].field_d >= 1000000) {
                        statePc = 68;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 68: {
                    f.a(21, 234, (byte) -25);
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    this.field_f.a((byte) 100);
                    if (this.field_f.field_r.b(0)) {
                        statePc = 76;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var2_int = 0;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if (this.field_f.field_r.field_e <= var2_int) {
                        statePc = 76;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var3 = this.field_f.field_r.field_g[var2_int].field_a;
                    this.field_f.field_a[var3] = 25;
                    var2_int++;
                    if (var12 != 0) {
                        statePc = 391;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (var12 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (this.field_k) {
                        statePc = 391;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if ((this.field_i ^ -1) > (this.field_g ^ -1)) {
                        statePc = 391;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (99 <= this.field_x) {
                        statePc = 391;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if ((this.field_x % 11 ^ -1) != -1) {
                        statePc = 89;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (!this.field_r.c(param0 + -3186)) {
                        statePc = 391;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    this.field_v = (this.field_f.field_k * 2 + 200) * (this.field_x + 1) / 99;
                    if (3 == this.field_m) {
                        statePc = 95;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if ((this.field_m ^ -1) != -6) {
                        statePc = 97;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    this.field_v = (1 + this.field_x) * 500 / 99;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    this.field_c = 50;
                    if ((this.field_x ^ -1) == -1) {
                        statePc = 100;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 100: {
                    this.field_c = 20;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    if (1 == this.field_x) {
                        statePc = 104;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 104: {
                    this.field_c = 30;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if ((this.field_x ^ -1) != -3) {
                        statePc = 108;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    this.field_c = 40;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    if (-4 != (this.field_x ^ -1)) {
                        statePc = 111;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    this.field_c = 45;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    this.field_c = this.field_c + this.field_x / 11 * 2;
                    if (this.field_m == 1) {
                        statePc = 117;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    if (this.field_m == 2) {
                        statePc = 117;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 117: {
                    this.field_c = this.field_c - 10;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    if ((this.field_m ^ -1) != -4) {
                        statePc = 121;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    this.field_c = this.field_c * 2;
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    var2_int = this.field_c;
                    var3 = 0;
                    var4 = 0;
                    var3 = jc.field_f[this.field_m][this.field_x];
                    if (1 != var3) {
                        statePc = 123;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var2_int = var2_int * 3;
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    if (2 != var3) {
                        statePc = 125;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    var2_int = var2_int * 2 / 3;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    if (var3 == 3) {
                        statePc = 128;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 128: {
                    var2_int = 2 * var2_int / 3;
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    if (var3 == 4) {
                        statePc = 132;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 132: {
                    var2_int = var2_int * 2 / 3;
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if (-6 != (var3 ^ -1)) {
                        statePc = 135;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    var2_int = var2_int * 2 / 3;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    if (6 != var3) {
                        statePc = 137;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var2_int = var2_int * 2 / 3;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    if (7 != var3) {
                        statePc = 139;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var2_int = var2_int * 2 / 3;
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    if ((var3 ^ -1) == -10) {
                        statePc = 142;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var2_int = var2_int * 2 / 3;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if (10 != var3) {
                        statePc = 145;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var2_int = var2_int / 8;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    if (-11 != (this.field_x % 11 ^ -1)) {
                        statePc = 155;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    if (0 < this.field_x) {
                        statePc = 151;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 151: {
                    var2_int = 1;
                    var4 = 1;
                    gk.a(mh.field_a[var3 + 31], (byte) -11);
                    if ((var3 ^ -1) == -2) {
                        statePc = 154;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 154: {
                    var2_int = 4;
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    if (0 != this.field_x % 11) {
                        statePc = 185;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    if ((this.field_x ^ -1) < -1) {
                        statePc = 161;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 161: {
                    if (this.field_e[0].field_f <= 0) {
                        statePc = 174;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    if (this.field_m != 0) {
                        statePc = 174;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    this.field_d = this.field_d + 1;
                    if (-2 != (this.field_d ^ -1)) {
                        statePc = 170;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    f.a(13, 242, (byte) -25);
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    if (3 == this.field_d) {
                        statePc = 173;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 173: {
                    f.a(14, 241, (byte) -25);
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    if (!ok.a(0, false)) {
                        statePc = 184;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    if ((this.field_e[0].field_f ^ -1) >= -1) {
                        statePc = 184;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    if (jc.field_f[this.field_m][-1 + this.field_x] == 7) {
                        statePc = 183;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 183: {
                    f.a(23, 232, (byte) -25);
                    statePc = 184;
                    continue stateLoop;
                }
                case 184: {
                    df.field_g = df.field_g + this.field_e[0].field_f * 2;
                    nh.field_b = nh.field_b + this.field_e[0].field_f;
                    dupTemp$1 = this.field_e[0];
                    dupTemp$1.field_d = dupTemp$1.field_d + this.field_e[0].field_f;
                    this.field_e[0].field_f = 0;
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    if (1 == this.field_x) {
                        statePc = 188;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 188: {
                    this.field_v = this.field_v + 4;
                    statePc = 189;
                    continue stateLoop;
                }
                case 189: {
                    if (2 == this.field_x) {
                        statePc = 192;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 192: {
                    this.field_v = this.field_v + 4;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if (3 == this.field_x) {
                        statePc = 196;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 196: {
                    this.field_v = this.field_v + 4;
                    statePc = 197;
                    continue stateLoop;
                }
                case 197: {
                    if (-34 != (this.field_x ^ -1)) {
                        statePc = 204;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if ((this.field_f.field_k ^ -1) == -26) {
                        statePc = 203;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 203: {
                    this.field_n = true;
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    if ((this.field_x ^ -1) != -34) {
                        statePc = 210;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    if ((this.field_f.field_k ^ -1) != -126) {
                        statePc = 210;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    this.field_a = true;
                    statePc = 210;
                    continue stateLoop;
                }
                case 210: {
                    if (this.field_x != 33) {
                        statePc = 216;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    if ((this.field_m ^ -1) != -1) {
                        statePc = 216;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    f.a(1, 254, (byte) -25);
                    statePc = 216;
                    continue stateLoop;
                }
                case 216: {
                    if (66 != this.field_x) {
                        statePc = 222;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    if (-1 != (this.field_m ^ -1)) {
                        statePc = 222;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    f.a(2, 253, (byte) -25);
                    statePc = 222;
                    continue stateLoop;
                }
                case 222: {
                    if (66 != this.field_x) {
                        statePc = 231;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    if (1 == this.field_m) {
                        statePc = 229;
                    } else {
                        statePc = 226;
                    }
                    continue stateLoop;
                }
                case 226: {
                    if ((this.field_m ^ -1) != -3) {
                        statePc = 231;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    f.a(22, 233, (byte) -25);
                    statePc = 231;
                    continue stateLoop;
                }
                case 231: {
                    if (this.field_x != 66) {
                        statePc = 240;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    if (75 > this.field_f.field_k) {
                        statePc = 240;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    if (-1 != (this.field_m ^ -1)) {
                        statePc = 240;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    f.a(4, 251, (byte) -25);
                    statePc = 240;
                    continue stateLoop;
                }
                case 240: {
                    if (this.field_x != 66) {
                        statePc = 250;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    if (-126 < (this.field_f.field_k ^ -1)) {
                        statePc = 250;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    if (0 == this.field_m) {
                        statePc = 249;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 249: {
                    f.a(5, 250, (byte) -25);
                    statePc = 250;
                    continue stateLoop;
                }
                case 250: {
                    if (66 != this.field_x) {
                        statePc = 259;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    if (!this.field_n) {
                        statePc = 259;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    if (this.field_m != 0) {
                        statePc = 259;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    f.a(0, 255, (byte) -25);
                    statePc = 259;
                    continue stateLoop;
                }
                case 259: {
                    this.field_x = this.field_x + 1;
                    this.field_y = 50;
                    if ((this.field_x ^ -1) > -23) {
                        statePc = 263;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    this.field_v = this.field_v + 2;
                    if (var12 == 0) {
                        statePc = 265;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    this.field_v = this.field_v + (1 + this.field_x / 11);
                    statePc = 265;
                    continue stateLoop;
                }
                case 265: {
                    this.field_f.field_n = 1;
                    if (-25 == (this.field_x % 25 ^ -1)) {
                        statePc = 268;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 268: {
                    var5_int = 0;
                    statePc = 269;
                    continue stateLoop;
                }
                case 269: {
                    if (this.field_f.field_i <= var5_int) {
                        statePc = 274;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 270: {
                    this.field_f.field_v[var5_int] = 0;
                    var5_int++;
                    if (var12 != 0) {
                        statePc = 275;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    if (var12 == 0) {
                        statePc = 269;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    var5_int = this.field_f.field_s.length;
                    statePc = 275;
                    continue stateLoop;
                }
                case 275: {
                    var6 = 0;
                    var7_int = 0;
                    statePc = 276;
                    continue stateLoop;
                }
                case 276: {
                    if ((var2_int ^ -1) >= (var7_int ^ -1)) {
                        statePc = 353;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    var6++;
                    stackIn_354_0 = var6 ^ -1;
                    stackIn_278_0 = stackIn_354_0;
                    stackIn_354_1 = this.field_q ^ -1;
                    stackIn_278_1 = stackIn_354_1;
                    if (var12 != 0) {
                        statePc = 354;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    if (stackIn_278_0 > stackIn_278_1) {
                        statePc = 284;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    if (var3 != 1) {
                        statePc = 290;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    if (-3 < (var6 ^ -1)) {
                        statePc = 291;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    if (var4 != 0) {
                        statePc = 291;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 290: {
                    var6 = 0;
                    statePc = 291;
                    continue stateLoop;
                }
                case 291: {
                    var8 = this.field_f.field_s[(this.field_x + var6 + -1) % var5_int];
                    var9 = var8 % this.field_f.field_c;
                    if (var4 == 0) {
                        statePc = 298;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    if (var3 == 10) {
                        statePc = 297;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 297: {
                    this.field_v = this.field_v / 4;
                    statePc = 298;
                    continue stateLoop;
                }
                case 298: {
                    var10 = var8 / this.field_f.field_c;
                    var11 = new pd(var9, var10, (f) (this), var3, this.field_v);
                    this.field_r.a(param0 ^ -22, var11);
                    var11.field_m = 9 * var7_int;
                    var11.field_n = var4 != 0;
                    if (0 == this.field_x) {
                        statePc = 301;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 301: {
                    var11.field_m = 20 * var7_int;
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    if (-2 == (this.field_x ^ -1)) {
                        statePc = 305;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 305: {
                    var11.field_m = var7_int * 19;
                    statePc = 306;
                    continue stateLoop;
                }
                case 306: {
                    if (2 != this.field_x) {
                        statePc = 309;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    var11.field_m = 18 * var7_int;
                    statePc = 309;
                    continue stateLoop;
                }
                case 309: {
                    if ((this.field_x ^ -1) == -4) {
                        statePc = 312;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 312: {
                    var11.field_m = 17 * var7_int;
                    statePc = 313;
                    continue stateLoop;
                }
                case 313: {
                    if (-5 != (this.field_x ^ -1)) {
                        statePc = 316;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 314: {
                    var11.field_m = 16 * var7_int;
                    statePc = 316;
                    continue stateLoop;
                }
                case 316: {
                    if (-6 != (this.field_x ^ -1)) {
                        statePc = 319;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    var11.field_m = var7_int * 15;
                    statePc = 319;
                    continue stateLoop;
                }
                case 319: {
                    if ((this.field_x ^ -1) != -7) {
                        statePc = 322;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 320: {
                    var11.field_m = var7_int * 14;
                    statePc = 322;
                    continue stateLoop;
                }
                case 322: {
                    if (-8 != (this.field_x ^ -1)) {
                        statePc = 325;
                    } else {
                        statePc = 323;
                    }
                    continue stateLoop;
                }
                case 323: {
                    var11.field_m = 13 * var7_int;
                    statePc = 325;
                    continue stateLoop;
                }
                case 325: {
                    if (8 != this.field_x) {
                        statePc = 328;
                    } else {
                        statePc = 326;
                    }
                    continue stateLoop;
                }
                case 326: {
                    var11.field_m = 12 * var7_int;
                    statePc = 328;
                    continue stateLoop;
                }
                case 328: {
                    if ((this.field_x ^ -1) == -10) {
                        statePc = 331;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 331: {
                    var11.field_m = 11 * var7_int;
                    statePc = 332;
                    continue stateLoop;
                }
                case 332: {
                    if ((this.field_x ^ -1) != -11) {
                        statePc = 335;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 333: {
                    var11.field_m = var7_int * 10;
                    statePc = 335;
                    continue stateLoop;
                }
                case 335: {
                    if (-2 == (var11.field_y ^ -1)) {
                        statePc = 338;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 338: {
                    var11.field_m = var11.field_m / 2;
                    statePc = 339;
                    continue stateLoop;
                }
                case 339: {
                    if (var4 == 0) {
                        statePc = 343;
                    } else {
                        statePc = 340;
                    }
                    continue stateLoop;
                }
                case 340: {
                    var11.field_o = var11.field_o * this.field_c;
                    var11.field_l = var11.field_o;
                    dupTemp$2 = this.field_e[0];
                    dupTemp$2.field_f = dupTemp$2.field_f + (1000 + this.field_x / 11 * 1000) / var2_int;
                    if (var12 == 0) {
                        statePc = 348;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 343: {
                    if (25 >= this.field_x) {
                        statePc = 348;
                    } else {
                        statePc = 346;
                    }
                    continue stateLoop;
                }
                case 346: {
                    var11.field_o = this.field_x * var11.field_o / 25;
                    var11.field_l = var11.field_o;
                    statePc = 348;
                    continue stateLoop;
                }
                case 348: {
                    if (var11.field_y == 10) {
                        statePc = 351;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 351: {
                    var11.field_m = var11.field_m * 4;
                    statePc = 352;
                    continue stateLoop;
                }
                case 352: {
                    var7_int++;
                    if (var12 == 0) {
                        statePc = 276;
                    } else {
                        statePc = 353;
                    }
                    continue stateLoop;
                }
                case 353: {
                    this.field_c = this.field_c + 10;
                    var2_int = 1500;
                    stackIn_354_0 = this.field_x;
                    stackIn_354_1 = 11;
                    statePc = 354;
                    continue stateLoop;
                }
                case 354: {
                    if (stackIn_354_0 > stackIn_354_1) {
                        statePc = 356;
                    } else {
                        statePc = 357;
                    }
                    continue stateLoop;
                }
                case 356: {
                    var2_int = 1450;
                    statePc = 357;
                    continue stateLoop;
                }
                case 357: {
                    if ((this.field_x ^ -1) >= -23) {
                        statePc = 359;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 358: {
                    var2_int = 1400;
                    statePc = 359;
                    continue stateLoop;
                }
                case 359: {
                    if (33 >= this.field_x) {
                        statePc = 361;
                    } else {
                        statePc = 360;
                    }
                    continue stateLoop;
                }
                case 360: {
                    var2_int = 1350;
                    statePc = 361;
                    continue stateLoop;
                }
                case 361: {
                    if (44 < this.field_x) {
                        statePc = 364;
                    } else {
                        statePc = 365;
                    }
                    continue stateLoop;
                }
                case 364: {
                    var2_int = 1300;
                    statePc = 365;
                    continue stateLoop;
                }
                case 365: {
                    if ((this.field_x ^ -1) < -56) {
                        statePc = 368;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 368: {
                    var2_int = 1250;
                    statePc = 369;
                    continue stateLoop;
                }
                case 369: {
                    if (-67 <= (this.field_x ^ -1)) {
                        statePc = 371;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 370: {
                    var2_int = 1200;
                    statePc = 371;
                    continue stateLoop;
                }
                case 371: {
                    if (-89 > (this.field_x ^ -1)) {
                        statePc = 374;
                    } else {
                        statePc = 375;
                    }
                    continue stateLoop;
                }
                case 374: {
                    var2_int = 1150;
                    statePc = 375;
                    continue stateLoop;
                }
                case 375: {
                    if (-100 >= (this.field_x ^ -1)) {
                        statePc = 385;
                    } else {
                        statePc = 376;
                    }
                    continue stateLoop;
                }
                case 376: {
                    if (-1 != (jc.field_f[this.field_m][this.field_x] ^ -1)) {
                        statePc = 385;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 379: {
                    if (-12 > (this.field_x ^ -1)) {
                        statePc = 384;
                    } else {
                        statePc = 385;
                    }
                    continue stateLoop;
                }
                case 384: {
                    var2_int = var2_int / 2;
                    statePc = 385;
                    continue stateLoop;
                }
                case 385: {
                    if (-2 == (this.field_m ^ -1)) {
                        statePc = 389;
                    } else {
                        statePc = 386;
                    }
                    continue stateLoop;
                }
                case 386: {
                    if ((this.field_m ^ -1) != -3) {
                        statePc = 390;
                    } else {
                        statePc = 389;
                    }
                    continue stateLoop;
                }
                case 389: {
                    var2_int = var2_int * 2;
                    statePc = 390;
                    continue stateLoop;
                }
                case 390: {
                    this.field_g = this.field_g + var2_int;
                    if (var12 == 0) {
                        statePc = 394;
                    } else {
                        statePc = 391;
                    }
                    continue stateLoop;
                }
                case 391: {
                    if ((this.field_g ^ -1) <= (this.field_i ^ -1)) {
                        statePc = 394;
                    } else {
                        statePc = 392;
                    }
                    continue stateLoop;
                }
                case 392: {
                    this.field_g = this.field_g + 3000;
                    statePc = 394;
                    continue stateLoop;
                }
                case 394: {
                    var2_int = 0;
                    statePc = 395;
                    continue stateLoop;
                }
                case 395: {
                    if (var2_int != 0) {
                        statePc = 420;
                    } else {
                        statePc = 396;
                    }
                    continue stateLoop;
                }
                case 396: {
                    var2_int = 1;
                    stackIn_421_0 = this.field_r.field_d.field_e;
                    stackIn_397_0 = stackIn_421_0;
                    if (var12 != 0) {
                        statePc = 421;
                    } else {
                        statePc = 397;
                    }
                    continue stateLoop;
                }
                case 397: {
                    var3_ref_ca = stackIn_397_0;
                    statePc = 398;
                    continue stateLoop;
                }
                case 398: {
                    stackIn_399_0 = this.field_r.field_d;
                    stackIn_399_1 = (ca) (var3_ref_ca);
                    statePc = 399;
                    continue stateLoop;
                }
                case 399: {
                    if (stackIn_399_0 == stackIn_399_1) {
                        statePc = 419;
                    } else {
                        statePc = 400;
                    }
                    continue stateLoop;
                }
                case 400: {
                    stackIn_399_0 = this.field_r.field_d;
                    stackIn_401_0 = stackIn_399_0;
                    stackIn_399_1 = var3_ref_ca.field_e;
                    stackIn_401_1 = stackIn_399_1;
                    if (var12 != 0) {
                        statePc = 399;
                    } else {
                        statePc = 401;
                    }
                    continue stateLoop;
                }
                case 401: {
                    if (stackIn_401_0 == stackIn_401_1) {
                        statePc = 419;
                    } else {
                        statePc = 402;
                    }
                    continue stateLoop;
                }
                case 402: {
                    var4_ref_pd = (pd) ((Object) var3_ref_ca.field_e);
                    var5 = (pd) ((Object) var3_ref_ca);
                    if ((var5.field_z ^ -1) < (var4_ref_pd.field_z ^ -1)) {
                        statePc = 409;
                    } else {
                        statePc = 403;
                    }
                    continue stateLoop;
                }
                case 403: {
                    if ((var5.field_u ^ -1) >= (var4_ref_pd.field_u ^ -1)) {
                        statePc = 418;
                    } else {
                        statePc = 406;
                    }
                    continue stateLoop;
                }
                case 406: {
                    if (var4_ref_pd.field_z != var5.field_z) {
                        statePc = 418;
                    } else {
                        statePc = 409;
                    }
                    continue stateLoop;
                }
                case 409: {
                    if (var5.field_y == 4) {
                        statePc = 417;
                    } else {
                        statePc = 412;
                    }
                    continue stateLoop;
                }
                case 412: {
                    if (var4_ref_pd.field_y != 4) {
                        statePc = 417;
                    } else {
                        statePc = 418;
                    }
                    continue stateLoop;
                }
                case 417: {
                    var5.field_e = var4_ref_pd.field_e;
                    var4_ref_pd.field_c = var5.field_c;
                    var4_ref_pd.field_e = (ca) ((Object) var5);
                    var5.field_c = (ca) ((Object) var4_ref_pd);
                    var5.field_e.field_c = (ca) ((Object) var5);
                    var4_ref_pd.field_c.field_e = (ca) ((Object) var4_ref_pd);
                    var2_int = 0;
                    statePc = 418;
                    continue stateLoop;
                }
                case 418: {
                    var3_ref_ca = var3_ref_ca.field_e;
                    if (var12 == 0) {
                        statePc = 398;
                    } else {
                        statePc = 419;
                    }
                    continue stateLoop;
                }
                case 419: {
                    if (var12 == 0) {
                        statePc = 395;
                    } else {
                        statePc = 420;
                    }
                    continue stateLoop;
                }
                case 420: {
                    stackIn_421_0 = this.field_b.b((byte) -112);
                    statePc = 421;
                    continue stateLoop;
                }
                case 421: {
                    var3_ref_oj = (oj) ((Object) stackIn_421_0);
                    statePc = 422;
                    continue stateLoop;
                }
                case 422: {
                    if (var3_ref_oj == null) {
                        statePc = 427;
                    } else {
                        statePc = 423;
                    }
                    continue stateLoop;
                }
                case 423: {
                    var3_ref_oj.a((byte) 44);
                    var3_ref_oj = (oj) ((Object) this.field_b.d(853));
                    if (var12 != 0) {
                        statePc = 428;
                    } else {
                        statePc = 424;
                    }
                    continue stateLoop;
                }
                case 424: {
                    if (var12 == 0) {
                        statePc = 422;
                    } else {
                        statePc = 427;
                    }
                    continue stateLoop;
                }
                case 427: {
                    gd.field_c = 0;
                    statePc = 428;
                    continue stateLoop;
                }
                case 428: {
                    var3 = 0;
                    var4_ref_pd = (pd) ((Object) this.field_r.b((byte) 114));
                    statePc = 429;
                    continue stateLoop;
                }
                case 429: {
                    if (var4_ref_pd == null) {
                        statePc = 465;
                    } else {
                        statePc = 430;
                    }
                    continue stateLoop;
                }
                case 430: {
                    var4_ref_pd.c(1);
                    stackIn_476_0 = var4_ref_pd.field_m ^ -1;
                    stackIn_431_0 = stackIn_476_0;
                    stackIn_476_1 = 11999;
                    stackIn_431_1 = stackIn_476_1;
                    if (var12 != 0) {
                        statePc = 476;
                    } else {
                        statePc = 431;
                    }
                    continue stateLoop;
                }
                case 431: {
                    if (stackIn_431_0 <= stackIn_431_1) {
                        statePc = 436;
                    } else {
                        statePc = 434;
                    }
                    continue stateLoop;
                }
                case 434: {
                    f.a(20, 235, (byte) -25);
                    statePc = 436;
                    continue stateLoop;
                }
                case 436: {
                    if ((this.field_f.field_o[var4_ref_pd.field_t] ^ -1) == -7) {
                        statePc = 439;
                    } else {
                        statePc = 464;
                    }
                    continue stateLoop;
                }
                case 439: {
                    if (!ob.field_F) {
                        statePc = 445;
                    } else {
                        statePc = 440;
                    }
                    continue stateLoop;
                }
                case 440: {
                    if (2 > va.field_d) {
                        statePc = 445;
                    } else {
                        statePc = 460;
                    }
                    continue stateLoop;
                }
                case 445: {
                    var5_int = this.field_f.field_j[var4_ref_pd.field_t];
                    var6 = var5_int % 8;
                    var7_int = (var5_int - var6) / 8;
                    var7_int -= 6;
                    var6 -= 3;
                    this.field_f.a((byte) -117, this.field_f.field_c * (-var7_int + 2) + 2 + (-var6 + var4_ref_pd.field_t));
                    var8 = 0;
                    statePc = 446;
                    continue stateLoop;
                }
                case 446: {
                    if (-6 >= (var8 ^ -1)) {
                        statePc = 456;
                    } else {
                        statePc = 447;
                    }
                    continue stateLoop;
                }
                case 447: {
                    stackIn_457_0 = 0;
                    stackIn_448_0 = stackIn_457_0;
                    if (var12 != 0) {
                        statePc = 457;
                    } else {
                        statePc = 448;
                    }
                    continue stateLoop;
                }
                case 448: {
                    var9 = stackIn_448_0;
                    statePc = 449;
                    continue stateLoop;
                }
                case 449: {
                    if (var9 >= 5) {
                        statePc = 454;
                    } else {
                        statePc = 450;
                    }
                    continue stateLoop;
                }
                case 450: {
                    var10 = (var9 + -var7_int) * this.field_f.field_c + (var4_ref_pd.field_t + var8) - var6;
                    this.field_f.field_o[var10] = 10;
                    this.field_f.field_j[var10] = this.field_f.field_j[var10] + 40;
                    this.field_h.a(-83, new me((double)(var10 % this.field_f.field_c), (double)(var10 / this.field_f.field_c), 1));
                    var9++;
                    if (var12 != 0) {
                        statePc = 455;
                    } else {
                        statePc = 451;
                    }
                    continue stateLoop;
                }
                case 451: {
                    if (var12 == 0) {
                        statePc = 449;
                    } else {
                        statePc = 454;
                    }
                    continue stateLoop;
                }
                case 454: {
                    var8++;
                    statePc = 455;
                    continue stateLoop;
                }
                case 455: {
                    if (var12 == 0) {
                        statePc = 446;
                    } else {
                        statePc = 456;
                    }
                    continue stateLoop;
                }
                case 456: {
                    stackIn_457_0 = var4_ref_pd.field_y ^ -1;
                    statePc = 457;
                    continue stateLoop;
                }
                case 457: {
                    if (stackIn_457_0 == -9) {
                        statePc = 460;
                    } else {
                        statePc = 458;
                    }
                    continue stateLoop;
                }
                case 458: {
                    this.field_e[0].field_f = 0;
                    statePc = 460;
                    continue stateLoop;
                }
                case 460: {
                    if ((var4_ref_pd.field_y ^ -1) == -9) {
                        statePc = 463;
                    } else {
                        statePc = 461;
                    }
                    continue stateLoop;
                }
                case 461: {
                    var4_ref_pd.field_o = 0;
                    statePc = 463;
                    continue stateLoop;
                }
                case 463: {
                    gk.a(mh.field_a[55], (byte) -11);
                    hd.field_j = fd.field_d;
                    wl.field_a = 320;
                    md.field_f = 240;
                    var3 = 1;
                    statePc = 464;
                    continue stateLoop;
                }
                case 464: {
                    var4_ref_pd = (pd) ((Object) this.field_r.d(853));
                    if (var12 == 0) {
                        statePc = 429;
                    } else {
                        statePc = 465;
                    }
                    continue stateLoop;
                }
                case 465: {
                    if (var3 == 0) {
                        statePc = 475;
                    } else {
                        statePc = 466;
                    }
                    continue stateLoop;
                }
                case 466: {
                    var4_ref_pd = (pd) ((Object) this.field_r.b((byte) 115));
                    statePc = 467;
                    continue stateLoop;
                }
                case 467: {
                    if (null == var4_ref_pd) {
                        statePc = 475;
                    } else {
                        statePc = 468;
                    }
                    continue stateLoop;
                }
                case 468: {
                    stackIn_476_0 = var4_ref_pd.field_m ^ -1;
                    stackIn_469_0 = stackIn_476_0;
                    stackIn_476_1 = -1;
                    stackIn_469_1 = stackIn_476_1;
                    if (var12 != 0) {
                        statePc = 476;
                    } else {
                        statePc = 469;
                    }
                    continue stateLoop;
                }
                case 469: {
                    if (stackIn_469_0 > stackIn_469_1) {
                        statePc = 473;
                    } else {
                        statePc = 474;
                    }
                    continue stateLoop;
                }
                case 473: {
                    var4_ref_pd.field_m = 0;
                    statePc = 474;
                    continue stateLoop;
                }
                case 474: {
                    var4_ref_pd = (pd) ((Object) this.field_r.d(853));
                    if (var12 == 0) {
                        statePc = 467;
                    } else {
                        statePc = 475;
                    }
                    continue stateLoop;
                }
                case 475: {
                    stackIn_476_0 = gd.field_c;
                    stackIn_476_1 = 30;
                    statePc = 476;
                    continue stateLoop;
                }
                case 476: {
                    if (stackIn_476_0 < stackIn_476_1) {
                        statePc = 479;
                    } else {
                        statePc = 477;
                    }
                    continue stateLoop;
                }
                case 477: {
                    f.a(19, 236, (byte) -25);
                    statePc = 479;
                    continue stateLoop;
                }
                case 479: {
                    this.field_e[0].a(param0 ^ 98);
                    if (param0 == 98) {
                        statePc = 482;
                    } else {
                        statePc = 480;
                    }
                    continue stateLoop;
                }
                case 480: {
                    this.field_c = 91;
                    statePc = 482;
                    continue stateLoop;
                }
                case 482: {
                    var4 = 0;
                    var5_ref = (kb) ((Object) this.field_o.b((byte) -96));
                    statePc = 483;
                    continue stateLoop;
                }
                case 483: {
                    if (var5_ref == null) {
                        statePc = 490;
                    } else {
                        statePc = 484;
                    }
                    continue stateLoop;
                }
                case 484: {
                    var5_ref.a((byte) 89);
                    stackIn_491_0 = var5_ref.field_C;
                    stackIn_485_0 = stackIn_491_0;
                    stackIn_491_1 = 5;
                    stackIn_485_1 = stackIn_491_1;
                    if (var12 != 0) {
                        statePc = 491;
                    } else {
                        statePc = 485;
                    }
                    continue stateLoop;
                }
                case 485: {
                    if (stackIn_485_0 != stackIn_485_1) {
                        statePc = 489;
                    } else {
                        statePc = 488;
                    }
                    continue stateLoop;
                }
                case 488: {
                    var6 = var5_ref.f(param0 ^ 52);
                    var4 = var4 + var6;
                    statePc = 489;
                    continue stateLoop;
                }
                case 489: {
                    var5_ref = (kb) ((Object) this.field_o.d(param0 + 755));
                    if (var12 == 0) {
                        statePc = 483;
                    } else {
                        statePc = 490;
                    }
                    continue stateLoop;
                }
                case 490: {
                    stackIn_491_0 = var4;
                    stackIn_491_1 = 250;
                    statePc = 491;
                    continue stateLoop;
                }
                case 491: {
                    if (stackIn_491_0 < stackIn_491_1) {
                        statePc = 494;
                    } else {
                        statePc = 492;
                    }
                    continue stateLoop;
                }
                case 492: {
                    f.a(18, 237, (byte) -25);
                    statePc = 494;
                    continue stateLoop;
                }
                case 494: {
                    this.a(-1);
                    var5 = (pd) ((Object) this.field_r.d((byte) -122));
                    statePc = 495;
                    continue stateLoop;
                }
                case 495: {
                    if (null == var5) {
                        statePc = 526;
                    } else {
                        statePc = 496;
                    }
                    continue stateLoop;
                }
                case 496: {
                    stackOut_496_0 = (pd) (var5);
                    stackIn_527_0 = stackOut_496_0;
                    stackIn_497_0 = stackOut_496_0;
                    if (var12 != 0) {
                        statePc = 527;
                    } else {
                        statePc = 497;
                    }
                    continue stateLoop;
                }
                case 497: {
                    if (stackIn_497_0.field_o <= 0) {
                        statePc = 502;
                    } else {
                        statePc = 525;
                    }
                    continue stateLoop;
                }
                case 502: {
                    var5.field_o = 0;
                    if (this.field_f.field_m[var5.field_t]) {
                        statePc = 505;
                    } else {
                        statePc = 506;
                    }
                    continue stateLoop;
                }
                case 505: {
                    this.field_f.field_m[var5.field_t] = false;
                    statePc = 506;
                    continue stateLoop;
                }
                case 506: {
                    var5.b(57);
                    stackIn_507_0 = var5.field_y ^ -1;
                    stackIn_507_1 = -11;
                    statePc = 507;
                    continue stateLoop;
                }
                case 507: {
                    if (stackIn_507_0 != stackIn_507_1) {
                        statePc = 514;
                    } else {
                        statePc = 508;
                    }
                    continue stateLoop;
                }
                case 508: {
                    this.field_f.field_m[var5.field_t] = true;
                    var6 = 0;
                    statePc = 509;
                    continue stateLoop;
                }
                case 509: {
                    if (-5 >= (var6 ^ -1)) {
                        statePc = 514;
                    } else {
                        statePc = 510;
                    }
                    continue stateLoop;
                }
                case 510: {
                    var7 = new pd(var5.field_u, var5.field_z, (f) (this), 11, 10);
                    var7.field_l = var5.field_l / 4;
                    var7.field_o = var7.field_l;
                    this.field_r.a(param0 + -212, var7);
                    var6++;
                    if (var12 != 0) {
                        statePc = 518;
                    } else {
                        statePc = 511;
                    }
                    continue stateLoop;
                }
                case 511: {
                    if (var12 == 0) {
                        statePc = 509;
                    } else {
                        statePc = 514;
                    }
                    continue stateLoop;
                }
                case 514: {
                    if (-12 == (var5.field_y ^ -1)) {
                        statePc = 517;
                    } else {
                        statePc = 525;
                    }
                    continue stateLoop;
                }
                case 517: {
                    this.field_f.field_m[var5.field_t] = true;
                    statePc = 518;
                    continue stateLoop;
                }
                case 518: {
                    var6 = 0;
                    statePc = 519;
                    continue stateLoop;
                }
                case 519: {
                    if (-5 >= (var6 ^ -1)) {
                        statePc = 525;
                    } else {
                        statePc = 520;
                    }
                    continue stateLoop;
                }
                case 520: {
                    var7 = new pd(var5.field_u, var5.field_z, (f) (this), 1, 10);
                    var7.field_l = var5.field_l / 4;
                    stackIn_507_0 = -1;
                    stackIn_521_0 = stackIn_507_0;
                    stackIn_507_1 = var7.field_l ^ -1;
                    stackIn_521_1 = stackIn_507_1;
                    if (var12 != 0) {
                        statePc = 507;
                    } else {
                        statePc = 521;
                    }
                    continue stateLoop;
                }
                case 521: {
                    if (stackIn_521_0 == stackIn_521_1) {
                        statePc = 523;
                    } else {
                        statePc = 524;
                    }
                    continue stateLoop;
                }
                case 523: {
                    var7.field_l = 1;
                    statePc = 524;
                    continue stateLoop;
                }
                case 524: {
                    var7.field_o = var7.field_l;
                    this.field_r.a(-104, var7);
                    var6++;
                    if (var12 == 0) {
                        statePc = 519;
                    } else {
                        statePc = 525;
                    }
                    continue stateLoop;
                }
                case 525: {
                    var5 = (pd) ((Object) this.field_r.b(param0 + 10610));
                    if (var12 == 0) {
                        statePc = 495;
                    } else {
                        statePc = 526;
                    }
                    continue stateLoop;
                }
                case 526: {
                    stackIn_527_0 = this.field_b.d((byte) -122);
                    statePc = 527;
                    continue stateLoop;
                }
                case 527: {
                    var5_ref2 = (oj) ((Object) stackIn_527_0);
                    statePc = 528;
                    continue stateLoop;
                }
                case 528: {
                    if (var5_ref2 == null) {
                        statePc = 538;
                    } else {
                        statePc = 529;
                    }
                    continue stateLoop;
                }
                case 529: {
                    if (var12 != 0) {
                        statePc = 538;
                    } else {
                        statePc = 530;
                    }
                    continue stateLoop;
                }
                case 530: {
                    if (200 > var5_ref2.field_g) {
                        statePc = 535;
                    } else {
                        statePc = 533;
                    }
                    continue stateLoop;
                }
                case 533: {
                    var5_ref2.b(57);
                    statePc = 535;
                    continue stateLoop;
                }
                case 535: {
                    var5_ref2 = (oj) ((Object) this.field_b.b(10708));
                    if (var12 == 0) {
                        statePc = 528;
                    } else {
                        statePc = 538;
                    }
                    continue stateLoop;
                }
                case 538: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, int param1, int param2) {
        try {
            if (param0 != -4) {
                this.field_x = 36;
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "f.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, byte param2) {
        int var3_int = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            var3_int = 1 << param0;
            if ((lb.field_g & var3_int) == 0) {
              dm.field_f = dm.field_f | var3_int;
              if (param2 == -25) {
                L1: {
                  lb.field_g = lb.field_g | var3_int;
                  oj.field_r.a(-74, new kg(param0));
                  if (!fc.field_d) {
                    pe.field_b.a(-105, new ha(param0, param1, bc.field_r, mm.field_C, a.field_r, nh.field_b + -wf.field_c.field_e[0].field_d));
                    break L1;
                  } else {
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var3), "f.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 < -28) {
                break L1;
              } else {
                field_j = true;
                break L1;
              }
            }
            field_w = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "f.F(" + param0 + ')');
        }
    }

    final void a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        kb stackIn_15_0 = null;
        kb stackIn_15_1 = null;
        int stackIn_18_0 = 0;
        kb stackIn_31_0 = null;
        kb stackIn_31_1 = null;
        kb stackIn_42_0 = null;
        kb stackIn_42_1 = null;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        kb var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        km var3_ref_km = null;
        int var4 = 0;
        kb var4_ref_kb = null;
        int var5_int = 0;
        kb var5 = null;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = (kb) ((Object) this.field_o.b((byte) 127));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2 == null) {
                            statePc = 64;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_66_0 = this.field_f.field_o[var2.field_h * this.field_f.field_c + var2.field_g] ^ -1;
                        stackIn_4_0 = stackIn_66_0;
                        stackIn_66_1 = -8;
                        stackIn_4_1 = stackIn_66_1;
                        if (var7 != 0) {
                            statePc = 66;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 != stackIn_4_1) {
                            statePc = 12;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-1 == var2.field_C) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (-1 <= (var2.field_F ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_15_0 = (kb) (var2);
                        stackIn_15_1 = (kb) (var2);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_15_0.field_F = stackIn_15_1.field_F - 1;
                        var3 = oj.a((byte) 47, var2.field_C);
                        var4 = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((var4 ^ -1) <= (var3 ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_65_0 = 0;
                        stackIn_18_0 = stackIn_65_0;
                        if (var7 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5_int = stackIn_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var3 ^ -1) >= (var5_int ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var6 = this.field_f.field_c * (var2.field_h + var5_int) + var2.field_g + var4;
                        this.field_f.field_o[var6] = 7;
                        this.field_f.field_j[var6] = 29;
                        var5_int++;
                        if (var7 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var7 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var4++;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var7 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var2.b(0, var2.field_h, var2.field_g);
                        if (var7 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (null != var2.field_s) {
                            statePc = 39;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var3_ref_km = new km(this.field_o);
                        var4_ref_kb = (kb) ((Object) var3_ref_km.d(27935));
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var4_ref_kb == null) {
                            statePc = 38;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_15_0 = (kb) (var2);
                        stackIn_31_0 = stackIn_15_0;
                        stackIn_15_1 = (kb) (var4_ref_kb);
                        stackIn_31_1 = stackIn_15_1;
                        if (var7 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 == stackIn_31_1) {
                            statePc = 37;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var2 != var4_ref_kb.field_s) {
                            statePc = 37;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var4_ref_kb.d(param0 ^ -10);
                        var4_ref_kb.field_C = -1;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var4_ref_kb = (kb) ((Object) var3_ref_km.b(true));
                        if (var7 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var7 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var3_ref_km = new km(this.field_o);
                        var4 = 0;
                        var5 = (kb) ((Object) var3_ref_km.d(27935));
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var5 == null) {
                            statePc = 48;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_15_0 = (kb) (var5);
                        stackIn_42_0 = stackIn_15_0;
                        stackIn_15_1 = (kb) (var2);
                        stackIn_42_1 = stackIn_15_1;
                        if (var7 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 == stackIn_42_1) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var2.field_s != var5.field_s) {
                            statePc = 47;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var4 = 1;
                        if (var7 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var5 = (kb) ((Object) var3_ref_km.b(true));
                        if (var7 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var4 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var2.field_s.d(param0 ^ -10);
                        var2.field_s.field_C = -1;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var2.c(1);
                        var2.field_C = -1;
                        var2.b(57);
                        var3 = -1 + var2.field_g;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_53_0 = var3 ^ -1;
                        stackIn_53_1 = 1 + var2.field_g ^ -1;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (stackIn_53_0 < stackIn_53_1) {
                            statePc = 63;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackIn_65_0 = -1 + var2.field_h;
                        stackIn_55_0 = stackIn_65_0;
                        if (var7 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var4 = stackIn_55_0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if ((var4 ^ -1) < (var2.field_h - -1 ^ -1)) {
                            statePc = 62;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackIn_53_0 = this.field_f.field_o[this.field_f.field_c * var4 + var3] ^ -1;
                        stackIn_58_0 = stackIn_53_0;
                        stackIn_53_1 = -2;
                        stackIn_58_1 = stackIn_53_1;
                        if (var7 != 0) {
                            statePc = 53;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (stackIn_58_0 == stackIn_58_1) {
                            statePc = 60;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        this.field_f.field_j[var4 * this.field_f.field_c + var3] = 0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var4++;
                        if (var7 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var3++;
                        if (var7 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var2 = (kb) ((Object) this.field_o.d(853));
                        if (var7 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackIn_65_0 = param0;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackIn_66_0 = stackIn_65_0;
                        stackIn_66_1 = -1;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (stackIn_66_0 == stackIn_66_1) {
                            statePc = 71;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        this.field_e = (lb[]) null;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 70: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) var2_ref), "f.B(" + param0 + ')');
                }
                case 71: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(ki param0, int param1) {
        RuntimeException runtimeException = null;
        hj var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = new hj(param0.a("", 1, "final_frame.jpg"), (java.awt.Component) ((Object) tf.field_f));
            if (param1 == -17763) {
              var3 = var2.field_o;
              var4 = var2.field_k;
              h.k(122);
              t.field_j = new hj(var3, var4 * 3 / 4);
              t.field_j.d();
              var2.b(0, 0);
              fd.field_a = new hj(var3, -t.field_j.field_k + var4);
              fd.field_a.d();
              var2.b(0, -t.field_j.field_k);
              fd.field_a.field_u = t.field_j.field_k;
              oc.g((byte) -105);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("f.H(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static wd a(se param0, int param1) {
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        wd stackIn_32_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        wd var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = param0.h(8, 8);
            if (0 >= var2_int) {
              L1: {
                var3 = eg.a(param0, 26678) ? 1 : 0;
                var4 = eg.a(param0, param1 + 26662) ? 1 : 0;
                var5 = new wd();
                var5.field_c = (short)param0.h(16, param1 ^ 24);
                var5.field_R = ca.a(var5.field_R, 16, false, param0);
                var5.field_x = ca.a(var5.field_x, 16, false, param0);
                var5.field_Q = ca.a(var5.field_Q, 16, false, param0);
                var5.field_u = (short)param0.h(16, 8);
                var5.field_M = ca.a(var5.field_M, 16, false, param0);
                var5.field_e = ca.a(var5.field_e, 16, false, param0);
                var5.field_l = ca.a(var5.field_l, param1, false, param0);
                if (var3 == 0) {
                  break L1;
                } else {
                  var5.field_w = (short)param0.h(16, param1 + -8);
                  var5.field_K = ca.a(var5.field_K, 16, false, param0);
                  var5.field_H = ca.a(var5.field_H, 16, false, param0);
                  var5.field_G = ca.a(var5.field_G, 16, false, param0);
                  var5.field_q = ca.a(var5.field_q, 16, false, param0);
                  var5.field_y = ca.a(var5.field_y, 16, false, param0);
                  var5.field_i = ca.a(var5.field_i, 16, false, param0);
                  break L1;
                }
              }
              L2: {
                if (var4 == 0) {
                  break L2;
                } else {
                  param0.h(16, param1 ^ 24);
                  var5.field_n = ca.a(var5.field_n, 16, false, param0);
                  var5.field_B = ca.a(var5.field_B, 16, false, param0);
                  var5.field_h = ca.a(var5.field_h, 16, false, param0);
                  var5.field_s = ca.a(var5.field_s, 16, false, param0);
                  var5.field_a = ca.a(var5.field_a, 16, false, param0);
                  break L2;
                }
              }
              L3: {
                if (eg.a(param0, 26678)) {
                  var5.field_N = ca.a(var5.field_N, 16, false, param0);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (!eg.a(param0, param1 ^ 26662)) {
                  break L4;
                } else {
                  var5.field_t = aa.a(param0, var5.field_t, 16, 20783);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if ((var5.field_t.length ^ -1) >= (var7 ^ -1)) {
                          break L7;
                        } else {
                          stackIn_25_0 = var6 ^ -1;

                          stackIn_25_1 = var5.field_t[var7] & 255 ^ -1;

                          if (var8 != 0) {
                            break L6;
                          } else {
                            L8: {
                              if (stackIn_25_0 > stackIn_25_1) {
                                var6 = var5.field_t[var7] & 255;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var7++;
                            if (var8 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      stackIn_25_0 = 0;
                      stackIn_25_1 = var6;
                      break L6;
                    }
                    L9: {
                      if (stackIn_25_0 != stackIn_25_1) {
                        break L9;
                      } else {
                        var5.field_t = null;
                        if (var8 == 0) {
                          break L4;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var5.field_m = (byte)(var6 + 1);
                    break L4;
                  }
                }
              }
              stackIn_32_0 = (wd) (var5);
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var2);

            stackIn_36_1 = new StringBuilder().append("f.D(");

            if (param0 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L10;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L10;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param1 + ')');
        }
        return stackIn_32_0;
    }

    final void d(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        kb var2 = null;
        me var2_ref = null;
        me var3 = null;
        int var4 = 0;
        me stackIn_14_0 = null;
        me stackIn_16_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((this.field_q ^ -1) >= (var2_int ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.field_e[var2_int].b((byte) 85);
                        var2_int++;
                        if (var4 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2 = (kb) ((Object) this.field_o.b((byte) 127));
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (null == var2) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var2.e(123);
                        var2 = (kb) ((Object) this.field_o.d(853));
                        if (var4 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var2_int = -34 / ((param0 - 40) / 60);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var3 = (me) ((Object) this.field_h.b((byte) 126));
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var3 == null) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3.a((byte) 32);
                        stackIn_16_0 = (me) ((Object) this.field_h.d(853));
                        stackIn_14_0 = stackIn_16_0;
                        if (var4 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3 = stackIn_14_0;
                        if (var4 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = (me) ((Object) this.field_h.b((byte) -96));
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var2_ref = stackIn_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var2_ref == null) {
                            statePc = 28;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var4 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var2_ref.field_m ^ -1) == 0) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var2_ref.b(57);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var2_ref = (me) ((Object) this.field_h.d(853));
                        if (var4 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) runtimeException), "f.E(" + param0 + ')');
                }
                case 28: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final kb a(int param0, int param1) {
        kb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        kb stackIn_16_0 = null;
        Object stackIn_21_0 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = (kb) ((Object) this.field_o.b((byte) 119));
                        var4 = -127 % ((-2 - param1) / 44);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null == var3) {
                            statePc = 20;
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
                        var5 = oj.a((byte) 47, var3.field_C);
                        stackIn_4_0 = var3.field_C ^ -1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 != 0) {
                            statePc = 6;
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
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var6 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = var6;
                        stackIn_8_1 = var5;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 >= stackIn_8_1) {
                            statePc = 19;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_4_0 = 0;
                        stackIn_10_0 = stackIn_4_0;
                        if (var8 != 0) {
                            statePc = 4;
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
                        var7 = stackIn_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var5 ^ -1) >= (var7 ^ -1)) {
                            statePc = 18;
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
                        stackIn_8_0 = var7 * this.field_f.field_c + var6 + var3.field_w ^ -1;
                        stackIn_13_0 = stackIn_8_0;
                        stackIn_8_1 = param0 ^ -1;
                        stackIn_13_1 = stackIn_8_1;
                        if (var8 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 == stackIn_13_1) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = (kb) (var3);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0;
                }
                case 17: {
                    try {
                        var7++;
                        if (var8 == 0) {
                            statePc = 11;
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
                        var6++;
                        if (var8 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var3 = (kb) ((Object) this.field_o.d(853));
                        if (var8 == 0) {
                            statePc = 2;
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
                        stackIn_21_0 = null;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return (kb) ((Object) stackIn_21_0);
                }
                case 22: {
                    var3_ref = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) var3_ref), "f.K(" + param0 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static sh a(boolean param0, long param1, String param2, int param3, String param4) {
        RuntimeException var6 = null;
        sh stackIn_2_0 = null;
        hh stackIn_8_0 = null;
        ic stackIn_13_0 = null;
        ii stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == 17470) {
              L1: {
                if (-1L != (param1 ^ -1L)) {
                  break L1;
                } else {
                  if (param2 == null) {
                    break L1;
                  } else {
                    stackIn_8_0 = new hh(param2, param4);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              if (param0) {
                stackIn_13_0 = new ic(param1, param4);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_15_0 = new ii(param1, param4);
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              stackIn_2_0 = (sh) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var6);

            stackIn_19_1 = new StringBuilder().append("f.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_20_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (sh) ((Object) stackIn_8_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (sh) ((Object) stackIn_13_0);
            } else {
              return (sh) ((Object) stackIn_15_0);
            }
          }
        }
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, int param2) {
        Object var3 = null;
        Object var4 = null;
        int var5 = 0;
        java.net.URL stackIn_13_0 = null;
        Object stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        Object stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = null;
              var5 = -69 % ((param2 - 42) / 59);
              if (ld.field_e == null) {
                break L1;
              } else {
                if (!ld.field_e.equals(param0.getParameter("settings"))) {
                  var3 = ld.field_e;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var4 = null;
              if (pc.field_ab == null) {
                break L2;
              } else {
                if (pc.field_ab.equals(param0.getParameter("session"))) {
                  break L2;
                } else {
                  var4 = pc.field_ab;
                  break L2;
                }
              }
            }
            stackIn_13_0 = lj.a((String) (var3), param1, -1, (String) (var4), (byte) 72);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = var3;

            stackIn_17_1 = new StringBuilder().append("f.N(");

            if (param0 == null) {
              stackIn_18_0 = stackIn_17_0;
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = stackIn_17_0;
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {

              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {

              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_18_0), stackIn_22_2 + ',' + param2 + ')');
        }
        return stackIn_13_0;
    }

    final static void a(int param0, ha param1, byte param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            oa.field_d.a(-114, param1);
            tl.a(-127, param1, param0);
            var3_int = 75 / ((param2 - 30) / 33);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("f.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    f(int param0) {
        lb dupTemp$0 = null;
        lb dupTemp$1 = null;
        lb dupTemp$2 = null;
        lb dupTemp$3 = null;
        lb dupTemp$4 = null;
        lb dupTemp$5 = null;
        lb dupTemp$6 = null;
        lb dupTemp$7 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = OrbDefence.field_D ? 1 : 0;
        this.field_t = 0;
        this.field_u = 0;
        this.field_d = 0;
        this.field_a = false;
        this.field_p = 0;
        this.field_y = 0;
        this.field_n = false;
        this.field_l = 0;
        this.field_s = 0;
        this.field_v = 4;
        try {
          L0: {
            this.field_m = param0;
            this.field_f = new kd(am.field_d[param0]);
            this.field_r = new im();
            this.field_o = new im();
            this.field_h = new im();
            this.field_b = new im();
            this.field_q = 1;
            this.field_e = new lb[this.field_q];
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (this.field_q <= var2_int) {
                    break L3;
                  } else {
                    this.field_e[var2_int] = new lb((f) (this), var2_int);
                    this.field_e[var2_int].field_j = this.field_f.field_c / 2;
                    this.field_e[var2_int].field_c = this.field_f.field_t / 2;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if ((var2_int ^ -1) != -1) {
                          break L4;
                        } else {
                          dupTemp$0 = this.field_e[var2_int];
                          dupTemp$0.field_j = dupTemp$0.field_j - 4;
                          dupTemp$1 = this.field_e[var2_int];
                          dupTemp$1.field_c = dupTemp$1.field_c - 2;
                          break L4;
                        }
                      }
                      L5: {
                        if (1 == var2_int) {
                          dupTemp$2 = this.field_e[var2_int];
                          dupTemp$2.field_j = dupTemp$2.field_j + 2;
                          dupTemp$3 = this.field_e[var2_int];
                          dupTemp$3.field_c = dupTemp$3.field_c - 2;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (var2_int != 2) {
                          break L6;
                        } else {
                          dupTemp$4 = this.field_e[var2_int];
                          dupTemp$4.field_j = dupTemp$4.field_j - 2;
                          dupTemp$5 = this.field_e[var2_int];
                          dupTemp$5.field_c = dupTemp$5.field_c + 2;
                          break L6;
                        }
                      }
                      L7: {
                        if (3 == var2_int) {
                          dupTemp$6 = this.field_e[var2_int];
                          dupTemp$6.field_j = dupTemp$6.field_j + 2;
                          dupTemp$7 = this.field_e[var2_int];
                          dupTemp$7.field_c = dupTemp$7.field_c + 2;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var2_int++;
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_g = 3000;
                this.field_x = 0;
                this.field_i = 0;
                this.field_c = 100;
                this.field_f.field_n = 0;
                this.field_f.a((byte) 100);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2), "f.<init>(" + param0 + ')');
        }
    }

    static {
    }
}
