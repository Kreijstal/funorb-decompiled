/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el {
    private int field_u;
    int[] field_s;
    static ce field_n;
    int field_b;
    static int[] field_m;
    static boolean field_g;
    private int[][] field_o;
    private int[] field_k;
    int[] field_i;
    int[] field_c;
    private byte[] field_e;
    int field_l;
    db[] field_t;
    int field_r;
    db field_h;
    int[] field_q;
    int[] field_j;
    byte[][] field_p;
    int[][] field_f;
    static String field_a;
    static int field_d;

    private final void a(byte[] param0, byte param1) {
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
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_79_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        int stackIn_101_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_112_0 = 0;
        int[] stackIn_117_0 = null;
        int[] stackIn_127_0 = null;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        RuntimeException stackIn_135_0 = null;
        StringBuilder stackIn_135_1 = null;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        String stackIn_136_2 = null;
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
        oa var17 = null;
        oa var18 = null;
        byte[] var22 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var17 = new oa(lk.a(-110, param0));
                        var18 = var17;
                        var4 = var18.d((byte) 85);
                        if (var4 < 5) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 133;
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
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (6 <= var4) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.field_b = 0;
                        if (var16 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_b = var18.c((byte) -108);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5 = var18.d((byte) 52);
                        if ((var5 & 1) == 0) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 133;
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
                        statePc = 133;
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
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6 = stackIn_12_0;
                        if (var4 >= 7) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_u = var18.a((byte) -102);
                        if (var16 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.field_u = var18.h(-16777216);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (0 == (var5 & 2)) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 133;
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
                        statePc = 133;
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
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var7 = stackIn_19_0;
                        var8 = 0;
                        this.field_c = new int[this.field_u];
                        var9 = -1;
                        if ((var4 ^ -1) > -8) {
                            statePc = 27;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 133;
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
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (this.field_u <= var10) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        dupTemp$0 = var8 + var17.h(-16777216);
                        var8 = dupTemp$0;
                        this.field_c[var10] = dupTemp$0;
                        stackIn_39_0 = var9 ^ -1;
                        stackIn_23_0 = stackIn_39_0;
                        stackIn_39_1 = this.field_c[var10] ^ -1;
                        stackIn_23_1 = stackIn_39_1;
                        if (var16 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 <= stackIn_23_1) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var9 = this.field_c[var10];
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 133;
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
                        statePc = 133;
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
                        statePc = 133;
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
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((this.field_u ^ -1) >= (var10 ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        dupTemp$1 = var8 + var17.a((byte) -95);
                        var8 = dupTemp$1;
                        this.field_c[var10] = dupTemp$1;
                        stackIn_39_0 = this.field_c[var10];
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
                        statePc = 133;
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
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var9 = this.field_c[var10];
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 133;
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
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        this.field_l = var9 - -1;
                        this.field_q = new int[this.field_l];
                        this.field_j = new int[this.field_l];
                        this.field_i = new int[this.field_l];
                        this.field_f = new int[this.field_l][];
                        this.field_s = new int[this.field_l];
                        if (var7 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        this.field_p = new byte[this.field_l][];
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var6 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        this.field_k = new int[this.field_l];
                        var10 = 0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_39_0 = var10;
                        stackIn_39_1 = this.field_l;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 133;
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
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        this.field_k[var10] = -1;
                        var10++;
                        if (var16 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 133;
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
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 133;
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
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if ((var10 ^ -1) <= (this.field_u ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        this.field_k[this.field_c[var10]] = var17.c((byte) -128);
                        var10++;
                        if (var16 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 133;
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
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        this.field_h = new db(this.field_k);
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (param1 <= -111) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        el.a(-92);
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var10 = 0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if ((this.field_u ^ -1) >= (var10 ^ -1)) {
                            statePc = 57;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        this.field_j[this.field_c[var10]] = var17.c((byte) -127);
                        var10++;
                        if (var16 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var16 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var7 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var10 = 0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (this.field_u <= var10) {
                            statePc = 63;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var22 = new byte[64];
                        var18.a(64, 2, var22, 0);
                        this.field_p[this.field_c[var10]] = var22;
                        var10++;
                        if (var16 != 0) {
                            statePc = 64;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var16 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var10 = 0;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if ((this.field_u ^ -1) >= (var10 ^ -1)) {
                            statePc = 69;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        this.field_q[this.field_c[var10]] = var17.c((byte) -123);
                        var10++;
                        if (var16 != 0) {
                            statePc = 92;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var16 == 0) {
                            statePc = 65;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var4 >= 7) {
                            statePc = 92;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var10 = 0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if ((this.field_u ^ -1) >= (var10 ^ -1)) {
                            statePc = 75;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        this.field_s[this.field_c[var10]] = var17.a((byte) -121);
                        var10++;
                        if (var16 != 0) {
                            statePc = 76;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var16 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var10 = 0;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (this.field_u <= var10) {
                            statePc = 91;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var11 = this.field_c[var10];
                        var12 = this.field_s[var11];
                        var8 = 0;
                        array$2 = new int[var12];
                        this.field_f[var11] = array$2;
                        var13 = -1;
                        stackIn_112_0 = 0;
                        stackIn_79_0 = stackIn_112_0;
                        if (var16 != 0) {
                            statePc = 112;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var14 = stackIn_79_0;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if ((var12 ^ -1) >= (var14 ^ -1)) {
                            statePc = 86;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        dupTemp$3 = var8 + var17.a((byte) -96);
                        var8 = dupTemp$3;
                        dupTemp$4 = this.field_f[var11];
                        dupTemp$4[var14] = dupTemp$3;
                        var15 = dupTemp$3;
                        stackIn_87_0 = var13;
                        stackIn_82_0 = stackIn_87_0;
                        stackIn_87_1 = var15;
                        stackIn_82_1 = stackIn_87_1;
                        if (var16 != 0) {
                            statePc = 87;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (stackIn_82_0 < stackIn_82_1) {
                            statePc = 84;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var13 = var15;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var14++;
                        if (var16 == 0) {
                            statePc = 80;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        this.field_i[var11] = 1 + var13;
                        stackIn_87_0 = var13 + 1;
                        stackIn_87_1 = var12;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (stackIn_87_0 == stackIn_87_1) {
                            statePc = 89;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        this.field_f[var11] = null;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var10++;
                        if (var16 == 0) {
                            statePc = 77;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (var16 == 0) {
                            statePc = 111;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var10 = 0;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (var10 >= this.field_u) {
                            statePc = 97;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        this.field_s[this.field_c[var10]] = var17.h(-16777216);
                        var10++;
                        if (var16 != 0) {
                            statePc = 98;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (var16 == 0) {
                            statePc = 93;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var10 = 0;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (this.field_u <= var10) {
                            statePc = 111;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var11 = this.field_c[var10];
                        var8 = 0;
                        var12 = this.field_s[var11];
                        array$5 = new int[var12];
                        this.field_f[var11] = array$5;
                        var13 = -1;
                        stackIn_112_0 = 0;
                        stackIn_101_0 = stackIn_112_0;
                        if (var16 != 0) {
                            statePc = 112;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var14 = stackIn_101_0;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if ((var12 ^ -1) >= (var14 ^ -1)) {
                            statePc = 107;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        dupTemp$6 = var8 + var17.h(-16777216);
                        var8 = dupTemp$6;
                        dupTemp$7 = this.field_f[var11];
                        dupTemp$7[var14] = dupTemp$6;
                        var15 = dupTemp$6;
                        stackIn_108_0 = var15;
                        stackIn_104_0 = stackIn_108_0;
                        stackIn_108_1 = var13;
                        stackIn_104_1 = stackIn_108_1;
                        if (var16 != 0) {
                            statePc = 108;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (stackIn_104_0 <= stackIn_104_1) {
                            statePc = 106;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        var13 = var15;
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        var14++;
                        if (var16 == 0) {
                            statePc = 102;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        this.field_i[var11] = 1 + var13;
                        stackIn_108_0 = var12;
                        stackIn_108_1 = var13 - -1;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (stackIn_108_0 != stackIn_108_1) {
                            statePc = 110;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        this.field_f[var11] = null;
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        var10++;
                        if (var16 == 0) {
                            statePc = 99;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        stackIn_112_0 = var6;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (stackIn_112_0 != 0) {
                            statePc = 114;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        this.field_t = new db[var9 + 1];
                        this.field_o = new int[var9 + 1][];
                        var10 = 0;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if ((this.field_u ^ -1) >= (var10 ^ -1)) {
                            statePc = 137;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        var11 = this.field_c[var10];
                        stackIn_117_0 = this.field_s;
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        var12 = stackIn_117_0[var11];
                        array$8 = new int[this.field_i[var11]];
                        this.field_o[var11] = array$8;
                        if (var16 != 0) {
                            statePc = 138;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 133;
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
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if ((this.field_i[var11] ^ -1) >= (var13 ^ -1)) {
                            statePc = 123;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 133;
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
                        statePc = 133;
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
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 133;
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
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if ((var12 ^ -1) >= (var13 ^ -1)) {
                            statePc = 131;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        stackIn_117_0 = this.field_f[var11];
                        stackIn_127_0 = stackIn_117_0;
                        if (var16 != 0) {
                            statePc = 117;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        if (stackIn_127_0 != null) {
                            statePc = 129;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 133;
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
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        var14 = this.field_f[var11][var13];
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        this.field_o[var11][var14] = var17.c((byte) -126);
                        var13++;
                        if (var16 == 0) {
                            statePc = 125;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        this.field_t[var11] = new db(this.field_o[var11]);
                        var10++;
                        if (var16 == 0) {
                            statePc = 115;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 133: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_135_0 = (RuntimeException) (var3);
                    stackIn_134_0 = stackIn_135_0;
                    stackIn_135_1 = new StringBuilder().append("el.F(");
                    stackIn_134_1 = stackIn_135_1;
                    if (param0 == null) {
                        statePc = 135;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    stackIn_136_0 = (RuntimeException) ((Object) stackIn_134_0);
                    stackIn_136_1 = (StringBuilder) ((Object) stackIn_134_1);
                    stackIn_136_2 = "{...}";
                    statePc = 136;
                    continue stateLoop;
                }
                case 135: {
                    stackIn_136_0 = (RuntimeException) ((Object) stackIn_135_0);
                    stackIn_136_1 = (StringBuilder) ((Object) stackIn_135_1);
                    stackIn_136_2 = "null";
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    throw ch.a((Throwable) ((Object) stackIn_136_0), stackIn_136_2 + ',' + param1 + ')');
                }
                case 137: {
                    return;
                }
                case 138: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        char stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        char stackOut_13_0;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 >= param1) {
                break L1;
              } else {
                if (param1 < 128) {
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 < 160) {
                break L2;
              } else {
                if (param1 > 255) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
            L3: {
              L4: {
                if (param1 != 0) {
                  var6 = af.field_a;
                  var2 = var6;
                  var3 = 0;
                  L5: while (true) {
                    if (var6.length <= var3) {
                      break L4;
                    } else {
                      var4 = var6[var3];
                      stackOut_13_0 = param1;
                      stackIn_20_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_20_1 = var4;

                      if (var5 != 0) {
                        break L3;
                      } else {
                        if (stackIn_14_0 == stackIn_20_1) {
                          stackIn_17_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var3++;
                          if (var5 == 0) {
                            continue L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L4;
                }
              }
              stackIn_20_0 = param0;
              stackIn_20_1 = -9904;
              break L3;
            }
            L6: {
              if (stackIn_20_0 == stackIn_20_1) {
                break L6;
              } else {
                field_n = (ce) null;
                break L6;
              }
            }
            stackIn_23_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2_ref), "el.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            return stackIn_23_0 != 0;
          }
        }
    }

    final static void b(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        th.field_c.a(0);
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
                        if (var1_int >= 32) {
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
                        kd.field_b[var1_int] = 0L;
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
                        if (param0 == -6491) {
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
                        el.a(5);
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
                        if (var1_int >= 32) {
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
                        ik.field_ib[var1_int] = 0L;
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
                        ca.field_b = 0;
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
                    throw ch.a((Throwable) ((Object) runtimeException), "el.E(" + param0 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, byte param1, String param2, String[] param3) {
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 33) {
                break L1;
              } else {
                el.a((byte) -81);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  rh.field_v = gd.field_l;
                  if (-256 != (param0 ^ -1)) {
                    break L4;
                  } else {
                    L5: {
                      if (ab.field_j >= 13) {
                        stackIn_7_0 = 0;
                        break L5;
                      } else {
                        stackIn_7_0 = 1;
                        break L5;
                      }
                    }
                    q.field_h = de.a(stackIn_7_0 != 0, (byte) -116);
                    if (var5 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L6: {
                  L7: {
                    if (-101 < (param0 ^ -1)) {
                      break L7;
                    } else {
                      if (param0 <= 105) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  q.field_h = mk.a(242763393, param2, param0);
                  if (var5 == 0) {
                    break L3;
                  } else {
                    break L6;
                  }
                }
                q.field_h = ve.a(param3, (byte) -113);
                break L2;
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("el.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L8;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L9;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L9;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
    }

    final static boolean a(int param0) {
        if (param0 <= 116) {
            return true;
        }
        return c.field_d;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 75) {
            field_a = (String) null;
        }
        field_m = null;
        field_n = null;
    }

    el(byte[] param0, int param1, byte[] param2) {
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
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            this.field_r = v.a(param0, param0.length, (byte) 40);
            if ((this.field_r ^ -1) == (param1 ^ -1)) {
              L1: {
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    if (param2.length == 64) {
                      this.field_e = n.a(param0, param0.length, -5705, 0);
                      var4_int = 0;
                      L3: while (true) {
                        if (var4_int >= 64) {
                          break L2;
                        } else {
                          if (var5 != 0) {
                            break L1;
                          } else {
                            if (param2[var4_int] == this.field_e[var4_int]) {
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
                this.a(param0, (byte) -114);
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

            stackIn_16_1 = new StringBuilder().append("el.<init>(");

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
          throw ch.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
    }

    static {
        field_m = new int[8192];
        field_a = "Go Back";
        field_n = new ce();
        field_d = -1;
    }
}
