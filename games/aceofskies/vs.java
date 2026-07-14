/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vs {
    private byte[] field_d;
    int field_j;
    int field_e;
    private byte[][] field_h;
    static int[] field_b;
    int field_a;
    static boolean field_f;
    static sn[] field_c;
    int field_i;
    static gh field_g;

    final int a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        try {
          try {
            L0: {
              if (param0 >= 106) {
                break L0;
              } else {
                String discarded$2 = ((vs) this).a((pa[]) null, -22, 118, (String) null);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = ((vs) this).field_d[param1] & 255;
          stackIn_5_0 = stackOut_4_0;
        }
        return 0;
    }

    final static int b(int param0) {
        RuntimeException var1 = null;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        try {
          try {
            L0: {
              if (param0 < -76) {
                break L0;
              } else {
                field_b = (int[]) null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = -ac.field_c + je.field_a;
          stackIn_5_0 = stackOut_4_0;
        }
        return 0;
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_c = null;
              field_g = null;
              if (param0 > 108) {
                break L0;
              } else {
                vs.a(77);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_b = null;
        }
    }

    private final int a(String param0, byte param1, pa[] param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        Exception var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_47_0 = 0;
        pa[] stackIn_58_0 = null;
        int stackIn_83_0 = 0;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_93_2 = null;
        int stackOut_2_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_46_0 = 0;
        pa[] stackOut_57_0 = null;
        int stackOut_82_0 = 0;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = AceOfSkies.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null != param0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var4_int = -1;
                        var5 = -1;
                        var6 = 0;
                        var7 = param0.length();
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param1 == -113) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof Exception ? 8 : 84);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((vs) this).field_j = -25;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = (stateCaught_6 instanceof Exception ? 8 : 84);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var8 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((var8 ^ -1) <= (var7 ^ -1)) {
                            statePc = 82;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9 = param0.charAt(var8);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = -61;
                        stackIn_83_0 = stackOut_12_0;
                        stackIn_13_0 = stackOut_12_0;
                        if (var12 != 0) {
                            statePc = 83;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = (stateCaught_12 instanceof Exception ? 15 : 84);
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 != (var9 ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = (stateCaught_13 instanceof Exception ? 15 : 84);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var4_int = var8;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var12 == 0) {
                            statePc = 81;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = (stateCaught_17 instanceof Exception ? 20 : 84);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((var9 ^ -1) != -63) {
                            statePc = 73;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = (stateCaught_18 instanceof Exception ? 24 : 84);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof Exception ? 24 : 84);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof Exception ? 24 : 84);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = (stateCaught_21 instanceof Exception ? 24 : 84);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 != (var4_int ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = (stateCaught_22 instanceof Exception ? 26 : 84);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = (stateCaught_23 instanceof Exception ? 26 : 84);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = (stateCaught_24 instanceof Exception ? 26 : 84);
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = (stateCaught_25 instanceof Exception ? 26 : 84);
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var10 = param0.substring(var4_int - -1, var8);
                        var4_int = -1;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var10.equals((Object) (Object) "lt")) {
                            statePc = 72;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = (stateCaught_28 instanceof Exception ? 31 : 84);
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var10.equals((Object) (Object) "gt")) {
                            statePc = 71;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = (stateCaught_29 instanceof Exception ? 34 : 84);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = (stateCaught_30 instanceof Exception ? 34 : 84);
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = (stateCaught_31 instanceof Exception ? 34 : 84);
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var10.equals((Object) (Object) "nbsp")) {
                            statePc = 70;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = (stateCaught_32 instanceof Exception ? 37 : 84);
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = (stateCaught_33 instanceof Exception ? 37 : 84);
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = (stateCaught_34 instanceof Exception ? 37 : 84);
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var10.equals((Object) (Object) "shy")) {
                            statePc = 69;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = (stateCaught_35 instanceof Exception ? 40 : 84);
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = (stateCaught_36 instanceof Exception ? 40 : 84);
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = (stateCaught_37 instanceof Exception ? 40 : 84);
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (!var10.equals((Object) (Object) "times")) {
                            statePc = 43;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = (stateCaught_38 instanceof Exception ? 40 : 84);
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var9 = 215;
                        stackOut_41_0 = var12;
                        stackIn_42_0 = stackOut_41_0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = (stateCaught_42 instanceof Exception ? 45 : 84);
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (!var10.equals((Object) (Object) "euro")) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = (stateCaught_43 instanceof Exception ? 45 : 84);
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var9 = 8364;
                        stackOut_46_0 = var12;
                        stackIn_47_0 = stackOut_46_0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (stackIn_47_0 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = (stateCaught_47 instanceof Exception ? 50 : 84);
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var10.equals((Object) (Object) "copy")) {
                            statePc = 68;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = (stateCaught_48 instanceof Exception ? 53 : 84);
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = (stateCaught_49 instanceof Exception ? 53 : 84);
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = (stateCaught_50 instanceof Exception ? 53 : 84);
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var10.equals((Object) (Object) "reg")) {
                            statePc = 67;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = (stateCaught_51 instanceof Exception ? 56 : 84);
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = (stateCaught_52 instanceof Exception ? 56 : 84);
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = (stateCaught_53 instanceof Exception ? 56 : 84);
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (!var10.startsWith("img=")) {
                            statePc = 81;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = (stateCaught_54 instanceof Exception ? 60 : 84);
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = (stateCaught_55 instanceof Exception ? 60 : 84);
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = (stateCaught_56 instanceof Exception ? 60 : 84);
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = (pa[]) param2;
                        stackIn_58_0 = stackOut_57_0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = (stateCaught_57 instanceof Exception ? 60 : 84);
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (stackIn_58_0 != null) {
                            statePc = 64;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = (stateCaught_58 instanceof Exception ? 63 : 84);
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = (stateCaught_59 instanceof Exception ? 63 : 84);
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = (stateCaught_60 instanceof Exception ? 63 : 84);
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var12 == 0) {
                            statePc = 81;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = (stateCaught_61 instanceof Exception ? 63 : 84);
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var11_int = td.a((CharSequence) (Object) var10.substring(4), (byte) 38);
                        var5 = -1;
                        var6 = var6 + param2[var11_int].d();
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = (stateCaught_64 instanceof Exception ? 66 : 84);
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var11 = (Exception) (Object) caughtException;
                        if (var12 == 0) {
                            statePc = 81;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var9 = 174;
                        if (var12 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var9 = 169;
                        if (var12 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var9 = 173;
                        if (var12 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var9 = 160;
                        if (var12 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var9 = 62;
                        if (var12 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var9 = 60;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var4_int != -1) {
                            statePc = 81;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var6 = var6 + (((vs) this).field_d[255 & ae.a((char) var9, param1 ^ 1)] & 255);
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (((vs) this).field_h == null) {
                            statePc = 80;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = (stateCaught_75 instanceof Exception ? 78 : 84);
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var5 == -1) {
                            statePc = 80;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = (stateCaught_76 instanceof Exception ? 78 : 84);
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var6 = var6 + ((vs) this).field_h[var5][var9];
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var5 = var9;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var8++;
                        if (var12 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        stackOut_82_0 = var6;
                        stackIn_83_0 = stackOut_82_0;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 83: {
                    return stackIn_83_0;
                }
                case 84: {
                    var4 = (RuntimeException) (Object) caughtException;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    try {
                        stackOut_85_0 = (RuntimeException) var4;
                        stackOut_85_1 = new StringBuilder().append("vs.C(");
                        stackIn_88_0 = stackOut_85_0;
                        stackIn_88_1 = stackOut_85_1;
                        stackIn_86_0 = stackOut_85_0;
                        stackIn_86_1 = stackOut_85_1;
                        if (param0 == null) {
                            statePc = 88;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
                        stackOut_86_1 = (StringBuilder) (Object) stackIn_86_1;
                        stackOut_86_2 = "{...}";
                        stackIn_89_0 = stackOut_86_0;
                        stackIn_89_1 = stackOut_86_1;
                        stackIn_89_2 = stackOut_86_2;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 87: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 88: {
                    stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
                    stackOut_88_1 = (StringBuilder) (Object) stackIn_88_1;
                    stackOut_88_2 = "null";
                    stackIn_89_0 = stackOut_88_0;
                    stackIn_89_1 = stackOut_88_1;
                    stackIn_89_2 = stackOut_88_2;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    try {
                        stackOut_89_0 = (RuntimeException) (Object) stackIn_89_0;
                        stackOut_89_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_89_2).append(44).append(param1).append(44);
                        stackIn_92_0 = stackOut_89_0;
                        stackIn_92_1 = stackOut_89_1;
                        stackIn_90_0 = stackOut_89_0;
                        stackIn_90_1 = stackOut_89_1;
                        if (param2 == null) {
                            statePc = 92;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        stackOut_90_0 = (RuntimeException) (Object) stackIn_90_0;
                        stackOut_90_1 = (StringBuilder) (Object) stackIn_90_1;
                        stackOut_90_2 = "{...}";
                        stackIn_93_0 = stackOut_90_0;
                        stackIn_93_1 = stackOut_90_1;
                        stackIn_93_2 = stackOut_90_2;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 91: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 92: {
                    stackOut_92_0 = (RuntimeException) (Object) stackIn_92_0;
                    stackOut_92_1 = (StringBuilder) (Object) stackIn_92_1;
                    stackOut_92_2 = "null";
                    stackIn_93_0 = stackOut_92_0;
                    stackIn_93_1 = stackOut_92_1;
                    stackIn_93_2 = stackOut_92_2;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    throw pn.a((Throwable) (Object) stackIn_93_0, (String) (Object) (stackIn_93_2 + 41));
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final String a(pa[] param0, int param1, int param2, String param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var12_ref = null;
        Exception var13 = null;
        int var13_int = 0;
        int var14 = 0;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        int stackIn_16_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_55_0 = 0;
        String stackIn_64_0 = null;
        String stackIn_86_0 = null;
        String stackIn_90_0 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        String stackOut_4_0 = null;
        String stackOut_8_0 = null;
        int stackOut_15_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_54_0 = 0;
        String stackOut_63_0 = null;
        String stackOut_85_0 = null;
        String stackOut_89_0 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = AceOfSkies.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.a(param3, (byte) -113, param0) <= param2) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = (stateCaught_1 instanceof RuntimeException ? 91 : 3);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof RuntimeException ? 91 : 3);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = (String) param3;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return (String) (Object) stackIn_5_0;
                }
                case 6: {
                    try {
                        param2 = param2 - this.a("...", (byte) -113, (pa[]) null);
                        var5_int = -1;
                        var6 = -1;
                        var7 = 0;
                        var8 = param3.length();
                        var9 = "";
                        var10 = param1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var8 <= var10) {
                            statePc = 89;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (String) param3;
                        stackIn_90_0 = stackOut_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        if (var14 != 0) {
                            statePc = 90;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var11 = ((String) (Object) stackIn_9_0).charAt(var10);
                        if (var11 != 60) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5_int = var10;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var14 == 0) {
                            statePc = 88;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = (stateCaught_11 instanceof Exception ? 14 : 91);
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((var11 ^ -1) != -63) {
                            statePc = 70;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = (stateCaught_12 instanceof Exception ? 18 : 91);
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = (stateCaught_13 instanceof Exception ? 18 : 91);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = (stateCaught_14 instanceof Exception ? 18 : 91);
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = var5_int;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = (stateCaught_15 instanceof Exception ? 18 : 91);
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((stackIn_16_0 ^ -1) != 0) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = (stateCaught_16 instanceof Exception ? 20 : 91);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = (stateCaught_17 instanceof Exception ? 20 : 91);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = (stateCaught_18 instanceof Exception ? 20 : 91);
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof Exception ? 20 : 91);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var12_ref = param3.substring(var5_int - -1, var10);
                        var5_int = -1;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var12_ref.equals((Object) (Object) "lt")) {
                            statePc = 69;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = (stateCaught_22 instanceof Exception ? 25 : 91);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (!var12_ref.equals((Object) (Object) "gt")) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = (stateCaught_23 instanceof Exception ? 25 : 91);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var11 = 62;
                        stackOut_26_0 = var14;
                        stackIn_27_0 = stackOut_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = (stateCaught_27 instanceof Exception ? 30 : 91);
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (!var12_ref.equals((Object) (Object) "nbsp")) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = (stateCaught_28 instanceof Exception ? 30 : 91);
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var11 = 160;
                        stackOut_31_0 = var14;
                        stackIn_32_0 = stackOut_31_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (stackIn_32_0 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = (stateCaught_32 instanceof Exception ? 35 : 91);
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (!var12_ref.equals((Object) (Object) "shy")) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = (stateCaught_33 instanceof Exception ? 35 : 91);
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var11 = 173;
                        stackOut_36_0 = var14;
                        stackIn_37_0 = stackOut_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (stackIn_37_0 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = (stateCaught_37 instanceof Exception ? 40 : 91);
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (!var12_ref.equals((Object) (Object) "times")) {
                            statePc = 43;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = (stateCaught_38 instanceof Exception ? 40 : 91);
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var11 = 215;
                        stackOut_41_0 = var14;
                        stackIn_42_0 = stackOut_41_0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = (stateCaught_42 instanceof Exception ? 45 : 91);
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var12_ref.equals((Object) (Object) "euro")) {
                            statePc = 68;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = (stateCaught_43 instanceof Exception ? 48 : 91);
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = (stateCaught_44 instanceof Exception ? 48 : 91);
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = (stateCaught_45 instanceof Exception ? 48 : 91);
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (!var12_ref.equals((Object) (Object) "copy")) {
                            statePc = 51;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = (stateCaught_46 instanceof Exception ? 48 : 91);
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var11 = 169;
                        stackOut_49_0 = var14;
                        stackIn_50_0 = stackOut_49_0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (stackIn_50_0 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = (stateCaught_50 instanceof Exception ? 53 : 91);
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (!var12_ref.equals((Object) (Object) "reg")) {
                            statePc = 56;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = (stateCaught_51 instanceof Exception ? 53 : 91);
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var11 = 174;
                        stackOut_54_0 = var14;
                        stackIn_55_0 = stackOut_54_0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (stackIn_55_0 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = (stateCaught_55 instanceof Exception ? 58 : 91);
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (!var12_ref.startsWith("img=")) {
                            statePc = 88;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = (stateCaught_56 instanceof Exception ? 61 : 91);
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = (stateCaught_57 instanceof Exception ? 61 : 91);
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = (stateCaught_58 instanceof Exception ? 61 : 91);
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (null == param0) {
                            statePc = 88;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = (stateCaught_59 instanceof Exception ? 61 : 91);
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var13_int = td.a((CharSequence) (Object) var12_ref.substring(4), (byte) 38);
                        var7 = var7 + param0[var13_int].d();
                        var6 = -1;
                        if (param2 >= var7) {
                            statePc = 65;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = (stateCaught_62 instanceof Exception ? 67 : 91);
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackOut_63_0 = var9 + "...";
                        stackIn_64_0 = stackOut_63_0;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = (stateCaught_63 instanceof Exception ? 67 : 91);
                        continue stateLoop;
                    }
                }
                case 64: {
                    return (String) (Object) stackIn_64_0;
                }
                case 65: {
                    try {
                        var9 = param3.substring(0, 1 + var10);
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = (stateCaught_65 instanceof Exception ? 67 : 91);
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var13 = (Exception) (Object) caughtException;
                        if (var14 == 0) {
                            statePc = 88;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var11 = 8364;
                        if (var14 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var11 = 60;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var5_int != -1) {
                            statePc = 88;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var7 = var7 + (255 & ((vs) this).field_d[ae.a((char) var11, -128) & 255]);
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (null == ((vs) this).field_h) {
                            statePc = 77;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = (stateCaught_72 instanceof Exception ? 75 : 91);
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (0 == (var6 ^ -1)) {
                            statePc = 77;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = (stateCaught_73 instanceof Exception ? 75 : 91);
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var7 = var7 + ((vs) this).field_h[var6][var11];
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var6 = var11;
                        var12 = var7;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (((vs) this).field_h != null) {
                            statePc = 81;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = (stateCaught_78 instanceof Exception ? 80 : 91);
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = (stateCaught_79 instanceof Exception ? 80 : 91);
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var12 = var12 + ((vs) this).field_h[var11][46];
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (var12 > param2) {
                            statePc = 85;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = (stateCaught_82 instanceof Exception ? 84 : 91);
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = (stateCaught_83 instanceof Exception ? 84 : 91);
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        stackOut_85_0 = var9 + "...";
                        stackIn_86_0 = stackOut_85_0;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 86: {
                    return (String) (Object) stackIn_86_0;
                }
                case 87: {
                    try {
                        var9 = param3.substring(0, var10 + 1);
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var10++;
                        if (var14 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        stackOut_89_0 = (String) param3;
                        stackIn_90_0 = stackOut_89_0;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 90: {
                    return (String) (Object) stackIn_90_0;
                }
                case 91: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    try {
                        stackOut_92_0 = (RuntimeException) var5;
                        stackOut_92_1 = new StringBuilder().append("vs.D(");
                        stackIn_95_0 = stackOut_92_0;
                        stackIn_95_1 = stackOut_92_1;
                        stackIn_93_0 = stackOut_92_0;
                        stackIn_93_1 = stackOut_92_1;
                        if (param0 == null) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
                        stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
                        stackOut_93_2 = "{...}";
                        stackIn_96_0 = stackOut_93_0;
                        stackIn_96_1 = stackOut_93_1;
                        stackIn_96_2 = stackOut_93_2;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 94: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 95: {
                    stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
                    stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
                    stackOut_95_2 = "null";
                    stackIn_96_0 = stackOut_95_0;
                    stackIn_96_1 = stackOut_95_1;
                    stackIn_96_2 = stackOut_95_2;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    try {
                        stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
                        stackOut_96_1 = ((StringBuilder) (Object) stackIn_96_1).append(stackIn_96_2).append(44).append(param1).append(44).append(param2).append(44);
                        stackIn_99_0 = stackOut_96_0;
                        stackIn_99_1 = stackOut_96_1;
                        stackIn_97_0 = stackOut_96_0;
                        stackIn_97_1 = stackOut_96_1;
                        if (param3 == null) {
                            statePc = 99;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
                        stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
                        stackOut_97_2 = "{...}";
                        stackIn_100_0 = stackOut_97_0;
                        stackIn_100_1 = stackOut_97_1;
                        stackIn_100_2 = stackOut_97_2;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 98: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 99: {
                    stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
                    stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
                    stackOut_99_2 = "null";
                    stackIn_100_0 = stackOut_99_0;
                    stackIn_100_1 = stackOut_99_1;
                    stackIn_100_2 = stackOut_99_2;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    throw pn.a((Throwable) (Object) stackIn_100_0, (String) (Object) (stackIn_100_2 + 41));
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, char param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_6_0 = 0;
        byte stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        byte stackOut_7_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        int discarded$3 = ((vs) this).a((byte) -7, 58);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (null != ((vs) this).field_h) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = 0;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    try {
                        stackOut_7_0 = ((vs) this).field_h[param2][param1];
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw pn.a((Throwable) (Object) var4, "vs.G(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, pa[] param1, int[] param2, String[] param3, String param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        String var20 = null;
        Exception var21 = null;
        int var21_int = 0;
        int var22 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_150_0 = 0;
        int[] stackIn_150_1 = null;
        int stackIn_152_0 = 0;
        int[] stackIn_152_1 = null;
        int stackIn_153_0 = 0;
        int[] stackIn_153_1 = null;
        int stackIn_153_2 = 0;
        int stackIn_163_0 = 0;
        int stackIn_165_0 = 0;
        int stackIn_170_0 = 0;
        int stackIn_176_0 = 0;
        int stackIn_176_1 = 0;
        int stackIn_181_0 = 0;
        RuntimeException stackIn_184_0 = null;
        StringBuilder stackIn_184_1 = null;
        RuntimeException stackIn_186_0 = null;
        StringBuilder stackIn_186_1 = null;
        RuntimeException stackIn_187_0 = null;
        StringBuilder stackIn_187_1 = null;
        String stackIn_187_2 = null;
        RuntimeException stackIn_188_0 = null;
        StringBuilder stackIn_188_1 = null;
        RuntimeException stackIn_190_0 = null;
        StringBuilder stackIn_190_1 = null;
        RuntimeException stackIn_191_0 = null;
        StringBuilder stackIn_191_1 = null;
        String stackIn_191_2 = null;
        RuntimeException stackIn_192_0 = null;
        StringBuilder stackIn_192_1 = null;
        RuntimeException stackIn_194_0 = null;
        StringBuilder stackIn_194_1 = null;
        RuntimeException stackIn_195_0 = null;
        StringBuilder stackIn_195_1 = null;
        String stackIn_195_2 = null;
        RuntimeException stackIn_196_0 = null;
        StringBuilder stackIn_196_1 = null;
        RuntimeException stackIn_198_0 = null;
        StringBuilder stackIn_198_1 = null;
        RuntimeException stackIn_199_0 = null;
        StringBuilder stackIn_199_1 = null;
        String stackIn_199_2 = null;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_149_0 = 0;
        int[] stackOut_149_1 = null;
        int stackOut_150_0 = 0;
        int[] stackOut_150_1 = null;
        int stackOut_150_2 = 0;
        int stackOut_152_0 = 0;
        int[] stackOut_152_1 = null;
        int stackOut_152_2 = 0;
        int stackOut_162_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_169_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_175_1 = 0;
        int stackOut_180_0 = 0;
        RuntimeException stackOut_183_0 = null;
        StringBuilder stackOut_183_1 = null;
        RuntimeException stackOut_184_0 = null;
        StringBuilder stackOut_184_1 = null;
        String stackOut_184_2 = null;
        RuntimeException stackOut_186_0 = null;
        StringBuilder stackOut_186_1 = null;
        String stackOut_186_2 = null;
        RuntimeException stackOut_187_0 = null;
        StringBuilder stackOut_187_1 = null;
        RuntimeException stackOut_188_0 = null;
        StringBuilder stackOut_188_1 = null;
        String stackOut_188_2 = null;
        RuntimeException stackOut_190_0 = null;
        StringBuilder stackOut_190_1 = null;
        String stackOut_190_2 = null;
        RuntimeException stackOut_191_0 = null;
        StringBuilder stackOut_191_1 = null;
        RuntimeException stackOut_192_0 = null;
        StringBuilder stackOut_192_1 = null;
        String stackOut_192_2 = null;
        RuntimeException stackOut_194_0 = null;
        StringBuilder stackOut_194_1 = null;
        String stackOut_194_2 = null;
        RuntimeException stackOut_195_0 = null;
        StringBuilder stackOut_195_1 = null;
        RuntimeException stackOut_196_0 = null;
        StringBuilder stackOut_196_1 = null;
        String stackOut_196_2 = null;
        RuntimeException stackOut_198_0 = null;
        StringBuilder stackOut_198_1 = null;
        String stackOut_198_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var22 = AceOfSkies.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param4 != null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var6_int = 0;
                        var7 = 0;
                        var8 = -1;
                        var9 = 0;
                        var10 = 0;
                        var11 = -1;
                        var13 = -22 / ((-48 - param0) / 48);
                        var12 = -1;
                        var14 = 0;
                        var15 = param4.length();
                        var16 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var15 ^ -1) >= (var16 ^ -1)) {
                            statePc = 175;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var17 = ae.a(param4.charAt(var16), 102) & 255;
                        var18 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = -61;
                        stackOut_7_1 = var17 ^ -1;
                        stackIn_176_0 = stackOut_7_0;
                        stackIn_176_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (var22 != 0) {
                            statePc = 176;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = (stateCaught_7 instanceof Exception ? 10 : 182);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 == stackIn_8_1) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = (stateCaught_8 instanceof Exception ? 10 : 182);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var11 = var16;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var22 == 0) {
                            statePc = 174;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = (stateCaught_13 instanceof Exception ? 16 : 182);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (0 == (var11 ^ -1)) {
                            statePc = 132;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = (stateCaught_14 instanceof Exception ? 19 : 182);
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = (stateCaught_15 instanceof Exception ? 19 : 182);
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = (stateCaught_16 instanceof Exception ? 19 : 182);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (-63 != (var17 ^ -1)) {
                            statePc = 174;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = (stateCaught_17 instanceof Exception ? 19 : 182);
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var19 = var11;
                        var20 = param4.substring(1 + var11, var16);
                        var11 = -1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (!var20.equals((Object) (Object) "br")) {
                            statePc = 29;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = (stateCaught_21 instanceof Exception ? 24 : 182);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        param3[var14] = param4.substring(var7, var16 + 1);
                        var14++;
                        if ((param3.length ^ -1) < (var14 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = (stateCaught_22 instanceof Exception ? 24 : 182);
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = 0;
                        stackIn_26_0 = stackOut_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return stackIn_26_0;
                }
                case 27: {
                    try {
                        var6_int = 0;
                        var8 = -1;
                        var12 = -1;
                        var7 = 1 + var16;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var22 == 0) {
                            statePc = 174;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = (stateCaught_28 instanceof Exception ? 31 : 182);
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (!var20.equals((Object) (Object) "lt")) {
                            statePc = 40;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = (stateCaught_29 instanceof Exception ? 31 : 182);
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var18 = var18 + ((vs) this).a((byte) 111, 60);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (null == ((vs) this).field_h) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = (stateCaught_33 instanceof Exception ? 36 : 182);
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (0 == (var12 ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = (stateCaught_34 instanceof Exception ? 36 : 182);
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var18 = var18 + ((vs) this).field_h[var12][60];
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var12 = 60;
                        stackOut_38_0 = var22;
                        stackIn_39_0 = stackOut_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 == 0) {
                            statePc = 131;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = (stateCaught_39 instanceof Exception ? 42 : 182);
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var20.equals((Object) (Object) "gt")) {
                            statePc = 121;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = (stateCaught_40 instanceof Exception ? 45 : 182);
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = (stateCaught_41 instanceof Exception ? 45 : 182);
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = (stateCaught_42 instanceof Exception ? 45 : 182);
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (!var20.equals((Object) (Object) "nbsp")) {
                            statePc = 54;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = (stateCaught_43 instanceof Exception ? 45 : 182);
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var18 = var18 + ((vs) this).a((byte) 107, 160);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (((vs) this).field_h == null) {
                            statePc = 52;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = (stateCaught_47 instanceof Exception ? 50 : 182);
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if ((var12 ^ -1) == 0) {
                            statePc = 52;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = (stateCaught_48 instanceof Exception ? 50 : 182);
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var18 = var18 + ((vs) this).field_h[var12][160];
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var12 = 160;
                        stackOut_52_0 = var22;
                        stackIn_53_0 = stackOut_52_0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (stackIn_53_0 == 0) {
                            statePc = 131;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = (stateCaught_53 instanceof Exception ? 56 : 182);
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var20.equals((Object) (Object) "shy")) {
                            statePc = 114;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = (stateCaught_54 instanceof Exception ? 59 : 182);
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = (stateCaught_55 instanceof Exception ? 59 : 182);
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = (stateCaught_56 instanceof Exception ? 59 : 182);
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (!var20.equals((Object) (Object) "times")) {
                            statePc = 71;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = (stateCaught_57 instanceof Exception ? 59 : 182);
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var18 = var18 + ((vs) this).a((byte) 108, 215);
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (null == ((vs) this).field_h) {
                            statePc = 69;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = (stateCaught_61 instanceof Exception ? 65 : 182);
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackOut_62_0 = -1;
                        stackIn_63_0 = stackOut_62_0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = (stateCaught_62 instanceof Exception ? 65 : 182);
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (stackIn_63_0 != var12) {
                            statePc = 68;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = (stateCaught_63 instanceof Exception ? 67 : 182);
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = (stateCaught_64 instanceof Exception ? 67 : 182);
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = (stateCaught_65 instanceof Exception ? 67 : 182);
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = (stateCaught_66 instanceof Exception ? 67 : 182);
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var18 = var18 + ((vs) this).field_h[var12][215];
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var12 = 215;
                        stackOut_69_0 = var22;
                        stackIn_70_0 = stackOut_69_0;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (stackIn_70_0 == 0) {
                            statePc = 131;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = (stateCaught_70 instanceof Exception ? 73 : 182);
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (var20.equals((Object) (Object) "euro")) {
                            statePc = 107;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = (stateCaught_71 instanceof Exception ? 76 : 182);
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = (stateCaught_72 instanceof Exception ? 76 : 182);
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = (stateCaught_73 instanceof Exception ? 76 : 182);
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (!var20.equals((Object) (Object) "copy")) {
                            statePc = 85;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = (stateCaught_74 instanceof Exception ? 76 : 182);
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var18 = var18 + ((vs) this).a((byte) 108, 169);
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (((vs) this).field_h == null) {
                            statePc = 83;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = (stateCaught_78 instanceof Exception ? 81 : 182);
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var12 == -1) {
                            statePc = 83;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = (stateCaught_79 instanceof Exception ? 81 : 182);
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var18 = var18 + ((vs) this).field_h[var12][169];
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var12 = 169;
                        stackOut_83_0 = var22;
                        stackIn_84_0 = stackOut_83_0;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (stackIn_84_0 == 0) {
                            statePc = 131;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = (stateCaught_84 instanceof Exception ? 87 : 182);
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (var20.equals((Object) (Object) "reg")) {
                            statePc = 97;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = (stateCaught_85 instanceof Exception ? 90 : 182);
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = (stateCaught_86 instanceof Exception ? 90 : 182);
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = (stateCaught_87 instanceof Exception ? 90 : 182);
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (!var20.startsWith("img=")) {
                            statePc = 131;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = (stateCaught_88 instanceof Exception ? 93 : 182);
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = (stateCaught_89 instanceof Exception ? 93 : 182);
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = (stateCaught_90 instanceof Exception ? 93 : 182);
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (null == param1) {
                            statePc = 131;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = (stateCaught_91 instanceof Exception ? 93 : 182);
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var21_int = td.a((CharSequence) (Object) var20.substring(4), (byte) 38);
                        var12 = -1;
                        var18 = var18 + param1[var21_int].d();
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = (stateCaught_94 instanceof Exception ? 96 : 182);
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var21 = (Exception) (Object) caughtException;
                        if (var22 == 0) {
                            statePc = 131;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var18 = var18 + ((vs) this).a((byte) 126, 174);
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (((vs) this).field_h == null) {
                            statePc = 106;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = (stateCaught_98 instanceof Exception ? 102 : 182);
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        stackOut_99_0 = -1;
                        stackIn_100_0 = stackOut_99_0;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = (stateCaught_99 instanceof Exception ? 102 : 182);
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (stackIn_100_0 != var12) {
                            statePc = 105;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = (stateCaught_100 instanceof Exception ? 104 : 182);
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = (stateCaught_101 instanceof Exception ? 104 : 182);
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = (stateCaught_102 instanceof Exception ? 104 : 182);
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = (stateCaught_103 instanceof Exception ? 104 : 182);
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        var18 = var18 + ((vs) this).field_h[var12][174];
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        var12 = 174;
                        if (var22 == 0) {
                            statePc = 131;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var18 = var18 + ((vs) this).a((byte) 111, 8364);
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (((vs) this).field_h == null) {
                            statePc = 113;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = (stateCaught_108 instanceof Exception ? 111 : 182);
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (-1 == var12) {
                            statePc = 113;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = (stateCaught_109 instanceof Exception ? 111 : 182);
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var18 = var18 + ((vs) this).field_h[var12][8364];
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        var12 = 8364;
                        if (var22 == 0) {
                            statePc = 131;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        var18 = var18 + ((vs) this).a((byte) 110, 173);
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (((vs) this).field_h == null) {
                            statePc = 120;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = (stateCaught_115 instanceof Exception ? 118 : 182);
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (var12 == -1) {
                            statePc = 120;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = (stateCaught_116 instanceof Exception ? 118 : 182);
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var18 = var18 + ((vs) this).field_h[var12][173];
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        var12 = 173;
                        if (var22 == 0) {
                            statePc = 131;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var18 = var18 + ((vs) this).a((byte) 118, 62);
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (null == ((vs) this).field_h) {
                            statePc = 130;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = (stateCaught_122 instanceof Exception ? 126 : 182);
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        stackOut_123_0 = 0;
                        stackIn_124_0 = stackOut_123_0;
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = (stateCaught_123 instanceof Exception ? 126 : 182);
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (stackIn_124_0 != (var12 ^ -1)) {
                            statePc = 129;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = (stateCaught_124 instanceof Exception ? 128 : 182);
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = (stateCaught_125 instanceof Exception ? 128 : 182);
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = (stateCaught_126 instanceof Exception ? 128 : 182);
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = (stateCaught_127 instanceof Exception ? 128 : 182);
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        var18 = var18 + ((vs) this).field_h[var12][62];
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        var12 = 62;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        var17 = -1;
                        if (var22 == 0) {
                            statePc = 142;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        var19 = var16;
                        var18 = var18 + ((vs) this).a((byte) 113, var17);
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (((vs) this).field_h == null) {
                            statePc = 141;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = (stateCaught_133 instanceof Exception ? 137 : 182);
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        stackOut_134_0 = 0;
                        stackIn_135_0 = stackOut_134_0;
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = (stateCaught_134 instanceof Exception ? 137 : 182);
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if (stackIn_135_0 != (var12 ^ -1)) {
                            statePc = 140;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = (stateCaught_135 instanceof Exception ? 139 : 182);
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = (stateCaught_136 instanceof Exception ? 139 : 182);
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = (stateCaught_137 instanceof Exception ? 139 : 182);
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = (stateCaught_138 instanceof Exception ? 139 : 182);
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        var18 = var18 + ((vs) this).field_h[var12][var17];
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        var12 = var17;
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        if (var18 <= 0) {
                            statePc = 174;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        var6_int = var6_int + var18;
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        if (param2 == null) {
                            statePc = 174;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = (stateCaught_144 instanceof Exception ? 147 : 182);
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        if (-33 != (var17 ^ -1)) {
                            statePc = 149;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = (stateCaught_145 instanceof Exception ? 147 : 182);
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        var10 = 1;
                        var8 = var16;
                        var9 = var6_int;
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        stackOut_149_0 = var6_int ^ -1;
                        stackOut_149_1 = (int[]) param2;
                        stackIn_152_0 = stackOut_149_0;
                        stackIn_152_1 = stackOut_149_1;
                        stackIn_150_0 = stackOut_149_0;
                        stackIn_150_1 = stackOut_149_1;
                        if (var14 < param2.length) {
                            statePc = 152;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = (stateCaught_149 instanceof Exception ? 151 : 182);
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        stackOut_150_0 = stackIn_150_0;
                        stackOut_150_1 = (int[]) (Object) stackIn_150_1;
                        stackOut_150_2 = param2.length - 1;
                        stackIn_153_0 = stackOut_150_0;
                        stackIn_153_1 = stackOut_150_1;
                        stackIn_153_2 = stackOut_150_2;
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = (stateCaught_150 instanceof Exception ? 151 : 182);
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        stackOut_152_0 = stackIn_152_0;
                        stackOut_152_1 = (int[]) (Object) stackIn_152_1;
                        stackOut_152_2 = var14;
                        stackIn_153_0 = stackOut_152_0;
                        stackIn_153_1 = stackOut_152_1;
                        stackIn_153_2 = stackOut_152_2;
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        if (stackIn_153_0 >= (stackIn_153_1[stackIn_153_2] ^ -1)) {
                            statePc = 172;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = (stateCaught_153 instanceof Exception ? 156 : 182);
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (0 > var8) {
                            statePc = 166;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = (stateCaught_154 instanceof Exception ? 159 : 182);
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = (stateCaught_155 instanceof Exception ? 159 : 182);
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = (stateCaught_156 instanceof Exception ? 159 : 182);
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        param3[var14] = param4.substring(var7, var8 - -1 + -var10);
                        var14++;
                        if (var14 >= param3.length) {
                            statePc = 162;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = (stateCaught_157 instanceof Exception ? 161 : 182);
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = (stateCaught_158 instanceof Exception ? 161 : 182);
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = (stateCaught_159 instanceof Exception ? 161 : 182);
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = (stateCaught_160 instanceof Exception ? 161 : 182);
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        stackOut_162_0 = 0;
                        stackIn_163_0 = stackOut_162_0;
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 163: {
                    return stackIn_163_0;
                }
                case 164: {
                    try {
                        var7 = var8 + 1;
                        var8 = -1;
                        var12 = -1;
                        var6_int = var6_int - var9;
                        stackOut_164_0 = var22;
                        stackIn_165_0 = stackOut_164_0;
                        statePc = 165;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        if (stackIn_165_0 == 0) {
                            statePc = 172;
                        } else {
                            statePc = 166;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = (stateCaught_165 instanceof Exception ? 168 : 182);
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        param3[var14] = param4.substring(var7, var19);
                        var14++;
                        if ((param3.length ^ -1) < (var14 ^ -1)) {
                            statePc = 171;
                        } else {
                            statePc = 167;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = (stateCaught_166 instanceof Exception ? 168 : 182);
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        stackOut_169_0 = 0;
                        stackIn_170_0 = stackOut_169_0;
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 170: {
                    return stackIn_170_0;
                }
                case 171: {
                    try {
                        var7 = var19;
                        var8 = -1;
                        var12 = -1;
                        var6_int = var18;
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        if (var17 != 45) {
                            statePc = 174;
                        } else {
                            statePc = 173;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        var8 = var16;
                        var10 = 0;
                        var9 = var6_int;
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        var16++;
                        if (var22 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 175;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        stackOut_175_0 = param4.length();
                        stackOut_175_1 = var7;
                        stackIn_176_0 = stackOut_175_0;
                        stackIn_176_1 = stackOut_175_1;
                        statePc = 176;
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        if (stackIn_176_0 <= stackIn_176_1) {
                            statePc = 180;
                        } else {
                            statePc = 177;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = (stateCaught_176 instanceof Exception ? 179 : 182);
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        param3[var14] = param4.substring(var7, param4.length());
                        var14++;
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = (stateCaught_177 instanceof Exception ? 179 : 182);
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        statePc = 180;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        stackOut_180_0 = var14;
                        stackIn_181_0 = stackOut_180_0;
                        statePc = 181;
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 181: {
                    return stackIn_181_0;
                }
                case 182: {
                    var6 = (RuntimeException) (Object) caughtException;
                    statePc = 183;
                    continue stateLoop;
                }
                case 183: {
                    try {
                        stackOut_183_0 = (RuntimeException) var6;
                        stackOut_183_1 = new StringBuilder().append("vs.A(").append(param0).append(44);
                        stackIn_186_0 = stackOut_183_0;
                        stackIn_186_1 = stackOut_183_1;
                        stackIn_184_0 = stackOut_183_0;
                        stackIn_184_1 = stackOut_183_1;
                        if (param1 == null) {
                            statePc = 186;
                        } else {
                            statePc = 184;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        stackOut_184_0 = (RuntimeException) (Object) stackIn_184_0;
                        stackOut_184_1 = (StringBuilder) (Object) stackIn_184_1;
                        stackOut_184_2 = "{...}";
                        stackIn_187_0 = stackOut_184_0;
                        stackIn_187_1 = stackOut_184_1;
                        stackIn_187_2 = stackOut_184_2;
                        statePc = 187;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 185: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 186: {
                    stackOut_186_0 = (RuntimeException) (Object) stackIn_186_0;
                    stackOut_186_1 = (StringBuilder) (Object) stackIn_186_1;
                    stackOut_186_2 = "null";
                    stackIn_187_0 = stackOut_186_0;
                    stackIn_187_1 = stackOut_186_1;
                    stackIn_187_2 = stackOut_186_2;
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    try {
                        stackOut_187_0 = (RuntimeException) (Object) stackIn_187_0;
                        stackOut_187_1 = ((StringBuilder) (Object) stackIn_187_1).append(stackIn_187_2).append(44);
                        stackIn_190_0 = stackOut_187_0;
                        stackIn_190_1 = stackOut_187_1;
                        stackIn_188_0 = stackOut_187_0;
                        stackIn_188_1 = stackOut_187_1;
                        if (param2 == null) {
                            statePc = 190;
                        } else {
                            statePc = 188;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        stackOut_188_0 = (RuntimeException) (Object) stackIn_188_0;
                        stackOut_188_1 = (StringBuilder) (Object) stackIn_188_1;
                        stackOut_188_2 = "{...}";
                        stackIn_191_0 = stackOut_188_0;
                        stackIn_191_1 = stackOut_188_1;
                        stackIn_191_2 = stackOut_188_2;
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 189: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 190: {
                    stackOut_190_0 = (RuntimeException) (Object) stackIn_190_0;
                    stackOut_190_1 = (StringBuilder) (Object) stackIn_190_1;
                    stackOut_190_2 = "null";
                    stackIn_191_0 = stackOut_190_0;
                    stackIn_191_1 = stackOut_190_1;
                    stackIn_191_2 = stackOut_190_2;
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    try {
                        stackOut_191_0 = (RuntimeException) (Object) stackIn_191_0;
                        stackOut_191_1 = ((StringBuilder) (Object) stackIn_191_1).append(stackIn_191_2).append(44);
                        stackIn_194_0 = stackOut_191_0;
                        stackIn_194_1 = stackOut_191_1;
                        stackIn_192_0 = stackOut_191_0;
                        stackIn_192_1 = stackOut_191_1;
                        if (param3 == null) {
                            statePc = 194;
                        } else {
                            statePc = 192;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        stackOut_192_0 = (RuntimeException) (Object) stackIn_192_0;
                        stackOut_192_1 = (StringBuilder) (Object) stackIn_192_1;
                        stackOut_192_2 = "{...}";
                        stackIn_195_0 = stackOut_192_0;
                        stackIn_195_1 = stackOut_192_1;
                        stackIn_195_2 = stackOut_192_2;
                        statePc = 195;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 193: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 194: {
                    stackOut_194_0 = (RuntimeException) (Object) stackIn_194_0;
                    stackOut_194_1 = (StringBuilder) (Object) stackIn_194_1;
                    stackOut_194_2 = "null";
                    stackIn_195_0 = stackOut_194_0;
                    stackIn_195_1 = stackOut_194_1;
                    stackIn_195_2 = stackOut_194_2;
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    try {
                        stackOut_195_0 = (RuntimeException) (Object) stackIn_195_0;
                        stackOut_195_1 = ((StringBuilder) (Object) stackIn_195_1).append(stackIn_195_2).append(44);
                        stackIn_198_0 = stackOut_195_0;
                        stackIn_198_1 = stackOut_195_1;
                        stackIn_196_0 = stackOut_195_0;
                        stackIn_196_1 = stackOut_195_1;
                        if (param4 == null) {
                            statePc = 198;
                        } else {
                            statePc = 196;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        stackOut_196_0 = (RuntimeException) (Object) stackIn_196_0;
                        stackOut_196_1 = (StringBuilder) (Object) stackIn_196_1;
                        stackOut_196_2 = "{...}";
                        stackIn_199_0 = stackOut_196_0;
                        stackIn_199_1 = stackOut_196_1;
                        stackIn_199_2 = stackOut_196_2;
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 197: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 198: {
                    stackOut_198_0 = (RuntimeException) (Object) stackIn_198_0;
                    stackOut_198_1 = (StringBuilder) (Object) stackIn_198_1;
                    stackOut_198_2 = "null";
                    stackIn_199_0 = stackOut_198_0;
                    stackIn_199_1 = stackOut_198_1;
                    stackIn_199_2 = stackOut_198_2;
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    throw pn.a((Throwable) (Object) stackIn_199_0, (String) (Object) (stackIn_199_2 + 41));
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(byte param0, String param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 94) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = 39;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0;
                }
                case 3: {
                    try {
                        stackOut_3_0 = this.a(param1, (byte) -113, (pa[]) null);
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0;
                }
                case 5: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    try {
                        stackOut_6_0 = (RuntimeException) var3;
                        stackOut_6_1 = new StringBuilder().append("vs.F(").append(param0).append(44);
                        stackIn_9_0 = stackOut_6_0;
                        stackIn_9_1 = stackOut_6_1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        if (param1 == null) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                        stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                        stackOut_7_2 = "{...}";
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_10_2 = stackOut_7_2;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 9: {
                    stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                    stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                    stackOut_9_2 = "null";
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    throw pn.a((Throwable) (Object) stackIn_10_0, (String) (Object) (stackIn_10_2 + 41));
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    vs(byte[] param0) {
        RuntimeException var2 = null;
        rb var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int var7_int = 0;
        byte[][] var7 = null;
        int var8_int = 0;
        byte[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_9_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_82_0 = 0;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_81_0 = 0;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = AceOfSkies.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_ref = new rb(param0);
                        var3 = var2_ref.g(-52);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (0 == var3) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var2_ref.g(43) ^ -1) != -2) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = 1;
                        stackIn_9_0 = stackOut_6_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = stackIn_9_0;
                        ((vs) this).field_d = new byte[256];
                        var2_ref.a(0, 7186, 256, ((vs) this).field_d);
                        if (var4 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = new int[256];
                        var6 = new int[256];
                        var7_int = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (-257 >= (var7_int ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5[var7_int] = var2_ref.g(-87);
                        var7_int++;
                        if (var12 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var12 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var7_int = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var7_int >= 256) {
                            statePc = 24;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var6[var7_int] = var2_ref.g(-51);
                        var7_int++;
                        if (var12 != 0) {
                            statePc = 90;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var12 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var7 = new byte[256][];
                        var8_int = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (256 <= var8_int) {
                            statePc = 36;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var7[var8_int] = new byte[var5[var8_int]];
                        var9 = 0;
                        stackOut_26_0 = 0;
                        stackIn_37_0 = stackOut_26_0;
                        stackIn_27_0 = stackOut_26_0;
                        if (var12 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var10 = stackIn_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((var10 ^ -1) <= (var7[var8_int].length ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9 = (byte)(var9 + var2_ref.d(0));
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var7[var8_int][var10] = (byte) var9;
                        var10++;
                        if (var12 != 0) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var12 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var8_int++;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (var12 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = 256;
                        stackIn_37_0 = stackOut_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var8 = new byte[stackIn_37_0][];
                        var9 = 0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var9 >= 256) {
                            statePc = 49;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var8[var9] = new byte[var5[var9]];
                        var10 = 0;
                        stackOut_39_0 = 0;
                        stackIn_50_0 = stackOut_39_0;
                        stackIn_40_0 = stackOut_39_0;
                        if (var12 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var11 = stackIn_40_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var8[var9].length <= var11) {
                            statePc = 47;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var10 = (byte)(var10 + var2_ref.d(0));
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var8[var9][var11] = (byte) var10;
                        var11++;
                        if (var12 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var12 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var9++;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var12 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        ((vs) this).field_h = new byte[256][256];
                        stackOut_49_0 = 0;
                        stackIn_50_0 = stackOut_49_0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var9 = stackIn_50_0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = var9 ^ -1;
                        stackOut_51_1 = -257;
                        stackIn_52_0 = stackOut_51_0;
                        stackIn_52_1 = stackOut_51_1;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (stackIn_52_0 <= stackIn_52_1) {
                            statePc = 77;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackOut_53_0 = var9;
                        stackIn_82_0 = stackOut_53_0;
                        stackIn_54_0 = stackOut_53_0;
                        if (var12 != 0) {
                            statePc = 82;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackOut_54_0 = stackIn_54_0;
                        stackOut_54_1 = 32;
                        stackIn_55_0 = stackOut_54_0;
                        stackIn_55_1 = stackOut_54_1;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (stackIn_55_0 == stackIn_55_1) {
                            statePc = 76;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (160 == var9) {
                            statePc = 76;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 84;
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
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (-257 >= (var10 ^ -1)) {
                            statePc = 76;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackOut_63_0 = var10 ^ -1;
                        stackOut_63_1 = -33;
                        stackIn_52_0 = stackOut_63_0;
                        stackIn_52_1 = stackOut_63_1;
                        stackIn_64_0 = stackOut_63_0;
                        stackIn_64_1 = stackOut_63_1;
                        if (var12 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (stackIn_64_0 == stackIn_64_1) {
                            statePc = 75;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackOut_65_0 = var10;
                        stackIn_66_0 = stackOut_65_0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if ((stackIn_66_0 ^ -1) != -161) {
                            statePc = 72;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var12 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        ((vs) this).field_h[var9][var10] = (byte)sb.a(var8, var10, -1, var5, var6, var7, var9, ((vs) this).field_d);
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var10++;
                        if (var12 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var9++;
                        if (var12 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        ((vs) this).field_e = var6[32] + var5[32];
                        if (var12 == 0) {
                            statePc = 81;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        ((vs) this).field_e = var2_ref.g(76);
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        ((vs) this).field_a = var2_ref.g(-110);
                        stackOut_81_0 = var2_ref.g(96);
                        stackIn_82_0 = stackOut_81_0;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        ((vs) this).field_j = var2_ref.g(-103);
                        ((vs) this).field_i = var2_ref.g(-48);
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 84: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    try {
                        stackOut_85_0 = (RuntimeException) var2;
                        stackOut_85_1 = new StringBuilder().append("vs.<init>(");
                        stackIn_88_0 = stackOut_85_0;
                        stackIn_88_1 = stackOut_85_1;
                        stackIn_86_0 = stackOut_85_0;
                        stackIn_86_1 = stackOut_85_1;
                        if (param0 == null) {
                            statePc = 88;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
                        stackOut_86_1 = (StringBuilder) (Object) stackIn_86_1;
                        stackOut_86_2 = "{...}";
                        stackIn_89_0 = stackOut_86_0;
                        stackIn_89_1 = stackOut_86_1;
                        stackIn_89_2 = stackOut_86_2;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 87: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 88: {
                    stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
                    stackOut_88_1 = (StringBuilder) (Object) stackIn_88_1;
                    stackOut_88_2 = "null";
                    stackIn_89_0 = stackOut_88_0;
                    stackIn_89_1 = stackOut_88_1;
                    stackIn_89_2 = stackOut_88_2;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    throw pn.a((Throwable) (Object) stackIn_89_0, (String) (Object) (stackIn_89_2 + 41));
                }
                case 90: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
