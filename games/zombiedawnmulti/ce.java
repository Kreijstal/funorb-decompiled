/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends br {
    int field_t;
    static String field_o;
    private int field_j;
    private ja field_f;
    private lq field_p;
    private int field_n;
    int field_s;
    static int field_k;
    private int field_h;
    static String[] field_g;
    private fh field_i;
    int field_l;
    static int field_r;
    int field_q;
    int field_m;

    final void a(fh param0, int param1) {
        Object stackIn_15_0 = null;
        Object stackIn_24_0 = null;
        boolean stackIn_30_0 = false;
        int stackIn_37_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        boolean stackOut_29_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        nm var6_ref_nm = null;
        int var7_int = 0;
        th var7 = null;
        lk var7_ref = null;
        br var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_i = param0;
                        var3_int = 0 % ((59 - param1) / 56);
                        this.field_n = 2 * ip.field_f + (this.field_t - 1);
                        this.field_h = 2 * ip.field_f + this.field_m + -1;
                        if ((this.field_i.field_i.field_e ^ -1) >= (this.field_n ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.field_n = -1 + this.field_i.field_i.field_e;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (this.field_h < this.field_i.field_i.field_d) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.field_h = -1 + this.field_i.field_i.field_d;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_j = 0;
                        if (!o.field_j) {
                            statePc = 75;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.field_p = new lq();
                        if (-2 == (this.field_q ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var4 = 48 * ip.field_f;
                        var5 = ip.field_f * 48;
                        this.field_f = new ja(var4, var5);
                        var6 = this.field_t;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (this.field_n < var6) {
                            statePc = 23;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_24_0 = this;
                        stackIn_15_0 = stackIn_24_0;
                        if (var11 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var7_int = ((ce) (this)).field_m;
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
                        if (this.field_h < var7_int) {
                            statePc = 21;
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
                        this.field_i.field_k[var6][var7_int] = false;
                        var7_int++;
                        if (var11 != 0) {
                            statePc = 22;
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
                        if (var11 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var6++;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var11 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = this;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        g.c(((ce) (this)).field_f);
                        var6_ref_nm = new nm(this.field_i.field_r, this.field_i.field_c);
                        var6_ref_nm.field_g = 240 + this.field_t * 24;
                        var6_ref_nm.field_k = this.field_m * 24 + 320;
                        this.field_i.a((byte) -12, var6_ref_nm);
                        if (0 != this.field_q) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        oo.b();
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        this.field_i.a(1, false, var6_ref_nm, -1);
                        var7 = fb.field_e.field_H;
                        var8 = var7.c(46);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (null == var8) {
                            statePc = 36;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = var8 instanceof fd;
                        stackIn_37_0 = stackOut_29_0 ? 1 : 0;
                        stackIn_30_0 = stackOut_29_0;
                        if (var11 != 0) {
                            statePc = 37;
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
                        if (stackIn_30_0) {
                            statePc = 34;
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
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
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
                case 34: {
                    try {
                        ((id) ((Object) var8)).a(-10136, var6_ref_nm);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var8 = var7.b(6);
                        if (var11 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        this.field_i.a(2, false, var6_ref_nm, -1);
                        g.d();
                        stackIn_37_0 = this.field_t;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var9 = stackIn_37_0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (this.field_n < var9) {
                            statePc = 48;
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
                        if (var11 != 0) {
                            statePc = 75;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var10 = this.field_m;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((var10 ^ -1) < (this.field_h ^ -1)) {
                            statePc = 46;
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
                        this.field_i.field_k[var9][var10] = true;
                        var10++;
                        if (var11 != 0) {
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
                        if (var11 == 0) {
                            statePc = 41;
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
                        var9++;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var11 == 0) {
                            statePc = 38;
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
                        if (var11 == 0) {
                            statePc = 75;
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
                        var4 = this.field_t;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_51_0 = this.field_n;
                        stackIn_51_1 = var4;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (stackIn_51_0 < stackIn_51_1) {
                            statePc = 75;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var11 != 0) {
                            statePc = 75;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var5 = this.field_m;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if ((var5 ^ -1) < (this.field_h ^ -1)) {
                            statePc = 68;
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
                        stackIn_51_0 = 0;
                        stackIn_56_0 = stackIn_51_0;
                        stackIn_51_1 = this.field_i.field_i.field_h[var4][var5] & 1;
                        stackIn_56_1 = stackIn_51_1;
                        if (var11 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (stackIn_56_0 != stackIn_56_1) {
                            statePc = 60;
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
                        if (!this.field_i.field_k[var4][var5]) {
                            statePc = 66;
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
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var6 = 0;
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
                        if (2 <= var6) {
                            statePc = 66;
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
                        var7_ref = p.a(var5 * 24, var4 * 24, 100, true);
                        this.field_p.a(29664, var7_ref);
                        op.field_m.field_K.a(-25612, var7_ref);
                        var6++;
                        if (var11 != 0) {
                            statePc = 67;
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
                        if (var11 == 0) {
                            statePc = 61;
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
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        this.field_i.field_k[var4][var5] = false;
                        var5++;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var11 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var4++;
                        if (var11 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 70: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_73_0 = (RuntimeException) (var3);
                    stackIn_71_0 = stackIn_73_0;
                    stackIn_73_1 = new StringBuilder().append("ce.H(");
                    stackIn_71_1 = stackIn_73_1;
                    if (param0 == null) {
                        statePc = 73;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    stackIn_74_0 = (RuntimeException) ((Object) stackIn_71_0);
                    stackIn_74_1 = (StringBuilder) ((Object) stackIn_71_1);
                    stackIn_74_2 = "{...}";
                    statePc = 74;
                    continue stateLoop;
                }
                case 73: {
                    stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
                    stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
                    stackIn_74_2 = "null";
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    throw fa.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ',' + param1 + ')');
                }
                case 75: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, String param8) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        try {
          L0: {
            L1: {
              nq.field_t.field_wb = param8;
              if (param4 >= 109) {
                break L1;
              } else {
                ce.a(-64);
                break L1;
              }
            }
            L2: {
              L3: {
                if (va.field_a == 2) {
                  break L3;
                } else {
                  jk.field_d.field_wb = io.field_e;
                  if (!ZombieDawnMulti.field_E) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              jk.field_d.field_wb = tm.field_d;
              break L2;
            }
            var9_int = 495;
            var10 = 5;
            br.field_c.a(param0, var10, var9_int + -10, 5, -3344);
            ec.field_b.a(param0, 0, br.field_c.field_zb + -ua.field_E.field_zb, 0, -3344);
            var10 = var10 + (param6 + param0);
            ua.field_E.a(param0, 0, ua.field_E.field_zb, ec.field_b.field_zb, -3344);
            dp.field_c.a(param7, var10, dp.field_c.e(0), 5, -3344);
            var11 = jk.field_d.e(0);
            jk.field_d.a(param7, var10, var11, -5 + var9_int + -var11, -3344);
            nq.field_t.a(param3, 0, var9_int, 0, -3344);
            var12 = 5 + var10 + param7;
            re.field_a.a(var12, param3, var9_int, 0, -3344);
            var12 = var12 + param3;
            re.field_a.field_ab = tg.a(2105376, re.field_a.field_z, 8421504, 3, 11579568, 49);
            lj.field_v.a(var12, -(var12 / 2) + param5, var9_int, param2 + -(var9_int / 2), -3344);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var9);

            stackIn_14_1 = new StringBuilder().append("ce.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (-1 != (this.field_j ^ -1)) {
                this.b(false);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -60) {
                break L2;
              } else {
                ce.c((byte) -16);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ce.F(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        try {
            field_o = null;
            field_g = null;
            if (param0 != 24) {
                field_g = (String[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ce.I(" + param0 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param1 / 24;
              var5 = param0 / 24;
              if (param2 == -1) {
                break L1;
              } else {
                this.field_n = 94;
                break L1;
              }
            }
            L2: {
              L3: {
                if (var5 < this.field_m) {
                  break L3;
                } else {
                  if (this.field_h < var5) {
                    break L3;
                  } else {
                    if (var4_int < this.field_t) {
                      break L3;
                    } else {
                      if ((var4_int ^ -1) < (this.field_n ^ -1)) {
                        break L3;
                      } else {
                        stackIn_16_0 = 1;
                        break L2;
                      }
                    }
                  }
                }
              }
              stackIn_16_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "ce.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final void a(byte param0, nm param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = param1.c(this.field_m * 24, -20126);
            param1.c((this.field_h + 1) * 24, -20126);
            if (param0 == 19) {
              L1: {
                L2: {
                  var4 = param1.d(this.field_t * 24, 114);
                  param1.d((1 + this.field_n) * 24, 127);
                  var5 = 50;
                  if (-1 != (this.field_j ^ -1)) {
                    break L2;
                  } else {
                    var5 = -this.field_s + this.field_l;
                    if (!ZombieDawnMulti.field_E) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (this.field_j != 2) {
                  break L1;
                } else {
                  var5 = this.field_s;
                  break L1;
                }
              }
              L3: {
                var6 = 0;
                var7 = 0;
                if (this.field_q != 0) {
                  break L3;
                } else {
                  var8 = 47;
                  var9 = var8 + (-var8 + 255) * (-var5 + 50) / 50;
                  this.field_f.c(var6 + var3_int, var4 + var7, var9);
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (runtimeException);

            stackIn_14_1 = new StringBuilder().append("ce.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void d(byte param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_11_0 = null;
        fc stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        fc stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        fc stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 > 40) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.a(79, -32, -25);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2_int = this.field_t;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = this;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((((ce) (this)).field_n ^ -1) > (var2_int ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var4 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var3 = this.field_m;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var3 ^ -1) < (this.field_h ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_6_0 = this;
                        stackIn_11_0 = stackIn_6_0;
                        if (var4 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_14_0 = ((ce) (this)).field_i.field_i;
                        stackIn_12_0 = stackIn_14_0;
                        stackIn_14_1 = -8927;
                        stackIn_12_1 = stackIn_14_1;
                        stackIn_14_2 = var2_int;
                        stackIn_12_2 = stackIn_14_2;
                        stackIn_14_3 = var3;
                        stackIn_12_3 = stackIn_14_3;
                        if (0 == (1 & this.field_i.field_i.field_h[var2_int][var3])) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_15_0 = (fc) ((Object) stackIn_12_0);
                        stackIn_15_1 = stackIn_12_1;
                        stackIn_15_2 = stackIn_12_2;
                        stackIn_15_3 = stackIn_12_3;
                        stackIn_15_4 = 1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = (fc) ((Object) stackIn_14_0);
                        stackIn_15_1 = stackIn_14_1;
                        stackIn_15_2 = stackIn_14_2;
                        stackIn_15_3 = stackIn_14_3;
                        stackIn_15_4 = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((fc) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2, stackIn_15_3, stackIn_15_4 != 0);
                        this.field_i.field_k[var2_int][var3] = false;
                        var3++;
                        if (var4 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var2_int++;
                        if (var4 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var2), "ce.K(" + param0 + ')');
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean d(int param0) {
        int stackIn_24_0 = 0;
        boolean stackIn_41_0 = false;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_55_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_40_0;
        int var2_int = 0;
        qa var2 = null;
        RuntimeException var2_ref = null;
        qa var3 = null;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_s = this.field_s - 1;
              var2_int = this.field_j;
              if (var2_int == 0) {
                L2: {
                  if (this.field_f != null) {
                    if (0 == this.field_q) {
                      this.field_f.b(0, 1, 0);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                if (this.field_l + -50 >= this.field_s) {
                  this.b(false);
                  this.field_j = 1;
                  stackIn_24_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              } else {
                L3: {
                  L4: {
                    if (var2_int != 1) {
                      break L4;
                    } else {
                      if (var4 == 0) {
                        if ((this.field_s ^ -1) >= -51) {
                          this.field_j = 2;
                          if (var4 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        } else {
                          break L1;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (-3 == (var2_int ^ -1)) {
                    break L3;
                  } else {
                    break L1;
                  }
                }
                L5: {
                  if (null == this.field_f) {
                    break L5;
                  } else {
                    if (-1 != (this.field_q ^ -1)) {
                      break L5;
                    } else {
                      this.field_f.b(0, -1, 0);
                      break L5;
                    }
                  }
                }
                L6: {
                  L7: {
                    if (this.field_p == null) {
                      break L7;
                    } else {
                      var3 = this.field_p.c((byte) 115);
                      L8: while (true) {
                        if (var3 == null) {
                          break L7;
                        } else {
                          var2 = this.field_p.b((byte) 97);
                          ((lk) ((Object) var3)).field_S = 1;
                          stackOut_40_0 = ((lk) ((Object) var3)).field_O;
                          stackIn_48_0 = stackOut_40_0 ? 1 : 0;
                          stackIn_41_0 = stackOut_40_0;
                          if (var4 != 0) {
                            break L6;
                          } else {
                            L9: {
                              if (!stackIn_41_0) {
                                break L9;
                              } else {
                                ((lk) ((Object) var3)).j(param0 ^ -5404);
                                break L9;
                              }
                            }
                            var3 = var2;
                            if (var4 == 0) {
                              continue L8;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackIn_48_0 = this.field_s ^ -1;
                  break L6;
                }
                if (stackIn_48_0 < -1) {
                  break L1;
                } else {
                  this.d((byte) 87);
                  this.a(true);
                  stackIn_50_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            L10: {
              if (param0 == -20232) {
                break L10;
              } else {
                this.c(-117);
                break L10;
              }
            }
            stackIn_55_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2_ref), "ce.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_24_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_50_0 != 0;
          } else {
            return stackIn_55_0 != 0;
          }
        }
    }

    private final void b(boolean param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        fc stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        fc stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        fc stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        fc stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        boolean[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        boolean[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        boolean[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!param0) {
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
                        ce.a(-36, 94, -24, 32, (byte) 68, -15, -48, 125, (String) null);
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
                        var2_int = this.field_t;
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
                        stackIn_6_0 = this.field_n ^ -1;
                        stackIn_6_1 = var2_int ^ -1;
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
                        if (stackIn_6_0 > stackIn_6_1) {
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
                        if (var4 != 0) {
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
                        var3 = this.field_m;
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
                        if ((this.field_h ^ -1) > (var3 ^ -1)) {
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
                        stackIn_6_0 = this.field_i.field_i.field_g[var2_int][var3] & -2147483648 ^ -1;
                        stackIn_11_0 = stackIn_6_0;
                        stackIn_6_1 = -1;
                        stackIn_11_1 = stackIn_6_1;
                        if (var4 != 0) {
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
                        if (stackIn_11_0 != stackIn_11_1) {
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
                        stackIn_17_0 = this.field_i.field_i;
                        stackIn_13_0 = stackIn_17_0;
                        stackIn_17_1 = -8927;
                        stackIn_13_1 = stackIn_17_1;
                        stackIn_17_2 = var2_int;
                        stackIn_13_2 = stackIn_17_2;
                        stackIn_17_3 = var3;
                        stackIn_13_3 = stackIn_17_3;
                        if (0 != this.field_q) {
                            statePc = 17;
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
                        stackIn_15_0 = (fc) ((Object) stackIn_13_0);
                        stackIn_15_1 = stackIn_13_1;
                        stackIn_15_2 = stackIn_13_2;
                        stackIn_15_3 = stackIn_13_3;
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
                        stackIn_18_0 = (fc) ((Object) stackIn_15_0);
                        stackIn_18_1 = stackIn_15_1;
                        stackIn_18_2 = stackIn_15_2;
                        stackIn_18_3 = stackIn_15_3;
                        stackIn_18_4 = 1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = (fc) ((Object) stackIn_17_0);
                        stackIn_18_1 = stackIn_17_1;
                        stackIn_18_2 = stackIn_17_2;
                        stackIn_18_3 = stackIn_17_3;
                        stackIn_18_4 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((fc) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_18_2, stackIn_18_3, stackIn_18_4 != 0);
                        stackIn_21_0 = this.field_i.field_k[var2_int];
                        stackIn_19_0 = stackIn_21_0;
                        stackIn_21_1 = var3;
                        stackIn_19_1 = stackIn_21_1;
                        if ((this.field_q ^ -1) != -1) {
                            statePc = 21;
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
                        stackIn_22_0 = (boolean[]) ((Object) stackIn_19_0);
                        stackIn_22_1 = stackIn_19_1;
                        stackIn_22_2 = 1;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_22_0 = (boolean[]) ((Object) stackIn_21_0);
                        stackIn_22_1 = stackIn_21_1;
                        stackIn_22_2 = 0;
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
                        stackIn_22_0[stackIn_22_1] = stackIn_22_2 != 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var3++;
                        if (var4 == 0) {
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
                        var2_int++;
                        if (var4 == 0) {
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
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var2), "ce.A(" + param0 + ')');
                }
                case 27: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void c(byte param0) {
        try {
            cb.a((String) null, 32, mc.field_g);
            if (param0 != -123) {
                ce.a(79);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ce.G(" + param0 + ')');
        }
    }

    final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (-51 <= (this.field_s ^ -1)) {
                break L1;
              } else {
                this.field_s = 50;
                break L1;
              }
            }
            L2: {
              if (param0 == -28188) {
                break L2;
              } else {
                this.field_h = -2;
                break L2;
              }
            }
            this.field_j = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "ce.E(" + param0 + ')');
        }
    }

    ce(fh param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_i = param0;
              param1 = param1 / 24;
              param2 = param2 / 24;
              this.field_q = param4;
              this.field_s = param3;
              this.field_l = param3;
              this.field_t = param2 - ip.field_f;
              if (-1 >= (this.field_t ^ -1)) {
                break L1;
              } else {
                this.field_t = 0;
                break L1;
              }
            }
            L2: {
              this.field_m = param1 - ip.field_f;
              if (this.field_m >= 0) {
                break L2;
              } else {
                this.field_m = 0;
                break L2;
              }
            }
            L3: {
              if (null != this.field_i) {
                this.a(this.field_i, 118);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (runtimeException);

            stackIn_15_1 = new StringBuilder().append("ce.<init>(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_o = "<%0> must play 1 more rated game before playing with the current options.";
        field_g = new String[]{"Mode: Normal", "Mode: Hard"};
    }
}
