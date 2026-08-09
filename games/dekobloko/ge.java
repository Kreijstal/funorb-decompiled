/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge {
    static int field_e;
    static s field_f;
    static String field_d;
    static boolean field_j;
    static ck field_h;
    static ij field_g;
    static int field_b;
    static volatile int field_a;
    static volatile boolean field_i;
    static boolean field_c;

    final static int a(lk param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        lk var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 != null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var2_int = 0;
                        var3 = 10000 / param0.field_O;
                        if (param1 > 14) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var7 = (lk) null;
                        ge.a((lk) null, 96);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4 = param0.field_z;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0.field_a <= var4) {
                            statePc = 17;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_18_0 = 0;
                        stackIn_9_0 = stackIn_18_0;
                        if (var6 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5 = stackIn_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param0.field_O <= var5) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_16_0 = -1;
                        stackIn_12_0 = stackIn_16_0;
                        stackIn_16_1 = param0.field_P[var4 * param0.field_O - -var5] ^ -1;
                        stackIn_12_1 = stackIn_16_1;
                        if (var6 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 == stackIn_12_1) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var2_int = var2_int + var3;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5++;
                        if (var6 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = var3 * 3;
                        stackIn_16_1 = 4;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var3 = stackIn_16_0 / stackIn_16_1;
                        var4++;
                        if (var6 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var2_int = var2_int + var3 * param0.field_O;
                        var4 = 0;
                        stackIn_18_0 = -5001;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (stackIn_18_0 < (var2_int ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var4 = 1;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (-20001 < (var2_int ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var4 = 2;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = var4;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0;
                }
                case 24: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_26_0 = (RuntimeException) (var2);
                    stackIn_25_0 = stackIn_26_0;
                    stackIn_26_1 = new StringBuilder().append("ge.E(");
                    stackIn_25_1 = stackIn_26_1;
                    if (param0 == null) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_27_2 = "{...}";
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_27_2 = "null";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    throw dh.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static jg b(byte param0) {
        String var1;
        L0: {
          var1 = aa.a(param0 + 35);
          if (var1 == null) {
            break L0;
          } else {
            if (-1 < (var1.indexOf('@') ^ -1)) {
              break L0;
            } else {
              var1 = "";
              break L0;
            }
          }
        }
        if (param0 != -89) {
          field_b = 0;
          return new jg(aa.a(-65), uk.c((byte) -17));
        } else {
          return new jg(aa.a(-65), uk.c((byte) -17));
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
            return;
        }
        field_f = null;
        field_h = null;
        field_g = null;
    }

    final static ni a(byte param0, int param1, int param2, pi[] param3, byte[] param4, int param5) {
        byte[] array$0 = null;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        byte stackIn_13_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        byte stackIn_30_0 = 0;
        int stackIn_36_0 = 0;
        ni stackIn_39_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        byte stackOut_12_1;
        byte stackOut_29_0;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        byte[][] var12 = null;
        int var14 = 0;
        int var15 = 0;
        int var17_int = 0;
        ni var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int[] var29 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        byte[][] var35 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        byte[][] var42 = null;
        int[] var46 = null;
        int[] var47 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var28 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (256 == param3.length) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new IllegalArgumentException();
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var40 = new int[256];
                        var33 = var40;
                        var29 = var33;
                        var6 = var29;
                        var41 = new int[256];
                        var34 = var41;
                        var7 = var34;
                        var38 = new int[256];
                        var31 = var38;
                        var8 = var31;
                        var39 = new int[256];
                        var32 = var39;
                        var9 = var32;
                        var11 = -2 / ((48 - param0) / 43);
                        var10 = new int[]{0, param1, param5};
                        var42 = new byte[256][];
                        var35 = var42;
                        var12 = var35;
                        var47 = hk.field_l;
                        var14 = hk.field_j;
                        var15 = hk.field_i;
                        var46 = new int[4];
                        hk.b(var46);
                        var17_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = -257;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 >= (var17_int ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var29[var17_int] = param3[var17_int].field_d + -param2;
                        var7[var17_int] = param3[var17_int].field_c + -param2;
                        var8[var17_int] = (param2 << 435946913) + param3[var17_int].field_b;
                        var9[var17_int] = param3[var17_int].field_i + (param2 << -894393727);
                        array$0 = new byte[var38[var17_int] * var39[var17_int]];
                        var12[var17_int] = array$0;
                        var18 = array$0;
                        var19 = param3[var17_int].field_k;
                        var20 = param3[var17_int].field_b;
                        var21 = param3[var17_int].field_i;
                        var22 = var38[var17_int];
                        var23 = var22 + -var20;
                        hk.a(new int[var39[var17_int] * var38[var17_int]], var38[var17_int], var39[var17_int]);
                        var24 = 0;
                        var25 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = var25;
                        stackIn_8_1 = var21;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 >= stackIn_8_1) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_18_0 = 0;
                        stackIn_10_0 = stackIn_18_0;
                        if (var28 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var26 = stackIn_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var20 <= var26) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        incrementValue$1 = var24;
                        var24++;
                        stackIn_8_0 = 0;
                        stackIn_13_0 = stackIn_8_0;
                        stackOut_12_1 = var19[incrementValue$1];
                        stackIn_8_1 = stackOut_12_1;
                        stackIn_13_1 = stackOut_12_1;
                        if (var28 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 40;
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
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        hk.a(var26, var25, (param2 << 1731923329) + 1, (param2 << -1375208415) + 1, 2);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var26++;
                        if (var28 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var25++;
                        if (var28 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var24 = 0;
                        stackIn_18_0 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var25 = stackIn_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var18.length <= var25) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var18[var25] = (byte)hk.field_l[var25];
                        var25++;
                        if (var28 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var28 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var25 = (1 + var38[var17_int]) * param2;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var26 = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var26 >= var21) {
                            statePc = 37;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_5_0 = 0;
                        stackIn_27_0 = stackIn_5_0;
                        if (var28 != 0) {
                            statePc = 5;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var27 = stackIn_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var20 <= var27) {
                            statePc = 35;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        incrementValue$2 = var24;
                        var24++;
                        stackOut_29_0 = var19[incrementValue$2];
                        stackIn_36_0 = stackOut_29_0;
                        stackIn_30_0 = stackOut_29_0;
                        if (var28 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (stackIn_30_0 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var25++;
                        if (var28 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        incrementValue$3 = var25;
                        var25++;
                        var18[incrementValue$3] = (byte) 1;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var27++;
                        if (var28 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_36_0 = var25 + var23;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var25 = stackIn_36_0;
                        var26++;
                        if (var28 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var17_int++;
                        if (var28 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var17 = new ni(param4, var40, var41, var38, var39, var10, var42);
                        var17.field_C = var17.field_C - param2;
                        var17.field_K = var17.field_K - param2;
                        var17.field_R = var17.field_R - param2;
                        hk.a(var47, var14, var15);
                        hk.a(var46);
                        stackIn_39_0 = (ni) (var17);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 39: {
                    return stackIn_39_0;
                }
                case 40: {
                    var6_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_42_0 = (RuntimeException) (var6_ref);
                    stackIn_41_0 = stackIn_42_0;
                    stackIn_42_1 = new StringBuilder().append("ge.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_41_1 = stackIn_42_1;
                    if (param3 == null) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    stackIn_43_0 = (RuntimeException) ((Object) stackIn_41_0);
                    stackIn_43_1 = (StringBuilder) ((Object) stackIn_41_1);
                    stackIn_43_2 = "{...}";
                    statePc = 43;
                    continue stateLoop;
                }
                case 42: {
                    stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
                    stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
                    stackIn_43_2 = "null";
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    stackIn_45_0 = (RuntimeException) ((Object) stackIn_43_0);
                    stackIn_44_0 = stackIn_45_0;
                    stackIn_45_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',');
                    stackIn_44_1 = stackIn_45_1;
                    if (param4 == null) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackIn_46_0 = (RuntimeException) ((Object) stackIn_44_0);
                    stackIn_46_1 = (StringBuilder) ((Object) stackIn_44_1);
                    stackIn_46_2 = "{...}";
                    statePc = 46;
                    continue stateLoop;
                }
                case 45: {
                    stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
                    stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
                    stackIn_46_2 = "null";
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    throw dh.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param5 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, byte param2, ud param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ai.a(80, 0, param3, param0, param1);
              if (param2 == 127) {
                break L1;
              } else {
                ge.a((byte) 73);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ge.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void a(byte param0) {
        pn.field_bb = new String[qb.field_u];
        pn.field_bb[18] = gg.field_E;
        pn.field_bb[17] = ue.field_d;
        pn.field_bb[5] = cc.field_b;
        pn.field_bb[4] = im.field_d;
        pn.field_bb[9] = gb.field_Tb;
        pn.field_bb[15] = ml.field_d;
        pn.field_bb[21] = cb.field_d;
        pn.field_bb[11] = km.field_y;
        pn.field_bb[7] = gh.field_d;
        pn.field_bb[20] = hd.field_v;
        pn.field_bb[19] = wk.field_k;
        pn.field_bb[6] = jd.field_Zb;
        pn.field_bb[13] = vh.field_c;
        if (param0 != 123) {
          field_e = 114;
          pn.field_bb[16] = uj.field_e;
          return;
        } else {
          pn.field_bb[16] = uj.field_e;
          return;
        }
    }

    final static void a(byte param0, jk param1) {
        try {
            if (param0 > -65) {
                byte[] var3 = (byte[]) null;
                ge.a((byte) -116, -89, -66, (pi[]) null, (byte[]) null, 119);
            }
            me.field_z = param1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ge.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = false;
        field_d = "Invalid name";
        field_g = new ij("usename");
        field_a = 0;
        field_i = true;
    }
}
