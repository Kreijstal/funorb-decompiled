/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    qq field_d;
    static String field_m;
    static String field_k;
    static String field_f;
    int[][] field_i;
    int[] field_l;
    private byte[] field_g;
    int field_h;
    int[] field_s;
    int field_o;
    private int[][] field_c;
    byte[][] field_a;
    int[] field_p;
    int field_e;
    qq[] field_n;
    private int field_q;
    int[] field_b;
    private int[] field_j;
    int[] field_r;

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
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackIn_114_0 = 0;
        int[] stackIn_118_0 = null;
        int[] stackIn_128_0 = null;
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
        k var17 = null;
        k var18 = null;
        byte[] var22 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var17 = new k(hb.a(param1, param0));
                        var18 = var17;
                        var4 = var18.g(31365);
                        if (5 > var4) {
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
                        if (7 >= var4) {
                            statePc = 5;
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
                        statePc = 4;
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
                        if (-7 >= (var4 ^ -1)) {
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
                        this.field_h = 0;
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
                        this.field_h = var18.i(param0 ^ -1478490344);
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
                        var5 = var18.g(31365);
                        if (0 == (1 & var5)) {
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
                        if (-1 == (var5 & 2 ^ -1)) {
                            statePc = 14;
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
                        stackIn_15_0 = 1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = 0;
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
                        var7 = stackIn_15_0;
                        if (-8 < (var4 ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.field_q = var18.e((byte) -49);
                        if (var16 == 0) {
                            statePc = 19;
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
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.field_q = var18.d((byte) 69);
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
                        var8 = 0;
                        this.field_l = new int[this.field_q];
                        var9 = -1;
                        if (var4 >= 7) {
                            statePc = 27;
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
                        var10 = 0;
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
                        if ((this.field_q ^ -1) >= (var10 ^ -1)) {
                            statePc = 26;
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
                        dupTemp$0 = var8 + var17.d((byte) 69);
                        var8 = dupTemp$0;
                        this.field_l[var10] = dupTemp$0;
                        stackIn_39_0 = this.field_l[var10] ^ -1;
                        stackIn_23_0 = stackIn_39_0;
                        stackIn_39_1 = var9 ^ -1;
                        stackIn_23_1 = stackIn_39_1;
                        if (var16 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 >= stackIn_23_1) {
                            statePc = 25;
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
                        var9 = this.field_l[var10];
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var10++;
                        if (var16 == 0) {
                            statePc = 21;
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
                        if (var16 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var10 = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var10 >= this.field_q) {
                            statePc = 33;
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
                        dupTemp$1 = var8 + var17.e((byte) -49);
                        var8 = dupTemp$1;
                        this.field_l[var10] = dupTemp$1;
                        stackIn_39_0 = this.field_l[var10];
                        stackIn_30_0 = stackIn_39_0;
                        stackIn_39_1 = var9;
                        stackIn_30_1 = stackIn_39_1;
                        if (var16 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (stackIn_30_0 <= stackIn_30_1) {
                            statePc = 32;
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
                        var9 = this.field_l[var10];
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var10++;
                        if (var16 == 0) {
                            statePc = 28;
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
                        this.field_e = var9 - -1;
                        this.field_r = new int[this.field_e];
                        this.field_p = new int[this.field_e];
                        this.field_s = new int[this.field_e];
                        this.field_b = new int[this.field_e];
                        if (var7 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        this.field_a = new byte[this.field_e][];
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
                        this.field_i = new int[this.field_e][];
                        if (var6 != 0) {
                            statePc = 37;
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
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        this.field_j = new int[this.field_e];
                        var10 = 0;
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
                        stackIn_39_0 = var10;
                        stackIn_39_1 = this.field_e;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 >= stackIn_39_1) {
                            statePc = 43;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        this.field_j[var10] = -1;
                        var10++;
                        if (var16 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var16 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var10 = 0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (this.field_q <= var10) {
                            statePc = 49;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        this.field_j[this.field_l[var10]] = var17.i(param0 + -1478490344);
                        var10++;
                        if (var16 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var16 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        this.field_d = new qq(this.field_j);
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var10 = 0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (this.field_q <= var10) {
                            statePc = 55;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        this.field_r[this.field_l[var10]] = var17.i(param0 + -1478490344);
                        var10++;
                        if (var16 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var16 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var7 != 0) {
                            statePc = 61;
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
                        var10 = 0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (this.field_q <= var10) {
                            statePc = 72;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        this.field_p[this.field_l[var10]] = var17.i(vg.a(param0, -1478490344));
                        var10++;
                        if (var16 != 0) {
                            statePc = 94;
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
                        if (var16 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var10 = 0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if ((this.field_q ^ -1) >= (var10 ^ -1)) {
                            statePc = 66;
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
                        var22 = new byte[64];
                        var18.a(0, param0 + -6351, 64, var22);
                        this.field_a[this.field_l[var10]] = var22;
                        var10++;
                        if (var16 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var16 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 65;
                        }
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
                        var10 = 0;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (this.field_q <= var10) {
                            statePc = 72;
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
                        this.field_p[this.field_l[var10]] = var17.i(vg.a(param0, -1478490344));
                        var10++;
                        if (var16 != 0) {
                            statePc = 94;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var16 == 0) {
                            statePc = 68;
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
                        if ((var4 ^ -1) <= -8) {
                            statePc = 94;
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
                        var10 = 0;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if ((this.field_q ^ -1) >= (var10 ^ -1)) {
                            statePc = 78;
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
                        this.field_s[this.field_l[var10]] = var17.d((byte) 69);
                        var10++;
                        if (var16 != 0) {
                            statePc = 79;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var16 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 77;
                        }
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
                        var10 = 0;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (this.field_q <= var10) {
                            statePc = 93;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var11 = this.field_l[var10];
                        var12 = this.field_s[var11];
                        var8 = 0;
                        array$2 = new int[var12];
                        this.field_i[var11] = array$2;
                        var13 = -1;
                        stackIn_114_0 = 0;
                        stackIn_82_0 = stackIn_114_0;
                        if (var16 != 0) {
                            statePc = 114;
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
                        var14 = stackIn_82_0;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (var12 <= var14) {
                            statePc = 89;
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
                        dupTemp$3 = var8 + var17.d((byte) 69);
                        var8 = dupTemp$3;
                        dupTemp$4 = this.field_i[var11];
                        dupTemp$4[var14] = dupTemp$3;
                        var15 = dupTemp$3;
                        stackIn_90_0 = var15;
                        stackIn_85_0 = stackIn_90_0;
                        stackIn_90_1 = var13;
                        stackIn_85_1 = stackIn_90_1;
                        if (var16 != 0) {
                            statePc = 90;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (stackIn_85_0 > stackIn_85_1) {
                            statePc = 87;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var13 = var15;
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
                        var14++;
                        if (var16 == 0) {
                            statePc = 83;
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
                        this.field_b[var11] = 1 + var13;
                        stackIn_90_0 = var13 - -1 ^ -1;
                        stackIn_90_1 = var12 ^ -1;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (stackIn_90_0 != stackIn_90_1) {
                            statePc = 92;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        this.field_i[var11] = null;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var10++;
                        if (var16 == 0) {
                            statePc = 80;
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
                        if (var16 == 0) {
                            statePc = 113;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var10 = 0;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (var10 >= this.field_q) {
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
                        this.field_s[this.field_l[var10]] = var17.e((byte) -49);
                        var10++;
                        if (var16 != 0) {
                            statePc = 100;
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
                        if (var16 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
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
                        var10 = 0;
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
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (this.field_q <= var10) {
                            statePc = 113;
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
                        var11 = this.field_l[var10];
                        var12 = this.field_s[var11];
                        var8 = 0;
                        array$5 = new int[var12];
                        this.field_i[var11] = array$5;
                        var13 = -1;
                        stackIn_114_0 = 0;
                        stackIn_103_0 = stackIn_114_0;
                        if (var16 != 0) {
                            statePc = 114;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var14 = stackIn_103_0;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if ((var12 ^ -1) >= (var14 ^ -1)) {
                            statePc = 109;
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
                        dupTemp$6 = var8 + var17.e((byte) -49);
                        var8 = dupTemp$6;
                        dupTemp$7 = this.field_i[var11];
                        dupTemp$7[var14] = dupTemp$6;
                        var15 = dupTemp$6;
                        stackIn_110_0 = var15;
                        stackIn_106_0 = stackIn_110_0;
                        stackIn_110_1 = var13;
                        stackIn_106_1 = stackIn_110_1;
                        if (var16 != 0) {
                            statePc = 110;
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
                        if (stackIn_106_0 <= stackIn_106_1) {
                            statePc = 108;
                        } else {
                            statePc = 107;
                        }
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
                            statePc = 104;
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
                        this.field_b[var11] = 1 + var13;
                        stackIn_110_0 = var13 - -1;
                        stackIn_110_1 = var12;
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
                        this.field_i[var11] = null;
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
                            statePc = 101;
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
                        this.field_n = new qq[1 + var9];
                        this.field_c = new int[1 + var9][];
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
                        if ((var10 ^ -1) <= (this.field_q ^ -1)) {
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
                        var11 = this.field_l[var10];
                        stackIn_118_0 = this.field_s;
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        var12 = stackIn_118_0[var11];
                        array$8 = new int[this.field_b[var11]];
                        this.field_c[var11] = array$8;
                        if (var16 != 0) {
                            statePc = 139;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var13 = 0;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if ((var13 ^ -1) <= (this.field_b[var11] ^ -1)) {
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
                        this.field_c[var11][var13] = -1;
                        var13++;
                        if (var16 != 0) {
                            statePc = 125;
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
                        if (var16 == 0) {
                            statePc = 120;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
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
                        var13 = 0;
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
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (var13 >= var12) {
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
                        stackIn_118_0 = this.field_i[var11];
                        stackIn_128_0 = stackIn_118_0;
                        if (var16 != 0) {
                            statePc = 118;
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
                        if (stackIn_128_0 == null) {
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
                        var14 = this.field_i[var11][var13];
                        if (var16 == 0) {
                            statePc = 131;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        var14 = var13;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        this.field_c[var11][var14] = var17.i(-1478490344);
                        var13++;
                        if (var16 == 0) {
                            statePc = 126;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        this.field_n[var11] = new qq(this.field_c[var11]);
                        var10++;
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
                    stackIn_136_1 = new StringBuilder().append("be.B(").append(param0).append(',');
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
                    throw fa.a((Throwable) ((Object) stackIn_137_0), stackIn_137_2 + ')');
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

    final static void a(long param0, boolean param1) {
        try {
            Throwable decompiledCaughtException = null;
            InterruptedException var3 = null;
            try {
              L0: {
                L1: {
                  if (param1) {
                    break L1;
                  } else {
                    field_f = (String) null;
                    break L1;
                  }
                }
                Thread.sleep(param0);
                break L0;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var3 = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_m = null;
        if (param0 != 0) {
            field_f = (String) null;
        }
        field_k = null;
    }

    be(byte[] param0, int param1, byte[] param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            this.field_o = pb.a(param0, param0.length, (byte) -120);
            if (this.field_o == param1) {
              L1: {
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    if (64 == param2.length) {
                      this.field_g = ho.a(4246, 0, param0, param0.length);
                      var4_int = 0;
                      L3: while (true) {
                        if (var4_int >= 64) {
                          break L2;
                        } else {
                          stackIn_13_0 = this;

                          if (var5 != 0) {
                            break L1;
                          } else {
                            if (((be) (this)).field_g[var4_int] == param2[var4_int]) {
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
                stackIn_13_0 = this;
                break L1;
              }
              this.a(0, param0);
              break L0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (runtimeException);

            stackIn_17_1 = new StringBuilder().append("be.<init>(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
    }

    static {
        field_m = "Hide chat to continue";
        field_k = "Asking to join <%0>'s game...";
        field_f = "No";
    }
}
