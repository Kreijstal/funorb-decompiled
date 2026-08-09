/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp {
    int[] field_i;
    kca field_a;
    kca[] field_p;
    int field_l;
    int field_k;
    int[] field_j;
    int[] field_m;
    int[][] field_g;
    private int field_f;
    private int[] field_n;
    int[] field_d;
    byte[][] field_c;
    int[] field_h;
    private int[][] field_o;
    int field_e;
    private byte[] field_b;

    private final void a(byte param0, byte[] param1) {
        int dupTemp$9 = 0;
        int dupTemp$10 = 0;
        int[] array$11 = null;
        int dupTemp$12 = 0;
        int[] dupTemp$13 = null;
        int[] array$14 = null;
        int dupTemp$15 = 0;
        int[] dupTemp$16 = null;
        int[] array$17 = null;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        int[] stackIn_145_0 = null;
        RuntimeException stackIn_152_0 = null;
        StringBuilder stackIn_152_1 = null;
        RuntimeException stackIn_154_0 = null;
        StringBuilder stackIn_154_1 = null;
        RuntimeException stackIn_155_0 = null;
        StringBuilder stackIn_155_1 = null;
        String stackIn_155_2 = null;
        RuntimeException decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        ds var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        byte[] var11_ref_byte__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = VoidHunters.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = new ds(rob.a(0, param1));
                        var4 = var3.e((byte) -87);
                        if ((var4 ^ -1) > -6) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (7 < var4) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var4 ^ -1) > -7) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.field_e = var3.h(106);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_e = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5 = var3.e((byte) -117);
                        if (0 == (1 & var5)) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_18_0 = 1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var6 = stackIn_18_0;
                        if ((var5 & 2) == 0) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_22_0 = 1;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_22_0 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var7 = stackIn_22_0;
                        if (var4 >= 7) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.field_f = var3.e(1869);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        this.field_f = var3.n(-24099);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var8 = 0;
                        var9 = -1;
                        this.field_i = new int[this.field_f];
                        if (-8 < (var4 ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 151;
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
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (this.field_f <= var10) {
                            statePc = 38;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        dupTemp$9 = var8 + var3.n(-24099);
                        var8 = dupTemp$9;
                        this.field_i[var10] = dupTemp$9;
                        stackIn_67_0 = var9;
                        stackIn_32_0 = stackIn_67_0;
                        stackIn_67_1 = this.field_i[var10];
                        stackIn_32_1 = stackIn_67_1;
                        if (false) {
                            statePc = 67;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (stackIn_32_0 < stackIn_32_1) {
                            statePc = 36;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9 = this.field_i[var10];
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var10++;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var10 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if ((var10 ^ -1) <= (this.field_f ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        dupTemp$10 = var8 + var3.e(1869);
                        var8 = dupTemp$10;
                        this.field_i[var10] = dupTemp$10;
                        stackIn_67_0 = this.field_i[var10];
                        stackIn_42_0 = stackIn_67_0;
                        stackIn_67_1 = var9;
                        stackIn_42_1 = stackIn_67_1;
                        if (false) {
                            statePc = 67;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 <= stackIn_42_1) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var9 = this.field_i[var10];
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var10++;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        this.field_l = 1 + var9;
                        this.field_h = new int[this.field_l];
                        if (var7 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        this.field_c = new byte[this.field_l][];
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        this.field_m = new int[this.field_l];
                        this.field_j = new int[this.field_l];
                        this.field_d = new int[this.field_l];
                        this.field_g = new int[this.field_l][];
                        if (var6 == 0) {
                            statePc = 65;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        this.field_n = new int[this.field_l];
                        var10 = 0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var10 >= this.field_l) {
                            statePc = 57;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        this.field_n[var10] = -1;
                        var10++;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var10 = 0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var10 >= this.field_f) {
                            statePc = 64;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        this.field_n[this.field_i[var10]] = var3.h(25);
                        var10++;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        this.field_a = new kca(this.field_n);
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var10 = 0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackIn_67_0 = var10;
                        stackIn_67_1 = this.field_f;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (stackIn_67_0 >= stackIn_67_1) {
                            statePc = 73;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        this.field_d[this.field_i[var10]] = var3.h(122);
                        var10++;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var7 == 0) {
                            statePc = 79;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var10 = 0;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if ((this.field_f ^ -1) >= (var10 ^ -1)) {
                            statePc = 79;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var11_ref_byte__ = new byte[64];
                        var3.a(0, var11_ref_byte__, (byte) -59, 64);
                        this.field_c[this.field_i[var10]] = var11_ref_byte__;
                        var10++;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var10 = 0;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (this.field_f <= var10) {
                            statePc = 86;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        this.field_h[this.field_i[var10]] = var3.h(56);
                        var10++;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (param0 >= 0) {
                            statePc = 89;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        qp.a(false, 91, -58);
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if ((var4 ^ -1) > -8) {
                            statePc = 111;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var10 = 0;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (this.field_f <= var10) {
                            statePc = 95;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        this.field_j[this.field_i[var10]] = var3.n(-24099);
                        var10++;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var10 = 0;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (var10 >= this.field_f) {
                            statePc = 110;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var11 = this.field_i[var10];
                        var12 = this.field_j[var11];
                        var8 = 0;
                        var13 = -1;
                        array$11 = new int[var12];
                        this.field_g[var11] = array$11;
                        var14 = 0;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (var14 >= var12) {
                            statePc = 105;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        dupTemp$12 = var8 + var3.n(-24099);
                        var8 = dupTemp$12;
                        dupTemp$13 = this.field_g[var11];
                        dupTemp$13[var14] = dupTemp$12;
                        var15 = dupTemp$12;
                        stackIn_106_0 = var15 ^ -1;
                        stackIn_100_0 = stackIn_106_0;
                        stackIn_106_1 = var13 ^ -1;
                        stackIn_100_1 = stackIn_106_1;
                        if (false) {
                            statePc = 106;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (stackIn_100_0 >= stackIn_100_1) {
                            statePc = 104;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var13 = var15;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        var14++;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        this.field_m[var11] = var13 - -1;
                        stackIn_106_0 = var13 + 1;
                        stackIn_106_1 = var12;
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (stackIn_106_0 != stackIn_106_1) {
                            statePc = 109;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        this.field_g[var11] = null;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var10++;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var10 = 0;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if ((var10 ^ -1) <= (this.field_f ^ -1)) {
                            statePc = 116;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        this.field_j[this.field_i[var10]] = var3.e(1869);
                        var10++;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        var10 = 0;
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if ((this.field_f ^ -1) >= (var10 ^ -1)) {
                            statePc = 132;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        var11 = this.field_i[var10];
                        var8 = 0;
                        var12 = this.field_j[var11];
                        var13 = -1;
                        array$14 = new int[var12];
                        this.field_g[var11] = array$14;
                        var14 = 0;
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if ((var14 ^ -1) <= (var12 ^ -1)) {
                            statePc = 127;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        dupTemp$15 = var8 + var3.e(1869);
                        var8 = dupTemp$15;
                        dupTemp$16 = this.field_g[var11];
                        dupTemp$16[var14] = dupTemp$15;
                        var15 = dupTemp$15;
                        stackIn_128_0 = var13 ^ -1;
                        stackIn_121_0 = stackIn_128_0;
                        stackIn_128_1 = var15 ^ -1;
                        stackIn_121_1 = stackIn_128_1;
                        if (false) {
                            statePc = 128;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (stackIn_121_0 > stackIn_121_1) {
                            statePc = 125;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        var13 = var15;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        var14++;
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        this.field_m[var11] = 1 + var13;
                        stackIn_128_0 = var12;
                        stackIn_128_1 = 1 + var13;
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (stackIn_128_0 != stackIn_128_1) {
                            statePc = 131;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        this.field_g[var11] = null;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        var10++;
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (var6 != 0) {
                            statePc = 134;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        this.field_p = new kca[var9 + 1];
                        this.field_o = new int[1 + var9][];
                        var10 = 0;
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if ((var10 ^ -1) <= (this.field_f ^ -1)) {
                            statePc = 156;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        var11 = this.field_i[var10];
                        var12 = this.field_j[var11];
                        array$17 = new int[this.field_m[var11]];
                        this.field_o[var11] = array$17;
                        var13 = 0;
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if (this.field_m[var11] <= var13) {
                            statePc = 141;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        this.field_o[var11][var13] = -1;
                        var13++;
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        var13 = 0;
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        if ((var12 ^ -1) >= (var13 ^ -1)) {
                            statePc = 149;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        stackIn_145_0 = this.field_g[var11];
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        if (stackIn_145_0 != null) {
                            statePc = 147;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        var14 = var13;
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        var14 = this.field_g[var11][var13];
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        this.field_o[var11][var14] = var3.h(38);
                        var13++;
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        this.field_p[var11] = new kca(this.field_o[var11]);
                        var10++;
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 151: {
                    var3_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_154_0 = (RuntimeException) (var3_ref);
                    stackIn_152_0 = stackIn_154_0;
                    stackIn_154_1 = new StringBuilder().append("qp.A(").append(param0).append(',');
                    stackIn_152_1 = stackIn_154_1;
                    if (param1 == null) {
                        statePc = 154;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    stackIn_155_0 = (RuntimeException) ((Object) stackIn_152_0);
                    stackIn_155_1 = (StringBuilder) ((Object) stackIn_152_1);
                    stackIn_155_2 = "{...}";
                    statePc = 155;
                    continue stateLoop;
                }
                case 154: {
                    stackIn_155_0 = (RuntimeException) ((Object) stackIn_154_0);
                    stackIn_155_1 = (StringBuilder) ((Object) stackIn_154_1);
                    stackIn_155_2 = "null";
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    throw rta.a((Throwable) ((Object) stackIn_155_0), stackIn_155_2 + ')');
                }
                case 156: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static vu a(boolean param0, int param1, int param2) {
        soa stackIn_4_0;
        int stackIn_4_1;
        int stackIn_4_2;
        int stackIn_4_3;
        soa stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        llb stackIn_33_0 = null;
        llb stackIn_34_0 = null;
        String stackIn_34_1 = null;
        llb stackIn_37_0 = null;
        llb stackIn_38_0 = null;
        String stackIn_38_1 = null;
        int stackIn_42_0 = 0;
        Object stackIn_99_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        ij var4 = null;
        Object var5 = null;
        Object var6 = null;
        vu var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        hqb var17 = null;
        String var18 = null;
        int var19 = 0;
        var19 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              stackIn_4_0 = re.field_n.field_xb;

              stackIn_4_1 = 38;

              stackIn_4_2 = param1;

              stackIn_4_3 = param2 * (3 * (nna.field_w + 2));

              if (qg.field_a != re.field_n.field_xb) {
                stackIn_5_0 = (soa) ((Object) stackIn_4_0);
                stackIn_5_1 = stackIn_4_1;
                stackIn_5_2 = stackIn_4_2;
                stackIn_5_3 = stackIn_4_3;
                stackIn_5_4 = 0;
                break L1;
              } else {
                stackIn_5_0 = (soa) ((Object) stackIn_4_0);
                stackIn_5_1 = stackIn_4_1;
                stackIn_5_2 = stackIn_4_2;
                stackIn_5_3 = stackIn_4_3;
                stackIn_5_4 = 1;
                break L1;
              }
            }
            L2: {
              var3_int = ((soa) (Object) stackIn_5_0).a((byte) stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4 != 0, param0, nna.field_w + 2) ? 1 : 0;
              var4 = re.field_n.field_yb.field_lb;
              var5 = null;
              if ((iwa.field_b ^ -1) != -3) {
                L3: {
                  rtb.field_h.field_R = neb.field_p;
                  ci.field_c.field_y = false;
                  if ((iwa.field_b ^ -1) != -2) {
                    re.field_n.field_xb.field_xb.field_R = dsa.field_o;
                    break L3;
                  } else {
                    re.field_n.field_xb.field_xb.field_R = iha.field_o;
                    break L3;
                  }
                }
                igb.a(re.field_n.field_yb, (byte) -100);
                break L2;
              } else {
                ci.field_c.field_y = true;
                rtb.field_h.field_R = isa.a(qna.field_o, new String[]{kbb.field_q}, param1 + 89);
                re.field_n.field_xb.field_xb.field_R = null;
                var6 = null;
                var7 = (vu) ((Object) var4.d(0));
                L4: while (true) {
                  if (null == var7) {
                    L5: {
                      if (-1 != (re.field_n.field_wb.field_o ^ -1)) {
                        ola.field_p = new qka(re.field_n.field_wb.field_M, re.field_n.field_wb.field_u, re.field_n.field_wb.field_hb, re.field_n.field_wb.field_G, hk.field_i, msa.field_o, qc.field_q, qc.field_q);
                        rc.field_b = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (re.field_n.field_zb.field_o == 0) {
                        break L6;
                      } else {
                        ola.field_p = new qka(re.field_n.field_zb.field_M, re.field_n.field_zb.field_u, re.field_n.field_zb.field_hb, re.field_n.field_zb.field_G, bba.field_e, msa.field_o, qc.field_q, qc.field_q);
                        rc.field_b = 1;
                        break L6;
                      }
                    }
                    break L2;
                  } else {
                    L7: {
                      var8 = 0;
                      if (var7.field_lb == null) {
                        var7.field_wb = new llb(0L, bsa.field_q);
                        var7.b(param1 + -563, var7.field_wb);
                        var7.field_Eb = new llb(0L, geb.field_o);
                        var7.b(-561, var7.field_Eb);
                        var7.field_Bb = new llb(0L, bsa.field_q);
                        var7.b(-561, var7.field_Bb);
                        var7.field_Eb.field_F = 2;
                        var8 = 1;
                        var7.g(113);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      var7.field_hb = re.field_n.field_yb.field_hb;
                      var9 = 0;
                      if (null == var7.field_Ab) {
                        var10 = 13369344;
                        var11 = 16737894;
                        break L8;
                      } else {
                        if (kbb.field_q == var7.field_Ab) {
                          var10 = 52224;
                          var11 = 6750054;
                          break L8;
                        } else {
                          var10 = 13421568;
                          var11 = 16777062;
                          break L8;
                        }
                      }
                    }
                    L9: {
                      var12 = 0;
                      if (var7.field_vb == null) {
                        break L9;
                      } else {
                        if (var7.field_vb.equals("")) {
                          break L9;
                        } else {
                          var7.field_Bb.field_tb = iqb.field_o;
                          var7.field_Bb.field_qb = var11;
                          var12 = 1;
                          var7.field_Bb.a(0, 127, iqb.field_o.field_m - -3, var9, nna.field_w);
                          break L9;
                        }
                      }
                    }
                    L10: {
                      var7.field_Eb.field_Y = var10;
                      var7.field_wb.field_Y = var10;
                      var7.field_Eb.field_U = var11;
                      var7.field_wb.field_U = var11;
                      var7.field_Eb.field_qb = var11;
                      var7.field_wb.field_qb = var11;
                      var7.field_Eb.field_ib = var11;
                      var7.field_wb.field_ib = var11;
                      var13 = 0;
                      var14 = -80 + (var7.field_hb + -2);
                      if (var12 != 0) {
                        var13 = 3 + iqb.field_o.field_m;
                        var14 = var14 - var13;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      stackIn_33_0 = var7.field_wb;

                      if (-1 > (var14 ^ -1)) {
                        stackIn_34_0 = (llb) ((Object) stackIn_33_0);
                        stackIn_34_1 = no.a(var7.field_wb.field_eb, var7.field_Fb, var14);
                        break L11;
                      } else {
                        stackIn_34_0 = (llb) ((Object) stackIn_33_0);
                        stackIn_34_1 = var7.field_Fb;
                        break L11;
                      }
                    }
                    L12: {
                      stackIn_34_0.field_R = stackIn_34_1;
                      var7.field_wb.a(var13, param1 + 121, var14, var9, nna.field_w);
                      stackIn_37_0 = var7.field_Eb;

                      if (null != var7.field_Ab) {
                        stackIn_38_0 = (llb) ((Object) stackIn_37_0);
                        stackIn_38_1 = var7.field_Ab;
                        break L12;
                      } else {
                        stackIn_38_0 = (llb) ((Object) stackIn_37_0);
                        stackIn_38_1 = wl.field_o;
                        break L12;
                      }
                    }
                    L13: {
                      stackIn_38_0.field_R = stackIn_38_1;
                      var7.field_Eb.a(var7.field_hb - 80, -79, 80, var9, nna.field_w);
                      if (var7.field_wb.field_R.equals(var7.field_Fb)) {
                        stackIn_42_0 = 0;
                        break L13;
                      } else {
                        stackIn_42_0 = 1;
                        break L13;
                      }
                    }
                    L14: {
                      var15 = stackIn_42_0;
                      var9 = var9 + nna.field_w;
                      if (var3_int == 0) {
                        var7.field_E = -var7.field_G + var9;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (var8 == 0) {
                        break L15;
                      } else {
                        re.field_n.field_yb.a((llb) (var6), 2, var7, 40);
                        break L15;
                      }
                    }
                    L16: {
                      L17: {
                        var6 = var7;
                        if (null == var7.field_Bb) {
                          break L17;
                        } else {
                          if (var7.field_Bb.field_O) {
                            lob.field_a = var7.field_vb;
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      if (var7.field_o == 0) {
                        if (!var7.field_wb.field_O) {
                          break L16;
                        } else {
                          if (var15 == 0) {
                            break L16;
                          } else {
                            lob.field_a = var7.field_Fb;
                            break L16;
                          }
                        }
                      } else {
                        L18: {
                          var16 = var7.field_Fb;
                          pea.a(0L, var7, -1, (int[]) null, var16, re.field_n.field_xb, (String) null, (byte) 87, -1);
                          if (null == var7.field_Ab) {
                            break L18;
                          } else {
                            if (qs.a(0, cka.field_o.field_a)) {
                              break L18;
                            } else {
                              if (erb.field_p) {
                                break L18;
                              } else {
                                L19: {
                                  if (!hb.field_c) {
                                    var17 = cka.field_o;
                                    var18 = isa.a(qia.field_o, new String[]{var16}, param1 + 122);
                                    var17.field_i.a(var18, (byte) -53, 8);
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                                var17 = cka.field_o;
                                var18 = isa.a(eha.field_p, new String[]{var16}, 115);
                                var17.field_i.a(var18, (byte) -53, 18);
                                break L18;
                              }
                            }
                          }
                        }
                        var5 = var7;
                        break L16;
                      }
                    }
                    var7 = (vu) ((Object) var4.a((byte) 99));
                    continue L4;
                  }
                }
              }
            }
            stackIn_99_0 = var5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var3), "qp.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (vu) ((Object) stackIn_99_0);
    }

    final static void a(boolean param0, int param1, java.applet.Applet param2, String param3) {
        try {
            RuntimeException runtimeException = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            StringBuilder stackIn_19_1 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            java.net.MalformedURLException var4 = null;
            try {
              L0: {
                L1: {
                  if (!eab.field_s.startsWith("win")) {
                    break L1;
                  } else {
                    if (rd.a(param3, 69)) {
                      decompiledRegionSelector1 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                try {
                  L2: {
                    param2.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
                    if (param1 == 0) {
                      decompiledRegionSelector0 = 1;
                      break L2;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L2;
                    }
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                    gna.a((Throwable) null, "MGR1: " + param3, 0);
                    decompiledRegionSelector0 = 1;
                    break L3;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 2;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_15_0 = (RuntimeException) (runtimeException);

                stackIn_15_1 = new StringBuilder().append("qp.B(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
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
              L5: {


                stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

                if (param3 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L5;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L5;
                }
              }
              throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_20_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return;
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    qp(byte[] param0, int param1, byte[] param2) {
        RuntimeException runtimeException = null;
        int var5 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            this.field_k = psb.a(param0, param0.length, 0);
            if (param1 != this.field_k) {
              throw new RuntimeException();
            } else {
              L1: {
                if (null != param2) {
                  if ((param2.length ^ -1) != -65) {
                    throw new RuntimeException();
                  } else {
                    this.field_b = fqb.a((byte) 25, param0.length, param0, 0);
                    var4_int = 0;
                    L2: while (true) {
                      if (-65 >= (var4_int ^ -1)) {
                        break L1;
                      } else {
                        if ((param2[var4_int] ^ -1) == (this.field_b[var4_int] ^ -1)) {
                          var4_int++;
                          continue L2;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
              this.a((byte) 27, param0);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (runtimeException);

            stackIn_24_1 = new StringBuilder().append("qp.<init>(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L3;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L4;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), stackIn_29_2 + ')');
        }
    }

    static {
    }
}
