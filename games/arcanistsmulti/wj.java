/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj {
    static nb field_a;
    static kc field_b;
    private int[][] field_d;
    static String field_c;
    static String field_e;

    wj(int[] param0) {
        int[] array$0 = null;
        int dupTemp$1 = 0;
        int[] arrayValue$2 = null;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_d = new int[512][];
                        var2 = new int[512];
                        var3_int = 1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var3_int ^ -1) <= (param0.length ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4 = param0[var3_int];
                        var5 = ((14680064 & var4) >> 1192302895) + ((var4 >> -142225819 & 7) + ((var4 & 57344) >> 1368192074));
                        var2[var5] = var2[var5] + 1;
                        var3_int++;
                        if (var8 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var8 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3_int = 1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param0.length <= var3_int) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = param0[var3_int];
                        stackIn_16_0 = ((14680064 & var4) >> 395112527) + (56 & var4 >> 1384466186) + (7 & var4 >> -1225920187);
                        stackIn_10_0 = stackIn_16_0;
                        if (var8 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = stackIn_10_0;
                        if (null == this.field_d[var5]) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        array$0 = new int[var2[var5]];
                        this.field_d[var5] = array$0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        dupTemp$1 = var2[var5] - 1;
                        arrayValue$2 = this.field_d[var5];
                        var2[var5] = dupTemp$1;
                        arrayValue$2[dupTemp$1] = (var3_int << -1531773992) - -dg.a(var4, 16777215);
                        var3_int++;
                        if (var8 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = 512;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var3 = new int[stackIn_16_0];
                        var4 = 0;
                        var5 = 0;
                        var6 = var2;
                        var7 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (512 <= var7) {
                            statePc = 26;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var8 != 0) {
                            statePc = 74;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (null != this.field_d[var7]) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var6[var7] = 0;
                        incrementValue$3 = var5;
                        var5++;
                        var3[incrementValue$3] = var7;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var7++;
                        if (var8 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var5 <= var4) {
                            statePc = 74;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        incrementValue$4 = var4;
                        var4++;
                        var7 = var3[511 & incrementValue$4];
                        if (var8 != 0) {
                            statePc = 74;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((var7 & 511 ^ -1) > -65) {
                            statePc = 36;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (!this.a(var7 + 131008, var6, var7, (byte) 114)) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        incrementValue$5 = var5;
                        var5++;
                        var3[dg.a(incrementValue$5, 511)] = var7 + 131008;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((var7 & 511 ^ -1) <= -449) {
                            statePc = 42;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (!this.a(131136 + var7, var6, var7, (byte) 114)) {
                            statePc = 42;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        incrementValue$6 = var5;
                        var5++;
                        var3[dg.a(511, incrementValue$6)] = var7 - -131136;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((var7 & 63 ^ -1) > -9) {
                            statePc = 48;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (!this.a(262136 + var7, var6, var7, (byte) 114)) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        incrementValue$7 = var5;
                        var5++;
                        var3[dg.a(incrementValue$7, 511)] = 262136 + var7;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (-57 >= (63 & var7 ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (!this.a(var7 - -262152, var6, var7, (byte) 114)) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        incrementValue$8 = var5;
                        var5++;
                        var3[dg.a(511, incrementValue$8)] = 262152 + var7;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (-1 <= (var7 & 7 ^ -1)) {
                            statePc = 61;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (this.a(65535 + var7, var6, var7, (byte) 114)) {
                            statePc = 60;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        incrementValue$9 = var5;
                        var5++;
                        var3[dg.a(511, incrementValue$9)] = var7 - -65535;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if ((var7 & 7) >= 7) {
                            statePc = 67;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (!this.a(var7 - -65537, var6, var7, (byte) 114)) {
                            statePc = 67;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        incrementValue$10 = var5;
                        var5++;
                        var3[dg.a(511, incrementValue$10)] = var7 - -65537;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var8 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 69: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_72_0 = (RuntimeException) (var2_ref);
                    stackIn_70_0 = stackIn_72_0;
                    stackIn_72_1 = new StringBuilder().append("wj.<init>(");
                    stackIn_70_1 = stackIn_72_1;
                    if (param0 == null) {
                        statePc = 72;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    stackIn_73_0 = (RuntimeException) ((Object) stackIn_70_0);
                    stackIn_73_1 = (StringBuilder) ((Object) stackIn_70_1);
                    stackIn_73_2 = "{...}";
                    statePc = 73;
                    continue stateLoop;
                }
                case 72: {
                    stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
                    stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
                    stackIn_73_2 = "null";
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    throw aa.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ')');
                }
                case 74: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(qb[] param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7, qb[] param8, int param9, int param10, int param11, dj param12, dj param13, int param14) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        try {
          L0: {
            L1: {
              gh.a(p.field_c, param13, param9, param12, param1, param5, to.field_m, 480, param7, 0, 0, param3, (qb[]) null, param14, param11, (byte) -105, param4, param0, sl.field_T, param8, param10);
              if (param2 >= 108) {
                break L1;
              } else {
                wj.a(-97);
                break L1;
              }
            }
            nb.a(param6, 5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var15 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var15);

            stackIn_8_1 = new StringBuilder().append("wj.B(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');

            if (param12 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param13 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_21_2 + ',' + param14 + ')');
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_e = null;
              field_a = null;
              if (param0 == 0) {
                break L1;
              } else {
                field_b = (kc) null;
                break L1;
              }
            }
            field_c = null;
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "wj.C(" + param0 + ')');
        }
    }

    final int a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_5_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_16_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == 0) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = (param0 >> -781171510 & 56) + ((param0 >> -677401275 & 7) - -(param0 >> -1863712049 & 448));
              var4 = this.field_d[var3_int];
              var5 = var4[0];
              var6 = (param1 & var5 >> 10067951) + ((var5 >> 383057382 & 1020) + (255 & var5));
              var7 = 1;
              L1: while (true) {
                L2: {
                  L3: {
                    if ((var7 ^ -1) <= (var4.length ^ -1)) {
                      break L3;
                    } else {
                      var8 = var4[var7];
                      var9 = (var8 & 255) - (-(var8 >> -909355930 & 1020) - (510 & var8 >> 958333871));
                      stackIn_15_0 = var6 ^ -1;

                      stackIn_15_1 = var9 ^ -1;

                      if (var10 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_15_0 >= stackIn_15_1) {
                            break L4;
                          } else {
                            var6 = var9;
                            var5 = var8;
                            break L4;
                          }
                        }
                        var7++;
                        if (var10 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackIn_15_0 = var5;
                  stackIn_15_1 = 473841784;
                  break L2;
                }
                stackIn_16_0 = stackIn_15_0 >>> stackIn_15_1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "wj.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_16_0;
        }
    }

    final static boolean a(String param0, int[] param1, int param2, int param3, long param4) {
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == 2) {
              L1: {
                L2: {
                  if (null == param1) {
                    break L2;
                  } else {
                    L3: {
                      if (2 != param2) {
                        break L3;
                      } else {
                        if (!kg.a(param4, true, param0)) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    stackIn_13_0 = 1;
                    break L1;
                  }
                }
                stackIn_13_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("wj.E(");

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


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), stackIn_22_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    private final boolean a(int param0, int[] param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 114) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            L2: {
              if (this.field_d[511 & param0] == null) {
                break L2;
              } else {
                if ((param1[511 & param0] ^ -1) < (param0 ^ -1)) {
                  break L2;
                } else {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            this.field_d[dg.a(param0, 511)] = this.field_d[dg.a(511, param2)];
            param1[dg.a(param0, 511)] = param0;
            stackIn_10_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("wj.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    static {
        field_c = "This password contains your email address, and would be easy to guess";
        field_e = "Elements Installed";
        field_a = new nb();
    }
}
