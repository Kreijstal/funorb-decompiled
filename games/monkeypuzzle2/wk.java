/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static am field_f;
    static int[] field_e;
    static int field_a;
    static String field_d;
    static String field_c;
    static pj field_b;

    final static int a(int param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == -1) {
              stackIn_4_0 = wk.a(90, param0, param1, true);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 38;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("wk.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static int a(int param0, int param1, CharSequence param2, boolean param3) {
        int stackIn_10_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 < 2) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param1 > 36) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new IllegalArgumentException("" + param1);
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4_int = 0;
                        if (param0 == 90) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        field_d = (String) null;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5 = 0;
                        var6 = 0;
                        var7 = param2.length();
                        var8 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var8 >= var7) {
                            statePc = 41;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = param2.charAt(var8);
                        stackIn_42_0 = var8;
                        stackIn_10_0 = stackIn_42_0;
                        if (var11 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (45 != var9) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4_int = 1;
                        if (var11 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var9 != 43) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (param3) {
                            statePc = 40;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var9 < 48) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var9 > 57) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var9 -= 48;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var9 < 65) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (90 >= var9) {
                            statePc = 29;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var9 < 97) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var9 > 122) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var9 -= 87;
                        if (var11 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw new NumberFormatException();
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9 -= 55;
                        if (var11 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var9 -= 48;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (param1 > var9) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw new NumberFormatException();
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var4_int != 0) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9 = -var9;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var10 = param1 * var6 + var9;
                        if (var10 / param1 != var6) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw new NumberFormatException();
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var6 = var10;
                        var5 = 1;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var8++;
                        if (var11 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_42_0 = var5;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw new NumberFormatException();
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_46_0 = var6;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 46: {
                    return stackIn_46_0;
                }
                case 47: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_49_0 = (RuntimeException) (var4);
                    stackIn_48_0 = stackIn_49_0;
                    stackIn_49_1 = new StringBuilder().append("wk.B(").append(param0).append(',').append(param1).append(',');
                    stackIn_48_1 = stackIn_49_1;
                    if (param2 == null) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    stackIn_50_0 = (RuntimeException) ((Object) stackIn_48_0);
                    stackIn_50_1 = (StringBuilder) ((Object) stackIn_48_1);
                    stackIn_50_2 = "{...}";
                    statePc = 50;
                    continue stateLoop;
                }
                case 49: {
                    stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
                    stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
                    stackIn_50_2 = "null";
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    throw la.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (param0) {
          field_c = (String) null;
          field_e = null;
          field_c = null;
          field_f = null;
          field_b = null;
          return;
        } else {
          field_e = null;
          field_c = null;
          field_f = null;
          field_b = null;
          return;
        }
    }

    static {
        field_f = new am();
        field_e = new int[8192];
        field_a = -1;
        field_c = "Orb points: <%0>";
        field_b = new pj();
    }
}
