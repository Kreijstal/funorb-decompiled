/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends ag {
    private int field_v;
    private lc field_k;
    private lc field_l;
    private boolean field_p;
    private lc field_s;
    private int[] field_r;
    private int field_o;
    private pl field_w;
    private int field_x;
    static tf field_m;
    private int[] field_q;
    private boolean field_t;
    private int field_z;
    static qj field_u;
    private pl field_y;
    private pl field_n;

    final void b(int[] param0, int param1, int param2) {
        int stackIn_33_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((this.field_v ^ -1) >= -1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        this.d(param2);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        if (this.field_t) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-1 <= (this.field_z ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (!this.field_s.a((byte) -88)) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (this.field_z >= 0) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!this.field_k.a((byte) -125)) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_w = null;
                        this.field_z = -this.field_z;
                        this.field_t = false;
                        if (var11 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_z = -this.field_z;
                        this.field_y = null;
                        this.field_t = false;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var4_int = (this.field_o >> 1423531820) * this.field_v / 256;
                        var5 = -var4_int + this.field_v;
                        if (this.field_z != 0) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_o = this.field_o + this.field_z * param2;
                        if (this.field_o < 1048576) {
                            statePc = 24;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.field_o = 1048576;
                        if (this.field_t) {
                            statePc = 30;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.field_z = 0;
                        if (!this.field_p) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (null == this.field_w) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.field_k.f(16);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.field_w = null;
                        if (var11 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (-1 > (this.field_o ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.field_o = 0;
                        if (this.field_t) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        this.field_z = 0;
                        if (this.field_p) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (null == this.field_y) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        this.field_s.f(16);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        this.field_y = null;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (qh.field_g) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_33_0 = param2;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = param2 << -1141439167;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var6 = stackIn_33_0;
                        if (this.field_x < 256) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (null != this.field_y) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (this.field_w == null) {
                            statePc = 57;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var4_int != 256) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        this.field_s.b(param0, param1, param2);
                        if (var11 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((var5 ^ -1) == -257) {
                            statePc = 56;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (null == this.field_q) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (this.field_q.length < var6) {
                            statePc = 46;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ji.a(this.field_q, 0, var6);
                        ji.a(this.field_r, 0, var6);
                        if (var11 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        this.field_q = new int[var6];
                        this.field_r = new int[var6];
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        this.field_s.b(this.field_q, 0, param2);
                        this.field_k.b(this.field_r, 0, param2);
                        if (!qh.field_g) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        param1 = param1 << 1;
                        stackIn_50_0 = param1 << 1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_50_0 = param1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var7 = stackIn_50_0;
                        var8 = 0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var8 >= var6) {
                            statePc = 55;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        param0[var8 + var7] = param0[var8 + var7] + (this.field_r[var8] * var5 + this.field_q[var8] * var4_int >> 306189320);
                        var8++;
                        if (var11 != 0) {
                            statePc = 57;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var11 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var11 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        this.field_k.b(param0, param1, param2);
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (null == this.field_n) {
                            statePc = 78;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (this.field_x == 0) {
                            statePc = 78;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (this.field_q == null) {
                            statePc = 62;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var6 <= this.field_q.length) {
                            statePc = 64;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        this.field_r = new int[var6];
                        this.field_q = new int[var6];
                        if (var11 == 0) {
                            statePc = 65;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        ji.a(this.field_q, 0, var6);
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        this.field_l.b(this.field_q, 0, param2);
                        if (!qh.field_g) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        param1 = param1 << 1;
                        stackIn_68_0 = param1 << 1;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackIn_68_0 = param1;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var7 = stackIn_68_0;
                        var8 = this.field_x * this.field_v / 256;
                        var9 = this.field_v - var8;
                        var10 = 0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var6 <= var10) {
                            statePc = 78;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        param0[var10 + var7] = var8 * this.field_q[var10] + var9 * param0[var10 + var7] >> 769063560;
                        var10++;
                        if (var11 != 0) {
                            statePc = 78;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (var11 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 74: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_76_0 = (RuntimeException) (var4);
                    stackIn_75_0 = stackIn_76_0;
                    stackIn_76_1 = new StringBuilder().append("oj.K(");
                    stackIn_75_1 = stackIn_76_1;
                    if (param0 == null) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    stackIn_77_0 = (RuntimeException) ((Object) stackIn_75_0);
                    stackIn_77_1 = (StringBuilder) ((Object) stackIn_75_1);
                    stackIn_77_2 = "{...}";
                    statePc = 77;
                    continue stateLoop;
                }
                case 76: {
                    stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
                    stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
                    stackIn_77_2 = "null";
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    throw ch.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 78: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void e(int param0) {
        field_m = null;
        if (param0 <= 35) {
            field_u = (qj) null;
        }
        field_u = null;
    }

    final synchronized int b() {
        return 2;
    }

    final static void a(ti param0, int param1) {
        try {
            og.a((byte) 92);
            if (param1 != 256) {
                oj.a((byte) 117);
            }
            sb.a(param0.field_w, param0.field_r, param0.field_s);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "oj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final synchronized void a(int param0, boolean param1, int param2, int param3, pl param4, int param5) {
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_31_0 = 0;
        lc stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        lc stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        lc stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        lc stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_t) {
                break L1;
              } else {
                if (param1) {
                  L2: {
                    L3: {
                      if (0 < this.field_z) {
                        break L3;
                      } else {
                        L4: {
                          if (this.field_w == null) {
                            break L4;
                          } else {
                            this.field_k.f(16);
                            break L4;
                          }
                        }
                        this.field_w = param4;
                        if (param4 != null) {
                          this.field_k.a(-68, false, param4);
                          this.a(param3, (byte) -62, this.field_k, param2);
                          if (var9 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    L5: {
                      if (this.field_y != null) {
                        this.field_s.f(16);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    this.field_y = param4;
                    if (param4 == null) {
                      break L2;
                    } else {
                      this.field_s.a(123, false, param4);
                      this.a(param3, (byte) -99, this.field_s, param2);
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L6: {
              stackIn_18_0 = this;

              if (!param1) {
                stackIn_19_0 = this;
                stackIn_19_1 = 0;
                break L6;
              } else {
                stackIn_19_0 = this;
                stackIn_19_1 = 1;
                break L6;
              }
            }
            ((oj) (this)).field_t = stackIn_19_1 != 0;
            if (param4 == this.field_y) {
              this.field_z = param0;
              this.a(param3, (byte) -91, this.field_s, param2);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              if (this.field_w != param4) {
                L7: {
                  L8: {
                    if (null != this.field_y) {
                      break L8;
                    } else {
                      var7_int = 1;
                      if (var9 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (this.field_w == null) {
                      break L9;
                    } else {
                      L10: {
                        if (524288 <= this.field_o) {
                          stackIn_31_0 = 0;
                          break L10;
                        } else {
                          stackIn_31_0 = 1;
                          break L10;
                        }
                      }
                      var7_int = stackIn_31_0;
                      if (var9 == 0) {
                        break L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var7_int = 0;
                  break L7;
                }
                L11: {
                  L12: {
                    if (var7_int != 0) {
                      break L12;
                    } else {
                      L13: {
                        if (null == this.field_w) {
                          break L13;
                        } else {
                          this.field_k.f(16);
                          break L13;
                        }
                      }
                      L14: {
                        this.field_w = param4;
                        if (param4 != null) {
                          L15: {
                            stackIn_40_0 = this.field_k;

                            stackIn_40_1 = 124;

                            if (param1) {
                              stackIn_41_0 = (lc) ((Object) stackIn_40_0);
                              stackIn_41_1 = stackIn_40_1;
                              stackIn_41_2 = 0;
                              break L15;
                            } else {
                              stackIn_41_0 = (lc) ((Object) stackIn_40_0);
                              stackIn_41_1 = stackIn_40_1;
                              stackIn_41_2 = 1;
                              break L15;
                            }
                          }
                          ((lc) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2 != 0, param4);
                          this.a(param3, (byte) -96, this.field_k, param2);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      this.field_z = -param0;
                      if (var9 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L16: {
                    if (this.field_y == null) {
                      break L16;
                    } else {
                      this.field_s.f(16);
                      break L16;
                    }
                  }
                  L17: {
                    this.field_y = param4;
                    if (param4 != null) {
                      L18: {
                        stackIn_49_0 = this.field_s;

                        stackIn_49_1 = 125;

                        if (param1) {
                          stackIn_50_0 = (lc) ((Object) stackIn_49_0);
                          stackIn_50_1 = stackIn_49_1;
                          stackIn_50_2 = 0;
                          break L18;
                        } else {
                          stackIn_50_0 = (lc) ((Object) stackIn_49_0);
                          stackIn_50_1 = stackIn_49_1;
                          stackIn_50_2 = 1;
                          break L18;
                        }
                      }
                      ((lc) (Object) stackIn_50_0).a(stackIn_50_1, stackIn_50_2 != 0, param4);
                      this.a(param3, (byte) -61, this.field_s, param2);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  this.field_z = param0;
                  break L11;
                }
                var8 = 100 / ((25 - param5) / 62);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                this.field_z = -param0;
                this.a(param3, (byte) -126, this.field_k, param2);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackIn_56_0 = (RuntimeException) (var7);

            stackIn_56_1 = new StringBuilder().append("oj.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "null";
              break L19;
            } else {
              stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "{...}";
              break L19;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final ag a() {
        return null;
    }

    final static uj a(byte param0) {
        if (jh.field_n != rh.field_v) {
          if (rh.field_v != gd.field_l) {
            if (param0 == 32) {
              return null;
            } else {
              field_m = (tf) null;
              return null;
            }
          } else {
            rh.field_v = jh.field_n;
            return q.field_h;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    final synchronized void d(int param0) {
        int var3;
        L0: {
          var3 = Transmogrify.field_A ? 1 : 0;
          if (0 >= this.field_o) {
            if (-1048577 >= (this.field_o ^ -1)) {
              break L0;
            } else {
              if (this.field_w == null) {
                break L0;
              } else {
                this.field_k.d(param0);
                break L0;
              }
            }
          } else {
            if (-1048577 >= (this.field_o ^ -1)) {
              break L0;
            } else {
              if (this.field_w == null) {
                break L0;
              } else {
                this.field_k.d(param0);
                break L0;
              }
            }
          }
        }
        L1: {
          if (0 >= this.field_x) {
            break L1;
          } else {
            if (null != this.field_n) {
              this.field_l.d(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (this.field_t) {
            if ((this.field_z ^ -1) < -1) {
              if (!this.field_s.a((byte) -35)) {
                this.field_z = -this.field_z;
                this.field_y = null;
                this.field_t = false;
                if (var3 == 0) {
                  break L2;
                } else {
                  if (this.field_z >= 0) {
                    break L2;
                  } else {
                    if (this.field_k.a((byte) -110)) {
                      break L2;
                    } else {
                      this.field_w = null;
                      this.field_t = false;
                      this.field_z = -this.field_z;
                      break L2;
                    }
                  }
                }
              } else {
                if (this.field_z >= 0) {
                  break L2;
                } else {
                  if (this.field_k.a((byte) -110)) {
                    break L2;
                  } else {
                    this.field_w = null;
                    this.field_t = false;
                    this.field_z = -this.field_z;
                    break L2;
                  }
                }
              }
            } else {
              if (this.field_z >= 0) {
                break L2;
              } else {
                if (this.field_k.a((byte) -110)) {
                  break L2;
                } else {
                  this.field_w = null;
                  this.field_t = false;
                  this.field_z = -this.field_z;
                  break L2;
                }
              }
            }
          } else {
            break L2;
          }
        }
        L3: {
          if (this.field_z == 0) {
            break L3;
          } else {
            L4: {
              this.field_o = this.field_o + param0 * this.field_z;
              if (1048576 > this.field_o) {
                break L4;
              } else {
                this.field_o = 1048576;
                if (this.field_t) {
                  break L3;
                } else {
                  this.field_z = 0;
                  if (this.field_p) {
                    break L3;
                  } else {
                    L5: {
                      if (this.field_w != null) {
                        this.field_k.f(16);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    this.field_w = null;
                    if (var3 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            if ((this.field_o ^ -1) < -1) {
              break L3;
            } else {
              this.field_o = 0;
              if (this.field_t) {
                break L3;
              } else {
                this.field_z = 0;
                if (this.field_p) {
                  break L3;
                } else {
                  L6: {
                    if (null == this.field_y) {
                      break L6;
                    } else {
                      this.field_s.f(16);
                      break L6;
                    }
                  }
                  this.field_y = null;
                  break L3;
                }
              }
            }
          }
        }
    }

    final ag d() {
        return null;
    }

    final synchronized void a(int param0, boolean param1) {
        if (param1) {
            this.field_q = (int[]) null;
        }
        this.field_v = param0;
    }

    private final void a(int param0, byte param1, lc param2, int param3) {
        try {
            if (param1 > -58) {
                this.d();
            }
            param2.c(-1, param3, 0);
            param2.a(true, param0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "oj.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private oj() throws Throwable {
        throw new Error();
    }

    static {
        field_m = new tf(11, 0, 1, 2);
        field_u = new qj();
    }
}
