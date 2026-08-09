/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eh {
    int field_g;
    int[] field_f;
    int field_i;
    java.awt.Image field_c;
    static jc field_b;
    static boolean[][] field_h;
    static String field_e;
    static String field_d;
    static ni field_j;
    static int field_a;

    final void a(byte param0) {
        if (param0 > -82) {
            this.a((byte) 23);
        }
        hk.a(this.field_f, this.field_g, this.field_i);
    }

    abstract void a(int param0, byte param1, int param2, java.awt.Component param3);

    final static void a(byte param0, byte[] param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        int stackIn_72_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        wl var16 = null;
        wl var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == -72) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_a = 89;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var16 = new wl(param1);
                        var17 = var16;
                        var17.field_n = -2 + param1.length;
                        ec.field_g = var17.e(3);
                        da.field_d = new boolean[ec.field_g];
                        sg.field_d = new int[ec.field_g];
                        fh.field_a = new int[ec.field_g];
                        tm.field_a = new int[ec.field_g];
                        hc.field_c = new int[ec.field_g];
                        pd.field_e = new byte[ec.field_g][];
                        tc.field_Nb = new byte[ec.field_g][];
                        var17.field_n = -(ec.field_g * 8) + (param1.length - 7);
                        ed.field_f = var17.e(3);
                        i.field_d = var17.e(3);
                        var3 = 1 + (var17.d((byte) -104) & 255);
                        var4 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 >= ec.field_g) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        sg.field_d[var4] = var16.e(qm.b((int) param0, -69));
                        var4++;
                        if (var15 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var15 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (ec.field_g <= var4) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        fh.field_a[var4] = var16.e(qm.b((int) param0, -69));
                        var4++;
                        if (var15 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var15 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var4 >= ec.field_g) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        tm.field_a[var4] = var16.e(3);
                        var4++;
                        if (var15 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var15 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var4 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (ec.field_g <= var4) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        hc.field_c[var4] = var16.e(3);
                        var4++;
                        if (var15 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var15 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var17.field_n = -(3 * (var3 + -1)) + (param1.length - (7 + ec.field_g * 8));
                        mb.field_d = new int[var3];
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var4 = 1;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var3 <= var4) {
                            statePc = 31;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        mb.field_d[var4] = var16.h(param0 + 65352);
                        stackIn_34_0 = 0;
                        stackIn_27_0 = stackIn_34_0;
                        stackIn_34_1 = mb.field_d[var4];
                        stackIn_27_1 = stackIn_34_1;
                        if (var15 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0 == stackIn_27_1) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        mb.field_d[var4] = 1;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var4++;
                        if (var15 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var17.field_n = 0;
                        var4 = 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = ec.field_g;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = stackIn_33_0;
                        stackIn_34_1 = var4;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 <= stackIn_34_1) {
                            statePc = 83;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var5 = tm.field_a[var4];
                        var6 = hc.field_c[var4];
                        var7 = var5 * var6;
                        var20 = new byte[var7];
                        var18 = var20;
                        var8 = var18;
                        tc.field_Nb[var4] = var20;
                        var21 = new byte[var7];
                        var19 = var21;
                        var9 = var19;
                        pd.field_e[var4] = var21;
                        var10 = 0;
                        var11 = var17.d((byte) -35);
                        if (var15 != 0) {
                            statePc = 84;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((var11 & 1) != 0) {
                            statePc = 52;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var12 = 0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_39_0 = var7 ^ -1;
                        stackIn_39_1 = var12;
                        stackIn_39_2 = -1;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 >= (stackIn_39_1 ^ stackIn_39_2)) {
                            statePc = 43;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var8[var12] = var16.g((byte) -127);
                        var12++;
                        if (var15 != 0) {
                            statePc = 77;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var15 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((var11 & 2) == 0) {
                            statePc = 76;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var12 = 0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var12 >= var7) {
                            statePc = 51;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        dupTemp$0 = var16.g((byte) -119);
                        var9[var12] = dupTemp$0;
                        var13 = dupTemp$0;
                        stackIn_34_0 = var10;
                        stackIn_47_0 = stackIn_34_0;
                        stackIn_34_1 = var13 ^ -1;
                        stackIn_47_1 = stackIn_34_1;
                        if (var15 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_49_0 = stackIn_47_0;
                        stackIn_48_0 = stackIn_49_0;
                        if (stackIn_47_1 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_50_0 = stackIn_48_0;
                        stackIn_50_1 = 1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_50_0 = stackIn_49_0;
                        stackIn_50_1 = 0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var10 = stackIn_50_0 | stackIn_50_1;
                        var12++;
                        if (var15 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var15 == 0) {
                            statePc = 76;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var12 = 0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var5 <= var12) {
                            statePc = 62;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackIn_63_0 = 0;
                        stackIn_55_0 = stackIn_63_0;
                        if (var15 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var13 = stackIn_55_0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var13 >= var6) {
                            statePc = 60;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var8[var13 * var5 + var12] = var16.g((byte) -124);
                        var13++;
                        if (var15 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var15 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var12++;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var15 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackIn_63_0 = 2 & var11;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (stackIn_63_0 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var12 = 0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var5 <= var12) {
                            statePc = 76;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackIn_33_0 = 0;
                        stackIn_68_0 = stackIn_33_0;
                        if (var15 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var13 = stackIn_68_0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var6 <= var13) {
                            statePc = 75;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        dupTemp$1 = var16.g((byte) -115);
                        var9[var12 + var13 * var5] = dupTemp$1;
                        var14 = dupTemp$1;
                        stackIn_39_0 = var10;
                        stackIn_71_0 = stackIn_39_0;
                        stackIn_39_1 = -1;
                        stackIn_71_1 = stackIn_39_1;
                        stackIn_39_2 = var14;
                        stackIn_71_2 = stackIn_39_2;
                        if (var15 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackIn_73_0 = stackIn_71_0;
                        stackIn_72_0 = stackIn_73_0;
                        if (stackIn_71_1 == stackIn_71_2) {
                            statePc = 73;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackIn_74_0 = stackIn_72_0;
                        stackIn_74_1 = 1;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        stackIn_74_0 = stackIn_73_0;
                        stackIn_74_1 = 0;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var10 = stackIn_74_0 | stackIn_74_1;
                        var13++;
                        if (var15 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var12++;
                        if (var15 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        da.field_d[var4] = var10 != 0;
                        var4++;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (var15 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 79: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_81_0 = (RuntimeException) (var2);
                    stackIn_80_0 = stackIn_81_0;
                    stackIn_81_1 = new StringBuilder().append("eh.M(").append(param0).append(',');
                    stackIn_80_1 = stackIn_81_1;
                    if (param1 == null) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    stackIn_82_0 = (RuntimeException) ((Object) stackIn_80_0);
                    stackIn_82_1 = (StringBuilder) ((Object) stackIn_80_1);
                    stackIn_82_2 = "{...}";
                    statePc = 82;
                    continue stateLoop;
                }
                case 81: {
                    stackIn_82_0 = (RuntimeException) ((Object) stackIn_81_0);
                    stackIn_82_1 = (StringBuilder) ((Object) stackIn_81_1);
                    stackIn_82_2 = "null";
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    throw dh.a((Throwable) ((Object) stackIn_82_0), stackIn_82_2 + ')');
                }
                case 83: {
                    return;
                }
                case 84: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    abstract void a(byte param0, java.awt.Graphics param1, int param2, int param3);

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_h = (boolean[][]) null;
        field_b = null;
        field_j = null;
        if (param0 != 24744) {
            eh.a(125);
        }
    }

    static {
        field_b = new jc();
        field_e = "Shape feedback:";
    }
}
