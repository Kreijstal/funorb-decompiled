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
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 106) {
                break L1;
              } else {
                this.a((pa[]) null, -22, 118, (String) null);
                break L1;
              }
            }
            stackIn_4_0 = this.field_d[param1] & 255;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "vs.H(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static int b(int param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -76) {
                break L1;
              } else {
                field_b = (int[]) null;
                break L1;
              }
            }
            stackIn_4_0 = -ac.field_c + je.field_a;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "vs.B(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_c = null;
              field_g = null;
              if (param0 > 108) {
                break L1;
              } else {
                vs.a(77);
                break L1;
              }
            }
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "vs.E(" + param0 + ')');
        }
    }

    private final int a(String param0, byte param1, pa[] param2) {
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_73_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11_int = 0;
        Exception var11 = null;
        int var12 = 0;
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
                        statePc = 74;
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
                        statePc = 74;
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
                        if (param1 == -113) {
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
                        this.field_j = -25;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var8 = 0;
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
                        if ((var8 ^ -1) <= (var7 ^ -1)) {
                            statePc = 72;
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
                        var9 = param0.charAt(var8);
                        stackIn_73_0 = -61;
                        stackIn_10_0 = stackIn_73_0;
                        if (var12 != 0) {
                            statePc = 73;
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
                        if (stackIn_10_0 != (var9 ^ -1)) {
                            statePc = 14;
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
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4_int = var8;
                        if (var12 == 0) {
                            statePc = 71;
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
                        if ((var9 ^ -1) != -63) {
                            statePc = 64;
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
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (0 != (var4_int ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var10 = param0.substring(var4_int - -1, var8);
                        var4_int = -1;
                        if (var10.equals("lt")) {
                            statePc = 63;
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
                        if (var10.equals("gt")) {
                            statePc = 62;
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
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var10.equals("nbsp")) {
                            statePc = 61;
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
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var10.equals("shy")) {
                            statePc = 60;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (!var10.equals("times")) {
                            statePc = 36;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9 = 215;
                        if (var12 == 0) {
                            statePc = 64;
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
                        if (!var10.equals("euro")) {
                            statePc = 40;
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
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var9 = 8364;
                        if (var12 == 0) {
                            statePc = 64;
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
                        if (var10.equals("copy")) {
                            statePc = 59;
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
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var10.equals("reg")) {
                            statePc = 58;
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
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (!var10.startsWith("img=")) {
                            statePc = 71;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (param2 != null) {
                            statePc = 55;
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
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var12 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var11_int = td.a((CharSequence) ((Object) var10.substring(4)), (byte) 38);
                        var5 = -1;
                        var6 = var6 + param2[var11_int].d();
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = ((Object) stateCaught_55 instanceof Exception ? 57 : 74);
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var11 = (Exception) ((Object) caughtException);
                        if (var12 == 0) {
                            statePc = 71;
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
                        var9 = 174;
                        if (var12 == 0) {
                            statePc = 64;
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
                        var9 = 169;
                        if (var12 == 0) {
                            statePc = 64;
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
                        var9 = 173;
                        if (var12 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var9 = 160;
                        if (var12 == 0) {
                            statePc = 64;
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
                        var9 = 62;
                        if (var12 == 0) {
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
                        var9 = 60;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var4_int != -1) {
                            statePc = 71;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var6 = var6 + (this.field_d[255 & ae.a((char) var9, param1 ^ 1)] & 255);
                        if (this.field_h == null) {
                            statePc = 70;
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
                        if (var5 == -1) {
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
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var6 = var6 + this.field_h[var5][var9];
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
                        var5 = var9;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var8++;
                        if (var12 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackIn_73_0 = var6;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 73: {
                    return stackIn_73_0;
                }
                case 74: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_77_0 = (RuntimeException) (var4);
                    stackIn_75_0 = stackIn_77_0;
                    stackIn_77_1 = new StringBuilder().append("vs.C(");
                    stackIn_75_1 = stackIn_77_1;
                    if (param0 == null) {
                        statePc = 77;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_75_0);
                    stackIn_78_1 = (StringBuilder) ((Object) stackIn_75_1);
                    stackIn_78_2 = "{...}";
                    statePc = 78;
                    continue stateLoop;
                }
                case 77: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
                    stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
                    stackIn_78_2 = "null";
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    stackIn_81_0 = (RuntimeException) ((Object) stackIn_78_0);
                    stackIn_79_0 = stackIn_81_0;
                    stackIn_81_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',').append(param1).append(',');
                    stackIn_79_1 = stackIn_81_1;
                    if (param2 == null) {
                        statePc = 81;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    stackIn_82_0 = (RuntimeException) ((Object) stackIn_79_0);
                    stackIn_82_1 = (StringBuilder) ((Object) stackIn_79_1);
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
                    throw pn.a((Throwable) ((Object) stackIn_82_0), stackIn_82_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final String a(pa[] param0, int param1, int param2, String param3) {
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_55_0 = null;
        String stackIn_75_0 = null;
        String stackIn_79_0 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String var12_ref_String = null;
        int var12 = 0;
        int var13_int = 0;
        Exception var13 = null;
        int var14 = 0;
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
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = (String) (param3);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0;
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
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var8 <= var10) {
                            statePc = 78;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_79_0 = (String) (param3);
                        stackIn_9_0 = stackIn_79_0;
                        if (var14 != 0) {
                            statePc = 79;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var11 = ((String) (Object) stackIn_9_0).charAt(var10);
                        if (var11 != 60) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5_int = var10;
                        if (var14 == 0) {
                            statePc = 77;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((var11 ^ -1) != -63) {
                            statePc = 61;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((var5_int ^ -1) != 0) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var12_ref_String = param3.substring(var5_int - -1, var10);
                        var5_int = -1;
                        if (var12_ref_String.equals("lt")) {
                            statePc = 60;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (!var12_ref_String.equals("gt")) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var11 = 62;
                        if (var14 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (!var12_ref_String.equals("nbsp")) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var11 = 160;
                        if (var14 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (!var12_ref_String.equals("shy")) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var11 = 173;
                        if (var14 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (!var12_ref_String.equals("times")) {
                            statePc = 36;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var11 = 215;
                        if (var14 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var12_ref_String.equals("euro")) {
                            statePc = 59;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (!var12_ref_String.equals("copy")) {
                            statePc = 43;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var11 = 169;
                        if (var14 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (!var12_ref_String.equals("reg")) {
                            statePc = 47;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var11 = 174;
                        if (var14 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (!var12_ref_String.startsWith("img=")) {
                            statePc = 77;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (null == param0) {
                            statePc = 77;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var13_int = td.a((CharSequence) ((Object) var12_ref_String.substring(4)), (byte) 38);
                        var7 = var7 + param0[var13_int].d();
                        var6 = -1;
                        if (param2 >= var7) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = ((Object) stateCaught_53 instanceof Exception ? 58 : 80);
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackIn_55_0 = var9 + "...";
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = ((Object) stateCaught_54 instanceof Exception ? 58 : 80);
                        continue stateLoop;
                    }
                }
                case 55: {
                    return stackIn_55_0;
                }
                case 56: {
                    try {
                        var9 = param3.substring(0, 1 + var10);
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = ((Object) stateCaught_56 instanceof Exception ? 58 : 80);
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var13 = (Exception) ((Object) caughtException);
                        if (var14 == 0) {
                            statePc = 77;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var11 = 8364;
                        if (var14 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var11 = 60;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var5_int != -1) {
                            statePc = 77;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var7 = var7 + (255 & this.field_d[ae.a((char) var11, -128) & 255]);
                        if (null == this.field_h) {
                            statePc = 67;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (0 == (var6 ^ -1)) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var7 = var7 + this.field_h[var6][var11];
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var6 = var11;
                        var12 = var7;
                        if (this.field_h != null) {
                            statePc = 70;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var12 = var12 + this.field_h[var11][46];
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (var12 > param2) {
                            statePc = 74;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackIn_75_0 = var9 + "...";
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 75: {
                    return stackIn_75_0;
                }
                case 76: {
                    try {
                        var9 = param3.substring(0, var10 + 1);
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var10++;
                        if (var14 == 0) {
                            statePc = 7;
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
                        stackIn_79_0 = (String) (param3);
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 79: {
                    return stackIn_79_0;
                }
                case 80: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_83_0 = (RuntimeException) (var5);
                    stackIn_81_0 = stackIn_83_0;
                    stackIn_83_1 = new StringBuilder().append("vs.D(");
                    stackIn_81_1 = stackIn_83_1;
                    if (param0 == null) {
                        statePc = 83;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    stackIn_84_0 = (RuntimeException) ((Object) stackIn_81_0);
                    stackIn_84_1 = (StringBuilder) ((Object) stackIn_81_1);
                    stackIn_84_2 = "{...}";
                    statePc = 84;
                    continue stateLoop;
                }
                case 83: {
                    stackIn_84_0 = (RuntimeException) ((Object) stackIn_83_0);
                    stackIn_84_1 = (StringBuilder) ((Object) stackIn_83_1);
                    stackIn_84_2 = "null";
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    stackIn_87_0 = (RuntimeException) ((Object) stackIn_84_0);
                    stackIn_85_0 = stackIn_87_0;
                    stackIn_87_1 = ((StringBuilder) (Object) stackIn_84_1).append(stackIn_84_2).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_85_1 = stackIn_87_1;
                    if (param3 == null) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    stackIn_88_0 = (RuntimeException) ((Object) stackIn_85_0);
                    stackIn_88_1 = (StringBuilder) ((Object) stackIn_85_1);
                    stackIn_88_2 = "{...}";
                    statePc = 88;
                    continue stateLoop;
                }
                case 87: {
                    stackIn_88_0 = (RuntimeException) ((Object) stackIn_87_0);
                    stackIn_88_1 = (StringBuilder) ((Object) stackIn_87_1);
                    stackIn_88_2 = "null";
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    throw pn.a((Throwable) ((Object) stackIn_88_0), stackIn_88_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, char param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        byte stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.a((byte) -7, 58);
                break L1;
              }
            }
            if (null != this.field_h) {
              stackIn_7_0 = this.field_h[param2][param1];
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var4), "vs.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final int a(int param0, pa[] param1, int[] param2, String[] param3, String param4) {
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_128_0 = 0;
        int[] stackIn_128_1 = null;
        int stackIn_130_0 = 0;
        int[] stackIn_130_1 = null;
        int stackIn_131_0 = 0;
        int[] stackIn_131_1 = null;
        int stackIn_131_2 = 0;
        int stackIn_141_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_153_0 = 0;
        int stackIn_153_1 = 0;
        int stackIn_157_0 = 0;
        RuntimeException stackIn_159_0 = null;
        StringBuilder stackIn_159_1 = null;
        RuntimeException stackIn_161_0 = null;
        StringBuilder stackIn_161_1 = null;
        RuntimeException stackIn_162_0 = null;
        StringBuilder stackIn_162_1 = null;
        String stackIn_162_2 = null;
        RuntimeException stackIn_163_0 = null;
        StringBuilder stackIn_163_1 = null;
        RuntimeException stackIn_165_0 = null;
        StringBuilder stackIn_165_1 = null;
        RuntimeException stackIn_166_0 = null;
        StringBuilder stackIn_166_1 = null;
        String stackIn_166_2 = null;
        RuntimeException stackIn_167_0 = null;
        StringBuilder stackIn_167_1 = null;
        RuntimeException stackIn_169_0 = null;
        StringBuilder stackIn_169_1 = null;
        RuntimeException stackIn_170_0 = null;
        StringBuilder stackIn_170_1 = null;
        String stackIn_170_2 = null;
        RuntimeException stackIn_171_0 = null;
        StringBuilder stackIn_171_1 = null;
        RuntimeException stackIn_173_0 = null;
        StringBuilder stackIn_173_1 = null;
        RuntimeException stackIn_174_0 = null;
        StringBuilder stackIn_174_1 = null;
        String stackIn_174_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
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
        int var21_int = 0;
        Exception var21 = null;
        int var22 = 0;
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
                        statePc = 158;
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
                        statePc = 158;
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
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var15 ^ -1) >= (var16 ^ -1)) {
                            statePc = 152;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var17 = ae.a(param4.charAt(var16), 102) & 255;
                        var18 = 0;
                        stackIn_153_0 = -61;
                        stackIn_7_0 = stackIn_153_0;
                        stackIn_153_1 = var17 ^ -1;
                        stackIn_7_1 = stackIn_153_1;
                        if (var22 != 0) {
                            statePc = 153;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 == stackIn_7_1) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var11 = var16;
                        if (var22 == 0) {
                            statePc = 151;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (0 == (var11 ^ -1)) {
                            statePc = 113;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (-63 != (var17 ^ -1)) {
                            statePc = 151;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var19 = var11;
                        var20 = param4.substring(1 + var11, var16);
                        var11 = -1;
                        if (!var20.equals("br")) {
                            statePc = 25;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        param3[var14] = param4.substring(var7, var16 + 1);
                        var14++;
                        if ((param3.length ^ -1) < (var14 ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0;
                }
                case 24: {
                    try {
                        var6_int = 0;
                        var8 = -1;
                        var12 = -1;
                        var7 = 1 + var16;
                        if (var22 == 0) {
                            statePc = 151;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (!var20.equals("lt")) {
                            statePc = 34;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var18 = var18 + this.a((byte) 111, 60);
                        if (null == this.field_h) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (0 == (var12 ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var18 = var18 + this.field_h[var12][60];
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var12 = 60;
                        if (var22 == 0) {
                            statePc = 112;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var20.equals("gt")) {
                            statePc = 104;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (!var20.equals("nbsp")) {
                            statePc = 46;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var18 = var18 + this.a((byte) 107, 160);
                        if (this.field_h == null) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((var12 ^ -1) == 0) {
                            statePc = 45;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var18 = var18 + this.field_h[var12][160];
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var12 = 160;
                        if (var22 == 0) {
                            statePc = 112;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var20.equals("shy")) {
                            statePc = 98;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (!var20.equals("times")) {
                            statePc = 60;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var18 = var18 + this.a((byte) 108, 215);
                        if (null == this.field_h) {
                            statePc = 59;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (-1 != var12) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var18 = var18 + this.field_h[var12][215];
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var12 = 215;
                        if (var22 == 0) {
                            statePc = 112;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var20.equals("euro")) {
                            statePc = 92;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (!var20.equals("copy")) {
                            statePc = 72;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var18 = var18 + this.a((byte) 108, 169);
                        if (this.field_h == null) {
                            statePc = 71;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var12 == -1) {
                            statePc = 71;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var18 = var18 + this.field_h[var12][169];
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var12 = 169;
                        if (var22 == 0) {
                            statePc = 112;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (var20.equals("reg")) {
                            statePc = 84;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (!var20.startsWith("img=")) {
                            statePc = 112;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (null == param1) {
                            statePc = 112;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var21_int = td.a((CharSequence) ((Object) var20.substring(4)), (byte) 38);
                        var12 = -1;
                        var18 = var18 + param1[var21_int].d();
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = ((Object) stateCaught_81 instanceof Exception ? 83 : 158);
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var21 = (Exception) ((Object) caughtException);
                        if (var22 == 0) {
                            statePc = 112;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var18 = var18 + this.a((byte) 126, 174);
                        if (this.field_h == null) {
                            statePc = 91;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (-1 != var12) {
                            statePc = 90;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var18 = var18 + this.field_h[var12][174];
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var12 = 174;
                        if (var22 == 0) {
                            statePc = 112;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var18 = var18 + this.a((byte) 111, 8364);
                        if (this.field_h == null) {
                            statePc = 97;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (-1 == var12) {
                            statePc = 97;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var18 = var18 + this.field_h[var12][8364];
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var12 = 8364;
                        if (var22 == 0) {
                            statePc = 112;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var18 = var18 + this.a((byte) 110, 173);
                        if (this.field_h == null) {
                            statePc = 103;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (var12 == -1) {
                            statePc = 103;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        var18 = var18 + this.field_h[var12][173];
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var12 = 173;
                        if (var22 == 0) {
                            statePc = 112;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        var18 = var18 + this.a((byte) 118, 62);
                        if (null == this.field_h) {
                            statePc = 111;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (0 != (var12 ^ -1)) {
                            statePc = 110;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        var18 = var18 + this.field_h[var12][62];
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var12 = 62;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var17 = -1;
                        if (var22 == 0) {
                            statePc = 121;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        var19 = var16;
                        var18 = var18 + this.a((byte) 113, var17);
                        if (this.field_h == null) {
                            statePc = 120;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (0 != (var12 ^ -1)) {
                            statePc = 119;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var18 = var18 + this.field_h[var12][var17];
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        var12 = var17;
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (var18 <= 0) {
                            statePc = 151;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var6_int = var6_int + var18;
                        if (param2 == null) {
                            statePc = 151;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        if (-33 != (var17 ^ -1)) {
                            statePc = 127;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        var10 = 1;
                        var8 = var16;
                        var9 = var6_int;
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        stackIn_130_0 = var6_int ^ -1;
                        stackIn_128_0 = stackIn_130_0;
                        stackIn_130_1 = (int[]) (param2);
                        stackIn_128_1 = stackIn_130_1;
                        if (var14 < param2.length) {
                            statePc = 130;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        stackIn_131_0 = stackIn_128_0;
                        stackIn_131_1 = (int[]) ((Object) stackIn_128_1);
                        stackIn_131_2 = param2.length - 1;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        stackIn_131_0 = stackIn_130_0;
                        stackIn_131_1 = (int[]) ((Object) stackIn_130_1);
                        stackIn_131_2 = var14;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (stackIn_131_0 >= (stackIn_131_1[stackIn_131_2] ^ -1)) {
                            statePc = 149;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (0 > var8) {
                            statePc = 143;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        param3[var14] = param4.substring(var7, var8 - -1 + -var10);
                        var14++;
                        if (var14 >= param3.length) {
                            statePc = 140;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        stackIn_141_0 = 0;
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 141: {
                    return stackIn_141_0;
                }
                case 142: {
                    try {
                        var7 = var8 + 1;
                        var8 = -1;
                        var12 = -1;
                        var6_int = var6_int - var9;
                        if (var22 == 0) {
                            statePc = 149;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        param3[var14] = param4.substring(var7, var19);
                        var14++;
                        if ((param3.length ^ -1) < (var14 ^ -1)) {
                            statePc = 148;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        stackIn_147_0 = 0;
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 147: {
                    return stackIn_147_0;
                }
                case 148: {
                    try {
                        var7 = var19;
                        var8 = -1;
                        var12 = -1;
                        var6_int = var18;
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        if (var17 != 45) {
                            statePc = 151;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        var8 = var16;
                        var10 = 0;
                        var9 = var6_int;
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        var16++;
                        if (var22 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        stackIn_153_0 = param4.length();
                        stackIn_153_1 = var7;
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        if (stackIn_153_0 <= stackIn_153_1) {
                            statePc = 156;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        param3[var14] = param4.substring(var7, param4.length());
                        var14++;
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        stackIn_157_0 = var14;
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 158;
                        continue stateLoop;
                    }
                }
                case 157: {
                    return stackIn_157_0;
                }
                case 158: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_161_0 = (RuntimeException) (var6);
                    stackIn_159_0 = stackIn_161_0;
                    stackIn_161_1 = new StringBuilder().append("vs.A(").append(param0).append(',');
                    stackIn_159_1 = stackIn_161_1;
                    if (param1 == null) {
                        statePc = 161;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    stackIn_162_0 = (RuntimeException) ((Object) stackIn_159_0);
                    stackIn_162_1 = (StringBuilder) ((Object) stackIn_159_1);
                    stackIn_162_2 = "{...}";
                    statePc = 162;
                    continue stateLoop;
                }
                case 161: {
                    stackIn_162_0 = (RuntimeException) ((Object) stackIn_161_0);
                    stackIn_162_1 = (StringBuilder) ((Object) stackIn_161_1);
                    stackIn_162_2 = "null";
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    stackIn_165_0 = (RuntimeException) ((Object) stackIn_162_0);
                    stackIn_163_0 = stackIn_165_0;
                    stackIn_165_1 = ((StringBuilder) (Object) stackIn_162_1).append(stackIn_162_2).append(',');
                    stackIn_163_1 = stackIn_165_1;
                    if (param2 == null) {
                        statePc = 165;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    stackIn_166_0 = (RuntimeException) ((Object) stackIn_163_0);
                    stackIn_166_1 = (StringBuilder) ((Object) stackIn_163_1);
                    stackIn_166_2 = "{...}";
                    statePc = 166;
                    continue stateLoop;
                }
                case 165: {
                    stackIn_166_0 = (RuntimeException) ((Object) stackIn_165_0);
                    stackIn_166_1 = (StringBuilder) ((Object) stackIn_165_1);
                    stackIn_166_2 = "null";
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    stackIn_169_0 = (RuntimeException) ((Object) stackIn_166_0);
                    stackIn_167_0 = stackIn_169_0;
                    stackIn_169_1 = ((StringBuilder) (Object) stackIn_166_1).append(stackIn_166_2).append(',');
                    stackIn_167_1 = stackIn_169_1;
                    if (param3 == null) {
                        statePc = 169;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    stackIn_170_0 = (RuntimeException) ((Object) stackIn_167_0);
                    stackIn_170_1 = (StringBuilder) ((Object) stackIn_167_1);
                    stackIn_170_2 = "{...}";
                    statePc = 170;
                    continue stateLoop;
                }
                case 169: {
                    stackIn_170_0 = (RuntimeException) ((Object) stackIn_169_0);
                    stackIn_170_1 = (StringBuilder) ((Object) stackIn_169_1);
                    stackIn_170_2 = "null";
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    stackIn_173_0 = (RuntimeException) ((Object) stackIn_170_0);
                    stackIn_171_0 = stackIn_173_0;
                    stackIn_173_1 = ((StringBuilder) (Object) stackIn_170_1).append(stackIn_170_2).append(',');
                    stackIn_171_1 = stackIn_173_1;
                    if (param4 == null) {
                        statePc = 173;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    stackIn_174_0 = (RuntimeException) ((Object) stackIn_171_0);
                    stackIn_174_1 = (StringBuilder) ((Object) stackIn_171_1);
                    stackIn_174_2 = "{...}";
                    statePc = 174;
                    continue stateLoop;
                }
                case 173: {
                    stackIn_174_0 = (RuntimeException) ((Object) stackIn_173_0);
                    stackIn_174_1 = (StringBuilder) ((Object) stackIn_173_1);
                    stackIn_174_2 = "null";
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    throw pn.a((Throwable) ((Object) stackIn_174_0), stackIn_174_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(byte param0, String param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 94) {
              stackIn_4_0 = this.a(param1, (byte) -113, (pa[]) null);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 39;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("vs.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    vs(byte[] param0) {
        byte[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_8_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_75_0 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        rb var2 = null;
        RuntimeException var2_ref = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = AceOfSkies.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = new rb(param0);
                        var3 = var2.g(-52);
                        if (0 == var3) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var2.g(43) ^ -1) != -2) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_8_0 = 1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4 = stackIn_8_0;
                        this.field_d = new byte[256];
                        var2.a(0, 7186, 256, this.field_d);
                        if (var4 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5 = new int[256];
                        var6 = new int[256];
                        var7_int = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (-257 >= (var7_int ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5[var7_int] = var2.g(-87);
                        var7_int++;
                        if (var12 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var12 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var7_int = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var7_int >= 256) {
                            statePc = 23;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var6[var7_int] = var2.g(-51);
                        var7_int++;
                        if (var12 != 0) {
                            statePc = 82;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var12 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var7 = new byte[256][];
                        var8_int = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (256 <= var8_int) {
                            statePc = 34;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        array$0 = new byte[var5[var8_int]];
                        var7[var8_int] = array$0;
                        var9 = 0;
                        stackIn_35_0 = 0;
                        stackIn_26_0 = stackIn_35_0;
                        if (var12 != 0) {
                            statePc = 35;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var10 = stackIn_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((var10 ^ -1) <= (var7[var8_int].length ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var9 = (byte)(var9 + var2.d(0));
                        var7[var8_int][var10] = (byte) var9;
                        var10++;
                        if (var12 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var12 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var8_int++;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var12 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_35_0 = 256;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var8 = new byte[stackIn_35_0][];
                        var9 = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var9 >= 256) {
                            statePc = 46;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        array$1 = new byte[var5[var9]];
                        var8[var9] = array$1;
                        var10 = 0;
                        stackIn_47_0 = 0;
                        stackIn_38_0 = stackIn_47_0;
                        if (var12 != 0) {
                            statePc = 47;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var11 = stackIn_38_0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var8[var9].length <= var11) {
                            statePc = 44;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var10 = (byte)(var10 + var2.d(0));
                        var8[var9][var11] = (byte) var10;
                        var11++;
                        if (var12 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var12 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var9++;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var12 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        this.field_h = new byte[256][256];
                        stackIn_47_0 = 0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var9 = stackIn_47_0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_49_0 = var9 ^ -1;
                        stackIn_49_1 = -257;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0 <= stackIn_49_1) {
                            statePc = 71;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_75_0 = var9;
                        stackIn_51_0 = stackIn_75_0;
                        if (var12 != 0) {
                            statePc = 75;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (stackIn_51_0 == 32) {
                            statePc = 70;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (160 == var9) {
                            statePc = 70;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 77;
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
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (-257 >= (var10 ^ -1)) {
                            statePc = 70;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackIn_49_0 = var10 ^ -1;
                        stackIn_60_0 = stackIn_49_0;
                        stackIn_49_1 = -33;
                        stackIn_60_1 = stackIn_49_1;
                        if (var12 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (stackIn_60_0 == stackIn_60_1) {
                            statePc = 69;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if ((var10 ^ -1) != -161) {
                            statePc = 67;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var12 == 0) {
                            statePc = 69;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        this.field_h[var9][var10] = (byte)sb.a(var8, var10, -1, var5, var6, var7, var9, this.field_d);
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var10++;
                        if (var12 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var9++;
                        if (var12 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        this.field_e = var6[32] + var5[32];
                        if (var12 == 0) {
                            statePc = 74;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        this.field_e = var2.g(76);
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        this.field_a = var2.g(-110);
                        stackIn_75_0 = var2.g(96);
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        this.field_j = var2.g(-103);
                        this.field_i = var2.g(-48);
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 77: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_80_0 = (RuntimeException) (var2_ref);
                    stackIn_78_0 = stackIn_80_0;
                    stackIn_80_1 = new StringBuilder().append("vs.<init>(");
                    stackIn_78_1 = stackIn_80_1;
                    if (param0 == null) {
                        statePc = 80;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    stackIn_81_0 = (RuntimeException) ((Object) stackIn_78_0);
                    stackIn_81_1 = (StringBuilder) ((Object) stackIn_78_1);
                    stackIn_81_2 = "{...}";
                    statePc = 81;
                    continue stateLoop;
                }
                case 80: {
                    stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
                    stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
                    stackIn_81_2 = "null";
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    throw pn.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ')');
                }
                case 82: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
