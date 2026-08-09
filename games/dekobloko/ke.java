/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    boolean field_j;
    static int field_d;
    int field_o;
    private int field_k;
    static String field_n;
    boolean field_p;
    sk field_b;
    int field_c;
    int field_i;
    boolean field_g;
    private int field_t;
    private cl field_a;
    int field_y;
    ec[] field_f;
    boolean field_r;
    boolean field_s;
    private int field_u;
    int field_l;
    int field_m;
    int field_q;
    int[] field_v;
    static int[] field_h;
    private kc field_e;
    private int field_x;
    int field_w;
    int field_z;

    final static void e(byte param0) {
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4_long = 0L;
        kc var4 = null;
        int var5 = 0;
        kn var6_ref_kn = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        uf var27 = null;
        uf var28 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var26 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 48) {
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
                        field_d = 90;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var27 = de.field_V;
                        var28 = var27;
                        var2 = var28.d((byte) -106);
                        if ((var2 ^ -1) == -1) {
                            statePc = 19;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var2 == 1) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        qb.a((Throwable) null, 16408, "HS1: " + qk.d((byte) 30));
                        si.a(122);
                        if (var26 == 0) {
                            statePc = 75;
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3 = var28.e(3);
                        var4_long = var28.f((byte) -108);
                        var6_ref_kn = (kn) ((Object) pb.field_c.c((byte) 114));
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var6_ref_kn == null) {
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
                        stackIn_16_0 = var6_ref_kn.field_u ^ -1;
                        stackIn_10_0 = stackIn_16_0;
                        if (var26 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 != (var3 ^ -1)) {
                            statePc = 13;
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
                        if (var26 == 0) {
                            statePc = 14;
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
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6_ref_kn = (kn) ((Object) pb.field_c.d(true));
                        if (var26 == 0) {
                            statePc = 8;
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
                        if (var6_ref_kn != null) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = 103;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        si.a(stackIn_16_0);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return;
                }
                case 18: {
                    try {
                        var6_ref_kn.field_o = var4_long;
                        var6_ref_kn.b((byte) 101);
                        if (var26 == 0) {
                            statePc = 75;
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
                        var3 = var28.e(param0 + -45);
                        var4 = (kc) ((Object) dg.field_e.c((byte) -104));
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var4 == null) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_28_0 = var4.field_n ^ -1;
                        stackIn_22_0 = stackIn_28_0;
                        stackIn_28_1 = var3 ^ -1;
                        stackIn_22_1 = stackIn_28_1;
                        if (var26 != 0) {
                            statePc = 28;
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
                        if (stackIn_22_0 != stackIn_22_1) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var26 == 0) {
                            statePc = 26;
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
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var4 = (kc) ((Object) dg.field_e.d(true));
                        if (var26 == 0) {
                            statePc = 20;
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
                        if (var4 != null) {
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
                        stackIn_28_0 = param0;
                        stackIn_28_1 = 121;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        si.a(stackIn_28_0 ^ stackIn_28_1);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return;
                }
                case 30: {
                    try {
                        var5 = var28.d((byte) -19);
                        if ((var5 ^ -1) != -1) {
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
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var6 = var4.field_o;
                        rc.field_c[0].field_c = false;
                        rc.field_c[0].field_i = oa.field_f;
                        var7 = var4.field_v;
                        rc.field_c[0].field_f = null;
                        var8_int = 1;
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
                        if (var8_int >= var5) {
                            statePc = 40;
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
                        rc.field_c[var8_int].field_i = var27.c((byte) -38);
                        rc.field_c[var8_int].field_c = false;
                        if (var26 != 0) {
                            statePc = 72;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if ((var28.d((byte) -48) ^ -1) != -2) {
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
                        rc.field_c[var8_int].field_f = var28.c((byte) -38);
                        if (var26 == 0) {
                            statePc = 39;
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
                        rc.field_c[var8_int].field_f = null;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var8_int++;
                        if (var26 == 0) {
                            statePc = 33;
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
                        dupTemp$0 = new String[3][var6];
                        var4.field_r = dupTemp$0;
                        var8 = dupTemp$0;
                        var9 = new String[3][var6];
                        dupTemp$1 = new long[3][var6];
                        var4.field_t = dupTemp$1;
                        var10 = dupTemp$1;
                        dupTemp$2 = new int[3][var6 * var7];
                        var4.field_u = dupTemp$2;
                        var11 = dupTemp$2;
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var28.d((byte) -68);
                        if (0 < var18) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var4.field_p = true;
                        var4.b((byte) 107);
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var19 = 0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var19 >= var18) {
                            statePc = 71;
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
                        var20 = var27.d((byte) -21);
                        var21 = rc.field_c[var20].field_i;
                        var22 = var28.f((byte) -108);
                        var24 = var28.field_n;
                        if (var26 != 0) {
                            statePc = 72;
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
                        if (var6 > var19) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var8[0][var12] = var21;
                        var9[0][var12] = rc.field_c[var20].field_f;
                        var10[0][var12] = var22;
                        var25 = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var7 <= var25) {
                            statePc = 52;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        incrementValue$3 = var15;
                        var15++;
                        var11[0][incrementValue$3] = var27.i(qm.b((int) param0, 7601));
                        var25++;
                        if (var26 != 0) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var26 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var12++;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var21 == null) {
                            statePc = 61;
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
                        if (k.a(var21, true)) {
                            statePc = 56;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var8[1][var13] = oa.field_f;
                        var9[1][var13] = null;
                        var10[1][var13] = var22;
                        var13++;
                        var28.field_n = var24;
                        var25 = 0;
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
                        if ((var25 ^ -1) <= (var7 ^ -1)) {
                            statePc = 61;
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
                        incrementValue$4 = var16;
                        var16++;
                        var11[1][incrementValue$4] = var27.i(7553);
                        var25++;
                        if (var26 != 0) {
                            statePc = 70;
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
                        if (var26 == 0) {
                            statePc = 57;
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
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var14 >= var6) {
                            statePc = 69;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (!rc.field_c[var20].field_c) {
                            statePc = 64;
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
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        rc.field_c[var20].field_c = true;
                        var8[2][var14] = var21;
                        var9[2][var14] = rc.field_c[var20].field_f;
                        var10[2][var14] = var22;
                        var14++;
                        var28.field_n = var24;
                        var25 = 0;
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
                        if ((var7 ^ -1) >= (var25 ^ -1)) {
                            statePc = 69;
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
                        incrementValue$5 = var17;
                        var17++;
                        var11[2][incrementValue$5] = var27.i(7553);
                        var25++;
                        if (var26 != 0) {
                            statePc = 70;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var26 == 0) {
                            statePc = 65;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
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
                        var19++;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var26 == 0) {
                            statePc = 43;
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
                        var4.field_p = true;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var4.b((byte) 107);
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 74: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var1), "ke.JA(" + param0 + ')');
                }
                case 75: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void g(int param0) {
        boolean discarded$0 = false;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int var3;
        L0: {
          var3 = client.field_A ? 1 : 0;
          if (20 != this.field_o) {
            break L0;
          } else {
            h.a(-109);
            break L0;
          }
        }
        h.a((ke) (this), (byte) 95);
        L1: while (true) {
          L2: {
            L3: {
              if (!ab.c((byte) -128)) {
                break L3;
              } else {
                this.field_b.d(0);
                stackIn_25_0 = -14;

                stackIn_25_1 = wh.field_c ^ -1;

                if (var3 != 0) {
                  break L2;
                } else {
                  if (stackIn_25_0 == stackIn_25_1) {
                    nm.f(115);
                    nk.field_k = false;
                    kf.field_G.c(param0 + -2825, false);
                    return;
                  } else {
                    L4: {
                      L5: {
                        if (96 == wh.field_c) {
                          break L5;
                        } else {
                          if (wh.field_c == 98) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      if (0 < this.field_t) {
                        this.m(param0 ^ -8255);
                        this.field_b.a(1, (byte) -90);
                        this.field_b.field_o = false;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L6: {
                      L7: {
                        if (-98 == (wh.field_c ^ -1)) {
                          break L7;
                        } else {
                          if (wh.field_c != 99) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (3 > this.field_t) {
                        this.n(87);
                        this.field_b.a(1, (byte) -66);
                        this.field_b.field_o = false;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    if (this.a(false, (byte) -33)) {
                      return;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
            }
            this.field_b.a(this.a(param0 ^ 2712, bh.field_g, pm.field_f), -20563, this.a(400, he.field_S, nf.field_h));
            stackIn_25_0 = param0;
            stackIn_25_1 = 2824;
            break L2;
          }
          L8: {
            if (stackIn_25_0 == stackIn_25_1) {
              break L8;
            } else {
              this.field_m = 44;
              break L8;
            }
          }
          discarded$0 = this.a(true, (byte) -33);
          return;
        }
    }

    final void f(byte param0) {
        int stackIn_29_0 = 0;
        int var2;
        int var4;
        var4 = client.field_A ? 1 : 0;
        h.a((ke) (this), (byte) 95);
        var2 = 74 / ((71 - param0) / 39);
        L0: while (true) {
          L1: {
            L2: {
              if (!ab.c((byte) -119)) {
                break L2;
              } else {
                stackIn_29_0 = wh.field_c ^ -1;

                if (var4 != 0) {
                  break L1;
                } else {
                  if (stackIn_29_0 != -14) {
                    L3: {
                      L4: {
                        if (ph.n(-30146)) {
                          break L4;
                        } else {
                          L5: {
                            this.field_b.d(0);
                            if (wh.field_c != 96) {
                              break L5;
                            } else {
                              fc.field_e = (3 + fc.field_e + -1) % 3;
                              this.field_b.a(fc.field_e, (byte) -79);
                              nm.f(124);
                              this.field_b.field_o = false;
                              break L5;
                            }
                          }
                          L6: {
                            if (wh.field_c == 97) {
                              fc.field_e = (1 + fc.field_e) % 3;
                              this.field_b.a(fc.field_e, (byte) -81);
                              nm.f(117);
                              this.field_b.field_o = false;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          L7: {
                            if ((wh.field_c ^ -1) == -99) {
                              L8: {
                                if (3 != this.field_b.field_h) {
                                  break L8;
                                } else {
                                  this.field_b.a(fc.field_e, (byte) -103);
                                  if (var4 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              this.field_b.a(3, (byte) -125);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          if (99 != wh.field_c) {
                            break L3;
                          } else {
                            L9: {
                              if ((this.field_b.field_h ^ -1) > -1) {
                                break L9;
                              } else {
                                if (-4 >= (this.field_b.field_h ^ -1)) {
                                  break L9;
                                } else {
                                  this.field_b.a(3, (byte) -95);
                                  if (var4 == 0) {
                                    break L3;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            this.field_b.a(fc.field_e, (byte) -110);
                            if (var4 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      this.field_b.a(-38);
                      break L3;
                    }
                    if (!this.b(false, 1)) {
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    } else {
                      return;
                    }
                  } else {
                    nm.f(-26);
                    mg.field_Zb = false;
                    qi.a(false, (byte) -108);
                    return;
                  }
                }
              }
            }
            this.field_b.a(this.a(400, bh.field_g, pm.field_f), -20563, this.a(400, he.field_S, nf.field_h));
            stackIn_29_0 = this.b(true, 1) ? 1 : 0;
            break L1;
          }
          return;
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        ec var6;
        int var7;
        int stackIn_11_0 = 0;
        var7 = client.field_A ? 1 : 0;
        var4 = 640 - (640 * this.field_o * this.field_o / param0 + (this.field_u >> 1482415394));
        param1 = param1 - var4;
        var5 = 0;
        L0: while (true) {
          L1: {
            if ((var5 ^ -1) <= (this.field_b.field_l ^ -1)) {
              break L1;
            } else {
              var6 = this.field_f[var5];
              stackIn_11_0 = var6.field_l ^ -1;

              if (var7 != 0) {
                return stackIn_11_0;
              } else {
                L2: {
                  if (stackIn_11_0 < (param1 ^ -1)) {
                    break L2;
                  } else {
                    if ((var6.field_n + var6.field_l ^ -1) >= (param1 ^ -1)) {
                      break L2;
                    } else {
                      if (var6.field_m > param2) {
                        break L2;
                      } else {
                        if ((param2 ^ -1) > (var6.field_m - -var6.field_r ^ -1)) {
                          return var5;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var5++;
                if (var7 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          return -1;
        }
    }

    private final int b(boolean param0, byte param1) {
        int stackIn_12_0 = 0;
        int stackIn_56_0 = 0;
        int statePc = 0;
        int var3 = 0;
        int var4 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = client.field_A ? 1 : 0;
                    var3 = -(640 * this.field_o * this.field_o / 400) + (640 + -(this.field_u >> -1950206750));
                    var4 = -1;
                    var26 = rc.a(cm.field_b, (byte) 47, this.field_v);
                    var27 = rc.a(cm.field_a, (byte) 47, var26);
                    var7 = -((jh.a(var27, 120) - 1) * 18) + 304;
                    if (param1 == -51) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return 9;
                }
                case 2: {
                    var8 = 80;
                    if ((this.field_i ^ -1) != -1) {
                        statePc = 4;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var28 = eg.a(cm.field_a, this.field_v, (byte) 106);
                    var7 = 304 - (jh.a(var28, param1 + 146) - 1) * 18;
                    if (tf.a((byte) 103, var28)) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var8 -= 20;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (af.a(param1 + 51, var28, this.field_v)) {
                        statePc = 8;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var8 += 20;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var7 = var7 + var3;
                    var9 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (31 <= var9) {
                        statePc = 55;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_56_0 = var9;
                    stackIn_12_0 = stackIn_56_0;
                    if (var11 != 0) {
                        statePc = 56;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (stackIn_12_0 == 15) {
                        statePc = 14;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var7 = 34;
                    var8 += 40;
                    if (this.field_i == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var29 = eg.a(this.field_v, cm.field_h, (byte) 105);
                    var7 = -(18 * jh.a(var29, 96)) + 18 + 304;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var7 = var7 + var3;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (0 == this.field_i) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (!fb.a(var9, 10040319, this.field_v)) {
                        statePc = 21;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var11 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (!rb.a(-23, var9, var26)) {
                        statePc = 23;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (param0) {
                        statePc = 44;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (var9 != this.field_k) {
                        statePc = 30;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (rb.a(-112, var9, this.field_v)) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    vg.field_h.b(-4 + var7, var8 - 4, 40, 40);
                    if (var11 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    uf.field_y[var9].a(var7 - 4, -4 + var8, 40, 40);
                    if (var11 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (bh.field_g < var7) {
                        statePc = 39;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if ((32 + var7 ^ -1) >= (bh.field_g ^ -1)) {
                        statePc = 39;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if ((var8 ^ -1) < (pm.field_f ^ -1)) {
                        statePc = 39;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (pm.field_f >= 32 + var8) {
                        statePc = 39;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (!rb.a(-113, var9, this.field_v)) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    uf.field_y[var9].a(var7 - 2, -2 + var8, 36, 36);
                    if (var11 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    vg.field_h.b(-2 + var7, var8 - 2, 36, 36);
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    var4 = var9;
                    if (var11 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (!rb.a(param1 + 23, var9, this.field_v)) {
                        statePc = 42;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    tl.field_w[var9].c(var7, var8);
                    if (var11 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    vg.field_h.b(var7, var8, 32, 32);
                    if (var11 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if ((var7 ^ -1) < (he.field_S ^ -1)) {
                        statePc = 53;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (he.field_S >= 32 + var7) {
                        statePc = 53;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (nf.field_h < var8) {
                        statePc = 53;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if ((nf.field_h ^ -1) > (32 + var8 ^ -1)) {
                        statePc = 49;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (var9 != this.field_k) {
                        statePc = 52;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    this.field_k = -1;
                    if (var11 == 0) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    this.field_k = var9;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    var7 += 36;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    var9++;
                    if (var11 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackIn_56_0 = this.field_k;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (stackIn_56_0 < 0) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var4 = this.field_k;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void j(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = client.field_A ? 1 : 0;
        var2 = 2147483647;
        var3 = 2147483647;
        var4 = -2147483648;
        var5 = -2147483648;
        var6 = -99 % ((-41 - param0) / 33);
        var7 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if ((this.field_b.field_l ^ -1) >= (var7 ^ -1)) {
                break L2;
              } else {
                if (var8 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (var2 > this.field_f[var7].field_l) {
                      var2 = this.field_f[var7].field_l;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (this.field_f[var7].field_n + this.field_f[var7].field_l > var4) {
                      var4 = this.field_f[var7].field_l - -this.field_f[var7].field_n;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if ((var5 ^ -1) <= (this.field_f[var7].field_r + this.field_f[var7].field_m ^ -1)) {
                      break L5;
                    } else {
                      var5 = this.field_f[var7].field_m - -this.field_f[var7].field_r;
                      break L5;
                    }
                  }
                  L6: {
                    if ((this.field_f[var7].field_m ^ -1) > (var3 ^ -1)) {
                      var3 = this.field_f[var7].field_m;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var7++;
                  if (var8 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            this.field_w = -30 + var2;
            this.field_z = -20 + var3;
            this.field_y = var4 - -30 + -this.field_w;
            this.field_q = var5 - (-20 - -this.field_z);
            break L1;
          }
          return;
        }
    }

    final void c(int param0) {
        this.e(16687906);
        this.b(58);
        if (param0 != 2) {
            this.k(-125);
        }
    }

    private final boolean a(boolean param0, byte param1) {
        if (param1 != -33) {
            this.field_o = -121;
        }
        this.h(param1 + 132);
        int var3 = -1;
        if (0 <= this.field_b.field_h) {
            var3 = this.field_f[this.field_b.field_h].field_d;
        }
        if (-27 == (var3 ^ -1)) {
            if (!((this.field_t ^ -1) != -4)) {
                var3 = -1;
            }
        }
        if (-26 == (var3 ^ -1)) {
            if (!(-1 != (this.field_t ^ -1))) {
                var3 = -1;
            }
        }
        if (var3 == 13 || !param0) {
            if (!(!this.field_b.b((byte) 114))) {
                nk.field_k = false;
                kf.field_G.c(-1, param0);
                nm.f(123);
                return true;
            }
        }
        if (25 == var3 && this.field_b.b((byte) 114)) {
            this.m(-11063);
        }
        if (var3 == 26) {
            if (!this.field_b.b((byte) 114)) {
                return false;
            }
            this.n(-77);
        }
        return false;
    }

    final static void o(int param0) {
        pk.field_r = param0;
        jg.field_i = true;
    }

    final void a(ec param0, int param1) {
        int fieldTemp$0 = 0;
        try {
            if (param1 <= 98) {
                this.b(98);
            }
            fieldTemp$0 = this.field_b.field_l;
            this.field_b.field_l = this.field_b.field_l + 1;
            this.field_f[fieldTemp$0] = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ke.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        hk.a(param0, param1, 1 + param2, 10000536);
                        hk.a(param0, param3 + param1, 1 + param2, 12105912);
                        var5_int = 1;
                        if (param1 - -var5_int >= hk.field_h) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var5_int = -param1 + hk.field_h;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var6 = param3;
                        if (param1 + var6 > hk.field_b) {
                            statePc = 5;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var6 = -param1 + hk.field_b;
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
                        if (param4 >= 98) {
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
                        field_n = (String) null;
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
                        var7 = var5_int;
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
                        if ((var6 ^ -1) >= (var7 ^ -1)) {
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
                        var8 = 152 - -(var7 * 48 / param3);
                        var9 = var8 << 943748912 | var8 << 392551496 | var8;
                        hk.field_l[(param1 - -var7) * hk.field_j + param0] = var9;
                        hk.field_l[param0 + (var7 + param1) * hk.field_j + param2] = var9;
                        var7++;
                        if (var10 != 0) {
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
                        if (var10 == 0) {
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
                    var5 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var5), "ke.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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

    final void b(int param0, int param1) {
        ec dupTemp$3 = null;
        ec dupTemp$4 = null;
        boolean discarded$5 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = client.field_A ? 1 : 0;
                    var3 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((var3 ^ -1) <= (this.field_b.field_l ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    dupTemp$3 = this.field_f[var3];
                    dupTemp$3.field_m = dupTemp$3.field_m + param0;
                    var3++;
                    if (var4 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_b.a(this.a(400, bh.field_g, pm.field_f), -20563, this.a(400, he.field_S, nf.field_h));
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var5 = 0;
                    var3 = var5;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (this.field_b.field_l <= var5) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    dupTemp$4 = this.field_f[var5];
                    dupTemp$4.field_m = dupTemp$4.field_m - param0;
                    var5++;
                    if (var4 != 0) {
                        statePc = 14;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var4 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (param1 > 120) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.field_i = 13;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    discarded$5 = this.p(-1);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(int param0) {
        int var2 = -(this.field_u >> 952971650) + (640 + -(640 * (this.field_o * this.field_o) / 400));
        if (param0 < 49) {
            this.field_r = false;
        }
        ck var3 = ng.field_b;
        var3.c(320 - var3.field_K / 2, -(var2 >> -492469630) + (50 + -(var3.field_C / 2)));
        hk.a(var2 + 4 + this.field_w, this.field_z + 4, -8 + this.field_y, -8 + this.field_q, 0, 150);
        vk.a(this.field_q, (byte) 50, a.field_n, this.field_y, this.field_z, var2 + this.field_w);
        kn.a(w.field_kb, (byte) -39, 362, ve.c(this.field_t, 26135), 16777215, 560 + var2);
        wk.a(72, this.field_t, var2);
    }

    final void h(byte param0) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        String stackIn_20_3 = null;
        int statePc = 0;
        int var2 = 0;
        ck var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = client.field_A ? 1 : 0;
                    stackIn_2_0 = this;
                    stackIn_1_0 = stackIn_2_0;
                    if ((this.field_b.field_l ^ -1) > -4) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackIn_3_0 = this;
                    stackIn_3_1 = 1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackIn_3_0 = this;
                    stackIn_3_1 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    this.a(stackIn_3_1 != 0, 15764);
                    var2 = 640 + (-(640 * (this.field_o * this.field_o) / 400) + -(this.field_u >> -1169742078));
                    var3 = client.field_C[this.field_i];
                    if (param0 >= 23) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.field_z = -77;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var3.c(-(var3.field_K / 2) + 320, -(var3.field_C / 2) + 40 - (var2 >> 740753666));
                    var4 = this.b(false, (byte) -51);
                    if ((var4 ^ -1) > -1) {
                        statePc = 29;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ed.a(16777215, 320 - -var2, qk.field_s[var4], 200, (byte) 75, w.field_kb);
                    var5 = rb.a(-35, var4, this.field_v) ? 1 : 0;
                    if (var5 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (!rb.a(-28, var4, cm.field_g)) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_10_0 = 1;
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    stackIn_10_0 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    var6 = stackIn_10_0;
                    if (var5 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    uf.field_y[var4].c(var2 + 256, 210);
                    if (var10 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    vg.field_h.c(256 + var2, 210);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (var6 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var7 = sb.field_t;
                    if (var10 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var7 = jh.field_c[var4];
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var8 = se.field_S.a(var7, 171);
                    ga.a(171, 0, -se.field_S.field_R + 274 + -(var8 * 8), var7, 16, 1000, 16769088, se.field_S, (byte) -124, 0, var2 + 80);
                    stackIn_19_0 = 8 * var8 + 282;
                    stackIn_18_0 = stackIn_19_0;
                    stackIn_19_1 = 256;
                    stackIn_18_1 = stackIn_19_1;
                    stackIn_19_2 = 16777215;
                    stackIn_18_2 = stackIn_19_2;
                    if (var5 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = stackIn_18_0;
                    stackIn_20_1 = stackIn_18_1;
                    stackIn_20_2 = stackIn_18_2;
                    stackIn_20_3 = j.field_a;
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = stackIn_19_0;
                    stackIn_20_1 = stackIn_19_1;
                    stackIn_20_2 = stackIn_19_2;
                    stackIn_20_3 = ne.field_b;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    fl.a(stackIn_20_0, stackIn_20_1, stackIn_20_2, stackIn_20_3, 80 + var2, w.field_kb);
                    kn.a(se.field_S, (byte) -39, 271, jd.field_Xb, 16777215, var2 + 500);
                    kn.a(se.field_S, (byte) -39, 289, me.field_B, 16777215, 500 - -var2);
                    if (var6 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    fl.a(271, 256, 16769088, "???", 500 - -var2, se.field_S);
                    fl.a(289, 256, 16769088, "???", var2 + 500, se.field_S);
                    if (var10 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    fl.a(271, 256, 16769088, Integer.toString(on.field_g[var4]), var2 + 500, se.field_S);
                    var9 = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (vb.field_X[var4] <= var9) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    rn.field_c.c(var9 * 5 + (var2 + 500), 274);
                    var9++;
                    if (var10 != 0) {
                        statePc = 30;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var10 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (var10 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    ed.a(16777215, var2 + 320, v.field_e, 200, (byte) 75, w.field_kb);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (ph.n(-30146)) {
                        statePc = 32;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 32: {
                    ed.a(16777215, var2 + 320, lf.field_d, 360, (byte) 75, se.field_S);
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (rb.a(-80, 5, this.field_v)) {
                        statePc = 35;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 35: {
                    ed.a(16777215, 320 - -var2, ph.field_Cb, 360, (byte) 75, se.field_S);
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(int param0, boolean param1) {
        boolean discarded$0 = false;
        this.h(118);
        if (param0 != -14845) {
            discarded$0 = this.b(true, 36);
        }
        int var3 = -1;
        if (!((this.field_b.field_h ^ -1) > -1)) {
            var3 = this.field_f[this.field_b.field_h].field_d;
        }
        if (-21 == (var3 ^ -1)) {
            if (!(!this.field_b.b((byte) 114))) {
                og.a(false, 6, true);
                nm.f(124);
                return true;
            }
        }
        if (var3 == 13 || !param1) {
            if (!(!this.field_b.b((byte) 114))) {
                ve.field_Hc = false;
                qi.a(param1, (byte) -111);
                nm.f(param0 ^ -14836);
                return true;
            }
        }
        if (param1 && -1 != (ig.field_Yb ^ -1) && this.field_b.field_h != -1) {
            cj.field_c = this.field_b.field_h;
            this.field_b.a(cj.field_c, (byte) -109);
            nm.f(125);
            return true;
        }
        return false;
    }

    final void b(byte param0) {
        int var2;
        ck var3;
        int var4;
        int var5_int;
        Object var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        String[] var17;
        String[] var19;
        int[] var21;
        int[] var22;
        L0: {
          var14 = client.field_A ? 1 : 0;
          var2 = -(this.field_u >> -977993822) + (-(640 * this.field_o * this.field_o / 400) + 640);
          this.a(false, 15764);
          var3 = ij.field_d;
          var3.c(320 + -(var3.field_K / 2), 45 - var3.field_C / 2 + -(var2 >> 8543042));
          if (null != this.field_e) {
            break L0;
          } else {
            if (ph.n(-30146)) {
              break L0;
            } else {
              this.field_e = am.a(3, false, 1, 0, 10);
              break L0;
            }
          }
        }
        var4 = bf.a((byte) 107, gh.field_e, fc.field_e, this.field_e);
        fl.a(105, 256, 16777215, vm.field_x, var2 + 125, w.field_kb);
        fl.a(105, 256, 16777215, a.field_x, 333 + var2, w.field_kb);
        kn.a(w.field_kb, (byte) -39, 105, sl.field_b, 16777215, 545 - -var2);
        if (param0 <= -42) {
          var5_int = 0;
          L1: while (true) {
            L2: {
              if ((var5_int ^ -1) <= -11) {
                break L2;
              } else {
                var6 = 16777215;
                kn.a(w.field_kb, (byte) -39, 130 + 20 * var5_int, 1 + var5_int + ".", var6, var2 + 115);
                var5_int++;
                if (var14 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var5 = le.field_r;
              var6 = 1;
              if (null != this.field_e) {
                L4: {
                  if (this.field_e.field_p) {
                    break L4;
                  } else {
                    var5 = wm.field_k;
                    if (var14 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  L6: {
                    if (null != this.field_e.field_r) {
                      var17 = this.field_e.field_r[fc.field_e];
                      var21 = this.field_e.field_u[fc.field_e];
                      var9 = 0;
                      L7: while (true) {
                        if ((var9 ^ -1) <= -11) {
                          break L5;
                        } else {
                          if (var14 != 0) {
                            break L3;
                          } else {
                            L8: {
                              if (var17[var9] == null) {
                                break L8;
                              } else {
                                L9: {
                                  var5 = null;
                                  var10 = 16769088;
                                  var11 = var21[var9];
                                  var12 = var11 % 8;
                                  var13 = var11 / 8;
                                  if ((var4 ^ -1) == (var9 ^ -1)) {
                                    var10 = 16777215;
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                fl.a(var9 * 20 + 130, 256, var10, var17[var9], 125 - -var2, se.field_S);
                                kn.a(se.field_S, (byte) -39, 130 + var9 * 20, cm.a((byte) 106, kk.field_q, new String[]{Integer.toString(var12 + 1)}), var10, 350 - -var2);
                                fl.a(130 - -(var9 * 20), 256, var10, md.field_U[var12], var2 + 350, se.field_S);
                                kn.a(se.field_S, (byte) -39, 20 * var9 + 130, Integer.toString(var13), var10, 545 + var2);
                                break L8;
                              }
                            }
                            var9++;
                            if (var14 == 0) {
                              continue L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                    } else {
                      var5 = dn.field_s;
                      if (var14 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var19 = this.field_e.field_r[fc.field_e];
                  var22 = this.field_e.field_u[fc.field_e];
                  var9 = 0;
                  L10: while (true) {
                    if ((var9 ^ -1) <= -11) {
                      break L5;
                    } else {
                      if (var14 != 0) {
                        break L3;
                      } else {
                        L11: {
                          if (var19[var9] == null) {
                            break L11;
                          } else {
                            L12: {
                              var5 = null;
                              var10 = 16769088;
                              var11 = var22[var9];
                              var12 = var11 % 8;
                              var13 = var11 / 8;
                              if ((var4 ^ -1) == (var9 ^ -1)) {
                                var10 = 16777215;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            fl.a(var9 * 20 + 130, 256, var10, var19[var9], 125 - -var2, se.field_S);
                            kn.a(se.field_S, (byte) -39, 130 + var9 * 20, cm.a((byte) 106, kk.field_q, new String[]{Integer.toString(var12 + 1)}), var10, 350 - -var2);
                            fl.a(130 - -(var9 * 20), 256, var10, md.field_U[var12], var2 + 350, se.field_S);
                            kn.a(se.field_S, (byte) -39, 20 * var9 + 130, Integer.toString(var13), var10, 545 + var2);
                            break L11;
                          }
                        }
                        var9++;
                        if (var14 == 0) {
                          continue L10;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                if (0 <= var4) {
                  break L3;
                } else {
                  if (gh.field_e == null) {
                    break L3;
                  } else {
                    if (gh.field_e.field_x != 0) {
                      break L3;
                    } else {
                      fl.a(330, 256, 16777215, oa.field_f, 125 + var2, se.field_S);
                      var7 = gh.field_e.field_s[0];
                      var8 = var7 % 8;
                      var9 = var7 / 8;
                      kn.a(se.field_S, (byte) -39, 330, cm.a((byte) 81, kk.field_q, new String[]{Integer.toString(1 + var8)}), 16777215, var2 + 350);
                      fl.a(330, 256, 16777215, md.field_U[var8], 350 + var2, se.field_S);
                      kn.a(se.field_S, (byte) -39, 330, Integer.toString(var9), 16777215, var2 + 545);
                      var6 = 0;
                      break L3;
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            L13: {
              if (var5 != null) {
                ed.a(16777215, 320 - -var2, (String) (var5), 220, (byte) 75, w.field_kb);
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              L15: {
                if (ph.n(-30146)) {
                  break L15;
                } else {
                  if (var6 != 0) {
                    ed.a(16777215, var2 + 320, af.field_e, 330, (byte) 75, se.field_S);
                    if (var14 == 0) {
                      break L14;
                    } else {
                      break L15;
                    }
                  } else {
                    break L14;
                  }
                }
              }
              ed.a(16777215, 320 - -var2, lf.field_d, 330, (byte) 75, se.field_S);
              break L14;
            }
            return;
          }
        } else {
          return;
        }
    }

    final void f(int param0) {
        this.a(true, param0 ^ -23361);
        int var2 = -(this.field_u >> -2029436830) + 640 + -(640 * this.field_o * this.field_o / 400);
        ck var3 = l.field_j;
        var3.c(320 - var3.field_K / 2, -(var2 >> -1455322462) + (this.field_z / 2 - (-2 - -(var3.field_C / 2))));
        if (param0 != -26325) {
            this.field_q = -96;
        }
        int var4 = !this.field_g ? 0 : 23;
        hk.a(var2 + (4 + this.field_w), -8 + (this.field_q + this.field_z), -8 + this.field_y, var4 + 142, 0, 150);
        vk.a(var4 + 150, (byte) 50, a.field_n, this.field_y, -13 + this.field_z + this.field_q, var2 + this.field_w);
        fc.a(this.field_q + this.field_z, (byte) 5, this.field_g, var2 + 185);
        nf.a(this.field_l, var2 + 333, (byte) 74, this.field_q + this.field_z, this.field_m);
    }

    final void k(int param0) {
        int var3;
        int stackIn_11_0 = 0;
        L0: {
          var3 = client.field_A ? 1 : 0;
          h.a((ke) (this), (byte) 95);
          if (param0 == 128) {
            break L0;
          } else {
            this.field_v = (int[]) null;
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            L3: {
              if (!ab.c((byte) 26)) {
                break L3;
              } else {
                stackIn_11_0 = 13;

                if (var3 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (stackIn_11_0 != wh.field_c) {
                      break L4;
                    } else {
                      if (!this.field_p) {
                        break L4;
                      } else {
                        nm.f(27);
                        cd.a(true);
                        return;
                      }
                    }
                  }
                  this.field_b.a(-127);
                  if (!this.d(-109, false)) {
                    if (var3 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            this.field_b.a(this.a(400, bh.field_g, pm.field_f), -20563, this.a(param0 + 272, he.field_S, nf.field_h));
            stackIn_11_0 = this.d(-108, true) ? 1 : 0;
            break L2;
          }
          return;
        }
    }

    final void d(byte param0) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int statePc = 0;
        int var2 = 0;
        ck var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        String[] var10_ref_String__ = null;
        int var10 = 0;
        int[] var11_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = client.field_A ? 1 : 0;
                    var2 = -(this.field_u >> 685015522) + (-(this.field_o * (this.field_o * 640) / 400) + 640);
                    this.a(false, 15764);
                    var3 = ad.field_g;
                    var3.c(-(var3.field_K / 2) + 320, -(var3.field_C / 2) + (45 + -(var2 >> 886031138)));
                    if (this.field_a != null) {
                        statePc = 3;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (ph.n(-30146)) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_a = ai.a(7, 10, (byte) -111, 0);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (-4 != (kd.field_p ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackIn_6_0 = 305;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    stackIn_6_0 = 310;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var4 = stackIn_6_0;
                    if (-4 == (kd.field_p ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackIn_9_0 = 380;
                    statePc = 9;
                    continue stateLoop;
                }
                case 8: {
                    stackIn_9_0 = 372;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var5 = stackIn_9_0;
                    if ((kd.field_p ^ -1) == -4) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = 435;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = 427;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var6 = stackIn_12_0;
                    if (-4 == (kd.field_p ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = 490;
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = 488;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var7 = stackIn_15_0;
                    fl.a(105, 256, 16777215, vm.field_x, 125 + var2, w.field_kb);
                    kn.a(w.field_kb, (byte) -39, 105, ga.field_a, 16777215, var4 - -var2);
                    if (param0 == 45) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.field_w = -41;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    kn.a(w.field_kb, (byte) -39, 105, om.field_c, 16777215, var2 + var5);
                    kn.a(w.field_kb, (byte) -39, 105, hd.field_o, 16777215, var6 - -var2);
                    kn.a(w.field_kb, (byte) -39, 105, vd.field_r, 16777215, var2 + var7);
                    kn.a(w.field_kb, (byte) -39, 105, sh.field_h, 16777215, 545 - -var2);
                    var8 = -1;
                    var9 = hf.field_g;
                    if (this.field_a == null) {
                        statePc = 34;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (this.field_a.field_A) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var9 = wm.field_k;
                    if (var14 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (this.field_a.field_x == null) {
                        statePc = 33;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var10_ref_String__ = this.field_a.field_x[cj.field_c];
                    var11_ref_int__ = this.field_a.field_u[cj.field_c];
                    var12 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (-11 >= (var12 ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var14 != 0) {
                        statePc = 32;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (var10_ref_String__[var12] == null) {
                        statePc = 29;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var9 = null;
                    var13 = 16769088;
                    if (k.a(var10_ref_String__[var12], true)) {
                        statePc = 27;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var8 = var12;
                    var13 = 16777215;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    this.a(se.field_S, var13, var11_ref_int__[4 * var12 + 2], var11_ref_int__[4 * var12 - -3], param0 + -5373, 130 - -(20 * var12), var11_ref_int__[1 + 4 * var12], var10_ref_String__[var12], var11_ref_int__[4 * var12], var2);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    var12++;
                    if (var14 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (var8 >= 0) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var12 = 16777215;
                    this.a(se.field_S, var12, this.field_a.field_w, this.field_a.field_p, -5328, 330, this.field_a.field_o, oa.field_f, this.field_a.field_t, var2);
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (var14 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var9 = dn.field_s;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var10 = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (10 <= var10) {
                        statePc = 39;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var11 = 16777215;
                    kn.a(w.field_kb, (byte) -39, 130 + var10 * 20, var10 + 1 + ".", var11, var2 + 115);
                    var10++;
                    if (var14 != 0) {
                        statePc = 41;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (var14 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (var9 != null) {
                        statePc = 41;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 41: {
                    ed.a(16777215, 320 + var2, (String) (var9), 220, (byte) 75, w.field_kb);
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (!ph.n(-30146)) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    ed.a(16777215, var2 + 320, lf.field_d, 330, (byte) 75, se.field_S);
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void m(int param0) {
        if (param0 != -11063) {
            this.a(false, 73);
        }
        if (0 < this.field_t) {
            this.field_t = this.field_t - 1;
            nm.f(-65);
            ac.f((byte) -76);
        }
    }

    private final boolean b(int param0, boolean param1) {
        this.h(94);
        int var3 = param0;
        if (!(-1 < (this.field_b.field_h ^ -1))) {
            var3 = this.field_f[this.field_b.field_h].field_d;
        }
        if (20 == var3) {
            if (!(!this.field_b.b((byte) 114))) {
                og.a(false, 4, true);
                nm.f(param0 + 37);
                return true;
            }
        }
        if (var3 == 21 && this.field_b.b((byte) 114)) {
            s.b(true);
            ba.field_c = false;
            qi.a(param1, (byte) -104);
            nm.f(param0 ^ -126);
            return true;
        }
        return false;
    }

    final void a(boolean param0) {
        if (param0) {
            ke.e((byte) -98);
        }
        this.a(true, 15764);
        int var2 = -(this.field_o * this.field_o * 640 / 400) + (640 - (this.field_u >> -2066854142));
        wk.field_l.c(320 + -(wk.field_l.field_I / 2), -(var2 >> -2060126462) + 20);
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int statePc = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ec var9 = null;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = client.field_A ? 1 : 0;
                    var7 = -41 % ((-31 - param3) / 62);
                    var6 = 0;
                    var8 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_b.field_l <= var8) {
                        statePc = 22;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var9 = this.field_f[var8];
                    var10 = var9.field_n;
                    stackIn_32_0 = 6;
                    stackIn_3_0 = stackIn_32_0;
                    stackIn_32_1 = var9.field_d;
                    stackIn_3_1 = stackIn_32_1;
                    if (var11 != 0) {
                        statePc = 32;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0 == stackIn_3_1) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (7 == var9.field_d) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var10 += 133;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var9.field_m = var8 * param4 + param0;
                    if (var6 < var10) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var6 = var10;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (param2) {
                        statePc = 17;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var8++;
                    if (var11 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var8 = 0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (this.field_b.field_l <= var8) {
                        statePc = 27;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    this.field_f[var8].field_n = var6;
                    this.field_f[var8].field_l = param1 + -(var6 / 2);
                    var8++;
                    if (var11 != 0) {
                        statePc = 27;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var11 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (-1 <= (var8 ^ -1)) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var9.field_r = var9.field_r - 3;
                    var9.field_m = var9.field_m + 3;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if ((var8 ^ -1) <= (-1 + this.field_b.field_l ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var9.field_r = var9.field_r - 3;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    var8++;
                    if (var11 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var8 = 0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (this.field_b.field_l <= var8) {
                        statePc = 27;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    this.field_f[var8].field_n = var6;
                    this.field_f[var8].field_l = param1 + -(var6 / 2);
                    var8++;
                    if (var11 != 0) {
                        statePc = 27;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var11 == 0) {
                        statePc = 23;
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
                        statePc = 34;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 30: {
                    this.field_f[var8].field_n = var6;
                    this.field_f[var8].field_l = param1 + -(var6 / 2);
                    var8++;
                    if (var11 != 0) {
                        statePc = 27;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (stackIn_32_0 <= stackIn_32_1) {
                        statePc = 27;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 34: {
                    stackIn_32_0 = this.field_b.field_l;
                    stackIn_32_1 = var8;
                    statePc = 32;
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void k(byte param0) {
        this.field_u = this.field_u + this.field_c / 2;
        this.field_c = 7 * this.field_c / 8;
        this.field_c = this.field_c - this.field_u;
        if (param0 <= 107) {
            ke.a(103, -21, -87, 6, (byte) -30);
        }
    }

    final void d(int param0) {
        boolean discarded$0 = false;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int var3;
        var3 = client.field_A ? 1 : 0;
        h.a((ke) (this), (byte) 95);
        L0: while (true) {
          L1: {
            L2: {
              if (!ab.c((byte) -18)) {
                break L2;
              } else {
                stackIn_32_0 = wh.field_c;

                stackIn_32_1 = 13;

                if (var3 != 0) {
                  break L1;
                } else {
                  if (stackIn_32_0 != stackIn_32_1) {
                    L3: {
                      L4: {
                        if (ph.n(-30146)) {
                          break L4;
                        } else {
                          L5: {
                            this.field_b.d(param0 ^ -8622);
                            if (-97 == (wh.field_c ^ -1)) {
                              cj.field_c = (cj.field_c + 1) % 2;
                              this.field_b.a(cj.field_c, (byte) -91);
                              nm.f(126);
                              this.field_b.field_o = false;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          L6: {
                            if (-98 != (wh.field_c ^ -1)) {
                              break L6;
                            } else {
                              cj.field_c = (cj.field_c + 1) % 2;
                              this.field_b.a(cj.field_c, (byte) -113);
                              nm.f(param0 + 8601);
                              this.field_b.field_o = false;
                              break L6;
                            }
                          }
                          L7: {
                            if ((wh.field_c ^ -1) == -99) {
                              L8: {
                                if (this.field_b.field_h == 2) {
                                  break L8;
                                } else {
                                  this.field_b.a(2, (byte) -98);
                                  if (var3 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              this.field_b.a(cj.field_c, (byte) -69);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          if (wh.field_c == 99) {
                            L9: {
                              L10: {
                                if ((this.field_b.field_h ^ -1) > -1) {
                                  break L10;
                                } else {
                                  if (2 > this.field_b.field_h) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              this.field_b.a(cj.field_c, (byte) -101);
                              if (var3 == 0) {
                                break L3;
                              } else {
                                break L9;
                              }
                            }
                            this.field_b.a(2, (byte) -109);
                            if (var3 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.field_b.a(-31);
                      break L3;
                    }
                    if (this.a(-14845, false)) {
                      return;
                    } else {
                      if (var3 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    nm.f(param0 + 8749);
                    ve.field_Hc = false;
                    qi.a(false, (byte) -112);
                    return;
                  }
                }
              }
            }
            stackIn_32_0 = param0;
            stackIn_32_1 = -8622;
            break L1;
          }
          L11: {
            if (stackIn_32_0 == stackIn_32_1) {
              break L11;
            } else {
              this.field_w = 87;
              break L11;
            }
          }
          this.field_b.a(this.a(400, bh.field_g, pm.field_f), -20563, this.a(400, he.field_S, nf.field_h));
          discarded$0 = this.a(-14845, true);
          return;
        }
    }

    private final void e(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        ec var7;
        String var8;
        int var9;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        L0: {
          var9 = client.field_A ? 1 : 0;
          var2 = -(this.field_u >> -1889653886) + (640 + -(640 * (this.field_o * this.field_o) / 400));
          if (this.field_t > 0) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {
          var3 = stackIn_3_0;
          if (3 > this.field_t) {
            stackIn_6_0 = this.field_b.field_l;
            break L1;
          } else {
            stackIn_6_0 = this.field_b.field_l + -1;
            break L1;
          }
        }
        var4 = stackIn_6_0;
        var5 = var3;
        L2: while (true) {
          L3: {
            L4: {
              if (var5 >= var4) {
                break L4;
              } else {
                vk.a(this.field_f[var5].field_r, (byte) 50, on.field_e, this.field_f[var5].field_n, this.field_f[var5].field_m, this.field_f[var5].field_l + var2);
                var6 = 16687906;
                stackIn_13_0 = var5;

                stackIn_13_1 = this.field_b.field_h;

                if (var9 != 0) {
                  break L3;
                } else {
                  L5: {
                    if (stackIn_13_0 != stackIn_13_1) {
                      break L5;
                    } else {
                      var6 = 16777215;
                      break L5;
                    }
                  }
                  var7 = this.field_f[var5];
                  var8 = var7.field_o;
                  ga.a(var7.field_n, 1, var7.field_m, var8, 1, var7.field_r, var6, a.field_t, (byte) -125, 1, var2 + var7.field_l);
                  var5++;
                  if (var9 == 0) {
                    continue L2;
                  } else {
                    break L4;
                  }
                }
              }
            }
            stackIn_13_0 = param0;
            stackIn_13_1 = 16687906;
            break L3;
          }
          L6: {
            if (stackIn_13_0 == stackIn_13_1) {
              break L6;
            } else {
              this.field_c = 100;
              break L6;
            }
          }
          return;
        }
    }

    private final boolean c(boolean param0, int param1) {
        int var3;
        L0: {
          this.h(118);
          var3 = -1;
          if (-1 < (this.field_b.field_h ^ -1)) {
            break L0;
          } else {
            var3 = this.field_f[this.field_b.field_h].field_d;
            break L0;
          }
        }
        L1: {
          if (20 != var3) {
            break L1;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L1;
            } else {
              og.a(false, 5, true);
              nm.f(-72);
              return true;
            }
          }
        }
        L2: {
          L3: {
            if ((var3 ^ -1) == -20) {
              break L3;
            } else {
              if ((var3 ^ -1) == -11) {
                break L3;
              } else {
                if (3 == var3) {
                  break L3;
                } else {
                  if (13 == var3) {
                    break L3;
                  } else {
                    if (param0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
          }
          if (this.field_b.b((byte) 114)) {
            L4: {
              if (-14 != (var3 ^ -1)) {
                break L4;
              } else {
                he.field_db = false;
                break L4;
              }
            }
            L5: {
              L6: {
                lk.field_F = false;
                if ((var3 ^ -1) == -4) {
                  break L6;
                } else {
                  if (13 == var3) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
              fm.field_e = false;
              mg.field_Zb = false;
              break L5;
            }
            qi.a(param0, (byte) -102);
            nm.f(115);
            return true;
          } else {
            break L2;
          }
        }
        L7: {
          if (param1 >= 119) {
            break L7;
          } else {
            this.b((byte) -109);
            break L7;
          }
        }
        return false;
    }

    final static void a(byte param0) {
        boolean stackIn_18_0 = false;
        int stackIn_27_0 = 0;
        tj stackIn_135_0 = null;
        tj stackIn_136_0 = null;
        tj stackIn_137_0 = null;
        int stackIn_137_1 = 0;
        int stackIn_175_0 = 0;
        tj stackIn_181_0 = null;
        tj stackIn_182_0 = null;
        tj stackIn_183_0 = null;
        int stackIn_183_1 = 0;
        boolean stackOut_17_0;
        int statePc = 0;
        Throwable caughtException = null;
        uf var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        tj var3_ref_tj = null;
        int var3_int = 0;
        long var3 = 0L;
        ve var4_ref_ve = null;
        int var4 = 0;
        int var5 = 0;
        ve var6 = null;
        String var6_ref = null;
        tj var7 = null;
        int var8_int = 0;
        tj var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        uf var12 = null;
        ve var13 = null;
        ve var14 = null;
        ve var15 = null;
        Object var16 = null;
        Object var17 = null;
        Object var18 = null;
        tj var19 = null;
        tj var20 = null;
        String var21 = null;
        String var22 = null;
        tj var23 = null;
        tj var24 = null;
        String var25 = null;
        String var26 = null;
        ve var27 = null;
        ve var28 = null;
        tj var29 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = null;
                    var17 = null;
                    var16 = null;
                    var11 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 >= 85) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_n = (String) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var12 = de.field_V;
                        var1 = var12;
                        var2 = ((wl) ((Object) var1)).d((byte) -114);
                        if (-1 == (var2 ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var2 ^ -1) == -2) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (-3 == (var2 ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var2 == 3) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var2 != 4) {
                            statePc = 57;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var3_ref_tj = (tj) ((Object) oc.field_b.c((byte) 117));
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var3_ref_tj == null) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var3_ref_tj.b((byte) 110);
                        var3_ref_tj.e((byte) 73);
                        var3_ref_tj = (tj) ((Object) oc.field_b.d(true));
                        if (var11 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var11 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3_ref_tj = (tj) ((Object) ob.field_i.c(-9443));
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var3_ref_tj == null) {
                            statePc = 26;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = var3_ref_tj.field_bc;
                        stackIn_27_0 = stackOut_17_0 ? 1 : 0;
                        stackIn_18_0 = stackOut_17_0;
                        if (var11 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (stackIn_18_0) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (!var3_ref_tj.field_fc) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var3_ref_tj.field_fc) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var3_ref_tj.field_fc = false;
                        cj.field_a = cj.field_a - 1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var3_ref_tj.field_bc = false;
                        wk.a((byte) 94, var3_ref_tj);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var3_ref_tj = (tj) ((Object) ob.field_i.b(-99));
                        if (var11 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = var2;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0 != 1) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (cd.field_m != null) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        ub.field_c = cd.field_m.field_Vb;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (4 == var2) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        cd.field_m = null;
                        if (var11 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var3_int = ((wl) ((Object) var1)).e(3);
                        cd.field_m = new ve(j.field_b);
                        cd.field_m.a((long)var3_int, (byte) 111);
                        wg.a(false, var1, cd.field_m, (byte) -49);
                        km.field_C = 0L;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (2 == var2) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (3 == var2) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        g.field_N = null;
                        if (var11 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (g.field_N == null) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        g.field_N = new ve(j.field_b);
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var2 == 3) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        fj.field_h = false;
                        if (var11 == 0) {
                            statePc = 186;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        fj.field_h = true;
                        var3_int = 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (kk.field_l.length <= var3_int) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        kk.field_l[var3_int] = ((wl) ((Object) var12)).g((byte) -101);
                        var3_int++;
                        if (var11 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var11 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        qa.field_x = ((wl) ((Object) var1)).d((byte) -95);
                        jb.field_c = ((wl) ((Object) var1)).d((byte) -128);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var3_int = 0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if ((v.field_a.length ^ -1) >= (var3_int ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        v.field_a[var3_int] = ((wl) ((Object) var12)).g((byte) -119);
                        var3_int++;
                        if (var11 != 0) {
                            statePc = 186;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var11 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var11 == 0) {
                            statePc = 186;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var2 == 5) {
                            statePc = 172;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if ((var2 ^ -1) == -7) {
                            statePc = 162;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (-8 == (var2 ^ -1)) {
                            statePc = 155;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (8 != var2) {
                            statePc = 64;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var3_int = ((wl) ((Object) var1)).e(3);
                        var4_ref_ve = (ve) ((Object) tg.field_b.a(24710, (long)var3_int));
                        if (var4_ref_ve != null) {
                            statePc = 63;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var4_ref_ve = new ve(j.field_b);
                        tg.field_b.a(var4_ref_ve, -1, (long)var3_int);
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        wg.a(true, var1, var4_ref_ve, (byte) -89);
                        pj.a(var4_ref_ve, (byte) -50);
                        if (var11 == 0) {
                            statePc = 186;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (-10 != (var2 ^ -1)) {
                            statePc = 73;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var3_int = ((wl) ((Object) var1)).e(3);
                        var4 = ((wl) ((Object) var1)).d((byte) -41);
                        var27 = (ve) ((Object) tg.field_b.a(24710, (long)var3_int));
                        if (var27 != null) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if ((var4 ^ -1) == -1) {
                            statePc = 70;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var27.field_Rb = oa.field_a;
                        var27.field_oc = var4;
                        if (var11 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var27.b((byte) 127);
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var27.e((byte) 98);
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (var11 == 0) {
                            statePc = 186;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (-11 == (var2 ^ -1)) {
                            statePc = 149;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if ((var2 ^ -1) == -12) {
                            statePc = 77;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (12 != var2) {
                            statePc = 85;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var3_int = ((wl) ((Object) var1)).e(3);
                        var28 = (ve) ((Object) tg.field_b.a(24710, (long)var3_int));
                        if (var28 != null) {
                            statePc = 79;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if ((var2 ^ -1) != -12) {
                            statePc = 82;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var28.field_Zb = true;
                        if (var11 == 0) {
                            statePc = 83;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var28.field_Ob = true;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        pj.a(var28, (byte) -50);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (var11 == 0) {
                            statePc = 186;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if ((var2 ^ -1) != -14) {
                            statePc = 91;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var3_int = ((wl) ((Object) var1)).e(3);
                        var4 = ((wl) ((Object) var1)).d((byte) -49);
                        var14 = (ve) ((Object) tg.field_b.a(24710, (long)var3_int));
                        if (var14 == null) {
                            statePc = 90;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var13 = var14;
                        var6 = var13;
                        var14.field_Ob = false;
                        var13.field_Zb = false;
                        if (0 == var4) {
                            statePc = 89;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var14.field_Rb = oa.field_a;
                        var14.field_oc = var4;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        pj.a(var14, (byte) -50);
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (var11 == 0) {
                            statePc = 186;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (var2 == 14) {
                            statePc = 94;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (var2 != 16) {
                            statePc = 103;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var3 = ((wl) ((Object) var1)).f((byte) -108);
                        var19 = ma.a(-119, var3);
                        if (var19 != null) {
                            statePc = 96;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (14 == var2) {
                            statePc = 100;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (var19.field_fc) {
                            statePc = 101;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var19.field_fc = true;
                        cj.field_a = cj.field_a + 1;
                        if (var11 == 0) {
                            statePc = 101;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var19.field_bc = true;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        wk.a((byte) 57, var19);
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (var11 == 0) {
                            statePc = 186;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if ((var2 ^ -1) == -16) {
                            statePc = 138;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if ((var2 ^ -1) == -18) {
                            statePc = 138;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (18 == var2) {
                            statePc = 132;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (19 == var2) {
                            statePc = 124;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (20 != var2) {
                            statePc = 110;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        wg.a(false, var1, cd.field_m, (byte) -103);
                        if (var11 == 0) {
                            statePc = 186;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (21 == var2) {
                            statePc = 119;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (22 != var2) {
                            statePc = 114;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        de.field_R = ((wl) ((Object) var1)).e(3);
                        rf.field_o = ((wl) ((Object) var1)).a(-104);
                        if (var11 == 0) {
                            statePc = 186;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (23 != var2) {
                            statePc = 117;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        uc.field_g = ((wl) ((Object) var1)).f((byte) -108);
                        if (var11 == 0) {
                            statePc = 186;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        qb.a((Throwable) null, 16408, "L1: " + qk.d((byte) 49));
                        si.a(117);
                        if (var11 == 0) {
                            statePc = 186;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var3_int = ((wl) ((Object) var1)).e(3);
                        if (-1 != (var3_int ^ -1)) {
                            statePc = 122;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        km.field_C = 0L;
                        if (var11 == 0) {
                            statePc = 123;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        km.field_C = ik.a(4) + (long)var3_int;
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (var11 == 0) {
                            statePc = 186;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        var3 = ((wl) ((Object) var1)).f((byte) -108);
                        var5 = ((wl) ((Object) var1)).d((byte) -41);
                        var20 = bj.a(var3, (byte) 79);
                        if (var20 != null) {
                            statePc = 126;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (var5 == 0) {
                            statePc = 129;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        var20.field_hc = var5;
                        var20.field_Qb = oa.field_a;
                        if (var11 == 0) {
                            statePc = 130;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        var20.b((byte) 105);
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        var20.e((byte) 84);
                        cd.field_m.field_rc = cd.field_m.field_rc - 1;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (var11 == 0) {
                            statePc = 186;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        var3 = ((wl) ((Object) var1)).f((byte) -108);
                        var21 = ((wl) ((Object) var1)).c((byte) -38);
                        var22 = ((wl) ((Object) var1)).c((byte) -38);
                        var7 = bj.a(var3, (byte) 63);
                        if (var7 != null) {
                            statePc = 134;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        var7 = new tj(var21, var22, var3);
                        hn.field_h.a(var7, -1, var3);
                        cd.field_m.field_rc = cd.field_m.field_rc + 1;
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        var7.field_Ub = ((wl) ((Object) var1)).e(3);
                        var8_int = ((wl) ((Object) var1)).a(-69);
                        var7.field_Xb = var8_int >> 1139399329;
                        stackIn_136_0 = (tj) (var7);
                        stackIn_135_0 = stackIn_136_0;
                        if ((1 & var8_int ^ -1) == -1) {
                            statePc = 136;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        stackIn_137_0 = (tj) ((Object) stackIn_135_0);
                        stackIn_137_1 = 1;
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        stackIn_137_0 = (tj) ((Object) stackIn_136_0);
                        stackIn_137_1 = 0;
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        stackIn_137_0.field_ec = stackIn_137_1 != 0;
                        var7.field_dc = ((wl) ((Object) var1)).d((byte) -29);
                        var7.field_Sb = ((wl) ((Object) var1)).d((byte) -79);
                        oc.field_b.a(var7, 2777);
                        if (var11 == 0) {
                            statePc = 186;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        var3 = ((wl) ((Object) var1)).f((byte) -108);
                        var5 = ((wl) ((Object) var1)).d((byte) -87);
                        var23 = ma.a(-119, var3);
                        if (var23 == null) {
                            statePc = 148;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        if (-1 == (var5 ^ -1)) {
                            statePc = 141;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        var23.field_Qb = oa.field_a;
                        var23.field_hc = var5;
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if ((var2 ^ -1) != -16) {
                            statePc = 144;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        var23.field_bc = false;
                        if (var11 == 0) {
                            statePc = 147;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        if (var23.field_fc) {
                            statePc = 146;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        cj.field_a = cj.field_a - 1;
                        var23.field_fc = false;
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        wk.a((byte) 34, var23);
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if (var11 == 0) {
                            statePc = 186;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        var15 = (ve) ((Object) h.field_b.c((byte) 121));
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        if (var15 == null) {
                            statePc = 154;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        var15.b((byte) 115);
                        var15.e((byte) 118);
                        var15 = (ve) ((Object) h.field_b.d(true));
                        if (var11 != 0) {
                            statePc = 186;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        if (var11 == 0) {
                            statePc = 150;
                        } else {
                            statePc = 153;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (var11 == 0) {
                            statePc = 186;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        var29 = (tj) ((Object) i.field_b.c((byte) 43));
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        if (var29 == null) {
                            statePc = 160;
                        } else {
                            statePc = 157;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        var29.b((byte) 108);
                        var29.e((byte) 112);
                        var29 = (tj) ((Object) i.field_b.d(true));
                        if (var11 != 0) {
                            statePc = 161;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        if (var11 == 0) {
                            statePc = 156;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        cj.field_a = 0;
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        if (var11 == 0) {
                            statePc = 186;
                        } else {
                            statePc = 162;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        var3 = ((wl) ((Object) var1)).f((byte) -108);
                        var5 = ((wl) ((Object) var1)).d((byte) -89);
                        var24 = ma.a(-122, var3);
                        if (var24 != null) {
                            statePc = 164;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        if (!var24.field_fc) {
                            statePc = 166;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        var24.field_fc = false;
                        cj.field_a = cj.field_a - 1;
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        if (-1 == (var5 ^ -1)) {
                            statePc = 169;
                        } else {
                            statePc = 167;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        var24.field_hc = var5;
                        var24.field_Qb = oa.field_a;
                        if (var11 == 0) {
                            statePc = 170;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        var24.b((byte) 114);
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        var24.e((byte) 95);
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        if (var11 == 0) {
                            statePc = 186;
                        } else {
                            statePc = 172;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        var3 = ((wl) ((Object) var1)).f((byte) -108);
                        var25 = ((wl) ((Object) var1)).c((byte) -38);
                        var6_ref = ((wl) ((Object) var1)).c((byte) -38);
                        var26 = ((wl) ((Object) var1)).c((byte) -38);
                        var8 = ma.a(-102, var3);
                        if (var6_ref.equals("")) {
                            statePc = 174;
                        } else {
                            statePc = 173;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        stackIn_175_0 = 1;
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        stackIn_175_0 = 0;
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        var9 = stackIn_175_0;
                        if (var8 != null) {
                            statePc = 177;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        var8 = new tj(var25, var26, var3);
                        ob.field_i.a(var8, -1, var3);
                        if (var11 == 0) {
                            statePc = 180;
                        } else {
                            statePc = 177;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        if (var9 != 0) {
                            statePc = 179;
                        } else {
                            statePc = 178;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        statePc = 180;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        var8.a((byte) 19, var26, var25);
                        statePc = 180;
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        var8.field_Nb = ik.a(4) - (long)((wl) ((Object) var1)).i(7553);
                        var8.field_Ub = ((wl) ((Object) var1)).e(3);
                        var10 = ((wl) ((Object) var1)).a(-28);
                        stackIn_182_0 = (tj) (var8);
                        stackIn_181_0 = stackIn_182_0;
                        if ((var10 & 1 ^ -1) == -1) {
                            statePc = 182;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        stackIn_183_0 = (tj) ((Object) stackIn_181_0);
                        stackIn_183_1 = 1;
                        statePc = 183;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        stackIn_183_0 = (tj) ((Object) stackIn_182_0);
                        stackIn_183_1 = 0;
                        statePc = 183;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        stackIn_183_0.field_ec = stackIn_183_1 != 0;
                        var8.field_Xb = var10 >> -125735103;
                        var8.field_dc = ((wl) ((Object) var1)).d((byte) -98);
                        var8.field_Sb = ((wl) ((Object) var1)).d((byte) -128);
                        wk.a((byte) 112, var8);
                        statePc = 186;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 185: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var1_ref), "ke.EA(" + param0 + ')');
                }
                case 186: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(int param0, int param1) {
        if (param0 != 2047) {
            field_h = (int[]) null;
        }
        return qg.field_b[param1 & 2047];
    }

    final void c(byte param0) {
        if (param0 != -75) {
            this.field_r = true;
        }
        this.a(false, 15764);
        int var2 = 640 + (-(this.field_o * this.field_o * 640 / 400) - (this.field_u >> -1363351294));
        ed.a(16777215, var2 + 320, si.field_g, 120, (byte) 75, w.field_kb);
        ed.a(16777215, var2 + 320, gf.a(-125, this.field_s, this.field_j, this.field_r), 140, (byte) 75, w.field_kb);
        ed.a(16777215, 320 + var2, ri.a(param0 ^ -75, this.field_s, this.field_j, this.field_r), 240, (byte) 75, w.field_kb);
        ed.a(16777215, var2 + 320, kk.a(this.field_j, this.field_s, this.field_r, true), 300, (byte) 75, w.field_kb);
    }

    final void i(int param0) {
        String stackIn_16_1 = null;
        String stackIn_25_1 = null;
        Object stackIn_36_0 = null;
        Object stackIn_36_1 = null;
        String stackOut_15_1;
        String stackOut_24_1;
        int var2;
        ck var3;
        int var4;
        int var5;
        int var6_int;
        Object var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        String[] var18;
        String[] var20;
        int[] var22;
        int[] var23;
        L0: {
          var15 = client.field_A ? 1 : 0;
          var2 = -(this.field_u >> 174174562) + (-(640 * this.field_o * this.field_o / 400) + 640);
          this.a(false, 15764);
          var3 = wh.field_f;
          var3.c(-(var3.field_K / 2) + 320, 45 + (-(var3.field_C / 2) - (var2 >> -1906814366)));
          if (null != this.field_e) {
            break L0;
          } else {
            if (!ph.n(-30146)) {
              this.field_e = am.a(3, false, 1, 1, 10);
              break L0;
            } else {
              break L0;
            }
          }
        }
        var4 = -44 / ((63 - param0) / 44);
        var5 = bf.a((byte) 107, gh.field_e, fc.field_e, this.field_e);
        fl.a(105, 256, 16777215, vm.field_x, 125 - -var2, w.field_kb);
        kn.a(w.field_kb, (byte) -39, 105, ng.field_g, 16777215, var2 + 400);
        kn.a(w.field_kb, (byte) -39, 105, sl.field_b, 16777215, 545 + var2);
        var6_int = 0;
        L1: while (true) {
          L2: {
            if (-11 >= (var6_int ^ -1)) {
              break L2;
            } else {
              var7 = 16777215;
              kn.a(w.field_kb, (byte) -39, 130 + var6_int * 20, 1 + var6_int + ".", var7, var2 + 115);
              var6_int++;
              if (var15 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            L4: {
              var6 = le.field_r;
              var7 = 1;
              if (null == this.field_e) {
                break L4;
              } else {
                L5: {
                  if (this.field_e.field_p) {
                    break L5;
                  } else {
                    var6 = wm.field_k;
                    if (var15 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  L7: {
                    if (null != this.field_e.field_r) {
                      var18 = this.field_e.field_r[fc.field_e];
                      var22 = this.field_e.field_u[fc.field_e];
                      var10 = 0;
                      L8: while (true) {
                        if (10 <= var10) {
                          break L6;
                        } else {
                          stackIn_36_0 = null;

                          stackOut_15_1 = var18[var10];
                          stackIn_36_1 = stackOut_15_1;
                          stackIn_16_1 = stackOut_15_1;
                          if (var15 != 0) {
                            break L3;
                          } else {
                            L9: {
                              if (stackIn_36_0 == stackIn_16_1) {
                                break L9;
                              } else {
                                L10: {
                                  var6 = null;
                                  var11 = 16769088;
                                  var12 = var22[var10];
                                  var13 = var12 >>> 869777032;
                                  if ((var5 ^ -1) == (var10 ^ -1)) {
                                    var11 = 16777215;
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                var14 = 1 + var12 % 256;
                                fl.a(130 + 20 * var10, 256, var11, var18[var10], 125 - -var2, se.field_S);
                                kn.a(se.field_S, (byte) -39, 20 * var10 + 130, Integer.toString(var14), var11, var2 + 400);
                                kn.a(se.field_S, (byte) -39, var10 * 20 + 130, Integer.toString(var13), var11, var2 + 545);
                                break L9;
                              }
                            }
                            var10++;
                            if (var15 == 0) {
                              continue L8;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    } else {
                      var6 = dn.field_s;
                      if (var15 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var20 = this.field_e.field_r[fc.field_e];
                  var23 = this.field_e.field_u[fc.field_e];
                  var10 = 0;
                  L11: while (true) {
                    if (10 <= var10) {
                      break L6;
                    } else {
                      stackIn_36_0 = null;

                      stackOut_24_1 = var20[var10];
                      stackIn_36_1 = stackOut_24_1;
                      stackIn_25_1 = stackOut_24_1;
                      if (var15 != 0) {
                        break L3;
                      } else {
                        L12: {
                          if (stackIn_36_0 == stackIn_25_1) {
                            break L12;
                          } else {
                            L13: {
                              var6 = null;
                              var11 = 16769088;
                              var12 = var23[var10];
                              var13 = var12 >>> 869777032;
                              if ((var5 ^ -1) == (var10 ^ -1)) {
                                var11 = 16777215;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            var14 = 1 + var12 % 256;
                            fl.a(130 + 20 * var10, 256, var11, var20[var10], 125 - -var2, se.field_S);
                            kn.a(se.field_S, (byte) -39, 20 * var10 + 130, Integer.toString(var14), var11, var2 + 400);
                            kn.a(se.field_S, (byte) -39, var10 * 20 + 130, Integer.toString(var13), var11, var2 + 545);
                            break L12;
                          }
                        }
                        var10++;
                        if (var15 == 0) {
                          continue L11;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
                if (-1 >= (var5 ^ -1)) {
                  break L4;
                } else {
                  if (null == gh.field_e) {
                    break L4;
                  } else {
                    if ((gh.field_e.field_x ^ -1) != -2) {
                      break L4;
                    } else {
                      fl.a(330, 256, 16777215, oa.field_f, var2 + 125, se.field_S);
                      var8 = gh.field_e.field_s[0];
                      var9 = var8 % 256 + 1;
                      kn.a(se.field_S, (byte) -39, 330, Integer.toString(var9), 16777215, 400 + var2);
                      var10 = var8 >>> -1510192632;
                      var7 = 0;
                      kn.a(se.field_S, (byte) -39, 330, Integer.toString(var10), 16777215, var2 + 545);
                      break L4;
                    }
                  }
                }
              }
            }
            stackIn_36_0 = null;
            stackIn_36_1 = var6;
            break L3;
          }
          L14: {
            if (stackIn_36_0 != stackIn_36_1) {
              ed.a(16777215, 320 - -var2, (String) (var6), 220, (byte) 75, w.field_kb);
              break L14;
            } else {
              break L14;
            }
          }
          L15: {
            L16: {
              if (!ph.n(-30146)) {
                break L16;
              } else {
                ed.a(16777215, 320 + var2, lf.field_d, 330, (byte) 75, se.field_S);
                if (var15 == 0) {
                  break L15;
                } else {
                  break L16;
                }
              }
            }
            if (var7 != 0) {
              ed.a(16777215, var2 + 320, af.field_e, 330, (byte) 75, se.field_S);
              break L15;
            } else {
              break L15;
            }
          }
          return;
        }
    }

    final void i(byte param0) {
        if (param0 != 39) {
            return;
        }
        this.field_b.a(-115);
        boolean discarded$0 = this.p(-1);
    }

    private final void a(boolean param0, int param1) {
        qc stackIn_28_0 = null;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        int var3;
        int var4;
        ec var5;
        String var6;
        int var7;
        int var8;
        int var9;
        int var10;
        qc var10_ref_qc;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        L0: {
          var15 = client.field_A ? 1 : 0;
          var3 = -(this.field_u >> -134113438) + (640 - this.field_o * (this.field_o * 640) / 400);
          hk.a(4 + this.field_w - -var3, this.field_z - -4, this.field_y - 8, -8 + this.field_q, 0, 150);
          vk.a(this.field_q, (byte) 50, a.field_n, this.field_y, this.field_z, this.field_w + var3);
          if (param1 == 15764) {
            break L0;
          } else {
            this.field_r = false;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if ((var4 ^ -1) <= (this.field_b.field_l ^ -1)) {
                break L3;
              } else {
                var5 = this.field_f[var4];
                var6 = var5.field_o;
                var7 = var5.field_m;
                var8 = var5.field_r;
                if (var15 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (param0) {
                      L5: {
                        var9 = var7;
                        var10 = var8;
                        if (-1 <= (var4 ^ -1)) {
                          break L5;
                        } else {
                          var7 -= 3;
                          var8 += 3;
                          break L5;
                        }
                      }
                      L6: {
                        if (this.field_b.field_l - 1 > var4) {
                          var8 += 3;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      hk.b(0, var9, 640, var10 + var9);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L7: {
                    L8: {
                      var9 = 16694016;
                      if ((var4 ^ -1) != (this.field_b.field_h ^ -1)) {
                        break L8;
                      } else {
                        var9 = 16777215;
                        vk.a(var8, (byte) 50, im.field_i, var5.field_n, var7, var3 + var5.field_l);
                        if (var15 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    vk.a(var8, (byte) 50, on.field_e, var5.field_n, var7, var3 + var5.field_l);
                    break L7;
                  }
                  L9: {
                    if (-16 == (var5.field_d ^ -1)) {
                      L10: {
                        if ((kf.field_I.field_g.field_d & 1 << kf.field_I.field_P) != 0) {
                          break L10;
                        } else {
                          L11: {
                            if ((kf.field_I.field_g.field_d ^ -1) == -1) {
                              break L11;
                            } else {
                              var6 = pg.field_c;
                              if (-1 != (uf.field_A & 16 ^ -1)) {
                                break L9;
                              } else {
                                var9 = 16777215;
                                if (var15 == 0) {
                                  break L9;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          var6 = kf.field_R;
                          if (var15 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      var6 = e.field_a;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L12: {
                    if (var5.field_d != 17) {
                      break L12;
                    } else {
                      L13: {
                        if (kf.field_I == null) {
                          stackIn_28_0 = ce.field_C;
                          break L13;
                        } else {
                          stackIn_28_0 = kf.field_I;
                          break L13;
                        }
                      }
                      L14: {
                        var10_ref_qc = stackIn_28_0;
                        if (var10_ref_qc.field_W) {
                          break L14;
                        } else {
                          L15: {
                            if (0 == (1 << var10_ref_qc.field_P & var10_ref_qc.field_g.field_a)) {
                              break L15;
                            } else {
                              var6 = sc.field_h;
                              if (var15 == 0) {
                                break L12;
                              } else {
                                break L15;
                              }
                            }
                          }
                          L16: {
                            if (var10_ref_qc.field_g.field_a == 0) {
                              break L16;
                            } else {
                              L17: {
                                if ((uf.field_A & 16) == 0) {
                                  var9 = 16777215;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              var6 = k.field_h;
                              if (var15 == 0) {
                                break L12;
                              } else {
                                break L16;
                              }
                            }
                          }
                          L18: {
                            if (((1 << var10_ref_qc.field_g.field_b) + -1 ^ -1) != ((var10_ref_qc.field_yb | 1 << var10_ref_qc.field_P) ^ -1)) {
                              break L18;
                            } else {
                              var6 = ig.field_Xb;
                              if (var15 == 0) {
                                break L12;
                              } else {
                                break L18;
                              }
                            }
                          }
                          var6 = ji.field_c;
                          if (var15 == 0) {
                            break L12;
                          } else {
                            break L14;
                          }
                        }
                      }
                      L19: {
                        if ((var10_ref_qc.field_g.field_a & 1 << var10_ref_qc.field_P) == 0) {
                          break L19;
                        } else {
                          var6 = rc.field_g;
                          if (var15 == 0) {
                            break L12;
                          } else {
                            break L19;
                          }
                        }
                      }
                      L20: {
                        if (-1 == (var10_ref_qc.field_g.field_a ^ -1)) {
                          break L20;
                        } else {
                          var6 = wj.field_Kb;
                          if (0 != (uf.field_A & 16)) {
                            break L12;
                          } else {
                            var9 = 16777215;
                            if (var15 == 0) {
                              break L12;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                      L21: {
                        if ((1 << var10_ref_qc.field_g.field_b) - 1 == (1 << var10_ref_qc.field_P | var10_ref_qc.field_yb)) {
                          break L21;
                        } else {
                          var6 = ik.field_g;
                          if (var15 == 0) {
                            break L12;
                          } else {
                            break L21;
                          }
                        }
                      }
                      var6 = di.field_E;
                      break L12;
                    }
                  }
                  L22: {
                    L23: {
                      if (-7 == (var5.field_d ^ -1)) {
                        break L23;
                      } else {
                        if (var5.field_d == 7) {
                          break L23;
                        } else {
                          L24: {
                            if (-23 != (var5.field_d ^ -1)) {
                              break L24;
                            } else {
                              if ((var4 ^ -1) != (fc.field_e ^ -1)) {
                                break L24;
                              } else {
                                var9 = 16777215;
                                break L24;
                              }
                            }
                          }
                          L25: {
                            if ((var5.field_d ^ -1) != -24) {
                              break L25;
                            } else {
                              if (var4 != cj.field_c) {
                                break L25;
                              } else {
                                var9 = 16777215;
                                break L25;
                              }
                            }
                          }
                          ga.a(var5.field_n, 1, var7, var6, 20, var8, var9, a.field_t, (byte) -128, 1, var5.field_l - -var3);
                          if (var15 == 0) {
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                    L26: {
                      var10 = a.field_t.a(pm.field_c);
                      var11 = a.field_t.a(fj.field_f);
                      if (var11 > var10) {
                        var10 = var11;
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    L27: {
                      var12 = (var10 + 5 + (-128 + var5.field_n)) / 2 + var5.field_l;
                      hk.a(-1 + var12 + var3, var7 + 11, 130, 8, 65793);
                      hk.a(1 + (var12 + var3), 13 + var7, 126, 4, var9);
                      if (-7 != (var5.field_d ^ -1)) {
                        stackIn_62_0 = a.field_g * 128 / 128;
                        break L27;
                      } else {
                        stackIn_62_0 = pb.field_d * 128 / 128;
                        break L27;
                      }
                    }
                    L28: {
                      var13 = stackIn_62_0;
                      ga.a(-5 + var12 - var5.field_l, 1, var7, var6, 20, var8, var9, a.field_t, (byte) -124, 2, var5.field_l - -var3);
                      if (-7 == (var5.field_d ^ -1)) {
                        stackIn_65_0 = 1;
                        break L28;
                      } else {
                        stackIn_65_0 = 3;
                        break L28;
                      }
                    }
                    var14 = stackIn_65_0;
                    tg.a(true, var14).c(var3 + (-9 + var12) - -var13, 6 + var7, 18, 18);
                    break L22;
                  }
                  L29: {
                    if ((var5.field_d ^ -1) != -3) {
                      break L29;
                    } else {
                      L30: {
                        if (-4 < (id.field_P ^ -1)) {
                          break L30;
                        } else {
                          if (!h.a(false)) {
                            break L29;
                          } else {
                            break L30;
                          }
                        }
                      }
                      hk.c(8 + (var3 + var5.field_l), var7 + 3, var5.field_n - 16, 2);
                      hk.c(4 + (var3 + var5.field_l), var7 - -5, var5.field_n + -8, -10 + var8);
                      hk.c(8 + (var3 + var5.field_l), -5 + (var8 + var7), -16 + var5.field_n, 2);
                      break L29;
                    }
                  }
                  var4++;
                  if (var15 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            hk.d();
            break L2;
          }
          return;
        }
    }

    final void c(int param0, boolean param1) {
        this.field_b.a(param1, 117, this.a(400, bh.field_g, pm.field_f));
        if (param0 != -1) {
            this.field_z = -92;
        }
    }

    final void l(byte param0) {
        int stackIn_35_0 = 0;
        int var2;
        int var4;
        var4 = client.field_A ? 1 : 0;
        var2 = 39 / ((47 - param0) / 51);
        h.a((ke) (this), (byte) 95);
        L0: while (true) {
          L1: {
            L2: {
              if (!ab.c((byte) -124)) {
                break L2;
              } else {
                stackIn_35_0 = wh.field_c ^ -1;

                if (var4 != 0) {
                  break L1;
                } else {
                  if (stackIn_35_0 != -14) {
                    L3: {
                      L4: {
                        if (ph.n(-30146)) {
                          break L4;
                        } else {
                          L5: {
                            this.field_b.d(0);
                            if ((wh.field_c ^ -1) != -97) {
                              break L5;
                            } else {
                              fc.field_e = (-1 + (3 + fc.field_e)) % 3;
                              this.field_b.a(fc.field_e, (byte) -113);
                              nm.f(4);
                              this.field_b.field_o = false;
                              break L5;
                            }
                          }
                          L6: {
                            if ((wh.field_c ^ -1) != -98) {
                              break L6;
                            } else {
                              fc.field_e = (fc.field_e - -1) % 3;
                              this.field_b.a(fc.field_e, (byte) -75);
                              nm.f(-117);
                              this.field_b.field_o = false;
                              break L6;
                            }
                          }
                          L7: {
                            if (wh.field_c == 98) {
                              L8: {
                                if (this.field_b.field_h >= 3) {
                                  break L8;
                                } else {
                                  this.field_b.a(-1 + this.field_b.field_l, (byte) -76);
                                  if (var4 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              L9: {
                                if (this.field_b.field_h == 3) {
                                  break L9;
                                } else {
                                  this.field_b.a(this.field_b.field_h + -1, (byte) -110);
                                  if (var4 == 0) {
                                    break L7;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              this.field_b.a(fc.field_e, (byte) -113);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          if (-100 == (wh.field_c ^ -1)) {
                            L10: {
                              if ((this.field_b.field_h ^ -1) > -1) {
                                break L10;
                              } else {
                                if (-1 + this.field_b.field_l == this.field_b.field_h) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (-4 >= (this.field_b.field_h ^ -1)) {
                                      break L11;
                                    } else {
                                      this.field_b.a(3, (byte) -126);
                                      if (var4 == 0) {
                                        break L3;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  this.field_b.a(this.field_b.field_h + 1, (byte) -95);
                                  if (var4 == 0) {
                                    break L3;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            this.field_b.a(fc.field_e, (byte) -123);
                            if (var4 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.field_b.a(-113);
                      break L3;
                    }
                    if (!this.c(false, (byte) -96)) {
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    } else {
                      return;
                    }
                  } else {
                    nm.f(-77);
                    fm.field_e = false;
                    qi.a(false, (byte) -107);
                    return;
                  }
                }
              }
            }
            this.field_b.a(this.a(400, bh.field_g, pm.field_f), -20563, this.a(400, he.field_S, nf.field_h));
            stackIn_35_0 = this.c(true, (byte) -76) ? 1 : 0;
            break L1;
          }
          return;
        }
    }

    final void a(int param0, byte param1) {
        ec dupTemp$2 = null;
        ec dupTemp$3 = null;
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = client.field_A ? 1 : 0;
                    var3 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_b.field_l <= var3) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    dupTemp$2 = this.field_f[var3];
                    dupTemp$2.field_m = dupTemp$2.field_m + param0;
                    var3++;
                    if (var4 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.a(false, 15764);
                    var3 = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (param1 == -54) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.field_v = (int[]) null;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if ((this.field_b.field_l ^ -1) >= (var3 ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    dupTemp$3 = this.field_f[var3];
                    dupTemp$3.field_m = dupTemp$3.field_m - param0;
                    var3++;
                    if (var4 != 0) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var4 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean c(boolean param0, byte param1) {
        this.h(123);
        int var3 = -1;
        if (!((this.field_b.field_h ^ -1) > -1)) {
            var3 = this.field_f[this.field_b.field_h].field_d;
        }
        if (20 == var3 && this.field_b.b((byte) 114)) {
            og.a(false, 8, true);
            nm.f(-11);
            return true;
        }
        if (var3 == 3 || (var3 ^ -1) == -14 || !param0) {
            if (this.field_b.b((byte) 114)) {
                fm.field_e = false;
                if (!(var3 != 13)) {
                    he.field_db = false;
                }
                qi.a(param0, (byte) -103);
                nm.f(11);
                return true;
            }
        }
        if (param0 && (ig.field_Yb ^ -1) != -1 && this.field_b.field_h != -1) {
            fc.field_e = this.field_b.field_h;
            this.field_b.a(fc.field_e, (byte) -103);
            nm.f(119);
            return true;
        }
        if (param1 > -41) {
            field_h = (int[]) null;
            return false;
        }
        return false;
    }

    private final void a(lm param0, int param1, int param2, int param3, int param4, int param5, int param6, String param7, int param8, int param9) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        try {
          L0: {
            L1: {
              var11_int = param6 + (param3 - -param2);
              if ((var11_int ^ -1) != -1) {
                param6 = (var11_int + param6 * 200) / (var11_int * 2);
                param3 = (var11_int + param3 * 200) / (2 * var11_int);
                param2 = (var11_int + 200 * param2) / (var11_int * 2);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((kd.field_p ^ -1) != -4) {
                stackIn_6_0 = 310;
                break L2;
              } else {
                stackIn_6_0 = 305;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_6_0;
              if (3 != kd.field_p) {
                stackIn_9_0 = 380;
                break L3;
              } else {
                stackIn_9_0 = 372;
                break L3;
              }
            }
            L4: {
              var13 = stackIn_9_0;
              if (kd.field_p == 3) {
                stackIn_12_0 = 427;
                break L4;
              } else {
                stackIn_12_0 = 435;
                break L4;
              }
            }
            L5: {
              var14 = stackIn_12_0;
              if (3 != kd.field_p) {
                stackIn_15_0 = 490;
                break L5;
              } else {
                stackIn_15_0 = 488;
                break L5;
              }
            }
            L6: {
              var15 = stackIn_15_0;
              fl.a(param5, 256, param1, param7, 125 - -param9, param0);
              kn.a(param0, (byte) -39, param5, Integer.toString(param8), param1, var12 - -param9);
              kn.a(param0, (byte) -39, param5, Integer.toString(var11_int), param1, var13 - -param9);
              kn.a(param0, (byte) -39, param5, param6 + "%", param1, var14 + param9);
              kn.a(param0, (byte) -39, param5, param3 + "%", param1, param9 + var15);
              kn.a(param0, (byte) -39, param5, param2 + "%", param1, param9 + 545);
              if (param4 == -5328) {
                break L6;
              } else {
                this.field_u = 81;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var11 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var11);

            stackIn_20_1 = new StringBuilder().append("ke.NA(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), stackIn_24_2 + ',' + param8 + ',' + param9 + ')');
        }
    }

    private final void n(int param0) {
        if (this.field_t < 3) {
            this.field_t = this.field_t + 1;
            nm.f(120);
            ac.f((byte) -87);
        }
        int var2 = 116 % ((param0 - 18) / 61);
    }

    private final boolean p(int param0) {
        this.h(115);
        int var2 = param0;
        if (!(0 > this.field_b.field_h)) {
            var2 = this.field_f[this.field_b.field_h].field_d;
        }
        if (17 == var2) {
            if (!(!this.field_b.b((byte) 114))) {
                kf.field_I.c(param0 ^ -77);
                nm.f(-72);
                return true;
            }
        }
        if (-19 == (var2 ^ -1) && this.field_b.b((byte) 114)) {
            if (fm.field_b) {
                tg.a((byte) -46);
            }
            if (fa.field_n) {
                ga.a(false, 0, 11);
            }
            nm.f(127);
            return true;
        }
        return false;
    }

    final void j(int param0) {
        int discarded$1 = 0;
        int var2;
        int var3;
        int stackIn_11_0 = 0;
        var3 = client.field_A ? 1 : 0;
        h.a((ke) (this), (byte) 95);
        L0: while (true) {
          L1: {
            L2: {
              if (!ab.c((byte) 10)) {
                break L2;
              } else {
                stackIn_11_0 = 13;

                if (var3 != 0) {
                  break L1;
                } else {
                  if (stackIn_11_0 == wh.field_c) {
                    nm.f(118);
                    lk.field_F = false;
                    qi.a(false, (byte) -117);
                    return;
                  } else {
                    this.field_b.a(-36);
                    if (this.c(false, 121)) {
                      return;
                    } else {
                      if (var3 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
            }
            this.field_b.a(this.a(400, bh.field_g, pm.field_f), -20563, this.a(400, he.field_S, nf.field_h));
            stackIn_11_0 = this.c(true, 126) ? 1 : 0;
            break L1;
          }
          L3: {
            var2 = stackIn_11_0;
            if (param0 < -78) {
              break L3;
            } else {
              this.j((byte) -93);
              break L3;
            }
          }
          if (var2 == 0) {
            L4: {
              if (ig.field_Yb != 0) {
                discarded$1 = this.b(true, (byte) -51);
                break L4;
              } else {
                break L4;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    final void g(byte param0) {
        int var2;
        int var3;
        int stackIn_7_0 = 0;
        var3 = client.field_A ? 1 : 0;
        h.a((ke) (this), (byte) 95);
        L0: while (true) {
          L1: {
            L2: {
              if (!ab.c((byte) -126)) {
                break L2;
              } else {
                this.field_b.a(-118);
                var2 = this.b(-1, false) ? 1 : 0;
                stackIn_7_0 = var2;

                if (var3 != 0) {
                  break L1;
                } else {
                  if (stackIn_7_0 == 0) {
                    if (var3 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            this.field_b.a(this.a(400, bh.field_g, pm.field_f), param0 + -20467, this.a(400, he.field_S, nf.field_h));
            stackIn_7_0 = this.b(-1, true) ? 1 : 0;
            break L1;
          }
          if (stackIn_7_0 == 0) {
            L3: {
              if (param0 == -96) {
                break L3;
              } else {
                field_d = 58;
                break L3;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    private final boolean d(int param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        L0: {
          var10 = client.field_A ? 1 : 0;
          this.h(111);
          var3 = -1;
          if ((this.field_b.field_h ^ -1) > -1) {
            break L0;
          } else {
            var3 = this.field_f[this.field_b.field_h].field_d;
            break L0;
          }
        }
        L1: {
          if ((var3 ^ -1) != -2) {
            break L1;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L1;
            } else {
              nm.f(120);
              pn.a(false, false, true);
              return true;
            }
          }
        }
        L2: {
          if (-3 != (var3 ^ -1)) {
            break L2;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L2;
            } else {
              nm.f(40);
              vk.a(param1, (byte) -73);
              return true;
            }
          }
        }
        L3: {
          if (var3 != 3) {
            break L3;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L3;
            } else {
              nm.f(-80);
              jm.a(0, param1);
              return true;
            }
          }
        }
        L4: {
          if (var3 != 4) {
            break L4;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L4;
            } else {
              nk.field_k = true;
              f.field_s = ek.a(param1, this.field_p, 640);
              nm.f(7);
              return true;
            }
          }
        }
        L5: {
          if (var3 != 5) {
            break L5;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L5;
            } else {
              kf.field_I.d((byte) -68);
              cd.a(true);
              nm.f(116);
              return true;
            }
          }
        }
        L6: {
          var4 = -97 / ((param0 - -46) / 55);
          if (var3 != 6) {
            break L6;
          } else {
            L7: {
              L8: {
                if (this.field_b.a(true)) {
                  break L8;
                } else {
                  if (this.field_b.b((byte) 114)) {
                    ik.c(93);
                    if (var10 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  } else {
                    break L7;
                  }
                }
              }
              L9: {
                var5 = a.field_t.a(pm.field_c);
                var6 = a.field_t.a(fj.field_f);
                if ((var6 ^ -1) < (var5 ^ -1)) {
                  var5 = var6;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                L11: {
                  var7 = (var5 + -128 + (this.field_f[this.field_b.field_h].field_n - -5)) / 2 + this.field_f[this.field_b.field_h].field_l;
                  var8 = bh.field_g + -var7;
                  var9 = 128 * var8 / 128;
                  if (var9 < 0) {
                    break L11;
                  } else {
                    if (var9 <= 128) {
                      break L10;
                    } else {
                      var9 = 128;
                      if (var10 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                var9 = 0;
                break L10;
              }
              if (pb.field_d == var9) {
                break L7;
              } else {
                pb.field_d = var9;
                if (uf.field_A + -this.field_x < 5) {
                  break L7;
                } else {
                  ik.c(106);
                  this.field_x = uf.field_A;
                  break L7;
                }
              }
            }
            L12: {
              if (this.field_b.c(114)) {
                pb.field_d = 0;
                ik.c(64);
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (this.field_b.a((byte) -51)) {
                pb.field_d = 128;
                ik.c(111);
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (!this.field_b.b(true)) {
                break L14;
              } else {
                if (-1 <= (pb.field_d ^ -1)) {
                  break L14;
                } else {
                  pb.field_d = -16 & -1 + pb.field_d;
                  ik.c(98);
                  break L14;
                }
              }
            }
            if (!this.field_b.b(-20)) {
              break L6;
            } else {
              if ((pb.field_d ^ -1) > -129) {
                pb.field_d = 16 + pb.field_d & -16;
                ik.c(120);
                break L6;
              } else {
                break L6;
              }
            }
          }
        }
        L15: {
          if (7 != var3) {
            break L15;
          } else {
            L16: {
              if (this.field_b.a(true)) {
                L17: {
                  var5 = a.field_t.a(pm.field_c);
                  var6 = a.field_t.a(fj.field_f);
                  if ((var6 ^ -1) < (var5 ^ -1)) {
                    var5 = var6;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  var7 = (var5 + (-128 + this.field_f[this.field_b.field_h].field_n + 5)) / 2 + this.field_f[this.field_b.field_h].field_l;
                  var8 = bh.field_g - var7;
                  var9 = var8 * 128 / 128;
                  sa.field_x = true;
                  if (var9 >= 0) {
                    break L18;
                  } else {
                    a.field_g = 0;
                    if (var10 == 0) {
                      break L16;
                    } else {
                      break L18;
                    }
                  }
                }
                L19: {
                  if ((var9 ^ -1) >= -129) {
                    break L19;
                  } else {
                    a.field_g = 128;
                    if (var10 == 0) {
                      break L16;
                    } else {
                      break L19;
                    }
                  }
                }
                a.field_g = var9;
                break L16;
              } else {
                break L16;
              }
            }
            L20: {
              if (this.field_b.c(122)) {
                a.field_g = 0;
                sa.field_x = true;
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if (this.field_b.a((byte) -51)) {
                sa.field_x = true;
                a.field_g = 128;
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if (this.field_b.b(true)) {
                L23: {
                  a.field_g = a.field_g + -1 & -16;
                  if (a.field_g < 0) {
                    a.field_g = 0;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                sa.field_x = true;
                break L22;
              } else {
                break L22;
              }
            }
            if (this.field_b.b(101)) {
              L24: {
                a.field_g = -16 & 16 + a.field_g;
                if (a.field_g <= 128) {
                  break L24;
                } else {
                  a.field_g = 128;
                  break L24;
                }
              }
              sa.field_x = true;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L25: {
          if (var3 != 8) {
            break L25;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L25;
            } else {
              L26: {
                L27: {
                  if (cl.field_v == null) {
                    break L27;
                  } else {
                    sn.a(false);
                    if (var10 == 0) {
                      break L26;
                    } else {
                      break L27;
                    }
                  }
                }
                jk.a(2, param1);
                break L26;
              }
              nm.f(119);
              return true;
            }
          }
        }
        L28: {
          if ((var3 ^ -1) != -10) {
            break L28;
          } else {
            if (this.field_b.b((byte) 114)) {
              ve.field_Hc = true;
              ca.field_wb = oj.a(param1, 415);
              nm.f(-105);
              return true;
            } else {
              break L28;
            }
          }
        }
        L29: {
          if ((var3 ^ -1) != -11) {
            break L29;
          } else {
            if (this.field_b.b((byte) 114)) {
              mg.field_Zb = true;
              cl.field_B = qj.a(-108, param1);
              nm.f(127);
              return true;
            } else {
              break L29;
            }
          }
        }
        L30: {
          if (19 != var3) {
            break L30;
          } else {
            if (this.field_b.b((byte) 114)) {
              fm.field_e = true;
              am.field_a = ib.a((byte) -80, param1);
              nm.f(-14);
              return true;
            } else {
              break L30;
            }
          }
        }
        L31: {
          if (11 != var3) {
            break L31;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L31;
            } else {
              lk.field_F = true;
              h.field_d = uh.a(o.field_g, param1, 0, -128);
              nm.f(114);
              return true;
            }
          }
        }
        L32: {
          if (12 != var3) {
            break L32;
          } else {
            if (this.field_b.b((byte) 114)) {
              nm.f(-38);
              sn.a(false);
              pk.a((byte) -17, se.h(25144));
              break L32;
            } else {
              break L32;
            }
          }
        }
        L33: {
          if (-14 != (var3 ^ -1)) {
            break L33;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L33;
            } else {
              nm.f(13);
              cd.a(true);
              return true;
            }
          }
        }
        L34: {
          if (-15 != (var3 ^ -1)) {
            break L34;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L34;
            } else {
              kf.field_I.c((byte) 100);
              am.field_c = false;
              kf.field_G = f.a(false, false, 0, false, kf.field_I.field_wb, 32357, false, false);
              un.a((byte) -30);
              dc.a(param1, 95);
              nm.f(126);
              return true;
            }
          }
        }
        L35: {
          if (var3 != 15) {
            break L35;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L35;
            } else {
              kf.field_I.b(-62);
              cd.a(true);
              nm.f(124);
              return true;
            }
          }
        }
        L36: {
          if (var3 != 16) {
            break L36;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L36;
            } else {
              kf.field_I.f(-49);
              cd.a(true);
              nm.f(-19);
              return true;
            }
          }
        }
        L37: {
          if ((var3 ^ -1) != -18) {
            break L37;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L37;
            } else {
              kf.field_I.c(-89);
              cd.a(true);
              nm.f(122);
              return true;
            }
          }
        }
        L38: {
          if (-19 != (var3 ^ -1)) {
            break L38;
          } else {
            if (!this.field_b.b((byte) 114)) {
              break L38;
            } else {
              L39: {
                if (fm.field_b) {
                  tg.a((byte) -115);
                  break L39;
                } else {
                  break L39;
                }
              }
              L40: {
                if (!fa.field_n) {
                  break L40;
                } else {
                  ga.a(false, 0, 11);
                  break L40;
                }
              }
              cd.a(true);
              nm.f(-42);
              return true;
            }
          }
        }
        return false;
    }

    private final void h(int param0) {
        boolean discarded$0 = false;
        if (param0 < 93) {
            discarded$0 = this.b(68, true);
        }
        if (!(!this.field_b.field_o)) {
            fj.a(32, (byte) -89, pg.field_d);
        }
    }

    final int a(int param0) {
        if (param0 != -1) {
            this.field_q = -13;
        }
        int var2 = -(this.field_u >> 1480277474) + 640 - 640 * this.field_o * this.field_o / 400;
        return var2;
    }

    public static void l(int param0) {
        field_n = null;
        field_h = null;
        if (param0 < 106) {
            ke.e((byte) 27);
        }
    }

    final void a(int param0, boolean param1, int param2) {
        this.field_b.a(param0, 0, this.a(400, bh.field_g, pm.field_f), param1);
        if (param2 != -129) {
            this.n(53);
        }
    }

    private final boolean b(boolean param0, int param1) {
        this.h(95);
        int var3 = -1;
        if ((this.field_b.field_h ^ -1) <= -1) {
            var3 = this.field_f[this.field_b.field_h].field_d;
        }
        if (20 == var3) {
            if (!(!this.field_b.b((byte) 114))) {
                og.a(false, 6, true);
                return true;
            }
        }
        if (-14 == (var3 ^ -1) || !param0) {
            if (this.field_b.b((byte) 114)) {
                mg.field_Zb = false;
                qi.a(param0, (byte) -103);
                nm.f(122);
                return true;
            }
        }
        if (param0 && (ig.field_Yb ^ -1) != -1) {
            if (!((this.field_b.field_h ^ -1) == 0)) {
                fc.field_e = this.field_b.field_h;
                this.field_b.a(fc.field_e, (byte) -112);
                nm.f(param1 + -34);
                return true;
            }
        }
        if (param1 != 1) {
            this.field_m = -102;
            return false;
        }
        return false;
    }

    ke(int param0) {
        this.field_k = -1;
        this.field_f = new ec[param0];
        this.field_b = new sk();
    }

    static {
        field_n = "Your rating is <%0>";
        field_h = new int[8192];
    }
}
