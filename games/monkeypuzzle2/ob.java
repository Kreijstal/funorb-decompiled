/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends fb {
    gk field_o;
    int field_p;
    static pj field_s;
    byte field_q;
    static int field_r;

    public static void f(int param0) {
        if (param0 != 8364) {
            field_s = (pj) null;
        }
        field_s = null;
    }

    final static void b(byte param0) {
        if (null != tj.field_d) {
          if (!tj.field_d.h()) {
            return;
          } else {
            L0: {
              if (param0 == -19) {
                break L0;
              } else {
                ob.f(119);
                break L0;
              }
            }
            tj.field_d = li.a(ke.field_h[7], 100, 96);
            na.a((byte) 85, tj.field_d);
            return;
          }
        } else {
          L1: {
            if (param0 == -19) {
              break L1;
            } else {
              ob.f(119);
              break L1;
            }
          }
          tj.field_d = li.a(ke.field_h[7], 100, 96);
          na.a((byte) 85, tj.field_d);
          return;
        }
    }

    final int a(boolean param0) {
        if (!param0) {
            return -73;
        }
        if (!(null != this.field_o)) {
            return 0;
        }
        return this.field_o.field_h * 100 / (-this.field_q + this.field_o.field_g.length);
    }

    ob() {
    }

    final static int a(int param0, CharSequence param1, byte[] param2, int param3, int param4, int param5) {
        int stackIn_6_0 = 0;
        int stackIn_98_0 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_102_2 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6_int = param5 + -param3;
                        if (param0 < -71) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var10 = (byte[]) null;
                        ob.a(-46, (CharSequence) null, (byte[]) null, 83, 110, -101);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var7 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6_int <= var7) {
                            statePc = 97;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var8 = param1.charAt(param3 + var7);
                        stackIn_98_0 = 0;
                        stackIn_6_0 = stackIn_98_0;
                        if (var9 != 0) {
                            statePc = 98;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 >= var8) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (128 > var8) {
                            statePc = 95;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var8 < 160) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (255 >= var8) {
                            statePc = 95;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var8 != 8364) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        param2[param4 - -var7] = (byte)-128;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var8 == 8218) {
                            statePc = 93;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var8 == 402) {
                            statePc = 91;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var8 == 8222) {
                            statePc = 89;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var8 != 8230) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        param2[var7 + param4] = (byte)-123;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var8 == 8224) {
                            statePc = 87;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (8225 != var8) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        param2[param4 + var7] = (byte)-121;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var8 != 710) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        param2[param4 + var7] = (byte)-120;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (8240 != var8) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        param2[param4 - -var7] = (byte)-119;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (352 != var8) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        param2[param4 - -var7] = (byte)-118;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var8 != 8249) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        param2[param4 + var7] = (byte)-117;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (338 == var8) {
                            statePc = 85;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var8 != 381) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        param2[var7 + param4] = (byte)-114;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var8 == 8216) {
                            statePc = 83;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var8 != 8217) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        param2[var7 + param4] = (byte)-110;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var8 != 8220) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        param2[var7 + param4] = (byte)-109;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var8 != 8221) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        param2[var7 + param4] = (byte)-108;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var8 != 8226) {
                            statePc = 54;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        param2[var7 + param4] = (byte)-107;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (8211 == var8) {
                            statePc = 81;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (8212 == var8) {
                            statePc = 79;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var8 != 732) {
                            statePc = 59;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        param2[param4 + var7] = (byte)-104;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var8 == 8482) {
                            statePc = 77;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var8 == 353) {
                            statePc = 75;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var8 == 8250) {
                            statePc = 73;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var8 == 339) {
                            statePc = 71;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var8 == 382) {
                            statePc = 69;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var8 == 376) {
                            statePc = 67;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        param2[var7 + param4] = (byte)63;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        param2[var7 + param4] = (byte)-97;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        param2[param4 - -var7] = (byte)-98;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        param2[param4 - -var7] = (byte)-100;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        param2[var7 + param4] = (byte)-101;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        param2[param4 + var7] = (byte)-102;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        param2[var7 + param4] = (byte)-103;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        param2[var7 + param4] = (byte)-105;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        param2[var7 + param4] = (byte)-106;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        param2[param4 - -var7] = (byte)-111;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        param2[param4 - -var7] = (byte)-116;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        param2[param4 - -var7] = (byte)-122;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        param2[var7 + param4] = (byte)-124;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        param2[param4 + var7] = (byte)-125;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        param2[param4 - -var7] = (byte)-126;
                        if (var9 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        param2[param4 + var7] = (byte)var8;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var7++;
                        if (var9 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        stackIn_98_0 = var6_int;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 98: {
                    return stackIn_98_0;
                }
                case 99: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_101_0 = (RuntimeException) (var6);
                    stackIn_100_0 = stackIn_101_0;
                    stackIn_101_1 = new StringBuilder().append("ob.E(").append(param0).append(',');
                    stackIn_100_1 = stackIn_101_1;
                    if (param1 == null) {
                        statePc = 101;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    stackIn_102_0 = (RuntimeException) ((Object) stackIn_100_0);
                    stackIn_102_1 = (StringBuilder) ((Object) stackIn_100_1);
                    stackIn_102_2 = "{...}";
                    statePc = 102;
                    continue stateLoop;
                }
                case 101: {
                    stackIn_102_0 = (RuntimeException) ((Object) stackIn_101_0);
                    stackIn_102_1 = (StringBuilder) ((Object) stackIn_101_1);
                    stackIn_102_2 = "null";
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    stackIn_104_0 = (RuntimeException) ((Object) stackIn_102_0);
                    stackIn_103_0 = stackIn_104_0;
                    stackIn_104_1 = ((StringBuilder) (Object) stackIn_102_1).append(stackIn_102_2).append(',');
                    stackIn_103_1 = stackIn_104_1;
                    if (param2 == null) {
                        statePc = 104;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    stackIn_105_0 = (RuntimeException) ((Object) stackIn_103_0);
                    stackIn_105_1 = (StringBuilder) ((Object) stackIn_103_1);
                    stackIn_105_2 = "{...}";
                    statePc = 105;
                    continue stateLoop;
                }
                case 104: {
                    stackIn_105_0 = (RuntimeException) ((Object) stackIn_104_0);
                    stackIn_105_1 = (StringBuilder) ((Object) stackIn_104_1);
                    stackIn_105_2 = "null";
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    throw la.a((Throwable) ((Object) stackIn_105_0), stackIn_105_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final byte[] e(int param0) {
        int var2;
        if (!this.field_j) {
          if (this.field_o.field_h < -this.field_q + this.field_o.field_g.length) {
            throw new RuntimeException();
          } else {
            var2 = 38 % ((25 - param0) / 41);
            return this.field_o.field_g;
          }
        } else {
          throw new RuntimeException();
        }
    }

    static {
        field_s = new pj();
        field_r = 0;
    }
}
