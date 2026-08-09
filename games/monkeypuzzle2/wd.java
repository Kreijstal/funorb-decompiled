/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    int[][] field_a;
    int[] field_m;
    int[] field_r;
    ie[] field_t;
    private byte[] field_c;
    int[] field_p;
    private int[] field_q;
    int field_e;
    static boolean field_g;
    int[] field_f;
    static pj field_h;
    int field_d;
    private int field_k;
    byte[][] field_n;
    int[] field_j;
    static ud field_i;
    int field_l;
    private int[][] field_o;
    ie field_b;
    static String field_s;

    private final void a(int param0, byte[] param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_80_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_102_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_105_1 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackIn_114_0 = 0;
        RuntimeException stackIn_135_0 = null;
        StringBuilder stackIn_135_1 = null;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        RuntimeException stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        String stackIn_137_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
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
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        gk var17 = null;
        gk var18 = null;
        byte[] var22 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var17 = new gk(rc.a(param1, 115));
                        var18 = var17;
                        var4 = var18.a((byte) 114);
                        if (-6 < (var4 ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 > 7) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var4 >= 6) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.field_l = 0;
                        if (var16 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_l = var18.e(param0 ^ 16076);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5 = var18.a((byte) 114);
                        if ((var5 & 1) == 0) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_12_0 = 1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6 = stackIn_12_0;
                        if (7 > var4) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_k = var18.m(param0 + -41191);
                        if (var16 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.field_k = var18.j(17277);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (-1 == (var5 & 2 ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_19_0 = 1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var7 = stackIn_19_0;
                        if (param0 == 16050) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        this.field_j = (int[]) null;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var8 = 0;
                        this.field_f = new int[this.field_k];
                        var9 = -1;
                        if (7 <= var4) {
                            statePc = 29;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var10 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var10 >= this.field_k) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        dupTemp$0 = var8 + var18.j(gi.a(param0, 32207));
                        var8 = dupTemp$0;
                        this.field_f[var10] = dupTemp$0;
                        stackIn_42_0 = this.field_f[var10];
                        stackIn_25_0 = stackIn_42_0;
                        stackIn_42_1 = var9;
                        stackIn_25_1 = stackIn_42_1;
                        if (var16 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 <= stackIn_25_1) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var9 = this.field_f[var10];
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var10++;
                        if (var16 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var16 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var10 = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((var10 ^ -1) <= (this.field_k ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        dupTemp$1 = var8 + var18.m(gi.a(param0, -23687));
                        var8 = dupTemp$1;
                        this.field_f[var10] = dupTemp$1;
                        stackIn_42_0 = this.field_f[var10];
                        stackIn_32_0 = stackIn_42_0;
                        stackIn_42_1 = var9;
                        stackIn_32_1 = stackIn_42_1;
                        if (var16 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (stackIn_32_0 > stackIn_32_1) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var9 = this.field_f[var10];
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var10++;
                        if (var16 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        this.field_e = 1 + var9;
                        if (var7 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        this.field_n = new byte[this.field_e][];
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        this.field_j = new int[this.field_e];
                        this.field_r = new int[this.field_e];
                        this.field_m = new int[this.field_e];
                        this.field_p = new int[this.field_e];
                        this.field_a = new int[this.field_e][];
                        if (var6 != 0) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        this.field_q = new int[this.field_e];
                        var10 = 0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_42_0 = var10;
                        stackIn_42_1 = this.field_e;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 >= stackIn_42_1) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        this.field_q[var10] = -1;
                        var10++;
                        if (var16 != 0) {
                            statePc = 47;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var16 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var10 = 0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var10 >= this.field_k) {
                            statePc = 52;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        this.field_q[this.field_f[var10]] = var17.e(127);
                        var10++;
                        if (var16 != 0) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var16 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        this.field_b = new ie(this.field_q);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var10 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var10 >= this.field_k) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        this.field_j[this.field_f[var10]] = var17.e(-36);
                        var10++;
                        if (var16 != 0) {
                            statePc = 64;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var16 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var7 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var10 = 0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if ((this.field_k ^ -1) >= (var10 ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var22 = new byte[64];
                        var18.a(var22, 64, -91, 0);
                        this.field_n[this.field_f[var10]] = var22;
                        var10++;
                        if (var16 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var16 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var10 = 0;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if ((var10 ^ -1) <= (this.field_k ^ -1)) {
                            statePc = 70;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        this.field_p[this.field_f[var10]] = var17.e(-31);
                        var10++;
                        if (var16 != 0) {
                            statePc = 93;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (var16 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (7 <= var4) {
                            statePc = 93;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var10 = 0;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (this.field_k <= var10) {
                            statePc = 76;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        this.field_m[this.field_f[var10]] = var17.j(param0 + 1227);
                        var10++;
                        if (var16 != 0) {
                            statePc = 77;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var16 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var10 = 0;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if ((this.field_k ^ -1) >= (var10 ^ -1)) {
                            statePc = 92;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var11 = this.field_f[var10];
                        var8 = 0;
                        var12 = this.field_m[var11];
                        array$2 = new int[var12];
                        this.field_a[var11] = array$2;
                        var13 = -1;
                        stackIn_114_0 = 0;
                        stackIn_80_0 = stackIn_114_0;
                        if (var16 != 0) {
                            statePc = 114;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var14 = stackIn_80_0;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if ((var12 ^ -1) >= (var14 ^ -1)) {
                            statePc = 87;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        dupTemp$3 = var8 + var17.j(17277);
                        var8 = dupTemp$3;
                        dupTemp$4 = this.field_a[var11];
                        dupTemp$4[var14] = dupTemp$3;
                        var15 = dupTemp$3;
                        stackIn_88_0 = var13;
                        stackIn_83_0 = stackIn_88_0;
                        stackIn_88_1 = var15;
                        stackIn_83_1 = stackIn_88_1;
                        if (var16 != 0) {
                            statePc = 88;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (stackIn_83_0 < stackIn_83_1) {
                            statePc = 85;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var13 = var15;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var14++;
                        if (var16 == 0) {
                            statePc = 81;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        this.field_r[var11] = 1 + var13;
                        stackIn_88_0 = var13 - -1 ^ -1;
                        stackIn_88_1 = var12 ^ -1;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (stackIn_88_0 == stackIn_88_1) {
                            statePc = 90;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        this.field_a[var11] = null;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var10++;
                        if (var16 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (var16 == 0) {
                            statePc = 113;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var10 = 0;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (var10 >= this.field_k) {
                            statePc = 98;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        this.field_m[this.field_f[var10]] = var17.m(-25141);
                        var10++;
                        if (var16 != 0) {
                            statePc = 99;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (var16 == 0) {
                            statePc = 94;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var10 = 0;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if ((var10 ^ -1) <= (this.field_k ^ -1)) {
                            statePc = 113;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var11 = this.field_f[var10];
                        var12 = this.field_m[var11];
                        var8 = 0;
                        var13 = -1;
                        array$5 = new int[var12];
                        this.field_a[var11] = array$5;
                        stackIn_114_0 = 0;
                        stackIn_102_0 = stackIn_114_0;
                        if (var16 != 0) {
                            statePc = 114;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        var14 = stackIn_102_0;
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (var12 <= var14) {
                            statePc = 109;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        dupTemp$6 = var8 + var17.m(-25141);
                        var8 = dupTemp$6;
                        dupTemp$7 = this.field_a[var11];
                        dupTemp$7[var14] = dupTemp$6;
                        var15 = dupTemp$6;
                        stackIn_110_0 = var13 ^ -1;
                        stackIn_105_0 = stackIn_110_0;
                        stackIn_110_1 = var15 ^ -1;
                        stackIn_105_1 = stackIn_110_1;
                        if (var16 != 0) {
                            statePc = 110;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (stackIn_105_0 > stackIn_105_1) {
                            statePc = 107;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var13 = var15;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var14++;
                        if (var16 == 0) {
                            statePc = 103;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        this.field_r[var11] = var13 + 1;
                        stackIn_110_0 = var13 - -1 ^ -1;
                        stackIn_110_1 = var12 ^ -1;
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (stackIn_110_0 != stackIn_110_1) {
                            statePc = 112;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        this.field_a[var11] = null;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var10++;
                        if (var16 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        stackIn_114_0 = var6;
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (stackIn_114_0 == 0) {
                            statePc = 138;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        this.field_o = new int[1 + var9][];
                        this.field_t = new ie[var9 + 1];
                        var10 = 0;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (var10 >= this.field_k) {
                            statePc = 138;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        var11 = this.field_f[var10];
                        var12 = this.field_m[var11];
                        array$8 = new int[this.field_r[var11]];
                        this.field_o[var11] = array$8;
                        if (var16 != 0) {
                            statePc = 139;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        var13 = 0;
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if ((this.field_r[var11] ^ -1) >= (var13 ^ -1)) {
                            statePc = 123;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        this.field_o[var11][var13] = -1;
                        var13++;
                        if (var16 != 0) {
                            statePc = 124;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (var16 == 0) {
                            statePc = 119;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var13 = 0;
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if ((var13 ^ -1) <= (var12 ^ -1)) {
                            statePc = 131;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (var16 != 0) {
                            statePc = 132;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if (null != this.field_a[var11]) {
                            statePc = 129;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        var14 = var13;
                        if (var16 == 0) {
                            statePc = 130;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        var14 = this.field_a[var11][var13];
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        this.field_o[var11][var14] = var17.e(-99);
                        var13++;
                        if (var16 == 0) {
                            statePc = 125;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        this.field_t[var11] = new ie(this.field_o[var11]);
                        var10++;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (var16 == 0) {
                            statePc = 116;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 134: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_136_0 = (RuntimeException) (var3);
                    stackIn_135_0 = stackIn_136_0;
                    stackIn_136_1 = new StringBuilder().append("wd.B(").append(param0).append(',');
                    stackIn_135_1 = stackIn_136_1;
                    if (param1 == null) {
                        statePc = 136;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    stackIn_137_0 = (RuntimeException) ((Object) stackIn_135_0);
                    stackIn_137_1 = (StringBuilder) ((Object) stackIn_135_1);
                    stackIn_137_2 = "{...}";
                    statePc = 137;
                    continue stateLoop;
                }
                case 136: {
                    stackIn_137_0 = (RuntimeException) ((Object) stackIn_136_0);
                    stackIn_137_1 = (StringBuilder) ((Object) stackIn_136_1);
                    stackIn_137_2 = "null";
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    throw la.a((Throwable) ((Object) stackIn_137_0), stackIn_137_2 + ')');
                }
                case 138: {
                    return;
                }
                case 139: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_h = null;
        field_i = null;
        field_s = null;
    }

    final static void a(int param0, boolean param1) {
        ug var2 = null;
        int var3 = 0;
        mk var4 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4 = (mk) ((Object) eb.field_C.a((byte) -117));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 == null) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        fc.a(var4, (byte) 108, param0);
                        var4 = (mk) ((Object) eb.field_C.d((byte) 63));
                        if (var3 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
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
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param1) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        field_i = (ud) null;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2 = t.field_v.a((byte) -117);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var2 == null) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        lf.a(25197, param0);
                        var2 = t.field_v.d((byte) 63);
                        if (var3 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var3 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw la.a((Throwable) ((Object) var2_ref), "wd.C(" + param0 + ',' + param1 + ')');
                }
                case 15: {
                    return;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    wd(byte[] param0, int param1, byte[] param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            this.field_d = w.a(param0.length, param0, -18694);
            if (param1 == this.field_d) {
              L1: {
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    if (-65 == (param2.length ^ -1)) {
                      this.field_c = ie.a(-106, param0, param0.length, 0);
                      var4_int = 0;
                      L3: while (true) {
                        if (-65 >= (var4_int ^ -1)) {
                          break L2;
                        } else {
                          if (var5 != 0) {
                            break L1;
                          } else {
                            if (param2[var4_int] == this.field_c[var4_int]) {
                              var4_int++;
                              if (var5 == 0) {
                                continue L3;
                              } else {
                                break L2;
                              }
                            } else {
                              throw new RuntimeException();
                            }
                          }
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
                this.a(16050, param0);
                break L1;
              }
              break L0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (runtimeException);

            stackIn_16_1 = new StringBuilder().append("wd.<init>(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
    }

    static {
        field_g = false;
        field_h = new pj();
        field_s = "Create your own free Jagex account";
    }
}
